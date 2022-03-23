package de.fraunhofer.ipa.rossystem.deployment

import java.util.ArrayList

enum ProcessorArchitecture {
	Arm64,
	X86
}

class MetaHardwareInfo {
	ProcessorArchitecture processorArchitecture
	ArrayList<String>  virtualPorts
	
	new (ProcessorArchitecture processorArchitecture){
		this.processorArchitecture = processorArchitecture
		this.virtualPorts = new ArrayList()
	}
	
	new() {
		this.virtualPorts = new ArrayList()
	}
	
	def setProcessorArchitecture(ProcessorArchitecture processorArchitecture){
		this.processorArchitecture = processorArchitecture
	}
	def getProcessorArchitecture(){
		return this.processorArchitecture
	}
	
	def addPort(String port){
		virtualPorts.add(port)
	}
	def getPorts(){
		return this.virtualPorts
	}
}

class MetaHardwareHelper {

}