/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros.ide.contentassist.antlr;

import de.fraunhofer.ipa.ros.ide.contentassist.antlr.internal.InternalRosParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class RosTokenSource extends AbstractIndentationTokenSource {

	public RosTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalRosParser.RULE_WS;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Auto-generated method stub
		return 0;
	}
}