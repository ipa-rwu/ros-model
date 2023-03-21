/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros2.ide.contentassist.antlr;

import de.fraunhofer.ipa.ros2.ide.contentassist.antlr.internal.InternalRos2Parser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class Ros2TokenSource extends AbstractIndentationTokenSource {

	public Ros2TokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalRos2Parser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalRos2Parser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalRos2Parser.RULE_END;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}
