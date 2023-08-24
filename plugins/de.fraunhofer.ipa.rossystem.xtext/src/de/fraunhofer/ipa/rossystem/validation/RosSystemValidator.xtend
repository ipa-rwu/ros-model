/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.rossystem.validation

import java.util.List
import org.eclipse.xtext.validation.Check
import system.Component
import system.Connection
import system.Process
import system.RosActionClientReference
import system.RosActionServerReference
import system.RosInterface
import system.RosNode
import system.RosPublisherReference
import system.RosServiceClientReference
import system.RosServiceServerReference
import system.RosSubscriberReference
import system.System
import system.impl.RosSystemConnectionImpl

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RosSystemValidator extends AbstractRosSystemValidator {

//  public static val INVALID_NAME = 'invalidName'
//
//  @Check
//  def checkGreetingStartsWithCapital(Greeting greeting) {
//      if (!Character.isUpperCase(greeting.name.charAt(0))) {
//          warning('Name should start with a capital',
//                  RosSystemPackage.Literals.GREETING__NAME,
//                  INVALID_NAME)
//      }
//  }

  public static val NOT_IN_THE_SYSTEM = "The element is not part of the system"
  public static val NOT_VALID_PATTERN = "The element has not a valid type"
  public static val TYPE_NOT_MATCH = "The ports have different types"
  public static val INFO_LAUNCH_FILE = "Information to build the launch file path"
  Object from_type
  Object to_type


  @Check
  def InfoToValidFile(System system){
      if (!system.fromFile.empty){
        info('This attribute expects the path of the launch file from the package, for example: PackageName/launch/fileName.launch.py'
                  ,null,INFO_LAUNCH_FILE)
      }
  }

  @Check
  def checkIfNodeInSystem(Process process) {
      for (Component node : process.components) {
          //var nodeImpl = node as RosNodeImpl
          var system = process.eContainer as System
          if (!system.components.contains(node)){
              error('The node '+node+' is not part of the system '+system.name
                  ,null,NOT_IN_THE_SYSTEM
              )
              info('Valid components for this process are '+system.components
                  ,null,NOT_IN_THE_SYSTEM)
          }
      }
  }

  @Check
  def checkIfInterfaceInSystem(Connection connection) {
      var connection_def = connection as RosSystemConnectionImpl
      var from_connection = connection_def.from
      var to_connection = connection_def.to
      var system = connection.eContainer as System
      var List<RosInterface> AllInterfaces = newArrayList

      for (Component node : system.components){
          if (node.eClass.name=='RosNode') {
              var rosnode = node as RosNode
              for(RosInterface interface : rosnode.rosinterfaces){
                AllInterfaces.add(interface)
              }
          }
      }
      if (!AllInterfaces.contains(from_connection)){
              info('Valid interfaces for this process are '+AllInterfaces
                  ,null,NOT_IN_THE_SYSTEM)
              error('The interface '+from_connection+' is not part of the system '+system.name
                  ,null,NOT_IN_THE_SYSTEM)
      } else {
          if (!AllInterfaces.toArray.contains(to_connection)){
                  info('Valid interfaces for this process are '+AllInterfaces
                      ,null,NOT_IN_THE_SYSTEM)
                  error('The interface '+to_connection+' is not part of the system '+system.name
                      ,null,NOT_IN_THE_SYSTEM)
      }
    }
  }

  @Check
  def checkPortPatterns(Connection connection) {
      var List<String> validFromType = newArrayList('RosPublisherReference','RosServiceServerReference','RosActionServerReference')
      var List<String> validToType = newArrayList('RosSubscriberReference','RosServiceClientReference','RosActionClientReference')
      var connection_def = connection as RosSystemConnectionImpl
      var from_connection = connection_def.from
      var to_connection = connection_def.to
      if(!validFromType.contains(from_connection.reference.eClass.name)){
              error('The type of the interface '+from_connection+' is not valid, the output port can have only one of the following types '+validFromType
                  ,null,NOT_VALID_PATTERN)
      } else {
          if (from_connection.reference.eClass.name=='RosPublisherReference'){
              if(!(to_connection.reference.eClass.name=='RosSubscriberReference')){
                error('The input port (to) must be a Subscriber'
                  ,null,NOT_VALID_PATTERN)
          }}
          if (from_connection.reference.eClass.name=='RosServiceServerReference'){
              if(!(to_connection.reference.eClass.name=='RosServiceClientReference')){
                  error('The input port (to) must be a Service Client'
                      ,null,NOT_VALID_PATTERN)
          }}
          if (from_connection.reference.eClass.name=='RosActionServerReference'){
              if(!(to_connection.reference.eClass.name=='RosActionClientReference')){
                  error('The input port (to) must be an Action Client'
                      ,null,NOT_VALID_PATTERN)
          }}
      }
  }

  @Check
  def MatchPortMsgs(Connection connection){
      var connection_def = connection as RosSystemConnectionImpl
      var from_connection = connection_def.from
      var to_connection = connection_def.to
      if (from_connection.reference.eClass.name=='RosPublisherReference'){
          var from_top = from_connection.reference as RosPublisherReference
          from_type = from_top.from.message
      }
      if (from_connection.reference.eClass.name=='RosServiceServerReference'){
          var from_ser = from_connection.reference as RosServiceServerReference
          from_type = from_ser.from.service
      }
      if (from_connection.reference.eClass.name=='RosActionServerReference'){
          var from_act = from_connection.reference as RosActionServerReference
          from_type = from_act.from.action
      }
      if (to_connection.reference.eClass.name=='RosSubscriberReference'){
          var to_top = to_connection.reference as RosSubscriberReference
          to_type = to_top.from.message
      }
      if (to_connection.reference.eClass.name=='RosServiceClientReference'){
          var to_top = to_connection.reference as RosServiceClientReference
          to_type = to_top.from.service
      }
      if (to_connection.reference.eClass.name=='RosActionClientReference'){
          var to_top = to_connection.reference as RosActionClientReference
          to_type = to_top.from.action
      }

      if (from_type !== to_type){
          error("A connection can only be formed by interfaces with the same type, "+from_connection.name+" and "+to_connection.name+" have different types.", null, TYPE_NOT_MATCH)
      }
  }

}
