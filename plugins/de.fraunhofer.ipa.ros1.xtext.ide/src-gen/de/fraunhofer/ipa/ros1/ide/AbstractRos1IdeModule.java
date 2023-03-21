/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros1.ide;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import de.fraunhofer.ipa.ros1.ide.contentassist.antlr.Ros1Parser;
import de.fraunhofer.ipa.ros1.ide.contentassist.antlr.lexer.InternalRos1Lexer;
import org.eclipse.xtext.ide.DefaultIdeModule;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.CompletionPrefixProvider;
import org.eclipse.xtext.ide.editor.contentassist.FQNPrefixMatcher;
import org.eclipse.xtext.ide.editor.contentassist.IPrefixMatcher;
import org.eclipse.xtext.ide.editor.contentassist.IProposalConflictHelper;
import org.eclipse.xtext.ide.editor.contentassist.IndentationAwareCompletionPrefixProvider;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AntlrProposalConflictHelper;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.ide.refactoring.IRenameStrategy2;
import org.eclipse.xtext.ide.server.rename.IRenameService2;
import org.eclipse.xtext.ide.server.rename.RenameService2;

/**
 * Manual modifications go to {@link Ros1IdeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractRos1IdeModule extends DefaultIdeModule {

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public void configureContentAssistLexer(Binder binder) {
        binder.bind(Lexer.class)
            .annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))
            .to(InternalRos1Lexer.class);
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends IContentAssistParser> bindIContentAssistParser() {
        return Ros1Parser.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends IProposalConflictHelper> bindIProposalConflictHelper() {
        return AntlrProposalConflictHelper.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
    public Class<? extends CompletionPrefixProvider> bindCompletionPrefixProvider() {
        return IndentationAwareCompletionPrefixProvider.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2
    public Class<? extends IPrefixMatcher> bindIPrefixMatcher() {
        return FQNPrefixMatcher.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2
    public Class<? extends IRenameService2> bindIRenameService2() {
        return RenameService2.class;
    }

    // contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2
    public Class<? extends IRenameStrategy2> bindIRenameStrategy2() {
        return IRenameStrategy2.DefaultImpl.class;
    }

}
