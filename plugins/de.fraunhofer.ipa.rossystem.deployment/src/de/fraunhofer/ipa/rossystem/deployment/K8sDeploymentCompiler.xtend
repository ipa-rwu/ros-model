package de.fraunhofer.ipa.rossystem.deployment;

import rossystem.RosSystem
import java.util.List
import java.util.ArrayList
import java.util.Arrays
import java.util.Collections

enum DeploymentType{
	StatefulSet,
	Deployment
}

class K8sMetaInfo extends DeplopymentCommonInfo{
	Boolean ifUseMacvlan
	Boolean ifConnectWeb
	String bridgeName
	DeploymentType deploymentType

	new(Boolean ifUseMacvlan, Boolean ifConnectWeb, String bridgeName, DeploymentType deploymentType) {
		this.ifConnectWeb = ifConnectWeb
		this.ifUseMacvlan = ifUseMacvlan
		this.deploymentType = deploymentType
		this.bridgeName = bridgeName
	}

	new() {
	}

	def get_ifUseMacvlan(){
		return this.ifUseMacvlan
	}
	def get_ifConnectWeb(){
		return this.ifConnectWeb
	}
	def get_bridgeNmae(){
		return this.bridgeName
	}
	def get_deploymentType(){
		return this.deploymentType
	}

	def print(){
		System.out.format("ifUseMacvlan: %s, ifConnectWeb: %s, bridgeName: %s, deploymentType: %s\n",
						this.ifUseMacvlan.toString(), this.ifConnectWeb.toString(), this.bridgeName, this.deploymentType.toString()
		)
	}
}

class K8sDeploymentHelpers extends DeploymentHelpers {
	def convert_name_to_k8s(String name) {
		return name.toLowerCase.replaceAll("[^0-9a-zA-Z]", "-")
	}
	def default_label_map(String application_name,
						String deployment_name,
						Boolean if_stack
	){
		var label_map = new ArrayList
		label_map.add(Pair.of("app", application_name))
		label_map.add(Pair.of("id", deployment_name))
		if (if_stack){
			label_map.add(Pair.of("role", "componentStack"))
		}
		else {
			label_map.add(Pair.of("role", "system"))
		}
		return label_map
	}

	def set_application_name(String sys_name){
		return convert_name_to_k8s(sys_name)
	}

	def set_pod_name(String sys_name){
		return convert_name_to_k8s(sys_name)
	}

	def set_pod_name(String sys_name, String stack_name){
		return convert_name_to_k8s(String.format("%s-%s", sys_name, stack_name))
	}

	def set_service_name(String pod_name){
		return String.format("%s-service", pod_name)
	}

	def get_web_server_port(){
		return "4000"
	}

	 def set_deployment_file(String sys_name){
		return set_deployment_file_name(convert_name_to_k8s(sys_name), DeploymentPlatform.K8s, "yml")
	}
}

class PortInfo {
	String name
	String port
	String targetPort
	String protocol

	new(String name,
		String port,
		String targetPort,
		String protocol) {
		this.name = name
		this.port = port
		this.targetPort = targetPort
		this.protocol = protocol
	}

	def PortInfo(String name,
				String port,
				String targetPort,
				String protocol) {
		this.name = name
		this.port = port
		this.targetPort = targetPort
		this.protocol = protocol
	}

	def get_name() {
		return this.name
	}
	def get_port(){
		return this.port
	}
	def get_targetPort(){
		return this.targetPort
	}
	def get_protocol(){
		return this.protocol
	}

	def print_info(){
		System.out.format("name: %s, port: %s, targetPort: %s, protocol: %s\n", this.name, this.port, this.targetPort, this.protocol)
	}
}

class K8sDeploymentCompiler {

	 K8sDeploymentHelpers generator_helper = new K8sDeploymentHelpers()
	 ContainerImageHelpers imageHelper = new ContainerImageHelpers()

def application_name(RosSystem system)'''
«generator_helper.convert_name_to_k8s(system.name)»
'''

def stack_name(String component_name)'''
«component_name.toLowerCase.replaceAll("[^0-9a-zA-Z]", "-")»
'''

def pod_name(RosSystem system, String stack_name)'''
«IF system.getComponentStack().isEmpty()»
«application_name(system)»
«ELSE»
«application_name(system)»-«stack_name»
«ENDIF»
'''

def set_labels(List<Pair<String, String>> label_list)'''
«FOR pair:label_list»
«"  "+pair.key»: «pair.value»
«ENDFOR»
'''

def extend_labels(String indent, String name, String value)'''
«indent»«name»: «value»
'''

def add_env(List<Pair<String, String>> env_list)'''
«FOR pair:env_list»
«"  "» - name: «pair.key»
     value: "«pair.value»"
«ENDFOR»
'''

def define_port(List<PortInfo> portinfos
)'''
«FOR port:portinfos»
«"  "»- name: «port.get_name()»
    port: «port.get_port()»
    targetPort: «port.get_targetPort()»
    protocol: "«port.get_protocol()»"
«ENDFOR»
'''

def set_macvlan(String application_name, String net_interface)'''
apiVersion: "k8s.cni.cncf.io/v1"
kind: NetworkAttachmentDefinition
metadata:
  name: «application_name»-network
spec:
  config: '{
      "cniVersion": "0.3.0",
      "type": "macvlan",
      "master": «net_interface»,
      "mode": "bridge",
      "ipam": {
        "type": "host-local",
        "subnet": "10.0.0.0/24",
        "rangeStart": "10.0.0.30",
        "rangeEnd": "10.0.0.60",
        "routes": [
          { "dst": "0.0.0.0/0" }
        ]
      }
    }'

'''

def service_skeleton(String pod_name,
					List<Pair<String, String>> label_map,
					List<PortInfo> portinfos
)'''
apiVersion: v1
kind: Service
metadata:
  name: «generator_helper.set_service_name(pod_name)»
  labels:
  «set_labels(label_map)»
spec:
  clusterIP: None
  selector:
    «set_labels(label_map)»
«IF !portinfos.isEmpty()»
«"  "»ports:
  «define_port(portinfos)»
«ENDIF»
'''

def bridge_command(RosSystem system)'''

'''

def create_header(DeploymentType deploy_type,
					String pod_name,
					List<Pair<String, String>> default_labels,
					List<Pair<String, String>> mach_labels,
					List<Pair<String, String>> extra_labels)'''
apiVersion: apps/v1
kind: «deploy_type»
metadata:
  creationTimestamp: null
  labels:
  «set_labels(default_labels)»
  «IF !extra_labels.isEmpty()»
  «set_labels(extra_labels)»
  «ENDIF»
  «IF !mach_labels.isEmpty()»
  «set_labels(mach_labels)»
  «ENDIF»
  name: «pod_name»
'''

def create_pod_spec(DeploymentType deploy_type,
					String service_name,
					List<Pair<String, String>> default_labels,
					List<Pair<String, String>> mach_labels
)'''
spec:
  replicas: 1
  selector:
    matchLabels:
    «set_labels(default_labels)»
    «IF !mach_labels.isEmpty()»
    «set_labels(mach_labels)»
    «ENDIF»
  «IF deploy_type == DeploymentType.StatefulSet»
  serviceName: "«service_name»"
  «ENDIF»
'''

def create_pod_template(List<Pair<String, String>> default_labels,
						List<Pair<String, String>> mach_labels
)'''
«"  "»template:
    metadata:
      creationTimestamp: null
      labels:
      «set_labels(default_labels)»
      «IF !mach_labels.isEmpty()»
      «set_labels(mach_labels)»
      «ENDIF»
'''

def create_container(String pod_name,
					String application_name,
					String image_prefix,
					ImageInfo image_info,
					K8sMetaInfo k8s_info,
					String start_command,
					Integer rosVersion,
					Boolean if_connect_web,
					Boolean if_use_macvlan
)'''
«"    "»spec:
      containers:
      - name: «pod_name»
        image: «imageHelper.set_push_image_name(image_info.get_registry(),
												imageHelper.set_image_name(image_prefix, image_info.get_ros_distro().toString),
												image_info.get_image_version()
				)»
        imagePullPolicy: Always
        command: ["/bin/bash", "-c"]
        args: ["
              «start_command»
              «IF if_connect_web»
              source /ros_entrypoint.sh && ./run.sh
              «ENDIF»
              "
              ]
        env:
          - name: POD_ID
            value: «pod_name»
          - name: POD_IP
            valueFrom:
              fieldRef:
                fieldPath: status.podIP
          - name: APP_ID
            value: «application_name»
          - name: NETINTERFACE
            «IF if_use_macvlan»
            value: net1"
            «ELSE»
            value: "lo"
            «ENDIF»
          - name: CYCLONEDDS_URI
            value: file:///root/dds_setting.xml
          «IF rosVersion == 2»
          - name: ROS_DOMAIN_ID
            value: "«k8s_info.getRosDomainID()»"
          «ENDIF»
        «IF if_connect_web»
        ports:
          - containerPort: «generator_helper.get_web_server_port()»
        «ENDIF»
'''
def set_service(String pod_name,
					List<Pair<String, String>> label_map,
					Boolean if_connect_web,
					DeploymentType deploy_type
)'''
«IF if_connect_web»
«service_skeleton(pod_name,
					label_map,
					Arrays.asList(new PortInfo("web-server",
							generator_helper.get_web_server_port(),
							generator_helper.get_web_server_port(),
							"TCP")
					)
)»
---
«ELSEIF deploy_type == DeploymentType.StatefulSet»
«service_skeleton(pod_name,
					label_map,
					null
)»
---
«ENDIF»
'''

def compile_toK8s(RosSystem system,
		ImageInfo imageInfo,
		K8sMetaInfo k8s_info
)'''
«««set up macvlan if use DDS
«IF k8s_info.get_ifUseMacvlan()»
«set_macvlan(generator_helper.set_application_name(system.name), k8s_info.get_bridgeNmae())»
---

«ENDIF»
«««only system, one pod
«IF system.getComponentStack().isEmpty()»
«set_service(generator_helper.set_pod_name(system.name),
				generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name),
													false),
				k8s_info.get_ifConnectWeb(),
				k8s_info.get_deploymentType()
)»
«create_header(k8s_info.get_deploymentType,
				generator_helper.set_pod_name(system.name),
				generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name),
													false),
				Collections.<Pair<String, String>>emptyList(),
				Collections.<Pair<String, String>>emptyList()
)»
«create_pod_spec(k8s_info.get_deploymentType,
				generator_helper.set_service_name(generator_helper.set_pod_name(system.name)),
				generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name),
													false),
				Collections.<Pair<String, String>>emptyList()
)»

«create_pod_template(generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name),
													false),
					Collections.<Pair<String, String>>emptyList()
)»
«create_container(generator_helper.set_pod_name(system.name),
				generator_helper.set_application_name(system.name),
				system.name,
				imageInfo,
				k8s_info,
				generator_helper.set_start_command(system.name, imageInfo.get_ros_version),
				imageInfo.get_ros_version(),
				k8s_info.get_ifConnectWeb(),
				k8s_info.get_ifUseMacvlan()
)»
«ELSE»
«««use stacks, create pods
«FOR stack:system.componentStack»
«set_service(generator_helper.set_pod_name(system.name, stack.name),
				generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name, stack.name),
													true),
				k8s_info.get_ifConnectWeb(),
				k8s_info.get_deploymentType()
)»
«create_header(k8s_info.get_deploymentType,
				generator_helper.set_pod_name(system.name, stack.name),
				generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name, stack.name),
													false),
				Collections.<Pair<String, String>>emptyList(),
				Collections.<Pair<String, String>>emptyList()
)»
«create_pod_spec(k8s_info.get_deploymentType,
				generator_helper.set_service_name(generator_helper.set_pod_name(system.name, stack.name)),
				generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name, stack.name),
													false),
				Collections.<Pair<String, String>>emptyList()
)»
«create_pod_template(generator_helper.default_label_map(generator_helper.set_application_name(system.name),
													generator_helper.set_pod_name(system.name, stack.name),
													false),
					Collections.<Pair<String, String>>emptyList()
)»
«create_container(generator_helper.set_pod_name(system.name, stack.name),
				generator_helper.set_application_name(system.name),
				String.format("%s_%s", system.name, stack.name),
				imageInfo,
				k8s_info,
				generator_helper.set_start_command(system.name, stack.name, imageInfo.get_ros_version),
				imageInfo.get_ros_version(),
				k8s_info.get_ifConnectWeb(),
				k8s_info.get_ifUseMacvlan()
)»
«IF system.componentStack.indexOf(stack) != (system.componentStack.size() -1)»
---
«ENDIF»
«ENDFOR»
«ENDIF»

'''

}
