/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.parser.antlr.internal.InternalRosParser;
import de.fraunhofer.ipa.ros.services.RosGrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RosParser extends AbstractAntlrParser {

    @Inject
    private RosGrammarAccess grammarAccess;

    @Override
    protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
        tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
    }

    @Override
    protected TokenSource createLexer(CharStream stream) {
        return new RosTokenSource(super.createLexer(stream));
    }

    /**
     * Indentation aware languages do not support partial parsing since the lexer is inherently stateful.
     * Override and return {@code true} if your terminal splitting is stateless.
     */
    @Override
    protected boolean isReparseSupported() {
        return false;
    }

    @Override
    protected InternalRosParser createParser(XtextTokenStream stream) {
        return new InternalRosParser(stream, getGrammarAccess());
    }

    @Override
    protected String getDefaultRuleName() {
        return "PackageSet";
    }

    public RosGrammarAccess getGrammarAccess() {
        return this.grammarAccess;
    }

    public void setGrammarAccess(RosGrammarAccess grammarAccess) {
        this.grammarAccess = grammarAccess;
    }
}
