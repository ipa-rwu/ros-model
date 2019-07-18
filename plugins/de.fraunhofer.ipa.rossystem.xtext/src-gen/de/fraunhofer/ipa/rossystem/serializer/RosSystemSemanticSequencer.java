/*
 * generated by Xtext 2.16.0
 */
package de.fraunhofer.ipa.rossystem.serializer;

import com.google.inject.Inject;
import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfacePackage;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import rossystem.ActionConnection;
import rossystem.RosSystem;
import rossystem.RossystemPackage;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;

@SuppressWarnings("all")
public class RosSystemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RosSystemGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ComponentInterfacePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE:
				sequence_ComponentInterface(context, (ComponentInterface) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_ACTION_CLIENT:
				sequence_RosActionClient(context, (RosActionClient) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_ACTION_SERVER:
				sequence_RosActionServer(context, (RosActionServer) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_PUBLISHER:
				sequence_RosPublisher(context, (RosPublisher) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT:
				sequence_RosServiceClient(context, (RosServiceClient) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SERVICE_SERVER:
				sequence_RosServiceServer(context, (RosServiceServer) semanticObject); 
				return; 
			case ComponentInterfacePackage.ROS_SUBSCRIBER:
				sequence_RosSubscriber(context, (RosSubscriber) semanticObject); 
				return; 
			}
		else if (epackage == RossystemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RossystemPackage.ACTION_CONNECTION:
				sequence_ActionConnection(context, (ActionConnection) semanticObject); 
				return; 
			case RossystemPackage.ROS_SYSTEM:
				sequence_RosSystem(context, (RosSystem) semanticObject); 
				return; 
			case RossystemPackage.SERVICE_CONNECTION:
				sequence_ServiceConnection(context, (ServiceConnection) semanticObject); 
				return; 
			case RossystemPackage.TOPIC_CONNECTION:
				sequence_TopicConnection(context, (TopicConnection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionConnection returns ActionConnection
	 *
	 * Constraint:
	 *     (ActionName=EString From=[RosActionServer|EString] To=[RosActionClient|EString])
	 */
	protected void sequence_ActionConnection(ISerializationContext context, ActionConnection semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__ACTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__ACTION_NAME));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__FROM));
			if (transientValues.isValueTransient(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RossystemPackage.Literals.ACTION_CONNECTION__TO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionConnectionAccess().getActionNameEStringParserRuleCall_1_0(), semanticObject.getActionName());
		feeder.accept(grammarAccess.getActionConnectionAccess().getFromRosActionServerEStringParserRuleCall_4_0_1(), semanticObject.eGet(RossystemPackage.Literals.ACTION_CONNECTION__FROM, false));
		feeder.accept(grammarAccess.getActionConnectionAccess().getToRosActionClientEStringParserRuleCall_6_0_1(), semanticObject.eGet(RossystemPackage.Literals.ACTION_CONNECTION__TO, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentInterface returns ComponentInterface
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         NameSpace=EString? 
	 *         (rospublisher+=RosPublisher rospublisher+=RosPublisher*)? 
	 *         (rossubscriber+=RosSubscriber rossubscriber+=RosSubscriber*)? 
	 *         (rosserviceserver+=RosServiceServer rosserviceserver+=RosServiceServer*)? 
	 *         (rosserviceclient+=RosServiceClient rosserviceclient+=RosServiceClient*)? 
	 *         (rosactionserver+=RosActionServer rosactionserver+=RosActionServer*)? 
	 *         (rosactionclient+=RosActionClient rosactionclient+=RosActionClient*)?
	 *     )
	 */
	protected void sequence_ComponentInterface(ISerializationContext context, ComponentInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosActionClient returns RosActionClient
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? actclient=[ActionClient|EString])
	 */
	protected void sequence_RosActionClient(ISerializationContext context, RosActionClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosActionServer returns RosActionServer
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? actserver=[ActionServer|EString])
	 */
	protected void sequence_RosActionServer(ISerializationContext context, RosActionServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosPublisher returns RosPublisher
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? publisher=[Publisher|EString])
	 */
	protected void sequence_RosPublisher(ISerializationContext context, RosPublisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceClient returns RosServiceClient
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? srvclient=[ServiceClient|EString])
	 */
	protected void sequence_RosServiceClient(ISerializationContext context, RosServiceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosServiceServer returns RosServiceServer
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? srvserver=[ServiceServer|EString])
	 */
	protected void sequence_RosServiceServer(ISerializationContext context, RosServiceServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosSubscriber returns RosSubscriber
	 *
	 * Constraint:
	 *     (name=EString? ns=EString? subscriber=[Subscriber|EString])
	 */
	protected void sequence_RosSubscriber(ISerializationContext context, RosSubscriber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RosSystem returns RosSystem
	 *
	 * Constraint:
	 *     (
	 *         Name=EString 
	 *         (RosComponent+=ComponentInterface RosComponent+=ComponentInterface*)? 
	 *         (TopicConnections+=TopicConnection TopicConnections+=TopicConnection*)? 
	 *         (ServiceConnections+=ServiceConnection ServiceConnections+=ServiceConnection*)? 
	 *         (ActionConnections+=ActionConnection ActionConnections+=ActionConnection*)?
	 *     )
	 */
	protected void sequence_RosSystem(ISerializationContext context, RosSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceConnection returns ServiceConnection
	 *
	 * Constraint:
	 *     (ServiceName=EString From+=[RosServiceServer|EString] From+=[RosServiceServer|EString]* To=[RosServiceClient|EString])
	 */
	protected void sequence_ServiceConnection(ISerializationContext context, ServiceConnection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopicConnection returns TopicConnection
	 *
	 * Constraint:
	 *     (TopicName=EString From+=[RosPublisher|EString] From+=[RosPublisher|EString]* To+=[RosSubscriber|EString] To+=[RosSubscriber|EString]*)
	 */
	protected void sequence_TopicConnection(ISerializationContext context, TopicConnection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
