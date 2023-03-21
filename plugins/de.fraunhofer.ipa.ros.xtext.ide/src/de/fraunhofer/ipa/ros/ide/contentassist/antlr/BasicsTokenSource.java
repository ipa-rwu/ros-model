/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros.ide.contentassist.antlr;

import de.fraunhofer.ipa.ros.ide.contentassist.antlr.internal.InternalBasicsParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class BasicsTokenSource extends AbstractIndentationTokenSource {

	public BasicsTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalBasicsParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalBasicsParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalBasicsParser.RULE_END;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}
