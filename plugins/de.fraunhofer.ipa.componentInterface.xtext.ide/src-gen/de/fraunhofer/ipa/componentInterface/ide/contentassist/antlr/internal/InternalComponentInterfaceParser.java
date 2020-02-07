package de.fraunhofer.ipa.componentInterface.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.componentInterface.services.ComponentInterfaceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_DECINT", "RULE_SIGN", "RULE_INT", "RULE_SIGNED_INT", "RULE_HEX_DIGIT", "RULE_HEX", "RULE_BINARY_DIGIT", "RULE_BINARY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'}'", "'NameSpace'", "'RosPublishers'", "','", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'value'"
    };
    public static final int RULE_HEX=14;
    public static final int RULE_SIGN=10;
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=7;
    public static final int RULE_DIGIT=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=19;
    public static final int RULE_SIGNED_INT=12;
    public static final int RULE_ANY_OTHER=20;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=13;
    public static final int T__46=46;
    public static final int RULE_BINARY=16;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int RULE_BINARY_DIGIT=15;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalComponentInterfaceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentInterfaceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentInterfaceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }


    	private ComponentInterfaceGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentInterfaceGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleComponentInterface"
    // InternalComponentInterface.g:53:1: entryRuleComponentInterface : ruleComponentInterface EOF ;
    public final void entryRuleComponentInterface() throws RecognitionException {
        try {
            // InternalComponentInterface.g:54:1: ( ruleComponentInterface EOF )
            // InternalComponentInterface.g:55:1: ruleComponentInterface EOF
            {
             before(grammarAccess.getComponentInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInterface();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInterface"


    // $ANTLR start "ruleComponentInterface"
    // InternalComponentInterface.g:62:1: ruleComponentInterface : ( ( rule__ComponentInterface__Group__0 ) ) ;
    public final void ruleComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:66:2: ( ( ( rule__ComponentInterface__Group__0 ) ) )
            // InternalComponentInterface.g:67:2: ( ( rule__ComponentInterface__Group__0 ) )
            {
            // InternalComponentInterface.g:67:2: ( ( rule__ComponentInterface__Group__0 ) )
            // InternalComponentInterface.g:68:3: ( rule__ComponentInterface__Group__0 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup()); 
            // InternalComponentInterface.g:69:3: ( rule__ComponentInterface__Group__0 )
            // InternalComponentInterface.g:69:4: rule__ComponentInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInterface"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalComponentInterface.g:78:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalComponentInterface.g:79:1: ( ruleRosPublisher EOF )
            // InternalComponentInterface.g:80:1: ruleRosPublisher EOF
            {
             before(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getRosPublisherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalComponentInterface.g:87:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:91:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalComponentInterface.g:92:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalComponentInterface.g:92:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalComponentInterface.g:93:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalComponentInterface.g:94:3: ( rule__RosPublisher__Group__0 )
            // InternalComponentInterface.g:94:4: rule__RosPublisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalComponentInterface.g:103:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalComponentInterface.g:104:1: ( ruleRosSubscriber EOF )
            // InternalComponentInterface.g:105:1: ruleRosSubscriber EOF
            {
             before(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getRosSubscriberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalComponentInterface.g:112:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:116:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalComponentInterface.g:117:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalComponentInterface.g:117:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalComponentInterface.g:118:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalComponentInterface.g:119:3: ( rule__RosSubscriber__Group__0 )
            // InternalComponentInterface.g:119:4: rule__RosSubscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosServiceServer"
    // InternalComponentInterface.g:128:1: entryRuleRosServiceServer : ruleRosServiceServer EOF ;
    public final void entryRuleRosServiceServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:129:1: ( ruleRosServiceServer EOF )
            // InternalComponentInterface.g:130:1: ruleRosServiceServer EOF
            {
             before(grammarAccess.getRosServiceServerRule()); 
            pushFollow(FOLLOW_1);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getRosServiceServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosServiceServer"


    // $ANTLR start "ruleRosServiceServer"
    // InternalComponentInterface.g:137:1: ruleRosServiceServer : ( ( rule__RosServiceServer__Group__0 ) ) ;
    public final void ruleRosServiceServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:141:2: ( ( ( rule__RosServiceServer__Group__0 ) ) )
            // InternalComponentInterface.g:142:2: ( ( rule__RosServiceServer__Group__0 ) )
            {
            // InternalComponentInterface.g:142:2: ( ( rule__RosServiceServer__Group__0 ) )
            // InternalComponentInterface.g:143:3: ( rule__RosServiceServer__Group__0 )
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup()); 
            // InternalComponentInterface.g:144:3: ( rule__RosServiceServer__Group__0 )
            // InternalComponentInterface.g:144:4: rule__RosServiceServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServiceServer"


    // $ANTLR start "entryRuleRosServiceClient"
    // InternalComponentInterface.g:153:1: entryRuleRosServiceClient : ruleRosServiceClient EOF ;
    public final void entryRuleRosServiceClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:154:1: ( ruleRosServiceClient EOF )
            // InternalComponentInterface.g:155:1: ruleRosServiceClient EOF
            {
             before(grammarAccess.getRosServiceClientRule()); 
            pushFollow(FOLLOW_1);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getRosServiceClientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosServiceClient"


    // $ANTLR start "ruleRosServiceClient"
    // InternalComponentInterface.g:162:1: ruleRosServiceClient : ( ( rule__RosServiceClient__Group__0 ) ) ;
    public final void ruleRosServiceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:166:2: ( ( ( rule__RosServiceClient__Group__0 ) ) )
            // InternalComponentInterface.g:167:2: ( ( rule__RosServiceClient__Group__0 ) )
            {
            // InternalComponentInterface.g:167:2: ( ( rule__RosServiceClient__Group__0 ) )
            // InternalComponentInterface.g:168:3: ( rule__RosServiceClient__Group__0 )
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup()); 
            // InternalComponentInterface.g:169:3: ( rule__RosServiceClient__Group__0 )
            // InternalComponentInterface.g:169:4: rule__RosServiceClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServiceClient"


    // $ANTLR start "entryRuleRosActionServer"
    // InternalComponentInterface.g:178:1: entryRuleRosActionServer : ruleRosActionServer EOF ;
    public final void entryRuleRosActionServer() throws RecognitionException {
        try {
            // InternalComponentInterface.g:179:1: ( ruleRosActionServer EOF )
            // InternalComponentInterface.g:180:1: ruleRosActionServer EOF
            {
             before(grammarAccess.getRosActionServerRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getRosActionServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosActionServer"


    // $ANTLR start "ruleRosActionServer"
    // InternalComponentInterface.g:187:1: ruleRosActionServer : ( ( rule__RosActionServer__Group__0 ) ) ;
    public final void ruleRosActionServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:191:2: ( ( ( rule__RosActionServer__Group__0 ) ) )
            // InternalComponentInterface.g:192:2: ( ( rule__RosActionServer__Group__0 ) )
            {
            // InternalComponentInterface.g:192:2: ( ( rule__RosActionServer__Group__0 ) )
            // InternalComponentInterface.g:193:3: ( rule__RosActionServer__Group__0 )
            {
             before(grammarAccess.getRosActionServerAccess().getGroup()); 
            // InternalComponentInterface.g:194:3: ( rule__RosActionServer__Group__0 )
            // InternalComponentInterface.g:194:4: rule__RosActionServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionServer"


    // $ANTLR start "entryRuleRosActionClient"
    // InternalComponentInterface.g:203:1: entryRuleRosActionClient : ruleRosActionClient EOF ;
    public final void entryRuleRosActionClient() throws RecognitionException {
        try {
            // InternalComponentInterface.g:204:1: ( ruleRosActionClient EOF )
            // InternalComponentInterface.g:205:1: ruleRosActionClient EOF
            {
             before(grammarAccess.getRosActionClientRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getRosActionClientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosActionClient"


    // $ANTLR start "ruleRosActionClient"
    // InternalComponentInterface.g:212:1: ruleRosActionClient : ( ( rule__RosActionClient__Group__0 ) ) ;
    public final void ruleRosActionClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:216:2: ( ( ( rule__RosActionClient__Group__0 ) ) )
            // InternalComponentInterface.g:217:2: ( ( rule__RosActionClient__Group__0 ) )
            {
            // InternalComponentInterface.g:217:2: ( ( rule__RosActionClient__Group__0 ) )
            // InternalComponentInterface.g:218:3: ( rule__RosActionClient__Group__0 )
            {
             before(grammarAccess.getRosActionClientAccess().getGroup()); 
            // InternalComponentInterface.g:219:3: ( rule__RosActionClient__Group__0 )
            // InternalComponentInterface.g:219:4: rule__RosActionClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionClient"


    // $ANTLR start "entryRuleRosParameter"
    // InternalComponentInterface.g:228:1: entryRuleRosParameter : ruleRosParameter EOF ;
    public final void entryRuleRosParameter() throws RecognitionException {
        try {
            // InternalComponentInterface.g:229:1: ( ruleRosParameter EOF )
            // InternalComponentInterface.g:230:1: ruleRosParameter EOF
            {
             before(grammarAccess.getRosParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalComponentInterface.g:237:1: ruleRosParameter : ( ( rule__RosParameter__Group__0 ) ) ;
    public final void ruleRosParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:241:2: ( ( ( rule__RosParameter__Group__0 ) ) )
            // InternalComponentInterface.g:242:2: ( ( rule__RosParameter__Group__0 ) )
            {
            // InternalComponentInterface.g:242:2: ( ( rule__RosParameter__Group__0 ) )
            // InternalComponentInterface.g:243:3: ( rule__RosParameter__Group__0 )
            {
             before(grammarAccess.getRosParameterAccess().getGroup()); 
            // InternalComponentInterface.g:244:3: ( rule__RosParameter__Group__0 )
            // InternalComponentInterface.g:244:4: rule__RosParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosParameter"


    // $ANTLR start "entryRuleEString"
    // InternalComponentInterface.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentInterface.g:254:1: ( ruleEString EOF )
            // InternalComponentInterface.g:255:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalComponentInterface.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalComponentInterface.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalComponentInterface.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalComponentInterface.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalComponentInterface.g:269:3: ( rule__EString__Alternatives )
            // InternalComponentInterface.g:269:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleParameterValue"
    // InternalComponentInterface.g:278:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalComponentInterface.g:279:1: ( ruleParameterValue EOF )
            // InternalComponentInterface.g:280:1: ruleParameterValue EOF
            {
             before(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalComponentInterface.g:287:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:291:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalComponentInterface.g:292:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalComponentInterface.g:292:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalComponentInterface.g:293:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalComponentInterface.g:294:3: ( rule__ParameterValue__Alternatives )
            // InternalComponentInterface.g:294:4: rule__ParameterValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleboolean0"
    // InternalComponentInterface.g:303:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalComponentInterface.g:304:1: ( ruleboolean0 EOF )
            // InternalComponentInterface.g:305:1: ruleboolean0 EOF
            {
             before(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getBoolean0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalComponentInterface.g:312:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:316:2: ( ( RULE_BOOLEAN ) )
            // InternalComponentInterface.g:317:2: ( RULE_BOOLEAN )
            {
            // InternalComponentInterface.g:317:2: ( RULE_BOOLEAN )
            // InternalComponentInterface.g:318:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalComponentInterface.g:328:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalComponentInterface.g:329:1: ( ruleDouble0 EOF )
            // InternalComponentInterface.g:330:1: ruleDouble0 EOF
            {
             before(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getDouble0Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalComponentInterface.g:337:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:341:2: ( ( RULE_DOUBLE ) )
            // InternalComponentInterface.g:342:2: ( RULE_DOUBLE )
            {
            // InternalComponentInterface.g:342:2: ( RULE_DOUBLE )
            // InternalComponentInterface.g:343:3: RULE_DOUBLE
            {
             before(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComponentInterface.g:352:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:356:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:357:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:357:2: ( RULE_STRING )
                    // InternalComponentInterface.g:358:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:363:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:363:2: ( RULE_ID )
                    // InternalComponentInterface.g:364:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalComponentInterface.g:373:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__Group_0__0 ) ) | ( ( rule__ParameterValue__Group_1__0 ) ) | ( ( rule__ParameterValue__Group_2__0 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:377:1: ( ( ( rule__ParameterValue__Group_0__0 ) ) | ( ( rule__ParameterValue__Group_1__0 ) ) | ( ( rule__ParameterValue__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DOUBLE:
                {
                alt2=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:378:2: ( ( rule__ParameterValue__Group_0__0 ) )
                    {
                    // InternalComponentInterface.g:378:2: ( ( rule__ParameterValue__Group_0__0 ) )
                    // InternalComponentInterface.g:379:3: ( rule__ParameterValue__Group_0__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_0()); 
                    // InternalComponentInterface.g:380:3: ( rule__ParameterValue__Group_0__0 )
                    // InternalComponentInterface.g:380:4: rule__ParameterValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:384:2: ( ( rule__ParameterValue__Group_1__0 ) )
                    {
                    // InternalComponentInterface.g:384:2: ( ( rule__ParameterValue__Group_1__0 ) )
                    // InternalComponentInterface.g:385:3: ( rule__ParameterValue__Group_1__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_1()); 
                    // InternalComponentInterface.g:386:3: ( rule__ParameterValue__Group_1__0 )
                    // InternalComponentInterface.g:386:4: rule__ParameterValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentInterface.g:390:2: ( ( rule__ParameterValue__Group_2__0 ) )
                    {
                    // InternalComponentInterface.g:390:2: ( ( rule__ParameterValue__Group_2__0 ) )
                    // InternalComponentInterface.g:391:3: ( rule__ParameterValue__Group_2__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_2()); 
                    // InternalComponentInterface.g:392:3: ( rule__ParameterValue__Group_2__0 )
                    // InternalComponentInterface.g:392:4: rule__ParameterValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Alternatives"


    // $ANTLR start "rule__ComponentInterface__Group__0"
    // InternalComponentInterface.g:400:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:404:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:405:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__0"


    // $ANTLR start "rule__ComponentInterface__Group__0__Impl"
    // InternalComponentInterface.g:412:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:416:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:417:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:417:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:418:2: 'ComponentInterface'
            {
             before(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getComponentInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__1"
    // InternalComponentInterface.g:427:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:431:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:432:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__1"


    // $ANTLR start "rule__ComponentInterface__Group__1__Impl"
    // InternalComponentInterface.g:439:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:443:1: ( ( '{' ) )
            // InternalComponentInterface.g:444:1: ( '{' )
            {
            // InternalComponentInterface.g:444:1: ( '{' )
            // InternalComponentInterface.g:445:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__2"
    // InternalComponentInterface.g:454:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:458:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:459:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ComponentInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__2"


    // $ANTLR start "rule__ComponentInterface__Group__2__Impl"
    // InternalComponentInterface.g:466:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:470:1: ( ( 'name' ) )
            // InternalComponentInterface.g:471:1: ( 'name' )
            {
            // InternalComponentInterface.g:471:1: ( 'name' )
            // InternalComponentInterface.g:472:2: 'name'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__3"
    // InternalComponentInterface.g:481:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:485:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:486:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__3"


    // $ANTLR start "rule__ComponentInterface__Group__3__Impl"
    // InternalComponentInterface.g:493:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:497:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:498:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:498:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:499:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:500:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:500:3: rule__ComponentInterface__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__4"
    // InternalComponentInterface.g:508:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:512:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:513:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__4"


    // $ANTLR start "rule__ComponentInterface__Group__4__Impl"
    // InternalComponentInterface.g:520:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:524:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:525:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:525:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:526:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:527:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:527:3: rule__ComponentInterface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__5"
    // InternalComponentInterface.g:535:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:539:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:540:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__5"


    // $ANTLR start "rule__ComponentInterface__Group__5__Impl"
    // InternalComponentInterface.g:547:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:551:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:552:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:552:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:553:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:554:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:554:3: rule__ComponentInterface__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__5__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__6"
    // InternalComponentInterface.g:562:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:566:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:567:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__6"


    // $ANTLR start "rule__ComponentInterface__Group__6__Impl"
    // InternalComponentInterface.g:574:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:578:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:579:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:579:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:580:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:581:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:581:3: rule__ComponentInterface__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__6__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__7"
    // InternalComponentInterface.g:589:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:593:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:594:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__7"


    // $ANTLR start "rule__ComponentInterface__Group__7__Impl"
    // InternalComponentInterface.g:601:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:605:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:606:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:606:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:607:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:608:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:608:3: rule__ComponentInterface__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__7__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__8"
    // InternalComponentInterface.g:616:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:620:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalComponentInterface.g:621:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__8"


    // $ANTLR start "rule__ComponentInterface__Group__8__Impl"
    // InternalComponentInterface.g:628:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:632:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalComponentInterface.g:633:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalComponentInterface.g:633:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalComponentInterface.g:634:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalComponentInterface.g:635:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:635:3: rule__ComponentInterface__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__8__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__9"
    // InternalComponentInterface.g:643:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:647:1: ( rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 )
            // InternalComponentInterface.g:648:2: rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__9"


    // $ANTLR start "rule__ComponentInterface__Group__9__Impl"
    // InternalComponentInterface.g:655:1: rule__ComponentInterface__Group__9__Impl : ( ( rule__ComponentInterface__Group_9__0 )? ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:659:1: ( ( ( rule__ComponentInterface__Group_9__0 )? ) )
            // InternalComponentInterface.g:660:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            {
            // InternalComponentInterface.g:660:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            // InternalComponentInterface.g:661:2: ( rule__ComponentInterface__Group_9__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9()); 
            // InternalComponentInterface.g:662:2: ( rule__ComponentInterface__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:662:3: rule__ComponentInterface__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__9__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__10"
    // InternalComponentInterface.g:670:1: rule__ComponentInterface__Group__10 : rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 ;
    public final void rule__ComponentInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:674:1: ( rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 )
            // InternalComponentInterface.g:675:2: rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__10"


    // $ANTLR start "rule__ComponentInterface__Group__10__Impl"
    // InternalComponentInterface.g:682:1: rule__ComponentInterface__Group__10__Impl : ( ( rule__ComponentInterface__Group_10__0 )? ) ;
    public final void rule__ComponentInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:686:1: ( ( ( rule__ComponentInterface__Group_10__0 )? ) )
            // InternalComponentInterface.g:687:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            {
            // InternalComponentInterface.g:687:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            // InternalComponentInterface.g:688:2: ( rule__ComponentInterface__Group_10__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10()); 
            // InternalComponentInterface.g:689:2: ( rule__ComponentInterface__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:689:3: rule__ComponentInterface__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__10__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__11"
    // InternalComponentInterface.g:697:1: rule__ComponentInterface__Group__11 : rule__ComponentInterface__Group__11__Impl rule__ComponentInterface__Group__12 ;
    public final void rule__ComponentInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:701:1: ( rule__ComponentInterface__Group__11__Impl rule__ComponentInterface__Group__12 )
            // InternalComponentInterface.g:702:2: rule__ComponentInterface__Group__11__Impl rule__ComponentInterface__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__ComponentInterface__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__11"


    // $ANTLR start "rule__ComponentInterface__Group__11__Impl"
    // InternalComponentInterface.g:709:1: rule__ComponentInterface__Group__11__Impl : ( ( rule__ComponentInterface__Group_11__0 )? ) ;
    public final void rule__ComponentInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:713:1: ( ( ( rule__ComponentInterface__Group_11__0 )? ) )
            // InternalComponentInterface.g:714:1: ( ( rule__ComponentInterface__Group_11__0 )? )
            {
            // InternalComponentInterface.g:714:1: ( ( rule__ComponentInterface__Group_11__0 )? )
            // InternalComponentInterface.g:715:2: ( rule__ComponentInterface__Group_11__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_11()); 
            // InternalComponentInterface.g:716:2: ( rule__ComponentInterface__Group_11__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:716:3: rule__ComponentInterface__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInterface__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInterfaceAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__11__Impl"


    // $ANTLR start "rule__ComponentInterface__Group__12"
    // InternalComponentInterface.g:724:1: rule__ComponentInterface__Group__12 : rule__ComponentInterface__Group__12__Impl ;
    public final void rule__ComponentInterface__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:728:1: ( rule__ComponentInterface__Group__12__Impl )
            // InternalComponentInterface.g:729:2: rule__ComponentInterface__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__12"


    // $ANTLR start "rule__ComponentInterface__Group__12__Impl"
    // InternalComponentInterface.g:735:1: rule__ComponentInterface__Group__12__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:739:1: ( ( '}' ) )
            // InternalComponentInterface.g:740:1: ( '}' )
            {
            // InternalComponentInterface.g:740:1: ( '}' )
            // InternalComponentInterface.g:741:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group__12__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__0"
    // InternalComponentInterface.g:751:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:755:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:756:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__0"


    // $ANTLR start "rule__ComponentInterface__Group_4__0__Impl"
    // InternalComponentInterface.g:763:1: rule__ComponentInterface__Group_4__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:767:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:768:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:768:1: ( 'NameSpace' )
            // InternalComponentInterface.g:769:2: 'NameSpace'
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_4__1"
    // InternalComponentInterface.g:778:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:782:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:783:2: rule__ComponentInterface__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__1"


    // $ANTLR start "rule__ComponentInterface__Group_4__1__Impl"
    // InternalComponentInterface.g:789:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:793:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:794:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:794:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            // InternalComponentInterface.g:795:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 
            // InternalComponentInterface.g:796:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            // InternalComponentInterface.g:796:3: rule__ComponentInterface__NameSpaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__NameSpaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_4__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__0"
    // InternalComponentInterface.g:805:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:809:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:810:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__0"


    // $ANTLR start "rule__ComponentInterface__Group_5__0__Impl"
    // InternalComponentInterface.g:817:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:821:1: ( ( 'RosPublishers' ) )
            // InternalComponentInterface.g:822:1: ( 'RosPublishers' )
            {
            // InternalComponentInterface.g:822:1: ( 'RosPublishers' )
            // InternalComponentInterface.g:823:2: 'RosPublishers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosPublishersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__1"
    // InternalComponentInterface.g:832:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:836:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalComponentInterface.g:837:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__1"


    // $ANTLR start "rule__ComponentInterface__Group_5__1__Impl"
    // InternalComponentInterface.g:844:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:848:1: ( ( '{' ) )
            // InternalComponentInterface.g:849:1: ( '{' )
            {
            // InternalComponentInterface.g:849:1: ( '{' )
            // InternalComponentInterface.g:850:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__2"
    // InternalComponentInterface.g:859:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:863:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalComponentInterface.g:864:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__2"


    // $ANTLR start "rule__ComponentInterface__Group_5__2__Impl"
    // InternalComponentInterface.g:871:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:875:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) )
            // InternalComponentInterface.g:876:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            {
            // InternalComponentInterface.g:876:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            // InternalComponentInterface.g:877:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_2()); 
            // InternalComponentInterface.g:878:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            // InternalComponentInterface.g:878:3: rule__ComponentInterface__RospublisherAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__3"
    // InternalComponentInterface.g:886:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:890:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalComponentInterface.g:891:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__3"


    // $ANTLR start "rule__ComponentInterface__Group_5__3__Impl"
    // InternalComponentInterface.g:898:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:902:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalComponentInterface.g:903:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalComponentInterface.g:903:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalComponentInterface.g:904:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalComponentInterface.g:905:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:905:3: rule__ComponentInterface__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5__4"
    // InternalComponentInterface.g:913:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:917:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalComponentInterface.g:918:2: rule__ComponentInterface__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__4"


    // $ANTLR start "rule__ComponentInterface__Group_5__4__Impl"
    // InternalComponentInterface.g:924:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:928:1: ( ( '}' ) )
            // InternalComponentInterface.g:929:1: ( '}' )
            {
            // InternalComponentInterface.g:929:1: ( '}' )
            // InternalComponentInterface.g:930:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__0"
    // InternalComponentInterface.g:940:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:944:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalComponentInterface.g:945:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ComponentInterface__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__0__Impl"
    // InternalComponentInterface.g:952:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:956:1: ( ( ',' ) )
            // InternalComponentInterface.g:957:1: ( ',' )
            {
            // InternalComponentInterface.g:957:1: ( ',' )
            // InternalComponentInterface.g:958:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__1"
    // InternalComponentInterface.g:967:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:971:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalComponentInterface.g:972:2: rule__ComponentInterface__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_5_3__1__Impl"
    // InternalComponentInterface.g:978:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:982:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) )
            // InternalComponentInterface.g:983:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            {
            // InternalComponentInterface.g:983:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            // InternalComponentInterface.g:984:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_3_1()); 
            // InternalComponentInterface.g:985:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            // InternalComponentInterface.g:985:3: rule__ComponentInterface__RospublisherAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RospublisherAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_5_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__0"
    // InternalComponentInterface.g:994:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:998:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:999:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__0"


    // $ANTLR start "rule__ComponentInterface__Group_6__0__Impl"
    // InternalComponentInterface.g:1006:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1010:1: ( ( 'RosSubscribers' ) )
            // InternalComponentInterface.g:1011:1: ( 'RosSubscribers' )
            {
            // InternalComponentInterface.g:1011:1: ( 'RosSubscribers' )
            // InternalComponentInterface.g:1012:2: 'RosSubscribers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSubscribersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__1"
    // InternalComponentInterface.g:1021:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1025:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalComponentInterface.g:1026:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInterface__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__1"


    // $ANTLR start "rule__ComponentInterface__Group_6__1__Impl"
    // InternalComponentInterface.g:1033:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1037:1: ( ( '{' ) )
            // InternalComponentInterface.g:1038:1: ( '{' )
            {
            // InternalComponentInterface.g:1038:1: ( '{' )
            // InternalComponentInterface.g:1039:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__2"
    // InternalComponentInterface.g:1048:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1052:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalComponentInterface.g:1053:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__2"


    // $ANTLR start "rule__ComponentInterface__Group_6__2__Impl"
    // InternalComponentInterface.g:1060:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1064:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) )
            // InternalComponentInterface.g:1065:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            {
            // InternalComponentInterface.g:1065:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            // InternalComponentInterface.g:1066:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_2()); 
            // InternalComponentInterface.g:1067:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            // InternalComponentInterface.g:1067:3: rule__ComponentInterface__RossubscriberAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__3"
    // InternalComponentInterface.g:1075:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1079:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalComponentInterface.g:1080:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__3"


    // $ANTLR start "rule__ComponentInterface__Group_6__3__Impl"
    // InternalComponentInterface.g:1087:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1091:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalComponentInterface.g:1092:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalComponentInterface.g:1092:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalComponentInterface.g:1093:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalComponentInterface.g:1094:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentInterface.g:1094:3: rule__ComponentInterface__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6__4"
    // InternalComponentInterface.g:1102:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1106:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalComponentInterface.g:1107:2: rule__ComponentInterface__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__4"


    // $ANTLR start "rule__ComponentInterface__Group_6__4__Impl"
    // InternalComponentInterface.g:1113:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1117:1: ( ( '}' ) )
            // InternalComponentInterface.g:1118:1: ( '}' )
            {
            // InternalComponentInterface.g:1118:1: ( '}' )
            // InternalComponentInterface.g:1119:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__0"
    // InternalComponentInterface.g:1129:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1133:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalComponentInterface.g:1134:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInterface__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__0__Impl"
    // InternalComponentInterface.g:1141:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1145:1: ( ( ',' ) )
            // InternalComponentInterface.g:1146:1: ( ',' )
            {
            // InternalComponentInterface.g:1146:1: ( ',' )
            // InternalComponentInterface.g:1147:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__1"
    // InternalComponentInterface.g:1156:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1160:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalComponentInterface.g:1161:2: rule__ComponentInterface__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_6_3__1__Impl"
    // InternalComponentInterface.g:1167:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1171:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) )
            // InternalComponentInterface.g:1172:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            {
            // InternalComponentInterface.g:1172:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            // InternalComponentInterface.g:1173:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_3_1()); 
            // InternalComponentInterface.g:1174:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            // InternalComponentInterface.g:1174:3: rule__ComponentInterface__RossubscriberAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RossubscriberAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_6_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__0"
    // InternalComponentInterface.g:1183:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1187:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:1188:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__0"


    // $ANTLR start "rule__ComponentInterface__Group_7__0__Impl"
    // InternalComponentInterface.g:1195:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1199:1: ( ( 'RosSrvServers' ) )
            // InternalComponentInterface.g:1200:1: ( 'RosSrvServers' )
            {
            // InternalComponentInterface.g:1200:1: ( 'RosSrvServers' )
            // InternalComponentInterface.g:1201:2: 'RosSrvServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvServersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__1"
    // InternalComponentInterface.g:1210:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1214:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalComponentInterface.g:1215:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__1"


    // $ANTLR start "rule__ComponentInterface__Group_7__1__Impl"
    // InternalComponentInterface.g:1222:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1226:1: ( ( '{' ) )
            // InternalComponentInterface.g:1227:1: ( '{' )
            {
            // InternalComponentInterface.g:1227:1: ( '{' )
            // InternalComponentInterface.g:1228:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__2"
    // InternalComponentInterface.g:1237:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1241:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalComponentInterface.g:1242:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__2"


    // $ANTLR start "rule__ComponentInterface__Group_7__2__Impl"
    // InternalComponentInterface.g:1249:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1253:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) )
            // InternalComponentInterface.g:1254:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            {
            // InternalComponentInterface.g:1254:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            // InternalComponentInterface.g:1255:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_2()); 
            // InternalComponentInterface.g:1256:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            // InternalComponentInterface.g:1256:3: rule__ComponentInterface__RosserviceserverAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__3"
    // InternalComponentInterface.g:1264:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1268:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalComponentInterface.g:1269:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__3"


    // $ANTLR start "rule__ComponentInterface__Group_7__3__Impl"
    // InternalComponentInterface.g:1276:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1280:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalComponentInterface.g:1281:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalComponentInterface.g:1281:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalComponentInterface.g:1282:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalComponentInterface.g:1283:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentInterface.g:1283:3: rule__ComponentInterface__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7__4"
    // InternalComponentInterface.g:1291:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1295:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalComponentInterface.g:1296:2: rule__ComponentInterface__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__4"


    // $ANTLR start "rule__ComponentInterface__Group_7__4__Impl"
    // InternalComponentInterface.g:1302:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1306:1: ( ( '}' ) )
            // InternalComponentInterface.g:1307:1: ( '}' )
            {
            // InternalComponentInterface.g:1307:1: ( '}' )
            // InternalComponentInterface.g:1308:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__0"
    // InternalComponentInterface.g:1318:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1322:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalComponentInterface.g:1323:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentInterface__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__0__Impl"
    // InternalComponentInterface.g:1330:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1334:1: ( ( ',' ) )
            // InternalComponentInterface.g:1335:1: ( ',' )
            {
            // InternalComponentInterface.g:1335:1: ( ',' )
            // InternalComponentInterface.g:1336:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__1"
    // InternalComponentInterface.g:1345:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1349:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalComponentInterface.g:1350:2: rule__ComponentInterface__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_7_3__1__Impl"
    // InternalComponentInterface.g:1356:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1360:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) )
            // InternalComponentInterface.g:1361:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            {
            // InternalComponentInterface.g:1361:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            // InternalComponentInterface.g:1362:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_3_1()); 
            // InternalComponentInterface.g:1363:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            // InternalComponentInterface.g:1363:3: rule__ComponentInterface__RosserviceserverAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceserverAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_7_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__0"
    // InternalComponentInterface.g:1372:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1376:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalComponentInterface.g:1377:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__0"


    // $ANTLR start "rule__ComponentInterface__Group_8__0__Impl"
    // InternalComponentInterface.g:1384:1: rule__ComponentInterface__Group_8__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1388:1: ( ( 'RosSrvClients' ) )
            // InternalComponentInterface.g:1389:1: ( 'RosSrvClients' )
            {
            // InternalComponentInterface.g:1389:1: ( 'RosSrvClients' )
            // InternalComponentInterface.g:1390:2: 'RosSrvClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosSrvClientsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__1"
    // InternalComponentInterface.g:1399:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1403:1: ( rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 )
            // InternalComponentInterface.g:1404:2: rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__ComponentInterface__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__1"


    // $ANTLR start "rule__ComponentInterface__Group_8__1__Impl"
    // InternalComponentInterface.g:1411:1: rule__ComponentInterface__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1415:1: ( ( '{' ) )
            // InternalComponentInterface.g:1416:1: ( '{' )
            {
            // InternalComponentInterface.g:1416:1: ( '{' )
            // InternalComponentInterface.g:1417:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__2"
    // InternalComponentInterface.g:1426:1: rule__ComponentInterface__Group_8__2 : rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 ;
    public final void rule__ComponentInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1430:1: ( rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 )
            // InternalComponentInterface.g:1431:2: rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__2"


    // $ANTLR start "rule__ComponentInterface__Group_8__2__Impl"
    // InternalComponentInterface.g:1438:1: rule__ComponentInterface__Group_8__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) ;
    public final void rule__ComponentInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1442:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) )
            // InternalComponentInterface.g:1443:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            {
            // InternalComponentInterface.g:1443:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            // InternalComponentInterface.g:1444:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_2()); 
            // InternalComponentInterface.g:1445:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            // InternalComponentInterface.g:1445:3: rule__ComponentInterface__RosserviceclientAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__3"
    // InternalComponentInterface.g:1453:1: rule__ComponentInterface__Group_8__3 : rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 ;
    public final void rule__ComponentInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1457:1: ( rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 )
            // InternalComponentInterface.g:1458:2: rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__3"


    // $ANTLR start "rule__ComponentInterface__Group_8__3__Impl"
    // InternalComponentInterface.g:1465:1: rule__ComponentInterface__Group_8__3__Impl : ( ( rule__ComponentInterface__Group_8_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1469:1: ( ( ( rule__ComponentInterface__Group_8_3__0 )* ) )
            // InternalComponentInterface.g:1470:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            {
            // InternalComponentInterface.g:1470:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            // InternalComponentInterface.g:1471:2: ( rule__ComponentInterface__Group_8_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 
            // InternalComponentInterface.g:1472:2: ( rule__ComponentInterface__Group_8_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentInterface.g:1472:3: rule__ComponentInterface__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8__4"
    // InternalComponentInterface.g:1480:1: rule__ComponentInterface__Group_8__4 : rule__ComponentInterface__Group_8__4__Impl ;
    public final void rule__ComponentInterface__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1484:1: ( rule__ComponentInterface__Group_8__4__Impl )
            // InternalComponentInterface.g:1485:2: rule__ComponentInterface__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__4"


    // $ANTLR start "rule__ComponentInterface__Group_8__4__Impl"
    // InternalComponentInterface.g:1491:1: rule__ComponentInterface__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1495:1: ( ( '}' ) )
            // InternalComponentInterface.g:1496:1: ( '}' )
            {
            // InternalComponentInterface.g:1496:1: ( '}' )
            // InternalComponentInterface.g:1497:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__0"
    // InternalComponentInterface.g:1507:1: rule__ComponentInterface__Group_8_3__0 : rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 ;
    public final void rule__ComponentInterface__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1511:1: ( rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 )
            // InternalComponentInterface.g:1512:2: rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ComponentInterface__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__0__Impl"
    // InternalComponentInterface.g:1519:1: rule__ComponentInterface__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1523:1: ( ( ',' ) )
            // InternalComponentInterface.g:1524:1: ( ',' )
            {
            // InternalComponentInterface.g:1524:1: ( ',' )
            // InternalComponentInterface.g:1525:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__1"
    // InternalComponentInterface.g:1534:1: rule__ComponentInterface__Group_8_3__1 : rule__ComponentInterface__Group_8_3__1__Impl ;
    public final void rule__ComponentInterface__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1538:1: ( rule__ComponentInterface__Group_8_3__1__Impl )
            // InternalComponentInterface.g:1539:2: rule__ComponentInterface__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_8_3__1__Impl"
    // InternalComponentInterface.g:1545:1: rule__ComponentInterface__Group_8_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1549:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) )
            // InternalComponentInterface.g:1550:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            {
            // InternalComponentInterface.g:1550:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            // InternalComponentInterface.g:1551:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_3_1()); 
            // InternalComponentInterface.g:1552:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            // InternalComponentInterface.g:1552:3: rule__ComponentInterface__RosserviceclientAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosserviceclientAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_8_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__0"
    // InternalComponentInterface.g:1561:1: rule__ComponentInterface__Group_9__0 : rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 ;
    public final void rule__ComponentInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1565:1: ( rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 )
            // InternalComponentInterface.g:1566:2: rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__0"


    // $ANTLR start "rule__ComponentInterface__Group_9__0__Impl"
    // InternalComponentInterface.g:1573:1: rule__ComponentInterface__Group_9__0__Impl : ( 'RosActionServers' ) ;
    public final void rule__ComponentInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1577:1: ( ( 'RosActionServers' ) )
            // InternalComponentInterface.g:1578:1: ( 'RosActionServers' )
            {
            // InternalComponentInterface.g:1578:1: ( 'RosActionServers' )
            // InternalComponentInterface.g:1579:2: 'RosActionServers'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosActionServersKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__1"
    // InternalComponentInterface.g:1588:1: rule__ComponentInterface__Group_9__1 : rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 ;
    public final void rule__ComponentInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1592:1: ( rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 )
            // InternalComponentInterface.g:1593:2: rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInterface__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__1"


    // $ANTLR start "rule__ComponentInterface__Group_9__1__Impl"
    // InternalComponentInterface.g:1600:1: rule__ComponentInterface__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1604:1: ( ( '{' ) )
            // InternalComponentInterface.g:1605:1: ( '{' )
            {
            // InternalComponentInterface.g:1605:1: ( '{' )
            // InternalComponentInterface.g:1606:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__2"
    // InternalComponentInterface.g:1615:1: rule__ComponentInterface__Group_9__2 : rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 ;
    public final void rule__ComponentInterface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1619:1: ( rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 )
            // InternalComponentInterface.g:1620:2: rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__2"


    // $ANTLR start "rule__ComponentInterface__Group_9__2__Impl"
    // InternalComponentInterface.g:1627:1: rule__ComponentInterface__Group_9__2__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) ;
    public final void rule__ComponentInterface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1631:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) )
            // InternalComponentInterface.g:1632:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            {
            // InternalComponentInterface.g:1632:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            // InternalComponentInterface.g:1633:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_2()); 
            // InternalComponentInterface.g:1634:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            // InternalComponentInterface.g:1634:3: rule__ComponentInterface__RosactionserverAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionserverAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__3"
    // InternalComponentInterface.g:1642:1: rule__ComponentInterface__Group_9__3 : rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 ;
    public final void rule__ComponentInterface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1646:1: ( rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 )
            // InternalComponentInterface.g:1647:2: rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__3"


    // $ANTLR start "rule__ComponentInterface__Group_9__3__Impl"
    // InternalComponentInterface.g:1654:1: rule__ComponentInterface__Group_9__3__Impl : ( ( rule__ComponentInterface__Group_9_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1658:1: ( ( ( rule__ComponentInterface__Group_9_3__0 )* ) )
            // InternalComponentInterface.g:1659:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            {
            // InternalComponentInterface.g:1659:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            // InternalComponentInterface.g:1660:2: ( rule__ComponentInterface__Group_9_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9_3()); 
            // InternalComponentInterface.g:1661:2: ( rule__ComponentInterface__Group_9_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentInterface.g:1661:3: rule__ComponentInterface__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9__4"
    // InternalComponentInterface.g:1669:1: rule__ComponentInterface__Group_9__4 : rule__ComponentInterface__Group_9__4__Impl ;
    public final void rule__ComponentInterface__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1673:1: ( rule__ComponentInterface__Group_9__4__Impl )
            // InternalComponentInterface.g:1674:2: rule__ComponentInterface__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__4"


    // $ANTLR start "rule__ComponentInterface__Group_9__4__Impl"
    // InternalComponentInterface.g:1680:1: rule__ComponentInterface__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1684:1: ( ( '}' ) )
            // InternalComponentInterface.g:1685:1: ( '}' )
            {
            // InternalComponentInterface.g:1685:1: ( '}' )
            // InternalComponentInterface.g:1686:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__0"
    // InternalComponentInterface.g:1696:1: rule__ComponentInterface__Group_9_3__0 : rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 ;
    public final void rule__ComponentInterface__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1700:1: ( rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 )
            // InternalComponentInterface.g:1701:2: rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInterface__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__0__Impl"
    // InternalComponentInterface.g:1708:1: rule__ComponentInterface__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1712:1: ( ( ',' ) )
            // InternalComponentInterface.g:1713:1: ( ',' )
            {
            // InternalComponentInterface.g:1713:1: ( ',' )
            // InternalComponentInterface.g:1714:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__1"
    // InternalComponentInterface.g:1723:1: rule__ComponentInterface__Group_9_3__1 : rule__ComponentInterface__Group_9_3__1__Impl ;
    public final void rule__ComponentInterface__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1727:1: ( rule__ComponentInterface__Group_9_3__1__Impl )
            // InternalComponentInterface.g:1728:2: rule__ComponentInterface__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_9_3__1__Impl"
    // InternalComponentInterface.g:1734:1: rule__ComponentInterface__Group_9_3__1__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1738:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) )
            // InternalComponentInterface.g:1739:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            {
            // InternalComponentInterface.g:1739:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            // InternalComponentInterface.g:1740:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_3_1()); 
            // InternalComponentInterface.g:1741:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            // InternalComponentInterface.g:1741:3: rule__ComponentInterface__RosactionserverAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionserverAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_9_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__0"
    // InternalComponentInterface.g:1750:1: rule__ComponentInterface__Group_10__0 : rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 ;
    public final void rule__ComponentInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1754:1: ( rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 )
            // InternalComponentInterface.g:1755:2: rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__0"


    // $ANTLR start "rule__ComponentInterface__Group_10__0__Impl"
    // InternalComponentInterface.g:1762:1: rule__ComponentInterface__Group_10__0__Impl : ( 'RosActionClients' ) ;
    public final void rule__ComponentInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1766:1: ( ( 'RosActionClients' ) )
            // InternalComponentInterface.g:1767:1: ( 'RosActionClients' )
            {
            // InternalComponentInterface.g:1767:1: ( 'RosActionClients' )
            // InternalComponentInterface.g:1768:2: 'RosActionClients'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosActionClientsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__1"
    // InternalComponentInterface.g:1777:1: rule__ComponentInterface__Group_10__1 : rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 ;
    public final void rule__ComponentInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1781:1: ( rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 )
            // InternalComponentInterface.g:1782:2: rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInterface__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__1"


    // $ANTLR start "rule__ComponentInterface__Group_10__1__Impl"
    // InternalComponentInterface.g:1789:1: rule__ComponentInterface__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1793:1: ( ( '{' ) )
            // InternalComponentInterface.g:1794:1: ( '{' )
            {
            // InternalComponentInterface.g:1794:1: ( '{' )
            // InternalComponentInterface.g:1795:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__2"
    // InternalComponentInterface.g:1804:1: rule__ComponentInterface__Group_10__2 : rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 ;
    public final void rule__ComponentInterface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1808:1: ( rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 )
            // InternalComponentInterface.g:1809:2: rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__2"


    // $ANTLR start "rule__ComponentInterface__Group_10__2__Impl"
    // InternalComponentInterface.g:1816:1: rule__ComponentInterface__Group_10__2__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) ;
    public final void rule__ComponentInterface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1820:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) )
            // InternalComponentInterface.g:1821:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            {
            // InternalComponentInterface.g:1821:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            // InternalComponentInterface.g:1822:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_2()); 
            // InternalComponentInterface.g:1823:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            // InternalComponentInterface.g:1823:3: rule__ComponentInterface__RosactionclientAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionclientAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__3"
    // InternalComponentInterface.g:1831:1: rule__ComponentInterface__Group_10__3 : rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 ;
    public final void rule__ComponentInterface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1835:1: ( rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 )
            // InternalComponentInterface.g:1836:2: rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__3"


    // $ANTLR start "rule__ComponentInterface__Group_10__3__Impl"
    // InternalComponentInterface.g:1843:1: rule__ComponentInterface__Group_10__3__Impl : ( ( rule__ComponentInterface__Group_10_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1847:1: ( ( ( rule__ComponentInterface__Group_10_3__0 )* ) )
            // InternalComponentInterface.g:1848:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            {
            // InternalComponentInterface.g:1848:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            // InternalComponentInterface.g:1849:2: ( rule__ComponentInterface__Group_10_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10_3()); 
            // InternalComponentInterface.g:1850:2: ( rule__ComponentInterface__Group_10_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComponentInterface.g:1850:3: rule__ComponentInterface__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10__4"
    // InternalComponentInterface.g:1858:1: rule__ComponentInterface__Group_10__4 : rule__ComponentInterface__Group_10__4__Impl ;
    public final void rule__ComponentInterface__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1862:1: ( rule__ComponentInterface__Group_10__4__Impl )
            // InternalComponentInterface.g:1863:2: rule__ComponentInterface__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__4"


    // $ANTLR start "rule__ComponentInterface__Group_10__4__Impl"
    // InternalComponentInterface.g:1869:1: rule__ComponentInterface__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1873:1: ( ( '}' ) )
            // InternalComponentInterface.g:1874:1: ( '}' )
            {
            // InternalComponentInterface.g:1874:1: ( '}' )
            // InternalComponentInterface.g:1875:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__0"
    // InternalComponentInterface.g:1885:1: rule__ComponentInterface__Group_10_3__0 : rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 ;
    public final void rule__ComponentInterface__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1889:1: ( rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 )
            // InternalComponentInterface.g:1890:2: rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInterface__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__0__Impl"
    // InternalComponentInterface.g:1897:1: rule__ComponentInterface__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1901:1: ( ( ',' ) )
            // InternalComponentInterface.g:1902:1: ( ',' )
            {
            // InternalComponentInterface.g:1902:1: ( ',' )
            // InternalComponentInterface.g:1903:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__1"
    // InternalComponentInterface.g:1912:1: rule__ComponentInterface__Group_10_3__1 : rule__ComponentInterface__Group_10_3__1__Impl ;
    public final void rule__ComponentInterface__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1916:1: ( rule__ComponentInterface__Group_10_3__1__Impl )
            // InternalComponentInterface.g:1917:2: rule__ComponentInterface__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_10_3__1__Impl"
    // InternalComponentInterface.g:1923:1: rule__ComponentInterface__Group_10_3__1__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1927:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) )
            // InternalComponentInterface.g:1928:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            {
            // InternalComponentInterface.g:1928:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            // InternalComponentInterface.g:1929:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_3_1()); 
            // InternalComponentInterface.g:1930:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            // InternalComponentInterface.g:1930:3: rule__ComponentInterface__RosactionclientAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosactionclientAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_10_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11__0"
    // InternalComponentInterface.g:1939:1: rule__ComponentInterface__Group_11__0 : rule__ComponentInterface__Group_11__0__Impl rule__ComponentInterface__Group_11__1 ;
    public final void rule__ComponentInterface__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1943:1: ( rule__ComponentInterface__Group_11__0__Impl rule__ComponentInterface__Group_11__1 )
            // InternalComponentInterface.g:1944:2: rule__ComponentInterface__Group_11__0__Impl rule__ComponentInterface__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentInterface__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__0"


    // $ANTLR start "rule__ComponentInterface__Group_11__0__Impl"
    // InternalComponentInterface.g:1951:1: rule__ComponentInterface__Group_11__0__Impl : ( 'RosParameters' ) ;
    public final void rule__ComponentInterface__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1955:1: ( ( 'RosParameters' ) )
            // InternalComponentInterface.g:1956:1: ( 'RosParameters' )
            {
            // InternalComponentInterface.g:1956:1: ( 'RosParameters' )
            // InternalComponentInterface.g:1957:2: 'RosParameters'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_11_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRosParametersKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11__1"
    // InternalComponentInterface.g:1966:1: rule__ComponentInterface__Group_11__1 : rule__ComponentInterface__Group_11__1__Impl rule__ComponentInterface__Group_11__2 ;
    public final void rule__ComponentInterface__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1970:1: ( rule__ComponentInterface__Group_11__1__Impl rule__ComponentInterface__Group_11__2 )
            // InternalComponentInterface.g:1971:2: rule__ComponentInterface__Group_11__1__Impl rule__ComponentInterface__Group_11__2
            {
            pushFollow(FOLLOW_15);
            rule__ComponentInterface__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__1"


    // $ANTLR start "rule__ComponentInterface__Group_11__1__Impl"
    // InternalComponentInterface.g:1978:1: rule__ComponentInterface__Group_11__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1982:1: ( ( '{' ) )
            // InternalComponentInterface.g:1983:1: ( '{' )
            {
            // InternalComponentInterface.g:1983:1: ( '{' )
            // InternalComponentInterface.g:1984:2: '{'
            {
             before(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__1__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11__2"
    // InternalComponentInterface.g:1993:1: rule__ComponentInterface__Group_11__2 : rule__ComponentInterface__Group_11__2__Impl rule__ComponentInterface__Group_11__3 ;
    public final void rule__ComponentInterface__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1997:1: ( rule__ComponentInterface__Group_11__2__Impl rule__ComponentInterface__Group_11__3 )
            // InternalComponentInterface.g:1998:2: rule__ComponentInterface__Group_11__2__Impl rule__ComponentInterface__Group_11__3
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__2"


    // $ANTLR start "rule__ComponentInterface__Group_11__2__Impl"
    // InternalComponentInterface.g:2005:1: rule__ComponentInterface__Group_11__2__Impl : ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) ) ;
    public final void rule__ComponentInterface__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2009:1: ( ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) ) )
            // InternalComponentInterface.g:2010:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) )
            {
            // InternalComponentInterface.g:2010:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) )
            // InternalComponentInterface.g:2011:2: ( rule__ComponentInterface__RosparameterAssignment_11_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_11_2()); 
            // InternalComponentInterface.g:2012:2: ( rule__ComponentInterface__RosparameterAssignment_11_2 )
            // InternalComponentInterface.g:2012:3: rule__ComponentInterface__RosparameterAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosparameterAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__2__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11__3"
    // InternalComponentInterface.g:2020:1: rule__ComponentInterface__Group_11__3 : rule__ComponentInterface__Group_11__3__Impl rule__ComponentInterface__Group_11__4 ;
    public final void rule__ComponentInterface__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2024:1: ( rule__ComponentInterface__Group_11__3__Impl rule__ComponentInterface__Group_11__4 )
            // InternalComponentInterface.g:2025:2: rule__ComponentInterface__Group_11__3__Impl rule__ComponentInterface__Group_11__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentInterface__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__3"


    // $ANTLR start "rule__ComponentInterface__Group_11__3__Impl"
    // InternalComponentInterface.g:2032:1: rule__ComponentInterface__Group_11__3__Impl : ( ( rule__ComponentInterface__Group_11_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2036:1: ( ( ( rule__ComponentInterface__Group_11_3__0 )* ) )
            // InternalComponentInterface.g:2037:1: ( ( rule__ComponentInterface__Group_11_3__0 )* )
            {
            // InternalComponentInterface.g:2037:1: ( ( rule__ComponentInterface__Group_11_3__0 )* )
            // InternalComponentInterface.g:2038:2: ( rule__ComponentInterface__Group_11_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_11_3()); 
            // InternalComponentInterface.g:2039:2: ( rule__ComponentInterface__Group_11_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentInterface.g:2039:3: rule__ComponentInterface__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentInterface__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getComponentInterfaceAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__3__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11__4"
    // InternalComponentInterface.g:2047:1: rule__ComponentInterface__Group_11__4 : rule__ComponentInterface__Group_11__4__Impl ;
    public final void rule__ComponentInterface__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2051:1: ( rule__ComponentInterface__Group_11__4__Impl )
            // InternalComponentInterface.g:2052:2: rule__ComponentInterface__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__4"


    // $ANTLR start "rule__ComponentInterface__Group_11__4__Impl"
    // InternalComponentInterface.g:2058:1: rule__ComponentInterface__Group_11__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2062:1: ( ( '}' ) )
            // InternalComponentInterface.g:2063:1: ( '}' )
            {
            // InternalComponentInterface.g:2063:1: ( '}' )
            // InternalComponentInterface.g:2064:2: '}'
            {
             before(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11__4__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11_3__0"
    // InternalComponentInterface.g:2074:1: rule__ComponentInterface__Group_11_3__0 : rule__ComponentInterface__Group_11_3__0__Impl rule__ComponentInterface__Group_11_3__1 ;
    public final void rule__ComponentInterface__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2078:1: ( rule__ComponentInterface__Group_11_3__0__Impl rule__ComponentInterface__Group_11_3__1 )
            // InternalComponentInterface.g:2079:2: rule__ComponentInterface__Group_11_3__0__Impl rule__ComponentInterface__Group_11_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ComponentInterface__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11_3__0"


    // $ANTLR start "rule__ComponentInterface__Group_11_3__0__Impl"
    // InternalComponentInterface.g:2086:1: rule__ComponentInterface__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2090:1: ( ( ',' ) )
            // InternalComponentInterface.g:2091:1: ( ',' )
            {
            // InternalComponentInterface.g:2091:1: ( ',' )
            // InternalComponentInterface.g:2092:2: ','
            {
             before(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_11_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentInterfaceAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11_3__0__Impl"


    // $ANTLR start "rule__ComponentInterface__Group_11_3__1"
    // InternalComponentInterface.g:2101:1: rule__ComponentInterface__Group_11_3__1 : rule__ComponentInterface__Group_11_3__1__Impl ;
    public final void rule__ComponentInterface__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2105:1: ( rule__ComponentInterface__Group_11_3__1__Impl )
            // InternalComponentInterface.g:2106:2: rule__ComponentInterface__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11_3__1"


    // $ANTLR start "rule__ComponentInterface__Group_11_3__1__Impl"
    // InternalComponentInterface.g:2112:1: rule__ComponentInterface__Group_11_3__1__Impl : ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2116:1: ( ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) ) )
            // InternalComponentInterface.g:2117:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) )
            {
            // InternalComponentInterface.g:2117:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) )
            // InternalComponentInterface.g:2118:2: ( rule__ComponentInterface__RosparameterAssignment_11_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_11_3_1()); 
            // InternalComponentInterface.g:2119:2: ( rule__ComponentInterface__RosparameterAssignment_11_3_1 )
            // InternalComponentInterface.g:2119:3: rule__ComponentInterface__RosparameterAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInterface__RosparameterAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__Group_11_3__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__0"
    // InternalComponentInterface.g:2128:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2132:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalComponentInterface.g:2133:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosPublisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__0"


    // $ANTLR start "rule__RosPublisher__Group__0__Impl"
    // InternalComponentInterface.g:2140:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2144:1: ( ( () ) )
            // InternalComponentInterface.g:2145:1: ( () )
            {
            // InternalComponentInterface.g:2145:1: ( () )
            // InternalComponentInterface.g:2146:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:2147:2: ()
            // InternalComponentInterface.g:2147:3: 
            {
            }

             after(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group__1"
    // InternalComponentInterface.g:2155:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2159:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalComponentInterface.g:2160:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosPublisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__1"


    // $ANTLR start "rule__RosPublisher__Group__1__Impl"
    // InternalComponentInterface.g:2167:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2171:1: ( ( 'RosPublisher' ) )
            // InternalComponentInterface.g:2172:1: ( 'RosPublisher' )
            {
            // InternalComponentInterface.g:2172:1: ( 'RosPublisher' )
            // InternalComponentInterface.g:2173:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__2"
    // InternalComponentInterface.g:2182:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2186:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalComponentInterface.g:2187:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosPublisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__2"


    // $ANTLR start "rule__RosPublisher__Group__2__Impl"
    // InternalComponentInterface.g:2194:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2198:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2199:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2199:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalComponentInterface.g:2200:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2201:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2201:3: rule__RosPublisher__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosPublisher__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__2__Impl"


    // $ANTLR start "rule__RosPublisher__Group__3"
    // InternalComponentInterface.g:2209:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2213:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalComponentInterface.g:2214:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__RosPublisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__3"


    // $ANTLR start "rule__RosPublisher__Group__3__Impl"
    // InternalComponentInterface.g:2221:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2225:1: ( ( '{' ) )
            // InternalComponentInterface.g:2226:1: ( '{' )
            {
            // InternalComponentInterface.g:2226:1: ( '{' )
            // InternalComponentInterface.g:2227:2: '{'
            {
             before(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__3__Impl"


    // $ANTLR start "rule__RosPublisher__Group__4"
    // InternalComponentInterface.g:2236:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2240:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalComponentInterface.g:2241:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__RosPublisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__4"


    // $ANTLR start "rule__RosPublisher__Group__4__Impl"
    // InternalComponentInterface.g:2248:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2252:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:2253:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2253:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalComponentInterface.g:2254:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:2255:2: ( rule__RosPublisher__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2255:3: rule__RosPublisher__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosPublisher__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosPublisherAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__4__Impl"


    // $ANTLR start "rule__RosPublisher__Group__5"
    // InternalComponentInterface.g:2263:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2267:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalComponentInterface.g:2268:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosPublisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__5"


    // $ANTLR start "rule__RosPublisher__Group__5__Impl"
    // InternalComponentInterface.g:2275:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2279:1: ( ( 'RefPublisher' ) )
            // InternalComponentInterface.g:2280:1: ( 'RefPublisher' )
            {
            // InternalComponentInterface.g:2280:1: ( 'RefPublisher' )
            // InternalComponentInterface.g:2281:2: 'RefPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRefPublisherKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__5__Impl"


    // $ANTLR start "rule__RosPublisher__Group__6"
    // InternalComponentInterface.g:2290:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2294:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalComponentInterface.g:2295:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosPublisher__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__6"


    // $ANTLR start "rule__RosPublisher__Group__6__Impl"
    // InternalComponentInterface.g:2302:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2306:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalComponentInterface.g:2307:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalComponentInterface.g:2307:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalComponentInterface.g:2308:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalComponentInterface.g:2309:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalComponentInterface.g:2309:3: rule__RosPublisher__PublisherAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__PublisherAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__6__Impl"


    // $ANTLR start "rule__RosPublisher__Group__7"
    // InternalComponentInterface.g:2317:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2321:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalComponentInterface.g:2322:2: rule__RosPublisher__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__7"


    // $ANTLR start "rule__RosPublisher__Group__7__Impl"
    // InternalComponentInterface.g:2328:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2332:1: ( ( '}' ) )
            // InternalComponentInterface.g:2333:1: ( '}' )
            {
            // InternalComponentInterface.g:2333:1: ( '}' )
            // InternalComponentInterface.g:2334:2: '}'
            {
             before(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__7__Impl"


    // $ANTLR start "rule__RosPublisher__Group_4__0"
    // InternalComponentInterface.g:2344:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2348:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalComponentInterface.g:2349:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosPublisher__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_4__0"


    // $ANTLR start "rule__RosPublisher__Group_4__0__Impl"
    // InternalComponentInterface.g:2356:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2360:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2361:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2361:1: ( 'ns' )
            // InternalComponentInterface.g:2362:2: 'ns'
            {
             before(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_4__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group_4__1"
    // InternalComponentInterface.g:2371:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2375:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalComponentInterface.g:2376:2: rule__RosPublisher__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_4__1"


    // $ANTLR start "rule__RosPublisher__Group_4__1__Impl"
    // InternalComponentInterface.g:2382:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2386:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2387:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2387:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2388:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2389:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalComponentInterface.g:2389:3: rule__RosPublisher__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group_4__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__0"
    // InternalComponentInterface.g:2398:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2402:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalComponentInterface.g:2403:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSubscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__0"


    // $ANTLR start "rule__RosSubscriber__Group__0__Impl"
    // InternalComponentInterface.g:2410:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2414:1: ( ( () ) )
            // InternalComponentInterface.g:2415:1: ( () )
            {
            // InternalComponentInterface.g:2415:1: ( () )
            // InternalComponentInterface.g:2416:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:2417:2: ()
            // InternalComponentInterface.g:2417:3: 
            {
            }

             after(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__1"
    // InternalComponentInterface.g:2425:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2429:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalComponentInterface.g:2430:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosSubscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__1"


    // $ANTLR start "rule__RosSubscriber__Group__1__Impl"
    // InternalComponentInterface.g:2437:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2441:1: ( ( 'RosSubscriber' ) )
            // InternalComponentInterface.g:2442:1: ( 'RosSubscriber' )
            {
            // InternalComponentInterface.g:2442:1: ( 'RosSubscriber' )
            // InternalComponentInterface.g:2443:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__2"
    // InternalComponentInterface.g:2452:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2456:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalComponentInterface.g:2457:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosSubscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__2"


    // $ANTLR start "rule__RosSubscriber__Group__2__Impl"
    // InternalComponentInterface.g:2464:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2468:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2469:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2469:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalComponentInterface.g:2470:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2471:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2471:3: rule__RosSubscriber__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSubscriber__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__2__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__3"
    // InternalComponentInterface.g:2479:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2483:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalComponentInterface.g:2484:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__RosSubscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__3"


    // $ANTLR start "rule__RosSubscriber__Group__3__Impl"
    // InternalComponentInterface.g:2491:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2495:1: ( ( '{' ) )
            // InternalComponentInterface.g:2496:1: ( '{' )
            {
            // InternalComponentInterface.g:2496:1: ( '{' )
            // InternalComponentInterface.g:2497:2: '{'
            {
             before(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__3__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__4"
    // InternalComponentInterface.g:2506:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2510:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalComponentInterface.g:2511:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__RosSubscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__4"


    // $ANTLR start "rule__RosSubscriber__Group__4__Impl"
    // InternalComponentInterface.g:2518:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2522:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2523:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2523:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2524:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2525:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:2525:3: rule__RosSubscriber__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSubscriber__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSubscriberAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__4__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__5"
    // InternalComponentInterface.g:2533:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2537:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalComponentInterface.g:2538:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosSubscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__5"


    // $ANTLR start "rule__RosSubscriber__Group__5__Impl"
    // InternalComponentInterface.g:2545:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2549:1: ( ( 'RefSubscriber' ) )
            // InternalComponentInterface.g:2550:1: ( 'RefSubscriber' )
            {
            // InternalComponentInterface.g:2550:1: ( 'RefSubscriber' )
            // InternalComponentInterface.g:2551:2: 'RefSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRefSubscriberKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__5__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__6"
    // InternalComponentInterface.g:2560:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2564:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalComponentInterface.g:2565:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosSubscriber__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__6"


    // $ANTLR start "rule__RosSubscriber__Group__6__Impl"
    // InternalComponentInterface.g:2572:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2576:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalComponentInterface.g:2577:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalComponentInterface.g:2577:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalComponentInterface.g:2578:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalComponentInterface.g:2579:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalComponentInterface.g:2579:3: rule__RosSubscriber__SubscriberAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__SubscriberAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__6__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__7"
    // InternalComponentInterface.g:2587:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2591:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalComponentInterface.g:2592:2: rule__RosSubscriber__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__7"


    // $ANTLR start "rule__RosSubscriber__Group__7__Impl"
    // InternalComponentInterface.g:2598:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2602:1: ( ( '}' ) )
            // InternalComponentInterface.g:2603:1: ( '}' )
            {
            // InternalComponentInterface.g:2603:1: ( '}' )
            // InternalComponentInterface.g:2604:2: '}'
            {
             before(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__7__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_4__0"
    // InternalComponentInterface.g:2614:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2618:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalComponentInterface.g:2619:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosSubscriber__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_4__0"


    // $ANTLR start "rule__RosSubscriber__Group_4__0__Impl"
    // InternalComponentInterface.g:2626:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2630:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2631:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2631:1: ( 'ns' )
            // InternalComponentInterface.g:2632:2: 'ns'
            {
             before(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_4__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group_4__1"
    // InternalComponentInterface.g:2641:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2645:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:2646:2: rule__RosSubscriber__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_4__1"


    // $ANTLR start "rule__RosSubscriber__Group_4__1__Impl"
    // InternalComponentInterface.g:2652:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2656:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2657:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2657:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2658:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2659:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalComponentInterface.g:2659:3: rule__RosSubscriber__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group_4__1__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__0"
    // InternalComponentInterface.g:2668:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2672:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalComponentInterface.g:2673:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosServiceServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__0"


    // $ANTLR start "rule__RosServiceServer__Group__0__Impl"
    // InternalComponentInterface.g:2680:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2684:1: ( ( () ) )
            // InternalComponentInterface.g:2685:1: ( () )
            {
            // InternalComponentInterface.g:2685:1: ( () )
            // InternalComponentInterface.g:2686:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:2687:2: ()
            // InternalComponentInterface.g:2687:3: 
            {
            }

             after(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__0__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__1"
    // InternalComponentInterface.g:2695:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2699:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalComponentInterface.g:2700:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosServiceServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__1"


    // $ANTLR start "rule__RosServiceServer__Group__1__Impl"
    // InternalComponentInterface.g:2707:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2711:1: ( ( 'RosServiceServer' ) )
            // InternalComponentInterface.g:2712:1: ( 'RosServiceServer' )
            {
            // InternalComponentInterface.g:2712:1: ( 'RosServiceServer' )
            // InternalComponentInterface.g:2713:2: 'RosServiceServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRosServiceServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__1__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__2"
    // InternalComponentInterface.g:2722:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2726:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalComponentInterface.g:2727:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosServiceServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__2"


    // $ANTLR start "rule__RosServiceServer__Group__2__Impl"
    // InternalComponentInterface.g:2734:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2738:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2739:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2739:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:2740:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2741:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2741:3: rule__RosServiceServer__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceServer__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__2__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__3"
    // InternalComponentInterface.g:2749:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2753:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalComponentInterface.g:2754:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__RosServiceServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__3"


    // $ANTLR start "rule__RosServiceServer__Group__3__Impl"
    // InternalComponentInterface.g:2761:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2765:1: ( ( '{' ) )
            // InternalComponentInterface.g:2766:1: ( '{' )
            {
            // InternalComponentInterface.g:2766:1: ( '{' )
            // InternalComponentInterface.g:2767:2: '{'
            {
             before(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__3__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__4"
    // InternalComponentInterface.g:2776:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2780:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalComponentInterface.g:2781:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__RosServiceServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__4"


    // $ANTLR start "rule__RosServiceServer__Group__4__Impl"
    // InternalComponentInterface.g:2788:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2792:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2793:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2793:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2794:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2795:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:2795:3: rule__RosServiceServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__4__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__5"
    // InternalComponentInterface.g:2803:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2807:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalComponentInterface.g:2808:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__5"


    // $ANTLR start "rule__RosServiceServer__Group__5__Impl"
    // InternalComponentInterface.g:2815:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2819:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:2820:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:2820:1: ( 'RefServer' )
            // InternalComponentInterface.g:2821:2: 'RefServer'
            {
             before(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRefServerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__5__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__6"
    // InternalComponentInterface.g:2830:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2834:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalComponentInterface.g:2835:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosServiceServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__6"


    // $ANTLR start "rule__RosServiceServer__Group__6__Impl"
    // InternalComponentInterface.g:2842:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2846:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalComponentInterface.g:2847:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:2847:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalComponentInterface.g:2848:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalComponentInterface.g:2849:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalComponentInterface.g:2849:3: rule__RosServiceServer__SrvserverAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__SrvserverAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__6__Impl"


    // $ANTLR start "rule__RosServiceServer__Group__7"
    // InternalComponentInterface.g:2857:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2861:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalComponentInterface.g:2862:2: rule__RosServiceServer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__7"


    // $ANTLR start "rule__RosServiceServer__Group__7__Impl"
    // InternalComponentInterface.g:2868:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2872:1: ( ( '}' ) )
            // InternalComponentInterface.g:2873:1: ( '}' )
            {
            // InternalComponentInterface.g:2873:1: ( '}' )
            // InternalComponentInterface.g:2874:2: '}'
            {
             before(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group__7__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_4__0"
    // InternalComponentInterface.g:2884:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2888:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalComponentInterface.g:2889:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_4__0"


    // $ANTLR start "rule__RosServiceServer__Group_4__0__Impl"
    // InternalComponentInterface.g:2896:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2900:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2901:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2901:1: ( 'ns' )
            // InternalComponentInterface.g:2902:2: 'ns'
            {
             before(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_4__0__Impl"


    // $ANTLR start "rule__RosServiceServer__Group_4__1"
    // InternalComponentInterface.g:2911:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2915:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:2916:2: rule__RosServiceServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_4__1"


    // $ANTLR start "rule__RosServiceServer__Group_4__1__Impl"
    // InternalComponentInterface.g:2922:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2926:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2927:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2927:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2928:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2929:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:2929:3: rule__RosServiceServer__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServer__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__Group_4__1__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__0"
    // InternalComponentInterface.g:2938:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2942:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalComponentInterface.g:2943:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__RosServiceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__0"


    // $ANTLR start "rule__RosServiceClient__Group__0__Impl"
    // InternalComponentInterface.g:2950:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2954:1: ( ( () ) )
            // InternalComponentInterface.g:2955:1: ( () )
            {
            // InternalComponentInterface.g:2955:1: ( () )
            // InternalComponentInterface.g:2956:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:2957:2: ()
            // InternalComponentInterface.g:2957:3: 
            {
            }

             after(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__0__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__1"
    // InternalComponentInterface.g:2965:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2969:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalComponentInterface.g:2970:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosServiceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__1"


    // $ANTLR start "rule__RosServiceClient__Group__1__Impl"
    // InternalComponentInterface.g:2977:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2981:1: ( ( 'RosServiceClient' ) )
            // InternalComponentInterface.g:2982:1: ( 'RosServiceClient' )
            {
            // InternalComponentInterface.g:2982:1: ( 'RosServiceClient' )
            // InternalComponentInterface.g:2983:2: 'RosServiceClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRosServiceClientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__1__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__2"
    // InternalComponentInterface.g:2992:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2996:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalComponentInterface.g:2997:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosServiceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__2"


    // $ANTLR start "rule__RosServiceClient__Group__2__Impl"
    // InternalComponentInterface.g:3004:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3008:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3009:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3009:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3010:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3011:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:3011:3: rule__RosServiceClient__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceClient__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__2__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__3"
    // InternalComponentInterface.g:3019:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3023:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalComponentInterface.g:3024:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__RosServiceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__3"


    // $ANTLR start "rule__RosServiceClient__Group__3__Impl"
    // InternalComponentInterface.g:3031:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3035:1: ( ( '{' ) )
            // InternalComponentInterface.g:3036:1: ( '{' )
            {
            // InternalComponentInterface.g:3036:1: ( '{' )
            // InternalComponentInterface.g:3037:2: '{'
            {
             before(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__3__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__4"
    // InternalComponentInterface.g:3046:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3050:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalComponentInterface.g:3051:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RosServiceClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__4"


    // $ANTLR start "rule__RosServiceClient__Group__4__Impl"
    // InternalComponentInterface.g:3058:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3062:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3063:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3063:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:3064:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3065:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:3065:3: rule__RosServiceClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosServiceClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosServiceClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__4__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__5"
    // InternalComponentInterface.g:3073:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3077:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalComponentInterface.g:3078:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__5"


    // $ANTLR start "rule__RosServiceClient__Group__5__Impl"
    // InternalComponentInterface.g:3085:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3089:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3090:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3090:1: ( 'RefClient' )
            // InternalComponentInterface.g:3091:2: 'RefClient'
            {
             before(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRefClientKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__5__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__6"
    // InternalComponentInterface.g:3100:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3104:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalComponentInterface.g:3105:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosServiceClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__6"


    // $ANTLR start "rule__RosServiceClient__Group__6__Impl"
    // InternalComponentInterface.g:3112:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3116:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3117:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3117:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalComponentInterface.g:3118:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalComponentInterface.g:3119:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalComponentInterface.g:3119:3: rule__RosServiceClient__SrvclientAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__SrvclientAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__6__Impl"


    // $ANTLR start "rule__RosServiceClient__Group__7"
    // InternalComponentInterface.g:3127:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3131:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalComponentInterface.g:3132:2: rule__RosServiceClient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__7"


    // $ANTLR start "rule__RosServiceClient__Group__7__Impl"
    // InternalComponentInterface.g:3138:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3142:1: ( ( '}' ) )
            // InternalComponentInterface.g:3143:1: ( '}' )
            {
            // InternalComponentInterface.g:3143:1: ( '}' )
            // InternalComponentInterface.g:3144:2: '}'
            {
             before(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group__7__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_4__0"
    // InternalComponentInterface.g:3154:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3158:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalComponentInterface.g:3159:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosServiceClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_4__0"


    // $ANTLR start "rule__RosServiceClient__Group_4__0__Impl"
    // InternalComponentInterface.g:3166:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3170:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3171:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3171:1: ( 'ns' )
            // InternalComponentInterface.g:3172:2: 'ns'
            {
             before(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosServiceClientAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_4__0__Impl"


    // $ANTLR start "rule__RosServiceClient__Group_4__1"
    // InternalComponentInterface.g:3181:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3185:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3186:2: rule__RosServiceClient__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_4__1"


    // $ANTLR start "rule__RosServiceClient__Group_4__1__Impl"
    // InternalComponentInterface.g:3192:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3196:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3197:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3197:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3198:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3199:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3199:3: rule__RosServiceClient__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceClient__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__Group_4__1__Impl"


    // $ANTLR start "rule__RosActionServer__Group__0"
    // InternalComponentInterface.g:3208:1: rule__RosActionServer__Group__0 : rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 ;
    public final void rule__RosActionServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3212:1: ( rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 )
            // InternalComponentInterface.g:3213:2: rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RosActionServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__0"


    // $ANTLR start "rule__RosActionServer__Group__0__Impl"
    // InternalComponentInterface.g:3220:1: rule__RosActionServer__Group__0__Impl : ( () ) ;
    public final void rule__RosActionServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3224:1: ( ( () ) )
            // InternalComponentInterface.g:3225:1: ( () )
            {
            // InternalComponentInterface.g:3225:1: ( () )
            // InternalComponentInterface.g:3226:2: ()
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerAction_0()); 
            // InternalComponentInterface.g:3227:2: ()
            // InternalComponentInterface.g:3227:3: 
            {
            }

             after(grammarAccess.getRosActionServerAccess().getRosActionServerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__0__Impl"


    // $ANTLR start "rule__RosActionServer__Group__1"
    // InternalComponentInterface.g:3235:1: rule__RosActionServer__Group__1 : rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 ;
    public final void rule__RosActionServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3239:1: ( rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 )
            // InternalComponentInterface.g:3240:2: rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosActionServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__1"


    // $ANTLR start "rule__RosActionServer__Group__1__Impl"
    // InternalComponentInterface.g:3247:1: rule__RosActionServer__Group__1__Impl : ( 'RosActionServer' ) ;
    public final void rule__RosActionServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3251:1: ( ( 'RosActionServer' ) )
            // InternalComponentInterface.g:3252:1: ( 'RosActionServer' )
            {
            // InternalComponentInterface.g:3252:1: ( 'RosActionServer' )
            // InternalComponentInterface.g:3253:2: 'RosActionServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__1__Impl"


    // $ANTLR start "rule__RosActionServer__Group__2"
    // InternalComponentInterface.g:3262:1: rule__RosActionServer__Group__2 : rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 ;
    public final void rule__RosActionServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3266:1: ( rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 )
            // InternalComponentInterface.g:3267:2: rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosActionServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__2"


    // $ANTLR start "rule__RosActionServer__Group__2__Impl"
    // InternalComponentInterface.g:3274:1: rule__RosActionServer__Group__2__Impl : ( ( rule__RosActionServer__NameAssignment_2 )? ) ;
    public final void rule__RosActionServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3278:1: ( ( ( rule__RosActionServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3279:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3279:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:3280:2: ( rule__RosActionServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3281:2: ( rule__RosActionServer__NameAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:3281:3: rule__RosActionServer__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionServer__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionServerAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__2__Impl"


    // $ANTLR start "rule__RosActionServer__Group__3"
    // InternalComponentInterface.g:3289:1: rule__RosActionServer__Group__3 : rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 ;
    public final void rule__RosActionServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3293:1: ( rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 )
            // InternalComponentInterface.g:3294:2: rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__RosActionServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__3"


    // $ANTLR start "rule__RosActionServer__Group__3__Impl"
    // InternalComponentInterface.g:3301:1: rule__RosActionServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3305:1: ( ( '{' ) )
            // InternalComponentInterface.g:3306:1: ( '{' )
            {
            // InternalComponentInterface.g:3306:1: ( '{' )
            // InternalComponentInterface.g:3307:2: '{'
            {
             before(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__3__Impl"


    // $ANTLR start "rule__RosActionServer__Group__4"
    // InternalComponentInterface.g:3316:1: rule__RosActionServer__Group__4 : rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 ;
    public final void rule__RosActionServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3320:1: ( rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 )
            // InternalComponentInterface.g:3321:2: rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__RosActionServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__4"


    // $ANTLR start "rule__RosActionServer__Group__4__Impl"
    // InternalComponentInterface.g:3328:1: rule__RosActionServer__Group__4__Impl : ( ( rule__RosActionServer__Group_4__0 )? ) ;
    public final void rule__RosActionServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3332:1: ( ( ( rule__RosActionServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:3333:1: ( ( rule__RosActionServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3333:1: ( ( rule__RosActionServer__Group_4__0 )? )
            // InternalComponentInterface.g:3334:2: ( rule__RosActionServer__Group_4__0 )?
            {
             before(grammarAccess.getRosActionServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:3335:2: ( rule__RosActionServer__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:3335:3: rule__RosActionServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__4__Impl"


    // $ANTLR start "rule__RosActionServer__Group__5"
    // InternalComponentInterface.g:3343:1: rule__RosActionServer__Group__5 : rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 ;
    public final void rule__RosActionServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3347:1: ( rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 )
            // InternalComponentInterface.g:3348:2: rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosActionServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__5"


    // $ANTLR start "rule__RosActionServer__Group__5__Impl"
    // InternalComponentInterface.g:3355:1: rule__RosActionServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosActionServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3359:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:3360:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:3360:1: ( 'RefServer' )
            // InternalComponentInterface.g:3361:2: 'RefServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRefServerKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRefServerKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__5__Impl"


    // $ANTLR start "rule__RosActionServer__Group__6"
    // InternalComponentInterface.g:3370:1: rule__RosActionServer__Group__6 : rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 ;
    public final void rule__RosActionServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3374:1: ( rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 )
            // InternalComponentInterface.g:3375:2: rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosActionServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__6"


    // $ANTLR start "rule__RosActionServer__Group__6__Impl"
    // InternalComponentInterface.g:3382:1: rule__RosActionServer__Group__6__Impl : ( ( rule__RosActionServer__ActserverAssignment_6 ) ) ;
    public final void rule__RosActionServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3386:1: ( ( ( rule__RosActionServer__ActserverAssignment_6 ) ) )
            // InternalComponentInterface.g:3387:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:3387:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            // InternalComponentInterface.g:3388:2: ( rule__RosActionServer__ActserverAssignment_6 )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverAssignment_6()); 
            // InternalComponentInterface.g:3389:2: ( rule__RosActionServer__ActserverAssignment_6 )
            // InternalComponentInterface.g:3389:3: rule__RosActionServer__ActserverAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__ActserverAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getActserverAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__6__Impl"


    // $ANTLR start "rule__RosActionServer__Group__7"
    // InternalComponentInterface.g:3397:1: rule__RosActionServer__Group__7 : rule__RosActionServer__Group__7__Impl ;
    public final void rule__RosActionServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3401:1: ( rule__RosActionServer__Group__7__Impl )
            // InternalComponentInterface.g:3402:2: rule__RosActionServer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__7"


    // $ANTLR start "rule__RosActionServer__Group__7__Impl"
    // InternalComponentInterface.g:3408:1: rule__RosActionServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3412:1: ( ( '}' ) )
            // InternalComponentInterface.g:3413:1: ( '}' )
            {
            // InternalComponentInterface.g:3413:1: ( '}' )
            // InternalComponentInterface.g:3414:2: '}'
            {
             before(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group__7__Impl"


    // $ANTLR start "rule__RosActionServer__Group_4__0"
    // InternalComponentInterface.g:3424:1: rule__RosActionServer__Group_4__0 : rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 ;
    public final void rule__RosActionServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3428:1: ( rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 )
            // InternalComponentInterface.g:3429:2: rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosActionServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__0"


    // $ANTLR start "rule__RosActionServer__Group_4__0__Impl"
    // InternalComponentInterface.g:3436:1: rule__RosActionServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3440:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3441:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3441:1: ( 'ns' )
            // InternalComponentInterface.g:3442:2: 'ns'
            {
             before(grammarAccess.getRosActionServerAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__0__Impl"


    // $ANTLR start "rule__RosActionServer__Group_4__1"
    // InternalComponentInterface.g:3451:1: rule__RosActionServer__Group_4__1 : rule__RosActionServer__Group_4__1__Impl ;
    public final void rule__RosActionServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3455:1: ( rule__RosActionServer__Group_4__1__Impl )
            // InternalComponentInterface.g:3456:2: rule__RosActionServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__1"


    // $ANTLR start "rule__RosActionServer__Group_4__1__Impl"
    // InternalComponentInterface.g:3462:1: rule__RosActionServer__Group_4__1__Impl : ( ( rule__RosActionServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3466:1: ( ( ( rule__RosActionServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3467:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3467:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3468:2: ( rule__RosActionServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3469:2: ( rule__RosActionServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:3469:3: rule__RosActionServer__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__Group_4__1__Impl"


    // $ANTLR start "rule__RosActionClient__Group__0"
    // InternalComponentInterface.g:3478:1: rule__RosActionClient__Group__0 : rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 ;
    public final void rule__RosActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3482:1: ( rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 )
            // InternalComponentInterface.g:3483:2: rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__RosActionClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__0"


    // $ANTLR start "rule__RosActionClient__Group__0__Impl"
    // InternalComponentInterface.g:3490:1: rule__RosActionClient__Group__0__Impl : ( () ) ;
    public final void rule__RosActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3494:1: ( ( () ) )
            // InternalComponentInterface.g:3495:1: ( () )
            {
            // InternalComponentInterface.g:3495:1: ( () )
            // InternalComponentInterface.g:3496:2: ()
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientAction_0()); 
            // InternalComponentInterface.g:3497:2: ()
            // InternalComponentInterface.g:3497:3: 
            {
            }

             after(grammarAccess.getRosActionClientAccess().getRosActionClientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__0__Impl"


    // $ANTLR start "rule__RosActionClient__Group__1"
    // InternalComponentInterface.g:3505:1: rule__RosActionClient__Group__1 : rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 ;
    public final void rule__RosActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3509:1: ( rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 )
            // InternalComponentInterface.g:3510:2: rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosActionClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__1"


    // $ANTLR start "rule__RosActionClient__Group__1__Impl"
    // InternalComponentInterface.g:3517:1: rule__RosActionClient__Group__1__Impl : ( 'RosActionClient' ) ;
    public final void rule__RosActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3521:1: ( ( 'RosActionClient' ) )
            // InternalComponentInterface.g:3522:1: ( 'RosActionClient' )
            {
            // InternalComponentInterface.g:3522:1: ( 'RosActionClient' )
            // InternalComponentInterface.g:3523:2: 'RosActionClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__1__Impl"


    // $ANTLR start "rule__RosActionClient__Group__2"
    // InternalComponentInterface.g:3532:1: rule__RosActionClient__Group__2 : rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 ;
    public final void rule__RosActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3536:1: ( rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 )
            // InternalComponentInterface.g:3537:2: rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosActionClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__2"


    // $ANTLR start "rule__RosActionClient__Group__2__Impl"
    // InternalComponentInterface.g:3544:1: rule__RosActionClient__Group__2__Impl : ( ( rule__RosActionClient__NameAssignment_2 )? ) ;
    public final void rule__RosActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3548:1: ( ( ( rule__RosActionClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3549:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3549:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3550:2: ( rule__RosActionClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3551:2: ( rule__RosActionClient__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:3551:3: rule__RosActionClient__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionClient__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionClientAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__2__Impl"


    // $ANTLR start "rule__RosActionClient__Group__3"
    // InternalComponentInterface.g:3559:1: rule__RosActionClient__Group__3 : rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 ;
    public final void rule__RosActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3563:1: ( rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 )
            // InternalComponentInterface.g:3564:2: rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__RosActionClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__3"


    // $ANTLR start "rule__RosActionClient__Group__3__Impl"
    // InternalComponentInterface.g:3571:1: rule__RosActionClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3575:1: ( ( '{' ) )
            // InternalComponentInterface.g:3576:1: ( '{' )
            {
            // InternalComponentInterface.g:3576:1: ( '{' )
            // InternalComponentInterface.g:3577:2: '{'
            {
             before(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__3__Impl"


    // $ANTLR start "rule__RosActionClient__Group__4"
    // InternalComponentInterface.g:3586:1: rule__RosActionClient__Group__4 : rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 ;
    public final void rule__RosActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3590:1: ( rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 )
            // InternalComponentInterface.g:3591:2: rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RosActionClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__4"


    // $ANTLR start "rule__RosActionClient__Group__4__Impl"
    // InternalComponentInterface.g:3598:1: rule__RosActionClient__Group__4__Impl : ( ( rule__RosActionClient__Group_4__0 )? ) ;
    public final void rule__RosActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3602:1: ( ( ( rule__RosActionClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3603:1: ( ( rule__RosActionClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3603:1: ( ( rule__RosActionClient__Group_4__0 )? )
            // InternalComponentInterface.g:3604:2: ( rule__RosActionClient__Group_4__0 )?
            {
             before(grammarAccess.getRosActionClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3605:2: ( rule__RosActionClient__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:3605:3: rule__RosActionClient__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosActionClient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosActionClientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__4__Impl"


    // $ANTLR start "rule__RosActionClient__Group__5"
    // InternalComponentInterface.g:3613:1: rule__RosActionClient__Group__5 : rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 ;
    public final void rule__RosActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3617:1: ( rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 )
            // InternalComponentInterface.g:3618:2: rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosActionClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__5"


    // $ANTLR start "rule__RosActionClient__Group__5__Impl"
    // InternalComponentInterface.g:3625:1: rule__RosActionClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3629:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3630:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3630:1: ( 'RefClient' )
            // InternalComponentInterface.g:3631:2: 'RefClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRefClientKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRefClientKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__5__Impl"


    // $ANTLR start "rule__RosActionClient__Group__6"
    // InternalComponentInterface.g:3640:1: rule__RosActionClient__Group__6 : rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 ;
    public final void rule__RosActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3644:1: ( rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 )
            // InternalComponentInterface.g:3645:2: rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosActionClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__6"


    // $ANTLR start "rule__RosActionClient__Group__6__Impl"
    // InternalComponentInterface.g:3652:1: rule__RosActionClient__Group__6__Impl : ( ( rule__RosActionClient__ActclientAssignment_6 ) ) ;
    public final void rule__RosActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3656:1: ( ( ( rule__RosActionClient__ActclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3657:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3657:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            // InternalComponentInterface.g:3658:2: ( rule__RosActionClient__ActclientAssignment_6 )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientAssignment_6()); 
            // InternalComponentInterface.g:3659:2: ( rule__RosActionClient__ActclientAssignment_6 )
            // InternalComponentInterface.g:3659:3: rule__RosActionClient__ActclientAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__ActclientAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getActclientAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__6__Impl"


    // $ANTLR start "rule__RosActionClient__Group__7"
    // InternalComponentInterface.g:3667:1: rule__RosActionClient__Group__7 : rule__RosActionClient__Group__7__Impl ;
    public final void rule__RosActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3671:1: ( rule__RosActionClient__Group__7__Impl )
            // InternalComponentInterface.g:3672:2: rule__RosActionClient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__7"


    // $ANTLR start "rule__RosActionClient__Group__7__Impl"
    // InternalComponentInterface.g:3678:1: rule__RosActionClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3682:1: ( ( '}' ) )
            // InternalComponentInterface.g:3683:1: ( '}' )
            {
            // InternalComponentInterface.g:3683:1: ( '}' )
            // InternalComponentInterface.g:3684:2: '}'
            {
             before(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group__7__Impl"


    // $ANTLR start "rule__RosActionClient__Group_4__0"
    // InternalComponentInterface.g:3694:1: rule__RosActionClient__Group_4__0 : rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 ;
    public final void rule__RosActionClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3698:1: ( rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 )
            // InternalComponentInterface.g:3699:2: rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosActionClient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__0"


    // $ANTLR start "rule__RosActionClient__Group_4__0__Impl"
    // InternalComponentInterface.g:3706:1: rule__RosActionClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3710:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3711:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3711:1: ( 'ns' )
            // InternalComponentInterface.g:3712:2: 'ns'
            {
             before(grammarAccess.getRosActionClientAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__0__Impl"


    // $ANTLR start "rule__RosActionClient__Group_4__1"
    // InternalComponentInterface.g:3721:1: rule__RosActionClient__Group_4__1 : rule__RosActionClient__Group_4__1__Impl ;
    public final void rule__RosActionClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3725:1: ( rule__RosActionClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3726:2: rule__RosActionClient__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__1"


    // $ANTLR start "rule__RosActionClient__Group_4__1__Impl"
    // InternalComponentInterface.g:3732:1: rule__RosActionClient__Group_4__1__Impl : ( ( rule__RosActionClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3736:1: ( ( ( rule__RosActionClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3737:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3737:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3738:2: ( rule__RosActionClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3739:2: ( rule__RosActionClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3739:3: rule__RosActionClient__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__Group_4__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__0"
    // InternalComponentInterface.g:3748:1: rule__RosParameter__Group__0 : rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 ;
    public final void rule__RosParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3752:1: ( rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 )
            // InternalComponentInterface.g:3753:2: rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__RosParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0"


    // $ANTLR start "rule__RosParameter__Group__0__Impl"
    // InternalComponentInterface.g:3760:1: rule__RosParameter__Group__0__Impl : ( () ) ;
    public final void rule__RosParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3764:1: ( ( () ) )
            // InternalComponentInterface.g:3765:1: ( () )
            {
            // InternalComponentInterface.g:3765:1: ( () )
            // InternalComponentInterface.g:3766:2: ()
            {
             before(grammarAccess.getRosParameterAccess().getRosParameterAction_0()); 
            // InternalComponentInterface.g:3767:2: ()
            // InternalComponentInterface.g:3767:3: 
            {
            }

             after(grammarAccess.getRosParameterAccess().getRosParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0__Impl"


    // $ANTLR start "rule__RosParameter__Group__1"
    // InternalComponentInterface.g:3775:1: rule__RosParameter__Group__1 : rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 ;
    public final void rule__RosParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3779:1: ( rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 )
            // InternalComponentInterface.g:3780:2: rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__RosParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__1"


    // $ANTLR start "rule__RosParameter__Group__1__Impl"
    // InternalComponentInterface.g:3787:1: rule__RosParameter__Group__1__Impl : ( 'RosParameter' ) ;
    public final void rule__RosParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3791:1: ( ( 'RosParameter' ) )
            // InternalComponentInterface.g:3792:1: ( 'RosParameter' )
            {
            // InternalComponentInterface.g:3792:1: ( 'RosParameter' )
            // InternalComponentInterface.g:3793:2: 'RosParameter'
            {
             before(grammarAccess.getRosParameterAccess().getRosParameterKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getRosParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__2"
    // InternalComponentInterface.g:3802:1: rule__RosParameter__Group__2 : rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 ;
    public final void rule__RosParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3806:1: ( rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 )
            // InternalComponentInterface.g:3807:2: rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__RosParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__2"


    // $ANTLR start "rule__RosParameter__Group__2__Impl"
    // InternalComponentInterface.g:3814:1: rule__RosParameter__Group__2__Impl : ( ( rule__RosParameter__NameAssignment_2 )? ) ;
    public final void rule__RosParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3818:1: ( ( ( rule__RosParameter__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3819:1: ( ( rule__RosParameter__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3819:1: ( ( rule__RosParameter__NameAssignment_2 )? )
            // InternalComponentInterface.g:3820:2: ( rule__RosParameter__NameAssignment_2 )?
            {
             before(grammarAccess.getRosParameterAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3821:2: ( rule__RosParameter__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentInterface.g:3821:3: rule__RosParameter__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosParameter__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__2__Impl"


    // $ANTLR start "rule__RosParameter__Group__3"
    // InternalComponentInterface.g:3829:1: rule__RosParameter__Group__3 : rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 ;
    public final void rule__RosParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3833:1: ( rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 )
            // InternalComponentInterface.g:3834:2: rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__RosParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__3"


    // $ANTLR start "rule__RosParameter__Group__3__Impl"
    // InternalComponentInterface.g:3841:1: rule__RosParameter__Group__3__Impl : ( '{' ) ;
    public final void rule__RosParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3845:1: ( ( '{' ) )
            // InternalComponentInterface.g:3846:1: ( '{' )
            {
            // InternalComponentInterface.g:3846:1: ( '{' )
            // InternalComponentInterface.g:3847:2: '{'
            {
             before(grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__3__Impl"


    // $ANTLR start "rule__RosParameter__Group__4"
    // InternalComponentInterface.g:3856:1: rule__RosParameter__Group__4 : rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 ;
    public final void rule__RosParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3860:1: ( rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 )
            // InternalComponentInterface.g:3861:2: rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__RosParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__4"


    // $ANTLR start "rule__RosParameter__Group__4__Impl"
    // InternalComponentInterface.g:3868:1: rule__RosParameter__Group__4__Impl : ( ( rule__RosParameter__Group_4__0 )? ) ;
    public final void rule__RosParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3872:1: ( ( ( rule__RosParameter__Group_4__0 )? ) )
            // InternalComponentInterface.g:3873:1: ( ( rule__RosParameter__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3873:1: ( ( rule__RosParameter__Group_4__0 )? )
            // InternalComponentInterface.g:3874:2: ( rule__RosParameter__Group_4__0 )?
            {
             before(grammarAccess.getRosParameterAccess().getGroup_4()); 
            // InternalComponentInterface.g:3875:2: ( rule__RosParameter__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentInterface.g:3875:3: rule__RosParameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosParameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosParameterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__4__Impl"


    // $ANTLR start "rule__RosParameter__Group__5"
    // InternalComponentInterface.g:3883:1: rule__RosParameter__Group__5 : rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 ;
    public final void rule__RosParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3887:1: ( rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 )
            // InternalComponentInterface.g:3888:2: rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosParameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__5"


    // $ANTLR start "rule__RosParameter__Group__5__Impl"
    // InternalComponentInterface.g:3895:1: rule__RosParameter__Group__5__Impl : ( 'RefParameter' ) ;
    public final void rule__RosParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3899:1: ( ( 'RefParameter' ) )
            // InternalComponentInterface.g:3900:1: ( 'RefParameter' )
            {
            // InternalComponentInterface.g:3900:1: ( 'RefParameter' )
            // InternalComponentInterface.g:3901:2: 'RefParameter'
            {
             before(grammarAccess.getRosParameterAccess().getRefParameterKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getRefParameterKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__5__Impl"


    // $ANTLR start "rule__RosParameter__Group__6"
    // InternalComponentInterface.g:3910:1: rule__RosParameter__Group__6 : rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 ;
    public final void rule__RosParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3914:1: ( rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 )
            // InternalComponentInterface.g:3915:2: rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__RosParameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__6"


    // $ANTLR start "rule__RosParameter__Group__6__Impl"
    // InternalComponentInterface.g:3922:1: rule__RosParameter__Group__6__Impl : ( ( rule__RosParameter__ParameterAssignment_6 ) ) ;
    public final void rule__RosParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3926:1: ( ( ( rule__RosParameter__ParameterAssignment_6 ) ) )
            // InternalComponentInterface.g:3927:1: ( ( rule__RosParameter__ParameterAssignment_6 ) )
            {
            // InternalComponentInterface.g:3927:1: ( ( rule__RosParameter__ParameterAssignment_6 ) )
            // InternalComponentInterface.g:3928:2: ( rule__RosParameter__ParameterAssignment_6 )
            {
             before(grammarAccess.getRosParameterAccess().getParameterAssignment_6()); 
            // InternalComponentInterface.g:3929:2: ( rule__RosParameter__ParameterAssignment_6 )
            // InternalComponentInterface.g:3929:3: rule__RosParameter__ParameterAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ParameterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getParameterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__6__Impl"


    // $ANTLR start "rule__RosParameter__Group__7"
    // InternalComponentInterface.g:3937:1: rule__RosParameter__Group__7 : rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8 ;
    public final void rule__RosParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3941:1: ( rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8 )
            // InternalComponentInterface.g:3942:2: rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__RosParameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__7"


    // $ANTLR start "rule__RosParameter__Group__7__Impl"
    // InternalComponentInterface.g:3949:1: rule__RosParameter__Group__7__Impl : ( ( rule__RosParameter__Group_7__0 )? ) ;
    public final void rule__RosParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3953:1: ( ( ( rule__RosParameter__Group_7__0 )? ) )
            // InternalComponentInterface.g:3954:1: ( ( rule__RosParameter__Group_7__0 )? )
            {
            // InternalComponentInterface.g:3954:1: ( ( rule__RosParameter__Group_7__0 )? )
            // InternalComponentInterface.g:3955:2: ( rule__RosParameter__Group_7__0 )?
            {
             before(grammarAccess.getRosParameterAccess().getGroup_7()); 
            // InternalComponentInterface.g:3956:2: ( rule__RosParameter__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentInterface.g:3956:3: rule__RosParameter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosParameter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosParameterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__7__Impl"


    // $ANTLR start "rule__RosParameter__Group__8"
    // InternalComponentInterface.g:3964:1: rule__RosParameter__Group__8 : rule__RosParameter__Group__8__Impl ;
    public final void rule__RosParameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3968:1: ( rule__RosParameter__Group__8__Impl )
            // InternalComponentInterface.g:3969:2: rule__RosParameter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__8"


    // $ANTLR start "rule__RosParameter__Group__8__Impl"
    // InternalComponentInterface.g:3975:1: rule__RosParameter__Group__8__Impl : ( '}' ) ;
    public final void rule__RosParameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3979:1: ( ( '}' ) )
            // InternalComponentInterface.g:3980:1: ( '}' )
            {
            // InternalComponentInterface.g:3980:1: ( '}' )
            // InternalComponentInterface.g:3981:2: '}'
            {
             before(grammarAccess.getRosParameterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__8__Impl"


    // $ANTLR start "rule__RosParameter__Group_4__0"
    // InternalComponentInterface.g:3991:1: rule__RosParameter__Group_4__0 : rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1 ;
    public final void rule__RosParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3995:1: ( rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1 )
            // InternalComponentInterface.g:3996:2: rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__RosParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__0"


    // $ANTLR start "rule__RosParameter__Group_4__0__Impl"
    // InternalComponentInterface.g:4003:1: rule__RosParameter__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4007:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:4008:1: ( 'ns' )
            {
            // InternalComponentInterface.g:4008:1: ( 'ns' )
            // InternalComponentInterface.g:4009:2: 'ns'
            {
             before(grammarAccess.getRosParameterAccess().getNsKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__0__Impl"


    // $ANTLR start "rule__RosParameter__Group_4__1"
    // InternalComponentInterface.g:4018:1: rule__RosParameter__Group_4__1 : rule__RosParameter__Group_4__1__Impl ;
    public final void rule__RosParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4022:1: ( rule__RosParameter__Group_4__1__Impl )
            // InternalComponentInterface.g:4023:2: rule__RosParameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__1"


    // $ANTLR start "rule__RosParameter__Group_4__1__Impl"
    // InternalComponentInterface.g:4029:1: rule__RosParameter__Group_4__1__Impl : ( ( rule__RosParameter__NsAssignment_4_1 ) ) ;
    public final void rule__RosParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4033:1: ( ( ( rule__RosParameter__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:4034:1: ( ( rule__RosParameter__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:4034:1: ( ( rule__RosParameter__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:4035:2: ( rule__RosParameter__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosParameterAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:4036:2: ( rule__RosParameter__NsAssignment_4_1 )
            // InternalComponentInterface.g:4036:3: rule__RosParameter__NsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__NsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getNsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_4__1__Impl"


    // $ANTLR start "rule__RosParameter__Group_7__0"
    // InternalComponentInterface.g:4045:1: rule__RosParameter__Group_7__0 : rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1 ;
    public final void rule__RosParameter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4049:1: ( rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1 )
            // InternalComponentInterface.g:4050:2: rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__RosParameter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__0"


    // $ANTLR start "rule__RosParameter__Group_7__0__Impl"
    // InternalComponentInterface.g:4057:1: rule__RosParameter__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__RosParameter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4061:1: ( ( 'value' ) )
            // InternalComponentInterface.g:4062:1: ( 'value' )
            {
            // InternalComponentInterface.g:4062:1: ( 'value' )
            // InternalComponentInterface.g:4063:2: 'value'
            {
             before(grammarAccess.getRosParameterAccess().getValueKeyword_7_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getValueKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__0__Impl"


    // $ANTLR start "rule__RosParameter__Group_7__1"
    // InternalComponentInterface.g:4072:1: rule__RosParameter__Group_7__1 : rule__RosParameter__Group_7__1__Impl ;
    public final void rule__RosParameter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4076:1: ( rule__RosParameter__Group_7__1__Impl )
            // InternalComponentInterface.g:4077:2: rule__RosParameter__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__1"


    // $ANTLR start "rule__RosParameter__Group_7__1__Impl"
    // InternalComponentInterface.g:4083:1: rule__RosParameter__Group_7__1__Impl : ( ( rule__RosParameter__ValueAssignment_7_1 ) ) ;
    public final void rule__RosParameter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4087:1: ( ( ( rule__RosParameter__ValueAssignment_7_1 ) ) )
            // InternalComponentInterface.g:4088:1: ( ( rule__RosParameter__ValueAssignment_7_1 ) )
            {
            // InternalComponentInterface.g:4088:1: ( ( rule__RosParameter__ValueAssignment_7_1 ) )
            // InternalComponentInterface.g:4089:2: ( rule__RosParameter__ValueAssignment_7_1 )
            {
             before(grammarAccess.getRosParameterAccess().getValueAssignment_7_1()); 
            // InternalComponentInterface.g:4090:2: ( rule__RosParameter__ValueAssignment_7_1 )
            // InternalComponentInterface.g:4090:3: rule__RosParameter__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getValueAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group_7__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_0__0"
    // InternalComponentInterface.g:4099:1: rule__ParameterValue__Group_0__0 : rule__ParameterValue__Group_0__0__Impl rule__ParameterValue__Group_0__1 ;
    public final void rule__ParameterValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4103:1: ( rule__ParameterValue__Group_0__0__Impl rule__ParameterValue__Group_0__1 )
            // InternalComponentInterface.g:4104:2: rule__ParameterValue__Group_0__0__Impl rule__ParameterValue__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__ParameterValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_0__0"


    // $ANTLR start "rule__ParameterValue__Group_0__0__Impl"
    // InternalComponentInterface.g:4111:1: rule__ParameterValue__Group_0__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4115:1: ( ( () ) )
            // InternalComponentInterface.g:4116:1: ( () )
            {
            // InternalComponentInterface.g:4116:1: ( () )
            // InternalComponentInterface.g:4117:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterDoubleAction_0_0()); 
            // InternalComponentInterface.g:4118:2: ()
            // InternalComponentInterface.g:4118:3: 
            {
            }

             after(grammarAccess.getParameterValueAccess().getParameterDoubleAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_0__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_0__1"
    // InternalComponentInterface.g:4126:1: rule__ParameterValue__Group_0__1 : rule__ParameterValue__Group_0__1__Impl ;
    public final void rule__ParameterValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4130:1: ( rule__ParameterValue__Group_0__1__Impl )
            // InternalComponentInterface.g:4131:2: rule__ParameterValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_0__1"


    // $ANTLR start "rule__ParameterValue__Group_0__1__Impl"
    // InternalComponentInterface.g:4137:1: rule__ParameterValue__Group_0__1__Impl : ( ruleDouble0 ) ;
    public final void rule__ParameterValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4141:1: ( ( ruleDouble0 ) )
            // InternalComponentInterface.g:4142:1: ( ruleDouble0 )
            {
            // InternalComponentInterface.g:4142:1: ( ruleDouble0 )
            // InternalComponentInterface.g:4143:2: ruleDouble0
            {
             before(grammarAccess.getParameterValueAccess().getDouble0ParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getDouble0ParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_0__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_1__0"
    // InternalComponentInterface.g:4153:1: rule__ParameterValue__Group_1__0 : rule__ParameterValue__Group_1__0__Impl rule__ParameterValue__Group_1__1 ;
    public final void rule__ParameterValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4157:1: ( rule__ParameterValue__Group_1__0__Impl rule__ParameterValue__Group_1__1 )
            // InternalComponentInterface.g:4158:2: rule__ParameterValue__Group_1__0__Impl rule__ParameterValue__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__ParameterValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_1__0"


    // $ANTLR start "rule__ParameterValue__Group_1__0__Impl"
    // InternalComponentInterface.g:4165:1: rule__ParameterValue__Group_1__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4169:1: ( ( () ) )
            // InternalComponentInterface.g:4170:1: ( () )
            {
            // InternalComponentInterface.g:4170:1: ( () )
            // InternalComponentInterface.g:4171:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterBooleanAction_1_0()); 
            // InternalComponentInterface.g:4172:2: ()
            // InternalComponentInterface.g:4172:3: 
            {
            }

             after(grammarAccess.getParameterValueAccess().getParameterBooleanAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_1__1"
    // InternalComponentInterface.g:4180:1: rule__ParameterValue__Group_1__1 : rule__ParameterValue__Group_1__1__Impl ;
    public final void rule__ParameterValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4184:1: ( rule__ParameterValue__Group_1__1__Impl )
            // InternalComponentInterface.g:4185:2: rule__ParameterValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_1__1"


    // $ANTLR start "rule__ParameterValue__Group_1__1__Impl"
    // InternalComponentInterface.g:4191:1: rule__ParameterValue__Group_1__1__Impl : ( ruleboolean0 ) ;
    public final void rule__ParameterValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4195:1: ( ( ruleboolean0 ) )
            // InternalComponentInterface.g:4196:1: ( ruleboolean0 )
            {
            // InternalComponentInterface.g:4196:1: ( ruleboolean0 )
            // InternalComponentInterface.g:4197:2: ruleboolean0
            {
             before(grammarAccess.getParameterValueAccess().getBoolean0ParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getBoolean0ParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterValue__Group_2__0"
    // InternalComponentInterface.g:4207:1: rule__ParameterValue__Group_2__0 : rule__ParameterValue__Group_2__0__Impl rule__ParameterValue__Group_2__1 ;
    public final void rule__ParameterValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4211:1: ( rule__ParameterValue__Group_2__0__Impl rule__ParameterValue__Group_2__1 )
            // InternalComponentInterface.g:4212:2: rule__ParameterValue__Group_2__0__Impl rule__ParameterValue__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_2__0"


    // $ANTLR start "rule__ParameterValue__Group_2__0__Impl"
    // InternalComponentInterface.g:4219:1: rule__ParameterValue__Group_2__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4223:1: ( ( () ) )
            // InternalComponentInterface.g:4224:1: ( () )
            {
            // InternalComponentInterface.g:4224:1: ( () )
            // InternalComponentInterface.g:4225:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterStringAction_2_0()); 
            // InternalComponentInterface.g:4226:2: ()
            // InternalComponentInterface.g:4226:3: 
            {
            }

             after(grammarAccess.getParameterValueAccess().getParameterStringAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_2__1"
    // InternalComponentInterface.g:4234:1: rule__ParameterValue__Group_2__1 : rule__ParameterValue__Group_2__1__Impl ;
    public final void rule__ParameterValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4238:1: ( rule__ParameterValue__Group_2__1__Impl )
            // InternalComponentInterface.g:4239:2: rule__ParameterValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_2__1"


    // $ANTLR start "rule__ParameterValue__Group_2__1__Impl"
    // InternalComponentInterface.g:4245:1: rule__ParameterValue__Group_2__1__Impl : ( ruleEString ) ;
    public final void rule__ParameterValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4249:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4250:1: ( ruleEString )
            {
            // InternalComponentInterface.g:4250:1: ( ruleEString )
            // InternalComponentInterface.g:4251:2: ruleEString
            {
             before(grammarAccess.getParameterValueAccess().getEStringParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getEStringParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_2__1__Impl"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:4261:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4265:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4266:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4266:2: ( ruleEString )
            // InternalComponentInterface.g:4267:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameAssignment_3"


    // $ANTLR start "rule__ComponentInterface__NameSpaceAssignment_4_1"
    // InternalComponentInterface.g:4276:1: rule__ComponentInterface__NameSpaceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4280:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4281:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4281:2: ( ruleEString )
            // InternalComponentInterface.g:4282:3: ruleEString
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getNameSpaceEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__NameSpaceAssignment_4_1"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_5_2"
    // InternalComponentInterface.g:4291:1: rule__ComponentInterface__RospublisherAssignment_5_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4295:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:4296:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:4296:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:4297:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_5_2"


    // $ANTLR start "rule__ComponentInterface__RospublisherAssignment_5_3_1"
    // InternalComponentInterface.g:4306:1: rule__ComponentInterface__RospublisherAssignment_5_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4310:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:4311:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:4311:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:4312:3: ruleRosPublisher
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRospublisherRosPublisherParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RospublisherAssignment_5_3_1"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_6_2"
    // InternalComponentInterface.g:4321:1: rule__ComponentInterface__RossubscriberAssignment_6_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4325:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:4326:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:4326:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:4327:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_6_2"


    // $ANTLR start "rule__ComponentInterface__RossubscriberAssignment_6_3_1"
    // InternalComponentInterface.g:4336:1: rule__ComponentInterface__RossubscriberAssignment_6_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4340:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:4341:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:4341:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:4342:3: ruleRosSubscriber
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRossubscriberRosSubscriberParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RossubscriberAssignment_6_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_7_2"
    // InternalComponentInterface.g:4351:1: rule__ComponentInterface__RosserviceserverAssignment_7_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4355:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:4356:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:4356:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:4357:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_7_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceserverAssignment_7_3_1"
    // InternalComponentInterface.g:4366:1: rule__ComponentInterface__RosserviceserverAssignment_7_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4370:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:4371:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:4371:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:4372:3: ruleRosServiceServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceserverRosServiceServerParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceserverAssignment_7_3_1"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_8_2"
    // InternalComponentInterface.g:4381:1: rule__ComponentInterface__RosserviceclientAssignment_8_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4385:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:4386:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:4386:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:4387:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_8_2"


    // $ANTLR start "rule__ComponentInterface__RosserviceclientAssignment_8_3_1"
    // InternalComponentInterface.g:4396:1: rule__ComponentInterface__RosserviceclientAssignment_8_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4400:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:4401:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:4401:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:4402:3: ruleRosServiceClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosServiceClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosserviceclientRosServiceClientParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosserviceclientAssignment_8_3_1"


    // $ANTLR start "rule__ComponentInterface__RosactionserverAssignment_9_2"
    // InternalComponentInterface.g:4411:1: rule__ComponentInterface__RosactionserverAssignment_9_2 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4415:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:4416:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:4416:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:4417:3: ruleRosActionServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionserverAssignment_9_2"


    // $ANTLR start "rule__ComponentInterface__RosactionserverAssignment_9_3_1"
    // InternalComponentInterface.g:4426:1: rule__ComponentInterface__RosactionserverAssignment_9_3_1 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4430:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:4431:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:4431:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:4432:3: ruleRosActionServer
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionserverRosActionServerParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionserverAssignment_9_3_1"


    // $ANTLR start "rule__ComponentInterface__RosactionclientAssignment_10_2"
    // InternalComponentInterface.g:4441:1: rule__ComponentInterface__RosactionclientAssignment_10_2 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4445:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:4446:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:4446:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:4447:3: ruleRosActionClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionclientAssignment_10_2"


    // $ANTLR start "rule__ComponentInterface__RosactionclientAssignment_10_3_1"
    // InternalComponentInterface.g:4456:1: rule__ComponentInterface__RosactionclientAssignment_10_3_1 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4460:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:4461:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:4461:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:4462:3: ruleRosActionClient
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosactionclientRosActionClientParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosactionclientAssignment_10_3_1"


    // $ANTLR start "rule__ComponentInterface__RosparameterAssignment_11_2"
    // InternalComponentInterface.g:4471:1: rule__ComponentInterface__RosparameterAssignment_11_2 : ( ruleRosParameter ) ;
    public final void rule__ComponentInterface__RosparameterAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4475:1: ( ( ruleRosParameter ) )
            // InternalComponentInterface.g:4476:2: ( ruleRosParameter )
            {
            // InternalComponentInterface.g:4476:2: ( ruleRosParameter )
            // InternalComponentInterface.g:4477:3: ruleRosParameter
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosparameterAssignment_11_2"


    // $ANTLR start "rule__ComponentInterface__RosparameterAssignment_11_3_1"
    // InternalComponentInterface.g:4486:1: rule__ComponentInterface__RosparameterAssignment_11_3_1 : ( ruleRosParameter ) ;
    public final void rule__ComponentInterface__RosparameterAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4490:1: ( ( ruleRosParameter ) )
            // InternalComponentInterface.g:4491:2: ( ruleRosParameter )
            {
            // InternalComponentInterface.g:4491:2: ( ruleRosParameter )
            // InternalComponentInterface.g:4492:3: ruleRosParameter
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getComponentInterfaceAccess().getRosparameterRosParameterParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInterface__RosparameterAssignment_11_3_1"


    // $ANTLR start "rule__RosPublisher__NameAssignment_2"
    // InternalComponentInterface.g:4501:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4505:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4506:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4506:2: ( ruleEString )
            // InternalComponentInterface.g:4507:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__NameAssignment_2"


    // $ANTLR start "rule__RosPublisher__NsAssignment_4_1"
    // InternalComponentInterface.g:4516:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4520:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4521:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4521:2: ( ruleEString )
            // InternalComponentInterface.g:4522:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__NsAssignment_4_1"


    // $ANTLR start "rule__RosPublisher__PublisherAssignment_6"
    // InternalComponentInterface.g:4531:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4535:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4536:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4536:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4537:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalComponentInterface.g:4538:3: ( ruleEString )
            // InternalComponentInterface.g:4539:4: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getPublisherPublisherEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__PublisherAssignment_6"


    // $ANTLR start "rule__RosSubscriber__NameAssignment_2"
    // InternalComponentInterface.g:4550:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4554:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4555:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4555:2: ( ruleEString )
            // InternalComponentInterface.g:4556:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__NameAssignment_2"


    // $ANTLR start "rule__RosSubscriber__NsAssignment_4_1"
    // InternalComponentInterface.g:4565:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4569:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4570:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4570:2: ( ruleEString )
            // InternalComponentInterface.g:4571:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__NsAssignment_4_1"


    // $ANTLR start "rule__RosSubscriber__SubscriberAssignment_6"
    // InternalComponentInterface.g:4580:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4584:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4585:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4585:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4586:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalComponentInterface.g:4587:3: ( ruleEString )
            // InternalComponentInterface.g:4588:4: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__SubscriberAssignment_6"


    // $ANTLR start "rule__RosServiceServer__NameAssignment_2"
    // InternalComponentInterface.g:4599:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4603:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4604:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4604:2: ( ruleEString )
            // InternalComponentInterface.g:4605:3: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__NameAssignment_2"


    // $ANTLR start "rule__RosServiceServer__NsAssignment_4_1"
    // InternalComponentInterface.g:4614:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4618:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4619:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4619:2: ( ruleEString )
            // InternalComponentInterface.g:4620:3: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__NsAssignment_4_1"


    // $ANTLR start "rule__RosServiceServer__SrvserverAssignment_6"
    // InternalComponentInterface.g:4629:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4633:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4634:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4634:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4635:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalComponentInterface.g:4636:3: ( ruleEString )
            // InternalComponentInterface.g:4637:4: ruleEString
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServer__SrvserverAssignment_6"


    // $ANTLR start "rule__RosServiceClient__NameAssignment_2"
    // InternalComponentInterface.g:4648:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4652:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4653:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4653:2: ( ruleEString )
            // InternalComponentInterface.g:4654:3: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__NameAssignment_2"


    // $ANTLR start "rule__RosServiceClient__NsAssignment_4_1"
    // InternalComponentInterface.g:4663:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4667:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4668:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4668:2: ( ruleEString )
            // InternalComponentInterface.g:4669:3: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__NsAssignment_4_1"


    // $ANTLR start "rule__RosServiceClient__SrvclientAssignment_6"
    // InternalComponentInterface.g:4678:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4682:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4683:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4683:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4684:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalComponentInterface.g:4685:3: ( ruleEString )
            // InternalComponentInterface.g:4686:4: ruleEString
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceClient__SrvclientAssignment_6"


    // $ANTLR start "rule__RosActionServer__NameAssignment_2"
    // InternalComponentInterface.g:4697:1: rule__RosActionServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4701:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4702:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4702:2: ( ruleEString )
            // InternalComponentInterface.g:4703:3: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__NameAssignment_2"


    // $ANTLR start "rule__RosActionServer__NsAssignment_4_1"
    // InternalComponentInterface.g:4712:1: rule__RosActionServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4716:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4717:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4717:2: ( ruleEString )
            // InternalComponentInterface.g:4718:3: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__NsAssignment_4_1"


    // $ANTLR start "rule__RosActionServer__ActserverAssignment_6"
    // InternalComponentInterface.g:4727:1: rule__RosActionServer__ActserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServer__ActserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4731:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4732:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4732:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4733:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0()); 
            // InternalComponentInterface.g:4734:3: ( ruleEString )
            // InternalComponentInterface.g:4735:4: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getActserverActionServerEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getActserverActionServerEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServer__ActserverAssignment_6"


    // $ANTLR start "rule__RosActionClient__NameAssignment_2"
    // InternalComponentInterface.g:4746:1: rule__RosActionClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4750:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4751:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4751:2: ( ruleEString )
            // InternalComponentInterface.g:4752:3: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__NameAssignment_2"


    // $ANTLR start "rule__RosActionClient__NsAssignment_4_1"
    // InternalComponentInterface.g:4761:1: rule__RosActionClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4765:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4766:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4766:2: ( ruleEString )
            // InternalComponentInterface.g:4767:3: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__NsAssignment_4_1"


    // $ANTLR start "rule__RosActionClient__ActclientAssignment_6"
    // InternalComponentInterface.g:4776:1: rule__RosActionClient__ActclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClient__ActclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4780:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4781:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4781:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4782:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0()); 
            // InternalComponentInterface.g:4783:3: ( ruleEString )
            // InternalComponentInterface.g:4784:4: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getActclientActionClientEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getActclientActionClientEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClient__ActclientAssignment_6"


    // $ANTLR start "rule__RosParameter__NameAssignment_2"
    // InternalComponentInterface.g:4795:1: rule__RosParameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4799:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4800:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4800:2: ( ruleEString )
            // InternalComponentInterface.g:4801:3: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__NameAssignment_2"


    // $ANTLR start "rule__RosParameter__NsAssignment_4_1"
    // InternalComponentInterface.g:4810:1: rule__RosParameter__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosParameter__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4814:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4815:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4815:2: ( ruleEString )
            // InternalComponentInterface.g:4816:3: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getNsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__NsAssignment_4_1"


    // $ANTLR start "rule__RosParameter__ParameterAssignment_6"
    // InternalComponentInterface.g:4825:1: rule__RosParameter__ParameterAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosParameter__ParameterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4829:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4830:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4830:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4831:3: ( ruleEString )
            {
             before(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0()); 
            // InternalComponentInterface.g:4832:3: ( ruleEString )
            // InternalComponentInterface.g:4833:4: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getParameterParameterEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getParameterParameterEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ParameterAssignment_6"


    // $ANTLR start "rule__RosParameter__ValueAssignment_7_1"
    // InternalComponentInterface.g:4844:1: rule__RosParameter__ValueAssignment_7_1 : ( ruleParameterValue ) ;
    public final void rule__RosParameter__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4848:1: ( ( ruleParameterValue ) )
            // InternalComponentInterface.g:4849:2: ( ruleParameterValue )
            {
            // InternalComponentInterface.g:4849:2: ( ruleParameterValue )
            // InternalComponentInterface.g:4850:3: ruleParameterValue
            {
             before(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ValueAssignment_7_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003F7000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000004000C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});

}