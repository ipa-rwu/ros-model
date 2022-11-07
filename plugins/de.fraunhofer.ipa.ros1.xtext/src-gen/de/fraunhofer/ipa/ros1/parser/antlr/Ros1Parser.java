/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros1.parser.antlr;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros1.parser.antlr.internal.InternalRos1Parser;
import de.fraunhofer.ipa.ros1.services.Ros1GrammarAccess;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Ros1Parser extends AbstractAntlrParser {

	@Inject
	private Ros1GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new Ros1TokenSource(super.createLexer(stream));
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
	protected InternalRos1Parser createParser(XtextTokenStream stream) {
		return new InternalRos1Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CatkinPackage";
	}

	public Ros1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Ros1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
