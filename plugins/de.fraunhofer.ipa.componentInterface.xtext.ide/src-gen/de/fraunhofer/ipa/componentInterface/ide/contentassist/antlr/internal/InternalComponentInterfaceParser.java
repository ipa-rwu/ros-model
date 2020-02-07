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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_STRING", "RULE_ID", "RULE_DIGIT", "RULE_SIGN", "RULE_INT", "RULE_SIGNED_INT", "RULE_HEX_DIGIT", "RULE_HEX", "RULE_BINARY_DIGIT", "RULE_BINARY", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ComponentInterface'", "'{'", "'name'", "'}'", "'NameSpace'", "'RosPublishers'", "','", "'RosSubscribers'", "'RosSrvServers'", "'RosSrvClients'", "'RosActionServers'", "'RosActionClients'", "'RosParameters'", "'RosPublisher'", "'RefPublisher'", "'ns'", "'RosSubscriber'", "'RefSubscriber'", "'RosServiceServer'", "'RefServer'", "'RosServiceClient'", "'RefClient'", "'RosActionServer'", "'RosActionClient'", "'RosParameter'", "'RefParameter'", "'value'"
    };
    public static final int RULE_HEX=14;
    public static final int RULE_SIGN=10;
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_ID=8;
    public static final int RULE_DIGIT=9;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=6;
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


    // $ANTLR start "entryRuleInteger0"
    // InternalComponentInterface.g:353:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalComponentInterface.g:354:1: ( ruleInteger0 EOF )
            // InternalComponentInterface.g:355:1: ruleInteger0 EOF
            {
             before(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getInteger0Rule()); 
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
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalComponentInterface.g:362:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:366:2: ( ( RULE_DECINT ) )
            // InternalComponentInterface.g:367:2: ( RULE_DECINT )
            {
            // InternalComponentInterface.g:367:2: ( RULE_DECINT )
            // InternalComponentInterface.g:368:3: RULE_DECINT
            {
             before(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 
            match(input,RULE_DECINT,FOLLOW_2); 
             after(grammarAccess.getInteger0Access().getDECINTTerminalRuleCall()); 

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
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalComponentInterface.g:377:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:381:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalComponentInterface.g:382:2: ( RULE_STRING )
                    {
                    // InternalComponentInterface.g:382:2: ( RULE_STRING )
                    // InternalComponentInterface.g:383:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:388:2: ( RULE_ID )
                    {
                    // InternalComponentInterface.g:388:2: ( RULE_ID )
                    // InternalComponentInterface.g:389:3: RULE_ID
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
    // InternalComponentInterface.g:398:1: rule__ParameterValue__Alternatives : ( ( ( rule__ParameterValue__Group_0__0 ) ) | ( ( rule__ParameterValue__Group_1__0 ) ) | ( ( rule__ParameterValue__Group_2__0 ) ) | ( ( rule__ParameterValue__Group_3__0 ) ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:402:1: ( ( ( rule__ParameterValue__Group_0__0 ) ) | ( ( rule__ParameterValue__Group_1__0 ) ) | ( ( rule__ParameterValue__Group_2__0 ) ) | ( ( rule__ParameterValue__Group_3__0 ) ) )
            int alt2=4;
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
            case RULE_DECINT:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalComponentInterface.g:403:2: ( ( rule__ParameterValue__Group_0__0 ) )
                    {
                    // InternalComponentInterface.g:403:2: ( ( rule__ParameterValue__Group_0__0 ) )
                    // InternalComponentInterface.g:404:3: ( rule__ParameterValue__Group_0__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_0()); 
                    // InternalComponentInterface.g:405:3: ( rule__ParameterValue__Group_0__0 )
                    // InternalComponentInterface.g:405:4: rule__ParameterValue__Group_0__0
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
                    // InternalComponentInterface.g:409:2: ( ( rule__ParameterValue__Group_1__0 ) )
                    {
                    // InternalComponentInterface.g:409:2: ( ( rule__ParameterValue__Group_1__0 ) )
                    // InternalComponentInterface.g:410:3: ( rule__ParameterValue__Group_1__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_1()); 
                    // InternalComponentInterface.g:411:3: ( rule__ParameterValue__Group_1__0 )
                    // InternalComponentInterface.g:411:4: rule__ParameterValue__Group_1__0
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
                    // InternalComponentInterface.g:415:2: ( ( rule__ParameterValue__Group_2__0 ) )
                    {
                    // InternalComponentInterface.g:415:2: ( ( rule__ParameterValue__Group_2__0 ) )
                    // InternalComponentInterface.g:416:3: ( rule__ParameterValue__Group_2__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_2()); 
                    // InternalComponentInterface.g:417:3: ( rule__ParameterValue__Group_2__0 )
                    // InternalComponentInterface.g:417:4: rule__ParameterValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentInterface.g:421:2: ( ( rule__ParameterValue__Group_3__0 ) )
                    {
                    // InternalComponentInterface.g:421:2: ( ( rule__ParameterValue__Group_3__0 ) )
                    // InternalComponentInterface.g:422:3: ( rule__ParameterValue__Group_3__0 )
                    {
                     before(grammarAccess.getParameterValueAccess().getGroup_3()); 
                    // InternalComponentInterface.g:423:3: ( rule__ParameterValue__Group_3__0 )
                    // InternalComponentInterface.g:423:4: rule__ParameterValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterValue__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterValueAccess().getGroup_3()); 

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
    // InternalComponentInterface.g:431:1: rule__ComponentInterface__Group__0 : rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 ;
    public final void rule__ComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:435:1: ( rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1 )
            // InternalComponentInterface.g:436:2: rule__ComponentInterface__Group__0__Impl rule__ComponentInterface__Group__1
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
    // InternalComponentInterface.g:443:1: rule__ComponentInterface__Group__0__Impl : ( 'ComponentInterface' ) ;
    public final void rule__ComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:447:1: ( ( 'ComponentInterface' ) )
            // InternalComponentInterface.g:448:1: ( 'ComponentInterface' )
            {
            // InternalComponentInterface.g:448:1: ( 'ComponentInterface' )
            // InternalComponentInterface.g:449:2: 'ComponentInterface'
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
    // InternalComponentInterface.g:458:1: rule__ComponentInterface__Group__1 : rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 ;
    public final void rule__ComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:462:1: ( rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2 )
            // InternalComponentInterface.g:463:2: rule__ComponentInterface__Group__1__Impl rule__ComponentInterface__Group__2
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
    // InternalComponentInterface.g:470:1: rule__ComponentInterface__Group__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:474:1: ( ( '{' ) )
            // InternalComponentInterface.g:475:1: ( '{' )
            {
            // InternalComponentInterface.g:475:1: ( '{' )
            // InternalComponentInterface.g:476:2: '{'
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
    // InternalComponentInterface.g:485:1: rule__ComponentInterface__Group__2 : rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 ;
    public final void rule__ComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:489:1: ( rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3 )
            // InternalComponentInterface.g:490:2: rule__ComponentInterface__Group__2__Impl rule__ComponentInterface__Group__3
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
    // InternalComponentInterface.g:497:1: rule__ComponentInterface__Group__2__Impl : ( 'name' ) ;
    public final void rule__ComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:501:1: ( ( 'name' ) )
            // InternalComponentInterface.g:502:1: ( 'name' )
            {
            // InternalComponentInterface.g:502:1: ( 'name' )
            // InternalComponentInterface.g:503:2: 'name'
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
    // InternalComponentInterface.g:512:1: rule__ComponentInterface__Group__3 : rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 ;
    public final void rule__ComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:516:1: ( rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4 )
            // InternalComponentInterface.g:517:2: rule__ComponentInterface__Group__3__Impl rule__ComponentInterface__Group__4
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
    // InternalComponentInterface.g:524:1: rule__ComponentInterface__Group__3__Impl : ( ( rule__ComponentInterface__NameAssignment_3 ) ) ;
    public final void rule__ComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:528:1: ( ( ( rule__ComponentInterface__NameAssignment_3 ) ) )
            // InternalComponentInterface.g:529:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            {
            // InternalComponentInterface.g:529:1: ( ( rule__ComponentInterface__NameAssignment_3 ) )
            // InternalComponentInterface.g:530:2: ( rule__ComponentInterface__NameAssignment_3 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameAssignment_3()); 
            // InternalComponentInterface.g:531:2: ( rule__ComponentInterface__NameAssignment_3 )
            // InternalComponentInterface.g:531:3: rule__ComponentInterface__NameAssignment_3
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
    // InternalComponentInterface.g:539:1: rule__ComponentInterface__Group__4 : rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 ;
    public final void rule__ComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:543:1: ( rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5 )
            // InternalComponentInterface.g:544:2: rule__ComponentInterface__Group__4__Impl rule__ComponentInterface__Group__5
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
    // InternalComponentInterface.g:551:1: rule__ComponentInterface__Group__4__Impl : ( ( rule__ComponentInterface__Group_4__0 )? ) ;
    public final void rule__ComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:555:1: ( ( ( rule__ComponentInterface__Group_4__0 )? ) )
            // InternalComponentInterface.g:556:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            {
            // InternalComponentInterface.g:556:1: ( ( rule__ComponentInterface__Group_4__0 )? )
            // InternalComponentInterface.g:557:2: ( rule__ComponentInterface__Group_4__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_4()); 
            // InternalComponentInterface.g:558:2: ( rule__ComponentInterface__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentInterface.g:558:3: rule__ComponentInterface__Group_4__0
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
    // InternalComponentInterface.g:566:1: rule__ComponentInterface__Group__5 : rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 ;
    public final void rule__ComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:570:1: ( rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6 )
            // InternalComponentInterface.g:571:2: rule__ComponentInterface__Group__5__Impl rule__ComponentInterface__Group__6
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
    // InternalComponentInterface.g:578:1: rule__ComponentInterface__Group__5__Impl : ( ( rule__ComponentInterface__Group_5__0 )? ) ;
    public final void rule__ComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:582:1: ( ( ( rule__ComponentInterface__Group_5__0 )? ) )
            // InternalComponentInterface.g:583:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            {
            // InternalComponentInterface.g:583:1: ( ( rule__ComponentInterface__Group_5__0 )? )
            // InternalComponentInterface.g:584:2: ( rule__ComponentInterface__Group_5__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5()); 
            // InternalComponentInterface.g:585:2: ( rule__ComponentInterface__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentInterface.g:585:3: rule__ComponentInterface__Group_5__0
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
    // InternalComponentInterface.g:593:1: rule__ComponentInterface__Group__6 : rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 ;
    public final void rule__ComponentInterface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:597:1: ( rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7 )
            // InternalComponentInterface.g:598:2: rule__ComponentInterface__Group__6__Impl rule__ComponentInterface__Group__7
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
    // InternalComponentInterface.g:605:1: rule__ComponentInterface__Group__6__Impl : ( ( rule__ComponentInterface__Group_6__0 )? ) ;
    public final void rule__ComponentInterface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:609:1: ( ( ( rule__ComponentInterface__Group_6__0 )? ) )
            // InternalComponentInterface.g:610:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            {
            // InternalComponentInterface.g:610:1: ( ( rule__ComponentInterface__Group_6__0 )? )
            // InternalComponentInterface.g:611:2: ( rule__ComponentInterface__Group_6__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6()); 
            // InternalComponentInterface.g:612:2: ( rule__ComponentInterface__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentInterface.g:612:3: rule__ComponentInterface__Group_6__0
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
    // InternalComponentInterface.g:620:1: rule__ComponentInterface__Group__7 : rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 ;
    public final void rule__ComponentInterface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:624:1: ( rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8 )
            // InternalComponentInterface.g:625:2: rule__ComponentInterface__Group__7__Impl rule__ComponentInterface__Group__8
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
    // InternalComponentInterface.g:632:1: rule__ComponentInterface__Group__7__Impl : ( ( rule__ComponentInterface__Group_7__0 )? ) ;
    public final void rule__ComponentInterface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:636:1: ( ( ( rule__ComponentInterface__Group_7__0 )? ) )
            // InternalComponentInterface.g:637:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            {
            // InternalComponentInterface.g:637:1: ( ( rule__ComponentInterface__Group_7__0 )? )
            // InternalComponentInterface.g:638:2: ( rule__ComponentInterface__Group_7__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7()); 
            // InternalComponentInterface.g:639:2: ( rule__ComponentInterface__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:639:3: rule__ComponentInterface__Group_7__0
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
    // InternalComponentInterface.g:647:1: rule__ComponentInterface__Group__8 : rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 ;
    public final void rule__ComponentInterface__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:651:1: ( rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9 )
            // InternalComponentInterface.g:652:2: rule__ComponentInterface__Group__8__Impl rule__ComponentInterface__Group__9
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
    // InternalComponentInterface.g:659:1: rule__ComponentInterface__Group__8__Impl : ( ( rule__ComponentInterface__Group_8__0 )? ) ;
    public final void rule__ComponentInterface__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:663:1: ( ( ( rule__ComponentInterface__Group_8__0 )? ) )
            // InternalComponentInterface.g:664:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            {
            // InternalComponentInterface.g:664:1: ( ( rule__ComponentInterface__Group_8__0 )? )
            // InternalComponentInterface.g:665:2: ( rule__ComponentInterface__Group_8__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8()); 
            // InternalComponentInterface.g:666:2: ( rule__ComponentInterface__Group_8__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentInterface.g:666:3: rule__ComponentInterface__Group_8__0
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
    // InternalComponentInterface.g:674:1: rule__ComponentInterface__Group__9 : rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 ;
    public final void rule__ComponentInterface__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:678:1: ( rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10 )
            // InternalComponentInterface.g:679:2: rule__ComponentInterface__Group__9__Impl rule__ComponentInterface__Group__10
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
    // InternalComponentInterface.g:686:1: rule__ComponentInterface__Group__9__Impl : ( ( rule__ComponentInterface__Group_9__0 )? ) ;
    public final void rule__ComponentInterface__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:690:1: ( ( ( rule__ComponentInterface__Group_9__0 )? ) )
            // InternalComponentInterface.g:691:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            {
            // InternalComponentInterface.g:691:1: ( ( rule__ComponentInterface__Group_9__0 )? )
            // InternalComponentInterface.g:692:2: ( rule__ComponentInterface__Group_9__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9()); 
            // InternalComponentInterface.g:693:2: ( rule__ComponentInterface__Group_9__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:693:3: rule__ComponentInterface__Group_9__0
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
    // InternalComponentInterface.g:701:1: rule__ComponentInterface__Group__10 : rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 ;
    public final void rule__ComponentInterface__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:705:1: ( rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11 )
            // InternalComponentInterface.g:706:2: rule__ComponentInterface__Group__10__Impl rule__ComponentInterface__Group__11
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
    // InternalComponentInterface.g:713:1: rule__ComponentInterface__Group__10__Impl : ( ( rule__ComponentInterface__Group_10__0 )? ) ;
    public final void rule__ComponentInterface__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:717:1: ( ( ( rule__ComponentInterface__Group_10__0 )? ) )
            // InternalComponentInterface.g:718:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            {
            // InternalComponentInterface.g:718:1: ( ( rule__ComponentInterface__Group_10__0 )? )
            // InternalComponentInterface.g:719:2: ( rule__ComponentInterface__Group_10__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10()); 
            // InternalComponentInterface.g:720:2: ( rule__ComponentInterface__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentInterface.g:720:3: rule__ComponentInterface__Group_10__0
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
    // InternalComponentInterface.g:728:1: rule__ComponentInterface__Group__11 : rule__ComponentInterface__Group__11__Impl rule__ComponentInterface__Group__12 ;
    public final void rule__ComponentInterface__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:732:1: ( rule__ComponentInterface__Group__11__Impl rule__ComponentInterface__Group__12 )
            // InternalComponentInterface.g:733:2: rule__ComponentInterface__Group__11__Impl rule__ComponentInterface__Group__12
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
    // InternalComponentInterface.g:740:1: rule__ComponentInterface__Group__11__Impl : ( ( rule__ComponentInterface__Group_11__0 )? ) ;
    public final void rule__ComponentInterface__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:744:1: ( ( ( rule__ComponentInterface__Group_11__0 )? ) )
            // InternalComponentInterface.g:745:1: ( ( rule__ComponentInterface__Group_11__0 )? )
            {
            // InternalComponentInterface.g:745:1: ( ( rule__ComponentInterface__Group_11__0 )? )
            // InternalComponentInterface.g:746:2: ( rule__ComponentInterface__Group_11__0 )?
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_11()); 
            // InternalComponentInterface.g:747:2: ( rule__ComponentInterface__Group_11__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentInterface.g:747:3: rule__ComponentInterface__Group_11__0
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
    // InternalComponentInterface.g:755:1: rule__ComponentInterface__Group__12 : rule__ComponentInterface__Group__12__Impl ;
    public final void rule__ComponentInterface__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:759:1: ( rule__ComponentInterface__Group__12__Impl )
            // InternalComponentInterface.g:760:2: rule__ComponentInterface__Group__12__Impl
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
    // InternalComponentInterface.g:766:1: rule__ComponentInterface__Group__12__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:770:1: ( ( '}' ) )
            // InternalComponentInterface.g:771:1: ( '}' )
            {
            // InternalComponentInterface.g:771:1: ( '}' )
            // InternalComponentInterface.g:772:2: '}'
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
    // InternalComponentInterface.g:782:1: rule__ComponentInterface__Group_4__0 : rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 ;
    public final void rule__ComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:786:1: ( rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1 )
            // InternalComponentInterface.g:787:2: rule__ComponentInterface__Group_4__0__Impl rule__ComponentInterface__Group_4__1
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
    // InternalComponentInterface.g:794:1: rule__ComponentInterface__Group_4__0__Impl : ( 'NameSpace' ) ;
    public final void rule__ComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:798:1: ( ( 'NameSpace' ) )
            // InternalComponentInterface.g:799:1: ( 'NameSpace' )
            {
            // InternalComponentInterface.g:799:1: ( 'NameSpace' )
            // InternalComponentInterface.g:800:2: 'NameSpace'
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
    // InternalComponentInterface.g:809:1: rule__ComponentInterface__Group_4__1 : rule__ComponentInterface__Group_4__1__Impl ;
    public final void rule__ComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:813:1: ( rule__ComponentInterface__Group_4__1__Impl )
            // InternalComponentInterface.g:814:2: rule__ComponentInterface__Group_4__1__Impl
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
    // InternalComponentInterface.g:820:1: rule__ComponentInterface__Group_4__1__Impl : ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) ;
    public final void rule__ComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:824:1: ( ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) ) )
            // InternalComponentInterface.g:825:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:825:1: ( ( rule__ComponentInterface__NameSpaceAssignment_4_1 ) )
            // InternalComponentInterface.g:826:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getNameSpaceAssignment_4_1()); 
            // InternalComponentInterface.g:827:2: ( rule__ComponentInterface__NameSpaceAssignment_4_1 )
            // InternalComponentInterface.g:827:3: rule__ComponentInterface__NameSpaceAssignment_4_1
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
    // InternalComponentInterface.g:836:1: rule__ComponentInterface__Group_5__0 : rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 ;
    public final void rule__ComponentInterface__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:840:1: ( rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1 )
            // InternalComponentInterface.g:841:2: rule__ComponentInterface__Group_5__0__Impl rule__ComponentInterface__Group_5__1
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
    // InternalComponentInterface.g:848:1: rule__ComponentInterface__Group_5__0__Impl : ( 'RosPublishers' ) ;
    public final void rule__ComponentInterface__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:852:1: ( ( 'RosPublishers' ) )
            // InternalComponentInterface.g:853:1: ( 'RosPublishers' )
            {
            // InternalComponentInterface.g:853:1: ( 'RosPublishers' )
            // InternalComponentInterface.g:854:2: 'RosPublishers'
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
    // InternalComponentInterface.g:863:1: rule__ComponentInterface__Group_5__1 : rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 ;
    public final void rule__ComponentInterface__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:867:1: ( rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2 )
            // InternalComponentInterface.g:868:2: rule__ComponentInterface__Group_5__1__Impl rule__ComponentInterface__Group_5__2
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
    // InternalComponentInterface.g:875:1: rule__ComponentInterface__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:879:1: ( ( '{' ) )
            // InternalComponentInterface.g:880:1: ( '{' )
            {
            // InternalComponentInterface.g:880:1: ( '{' )
            // InternalComponentInterface.g:881:2: '{'
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
    // InternalComponentInterface.g:890:1: rule__ComponentInterface__Group_5__2 : rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 ;
    public final void rule__ComponentInterface__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:894:1: ( rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3 )
            // InternalComponentInterface.g:895:2: rule__ComponentInterface__Group_5__2__Impl rule__ComponentInterface__Group_5__3
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
    // InternalComponentInterface.g:902:1: rule__ComponentInterface__Group_5__2__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) ;
    public final void rule__ComponentInterface__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:906:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) ) )
            // InternalComponentInterface.g:907:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            {
            // InternalComponentInterface.g:907:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_2 ) )
            // InternalComponentInterface.g:908:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_2()); 
            // InternalComponentInterface.g:909:2: ( rule__ComponentInterface__RospublisherAssignment_5_2 )
            // InternalComponentInterface.g:909:3: rule__ComponentInterface__RospublisherAssignment_5_2
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
    // InternalComponentInterface.g:917:1: rule__ComponentInterface__Group_5__3 : rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 ;
    public final void rule__ComponentInterface__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:921:1: ( rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4 )
            // InternalComponentInterface.g:922:2: rule__ComponentInterface__Group_5__3__Impl rule__ComponentInterface__Group_5__4
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
    // InternalComponentInterface.g:929:1: rule__ComponentInterface__Group_5__3__Impl : ( ( rule__ComponentInterface__Group_5_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:933:1: ( ( ( rule__ComponentInterface__Group_5_3__0 )* ) )
            // InternalComponentInterface.g:934:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            {
            // InternalComponentInterface.g:934:1: ( ( rule__ComponentInterface__Group_5_3__0 )* )
            // InternalComponentInterface.g:935:2: ( rule__ComponentInterface__Group_5_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_5_3()); 
            // InternalComponentInterface.g:936:2: ( rule__ComponentInterface__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:936:3: rule__ComponentInterface__Group_5_3__0
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
    // InternalComponentInterface.g:944:1: rule__ComponentInterface__Group_5__4 : rule__ComponentInterface__Group_5__4__Impl ;
    public final void rule__ComponentInterface__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:948:1: ( rule__ComponentInterface__Group_5__4__Impl )
            // InternalComponentInterface.g:949:2: rule__ComponentInterface__Group_5__4__Impl
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
    // InternalComponentInterface.g:955:1: rule__ComponentInterface__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:959:1: ( ( '}' ) )
            // InternalComponentInterface.g:960:1: ( '}' )
            {
            // InternalComponentInterface.g:960:1: ( '}' )
            // InternalComponentInterface.g:961:2: '}'
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
    // InternalComponentInterface.g:971:1: rule__ComponentInterface__Group_5_3__0 : rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 ;
    public final void rule__ComponentInterface__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:975:1: ( rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1 )
            // InternalComponentInterface.g:976:2: rule__ComponentInterface__Group_5_3__0__Impl rule__ComponentInterface__Group_5_3__1
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
    // InternalComponentInterface.g:983:1: rule__ComponentInterface__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:987:1: ( ( ',' ) )
            // InternalComponentInterface.g:988:1: ( ',' )
            {
            // InternalComponentInterface.g:988:1: ( ',' )
            // InternalComponentInterface.g:989:2: ','
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
    // InternalComponentInterface.g:998:1: rule__ComponentInterface__Group_5_3__1 : rule__ComponentInterface__Group_5_3__1__Impl ;
    public final void rule__ComponentInterface__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1002:1: ( rule__ComponentInterface__Group_5_3__1__Impl )
            // InternalComponentInterface.g:1003:2: rule__ComponentInterface__Group_5_3__1__Impl
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
    // InternalComponentInterface.g:1009:1: rule__ComponentInterface__Group_5_3__1__Impl : ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1013:1: ( ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) ) )
            // InternalComponentInterface.g:1014:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            {
            // InternalComponentInterface.g:1014:1: ( ( rule__ComponentInterface__RospublisherAssignment_5_3_1 ) )
            // InternalComponentInterface.g:1015:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRospublisherAssignment_5_3_1()); 
            // InternalComponentInterface.g:1016:2: ( rule__ComponentInterface__RospublisherAssignment_5_3_1 )
            // InternalComponentInterface.g:1016:3: rule__ComponentInterface__RospublisherAssignment_5_3_1
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
    // InternalComponentInterface.g:1025:1: rule__ComponentInterface__Group_6__0 : rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 ;
    public final void rule__ComponentInterface__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1029:1: ( rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1 )
            // InternalComponentInterface.g:1030:2: rule__ComponentInterface__Group_6__0__Impl rule__ComponentInterface__Group_6__1
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
    // InternalComponentInterface.g:1037:1: rule__ComponentInterface__Group_6__0__Impl : ( 'RosSubscribers' ) ;
    public final void rule__ComponentInterface__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1041:1: ( ( 'RosSubscribers' ) )
            // InternalComponentInterface.g:1042:1: ( 'RosSubscribers' )
            {
            // InternalComponentInterface.g:1042:1: ( 'RosSubscribers' )
            // InternalComponentInterface.g:1043:2: 'RosSubscribers'
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
    // InternalComponentInterface.g:1052:1: rule__ComponentInterface__Group_6__1 : rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 ;
    public final void rule__ComponentInterface__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1056:1: ( rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2 )
            // InternalComponentInterface.g:1057:2: rule__ComponentInterface__Group_6__1__Impl rule__ComponentInterface__Group_6__2
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
    // InternalComponentInterface.g:1064:1: rule__ComponentInterface__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1068:1: ( ( '{' ) )
            // InternalComponentInterface.g:1069:1: ( '{' )
            {
            // InternalComponentInterface.g:1069:1: ( '{' )
            // InternalComponentInterface.g:1070:2: '{'
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
    // InternalComponentInterface.g:1079:1: rule__ComponentInterface__Group_6__2 : rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 ;
    public final void rule__ComponentInterface__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1083:1: ( rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3 )
            // InternalComponentInterface.g:1084:2: rule__ComponentInterface__Group_6__2__Impl rule__ComponentInterface__Group_6__3
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
    // InternalComponentInterface.g:1091:1: rule__ComponentInterface__Group_6__2__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) ;
    public final void rule__ComponentInterface__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1095:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) ) )
            // InternalComponentInterface.g:1096:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            {
            // InternalComponentInterface.g:1096:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_2 ) )
            // InternalComponentInterface.g:1097:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_2()); 
            // InternalComponentInterface.g:1098:2: ( rule__ComponentInterface__RossubscriberAssignment_6_2 )
            // InternalComponentInterface.g:1098:3: rule__ComponentInterface__RossubscriberAssignment_6_2
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
    // InternalComponentInterface.g:1106:1: rule__ComponentInterface__Group_6__3 : rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 ;
    public final void rule__ComponentInterface__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1110:1: ( rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4 )
            // InternalComponentInterface.g:1111:2: rule__ComponentInterface__Group_6__3__Impl rule__ComponentInterface__Group_6__4
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
    // InternalComponentInterface.g:1118:1: rule__ComponentInterface__Group_6__3__Impl : ( ( rule__ComponentInterface__Group_6_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1122:1: ( ( ( rule__ComponentInterface__Group_6_3__0 )* ) )
            // InternalComponentInterface.g:1123:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            {
            // InternalComponentInterface.g:1123:1: ( ( rule__ComponentInterface__Group_6_3__0 )* )
            // InternalComponentInterface.g:1124:2: ( rule__ComponentInterface__Group_6_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_6_3()); 
            // InternalComponentInterface.g:1125:2: ( rule__ComponentInterface__Group_6_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentInterface.g:1125:3: rule__ComponentInterface__Group_6_3__0
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
    // InternalComponentInterface.g:1133:1: rule__ComponentInterface__Group_6__4 : rule__ComponentInterface__Group_6__4__Impl ;
    public final void rule__ComponentInterface__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1137:1: ( rule__ComponentInterface__Group_6__4__Impl )
            // InternalComponentInterface.g:1138:2: rule__ComponentInterface__Group_6__4__Impl
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
    // InternalComponentInterface.g:1144:1: rule__ComponentInterface__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1148:1: ( ( '}' ) )
            // InternalComponentInterface.g:1149:1: ( '}' )
            {
            // InternalComponentInterface.g:1149:1: ( '}' )
            // InternalComponentInterface.g:1150:2: '}'
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
    // InternalComponentInterface.g:1160:1: rule__ComponentInterface__Group_6_3__0 : rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 ;
    public final void rule__ComponentInterface__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1164:1: ( rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1 )
            // InternalComponentInterface.g:1165:2: rule__ComponentInterface__Group_6_3__0__Impl rule__ComponentInterface__Group_6_3__1
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
    // InternalComponentInterface.g:1172:1: rule__ComponentInterface__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1176:1: ( ( ',' ) )
            // InternalComponentInterface.g:1177:1: ( ',' )
            {
            // InternalComponentInterface.g:1177:1: ( ',' )
            // InternalComponentInterface.g:1178:2: ','
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
    // InternalComponentInterface.g:1187:1: rule__ComponentInterface__Group_6_3__1 : rule__ComponentInterface__Group_6_3__1__Impl ;
    public final void rule__ComponentInterface__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1191:1: ( rule__ComponentInterface__Group_6_3__1__Impl )
            // InternalComponentInterface.g:1192:2: rule__ComponentInterface__Group_6_3__1__Impl
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
    // InternalComponentInterface.g:1198:1: rule__ComponentInterface__Group_6_3__1__Impl : ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1202:1: ( ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) ) )
            // InternalComponentInterface.g:1203:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            {
            // InternalComponentInterface.g:1203:1: ( ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 ) )
            // InternalComponentInterface.g:1204:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRossubscriberAssignment_6_3_1()); 
            // InternalComponentInterface.g:1205:2: ( rule__ComponentInterface__RossubscriberAssignment_6_3_1 )
            // InternalComponentInterface.g:1205:3: rule__ComponentInterface__RossubscriberAssignment_6_3_1
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
    // InternalComponentInterface.g:1214:1: rule__ComponentInterface__Group_7__0 : rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 ;
    public final void rule__ComponentInterface__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1218:1: ( rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1 )
            // InternalComponentInterface.g:1219:2: rule__ComponentInterface__Group_7__0__Impl rule__ComponentInterface__Group_7__1
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
    // InternalComponentInterface.g:1226:1: rule__ComponentInterface__Group_7__0__Impl : ( 'RosSrvServers' ) ;
    public final void rule__ComponentInterface__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1230:1: ( ( 'RosSrvServers' ) )
            // InternalComponentInterface.g:1231:1: ( 'RosSrvServers' )
            {
            // InternalComponentInterface.g:1231:1: ( 'RosSrvServers' )
            // InternalComponentInterface.g:1232:2: 'RosSrvServers'
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
    // InternalComponentInterface.g:1241:1: rule__ComponentInterface__Group_7__1 : rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 ;
    public final void rule__ComponentInterface__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1245:1: ( rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2 )
            // InternalComponentInterface.g:1246:2: rule__ComponentInterface__Group_7__1__Impl rule__ComponentInterface__Group_7__2
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
    // InternalComponentInterface.g:1253:1: rule__ComponentInterface__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1257:1: ( ( '{' ) )
            // InternalComponentInterface.g:1258:1: ( '{' )
            {
            // InternalComponentInterface.g:1258:1: ( '{' )
            // InternalComponentInterface.g:1259:2: '{'
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
    // InternalComponentInterface.g:1268:1: rule__ComponentInterface__Group_7__2 : rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 ;
    public final void rule__ComponentInterface__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1272:1: ( rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3 )
            // InternalComponentInterface.g:1273:2: rule__ComponentInterface__Group_7__2__Impl rule__ComponentInterface__Group_7__3
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
    // InternalComponentInterface.g:1280:1: rule__ComponentInterface__Group_7__2__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) ;
    public final void rule__ComponentInterface__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1284:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) ) )
            // InternalComponentInterface.g:1285:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            {
            // InternalComponentInterface.g:1285:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_2 ) )
            // InternalComponentInterface.g:1286:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_2()); 
            // InternalComponentInterface.g:1287:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_2 )
            // InternalComponentInterface.g:1287:3: rule__ComponentInterface__RosserviceserverAssignment_7_2
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
    // InternalComponentInterface.g:1295:1: rule__ComponentInterface__Group_7__3 : rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 ;
    public final void rule__ComponentInterface__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1299:1: ( rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4 )
            // InternalComponentInterface.g:1300:2: rule__ComponentInterface__Group_7__3__Impl rule__ComponentInterface__Group_7__4
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
    // InternalComponentInterface.g:1307:1: rule__ComponentInterface__Group_7__3__Impl : ( ( rule__ComponentInterface__Group_7_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1311:1: ( ( ( rule__ComponentInterface__Group_7_3__0 )* ) )
            // InternalComponentInterface.g:1312:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            {
            // InternalComponentInterface.g:1312:1: ( ( rule__ComponentInterface__Group_7_3__0 )* )
            // InternalComponentInterface.g:1313:2: ( rule__ComponentInterface__Group_7_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_7_3()); 
            // InternalComponentInterface.g:1314:2: ( rule__ComponentInterface__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentInterface.g:1314:3: rule__ComponentInterface__Group_7_3__0
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
    // InternalComponentInterface.g:1322:1: rule__ComponentInterface__Group_7__4 : rule__ComponentInterface__Group_7__4__Impl ;
    public final void rule__ComponentInterface__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1326:1: ( rule__ComponentInterface__Group_7__4__Impl )
            // InternalComponentInterface.g:1327:2: rule__ComponentInterface__Group_7__4__Impl
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
    // InternalComponentInterface.g:1333:1: rule__ComponentInterface__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1337:1: ( ( '}' ) )
            // InternalComponentInterface.g:1338:1: ( '}' )
            {
            // InternalComponentInterface.g:1338:1: ( '}' )
            // InternalComponentInterface.g:1339:2: '}'
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
    // InternalComponentInterface.g:1349:1: rule__ComponentInterface__Group_7_3__0 : rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 ;
    public final void rule__ComponentInterface__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1353:1: ( rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1 )
            // InternalComponentInterface.g:1354:2: rule__ComponentInterface__Group_7_3__0__Impl rule__ComponentInterface__Group_7_3__1
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
    // InternalComponentInterface.g:1361:1: rule__ComponentInterface__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1365:1: ( ( ',' ) )
            // InternalComponentInterface.g:1366:1: ( ',' )
            {
            // InternalComponentInterface.g:1366:1: ( ',' )
            // InternalComponentInterface.g:1367:2: ','
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
    // InternalComponentInterface.g:1376:1: rule__ComponentInterface__Group_7_3__1 : rule__ComponentInterface__Group_7_3__1__Impl ;
    public final void rule__ComponentInterface__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1380:1: ( rule__ComponentInterface__Group_7_3__1__Impl )
            // InternalComponentInterface.g:1381:2: rule__ComponentInterface__Group_7_3__1__Impl
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
    // InternalComponentInterface.g:1387:1: rule__ComponentInterface__Group_7_3__1__Impl : ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1391:1: ( ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) ) )
            // InternalComponentInterface.g:1392:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            {
            // InternalComponentInterface.g:1392:1: ( ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 ) )
            // InternalComponentInterface.g:1393:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceserverAssignment_7_3_1()); 
            // InternalComponentInterface.g:1394:2: ( rule__ComponentInterface__RosserviceserverAssignment_7_3_1 )
            // InternalComponentInterface.g:1394:3: rule__ComponentInterface__RosserviceserverAssignment_7_3_1
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
    // InternalComponentInterface.g:1403:1: rule__ComponentInterface__Group_8__0 : rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 ;
    public final void rule__ComponentInterface__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1407:1: ( rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1 )
            // InternalComponentInterface.g:1408:2: rule__ComponentInterface__Group_8__0__Impl rule__ComponentInterface__Group_8__1
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
    // InternalComponentInterface.g:1415:1: rule__ComponentInterface__Group_8__0__Impl : ( 'RosSrvClients' ) ;
    public final void rule__ComponentInterface__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1419:1: ( ( 'RosSrvClients' ) )
            // InternalComponentInterface.g:1420:1: ( 'RosSrvClients' )
            {
            // InternalComponentInterface.g:1420:1: ( 'RosSrvClients' )
            // InternalComponentInterface.g:1421:2: 'RosSrvClients'
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
    // InternalComponentInterface.g:1430:1: rule__ComponentInterface__Group_8__1 : rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 ;
    public final void rule__ComponentInterface__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1434:1: ( rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2 )
            // InternalComponentInterface.g:1435:2: rule__ComponentInterface__Group_8__1__Impl rule__ComponentInterface__Group_8__2
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
    // InternalComponentInterface.g:1442:1: rule__ComponentInterface__Group_8__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1446:1: ( ( '{' ) )
            // InternalComponentInterface.g:1447:1: ( '{' )
            {
            // InternalComponentInterface.g:1447:1: ( '{' )
            // InternalComponentInterface.g:1448:2: '{'
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
    // InternalComponentInterface.g:1457:1: rule__ComponentInterface__Group_8__2 : rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 ;
    public final void rule__ComponentInterface__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1461:1: ( rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3 )
            // InternalComponentInterface.g:1462:2: rule__ComponentInterface__Group_8__2__Impl rule__ComponentInterface__Group_8__3
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
    // InternalComponentInterface.g:1469:1: rule__ComponentInterface__Group_8__2__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) ;
    public final void rule__ComponentInterface__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1473:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) ) )
            // InternalComponentInterface.g:1474:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            {
            // InternalComponentInterface.g:1474:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_2 ) )
            // InternalComponentInterface.g:1475:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_2()); 
            // InternalComponentInterface.g:1476:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_2 )
            // InternalComponentInterface.g:1476:3: rule__ComponentInterface__RosserviceclientAssignment_8_2
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
    // InternalComponentInterface.g:1484:1: rule__ComponentInterface__Group_8__3 : rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 ;
    public final void rule__ComponentInterface__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1488:1: ( rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4 )
            // InternalComponentInterface.g:1489:2: rule__ComponentInterface__Group_8__3__Impl rule__ComponentInterface__Group_8__4
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
    // InternalComponentInterface.g:1496:1: rule__ComponentInterface__Group_8__3__Impl : ( ( rule__ComponentInterface__Group_8_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1500:1: ( ( ( rule__ComponentInterface__Group_8_3__0 )* ) )
            // InternalComponentInterface.g:1501:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            {
            // InternalComponentInterface.g:1501:1: ( ( rule__ComponentInterface__Group_8_3__0 )* )
            // InternalComponentInterface.g:1502:2: ( rule__ComponentInterface__Group_8_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_8_3()); 
            // InternalComponentInterface.g:1503:2: ( rule__ComponentInterface__Group_8_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentInterface.g:1503:3: rule__ComponentInterface__Group_8_3__0
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
    // InternalComponentInterface.g:1511:1: rule__ComponentInterface__Group_8__4 : rule__ComponentInterface__Group_8__4__Impl ;
    public final void rule__ComponentInterface__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1515:1: ( rule__ComponentInterface__Group_8__4__Impl )
            // InternalComponentInterface.g:1516:2: rule__ComponentInterface__Group_8__4__Impl
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
    // InternalComponentInterface.g:1522:1: rule__ComponentInterface__Group_8__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1526:1: ( ( '}' ) )
            // InternalComponentInterface.g:1527:1: ( '}' )
            {
            // InternalComponentInterface.g:1527:1: ( '}' )
            // InternalComponentInterface.g:1528:2: '}'
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
    // InternalComponentInterface.g:1538:1: rule__ComponentInterface__Group_8_3__0 : rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 ;
    public final void rule__ComponentInterface__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1542:1: ( rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1 )
            // InternalComponentInterface.g:1543:2: rule__ComponentInterface__Group_8_3__0__Impl rule__ComponentInterface__Group_8_3__1
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
    // InternalComponentInterface.g:1550:1: rule__ComponentInterface__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1554:1: ( ( ',' ) )
            // InternalComponentInterface.g:1555:1: ( ',' )
            {
            // InternalComponentInterface.g:1555:1: ( ',' )
            // InternalComponentInterface.g:1556:2: ','
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
    // InternalComponentInterface.g:1565:1: rule__ComponentInterface__Group_8_3__1 : rule__ComponentInterface__Group_8_3__1__Impl ;
    public final void rule__ComponentInterface__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1569:1: ( rule__ComponentInterface__Group_8_3__1__Impl )
            // InternalComponentInterface.g:1570:2: rule__ComponentInterface__Group_8_3__1__Impl
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
    // InternalComponentInterface.g:1576:1: rule__ComponentInterface__Group_8_3__1__Impl : ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1580:1: ( ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) ) )
            // InternalComponentInterface.g:1581:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            {
            // InternalComponentInterface.g:1581:1: ( ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 ) )
            // InternalComponentInterface.g:1582:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosserviceclientAssignment_8_3_1()); 
            // InternalComponentInterface.g:1583:2: ( rule__ComponentInterface__RosserviceclientAssignment_8_3_1 )
            // InternalComponentInterface.g:1583:3: rule__ComponentInterface__RosserviceclientAssignment_8_3_1
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
    // InternalComponentInterface.g:1592:1: rule__ComponentInterface__Group_9__0 : rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 ;
    public final void rule__ComponentInterface__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1596:1: ( rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1 )
            // InternalComponentInterface.g:1597:2: rule__ComponentInterface__Group_9__0__Impl rule__ComponentInterface__Group_9__1
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
    // InternalComponentInterface.g:1604:1: rule__ComponentInterface__Group_9__0__Impl : ( 'RosActionServers' ) ;
    public final void rule__ComponentInterface__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1608:1: ( ( 'RosActionServers' ) )
            // InternalComponentInterface.g:1609:1: ( 'RosActionServers' )
            {
            // InternalComponentInterface.g:1609:1: ( 'RosActionServers' )
            // InternalComponentInterface.g:1610:2: 'RosActionServers'
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
    // InternalComponentInterface.g:1619:1: rule__ComponentInterface__Group_9__1 : rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 ;
    public final void rule__ComponentInterface__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1623:1: ( rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2 )
            // InternalComponentInterface.g:1624:2: rule__ComponentInterface__Group_9__1__Impl rule__ComponentInterface__Group_9__2
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
    // InternalComponentInterface.g:1631:1: rule__ComponentInterface__Group_9__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1635:1: ( ( '{' ) )
            // InternalComponentInterface.g:1636:1: ( '{' )
            {
            // InternalComponentInterface.g:1636:1: ( '{' )
            // InternalComponentInterface.g:1637:2: '{'
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
    // InternalComponentInterface.g:1646:1: rule__ComponentInterface__Group_9__2 : rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 ;
    public final void rule__ComponentInterface__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1650:1: ( rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3 )
            // InternalComponentInterface.g:1651:2: rule__ComponentInterface__Group_9__2__Impl rule__ComponentInterface__Group_9__3
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
    // InternalComponentInterface.g:1658:1: rule__ComponentInterface__Group_9__2__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) ;
    public final void rule__ComponentInterface__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1662:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) ) )
            // InternalComponentInterface.g:1663:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            {
            // InternalComponentInterface.g:1663:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_2 ) )
            // InternalComponentInterface.g:1664:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_2()); 
            // InternalComponentInterface.g:1665:2: ( rule__ComponentInterface__RosactionserverAssignment_9_2 )
            // InternalComponentInterface.g:1665:3: rule__ComponentInterface__RosactionserverAssignment_9_2
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
    // InternalComponentInterface.g:1673:1: rule__ComponentInterface__Group_9__3 : rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 ;
    public final void rule__ComponentInterface__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1677:1: ( rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4 )
            // InternalComponentInterface.g:1678:2: rule__ComponentInterface__Group_9__3__Impl rule__ComponentInterface__Group_9__4
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
    // InternalComponentInterface.g:1685:1: rule__ComponentInterface__Group_9__3__Impl : ( ( rule__ComponentInterface__Group_9_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1689:1: ( ( ( rule__ComponentInterface__Group_9_3__0 )* ) )
            // InternalComponentInterface.g:1690:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            {
            // InternalComponentInterface.g:1690:1: ( ( rule__ComponentInterface__Group_9_3__0 )* )
            // InternalComponentInterface.g:1691:2: ( rule__ComponentInterface__Group_9_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_9_3()); 
            // InternalComponentInterface.g:1692:2: ( rule__ComponentInterface__Group_9_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentInterface.g:1692:3: rule__ComponentInterface__Group_9_3__0
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
    // InternalComponentInterface.g:1700:1: rule__ComponentInterface__Group_9__4 : rule__ComponentInterface__Group_9__4__Impl ;
    public final void rule__ComponentInterface__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1704:1: ( rule__ComponentInterface__Group_9__4__Impl )
            // InternalComponentInterface.g:1705:2: rule__ComponentInterface__Group_9__4__Impl
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
    // InternalComponentInterface.g:1711:1: rule__ComponentInterface__Group_9__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1715:1: ( ( '}' ) )
            // InternalComponentInterface.g:1716:1: ( '}' )
            {
            // InternalComponentInterface.g:1716:1: ( '}' )
            // InternalComponentInterface.g:1717:2: '}'
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
    // InternalComponentInterface.g:1727:1: rule__ComponentInterface__Group_9_3__0 : rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 ;
    public final void rule__ComponentInterface__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1731:1: ( rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1 )
            // InternalComponentInterface.g:1732:2: rule__ComponentInterface__Group_9_3__0__Impl rule__ComponentInterface__Group_9_3__1
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
    // InternalComponentInterface.g:1739:1: rule__ComponentInterface__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1743:1: ( ( ',' ) )
            // InternalComponentInterface.g:1744:1: ( ',' )
            {
            // InternalComponentInterface.g:1744:1: ( ',' )
            // InternalComponentInterface.g:1745:2: ','
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
    // InternalComponentInterface.g:1754:1: rule__ComponentInterface__Group_9_3__1 : rule__ComponentInterface__Group_9_3__1__Impl ;
    public final void rule__ComponentInterface__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1758:1: ( rule__ComponentInterface__Group_9_3__1__Impl )
            // InternalComponentInterface.g:1759:2: rule__ComponentInterface__Group_9_3__1__Impl
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
    // InternalComponentInterface.g:1765:1: rule__ComponentInterface__Group_9_3__1__Impl : ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1769:1: ( ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) ) )
            // InternalComponentInterface.g:1770:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            {
            // InternalComponentInterface.g:1770:1: ( ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 ) )
            // InternalComponentInterface.g:1771:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionserverAssignment_9_3_1()); 
            // InternalComponentInterface.g:1772:2: ( rule__ComponentInterface__RosactionserverAssignment_9_3_1 )
            // InternalComponentInterface.g:1772:3: rule__ComponentInterface__RosactionserverAssignment_9_3_1
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
    // InternalComponentInterface.g:1781:1: rule__ComponentInterface__Group_10__0 : rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 ;
    public final void rule__ComponentInterface__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1785:1: ( rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1 )
            // InternalComponentInterface.g:1786:2: rule__ComponentInterface__Group_10__0__Impl rule__ComponentInterface__Group_10__1
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
    // InternalComponentInterface.g:1793:1: rule__ComponentInterface__Group_10__0__Impl : ( 'RosActionClients' ) ;
    public final void rule__ComponentInterface__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1797:1: ( ( 'RosActionClients' ) )
            // InternalComponentInterface.g:1798:1: ( 'RosActionClients' )
            {
            // InternalComponentInterface.g:1798:1: ( 'RosActionClients' )
            // InternalComponentInterface.g:1799:2: 'RosActionClients'
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
    // InternalComponentInterface.g:1808:1: rule__ComponentInterface__Group_10__1 : rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 ;
    public final void rule__ComponentInterface__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1812:1: ( rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2 )
            // InternalComponentInterface.g:1813:2: rule__ComponentInterface__Group_10__1__Impl rule__ComponentInterface__Group_10__2
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
    // InternalComponentInterface.g:1820:1: rule__ComponentInterface__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1824:1: ( ( '{' ) )
            // InternalComponentInterface.g:1825:1: ( '{' )
            {
            // InternalComponentInterface.g:1825:1: ( '{' )
            // InternalComponentInterface.g:1826:2: '{'
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
    // InternalComponentInterface.g:1835:1: rule__ComponentInterface__Group_10__2 : rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 ;
    public final void rule__ComponentInterface__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1839:1: ( rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3 )
            // InternalComponentInterface.g:1840:2: rule__ComponentInterface__Group_10__2__Impl rule__ComponentInterface__Group_10__3
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
    // InternalComponentInterface.g:1847:1: rule__ComponentInterface__Group_10__2__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) ;
    public final void rule__ComponentInterface__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1851:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) ) )
            // InternalComponentInterface.g:1852:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            {
            // InternalComponentInterface.g:1852:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_2 ) )
            // InternalComponentInterface.g:1853:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_2()); 
            // InternalComponentInterface.g:1854:2: ( rule__ComponentInterface__RosactionclientAssignment_10_2 )
            // InternalComponentInterface.g:1854:3: rule__ComponentInterface__RosactionclientAssignment_10_2
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
    // InternalComponentInterface.g:1862:1: rule__ComponentInterface__Group_10__3 : rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 ;
    public final void rule__ComponentInterface__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1866:1: ( rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4 )
            // InternalComponentInterface.g:1867:2: rule__ComponentInterface__Group_10__3__Impl rule__ComponentInterface__Group_10__4
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
    // InternalComponentInterface.g:1874:1: rule__ComponentInterface__Group_10__3__Impl : ( ( rule__ComponentInterface__Group_10_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1878:1: ( ( ( rule__ComponentInterface__Group_10_3__0 )* ) )
            // InternalComponentInterface.g:1879:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            {
            // InternalComponentInterface.g:1879:1: ( ( rule__ComponentInterface__Group_10_3__0 )* )
            // InternalComponentInterface.g:1880:2: ( rule__ComponentInterface__Group_10_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_10_3()); 
            // InternalComponentInterface.g:1881:2: ( rule__ComponentInterface__Group_10_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComponentInterface.g:1881:3: rule__ComponentInterface__Group_10_3__0
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
    // InternalComponentInterface.g:1889:1: rule__ComponentInterface__Group_10__4 : rule__ComponentInterface__Group_10__4__Impl ;
    public final void rule__ComponentInterface__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1893:1: ( rule__ComponentInterface__Group_10__4__Impl )
            // InternalComponentInterface.g:1894:2: rule__ComponentInterface__Group_10__4__Impl
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
    // InternalComponentInterface.g:1900:1: rule__ComponentInterface__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1904:1: ( ( '}' ) )
            // InternalComponentInterface.g:1905:1: ( '}' )
            {
            // InternalComponentInterface.g:1905:1: ( '}' )
            // InternalComponentInterface.g:1906:2: '}'
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
    // InternalComponentInterface.g:1916:1: rule__ComponentInterface__Group_10_3__0 : rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 ;
    public final void rule__ComponentInterface__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1920:1: ( rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1 )
            // InternalComponentInterface.g:1921:2: rule__ComponentInterface__Group_10_3__0__Impl rule__ComponentInterface__Group_10_3__1
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
    // InternalComponentInterface.g:1928:1: rule__ComponentInterface__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1932:1: ( ( ',' ) )
            // InternalComponentInterface.g:1933:1: ( ',' )
            {
            // InternalComponentInterface.g:1933:1: ( ',' )
            // InternalComponentInterface.g:1934:2: ','
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
    // InternalComponentInterface.g:1943:1: rule__ComponentInterface__Group_10_3__1 : rule__ComponentInterface__Group_10_3__1__Impl ;
    public final void rule__ComponentInterface__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1947:1: ( rule__ComponentInterface__Group_10_3__1__Impl )
            // InternalComponentInterface.g:1948:2: rule__ComponentInterface__Group_10_3__1__Impl
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
    // InternalComponentInterface.g:1954:1: rule__ComponentInterface__Group_10_3__1__Impl : ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1958:1: ( ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) ) )
            // InternalComponentInterface.g:1959:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            {
            // InternalComponentInterface.g:1959:1: ( ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 ) )
            // InternalComponentInterface.g:1960:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosactionclientAssignment_10_3_1()); 
            // InternalComponentInterface.g:1961:2: ( rule__ComponentInterface__RosactionclientAssignment_10_3_1 )
            // InternalComponentInterface.g:1961:3: rule__ComponentInterface__RosactionclientAssignment_10_3_1
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
    // InternalComponentInterface.g:1970:1: rule__ComponentInterface__Group_11__0 : rule__ComponentInterface__Group_11__0__Impl rule__ComponentInterface__Group_11__1 ;
    public final void rule__ComponentInterface__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1974:1: ( rule__ComponentInterface__Group_11__0__Impl rule__ComponentInterface__Group_11__1 )
            // InternalComponentInterface.g:1975:2: rule__ComponentInterface__Group_11__0__Impl rule__ComponentInterface__Group_11__1
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
    // InternalComponentInterface.g:1982:1: rule__ComponentInterface__Group_11__0__Impl : ( 'RosParameters' ) ;
    public final void rule__ComponentInterface__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:1986:1: ( ( 'RosParameters' ) )
            // InternalComponentInterface.g:1987:1: ( 'RosParameters' )
            {
            // InternalComponentInterface.g:1987:1: ( 'RosParameters' )
            // InternalComponentInterface.g:1988:2: 'RosParameters'
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
    // InternalComponentInterface.g:1997:1: rule__ComponentInterface__Group_11__1 : rule__ComponentInterface__Group_11__1__Impl rule__ComponentInterface__Group_11__2 ;
    public final void rule__ComponentInterface__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2001:1: ( rule__ComponentInterface__Group_11__1__Impl rule__ComponentInterface__Group_11__2 )
            // InternalComponentInterface.g:2002:2: rule__ComponentInterface__Group_11__1__Impl rule__ComponentInterface__Group_11__2
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
    // InternalComponentInterface.g:2009:1: rule__ComponentInterface__Group_11__1__Impl : ( '{' ) ;
    public final void rule__ComponentInterface__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2013:1: ( ( '{' ) )
            // InternalComponentInterface.g:2014:1: ( '{' )
            {
            // InternalComponentInterface.g:2014:1: ( '{' )
            // InternalComponentInterface.g:2015:2: '{'
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
    // InternalComponentInterface.g:2024:1: rule__ComponentInterface__Group_11__2 : rule__ComponentInterface__Group_11__2__Impl rule__ComponentInterface__Group_11__3 ;
    public final void rule__ComponentInterface__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2028:1: ( rule__ComponentInterface__Group_11__2__Impl rule__ComponentInterface__Group_11__3 )
            // InternalComponentInterface.g:2029:2: rule__ComponentInterface__Group_11__2__Impl rule__ComponentInterface__Group_11__3
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
    // InternalComponentInterface.g:2036:1: rule__ComponentInterface__Group_11__2__Impl : ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) ) ;
    public final void rule__ComponentInterface__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2040:1: ( ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) ) )
            // InternalComponentInterface.g:2041:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) )
            {
            // InternalComponentInterface.g:2041:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_2 ) )
            // InternalComponentInterface.g:2042:2: ( rule__ComponentInterface__RosparameterAssignment_11_2 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_11_2()); 
            // InternalComponentInterface.g:2043:2: ( rule__ComponentInterface__RosparameterAssignment_11_2 )
            // InternalComponentInterface.g:2043:3: rule__ComponentInterface__RosparameterAssignment_11_2
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
    // InternalComponentInterface.g:2051:1: rule__ComponentInterface__Group_11__3 : rule__ComponentInterface__Group_11__3__Impl rule__ComponentInterface__Group_11__4 ;
    public final void rule__ComponentInterface__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2055:1: ( rule__ComponentInterface__Group_11__3__Impl rule__ComponentInterface__Group_11__4 )
            // InternalComponentInterface.g:2056:2: rule__ComponentInterface__Group_11__3__Impl rule__ComponentInterface__Group_11__4
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
    // InternalComponentInterface.g:2063:1: rule__ComponentInterface__Group_11__3__Impl : ( ( rule__ComponentInterface__Group_11_3__0 )* ) ;
    public final void rule__ComponentInterface__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2067:1: ( ( ( rule__ComponentInterface__Group_11_3__0 )* ) )
            // InternalComponentInterface.g:2068:1: ( ( rule__ComponentInterface__Group_11_3__0 )* )
            {
            // InternalComponentInterface.g:2068:1: ( ( rule__ComponentInterface__Group_11_3__0 )* )
            // InternalComponentInterface.g:2069:2: ( rule__ComponentInterface__Group_11_3__0 )*
            {
             before(grammarAccess.getComponentInterfaceAccess().getGroup_11_3()); 
            // InternalComponentInterface.g:2070:2: ( rule__ComponentInterface__Group_11_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentInterface.g:2070:3: rule__ComponentInterface__Group_11_3__0
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
    // InternalComponentInterface.g:2078:1: rule__ComponentInterface__Group_11__4 : rule__ComponentInterface__Group_11__4__Impl ;
    public final void rule__ComponentInterface__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2082:1: ( rule__ComponentInterface__Group_11__4__Impl )
            // InternalComponentInterface.g:2083:2: rule__ComponentInterface__Group_11__4__Impl
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
    // InternalComponentInterface.g:2089:1: rule__ComponentInterface__Group_11__4__Impl : ( '}' ) ;
    public final void rule__ComponentInterface__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2093:1: ( ( '}' ) )
            // InternalComponentInterface.g:2094:1: ( '}' )
            {
            // InternalComponentInterface.g:2094:1: ( '}' )
            // InternalComponentInterface.g:2095:2: '}'
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
    // InternalComponentInterface.g:2105:1: rule__ComponentInterface__Group_11_3__0 : rule__ComponentInterface__Group_11_3__0__Impl rule__ComponentInterface__Group_11_3__1 ;
    public final void rule__ComponentInterface__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2109:1: ( rule__ComponentInterface__Group_11_3__0__Impl rule__ComponentInterface__Group_11_3__1 )
            // InternalComponentInterface.g:2110:2: rule__ComponentInterface__Group_11_3__0__Impl rule__ComponentInterface__Group_11_3__1
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
    // InternalComponentInterface.g:2117:1: rule__ComponentInterface__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ComponentInterface__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2121:1: ( ( ',' ) )
            // InternalComponentInterface.g:2122:1: ( ',' )
            {
            // InternalComponentInterface.g:2122:1: ( ',' )
            // InternalComponentInterface.g:2123:2: ','
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
    // InternalComponentInterface.g:2132:1: rule__ComponentInterface__Group_11_3__1 : rule__ComponentInterface__Group_11_3__1__Impl ;
    public final void rule__ComponentInterface__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2136:1: ( rule__ComponentInterface__Group_11_3__1__Impl )
            // InternalComponentInterface.g:2137:2: rule__ComponentInterface__Group_11_3__1__Impl
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
    // InternalComponentInterface.g:2143:1: rule__ComponentInterface__Group_11_3__1__Impl : ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) ) ;
    public final void rule__ComponentInterface__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2147:1: ( ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) ) )
            // InternalComponentInterface.g:2148:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) )
            {
            // InternalComponentInterface.g:2148:1: ( ( rule__ComponentInterface__RosparameterAssignment_11_3_1 ) )
            // InternalComponentInterface.g:2149:2: ( rule__ComponentInterface__RosparameterAssignment_11_3_1 )
            {
             before(grammarAccess.getComponentInterfaceAccess().getRosparameterAssignment_11_3_1()); 
            // InternalComponentInterface.g:2150:2: ( rule__ComponentInterface__RosparameterAssignment_11_3_1 )
            // InternalComponentInterface.g:2150:3: rule__ComponentInterface__RosparameterAssignment_11_3_1
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
    // InternalComponentInterface.g:2159:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2163:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalComponentInterface.g:2164:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
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
    // InternalComponentInterface.g:2171:1: rule__RosPublisher__Group__0__Impl : ( () ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2175:1: ( ( () ) )
            // InternalComponentInterface.g:2176:1: ( () )
            {
            // InternalComponentInterface.g:2176:1: ( () )
            // InternalComponentInterface.g:2177:2: ()
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherAction_0()); 
            // InternalComponentInterface.g:2178:2: ()
            // InternalComponentInterface.g:2178:3: 
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
    // InternalComponentInterface.g:2186:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2190:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalComponentInterface.g:2191:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
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
    // InternalComponentInterface.g:2198:1: rule__RosPublisher__Group__1__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2202:1: ( ( 'RosPublisher' ) )
            // InternalComponentInterface.g:2203:1: ( 'RosPublisher' )
            {
            // InternalComponentInterface.g:2203:1: ( 'RosPublisher' )
            // InternalComponentInterface.g:2204:2: 'RosPublisher'
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
    // InternalComponentInterface.g:2213:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2217:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalComponentInterface.g:2218:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
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
    // InternalComponentInterface.g:2225:1: rule__RosPublisher__Group__2__Impl : ( ( rule__RosPublisher__NameAssignment_2 )? ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2229:1: ( ( ( rule__RosPublisher__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2230:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2230:1: ( ( rule__RosPublisher__NameAssignment_2 )? )
            // InternalComponentInterface.g:2231:2: ( rule__RosPublisher__NameAssignment_2 )?
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2232:2: ( rule__RosPublisher__NameAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentInterface.g:2232:3: rule__RosPublisher__NameAssignment_2
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
    // InternalComponentInterface.g:2240:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2244:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalComponentInterface.g:2245:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
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
    // InternalComponentInterface.g:2252:1: rule__RosPublisher__Group__3__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2256:1: ( ( '{' ) )
            // InternalComponentInterface.g:2257:1: ( '{' )
            {
            // InternalComponentInterface.g:2257:1: ( '{' )
            // InternalComponentInterface.g:2258:2: '{'
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
    // InternalComponentInterface.g:2267:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2271:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalComponentInterface.g:2272:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
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
    // InternalComponentInterface.g:2279:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__Group_4__0 )? ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2283:1: ( ( ( rule__RosPublisher__Group_4__0 )? ) )
            // InternalComponentInterface.g:2284:1: ( ( rule__RosPublisher__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2284:1: ( ( rule__RosPublisher__Group_4__0 )? )
            // InternalComponentInterface.g:2285:2: ( rule__RosPublisher__Group_4__0 )?
            {
             before(grammarAccess.getRosPublisherAccess().getGroup_4()); 
            // InternalComponentInterface.g:2286:2: ( rule__RosPublisher__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:2286:3: rule__RosPublisher__Group_4__0
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
    // InternalComponentInterface.g:2294:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2298:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalComponentInterface.g:2299:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
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
    // InternalComponentInterface.g:2306:1: rule__RosPublisher__Group__5__Impl : ( 'RefPublisher' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2310:1: ( ( 'RefPublisher' ) )
            // InternalComponentInterface.g:2311:1: ( 'RefPublisher' )
            {
            // InternalComponentInterface.g:2311:1: ( 'RefPublisher' )
            // InternalComponentInterface.g:2312:2: 'RefPublisher'
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
    // InternalComponentInterface.g:2321:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2325:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalComponentInterface.g:2326:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
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
    // InternalComponentInterface.g:2333:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__PublisherAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2337:1: ( ( ( rule__RosPublisher__PublisherAssignment_6 ) ) )
            // InternalComponentInterface.g:2338:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            {
            // InternalComponentInterface.g:2338:1: ( ( rule__RosPublisher__PublisherAssignment_6 ) )
            // InternalComponentInterface.g:2339:2: ( rule__RosPublisher__PublisherAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherAssignment_6()); 
            // InternalComponentInterface.g:2340:2: ( rule__RosPublisher__PublisherAssignment_6 )
            // InternalComponentInterface.g:2340:3: rule__RosPublisher__PublisherAssignment_6
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
    // InternalComponentInterface.g:2348:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2352:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalComponentInterface.g:2353:2: rule__RosPublisher__Group__7__Impl
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
    // InternalComponentInterface.g:2359:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2363:1: ( ( '}' ) )
            // InternalComponentInterface.g:2364:1: ( '}' )
            {
            // InternalComponentInterface.g:2364:1: ( '}' )
            // InternalComponentInterface.g:2365:2: '}'
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
    // InternalComponentInterface.g:2375:1: rule__RosPublisher__Group_4__0 : rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 ;
    public final void rule__RosPublisher__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2379:1: ( rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1 )
            // InternalComponentInterface.g:2380:2: rule__RosPublisher__Group_4__0__Impl rule__RosPublisher__Group_4__1
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
    // InternalComponentInterface.g:2387:1: rule__RosPublisher__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosPublisher__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2391:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2392:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2392:1: ( 'ns' )
            // InternalComponentInterface.g:2393:2: 'ns'
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
    // InternalComponentInterface.g:2402:1: rule__RosPublisher__Group_4__1 : rule__RosPublisher__Group_4__1__Impl ;
    public final void rule__RosPublisher__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2406:1: ( rule__RosPublisher__Group_4__1__Impl )
            // InternalComponentInterface.g:2407:2: rule__RosPublisher__Group_4__1__Impl
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
    // InternalComponentInterface.g:2413:1: rule__RosPublisher__Group_4__1__Impl : ( ( rule__RosPublisher__NsAssignment_4_1 ) ) ;
    public final void rule__RosPublisher__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2417:1: ( ( ( rule__RosPublisher__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2418:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2418:1: ( ( rule__RosPublisher__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2419:2: ( rule__RosPublisher__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2420:2: ( rule__RosPublisher__NsAssignment_4_1 )
            // InternalComponentInterface.g:2420:3: rule__RosPublisher__NsAssignment_4_1
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
    // InternalComponentInterface.g:2429:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2433:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalComponentInterface.g:2434:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
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
    // InternalComponentInterface.g:2441:1: rule__RosSubscriber__Group__0__Impl : ( () ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2445:1: ( ( () ) )
            // InternalComponentInterface.g:2446:1: ( () )
            {
            // InternalComponentInterface.g:2446:1: ( () )
            // InternalComponentInterface.g:2447:2: ()
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberAction_0()); 
            // InternalComponentInterface.g:2448:2: ()
            // InternalComponentInterface.g:2448:3: 
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
    // InternalComponentInterface.g:2456:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2460:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalComponentInterface.g:2461:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
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
    // InternalComponentInterface.g:2468:1: rule__RosSubscriber__Group__1__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2472:1: ( ( 'RosSubscriber' ) )
            // InternalComponentInterface.g:2473:1: ( 'RosSubscriber' )
            {
            // InternalComponentInterface.g:2473:1: ( 'RosSubscriber' )
            // InternalComponentInterface.g:2474:2: 'RosSubscriber'
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
    // InternalComponentInterface.g:2483:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2487:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalComponentInterface.g:2488:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
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
    // InternalComponentInterface.g:2495:1: rule__RosSubscriber__Group__2__Impl : ( ( rule__RosSubscriber__NameAssignment_2 )? ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2499:1: ( ( ( rule__RosSubscriber__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2500:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2500:1: ( ( rule__RosSubscriber__NameAssignment_2 )? )
            // InternalComponentInterface.g:2501:2: ( rule__RosSubscriber__NameAssignment_2 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2502:2: ( rule__RosSubscriber__NameAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentInterface.g:2502:3: rule__RosSubscriber__NameAssignment_2
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
    // InternalComponentInterface.g:2510:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2514:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalComponentInterface.g:2515:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
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
    // InternalComponentInterface.g:2522:1: rule__RosSubscriber__Group__3__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2526:1: ( ( '{' ) )
            // InternalComponentInterface.g:2527:1: ( '{' )
            {
            // InternalComponentInterface.g:2527:1: ( '{' )
            // InternalComponentInterface.g:2528:2: '{'
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
    // InternalComponentInterface.g:2537:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2541:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalComponentInterface.g:2542:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
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
    // InternalComponentInterface.g:2549:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__Group_4__0 )? ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2553:1: ( ( ( rule__RosSubscriber__Group_4__0 )? ) )
            // InternalComponentInterface.g:2554:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2554:1: ( ( rule__RosSubscriber__Group_4__0 )? )
            // InternalComponentInterface.g:2555:2: ( rule__RosSubscriber__Group_4__0 )?
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup_4()); 
            // InternalComponentInterface.g:2556:2: ( rule__RosSubscriber__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentInterface.g:2556:3: rule__RosSubscriber__Group_4__0
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
    // InternalComponentInterface.g:2564:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2568:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalComponentInterface.g:2569:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
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
    // InternalComponentInterface.g:2576:1: rule__RosSubscriber__Group__5__Impl : ( 'RefSubscriber' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2580:1: ( ( 'RefSubscriber' ) )
            // InternalComponentInterface.g:2581:1: ( 'RefSubscriber' )
            {
            // InternalComponentInterface.g:2581:1: ( 'RefSubscriber' )
            // InternalComponentInterface.g:2582:2: 'RefSubscriber'
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
    // InternalComponentInterface.g:2591:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2595:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalComponentInterface.g:2596:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
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
    // InternalComponentInterface.g:2603:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2607:1: ( ( ( rule__RosSubscriber__SubscriberAssignment_6 ) ) )
            // InternalComponentInterface.g:2608:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            {
            // InternalComponentInterface.g:2608:1: ( ( rule__RosSubscriber__SubscriberAssignment_6 ) )
            // InternalComponentInterface.g:2609:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberAssignment_6()); 
            // InternalComponentInterface.g:2610:2: ( rule__RosSubscriber__SubscriberAssignment_6 )
            // InternalComponentInterface.g:2610:3: rule__RosSubscriber__SubscriberAssignment_6
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
    // InternalComponentInterface.g:2618:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2622:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalComponentInterface.g:2623:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalComponentInterface.g:2629:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2633:1: ( ( '}' ) )
            // InternalComponentInterface.g:2634:1: ( '}' )
            {
            // InternalComponentInterface.g:2634:1: ( '}' )
            // InternalComponentInterface.g:2635:2: '}'
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
    // InternalComponentInterface.g:2645:1: rule__RosSubscriber__Group_4__0 : rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 ;
    public final void rule__RosSubscriber__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2649:1: ( rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1 )
            // InternalComponentInterface.g:2650:2: rule__RosSubscriber__Group_4__0__Impl rule__RosSubscriber__Group_4__1
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
    // InternalComponentInterface.g:2657:1: rule__RosSubscriber__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosSubscriber__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2661:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2662:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2662:1: ( 'ns' )
            // InternalComponentInterface.g:2663:2: 'ns'
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
    // InternalComponentInterface.g:2672:1: rule__RosSubscriber__Group_4__1 : rule__RosSubscriber__Group_4__1__Impl ;
    public final void rule__RosSubscriber__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2676:1: ( rule__RosSubscriber__Group_4__1__Impl )
            // InternalComponentInterface.g:2677:2: rule__RosSubscriber__Group_4__1__Impl
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
    // InternalComponentInterface.g:2683:1: rule__RosSubscriber__Group_4__1__Impl : ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) ;
    public final void rule__RosSubscriber__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2687:1: ( ( ( rule__RosSubscriber__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2688:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2688:1: ( ( rule__RosSubscriber__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2689:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2690:2: ( rule__RosSubscriber__NsAssignment_4_1 )
            // InternalComponentInterface.g:2690:3: rule__RosSubscriber__NsAssignment_4_1
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
    // InternalComponentInterface.g:2699:1: rule__RosServiceServer__Group__0 : rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 ;
    public final void rule__RosServiceServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2703:1: ( rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1 )
            // InternalComponentInterface.g:2704:2: rule__RosServiceServer__Group__0__Impl rule__RosServiceServer__Group__1
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
    // InternalComponentInterface.g:2711:1: rule__RosServiceServer__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2715:1: ( ( () ) )
            // InternalComponentInterface.g:2716:1: ( () )
            {
            // InternalComponentInterface.g:2716:1: ( () )
            // InternalComponentInterface.g:2717:2: ()
            {
             before(grammarAccess.getRosServiceServerAccess().getRosServiceServerAction_0()); 
            // InternalComponentInterface.g:2718:2: ()
            // InternalComponentInterface.g:2718:3: 
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
    // InternalComponentInterface.g:2726:1: rule__RosServiceServer__Group__1 : rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 ;
    public final void rule__RosServiceServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2730:1: ( rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2 )
            // InternalComponentInterface.g:2731:2: rule__RosServiceServer__Group__1__Impl rule__RosServiceServer__Group__2
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
    // InternalComponentInterface.g:2738:1: rule__RosServiceServer__Group__1__Impl : ( 'RosServiceServer' ) ;
    public final void rule__RosServiceServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2742:1: ( ( 'RosServiceServer' ) )
            // InternalComponentInterface.g:2743:1: ( 'RosServiceServer' )
            {
            // InternalComponentInterface.g:2743:1: ( 'RosServiceServer' )
            // InternalComponentInterface.g:2744:2: 'RosServiceServer'
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
    // InternalComponentInterface.g:2753:1: rule__RosServiceServer__Group__2 : rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 ;
    public final void rule__RosServiceServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2757:1: ( rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3 )
            // InternalComponentInterface.g:2758:2: rule__RosServiceServer__Group__2__Impl rule__RosServiceServer__Group__3
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
    // InternalComponentInterface.g:2765:1: rule__RosServiceServer__Group__2__Impl : ( ( rule__RosServiceServer__NameAssignment_2 )? ) ;
    public final void rule__RosServiceServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2769:1: ( ( ( rule__RosServiceServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:2770:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:2770:1: ( ( rule__RosServiceServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:2771:2: ( rule__RosServiceServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:2772:2: ( rule__RosServiceServer__NameAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentInterface.g:2772:3: rule__RosServiceServer__NameAssignment_2
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
    // InternalComponentInterface.g:2780:1: rule__RosServiceServer__Group__3 : rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 ;
    public final void rule__RosServiceServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2784:1: ( rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4 )
            // InternalComponentInterface.g:2785:2: rule__RosServiceServer__Group__3__Impl rule__RosServiceServer__Group__4
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
    // InternalComponentInterface.g:2792:1: rule__RosServiceServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2796:1: ( ( '{' ) )
            // InternalComponentInterface.g:2797:1: ( '{' )
            {
            // InternalComponentInterface.g:2797:1: ( '{' )
            // InternalComponentInterface.g:2798:2: '{'
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
    // InternalComponentInterface.g:2807:1: rule__RosServiceServer__Group__4 : rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 ;
    public final void rule__RosServiceServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2811:1: ( rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5 )
            // InternalComponentInterface.g:2812:2: rule__RosServiceServer__Group__4__Impl rule__RosServiceServer__Group__5
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
    // InternalComponentInterface.g:2819:1: rule__RosServiceServer__Group__4__Impl : ( ( rule__RosServiceServer__Group_4__0 )? ) ;
    public final void rule__RosServiceServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2823:1: ( ( ( rule__RosServiceServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:2824:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:2824:1: ( ( rule__RosServiceServer__Group_4__0 )? )
            // InternalComponentInterface.g:2825:2: ( rule__RosServiceServer__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:2826:2: ( rule__RosServiceServer__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:2826:3: rule__RosServiceServer__Group_4__0
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
    // InternalComponentInterface.g:2834:1: rule__RosServiceServer__Group__5 : rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 ;
    public final void rule__RosServiceServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2838:1: ( rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6 )
            // InternalComponentInterface.g:2839:2: rule__RosServiceServer__Group__5__Impl rule__RosServiceServer__Group__6
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
    // InternalComponentInterface.g:2846:1: rule__RosServiceServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosServiceServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2850:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:2851:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:2851:1: ( 'RefServer' )
            // InternalComponentInterface.g:2852:2: 'RefServer'
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
    // InternalComponentInterface.g:2861:1: rule__RosServiceServer__Group__6 : rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 ;
    public final void rule__RosServiceServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2865:1: ( rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7 )
            // InternalComponentInterface.g:2866:2: rule__RosServiceServer__Group__6__Impl rule__RosServiceServer__Group__7
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
    // InternalComponentInterface.g:2873:1: rule__RosServiceServer__Group__6__Impl : ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) ;
    public final void rule__RosServiceServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2877:1: ( ( ( rule__RosServiceServer__SrvserverAssignment_6 ) ) )
            // InternalComponentInterface.g:2878:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:2878:1: ( ( rule__RosServiceServer__SrvserverAssignment_6 ) )
            // InternalComponentInterface.g:2879:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverAssignment_6()); 
            // InternalComponentInterface.g:2880:2: ( rule__RosServiceServer__SrvserverAssignment_6 )
            // InternalComponentInterface.g:2880:3: rule__RosServiceServer__SrvserverAssignment_6
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
    // InternalComponentInterface.g:2888:1: rule__RosServiceServer__Group__7 : rule__RosServiceServer__Group__7__Impl ;
    public final void rule__RosServiceServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2892:1: ( rule__RosServiceServer__Group__7__Impl )
            // InternalComponentInterface.g:2893:2: rule__RosServiceServer__Group__7__Impl
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
    // InternalComponentInterface.g:2899:1: rule__RosServiceServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2903:1: ( ( '}' ) )
            // InternalComponentInterface.g:2904:1: ( '}' )
            {
            // InternalComponentInterface.g:2904:1: ( '}' )
            // InternalComponentInterface.g:2905:2: '}'
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
    // InternalComponentInterface.g:2915:1: rule__RosServiceServer__Group_4__0 : rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 ;
    public final void rule__RosServiceServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2919:1: ( rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1 )
            // InternalComponentInterface.g:2920:2: rule__RosServiceServer__Group_4__0__Impl rule__RosServiceServer__Group_4__1
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
    // InternalComponentInterface.g:2927:1: rule__RosServiceServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2931:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:2932:1: ( 'ns' )
            {
            // InternalComponentInterface.g:2932:1: ( 'ns' )
            // InternalComponentInterface.g:2933:2: 'ns'
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
    // InternalComponentInterface.g:2942:1: rule__RosServiceServer__Group_4__1 : rule__RosServiceServer__Group_4__1__Impl ;
    public final void rule__RosServiceServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2946:1: ( rule__RosServiceServer__Group_4__1__Impl )
            // InternalComponentInterface.g:2947:2: rule__RosServiceServer__Group_4__1__Impl
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
    // InternalComponentInterface.g:2953:1: rule__RosServiceServer__Group_4__1__Impl : ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2957:1: ( ( ( rule__RosServiceServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:2958:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:2958:1: ( ( rule__RosServiceServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:2959:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:2960:2: ( rule__RosServiceServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:2960:3: rule__RosServiceServer__NsAssignment_4_1
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
    // InternalComponentInterface.g:2969:1: rule__RosServiceClient__Group__0 : rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 ;
    public final void rule__RosServiceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2973:1: ( rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1 )
            // InternalComponentInterface.g:2974:2: rule__RosServiceClient__Group__0__Impl rule__RosServiceClient__Group__1
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
    // InternalComponentInterface.g:2981:1: rule__RosServiceClient__Group__0__Impl : ( () ) ;
    public final void rule__RosServiceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:2985:1: ( ( () ) )
            // InternalComponentInterface.g:2986:1: ( () )
            {
            // InternalComponentInterface.g:2986:1: ( () )
            // InternalComponentInterface.g:2987:2: ()
            {
             before(grammarAccess.getRosServiceClientAccess().getRosServiceClientAction_0()); 
            // InternalComponentInterface.g:2988:2: ()
            // InternalComponentInterface.g:2988:3: 
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
    // InternalComponentInterface.g:2996:1: rule__RosServiceClient__Group__1 : rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 ;
    public final void rule__RosServiceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3000:1: ( rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2 )
            // InternalComponentInterface.g:3001:2: rule__RosServiceClient__Group__1__Impl rule__RosServiceClient__Group__2
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
    // InternalComponentInterface.g:3008:1: rule__RosServiceClient__Group__1__Impl : ( 'RosServiceClient' ) ;
    public final void rule__RosServiceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3012:1: ( ( 'RosServiceClient' ) )
            // InternalComponentInterface.g:3013:1: ( 'RosServiceClient' )
            {
            // InternalComponentInterface.g:3013:1: ( 'RosServiceClient' )
            // InternalComponentInterface.g:3014:2: 'RosServiceClient'
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
    // InternalComponentInterface.g:3023:1: rule__RosServiceClient__Group__2 : rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 ;
    public final void rule__RosServiceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3027:1: ( rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3 )
            // InternalComponentInterface.g:3028:2: rule__RosServiceClient__Group__2__Impl rule__RosServiceClient__Group__3
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
    // InternalComponentInterface.g:3035:1: rule__RosServiceClient__Group__2__Impl : ( ( rule__RosServiceClient__NameAssignment_2 )? ) ;
    public final void rule__RosServiceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3039:1: ( ( ( rule__RosServiceClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3040:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3040:1: ( ( rule__RosServiceClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3041:2: ( rule__RosServiceClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3042:2: ( rule__RosServiceClient__NameAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentInterface.g:3042:3: rule__RosServiceClient__NameAssignment_2
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
    // InternalComponentInterface.g:3050:1: rule__RosServiceClient__Group__3 : rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 ;
    public final void rule__RosServiceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3054:1: ( rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4 )
            // InternalComponentInterface.g:3055:2: rule__RosServiceClient__Group__3__Impl rule__RosServiceClient__Group__4
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
    // InternalComponentInterface.g:3062:1: rule__RosServiceClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosServiceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3066:1: ( ( '{' ) )
            // InternalComponentInterface.g:3067:1: ( '{' )
            {
            // InternalComponentInterface.g:3067:1: ( '{' )
            // InternalComponentInterface.g:3068:2: '{'
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
    // InternalComponentInterface.g:3077:1: rule__RosServiceClient__Group__4 : rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 ;
    public final void rule__RosServiceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3081:1: ( rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5 )
            // InternalComponentInterface.g:3082:2: rule__RosServiceClient__Group__4__Impl rule__RosServiceClient__Group__5
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
    // InternalComponentInterface.g:3089:1: rule__RosServiceClient__Group__4__Impl : ( ( rule__RosServiceClient__Group_4__0 )? ) ;
    public final void rule__RosServiceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3093:1: ( ( ( rule__RosServiceClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3094:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3094:1: ( ( rule__RosServiceClient__Group_4__0 )? )
            // InternalComponentInterface.g:3095:2: ( rule__RosServiceClient__Group_4__0 )?
            {
             before(grammarAccess.getRosServiceClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3096:2: ( rule__RosServiceClient__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentInterface.g:3096:3: rule__RosServiceClient__Group_4__0
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
    // InternalComponentInterface.g:3104:1: rule__RosServiceClient__Group__5 : rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 ;
    public final void rule__RosServiceClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3108:1: ( rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6 )
            // InternalComponentInterface.g:3109:2: rule__RosServiceClient__Group__5__Impl rule__RosServiceClient__Group__6
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
    // InternalComponentInterface.g:3116:1: rule__RosServiceClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosServiceClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3120:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3121:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3121:1: ( 'RefClient' )
            // InternalComponentInterface.g:3122:2: 'RefClient'
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
    // InternalComponentInterface.g:3131:1: rule__RosServiceClient__Group__6 : rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 ;
    public final void rule__RosServiceClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3135:1: ( rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7 )
            // InternalComponentInterface.g:3136:2: rule__RosServiceClient__Group__6__Impl rule__RosServiceClient__Group__7
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
    // InternalComponentInterface.g:3143:1: rule__RosServiceClient__Group__6__Impl : ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) ;
    public final void rule__RosServiceClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3147:1: ( ( ( rule__RosServiceClient__SrvclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3148:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3148:1: ( ( rule__RosServiceClient__SrvclientAssignment_6 ) )
            // InternalComponentInterface.g:3149:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientAssignment_6()); 
            // InternalComponentInterface.g:3150:2: ( rule__RosServiceClient__SrvclientAssignment_6 )
            // InternalComponentInterface.g:3150:3: rule__RosServiceClient__SrvclientAssignment_6
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
    // InternalComponentInterface.g:3158:1: rule__RosServiceClient__Group__7 : rule__RosServiceClient__Group__7__Impl ;
    public final void rule__RosServiceClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3162:1: ( rule__RosServiceClient__Group__7__Impl )
            // InternalComponentInterface.g:3163:2: rule__RosServiceClient__Group__7__Impl
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
    // InternalComponentInterface.g:3169:1: rule__RosServiceClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosServiceClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3173:1: ( ( '}' ) )
            // InternalComponentInterface.g:3174:1: ( '}' )
            {
            // InternalComponentInterface.g:3174:1: ( '}' )
            // InternalComponentInterface.g:3175:2: '}'
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
    // InternalComponentInterface.g:3185:1: rule__RosServiceClient__Group_4__0 : rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 ;
    public final void rule__RosServiceClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3189:1: ( rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1 )
            // InternalComponentInterface.g:3190:2: rule__RosServiceClient__Group_4__0__Impl rule__RosServiceClient__Group_4__1
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
    // InternalComponentInterface.g:3197:1: rule__RosServiceClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosServiceClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3201:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3202:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3202:1: ( 'ns' )
            // InternalComponentInterface.g:3203:2: 'ns'
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
    // InternalComponentInterface.g:3212:1: rule__RosServiceClient__Group_4__1 : rule__RosServiceClient__Group_4__1__Impl ;
    public final void rule__RosServiceClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3216:1: ( rule__RosServiceClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3217:2: rule__RosServiceClient__Group_4__1__Impl
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
    // InternalComponentInterface.g:3223:1: rule__RosServiceClient__Group_4__1__Impl : ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosServiceClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3227:1: ( ( ( rule__RosServiceClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3228:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3228:1: ( ( rule__RosServiceClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3229:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosServiceClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3230:2: ( rule__RosServiceClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3230:3: rule__RosServiceClient__NsAssignment_4_1
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
    // InternalComponentInterface.g:3239:1: rule__RosActionServer__Group__0 : rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 ;
    public final void rule__RosActionServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3243:1: ( rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 )
            // InternalComponentInterface.g:3244:2: rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1
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
    // InternalComponentInterface.g:3251:1: rule__RosActionServer__Group__0__Impl : ( () ) ;
    public final void rule__RosActionServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3255:1: ( ( () ) )
            // InternalComponentInterface.g:3256:1: ( () )
            {
            // InternalComponentInterface.g:3256:1: ( () )
            // InternalComponentInterface.g:3257:2: ()
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerAction_0()); 
            // InternalComponentInterface.g:3258:2: ()
            // InternalComponentInterface.g:3258:3: 
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
    // InternalComponentInterface.g:3266:1: rule__RosActionServer__Group__1 : rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 ;
    public final void rule__RosActionServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3270:1: ( rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 )
            // InternalComponentInterface.g:3271:2: rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2
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
    // InternalComponentInterface.g:3278:1: rule__RosActionServer__Group__1__Impl : ( 'RosActionServer' ) ;
    public final void rule__RosActionServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3282:1: ( ( 'RosActionServer' ) )
            // InternalComponentInterface.g:3283:1: ( 'RosActionServer' )
            {
            // InternalComponentInterface.g:3283:1: ( 'RosActionServer' )
            // InternalComponentInterface.g:3284:2: 'RosActionServer'
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
    // InternalComponentInterface.g:3293:1: rule__RosActionServer__Group__2 : rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 ;
    public final void rule__RosActionServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3297:1: ( rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 )
            // InternalComponentInterface.g:3298:2: rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3
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
    // InternalComponentInterface.g:3305:1: rule__RosActionServer__Group__2__Impl : ( ( rule__RosActionServer__NameAssignment_2 )? ) ;
    public final void rule__RosActionServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3309:1: ( ( ( rule__RosActionServer__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3310:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3310:1: ( ( rule__RosActionServer__NameAssignment_2 )? )
            // InternalComponentInterface.g:3311:2: ( rule__RosActionServer__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionServerAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3312:2: ( rule__RosActionServer__NameAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentInterface.g:3312:3: rule__RosActionServer__NameAssignment_2
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
    // InternalComponentInterface.g:3320:1: rule__RosActionServer__Group__3 : rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 ;
    public final void rule__RosActionServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3324:1: ( rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 )
            // InternalComponentInterface.g:3325:2: rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4
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
    // InternalComponentInterface.g:3332:1: rule__RosActionServer__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3336:1: ( ( '{' ) )
            // InternalComponentInterface.g:3337:1: ( '{' )
            {
            // InternalComponentInterface.g:3337:1: ( '{' )
            // InternalComponentInterface.g:3338:2: '{'
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
    // InternalComponentInterface.g:3347:1: rule__RosActionServer__Group__4 : rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 ;
    public final void rule__RosActionServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3351:1: ( rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 )
            // InternalComponentInterface.g:3352:2: rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5
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
    // InternalComponentInterface.g:3359:1: rule__RosActionServer__Group__4__Impl : ( ( rule__RosActionServer__Group_4__0 )? ) ;
    public final void rule__RosActionServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3363:1: ( ( ( rule__RosActionServer__Group_4__0 )? ) )
            // InternalComponentInterface.g:3364:1: ( ( rule__RosActionServer__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3364:1: ( ( rule__RosActionServer__Group_4__0 )? )
            // InternalComponentInterface.g:3365:2: ( rule__RosActionServer__Group_4__0 )?
            {
             before(grammarAccess.getRosActionServerAccess().getGroup_4()); 
            // InternalComponentInterface.g:3366:2: ( rule__RosActionServer__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentInterface.g:3366:3: rule__RosActionServer__Group_4__0
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
    // InternalComponentInterface.g:3374:1: rule__RosActionServer__Group__5 : rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 ;
    public final void rule__RosActionServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3378:1: ( rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 )
            // InternalComponentInterface.g:3379:2: rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6
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
    // InternalComponentInterface.g:3386:1: rule__RosActionServer__Group__5__Impl : ( 'RefServer' ) ;
    public final void rule__RosActionServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3390:1: ( ( 'RefServer' ) )
            // InternalComponentInterface.g:3391:1: ( 'RefServer' )
            {
            // InternalComponentInterface.g:3391:1: ( 'RefServer' )
            // InternalComponentInterface.g:3392:2: 'RefServer'
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
    // InternalComponentInterface.g:3401:1: rule__RosActionServer__Group__6 : rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 ;
    public final void rule__RosActionServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3405:1: ( rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 )
            // InternalComponentInterface.g:3406:2: rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7
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
    // InternalComponentInterface.g:3413:1: rule__RosActionServer__Group__6__Impl : ( ( rule__RosActionServer__ActserverAssignment_6 ) ) ;
    public final void rule__RosActionServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3417:1: ( ( ( rule__RosActionServer__ActserverAssignment_6 ) ) )
            // InternalComponentInterface.g:3418:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            {
            // InternalComponentInterface.g:3418:1: ( ( rule__RosActionServer__ActserverAssignment_6 ) )
            // InternalComponentInterface.g:3419:2: ( rule__RosActionServer__ActserverAssignment_6 )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverAssignment_6()); 
            // InternalComponentInterface.g:3420:2: ( rule__RosActionServer__ActserverAssignment_6 )
            // InternalComponentInterface.g:3420:3: rule__RosActionServer__ActserverAssignment_6
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
    // InternalComponentInterface.g:3428:1: rule__RosActionServer__Group__7 : rule__RosActionServer__Group__7__Impl ;
    public final void rule__RosActionServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3432:1: ( rule__RosActionServer__Group__7__Impl )
            // InternalComponentInterface.g:3433:2: rule__RosActionServer__Group__7__Impl
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
    // InternalComponentInterface.g:3439:1: rule__RosActionServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3443:1: ( ( '}' ) )
            // InternalComponentInterface.g:3444:1: ( '}' )
            {
            // InternalComponentInterface.g:3444:1: ( '}' )
            // InternalComponentInterface.g:3445:2: '}'
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
    // InternalComponentInterface.g:3455:1: rule__RosActionServer__Group_4__0 : rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 ;
    public final void rule__RosActionServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3459:1: ( rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1 )
            // InternalComponentInterface.g:3460:2: rule__RosActionServer__Group_4__0__Impl rule__RosActionServer__Group_4__1
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
    // InternalComponentInterface.g:3467:1: rule__RosActionServer__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3471:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3472:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3472:1: ( 'ns' )
            // InternalComponentInterface.g:3473:2: 'ns'
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
    // InternalComponentInterface.g:3482:1: rule__RosActionServer__Group_4__1 : rule__RosActionServer__Group_4__1__Impl ;
    public final void rule__RosActionServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3486:1: ( rule__RosActionServer__Group_4__1__Impl )
            // InternalComponentInterface.g:3487:2: rule__RosActionServer__Group_4__1__Impl
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
    // InternalComponentInterface.g:3493:1: rule__RosActionServer__Group_4__1__Impl : ( ( rule__RosActionServer__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3497:1: ( ( ( rule__RosActionServer__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3498:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3498:1: ( ( rule__RosActionServer__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3499:2: ( rule__RosActionServer__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionServerAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3500:2: ( rule__RosActionServer__NsAssignment_4_1 )
            // InternalComponentInterface.g:3500:3: rule__RosActionServer__NsAssignment_4_1
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
    // InternalComponentInterface.g:3509:1: rule__RosActionClient__Group__0 : rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 ;
    public final void rule__RosActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3513:1: ( rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 )
            // InternalComponentInterface.g:3514:2: rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1
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
    // InternalComponentInterface.g:3521:1: rule__RosActionClient__Group__0__Impl : ( () ) ;
    public final void rule__RosActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3525:1: ( ( () ) )
            // InternalComponentInterface.g:3526:1: ( () )
            {
            // InternalComponentInterface.g:3526:1: ( () )
            // InternalComponentInterface.g:3527:2: ()
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientAction_0()); 
            // InternalComponentInterface.g:3528:2: ()
            // InternalComponentInterface.g:3528:3: 
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
    // InternalComponentInterface.g:3536:1: rule__RosActionClient__Group__1 : rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 ;
    public final void rule__RosActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3540:1: ( rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 )
            // InternalComponentInterface.g:3541:2: rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2
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
    // InternalComponentInterface.g:3548:1: rule__RosActionClient__Group__1__Impl : ( 'RosActionClient' ) ;
    public final void rule__RosActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3552:1: ( ( 'RosActionClient' ) )
            // InternalComponentInterface.g:3553:1: ( 'RosActionClient' )
            {
            // InternalComponentInterface.g:3553:1: ( 'RosActionClient' )
            // InternalComponentInterface.g:3554:2: 'RosActionClient'
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
    // InternalComponentInterface.g:3563:1: rule__RosActionClient__Group__2 : rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 ;
    public final void rule__RosActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3567:1: ( rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 )
            // InternalComponentInterface.g:3568:2: rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3
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
    // InternalComponentInterface.g:3575:1: rule__RosActionClient__Group__2__Impl : ( ( rule__RosActionClient__NameAssignment_2 )? ) ;
    public final void rule__RosActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3579:1: ( ( ( rule__RosActionClient__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3580:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3580:1: ( ( rule__RosActionClient__NameAssignment_2 )? )
            // InternalComponentInterface.g:3581:2: ( rule__RosActionClient__NameAssignment_2 )?
            {
             before(grammarAccess.getRosActionClientAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3582:2: ( rule__RosActionClient__NameAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentInterface.g:3582:3: rule__RosActionClient__NameAssignment_2
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
    // InternalComponentInterface.g:3590:1: rule__RosActionClient__Group__3 : rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 ;
    public final void rule__RosActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3594:1: ( rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 )
            // InternalComponentInterface.g:3595:2: rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4
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
    // InternalComponentInterface.g:3602:1: rule__RosActionClient__Group__3__Impl : ( '{' ) ;
    public final void rule__RosActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3606:1: ( ( '{' ) )
            // InternalComponentInterface.g:3607:1: ( '{' )
            {
            // InternalComponentInterface.g:3607:1: ( '{' )
            // InternalComponentInterface.g:3608:2: '{'
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
    // InternalComponentInterface.g:3617:1: rule__RosActionClient__Group__4 : rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 ;
    public final void rule__RosActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3621:1: ( rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 )
            // InternalComponentInterface.g:3622:2: rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5
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
    // InternalComponentInterface.g:3629:1: rule__RosActionClient__Group__4__Impl : ( ( rule__RosActionClient__Group_4__0 )? ) ;
    public final void rule__RosActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3633:1: ( ( ( rule__RosActionClient__Group_4__0 )? ) )
            // InternalComponentInterface.g:3634:1: ( ( rule__RosActionClient__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3634:1: ( ( rule__RosActionClient__Group_4__0 )? )
            // InternalComponentInterface.g:3635:2: ( rule__RosActionClient__Group_4__0 )?
            {
             before(grammarAccess.getRosActionClientAccess().getGroup_4()); 
            // InternalComponentInterface.g:3636:2: ( rule__RosActionClient__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentInterface.g:3636:3: rule__RosActionClient__Group_4__0
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
    // InternalComponentInterface.g:3644:1: rule__RosActionClient__Group__5 : rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 ;
    public final void rule__RosActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3648:1: ( rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 )
            // InternalComponentInterface.g:3649:2: rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6
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
    // InternalComponentInterface.g:3656:1: rule__RosActionClient__Group__5__Impl : ( 'RefClient' ) ;
    public final void rule__RosActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3660:1: ( ( 'RefClient' ) )
            // InternalComponentInterface.g:3661:1: ( 'RefClient' )
            {
            // InternalComponentInterface.g:3661:1: ( 'RefClient' )
            // InternalComponentInterface.g:3662:2: 'RefClient'
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
    // InternalComponentInterface.g:3671:1: rule__RosActionClient__Group__6 : rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 ;
    public final void rule__RosActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3675:1: ( rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 )
            // InternalComponentInterface.g:3676:2: rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7
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
    // InternalComponentInterface.g:3683:1: rule__RosActionClient__Group__6__Impl : ( ( rule__RosActionClient__ActclientAssignment_6 ) ) ;
    public final void rule__RosActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3687:1: ( ( ( rule__RosActionClient__ActclientAssignment_6 ) ) )
            // InternalComponentInterface.g:3688:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            {
            // InternalComponentInterface.g:3688:1: ( ( rule__RosActionClient__ActclientAssignment_6 ) )
            // InternalComponentInterface.g:3689:2: ( rule__RosActionClient__ActclientAssignment_6 )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientAssignment_6()); 
            // InternalComponentInterface.g:3690:2: ( rule__RosActionClient__ActclientAssignment_6 )
            // InternalComponentInterface.g:3690:3: rule__RosActionClient__ActclientAssignment_6
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
    // InternalComponentInterface.g:3698:1: rule__RosActionClient__Group__7 : rule__RosActionClient__Group__7__Impl ;
    public final void rule__RosActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3702:1: ( rule__RosActionClient__Group__7__Impl )
            // InternalComponentInterface.g:3703:2: rule__RosActionClient__Group__7__Impl
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
    // InternalComponentInterface.g:3709:1: rule__RosActionClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3713:1: ( ( '}' ) )
            // InternalComponentInterface.g:3714:1: ( '}' )
            {
            // InternalComponentInterface.g:3714:1: ( '}' )
            // InternalComponentInterface.g:3715:2: '}'
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
    // InternalComponentInterface.g:3725:1: rule__RosActionClient__Group_4__0 : rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 ;
    public final void rule__RosActionClient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3729:1: ( rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1 )
            // InternalComponentInterface.g:3730:2: rule__RosActionClient__Group_4__0__Impl rule__RosActionClient__Group_4__1
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
    // InternalComponentInterface.g:3737:1: rule__RosActionClient__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosActionClient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3741:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:3742:1: ( 'ns' )
            {
            // InternalComponentInterface.g:3742:1: ( 'ns' )
            // InternalComponentInterface.g:3743:2: 'ns'
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
    // InternalComponentInterface.g:3752:1: rule__RosActionClient__Group_4__1 : rule__RosActionClient__Group_4__1__Impl ;
    public final void rule__RosActionClient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3756:1: ( rule__RosActionClient__Group_4__1__Impl )
            // InternalComponentInterface.g:3757:2: rule__RosActionClient__Group_4__1__Impl
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
    // InternalComponentInterface.g:3763:1: rule__RosActionClient__Group_4__1__Impl : ( ( rule__RosActionClient__NsAssignment_4_1 ) ) ;
    public final void rule__RosActionClient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3767:1: ( ( ( rule__RosActionClient__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:3768:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:3768:1: ( ( rule__RosActionClient__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:3769:2: ( rule__RosActionClient__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosActionClientAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:3770:2: ( rule__RosActionClient__NsAssignment_4_1 )
            // InternalComponentInterface.g:3770:3: rule__RosActionClient__NsAssignment_4_1
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
    // InternalComponentInterface.g:3779:1: rule__RosParameter__Group__0 : rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 ;
    public final void rule__RosParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3783:1: ( rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 )
            // InternalComponentInterface.g:3784:2: rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1
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
    // InternalComponentInterface.g:3791:1: rule__RosParameter__Group__0__Impl : ( () ) ;
    public final void rule__RosParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3795:1: ( ( () ) )
            // InternalComponentInterface.g:3796:1: ( () )
            {
            // InternalComponentInterface.g:3796:1: ( () )
            // InternalComponentInterface.g:3797:2: ()
            {
             before(grammarAccess.getRosParameterAccess().getRosParameterAction_0()); 
            // InternalComponentInterface.g:3798:2: ()
            // InternalComponentInterface.g:3798:3: 
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
    // InternalComponentInterface.g:3806:1: rule__RosParameter__Group__1 : rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 ;
    public final void rule__RosParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3810:1: ( rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 )
            // InternalComponentInterface.g:3811:2: rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2
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
    // InternalComponentInterface.g:3818:1: rule__RosParameter__Group__1__Impl : ( 'RosParameter' ) ;
    public final void rule__RosParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3822:1: ( ( 'RosParameter' ) )
            // InternalComponentInterface.g:3823:1: ( 'RosParameter' )
            {
            // InternalComponentInterface.g:3823:1: ( 'RosParameter' )
            // InternalComponentInterface.g:3824:2: 'RosParameter'
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
    // InternalComponentInterface.g:3833:1: rule__RosParameter__Group__2 : rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 ;
    public final void rule__RosParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3837:1: ( rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 )
            // InternalComponentInterface.g:3838:2: rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3
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
    // InternalComponentInterface.g:3845:1: rule__RosParameter__Group__2__Impl : ( ( rule__RosParameter__NameAssignment_2 )? ) ;
    public final void rule__RosParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3849:1: ( ( ( rule__RosParameter__NameAssignment_2 )? ) )
            // InternalComponentInterface.g:3850:1: ( ( rule__RosParameter__NameAssignment_2 )? )
            {
            // InternalComponentInterface.g:3850:1: ( ( rule__RosParameter__NameAssignment_2 )? )
            // InternalComponentInterface.g:3851:2: ( rule__RosParameter__NameAssignment_2 )?
            {
             before(grammarAccess.getRosParameterAccess().getNameAssignment_2()); 
            // InternalComponentInterface.g:3852:2: ( rule__RosParameter__NameAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentInterface.g:3852:3: rule__RosParameter__NameAssignment_2
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
    // InternalComponentInterface.g:3860:1: rule__RosParameter__Group__3 : rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 ;
    public final void rule__RosParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3864:1: ( rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 )
            // InternalComponentInterface.g:3865:2: rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4
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
    // InternalComponentInterface.g:3872:1: rule__RosParameter__Group__3__Impl : ( '{' ) ;
    public final void rule__RosParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3876:1: ( ( '{' ) )
            // InternalComponentInterface.g:3877:1: ( '{' )
            {
            // InternalComponentInterface.g:3877:1: ( '{' )
            // InternalComponentInterface.g:3878:2: '{'
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
    // InternalComponentInterface.g:3887:1: rule__RosParameter__Group__4 : rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 ;
    public final void rule__RosParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3891:1: ( rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 )
            // InternalComponentInterface.g:3892:2: rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5
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
    // InternalComponentInterface.g:3899:1: rule__RosParameter__Group__4__Impl : ( ( rule__RosParameter__Group_4__0 )? ) ;
    public final void rule__RosParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3903:1: ( ( ( rule__RosParameter__Group_4__0 )? ) )
            // InternalComponentInterface.g:3904:1: ( ( rule__RosParameter__Group_4__0 )? )
            {
            // InternalComponentInterface.g:3904:1: ( ( rule__RosParameter__Group_4__0 )? )
            // InternalComponentInterface.g:3905:2: ( rule__RosParameter__Group_4__0 )?
            {
             before(grammarAccess.getRosParameterAccess().getGroup_4()); 
            // InternalComponentInterface.g:3906:2: ( rule__RosParameter__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentInterface.g:3906:3: rule__RosParameter__Group_4__0
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
    // InternalComponentInterface.g:3914:1: rule__RosParameter__Group__5 : rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 ;
    public final void rule__RosParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3918:1: ( rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 )
            // InternalComponentInterface.g:3919:2: rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6
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
    // InternalComponentInterface.g:3926:1: rule__RosParameter__Group__5__Impl : ( 'RefParameter' ) ;
    public final void rule__RosParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3930:1: ( ( 'RefParameter' ) )
            // InternalComponentInterface.g:3931:1: ( 'RefParameter' )
            {
            // InternalComponentInterface.g:3931:1: ( 'RefParameter' )
            // InternalComponentInterface.g:3932:2: 'RefParameter'
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
    // InternalComponentInterface.g:3941:1: rule__RosParameter__Group__6 : rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 ;
    public final void rule__RosParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3945:1: ( rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 )
            // InternalComponentInterface.g:3946:2: rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7
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
    // InternalComponentInterface.g:3953:1: rule__RosParameter__Group__6__Impl : ( ( rule__RosParameter__ParameterAssignment_6 ) ) ;
    public final void rule__RosParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3957:1: ( ( ( rule__RosParameter__ParameterAssignment_6 ) ) )
            // InternalComponentInterface.g:3958:1: ( ( rule__RosParameter__ParameterAssignment_6 ) )
            {
            // InternalComponentInterface.g:3958:1: ( ( rule__RosParameter__ParameterAssignment_6 ) )
            // InternalComponentInterface.g:3959:2: ( rule__RosParameter__ParameterAssignment_6 )
            {
             before(grammarAccess.getRosParameterAccess().getParameterAssignment_6()); 
            // InternalComponentInterface.g:3960:2: ( rule__RosParameter__ParameterAssignment_6 )
            // InternalComponentInterface.g:3960:3: rule__RosParameter__ParameterAssignment_6
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
    // InternalComponentInterface.g:3968:1: rule__RosParameter__Group__7 : rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8 ;
    public final void rule__RosParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3972:1: ( rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8 )
            // InternalComponentInterface.g:3973:2: rule__RosParameter__Group__7__Impl rule__RosParameter__Group__8
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
    // InternalComponentInterface.g:3980:1: rule__RosParameter__Group__7__Impl : ( ( rule__RosParameter__Group_7__0 )? ) ;
    public final void rule__RosParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3984:1: ( ( ( rule__RosParameter__Group_7__0 )? ) )
            // InternalComponentInterface.g:3985:1: ( ( rule__RosParameter__Group_7__0 )? )
            {
            // InternalComponentInterface.g:3985:1: ( ( rule__RosParameter__Group_7__0 )? )
            // InternalComponentInterface.g:3986:2: ( rule__RosParameter__Group_7__0 )?
            {
             before(grammarAccess.getRosParameterAccess().getGroup_7()); 
            // InternalComponentInterface.g:3987:2: ( rule__RosParameter__Group_7__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentInterface.g:3987:3: rule__RosParameter__Group_7__0
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
    // InternalComponentInterface.g:3995:1: rule__RosParameter__Group__8 : rule__RosParameter__Group__8__Impl ;
    public final void rule__RosParameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:3999:1: ( rule__RosParameter__Group__8__Impl )
            // InternalComponentInterface.g:4000:2: rule__RosParameter__Group__8__Impl
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
    // InternalComponentInterface.g:4006:1: rule__RosParameter__Group__8__Impl : ( '}' ) ;
    public final void rule__RosParameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4010:1: ( ( '}' ) )
            // InternalComponentInterface.g:4011:1: ( '}' )
            {
            // InternalComponentInterface.g:4011:1: ( '}' )
            // InternalComponentInterface.g:4012:2: '}'
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
    // InternalComponentInterface.g:4022:1: rule__RosParameter__Group_4__0 : rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1 ;
    public final void rule__RosParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4026:1: ( rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1 )
            // InternalComponentInterface.g:4027:2: rule__RosParameter__Group_4__0__Impl rule__RosParameter__Group_4__1
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
    // InternalComponentInterface.g:4034:1: rule__RosParameter__Group_4__0__Impl : ( 'ns' ) ;
    public final void rule__RosParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4038:1: ( ( 'ns' ) )
            // InternalComponentInterface.g:4039:1: ( 'ns' )
            {
            // InternalComponentInterface.g:4039:1: ( 'ns' )
            // InternalComponentInterface.g:4040:2: 'ns'
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
    // InternalComponentInterface.g:4049:1: rule__RosParameter__Group_4__1 : rule__RosParameter__Group_4__1__Impl ;
    public final void rule__RosParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4053:1: ( rule__RosParameter__Group_4__1__Impl )
            // InternalComponentInterface.g:4054:2: rule__RosParameter__Group_4__1__Impl
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
    // InternalComponentInterface.g:4060:1: rule__RosParameter__Group_4__1__Impl : ( ( rule__RosParameter__NsAssignment_4_1 ) ) ;
    public final void rule__RosParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4064:1: ( ( ( rule__RosParameter__NsAssignment_4_1 ) ) )
            // InternalComponentInterface.g:4065:1: ( ( rule__RosParameter__NsAssignment_4_1 ) )
            {
            // InternalComponentInterface.g:4065:1: ( ( rule__RosParameter__NsAssignment_4_1 ) )
            // InternalComponentInterface.g:4066:2: ( rule__RosParameter__NsAssignment_4_1 )
            {
             before(grammarAccess.getRosParameterAccess().getNsAssignment_4_1()); 
            // InternalComponentInterface.g:4067:2: ( rule__RosParameter__NsAssignment_4_1 )
            // InternalComponentInterface.g:4067:3: rule__RosParameter__NsAssignment_4_1
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
    // InternalComponentInterface.g:4076:1: rule__RosParameter__Group_7__0 : rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1 ;
    public final void rule__RosParameter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4080:1: ( rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1 )
            // InternalComponentInterface.g:4081:2: rule__RosParameter__Group_7__0__Impl rule__RosParameter__Group_7__1
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
    // InternalComponentInterface.g:4088:1: rule__RosParameter__Group_7__0__Impl : ( 'value' ) ;
    public final void rule__RosParameter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4092:1: ( ( 'value' ) )
            // InternalComponentInterface.g:4093:1: ( 'value' )
            {
            // InternalComponentInterface.g:4093:1: ( 'value' )
            // InternalComponentInterface.g:4094:2: 'value'
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
    // InternalComponentInterface.g:4103:1: rule__RosParameter__Group_7__1 : rule__RosParameter__Group_7__1__Impl ;
    public final void rule__RosParameter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4107:1: ( rule__RosParameter__Group_7__1__Impl )
            // InternalComponentInterface.g:4108:2: rule__RosParameter__Group_7__1__Impl
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
    // InternalComponentInterface.g:4114:1: rule__RosParameter__Group_7__1__Impl : ( ( rule__RosParameter__ValueAssignment_7_1 ) ) ;
    public final void rule__RosParameter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4118:1: ( ( ( rule__RosParameter__ValueAssignment_7_1 ) ) )
            // InternalComponentInterface.g:4119:1: ( ( rule__RosParameter__ValueAssignment_7_1 ) )
            {
            // InternalComponentInterface.g:4119:1: ( ( rule__RosParameter__ValueAssignment_7_1 ) )
            // InternalComponentInterface.g:4120:2: ( rule__RosParameter__ValueAssignment_7_1 )
            {
             before(grammarAccess.getRosParameterAccess().getValueAssignment_7_1()); 
            // InternalComponentInterface.g:4121:2: ( rule__RosParameter__ValueAssignment_7_1 )
            // InternalComponentInterface.g:4121:3: rule__RosParameter__ValueAssignment_7_1
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
    // InternalComponentInterface.g:4130:1: rule__ParameterValue__Group_0__0 : rule__ParameterValue__Group_0__0__Impl rule__ParameterValue__Group_0__1 ;
    public final void rule__ParameterValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4134:1: ( rule__ParameterValue__Group_0__0__Impl rule__ParameterValue__Group_0__1 )
            // InternalComponentInterface.g:4135:2: rule__ParameterValue__Group_0__0__Impl rule__ParameterValue__Group_0__1
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
    // InternalComponentInterface.g:4142:1: rule__ParameterValue__Group_0__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4146:1: ( ( () ) )
            // InternalComponentInterface.g:4147:1: ( () )
            {
            // InternalComponentInterface.g:4147:1: ( () )
            // InternalComponentInterface.g:4148:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterDoubleAction_0_0()); 
            // InternalComponentInterface.g:4149:2: ()
            // InternalComponentInterface.g:4149:3: 
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
    // InternalComponentInterface.g:4157:1: rule__ParameterValue__Group_0__1 : rule__ParameterValue__Group_0__1__Impl ;
    public final void rule__ParameterValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4161:1: ( rule__ParameterValue__Group_0__1__Impl )
            // InternalComponentInterface.g:4162:2: rule__ParameterValue__Group_0__1__Impl
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
    // InternalComponentInterface.g:4168:1: rule__ParameterValue__Group_0__1__Impl : ( ruleDouble0 ) ;
    public final void rule__ParameterValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4172:1: ( ( ruleDouble0 ) )
            // InternalComponentInterface.g:4173:1: ( ruleDouble0 )
            {
            // InternalComponentInterface.g:4173:1: ( ruleDouble0 )
            // InternalComponentInterface.g:4174:2: ruleDouble0
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
    // InternalComponentInterface.g:4184:1: rule__ParameterValue__Group_1__0 : rule__ParameterValue__Group_1__0__Impl rule__ParameterValue__Group_1__1 ;
    public final void rule__ParameterValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4188:1: ( rule__ParameterValue__Group_1__0__Impl rule__ParameterValue__Group_1__1 )
            // InternalComponentInterface.g:4189:2: rule__ParameterValue__Group_1__0__Impl rule__ParameterValue__Group_1__1
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
    // InternalComponentInterface.g:4196:1: rule__ParameterValue__Group_1__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4200:1: ( ( () ) )
            // InternalComponentInterface.g:4201:1: ( () )
            {
            // InternalComponentInterface.g:4201:1: ( () )
            // InternalComponentInterface.g:4202:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterBooleanAction_1_0()); 
            // InternalComponentInterface.g:4203:2: ()
            // InternalComponentInterface.g:4203:3: 
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
    // InternalComponentInterface.g:4211:1: rule__ParameterValue__Group_1__1 : rule__ParameterValue__Group_1__1__Impl ;
    public final void rule__ParameterValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4215:1: ( rule__ParameterValue__Group_1__1__Impl )
            // InternalComponentInterface.g:4216:2: rule__ParameterValue__Group_1__1__Impl
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
    // InternalComponentInterface.g:4222:1: rule__ParameterValue__Group_1__1__Impl : ( ruleboolean0 ) ;
    public final void rule__ParameterValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4226:1: ( ( ruleboolean0 ) )
            // InternalComponentInterface.g:4227:1: ( ruleboolean0 )
            {
            // InternalComponentInterface.g:4227:1: ( ruleboolean0 )
            // InternalComponentInterface.g:4228:2: ruleboolean0
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
    // InternalComponentInterface.g:4238:1: rule__ParameterValue__Group_2__0 : rule__ParameterValue__Group_2__0__Impl rule__ParameterValue__Group_2__1 ;
    public final void rule__ParameterValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4242:1: ( rule__ParameterValue__Group_2__0__Impl rule__ParameterValue__Group_2__1 )
            // InternalComponentInterface.g:4243:2: rule__ParameterValue__Group_2__0__Impl rule__ParameterValue__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentInterface.g:4250:1: rule__ParameterValue__Group_2__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4254:1: ( ( () ) )
            // InternalComponentInterface.g:4255:1: ( () )
            {
            // InternalComponentInterface.g:4255:1: ( () )
            // InternalComponentInterface.g:4256:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterStringAction_2_0()); 
            // InternalComponentInterface.g:4257:2: ()
            // InternalComponentInterface.g:4257:3: 
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
    // InternalComponentInterface.g:4265:1: rule__ParameterValue__Group_2__1 : rule__ParameterValue__Group_2__1__Impl ;
    public final void rule__ParameterValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4269:1: ( rule__ParameterValue__Group_2__1__Impl )
            // InternalComponentInterface.g:4270:2: rule__ParameterValue__Group_2__1__Impl
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
    // InternalComponentInterface.g:4276:1: rule__ParameterValue__Group_2__1__Impl : ( ruleEString ) ;
    public final void rule__ParameterValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4280:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4281:1: ( ruleEString )
            {
            // InternalComponentInterface.g:4281:1: ( ruleEString )
            // InternalComponentInterface.g:4282:2: ruleEString
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


    // $ANTLR start "rule__ParameterValue__Group_3__0"
    // InternalComponentInterface.g:4292:1: rule__ParameterValue__Group_3__0 : rule__ParameterValue__Group_3__0__Impl rule__ParameterValue__Group_3__1 ;
    public final void rule__ParameterValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4296:1: ( rule__ParameterValue__Group_3__0__Impl rule__ParameterValue__Group_3__1 )
            // InternalComponentInterface.g:4297:2: rule__ParameterValue__Group_3__0__Impl rule__ParameterValue__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ParameterValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_3__1();

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
    // $ANTLR end "rule__ParameterValue__Group_3__0"


    // $ANTLR start "rule__ParameterValue__Group_3__0__Impl"
    // InternalComponentInterface.g:4304:1: rule__ParameterValue__Group_3__0__Impl : ( () ) ;
    public final void rule__ParameterValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4308:1: ( ( () ) )
            // InternalComponentInterface.g:4309:1: ( () )
            {
            // InternalComponentInterface.g:4309:1: ( () )
            // InternalComponentInterface.g:4310:2: ()
            {
             before(grammarAccess.getParameterValueAccess().getParameterIntegerAction_3_0()); 
            // InternalComponentInterface.g:4311:2: ()
            // InternalComponentInterface.g:4311:3: 
            {
            }

             after(grammarAccess.getParameterValueAccess().getParameterIntegerAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterValue__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterValue__Group_3__1"
    // InternalComponentInterface.g:4319:1: rule__ParameterValue__Group_3__1 : rule__ParameterValue__Group_3__1__Impl ;
    public final void rule__ParameterValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4323:1: ( rule__ParameterValue__Group_3__1__Impl )
            // InternalComponentInterface.g:4324:2: rule__ParameterValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterValue__Group_3__1__Impl();

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
    // $ANTLR end "rule__ParameterValue__Group_3__1"


    // $ANTLR start "rule__ParameterValue__Group_3__1__Impl"
    // InternalComponentInterface.g:4330:1: rule__ParameterValue__Group_3__1__Impl : ( ruleInteger0 ) ;
    public final void rule__ParameterValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4334:1: ( ( ruleInteger0 ) )
            // InternalComponentInterface.g:4335:1: ( ruleInteger0 )
            {
            // InternalComponentInterface.g:4335:1: ( ruleInteger0 )
            // InternalComponentInterface.g:4336:2: ruleInteger0
            {
             before(grammarAccess.getParameterValueAccess().getInteger0ParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getParameterValueAccess().getInteger0ParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__ParameterValue__Group_3__1__Impl"


    // $ANTLR start "rule__ComponentInterface__NameAssignment_3"
    // InternalComponentInterface.g:4346:1: rule__ComponentInterface__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4350:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4351:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4351:2: ( ruleEString )
            // InternalComponentInterface.g:4352:3: ruleEString
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
    // InternalComponentInterface.g:4361:1: rule__ComponentInterface__NameSpaceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ComponentInterface__NameSpaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4365:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4366:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4366:2: ( ruleEString )
            // InternalComponentInterface.g:4367:3: ruleEString
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
    // InternalComponentInterface.g:4376:1: rule__ComponentInterface__RospublisherAssignment_5_2 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4380:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:4381:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:4381:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:4382:3: ruleRosPublisher
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
    // InternalComponentInterface.g:4391:1: rule__ComponentInterface__RospublisherAssignment_5_3_1 : ( ruleRosPublisher ) ;
    public final void rule__ComponentInterface__RospublisherAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4395:1: ( ( ruleRosPublisher ) )
            // InternalComponentInterface.g:4396:2: ( ruleRosPublisher )
            {
            // InternalComponentInterface.g:4396:2: ( ruleRosPublisher )
            // InternalComponentInterface.g:4397:3: ruleRosPublisher
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
    // InternalComponentInterface.g:4406:1: rule__ComponentInterface__RossubscriberAssignment_6_2 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4410:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:4411:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:4411:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:4412:3: ruleRosSubscriber
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
    // InternalComponentInterface.g:4421:1: rule__ComponentInterface__RossubscriberAssignment_6_3_1 : ( ruleRosSubscriber ) ;
    public final void rule__ComponentInterface__RossubscriberAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4425:1: ( ( ruleRosSubscriber ) )
            // InternalComponentInterface.g:4426:2: ( ruleRosSubscriber )
            {
            // InternalComponentInterface.g:4426:2: ( ruleRosSubscriber )
            // InternalComponentInterface.g:4427:3: ruleRosSubscriber
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
    // InternalComponentInterface.g:4436:1: rule__ComponentInterface__RosserviceserverAssignment_7_2 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4440:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:4441:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:4441:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:4442:3: ruleRosServiceServer
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
    // InternalComponentInterface.g:4451:1: rule__ComponentInterface__RosserviceserverAssignment_7_3_1 : ( ruleRosServiceServer ) ;
    public final void rule__ComponentInterface__RosserviceserverAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4455:1: ( ( ruleRosServiceServer ) )
            // InternalComponentInterface.g:4456:2: ( ruleRosServiceServer )
            {
            // InternalComponentInterface.g:4456:2: ( ruleRosServiceServer )
            // InternalComponentInterface.g:4457:3: ruleRosServiceServer
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
    // InternalComponentInterface.g:4466:1: rule__ComponentInterface__RosserviceclientAssignment_8_2 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4470:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:4471:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:4471:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:4472:3: ruleRosServiceClient
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
    // InternalComponentInterface.g:4481:1: rule__ComponentInterface__RosserviceclientAssignment_8_3_1 : ( ruleRosServiceClient ) ;
    public final void rule__ComponentInterface__RosserviceclientAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4485:1: ( ( ruleRosServiceClient ) )
            // InternalComponentInterface.g:4486:2: ( ruleRosServiceClient )
            {
            // InternalComponentInterface.g:4486:2: ( ruleRosServiceClient )
            // InternalComponentInterface.g:4487:3: ruleRosServiceClient
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
    // InternalComponentInterface.g:4496:1: rule__ComponentInterface__RosactionserverAssignment_9_2 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4500:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:4501:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:4501:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:4502:3: ruleRosActionServer
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
    // InternalComponentInterface.g:4511:1: rule__ComponentInterface__RosactionserverAssignment_9_3_1 : ( ruleRosActionServer ) ;
    public final void rule__ComponentInterface__RosactionserverAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4515:1: ( ( ruleRosActionServer ) )
            // InternalComponentInterface.g:4516:2: ( ruleRosActionServer )
            {
            // InternalComponentInterface.g:4516:2: ( ruleRosActionServer )
            // InternalComponentInterface.g:4517:3: ruleRosActionServer
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
    // InternalComponentInterface.g:4526:1: rule__ComponentInterface__RosactionclientAssignment_10_2 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4530:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:4531:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:4531:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:4532:3: ruleRosActionClient
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
    // InternalComponentInterface.g:4541:1: rule__ComponentInterface__RosactionclientAssignment_10_3_1 : ( ruleRosActionClient ) ;
    public final void rule__ComponentInterface__RosactionclientAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4545:1: ( ( ruleRosActionClient ) )
            // InternalComponentInterface.g:4546:2: ( ruleRosActionClient )
            {
            // InternalComponentInterface.g:4546:2: ( ruleRosActionClient )
            // InternalComponentInterface.g:4547:3: ruleRosActionClient
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
    // InternalComponentInterface.g:4556:1: rule__ComponentInterface__RosparameterAssignment_11_2 : ( ruleRosParameter ) ;
    public final void rule__ComponentInterface__RosparameterAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4560:1: ( ( ruleRosParameter ) )
            // InternalComponentInterface.g:4561:2: ( ruleRosParameter )
            {
            // InternalComponentInterface.g:4561:2: ( ruleRosParameter )
            // InternalComponentInterface.g:4562:3: ruleRosParameter
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
    // InternalComponentInterface.g:4571:1: rule__ComponentInterface__RosparameterAssignment_11_3_1 : ( ruleRosParameter ) ;
    public final void rule__ComponentInterface__RosparameterAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4575:1: ( ( ruleRosParameter ) )
            // InternalComponentInterface.g:4576:2: ( ruleRosParameter )
            {
            // InternalComponentInterface.g:4576:2: ( ruleRosParameter )
            // InternalComponentInterface.g:4577:3: ruleRosParameter
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
    // InternalComponentInterface.g:4586:1: rule__RosPublisher__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosPublisher__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4590:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4591:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4591:2: ( ruleEString )
            // InternalComponentInterface.g:4592:3: ruleEString
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
    // InternalComponentInterface.g:4601:1: rule__RosPublisher__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosPublisher__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4605:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4606:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4606:2: ( ruleEString )
            // InternalComponentInterface.g:4607:3: ruleEString
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
    // InternalComponentInterface.g:4616:1: rule__RosPublisher__PublisherAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisher__PublisherAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4620:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4621:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4621:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4622:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherAccess().getPublisherPublisherCrossReference_6_0()); 
            // InternalComponentInterface.g:4623:3: ( ruleEString )
            // InternalComponentInterface.g:4624:4: ruleEString
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
    // InternalComponentInterface.g:4635:1: rule__RosSubscriber__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4639:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4640:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4640:2: ( ruleEString )
            // InternalComponentInterface.g:4641:3: ruleEString
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
    // InternalComponentInterface.g:4650:1: rule__RosSubscriber__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosSubscriber__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4654:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4655:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4655:2: ( ruleEString )
            // InternalComponentInterface.g:4656:3: ruleEString
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
    // InternalComponentInterface.g:4665:1: rule__RosSubscriber__SubscriberAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriber__SubscriberAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4669:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4670:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4670:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4671:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberAccess().getSubscriberSubscriberCrossReference_6_0()); 
            // InternalComponentInterface.g:4672:3: ( ruleEString )
            // InternalComponentInterface.g:4673:4: ruleEString
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
    // InternalComponentInterface.g:4684:1: rule__RosServiceServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4688:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4689:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4689:2: ( ruleEString )
            // InternalComponentInterface.g:4690:3: ruleEString
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
    // InternalComponentInterface.g:4699:1: rule__RosServiceServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4703:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4704:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4704:2: ( ruleEString )
            // InternalComponentInterface.g:4705:3: ruleEString
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
    // InternalComponentInterface.g:4714:1: rule__RosServiceServer__SrvserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServer__SrvserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4718:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4719:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4719:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4720:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerAccess().getSrvserverServiceServerCrossReference_6_0()); 
            // InternalComponentInterface.g:4721:3: ( ruleEString )
            // InternalComponentInterface.g:4722:4: ruleEString
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
    // InternalComponentInterface.g:4733:1: rule__RosServiceClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4737:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4738:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4738:2: ( ruleEString )
            // InternalComponentInterface.g:4739:3: ruleEString
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
    // InternalComponentInterface.g:4748:1: rule__RosServiceClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosServiceClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4752:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4753:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4753:2: ( ruleEString )
            // InternalComponentInterface.g:4754:3: ruleEString
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
    // InternalComponentInterface.g:4763:1: rule__RosServiceClient__SrvclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceClient__SrvclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4767:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4768:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4768:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4769:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceClientAccess().getSrvclientServiceClientCrossReference_6_0()); 
            // InternalComponentInterface.g:4770:3: ( ruleEString )
            // InternalComponentInterface.g:4771:4: ruleEString
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
    // InternalComponentInterface.g:4782:1: rule__RosActionServer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionServer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4786:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4787:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4787:2: ( ruleEString )
            // InternalComponentInterface.g:4788:3: ruleEString
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
    // InternalComponentInterface.g:4797:1: rule__RosActionServer__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionServer__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4801:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4802:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4802:2: ( ruleEString )
            // InternalComponentInterface.g:4803:3: ruleEString
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
    // InternalComponentInterface.g:4812:1: rule__RosActionServer__ActserverAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServer__ActserverAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4816:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4817:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4817:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4818:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerAccess().getActserverActionServerCrossReference_6_0()); 
            // InternalComponentInterface.g:4819:3: ( ruleEString )
            // InternalComponentInterface.g:4820:4: ruleEString
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
    // InternalComponentInterface.g:4831:1: rule__RosActionClient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosActionClient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4835:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4836:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4836:2: ( ruleEString )
            // InternalComponentInterface.g:4837:3: ruleEString
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
    // InternalComponentInterface.g:4846:1: rule__RosActionClient__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosActionClient__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4850:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4851:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4851:2: ( ruleEString )
            // InternalComponentInterface.g:4852:3: ruleEString
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
    // InternalComponentInterface.g:4861:1: rule__RosActionClient__ActclientAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClient__ActclientAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4865:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4866:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4866:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4867:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientAccess().getActclientActionClientCrossReference_6_0()); 
            // InternalComponentInterface.g:4868:3: ( ruleEString )
            // InternalComponentInterface.g:4869:4: ruleEString
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
    // InternalComponentInterface.g:4880:1: rule__RosParameter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RosParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4884:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4885:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4885:2: ( ruleEString )
            // InternalComponentInterface.g:4886:3: ruleEString
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
    // InternalComponentInterface.g:4895:1: rule__RosParameter__NsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RosParameter__NsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4899:1: ( ( ruleEString ) )
            // InternalComponentInterface.g:4900:2: ( ruleEString )
            {
            // InternalComponentInterface.g:4900:2: ( ruleEString )
            // InternalComponentInterface.g:4901:3: ruleEString
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
    // InternalComponentInterface.g:4910:1: rule__RosParameter__ParameterAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__RosParameter__ParameterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4914:1: ( ( ( ruleEString ) ) )
            // InternalComponentInterface.g:4915:2: ( ( ruleEString ) )
            {
            // InternalComponentInterface.g:4915:2: ( ( ruleEString ) )
            // InternalComponentInterface.g:4916:3: ( ruleEString )
            {
             before(grammarAccess.getRosParameterAccess().getParameterParameterCrossReference_6_0()); 
            // InternalComponentInterface.g:4917:3: ( ruleEString )
            // InternalComponentInterface.g:4918:4: ruleEString
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
    // InternalComponentInterface.g:4929:1: rule__RosParameter__ValueAssignment_7_1 : ( ruleParameterValue ) ;
    public final void rule__RosParameter__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentInterface.g:4933:1: ( ( ruleParameterValue ) )
            // InternalComponentInterface.g:4934:2: ( ruleParameterValue )
            {
            // InternalComponentInterface.g:4934:2: ( ruleParameterValue )
            // InternalComponentInterface.g:4935:3: ruleParameterValue
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000180L});
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000041000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000401000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});

}