/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.rossystem.parser.antlr;

import de.fraunhofer.ipa.rossystem.parser.antlr.internal.InternalRosSystemParser;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;

public class RosSystemTokenSource extends AbstractIndentationTokenSource {

    public RosSystemTokenSource(TokenSource delegate) {
        super(delegate);
    }

    @Override
    protected boolean shouldSplitTokenImpl(Token token) {
        // TODO Review assumption
        return token.getType() == InternalRosSystemParser.RULE_WS;
    }

    @Override
    protected int getBeginTokenType() {
        // TODO Review assumption
        return InternalRosSystemParser.RULE_BEGIN;
    }

    @Override
    protected int getEndTokenType() {
        // TODO Review assumption
        return InternalRosSystemParser.RULE_END;
    }

}
