/*
 * generated by Xtext 2.13.0
 */
package de.fraunhofer.ipa.rossystem.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import rossystem.RosSystem
import rossystem.ServiceConnection
import rossystem.TopicConnection
import ros.Publisher
import componentInterface.RosPublisher

class RosSystemFormatter extends AbstractFormatter2 {
	
	@Inject extension RosSystemGrammarAccess

	def dispatch void format(RosSystem rosSystem, extension IFormattableDocument document) {
		for (TopicConnection topicConnection : rosSystem.getTopicConnections()) {
			if( topicConnection.fromTopic.name.equalsIgnoreCase(topicConnection.toTopic.name)){
					topicConnection.format;
				
			}
			if( topicConnection.fromTopic.publisher.message.name.equalsIgnoreCase(topicConnection.toTopic.subscriber.message.name)){
			}
				topicConnection.format;
		}
		for (ServiceConnection serviceConnection : rosSystem.getServiceConnections()) {
			serviceConnection.format;
		}
	}
	
}
