/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.validation

import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import ros.Parameter
import rossystem.ActionConnection
import rossystem.ServiceConnection
import rossystem.TopicConnection

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RosSystemValidator extends AbstractRosSystemValidator {
	
//	public static val NOT_MATCHED_NAME = 'notMatchedName'
//	public static val NOT_MATCHED_TYPE = 'notMatchedType'
//
//	@Check
//	def void checkTopicConnection(TopicConnection topicconnection){
//		for (pub:topicconnection.from){
//			for (sub:topicconnection.to){
//				if( !pub.publisher.message.name.equalsIgnoreCase(sub.subscriber.message.name)){
//					error("Messages not matched", null, NOT_MATCHED_TYPE)
//				}
//			}
//	}}
//
//	@Check
//	def void checkSrvConnection(ServiceConnection serviceconnection){
//		for (srvs:serviceconnection.from){
//			if( !srvs.srvserver.service.name.equalsIgnoreCase(serviceconnection.to.srvclient.service.name)){
//				error("Services not matched", null, NOT_MATCHED_TYPE)
//				return
//			}
//	}}
//	
//	@Check
//	def void checkActConnection(ActionConnection actionconnection){
//		if( !actionconnection.from.actserver.action.name.equalsIgnoreCase(actionconnection.to.actclient.action.name)){
//				error("Action type not matched", null, NOT_MATCHED_TYPE)
//				return
//			}
//	}
//	
//	/*Check parameter assignments */
//	String expected_type = null;
//	String value_type = null;
//	List<EObject> expected_sub_types;
//	ArrayList<String> expected_sub_names;
//	List<EObject> value_sub_type;
//	public static val INVALID_TYPE = 'invalidType'
//	public static val INVALID_NAME = 'invalidName'
//	public static val INVALID_LENGHT = "invalidLeght"
//	
//	int i;
//	int j;
//	String name_given_element;
//	String sub_element_type;
//	boolean sub_element;
//	EObject expected_sub_type = null;
//	
//	@Check
//	def void CheckParameter (RosParameter rosparam){
//		CheckParameterValue(rosparam.parameter,rosparam.value);
//	}
//	
//	def void CheckParameterValue (EObject expected_parameter, EObject given_parameter){
//
//		if (expected_parameter.eClass.name=="Parameter"){
//			expected_type = (expected_parameter as Parameter).type.eClass.name;
//			expected_sub_types = expected_parameter.eContents.get(0).eContents.toList
//			sub_element = false;
//			
//		} else {			
//			expected_type = expected_parameter.eClass.name;
//			expected_sub_types = expected_parameter.eContents.toList
//			sub_element = true;
//		}
//		value_type = given_parameter.eClass.name;
//
//		// LIST
//		if (expected_type.contains("ParameterListType") || expected_type.contains("ParameterSequence")){
//			//expected_sub_types = expected_parameter.eContents.get(0).eContents.toList
//			if (given_parameter.class.toString.contains("ParameterSequence")){
//				value_sub_type = given_parameter.eContents.toList
//				if (value_sub_type.length==expected_sub_types.length){
//					for (i=0;i<value_sub_type.length;i++){
//						if (expected_sub_types.get(i).eClass.name.matches("ParameterStructType|ParameterListType|ParameterSequence")){
//							try{
//								CheckParameterValue((expected_sub_types.get(i).eContents.get(0)),(value_sub_type.get(i).eContents.get(0).eContents.get(0)));
//							} catch (IndexOutOfBoundsException error) {
//					            // Output expected IndexOutOfBoundsExceptions.								
//							}
//						}
//						if(!check_matched_type(expected_sub_types.get(i).eClass.name,value_sub_type.get(i).eClass.name)){
//							error( "Element "+i+" , expected type: "+expected_sub_types.get(i).eClass.name+" given type "+value_sub_type.get(i).eClass.name, null, INVALID_TYPE)
//						}
//					}
//				} else {
//					error( "Expect a list of "+expected_sub_types.length+" elements", null, INVALID_LENGHT)
//				}
//			} else {
//				error( "Expect a list of elements; format { , ,...}", null, INVALID_LENGHT)
//				}
//			
//		}
//		// ARRAY
//		else if (expected_type.contains("ParameterArrayType")){
//			//expected_sub_types = expected_parameter.eContents.get(0).eContents.toList
//			if (given_parameter.class.toString.contains("ParameterSequence")){
//				value_sub_type = given_parameter.eContents.toList
//				expected_type=expected_sub_types.get(0).eClass.name
//				for (i=0;i<value_sub_type.length;i++){
//					if(!check_matched_type(expected_type,value_sub_type.get(i).eClass.name)){
//						error( "Element "+i+" , expected type: "+expected_type+" given type "+value_sub_type.get(i).eClass.name, null, INVALID_TYPE)
//					}
//				}
//				} 
//			else {
//				error( "Expect a list of elements; format { , , }", null, INVALID_LENGHT)
//				}
//		}
//		// STRUCT
//	  	else if (expected_type.contains("ParameterStruct")){
//			value_sub_type = given_parameter.eContents.toList;
//			expected_sub_names = new ArrayList<String>();
//
//			for (i=0; i<expected_sub_types.length;i++){	
//				expected_sub_names.add(i,getName(expected_sub_types.get(i).toString));
//			}
//
//			for (i=0; i<value_sub_type.length;i++){	
//				if (sub_element){
//					name_given_element = getName(value_sub_type.get(i).eContents.toString)
//				}else {
//					name_given_element = getName(value_sub_type.get(i).eContents.get(0).toString)
//				}	
//				sub_element_type = value_sub_type.get(i).eContents.get(0).eContents.get(0).eClass.name
//				
//				if (!(expected_sub_names.contains(name_given_element))){
//					error("Element expected names: "+expected_sub_names+ "  instead of: "+name_given_element,null, INVALID_NAME)
//					info("Struct format: value { {first_element {value value_fisrt element}}, {second_element {value value_second element}}}",null, INVALID_NAME)
//				} else {
//
//					for (j=0;j<expected_sub_types.length;j++){
//						if (expected_sub_types.get(j).toString.contains("name")){	
//						if ( ((getName(expected_sub_types.get(j).toString))==name_given_element) ){
//							if (expected_sub_types.get(j).eContents.get(0).eClass.name.matches("ParameterStructType|ParameterListType|ParameterSequence")){								
//								CheckParameterValue((expected_sub_types.get(j).eContents.get(0)),(value_sub_type.get(i).eContents.get(0).eContents.get(0)));
//							}
//							try{
//								expected_sub_type = expected_sub_types.get(j);
//								if (expected_sub_type.eContents.size > 0){
//								if (!check_matched_type(expected_sub_types.get(j).eContents.get(0).eClass.name,sub_element_type)){
//									error( "Element "+getName(expected_sub_types.get(j).toString)+" , expected type: "+expected_sub_types.get(j).eContents.get(0).eClass.name+
//									" given type "+sub_element_type, null, INVALID_TYPE)
//									info("Struct format: value { {FIRST {value VALUE_FIRST}}, {SECOND {value VALUE_SECOND}}}",null, INVALID_NAME)}
//									}
//							} catch (IndexOutOfBoundsException error) {
//					            // Output expected IndexOutOfBoundsExceptions.								
//							}
//		}}}}}}
//		
//		// INT, BOOL, DOUBLE, BASE64, STRING
//	  	else {
//	  	   if(!check_matched_type(expected_type,value_type)){
//	  	  	  	error("Mismatched input "+value_type+ " expecting "+ expected_type, null, INVALID_TYPE)
//			}
//		}
//	}
//
//
//	def boolean check_matched_type(String expected_type,String given_type){
//		if (given_type.contains("ParameterSequence") && expected_type.contains("ParameterList")){
//			return true;
//		}
//		else if (expected_type.contains(given_type)){
//			return true;
//		} else {
//			return false;
//		}
//	}
//	
//	def String getName(String Element){
//		if (Element.length()>0){
//			return Element.substring(Element.indexOf("name:")+5,Element.indexOf(")"))
//		}
//	}
//	
//	def String getValue(String Element){
//		return Element.substring(Element.indexOf("value:")+6,Element.indexOf(")"))
//	}
//
//	/*Parameters Helper*/
//	public static val PARAMETER_HELP = 'paramInfo'
//			
//	@Check
//	def void BinaryHelp (Parameter param){
//		if(param.type.toString.contains("Base64") && !(param.toString.contains('0b') ||param.toString.contains('0B'))){
//			info("HELP: A binary value must start with '0b'", null, PARAMETER_HELP)
//		}
//	}
//	
//	@Check
//	def void ArrayHelp (Parameter param){
//		if(param.type.toString.contains("Array")){
//			info("HELP: Array parameter format:\n { type TYPE {default VALUE, VALUE }\n example:\n type Boolean default true, true} ", null, PARAMETER_HELP)
//		}
//	}
//	
//	@Check
//	def void ListHelp (Parameter param){
//		if(param.type.toString.contains("List")){
//			info("HELP: List parameter format:\n { TYPE default VALUE,TYPE default VALUE }\n example:\n Integer default 5, Boolean default true ", null, PARAMETER_HELP)
//		}
//	}
//	
//	@Check
//	def void StructHelp (Parameter param){
//		if(param.type.toString.contains("Struc")){
//			info("HELP: Struct parameter format:\n { NAME TYPE default VALUE, NAME TYPE default VALUE }\n example:\n my_int Integer default 5, my_bool Boolean default true ", null, PARAMETER_HELP)
//		}
//	}
}
