package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ParameterStructMember", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "Connections", "Interfaces", "Parameters", "Processes", "GraphName", "Float32_1", "Float64_1", "Duration", "Feedback", "FromPub", "FromSub", "String_2", "Threads", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Default", "Float32", "Float64", "FromAC", "FromAS", "FromSC", "FromSS", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Int8_1", "Nodes", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "From", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "HyphenMinusLeftSquareBracket", "LeftSquareBracketRightSquareBracket", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=9;
    public static final int Float32_1=14;
    public static final int Node=71;
    public static final int RULE_DATE_TIME=93;
    public static final int Uint64_1=24;
    public static final int String=44;
    public static final int Processes=12;
    public static final int Int16=58;
    public static final int Float32=28;
    public static final int Goal=68;
    public static final int Bool=66;
    public static final int FromPub=18;
    public static final int Uint16=53;
    public static final int Boolean=25;
    public static final int Uint8=62;
    public static final int Parameters=11;
    public static final int RULE_ID=94;
    public static final int RULE_DIGIT=83;
    public static final int GlobalNamespace=7;
    public static final int Int16_1=34;
    public static final int Header=43;
    public static final int RULE_INT=96;
    public static final int Byte=67;
    public static final int RULE_ML_COMMENT=103;
    public static final int LeftSquareBracket=81;
    public static final int Base64=41;
    public static final int FromSS=33;
    public static final int Comma=78;
    public static final int HyphenMinus=79;
    public static final int RULE_MESSAGE_ASIGMENT=97;
    public static final int LeftSquareBracketRightSquareBracket=77;
    public static final int Int32=59;
    public static final int RULE_DECINT=86;
    public static final int Uint32=54;
    public static final int RULE_HOUR=91;
    public static final int Int8=69;
    public static final int Default=27;
    public static final int Int8_1=49;
    public static final int Uint16_1=22;
    public static final int Type=73;
    public static final int Float64=29;
    public static final int Int32_1=35;
    public static final int FromSC=32;
    public static final int RULE_BINARY=84;
    public static final int String_1=52;
    public static final int String_2=20;
    public static final int FromAC=30;
    public static final int RULE_DAY=88;
    public static final int RULE_BEGIN=98;
    public static final int RULE_BOOLEAN=85;
    public static final int RelativeNamespace=5;
    public static final int RULE_YEAR=90;
    public static final int Result=51;
    public static final int Name=70;
    public static final int RULE_MIN_SEC=92;
    public static final int FromAS=31;
    public static final int ParameterAny=8;
    public static final int List=65;
    public static final int RightSquareBracket=82;
    public static final int PrivateNamespace=6;
    public static final int GraphName=13;
    public static final int Byte_1=48;
    public static final int Float64_1=15;
    public static final int Duration=16;
    public static final int Uint32_1=23;
    public static final int Double=42;
    public static final int Type_1=61;
    public static final int Value=63;
    public static final int Uint64=55;
    public static final int Action=46;
    public static final int RULE_END=99;
    public static final int Message=37;
    public static final int Value_1=56;
    public static final int Time=72;
    public static final int RULE_STRING=95;
    public static final int Bool_1=47;
    public static final int Any=74;
    public static final int Struct=45;
    public static final int RULE_SL_COMMENT=100;
    public static final int Uint8_1=39;
    public static final int RULE_DOUBLE=87;
    public static final int Feedback=17;
    public static final int ParameterStructMember=4;
    public static final int RULE_ROS_CONVENTION_A=101;
    public static final int RULE_ROS_CONVENTION_PARAM=102;
    public static final int Colon=80;
    public static final int EOF=-1;
    public static final int FromSub=19;
    public static final int Ns=75;
    public static final int RULE_WS=104;
    public static final int HyphenMinusLeftSquareBracket=76;
    public static final int Int64_1=36;
    public static final int Service=38;
    public static final int From=57;
    public static final int RULE_ANY_OTHER=105;
    public static final int Nodes=50;
    public static final int Date=64;
    public static final int Interfaces=10;
    public static final int Threads=21;
    public static final int Integer=26;
    public static final int Array=40;
    public static final int Int64=60;
    public static final int RULE_MONTH=89;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystemParser.g"; }


    	private RosSystemGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("HyphenMinusLeftSquareBracket", "'-['");
    		tokenNameToValue.put("LeftSquareBracketRightSquareBracket", "'[]'");
    		tokenNameToValue.put("Any", "'Any'");
    		tokenNameToValue.put("Ns", "'ns:'");
    		tokenNameToValue.put("Date", "'Date'");
    		tokenNameToValue.put("List", "'List'");
    		tokenNameToValue.put("Bool", "'bool'");
    		tokenNameToValue.put("Byte", "'byte'");
    		tokenNameToValue.put("Goal", "'goal'");
    		tokenNameToValue.put("Int8", "'int8'");
    		tokenNameToValue.put("Name", "'name'");
    		tokenNameToValue.put("Node", "'node'");
    		tokenNameToValue.put("Time", "'time'");
    		tokenNameToValue.put("Type", "'type'");
    		tokenNameToValue.put("From", "'from:'");
    		tokenNameToValue.put("Int16", "'int16'");
    		tokenNameToValue.put("Int32", "'int32'");
    		tokenNameToValue.put("Int64", "'int64'");
    		tokenNameToValue.put("Type_1", "'type:'");
    		tokenNameToValue.put("Uint8", "'uint8'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("Array", "'Array:'");
    		tokenNameToValue.put("Base64", "'Base64'");
    		tokenNameToValue.put("Double", "'Double'");
    		tokenNameToValue.put("Header", "'Header'");
    		tokenNameToValue.put("String", "'String'");
    		tokenNameToValue.put("Struct", "'Struct'");
    		tokenNameToValue.put("Action", "'action'");
    		tokenNameToValue.put("Bool_1", "'bool[]'");
    		tokenNameToValue.put("Byte_1", "'byte[]'");
    		tokenNameToValue.put("Int8_1", "'int8[]'");
    		tokenNameToValue.put("Nodes", "'nodes:'");
    		tokenNameToValue.put("Result", "'result'");
    		tokenNameToValue.put("String_1", "'string'");
    		tokenNameToValue.put("Uint16", "'uint16'");
    		tokenNameToValue.put("Uint32", "'uint32'");
    		tokenNameToValue.put("Uint64", "'uint64'");
    		tokenNameToValue.put("Value_1", "'value:'");
    		tokenNameToValue.put("Boolean", "'Boolean'");
    		tokenNameToValue.put("Integer", "'Integer'");
    		tokenNameToValue.put("Default", "'default'");
    		tokenNameToValue.put("Float32", "'float32'");
    		tokenNameToValue.put("Float64", "'float64'");
    		tokenNameToValue.put("FromAC", "'fromAC:'");
    		tokenNameToValue.put("FromAS", "'fromAS:'");
    		tokenNameToValue.put("FromSC", "'fromSC:'");
    		tokenNameToValue.put("FromSS", "'fromSS:'");
    		tokenNameToValue.put("Int16_1", "'int16[]'");
    		tokenNameToValue.put("Int32_1", "'int32[]'");
    		tokenNameToValue.put("Int64_1", "'int64[]'");
    		tokenNameToValue.put("Message", "'message'");
    		tokenNameToValue.put("Service", "'service'");
    		tokenNameToValue.put("Uint8_1", "'uint8[]'");
    		tokenNameToValue.put("Duration", "'duration'");
    		tokenNameToValue.put("Feedback", "'feedback'");
    		tokenNameToValue.put("FromPub", "'fromPub:'");
    		tokenNameToValue.put("FromSub", "'fromSub:'");
    		tokenNameToValue.put("String_2", "'string[]'");
    		tokenNameToValue.put("Threads", "'threads:'");
    		tokenNameToValue.put("Uint16_1", "'uint16[]'");
    		tokenNameToValue.put("Uint32_1", "'uint32[]'");
    		tokenNameToValue.put("Uint64_1", "'uint64[]'");
    		tokenNameToValue.put("GraphName", "'GraphName'");
    		tokenNameToValue.put("Float32_1", "'float32[]'");
    		tokenNameToValue.put("Float64_1", "'float64[]'");
    		tokenNameToValue.put("Processes", "'processes:'");
    		tokenNameToValue.put("Interfaces", "'interfaces:'");
    		tokenNameToValue.put("Parameters", "'parameters:'");
    		tokenNameToValue.put("ParameterAny", "'ParameterAny'");
    		tokenNameToValue.put("Connections", "'connections:'");
    		tokenNameToValue.put("GlobalNamespace", "'GlobalNamespace'");
    		tokenNameToValue.put("PrivateNamespace", "'PrivateNamespace'");
    		tokenNameToValue.put("RelativeNamespace", "'RelativeNamespace'");
    		tokenNameToValue.put("ParameterStructMember", "'ParameterStructMember'");
    	}

    	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystemParser.g:134:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:135:1: ( ruleRosSystem EOF )
            // InternalRosSystemParser.g:136:1: ruleRosSystem EOF
            {
             before(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSystem();

            state._fsp--;

             after(grammarAccess.getRosSystemRule()); 
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
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystemParser.g:143:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:147:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystemParser.g:148:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystemParser.g:148:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystemParser.g:149:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup()); 
            // InternalRosSystemParser.g:150:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystemParser.g:150:4: rule__RosSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleProcess"
    // InternalRosSystemParser.g:159:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:160:1: ( ruleProcess EOF )
            // InternalRosSystemParser.g:161:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalRosSystemParser.g:168:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:172:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalRosSystemParser.g:173:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalRosSystemParser.g:173:2: ( ( rule__Process__Group__0 ) )
            // InternalRosSystemParser.g:174:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // InternalRosSystemParser.g:175:3: ( rule__Process__Group__0 )
            // InternalRosSystemParser.g:175:4: rule__Process__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleRosNode"
    // InternalRosSystemParser.g:184:1: entryRuleRosNode : ruleRosNode EOF ;
    public final void entryRuleRosNode() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:185:1: ( ruleRosNode EOF )
            // InternalRosSystemParser.g:186:1: ruleRosNode EOF
            {
             before(grammarAccess.getRosNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleRosNode();

            state._fsp--;

             after(grammarAccess.getRosNodeRule()); 
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
    // $ANTLR end "entryRuleRosNode"


    // $ANTLR start "ruleRosNode"
    // InternalRosSystemParser.g:193:1: ruleRosNode : ( ( rule__RosNode__Group__0 ) ) ;
    public final void ruleRosNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:197:2: ( ( ( rule__RosNode__Group__0 ) ) )
            // InternalRosSystemParser.g:198:2: ( ( rule__RosNode__Group__0 ) )
            {
            // InternalRosSystemParser.g:198:2: ( ( rule__RosNode__Group__0 ) )
            // InternalRosSystemParser.g:199:3: ( rule__RosNode__Group__0 )
            {
             before(grammarAccess.getRosNodeAccess().getGroup()); 
            // InternalRosSystemParser.g:200:3: ( rule__RosNode__Group__0 )
            // InternalRosSystemParser.g:200:4: rule__RosNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosNode"


    // $ANTLR start "entryRuleRosInterface"
    // InternalRosSystemParser.g:209:1: entryRuleRosInterface : ruleRosInterface EOF ;
    public final void entryRuleRosInterface() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:210:1: ( ruleRosInterface EOF )
            // InternalRosSystemParser.g:211:1: ruleRosInterface EOF
            {
             before(grammarAccess.getRosInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosInterface();

            state._fsp--;

             after(grammarAccess.getRosInterfaceRule()); 
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
    // $ANTLR end "entryRuleRosInterface"


    // $ANTLR start "ruleRosInterface"
    // InternalRosSystemParser.g:218:1: ruleRosInterface : ( ( rule__RosInterface__Group__0 ) ) ;
    public final void ruleRosInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:222:2: ( ( ( rule__RosInterface__Group__0 ) ) )
            // InternalRosSystemParser.g:223:2: ( ( rule__RosInterface__Group__0 ) )
            {
            // InternalRosSystemParser.g:223:2: ( ( rule__RosInterface__Group__0 ) )
            // InternalRosSystemParser.g:224:3: ( rule__RosInterface__Group__0 )
            {
             before(grammarAccess.getRosInterfaceAccess().getGroup()); 
            // InternalRosSystemParser.g:225:3: ( rule__RosInterface__Group__0 )
            // InternalRosSystemParser.g:225:4: rule__RosInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosInterface"


    // $ANTLR start "entryRuleInterfaceReference"
    // InternalRosSystemParser.g:234:1: entryRuleInterfaceReference : ruleInterfaceReference EOF ;
    public final void entryRuleInterfaceReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:235:1: ( ruleInterfaceReference EOF )
            // InternalRosSystemParser.g:236:1: ruleInterfaceReference EOF
            {
             before(grammarAccess.getInterfaceReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceReference();

            state._fsp--;

             after(grammarAccess.getInterfaceReferenceRule()); 
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
    // $ANTLR end "entryRuleInterfaceReference"


    // $ANTLR start "ruleInterfaceReference"
    // InternalRosSystemParser.g:243:1: ruleInterfaceReference : ( ( rule__InterfaceReference__Alternatives ) ) ;
    public final void ruleInterfaceReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:247:2: ( ( ( rule__InterfaceReference__Alternatives ) ) )
            // InternalRosSystemParser.g:248:2: ( ( rule__InterfaceReference__Alternatives ) )
            {
            // InternalRosSystemParser.g:248:2: ( ( rule__InterfaceReference__Alternatives ) )
            // InternalRosSystemParser.g:249:3: ( rule__InterfaceReference__Alternatives )
            {
             before(grammarAccess.getInterfaceReferenceAccess().getAlternatives()); 
            // InternalRosSystemParser.g:250:3: ( rule__InterfaceReference__Alternatives )
            // InternalRosSystemParser.g:250:4: rule__InterfaceReference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__InterfaceReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceReference"


    // $ANTLR start "entryRuleInterfaceReference_Impl"
    // InternalRosSystemParser.g:259:1: entryRuleInterfaceReference_Impl : ruleInterfaceReference_Impl EOF ;
    public final void entryRuleInterfaceReference_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:260:1: ( ruleInterfaceReference_Impl EOF )
            // InternalRosSystemParser.g:261:1: ruleInterfaceReference_Impl EOF
            {
             before(grammarAccess.getInterfaceReference_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleInterfaceReference_Impl();

            state._fsp--;

             after(grammarAccess.getInterfaceReference_ImplRule()); 
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
    // $ANTLR end "entryRuleInterfaceReference_Impl"


    // $ANTLR start "ruleInterfaceReference_Impl"
    // InternalRosSystemParser.g:268:1: ruleInterfaceReference_Impl : ( () ) ;
    public final void ruleInterfaceReference_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:272:2: ( ( () ) )
            // InternalRosSystemParser.g:273:2: ( () )
            {
            // InternalRosSystemParser.g:273:2: ( () )
            // InternalRosSystemParser.g:274:3: ()
            {
             before(grammarAccess.getInterfaceReference_ImplAccess().getInterfaceReferenceAction()); 
            // InternalRosSystemParser.g:275:3: ()
            // InternalRosSystemParser.g:275:4: 
            {
            }

             after(grammarAccess.getInterfaceReference_ImplAccess().getInterfaceReferenceAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterfaceReference_Impl"


    // $ANTLR start "entryRuleRosPublisherReference"
    // InternalRosSystemParser.g:284:1: entryRuleRosPublisherReference : ruleRosPublisherReference EOF ;
    public final void entryRuleRosPublisherReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:285:1: ( ruleRosPublisherReference EOF )
            // InternalRosSystemParser.g:286:1: ruleRosPublisherReference EOF
            {
             before(grammarAccess.getRosPublisherReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosPublisherReference();

            state._fsp--;

             after(grammarAccess.getRosPublisherReferenceRule()); 
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
    // $ANTLR end "entryRuleRosPublisherReference"


    // $ANTLR start "ruleRosPublisherReference"
    // InternalRosSystemParser.g:293:1: ruleRosPublisherReference : ( ( rule__RosPublisherReference__Group__0 ) ) ;
    public final void ruleRosPublisherReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:297:2: ( ( ( rule__RosPublisherReference__Group__0 ) ) )
            // InternalRosSystemParser.g:298:2: ( ( rule__RosPublisherReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:298:2: ( ( rule__RosPublisherReference__Group__0 ) )
            // InternalRosSystemParser.g:299:3: ( rule__RosPublisherReference__Group__0 )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getGroup()); 
            // InternalRosSystemParser.g:300:3: ( rule__RosPublisherReference__Group__0 )
            // InternalRosSystemParser.g:300:4: rule__RosPublisherReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosPublisherReference"


    // $ANTLR start "entryRuleRosSubscriberReference"
    // InternalRosSystemParser.g:309:1: entryRuleRosSubscriberReference : ruleRosSubscriberReference EOF ;
    public final void entryRuleRosSubscriberReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:310:1: ( ruleRosSubscriberReference EOF )
            // InternalRosSystemParser.g:311:1: ruleRosSubscriberReference EOF
            {
             before(grammarAccess.getRosSubscriberReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSubscriberReference();

            state._fsp--;

             after(grammarAccess.getRosSubscriberReferenceRule()); 
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
    // $ANTLR end "entryRuleRosSubscriberReference"


    // $ANTLR start "ruleRosSubscriberReference"
    // InternalRosSystemParser.g:318:1: ruleRosSubscriberReference : ( ( rule__RosSubscriberReference__Group__0 ) ) ;
    public final void ruleRosSubscriberReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:322:2: ( ( ( rule__RosSubscriberReference__Group__0 ) ) )
            // InternalRosSystemParser.g:323:2: ( ( rule__RosSubscriberReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:323:2: ( ( rule__RosSubscriberReference__Group__0 ) )
            // InternalRosSystemParser.g:324:3: ( rule__RosSubscriberReference__Group__0 )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getGroup()); 
            // InternalRosSystemParser.g:325:3: ( rule__RosSubscriberReference__Group__0 )
            // InternalRosSystemParser.g:325:4: rule__RosSubscriberReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSubscriberReference"


    // $ANTLR start "entryRuleRosServiceServerReference"
    // InternalRosSystemParser.g:334:1: entryRuleRosServiceServerReference : ruleRosServiceServerReference EOF ;
    public final void entryRuleRosServiceServerReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:335:1: ( ruleRosServiceServerReference EOF )
            // InternalRosSystemParser.g:336:1: ruleRosServiceServerReference EOF
            {
             before(grammarAccess.getRosServiceServerReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosServiceServerReference();

            state._fsp--;

             after(grammarAccess.getRosServiceServerReferenceRule()); 
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
    // $ANTLR end "entryRuleRosServiceServerReference"


    // $ANTLR start "ruleRosServiceServerReference"
    // InternalRosSystemParser.g:343:1: ruleRosServiceServerReference : ( ( rule__RosServiceServerReference__Group__0 ) ) ;
    public final void ruleRosServiceServerReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:347:2: ( ( ( rule__RosServiceServerReference__Group__0 ) ) )
            // InternalRosSystemParser.g:348:2: ( ( rule__RosServiceServerReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:348:2: ( ( rule__RosServiceServerReference__Group__0 ) )
            // InternalRosSystemParser.g:349:3: ( rule__RosServiceServerReference__Group__0 )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getGroup()); 
            // InternalRosSystemParser.g:350:3: ( rule__RosServiceServerReference__Group__0 )
            // InternalRosSystemParser.g:350:4: rule__RosServiceServerReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServiceServerReference"


    // $ANTLR start "entryRuleRosServerClientReference"
    // InternalRosSystemParser.g:359:1: entryRuleRosServerClientReference : ruleRosServerClientReference EOF ;
    public final void entryRuleRosServerClientReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:360:1: ( ruleRosServerClientReference EOF )
            // InternalRosSystemParser.g:361:1: ruleRosServerClientReference EOF
            {
             before(grammarAccess.getRosServerClientReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosServerClientReference();

            state._fsp--;

             after(grammarAccess.getRosServerClientReferenceRule()); 
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
    // $ANTLR end "entryRuleRosServerClientReference"


    // $ANTLR start "ruleRosServerClientReference"
    // InternalRosSystemParser.g:368:1: ruleRosServerClientReference : ( ( rule__RosServerClientReference__Group__0 ) ) ;
    public final void ruleRosServerClientReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:372:2: ( ( ( rule__RosServerClientReference__Group__0 ) ) )
            // InternalRosSystemParser.g:373:2: ( ( rule__RosServerClientReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:373:2: ( ( rule__RosServerClientReference__Group__0 ) )
            // InternalRosSystemParser.g:374:3: ( rule__RosServerClientReference__Group__0 )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getGroup()); 
            // InternalRosSystemParser.g:375:3: ( rule__RosServerClientReference__Group__0 )
            // InternalRosSystemParser.g:375:4: rule__RosServerClientReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosServerClientReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosServerClientReference"


    // $ANTLR start "entryRuleRosActionServerReference"
    // InternalRosSystemParser.g:384:1: entryRuleRosActionServerReference : ruleRosActionServerReference EOF ;
    public final void entryRuleRosActionServerReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:385:1: ( ruleRosActionServerReference EOF )
            // InternalRosSystemParser.g:386:1: ruleRosActionServerReference EOF
            {
             before(grammarAccess.getRosActionServerReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionServerReference();

            state._fsp--;

             after(grammarAccess.getRosActionServerReferenceRule()); 
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
    // $ANTLR end "entryRuleRosActionServerReference"


    // $ANTLR start "ruleRosActionServerReference"
    // InternalRosSystemParser.g:393:1: ruleRosActionServerReference : ( ( rule__RosActionServerReference__Group__0 ) ) ;
    public final void ruleRosActionServerReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:397:2: ( ( ( rule__RosActionServerReference__Group__0 ) ) )
            // InternalRosSystemParser.g:398:2: ( ( rule__RosActionServerReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:398:2: ( ( rule__RosActionServerReference__Group__0 ) )
            // InternalRosSystemParser.g:399:3: ( rule__RosActionServerReference__Group__0 )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getGroup()); 
            // InternalRosSystemParser.g:400:3: ( rule__RosActionServerReference__Group__0 )
            // InternalRosSystemParser.g:400:4: rule__RosActionServerReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionServerReference"


    // $ANTLR start "entryRuleRosActionClientReference"
    // InternalRosSystemParser.g:409:1: entryRuleRosActionClientReference : ruleRosActionClientReference EOF ;
    public final void entryRuleRosActionClientReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:410:1: ( ruleRosActionClientReference EOF )
            // InternalRosSystemParser.g:411:1: ruleRosActionClientReference EOF
            {
             before(grammarAccess.getRosActionClientReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionClientReference();

            state._fsp--;

             after(grammarAccess.getRosActionClientReferenceRule()); 
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
    // $ANTLR end "entryRuleRosActionClientReference"


    // $ANTLR start "ruleRosActionClientReference"
    // InternalRosSystemParser.g:418:1: ruleRosActionClientReference : ( ( rule__RosActionClientReference__Group__0 ) ) ;
    public final void ruleRosActionClientReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:422:2: ( ( ( rule__RosActionClientReference__Group__0 ) ) )
            // InternalRosSystemParser.g:423:2: ( ( rule__RosActionClientReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:423:2: ( ( rule__RosActionClientReference__Group__0 ) )
            // InternalRosSystemParser.g:424:3: ( rule__RosActionClientReference__Group__0 )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getGroup()); 
            // InternalRosSystemParser.g:425:3: ( rule__RosActionClientReference__Group__0 )
            // InternalRosSystemParser.g:425:4: rule__RosActionClientReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosActionClientReference"


    // $ANTLR start "entryRuleRosParameter"
    // InternalRosSystemParser.g:434:1: entryRuleRosParameter : ruleRosParameter EOF ;
    public final void entryRuleRosParameter() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:435:1: ( ruleRosParameter EOF )
            // InternalRosSystemParser.g:436:1: ruleRosParameter EOF
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
    // InternalRosSystemParser.g:443:1: ruleRosParameter : ( ( rule__RosParameter__Group__0 ) ) ;
    public final void ruleRosParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:447:2: ( ( ( rule__RosParameter__Group__0 ) ) )
            // InternalRosSystemParser.g:448:2: ( ( rule__RosParameter__Group__0 ) )
            {
            // InternalRosSystemParser.g:448:2: ( ( rule__RosParameter__Group__0 ) )
            // InternalRosSystemParser.g:449:3: ( rule__RosParameter__Group__0 )
            {
             before(grammarAccess.getRosParameterAccess().getGroup()); 
            // InternalRosSystemParser.g:450:3: ( rule__RosParameter__Group__0 )
            // InternalRosSystemParser.g:450:4: rule__RosParameter__Group__0
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


    // $ANTLR start "entryRuleRosConnection"
    // InternalRosSystemParser.g:459:1: entryRuleRosConnection : ruleRosConnection EOF ;
    public final void entryRuleRosConnection() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:460:1: ( ruleRosConnection EOF )
            // InternalRosSystemParser.g:461:1: ruleRosConnection EOF
            {
             before(grammarAccess.getRosConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleRosConnection();

            state._fsp--;

             after(grammarAccess.getRosConnectionRule()); 
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
    // $ANTLR end "entryRuleRosConnection"


    // $ANTLR start "ruleRosConnection"
    // InternalRosSystemParser.g:468:1: ruleRosConnection : ( ( rule__RosConnection__Group__0 ) ) ;
    public final void ruleRosConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:472:2: ( ( ( rule__RosConnection__Group__0 ) ) )
            // InternalRosSystemParser.g:473:2: ( ( rule__RosConnection__Group__0 ) )
            {
            // InternalRosSystemParser.g:473:2: ( ( rule__RosConnection__Group__0 ) )
            // InternalRosSystemParser.g:474:3: ( rule__RosConnection__Group__0 )
            {
             before(grammarAccess.getRosConnectionAccess().getGroup()); 
            // InternalRosSystemParser.g:475:3: ( rule__RosConnection__Group__0 )
            // InternalRosSystemParser.g:475:4: rule__RosConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosConnection"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystemParser.g:484:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:485:1: ( ruleNamespace EOF )
            // InternalRosSystemParser.g:486:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalRosSystemParser.g:493:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:497:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalRosSystemParser.g:498:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalRosSystemParser.g:498:2: ( ( rule__Namespace__Alternatives ) )
            // InternalRosSystemParser.g:499:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalRosSystemParser.g:500:3: ( rule__Namespace__Alternatives )
            // InternalRosSystemParser.g:500:4: rule__Namespace__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystemParser.g:509:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:510:1: ( ruleGraphName EOF )
            // InternalRosSystemParser.g:511:1: ruleGraphName EOF
            {
             before(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGraphNameRule()); 
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
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalRosSystemParser.g:518:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:522:2: ( ( GraphName ) )
            // InternalRosSystemParser.g:523:2: ( GraphName )
            {
            // InternalRosSystemParser.g:523:2: ( GraphName )
            // InternalRosSystemParser.g:524:3: GraphName
            {
             before(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 
            match(input,GraphName,FOLLOW_2); 
             after(grammarAccess.getGraphNameAccess().getGraphNameKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystemParser.g:534:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:535:1: ( ruleGlobalNamespace EOF )
            // InternalRosSystemParser.g:536:1: ruleGlobalNamespace EOF
            {
             before(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalNamespace();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceRule()); 
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
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalRosSystemParser.g:543:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:547:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:548:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:548:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalRosSystemParser.g:549:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalRosSystemParser.g:550:3: ( rule__GlobalNamespace__Group__0 )
            // InternalRosSystemParser.g:550:4: rule__GlobalNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalRosSystemParser.g:559:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:560:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalRosSystemParser.g:561:1: ruleRelativeNamespace_Impl EOF
            {
             before(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeNamespace_Impl();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplRule()); 
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
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalRosSystemParser.g:568:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:572:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalRosSystemParser.g:573:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalRosSystemParser.g:573:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalRosSystemParser.g:574:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalRosSystemParser.g:575:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalRosSystemParser.g:575:4: rule__RelativeNamespace_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalRosSystemParser.g:584:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:585:1: ( rulePrivateNamespace EOF )
            // InternalRosSystemParser.g:586:1: rulePrivateNamespace EOF
            {
             before(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            rulePrivateNamespace();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceRule()); 
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
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalRosSystemParser.g:593:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:597:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:598:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:598:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalRosSystemParser.g:599:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalRosSystemParser.g:600:3: ( rule__PrivateNamespace__Group__0 )
            // InternalRosSystemParser.g:600:4: rule__PrivateNamespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleParameter"
    // InternalRosSystemParser.g:609:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:610:1: ( ruleParameter EOF )
            // InternalRosSystemParser.g:611:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRosSystemParser.g:618:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:622:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalRosSystemParser.g:623:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalRosSystemParser.g:623:2: ( ( rule__Parameter__Group__0 ) )
            // InternalRosSystemParser.g:624:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalRosSystemParser.g:625:3: ( rule__Parameter__Group__0 )
            // InternalRosSystemParser.g:625:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterType"
    // InternalRosSystemParser.g:634:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:635:1: ( ruleParameterType EOF )
            // InternalRosSystemParser.g:636:1: ruleParameterType EOF
            {
             before(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterTypeRule()); 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalRosSystemParser.g:643:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:647:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalRosSystemParser.g:648:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalRosSystemParser.g:648:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalRosSystemParser.g:649:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalRosSystemParser.g:650:3: ( rule__ParameterType__Alternatives )
            // InternalRosSystemParser.g:650:4: rule__ParameterType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParameterType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalRosSystemParser.g:659:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:660:1: ( ruleParameterValue EOF )
            // InternalRosSystemParser.g:661:1: ruleParameterValue EOF
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
    // InternalRosSystemParser.g:668:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:672:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalRosSystemParser.g:673:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalRosSystemParser.g:673:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalRosSystemParser.g:674:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalRosSystemParser.g:675:3: ( rule__ParameterValue__Alternatives )
            // InternalRosSystemParser.g:675:4: rule__ParameterValue__Alternatives
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


    // $ANTLR start "entryRuleParameterListType"
    // InternalRosSystemParser.g:684:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:685:1: ( ruleParameterListType EOF )
            // InternalRosSystemParser.g:686:1: ruleParameterListType EOF
            {
             before(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterListType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeRule()); 
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
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalRosSystemParser.g:693:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:697:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalRosSystemParser.g:698:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalRosSystemParser.g:698:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalRosSystemParser.g:699:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:700:3: ( rule__ParameterListType__Group__0 )
            // InternalRosSystemParser.g:700:4: rule__ParameterListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalRosSystemParser.g:709:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:710:1: ( ruleParameterStructType EOF )
            // InternalRosSystemParser.g:711:1: ruleParameterStructType EOF
            {
             before(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructType();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeRule()); 
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
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalRosSystemParser.g:718:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:722:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalRosSystemParser.g:723:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalRosSystemParser.g:723:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalRosSystemParser.g:724:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:725:3: ( rule__ParameterStructType__Group__0 )
            // InternalRosSystemParser.g:725:4: rule__ParameterStructType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalRosSystemParser.g:734:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:735:1: ( ruleParameterIntegerType EOF )
            // InternalRosSystemParser.g:736:1: ruleParameterIntegerType EOF
            {
             before(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterIntegerType();

            state._fsp--;

             after(grammarAccess.getParameterIntegerTypeRule()); 
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
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalRosSystemParser.g:743:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:747:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalRosSystemParser.g:748:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalRosSystemParser.g:748:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalRosSystemParser.g:749:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:750:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalRosSystemParser.g:750:4: rule__ParameterIntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalRosSystemParser.g:759:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:760:1: ( ruleParameterStringType EOF )
            // InternalRosSystemParser.g:761:1: ruleParameterStringType EOF
            {
             before(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStringType();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeRule()); 
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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalRosSystemParser.g:768:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:772:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalRosSystemParser.g:773:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalRosSystemParser.g:773:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalRosSystemParser.g:774:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:775:3: ( rule__ParameterStringType__Group__0 )
            // InternalRosSystemParser.g:775:4: rule__ParameterStringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalRosSystemParser.g:784:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:785:1: ( ruleParameterDoubleType EOF )
            // InternalRosSystemParser.g:786:1: ruleParameterDoubleType EOF
            {
             before(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDoubleType();

            state._fsp--;

             after(grammarAccess.getParameterDoubleTypeRule()); 
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
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalRosSystemParser.g:793:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:797:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalRosSystemParser.g:798:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalRosSystemParser.g:798:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalRosSystemParser.g:799:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:800:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalRosSystemParser.g:800:4: rule__ParameterDoubleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalRosSystemParser.g:809:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:810:1: ( ruleParameterBooleanType EOF )
            // InternalRosSystemParser.g:811:1: ruleParameterBooleanType EOF
            {
             before(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBooleanType();

            state._fsp--;

             after(grammarAccess.getParameterBooleanTypeRule()); 
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
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalRosSystemParser.g:818:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:822:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalRosSystemParser.g:823:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalRosSystemParser.g:823:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalRosSystemParser.g:824:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:825:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalRosSystemParser.g:825:4: rule__ParameterBooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalRosSystemParser.g:834:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:835:1: ( ruleParameterBase64Type EOF )
            // InternalRosSystemParser.g:836:1: ruleParameterBase64Type EOF
            {
             before(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBase64Type();

            state._fsp--;

             after(grammarAccess.getParameterBase64TypeRule()); 
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
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalRosSystemParser.g:843:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:847:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalRosSystemParser.g:848:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalRosSystemParser.g:848:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalRosSystemParser.g:849:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup()); 
            // InternalRosSystemParser.g:850:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalRosSystemParser.g:850:4: rule__ParameterBase64Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64TypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalRosSystemParser.g:859:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:860:1: ( ruleParameterArrayType EOF )
            // InternalRosSystemParser.g:861:1: ruleParameterArrayType EOF
            {
             before(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterArrayType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeRule()); 
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
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalRosSystemParser.g:868:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:872:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalRosSystemParser.g:873:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalRosSystemParser.g:873:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalRosSystemParser.g:874:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:875:3: ( rule__ParameterArrayType__Group__0 )
            // InternalRosSystemParser.g:875:4: rule__ParameterArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalRosSystemParser.g:884:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:885:1: ( ruleParameterList EOF )
            // InternalRosSystemParser.g:886:1: ruleParameterList EOF
            {
             before(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterListRule()); 
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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalRosSystemParser.g:893:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:897:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalRosSystemParser.g:898:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalRosSystemParser.g:898:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalRosSystemParser.g:899:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalRosSystemParser.g:900:3: ( rule__ParameterList__Group__0 )
            // InternalRosSystemParser.g:900:4: rule__ParameterList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalRosSystemParser.g:909:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:910:1: ( ruleParameterAny EOF )
            // InternalRosSystemParser.g:911:1: ruleParameterAny EOF
            {
             before(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterAny();

            state._fsp--;

             after(grammarAccess.getParameterAnyRule()); 
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
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalRosSystemParser.g:918:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:922:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalRosSystemParser.g:923:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalRosSystemParser.g:923:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalRosSystemParser.g:924:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup()); 
            // InternalRosSystemParser.g:925:3: ( rule__ParameterAny__Group__0 )
            // InternalRosSystemParser.g:925:4: rule__ParameterAny__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalRosSystemParser.g:934:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:935:1: ( ruleParameterString EOF )
            // InternalRosSystemParser.g:936:1: ruleParameterString EOF
            {
             before(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringRule()); 
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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalRosSystemParser.g:943:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:947:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalRosSystemParser.g:948:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:948:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalRosSystemParser.g:949:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:950:3: ( rule__ParameterString__ValueAssignment )
            // InternalRosSystemParser.g:950:4: rule__ParameterString__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterString__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalRosSystemParser.g:959:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:960:1: ( ruleParameterBase64 EOF )
            // InternalRosSystemParser.g:961:1: ruleParameterBase64 EOF
            {
             before(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64Rule()); 
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
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalRosSystemParser.g:968:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:972:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalRosSystemParser.g:973:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:973:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalRosSystemParser.g:974:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment()); 
            // InternalRosSystemParser.g:975:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalRosSystemParser.g:975:4: rule__ParameterBase64__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64Access().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalRosSystemParser.g:984:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:985:1: ( ruleParameterInteger EOF )
            // InternalRosSystemParser.g:986:1: ruleParameterInteger EOF
            {
             before(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerRule()); 
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
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalRosSystemParser.g:993:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:997:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalRosSystemParser.g:998:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:998:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalRosSystemParser.g:999:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:1000:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalRosSystemParser.g:1000:4: rule__ParameterInteger__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInteger__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalRosSystemParser.g:1009:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1010:1: ( ruleParameterDouble EOF )
            // InternalRosSystemParser.g:1011:1: ruleParameterDouble EOF
            {
             before(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleRule()); 
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
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalRosSystemParser.g:1018:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1022:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1023:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1023:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalRosSystemParser.g:1024:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:1025:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalRosSystemParser.g:1025:4: rule__ParameterDouble__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDouble__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalRosSystemParser.g:1034:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1035:1: ( ruleParameterBoolean EOF )
            // InternalRosSystemParser.g:1036:1: ruleParameterBoolean EOF
            {
             before(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanRule()); 
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
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalRosSystemParser.g:1043:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1047:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1048:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1048:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalRosSystemParser.g:1049:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:1050:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalRosSystemParser.g:1050:4: rule__ParameterBoolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBoolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalRosSystemParser.g:1059:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1060:1: ( ruleParameterStruct EOF )
            // InternalRosSystemParser.g:1061:1: ruleParameterStruct EOF
            {
             before(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStruct();

            state._fsp--;

             after(grammarAccess.getParameterStructRule()); 
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
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalRosSystemParser.g:1068:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1072:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalRosSystemParser.g:1073:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalRosSystemParser.g:1073:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalRosSystemParser.g:1074:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup()); 
            // InternalRosSystemParser.g:1075:3: ( rule__ParameterStruct__Group__0 )
            // InternalRosSystemParser.g:1075:4: rule__ParameterStruct__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterDate"
    // InternalRosSystemParser.g:1084:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1085:1: ( ruleParameterDate EOF )
            // InternalRosSystemParser.g:1086:1: ruleParameterDate EOF
            {
             before(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDate();

            state._fsp--;

             after(grammarAccess.getParameterDateRule()); 
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
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalRosSystemParser.g:1093:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1097:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1098:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1098:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalRosSystemParser.g:1099:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:1100:3: ( rule__ParameterDate__ValueAssignment )
            // InternalRosSystemParser.g:1100:4: rule__ParameterDate__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDate__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterDateAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRosSystemParser.g:1109:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1110:1: ( ruleParameterStructMember EOF )
            // InternalRosSystemParser.g:1111:1: ruleParameterStructMember EOF
            {
             before(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberRule()); 
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
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalRosSystemParser.g:1118:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1122:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalRosSystemParser.g:1123:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:1123:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalRosSystemParser.g:1124:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup()); 
            // InternalRosSystemParser.g:1125:3: ( rule__ParameterStructMember__Group__0 )
            // InternalRosSystemParser.g:1125:4: rule__ParameterStructMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRosSystemParser.g:1134:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1135:1: ( ruleParameterStructTypeMember EOF )
            // InternalRosSystemParser.g:1136:1: ruleParameterStructTypeMember EOF
            {
             before(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberRule()); 
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
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalRosSystemParser.g:1143:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1147:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalRosSystemParser.g:1148:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:1148:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalRosSystemParser.g:1149:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup()); 
            // InternalRosSystemParser.g:1150:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalRosSystemParser.g:1150:4: rule__ParameterStructTypeMember__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalRosSystemParser.g:1159:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1160:1: ( ruleBase64Binary EOF )
            // InternalRosSystemParser.g:1161:1: ruleBase64Binary EOF
            {
             before(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getBase64BinaryRule()); 
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
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalRosSystemParser.g:1168:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1172:2: ( ( RULE_BINARY ) )
            // InternalRosSystemParser.g:1173:2: ( RULE_BINARY )
            {
            // InternalRosSystemParser.g:1173:2: ( RULE_BINARY )
            // InternalRosSystemParser.g:1174:3: RULE_BINARY
            {
             before(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall()); 
            match(input,RULE_BINARY,FOLLOW_2); 
             after(grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalRosSystemParser.g:1184:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1185:1: ( ruleboolean0 EOF )
            // InternalRosSystemParser.g:1186:1: ruleboolean0 EOF
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
    // InternalRosSystemParser.g:1193:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1197:2: ( ( RULE_BOOLEAN ) )
            // InternalRosSystemParser.g:1198:2: ( RULE_BOOLEAN )
            {
            // InternalRosSystemParser.g:1198:2: ( RULE_BOOLEAN )
            // InternalRosSystemParser.g:1199:3: RULE_BOOLEAN
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
    // InternalRosSystemParser.g:1209:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1210:1: ( ruleDouble0 EOF )
            // InternalRosSystemParser.g:1211:1: ruleDouble0 EOF
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
    // InternalRosSystemParser.g:1218:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1222:2: ( ( RULE_DOUBLE ) )
            // InternalRosSystemParser.g:1223:2: ( RULE_DOUBLE )
            {
            // InternalRosSystemParser.g:1223:2: ( RULE_DOUBLE )
            // InternalRosSystemParser.g:1224:3: RULE_DOUBLE
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
    // InternalRosSystemParser.g:1234:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1235:1: ( ruleInteger0 EOF )
            // InternalRosSystemParser.g:1236:1: ruleInteger0 EOF
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
    // InternalRosSystemParser.g:1243:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1247:2: ( ( RULE_DECINT ) )
            // InternalRosSystemParser.g:1248:2: ( RULE_DECINT )
            {
            // InternalRosSystemParser.g:1248:2: ( RULE_DECINT )
            // InternalRosSystemParser.g:1249:3: RULE_DECINT
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


    // $ANTLR start "entryRuleDateTime0"
    // InternalRosSystemParser.g:1259:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1260:1: ( ruleDateTime0 EOF )
            // InternalRosSystemParser.g:1261:1: ruleDateTime0 EOF
            {
             before(grammarAccess.getDateTime0Rule()); 
            pushFollow(FOLLOW_1);
            ruleDateTime0();

            state._fsp--;

             after(grammarAccess.getDateTime0Rule()); 
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
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalRosSystemParser.g:1268:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1272:2: ( ( RULE_DATE_TIME ) )
            // InternalRosSystemParser.g:1273:2: ( RULE_DATE_TIME )
            {
            // InternalRosSystemParser.g:1273:2: ( RULE_DATE_TIME )
            // InternalRosSystemParser.g:1274:3: RULE_DATE_TIME
            {
             before(grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall()); 
            match(input,RULE_DATE_TIME,FOLLOW_2); 
             after(grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleAbstractType"
    // InternalRosSystemParser.g:1284:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1285:1: ( ruleAbstractType EOF )
            // InternalRosSystemParser.g:1286:1: ruleAbstractType EOF
            {
             before(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractType();

            state._fsp--;

             after(grammarAccess.getAbstractTypeRule()); 
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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalRosSystemParser.g:1293:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1297:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalRosSystemParser.g:1298:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalRosSystemParser.g:1298:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalRosSystemParser.g:1299:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // InternalRosSystemParser.g:1300:3: ( rule__AbstractType__Alternatives )
            // InternalRosSystemParser.g:1300:4: rule__AbstractType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulebool"
    // InternalRosSystemParser.g:1309:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1310:1: ( rulebool EOF )
            // InternalRosSystemParser.g:1311:1: rulebool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            rulebool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalRosSystemParser.g:1318:1: rulebool : ( ( rule__Bool__Group__0 ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1322:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalRosSystemParser.g:1323:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalRosSystemParser.g:1323:2: ( ( rule__Bool__Group__0 ) )
            // InternalRosSystemParser.g:1324:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalRosSystemParser.g:1325:3: ( rule__Bool__Group__0 )
            // InternalRosSystemParser.g:1325:4: rule__Bool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint8"
    // InternalRosSystemParser.g:1334:1: entryRuleint8 : ruleint8 EOF ;
    public final void entryRuleint8() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1335:1: ( ruleint8 EOF )
            // InternalRosSystemParser.g:1336:1: ruleint8 EOF
            {
             before(grammarAccess.getInt8Rule()); 
            pushFollow(FOLLOW_1);
            ruleint8();

            state._fsp--;

             after(grammarAccess.getInt8Rule()); 
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
    // $ANTLR end "entryRuleint8"


    // $ANTLR start "ruleint8"
    // InternalRosSystemParser.g:1343:1: ruleint8 : ( ( rule__Int8__Group__0 ) ) ;
    public final void ruleint8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1347:2: ( ( ( rule__Int8__Group__0 ) ) )
            // InternalRosSystemParser.g:1348:2: ( ( rule__Int8__Group__0 ) )
            {
            // InternalRosSystemParser.g:1348:2: ( ( rule__Int8__Group__0 ) )
            // InternalRosSystemParser.g:1349:3: ( rule__Int8__Group__0 )
            {
             before(grammarAccess.getInt8Access().getGroup()); 
            // InternalRosSystemParser.g:1350:3: ( rule__Int8__Group__0 )
            // InternalRosSystemParser.g:1350:4: rule__Int8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt8Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint8"


    // $ANTLR start "entryRuleuint8"
    // InternalRosSystemParser.g:1359:1: entryRuleuint8 : ruleuint8 EOF ;
    public final void entryRuleuint8() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1360:1: ( ruleuint8 EOF )
            // InternalRosSystemParser.g:1361:1: ruleuint8 EOF
            {
             before(grammarAccess.getUint8Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint8();

            state._fsp--;

             after(grammarAccess.getUint8Rule()); 
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
    // $ANTLR end "entryRuleuint8"


    // $ANTLR start "ruleuint8"
    // InternalRosSystemParser.g:1368:1: ruleuint8 : ( ( rule__Uint8__Group__0 ) ) ;
    public final void ruleuint8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1372:2: ( ( ( rule__Uint8__Group__0 ) ) )
            // InternalRosSystemParser.g:1373:2: ( ( rule__Uint8__Group__0 ) )
            {
            // InternalRosSystemParser.g:1373:2: ( ( rule__Uint8__Group__0 ) )
            // InternalRosSystemParser.g:1374:3: ( rule__Uint8__Group__0 )
            {
             before(grammarAccess.getUint8Access().getGroup()); 
            // InternalRosSystemParser.g:1375:3: ( rule__Uint8__Group__0 )
            // InternalRosSystemParser.g:1375:4: rule__Uint8__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint8__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint8Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint8"


    // $ANTLR start "entryRuleint16"
    // InternalRosSystemParser.g:1384:1: entryRuleint16 : ruleint16 EOF ;
    public final void entryRuleint16() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1385:1: ( ruleint16 EOF )
            // InternalRosSystemParser.g:1386:1: ruleint16 EOF
            {
             before(grammarAccess.getInt16Rule()); 
            pushFollow(FOLLOW_1);
            ruleint16();

            state._fsp--;

             after(grammarAccess.getInt16Rule()); 
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
    // $ANTLR end "entryRuleint16"


    // $ANTLR start "ruleint16"
    // InternalRosSystemParser.g:1393:1: ruleint16 : ( ( rule__Int16__Group__0 ) ) ;
    public final void ruleint16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1397:2: ( ( ( rule__Int16__Group__0 ) ) )
            // InternalRosSystemParser.g:1398:2: ( ( rule__Int16__Group__0 ) )
            {
            // InternalRosSystemParser.g:1398:2: ( ( rule__Int16__Group__0 ) )
            // InternalRosSystemParser.g:1399:3: ( rule__Int16__Group__0 )
            {
             before(grammarAccess.getInt16Access().getGroup()); 
            // InternalRosSystemParser.g:1400:3: ( rule__Int16__Group__0 )
            // InternalRosSystemParser.g:1400:4: rule__Int16__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int16__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt16Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint16"


    // $ANTLR start "entryRuleuint16"
    // InternalRosSystemParser.g:1409:1: entryRuleuint16 : ruleuint16 EOF ;
    public final void entryRuleuint16() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1410:1: ( ruleuint16 EOF )
            // InternalRosSystemParser.g:1411:1: ruleuint16 EOF
            {
             before(grammarAccess.getUint16Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint16();

            state._fsp--;

             after(grammarAccess.getUint16Rule()); 
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
    // $ANTLR end "entryRuleuint16"


    // $ANTLR start "ruleuint16"
    // InternalRosSystemParser.g:1418:1: ruleuint16 : ( ( rule__Uint16__Group__0 ) ) ;
    public final void ruleuint16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1422:2: ( ( ( rule__Uint16__Group__0 ) ) )
            // InternalRosSystemParser.g:1423:2: ( ( rule__Uint16__Group__0 ) )
            {
            // InternalRosSystemParser.g:1423:2: ( ( rule__Uint16__Group__0 ) )
            // InternalRosSystemParser.g:1424:3: ( rule__Uint16__Group__0 )
            {
             before(grammarAccess.getUint16Access().getGroup()); 
            // InternalRosSystemParser.g:1425:3: ( rule__Uint16__Group__0 )
            // InternalRosSystemParser.g:1425:4: rule__Uint16__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint16__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint16Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint16"


    // $ANTLR start "entryRuleint32"
    // InternalRosSystemParser.g:1434:1: entryRuleint32 : ruleint32 EOF ;
    public final void entryRuleint32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1435:1: ( ruleint32 EOF )
            // InternalRosSystemParser.g:1436:1: ruleint32 EOF
            {
             before(grammarAccess.getInt32Rule()); 
            pushFollow(FOLLOW_1);
            ruleint32();

            state._fsp--;

             after(grammarAccess.getInt32Rule()); 
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
    // $ANTLR end "entryRuleint32"


    // $ANTLR start "ruleint32"
    // InternalRosSystemParser.g:1443:1: ruleint32 : ( ( rule__Int32__Group__0 ) ) ;
    public final void ruleint32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1447:2: ( ( ( rule__Int32__Group__0 ) ) )
            // InternalRosSystemParser.g:1448:2: ( ( rule__Int32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1448:2: ( ( rule__Int32__Group__0 ) )
            // InternalRosSystemParser.g:1449:3: ( rule__Int32__Group__0 )
            {
             before(grammarAccess.getInt32Access().getGroup()); 
            // InternalRosSystemParser.g:1450:3: ( rule__Int32__Group__0 )
            // InternalRosSystemParser.g:1450:4: rule__Int32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint32"


    // $ANTLR start "entryRuleuint32"
    // InternalRosSystemParser.g:1459:1: entryRuleuint32 : ruleuint32 EOF ;
    public final void entryRuleuint32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1460:1: ( ruleuint32 EOF )
            // InternalRosSystemParser.g:1461:1: ruleuint32 EOF
            {
             before(grammarAccess.getUint32Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint32();

            state._fsp--;

             after(grammarAccess.getUint32Rule()); 
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
    // $ANTLR end "entryRuleuint32"


    // $ANTLR start "ruleuint32"
    // InternalRosSystemParser.g:1468:1: ruleuint32 : ( ( rule__Uint32__Group__0 ) ) ;
    public final void ruleuint32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1472:2: ( ( ( rule__Uint32__Group__0 ) ) )
            // InternalRosSystemParser.g:1473:2: ( ( rule__Uint32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1473:2: ( ( rule__Uint32__Group__0 ) )
            // InternalRosSystemParser.g:1474:3: ( rule__Uint32__Group__0 )
            {
             before(grammarAccess.getUint32Access().getGroup()); 
            // InternalRosSystemParser.g:1475:3: ( rule__Uint32__Group__0 )
            // InternalRosSystemParser.g:1475:4: rule__Uint32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint32Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint32"


    // $ANTLR start "entryRuleint64"
    // InternalRosSystemParser.g:1484:1: entryRuleint64 : ruleint64 EOF ;
    public final void entryRuleint64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1485:1: ( ruleint64 EOF )
            // InternalRosSystemParser.g:1486:1: ruleint64 EOF
            {
             before(grammarAccess.getInt64Rule()); 
            pushFollow(FOLLOW_1);
            ruleint64();

            state._fsp--;

             after(grammarAccess.getInt64Rule()); 
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
    // $ANTLR end "entryRuleint64"


    // $ANTLR start "ruleint64"
    // InternalRosSystemParser.g:1493:1: ruleint64 : ( ( rule__Int64__Group__0 ) ) ;
    public final void ruleint64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1497:2: ( ( ( rule__Int64__Group__0 ) ) )
            // InternalRosSystemParser.g:1498:2: ( ( rule__Int64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1498:2: ( ( rule__Int64__Group__0 ) )
            // InternalRosSystemParser.g:1499:3: ( rule__Int64__Group__0 )
            {
             before(grammarAccess.getInt64Access().getGroup()); 
            // InternalRosSystemParser.g:1500:3: ( rule__Int64__Group__0 )
            // InternalRosSystemParser.g:1500:4: rule__Int64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint64"


    // $ANTLR start "entryRuleuint64"
    // InternalRosSystemParser.g:1509:1: entryRuleuint64 : ruleuint64 EOF ;
    public final void entryRuleuint64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1510:1: ( ruleuint64 EOF )
            // InternalRosSystemParser.g:1511:1: ruleuint64 EOF
            {
             before(grammarAccess.getUint64Rule()); 
            pushFollow(FOLLOW_1);
            ruleuint64();

            state._fsp--;

             after(grammarAccess.getUint64Rule()); 
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
    // $ANTLR end "entryRuleuint64"


    // $ANTLR start "ruleuint64"
    // InternalRosSystemParser.g:1518:1: ruleuint64 : ( ( rule__Uint64__Group__0 ) ) ;
    public final void ruleuint64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1522:2: ( ( ( rule__Uint64__Group__0 ) ) )
            // InternalRosSystemParser.g:1523:2: ( ( rule__Uint64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1523:2: ( ( rule__Uint64__Group__0 ) )
            // InternalRosSystemParser.g:1524:3: ( rule__Uint64__Group__0 )
            {
             before(grammarAccess.getUint64Access().getGroup()); 
            // InternalRosSystemParser.g:1525:3: ( rule__Uint64__Group__0 )
            // InternalRosSystemParser.g:1525:4: rule__Uint64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint64"


    // $ANTLR start "entryRulefloat32"
    // InternalRosSystemParser.g:1534:1: entryRulefloat32 : rulefloat32 EOF ;
    public final void entryRulefloat32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1535:1: ( rulefloat32 EOF )
            // InternalRosSystemParser.g:1536:1: rulefloat32 EOF
            {
             before(grammarAccess.getFloat32Rule()); 
            pushFollow(FOLLOW_1);
            rulefloat32();

            state._fsp--;

             after(grammarAccess.getFloat32Rule()); 
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
    // $ANTLR end "entryRulefloat32"


    // $ANTLR start "rulefloat32"
    // InternalRosSystemParser.g:1543:1: rulefloat32 : ( ( rule__Float32__Group__0 ) ) ;
    public final void rulefloat32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1547:2: ( ( ( rule__Float32__Group__0 ) ) )
            // InternalRosSystemParser.g:1548:2: ( ( rule__Float32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1548:2: ( ( rule__Float32__Group__0 ) )
            // InternalRosSystemParser.g:1549:3: ( rule__Float32__Group__0 )
            {
             before(grammarAccess.getFloat32Access().getGroup()); 
            // InternalRosSystemParser.g:1550:3: ( rule__Float32__Group__0 )
            // InternalRosSystemParser.g:1550:4: rule__Float32__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float32__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat32Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat32"


    // $ANTLR start "entryRulefloat64"
    // InternalRosSystemParser.g:1559:1: entryRulefloat64 : rulefloat64 EOF ;
    public final void entryRulefloat64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1560:1: ( rulefloat64 EOF )
            // InternalRosSystemParser.g:1561:1: rulefloat64 EOF
            {
             before(grammarAccess.getFloat64Rule()); 
            pushFollow(FOLLOW_1);
            rulefloat64();

            state._fsp--;

             after(grammarAccess.getFloat64Rule()); 
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
    // $ANTLR end "entryRulefloat64"


    // $ANTLR start "rulefloat64"
    // InternalRosSystemParser.g:1568:1: rulefloat64 : ( ( rule__Float64__Group__0 ) ) ;
    public final void rulefloat64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1572:2: ( ( ( rule__Float64__Group__0 ) ) )
            // InternalRosSystemParser.g:1573:2: ( ( rule__Float64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1573:2: ( ( rule__Float64__Group__0 ) )
            // InternalRosSystemParser.g:1574:3: ( rule__Float64__Group__0 )
            {
             before(grammarAccess.getFloat64Access().getGroup()); 
            // InternalRosSystemParser.g:1575:3: ( rule__Float64__Group__0 )
            // InternalRosSystemParser.g:1575:4: rule__Float64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat64"


    // $ANTLR start "entryRulestring0"
    // InternalRosSystemParser.g:1584:1: entryRulestring0 : rulestring0 EOF ;
    public final void entryRulestring0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1585:1: ( rulestring0 EOF )
            // InternalRosSystemParser.g:1586:1: rulestring0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            rulestring0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRulestring0"


    // $ANTLR start "rulestring0"
    // InternalRosSystemParser.g:1593:1: rulestring0 : ( ( rule__String0__Group__0 ) ) ;
    public final void rulestring0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1597:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalRosSystemParser.g:1598:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalRosSystemParser.g:1598:2: ( ( rule__String0__Group__0 ) )
            // InternalRosSystemParser.g:1599:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalRosSystemParser.g:1600:3: ( rule__String0__Group__0 )
            // InternalRosSystemParser.g:1600:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring0"


    // $ANTLR start "entryRulebyte"
    // InternalRosSystemParser.g:1609:1: entryRulebyte : rulebyte EOF ;
    public final void entryRulebyte() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1610:1: ( rulebyte EOF )
            // InternalRosSystemParser.g:1611:1: rulebyte EOF
            {
             before(grammarAccess.getByteRule()); 
            pushFollow(FOLLOW_1);
            rulebyte();

            state._fsp--;

             after(grammarAccess.getByteRule()); 
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
    // $ANTLR end "entryRulebyte"


    // $ANTLR start "rulebyte"
    // InternalRosSystemParser.g:1618:1: rulebyte : ( ( rule__Byte__Group__0 ) ) ;
    public final void rulebyte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1622:2: ( ( ( rule__Byte__Group__0 ) ) )
            // InternalRosSystemParser.g:1623:2: ( ( rule__Byte__Group__0 ) )
            {
            // InternalRosSystemParser.g:1623:2: ( ( rule__Byte__Group__0 ) )
            // InternalRosSystemParser.g:1624:3: ( rule__Byte__Group__0 )
            {
             before(grammarAccess.getByteAccess().getGroup()); 
            // InternalRosSystemParser.g:1625:3: ( rule__Byte__Group__0 )
            // InternalRosSystemParser.g:1625:4: rule__Byte__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Byte__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebyte"


    // $ANTLR start "entryRuletime"
    // InternalRosSystemParser.g:1634:1: entryRuletime : ruletime EOF ;
    public final void entryRuletime() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1635:1: ( ruletime EOF )
            // InternalRosSystemParser.g:1636:1: ruletime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruletime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuletime"


    // $ANTLR start "ruletime"
    // InternalRosSystemParser.g:1643:1: ruletime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruletime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1647:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalRosSystemParser.g:1648:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalRosSystemParser.g:1648:2: ( ( rule__Time__Group__0 ) )
            // InternalRosSystemParser.g:1649:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalRosSystemParser.g:1650:3: ( rule__Time__Group__0 )
            // InternalRosSystemParser.g:1650:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletime"


    // $ANTLR start "entryRuleduration"
    // InternalRosSystemParser.g:1659:1: entryRuleduration : ruleduration EOF ;
    public final void entryRuleduration() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1660:1: ( ruleduration EOF )
            // InternalRosSystemParser.g:1661:1: ruleduration EOF
            {
             before(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleduration();

            state._fsp--;

             after(grammarAccess.getDurationRule()); 
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
    // $ANTLR end "entryRuleduration"


    // $ANTLR start "ruleduration"
    // InternalRosSystemParser.g:1668:1: ruleduration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleduration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1672:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalRosSystemParser.g:1673:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalRosSystemParser.g:1673:2: ( ( rule__Duration__Group__0 ) )
            // InternalRosSystemParser.g:1674:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalRosSystemParser.g:1675:3: ( rule__Duration__Group__0 )
            // InternalRosSystemParser.g:1675:4: rule__Duration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleduration"


    // $ANTLR start "entryRuleboolArray"
    // InternalRosSystemParser.g:1684:1: entryRuleboolArray : ruleboolArray EOF ;
    public final void entryRuleboolArray() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1685:1: ( ruleboolArray EOF )
            // InternalRosSystemParser.g:1686:1: ruleboolArray EOF
            {
             before(grammarAccess.getBoolArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleboolArray();

            state._fsp--;

             after(grammarAccess.getBoolArrayRule()); 
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
    // $ANTLR end "entryRuleboolArray"


    // $ANTLR start "ruleboolArray"
    // InternalRosSystemParser.g:1693:1: ruleboolArray : ( ( rule__BoolArray__Group__0 ) ) ;
    public final void ruleboolArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1697:2: ( ( ( rule__BoolArray__Group__0 ) ) )
            // InternalRosSystemParser.g:1698:2: ( ( rule__BoolArray__Group__0 ) )
            {
            // InternalRosSystemParser.g:1698:2: ( ( rule__BoolArray__Group__0 ) )
            // InternalRosSystemParser.g:1699:3: ( rule__BoolArray__Group__0 )
            {
             before(grammarAccess.getBoolArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1700:3: ( rule__BoolArray__Group__0 )
            // InternalRosSystemParser.g:1700:4: rule__BoolArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleboolArray"


    // $ANTLR start "entryRuleint8Array"
    // InternalRosSystemParser.g:1709:1: entryRuleint8Array : ruleint8Array EOF ;
    public final void entryRuleint8Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1710:1: ( ruleint8Array EOF )
            // InternalRosSystemParser.g:1711:1: ruleint8Array EOF
            {
             before(grammarAccess.getInt8ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint8Array();

            state._fsp--;

             after(grammarAccess.getInt8ArrayRule()); 
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
    // $ANTLR end "entryRuleint8Array"


    // $ANTLR start "ruleint8Array"
    // InternalRosSystemParser.g:1718:1: ruleint8Array : ( ( rule__Int8Array__Group__0 ) ) ;
    public final void ruleint8Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1722:2: ( ( ( rule__Int8Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1723:2: ( ( rule__Int8Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1723:2: ( ( rule__Int8Array__Group__0 ) )
            // InternalRosSystemParser.g:1724:3: ( rule__Int8Array__Group__0 )
            {
             before(grammarAccess.getInt8ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1725:3: ( rule__Int8Array__Group__0 )
            // InternalRosSystemParser.g:1725:4: rule__Int8Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt8ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint8Array"


    // $ANTLR start "entryRuleuint8Array"
    // InternalRosSystemParser.g:1734:1: entryRuleuint8Array : ruleuint8Array EOF ;
    public final void entryRuleuint8Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1735:1: ( ruleuint8Array EOF )
            // InternalRosSystemParser.g:1736:1: ruleuint8Array EOF
            {
             before(grammarAccess.getUint8ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint8Array();

            state._fsp--;

             after(grammarAccess.getUint8ArrayRule()); 
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
    // $ANTLR end "entryRuleuint8Array"


    // $ANTLR start "ruleuint8Array"
    // InternalRosSystemParser.g:1743:1: ruleuint8Array : ( ( rule__Uint8Array__Group__0 ) ) ;
    public final void ruleuint8Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1747:2: ( ( ( rule__Uint8Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1748:2: ( ( rule__Uint8Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1748:2: ( ( rule__Uint8Array__Group__0 ) )
            // InternalRosSystemParser.g:1749:3: ( rule__Uint8Array__Group__0 )
            {
             before(grammarAccess.getUint8ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1750:3: ( rule__Uint8Array__Group__0 )
            // InternalRosSystemParser.g:1750:4: rule__Uint8Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint8ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint8Array"


    // $ANTLR start "entryRuleint16Array"
    // InternalRosSystemParser.g:1759:1: entryRuleint16Array : ruleint16Array EOF ;
    public final void entryRuleint16Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1760:1: ( ruleint16Array EOF )
            // InternalRosSystemParser.g:1761:1: ruleint16Array EOF
            {
             before(grammarAccess.getInt16ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint16Array();

            state._fsp--;

             after(grammarAccess.getInt16ArrayRule()); 
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
    // $ANTLR end "entryRuleint16Array"


    // $ANTLR start "ruleint16Array"
    // InternalRosSystemParser.g:1768:1: ruleint16Array : ( ( rule__Int16Array__Group__0 ) ) ;
    public final void ruleint16Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1772:2: ( ( ( rule__Int16Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1773:2: ( ( rule__Int16Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1773:2: ( ( rule__Int16Array__Group__0 ) )
            // InternalRosSystemParser.g:1774:3: ( rule__Int16Array__Group__0 )
            {
             before(grammarAccess.getInt16ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1775:3: ( rule__Int16Array__Group__0 )
            // InternalRosSystemParser.g:1775:4: rule__Int16Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt16ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint16Array"


    // $ANTLR start "entryRuleuint16Array"
    // InternalRosSystemParser.g:1784:1: entryRuleuint16Array : ruleuint16Array EOF ;
    public final void entryRuleuint16Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1785:1: ( ruleuint16Array EOF )
            // InternalRosSystemParser.g:1786:1: ruleuint16Array EOF
            {
             before(grammarAccess.getUint16ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint16Array();

            state._fsp--;

             after(grammarAccess.getUint16ArrayRule()); 
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
    // $ANTLR end "entryRuleuint16Array"


    // $ANTLR start "ruleuint16Array"
    // InternalRosSystemParser.g:1793:1: ruleuint16Array : ( ( rule__Uint16Array__Group__0 ) ) ;
    public final void ruleuint16Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1797:2: ( ( ( rule__Uint16Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1798:2: ( ( rule__Uint16Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1798:2: ( ( rule__Uint16Array__Group__0 ) )
            // InternalRosSystemParser.g:1799:3: ( rule__Uint16Array__Group__0 )
            {
             before(grammarAccess.getUint16ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1800:3: ( rule__Uint16Array__Group__0 )
            // InternalRosSystemParser.g:1800:4: rule__Uint16Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint16ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint16Array"


    // $ANTLR start "entryRuleint32Array"
    // InternalRosSystemParser.g:1809:1: entryRuleint32Array : ruleint32Array EOF ;
    public final void entryRuleint32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1810:1: ( ruleint32Array EOF )
            // InternalRosSystemParser.g:1811:1: ruleint32Array EOF
            {
             before(grammarAccess.getInt32ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint32Array();

            state._fsp--;

             after(grammarAccess.getInt32ArrayRule()); 
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
    // $ANTLR end "entryRuleint32Array"


    // $ANTLR start "ruleint32Array"
    // InternalRosSystemParser.g:1818:1: ruleint32Array : ( ( rule__Int32Array__Group__0 ) ) ;
    public final void ruleint32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1822:2: ( ( ( rule__Int32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1823:2: ( ( rule__Int32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1823:2: ( ( rule__Int32Array__Group__0 ) )
            // InternalRosSystemParser.g:1824:3: ( rule__Int32Array__Group__0 )
            {
             before(grammarAccess.getInt32ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1825:3: ( rule__Int32Array__Group__0 )
            // InternalRosSystemParser.g:1825:4: rule__Int32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt32ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint32Array"


    // $ANTLR start "entryRuleuint32Array"
    // InternalRosSystemParser.g:1834:1: entryRuleuint32Array : ruleuint32Array EOF ;
    public final void entryRuleuint32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1835:1: ( ruleuint32Array EOF )
            // InternalRosSystemParser.g:1836:1: ruleuint32Array EOF
            {
             before(grammarAccess.getUint32ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint32Array();

            state._fsp--;

             after(grammarAccess.getUint32ArrayRule()); 
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
    // $ANTLR end "entryRuleuint32Array"


    // $ANTLR start "ruleuint32Array"
    // InternalRosSystemParser.g:1843:1: ruleuint32Array : ( ( rule__Uint32Array__Group__0 ) ) ;
    public final void ruleuint32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1847:2: ( ( ( rule__Uint32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1848:2: ( ( rule__Uint32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1848:2: ( ( rule__Uint32Array__Group__0 ) )
            // InternalRosSystemParser.g:1849:3: ( rule__Uint32Array__Group__0 )
            {
             before(grammarAccess.getUint32ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1850:3: ( rule__Uint32Array__Group__0 )
            // InternalRosSystemParser.g:1850:4: rule__Uint32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint32ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint32Array"


    // $ANTLR start "entryRuleint64Array"
    // InternalRosSystemParser.g:1859:1: entryRuleint64Array : ruleint64Array EOF ;
    public final void entryRuleint64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1860:1: ( ruleint64Array EOF )
            // InternalRosSystemParser.g:1861:1: ruleint64Array EOF
            {
             before(grammarAccess.getInt64ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleint64Array();

            state._fsp--;

             after(grammarAccess.getInt64ArrayRule()); 
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
    // $ANTLR end "entryRuleint64Array"


    // $ANTLR start "ruleint64Array"
    // InternalRosSystemParser.g:1868:1: ruleint64Array : ( ( rule__Int64Array__Group__0 ) ) ;
    public final void ruleint64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1872:2: ( ( ( rule__Int64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1873:2: ( ( rule__Int64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1873:2: ( ( rule__Int64Array__Group__0 ) )
            // InternalRosSystemParser.g:1874:3: ( rule__Int64Array__Group__0 )
            {
             before(grammarAccess.getInt64ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1875:3: ( rule__Int64Array__Group__0 )
            // InternalRosSystemParser.g:1875:4: rule__Int64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInt64ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleint64Array"


    // $ANTLR start "entryRuleuint64Array"
    // InternalRosSystemParser.g:1884:1: entryRuleuint64Array : ruleuint64Array EOF ;
    public final void entryRuleuint64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1885:1: ( ruleuint64Array EOF )
            // InternalRosSystemParser.g:1886:1: ruleuint64Array EOF
            {
             before(grammarAccess.getUint64ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleuint64Array();

            state._fsp--;

             after(grammarAccess.getUint64ArrayRule()); 
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
    // $ANTLR end "entryRuleuint64Array"


    // $ANTLR start "ruleuint64Array"
    // InternalRosSystemParser.g:1893:1: ruleuint64Array : ( ( rule__Uint64Array__Group__0 ) ) ;
    public final void ruleuint64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1897:2: ( ( ( rule__Uint64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1898:2: ( ( rule__Uint64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1898:2: ( ( rule__Uint64Array__Group__0 ) )
            // InternalRosSystemParser.g:1899:3: ( rule__Uint64Array__Group__0 )
            {
             before(grammarAccess.getUint64ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1900:3: ( rule__Uint64Array__Group__0 )
            // InternalRosSystemParser.g:1900:4: rule__Uint64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUint64ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleuint64Array"


    // $ANTLR start "entryRulefloat32Array"
    // InternalRosSystemParser.g:1909:1: entryRulefloat32Array : rulefloat32Array EOF ;
    public final void entryRulefloat32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1910:1: ( rulefloat32Array EOF )
            // InternalRosSystemParser.g:1911:1: rulefloat32Array EOF
            {
             before(grammarAccess.getFloat32ArrayRule()); 
            pushFollow(FOLLOW_1);
            rulefloat32Array();

            state._fsp--;

             after(grammarAccess.getFloat32ArrayRule()); 
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
    // $ANTLR end "entryRulefloat32Array"


    // $ANTLR start "rulefloat32Array"
    // InternalRosSystemParser.g:1918:1: rulefloat32Array : ( ( rule__Float32Array__Group__0 ) ) ;
    public final void rulefloat32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1922:2: ( ( ( rule__Float32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1923:2: ( ( rule__Float32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1923:2: ( ( rule__Float32Array__Group__0 ) )
            // InternalRosSystemParser.g:1924:3: ( rule__Float32Array__Group__0 )
            {
             before(grammarAccess.getFloat32ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1925:3: ( rule__Float32Array__Group__0 )
            // InternalRosSystemParser.g:1925:4: rule__Float32Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat32ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat32Array"


    // $ANTLR start "entryRulefloat64Array"
    // InternalRosSystemParser.g:1934:1: entryRulefloat64Array : rulefloat64Array EOF ;
    public final void entryRulefloat64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1935:1: ( rulefloat64Array EOF )
            // InternalRosSystemParser.g:1936:1: rulefloat64Array EOF
            {
             before(grammarAccess.getFloat64ArrayRule()); 
            pushFollow(FOLLOW_1);
            rulefloat64Array();

            state._fsp--;

             after(grammarAccess.getFloat64ArrayRule()); 
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
    // $ANTLR end "entryRulefloat64Array"


    // $ANTLR start "rulefloat64Array"
    // InternalRosSystemParser.g:1943:1: rulefloat64Array : ( ( rule__Float64Array__Group__0 ) ) ;
    public final void rulefloat64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1947:2: ( ( ( rule__Float64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1948:2: ( ( rule__Float64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1948:2: ( ( rule__Float64Array__Group__0 ) )
            // InternalRosSystemParser.g:1949:3: ( rule__Float64Array__Group__0 )
            {
             before(grammarAccess.getFloat64ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1950:3: ( rule__Float64Array__Group__0 )
            // InternalRosSystemParser.g:1950:4: rule__Float64Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloat64ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefloat64Array"


    // $ANTLR start "entryRulestring0Array"
    // InternalRosSystemParser.g:1959:1: entryRulestring0Array : rulestring0Array EOF ;
    public final void entryRulestring0Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1960:1: ( rulestring0Array EOF )
            // InternalRosSystemParser.g:1961:1: rulestring0Array EOF
            {
             before(grammarAccess.getString0ArrayRule()); 
            pushFollow(FOLLOW_1);
            rulestring0Array();

            state._fsp--;

             after(grammarAccess.getString0ArrayRule()); 
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
    // $ANTLR end "entryRulestring0Array"


    // $ANTLR start "rulestring0Array"
    // InternalRosSystemParser.g:1968:1: rulestring0Array : ( ( rule__String0Array__Group__0 ) ) ;
    public final void rulestring0Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1972:2: ( ( ( rule__String0Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1973:2: ( ( rule__String0Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1973:2: ( ( rule__String0Array__Group__0 ) )
            // InternalRosSystemParser.g:1974:3: ( rule__String0Array__Group__0 )
            {
             before(grammarAccess.getString0ArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:1975:3: ( rule__String0Array__Group__0 )
            // InternalRosSystemParser.g:1975:4: rule__String0Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestring0Array"


    // $ANTLR start "entryRulebyteArray"
    // InternalRosSystemParser.g:1984:1: entryRulebyteArray : rulebyteArray EOF ;
    public final void entryRulebyteArray() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1985:1: ( rulebyteArray EOF )
            // InternalRosSystemParser.g:1986:1: rulebyteArray EOF
            {
             before(grammarAccess.getByteArrayRule()); 
            pushFollow(FOLLOW_1);
            rulebyteArray();

            state._fsp--;

             after(grammarAccess.getByteArrayRule()); 
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
    // $ANTLR end "entryRulebyteArray"


    // $ANTLR start "rulebyteArray"
    // InternalRosSystemParser.g:1993:1: rulebyteArray : ( ( rule__ByteArray__Group__0 ) ) ;
    public final void rulebyteArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1997:2: ( ( ( rule__ByteArray__Group__0 ) ) )
            // InternalRosSystemParser.g:1998:2: ( ( rule__ByteArray__Group__0 ) )
            {
            // InternalRosSystemParser.g:1998:2: ( ( rule__ByteArray__Group__0 ) )
            // InternalRosSystemParser.g:1999:3: ( rule__ByteArray__Group__0 )
            {
             before(grammarAccess.getByteArrayAccess().getGroup()); 
            // InternalRosSystemParser.g:2000:3: ( rule__ByteArray__Group__0 )
            // InternalRosSystemParser.g:2000:4: rule__ByteArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByteArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulebyteArray"


    // $ANTLR start "entryRuleHeader"
    // InternalRosSystemParser.g:2009:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2010:1: ( ruleHeader EOF )
            // InternalRosSystemParser.g:2011:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalRosSystemParser.g:2018:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2022:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalRosSystemParser.g:2023:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalRosSystemParser.g:2023:2: ( ( rule__Header__Group__0 ) )
            // InternalRosSystemParser.g:2024:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalRosSystemParser.g:2025:3: ( rule__Header__Group__0 )
            // InternalRosSystemParser.g:2025:4: rule__Header__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleTopicSpecRef"
    // InternalRosSystemParser.g:2034:1: entryRuleTopicSpecRef : ruleTopicSpecRef EOF ;
    public final void entryRuleTopicSpecRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2035:1: ( ruleTopicSpecRef EOF )
            // InternalRosSystemParser.g:2036:1: ruleTopicSpecRef EOF
            {
             before(grammarAccess.getTopicSpecRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTopicSpecRef();

            state._fsp--;

             after(grammarAccess.getTopicSpecRefRule()); 
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
    // $ANTLR end "entryRuleTopicSpecRef"


    // $ANTLR start "ruleTopicSpecRef"
    // InternalRosSystemParser.g:2043:1: ruleTopicSpecRef : ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) ;
    public final void ruleTopicSpecRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2047:2: ( ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) )
            // InternalRosSystemParser.g:2048:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            {
            // InternalRosSystemParser.g:2048:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            // InternalRosSystemParser.g:2049:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment()); 
            // InternalRosSystemParser.g:2050:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            // InternalRosSystemParser.g:2050:4: rule__TopicSpecRef__TopicSpecAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TopicSpecRef__TopicSpecAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopicSpecRef"


    // $ANTLR start "entryRuleArrayTopicSpecRef"
    // InternalRosSystemParser.g:2059:1: entryRuleArrayTopicSpecRef : ruleArrayTopicSpecRef EOF ;
    public final void entryRuleArrayTopicSpecRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2060:1: ( ruleArrayTopicSpecRef EOF )
            // InternalRosSystemParser.g:2061:1: ruleArrayTopicSpecRef EOF
            {
             before(grammarAccess.getArrayTopicSpecRefRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayTopicSpecRef();

            state._fsp--;

             after(grammarAccess.getArrayTopicSpecRefRule()); 
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
    // $ANTLR end "entryRuleArrayTopicSpecRef"


    // $ANTLR start "ruleArrayTopicSpecRef"
    // InternalRosSystemParser.g:2068:1: ruleArrayTopicSpecRef : ( ( rule__ArrayTopicSpecRef__Group__0 ) ) ;
    public final void ruleArrayTopicSpecRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2072:2: ( ( ( rule__ArrayTopicSpecRef__Group__0 ) ) )
            // InternalRosSystemParser.g:2073:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            {
            // InternalRosSystemParser.g:2073:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            // InternalRosSystemParser.g:2074:3: ( rule__ArrayTopicSpecRef__Group__0 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getGroup()); 
            // InternalRosSystemParser.g:2075:3: ( rule__ArrayTopicSpecRef__Group__0 )
            // InternalRosSystemParser.g:2075:4: rule__ArrayTopicSpecRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTopicSpecRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayTopicSpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalRosSystemParser.g:2084:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2085:1: ( ruleKEYWORD EOF )
            // InternalRosSystemParser.g:2086:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalRosSystemParser.g:2093:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2097:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalRosSystemParser.g:2098:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalRosSystemParser.g:2098:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalRosSystemParser.g:2099:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalRosSystemParser.g:2100:3: ( rule__KEYWORD__Alternatives )
            // InternalRosSystemParser.g:2100:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystemParser.g:2109:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2110:1: ( ruleEString EOF )
            // InternalRosSystemParser.g:2111:1: ruleEString EOF
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
    // InternalRosSystemParser.g:2118:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2122:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystemParser.g:2123:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystemParser.g:2123:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystemParser.g:2124:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosSystemParser.g:2125:3: ( rule__EString__Alternatives )
            // InternalRosSystemParser.g:2125:4: rule__EString__Alternatives
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


    // $ANTLR start "rule__RosSystem__Alternatives_3"
    // InternalRosSystemParser.g:2133:1: rule__RosSystem__Alternatives_3 : ( ( ( rule__RosSystem__Group_3_0__0 ) ) | ( ( rule__RosSystem__Group_3_1__0 ) ) | ( ( rule__RosSystem__Group_3_2__0 ) ) | ( ( rule__RosSystem__Group_3_3__0 ) ) );
    public final void rule__RosSystem__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2137:1: ( ( ( rule__RosSystem__Group_3_0__0 ) ) | ( ( rule__RosSystem__Group_3_1__0 ) ) | ( ( rule__RosSystem__Group_3_2__0 ) ) | ( ( rule__RosSystem__Group_3_3__0 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case Processes:
                {
                alt1=1;
                }
                break;
            case Nodes:
                {
                alt1=2;
                }
                break;
            case Parameters:
                {
                alt1=3;
                }
                break;
            case Connections:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRosSystemParser.g:2138:2: ( ( rule__RosSystem__Group_3_0__0 ) )
                    {
                    // InternalRosSystemParser.g:2138:2: ( ( rule__RosSystem__Group_3_0__0 ) )
                    // InternalRosSystemParser.g:2139:3: ( rule__RosSystem__Group_3_0__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_0()); 
                    // InternalRosSystemParser.g:2140:3: ( rule__RosSystem__Group_3_0__0 )
                    // InternalRosSystemParser.g:2140:4: rule__RosSystem__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2144:2: ( ( rule__RosSystem__Group_3_1__0 ) )
                    {
                    // InternalRosSystemParser.g:2144:2: ( ( rule__RosSystem__Group_3_1__0 ) )
                    // InternalRosSystemParser.g:2145:3: ( rule__RosSystem__Group_3_1__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_1()); 
                    // InternalRosSystemParser.g:2146:3: ( rule__RosSystem__Group_3_1__0 )
                    // InternalRosSystemParser.g:2146:4: rule__RosSystem__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2150:2: ( ( rule__RosSystem__Group_3_2__0 ) )
                    {
                    // InternalRosSystemParser.g:2150:2: ( ( rule__RosSystem__Group_3_2__0 ) )
                    // InternalRosSystemParser.g:2151:3: ( rule__RosSystem__Group_3_2__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_2()); 
                    // InternalRosSystemParser.g:2152:3: ( rule__RosSystem__Group_3_2__0 )
                    // InternalRosSystemParser.g:2152:4: rule__RosSystem__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2156:2: ( ( rule__RosSystem__Group_3_3__0 ) )
                    {
                    // InternalRosSystemParser.g:2156:2: ( ( rule__RosSystem__Group_3_3__0 ) )
                    // InternalRosSystemParser.g:2157:3: ( rule__RosSystem__Group_3_3__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_3()); 
                    // InternalRosSystemParser.g:2158:3: ( rule__RosSystem__Group_3_3__0 )
                    // InternalRosSystemParser.g:2158:4: rule__RosSystem__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRosSystemAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__RosSystem__Alternatives_3"


    // $ANTLR start "rule__InterfaceReference__Alternatives"
    // InternalRosSystemParser.g:2166:1: rule__InterfaceReference__Alternatives : ( ( ruleInterfaceReference_Impl ) | ( ruleRosPublisherReference ) | ( ruleRosSubscriberReference ) | ( ruleRosServiceServerReference ) | ( ruleRosServerClientReference ) | ( ruleRosActionServerReference ) | ( ruleRosActionClientReference ) );
    public final void rule__InterfaceReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2170:1: ( ( ruleInterfaceReference_Impl ) | ( ruleRosPublisherReference ) | ( ruleRosSubscriberReference ) | ( ruleRosServiceServerReference ) | ( ruleRosServerClientReference ) | ( ruleRosActionServerReference ) | ( ruleRosActionClientReference ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_END:
                {
                alt2=1;
                }
                break;
            case FromPub:
                {
                alt2=2;
                }
                break;
            case FromSub:
                {
                alt2=3;
                }
                break;
            case FromSS:
                {
                alt2=4;
                }
                break;
            case FromSC:
                {
                alt2=5;
                }
                break;
            case FromAS:
                {
                alt2=6;
                }
                break;
            case FromAC:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRosSystemParser.g:2171:2: ( ruleInterfaceReference_Impl )
                    {
                    // InternalRosSystemParser.g:2171:2: ( ruleInterfaceReference_Impl )
                    // InternalRosSystemParser.g:2172:3: ruleInterfaceReference_Impl
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getInterfaceReference_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInterfaceReference_Impl();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getInterfaceReference_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2177:2: ( ruleRosPublisherReference )
                    {
                    // InternalRosSystemParser.g:2177:2: ( ruleRosPublisherReference )
                    // InternalRosSystemParser.g:2178:3: ruleRosPublisherReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRosPublisherReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2183:2: ( ruleRosSubscriberReference )
                    {
                    // InternalRosSystemParser.g:2183:2: ( ruleRosSubscriberReference )
                    // InternalRosSystemParser.g:2184:3: ruleRosSubscriberReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRosSubscriberReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2189:2: ( ruleRosServiceServerReference )
                    {
                    // InternalRosSystemParser.g:2189:2: ( ruleRosServiceServerReference )
                    // InternalRosSystemParser.g:2190:3: ruleRosServiceServerReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRosServiceServerReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2195:2: ( ruleRosServerClientReference )
                    {
                    // InternalRosSystemParser.g:2195:2: ( ruleRosServerClientReference )
                    // InternalRosSystemParser.g:2196:3: ruleRosServerClientReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleRosServerClientReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2201:2: ( ruleRosActionServerReference )
                    {
                    // InternalRosSystemParser.g:2201:2: ( ruleRosActionServerReference )
                    // InternalRosSystemParser.g:2202:3: ruleRosActionServerReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleRosActionServerReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2207:2: ( ruleRosActionClientReference )
                    {
                    // InternalRosSystemParser.g:2207:2: ( ruleRosActionClientReference )
                    // InternalRosSystemParser.g:2208:3: ruleRosActionClientReference
                    {
                     before(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRosActionClientReference();

                    state._fsp--;

                     after(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_6()); 

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
    // $ANTLR end "rule__InterfaceReference__Alternatives"


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalRosSystemParser.g:2217:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2221:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt3=1;
                }
                break;
            case RelativeNamespace:
                {
                alt3=2;
                }
                break;
            case PrivateNamespace:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRosSystemParser.g:2222:2: ( ruleGlobalNamespace )
                    {
                    // InternalRosSystemParser.g:2222:2: ( ruleGlobalNamespace )
                    // InternalRosSystemParser.g:2223:3: ruleGlobalNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGlobalNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2228:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalRosSystemParser.g:2228:2: ( ruleRelativeNamespace_Impl )
                    // InternalRosSystemParser.g:2229:3: ruleRelativeNamespace_Impl
                    {
                     before(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelativeNamespace_Impl();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2234:2: ( rulePrivateNamespace )
                    {
                    // InternalRosSystemParser.g:2234:2: ( rulePrivateNamespace )
                    // InternalRosSystemParser.g:2235:3: rulePrivateNamespace
                    {
                     before(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrivateNamespace();

                    state._fsp--;

                     after(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2()); 

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
    // $ANTLR end "rule__Namespace__Alternatives"


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalRosSystemParser.g:2244:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2248:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt4=1;
                }
                break;
            case Struct:
                {
                alt4=2;
                }
                break;
            case Integer:
                {
                alt4=3;
                }
                break;
            case String:
                {
                alt4=4;
                }
                break;
            case Double:
                {
                alt4=5;
                }
                break;
            case Boolean:
                {
                alt4=6;
                }
                break;
            case Base64:
                {
                alt4=7;
                }
                break;
            case Array:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRosSystemParser.g:2249:2: ( ruleParameterListType )
                    {
                    // InternalRosSystemParser.g:2249:2: ( ruleParameterListType )
                    // InternalRosSystemParser.g:2250:3: ruleParameterListType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterListType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2255:2: ( ruleParameterStructType )
                    {
                    // InternalRosSystemParser.g:2255:2: ( ruleParameterStructType )
                    // InternalRosSystemParser.g:2256:3: ruleParameterStructType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStructType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2261:2: ( ruleParameterIntegerType )
                    {
                    // InternalRosSystemParser.g:2261:2: ( ruleParameterIntegerType )
                    // InternalRosSystemParser.g:2262:3: ruleParameterIntegerType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterIntegerType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2267:2: ( ruleParameterStringType )
                    {
                    // InternalRosSystemParser.g:2267:2: ( ruleParameterStringType )
                    // InternalRosSystemParser.g:2268:3: ruleParameterStringType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStringType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2273:2: ( ruleParameterDoubleType )
                    {
                    // InternalRosSystemParser.g:2273:2: ( ruleParameterDoubleType )
                    // InternalRosSystemParser.g:2274:3: ruleParameterDoubleType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterDoubleType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2279:2: ( ruleParameterBooleanType )
                    {
                    // InternalRosSystemParser.g:2279:2: ( ruleParameterBooleanType )
                    // InternalRosSystemParser.g:2280:3: ruleParameterBooleanType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBooleanType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2285:2: ( ruleParameterBase64Type )
                    {
                    // InternalRosSystemParser.g:2285:2: ( ruleParameterBase64Type )
                    // InternalRosSystemParser.g:2286:3: ruleParameterBase64Type
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64Type();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:2291:2: ( ruleParameterArrayType )
                    {
                    // InternalRosSystemParser.g:2291:2: ( ruleParameterArrayType )
                    // InternalRosSystemParser.g:2292:3: ruleParameterArrayType
                    {
                     before(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterArrayType();

                    state._fsp--;

                     after(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7()); 

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
    // $ANTLR end "rule__ParameterType__Alternatives"


    // $ANTLR start "rule__ParameterValue__Alternatives"
    // InternalRosSystemParser.g:2301:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2305:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_BINARY:
                {
                alt5=2;
                }
                break;
            case RULE_DECINT:
                {
                alt5=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt5=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=5;
                }
                break;
            case LeftSquareBracket:
                {
                int LA5_6 = input.LA(2);

                if ( (LA5_6==Comma||(LA5_6>=LeftSquareBracket && LA5_6<=RightSquareBracket)||(LA5_6>=RULE_BINARY && LA5_6<=RULE_DOUBLE)||(LA5_6>=RULE_ID && LA5_6<=RULE_STRING)) ) {
                    alt5=6;
                }
                else if ( (LA5_6==ParameterStructMember) ) {
                    alt5=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 6, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case Comma:
            case RightSquareBracket:
            case RULE_END:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRosSystemParser.g:2306:2: ( ruleParameterString )
                    {
                    // InternalRosSystemParser.g:2306:2: ( ruleParameterString )
                    // InternalRosSystemParser.g:2307:3: ruleParameterString
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterString();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2312:2: ( ruleParameterBase64 )
                    {
                    // InternalRosSystemParser.g:2312:2: ( ruleParameterBase64 )
                    // InternalRosSystemParser.g:2313:3: ruleParameterBase64
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBase64();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2318:2: ( ruleParameterInteger )
                    {
                    // InternalRosSystemParser.g:2318:2: ( ruleParameterInteger )
                    // InternalRosSystemParser.g:2319:3: ruleParameterInteger
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterInteger();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2324:2: ( ruleParameterDouble )
                    {
                    // InternalRosSystemParser.g:2324:2: ( ruleParameterDouble )
                    // InternalRosSystemParser.g:2325:3: ruleParameterDouble
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterDouble();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2330:2: ( ruleParameterBoolean )
                    {
                    // InternalRosSystemParser.g:2330:2: ( ruleParameterBoolean )
                    // InternalRosSystemParser.g:2331:3: ruleParameterBoolean
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterBoolean();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2336:2: ( ruleParameterList )
                    {
                    // InternalRosSystemParser.g:2336:2: ( ruleParameterList )
                    // InternalRosSystemParser.g:2337:3: ruleParameterList
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterList();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2342:2: ( ruleParameterStruct )
                    {
                    // InternalRosSystemParser.g:2342:2: ( ruleParameterStruct )
                    // InternalRosSystemParser.g:2343:3: ruleParameterStruct
                    {
                     before(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStruct();

                    state._fsp--;

                     after(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6()); 

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


    // $ANTLR start "rule__AbstractType__Alternatives"
    // InternalRosSystemParser.g:2352:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2356:1: ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) )
            int alt6=31;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalRosSystemParser.g:2357:2: ( rulebool )
                    {
                    // InternalRosSystemParser.g:2357:2: ( rulebool )
                    // InternalRosSystemParser.g:2358:3: rulebool
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulebool();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2363:2: ( ruleint8 )
                    {
                    // InternalRosSystemParser.g:2363:2: ( ruleint8 )
                    // InternalRosSystemParser.g:2364:3: ruleint8
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleint8();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2369:2: ( ruleuint8 )
                    {
                    // InternalRosSystemParser.g:2369:2: ( ruleuint8 )
                    // InternalRosSystemParser.g:2370:3: ruleuint8
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleuint8();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2375:2: ( ruleint16 )
                    {
                    // InternalRosSystemParser.g:2375:2: ( ruleint16 )
                    // InternalRosSystemParser.g:2376:3: ruleint16
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleint16();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2381:2: ( ruleuint16 )
                    {
                    // InternalRosSystemParser.g:2381:2: ( ruleuint16 )
                    // InternalRosSystemParser.g:2382:3: ruleuint16
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleuint16();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2387:2: ( ruleint32 )
                    {
                    // InternalRosSystemParser.g:2387:2: ( ruleint32 )
                    // InternalRosSystemParser.g:2388:3: ruleint32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleint32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2393:2: ( ruleuint32 )
                    {
                    // InternalRosSystemParser.g:2393:2: ( ruleuint32 )
                    // InternalRosSystemParser.g:2394:3: ruleuint32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleuint32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:2399:2: ( ruleint64 )
                    {
                    // InternalRosSystemParser.g:2399:2: ( ruleint64 )
                    // InternalRosSystemParser.g:2400:3: ruleint64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleint64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:2405:2: ( ruleuint64 )
                    {
                    // InternalRosSystemParser.g:2405:2: ( ruleuint64 )
                    // InternalRosSystemParser.g:2406:3: ruleuint64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleuint64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:2411:2: ( rulefloat32 )
                    {
                    // InternalRosSystemParser.g:2411:2: ( rulefloat32 )
                    // InternalRosSystemParser.g:2412:3: rulefloat32
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulefloat32();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:2417:2: ( rulefloat64 )
                    {
                    // InternalRosSystemParser.g:2417:2: ( rulefloat64 )
                    // InternalRosSystemParser.g:2418:3: rulefloat64
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    rulefloat64();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalRosSystemParser.g:2423:2: ( rulestring0 )
                    {
                    // InternalRosSystemParser.g:2423:2: ( rulestring0 )
                    // InternalRosSystemParser.g:2424:3: rulestring0
                    {
                     before(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    rulestring0();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalRosSystemParser.g:2429:2: ( rulebyte )
                    {
                    // InternalRosSystemParser.g:2429:2: ( rulebyte )
                    // InternalRosSystemParser.g:2430:3: rulebyte
                    {
                     before(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    rulebyte();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalRosSystemParser.g:2435:2: ( ruletime )
                    {
                    // InternalRosSystemParser.g:2435:2: ( ruletime )
                    // InternalRosSystemParser.g:2436:3: ruletime
                    {
                     before(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruletime();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalRosSystemParser.g:2441:2: ( ruleduration )
                    {
                    // InternalRosSystemParser.g:2441:2: ( ruleduration )
                    // InternalRosSystemParser.g:2442:3: ruleduration
                    {
                     before(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleduration();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalRosSystemParser.g:2447:2: ( ruleHeader )
                    {
                    // InternalRosSystemParser.g:2447:2: ( ruleHeader )
                    // InternalRosSystemParser.g:2448:3: ruleHeader
                    {
                     before(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15()); 
                    pushFollow(FOLLOW_2);
                    ruleHeader();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalRosSystemParser.g:2453:2: ( ruleboolArray )
                    {
                    // InternalRosSystemParser.g:2453:2: ( ruleboolArray )
                    // InternalRosSystemParser.g:2454:3: ruleboolArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16()); 
                    pushFollow(FOLLOW_2);
                    ruleboolArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalRosSystemParser.g:2459:2: ( ruleint8Array )
                    {
                    // InternalRosSystemParser.g:2459:2: ( ruleint8Array )
                    // InternalRosSystemParser.g:2460:3: ruleint8Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17()); 
                    pushFollow(FOLLOW_2);
                    ruleint8Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalRosSystemParser.g:2465:2: ( ruleuint8Array )
                    {
                    // InternalRosSystemParser.g:2465:2: ( ruleuint8Array )
                    // InternalRosSystemParser.g:2466:3: ruleuint8Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18()); 
                    pushFollow(FOLLOW_2);
                    ruleuint8Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalRosSystemParser.g:2471:2: ( ruleint16Array )
                    {
                    // InternalRosSystemParser.g:2471:2: ( ruleint16Array )
                    // InternalRosSystemParser.g:2472:3: ruleint16Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19()); 
                    pushFollow(FOLLOW_2);
                    ruleint16Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalRosSystemParser.g:2477:2: ( ruleuint16Array )
                    {
                    // InternalRosSystemParser.g:2477:2: ( ruleuint16Array )
                    // InternalRosSystemParser.g:2478:3: ruleuint16Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20()); 
                    pushFollow(FOLLOW_2);
                    ruleuint16Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // InternalRosSystemParser.g:2483:2: ( ruleint32Array )
                    {
                    // InternalRosSystemParser.g:2483:2: ( ruleint32Array )
                    // InternalRosSystemParser.g:2484:3: ruleint32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21()); 
                    pushFollow(FOLLOW_2);
                    ruleint32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21()); 

                    }


                    }
                    break;
                case 23 :
                    // InternalRosSystemParser.g:2489:2: ( ruleuint32Array )
                    {
                    // InternalRosSystemParser.g:2489:2: ( ruleuint32Array )
                    // InternalRosSystemParser.g:2490:3: ruleuint32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22()); 
                    pushFollow(FOLLOW_2);
                    ruleuint32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22()); 

                    }


                    }
                    break;
                case 24 :
                    // InternalRosSystemParser.g:2495:2: ( ruleint64Array )
                    {
                    // InternalRosSystemParser.g:2495:2: ( ruleint64Array )
                    // InternalRosSystemParser.g:2496:3: ruleint64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23()); 
                    pushFollow(FOLLOW_2);
                    ruleint64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23()); 

                    }


                    }
                    break;
                case 25 :
                    // InternalRosSystemParser.g:2501:2: ( ruleuint64Array )
                    {
                    // InternalRosSystemParser.g:2501:2: ( ruleuint64Array )
                    // InternalRosSystemParser.g:2502:3: ruleuint64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24()); 
                    pushFollow(FOLLOW_2);
                    ruleuint64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24()); 

                    }


                    }
                    break;
                case 26 :
                    // InternalRosSystemParser.g:2507:2: ( rulefloat32Array )
                    {
                    // InternalRosSystemParser.g:2507:2: ( rulefloat32Array )
                    // InternalRosSystemParser.g:2508:3: rulefloat32Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25()); 
                    pushFollow(FOLLOW_2);
                    rulefloat32Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25()); 

                    }


                    }
                    break;
                case 27 :
                    // InternalRosSystemParser.g:2513:2: ( rulefloat64Array )
                    {
                    // InternalRosSystemParser.g:2513:2: ( rulefloat64Array )
                    // InternalRosSystemParser.g:2514:3: rulefloat64Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26()); 
                    pushFollow(FOLLOW_2);
                    rulefloat64Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26()); 

                    }


                    }
                    break;
                case 28 :
                    // InternalRosSystemParser.g:2519:2: ( rulestring0Array )
                    {
                    // InternalRosSystemParser.g:2519:2: ( rulestring0Array )
                    // InternalRosSystemParser.g:2520:3: rulestring0Array
                    {
                     before(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27()); 
                    pushFollow(FOLLOW_2);
                    rulestring0Array();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27()); 

                    }


                    }
                    break;
                case 29 :
                    // InternalRosSystemParser.g:2525:2: ( rulebyteArray )
                    {
                    // InternalRosSystemParser.g:2525:2: ( rulebyteArray )
                    // InternalRosSystemParser.g:2526:3: rulebyteArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28()); 
                    pushFollow(FOLLOW_2);
                    rulebyteArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28()); 

                    }


                    }
                    break;
                case 30 :
                    // InternalRosSystemParser.g:2531:2: ( ruleTopicSpecRef )
                    {
                    // InternalRosSystemParser.g:2531:2: ( ruleTopicSpecRef )
                    // InternalRosSystemParser.g:2532:3: ruleTopicSpecRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getTopicSpecRefParserRuleCall_29()); 
                    pushFollow(FOLLOW_2);
                    ruleTopicSpecRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getTopicSpecRefParserRuleCall_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalRosSystemParser.g:2537:2: ( ruleArrayTopicSpecRef )
                    {
                    // InternalRosSystemParser.g:2537:2: ( ruleArrayTopicSpecRef )
                    // InternalRosSystemParser.g:2538:3: ruleArrayTopicSpecRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getArrayTopicSpecRefParserRuleCall_30()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayTopicSpecRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getArrayTopicSpecRefParserRuleCall_30()); 

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
    // $ANTLR end "rule__AbstractType__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalRosSystemParser.g:2547:1: rule__KEYWORD__Alternatives : ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2551:1: ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt7=1;
                }
                break;
            case Message:
                {
                alt7=2;
                }
                break;
            case Result:
                {
                alt7=3;
                }
                break;
            case Feedback:
                {
                alt7=4;
                }
                break;
            case Name:
                {
                alt7=5;
                }
                break;
            case Value:
                {
                alt7=6;
                }
                break;
            case Service:
                {
                alt7=7;
                }
                break;
            case Type:
                {
                alt7=8;
                }
                break;
            case Action:
                {
                alt7=9;
                }
                break;
            case Duration:
                {
                alt7=10;
                }
                break;
            case Time:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRosSystemParser.g:2552:2: ( Goal )
                    {
                    // InternalRosSystemParser.g:2552:2: ( Goal )
                    // InternalRosSystemParser.g:2553:3: Goal
                    {
                     before(grammarAccess.getKEYWORDAccess().getGoalKeyword_0()); 
                    match(input,Goal,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getGoalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2558:2: ( Message )
                    {
                    // InternalRosSystemParser.g:2558:2: ( Message )
                    // InternalRosSystemParser.g:2559:3: Message
                    {
                     before(grammarAccess.getKEYWORDAccess().getMessageKeyword_1()); 
                    match(input,Message,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMessageKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2564:2: ( Result )
                    {
                    // InternalRosSystemParser.g:2564:2: ( Result )
                    // InternalRosSystemParser.g:2565:3: Result
                    {
                     before(grammarAccess.getKEYWORDAccess().getResultKeyword_2()); 
                    match(input,Result,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getResultKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2570:2: ( Feedback )
                    {
                    // InternalRosSystemParser.g:2570:2: ( Feedback )
                    // InternalRosSystemParser.g:2571:3: Feedback
                    {
                     before(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3()); 
                    match(input,Feedback,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2576:2: ( Name )
                    {
                    // InternalRosSystemParser.g:2576:2: ( Name )
                    // InternalRosSystemParser.g:2577:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_4()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2582:2: ( Value )
                    {
                    // InternalRosSystemParser.g:2582:2: ( Value )
                    // InternalRosSystemParser.g:2583:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_5()); 
                    match(input,Value,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2588:2: ( Service )
                    {
                    // InternalRosSystemParser.g:2588:2: ( Service )
                    // InternalRosSystemParser.g:2589:3: Service
                    {
                     before(grammarAccess.getKEYWORDAccess().getServiceKeyword_6()); 
                    match(input,Service,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getServiceKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:2594:2: ( Type )
                    {
                    // InternalRosSystemParser.g:2594:2: ( Type )
                    // InternalRosSystemParser.g:2595:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 
                    match(input,Type,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:2600:2: ( Action )
                    {
                    // InternalRosSystemParser.g:2600:2: ( Action )
                    // InternalRosSystemParser.g:2601:3: Action
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_8()); 
                    match(input,Action,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:2606:2: ( Duration )
                    {
                    // InternalRosSystemParser.g:2606:2: ( Duration )
                    // InternalRosSystemParser.g:2607:3: Duration
                    {
                     before(grammarAccess.getKEYWORDAccess().getDurationKeyword_9()); 
                    match(input,Duration,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDurationKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:2612:2: ( Time )
                    {
                    // InternalRosSystemParser.g:2612:2: ( Time )
                    // InternalRosSystemParser.g:2613:3: Time
                    {
                     before(grammarAccess.getKEYWORDAccess().getTimeKeyword_10()); 
                    match(input,Time,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTimeKeyword_10()); 

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
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystemParser.g:2622:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2626:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystemParser.g:2627:2: ( RULE_STRING )
                    {
                    // InternalRosSystemParser.g:2627:2: ( RULE_STRING )
                    // InternalRosSystemParser.g:2628:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2633:2: ( RULE_ID )
                    {
                    // InternalRosSystemParser.g:2633:2: ( RULE_ID )
                    // InternalRosSystemParser.g:2634:3: RULE_ID
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


    // $ANTLR start "rule__RosSystem__Group__0"
    // InternalRosSystemParser.g:2643:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2647:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystemParser.g:2648:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0"


    // $ANTLR start "rule__RosSystem__Group__0__Impl"
    // InternalRosSystemParser.g:2655:1: rule__RosSystem__Group__0__Impl : ( ( rule__RosSystem__NameAssignment_0 ) ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2659:1: ( ( ( rule__RosSystem__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:2660:1: ( ( rule__RosSystem__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:2660:1: ( ( rule__RosSystem__NameAssignment_0 ) )
            // InternalRosSystemParser.g:2661:2: ( rule__RosSystem__NameAssignment_0 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:2662:2: ( rule__RosSystem__NameAssignment_0 )
            // InternalRosSystemParser.g:2662:3: rule__RosSystem__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0__Impl"


    // $ANTLR start "rule__RosSystem__Group__1"
    // InternalRosSystemParser.g:2670:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2674:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystemParser.g:2675:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__1"


    // $ANTLR start "rule__RosSystem__Group__1__Impl"
    // InternalRosSystemParser.g:2682:1: rule__RosSystem__Group__1__Impl : ( Colon ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2686:1: ( ( Colon ) )
            // InternalRosSystemParser.g:2687:1: ( Colon )
            {
            // InternalRosSystemParser.g:2687:1: ( Colon )
            // InternalRosSystemParser.g:2688:2: Colon
            {
             before(grammarAccess.getRosSystemAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__1__Impl"


    // $ANTLR start "rule__RosSystem__Group__2"
    // InternalRosSystemParser.g:2697:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2701:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystemParser.g:2702:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__2"


    // $ANTLR start "rule__RosSystem__Group__2__Impl"
    // InternalRosSystemParser.g:2709:1: rule__RosSystem__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2713:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2714:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2714:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2715:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__2__Impl"


    // $ANTLR start "rule__RosSystem__Group__3"
    // InternalRosSystemParser.g:2724:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2728:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystemParser.g:2729:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__3"


    // $ANTLR start "rule__RosSystem__Group__3__Impl"
    // InternalRosSystemParser.g:2736:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Alternatives_3 )* ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2740:1: ( ( ( rule__RosSystem__Alternatives_3 )* ) )
            // InternalRosSystemParser.g:2741:1: ( ( rule__RosSystem__Alternatives_3 )* )
            {
            // InternalRosSystemParser.g:2741:1: ( ( rule__RosSystem__Alternatives_3 )* )
            // InternalRosSystemParser.g:2742:2: ( rule__RosSystem__Alternatives_3 )*
            {
             before(grammarAccess.getRosSystemAccess().getAlternatives_3()); 
            // InternalRosSystemParser.g:2743:2: ( rule__RosSystem__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Connections||(LA9_0>=Parameters && LA9_0<=Processes)||LA9_0==Nodes) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRosSystemParser.g:2743:3: rule__RosSystem__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RosSystem__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__3__Impl"


    // $ANTLR start "rule__RosSystem__Group__4"
    // InternalRosSystemParser.g:2751:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2755:1: ( rule__RosSystem__Group__4__Impl )
            // InternalRosSystemParser.g:2756:2: rule__RosSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__4"


    // $ANTLR start "rule__RosSystem__Group__4__Impl"
    // InternalRosSystemParser.g:2762:1: rule__RosSystem__Group__4__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2766:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2767:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2767:1: ( RULE_END )
            // InternalRosSystemParser.g:2768:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__0"
    // InternalRosSystemParser.g:2778:1: rule__RosSystem__Group_3_0__0 : rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1 ;
    public final void rule__RosSystem__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2782:1: ( rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1 )
            // InternalRosSystemParser.g:2783:2: rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__0"


    // $ANTLR start "rule__RosSystem__Group_3_0__0__Impl"
    // InternalRosSystemParser.g:2790:1: rule__RosSystem__Group_3_0__0__Impl : ( Processes ) ;
    public final void rule__RosSystem__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2794:1: ( ( Processes ) )
            // InternalRosSystemParser.g:2795:1: ( Processes )
            {
            // InternalRosSystemParser.g:2795:1: ( Processes )
            // InternalRosSystemParser.g:2796:2: Processes
            {
             before(grammarAccess.getRosSystemAccess().getProcessesKeyword_3_0_0()); 
            match(input,Processes,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getProcessesKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__1"
    // InternalRosSystemParser.g:2805:1: rule__RosSystem__Group_3_0__1 : rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2 ;
    public final void rule__RosSystem__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2809:1: ( rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2 )
            // InternalRosSystemParser.g:2810:2: rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__1"


    // $ANTLR start "rule__RosSystem__Group_3_0__1__Impl"
    // InternalRosSystemParser.g:2817:1: rule__RosSystem__Group_3_0__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2821:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2822:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2822:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2823:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_0_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__2"
    // InternalRosSystemParser.g:2832:1: rule__RosSystem__Group_3_0__2 : rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3 ;
    public final void rule__RosSystem__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2836:1: ( rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3 )
            // InternalRosSystemParser.g:2837:2: rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__2"


    // $ANTLR start "rule__RosSystem__Group_3_0__2__Impl"
    // InternalRosSystemParser.g:2844:1: rule__RosSystem__Group_3_0__2__Impl : ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* ) ;
    public final void rule__RosSystem__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2848:1: ( ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* ) )
            // InternalRosSystemParser.g:2849:1: ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* )
            {
            // InternalRosSystemParser.g:2849:1: ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* )
            // InternalRosSystemParser.g:2850:2: ( rule__RosSystem__ProcessesAssignment_3_0_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getProcessesAssignment_3_0_2()); 
            // InternalRosSystemParser.g:2851:2: ( rule__RosSystem__ProcessesAssignment_3_0_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRosSystemParser.g:2851:3: rule__RosSystem__ProcessesAssignment_3_0_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RosSystem__ProcessesAssignment_3_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getProcessesAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_0__3"
    // InternalRosSystemParser.g:2859:1: rule__RosSystem__Group_3_0__3 : rule__RosSystem__Group_3_0__3__Impl ;
    public final void rule__RosSystem__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2863:1: ( rule__RosSystem__Group_3_0__3__Impl )
            // InternalRosSystemParser.g:2864:2: rule__RosSystem__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__3"


    // $ANTLR start "rule__RosSystem__Group_3_0__3__Impl"
    // InternalRosSystemParser.g:2870:1: rule__RosSystem__Group_3_0__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2874:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2875:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2875:1: ( RULE_END )
            // InternalRosSystemParser.g:2876:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_0_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_0__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__0"
    // InternalRosSystemParser.g:2886:1: rule__RosSystem__Group_3_1__0 : rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1 ;
    public final void rule__RosSystem__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2890:1: ( rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1 )
            // InternalRosSystemParser.g:2891:2: rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__0"


    // $ANTLR start "rule__RosSystem__Group_3_1__0__Impl"
    // InternalRosSystemParser.g:2898:1: rule__RosSystem__Group_3_1__0__Impl : ( Nodes ) ;
    public final void rule__RosSystem__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2902:1: ( ( Nodes ) )
            // InternalRosSystemParser.g:2903:1: ( Nodes )
            {
            // InternalRosSystemParser.g:2903:1: ( Nodes )
            // InternalRosSystemParser.g:2904:2: Nodes
            {
             before(grammarAccess.getRosSystemAccess().getNodesKeyword_3_1_0()); 
            match(input,Nodes,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getNodesKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__1"
    // InternalRosSystemParser.g:2913:1: rule__RosSystem__Group_3_1__1 : rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2 ;
    public final void rule__RosSystem__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2917:1: ( rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2 )
            // InternalRosSystemParser.g:2918:2: rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__1"


    // $ANTLR start "rule__RosSystem__Group_3_1__1__Impl"
    // InternalRosSystemParser.g:2925:1: rule__RosSystem__Group_3_1__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2929:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2930:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2930:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2931:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_1_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__2"
    // InternalRosSystemParser.g:2940:1: rule__RosSystem__Group_3_1__2 : rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3 ;
    public final void rule__RosSystem__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2944:1: ( rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3 )
            // InternalRosSystemParser.g:2945:2: rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__2"


    // $ANTLR start "rule__RosSystem__Group_3_1__2__Impl"
    // InternalRosSystemParser.g:2952:1: rule__RosSystem__Group_3_1__2__Impl : ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* ) ;
    public final void rule__RosSystem__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2956:1: ( ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* ) )
            // InternalRosSystemParser.g:2957:1: ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* )
            {
            // InternalRosSystemParser.g:2957:1: ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* )
            // InternalRosSystemParser.g:2958:2: ( rule__RosSystem__ComponentsAssignment_3_1_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getComponentsAssignment_3_1_2()); 
            // InternalRosSystemParser.g:2959:2: ( rule__RosSystem__ComponentsAssignment_3_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystemParser.g:2959:3: rule__RosSystem__ComponentsAssignment_3_1_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RosSystem__ComponentsAssignment_3_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getComponentsAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_1__3"
    // InternalRosSystemParser.g:2967:1: rule__RosSystem__Group_3_1__3 : rule__RosSystem__Group_3_1__3__Impl ;
    public final void rule__RosSystem__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2971:1: ( rule__RosSystem__Group_3_1__3__Impl )
            // InternalRosSystemParser.g:2972:2: rule__RosSystem__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__3"


    // $ANTLR start "rule__RosSystem__Group_3_1__3__Impl"
    // InternalRosSystemParser.g:2978:1: rule__RosSystem__Group_3_1__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2982:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2983:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2983:1: ( RULE_END )
            // InternalRosSystemParser.g:2984:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_1_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_1__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__0"
    // InternalRosSystemParser.g:2994:1: rule__RosSystem__Group_3_2__0 : rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1 ;
    public final void rule__RosSystem__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2998:1: ( rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1 )
            // InternalRosSystemParser.g:2999:2: rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__0"


    // $ANTLR start "rule__RosSystem__Group_3_2__0__Impl"
    // InternalRosSystemParser.g:3006:1: rule__RosSystem__Group_3_2__0__Impl : ( Parameters ) ;
    public final void rule__RosSystem__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3010:1: ( ( Parameters ) )
            // InternalRosSystemParser.g:3011:1: ( Parameters )
            {
            // InternalRosSystemParser.g:3011:1: ( Parameters )
            // InternalRosSystemParser.g:3012:2: Parameters
            {
             before(grammarAccess.getRosSystemAccess().getParametersKeyword_3_2_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getParametersKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__1"
    // InternalRosSystemParser.g:3021:1: rule__RosSystem__Group_3_2__1 : rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2 ;
    public final void rule__RosSystem__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3025:1: ( rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2 )
            // InternalRosSystemParser.g:3026:2: rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__1"


    // $ANTLR start "rule__RosSystem__Group_3_2__1__Impl"
    // InternalRosSystemParser.g:3033:1: rule__RosSystem__Group_3_2__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3037:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3038:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3038:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3039:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_2_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__2"
    // InternalRosSystemParser.g:3048:1: rule__RosSystem__Group_3_2__2 : rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3 ;
    public final void rule__RosSystem__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3052:1: ( rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3 )
            // InternalRosSystemParser.g:3053:2: rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__2"


    // $ANTLR start "rule__RosSystem__Group_3_2__2__Impl"
    // InternalRosSystemParser.g:3060:1: rule__RosSystem__Group_3_2__2__Impl : ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* ) ;
    public final void rule__RosSystem__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3064:1: ( ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* ) )
            // InternalRosSystemParser.g:3065:1: ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* )
            {
            // InternalRosSystemParser.g:3065:1: ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* )
            // InternalRosSystemParser.g:3066:2: ( rule__RosSystem__ParameterAssignment_3_2_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getParameterAssignment_3_2_2()); 
            // InternalRosSystemParser.g:3067:2: ( rule__RosSystem__ParameterAssignment_3_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosSystemParser.g:3067:3: rule__RosSystem__ParameterAssignment_3_2_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RosSystem__ParameterAssignment_3_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getParameterAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_2__3"
    // InternalRosSystemParser.g:3075:1: rule__RosSystem__Group_3_2__3 : rule__RosSystem__Group_3_2__3__Impl ;
    public final void rule__RosSystem__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3079:1: ( rule__RosSystem__Group_3_2__3__Impl )
            // InternalRosSystemParser.g:3080:2: rule__RosSystem__Group_3_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__3"


    // $ANTLR start "rule__RosSystem__Group_3_2__3__Impl"
    // InternalRosSystemParser.g:3086:1: rule__RosSystem__Group_3_2__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3090:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3091:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3091:1: ( RULE_END )
            // InternalRosSystemParser.g:3092:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_2_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_2__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__0"
    // InternalRosSystemParser.g:3102:1: rule__RosSystem__Group_3_3__0 : rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1 ;
    public final void rule__RosSystem__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3106:1: ( rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1 )
            // InternalRosSystemParser.g:3107:2: rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__0"


    // $ANTLR start "rule__RosSystem__Group_3_3__0__Impl"
    // InternalRosSystemParser.g:3114:1: rule__RosSystem__Group_3_3__0__Impl : ( Connections ) ;
    public final void rule__RosSystem__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3118:1: ( ( Connections ) )
            // InternalRosSystemParser.g:3119:1: ( Connections )
            {
            // InternalRosSystemParser.g:3119:1: ( Connections )
            // InternalRosSystemParser.g:3120:2: Connections
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsKeyword_3_3_0()); 
            match(input,Connections,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getConnectionsKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__1"
    // InternalRosSystemParser.g:3129:1: rule__RosSystem__Group_3_3__1 : rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2 ;
    public final void rule__RosSystem__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3133:1: ( rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2 )
            // InternalRosSystemParser.g:3134:2: rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__1"


    // $ANTLR start "rule__RosSystem__Group_3_3__1__Impl"
    // InternalRosSystemParser.g:3141:1: rule__RosSystem__Group_3_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3145:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3146:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3146:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3147:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_3_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__2"
    // InternalRosSystemParser.g:3156:1: rule__RosSystem__Group_3_3__2 : rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3 ;
    public final void rule__RosSystem__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3160:1: ( rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3 )
            // InternalRosSystemParser.g:3161:2: rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3
            {
            pushFollow(FOLLOW_9);
            rule__RosSystem__Group_3_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__2"


    // $ANTLR start "rule__RosSystem__Group_3_3__2__Impl"
    // InternalRosSystemParser.g:3168:1: rule__RosSystem__Group_3_3__2__Impl : ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* ) ;
    public final void rule__RosSystem__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3172:1: ( ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* ) )
            // InternalRosSystemParser.g:3173:1: ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* )
            {
            // InternalRosSystemParser.g:3173:1: ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* )
            // InternalRosSystemParser.g:3174:2: ( rule__RosSystem__ConnectionsAssignment_3_3_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsAssignment_3_3_2()); 
            // InternalRosSystemParser.g:3175:2: ( rule__RosSystem__ConnectionsAssignment_3_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinusLeftSquareBracket) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRosSystemParser.g:3175:3: rule__RosSystem__ConnectionsAssignment_3_3_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RosSystem__ConnectionsAssignment_3_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getConnectionsAssignment_3_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_3_3__3"
    // InternalRosSystemParser.g:3183:1: rule__RosSystem__Group_3_3__3 : rule__RosSystem__Group_3_3__3__Impl ;
    public final void rule__RosSystem__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3187:1: ( rule__RosSystem__Group_3_3__3__Impl )
            // InternalRosSystemParser.g:3188:2: rule__RosSystem__Group_3_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__3"


    // $ANTLR start "rule__RosSystem__Group_3_3__3__Impl"
    // InternalRosSystemParser.g:3194:1: rule__RosSystem__Group_3_3__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3198:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3199:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3199:1: ( RULE_END )
            // InternalRosSystemParser.g:3200:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3_3__3__Impl"


    // $ANTLR start "rule__Process__Group__0"
    // InternalRosSystemParser.g:3210:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3214:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalRosSystemParser.g:3215:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // InternalRosSystemParser.g:3222:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3226:1: ( ( () ) )
            // InternalRosSystemParser.g:3227:1: ( () )
            {
            // InternalRosSystemParser.g:3227:1: ( () )
            // InternalRosSystemParser.g:3228:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // InternalRosSystemParser.g:3229:2: ()
            // InternalRosSystemParser.g:3229:3: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // InternalRosSystemParser.g:3237:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3241:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalRosSystemParser.g:3242:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // InternalRosSystemParser.g:3249:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3253:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:3254:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3254:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalRosSystemParser.g:3255:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1()); 
            // InternalRosSystemParser.g:3256:2: ( rule__Process__NameAssignment_1 )
            // InternalRosSystemParser.g:3256:3: rule__Process__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // InternalRosSystemParser.g:3264:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3268:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalRosSystemParser.g:3269:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // InternalRosSystemParser.g:3276:1: rule__Process__Group__2__Impl : ( Colon ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3280:1: ( ( Colon ) )
            // InternalRosSystemParser.g:3281:1: ( Colon )
            {
            // InternalRosSystemParser.g:3281:1: ( Colon )
            // InternalRosSystemParser.g:3282:2: Colon
            {
             before(grammarAccess.getProcessAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // InternalRosSystemParser.g:3291:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3295:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalRosSystemParser.g:3296:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // InternalRosSystemParser.g:3303:1: rule__Process__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3307:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3308:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3308:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3309:2: RULE_BEGIN
            {
             before(grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // InternalRosSystemParser.g:3318:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3322:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalRosSystemParser.g:3323:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // InternalRosSystemParser.g:3330:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3334:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalRosSystemParser.g:3335:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalRosSystemParser.g:3335:1: ( ( rule__Process__Group_4__0 )? )
            // InternalRosSystemParser.g:3336:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // InternalRosSystemParser.g:3337:2: ( rule__Process__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Nodes) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystemParser.g:3337:3: rule__Process__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // InternalRosSystemParser.g:3345:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3349:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalRosSystemParser.g:3350:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // InternalRosSystemParser.g:3357:1: rule__Process__Group__5__Impl : ( ( rule__Process__Group_5__0 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3361:1: ( ( ( rule__Process__Group_5__0 ) ) )
            // InternalRosSystemParser.g:3362:1: ( ( rule__Process__Group_5__0 ) )
            {
            // InternalRosSystemParser.g:3362:1: ( ( rule__Process__Group_5__0 ) )
            // InternalRosSystemParser.g:3363:2: ( rule__Process__Group_5__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup_5()); 
            // InternalRosSystemParser.g:3364:2: ( rule__Process__Group_5__0 )
            // InternalRosSystemParser.g:3364:3: rule__Process__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // InternalRosSystemParser.g:3372:1: rule__Process__Group__6 : rule__Process__Group__6__Impl ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3376:1: ( rule__Process__Group__6__Impl )
            // InternalRosSystemParser.g:3377:2: rule__Process__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // InternalRosSystemParser.g:3383:1: rule__Process__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3387:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3388:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3388:1: ( RULE_END )
            // InternalRosSystemParser.g:3389:2: RULE_END
            {
             before(grammarAccess.getProcessAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group_4__0"
    // InternalRosSystemParser.g:3399:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3403:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalRosSystemParser.g:3404:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // InternalRosSystemParser.g:3411:1: rule__Process__Group_4__0__Impl : ( Nodes ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3415:1: ( ( Nodes ) )
            // InternalRosSystemParser.g:3416:1: ( Nodes )
            {
            // InternalRosSystemParser.g:3416:1: ( Nodes )
            // InternalRosSystemParser.g:3417:2: Nodes
            {
             before(grammarAccess.getProcessAccess().getNodesKeyword_4_0()); 
            match(input,Nodes,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getNodesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // InternalRosSystemParser.g:3426:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3430:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalRosSystemParser.g:3431:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // InternalRosSystemParser.g:3438:1: rule__Process__Group_4__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3442:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:3443:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:3443:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:3444:2: LeftSquareBracket
            {
             before(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__Process__Group_4__2"
    // InternalRosSystemParser.g:3453:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3457:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalRosSystemParser.g:3458:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2"


    // $ANTLR start "rule__Process__Group_4__2__Impl"
    // InternalRosSystemParser.g:3465:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__NodesAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3469:1: ( ( ( rule__Process__NodesAssignment_4_2 ) ) )
            // InternalRosSystemParser.g:3470:1: ( ( rule__Process__NodesAssignment_4_2 ) )
            {
            // InternalRosSystemParser.g:3470:1: ( ( rule__Process__NodesAssignment_4_2 ) )
            // InternalRosSystemParser.g:3471:2: ( rule__Process__NodesAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getNodesAssignment_4_2()); 
            // InternalRosSystemParser.g:3472:2: ( rule__Process__NodesAssignment_4_2 )
            // InternalRosSystemParser.g:3472:3: rule__Process__NodesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__NodesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNodesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__2__Impl"


    // $ANTLR start "rule__Process__Group_4__3"
    // InternalRosSystemParser.g:3480:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3484:1: ( rule__Process__Group_4__3__Impl )
            // InternalRosSystemParser.g:3485:2: rule__Process__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3"


    // $ANTLR start "rule__Process__Group_4__3__Impl"
    // InternalRosSystemParser.g:3491:1: rule__Process__Group_4__3__Impl : ( RightSquareBracket ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3495:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:3496:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:3496:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:3497:2: RightSquareBracket
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__3__Impl"


    // $ANTLR start "rule__Process__Group_5__0"
    // InternalRosSystemParser.g:3507:1: rule__Process__Group_5__0 : rule__Process__Group_5__0__Impl rule__Process__Group_5__1 ;
    public final void rule__Process__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3511:1: ( rule__Process__Group_5__0__Impl rule__Process__Group_5__1 )
            // InternalRosSystemParser.g:3512:2: rule__Process__Group_5__0__Impl rule__Process__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Process__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0"


    // $ANTLR start "rule__Process__Group_5__0__Impl"
    // InternalRosSystemParser.g:3519:1: rule__Process__Group_5__0__Impl : ( Threads ) ;
    public final void rule__Process__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3523:1: ( ( Threads ) )
            // InternalRosSystemParser.g:3524:1: ( Threads )
            {
            // InternalRosSystemParser.g:3524:1: ( Threads )
            // InternalRosSystemParser.g:3525:2: Threads
            {
             before(grammarAccess.getProcessAccess().getThreadsKeyword_5_0()); 
            match(input,Threads,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getThreadsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__0__Impl"


    // $ANTLR start "rule__Process__Group_5__1"
    // InternalRosSystemParser.g:3534:1: rule__Process__Group_5__1 : rule__Process__Group_5__1__Impl ;
    public final void rule__Process__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3538:1: ( rule__Process__Group_5__1__Impl )
            // InternalRosSystemParser.g:3539:2: rule__Process__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1"


    // $ANTLR start "rule__Process__Group_5__1__Impl"
    // InternalRosSystemParser.g:3545:1: rule__Process__Group_5__1__Impl : ( ( rule__Process__ThreadsAssignment_5_1 ) ) ;
    public final void rule__Process__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3549:1: ( ( ( rule__Process__ThreadsAssignment_5_1 ) ) )
            // InternalRosSystemParser.g:3550:1: ( ( rule__Process__ThreadsAssignment_5_1 ) )
            {
            // InternalRosSystemParser.g:3550:1: ( ( rule__Process__ThreadsAssignment_5_1 ) )
            // InternalRosSystemParser.g:3551:2: ( rule__Process__ThreadsAssignment_5_1 )
            {
             before(grammarAccess.getProcessAccess().getThreadsAssignment_5_1()); 
            // InternalRosSystemParser.g:3552:2: ( rule__Process__ThreadsAssignment_5_1 )
            // InternalRosSystemParser.g:3552:3: rule__Process__ThreadsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ThreadsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getThreadsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_5__1__Impl"


    // $ANTLR start "rule__RosNode__Group__0"
    // InternalRosSystemParser.g:3561:1: rule__RosNode__Group__0 : rule__RosNode__Group__0__Impl rule__RosNode__Group__1 ;
    public final void rule__RosNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3565:1: ( rule__RosNode__Group__0__Impl rule__RosNode__Group__1 )
            // InternalRosSystemParser.g:3566:2: rule__RosNode__Group__0__Impl rule__RosNode__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__0"


    // $ANTLR start "rule__RosNode__Group__0__Impl"
    // InternalRosSystemParser.g:3573:1: rule__RosNode__Group__0__Impl : ( () ) ;
    public final void rule__RosNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3577:1: ( ( () ) )
            // InternalRosSystemParser.g:3578:1: ( () )
            {
            // InternalRosSystemParser.g:3578:1: ( () )
            // InternalRosSystemParser.g:3579:2: ()
            {
             before(grammarAccess.getRosNodeAccess().getRosNodeAction_0()); 
            // InternalRosSystemParser.g:3580:2: ()
            // InternalRosSystemParser.g:3580:3: 
            {
            }

             after(grammarAccess.getRosNodeAccess().getRosNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__0__Impl"


    // $ANTLR start "rule__RosNode__Group__1"
    // InternalRosSystemParser.g:3588:1: rule__RosNode__Group__1 : rule__RosNode__Group__1__Impl rule__RosNode__Group__2 ;
    public final void rule__RosNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3592:1: ( rule__RosNode__Group__1__Impl rule__RosNode__Group__2 )
            // InternalRosSystemParser.g:3593:2: rule__RosNode__Group__1__Impl rule__RosNode__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RosNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__1"


    // $ANTLR start "rule__RosNode__Group__1__Impl"
    // InternalRosSystemParser.g:3600:1: rule__RosNode__Group__1__Impl : ( ( rule__RosNode__NameAssignment_1 ) ) ;
    public final void rule__RosNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3604:1: ( ( ( rule__RosNode__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:3605:1: ( ( rule__RosNode__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3605:1: ( ( rule__RosNode__NameAssignment_1 ) )
            // InternalRosSystemParser.g:3606:2: ( rule__RosNode__NameAssignment_1 )
            {
             before(grammarAccess.getRosNodeAccess().getNameAssignment_1()); 
            // InternalRosSystemParser.g:3607:2: ( rule__RosNode__NameAssignment_1 )
            // InternalRosSystemParser.g:3607:3: rule__RosNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__1__Impl"


    // $ANTLR start "rule__RosNode__Group__2"
    // InternalRosSystemParser.g:3615:1: rule__RosNode__Group__2 : rule__RosNode__Group__2__Impl rule__RosNode__Group__3 ;
    public final void rule__RosNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3619:1: ( rule__RosNode__Group__2__Impl rule__RosNode__Group__3 )
            // InternalRosSystemParser.g:3620:2: rule__RosNode__Group__2__Impl rule__RosNode__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RosNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__2"


    // $ANTLR start "rule__RosNode__Group__2__Impl"
    // InternalRosSystemParser.g:3627:1: rule__RosNode__Group__2__Impl : ( Colon ) ;
    public final void rule__RosNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3631:1: ( ( Colon ) )
            // InternalRosSystemParser.g:3632:1: ( Colon )
            {
            // InternalRosSystemParser.g:3632:1: ( Colon )
            // InternalRosSystemParser.g:3633:2: Colon
            {
             before(grammarAccess.getRosNodeAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__2__Impl"


    // $ANTLR start "rule__RosNode__Group__3"
    // InternalRosSystemParser.g:3642:1: rule__RosNode__Group__3 : rule__RosNode__Group__3__Impl rule__RosNode__Group__4 ;
    public final void rule__RosNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3646:1: ( rule__RosNode__Group__3__Impl rule__RosNode__Group__4 )
            // InternalRosSystemParser.g:3647:2: rule__RosNode__Group__3__Impl rule__RosNode__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__RosNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__3"


    // $ANTLR start "rule__RosNode__Group__3__Impl"
    // InternalRosSystemParser.g:3654:1: rule__RosNode__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3658:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3659:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3659:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3660:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__3__Impl"


    // $ANTLR start "rule__RosNode__Group__4"
    // InternalRosSystemParser.g:3669:1: rule__RosNode__Group__4 : rule__RosNode__Group__4__Impl rule__RosNode__Group__5 ;
    public final void rule__RosNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3673:1: ( rule__RosNode__Group__4__Impl rule__RosNode__Group__5 )
            // InternalRosSystemParser.g:3674:2: rule__RosNode__Group__4__Impl rule__RosNode__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__RosNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__4"


    // $ANTLR start "rule__RosNode__Group__4__Impl"
    // InternalRosSystemParser.g:3681:1: rule__RosNode__Group__4__Impl : ( From ) ;
    public final void rule__RosNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3685:1: ( ( From ) )
            // InternalRosSystemParser.g:3686:1: ( From )
            {
            // InternalRosSystemParser.g:3686:1: ( From )
            // InternalRosSystemParser.g:3687:2: From
            {
             before(grammarAccess.getRosNodeAccess().getFromKeyword_4()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__4__Impl"


    // $ANTLR start "rule__RosNode__Group__5"
    // InternalRosSystemParser.g:3696:1: rule__RosNode__Group__5 : rule__RosNode__Group__5__Impl rule__RosNode__Group__6 ;
    public final void rule__RosNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3700:1: ( rule__RosNode__Group__5__Impl rule__RosNode__Group__6 )
            // InternalRosSystemParser.g:3701:2: rule__RosNode__Group__5__Impl rule__RosNode__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__RosNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__5"


    // $ANTLR start "rule__RosNode__Group__5__Impl"
    // InternalRosSystemParser.g:3708:1: rule__RosNode__Group__5__Impl : ( ( rule__RosNode__FromAssignment_5 ) ) ;
    public final void rule__RosNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3712:1: ( ( ( rule__RosNode__FromAssignment_5 ) ) )
            // InternalRosSystemParser.g:3713:1: ( ( rule__RosNode__FromAssignment_5 ) )
            {
            // InternalRosSystemParser.g:3713:1: ( ( rule__RosNode__FromAssignment_5 ) )
            // InternalRosSystemParser.g:3714:2: ( rule__RosNode__FromAssignment_5 )
            {
             before(grammarAccess.getRosNodeAccess().getFromAssignment_5()); 
            // InternalRosSystemParser.g:3715:2: ( rule__RosNode__FromAssignment_5 )
            // InternalRosSystemParser.g:3715:3: rule__RosNode__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__5__Impl"


    // $ANTLR start "rule__RosNode__Group__6"
    // InternalRosSystemParser.g:3723:1: rule__RosNode__Group__6 : rule__RosNode__Group__6__Impl rule__RosNode__Group__7 ;
    public final void rule__RosNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3727:1: ( rule__RosNode__Group__6__Impl rule__RosNode__Group__7 )
            // InternalRosSystemParser.g:3728:2: rule__RosNode__Group__6__Impl rule__RosNode__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RosNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__6"


    // $ANTLR start "rule__RosNode__Group__6__Impl"
    // InternalRosSystemParser.g:3735:1: rule__RosNode__Group__6__Impl : ( ( rule__RosNode__Group_6__0 )? ) ;
    public final void rule__RosNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3739:1: ( ( ( rule__RosNode__Group_6__0 )? ) )
            // InternalRosSystemParser.g:3740:1: ( ( rule__RosNode__Group_6__0 )? )
            {
            // InternalRosSystemParser.g:3740:1: ( ( rule__RosNode__Group_6__0 )? )
            // InternalRosSystemParser.g:3741:2: ( rule__RosNode__Group_6__0 )?
            {
             before(grammarAccess.getRosNodeAccess().getGroup_6()); 
            // InternalRosSystemParser.g:3742:2: ( rule__RosNode__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Interfaces) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystemParser.g:3742:3: rule__RosNode__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosNode__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosNodeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__6__Impl"


    // $ANTLR start "rule__RosNode__Group__7"
    // InternalRosSystemParser.g:3750:1: rule__RosNode__Group__7 : rule__RosNode__Group__7__Impl rule__RosNode__Group__8 ;
    public final void rule__RosNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3754:1: ( rule__RosNode__Group__7__Impl rule__RosNode__Group__8 )
            // InternalRosSystemParser.g:3755:2: rule__RosNode__Group__7__Impl rule__RosNode__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__RosNode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__7"


    // $ANTLR start "rule__RosNode__Group__7__Impl"
    // InternalRosSystemParser.g:3762:1: rule__RosNode__Group__7__Impl : ( ( rule__RosNode__Group_7__0 )? ) ;
    public final void rule__RosNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3766:1: ( ( ( rule__RosNode__Group_7__0 )? ) )
            // InternalRosSystemParser.g:3767:1: ( ( rule__RosNode__Group_7__0 )? )
            {
            // InternalRosSystemParser.g:3767:1: ( ( rule__RosNode__Group_7__0 )? )
            // InternalRosSystemParser.g:3768:2: ( rule__RosNode__Group_7__0 )?
            {
             before(grammarAccess.getRosNodeAccess().getGroup_7()); 
            // InternalRosSystemParser.g:3769:2: ( rule__RosNode__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Parameters) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystemParser.g:3769:3: rule__RosNode__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosNode__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosNodeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__7__Impl"


    // $ANTLR start "rule__RosNode__Group__8"
    // InternalRosSystemParser.g:3777:1: rule__RosNode__Group__8 : rule__RosNode__Group__8__Impl ;
    public final void rule__RosNode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3781:1: ( rule__RosNode__Group__8__Impl )
            // InternalRosSystemParser.g:3782:2: rule__RosNode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__8"


    // $ANTLR start "rule__RosNode__Group__8__Impl"
    // InternalRosSystemParser.g:3788:1: rule__RosNode__Group__8__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3792:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3793:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3793:1: ( RULE_END )
            // InternalRosSystemParser.g:3794:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__8__Impl"


    // $ANTLR start "rule__RosNode__Group_6__0"
    // InternalRosSystemParser.g:3804:1: rule__RosNode__Group_6__0 : rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1 ;
    public final void rule__RosNode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3808:1: ( rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1 )
            // InternalRosSystemParser.g:3809:2: rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RosNode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__0"


    // $ANTLR start "rule__RosNode__Group_6__0__Impl"
    // InternalRosSystemParser.g:3816:1: rule__RosNode__Group_6__0__Impl : ( Interfaces ) ;
    public final void rule__RosNode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3820:1: ( ( Interfaces ) )
            // InternalRosSystemParser.g:3821:1: ( Interfaces )
            {
            // InternalRosSystemParser.g:3821:1: ( Interfaces )
            // InternalRosSystemParser.g:3822:2: Interfaces
            {
             before(grammarAccess.getRosNodeAccess().getInterfacesKeyword_6_0()); 
            match(input,Interfaces,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getInterfacesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__0__Impl"


    // $ANTLR start "rule__RosNode__Group_6__1"
    // InternalRosSystemParser.g:3831:1: rule__RosNode__Group_6__1 : rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2 ;
    public final void rule__RosNode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3835:1: ( rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2 )
            // InternalRosSystemParser.g:3836:2: rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__RosNode__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__1"


    // $ANTLR start "rule__RosNode__Group_6__1__Impl"
    // InternalRosSystemParser.g:3843:1: rule__RosNode__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3847:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3848:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3848:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3849:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_6_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__1__Impl"


    // $ANTLR start "rule__RosNode__Group_6__2"
    // InternalRosSystemParser.g:3858:1: rule__RosNode__Group_6__2 : rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3 ;
    public final void rule__RosNode__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3862:1: ( rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3 )
            // InternalRosSystemParser.g:3863:2: rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__RosNode__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__2"


    // $ANTLR start "rule__RosNode__Group_6__2__Impl"
    // InternalRosSystemParser.g:3870:1: rule__RosNode__Group_6__2__Impl : ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* ) ;
    public final void rule__RosNode__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3874:1: ( ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* ) )
            // InternalRosSystemParser.g:3875:1: ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* )
            {
            // InternalRosSystemParser.g:3875:1: ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* )
            // InternalRosSystemParser.g:3876:2: ( rule__RosNode__RosinterfacesAssignment_6_2 )*
            {
             before(grammarAccess.getRosNodeAccess().getRosinterfacesAssignment_6_2()); 
            // InternalRosSystemParser.g:3877:2: ( rule__RosNode__RosinterfacesAssignment_6_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosSystemParser.g:3877:3: rule__RosNode__RosinterfacesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RosNode__RosinterfacesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRosNodeAccess().getRosinterfacesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__2__Impl"


    // $ANTLR start "rule__RosNode__Group_6__3"
    // InternalRosSystemParser.g:3885:1: rule__RosNode__Group_6__3 : rule__RosNode__Group_6__3__Impl ;
    public final void rule__RosNode__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3889:1: ( rule__RosNode__Group_6__3__Impl )
            // InternalRosSystemParser.g:3890:2: rule__RosNode__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__3"


    // $ANTLR start "rule__RosNode__Group_6__3__Impl"
    // InternalRosSystemParser.g:3896:1: rule__RosNode__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3900:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3901:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3901:1: ( RULE_END )
            // InternalRosSystemParser.g:3902:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_6_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_6__3__Impl"


    // $ANTLR start "rule__RosNode__Group_7__0"
    // InternalRosSystemParser.g:3912:1: rule__RosNode__Group_7__0 : rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1 ;
    public final void rule__RosNode__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3916:1: ( rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1 )
            // InternalRosSystemParser.g:3917:2: rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__RosNode__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__0"


    // $ANTLR start "rule__RosNode__Group_7__0__Impl"
    // InternalRosSystemParser.g:3924:1: rule__RosNode__Group_7__0__Impl : ( Parameters ) ;
    public final void rule__RosNode__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3928:1: ( ( Parameters ) )
            // InternalRosSystemParser.g:3929:1: ( Parameters )
            {
            // InternalRosSystemParser.g:3929:1: ( Parameters )
            // InternalRosSystemParser.g:3930:2: Parameters
            {
             before(grammarAccess.getRosNodeAccess().getParametersKeyword_7_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getParametersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__0__Impl"


    // $ANTLR start "rule__RosNode__Group_7__1"
    // InternalRosSystemParser.g:3939:1: rule__RosNode__Group_7__1 : rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2 ;
    public final void rule__RosNode__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3943:1: ( rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2 )
            // InternalRosSystemParser.g:3944:2: rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2
            {
            pushFollow(FOLLOW_7);
            rule__RosNode__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__1"


    // $ANTLR start "rule__RosNode__Group_7__1__Impl"
    // InternalRosSystemParser.g:3951:1: rule__RosNode__Group_7__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3955:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3956:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3956:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3957:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__1__Impl"


    // $ANTLR start "rule__RosNode__Group_7__2"
    // InternalRosSystemParser.g:3966:1: rule__RosNode__Group_7__2 : rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3 ;
    public final void rule__RosNode__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3970:1: ( rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3 )
            // InternalRosSystemParser.g:3971:2: rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__RosNode__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__2"


    // $ANTLR start "rule__RosNode__Group_7__2__Impl"
    // InternalRosSystemParser.g:3978:1: rule__RosNode__Group_7__2__Impl : ( ( rule__RosNode__RosparametersAssignment_7_2 )* ) ;
    public final void rule__RosNode__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3982:1: ( ( ( rule__RosNode__RosparametersAssignment_7_2 )* ) )
            // InternalRosSystemParser.g:3983:1: ( ( rule__RosNode__RosparametersAssignment_7_2 )* )
            {
            // InternalRosSystemParser.g:3983:1: ( ( rule__RosNode__RosparametersAssignment_7_2 )* )
            // InternalRosSystemParser.g:3984:2: ( rule__RosNode__RosparametersAssignment_7_2 )*
            {
             before(grammarAccess.getRosNodeAccess().getRosparametersAssignment_7_2()); 
            // InternalRosSystemParser.g:3985:2: ( rule__RosNode__RosparametersAssignment_7_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRosSystemParser.g:3985:3: rule__RosNode__RosparametersAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RosNode__RosparametersAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRosNodeAccess().getRosparametersAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__2__Impl"


    // $ANTLR start "rule__RosNode__Group_7__3"
    // InternalRosSystemParser.g:3993:1: rule__RosNode__Group_7__3 : rule__RosNode__Group_7__3__Impl ;
    public final void rule__RosNode__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3997:1: ( rule__RosNode__Group_7__3__Impl )
            // InternalRosSystemParser.g:3998:2: rule__RosNode__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__3"


    // $ANTLR start "rule__RosNode__Group_7__3__Impl"
    // InternalRosSystemParser.g:4004:1: rule__RosNode__Group_7__3__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4008:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4009:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4009:1: ( RULE_END )
            // InternalRosSystemParser.g:4010:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group_7__3__Impl"


    // $ANTLR start "rule__RosInterface__Group__0"
    // InternalRosSystemParser.g:4020:1: rule__RosInterface__Group__0 : rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1 ;
    public final void rule__RosInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4024:1: ( rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1 )
            // InternalRosSystemParser.g:4025:2: rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__0"


    // $ANTLR start "rule__RosInterface__Group__0__Impl"
    // InternalRosSystemParser.g:4032:1: rule__RosInterface__Group__0__Impl : ( ( rule__RosInterface__NameAssignment_0 ) ) ;
    public final void rule__RosInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4036:1: ( ( ( rule__RosInterface__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:4037:1: ( ( rule__RosInterface__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:4037:1: ( ( rule__RosInterface__NameAssignment_0 ) )
            // InternalRosSystemParser.g:4038:2: ( rule__RosInterface__NameAssignment_0 )
            {
             before(grammarAccess.getRosInterfaceAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:4039:2: ( rule__RosInterface__NameAssignment_0 )
            // InternalRosSystemParser.g:4039:3: rule__RosInterface__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__0__Impl"


    // $ANTLR start "rule__RosInterface__Group__1"
    // InternalRosSystemParser.g:4047:1: rule__RosInterface__Group__1 : rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2 ;
    public final void rule__RosInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4051:1: ( rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2 )
            // InternalRosSystemParser.g:4052:2: rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__1"


    // $ANTLR start "rule__RosInterface__Group__1__Impl"
    // InternalRosSystemParser.g:4059:1: rule__RosInterface__Group__1__Impl : ( Colon ) ;
    public final void rule__RosInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4063:1: ( ( Colon ) )
            // InternalRosSystemParser.g:4064:1: ( Colon )
            {
            // InternalRosSystemParser.g:4064:1: ( Colon )
            // InternalRosSystemParser.g:4065:2: Colon
            {
             before(grammarAccess.getRosInterfaceAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRosInterfaceAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__1__Impl"


    // $ANTLR start "rule__RosInterface__Group__2"
    // InternalRosSystemParser.g:4074:1: rule__RosInterface__Group__2 : rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3 ;
    public final void rule__RosInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4078:1: ( rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3 )
            // InternalRosSystemParser.g:4079:2: rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__RosInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__2"


    // $ANTLR start "rule__RosInterface__Group__2__Impl"
    // InternalRosSystemParser.g:4086:1: rule__RosInterface__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4090:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4091:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4091:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4092:2: RULE_BEGIN
            {
             before(grammarAccess.getRosInterfaceAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosInterfaceAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__2__Impl"


    // $ANTLR start "rule__RosInterface__Group__3"
    // InternalRosSystemParser.g:4101:1: rule__RosInterface__Group__3 : rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4 ;
    public final void rule__RosInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4105:1: ( rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4 )
            // InternalRosSystemParser.g:4106:2: rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RosInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__3"


    // $ANTLR start "rule__RosInterface__Group__3__Impl"
    // InternalRosSystemParser.g:4113:1: rule__RosInterface__Group__3__Impl : ( ( rule__RosInterface__ReferenceAssignment_3 ) ) ;
    public final void rule__RosInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4117:1: ( ( ( rule__RosInterface__ReferenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:4118:1: ( ( rule__RosInterface__ReferenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:4118:1: ( ( rule__RosInterface__ReferenceAssignment_3 ) )
            // InternalRosSystemParser.g:4119:2: ( rule__RosInterface__ReferenceAssignment_3 )
            {
             before(grammarAccess.getRosInterfaceAccess().getReferenceAssignment_3()); 
            // InternalRosSystemParser.g:4120:2: ( rule__RosInterface__ReferenceAssignment_3 )
            // InternalRosSystemParser.g:4120:3: rule__RosInterface__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__3__Impl"


    // $ANTLR start "rule__RosInterface__Group__4"
    // InternalRosSystemParser.g:4128:1: rule__RosInterface__Group__4 : rule__RosInterface__Group__4__Impl ;
    public final void rule__RosInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4132:1: ( rule__RosInterface__Group__4__Impl )
            // InternalRosSystemParser.g:4133:2: rule__RosInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__4"


    // $ANTLR start "rule__RosInterface__Group__4__Impl"
    // InternalRosSystemParser.g:4139:1: rule__RosInterface__Group__4__Impl : ( RULE_END ) ;
    public final void rule__RosInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4143:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4144:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4144:1: ( RULE_END )
            // InternalRosSystemParser.g:4145:2: RULE_END
            {
             before(grammarAccess.getRosInterfaceAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosInterfaceAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Group__4__Impl"


    // $ANTLR start "rule__RosPublisherReference__Group__0"
    // InternalRosSystemParser.g:4155:1: rule__RosPublisherReference__Group__0 : rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1 ;
    public final void rule__RosPublisherReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4159:1: ( rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1 )
            // InternalRosSystemParser.g:4160:2: rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosPublisherReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__0"


    // $ANTLR start "rule__RosPublisherReference__Group__0__Impl"
    // InternalRosSystemParser.g:4167:1: rule__RosPublisherReference__Group__0__Impl : ( FromPub ) ;
    public final void rule__RosPublisherReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4171:1: ( ( FromPub ) )
            // InternalRosSystemParser.g:4172:1: ( FromPub )
            {
            // InternalRosSystemParser.g:4172:1: ( FromPub )
            // InternalRosSystemParser.g:4173:2: FromPub
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPubKeyword_0()); 
            match(input,FromPub,FOLLOW_2); 
             after(grammarAccess.getRosPublisherReferenceAccess().getFromPubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__0__Impl"


    // $ANTLR start "rule__RosPublisherReference__Group__1"
    // InternalRosSystemParser.g:4182:1: rule__RosPublisherReference__Group__1 : rule__RosPublisherReference__Group__1__Impl ;
    public final void rule__RosPublisherReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4186:1: ( rule__RosPublisherReference__Group__1__Impl )
            // InternalRosSystemParser.g:4187:2: rule__RosPublisherReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__1"


    // $ANTLR start "rule__RosPublisherReference__Group__1__Impl"
    // InternalRosSystemParser.g:4193:1: rule__RosPublisherReference__Group__1__Impl : ( ( rule__RosPublisherReference__FromAssignment_1 ) ) ;
    public final void rule__RosPublisherReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4197:1: ( ( ( rule__RosPublisherReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4198:1: ( ( rule__RosPublisherReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4198:1: ( ( rule__RosPublisherReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4199:2: ( rule__RosPublisherReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4200:2: ( rule__RosPublisherReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4200:3: rule__RosPublisherReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisherReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherReferenceAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__Group__1__Impl"


    // $ANTLR start "rule__RosSubscriberReference__Group__0"
    // InternalRosSystemParser.g:4209:1: rule__RosSubscriberReference__Group__0 : rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1 ;
    public final void rule__RosSubscriberReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4213:1: ( rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1 )
            // InternalRosSystemParser.g:4214:2: rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosSubscriberReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__0"


    // $ANTLR start "rule__RosSubscriberReference__Group__0__Impl"
    // InternalRosSystemParser.g:4221:1: rule__RosSubscriberReference__Group__0__Impl : ( FromSub ) ;
    public final void rule__RosSubscriberReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4225:1: ( ( FromSub ) )
            // InternalRosSystemParser.g:4226:1: ( FromSub )
            {
            // InternalRosSystemParser.g:4226:1: ( FromSub )
            // InternalRosSystemParser.g:4227:2: FromSub
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubKeyword_0()); 
            match(input,FromSub,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberReferenceAccess().getFromSubKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__0__Impl"


    // $ANTLR start "rule__RosSubscriberReference__Group__1"
    // InternalRosSystemParser.g:4236:1: rule__RosSubscriberReference__Group__1 : rule__RosSubscriberReference__Group__1__Impl ;
    public final void rule__RosSubscriberReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4240:1: ( rule__RosSubscriberReference__Group__1__Impl )
            // InternalRosSystemParser.g:4241:2: rule__RosSubscriberReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__1"


    // $ANTLR start "rule__RosSubscriberReference__Group__1__Impl"
    // InternalRosSystemParser.g:4247:1: rule__RosSubscriberReference__Group__1__Impl : ( ( rule__RosSubscriberReference__FromAssignment_1 ) ) ;
    public final void rule__RosSubscriberReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4251:1: ( ( ( rule__RosSubscriberReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4252:1: ( ( rule__RosSubscriberReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4252:1: ( ( rule__RosSubscriberReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4253:2: ( rule__RosSubscriberReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4254:2: ( rule__RosSubscriberReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4254:3: rule__RosSubscriberReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriberReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberReferenceAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__Group__1__Impl"


    // $ANTLR start "rule__RosServiceServerReference__Group__0"
    // InternalRosSystemParser.g:4263:1: rule__RosServiceServerReference__Group__0 : rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1 ;
    public final void rule__RosServiceServerReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4267:1: ( rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1 )
            // InternalRosSystemParser.g:4268:2: rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosServiceServerReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__0"


    // $ANTLR start "rule__RosServiceServerReference__Group__0__Impl"
    // InternalRosSystemParser.g:4275:1: rule__RosServiceServerReference__Group__0__Impl : ( FromSS ) ;
    public final void rule__RosServiceServerReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4279:1: ( ( FromSS ) )
            // InternalRosSystemParser.g:4280:1: ( FromSS )
            {
            // InternalRosSystemParser.g:4280:1: ( FromSS )
            // InternalRosSystemParser.g:4281:2: FromSS
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromSSKeyword_0()); 
            match(input,FromSS,FOLLOW_2); 
             after(grammarAccess.getRosServiceServerReferenceAccess().getFromSSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__0__Impl"


    // $ANTLR start "rule__RosServiceServerReference__Group__1"
    // InternalRosSystemParser.g:4290:1: rule__RosServiceServerReference__Group__1 : rule__RosServiceServerReference__Group__1__Impl ;
    public final void rule__RosServiceServerReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4294:1: ( rule__RosServiceServerReference__Group__1__Impl )
            // InternalRosSystemParser.g:4295:2: rule__RosServiceServerReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__1"


    // $ANTLR start "rule__RosServiceServerReference__Group__1__Impl"
    // InternalRosSystemParser.g:4301:1: rule__RosServiceServerReference__Group__1__Impl : ( ( rule__RosServiceServerReference__FromAssignment_1 ) ) ;
    public final void rule__RosServiceServerReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4305:1: ( ( ( rule__RosServiceServerReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4306:1: ( ( rule__RosServiceServerReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4306:1: ( ( rule__RosServiceServerReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4307:2: ( rule__RosServiceServerReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4308:2: ( rule__RosServiceServerReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4308:3: rule__RosServiceServerReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServiceServerReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceServerReferenceAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__Group__1__Impl"


    // $ANTLR start "rule__RosServerClientReference__Group__0"
    // InternalRosSystemParser.g:4317:1: rule__RosServerClientReference__Group__0 : rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1 ;
    public final void rule__RosServerClientReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4321:1: ( rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1 )
            // InternalRosSystemParser.g:4322:2: rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosServerClientReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__0"


    // $ANTLR start "rule__RosServerClientReference__Group__0__Impl"
    // InternalRosSystemParser.g:4329:1: rule__RosServerClientReference__Group__0__Impl : ( FromSC ) ;
    public final void rule__RosServerClientReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4333:1: ( ( FromSC ) )
            // InternalRosSystemParser.g:4334:1: ( FromSC )
            {
            // InternalRosSystemParser.g:4334:1: ( FromSC )
            // InternalRosSystemParser.g:4335:2: FromSC
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromSCKeyword_0()); 
            match(input,FromSC,FOLLOW_2); 
             after(grammarAccess.getRosServerClientReferenceAccess().getFromSCKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__0__Impl"


    // $ANTLR start "rule__RosServerClientReference__Group__1"
    // InternalRosSystemParser.g:4344:1: rule__RosServerClientReference__Group__1 : rule__RosServerClientReference__Group__1__Impl ;
    public final void rule__RosServerClientReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4348:1: ( rule__RosServerClientReference__Group__1__Impl )
            // InternalRosSystemParser.g:4349:2: rule__RosServerClientReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__1"


    // $ANTLR start "rule__RosServerClientReference__Group__1__Impl"
    // InternalRosSystemParser.g:4355:1: rule__RosServerClientReference__Group__1__Impl : ( ( rule__RosServerClientReference__FromAssignment_1 ) ) ;
    public final void rule__RosServerClientReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4359:1: ( ( ( rule__RosServerClientReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4360:1: ( ( rule__RosServerClientReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4360:1: ( ( rule__RosServerClientReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4361:2: ( rule__RosServerClientReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4362:2: ( rule__RosServerClientReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4362:3: rule__RosServerClientReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosServerClientReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosServerClientReferenceAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__Group__1__Impl"


    // $ANTLR start "rule__RosActionServerReference__Group__0"
    // InternalRosSystemParser.g:4371:1: rule__RosActionServerReference__Group__0 : rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1 ;
    public final void rule__RosActionServerReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4375:1: ( rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1 )
            // InternalRosSystemParser.g:4376:2: rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosActionServerReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__0"


    // $ANTLR start "rule__RosActionServerReference__Group__0__Impl"
    // InternalRosSystemParser.g:4383:1: rule__RosActionServerReference__Group__0__Impl : ( FromAS ) ;
    public final void rule__RosActionServerReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4387:1: ( ( FromAS ) )
            // InternalRosSystemParser.g:4388:1: ( FromAS )
            {
            // InternalRosSystemParser.g:4388:1: ( FromAS )
            // InternalRosSystemParser.g:4389:2: FromAS
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromASKeyword_0()); 
            match(input,FromAS,FOLLOW_2); 
             after(grammarAccess.getRosActionServerReferenceAccess().getFromASKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__0__Impl"


    // $ANTLR start "rule__RosActionServerReference__Group__1"
    // InternalRosSystemParser.g:4398:1: rule__RosActionServerReference__Group__1 : rule__RosActionServerReference__Group__1__Impl ;
    public final void rule__RosActionServerReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4402:1: ( rule__RosActionServerReference__Group__1__Impl )
            // InternalRosSystemParser.g:4403:2: rule__RosActionServerReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__1"


    // $ANTLR start "rule__RosActionServerReference__Group__1__Impl"
    // InternalRosSystemParser.g:4409:1: rule__RosActionServerReference__Group__1__Impl : ( ( rule__RosActionServerReference__FromAssignment_1 ) ) ;
    public final void rule__RosActionServerReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4413:1: ( ( ( rule__RosActionServerReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4414:1: ( ( rule__RosActionServerReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4414:1: ( ( rule__RosActionServerReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4415:2: ( rule__RosActionServerReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4416:2: ( rule__RosActionServerReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4416:3: rule__RosActionServerReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServerReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerReferenceAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__Group__1__Impl"


    // $ANTLR start "rule__RosActionClientReference__Group__0"
    // InternalRosSystemParser.g:4425:1: rule__RosActionClientReference__Group__0 : rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1 ;
    public final void rule__RosActionClientReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4429:1: ( rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1 )
            // InternalRosSystemParser.g:4430:2: rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosActionClientReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__0"


    // $ANTLR start "rule__RosActionClientReference__Group__0__Impl"
    // InternalRosSystemParser.g:4437:1: rule__RosActionClientReference__Group__0__Impl : ( FromAC ) ;
    public final void rule__RosActionClientReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4441:1: ( ( FromAC ) )
            // InternalRosSystemParser.g:4442:1: ( FromAC )
            {
            // InternalRosSystemParser.g:4442:1: ( FromAC )
            // InternalRosSystemParser.g:4443:2: FromAC
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromACKeyword_0()); 
            match(input,FromAC,FOLLOW_2); 
             after(grammarAccess.getRosActionClientReferenceAccess().getFromACKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__0__Impl"


    // $ANTLR start "rule__RosActionClientReference__Group__1"
    // InternalRosSystemParser.g:4452:1: rule__RosActionClientReference__Group__1 : rule__RosActionClientReference__Group__1__Impl ;
    public final void rule__RosActionClientReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4456:1: ( rule__RosActionClientReference__Group__1__Impl )
            // InternalRosSystemParser.g:4457:2: rule__RosActionClientReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__1"


    // $ANTLR start "rule__RosActionClientReference__Group__1__Impl"
    // InternalRosSystemParser.g:4463:1: rule__RosActionClientReference__Group__1__Impl : ( ( rule__RosActionClientReference__FromAssignment_1 ) ) ;
    public final void rule__RosActionClientReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4467:1: ( ( ( rule__RosActionClientReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4468:1: ( ( rule__RosActionClientReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4468:1: ( ( rule__RosActionClientReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4469:2: ( rule__RosActionClientReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4470:2: ( rule__RosActionClientReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4470:3: rule__RosActionClientReference__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClientReference__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientReferenceAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__Group__1__Impl"


    // $ANTLR start "rule__RosParameter__Group__0"
    // InternalRosSystemParser.g:4479:1: rule__RosParameter__Group__0 : rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 ;
    public final void rule__RosParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4483:1: ( rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 )
            // InternalRosSystemParser.g:4484:2: rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:4491:1: rule__RosParameter__Group__0__Impl : ( ( rule__RosParameter__NameAssignment_0 ) ) ;
    public final void rule__RosParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4495:1: ( ( ( rule__RosParameter__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:4496:1: ( ( rule__RosParameter__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:4496:1: ( ( rule__RosParameter__NameAssignment_0 ) )
            // InternalRosSystemParser.g:4497:2: ( rule__RosParameter__NameAssignment_0 )
            {
             before(grammarAccess.getRosParameterAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:4498:2: ( rule__RosParameter__NameAssignment_0 )
            // InternalRosSystemParser.g:4498:3: rule__RosParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__Group__0__Impl"


    // $ANTLR start "rule__RosParameter__Group__1"
    // InternalRosSystemParser.g:4506:1: rule__RosParameter__Group__1 : rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 ;
    public final void rule__RosParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4510:1: ( rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 )
            // InternalRosSystemParser.g:4511:2: rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystemParser.g:4518:1: rule__RosParameter__Group__1__Impl : ( Colon ) ;
    public final void rule__RosParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4522:1: ( ( Colon ) )
            // InternalRosSystemParser.g:4523:1: ( Colon )
            {
            // InternalRosSystemParser.g:4523:1: ( Colon )
            // InternalRosSystemParser.g:4524:2: Colon
            {
             before(grammarAccess.getRosParameterAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:4533:1: rule__RosParameter__Group__2 : rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 ;
    public final void rule__RosParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4537:1: ( rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 )
            // InternalRosSystemParser.g:4538:2: rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystemParser.g:4545:1: rule__RosParameter__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4549:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4550:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4550:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4551:2: RULE_BEGIN
            {
             before(grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:4560:1: rule__RosParameter__Group__3 : rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 ;
    public final void rule__RosParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4564:1: ( rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 )
            // InternalRosSystemParser.g:4565:2: rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:4572:1: rule__RosParameter__Group__3__Impl : ( From ) ;
    public final void rule__RosParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4576:1: ( ( From ) )
            // InternalRosSystemParser.g:4577:1: ( From )
            {
            // InternalRosSystemParser.g:4577:1: ( From )
            // InternalRosSystemParser.g:4578:2: From
            {
             before(grammarAccess.getRosParameterAccess().getFromKeyword_3()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getFromKeyword_3()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:4587:1: rule__RosParameter__Group__4 : rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 ;
    public final void rule__RosParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4591:1: ( rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 )
            // InternalRosSystemParser.g:4592:2: rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystemParser.g:4599:1: rule__RosParameter__Group__4__Impl : ( ( rule__RosParameter__FromAssignment_4 ) ) ;
    public final void rule__RosParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4603:1: ( ( ( rule__RosParameter__FromAssignment_4 ) ) )
            // InternalRosSystemParser.g:4604:1: ( ( rule__RosParameter__FromAssignment_4 ) )
            {
            // InternalRosSystemParser.g:4604:1: ( ( rule__RosParameter__FromAssignment_4 ) )
            // InternalRosSystemParser.g:4605:2: ( rule__RosParameter__FromAssignment_4 )
            {
             before(grammarAccess.getRosParameterAccess().getFromAssignment_4()); 
            // InternalRosSystemParser.g:4606:2: ( rule__RosParameter__FromAssignment_4 )
            // InternalRosSystemParser.g:4606:3: rule__RosParameter__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getFromAssignment_4()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:4614:1: rule__RosParameter__Group__5 : rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 ;
    public final void rule__RosParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4618:1: ( rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 )
            // InternalRosSystemParser.g:4619:2: rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystemParser.g:4626:1: rule__RosParameter__Group__5__Impl : ( Value_1 ) ;
    public final void rule__RosParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4630:1: ( ( Value_1 ) )
            // InternalRosSystemParser.g:4631:1: ( Value_1 )
            {
            // InternalRosSystemParser.g:4631:1: ( Value_1 )
            // InternalRosSystemParser.g:4632:2: Value_1
            {
             before(grammarAccess.getRosParameterAccess().getValueKeyword_5()); 
            match(input,Value_1,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getValueKeyword_5()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:4641:1: rule__RosParameter__Group__6 : rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 ;
    public final void rule__RosParameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4645:1: ( rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7 )
            // InternalRosSystemParser.g:4646:2: rule__RosParameter__Group__6__Impl rule__RosParameter__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystemParser.g:4653:1: rule__RosParameter__Group__6__Impl : ( ( rule__RosParameter__ValueAssignment_6 ) ) ;
    public final void rule__RosParameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4657:1: ( ( ( rule__RosParameter__ValueAssignment_6 ) ) )
            // InternalRosSystemParser.g:4658:1: ( ( rule__RosParameter__ValueAssignment_6 ) )
            {
            // InternalRosSystemParser.g:4658:1: ( ( rule__RosParameter__ValueAssignment_6 ) )
            // InternalRosSystemParser.g:4659:2: ( rule__RosParameter__ValueAssignment_6 )
            {
             before(grammarAccess.getRosParameterAccess().getValueAssignment_6()); 
            // InternalRosSystemParser.g:4660:2: ( rule__RosParameter__ValueAssignment_6 )
            // InternalRosSystemParser.g:4660:3: rule__RosParameter__ValueAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getValueAssignment_6()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:4668:1: rule__RosParameter__Group__7 : rule__RosParameter__Group__7__Impl ;
    public final void rule__RosParameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4672:1: ( rule__RosParameter__Group__7__Impl )
            // InternalRosSystemParser.g:4673:2: rule__RosParameter__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:4679:1: rule__RosParameter__Group__7__Impl : ( RULE_END ) ;
    public final void rule__RosParameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4683:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4684:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4684:1: ( RULE_END )
            // InternalRosSystemParser.g:4685:2: RULE_END
            {
             before(grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosConnection__Group__0"
    // InternalRosSystemParser.g:4695:1: rule__RosConnection__Group__0 : rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1 ;
    public final void rule__RosConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4699:1: ( rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1 )
            // InternalRosSystemParser.g:4700:2: rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__RosConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__0"


    // $ANTLR start "rule__RosConnection__Group__0__Impl"
    // InternalRosSystemParser.g:4707:1: rule__RosConnection__Group__0__Impl : ( HyphenMinusLeftSquareBracket ) ;
    public final void rule__RosConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4711:1: ( ( HyphenMinusLeftSquareBracket ) )
            // InternalRosSystemParser.g:4712:1: ( HyphenMinusLeftSquareBracket )
            {
            // InternalRosSystemParser.g:4712:1: ( HyphenMinusLeftSquareBracket )
            // InternalRosSystemParser.g:4713:2: HyphenMinusLeftSquareBracket
            {
             before(grammarAccess.getRosConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0()); 
            match(input,HyphenMinusLeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRosConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__0__Impl"


    // $ANTLR start "rule__RosConnection__Group__1"
    // InternalRosSystemParser.g:4722:1: rule__RosConnection__Group__1 : rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2 ;
    public final void rule__RosConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4726:1: ( rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2 )
            // InternalRosSystemParser.g:4727:2: rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__RosConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__1"


    // $ANTLR start "rule__RosConnection__Group__1__Impl"
    // InternalRosSystemParser.g:4734:1: rule__RosConnection__Group__1__Impl : ( ( rule__RosConnection__FromAssignment_1 ) ) ;
    public final void rule__RosConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4738:1: ( ( ( rule__RosConnection__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4739:1: ( ( rule__RosConnection__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4739:1: ( ( rule__RosConnection__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4740:2: ( rule__RosConnection__FromAssignment_1 )
            {
             before(grammarAccess.getRosConnectionAccess().getFromAssignment_1()); 
            // InternalRosSystemParser.g:4741:2: ( rule__RosConnection__FromAssignment_1 )
            // InternalRosSystemParser.g:4741:3: rule__RosConnection__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosConnectionAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__1__Impl"


    // $ANTLR start "rule__RosConnection__Group__2"
    // InternalRosSystemParser.g:4749:1: rule__RosConnection__Group__2 : rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3 ;
    public final void rule__RosConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4753:1: ( rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3 )
            // InternalRosSystemParser.g:4754:2: rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RosConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__2"


    // $ANTLR start "rule__RosConnection__Group__2__Impl"
    // InternalRosSystemParser.g:4761:1: rule__RosConnection__Group__2__Impl : ( Comma ) ;
    public final void rule__RosConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4765:1: ( ( Comma ) )
            // InternalRosSystemParser.g:4766:1: ( Comma )
            {
            // InternalRosSystemParser.g:4766:1: ( Comma )
            // InternalRosSystemParser.g:4767:2: Comma
            {
             before(grammarAccess.getRosConnectionAccess().getCommaKeyword_2()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getRosConnectionAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__2__Impl"


    // $ANTLR start "rule__RosConnection__Group__3"
    // InternalRosSystemParser.g:4776:1: rule__RosConnection__Group__3 : rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4 ;
    public final void rule__RosConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4780:1: ( rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4 )
            // InternalRosSystemParser.g:4781:2: rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__RosConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__3"


    // $ANTLR start "rule__RosConnection__Group__3__Impl"
    // InternalRosSystemParser.g:4788:1: rule__RosConnection__Group__3__Impl : ( ( rule__RosConnection__ToAssignment_3 ) ) ;
    public final void rule__RosConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4792:1: ( ( ( rule__RosConnection__ToAssignment_3 ) ) )
            // InternalRosSystemParser.g:4793:1: ( ( rule__RosConnection__ToAssignment_3 ) )
            {
            // InternalRosSystemParser.g:4793:1: ( ( rule__RosConnection__ToAssignment_3 ) )
            // InternalRosSystemParser.g:4794:2: ( rule__RosConnection__ToAssignment_3 )
            {
             before(grammarAccess.getRosConnectionAccess().getToAssignment_3()); 
            // InternalRosSystemParser.g:4795:2: ( rule__RosConnection__ToAssignment_3 )
            // InternalRosSystemParser.g:4795:3: rule__RosConnection__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRosConnectionAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__3__Impl"


    // $ANTLR start "rule__RosConnection__Group__4"
    // InternalRosSystemParser.g:4803:1: rule__RosConnection__Group__4 : rule__RosConnection__Group__4__Impl ;
    public final void rule__RosConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4807:1: ( rule__RosConnection__Group__4__Impl )
            // InternalRosSystemParser.g:4808:2: rule__RosConnection__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosConnection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__4"


    // $ANTLR start "rule__RosConnection__Group__4__Impl"
    // InternalRosSystemParser.g:4814:1: rule__RosConnection__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__RosConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4818:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:4819:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:4819:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:4820:2: RightSquareBracket
            {
             before(grammarAccess.getRosConnectionAccess().getRightSquareBracketKeyword_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRosConnectionAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__Group__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalRosSystemParser.g:4830:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4834:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalRosSystemParser.g:4835:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__GlobalNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0"


    // $ANTLR start "rule__GlobalNamespace__Group__0__Impl"
    // InternalRosSystemParser.g:4842:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4846:1: ( ( () ) )
            // InternalRosSystemParser.g:4847:1: ( () )
            {
            // InternalRosSystemParser.g:4847:1: ( () )
            // InternalRosSystemParser.g:4848:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalRosSystemParser.g:4849:2: ()
            // InternalRosSystemParser.g:4849:3: 
            {
            }

             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__1"
    // InternalRosSystemParser.g:4857:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4861:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalRosSystemParser.g:4862:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__GlobalNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1"


    // $ANTLR start "rule__GlobalNamespace__Group__1__Impl"
    // InternalRosSystemParser.g:4869:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4873:1: ( ( GlobalNamespace ) )
            // InternalRosSystemParser.g:4874:1: ( GlobalNamespace )
            {
            // InternalRosSystemParser.g:4874:1: ( GlobalNamespace )
            // InternalRosSystemParser.g:4875:2: GlobalNamespace
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 
            match(input,GlobalNamespace,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__2"
    // InternalRosSystemParser.g:4884:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4888:1: ( rule__GlobalNamespace__Group__2__Impl )
            // InternalRosSystemParser.g:4889:2: rule__GlobalNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2"


    // $ANTLR start "rule__GlobalNamespace__Group__2__Impl"
    // InternalRosSystemParser.g:4895:1: rule__GlobalNamespace__Group__2__Impl : ( ( rule__GlobalNamespace__Group_2__0 )? ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4899:1: ( ( ( rule__GlobalNamespace__Group_2__0 )? ) )
            // InternalRosSystemParser.g:4900:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:4900:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            // InternalRosSystemParser.g:4901:2: ( rule__GlobalNamespace__Group_2__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2()); 
            // InternalRosSystemParser.g:4902:2: ( rule__GlobalNamespace__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystemParser.g:4902:3: rule__GlobalNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__0"
    // InternalRosSystemParser.g:4911:1: rule__GlobalNamespace__Group_2__0 : rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 ;
    public final void rule__GlobalNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4915:1: ( rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 )
            // InternalRosSystemParser.g:4916:2: rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__GlobalNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__0"


    // $ANTLR start "rule__GlobalNamespace__Group_2__0__Impl"
    // InternalRosSystemParser.g:4923:1: rule__GlobalNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4927:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:4928:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:4928:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:4929:2: LeftSquareBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__1"
    // InternalRosSystemParser.g:4938:1: rule__GlobalNamespace__Group_2__1 : rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 ;
    public final void rule__GlobalNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4942:1: ( rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 )
            // InternalRosSystemParser.g:4943:2: rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__GlobalNamespace__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__1"


    // $ANTLR start "rule__GlobalNamespace__Group_2__1__Impl"
    // InternalRosSystemParser.g:4950:1: rule__GlobalNamespace__Group_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4954:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:4955:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:4955:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:4956:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1()); 
            // InternalRosSystemParser.g:4957:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:4957:3: rule__GlobalNamespace__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__2"
    // InternalRosSystemParser.g:4965:1: rule__GlobalNamespace__Group_2__2 : rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 ;
    public final void rule__GlobalNamespace__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4969:1: ( rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 )
            // InternalRosSystemParser.g:4970:2: rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__GlobalNamespace__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__2"


    // $ANTLR start "rule__GlobalNamespace__Group_2__2__Impl"
    // InternalRosSystemParser.g:4977:1: rule__GlobalNamespace__Group_2__2__Impl : ( ( rule__GlobalNamespace__Group_2_2__0 )* ) ;
    public final void rule__GlobalNamespace__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4981:1: ( ( ( rule__GlobalNamespace__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:4982:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:4982:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            // InternalRosSystemParser.g:4983:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2()); 
            // InternalRosSystemParser.g:4984:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRosSystemParser.g:4984:3: rule__GlobalNamespace__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__GlobalNamespace__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2__3"
    // InternalRosSystemParser.g:4992:1: rule__GlobalNamespace__Group_2__3 : rule__GlobalNamespace__Group_2__3__Impl ;
    public final void rule__GlobalNamespace__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4996:1: ( rule__GlobalNamespace__Group_2__3__Impl )
            // InternalRosSystemParser.g:4997:2: rule__GlobalNamespace__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__3"


    // $ANTLR start "rule__GlobalNamespace__Group_2__3__Impl"
    // InternalRosSystemParser.g:5003:1: rule__GlobalNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5007:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5008:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5008:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5009:2: RightSquareBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__0"
    // InternalRosSystemParser.g:5019:1: rule__GlobalNamespace__Group_2_2__0 : rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 ;
    public final void rule__GlobalNamespace__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5023:1: ( rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 )
            // InternalRosSystemParser.g:5024:2: rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__GlobalNamespace__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__0"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__0__Impl"
    // InternalRosSystemParser.g:5031:1: rule__GlobalNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5035:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5036:1: ( Comma )
            {
            // InternalRosSystemParser.g:5036:1: ( Comma )
            // InternalRosSystemParser.g:5037:2: Comma
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__1"
    // InternalRosSystemParser.g:5046:1: rule__GlobalNamespace__Group_2_2__1 : rule__GlobalNamespace__Group_2_2__1__Impl ;
    public final void rule__GlobalNamespace__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5050:1: ( rule__GlobalNamespace__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5051:2: rule__GlobalNamespace__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__1"


    // $ANTLR start "rule__GlobalNamespace__Group_2_2__1__Impl"
    // InternalRosSystemParser.g:5057:1: rule__GlobalNamespace__Group_2_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5061:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5062:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5062:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5063:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1()); 
            // InternalRosSystemParser.g:5064:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5064:3: rule__GlobalNamespace__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_2_2__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalRosSystemParser.g:5073:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5077:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalRosSystemParser.g:5078:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RelativeNamespace_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0__Impl"
    // InternalRosSystemParser.g:5085:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5089:1: ( ( () ) )
            // InternalRosSystemParser.g:5090:1: ( () )
            {
            // InternalRosSystemParser.g:5090:1: ( () )
            // InternalRosSystemParser.g:5091:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalRosSystemParser.g:5092:2: ()
            // InternalRosSystemParser.g:5092:3: 
            {
            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1"
    // InternalRosSystemParser.g:5100:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5104:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalRosSystemParser.g:5105:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__RelativeNamespace_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__1__Impl"
    // InternalRosSystemParser.g:5112:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5116:1: ( ( RelativeNamespace ) )
            // InternalRosSystemParser.g:5117:1: ( RelativeNamespace )
            {
            // InternalRosSystemParser.g:5117:1: ( RelativeNamespace )
            // InternalRosSystemParser.g:5118:2: RelativeNamespace
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 
            match(input,RelativeNamespace,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2"
    // InternalRosSystemParser.g:5127:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5131:1: ( rule__RelativeNamespace_Impl__Group__2__Impl )
            // InternalRosSystemParser.g:5132:2: rule__RelativeNamespace_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__2__Impl"
    // InternalRosSystemParser.g:5138:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5142:1: ( ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5143:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5143:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            // InternalRosSystemParser.g:5144:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2()); 
            // InternalRosSystemParser.g:5145:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftSquareBracket) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystemParser.g:5145:3: rule__RelativeNamespace_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeNamespace_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__0"
    // InternalRosSystemParser.g:5154:1: rule__RelativeNamespace_Impl__Group_2__0 : rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5158:1: ( rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 )
            // InternalRosSystemParser.g:5159:2: rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__RelativeNamespace_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__0__Impl"
    // InternalRosSystemParser.g:5166:1: rule__RelativeNamespace_Impl__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5170:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5171:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5171:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5172:2: LeftSquareBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__1"
    // InternalRosSystemParser.g:5181:1: rule__RelativeNamespace_Impl__Group_2__1 : rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 ;
    public final void rule__RelativeNamespace_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5185:1: ( rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 )
            // InternalRosSystemParser.g:5186:2: rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__RelativeNamespace_Impl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__1__Impl"
    // InternalRosSystemParser.g:5193:1: rule__RelativeNamespace_Impl__Group_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5197:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5198:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5198:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5199:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1()); 
            // InternalRosSystemParser.g:5200:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5200:3: rule__RelativeNamespace_Impl__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__2"
    // InternalRosSystemParser.g:5208:1: rule__RelativeNamespace_Impl__Group_2__2 : rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 ;
    public final void rule__RelativeNamespace_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5212:1: ( rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 )
            // InternalRosSystemParser.g:5213:2: rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__RelativeNamespace_Impl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__2__Impl"
    // InternalRosSystemParser.g:5220:1: rule__RelativeNamespace_Impl__Group_2__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5224:1: ( ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5225:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5225:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5226:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2()); 
            // InternalRosSystemParser.g:5227:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystemParser.g:5227:3: rule__RelativeNamespace_Impl__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__RelativeNamespace_Impl__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__3"
    // InternalRosSystemParser.g:5235:1: rule__RelativeNamespace_Impl__Group_2__3 : rule__RelativeNamespace_Impl__Group_2__3__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5239:1: ( rule__RelativeNamespace_Impl__Group_2__3__Impl )
            // InternalRosSystemParser.g:5240:2: rule__RelativeNamespace_Impl__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2__3__Impl"
    // InternalRosSystemParser.g:5246:1: rule__RelativeNamespace_Impl__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5250:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5251:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5251:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5252:2: RightSquareBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__0"
    // InternalRosSystemParser.g:5262:1: rule__RelativeNamespace_Impl__Group_2_2__0 : rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5266:1: ( rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 )
            // InternalRosSystemParser.g:5267:2: rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__RelativeNamespace_Impl__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__0__Impl"
    // InternalRosSystemParser.g:5274:1: rule__RelativeNamespace_Impl__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5278:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5279:1: ( Comma )
            {
            // InternalRosSystemParser.g:5279:1: ( Comma )
            // InternalRosSystemParser.g:5280:2: Comma
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__1"
    // InternalRosSystemParser.g:5289:1: rule__RelativeNamespace_Impl__Group_2_2__1 : rule__RelativeNamespace_Impl__Group_2_2__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5293:1: ( rule__RelativeNamespace_Impl__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5294:2: rule__RelativeNamespace_Impl__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_2_2__1__Impl"
    // InternalRosSystemParser.g:5300:1: rule__RelativeNamespace_Impl__Group_2_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5304:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5305:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5305:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5306:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1()); 
            // InternalRosSystemParser.g:5307:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5307:3: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_2_2__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalRosSystemParser.g:5316:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5320:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalRosSystemParser.g:5321:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__PrivateNamespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0"


    // $ANTLR start "rule__PrivateNamespace__Group__0__Impl"
    // InternalRosSystemParser.g:5328:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5332:1: ( ( () ) )
            // InternalRosSystemParser.g:5333:1: ( () )
            {
            // InternalRosSystemParser.g:5333:1: ( () )
            // InternalRosSystemParser.g:5334:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalRosSystemParser.g:5335:2: ()
            // InternalRosSystemParser.g:5335:3: 
            {
            }

             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__1"
    // InternalRosSystemParser.g:5343:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5347:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalRosSystemParser.g:5348:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PrivateNamespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1"


    // $ANTLR start "rule__PrivateNamespace__Group__1__Impl"
    // InternalRosSystemParser.g:5355:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5359:1: ( ( PrivateNamespace ) )
            // InternalRosSystemParser.g:5360:1: ( PrivateNamespace )
            {
            // InternalRosSystemParser.g:5360:1: ( PrivateNamespace )
            // InternalRosSystemParser.g:5361:2: PrivateNamespace
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 
            match(input,PrivateNamespace,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__2"
    // InternalRosSystemParser.g:5370:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5374:1: ( rule__PrivateNamespace__Group__2__Impl )
            // InternalRosSystemParser.g:5375:2: rule__PrivateNamespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2"


    // $ANTLR start "rule__PrivateNamespace__Group__2__Impl"
    // InternalRosSystemParser.g:5381:1: rule__PrivateNamespace__Group__2__Impl : ( ( rule__PrivateNamespace__Group_2__0 )? ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5385:1: ( ( ( rule__PrivateNamespace__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5386:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5386:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            // InternalRosSystemParser.g:5387:2: ( rule__PrivateNamespace__Group_2__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2()); 
            // InternalRosSystemParser.g:5388:2: ( rule__PrivateNamespace__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRosSystemParser.g:5388:3: rule__PrivateNamespace__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrivateNamespace__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__0"
    // InternalRosSystemParser.g:5397:1: rule__PrivateNamespace__Group_2__0 : rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 ;
    public final void rule__PrivateNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5401:1: ( rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 )
            // InternalRosSystemParser.g:5402:2: rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__PrivateNamespace__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__0"


    // $ANTLR start "rule__PrivateNamespace__Group_2__0__Impl"
    // InternalRosSystemParser.g:5409:1: rule__PrivateNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5413:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5414:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5414:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5415:2: LeftSquareBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__1"
    // InternalRosSystemParser.g:5424:1: rule__PrivateNamespace__Group_2__1 : rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 ;
    public final void rule__PrivateNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5428:1: ( rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 )
            // InternalRosSystemParser.g:5429:2: rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__PrivateNamespace__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__1"


    // $ANTLR start "rule__PrivateNamespace__Group_2__1__Impl"
    // InternalRosSystemParser.g:5436:1: rule__PrivateNamespace__Group_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5440:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5441:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5441:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5442:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1()); 
            // InternalRosSystemParser.g:5443:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5443:3: rule__PrivateNamespace__PartsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__2"
    // InternalRosSystemParser.g:5451:1: rule__PrivateNamespace__Group_2__2 : rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 ;
    public final void rule__PrivateNamespace__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5455:1: ( rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 )
            // InternalRosSystemParser.g:5456:2: rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3
            {
            pushFollow(FOLLOW_25);
            rule__PrivateNamespace__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__2"


    // $ANTLR start "rule__PrivateNamespace__Group_2__2__Impl"
    // InternalRosSystemParser.g:5463:1: rule__PrivateNamespace__Group_2__2__Impl : ( ( rule__PrivateNamespace__Group_2_2__0 )* ) ;
    public final void rule__PrivateNamespace__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5467:1: ( ( ( rule__PrivateNamespace__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5468:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5468:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5469:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2()); 
            // InternalRosSystemParser.g:5470:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRosSystemParser.g:5470:3: rule__PrivateNamespace__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__PrivateNamespace__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2__3"
    // InternalRosSystemParser.g:5478:1: rule__PrivateNamespace__Group_2__3 : rule__PrivateNamespace__Group_2__3__Impl ;
    public final void rule__PrivateNamespace__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5482:1: ( rule__PrivateNamespace__Group_2__3__Impl )
            // InternalRosSystemParser.g:5483:2: rule__PrivateNamespace__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__3"


    // $ANTLR start "rule__PrivateNamespace__Group_2__3__Impl"
    // InternalRosSystemParser.g:5489:1: rule__PrivateNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5493:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5494:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5494:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5495:2: RightSquareBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__0"
    // InternalRosSystemParser.g:5505:1: rule__PrivateNamespace__Group_2_2__0 : rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 ;
    public final void rule__PrivateNamespace__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5509:1: ( rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 )
            // InternalRosSystemParser.g:5510:2: rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_24);
            rule__PrivateNamespace__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__0"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__0__Impl"
    // InternalRosSystemParser.g:5517:1: rule__PrivateNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5521:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5522:1: ( Comma )
            {
            // InternalRosSystemParser.g:5522:1: ( Comma )
            // InternalRosSystemParser.g:5523:2: Comma
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__1"
    // InternalRosSystemParser.g:5532:1: rule__PrivateNamespace__Group_2_2__1 : rule__PrivateNamespace__Group_2_2__1__Impl ;
    public final void rule__PrivateNamespace__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5536:1: ( rule__PrivateNamespace__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5537:2: rule__PrivateNamespace__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__1"


    // $ANTLR start "rule__PrivateNamespace__Group_2_2__1__Impl"
    // InternalRosSystemParser.g:5543:1: rule__PrivateNamespace__Group_2_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5547:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5548:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5548:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5549:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1()); 
            // InternalRosSystemParser.g:5550:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5550:3: rule__PrivateNamespace__PartsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_2_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalRosSystemParser.g:5559:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5563:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalRosSystemParser.g:5564:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalRosSystemParser.g:5571:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5575:1: ( ( () ) )
            // InternalRosSystemParser.g:5576:1: ( () )
            {
            // InternalRosSystemParser.g:5576:1: ( () )
            // InternalRosSystemParser.g:5577:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalRosSystemParser.g:5578:2: ()
            // InternalRosSystemParser.g:5578:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalRosSystemParser.g:5586:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5590:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalRosSystemParser.g:5591:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalRosSystemParser.g:5598:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5602:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:5603:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:5603:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalRosSystemParser.g:5604:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalRosSystemParser.g:5605:2: ( rule__Parameter__NameAssignment_1 )
            // InternalRosSystemParser.g:5605:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalRosSystemParser.g:5613:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5617:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalRosSystemParser.g:5618:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalRosSystemParser.g:5625:1: rule__Parameter__Group__2__Impl : ( Colon ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5629:1: ( ( Colon ) )
            // InternalRosSystemParser.g:5630:1: ( Colon )
            {
            // InternalRosSystemParser.g:5630:1: ( Colon )
            // InternalRosSystemParser.g:5631:2: Colon
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalRosSystemParser.g:5640:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5644:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalRosSystemParser.g:5645:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalRosSystemParser.g:5652:1: rule__Parameter__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5656:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:5657:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:5657:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:5658:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalRosSystemParser.g:5667:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5671:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalRosSystemParser.g:5672:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalRosSystemParser.g:5679:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__Group_4__0 )? ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5683:1: ( ( ( rule__Parameter__Group_4__0 )? ) )
            // InternalRosSystemParser.g:5684:1: ( ( rule__Parameter__Group_4__0 )? )
            {
            // InternalRosSystemParser.g:5684:1: ( ( rule__Parameter__Group_4__0 )? )
            // InternalRosSystemParser.g:5685:2: ( rule__Parameter__Group_4__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_4()); 
            // InternalRosSystemParser.g:5686:2: ( rule__Parameter__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Ns) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystemParser.g:5686:3: rule__Parameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalRosSystemParser.g:5694:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl rule__Parameter__Group__6 ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5698:1: ( rule__Parameter__Group__5__Impl rule__Parameter__Group__6 )
            // InternalRosSystemParser.g:5699:2: rule__Parameter__Group__5__Impl rule__Parameter__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Parameter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalRosSystemParser.g:5706:1: rule__Parameter__Group__5__Impl : ( Type_1 ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5710:1: ( ( Type_1 ) )
            // InternalRosSystemParser.g:5711:1: ( Type_1 )
            {
            // InternalRosSystemParser.g:5711:1: ( Type_1 )
            // InternalRosSystemParser.g:5712:2: Type_1
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_5()); 
            match(input,Type_1,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group__6"
    // InternalRosSystemParser.g:5721:1: rule__Parameter__Group__6 : rule__Parameter__Group__6__Impl rule__Parameter__Group__7 ;
    public final void rule__Parameter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5725:1: ( rule__Parameter__Group__6__Impl rule__Parameter__Group__7 )
            // InternalRosSystemParser.g:5726:2: rule__Parameter__Group__6__Impl rule__Parameter__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Parameter__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6"


    // $ANTLR start "rule__Parameter__Group__6__Impl"
    // InternalRosSystemParser.g:5733:1: rule__Parameter__Group__6__Impl : ( ( rule__Parameter__TypeAssignment_6 ) ) ;
    public final void rule__Parameter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5737:1: ( ( ( rule__Parameter__TypeAssignment_6 ) ) )
            // InternalRosSystemParser.g:5738:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            {
            // InternalRosSystemParser.g:5738:1: ( ( rule__Parameter__TypeAssignment_6 ) )
            // InternalRosSystemParser.g:5739:2: ( rule__Parameter__TypeAssignment_6 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_6()); 
            // InternalRosSystemParser.g:5740:2: ( rule__Parameter__TypeAssignment_6 )
            // InternalRosSystemParser.g:5740:3: rule__Parameter__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__7"
    // InternalRosSystemParser.g:5748:1: rule__Parameter__Group__7 : rule__Parameter__Group__7__Impl rule__Parameter__Group__8 ;
    public final void rule__Parameter__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5752:1: ( rule__Parameter__Group__7__Impl rule__Parameter__Group__8 )
            // InternalRosSystemParser.g:5753:2: rule__Parameter__Group__7__Impl rule__Parameter__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Parameter__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__7"


    // $ANTLR start "rule__Parameter__Group__7__Impl"
    // InternalRosSystemParser.g:5760:1: rule__Parameter__Group__7__Impl : ( ( rule__Parameter__Group_7__0 )? ) ;
    public final void rule__Parameter__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5764:1: ( ( ( rule__Parameter__Group_7__0 )? ) )
            // InternalRosSystemParser.g:5765:1: ( ( rule__Parameter__Group_7__0 )? )
            {
            // InternalRosSystemParser.g:5765:1: ( ( rule__Parameter__Group_7__0 )? )
            // InternalRosSystemParser.g:5766:2: ( rule__Parameter__Group_7__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_7()); 
            // InternalRosSystemParser.g:5767:2: ( rule__Parameter__Group_7__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Value_1) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystemParser.g:5767:3: rule__Parameter__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__7__Impl"


    // $ANTLR start "rule__Parameter__Group__8"
    // InternalRosSystemParser.g:5775:1: rule__Parameter__Group__8 : rule__Parameter__Group__8__Impl ;
    public final void rule__Parameter__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5779:1: ( rule__Parameter__Group__8__Impl )
            // InternalRosSystemParser.g:5780:2: rule__Parameter__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__8"


    // $ANTLR start "rule__Parameter__Group__8__Impl"
    // InternalRosSystemParser.g:5786:1: rule__Parameter__Group__8__Impl : ( RULE_END ) ;
    public final void rule__Parameter__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5790:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:5791:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:5791:1: ( RULE_END )
            // InternalRosSystemParser.g:5792:2: RULE_END
            {
             before(grammarAccess.getParameterAccess().getENDTerminalRuleCall_8()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getENDTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__8__Impl"


    // $ANTLR start "rule__Parameter__Group_4__0"
    // InternalRosSystemParser.g:5802:1: rule__Parameter__Group_4__0 : rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 ;
    public final void rule__Parameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5806:1: ( rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 )
            // InternalRosSystemParser.g:5807:2: rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__Parameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0"


    // $ANTLR start "rule__Parameter__Group_4__0__Impl"
    // InternalRosSystemParser.g:5814:1: rule__Parameter__Group_4__0__Impl : ( Ns ) ;
    public final void rule__Parameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5818:1: ( ( Ns ) )
            // InternalRosSystemParser.g:5819:1: ( Ns )
            {
            // InternalRosSystemParser.g:5819:1: ( Ns )
            // InternalRosSystemParser.g:5820:2: Ns
            {
             before(grammarAccess.getParameterAccess().getNsKeyword_4_0()); 
            match(input,Ns,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0__Impl"


    // $ANTLR start "rule__Parameter__Group_4__1"
    // InternalRosSystemParser.g:5829:1: rule__Parameter__Group_4__1 : rule__Parameter__Group_4__1__Impl ;
    public final void rule__Parameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5833:1: ( rule__Parameter__Group_4__1__Impl )
            // InternalRosSystemParser.g:5834:2: rule__Parameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1"


    // $ANTLR start "rule__Parameter__Group_4__1__Impl"
    // InternalRosSystemParser.g:5840:1: rule__Parameter__Group_4__1__Impl : ( ( rule__Parameter__NamespaceAssignment_4_1 ) ) ;
    public final void rule__Parameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5844:1: ( ( ( rule__Parameter__NamespaceAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:5845:1: ( ( rule__Parameter__NamespaceAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:5845:1: ( ( rule__Parameter__NamespaceAssignment_4_1 ) )
            // InternalRosSystemParser.g:5846:2: ( rule__Parameter__NamespaceAssignment_4_1 )
            {
             before(grammarAccess.getParameterAccess().getNamespaceAssignment_4_1()); 
            // InternalRosSystemParser.g:5847:2: ( rule__Parameter__NamespaceAssignment_4_1 )
            // InternalRosSystemParser.g:5847:3: rule__Parameter__NamespaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NamespaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNamespaceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1__Impl"


    // $ANTLR start "rule__Parameter__Group_7__0"
    // InternalRosSystemParser.g:5856:1: rule__Parameter__Group_7__0 : rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1 ;
    public final void rule__Parameter__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5860:1: ( rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1 )
            // InternalRosSystemParser.g:5861:2: rule__Parameter__Group_7__0__Impl rule__Parameter__Group_7__1
            {
            pushFollow(FOLLOW_21);
            rule__Parameter__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__0"


    // $ANTLR start "rule__Parameter__Group_7__0__Impl"
    // InternalRosSystemParser.g:5868:1: rule__Parameter__Group_7__0__Impl : ( Value_1 ) ;
    public final void rule__Parameter__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5872:1: ( ( Value_1 ) )
            // InternalRosSystemParser.g:5873:1: ( Value_1 )
            {
            // InternalRosSystemParser.g:5873:1: ( Value_1 )
            // InternalRosSystemParser.g:5874:2: Value_1
            {
             before(grammarAccess.getParameterAccess().getValueKeyword_7_0()); 
            match(input,Value_1,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getValueKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__0__Impl"


    // $ANTLR start "rule__Parameter__Group_7__1"
    // InternalRosSystemParser.g:5883:1: rule__Parameter__Group_7__1 : rule__Parameter__Group_7__1__Impl ;
    public final void rule__Parameter__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5887:1: ( rule__Parameter__Group_7__1__Impl )
            // InternalRosSystemParser.g:5888:2: rule__Parameter__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__1"


    // $ANTLR start "rule__Parameter__Group_7__1__Impl"
    // InternalRosSystemParser.g:5894:1: rule__Parameter__Group_7__1__Impl : ( ( rule__Parameter__ValueAssignment_7_1 ) ) ;
    public final void rule__Parameter__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5898:1: ( ( ( rule__Parameter__ValueAssignment_7_1 ) ) )
            // InternalRosSystemParser.g:5899:1: ( ( rule__Parameter__ValueAssignment_7_1 ) )
            {
            // InternalRosSystemParser.g:5899:1: ( ( rule__Parameter__ValueAssignment_7_1 ) )
            // InternalRosSystemParser.g:5900:2: ( rule__Parameter__ValueAssignment_7_1 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_7_1()); 
            // InternalRosSystemParser.g:5901:2: ( rule__Parameter__ValueAssignment_7_1 )
            // InternalRosSystemParser.g:5901:3: rule__Parameter__ValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_7__1__Impl"


    // $ANTLR start "rule__ParameterListType__Group__0"
    // InternalRosSystemParser.g:5910:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5914:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalRosSystemParser.g:5915:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ParameterListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__0"


    // $ANTLR start "rule__ParameterListType__Group__0__Impl"
    // InternalRosSystemParser.g:5922:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5926:1: ( ( () ) )
            // InternalRosSystemParser.g:5927:1: ( () )
            {
            // InternalRosSystemParser.g:5927:1: ( () )
            // InternalRosSystemParser.g:5928:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0()); 
            // InternalRosSystemParser.g:5929:2: ()
            // InternalRosSystemParser.g:5929:3: 
            {
            }

             after(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__0__Impl"


    // $ANTLR start "rule__ParameterListType__Group__1"
    // InternalRosSystemParser.g:5937:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5941:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalRosSystemParser.g:5942:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ParameterListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__1"


    // $ANTLR start "rule__ParameterListType__Group__1__Impl"
    // InternalRosSystemParser.g:5949:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5953:1: ( ( List ) )
            // InternalRosSystemParser.g:5954:1: ( List )
            {
            // InternalRosSystemParser.g:5954:1: ( List )
            // InternalRosSystemParser.g:5955:2: List
            {
             before(grammarAccess.getParameterListTypeAccess().getListKeyword_1()); 
            match(input,List,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getListKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__1__Impl"


    // $ANTLR start "rule__ParameterListType__Group__2"
    // InternalRosSystemParser.g:5964:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5968:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalRosSystemParser.g:5969:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ParameterListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__2"


    // $ANTLR start "rule__ParameterListType__Group__2__Impl"
    // InternalRosSystemParser.g:5976:1: rule__ParameterListType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5980:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5981:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5981:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5982:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__2__Impl"


    // $ANTLR start "rule__ParameterListType__Group__3"
    // InternalRosSystemParser.g:5991:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5995:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalRosSystemParser.g:5996:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ParameterListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__3"


    // $ANTLR start "rule__ParameterListType__Group__3__Impl"
    // InternalRosSystemParser.g:6003:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6007:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:6008:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:6008:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalRosSystemParser.g:6009:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3()); 
            // InternalRosSystemParser.g:6010:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalRosSystemParser.g:6010:3: rule__ParameterListType__SequenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__SequenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__3__Impl"


    // $ANTLR start "rule__ParameterListType__Group__4"
    // InternalRosSystemParser.g:6018:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6022:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalRosSystemParser.g:6023:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ParameterListType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__4"


    // $ANTLR start "rule__ParameterListType__Group__4__Impl"
    // InternalRosSystemParser.g:6030:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6034:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:6035:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:6035:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalRosSystemParser.g:6036:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4()); 
            // InternalRosSystemParser.g:6037:2: ( rule__ParameterListType__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRosSystemParser.g:6037:3: rule__ParameterListType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ParameterListType__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getParameterListTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__4__Impl"


    // $ANTLR start "rule__ParameterListType__Group__5"
    // InternalRosSystemParser.g:6045:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6049:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalRosSystemParser.g:6050:2: rule__ParameterListType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__5"


    // $ANTLR start "rule__ParameterListType__Group__5__Impl"
    // InternalRosSystemParser.g:6056:1: rule__ParameterListType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6060:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:6061:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:6061:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:6062:2: RightSquareBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group__5__Impl"


    // $ANTLR start "rule__ParameterListType__Group_4__0"
    // InternalRosSystemParser.g:6072:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6076:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalRosSystemParser.g:6077:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__ParameterListType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__0"


    // $ANTLR start "rule__ParameterListType__Group_4__0__Impl"
    // InternalRosSystemParser.g:6084:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6088:1: ( ( Comma ) )
            // InternalRosSystemParser.g:6089:1: ( Comma )
            {
            // InternalRosSystemParser.g:6089:1: ( Comma )
            // InternalRosSystemParser.g:6090:2: Comma
            {
             before(grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterListType__Group_4__1"
    // InternalRosSystemParser.g:6099:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6103:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalRosSystemParser.g:6104:2: rule__ParameterListType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__1"


    // $ANTLR start "rule__ParameterListType__Group_4__1__Impl"
    // InternalRosSystemParser.g:6110:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6114:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:6115:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:6115:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalRosSystemParser.g:6116:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1()); 
            // InternalRosSystemParser.g:6117:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalRosSystemParser.g:6117:3: rule__ParameterListType__SequenceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterListType__SequenceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__0"
    // InternalRosSystemParser.g:6126:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6130:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalRosSystemParser.g:6131:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__ParameterStructType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__0"


    // $ANTLR start "rule__ParameterStructType__Group__0__Impl"
    // InternalRosSystemParser.g:6138:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6142:1: ( ( () ) )
            // InternalRosSystemParser.g:6143:1: ( () )
            {
            // InternalRosSystemParser.g:6143:1: ( () )
            // InternalRosSystemParser.g:6144:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0()); 
            // InternalRosSystemParser.g:6145:2: ()
            // InternalRosSystemParser.g:6145:3: 
            {
            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__1"
    // InternalRosSystemParser.g:6153:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6157:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalRosSystemParser.g:6158:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ParameterStructType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__1"


    // $ANTLR start "rule__ParameterStructType__Group__1__Impl"
    // InternalRosSystemParser.g:6165:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6169:1: ( ( Struct ) )
            // InternalRosSystemParser.g:6170:1: ( Struct )
            {
            // InternalRosSystemParser.g:6170:1: ( Struct )
            // InternalRosSystemParser.g:6171:2: Struct
            {
             before(grammarAccess.getParameterStructTypeAccess().getStructKeyword_1()); 
            match(input,Struct,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getStructKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__2"
    // InternalRosSystemParser.g:6180:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6184:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalRosSystemParser.g:6185:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ParameterStructType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__2"


    // $ANTLR start "rule__ParameterStructType__Group__2__Impl"
    // InternalRosSystemParser.g:6192:1: rule__ParameterStructType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6196:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:6197:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:6197:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:6198:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__3"
    // InternalRosSystemParser.g:6207:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6211:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalRosSystemParser.g:6212:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ParameterStructType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__3"


    // $ANTLR start "rule__ParameterStructType__Group__3__Impl"
    // InternalRosSystemParser.g:6219:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6223:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalRosSystemParser.g:6224:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalRosSystemParser.g:6224:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalRosSystemParser.g:6225:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3()); 
            // InternalRosSystemParser.g:6226:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalRosSystemParser.g:6226:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__ParameterstructypetmemberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__3__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__4"
    // InternalRosSystemParser.g:6234:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6238:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalRosSystemParser.g:6239:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ParameterStructType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__4"


    // $ANTLR start "rule__ParameterStructType__Group__4__Impl"
    // InternalRosSystemParser.g:6246:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6250:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:6251:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:6251:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalRosSystemParser.g:6252:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4()); 
            // InternalRosSystemParser.g:6253:2: ( rule__ParameterStructType__Group_4__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Comma) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRosSystemParser.g:6253:3: rule__ParameterStructType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ParameterStructType__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getParameterStructTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__4__Impl"


    // $ANTLR start "rule__ParameterStructType__Group__5"
    // InternalRosSystemParser.g:6261:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6265:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalRosSystemParser.g:6266:2: rule__ParameterStructType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__5"


    // $ANTLR start "rule__ParameterStructType__Group__5__Impl"
    // InternalRosSystemParser.g:6272:1: rule__ParameterStructType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6276:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:6277:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:6277:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:6278:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group__5__Impl"


    // $ANTLR start "rule__ParameterStructType__Group_4__0"
    // InternalRosSystemParser.g:6288:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6292:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalRosSystemParser.g:6293:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__ParameterStructType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__0"


    // $ANTLR start "rule__ParameterStructType__Group_4__0__Impl"
    // InternalRosSystemParser.g:6300:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6304:1: ( ( Comma ) )
            // InternalRosSystemParser.g:6305:1: ( Comma )
            {
            // InternalRosSystemParser.g:6305:1: ( Comma )
            // InternalRosSystemParser.g:6306:2: Comma
            {
             before(grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterStructType__Group_4__1"
    // InternalRosSystemParser.g:6315:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6319:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalRosSystemParser.g:6320:2: rule__ParameterStructType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__1"


    // $ANTLR start "rule__ParameterStructType__Group_4__1__Impl"
    // InternalRosSystemParser.g:6326:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6330:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:6331:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:6331:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalRosSystemParser.g:6332:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1()); 
            // InternalRosSystemParser.g:6333:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalRosSystemParser.g:6333:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__0"
    // InternalRosSystemParser.g:6342:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6346:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalRosSystemParser.g:6347:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ParameterIntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__0"


    // $ANTLR start "rule__ParameterIntegerType__Group__0__Impl"
    // InternalRosSystemParser.g:6354:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6358:1: ( ( () ) )
            // InternalRosSystemParser.g:6359:1: ( () )
            {
            // InternalRosSystemParser.g:6359:1: ( () )
            // InternalRosSystemParser.g:6360:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0()); 
            // InternalRosSystemParser.g:6361:2: ()
            // InternalRosSystemParser.g:6361:3: 
            {
            }

             after(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__0__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__1"
    // InternalRosSystemParser.g:6369:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6373:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalRosSystemParser.g:6374:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ParameterIntegerType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__1"


    // $ANTLR start "rule__ParameterIntegerType__Group__1__Impl"
    // InternalRosSystemParser.g:6381:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6385:1: ( ( Integer ) )
            // InternalRosSystemParser.g:6386:1: ( Integer )
            {
            // InternalRosSystemParser.g:6386:1: ( Integer )
            // InternalRosSystemParser.g:6387:2: Integer
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1()); 
            match(input,Integer,FOLLOW_2); 
             after(grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__1__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group__2"
    // InternalRosSystemParser.g:6396:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6400:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalRosSystemParser.g:6401:2: rule__ParameterIntegerType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__2"


    // $ANTLR start "rule__ParameterIntegerType__Group__2__Impl"
    // InternalRosSystemParser.g:6407:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6411:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6412:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6412:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalRosSystemParser.g:6413:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:6414:2: ( rule__ParameterIntegerType__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Default) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_DECINT) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystemParser.g:6414:3: rule__ParameterIntegerType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterIntegerType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterIntegerTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group__2__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__0"
    // InternalRosSystemParser.g:6423:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6427:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalRosSystemParser.g:6428:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__ParameterIntegerType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__0"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__0__Impl"
    // InternalRosSystemParser.g:6435:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6439:1: ( ( Default ) )
            // InternalRosSystemParser.g:6440:1: ( Default )
            {
            // InternalRosSystemParser.g:6440:1: ( Default )
            // InternalRosSystemParser.g:6441:2: Default
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__1"
    // InternalRosSystemParser.g:6450:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6454:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6455:2: rule__ParameterIntegerType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__1"


    // $ANTLR start "rule__ParameterIntegerType__Group_2__1__Impl"
    // InternalRosSystemParser.g:6461:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6465:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6466:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6466:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6467:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:6468:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6468:3: rule__ParameterIntegerType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterIntegerType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__0"
    // InternalRosSystemParser.g:6477:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6481:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalRosSystemParser.g:6482:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ParameterStringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0"


    // $ANTLR start "rule__ParameterStringType__Group__0__Impl"
    // InternalRosSystemParser.g:6489:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6493:1: ( ( () ) )
            // InternalRosSystemParser.g:6494:1: ( () )
            {
            // InternalRosSystemParser.g:6494:1: ( () )
            // InternalRosSystemParser.g:6495:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalRosSystemParser.g:6496:2: ()
            // InternalRosSystemParser.g:6496:3: 
            {
            }

             after(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__1"
    // InternalRosSystemParser.g:6504:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6508:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalRosSystemParser.g:6509:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ParameterStringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1"


    // $ANTLR start "rule__ParameterStringType__Group__1__Impl"
    // InternalRosSystemParser.g:6516:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6520:1: ( ( String ) )
            // InternalRosSystemParser.g:6521:1: ( String )
            {
            // InternalRosSystemParser.g:6521:1: ( String )
            // InternalRosSystemParser.g:6522:2: String
            {
             before(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 
            match(input,String,FOLLOW_2); 
             after(grammarAccess.getParameterStringTypeAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__1__Impl"


    // $ANTLR start "rule__ParameterStringType__Group__2"
    // InternalRosSystemParser.g:6531:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6535:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalRosSystemParser.g:6536:2: rule__ParameterStringType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__2"


    // $ANTLR start "rule__ParameterStringType__Group__2__Impl"
    // InternalRosSystemParser.g:6542:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6546:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6547:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6547:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalRosSystemParser.g:6548:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:6549:2: ( rule__ParameterStringType__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Default) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=RULE_ID && LA30_1<=RULE_STRING)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystemParser.g:6549:3: rule__ParameterStringType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStringType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStringTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group__2__Impl"


    // $ANTLR start "rule__ParameterStringType__Group_2__0"
    // InternalRosSystemParser.g:6558:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6562:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalRosSystemParser.g:6563:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ParameterStringType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__0"


    // $ANTLR start "rule__ParameterStringType__Group_2__0__Impl"
    // InternalRosSystemParser.g:6570:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6574:1: ( ( Default ) )
            // InternalRosSystemParser.g:6575:1: ( Default )
            {
            // InternalRosSystemParser.g:6575:1: ( Default )
            // InternalRosSystemParser.g:6576:2: Default
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterStringType__Group_2__1"
    // InternalRosSystemParser.g:6585:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6589:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6590:2: rule__ParameterStringType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__1"


    // $ANTLR start "rule__ParameterStringType__Group_2__1__Impl"
    // InternalRosSystemParser.g:6596:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6600:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6601:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6601:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6602:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:6603:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6603:3: rule__ParameterStringType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStringType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__0"
    // InternalRosSystemParser.g:6612:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6616:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalRosSystemParser.g:6617:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ParameterDoubleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__0"


    // $ANTLR start "rule__ParameterDoubleType__Group__0__Impl"
    // InternalRosSystemParser.g:6624:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6628:1: ( ( () ) )
            // InternalRosSystemParser.g:6629:1: ( () )
            {
            // InternalRosSystemParser.g:6629:1: ( () )
            // InternalRosSystemParser.g:6630:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0()); 
            // InternalRosSystemParser.g:6631:2: ()
            // InternalRosSystemParser.g:6631:3: 
            {
            }

             after(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__0__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__1"
    // InternalRosSystemParser.g:6639:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6643:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalRosSystemParser.g:6644:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ParameterDoubleType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__1"


    // $ANTLR start "rule__ParameterDoubleType__Group__1__Impl"
    // InternalRosSystemParser.g:6651:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6655:1: ( ( Double ) )
            // InternalRosSystemParser.g:6656:1: ( Double )
            {
            // InternalRosSystemParser.g:6656:1: ( Double )
            // InternalRosSystemParser.g:6657:2: Double
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1()); 
            match(input,Double,FOLLOW_2); 
             after(grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__1__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group__2"
    // InternalRosSystemParser.g:6666:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6670:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalRosSystemParser.g:6671:2: rule__ParameterDoubleType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__2"


    // $ANTLR start "rule__ParameterDoubleType__Group__2__Impl"
    // InternalRosSystemParser.g:6677:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6681:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6682:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6682:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalRosSystemParser.g:6683:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:6684:2: ( rule__ParameterDoubleType__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Default) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_DOUBLE) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystemParser.g:6684:3: rule__ParameterDoubleType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDoubleType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDoubleTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group__2__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__0"
    // InternalRosSystemParser.g:6693:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6697:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalRosSystemParser.g:6698:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__ParameterDoubleType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__0"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__0__Impl"
    // InternalRosSystemParser.g:6705:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6709:1: ( ( Default ) )
            // InternalRosSystemParser.g:6710:1: ( Default )
            {
            // InternalRosSystemParser.g:6710:1: ( Default )
            // InternalRosSystemParser.g:6711:2: Default
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__1"
    // InternalRosSystemParser.g:6720:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6724:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6725:2: rule__ParameterDoubleType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__1"


    // $ANTLR start "rule__ParameterDoubleType__Group_2__1__Impl"
    // InternalRosSystemParser.g:6731:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6735:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6736:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6736:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6737:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:6738:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6738:3: rule__ParameterDoubleType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDoubleType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__0"
    // InternalRosSystemParser.g:6747:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6751:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalRosSystemParser.g:6752:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__ParameterBooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__0"


    // $ANTLR start "rule__ParameterBooleanType__Group__0__Impl"
    // InternalRosSystemParser.g:6759:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6763:1: ( ( () ) )
            // InternalRosSystemParser.g:6764:1: ( () )
            {
            // InternalRosSystemParser.g:6764:1: ( () )
            // InternalRosSystemParser.g:6765:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0()); 
            // InternalRosSystemParser.g:6766:2: ()
            // InternalRosSystemParser.g:6766:3: 
            {
            }

             after(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__0__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__1"
    // InternalRosSystemParser.g:6774:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6778:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalRosSystemParser.g:6779:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ParameterBooleanType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__1"


    // $ANTLR start "rule__ParameterBooleanType__Group__1__Impl"
    // InternalRosSystemParser.g:6786:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6790:1: ( ( Boolean ) )
            // InternalRosSystemParser.g:6791:1: ( Boolean )
            {
            // InternalRosSystemParser.g:6791:1: ( Boolean )
            // InternalRosSystemParser.g:6792:2: Boolean
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1()); 
            match(input,Boolean,FOLLOW_2); 
             after(grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__1__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group__2"
    // InternalRosSystemParser.g:6801:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6805:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalRosSystemParser.g:6806:2: rule__ParameterBooleanType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__2"


    // $ANTLR start "rule__ParameterBooleanType__Group__2__Impl"
    // InternalRosSystemParser.g:6812:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6816:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6817:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6817:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalRosSystemParser.g:6818:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:6819:2: ( rule__ParameterBooleanType__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_BOOLEAN) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystemParser.g:6819:3: rule__ParameterBooleanType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterBooleanType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterBooleanTypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group__2__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__0"
    // InternalRosSystemParser.g:6828:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6832:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalRosSystemParser.g:6833:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
            {
            pushFollow(FOLLOW_42);
            rule__ParameterBooleanType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__0"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__0__Impl"
    // InternalRosSystemParser.g:6840:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6844:1: ( ( Default ) )
            // InternalRosSystemParser.g:6845:1: ( Default )
            {
            // InternalRosSystemParser.g:6845:1: ( Default )
            // InternalRosSystemParser.g:6846:2: Default
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__1"
    // InternalRosSystemParser.g:6855:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6859:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6860:2: rule__ParameterBooleanType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__1"


    // $ANTLR start "rule__ParameterBooleanType__Group_2__1__Impl"
    // InternalRosSystemParser.g:6866:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6870:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6871:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6871:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6872:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:6873:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6873:3: rule__ParameterBooleanType__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBooleanType__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__0"
    // InternalRosSystemParser.g:6882:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6886:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalRosSystemParser.g:6887:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ParameterBase64Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__0"


    // $ANTLR start "rule__ParameterBase64Type__Group__0__Impl"
    // InternalRosSystemParser.g:6894:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6898:1: ( ( () ) )
            // InternalRosSystemParser.g:6899:1: ( () )
            {
            // InternalRosSystemParser.g:6899:1: ( () )
            // InternalRosSystemParser.g:6900:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0()); 
            // InternalRosSystemParser.g:6901:2: ()
            // InternalRosSystemParser.g:6901:3: 
            {
            }

             after(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__0__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__1"
    // InternalRosSystemParser.g:6909:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6913:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalRosSystemParser.g:6914:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__ParameterBase64Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__1"


    // $ANTLR start "rule__ParameterBase64Type__Group__1__Impl"
    // InternalRosSystemParser.g:6921:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6925:1: ( ( Base64 ) )
            // InternalRosSystemParser.g:6926:1: ( Base64 )
            {
            // InternalRosSystemParser.g:6926:1: ( Base64 )
            // InternalRosSystemParser.g:6927:2: Base64
            {
             before(grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1()); 
            match(input,Base64,FOLLOW_2); 
             after(grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__1__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group__2"
    // InternalRosSystemParser.g:6936:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6940:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalRosSystemParser.g:6941:2: rule__ParameterBase64Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__2"


    // $ANTLR start "rule__ParameterBase64Type__Group__2__Impl"
    // InternalRosSystemParser.g:6947:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6951:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6952:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6952:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalRosSystemParser.g:6953:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:6954:2: ( rule__ParameterBase64Type__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Default) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==RULE_BINARY) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystemParser.g:6954:3: rule__ParameterBase64Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterBase64Type__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterBase64TypeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group__2__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__0"
    // InternalRosSystemParser.g:6963:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6967:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalRosSystemParser.g:6968:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
            {
            pushFollow(FOLLOW_44);
            rule__ParameterBase64Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__0"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__0__Impl"
    // InternalRosSystemParser.g:6975:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6979:1: ( ( Default ) )
            // InternalRosSystemParser.g:6980:1: ( Default )
            {
            // InternalRosSystemParser.g:6980:1: ( Default )
            // InternalRosSystemParser.g:6981:2: Default
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__1"
    // InternalRosSystemParser.g:6990:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:6994:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalRosSystemParser.g:6995:2: rule__ParameterBase64Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__1"


    // $ANTLR start "rule__ParameterBase64Type__Group_2__1__Impl"
    // InternalRosSystemParser.g:7001:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7005:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:7006:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:7006:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:7007:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:7008:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:7008:3: rule__ParameterBase64Type__DefaultAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterBase64Type__DefaultAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__0"
    // InternalRosSystemParser.g:7017:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7021:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalRosSystemParser.g:7022:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__0"


    // $ANTLR start "rule__ParameterArrayType__Group__0__Impl"
    // InternalRosSystemParser.g:7029:1: rule__ParameterArrayType__Group__0__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7033:1: ( ( Array ) )
            // InternalRosSystemParser.g:7034:1: ( Array )
            {
            // InternalRosSystemParser.g:7034:1: ( Array )
            // InternalRosSystemParser.g:7035:2: Array
            {
             before(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0()); 
            match(input,Array,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__1"
    // InternalRosSystemParser.g:7044:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7048:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalRosSystemParser.g:7049:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
            {
            pushFollow(FOLLOW_45);
            rule__ParameterArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__1"


    // $ANTLR start "rule__ParameterArrayType__Group__1__Impl"
    // InternalRosSystemParser.g:7056:1: rule__ParameterArrayType__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7060:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:7061:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:7061:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:7062:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__1__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__2"
    // InternalRosSystemParser.g:7071:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7075:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalRosSystemParser.g:7076:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__ParameterArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__2"


    // $ANTLR start "rule__ParameterArrayType__Group__2__Impl"
    // InternalRosSystemParser.g:7083:1: rule__ParameterArrayType__Group__2__Impl : ( Type ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7087:1: ( ( Type ) )
            // InternalRosSystemParser.g:7088:1: ( Type )
            {
            // InternalRosSystemParser.g:7088:1: ( Type )
            // InternalRosSystemParser.g:7089:2: Type
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__2__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__3"
    // InternalRosSystemParser.g:7098:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7102:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalRosSystemParser.g:7103:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__ParameterArrayType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__3"


    // $ANTLR start "rule__ParameterArrayType__Group__3__Impl"
    // InternalRosSystemParser.g:7110:1: rule__ParameterArrayType__Group__3__Impl : ( ( rule__ParameterArrayType__TypeAssignment_3 ) ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7114:1: ( ( ( rule__ParameterArrayType__TypeAssignment_3 ) ) )
            // InternalRosSystemParser.g:7115:1: ( ( rule__ParameterArrayType__TypeAssignment_3 ) )
            {
            // InternalRosSystemParser.g:7115:1: ( ( rule__ParameterArrayType__TypeAssignment_3 ) )
            // InternalRosSystemParser.g:7116:2: ( rule__ParameterArrayType__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3()); 
            // InternalRosSystemParser.g:7117:2: ( rule__ParameterArrayType__TypeAssignment_3 )
            // InternalRosSystemParser.g:7117:3: rule__ParameterArrayType__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__3__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__4"
    // InternalRosSystemParser.g:7125:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl rule__ParameterArrayType__Group__5 ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7129:1: ( rule__ParameterArrayType__Group__4__Impl rule__ParameterArrayType__Group__5 )
            // InternalRosSystemParser.g:7130:2: rule__ParameterArrayType__Group__4__Impl rule__ParameterArrayType__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__ParameterArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__4"


    // $ANTLR start "rule__ParameterArrayType__Group__4__Impl"
    // InternalRosSystemParser.g:7137:1: rule__ParameterArrayType__Group__4__Impl : ( ( rule__ParameterArrayType__Group_4__0 )? ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7141:1: ( ( ( rule__ParameterArrayType__Group_4__0 )? ) )
            // InternalRosSystemParser.g:7142:1: ( ( rule__ParameterArrayType__Group_4__0 )? )
            {
            // InternalRosSystemParser.g:7142:1: ( ( rule__ParameterArrayType__Group_4__0 )? )
            // InternalRosSystemParser.g:7143:2: ( rule__ParameterArrayType__Group_4__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_4()); 
            // InternalRosSystemParser.g:7144:2: ( rule__ParameterArrayType__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Default) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosSystemParser.g:7144:3: rule__ParameterArrayType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterArrayType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__4__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group__5"
    // InternalRosSystemParser.g:7152:1: rule__ParameterArrayType__Group__5 : rule__ParameterArrayType__Group__5__Impl ;
    public final void rule__ParameterArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7156:1: ( rule__ParameterArrayType__Group__5__Impl )
            // InternalRosSystemParser.g:7157:2: rule__ParameterArrayType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__5"


    // $ANTLR start "rule__ParameterArrayType__Group__5__Impl"
    // InternalRosSystemParser.g:7163:1: rule__ParameterArrayType__Group__5__Impl : ( RULE_END ) ;
    public final void rule__ParameterArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7167:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:7168:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:7168:1: ( RULE_END )
            // InternalRosSystemParser.g:7169:2: RULE_END
            {
             before(grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__5__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_4__0"
    // InternalRosSystemParser.g:7179:1: rule__ParameterArrayType__Group_4__0 : rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1 ;
    public final void rule__ParameterArrayType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7183:1: ( rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1 )
            // InternalRosSystemParser.g:7184:2: rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterArrayType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__0"


    // $ANTLR start "rule__ParameterArrayType__Group_4__0__Impl"
    // InternalRosSystemParser.g:7191:1: rule__ParameterArrayType__Group_4__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7195:1: ( ( Default ) )
            // InternalRosSystemParser.g:7196:1: ( Default )
            {
            // InternalRosSystemParser.g:7196:1: ( Default )
            // InternalRosSystemParser.g:7197:2: Default
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_4__1"
    // InternalRosSystemParser.g:7206:1: rule__ParameterArrayType__Group_4__1 : rule__ParameterArrayType__Group_4__1__Impl ;
    public final void rule__ParameterArrayType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7210:1: ( rule__ParameterArrayType__Group_4__1__Impl )
            // InternalRosSystemParser.g:7211:2: rule__ParameterArrayType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__1"


    // $ANTLR start "rule__ParameterArrayType__Group_4__1__Impl"
    // InternalRosSystemParser.g:7217:1: rule__ParameterArrayType__Group_4__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) ) ;
    public final void rule__ParameterArrayType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7221:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:7222:1: ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:7222:1: ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) )
            // InternalRosSystemParser.g:7223:2: ( rule__ParameterArrayType__DefaultAssignment_4_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1()); 
            // InternalRosSystemParser.g:7224:2: ( rule__ParameterArrayType__DefaultAssignment_4_1 )
            // InternalRosSystemParser.g:7224:3: rule__ParameterArrayType__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__DefaultAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalRosSystemParser.g:7233:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7237:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalRosSystemParser.g:7238:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0"


    // $ANTLR start "rule__ParameterList__Group__0__Impl"
    // InternalRosSystemParser.g:7245:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7249:1: ( ( () ) )
            // InternalRosSystemParser.g:7250:1: ( () )
            {
            // InternalRosSystemParser.g:7250:1: ( () )
            // InternalRosSystemParser.g:7251:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 
            // InternalRosSystemParser.g:7252:2: ()
            // InternalRosSystemParser.g:7252:3: 
            {
            }

             after(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__0__Impl"


    // $ANTLR start "rule__ParameterList__Group__1"
    // InternalRosSystemParser.g:7260:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7264:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalRosSystemParser.g:7265:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__ParameterList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1"


    // $ANTLR start "rule__ParameterList__Group__1__Impl"
    // InternalRosSystemParser.g:7272:1: rule__ParameterList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7276:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7277:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7277:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7278:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__2"
    // InternalRosSystemParser.g:7287:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7291:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalRosSystemParser.g:7292:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ParameterList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2"


    // $ANTLR start "rule__ParameterList__Group__2__Impl"
    // InternalRosSystemParser.g:7299:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7303:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalRosSystemParser.g:7304:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalRosSystemParser.g:7304:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalRosSystemParser.g:7305:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2()); 
            // InternalRosSystemParser.g:7306:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalRosSystemParser.g:7306:3: rule__ParameterList__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__2__Impl"


    // $ANTLR start "rule__ParameterList__Group__3"
    // InternalRosSystemParser.g:7314:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7318:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalRosSystemParser.g:7319:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__ParameterList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3"


    // $ANTLR start "rule__ParameterList__Group__3__Impl"
    // InternalRosSystemParser.g:7326:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7330:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalRosSystemParser.g:7331:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalRosSystemParser.g:7331:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalRosSystemParser.g:7332:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3()); 
            // InternalRosSystemParser.g:7333:2: ( rule__ParameterList__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==Comma) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRosSystemParser.g:7333:3: rule__ParameterList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ParameterList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getParameterListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__3__Impl"


    // $ANTLR start "rule__ParameterList__Group__4"
    // InternalRosSystemParser.g:7341:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7345:1: ( rule__ParameterList__Group__4__Impl )
            // InternalRosSystemParser.g:7346:2: rule__ParameterList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4"


    // $ANTLR start "rule__ParameterList__Group__4__Impl"
    // InternalRosSystemParser.g:7352:1: rule__ParameterList__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7356:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7357:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7357:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7358:2: RightSquareBracket
            {
             before(grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group__4__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__0"
    // InternalRosSystemParser.g:7368:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7372:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalRosSystemParser.g:7373:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0"


    // $ANTLR start "rule__ParameterList__Group_3__0__Impl"
    // InternalRosSystemParser.g:7380:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7384:1: ( ( Comma ) )
            // InternalRosSystemParser.g:7385:1: ( Comma )
            {
            // InternalRosSystemParser.g:7385:1: ( Comma )
            // InternalRosSystemParser.g:7386:2: Comma
            {
             before(grammarAccess.getParameterListAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterList__Group_3__1"
    // InternalRosSystemParser.g:7395:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7399:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalRosSystemParser.g:7400:2: rule__ParameterList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1"


    // $ANTLR start "rule__ParameterList__Group_3__1__Impl"
    // InternalRosSystemParser.g:7406:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7410:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:7411:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:7411:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalRosSystemParser.g:7412:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 
            // InternalRosSystemParser.g:7413:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalRosSystemParser.g:7413:3: rule__ParameterList__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterList__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterAny__Group__0"
    // InternalRosSystemParser.g:7422:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7426:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalRosSystemParser.g:7427:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__ParameterAny__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__0"


    // $ANTLR start "rule__ParameterAny__Group__0__Impl"
    // InternalRosSystemParser.g:7434:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7438:1: ( ( () ) )
            // InternalRosSystemParser.g:7439:1: ( () )
            {
            // InternalRosSystemParser.g:7439:1: ( () )
            // InternalRosSystemParser.g:7440:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0()); 
            // InternalRosSystemParser.g:7441:2: ()
            // InternalRosSystemParser.g:7441:3: 
            {
            }

             after(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group__1"
    // InternalRosSystemParser.g:7449:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7453:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalRosSystemParser.g:7454:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__ParameterAny__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__1"


    // $ANTLR start "rule__ParameterAny__Group__1__Impl"
    // InternalRosSystemParser.g:7461:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7465:1: ( ( ParameterAny ) )
            // InternalRosSystemParser.g:7466:1: ( ParameterAny )
            {
            // InternalRosSystemParser.g:7466:1: ( ParameterAny )
            // InternalRosSystemParser.g:7467:2: ParameterAny
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1()); 
            match(input,ParameterAny,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__1__Impl"


    // $ANTLR start "rule__ParameterAny__Group__2"
    // InternalRosSystemParser.g:7476:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7480:1: ( rule__ParameterAny__Group__2__Impl )
            // InternalRosSystemParser.g:7481:2: rule__ParameterAny__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__2"


    // $ANTLR start "rule__ParameterAny__Group__2__Impl"
    // InternalRosSystemParser.g:7487:1: rule__ParameterAny__Group__2__Impl : ( ( rule__ParameterAny__Group_2__0 )? ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7491:1: ( ( ( rule__ParameterAny__Group_2__0 )? ) )
            // InternalRosSystemParser.g:7492:1: ( ( rule__ParameterAny__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:7492:1: ( ( rule__ParameterAny__Group_2__0 )? )
            // InternalRosSystemParser.g:7493:2: ( rule__ParameterAny__Group_2__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_2()); 
            // InternalRosSystemParser.g:7494:2: ( rule__ParameterAny__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Value) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystemParser.g:7494:3: rule__ParameterAny__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterAny__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAnyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__2__Impl"


    // $ANTLR start "rule__ParameterAny__Group_2__0"
    // InternalRosSystemParser.g:7503:1: rule__ParameterAny__Group_2__0 : rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 ;
    public final void rule__ParameterAny__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7507:1: ( rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 )
            // InternalRosSystemParser.g:7508:2: rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__ParameterAny__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__0"


    // $ANTLR start "rule__ParameterAny__Group_2__0__Impl"
    // InternalRosSystemParser.g:7515:1: rule__ParameterAny__Group_2__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7519:1: ( ( Value ) )
            // InternalRosSystemParser.g:7520:1: ( Value )
            {
            // InternalRosSystemParser.g:7520:1: ( Value )
            // InternalRosSystemParser.g:7521:2: Value
            {
             before(grammarAccess.getParameterAnyAccess().getValueKeyword_2_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getValueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group_2__1"
    // InternalRosSystemParser.g:7530:1: rule__ParameterAny__Group_2__1 : rule__ParameterAny__Group_2__1__Impl ;
    public final void rule__ParameterAny__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7534:1: ( rule__ParameterAny__Group_2__1__Impl )
            // InternalRosSystemParser.g:7535:2: rule__ParameterAny__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__1"


    // $ANTLR start "rule__ParameterAny__Group_2__1__Impl"
    // InternalRosSystemParser.g:7541:1: rule__ParameterAny__Group_2__1__Impl : ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterAny__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7545:1: ( ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:7546:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:7546:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            // InternalRosSystemParser.g:7547:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1()); 
            // InternalRosSystemParser.g:7548:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            // InternalRosSystemParser.g:7548:3: rule__ParameterAny__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__0"
    // InternalRosSystemParser.g:7557:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7561:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalRosSystemParser.g:7562:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ParameterStruct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0"


    // $ANTLR start "rule__ParameterStruct__Group__0__Impl"
    // InternalRosSystemParser.g:7569:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7573:1: ( ( () ) )
            // InternalRosSystemParser.g:7574:1: ( () )
            {
            // InternalRosSystemParser.g:7574:1: ( () )
            // InternalRosSystemParser.g:7575:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 
            // InternalRosSystemParser.g:7576:2: ()
            // InternalRosSystemParser.g:7576:3: 
            {
            }

             after(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__1"
    // InternalRosSystemParser.g:7584:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7588:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalRosSystemParser.g:7589:2: rule__ParameterStruct__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1"


    // $ANTLR start "rule__ParameterStruct__Group__1__Impl"
    // InternalRosSystemParser.g:7595:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7599:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalRosSystemParser.g:7600:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalRosSystemParser.g:7600:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalRosSystemParser.g:7601:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1()); 
            // InternalRosSystemParser.g:7602:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LeftSquareBracket) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRosSystemParser.g:7602:3: rule__ParameterStruct__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterStruct__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterStructAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__0"
    // InternalRosSystemParser.g:7611:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7615:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalRosSystemParser.g:7616:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_49);
            rule__ParameterStruct__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0"


    // $ANTLR start "rule__ParameterStruct__Group_1__0__Impl"
    // InternalRosSystemParser.g:7623:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7627:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7628:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7628:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7629:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__1"
    // InternalRosSystemParser.g:7638:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7642:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalRosSystemParser.g:7643:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__ParameterStruct__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1"


    // $ANTLR start "rule__ParameterStruct__Group_1__1__Impl"
    // InternalRosSystemParser.g:7650:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7654:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalRosSystemParser.g:7655:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalRosSystemParser.g:7655:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalRosSystemParser.g:7656:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1()); 
            // InternalRosSystemParser.g:7657:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalRosSystemParser.g:7657:3: rule__ParameterStruct__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__2"
    // InternalRosSystemParser.g:7665:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7669:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalRosSystemParser.g:7670:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_25);
            rule__ParameterStruct__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2"


    // $ANTLR start "rule__ParameterStruct__Group_1__2__Impl"
    // InternalRosSystemParser.g:7677:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7681:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalRosSystemParser.g:7682:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalRosSystemParser.g:7682:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalRosSystemParser.g:7683:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2()); 
            // InternalRosSystemParser.g:7684:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==Comma) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRosSystemParser.g:7684:3: rule__ParameterStruct__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__ParameterStruct__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getParameterStructAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1__3"
    // InternalRosSystemParser.g:7692:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7696:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalRosSystemParser.g:7697:2: rule__ParameterStruct__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3"


    // $ANTLR start "rule__ParameterStruct__Group_1__3__Impl"
    // InternalRosSystemParser.g:7703:1: rule__ParameterStruct__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7707:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7708:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7708:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7709:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1__3__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__0"
    // InternalRosSystemParser.g:7719:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7723:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalRosSystemParser.g:7724:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterStruct__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__0"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__0__Impl"
    // InternalRosSystemParser.g:7731:1: rule__ParameterStruct__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7735:1: ( ( Comma ) )
            // InternalRosSystemParser.g:7736:1: ( Comma )
            {
            // InternalRosSystemParser.g:7736:1: ( Comma )
            // InternalRosSystemParser.g:7737:2: Comma
            {
             before(grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__0__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__1"
    // InternalRosSystemParser.g:7746:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7750:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalRosSystemParser.g:7751:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
            {
            pushFollow(FOLLOW_49);
            rule__ParameterStruct__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__1"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__1__Impl"
    // InternalRosSystemParser.g:7758:1: rule__ParameterStruct__Group_1_2__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7762:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7763:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7763:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7764:2: LeftSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__2"
    // InternalRosSystemParser.g:7773:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7777:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalRosSystemParser.g:7778:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
            {
            pushFollow(FOLLOW_15);
            rule__ParameterStruct__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__2"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__2__Impl"
    // InternalRosSystemParser.g:7785:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7789:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalRosSystemParser.g:7790:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalRosSystemParser.g:7790:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalRosSystemParser.g:7791:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2()); 
            // InternalRosSystemParser.g:7792:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalRosSystemParser.g:7792:3: rule__ParameterStruct__ValueAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__ValueAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__2__Impl"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__3"
    // InternalRosSystemParser.g:7800:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7804:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalRosSystemParser.g:7805:2: rule__ParameterStruct__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStruct__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__3"


    // $ANTLR start "rule__ParameterStruct__Group_1_2__3__Impl"
    // InternalRosSystemParser.g:7811:1: rule__ParameterStruct__Group_1_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7815:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7816:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7816:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7817:2: RightSquareBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__Group_1_2__3__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__0"
    // InternalRosSystemParser.g:7827:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7831:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalRosSystemParser.g:7832:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ParameterStructMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0"


    // $ANTLR start "rule__ParameterStructMember__Group__0__Impl"
    // InternalRosSystemParser.g:7839:1: rule__ParameterStructMember__Group__0__Impl : ( ParameterStructMember ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7843:1: ( ( ParameterStructMember ) )
            // InternalRosSystemParser.g:7844:1: ( ParameterStructMember )
            {
            // InternalRosSystemParser.g:7844:1: ( ParameterStructMember )
            // InternalRosSystemParser.g:7845:2: ParameterStructMember
            {
             before(grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0()); 
            match(input,ParameterStructMember,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__1"
    // InternalRosSystemParser.g:7854:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7858:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalRosSystemParser.g:7859:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ParameterStructMember__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1"


    // $ANTLR start "rule__ParameterStructMember__Group__1__Impl"
    // InternalRosSystemParser.g:7866:1: rule__ParameterStructMember__Group__1__Impl : ( ( rule__ParameterStructMember__NameAssignment_1 ) ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7870:1: ( ( ( rule__ParameterStructMember__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:7871:1: ( ( rule__ParameterStructMember__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:7871:1: ( ( rule__ParameterStructMember__NameAssignment_1 ) )
            // InternalRosSystemParser.g:7872:2: ( rule__ParameterStructMember__NameAssignment_1 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_1()); 
            // InternalRosSystemParser.g:7873:2: ( rule__ParameterStructMember__NameAssignment_1 )
            // InternalRosSystemParser.g:7873:3: rule__ParameterStructMember__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__2"
    // InternalRosSystemParser.g:7881:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7885:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalRosSystemParser.g:7886:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ParameterStructMember__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2"


    // $ANTLR start "rule__ParameterStructMember__Group__2__Impl"
    // InternalRosSystemParser.g:7893:1: rule__ParameterStructMember__Group__2__Impl : ( Colon ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7897:1: ( ( Colon ) )
            // InternalRosSystemParser.g:7898:1: ( Colon )
            {
            // InternalRosSystemParser.g:7898:1: ( Colon )
            // InternalRosSystemParser.g:7899:2: Colon
            {
             before(grammarAccess.getParameterStructMemberAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__2__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__3"
    // InternalRosSystemParser.g:7908:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7912:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalRosSystemParser.g:7913:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ParameterStructMember__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__3"


    // $ANTLR start "rule__ParameterStructMember__Group__3__Impl"
    // InternalRosSystemParser.g:7920:1: rule__ParameterStructMember__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7924:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:7925:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:7925:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:7926:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__3__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__4"
    // InternalRosSystemParser.g:7935:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl rule__ParameterStructMember__Group__5 ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7939:1: ( rule__ParameterStructMember__Group__4__Impl rule__ParameterStructMember__Group__5 )
            // InternalRosSystemParser.g:7940:2: rule__ParameterStructMember__Group__4__Impl rule__ParameterStructMember__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ParameterStructMember__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__4"


    // $ANTLR start "rule__ParameterStructMember__Group__4__Impl"
    // InternalRosSystemParser.g:7947:1: rule__ParameterStructMember__Group__4__Impl : ( ( rule__ParameterStructMember__ValueAssignment_4 ) ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7951:1: ( ( ( rule__ParameterStructMember__ValueAssignment_4 ) ) )
            // InternalRosSystemParser.g:7952:1: ( ( rule__ParameterStructMember__ValueAssignment_4 ) )
            {
            // InternalRosSystemParser.g:7952:1: ( ( rule__ParameterStructMember__ValueAssignment_4 ) )
            // InternalRosSystemParser.g:7953:2: ( rule__ParameterStructMember__ValueAssignment_4 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_4()); 
            // InternalRosSystemParser.g:7954:2: ( rule__ParameterStructMember__ValueAssignment_4 )
            // InternalRosSystemParser.g:7954:3: rule__ParameterStructMember__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__4__Impl"


    // $ANTLR start "rule__ParameterStructMember__Group__5"
    // InternalRosSystemParser.g:7962:1: rule__ParameterStructMember__Group__5 : rule__ParameterStructMember__Group__5__Impl ;
    public final void rule__ParameterStructMember__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7966:1: ( rule__ParameterStructMember__Group__5__Impl )
            // InternalRosSystemParser.g:7967:2: rule__ParameterStructMember__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__5"


    // $ANTLR start "rule__ParameterStructMember__Group__5__Impl"
    // InternalRosSystemParser.g:7973:1: rule__ParameterStructMember__Group__5__Impl : ( RULE_END ) ;
    public final void rule__ParameterStructMember__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7977:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:7978:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:7978:1: ( RULE_END )
            // InternalRosSystemParser.g:7979:2: RULE_END
            {
             before(grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__Group__5__Impl"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0"
    // InternalRosSystemParser.g:7989:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:7993:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalRosSystemParser.g:7994:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ParameterStructTypeMember__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__0"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0__Impl"
    // InternalRosSystemParser.g:8001:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8005:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:8006:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:8006:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:8007:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:8008:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalRosSystemParser.g:8008:3: rule__ParameterStructTypeMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__1"
    // InternalRosSystemParser.g:8016:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8020:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalRosSystemParser.g:8021:2: rule__ParameterStructTypeMember__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__1"


    // $ANTLR start "rule__ParameterStructTypeMember__Group__1__Impl"
    // InternalRosSystemParser.g:8027:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8031:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalRosSystemParser.g:8032:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalRosSystemParser.g:8032:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalRosSystemParser.g:8033:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1()); 
            // InternalRosSystemParser.g:8034:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalRosSystemParser.g:8034:3: rule__ParameterStructTypeMember__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructTypeMember__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__Group__1__Impl"


    // $ANTLR start "rule__Bool__Group__0"
    // InternalRosSystemParser.g:8043:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8047:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalRosSystemParser.g:8048:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Bool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0"


    // $ANTLR start "rule__Bool__Group__0__Impl"
    // InternalRosSystemParser.g:8055:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8059:1: ( ( () ) )
            // InternalRosSystemParser.g:8060:1: ( () )
            {
            // InternalRosSystemParser.g:8060:1: ( () )
            // InternalRosSystemParser.g:8061:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalRosSystemParser.g:8062:2: ()
            // InternalRosSystemParser.g:8062:3: 
            {
            }

             after(grammarAccess.getBoolAccess().getBoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0__Impl"


    // $ANTLR start "rule__Bool__Group__1"
    // InternalRosSystemParser.g:8070:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8074:1: ( rule__Bool__Group__1__Impl )
            // InternalRosSystemParser.g:8075:2: rule__Bool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1"


    // $ANTLR start "rule__Bool__Group__1__Impl"
    // InternalRosSystemParser.g:8081:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8085:1: ( ( Bool ) )
            // InternalRosSystemParser.g:8086:1: ( Bool )
            {
            // InternalRosSystemParser.g:8086:1: ( Bool )
            // InternalRosSystemParser.g:8087:2: Bool
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword_1()); 
            match(input,Bool,FOLLOW_2); 
             after(grammarAccess.getBoolAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1__Impl"


    // $ANTLR start "rule__Int8__Group__0"
    // InternalRosSystemParser.g:8097:1: rule__Int8__Group__0 : rule__Int8__Group__0__Impl rule__Int8__Group__1 ;
    public final void rule__Int8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8101:1: ( rule__Int8__Group__0__Impl rule__Int8__Group__1 )
            // InternalRosSystemParser.g:8102:2: rule__Int8__Group__0__Impl rule__Int8__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Int8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__0"


    // $ANTLR start "rule__Int8__Group__0__Impl"
    // InternalRosSystemParser.g:8109:1: rule__Int8__Group__0__Impl : ( () ) ;
    public final void rule__Int8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8113:1: ( ( () ) )
            // InternalRosSystemParser.g:8114:1: ( () )
            {
            // InternalRosSystemParser.g:8114:1: ( () )
            // InternalRosSystemParser.g:8115:2: ()
            {
             before(grammarAccess.getInt8Access().getInt8Action_0()); 
            // InternalRosSystemParser.g:8116:2: ()
            // InternalRosSystemParser.g:8116:3: 
            {
            }

             after(grammarAccess.getInt8Access().getInt8Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__0__Impl"


    // $ANTLR start "rule__Int8__Group__1"
    // InternalRosSystemParser.g:8124:1: rule__Int8__Group__1 : rule__Int8__Group__1__Impl ;
    public final void rule__Int8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8128:1: ( rule__Int8__Group__1__Impl )
            // InternalRosSystemParser.g:8129:2: rule__Int8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__1"


    // $ANTLR start "rule__Int8__Group__1__Impl"
    // InternalRosSystemParser.g:8135:1: rule__Int8__Group__1__Impl : ( Int8 ) ;
    public final void rule__Int8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8139:1: ( ( Int8 ) )
            // InternalRosSystemParser.g:8140:1: ( Int8 )
            {
            // InternalRosSystemParser.g:8140:1: ( Int8 )
            // InternalRosSystemParser.g:8141:2: Int8
            {
             before(grammarAccess.getInt8Access().getInt8Keyword_1()); 
            match(input,Int8,FOLLOW_2); 
             after(grammarAccess.getInt8Access().getInt8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8__Group__1__Impl"


    // $ANTLR start "rule__Uint8__Group__0"
    // InternalRosSystemParser.g:8151:1: rule__Uint8__Group__0 : rule__Uint8__Group__0__Impl rule__Uint8__Group__1 ;
    public final void rule__Uint8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8155:1: ( rule__Uint8__Group__0__Impl rule__Uint8__Group__1 )
            // InternalRosSystemParser.g:8156:2: rule__Uint8__Group__0__Impl rule__Uint8__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Uint8__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint8__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__0"


    // $ANTLR start "rule__Uint8__Group__0__Impl"
    // InternalRosSystemParser.g:8163:1: rule__Uint8__Group__0__Impl : ( () ) ;
    public final void rule__Uint8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8167:1: ( ( () ) )
            // InternalRosSystemParser.g:8168:1: ( () )
            {
            // InternalRosSystemParser.g:8168:1: ( () )
            // InternalRosSystemParser.g:8169:2: ()
            {
             before(grammarAccess.getUint8Access().getUint8Action_0()); 
            // InternalRosSystemParser.g:8170:2: ()
            // InternalRosSystemParser.g:8170:3: 
            {
            }

             after(grammarAccess.getUint8Access().getUint8Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__0__Impl"


    // $ANTLR start "rule__Uint8__Group__1"
    // InternalRosSystemParser.g:8178:1: rule__Uint8__Group__1 : rule__Uint8__Group__1__Impl ;
    public final void rule__Uint8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8182:1: ( rule__Uint8__Group__1__Impl )
            // InternalRosSystemParser.g:8183:2: rule__Uint8__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint8__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__1"


    // $ANTLR start "rule__Uint8__Group__1__Impl"
    // InternalRosSystemParser.g:8189:1: rule__Uint8__Group__1__Impl : ( Uint8 ) ;
    public final void rule__Uint8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8193:1: ( ( Uint8 ) )
            // InternalRosSystemParser.g:8194:1: ( Uint8 )
            {
            // InternalRosSystemParser.g:8194:1: ( Uint8 )
            // InternalRosSystemParser.g:8195:2: Uint8
            {
             before(grammarAccess.getUint8Access().getUint8Keyword_1()); 
            match(input,Uint8,FOLLOW_2); 
             after(grammarAccess.getUint8Access().getUint8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8__Group__1__Impl"


    // $ANTLR start "rule__Int16__Group__0"
    // InternalRosSystemParser.g:8205:1: rule__Int16__Group__0 : rule__Int16__Group__0__Impl rule__Int16__Group__1 ;
    public final void rule__Int16__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8209:1: ( rule__Int16__Group__0__Impl rule__Int16__Group__1 )
            // InternalRosSystemParser.g:8210:2: rule__Int16__Group__0__Impl rule__Int16__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__Int16__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int16__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__0"


    // $ANTLR start "rule__Int16__Group__0__Impl"
    // InternalRosSystemParser.g:8217:1: rule__Int16__Group__0__Impl : ( () ) ;
    public final void rule__Int16__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8221:1: ( ( () ) )
            // InternalRosSystemParser.g:8222:1: ( () )
            {
            // InternalRosSystemParser.g:8222:1: ( () )
            // InternalRosSystemParser.g:8223:2: ()
            {
             before(grammarAccess.getInt16Access().getInt16Action_0()); 
            // InternalRosSystemParser.g:8224:2: ()
            // InternalRosSystemParser.g:8224:3: 
            {
            }

             after(grammarAccess.getInt16Access().getInt16Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__0__Impl"


    // $ANTLR start "rule__Int16__Group__1"
    // InternalRosSystemParser.g:8232:1: rule__Int16__Group__1 : rule__Int16__Group__1__Impl ;
    public final void rule__Int16__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8236:1: ( rule__Int16__Group__1__Impl )
            // InternalRosSystemParser.g:8237:2: rule__Int16__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int16__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__1"


    // $ANTLR start "rule__Int16__Group__1__Impl"
    // InternalRosSystemParser.g:8243:1: rule__Int16__Group__1__Impl : ( Int16 ) ;
    public final void rule__Int16__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8247:1: ( ( Int16 ) )
            // InternalRosSystemParser.g:8248:1: ( Int16 )
            {
            // InternalRosSystemParser.g:8248:1: ( Int16 )
            // InternalRosSystemParser.g:8249:2: Int16
            {
             before(grammarAccess.getInt16Access().getInt16Keyword_1()); 
            match(input,Int16,FOLLOW_2); 
             after(grammarAccess.getInt16Access().getInt16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16__Group__1__Impl"


    // $ANTLR start "rule__Uint16__Group__0"
    // InternalRosSystemParser.g:8259:1: rule__Uint16__Group__0 : rule__Uint16__Group__0__Impl rule__Uint16__Group__1 ;
    public final void rule__Uint16__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8263:1: ( rule__Uint16__Group__0__Impl rule__Uint16__Group__1 )
            // InternalRosSystemParser.g:8264:2: rule__Uint16__Group__0__Impl rule__Uint16__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__Uint16__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint16__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__0"


    // $ANTLR start "rule__Uint16__Group__0__Impl"
    // InternalRosSystemParser.g:8271:1: rule__Uint16__Group__0__Impl : ( () ) ;
    public final void rule__Uint16__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8275:1: ( ( () ) )
            // InternalRosSystemParser.g:8276:1: ( () )
            {
            // InternalRosSystemParser.g:8276:1: ( () )
            // InternalRosSystemParser.g:8277:2: ()
            {
             before(grammarAccess.getUint16Access().getUint16Action_0()); 
            // InternalRosSystemParser.g:8278:2: ()
            // InternalRosSystemParser.g:8278:3: 
            {
            }

             after(grammarAccess.getUint16Access().getUint16Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__0__Impl"


    // $ANTLR start "rule__Uint16__Group__1"
    // InternalRosSystemParser.g:8286:1: rule__Uint16__Group__1 : rule__Uint16__Group__1__Impl ;
    public final void rule__Uint16__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8290:1: ( rule__Uint16__Group__1__Impl )
            // InternalRosSystemParser.g:8291:2: rule__Uint16__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint16__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__1"


    // $ANTLR start "rule__Uint16__Group__1__Impl"
    // InternalRosSystemParser.g:8297:1: rule__Uint16__Group__1__Impl : ( Uint16 ) ;
    public final void rule__Uint16__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8301:1: ( ( Uint16 ) )
            // InternalRosSystemParser.g:8302:1: ( Uint16 )
            {
            // InternalRosSystemParser.g:8302:1: ( Uint16 )
            // InternalRosSystemParser.g:8303:2: Uint16
            {
             before(grammarAccess.getUint16Access().getUint16Keyword_1()); 
            match(input,Uint16,FOLLOW_2); 
             after(grammarAccess.getUint16Access().getUint16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16__Group__1__Impl"


    // $ANTLR start "rule__Int32__Group__0"
    // InternalRosSystemParser.g:8313:1: rule__Int32__Group__0 : rule__Int32__Group__0__Impl rule__Int32__Group__1 ;
    public final void rule__Int32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8317:1: ( rule__Int32__Group__0__Impl rule__Int32__Group__1 )
            // InternalRosSystemParser.g:8318:2: rule__Int32__Group__0__Impl rule__Int32__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__Int32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__0"


    // $ANTLR start "rule__Int32__Group__0__Impl"
    // InternalRosSystemParser.g:8325:1: rule__Int32__Group__0__Impl : ( () ) ;
    public final void rule__Int32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8329:1: ( ( () ) )
            // InternalRosSystemParser.g:8330:1: ( () )
            {
            // InternalRosSystemParser.g:8330:1: ( () )
            // InternalRosSystemParser.g:8331:2: ()
            {
             before(grammarAccess.getInt32Access().getInt32Action_0()); 
            // InternalRosSystemParser.g:8332:2: ()
            // InternalRosSystemParser.g:8332:3: 
            {
            }

             after(grammarAccess.getInt32Access().getInt32Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__0__Impl"


    // $ANTLR start "rule__Int32__Group__1"
    // InternalRosSystemParser.g:8340:1: rule__Int32__Group__1 : rule__Int32__Group__1__Impl ;
    public final void rule__Int32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8344:1: ( rule__Int32__Group__1__Impl )
            // InternalRosSystemParser.g:8345:2: rule__Int32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__1"


    // $ANTLR start "rule__Int32__Group__1__Impl"
    // InternalRosSystemParser.g:8351:1: rule__Int32__Group__1__Impl : ( Int32 ) ;
    public final void rule__Int32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8355:1: ( ( Int32 ) )
            // InternalRosSystemParser.g:8356:1: ( Int32 )
            {
            // InternalRosSystemParser.g:8356:1: ( Int32 )
            // InternalRosSystemParser.g:8357:2: Int32
            {
             before(grammarAccess.getInt32Access().getInt32Keyword_1()); 
            match(input,Int32,FOLLOW_2); 
             after(grammarAccess.getInt32Access().getInt32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32__Group__1__Impl"


    // $ANTLR start "rule__Uint32__Group__0"
    // InternalRosSystemParser.g:8367:1: rule__Uint32__Group__0 : rule__Uint32__Group__0__Impl rule__Uint32__Group__1 ;
    public final void rule__Uint32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8371:1: ( rule__Uint32__Group__0__Impl rule__Uint32__Group__1 )
            // InternalRosSystemParser.g:8372:2: rule__Uint32__Group__0__Impl rule__Uint32__Group__1
            {
            pushFollow(FOLLOW_56);
            rule__Uint32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__0"


    // $ANTLR start "rule__Uint32__Group__0__Impl"
    // InternalRosSystemParser.g:8379:1: rule__Uint32__Group__0__Impl : ( () ) ;
    public final void rule__Uint32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8383:1: ( ( () ) )
            // InternalRosSystemParser.g:8384:1: ( () )
            {
            // InternalRosSystemParser.g:8384:1: ( () )
            // InternalRosSystemParser.g:8385:2: ()
            {
             before(grammarAccess.getUint32Access().getUint32Action_0()); 
            // InternalRosSystemParser.g:8386:2: ()
            // InternalRosSystemParser.g:8386:3: 
            {
            }

             after(grammarAccess.getUint32Access().getUint32Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__0__Impl"


    // $ANTLR start "rule__Uint32__Group__1"
    // InternalRosSystemParser.g:8394:1: rule__Uint32__Group__1 : rule__Uint32__Group__1__Impl ;
    public final void rule__Uint32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8398:1: ( rule__Uint32__Group__1__Impl )
            // InternalRosSystemParser.g:8399:2: rule__Uint32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__1"


    // $ANTLR start "rule__Uint32__Group__1__Impl"
    // InternalRosSystemParser.g:8405:1: rule__Uint32__Group__1__Impl : ( Uint32 ) ;
    public final void rule__Uint32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8409:1: ( ( Uint32 ) )
            // InternalRosSystemParser.g:8410:1: ( Uint32 )
            {
            // InternalRosSystemParser.g:8410:1: ( Uint32 )
            // InternalRosSystemParser.g:8411:2: Uint32
            {
             before(grammarAccess.getUint32Access().getUint32Keyword_1()); 
            match(input,Uint32,FOLLOW_2); 
             after(grammarAccess.getUint32Access().getUint32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32__Group__1__Impl"


    // $ANTLR start "rule__Int64__Group__0"
    // InternalRosSystemParser.g:8421:1: rule__Int64__Group__0 : rule__Int64__Group__0__Impl rule__Int64__Group__1 ;
    public final void rule__Int64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8425:1: ( rule__Int64__Group__0__Impl rule__Int64__Group__1 )
            // InternalRosSystemParser.g:8426:2: rule__Int64__Group__0__Impl rule__Int64__Group__1
            {
            pushFollow(FOLLOW_57);
            rule__Int64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__0"


    // $ANTLR start "rule__Int64__Group__0__Impl"
    // InternalRosSystemParser.g:8433:1: rule__Int64__Group__0__Impl : ( () ) ;
    public final void rule__Int64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8437:1: ( ( () ) )
            // InternalRosSystemParser.g:8438:1: ( () )
            {
            // InternalRosSystemParser.g:8438:1: ( () )
            // InternalRosSystemParser.g:8439:2: ()
            {
             before(grammarAccess.getInt64Access().getInt64Action_0()); 
            // InternalRosSystemParser.g:8440:2: ()
            // InternalRosSystemParser.g:8440:3: 
            {
            }

             after(grammarAccess.getInt64Access().getInt64Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__0__Impl"


    // $ANTLR start "rule__Int64__Group__1"
    // InternalRosSystemParser.g:8448:1: rule__Int64__Group__1 : rule__Int64__Group__1__Impl ;
    public final void rule__Int64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8452:1: ( rule__Int64__Group__1__Impl )
            // InternalRosSystemParser.g:8453:2: rule__Int64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__1"


    // $ANTLR start "rule__Int64__Group__1__Impl"
    // InternalRosSystemParser.g:8459:1: rule__Int64__Group__1__Impl : ( Int64 ) ;
    public final void rule__Int64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8463:1: ( ( Int64 ) )
            // InternalRosSystemParser.g:8464:1: ( Int64 )
            {
            // InternalRosSystemParser.g:8464:1: ( Int64 )
            // InternalRosSystemParser.g:8465:2: Int64
            {
             before(grammarAccess.getInt64Access().getInt64Keyword_1()); 
            match(input,Int64,FOLLOW_2); 
             after(grammarAccess.getInt64Access().getInt64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64__Group__1__Impl"


    // $ANTLR start "rule__Uint64__Group__0"
    // InternalRosSystemParser.g:8475:1: rule__Uint64__Group__0 : rule__Uint64__Group__0__Impl rule__Uint64__Group__1 ;
    public final void rule__Uint64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8479:1: ( rule__Uint64__Group__0__Impl rule__Uint64__Group__1 )
            // InternalRosSystemParser.g:8480:2: rule__Uint64__Group__0__Impl rule__Uint64__Group__1
            {
            pushFollow(FOLLOW_58);
            rule__Uint64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__0"


    // $ANTLR start "rule__Uint64__Group__0__Impl"
    // InternalRosSystemParser.g:8487:1: rule__Uint64__Group__0__Impl : ( () ) ;
    public final void rule__Uint64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8491:1: ( ( () ) )
            // InternalRosSystemParser.g:8492:1: ( () )
            {
            // InternalRosSystemParser.g:8492:1: ( () )
            // InternalRosSystemParser.g:8493:2: ()
            {
             before(grammarAccess.getUint64Access().getUint64Action_0()); 
            // InternalRosSystemParser.g:8494:2: ()
            // InternalRosSystemParser.g:8494:3: 
            {
            }

             after(grammarAccess.getUint64Access().getUint64Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__0__Impl"


    // $ANTLR start "rule__Uint64__Group__1"
    // InternalRosSystemParser.g:8502:1: rule__Uint64__Group__1 : rule__Uint64__Group__1__Impl ;
    public final void rule__Uint64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8506:1: ( rule__Uint64__Group__1__Impl )
            // InternalRosSystemParser.g:8507:2: rule__Uint64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__1"


    // $ANTLR start "rule__Uint64__Group__1__Impl"
    // InternalRosSystemParser.g:8513:1: rule__Uint64__Group__1__Impl : ( Uint64 ) ;
    public final void rule__Uint64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8517:1: ( ( Uint64 ) )
            // InternalRosSystemParser.g:8518:1: ( Uint64 )
            {
            // InternalRosSystemParser.g:8518:1: ( Uint64 )
            // InternalRosSystemParser.g:8519:2: Uint64
            {
             before(grammarAccess.getUint64Access().getUint64Keyword_1()); 
            match(input,Uint64,FOLLOW_2); 
             after(grammarAccess.getUint64Access().getUint64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64__Group__1__Impl"


    // $ANTLR start "rule__Float32__Group__0"
    // InternalRosSystemParser.g:8529:1: rule__Float32__Group__0 : rule__Float32__Group__0__Impl rule__Float32__Group__1 ;
    public final void rule__Float32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8533:1: ( rule__Float32__Group__0__Impl rule__Float32__Group__1 )
            // InternalRosSystemParser.g:8534:2: rule__Float32__Group__0__Impl rule__Float32__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__Float32__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float32__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__0"


    // $ANTLR start "rule__Float32__Group__0__Impl"
    // InternalRosSystemParser.g:8541:1: rule__Float32__Group__0__Impl : ( () ) ;
    public final void rule__Float32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8545:1: ( ( () ) )
            // InternalRosSystemParser.g:8546:1: ( () )
            {
            // InternalRosSystemParser.g:8546:1: ( () )
            // InternalRosSystemParser.g:8547:2: ()
            {
             before(grammarAccess.getFloat32Access().getFloat32Action_0()); 
            // InternalRosSystemParser.g:8548:2: ()
            // InternalRosSystemParser.g:8548:3: 
            {
            }

             after(grammarAccess.getFloat32Access().getFloat32Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__0__Impl"


    // $ANTLR start "rule__Float32__Group__1"
    // InternalRosSystemParser.g:8556:1: rule__Float32__Group__1 : rule__Float32__Group__1__Impl ;
    public final void rule__Float32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8560:1: ( rule__Float32__Group__1__Impl )
            // InternalRosSystemParser.g:8561:2: rule__Float32__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float32__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__1"


    // $ANTLR start "rule__Float32__Group__1__Impl"
    // InternalRosSystemParser.g:8567:1: rule__Float32__Group__1__Impl : ( Float32 ) ;
    public final void rule__Float32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8571:1: ( ( Float32 ) )
            // InternalRosSystemParser.g:8572:1: ( Float32 )
            {
            // InternalRosSystemParser.g:8572:1: ( Float32 )
            // InternalRosSystemParser.g:8573:2: Float32
            {
             before(grammarAccess.getFloat32Access().getFloat32Keyword_1()); 
            match(input,Float32,FOLLOW_2); 
             after(grammarAccess.getFloat32Access().getFloat32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32__Group__1__Impl"


    // $ANTLR start "rule__Float64__Group__0"
    // InternalRosSystemParser.g:8583:1: rule__Float64__Group__0 : rule__Float64__Group__0__Impl rule__Float64__Group__1 ;
    public final void rule__Float64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8587:1: ( rule__Float64__Group__0__Impl rule__Float64__Group__1 )
            // InternalRosSystemParser.g:8588:2: rule__Float64__Group__0__Impl rule__Float64__Group__1
            {
            pushFollow(FOLLOW_60);
            rule__Float64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__0"


    // $ANTLR start "rule__Float64__Group__0__Impl"
    // InternalRosSystemParser.g:8595:1: rule__Float64__Group__0__Impl : ( () ) ;
    public final void rule__Float64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8599:1: ( ( () ) )
            // InternalRosSystemParser.g:8600:1: ( () )
            {
            // InternalRosSystemParser.g:8600:1: ( () )
            // InternalRosSystemParser.g:8601:2: ()
            {
             before(grammarAccess.getFloat64Access().getFloat64Action_0()); 
            // InternalRosSystemParser.g:8602:2: ()
            // InternalRosSystemParser.g:8602:3: 
            {
            }

             after(grammarAccess.getFloat64Access().getFloat64Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__0__Impl"


    // $ANTLR start "rule__Float64__Group__1"
    // InternalRosSystemParser.g:8610:1: rule__Float64__Group__1 : rule__Float64__Group__1__Impl ;
    public final void rule__Float64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8614:1: ( rule__Float64__Group__1__Impl )
            // InternalRosSystemParser.g:8615:2: rule__Float64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__1"


    // $ANTLR start "rule__Float64__Group__1__Impl"
    // InternalRosSystemParser.g:8621:1: rule__Float64__Group__1__Impl : ( Float64 ) ;
    public final void rule__Float64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8625:1: ( ( Float64 ) )
            // InternalRosSystemParser.g:8626:1: ( Float64 )
            {
            // InternalRosSystemParser.g:8626:1: ( Float64 )
            // InternalRosSystemParser.g:8627:2: Float64
            {
             before(grammarAccess.getFloat64Access().getFloat64Keyword_1()); 
            match(input,Float64,FOLLOW_2); 
             after(grammarAccess.getFloat64Access().getFloat64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalRosSystemParser.g:8637:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8641:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalRosSystemParser.g:8642:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_61);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalRosSystemParser.g:8649:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8653:1: ( ( () ) )
            // InternalRosSystemParser.g:8654:1: ( () )
            {
            // InternalRosSystemParser.g:8654:1: ( () )
            // InternalRosSystemParser.g:8655:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalRosSystemParser.g:8656:2: ()
            // InternalRosSystemParser.g:8656:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalRosSystemParser.g:8664:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8668:1: ( rule__String0__Group__1__Impl )
            // InternalRosSystemParser.g:8669:2: rule__String0__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalRosSystemParser.g:8675:1: rule__String0__Group__1__Impl : ( String_1 ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8679:1: ( ( String_1 ) )
            // InternalRosSystemParser.g:8680:1: ( String_1 )
            {
            // InternalRosSystemParser.g:8680:1: ( String_1 )
            // InternalRosSystemParser.g:8681:2: String_1
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,String_1,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__Byte__Group__0"
    // InternalRosSystemParser.g:8691:1: rule__Byte__Group__0 : rule__Byte__Group__0__Impl rule__Byte__Group__1 ;
    public final void rule__Byte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8695:1: ( rule__Byte__Group__0__Impl rule__Byte__Group__1 )
            // InternalRosSystemParser.g:8696:2: rule__Byte__Group__0__Impl rule__Byte__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__Byte__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Byte__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__0"


    // $ANTLR start "rule__Byte__Group__0__Impl"
    // InternalRosSystemParser.g:8703:1: rule__Byte__Group__0__Impl : ( () ) ;
    public final void rule__Byte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8707:1: ( ( () ) )
            // InternalRosSystemParser.g:8708:1: ( () )
            {
            // InternalRosSystemParser.g:8708:1: ( () )
            // InternalRosSystemParser.g:8709:2: ()
            {
             before(grammarAccess.getByteAccess().getByteAction_0()); 
            // InternalRosSystemParser.g:8710:2: ()
            // InternalRosSystemParser.g:8710:3: 
            {
            }

             after(grammarAccess.getByteAccess().getByteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__0__Impl"


    // $ANTLR start "rule__Byte__Group__1"
    // InternalRosSystemParser.g:8718:1: rule__Byte__Group__1 : rule__Byte__Group__1__Impl ;
    public final void rule__Byte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8722:1: ( rule__Byte__Group__1__Impl )
            // InternalRosSystemParser.g:8723:2: rule__Byte__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Byte__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__1"


    // $ANTLR start "rule__Byte__Group__1__Impl"
    // InternalRosSystemParser.g:8729:1: rule__Byte__Group__1__Impl : ( Byte ) ;
    public final void rule__Byte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8733:1: ( ( Byte ) )
            // InternalRosSystemParser.g:8734:1: ( Byte )
            {
            // InternalRosSystemParser.g:8734:1: ( Byte )
            // InternalRosSystemParser.g:8735:2: Byte
            {
             before(grammarAccess.getByteAccess().getByteKeyword_1()); 
            match(input,Byte,FOLLOW_2); 
             after(grammarAccess.getByteAccess().getByteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Byte__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalRosSystemParser.g:8745:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8749:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalRosSystemParser.g:8750:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_63);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalRosSystemParser.g:8757:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8761:1: ( ( () ) )
            // InternalRosSystemParser.g:8762:1: ( () )
            {
            // InternalRosSystemParser.g:8762:1: ( () )
            // InternalRosSystemParser.g:8763:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0()); 
            // InternalRosSystemParser.g:8764:2: ()
            // InternalRosSystemParser.g:8764:3: 
            {
            }

             after(grammarAccess.getTimeAccess().getTimeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalRosSystemParser.g:8772:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8776:1: ( rule__Time__Group__1__Impl )
            // InternalRosSystemParser.g:8777:2: rule__Time__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalRosSystemParser.g:8783:1: rule__Time__Group__1__Impl : ( Time ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8787:1: ( ( Time ) )
            // InternalRosSystemParser.g:8788:1: ( Time )
            {
            // InternalRosSystemParser.g:8788:1: ( Time )
            // InternalRosSystemParser.g:8789:2: Time
            {
             before(grammarAccess.getTimeAccess().getTimeKeyword_1()); 
            match(input,Time,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Duration__Group__0"
    // InternalRosSystemParser.g:8799:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8803:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalRosSystemParser.g:8804:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__Duration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Duration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0"


    // $ANTLR start "rule__Duration__Group__0__Impl"
    // InternalRosSystemParser.g:8811:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8815:1: ( ( () ) )
            // InternalRosSystemParser.g:8816:1: ( () )
            {
            // InternalRosSystemParser.g:8816:1: ( () )
            // InternalRosSystemParser.g:8817:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalRosSystemParser.g:8818:2: ()
            // InternalRosSystemParser.g:8818:3: 
            {
            }

             after(grammarAccess.getDurationAccess().getDurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__0__Impl"


    // $ANTLR start "rule__Duration__Group__1"
    // InternalRosSystemParser.g:8826:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8830:1: ( rule__Duration__Group__1__Impl )
            // InternalRosSystemParser.g:8831:2: rule__Duration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1"


    // $ANTLR start "rule__Duration__Group__1__Impl"
    // InternalRosSystemParser.g:8837:1: rule__Duration__Group__1__Impl : ( Duration ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8841:1: ( ( Duration ) )
            // InternalRosSystemParser.g:8842:1: ( Duration )
            {
            // InternalRosSystemParser.g:8842:1: ( Duration )
            // InternalRosSystemParser.g:8843:2: Duration
            {
             before(grammarAccess.getDurationAccess().getDurationKeyword_1()); 
            match(input,Duration,FOLLOW_2); 
             after(grammarAccess.getDurationAccess().getDurationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Group__1__Impl"


    // $ANTLR start "rule__BoolArray__Group__0"
    // InternalRosSystemParser.g:8853:1: rule__BoolArray__Group__0 : rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 ;
    public final void rule__BoolArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8857:1: ( rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 )
            // InternalRosSystemParser.g:8858:2: rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__BoolArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__0"


    // $ANTLR start "rule__BoolArray__Group__0__Impl"
    // InternalRosSystemParser.g:8865:1: rule__BoolArray__Group__0__Impl : ( () ) ;
    public final void rule__BoolArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8869:1: ( ( () ) )
            // InternalRosSystemParser.g:8870:1: ( () )
            {
            // InternalRosSystemParser.g:8870:1: ( () )
            // InternalRosSystemParser.g:8871:2: ()
            {
             before(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0()); 
            // InternalRosSystemParser.g:8872:2: ()
            // InternalRosSystemParser.g:8872:3: 
            {
            }

             after(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__0__Impl"


    // $ANTLR start "rule__BoolArray__Group__1"
    // InternalRosSystemParser.g:8880:1: rule__BoolArray__Group__1 : rule__BoolArray__Group__1__Impl ;
    public final void rule__BoolArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8884:1: ( rule__BoolArray__Group__1__Impl )
            // InternalRosSystemParser.g:8885:2: rule__BoolArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__1"


    // $ANTLR start "rule__BoolArray__Group__1__Impl"
    // InternalRosSystemParser.g:8891:1: rule__BoolArray__Group__1__Impl : ( Bool_1 ) ;
    public final void rule__BoolArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8895:1: ( ( Bool_1 ) )
            // InternalRosSystemParser.g:8896:1: ( Bool_1 )
            {
            // InternalRosSystemParser.g:8896:1: ( Bool_1 )
            // InternalRosSystemParser.g:8897:2: Bool_1
            {
             before(grammarAccess.getBoolArrayAccess().getBoolKeyword_1()); 
            match(input,Bool_1,FOLLOW_2); 
             after(grammarAccess.getBoolArrayAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolArray__Group__1__Impl"


    // $ANTLR start "rule__Int8Array__Group__0"
    // InternalRosSystemParser.g:8907:1: rule__Int8Array__Group__0 : rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 ;
    public final void rule__Int8Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8911:1: ( rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 )
            // InternalRosSystemParser.g:8912:2: rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1
            {
            pushFollow(FOLLOW_66);
            rule__Int8Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__0"


    // $ANTLR start "rule__Int8Array__Group__0__Impl"
    // InternalRosSystemParser.g:8919:1: rule__Int8Array__Group__0__Impl : ( () ) ;
    public final void rule__Int8Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8923:1: ( ( () ) )
            // InternalRosSystemParser.g:8924:1: ( () )
            {
            // InternalRosSystemParser.g:8924:1: ( () )
            // InternalRosSystemParser.g:8925:2: ()
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0()); 
            // InternalRosSystemParser.g:8926:2: ()
            // InternalRosSystemParser.g:8926:3: 
            {
            }

             after(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__0__Impl"


    // $ANTLR start "rule__Int8Array__Group__1"
    // InternalRosSystemParser.g:8934:1: rule__Int8Array__Group__1 : rule__Int8Array__Group__1__Impl ;
    public final void rule__Int8Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8938:1: ( rule__Int8Array__Group__1__Impl )
            // InternalRosSystemParser.g:8939:2: rule__Int8Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int8Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__1"


    // $ANTLR start "rule__Int8Array__Group__1__Impl"
    // InternalRosSystemParser.g:8945:1: rule__Int8Array__Group__1__Impl : ( Int8_1 ) ;
    public final void rule__Int8Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8949:1: ( ( Int8_1 ) )
            // InternalRosSystemParser.g:8950:1: ( Int8_1 )
            {
            // InternalRosSystemParser.g:8950:1: ( Int8_1 )
            // InternalRosSystemParser.g:8951:2: Int8_1
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8Keyword_1()); 
            match(input,Int8_1,FOLLOW_2); 
             after(grammarAccess.getInt8ArrayAccess().getInt8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int8Array__Group__1__Impl"


    // $ANTLR start "rule__Uint8Array__Group__0"
    // InternalRosSystemParser.g:8961:1: rule__Uint8Array__Group__0 : rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 ;
    public final void rule__Uint8Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8965:1: ( rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 )
            // InternalRosSystemParser.g:8966:2: rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1
            {
            pushFollow(FOLLOW_67);
            rule__Uint8Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__0"


    // $ANTLR start "rule__Uint8Array__Group__0__Impl"
    // InternalRosSystemParser.g:8973:1: rule__Uint8Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint8Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8977:1: ( ( () ) )
            // InternalRosSystemParser.g:8978:1: ( () )
            {
            // InternalRosSystemParser.g:8978:1: ( () )
            // InternalRosSystemParser.g:8979:2: ()
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0()); 
            // InternalRosSystemParser.g:8980:2: ()
            // InternalRosSystemParser.g:8980:3: 
            {
            }

             after(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__0__Impl"


    // $ANTLR start "rule__Uint8Array__Group__1"
    // InternalRosSystemParser.g:8988:1: rule__Uint8Array__Group__1 : rule__Uint8Array__Group__1__Impl ;
    public final void rule__Uint8Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:8992:1: ( rule__Uint8Array__Group__1__Impl )
            // InternalRosSystemParser.g:8993:2: rule__Uint8Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint8Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__1"


    // $ANTLR start "rule__Uint8Array__Group__1__Impl"
    // InternalRosSystemParser.g:8999:1: rule__Uint8Array__Group__1__Impl : ( Uint8_1 ) ;
    public final void rule__Uint8Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9003:1: ( ( Uint8_1 ) )
            // InternalRosSystemParser.g:9004:1: ( Uint8_1 )
            {
            // InternalRosSystemParser.g:9004:1: ( Uint8_1 )
            // InternalRosSystemParser.g:9005:2: Uint8_1
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8Keyword_1()); 
            match(input,Uint8_1,FOLLOW_2); 
             after(grammarAccess.getUint8ArrayAccess().getUint8Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint8Array__Group__1__Impl"


    // $ANTLR start "rule__Int16Array__Group__0"
    // InternalRosSystemParser.g:9015:1: rule__Int16Array__Group__0 : rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 ;
    public final void rule__Int16Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9019:1: ( rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 )
            // InternalRosSystemParser.g:9020:2: rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1
            {
            pushFollow(FOLLOW_68);
            rule__Int16Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__0"


    // $ANTLR start "rule__Int16Array__Group__0__Impl"
    // InternalRosSystemParser.g:9027:1: rule__Int16Array__Group__0__Impl : ( () ) ;
    public final void rule__Int16Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9031:1: ( ( () ) )
            // InternalRosSystemParser.g:9032:1: ( () )
            {
            // InternalRosSystemParser.g:9032:1: ( () )
            // InternalRosSystemParser.g:9033:2: ()
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0()); 
            // InternalRosSystemParser.g:9034:2: ()
            // InternalRosSystemParser.g:9034:3: 
            {
            }

             after(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__0__Impl"


    // $ANTLR start "rule__Int16Array__Group__1"
    // InternalRosSystemParser.g:9042:1: rule__Int16Array__Group__1 : rule__Int16Array__Group__1__Impl ;
    public final void rule__Int16Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9046:1: ( rule__Int16Array__Group__1__Impl )
            // InternalRosSystemParser.g:9047:2: rule__Int16Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int16Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__1"


    // $ANTLR start "rule__Int16Array__Group__1__Impl"
    // InternalRosSystemParser.g:9053:1: rule__Int16Array__Group__1__Impl : ( Int16_1 ) ;
    public final void rule__Int16Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9057:1: ( ( Int16_1 ) )
            // InternalRosSystemParser.g:9058:1: ( Int16_1 )
            {
            // InternalRosSystemParser.g:9058:1: ( Int16_1 )
            // InternalRosSystemParser.g:9059:2: Int16_1
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16Keyword_1()); 
            match(input,Int16_1,FOLLOW_2); 
             after(grammarAccess.getInt16ArrayAccess().getInt16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int16Array__Group__1__Impl"


    // $ANTLR start "rule__Uint16Array__Group__0"
    // InternalRosSystemParser.g:9069:1: rule__Uint16Array__Group__0 : rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 ;
    public final void rule__Uint16Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9073:1: ( rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 )
            // InternalRosSystemParser.g:9074:2: rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1
            {
            pushFollow(FOLLOW_69);
            rule__Uint16Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__0"


    // $ANTLR start "rule__Uint16Array__Group__0__Impl"
    // InternalRosSystemParser.g:9081:1: rule__Uint16Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint16Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9085:1: ( ( () ) )
            // InternalRosSystemParser.g:9086:1: ( () )
            {
            // InternalRosSystemParser.g:9086:1: ( () )
            // InternalRosSystemParser.g:9087:2: ()
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0()); 
            // InternalRosSystemParser.g:9088:2: ()
            // InternalRosSystemParser.g:9088:3: 
            {
            }

             after(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__0__Impl"


    // $ANTLR start "rule__Uint16Array__Group__1"
    // InternalRosSystemParser.g:9096:1: rule__Uint16Array__Group__1 : rule__Uint16Array__Group__1__Impl ;
    public final void rule__Uint16Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9100:1: ( rule__Uint16Array__Group__1__Impl )
            // InternalRosSystemParser.g:9101:2: rule__Uint16Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint16Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__1"


    // $ANTLR start "rule__Uint16Array__Group__1__Impl"
    // InternalRosSystemParser.g:9107:1: rule__Uint16Array__Group__1__Impl : ( Uint16_1 ) ;
    public final void rule__Uint16Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9111:1: ( ( Uint16_1 ) )
            // InternalRosSystemParser.g:9112:1: ( Uint16_1 )
            {
            // InternalRosSystemParser.g:9112:1: ( Uint16_1 )
            // InternalRosSystemParser.g:9113:2: Uint16_1
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16Keyword_1()); 
            match(input,Uint16_1,FOLLOW_2); 
             after(grammarAccess.getUint16ArrayAccess().getUint16Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint16Array__Group__1__Impl"


    // $ANTLR start "rule__Int32Array__Group__0"
    // InternalRosSystemParser.g:9123:1: rule__Int32Array__Group__0 : rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 ;
    public final void rule__Int32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9127:1: ( rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 )
            // InternalRosSystemParser.g:9128:2: rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1
            {
            pushFollow(FOLLOW_70);
            rule__Int32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__0"


    // $ANTLR start "rule__Int32Array__Group__0__Impl"
    // InternalRosSystemParser.g:9135:1: rule__Int32Array__Group__0__Impl : ( () ) ;
    public final void rule__Int32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9139:1: ( ( () ) )
            // InternalRosSystemParser.g:9140:1: ( () )
            {
            // InternalRosSystemParser.g:9140:1: ( () )
            // InternalRosSystemParser.g:9141:2: ()
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0()); 
            // InternalRosSystemParser.g:9142:2: ()
            // InternalRosSystemParser.g:9142:3: 
            {
            }

             after(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__0__Impl"


    // $ANTLR start "rule__Int32Array__Group__1"
    // InternalRosSystemParser.g:9150:1: rule__Int32Array__Group__1 : rule__Int32Array__Group__1__Impl ;
    public final void rule__Int32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9154:1: ( rule__Int32Array__Group__1__Impl )
            // InternalRosSystemParser.g:9155:2: rule__Int32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__1"


    // $ANTLR start "rule__Int32Array__Group__1__Impl"
    // InternalRosSystemParser.g:9161:1: rule__Int32Array__Group__1__Impl : ( Int32_1 ) ;
    public final void rule__Int32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9165:1: ( ( Int32_1 ) )
            // InternalRosSystemParser.g:9166:1: ( Int32_1 )
            {
            // InternalRosSystemParser.g:9166:1: ( Int32_1 )
            // InternalRosSystemParser.g:9167:2: Int32_1
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32Keyword_1()); 
            match(input,Int32_1,FOLLOW_2); 
             after(grammarAccess.getInt32ArrayAccess().getInt32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int32Array__Group__1__Impl"


    // $ANTLR start "rule__Uint32Array__Group__0"
    // InternalRosSystemParser.g:9177:1: rule__Uint32Array__Group__0 : rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 ;
    public final void rule__Uint32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9181:1: ( rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 )
            // InternalRosSystemParser.g:9182:2: rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1
            {
            pushFollow(FOLLOW_71);
            rule__Uint32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__0"


    // $ANTLR start "rule__Uint32Array__Group__0__Impl"
    // InternalRosSystemParser.g:9189:1: rule__Uint32Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9193:1: ( ( () ) )
            // InternalRosSystemParser.g:9194:1: ( () )
            {
            // InternalRosSystemParser.g:9194:1: ( () )
            // InternalRosSystemParser.g:9195:2: ()
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0()); 
            // InternalRosSystemParser.g:9196:2: ()
            // InternalRosSystemParser.g:9196:3: 
            {
            }

             after(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__0__Impl"


    // $ANTLR start "rule__Uint32Array__Group__1"
    // InternalRosSystemParser.g:9204:1: rule__Uint32Array__Group__1 : rule__Uint32Array__Group__1__Impl ;
    public final void rule__Uint32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9208:1: ( rule__Uint32Array__Group__1__Impl )
            // InternalRosSystemParser.g:9209:2: rule__Uint32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__1"


    // $ANTLR start "rule__Uint32Array__Group__1__Impl"
    // InternalRosSystemParser.g:9215:1: rule__Uint32Array__Group__1__Impl : ( Uint32_1 ) ;
    public final void rule__Uint32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9219:1: ( ( Uint32_1 ) )
            // InternalRosSystemParser.g:9220:1: ( Uint32_1 )
            {
            // InternalRosSystemParser.g:9220:1: ( Uint32_1 )
            // InternalRosSystemParser.g:9221:2: Uint32_1
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32Keyword_1()); 
            match(input,Uint32_1,FOLLOW_2); 
             after(grammarAccess.getUint32ArrayAccess().getUint32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint32Array__Group__1__Impl"


    // $ANTLR start "rule__Int64Array__Group__0"
    // InternalRosSystemParser.g:9231:1: rule__Int64Array__Group__0 : rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 ;
    public final void rule__Int64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9235:1: ( rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 )
            // InternalRosSystemParser.g:9236:2: rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1
            {
            pushFollow(FOLLOW_72);
            rule__Int64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__0"


    // $ANTLR start "rule__Int64Array__Group__0__Impl"
    // InternalRosSystemParser.g:9243:1: rule__Int64Array__Group__0__Impl : ( () ) ;
    public final void rule__Int64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9247:1: ( ( () ) )
            // InternalRosSystemParser.g:9248:1: ( () )
            {
            // InternalRosSystemParser.g:9248:1: ( () )
            // InternalRosSystemParser.g:9249:2: ()
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0()); 
            // InternalRosSystemParser.g:9250:2: ()
            // InternalRosSystemParser.g:9250:3: 
            {
            }

             after(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__0__Impl"


    // $ANTLR start "rule__Int64Array__Group__1"
    // InternalRosSystemParser.g:9258:1: rule__Int64Array__Group__1 : rule__Int64Array__Group__1__Impl ;
    public final void rule__Int64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9262:1: ( rule__Int64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9263:2: rule__Int64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Int64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__1"


    // $ANTLR start "rule__Int64Array__Group__1__Impl"
    // InternalRosSystemParser.g:9269:1: rule__Int64Array__Group__1__Impl : ( Int64_1 ) ;
    public final void rule__Int64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9273:1: ( ( Int64_1 ) )
            // InternalRosSystemParser.g:9274:1: ( Int64_1 )
            {
            // InternalRosSystemParser.g:9274:1: ( Int64_1 )
            // InternalRosSystemParser.g:9275:2: Int64_1
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64Keyword_1()); 
            match(input,Int64_1,FOLLOW_2); 
             after(grammarAccess.getInt64ArrayAccess().getInt64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Int64Array__Group__1__Impl"


    // $ANTLR start "rule__Uint64Array__Group__0"
    // InternalRosSystemParser.g:9285:1: rule__Uint64Array__Group__0 : rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 ;
    public final void rule__Uint64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9289:1: ( rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 )
            // InternalRosSystemParser.g:9290:2: rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1
            {
            pushFollow(FOLLOW_73);
            rule__Uint64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__0"


    // $ANTLR start "rule__Uint64Array__Group__0__Impl"
    // InternalRosSystemParser.g:9297:1: rule__Uint64Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9301:1: ( ( () ) )
            // InternalRosSystemParser.g:9302:1: ( () )
            {
            // InternalRosSystemParser.g:9302:1: ( () )
            // InternalRosSystemParser.g:9303:2: ()
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0()); 
            // InternalRosSystemParser.g:9304:2: ()
            // InternalRosSystemParser.g:9304:3: 
            {
            }

             after(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__0__Impl"


    // $ANTLR start "rule__Uint64Array__Group__1"
    // InternalRosSystemParser.g:9312:1: rule__Uint64Array__Group__1 : rule__Uint64Array__Group__1__Impl ;
    public final void rule__Uint64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9316:1: ( rule__Uint64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9317:2: rule__Uint64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uint64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__1"


    // $ANTLR start "rule__Uint64Array__Group__1__Impl"
    // InternalRosSystemParser.g:9323:1: rule__Uint64Array__Group__1__Impl : ( Uint64_1 ) ;
    public final void rule__Uint64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9327:1: ( ( Uint64_1 ) )
            // InternalRosSystemParser.g:9328:1: ( Uint64_1 )
            {
            // InternalRosSystemParser.g:9328:1: ( Uint64_1 )
            // InternalRosSystemParser.g:9329:2: Uint64_1
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64Keyword_1()); 
            match(input,Uint64_1,FOLLOW_2); 
             after(grammarAccess.getUint64ArrayAccess().getUint64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uint64Array__Group__1__Impl"


    // $ANTLR start "rule__Float32Array__Group__0"
    // InternalRosSystemParser.g:9339:1: rule__Float32Array__Group__0 : rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 ;
    public final void rule__Float32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9343:1: ( rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 )
            // InternalRosSystemParser.g:9344:2: rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1
            {
            pushFollow(FOLLOW_74);
            rule__Float32Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__0"


    // $ANTLR start "rule__Float32Array__Group__0__Impl"
    // InternalRosSystemParser.g:9351:1: rule__Float32Array__Group__0__Impl : ( () ) ;
    public final void rule__Float32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9355:1: ( ( () ) )
            // InternalRosSystemParser.g:9356:1: ( () )
            {
            // InternalRosSystemParser.g:9356:1: ( () )
            // InternalRosSystemParser.g:9357:2: ()
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0()); 
            // InternalRosSystemParser.g:9358:2: ()
            // InternalRosSystemParser.g:9358:3: 
            {
            }

             after(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__0__Impl"


    // $ANTLR start "rule__Float32Array__Group__1"
    // InternalRosSystemParser.g:9366:1: rule__Float32Array__Group__1 : rule__Float32Array__Group__1__Impl ;
    public final void rule__Float32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9370:1: ( rule__Float32Array__Group__1__Impl )
            // InternalRosSystemParser.g:9371:2: rule__Float32Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float32Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__1"


    // $ANTLR start "rule__Float32Array__Group__1__Impl"
    // InternalRosSystemParser.g:9377:1: rule__Float32Array__Group__1__Impl : ( Float32_1 ) ;
    public final void rule__Float32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9381:1: ( ( Float32_1 ) )
            // InternalRosSystemParser.g:9382:1: ( Float32_1 )
            {
            // InternalRosSystemParser.g:9382:1: ( Float32_1 )
            // InternalRosSystemParser.g:9383:2: Float32_1
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1()); 
            match(input,Float32_1,FOLLOW_2); 
             after(grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float32Array__Group__1__Impl"


    // $ANTLR start "rule__Float64Array__Group__0"
    // InternalRosSystemParser.g:9393:1: rule__Float64Array__Group__0 : rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 ;
    public final void rule__Float64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9397:1: ( rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 )
            // InternalRosSystemParser.g:9398:2: rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1
            {
            pushFollow(FOLLOW_75);
            rule__Float64Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__0"


    // $ANTLR start "rule__Float64Array__Group__0__Impl"
    // InternalRosSystemParser.g:9405:1: rule__Float64Array__Group__0__Impl : ( () ) ;
    public final void rule__Float64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9409:1: ( ( () ) )
            // InternalRosSystemParser.g:9410:1: ( () )
            {
            // InternalRosSystemParser.g:9410:1: ( () )
            // InternalRosSystemParser.g:9411:2: ()
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0()); 
            // InternalRosSystemParser.g:9412:2: ()
            // InternalRosSystemParser.g:9412:3: 
            {
            }

             after(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__0__Impl"


    // $ANTLR start "rule__Float64Array__Group__1"
    // InternalRosSystemParser.g:9420:1: rule__Float64Array__Group__1 : rule__Float64Array__Group__1__Impl ;
    public final void rule__Float64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9424:1: ( rule__Float64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9425:2: rule__Float64Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Float64Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__1"


    // $ANTLR start "rule__Float64Array__Group__1__Impl"
    // InternalRosSystemParser.g:9431:1: rule__Float64Array__Group__1__Impl : ( Float64_1 ) ;
    public final void rule__Float64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9435:1: ( ( Float64_1 ) )
            // InternalRosSystemParser.g:9436:1: ( Float64_1 )
            {
            // InternalRosSystemParser.g:9436:1: ( Float64_1 )
            // InternalRosSystemParser.g:9437:2: Float64_1
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1()); 
            match(input,Float64_1,FOLLOW_2); 
             after(grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Float64Array__Group__1__Impl"


    // $ANTLR start "rule__String0Array__Group__0"
    // InternalRosSystemParser.g:9447:1: rule__String0Array__Group__0 : rule__String0Array__Group__0__Impl rule__String0Array__Group__1 ;
    public final void rule__String0Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9451:1: ( rule__String0Array__Group__0__Impl rule__String0Array__Group__1 )
            // InternalRosSystemParser.g:9452:2: rule__String0Array__Group__0__Impl rule__String0Array__Group__1
            {
            pushFollow(FOLLOW_76);
            rule__String0Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__0"


    // $ANTLR start "rule__String0Array__Group__0__Impl"
    // InternalRosSystemParser.g:9459:1: rule__String0Array__Group__0__Impl : ( () ) ;
    public final void rule__String0Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9463:1: ( ( () ) )
            // InternalRosSystemParser.g:9464:1: ( () )
            {
            // InternalRosSystemParser.g:9464:1: ( () )
            // InternalRosSystemParser.g:9465:2: ()
            {
             before(grammarAccess.getString0ArrayAccess().getStringArrayAction_0()); 
            // InternalRosSystemParser.g:9466:2: ()
            // InternalRosSystemParser.g:9466:3: 
            {
            }

             after(grammarAccess.getString0ArrayAccess().getStringArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__0__Impl"


    // $ANTLR start "rule__String0Array__Group__1"
    // InternalRosSystemParser.g:9474:1: rule__String0Array__Group__1 : rule__String0Array__Group__1__Impl ;
    public final void rule__String0Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9478:1: ( rule__String0Array__Group__1__Impl )
            // InternalRosSystemParser.g:9479:2: rule__String0Array__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0Array__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__1"


    // $ANTLR start "rule__String0Array__Group__1__Impl"
    // InternalRosSystemParser.g:9485:1: rule__String0Array__Group__1__Impl : ( String_2 ) ;
    public final void rule__String0Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9489:1: ( ( String_2 ) )
            // InternalRosSystemParser.g:9490:1: ( String_2 )
            {
            // InternalRosSystemParser.g:9490:1: ( String_2 )
            // InternalRosSystemParser.g:9491:2: String_2
            {
             before(grammarAccess.getString0ArrayAccess().getStringKeyword_1()); 
            match(input,String_2,FOLLOW_2); 
             after(grammarAccess.getString0ArrayAccess().getStringKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0Array__Group__1__Impl"


    // $ANTLR start "rule__ByteArray__Group__0"
    // InternalRosSystemParser.g:9501:1: rule__ByteArray__Group__0 : rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 ;
    public final void rule__ByteArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9505:1: ( rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 )
            // InternalRosSystemParser.g:9506:2: rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1
            {
            pushFollow(FOLLOW_77);
            rule__ByteArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__0"


    // $ANTLR start "rule__ByteArray__Group__0__Impl"
    // InternalRosSystemParser.g:9513:1: rule__ByteArray__Group__0__Impl : ( () ) ;
    public final void rule__ByteArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9517:1: ( ( () ) )
            // InternalRosSystemParser.g:9518:1: ( () )
            {
            // InternalRosSystemParser.g:9518:1: ( () )
            // InternalRosSystemParser.g:9519:2: ()
            {
             before(grammarAccess.getByteArrayAccess().getByteArrayAction_0()); 
            // InternalRosSystemParser.g:9520:2: ()
            // InternalRosSystemParser.g:9520:3: 
            {
            }

             after(grammarAccess.getByteArrayAccess().getByteArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__0__Impl"


    // $ANTLR start "rule__ByteArray__Group__1"
    // InternalRosSystemParser.g:9528:1: rule__ByteArray__Group__1 : rule__ByteArray__Group__1__Impl ;
    public final void rule__ByteArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9532:1: ( rule__ByteArray__Group__1__Impl )
            // InternalRosSystemParser.g:9533:2: rule__ByteArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByteArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__1"


    // $ANTLR start "rule__ByteArray__Group__1__Impl"
    // InternalRosSystemParser.g:9539:1: rule__ByteArray__Group__1__Impl : ( Byte_1 ) ;
    public final void rule__ByteArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9543:1: ( ( Byte_1 ) )
            // InternalRosSystemParser.g:9544:1: ( Byte_1 )
            {
            // InternalRosSystemParser.g:9544:1: ( Byte_1 )
            // InternalRosSystemParser.g:9545:2: Byte_1
            {
             before(grammarAccess.getByteArrayAccess().getByteKeyword_1()); 
            match(input,Byte_1,FOLLOW_2); 
             after(grammarAccess.getByteArrayAccess().getByteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByteArray__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalRosSystemParser.g:9555:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9559:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalRosSystemParser.g:9560:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_78);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // InternalRosSystemParser.g:9567:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9571:1: ( ( () ) )
            // InternalRosSystemParser.g:9572:1: ( () )
            {
            // InternalRosSystemParser.g:9572:1: ( () )
            // InternalRosSystemParser.g:9573:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalRosSystemParser.g:9574:2: ()
            // InternalRosSystemParser.g:9574:3: 
            {
            }

             after(grammarAccess.getHeaderAccess().getHeaderAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // InternalRosSystemParser.g:9582:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9586:1: ( rule__Header__Group__1__Impl )
            // InternalRosSystemParser.g:9587:2: rule__Header__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Header__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // InternalRosSystemParser.g:9593:1: rule__Header__Group__1__Impl : ( Header ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9597:1: ( ( Header ) )
            // InternalRosSystemParser.g:9598:1: ( Header )
            {
            // InternalRosSystemParser.g:9598:1: ( Header )
            // InternalRosSystemParser.g:9599:2: Header
            {
             before(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 
            match(input,Header,FOLLOW_2); 
             after(grammarAccess.getHeaderAccess().getHeaderKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__0"
    // InternalRosSystemParser.g:9609:1: rule__ArrayTopicSpecRef__Group__0 : rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 ;
    public final void rule__ArrayTopicSpecRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9613:1: ( rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 )
            // InternalRosSystemParser.g:9614:2: rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1
            {
            pushFollow(FOLLOW_79);
            rule__ArrayTopicSpecRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__0"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__0__Impl"
    // InternalRosSystemParser.g:9621:1: rule__ArrayTopicSpecRef__Group__0__Impl : ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) ) ;
    public final void rule__ArrayTopicSpecRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9625:1: ( ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) ) )
            // InternalRosSystemParser.g:9626:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) )
            {
            // InternalRosSystemParser.g:9626:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) )
            // InternalRosSystemParser.g:9627:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_0()); 
            // InternalRosSystemParser.g:9628:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 )
            // InternalRosSystemParser.g:9628:3: rule__ArrayTopicSpecRef__TopicSpecAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__TopicSpecAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__0__Impl"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__1"
    // InternalRosSystemParser.g:9636:1: rule__ArrayTopicSpecRef__Group__1 : rule__ArrayTopicSpecRef__Group__1__Impl ;
    public final void rule__ArrayTopicSpecRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9640:1: ( rule__ArrayTopicSpecRef__Group__1__Impl )
            // InternalRosSystemParser.g:9641:2: rule__ArrayTopicSpecRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayTopicSpecRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__1"


    // $ANTLR start "rule__ArrayTopicSpecRef__Group__1__Impl"
    // InternalRosSystemParser.g:9647:1: rule__ArrayTopicSpecRef__Group__1__Impl : ( LeftSquareBracketRightSquareBracket ) ;
    public final void rule__ArrayTopicSpecRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9651:1: ( ( LeftSquareBracketRightSquareBracket ) )
            // InternalRosSystemParser.g:9652:1: ( LeftSquareBracketRightSquareBracket )
            {
            // InternalRosSystemParser.g:9652:1: ( LeftSquareBracketRightSquareBracket )
            // InternalRosSystemParser.g:9653:2: LeftSquareBracketRightSquareBracket
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArrayTopicSpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__Group__1__Impl"


    // $ANTLR start "rule__RosSystem__NameAssignment_0"
    // InternalRosSystemParser.g:9663:1: rule__RosSystem__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9667:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9668:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9668:2: ( ruleEString )
            // InternalRosSystemParser.g:9669:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__NameAssignment_0"


    // $ANTLR start "rule__RosSystem__ProcessesAssignment_3_0_2"
    // InternalRosSystemParser.g:9678:1: rule__RosSystem__ProcessesAssignment_3_0_2 : ( ruleProcess ) ;
    public final void rule__RosSystem__ProcessesAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9682:1: ( ( ruleProcess ) )
            // InternalRosSystemParser.g:9683:2: ( ruleProcess )
            {
            // InternalRosSystemParser.g:9683:2: ( ruleProcess )
            // InternalRosSystemParser.g:9684:3: ruleProcess
            {
             before(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_3_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ProcessesAssignment_3_0_2"


    // $ANTLR start "rule__RosSystem__ComponentsAssignment_3_1_2"
    // InternalRosSystemParser.g:9693:1: rule__RosSystem__ComponentsAssignment_3_1_2 : ( ruleRosNode ) ;
    public final void rule__RosSystem__ComponentsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9697:1: ( ( ruleRosNode ) )
            // InternalRosSystemParser.g:9698:2: ( ruleRosNode )
            {
            // InternalRosSystemParser.g:9698:2: ( ruleRosNode )
            // InternalRosSystemParser.g:9699:3: ruleRosNode
            {
             before(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosNode();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ComponentsAssignment_3_1_2"


    // $ANTLR start "rule__RosSystem__ParameterAssignment_3_2_2"
    // InternalRosSystemParser.g:9708:1: rule__RosSystem__ParameterAssignment_3_2_2 : ( ruleParameter ) ;
    public final void rule__RosSystem__ParameterAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9712:1: ( ( ruleParameter ) )
            // InternalRosSystemParser.g:9713:2: ( ruleParameter )
            {
            // InternalRosSystemParser.g:9713:2: ( ruleParameter )
            // InternalRosSystemParser.g:9714:3: ruleParameter
            {
             before(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_3_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getParameterParameterParserRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ParameterAssignment_3_2_2"


    // $ANTLR start "rule__RosSystem__ConnectionsAssignment_3_3_2"
    // InternalRosSystemParser.g:9723:1: rule__RosSystem__ConnectionsAssignment_3_3_2 : ( ruleRosConnection ) ;
    public final void rule__RosSystem__ConnectionsAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9727:1: ( ( ruleRosConnection ) )
            // InternalRosSystemParser.g:9728:2: ( ruleRosConnection )
            {
            // InternalRosSystemParser.g:9728:2: ( ruleRosConnection )
            // InternalRosSystemParser.g:9729:3: ruleRosConnection
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsRosConnectionParserRuleCall_3_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getConnectionsRosConnectionParserRuleCall_3_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ConnectionsAssignment_3_3_2"


    // $ANTLR start "rule__Process__NameAssignment_1"
    // InternalRosSystemParser.g:9738:1: rule__Process__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9742:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9743:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9743:2: ( ruleEString )
            // InternalRosSystemParser.g:9744:3: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NameAssignment_1"


    // $ANTLR start "rule__Process__NodesAssignment_4_2"
    // InternalRosSystemParser.g:9753:1: rule__Process__NodesAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Process__NodesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9757:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9758:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9758:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9759:3: ( ruleEString )
            {
             before(grammarAccess.getProcessAccess().getNodesRosNodeCrossReference_4_2_0()); 
            // InternalRosSystemParser.g:9760:3: ( ruleEString )
            // InternalRosSystemParser.g:9761:4: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNodesRosNodeEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNodesRosNodeEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getProcessAccess().getNodesRosNodeCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__NodesAssignment_4_2"


    // $ANTLR start "rule__Process__ThreadsAssignment_5_1"
    // InternalRosSystemParser.g:9772:1: rule__Process__ThreadsAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Process__ThreadsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9776:1: ( ( RULE_INT ) )
            // InternalRosSystemParser.g:9777:2: ( RULE_INT )
            {
            // InternalRosSystemParser.g:9777:2: ( RULE_INT )
            // InternalRosSystemParser.g:9778:3: RULE_INT
            {
             before(grammarAccess.getProcessAccess().getThreadsINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getProcessAccess().getThreadsINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ThreadsAssignment_5_1"


    // $ANTLR start "rule__RosNode__NameAssignment_1"
    // InternalRosSystemParser.g:9787:1: rule__RosNode__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RosNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9791:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9792:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9792:2: ( ruleEString )
            // InternalRosSystemParser.g:9793:3: ruleEString
            {
             before(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__NameAssignment_1"


    // $ANTLR start "rule__RosNode__FromAssignment_5"
    // InternalRosSystemParser.g:9802:1: rule__RosNode__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__RosNode__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9806:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9807:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9807:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9808:3: ( ruleEString )
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0()); 
            // InternalRosSystemParser.g:9809:3: ( ruleEString )
            // InternalRosSystemParser.g:9810:4: ruleEString
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getFromNodeEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__FromAssignment_5"


    // $ANTLR start "rule__RosNode__RosinterfacesAssignment_6_2"
    // InternalRosSystemParser.g:9821:1: rule__RosNode__RosinterfacesAssignment_6_2 : ( ruleRosInterface ) ;
    public final void rule__RosNode__RosinterfacesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9825:1: ( ( ruleRosInterface ) )
            // InternalRosSystemParser.g:9826:2: ( ruleRosInterface )
            {
            // InternalRosSystemParser.g:9826:2: ( ruleRosInterface )
            // InternalRosSystemParser.g:9827:3: ruleRosInterface
            {
             before(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosInterface();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__RosinterfacesAssignment_6_2"


    // $ANTLR start "rule__RosNode__RosparametersAssignment_7_2"
    // InternalRosSystemParser.g:9836:1: rule__RosNode__RosparametersAssignment_7_2 : ( ruleRosParameter ) ;
    public final void rule__RosNode__RosparametersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9840:1: ( ( ruleRosParameter ) )
            // InternalRosSystemParser.g:9841:2: ( ruleRosParameter )
            {
            // InternalRosSystemParser.g:9841:2: ( ruleRosParameter )
            // InternalRosSystemParser.g:9842:3: ruleRosParameter
            {
             before(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__RosparametersAssignment_7_2"


    // $ANTLR start "rule__RosInterface__NameAssignment_0"
    // InternalRosSystemParser.g:9851:1: rule__RosInterface__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosInterface__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9855:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9856:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9856:2: ( ruleEString )
            // InternalRosSystemParser.g:9857:3: ruleEString
            {
             before(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__NameAssignment_0"


    // $ANTLR start "rule__RosInterface__ReferenceAssignment_3"
    // InternalRosSystemParser.g:9866:1: rule__RosInterface__ReferenceAssignment_3 : ( ruleInterfaceReference ) ;
    public final void rule__RosInterface__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9870:1: ( ( ruleInterfaceReference ) )
            // InternalRosSystemParser.g:9871:2: ( ruleInterfaceReference )
            {
            // InternalRosSystemParser.g:9871:2: ( ruleInterfaceReference )
            // InternalRosSystemParser.g:9872:3: ruleInterfaceReference
            {
             before(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInterfaceReference();

            state._fsp--;

             after(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__ReferenceAssignment_3"


    // $ANTLR start "rule__RosPublisherReference__FromAssignment_1"
    // InternalRosSystemParser.g:9881:1: rule__RosPublisherReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisherReference__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9885:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9886:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9886:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9887:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_1_0()); 
            // InternalRosSystemParser.g:9888:3: ( ruleEString )
            // InternalRosSystemParser.g:9889:4: ruleEString
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisherReference__FromAssignment_1"


    // $ANTLR start "rule__RosSubscriberReference__FromAssignment_1"
    // InternalRosSystemParser.g:9900:1: rule__RosSubscriberReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriberReference__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9904:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9905:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9905:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9906:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_1_0()); 
            // InternalRosSystemParser.g:9907:3: ( ruleEString )
            // InternalRosSystemParser.g:9908:4: ruleEString
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriberReference__FromAssignment_1"


    // $ANTLR start "rule__RosServiceServerReference__FromAssignment_1"
    // InternalRosSystemParser.g:9919:1: rule__RosServiceServerReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServerReference__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9923:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9924:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9924:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9925:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_1_0()); 
            // InternalRosSystemParser.g:9926:3: ( ruleEString )
            // InternalRosSystemParser.g:9927:4: ruleEString
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServiceServerReference__FromAssignment_1"


    // $ANTLR start "rule__RosServerClientReference__FromAssignment_1"
    // InternalRosSystemParser.g:9938:1: rule__RosServerClientReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServerClientReference__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9942:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9943:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9943:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9944:3: ( ruleEString )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_1_0()); 
            // InternalRosSystemParser.g:9945:3: ( ruleEString )
            // InternalRosSystemParser.g:9946:4: ruleEString
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosServerClientReference__FromAssignment_1"


    // $ANTLR start "rule__RosActionServerReference__FromAssignment_1"
    // InternalRosSystemParser.g:9957:1: rule__RosActionServerReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServerReference__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9961:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9962:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9962:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9963:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_1_0()); 
            // InternalRosSystemParser.g:9964:3: ( ruleEString )
            // InternalRosSystemParser.g:9965:4: ruleEString
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionServerReference__FromAssignment_1"


    // $ANTLR start "rule__RosActionClientReference__FromAssignment_1"
    // InternalRosSystemParser.g:9976:1: rule__RosActionClientReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClientReference__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9980:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9981:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9981:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9982:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_1_0()); 
            // InternalRosSystemParser.g:9983:3: ( ruleEString )
            // InternalRosSystemParser.g:9984:4: ruleEString
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosActionClientReference__FromAssignment_1"


    // $ANTLR start "rule__RosParameter__NameAssignment_0"
    // InternalRosSystemParser.g:9995:1: rule__RosParameter__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:9999:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10000:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10000:2: ( ruleEString )
            // InternalRosSystemParser.g:10001:3: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__NameAssignment_0"


    // $ANTLR start "rule__RosParameter__FromAssignment_4"
    // InternalRosSystemParser.g:10010:1: rule__RosParameter__FromAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RosParameter__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10014:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10015:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10015:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10016:3: ( ruleEString )
            {
             before(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_4_0()); 
            // InternalRosSystemParser.g:10017:3: ( ruleEString )
            // InternalRosSystemParser.g:10018:4: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__FromAssignment_4"


    // $ANTLR start "rule__RosParameter__ValueAssignment_6"
    // InternalRosSystemParser.g:10029:1: rule__RosParameter__ValueAssignment_6 : ( ruleParameterValue ) ;
    public final void rule__RosParameter__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10033:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10034:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10034:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10035:3: ruleParameterValue
            {
             before(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ValueAssignment_6"


    // $ANTLR start "rule__RosConnection__FromAssignment_1"
    // InternalRosSystemParser.g:10044:1: rule__RosConnection__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosConnection__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10048:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10049:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10049:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10050:3: ( ruleEString )
            {
             before(grammarAccess.getRosConnectionAccess().getFromRosInterfaceCrossReference_1_0()); 
            // InternalRosSystemParser.g:10051:3: ( ruleEString )
            // InternalRosSystemParser.g:10052:4: ruleEString
            {
             before(grammarAccess.getRosConnectionAccess().getFromRosInterfaceEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosConnectionAccess().getFromRosInterfaceEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosConnectionAccess().getFromRosInterfaceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__FromAssignment_1"


    // $ANTLR start "rule__RosConnection__ToAssignment_3"
    // InternalRosSystemParser.g:10063:1: rule__RosConnection__ToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__RosConnection__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10067:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10068:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10068:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10069:3: ( ruleEString )
            {
             before(grammarAccess.getRosConnectionAccess().getToRosInterfaceCrossReference_3_0()); 
            // InternalRosSystemParser.g:10070:3: ( ruleEString )
            // InternalRosSystemParser.g:10071:4: ruleEString
            {
             before(grammarAccess.getRosConnectionAccess().getToRosInterfaceEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosConnectionAccess().getToRosInterfaceEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRosConnectionAccess().getToRosInterfaceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosConnection__ToAssignment_3"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_1"
    // InternalRosSystemParser.g:10082:1: rule__GlobalNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10086:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10087:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10087:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10088:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_2_1"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_2_1"
    // InternalRosSystemParser.g:10097:1: rule__GlobalNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10101:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10102:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10102:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10103:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_2_2_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_2_1"
    // InternalRosSystemParser.g:10112:1: rule__RelativeNamespace_Impl__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10116:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10117:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10117:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10118:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_2_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1"
    // InternalRosSystemParser.g:10127:1: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10131:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10132:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10132:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10133:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_2_1"
    // InternalRosSystemParser.g:10142:1: rule__PrivateNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10146:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10147:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10147:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10148:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_2_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_2_2_1"
    // InternalRosSystemParser.g:10157:1: rule__PrivateNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10161:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:10162:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:10162:2: ( ruleGraphName )
            // InternalRosSystemParser.g:10163:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_2_2_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalRosSystemParser.g:10172:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10176:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10177:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10177:2: ( ruleEString )
            // InternalRosSystemParser.g:10178:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__NamespaceAssignment_4_1"
    // InternalRosSystemParser.g:10187:1: rule__Parameter__NamespaceAssignment_4_1 : ( ruleNamespace ) ;
    public final void rule__Parameter__NamespaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10191:1: ( ( ruleNamespace ) )
            // InternalRosSystemParser.g:10192:2: ( ruleNamespace )
            {
            // InternalRosSystemParser.g:10192:2: ( ruleNamespace )
            // InternalRosSystemParser.g:10193:3: ruleNamespace
            {
             before(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NamespaceAssignment_4_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_6"
    // InternalRosSystemParser.g:10202:1: rule__Parameter__TypeAssignment_6 : ( ruleParameterType ) ;
    public final void rule__Parameter__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10206:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10207:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10207:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10208:3: ruleParameterType
            {
             before(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_6"


    // $ANTLR start "rule__Parameter__ValueAssignment_7_1"
    // InternalRosSystemParser.g:10217:1: rule__Parameter__ValueAssignment_7_1 : ( ruleParameterValue ) ;
    public final void rule__Parameter__ValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10221:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10222:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10222:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10223:3: ruleParameterValue
            {
             before(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ValueAssignment_7_1"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_3"
    // InternalRosSystemParser.g:10232:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10236:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10237:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10237:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10238:3: ruleParameterType
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__SequenceAssignment_3"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_4_1"
    // InternalRosSystemParser.g:10247:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10251:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10252:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10252:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10253:3: ruleParameterType
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterListType__SequenceAssignment_4_1"


    // $ANTLR start "rule__ParameterStructType__ParameterstructypetmemberAssignment_3"
    // InternalRosSystemParser.g:10262:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10266:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:10267:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:10267:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:10268:3: ruleParameterStructTypeMember
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__ParameterstructypetmemberAssignment_3"


    // $ANTLR start "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1"
    // InternalRosSystemParser.g:10277:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10281:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:10282:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:10282:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:10283:3: ruleParameterStructTypeMember
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructTypeMember();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1"


    // $ANTLR start "rule__ParameterIntegerType__DefaultAssignment_2_1"
    // InternalRosSystemParser.g:10292:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10296:1: ( ( ruleParameterInteger ) )
            // InternalRosSystemParser.g:10297:2: ( ruleParameterInteger )
            {
            // InternalRosSystemParser.g:10297:2: ( ruleParameterInteger )
            // InternalRosSystemParser.g:10298:3: ruleParameterInteger
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterInteger();

            state._fsp--;

             after(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterIntegerType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterStringType__DefaultAssignment_2_1"
    // InternalRosSystemParser.g:10307:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10311:1: ( ( ruleParameterString ) )
            // InternalRosSystemParser.g:10312:2: ( ruleParameterString )
            {
            // InternalRosSystemParser.g:10312:2: ( ruleParameterString )
            // InternalRosSystemParser.g:10313:3: ruleParameterString
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterString();

            state._fsp--;

             after(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStringType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterDoubleType__DefaultAssignment_2_1"
    // InternalRosSystemParser.g:10322:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10326:1: ( ( ruleParameterDouble ) )
            // InternalRosSystemParser.g:10327:2: ( ruleParameterDouble )
            {
            // InternalRosSystemParser.g:10327:2: ( ruleParameterDouble )
            // InternalRosSystemParser.g:10328:3: ruleParameterDouble
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDouble();

            state._fsp--;

             after(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDoubleType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterBooleanType__DefaultAssignment_2_1"
    // InternalRosSystemParser.g:10337:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10341:1: ( ( ruleParameterBoolean ) )
            // InternalRosSystemParser.g:10342:2: ( ruleParameterBoolean )
            {
            // InternalRosSystemParser.g:10342:2: ( ruleParameterBoolean )
            // InternalRosSystemParser.g:10343:3: ruleParameterBoolean
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterBoolean();

            state._fsp--;

             after(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBooleanType__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterBase64Type__DefaultAssignment_2_1"
    // InternalRosSystemParser.g:10352:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10356:1: ( ( ruleParameterBase64 ) )
            // InternalRosSystemParser.g:10357:2: ( ruleParameterBase64 )
            {
            // InternalRosSystemParser.g:10357:2: ( ruleParameterBase64 )
            // InternalRosSystemParser.g:10358:3: ruleParameterBase64
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterBase64();

            state._fsp--;

             after(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64Type__DefaultAssignment_2_1"


    // $ANTLR start "rule__ParameterArrayType__TypeAssignment_3"
    // InternalRosSystemParser.g:10367:1: rule__ParameterArrayType__TypeAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10371:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10372:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10372:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10373:3: ruleParameterType
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__TypeAssignment_3"


    // $ANTLR start "rule__ParameterArrayType__DefaultAssignment_4_1"
    // InternalRosSystemParser.g:10382:1: rule__ParameterArrayType__DefaultAssignment_4_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10386:1: ( ( ruleParameterList ) )
            // InternalRosSystemParser.g:10387:2: ( ruleParameterList )
            {
            // InternalRosSystemParser.g:10387:2: ( ruleParameterList )
            // InternalRosSystemParser.g:10388:3: ruleParameterList
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__DefaultAssignment_4_1"


    // $ANTLR start "rule__ParameterList__ValueAssignment_2"
    // InternalRosSystemParser.g:10397:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10401:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10402:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10402:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10403:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_2"


    // $ANTLR start "rule__ParameterList__ValueAssignment_3_1"
    // InternalRosSystemParser.g:10412:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10416:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10417:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10417:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10418:3: ruleParameterValue
            {
             before(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterList__ValueAssignment_3_1"


    // $ANTLR start "rule__ParameterAny__ValueAssignment_2_1"
    // InternalRosSystemParser.g:10427:1: rule__ParameterAny__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10431:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10432:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10432:2: ( ruleEString )
            // InternalRosSystemParser.g:10433:3: ruleEString
            {
             before(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__ValueAssignment_2_1"


    // $ANTLR start "rule__ParameterString__ValueAssignment"
    // InternalRosSystemParser.g:10442:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10446:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10447:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10447:2: ( ruleEString )
            // InternalRosSystemParser.g:10448:3: ruleEString
            {
             before(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterString__ValueAssignment"


    // $ANTLR start "rule__ParameterBase64__ValueAssignment"
    // InternalRosSystemParser.g:10457:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10461:1: ( ( ruleBase64Binary ) )
            // InternalRosSystemParser.g:10462:2: ( ruleBase64Binary )
            {
            // InternalRosSystemParser.g:10462:2: ( ruleBase64Binary )
            // InternalRosSystemParser.g:10463:3: ruleBase64Binary
            {
             before(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBase64Binary();

            state._fsp--;

             after(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBase64__ValueAssignment"


    // $ANTLR start "rule__ParameterInteger__ValueAssignment"
    // InternalRosSystemParser.g:10472:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10476:1: ( ( ruleInteger0 ) )
            // InternalRosSystemParser.g:10477:2: ( ruleInteger0 )
            {
            // InternalRosSystemParser.g:10477:2: ( ruleInteger0 )
            // InternalRosSystemParser.g:10478:3: ruleInteger0
            {
             before(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInteger__ValueAssignment"


    // $ANTLR start "rule__ParameterDouble__ValueAssignment"
    // InternalRosSystemParser.g:10487:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10491:1: ( ( ruleDouble0 ) )
            // InternalRosSystemParser.g:10492:2: ( ruleDouble0 )
            {
            // InternalRosSystemParser.g:10492:2: ( ruleDouble0 )
            // InternalRosSystemParser.g:10493:3: ruleDouble0
            {
             before(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble0();

            state._fsp--;

             after(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDouble__ValueAssignment"


    // $ANTLR start "rule__ParameterBoolean__ValueAssignment"
    // InternalRosSystemParser.g:10502:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10506:1: ( ( ruleboolean0 ) )
            // InternalRosSystemParser.g:10507:2: ( ruleboolean0 )
            {
            // InternalRosSystemParser.g:10507:2: ( ruleboolean0 )
            // InternalRosSystemParser.g:10508:3: ruleboolean0
            {
             before(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleboolean0();

            state._fsp--;

             after(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterBoolean__ValueAssignment"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_1"
    // InternalRosSystemParser.g:10517:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10521:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:10522:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:10522:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:10523:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_1"


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_2_2"
    // InternalRosSystemParser.g:10532:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10536:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:10537:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:10537:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:10538:3: ruleParameterStructMember
            {
             before(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterStructMember();

            state._fsp--;

             after(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStruct__ValueAssignment_1_2_2"


    // $ANTLR start "rule__ParameterDate__ValueAssignment"
    // InternalRosSystemParser.g:10547:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10551:1: ( ( ruleDateTime0 ) )
            // InternalRosSystemParser.g:10552:2: ( ruleDateTime0 )
            {
            // InternalRosSystemParser.g:10552:2: ( ruleDateTime0 )
            // InternalRosSystemParser.g:10553:3: ruleDateTime0
            {
             before(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDateTime0();

            state._fsp--;

             after(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDate__ValueAssignment"


    // $ANTLR start "rule__ParameterStructMember__NameAssignment_1"
    // InternalRosSystemParser.g:10562:1: rule__ParameterStructMember__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10566:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10567:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10567:2: ( ruleEString )
            // InternalRosSystemParser.g:10568:3: ruleEString
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__NameAssignment_1"


    // $ANTLR start "rule__ParameterStructMember__ValueAssignment_4"
    // InternalRosSystemParser.g:10577:1: rule__ParameterStructMember__ValueAssignment_4 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10581:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10582:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10582:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10583:3: ruleParameterValue
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__ValueAssignment_4"


    // $ANTLR start "rule__ParameterStructTypeMember__NameAssignment_0"
    // InternalRosSystemParser.g:10592:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10596:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10597:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10597:2: ( ruleEString )
            // InternalRosSystemParser.g:10598:3: ruleEString
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructTypeMember__TypeAssignment_1"
    // InternalRosSystemParser.g:10607:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10611:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10612:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10612:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10613:3: ruleParameterType
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructTypeMember__TypeAssignment_1"


    // $ANTLR start "rule__TopicSpecRef__TopicSpecAssignment"
    // InternalRosSystemParser.g:10622:1: rule__TopicSpecRef__TopicSpecAssignment : ( ( ruleEString ) ) ;
    public final void rule__TopicSpecRef__TopicSpecAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10626:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10627:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10627:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10628:3: ( ruleEString )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0()); 
            // InternalRosSystemParser.g:10629:3: ( ruleEString )
            // InternalRosSystemParser.g:10630:4: ruleEString
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicSpecRef__TopicSpecAssignment"


    // $ANTLR start "rule__ArrayTopicSpecRef__TopicSpecAssignment_0"
    // InternalRosSystemParser.g:10641:1: rule__ArrayTopicSpecRef__TopicSpecAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ArrayTopicSpecRef__TopicSpecAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:10645:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10646:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10646:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10647:3: ( ruleEString )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0_0()); 
            // InternalRosSystemParser.g:10648:3: ( ruleEString )
            // InternalRosSystemParser.g:10649:4: ruleEString
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayTopicSpecRef__TopicSpecAssignment_0"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\42\uffff";
    static final String dfa_2s = "\36\uffff\2\40\2\uffff";
    static final String dfa_3s = "\1\16\35\uffff\2\115\2\uffff";
    static final String dfa_4s = "\1\137\35\uffff\2\115\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\36\1\37";
    static final String dfa_6s = "\42\uffff}>";
    static final String[] dfa_7s = {
            "\1\32\1\33\1\17\3\uffff\1\34\1\uffff\1\25\1\27\1\31\3\uffff\1\12\1\13\4\uffff\1\24\1\26\1\30\2\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\22\2\uffff\1\14\1\5\1\7\1\11\2\uffff\1\4\1\6\1\10\1\uffff\1\3\3\uffff\1\1\1\15\1\uffff\1\2\2\uffff\1\16\25\uffff\1\37\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\41",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2352:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0004000000001A00L,0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0004000000001A02L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x00000008C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000800001000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000C00L,0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003C00C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000000C0F20000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000370006000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});

}