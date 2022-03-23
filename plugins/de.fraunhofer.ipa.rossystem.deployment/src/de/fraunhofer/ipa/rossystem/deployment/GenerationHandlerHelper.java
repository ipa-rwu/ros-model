package de.fraunhofer.ipa.rossystem.deployment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import componentInterface.ComponentInterface;
import componentInterface.RosParameter;

public class GenerationHandlerHelper {
	public EList<RosParameter> get_all_ros_params(EList<ComponentInterface> roscomponents) {
		  EList<RosParameter> all_ros_params = new BasicEList<RosParameter>();
		  for (int i=0; i<roscomponents.size(); i++) {
			  List<RosParameter>  component_params = get_ros_component_params(roscomponents.get(i));
				for (int j= 0;j<component_params.size();j++) {
					all_ros_params.add(component_params.get(j));
				}
			}
		  return all_ros_params;
	  }

	  private List<RosParameter> get_ros_component_params(ComponentInterface componentInterface_model){
		  List<RosParameter> ros_component_params = new ArrayList<RosParameter>();
		  for (RosParameter ros_param: componentInterface_model.getRosparameter()) {
			  ros_component_params.add(ros_param);
		  }
		  return ros_component_params;
	   }
}
