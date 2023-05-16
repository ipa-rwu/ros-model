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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "Connections", "Interfaces", "Parameters", "Processes", "GraphName", "Float32_1", "Float64_1", "Default", "Duration", "Feedback", "FromPub", "FromSub", "String_2", "Threads", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "FromAC", "FromAS", "FromSC", "FromSS", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Int8_1", "Nodes", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "From", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "HyphenMinusLeftSquareBracket", "LeftSquareBracketRightSquareBracket", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=8;
    public static final int Float32_1=13;
    public static final int Node=70;
    public static final int RULE_DATE_TIME=91;
    public static final int Uint64_1=24;
    public static final int String=43;
    public static final int Processes=11;
    public static final int Int16=57;
    public static final int Float32=27;
    public static final int Goal=67;
    public static final int Bool=65;
    public static final int FromPub=18;
    public static final int Uint16=52;
    public static final int Boolean=25;
    public static final int Uint8=61;
    public static final int Parameters=10;
    public static final int RULE_ID=92;
    public static final int RULE_DIGIT=81;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=33;
    public static final int Header=42;
    public static final int RULE_INT=94;
    public static final int Byte=66;
    public static final int RULE_ML_COMMENT=101;
    public static final int LeftSquareBracket=79;
    public static final int Base64=40;
    public static final int FromSS=32;
    public static final int Comma=77;
    public static final int RULE_MESSAGE_ASIGMENT=95;
    public static final int LeftSquareBracketRightSquareBracket=76;
    public static final int Int32=58;
    public static final int RULE_DECINT=84;
    public static final int Uint32=53;
    public static final int RULE_HOUR=89;
    public static final int Int8=68;
    public static final int Default=15;
    public static final int Int8_1=48;
    public static final int Uint16_1=22;
    public static final int Type=72;
    public static final int Float64=28;
    public static final int Int32_1=34;
    public static final int FromSC=31;
    public static final int RULE_BINARY=82;
    public static final int String_1=51;
    public static final int String_2=20;
    public static final int FromAC=29;
    public static final int RULE_DAY=86;
    public static final int RULE_BEGIN=96;
    public static final int RULE_BOOLEAN=83;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=88;
    public static final int Result=50;
    public static final int Name=69;
    public static final int RULE_MIN_SEC=90;
    public static final int FromAS=30;
    public static final int ParameterAny=7;
    public static final int List=64;
    public static final int RightSquareBracket=80;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=47;
    public static final int Float64_1=14;
    public static final int Duration=16;
    public static final int Uint32_1=23;
    public static final int Double=41;
    public static final int Type_1=60;
    public static final int Value=62;
    public static final int Uint64=54;
    public static final int Action=45;
    public static final int RULE_END=97;
    public static final int Message=36;
    public static final int Value_1=55;
    public static final int Time=71;
    public static final int RULE_STRING=93;
    public static final int Bool_1=46;
    public static final int Any=73;
    public static final int Struct=44;
    public static final int RULE_SL_COMMENT=98;
    public static final int Uint8_1=38;
    public static final int RULE_DOUBLE=85;
    public static final int Feedback=17;
    public static final int RULE_ROS_CONVENTION_A=99;
    public static final int RULE_ROS_CONVENTION_PARAM=100;
    public static final int Colon=78;
    public static final int EOF=-1;
    public static final int FromSub=19;
    public static final int Ns=74;
    public static final int RULE_WS=102;
    public static final int HyphenMinusLeftSquareBracket=75;
    public static final int Int64_1=35;
    public static final int Service=37;
    public static final int From=56;
    public static final int RULE_ANY_OTHER=103;
    public static final int Nodes=49;
    public static final int Date=63;
    public static final int Interfaces=9;
    public static final int Threads=21;
    public static final int Integer=26;
    public static final int Array=39;
    public static final int Int64=59;
    public static final int RULE_MONTH=87;

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
            tokenNameToValue.put("Default", "'default:'");
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



    // $ANTLR start "entryRuleSystem"
    // InternalRosSystemParser.g:132:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:133:1: ( ruleSystem EOF )
            // InternalRosSystemParser.g:134:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule());
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule());
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalRosSystemParser.g:141:1: ruleSystem : ( ruleRosSystem ) ;
    public final void ruleSystem() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:145:2: ( ( ruleRosSystem ) )
            // InternalRosSystemParser.g:146:2: ( ruleRosSystem )
            {
            // InternalRosSystemParser.g:146:2: ( ruleRosSystem )
            // InternalRosSystemParser.g:147:3: ruleRosSystem
            {
             before(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());
            pushFollow(FOLLOW_2);
            ruleRosSystem();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystemParser.g:157:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:158:1: ( ruleRosSystem EOF )
            // InternalRosSystemParser.g:159:1: ruleRosSystem EOF
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
    // InternalRosSystemParser.g:166:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:170:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystemParser.g:171:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystemParser.g:171:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystemParser.g:172:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup());
            // InternalRosSystemParser.g:173:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystemParser.g:173:4: rule__RosSystem__Group__0
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
    // InternalRosSystemParser.g:182:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:183:1: ( ruleProcess EOF )
            // InternalRosSystemParser.g:184:1: ruleProcess EOF
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
    // InternalRosSystemParser.g:191:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:195:2: ( ( ( rule__Process__Group__0 ) ) )
            // InternalRosSystemParser.g:196:2: ( ( rule__Process__Group__0 ) )
            {
            // InternalRosSystemParser.g:196:2: ( ( rule__Process__Group__0 ) )
            // InternalRosSystemParser.g:197:3: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup());
            // InternalRosSystemParser.g:198:3: ( rule__Process__Group__0 )
            // InternalRosSystemParser.g:198:4: rule__Process__Group__0
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
    // InternalRosSystemParser.g:207:1: entryRuleRosNode : ruleRosNode EOF ;
    public final void entryRuleRosNode() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:208:1: ( ruleRosNode EOF )
            // InternalRosSystemParser.g:209:1: ruleRosNode EOF
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
    // InternalRosSystemParser.g:216:1: ruleRosNode : ( ( rule__RosNode__Group__0 ) ) ;
    public final void ruleRosNode() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:220:2: ( ( ( rule__RosNode__Group__0 ) ) )
            // InternalRosSystemParser.g:221:2: ( ( rule__RosNode__Group__0 ) )
            {
            // InternalRosSystemParser.g:221:2: ( ( rule__RosNode__Group__0 ) )
            // InternalRosSystemParser.g:222:3: ( rule__RosNode__Group__0 )
            {
             before(grammarAccess.getRosNodeAccess().getGroup());
            // InternalRosSystemParser.g:223:3: ( rule__RosNode__Group__0 )
            // InternalRosSystemParser.g:223:4: rule__RosNode__Group__0
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
    // InternalRosSystemParser.g:232:1: entryRuleRosInterface : ruleRosInterface EOF ;
    public final void entryRuleRosInterface() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:233:1: ( ruleRosInterface EOF )
            // InternalRosSystemParser.g:234:1: ruleRosInterface EOF
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
    // InternalRosSystemParser.g:241:1: ruleRosInterface : ( ( rule__RosInterface__Group__0 ) ) ;
    public final void ruleRosInterface() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:245:2: ( ( ( rule__RosInterface__Group__0 ) ) )
            // InternalRosSystemParser.g:246:2: ( ( rule__RosInterface__Group__0 ) )
            {
            // InternalRosSystemParser.g:246:2: ( ( rule__RosInterface__Group__0 ) )
            // InternalRosSystemParser.g:247:3: ( rule__RosInterface__Group__0 )
            {
             before(grammarAccess.getRosInterfaceAccess().getGroup());
            // InternalRosSystemParser.g:248:3: ( rule__RosInterface__Group__0 )
            // InternalRosSystemParser.g:248:4: rule__RosInterface__Group__0
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
    // InternalRosSystemParser.g:257:1: entryRuleInterfaceReference : ruleInterfaceReference EOF ;
    public final void entryRuleInterfaceReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:258:1: ( ruleInterfaceReference EOF )
            // InternalRosSystemParser.g:259:1: ruleInterfaceReference EOF
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
    // InternalRosSystemParser.g:266:1: ruleInterfaceReference : ( ( rule__InterfaceReference__Alternatives ) ) ;
    public final void ruleInterfaceReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:270:2: ( ( ( rule__InterfaceReference__Alternatives ) ) )
            // InternalRosSystemParser.g:271:2: ( ( rule__InterfaceReference__Alternatives ) )
            {
            // InternalRosSystemParser.g:271:2: ( ( rule__InterfaceReference__Alternatives ) )
            // InternalRosSystemParser.g:272:3: ( rule__InterfaceReference__Alternatives )
            {
             before(grammarAccess.getInterfaceReferenceAccess().getAlternatives());
            // InternalRosSystemParser.g:273:3: ( rule__InterfaceReference__Alternatives )
            // InternalRosSystemParser.g:273:4: rule__InterfaceReference__Alternatives
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
    // InternalRosSystemParser.g:282:1: entryRuleInterfaceReference_Impl : ruleInterfaceReference_Impl EOF ;
    public final void entryRuleInterfaceReference_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:283:1: ( ruleInterfaceReference_Impl EOF )
            // InternalRosSystemParser.g:284:1: ruleInterfaceReference_Impl EOF
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
    // InternalRosSystemParser.g:291:1: ruleInterfaceReference_Impl : ( () ) ;
    public final void ruleInterfaceReference_Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:295:2: ( ( () ) )
            // InternalRosSystemParser.g:296:2: ( () )
            {
            // InternalRosSystemParser.g:296:2: ( () )
            // InternalRosSystemParser.g:297:3: ()
            {
             before(grammarAccess.getInterfaceReference_ImplAccess().getInterfaceReferenceAction());
            // InternalRosSystemParser.g:298:3: ()
            // InternalRosSystemParser.g:298:4:
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
    // InternalRosSystemParser.g:307:1: entryRuleRosPublisherReference : ruleRosPublisherReference EOF ;
    public final void entryRuleRosPublisherReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:308:1: ( ruleRosPublisherReference EOF )
            // InternalRosSystemParser.g:309:1: ruleRosPublisherReference EOF
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
    // InternalRosSystemParser.g:316:1: ruleRosPublisherReference : ( ( rule__RosPublisherReference__Group__0 ) ) ;
    public final void ruleRosPublisherReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:320:2: ( ( ( rule__RosPublisherReference__Group__0 ) ) )
            // InternalRosSystemParser.g:321:2: ( ( rule__RosPublisherReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:321:2: ( ( rule__RosPublisherReference__Group__0 ) )
            // InternalRosSystemParser.g:322:3: ( rule__RosPublisherReference__Group__0 )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getGroup());
            // InternalRosSystemParser.g:323:3: ( rule__RosPublisherReference__Group__0 )
            // InternalRosSystemParser.g:323:4: rule__RosPublisherReference__Group__0
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
    // InternalRosSystemParser.g:332:1: entryRuleRosSubscriberReference : ruleRosSubscriberReference EOF ;
    public final void entryRuleRosSubscriberReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:333:1: ( ruleRosSubscriberReference EOF )
            // InternalRosSystemParser.g:334:1: ruleRosSubscriberReference EOF
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
    // InternalRosSystemParser.g:341:1: ruleRosSubscriberReference : ( ( rule__RosSubscriberReference__Group__0 ) ) ;
    public final void ruleRosSubscriberReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:345:2: ( ( ( rule__RosSubscriberReference__Group__0 ) ) )
            // InternalRosSystemParser.g:346:2: ( ( rule__RosSubscriberReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:346:2: ( ( rule__RosSubscriberReference__Group__0 ) )
            // InternalRosSystemParser.g:347:3: ( rule__RosSubscriberReference__Group__0 )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getGroup());
            // InternalRosSystemParser.g:348:3: ( rule__RosSubscriberReference__Group__0 )
            // InternalRosSystemParser.g:348:4: rule__RosSubscriberReference__Group__0
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
    // InternalRosSystemParser.g:357:1: entryRuleRosServiceServerReference : ruleRosServiceServerReference EOF ;
    public final void entryRuleRosServiceServerReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:358:1: ( ruleRosServiceServerReference EOF )
            // InternalRosSystemParser.g:359:1: ruleRosServiceServerReference EOF
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
    // InternalRosSystemParser.g:366:1: ruleRosServiceServerReference : ( ( rule__RosServiceServerReference__Group__0 ) ) ;
    public final void ruleRosServiceServerReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:370:2: ( ( ( rule__RosServiceServerReference__Group__0 ) ) )
            // InternalRosSystemParser.g:371:2: ( ( rule__RosServiceServerReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:371:2: ( ( rule__RosServiceServerReference__Group__0 ) )
            // InternalRosSystemParser.g:372:3: ( rule__RosServiceServerReference__Group__0 )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getGroup());
            // InternalRosSystemParser.g:373:3: ( rule__RosServiceServerReference__Group__0 )
            // InternalRosSystemParser.g:373:4: rule__RosServiceServerReference__Group__0
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
    // InternalRosSystemParser.g:382:1: entryRuleRosServerClientReference : ruleRosServerClientReference EOF ;
    public final void entryRuleRosServerClientReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:383:1: ( ruleRosServerClientReference EOF )
            // InternalRosSystemParser.g:384:1: ruleRosServerClientReference EOF
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
    // InternalRosSystemParser.g:391:1: ruleRosServerClientReference : ( ( rule__RosServerClientReference__Group__0 ) ) ;
    public final void ruleRosServerClientReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:395:2: ( ( ( rule__RosServerClientReference__Group__0 ) ) )
            // InternalRosSystemParser.g:396:2: ( ( rule__RosServerClientReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:396:2: ( ( rule__RosServerClientReference__Group__0 ) )
            // InternalRosSystemParser.g:397:3: ( rule__RosServerClientReference__Group__0 )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getGroup());
            // InternalRosSystemParser.g:398:3: ( rule__RosServerClientReference__Group__0 )
            // InternalRosSystemParser.g:398:4: rule__RosServerClientReference__Group__0
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
    // InternalRosSystemParser.g:407:1: entryRuleRosActionServerReference : ruleRosActionServerReference EOF ;
    public final void entryRuleRosActionServerReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:408:1: ( ruleRosActionServerReference EOF )
            // InternalRosSystemParser.g:409:1: ruleRosActionServerReference EOF
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
    // InternalRosSystemParser.g:416:1: ruleRosActionServerReference : ( ( rule__RosActionServerReference__Group__0 ) ) ;
    public final void ruleRosActionServerReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:420:2: ( ( ( rule__RosActionServerReference__Group__0 ) ) )
            // InternalRosSystemParser.g:421:2: ( ( rule__RosActionServerReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:421:2: ( ( rule__RosActionServerReference__Group__0 ) )
            // InternalRosSystemParser.g:422:3: ( rule__RosActionServerReference__Group__0 )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getGroup());
            // InternalRosSystemParser.g:423:3: ( rule__RosActionServerReference__Group__0 )
            // InternalRosSystemParser.g:423:4: rule__RosActionServerReference__Group__0
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
    // InternalRosSystemParser.g:432:1: entryRuleRosActionClientReference : ruleRosActionClientReference EOF ;
    public final void entryRuleRosActionClientReference() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:433:1: ( ruleRosActionClientReference EOF )
            // InternalRosSystemParser.g:434:1: ruleRosActionClientReference EOF
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
    // InternalRosSystemParser.g:441:1: ruleRosActionClientReference : ( ( rule__RosActionClientReference__Group__0 ) ) ;
    public final void ruleRosActionClientReference() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:445:2: ( ( ( rule__RosActionClientReference__Group__0 ) ) )
            // InternalRosSystemParser.g:446:2: ( ( rule__RosActionClientReference__Group__0 ) )
            {
            // InternalRosSystemParser.g:446:2: ( ( rule__RosActionClientReference__Group__0 ) )
            // InternalRosSystemParser.g:447:3: ( rule__RosActionClientReference__Group__0 )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getGroup());
            // InternalRosSystemParser.g:448:3: ( rule__RosActionClientReference__Group__0 )
            // InternalRosSystemParser.g:448:4: rule__RosActionClientReference__Group__0
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
    // InternalRosSystemParser.g:457:1: entryRuleRosParameter : ruleRosParameter EOF ;
    public final void entryRuleRosParameter() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:458:1: ( ruleRosParameter EOF )
            // InternalRosSystemParser.g:459:1: ruleRosParameter EOF
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
    // InternalRosSystemParser.g:466:1: ruleRosParameter : ( ( rule__RosParameter__Group__0 ) ) ;
    public final void ruleRosParameter() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:470:2: ( ( ( rule__RosParameter__Group__0 ) ) )
            // InternalRosSystemParser.g:471:2: ( ( rule__RosParameter__Group__0 ) )
            {
            // InternalRosSystemParser.g:471:2: ( ( rule__RosParameter__Group__0 ) )
            // InternalRosSystemParser.g:472:3: ( rule__RosParameter__Group__0 )
            {
             before(grammarAccess.getRosParameterAccess().getGroup());
            // InternalRosSystemParser.g:473:3: ( rule__RosParameter__Group__0 )
            // InternalRosSystemParser.g:473:4: rule__RosParameter__Group__0
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
    // InternalRosSystemParser.g:482:1: entryRuleRosConnection : ruleRosConnection EOF ;
    public final void entryRuleRosConnection() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:483:1: ( ruleRosConnection EOF )
            // InternalRosSystemParser.g:484:1: ruleRosConnection EOF
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
    // InternalRosSystemParser.g:491:1: ruleRosConnection : ( ( rule__RosConnection__Group__0 ) ) ;
    public final void ruleRosConnection() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:495:2: ( ( ( rule__RosConnection__Group__0 ) ) )
            // InternalRosSystemParser.g:496:2: ( ( rule__RosConnection__Group__0 ) )
            {
            // InternalRosSystemParser.g:496:2: ( ( rule__RosConnection__Group__0 ) )
            // InternalRosSystemParser.g:497:3: ( rule__RosConnection__Group__0 )
            {
             before(grammarAccess.getRosConnectionAccess().getGroup());
            // InternalRosSystemParser.g:498:3: ( rule__RosConnection__Group__0 )
            // InternalRosSystemParser.g:498:4: rule__RosConnection__Group__0
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
    // InternalRosSystemParser.g:507:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:508:1: ( ruleNamespace EOF )
            // InternalRosSystemParser.g:509:1: ruleNamespace EOF
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
    // InternalRosSystemParser.g:516:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:520:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalRosSystemParser.g:521:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalRosSystemParser.g:521:2: ( ( rule__Namespace__Alternatives ) )
            // InternalRosSystemParser.g:522:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives());
            // InternalRosSystemParser.g:523:3: ( rule__Namespace__Alternatives )
            // InternalRosSystemParser.g:523:4: rule__Namespace__Alternatives
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
    // InternalRosSystemParser.g:532:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:533:1: ( ruleGraphName EOF )
            // InternalRosSystemParser.g:534:1: ruleGraphName EOF
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
    // InternalRosSystemParser.g:541:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:545:2: ( ( GraphName ) )
            // InternalRosSystemParser.g:546:2: ( GraphName )
            {
            // InternalRosSystemParser.g:546:2: ( GraphName )
            // InternalRosSystemParser.g:547:3: GraphName
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
    // InternalRosSystemParser.g:557:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:558:1: ( ruleGlobalNamespace EOF )
            // InternalRosSystemParser.g:559:1: ruleGlobalNamespace EOF
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
    // InternalRosSystemParser.g:566:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:570:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:571:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:571:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalRosSystemParser.g:572:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup());
            // InternalRosSystemParser.g:573:3: ( rule__GlobalNamespace__Group__0 )
            // InternalRosSystemParser.g:573:4: rule__GlobalNamespace__Group__0
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
    // InternalRosSystemParser.g:582:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:583:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalRosSystemParser.g:584:1: ruleRelativeNamespace_Impl EOF
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
    // InternalRosSystemParser.g:591:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:595:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalRosSystemParser.g:596:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalRosSystemParser.g:596:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalRosSystemParser.g:597:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup());
            // InternalRosSystemParser.g:598:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalRosSystemParser.g:598:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalRosSystemParser.g:607:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:608:1: ( rulePrivateNamespace EOF )
            // InternalRosSystemParser.g:609:1: rulePrivateNamespace EOF
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
    // InternalRosSystemParser.g:616:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:620:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:621:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:621:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalRosSystemParser.g:622:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup());
            // InternalRosSystemParser.g:623:3: ( rule__PrivateNamespace__Group__0 )
            // InternalRosSystemParser.g:623:4: rule__PrivateNamespace__Group__0
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


    // $ANTLR start "entryRuleParameterType"
    // InternalRosSystemParser.g:632:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:633:1: ( ruleParameterType EOF )
            // InternalRosSystemParser.g:634:1: ruleParameterType EOF
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
    // InternalRosSystemParser.g:641:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:645:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalRosSystemParser.g:646:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalRosSystemParser.g:646:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalRosSystemParser.g:647:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives());
            // InternalRosSystemParser.g:648:3: ( rule__ParameterType__Alternatives )
            // InternalRosSystemParser.g:648:4: rule__ParameterType__Alternatives
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
    // InternalRosSystemParser.g:657:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:658:1: ( ruleParameterValue EOF )
            // InternalRosSystemParser.g:659:1: ruleParameterValue EOF
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
    // InternalRosSystemParser.g:666:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:670:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalRosSystemParser.g:671:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalRosSystemParser.g:671:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalRosSystemParser.g:672:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives());
            // InternalRosSystemParser.g:673:3: ( rule__ParameterValue__Alternatives )
            // InternalRosSystemParser.g:673:4: rule__ParameterValue__Alternatives
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
    // InternalRosSystemParser.g:682:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:683:1: ( ruleParameterListType EOF )
            // InternalRosSystemParser.g:684:1: ruleParameterListType EOF
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
    // InternalRosSystemParser.g:691:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:695:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalRosSystemParser.g:696:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalRosSystemParser.g:696:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalRosSystemParser.g:697:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup());
            // InternalRosSystemParser.g:698:3: ( rule__ParameterListType__Group__0 )
            // InternalRosSystemParser.g:698:4: rule__ParameterListType__Group__0
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
    // InternalRosSystemParser.g:707:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:708:1: ( ruleParameterStructType EOF )
            // InternalRosSystemParser.g:709:1: ruleParameterStructType EOF
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
    // InternalRosSystemParser.g:716:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:720:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalRosSystemParser.g:721:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalRosSystemParser.g:721:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalRosSystemParser.g:722:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup());
            // InternalRosSystemParser.g:723:3: ( rule__ParameterStructType__Group__0 )
            // InternalRosSystemParser.g:723:4: rule__ParameterStructType__Group__0
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
    // InternalRosSystemParser.g:732:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:733:1: ( ruleParameterIntegerType EOF )
            // InternalRosSystemParser.g:734:1: ruleParameterIntegerType EOF
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
    // InternalRosSystemParser.g:741:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:745:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalRosSystemParser.g:746:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalRosSystemParser.g:746:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalRosSystemParser.g:747:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup());
            // InternalRosSystemParser.g:748:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalRosSystemParser.g:748:4: rule__ParameterIntegerType__Group__0
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
    // InternalRosSystemParser.g:757:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:758:1: ( ruleParameterStringType EOF )
            // InternalRosSystemParser.g:759:1: ruleParameterStringType EOF
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
    // InternalRosSystemParser.g:766:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:770:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalRosSystemParser.g:771:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalRosSystemParser.g:771:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalRosSystemParser.g:772:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup());
            // InternalRosSystemParser.g:773:3: ( rule__ParameterStringType__Group__0 )
            // InternalRosSystemParser.g:773:4: rule__ParameterStringType__Group__0
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
    // InternalRosSystemParser.g:782:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:783:1: ( ruleParameterDoubleType EOF )
            // InternalRosSystemParser.g:784:1: ruleParameterDoubleType EOF
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
    // InternalRosSystemParser.g:791:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:795:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalRosSystemParser.g:796:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalRosSystemParser.g:796:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalRosSystemParser.g:797:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup());
            // InternalRosSystemParser.g:798:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalRosSystemParser.g:798:4: rule__ParameterDoubleType__Group__0
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
    // InternalRosSystemParser.g:807:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:808:1: ( ruleParameterBooleanType EOF )
            // InternalRosSystemParser.g:809:1: ruleParameterBooleanType EOF
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
    // InternalRosSystemParser.g:816:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:820:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalRosSystemParser.g:821:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalRosSystemParser.g:821:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalRosSystemParser.g:822:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup());
            // InternalRosSystemParser.g:823:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalRosSystemParser.g:823:4: rule__ParameterBooleanType__Group__0
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
    // InternalRosSystemParser.g:832:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:833:1: ( ruleParameterBase64Type EOF )
            // InternalRosSystemParser.g:834:1: ruleParameterBase64Type EOF
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
    // InternalRosSystemParser.g:841:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:845:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalRosSystemParser.g:846:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalRosSystemParser.g:846:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalRosSystemParser.g:847:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup());
            // InternalRosSystemParser.g:848:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalRosSystemParser.g:848:4: rule__ParameterBase64Type__Group__0
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
    // InternalRosSystemParser.g:857:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:858:1: ( ruleParameterArrayType EOF )
            // InternalRosSystemParser.g:859:1: ruleParameterArrayType EOF
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
    // InternalRosSystemParser.g:866:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:870:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalRosSystemParser.g:871:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalRosSystemParser.g:871:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalRosSystemParser.g:872:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup());
            // InternalRosSystemParser.g:873:3: ( rule__ParameterArrayType__Group__0 )
            // InternalRosSystemParser.g:873:4: rule__ParameterArrayType__Group__0
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
    // InternalRosSystemParser.g:882:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:883:1: ( ruleParameterList EOF )
            // InternalRosSystemParser.g:884:1: ruleParameterList EOF
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
    // InternalRosSystemParser.g:891:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:895:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalRosSystemParser.g:896:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalRosSystemParser.g:896:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalRosSystemParser.g:897:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup());
            // InternalRosSystemParser.g:898:3: ( rule__ParameterList__Group__0 )
            // InternalRosSystemParser.g:898:4: rule__ParameterList__Group__0
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
    // InternalRosSystemParser.g:907:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:908:1: ( ruleParameterAny EOF )
            // InternalRosSystemParser.g:909:1: ruleParameterAny EOF
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
    // InternalRosSystemParser.g:916:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:920:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalRosSystemParser.g:921:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalRosSystemParser.g:921:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalRosSystemParser.g:922:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup());
            // InternalRosSystemParser.g:923:3: ( rule__ParameterAny__Group__0 )
            // InternalRosSystemParser.g:923:4: rule__ParameterAny__Group__0
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
    // InternalRosSystemParser.g:932:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:933:1: ( ruleParameterString EOF )
            // InternalRosSystemParser.g:934:1: ruleParameterString EOF
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
    // InternalRosSystemParser.g:941:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:945:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalRosSystemParser.g:946:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:946:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalRosSystemParser.g:947:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment());
            // InternalRosSystemParser.g:948:3: ( rule__ParameterString__ValueAssignment )
            // InternalRosSystemParser.g:948:4: rule__ParameterString__ValueAssignment
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
    // InternalRosSystemParser.g:957:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:958:1: ( ruleParameterBase64 EOF )
            // InternalRosSystemParser.g:959:1: ruleParameterBase64 EOF
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
    // InternalRosSystemParser.g:966:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:970:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalRosSystemParser.g:971:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:971:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalRosSystemParser.g:972:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment());
            // InternalRosSystemParser.g:973:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalRosSystemParser.g:973:4: rule__ParameterBase64__ValueAssignment
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
    // InternalRosSystemParser.g:982:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:983:1: ( ruleParameterInteger EOF )
            // InternalRosSystemParser.g:984:1: ruleParameterInteger EOF
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
    // InternalRosSystemParser.g:991:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:995:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalRosSystemParser.g:996:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:996:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalRosSystemParser.g:997:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment());
            // InternalRosSystemParser.g:998:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalRosSystemParser.g:998:4: rule__ParameterInteger__ValueAssignment
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
    // InternalRosSystemParser.g:1007:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1008:1: ( ruleParameterDouble EOF )
            // InternalRosSystemParser.g:1009:1: ruleParameterDouble EOF
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
    // InternalRosSystemParser.g:1016:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1020:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1021:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1021:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalRosSystemParser.g:1022:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment());
            // InternalRosSystemParser.g:1023:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalRosSystemParser.g:1023:4: rule__ParameterDouble__ValueAssignment
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
    // InternalRosSystemParser.g:1032:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1033:1: ( ruleParameterBoolean EOF )
            // InternalRosSystemParser.g:1034:1: ruleParameterBoolean EOF
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
    // InternalRosSystemParser.g:1041:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1045:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1046:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1046:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalRosSystemParser.g:1047:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment());
            // InternalRosSystemParser.g:1048:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalRosSystemParser.g:1048:4: rule__ParameterBoolean__ValueAssignment
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
    // InternalRosSystemParser.g:1057:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1058:1: ( ruleParameterStruct EOF )
            // InternalRosSystemParser.g:1059:1: ruleParameterStruct EOF
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
    // InternalRosSystemParser.g:1066:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1070:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalRosSystemParser.g:1071:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalRosSystemParser.g:1071:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalRosSystemParser.g:1072:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup());
            // InternalRosSystemParser.g:1073:3: ( rule__ParameterStruct__Group__0 )
            // InternalRosSystemParser.g:1073:4: rule__ParameterStruct__Group__0
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
    // InternalRosSystemParser.g:1082:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1083:1: ( ruleParameterDate EOF )
            // InternalRosSystemParser.g:1084:1: ruleParameterDate EOF
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
    // InternalRosSystemParser.g:1091:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1095:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalRosSystemParser.g:1096:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:1096:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalRosSystemParser.g:1097:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment());
            // InternalRosSystemParser.g:1098:3: ( rule__ParameterDate__ValueAssignment )
            // InternalRosSystemParser.g:1098:4: rule__ParameterDate__ValueAssignment
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
    // InternalRosSystemParser.g:1107:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1108:1: ( ruleParameterStructMember EOF )
            // InternalRosSystemParser.g:1109:1: ruleParameterStructMember EOF
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
    // InternalRosSystemParser.g:1116:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1120:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalRosSystemParser.g:1121:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:1121:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalRosSystemParser.g:1122:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup());
            // InternalRosSystemParser.g:1123:3: ( rule__ParameterStructMember__Group__0 )
            // InternalRosSystemParser.g:1123:4: rule__ParameterStructMember__Group__0
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
    // InternalRosSystemParser.g:1132:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1133:1: ( ruleParameterStructTypeMember EOF )
            // InternalRosSystemParser.g:1134:1: ruleParameterStructTypeMember EOF
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
    // InternalRosSystemParser.g:1141:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1145:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalRosSystemParser.g:1146:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:1146:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalRosSystemParser.g:1147:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup());
            // InternalRosSystemParser.g:1148:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalRosSystemParser.g:1148:4: rule__ParameterStructTypeMember__Group__0
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
    // InternalRosSystemParser.g:1157:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1158:1: ( ruleBase64Binary EOF )
            // InternalRosSystemParser.g:1159:1: ruleBase64Binary EOF
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
    // InternalRosSystemParser.g:1166:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1170:2: ( ( RULE_BINARY ) )
            // InternalRosSystemParser.g:1171:2: ( RULE_BINARY )
            {
            // InternalRosSystemParser.g:1171:2: ( RULE_BINARY )
            // InternalRosSystemParser.g:1172:3: RULE_BINARY
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
    // InternalRosSystemParser.g:1182:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1183:1: ( ruleboolean0 EOF )
            // InternalRosSystemParser.g:1184:1: ruleboolean0 EOF
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
    // InternalRosSystemParser.g:1191:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1195:2: ( ( RULE_BOOLEAN ) )
            // InternalRosSystemParser.g:1196:2: ( RULE_BOOLEAN )
            {
            // InternalRosSystemParser.g:1196:2: ( RULE_BOOLEAN )
            // InternalRosSystemParser.g:1197:3: RULE_BOOLEAN
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
    // InternalRosSystemParser.g:1207:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1208:1: ( ruleDouble0 EOF )
            // InternalRosSystemParser.g:1209:1: ruleDouble0 EOF
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
    // InternalRosSystemParser.g:1216:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1220:2: ( ( RULE_DOUBLE ) )
            // InternalRosSystemParser.g:1221:2: ( RULE_DOUBLE )
            {
            // InternalRosSystemParser.g:1221:2: ( RULE_DOUBLE )
            // InternalRosSystemParser.g:1222:3: RULE_DOUBLE
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
    // InternalRosSystemParser.g:1232:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1233:1: ( ruleInteger0 EOF )
            // InternalRosSystemParser.g:1234:1: ruleInteger0 EOF
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
    // InternalRosSystemParser.g:1241:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1245:2: ( ( RULE_DECINT ) )
            // InternalRosSystemParser.g:1246:2: ( RULE_DECINT )
            {
            // InternalRosSystemParser.g:1246:2: ( RULE_DECINT )
            // InternalRosSystemParser.g:1247:3: RULE_DECINT
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
    // InternalRosSystemParser.g:1257:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1258:1: ( ruleDateTime0 EOF )
            // InternalRosSystemParser.g:1259:1: ruleDateTime0 EOF
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
    // InternalRosSystemParser.g:1266:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1270:2: ( ( RULE_DATE_TIME ) )
            // InternalRosSystemParser.g:1271:2: ( RULE_DATE_TIME )
            {
            // InternalRosSystemParser.g:1271:2: ( RULE_DATE_TIME )
            // InternalRosSystemParser.g:1272:3: RULE_DATE_TIME
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
    // InternalRosSystemParser.g:1282:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1283:1: ( ruleAbstractType EOF )
            // InternalRosSystemParser.g:1284:1: ruleAbstractType EOF
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
    // InternalRosSystemParser.g:1291:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1295:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalRosSystemParser.g:1296:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalRosSystemParser.g:1296:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalRosSystemParser.g:1297:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives());
            // InternalRosSystemParser.g:1298:3: ( rule__AbstractType__Alternatives )
            // InternalRosSystemParser.g:1298:4: rule__AbstractType__Alternatives
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
    // InternalRosSystemParser.g:1307:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1308:1: ( rulebool EOF )
            // InternalRosSystemParser.g:1309:1: rulebool EOF
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
    // InternalRosSystemParser.g:1316:1: rulebool : ( ( rule__Bool__Group__0 ) ) ;
    public final void rulebool() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1320:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalRosSystemParser.g:1321:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalRosSystemParser.g:1321:2: ( ( rule__Bool__Group__0 ) )
            // InternalRosSystemParser.g:1322:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup());
            // InternalRosSystemParser.g:1323:3: ( rule__Bool__Group__0 )
            // InternalRosSystemParser.g:1323:4: rule__Bool__Group__0
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
    // InternalRosSystemParser.g:1332:1: entryRuleint8 : ruleint8 EOF ;
    public final void entryRuleint8() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1333:1: ( ruleint8 EOF )
            // InternalRosSystemParser.g:1334:1: ruleint8 EOF
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
    // InternalRosSystemParser.g:1341:1: ruleint8 : ( ( rule__Int8__Group__0 ) ) ;
    public final void ruleint8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1345:2: ( ( ( rule__Int8__Group__0 ) ) )
            // InternalRosSystemParser.g:1346:2: ( ( rule__Int8__Group__0 ) )
            {
            // InternalRosSystemParser.g:1346:2: ( ( rule__Int8__Group__0 ) )
            // InternalRosSystemParser.g:1347:3: ( rule__Int8__Group__0 )
            {
             before(grammarAccess.getInt8Access().getGroup());
            // InternalRosSystemParser.g:1348:3: ( rule__Int8__Group__0 )
            // InternalRosSystemParser.g:1348:4: rule__Int8__Group__0
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
    // InternalRosSystemParser.g:1357:1: entryRuleuint8 : ruleuint8 EOF ;
    public final void entryRuleuint8() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1358:1: ( ruleuint8 EOF )
            // InternalRosSystemParser.g:1359:1: ruleuint8 EOF
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
    // InternalRosSystemParser.g:1366:1: ruleuint8 : ( ( rule__Uint8__Group__0 ) ) ;
    public final void ruleuint8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1370:2: ( ( ( rule__Uint8__Group__0 ) ) )
            // InternalRosSystemParser.g:1371:2: ( ( rule__Uint8__Group__0 ) )
            {
            // InternalRosSystemParser.g:1371:2: ( ( rule__Uint8__Group__0 ) )
            // InternalRosSystemParser.g:1372:3: ( rule__Uint8__Group__0 )
            {
             before(grammarAccess.getUint8Access().getGroup());
            // InternalRosSystemParser.g:1373:3: ( rule__Uint8__Group__0 )
            // InternalRosSystemParser.g:1373:4: rule__Uint8__Group__0
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
    // InternalRosSystemParser.g:1382:1: entryRuleint16 : ruleint16 EOF ;
    public final void entryRuleint16() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1383:1: ( ruleint16 EOF )
            // InternalRosSystemParser.g:1384:1: ruleint16 EOF
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
    // InternalRosSystemParser.g:1391:1: ruleint16 : ( ( rule__Int16__Group__0 ) ) ;
    public final void ruleint16() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1395:2: ( ( ( rule__Int16__Group__0 ) ) )
            // InternalRosSystemParser.g:1396:2: ( ( rule__Int16__Group__0 ) )
            {
            // InternalRosSystemParser.g:1396:2: ( ( rule__Int16__Group__0 ) )
            // InternalRosSystemParser.g:1397:3: ( rule__Int16__Group__0 )
            {
             before(grammarAccess.getInt16Access().getGroup());
            // InternalRosSystemParser.g:1398:3: ( rule__Int16__Group__0 )
            // InternalRosSystemParser.g:1398:4: rule__Int16__Group__0
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
    // InternalRosSystemParser.g:1407:1: entryRuleuint16 : ruleuint16 EOF ;
    public final void entryRuleuint16() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1408:1: ( ruleuint16 EOF )
            // InternalRosSystemParser.g:1409:1: ruleuint16 EOF
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
    // InternalRosSystemParser.g:1416:1: ruleuint16 : ( ( rule__Uint16__Group__0 ) ) ;
    public final void ruleuint16() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1420:2: ( ( ( rule__Uint16__Group__0 ) ) )
            // InternalRosSystemParser.g:1421:2: ( ( rule__Uint16__Group__0 ) )
            {
            // InternalRosSystemParser.g:1421:2: ( ( rule__Uint16__Group__0 ) )
            // InternalRosSystemParser.g:1422:3: ( rule__Uint16__Group__0 )
            {
             before(grammarAccess.getUint16Access().getGroup());
            // InternalRosSystemParser.g:1423:3: ( rule__Uint16__Group__0 )
            // InternalRosSystemParser.g:1423:4: rule__Uint16__Group__0
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
    // InternalRosSystemParser.g:1432:1: entryRuleint32 : ruleint32 EOF ;
    public final void entryRuleint32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1433:1: ( ruleint32 EOF )
            // InternalRosSystemParser.g:1434:1: ruleint32 EOF
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
    // InternalRosSystemParser.g:1441:1: ruleint32 : ( ( rule__Int32__Group__0 ) ) ;
    public final void ruleint32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1445:2: ( ( ( rule__Int32__Group__0 ) ) )
            // InternalRosSystemParser.g:1446:2: ( ( rule__Int32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1446:2: ( ( rule__Int32__Group__0 ) )
            // InternalRosSystemParser.g:1447:3: ( rule__Int32__Group__0 )
            {
             before(grammarAccess.getInt32Access().getGroup());
            // InternalRosSystemParser.g:1448:3: ( rule__Int32__Group__0 )
            // InternalRosSystemParser.g:1448:4: rule__Int32__Group__0
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
    // InternalRosSystemParser.g:1457:1: entryRuleuint32 : ruleuint32 EOF ;
    public final void entryRuleuint32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1458:1: ( ruleuint32 EOF )
            // InternalRosSystemParser.g:1459:1: ruleuint32 EOF
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
    // InternalRosSystemParser.g:1466:1: ruleuint32 : ( ( rule__Uint32__Group__0 ) ) ;
    public final void ruleuint32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1470:2: ( ( ( rule__Uint32__Group__0 ) ) )
            // InternalRosSystemParser.g:1471:2: ( ( rule__Uint32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1471:2: ( ( rule__Uint32__Group__0 ) )
            // InternalRosSystemParser.g:1472:3: ( rule__Uint32__Group__0 )
            {
             before(grammarAccess.getUint32Access().getGroup());
            // InternalRosSystemParser.g:1473:3: ( rule__Uint32__Group__0 )
            // InternalRosSystemParser.g:1473:4: rule__Uint32__Group__0
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
    // InternalRosSystemParser.g:1482:1: entryRuleint64 : ruleint64 EOF ;
    public final void entryRuleint64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1483:1: ( ruleint64 EOF )
            // InternalRosSystemParser.g:1484:1: ruleint64 EOF
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
    // InternalRosSystemParser.g:1491:1: ruleint64 : ( ( rule__Int64__Group__0 ) ) ;
    public final void ruleint64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1495:2: ( ( ( rule__Int64__Group__0 ) ) )
            // InternalRosSystemParser.g:1496:2: ( ( rule__Int64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1496:2: ( ( rule__Int64__Group__0 ) )
            // InternalRosSystemParser.g:1497:3: ( rule__Int64__Group__0 )
            {
             before(grammarAccess.getInt64Access().getGroup());
            // InternalRosSystemParser.g:1498:3: ( rule__Int64__Group__0 )
            // InternalRosSystemParser.g:1498:4: rule__Int64__Group__0
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
    // InternalRosSystemParser.g:1507:1: entryRuleuint64 : ruleuint64 EOF ;
    public final void entryRuleuint64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1508:1: ( ruleuint64 EOF )
            // InternalRosSystemParser.g:1509:1: ruleuint64 EOF
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
    // InternalRosSystemParser.g:1516:1: ruleuint64 : ( ( rule__Uint64__Group__0 ) ) ;
    public final void ruleuint64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1520:2: ( ( ( rule__Uint64__Group__0 ) ) )
            // InternalRosSystemParser.g:1521:2: ( ( rule__Uint64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1521:2: ( ( rule__Uint64__Group__0 ) )
            // InternalRosSystemParser.g:1522:3: ( rule__Uint64__Group__0 )
            {
             before(grammarAccess.getUint64Access().getGroup());
            // InternalRosSystemParser.g:1523:3: ( rule__Uint64__Group__0 )
            // InternalRosSystemParser.g:1523:4: rule__Uint64__Group__0
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
    // InternalRosSystemParser.g:1532:1: entryRulefloat32 : rulefloat32 EOF ;
    public final void entryRulefloat32() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1533:1: ( rulefloat32 EOF )
            // InternalRosSystemParser.g:1534:1: rulefloat32 EOF
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
    // InternalRosSystemParser.g:1541:1: rulefloat32 : ( ( rule__Float32__Group__0 ) ) ;
    public final void rulefloat32() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1545:2: ( ( ( rule__Float32__Group__0 ) ) )
            // InternalRosSystemParser.g:1546:2: ( ( rule__Float32__Group__0 ) )
            {
            // InternalRosSystemParser.g:1546:2: ( ( rule__Float32__Group__0 ) )
            // InternalRosSystemParser.g:1547:3: ( rule__Float32__Group__0 )
            {
             before(grammarAccess.getFloat32Access().getGroup());
            // InternalRosSystemParser.g:1548:3: ( rule__Float32__Group__0 )
            // InternalRosSystemParser.g:1548:4: rule__Float32__Group__0
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
    // InternalRosSystemParser.g:1557:1: entryRulefloat64 : rulefloat64 EOF ;
    public final void entryRulefloat64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1558:1: ( rulefloat64 EOF )
            // InternalRosSystemParser.g:1559:1: rulefloat64 EOF
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
    // InternalRosSystemParser.g:1566:1: rulefloat64 : ( ( rule__Float64__Group__0 ) ) ;
    public final void rulefloat64() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1570:2: ( ( ( rule__Float64__Group__0 ) ) )
            // InternalRosSystemParser.g:1571:2: ( ( rule__Float64__Group__0 ) )
            {
            // InternalRosSystemParser.g:1571:2: ( ( rule__Float64__Group__0 ) )
            // InternalRosSystemParser.g:1572:3: ( rule__Float64__Group__0 )
            {
             before(grammarAccess.getFloat64Access().getGroup());
            // InternalRosSystemParser.g:1573:3: ( rule__Float64__Group__0 )
            // InternalRosSystemParser.g:1573:4: rule__Float64__Group__0
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
    // InternalRosSystemParser.g:1582:1: entryRulestring0 : rulestring0 EOF ;
    public final void entryRulestring0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1583:1: ( rulestring0 EOF )
            // InternalRosSystemParser.g:1584:1: rulestring0 EOF
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
    // InternalRosSystemParser.g:1591:1: rulestring0 : ( ( rule__String0__Group__0 ) ) ;
    public final void rulestring0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1595:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalRosSystemParser.g:1596:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalRosSystemParser.g:1596:2: ( ( rule__String0__Group__0 ) )
            // InternalRosSystemParser.g:1597:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup());
            // InternalRosSystemParser.g:1598:3: ( rule__String0__Group__0 )
            // InternalRosSystemParser.g:1598:4: rule__String0__Group__0
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
    // InternalRosSystemParser.g:1607:1: entryRulebyte : rulebyte EOF ;
    public final void entryRulebyte() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1608:1: ( rulebyte EOF )
            // InternalRosSystemParser.g:1609:1: rulebyte EOF
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
    // InternalRosSystemParser.g:1616:1: rulebyte : ( ( rule__Byte__Group__0 ) ) ;
    public final void rulebyte() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1620:2: ( ( ( rule__Byte__Group__0 ) ) )
            // InternalRosSystemParser.g:1621:2: ( ( rule__Byte__Group__0 ) )
            {
            // InternalRosSystemParser.g:1621:2: ( ( rule__Byte__Group__0 ) )
            // InternalRosSystemParser.g:1622:3: ( rule__Byte__Group__0 )
            {
             before(grammarAccess.getByteAccess().getGroup());
            // InternalRosSystemParser.g:1623:3: ( rule__Byte__Group__0 )
            // InternalRosSystemParser.g:1623:4: rule__Byte__Group__0
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
    // InternalRosSystemParser.g:1632:1: entryRuletime : ruletime EOF ;
    public final void entryRuletime() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1633:1: ( ruletime EOF )
            // InternalRosSystemParser.g:1634:1: ruletime EOF
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
    // InternalRosSystemParser.g:1641:1: ruletime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruletime() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1645:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalRosSystemParser.g:1646:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalRosSystemParser.g:1646:2: ( ( rule__Time__Group__0 ) )
            // InternalRosSystemParser.g:1647:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup());
            // InternalRosSystemParser.g:1648:3: ( rule__Time__Group__0 )
            // InternalRosSystemParser.g:1648:4: rule__Time__Group__0
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
    // InternalRosSystemParser.g:1657:1: entryRuleduration : ruleduration EOF ;
    public final void entryRuleduration() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1658:1: ( ruleduration EOF )
            // InternalRosSystemParser.g:1659:1: ruleduration EOF
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
    // InternalRosSystemParser.g:1666:1: ruleduration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleduration() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1670:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalRosSystemParser.g:1671:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalRosSystemParser.g:1671:2: ( ( rule__Duration__Group__0 ) )
            // InternalRosSystemParser.g:1672:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup());
            // InternalRosSystemParser.g:1673:3: ( rule__Duration__Group__0 )
            // InternalRosSystemParser.g:1673:4: rule__Duration__Group__0
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
    // InternalRosSystemParser.g:1682:1: entryRuleboolArray : ruleboolArray EOF ;
    public final void entryRuleboolArray() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1683:1: ( ruleboolArray EOF )
            // InternalRosSystemParser.g:1684:1: ruleboolArray EOF
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
    // InternalRosSystemParser.g:1691:1: ruleboolArray : ( ( rule__BoolArray__Group__0 ) ) ;
    public final void ruleboolArray() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1695:2: ( ( ( rule__BoolArray__Group__0 ) ) )
            // InternalRosSystemParser.g:1696:2: ( ( rule__BoolArray__Group__0 ) )
            {
            // InternalRosSystemParser.g:1696:2: ( ( rule__BoolArray__Group__0 ) )
            // InternalRosSystemParser.g:1697:3: ( rule__BoolArray__Group__0 )
            {
             before(grammarAccess.getBoolArrayAccess().getGroup());
            // InternalRosSystemParser.g:1698:3: ( rule__BoolArray__Group__0 )
            // InternalRosSystemParser.g:1698:4: rule__BoolArray__Group__0
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
    // InternalRosSystemParser.g:1707:1: entryRuleint8Array : ruleint8Array EOF ;
    public final void entryRuleint8Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1708:1: ( ruleint8Array EOF )
            // InternalRosSystemParser.g:1709:1: ruleint8Array EOF
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
    // InternalRosSystemParser.g:1716:1: ruleint8Array : ( ( rule__Int8Array__Group__0 ) ) ;
    public final void ruleint8Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1720:2: ( ( ( rule__Int8Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1721:2: ( ( rule__Int8Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1721:2: ( ( rule__Int8Array__Group__0 ) )
            // InternalRosSystemParser.g:1722:3: ( rule__Int8Array__Group__0 )
            {
             before(grammarAccess.getInt8ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1723:3: ( rule__Int8Array__Group__0 )
            // InternalRosSystemParser.g:1723:4: rule__Int8Array__Group__0
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
    // InternalRosSystemParser.g:1732:1: entryRuleuint8Array : ruleuint8Array EOF ;
    public final void entryRuleuint8Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1733:1: ( ruleuint8Array EOF )
            // InternalRosSystemParser.g:1734:1: ruleuint8Array EOF
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
    // InternalRosSystemParser.g:1741:1: ruleuint8Array : ( ( rule__Uint8Array__Group__0 ) ) ;
    public final void ruleuint8Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1745:2: ( ( ( rule__Uint8Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1746:2: ( ( rule__Uint8Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1746:2: ( ( rule__Uint8Array__Group__0 ) )
            // InternalRosSystemParser.g:1747:3: ( rule__Uint8Array__Group__0 )
            {
             before(grammarAccess.getUint8ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1748:3: ( rule__Uint8Array__Group__0 )
            // InternalRosSystemParser.g:1748:4: rule__Uint8Array__Group__0
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
    // InternalRosSystemParser.g:1757:1: entryRuleint16Array : ruleint16Array EOF ;
    public final void entryRuleint16Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1758:1: ( ruleint16Array EOF )
            // InternalRosSystemParser.g:1759:1: ruleint16Array EOF
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
    // InternalRosSystemParser.g:1766:1: ruleint16Array : ( ( rule__Int16Array__Group__0 ) ) ;
    public final void ruleint16Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1770:2: ( ( ( rule__Int16Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1771:2: ( ( rule__Int16Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1771:2: ( ( rule__Int16Array__Group__0 ) )
            // InternalRosSystemParser.g:1772:3: ( rule__Int16Array__Group__0 )
            {
             before(grammarAccess.getInt16ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1773:3: ( rule__Int16Array__Group__0 )
            // InternalRosSystemParser.g:1773:4: rule__Int16Array__Group__0
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
    // InternalRosSystemParser.g:1782:1: entryRuleuint16Array : ruleuint16Array EOF ;
    public final void entryRuleuint16Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1783:1: ( ruleuint16Array EOF )
            // InternalRosSystemParser.g:1784:1: ruleuint16Array EOF
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
    // InternalRosSystemParser.g:1791:1: ruleuint16Array : ( ( rule__Uint16Array__Group__0 ) ) ;
    public final void ruleuint16Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1795:2: ( ( ( rule__Uint16Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1796:2: ( ( rule__Uint16Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1796:2: ( ( rule__Uint16Array__Group__0 ) )
            // InternalRosSystemParser.g:1797:3: ( rule__Uint16Array__Group__0 )
            {
             before(grammarAccess.getUint16ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1798:3: ( rule__Uint16Array__Group__0 )
            // InternalRosSystemParser.g:1798:4: rule__Uint16Array__Group__0
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
    // InternalRosSystemParser.g:1807:1: entryRuleint32Array : ruleint32Array EOF ;
    public final void entryRuleint32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1808:1: ( ruleint32Array EOF )
            // InternalRosSystemParser.g:1809:1: ruleint32Array EOF
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
    // InternalRosSystemParser.g:1816:1: ruleint32Array : ( ( rule__Int32Array__Group__0 ) ) ;
    public final void ruleint32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1820:2: ( ( ( rule__Int32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1821:2: ( ( rule__Int32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1821:2: ( ( rule__Int32Array__Group__0 ) )
            // InternalRosSystemParser.g:1822:3: ( rule__Int32Array__Group__0 )
            {
             before(grammarAccess.getInt32ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1823:3: ( rule__Int32Array__Group__0 )
            // InternalRosSystemParser.g:1823:4: rule__Int32Array__Group__0
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
    // InternalRosSystemParser.g:1832:1: entryRuleuint32Array : ruleuint32Array EOF ;
    public final void entryRuleuint32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1833:1: ( ruleuint32Array EOF )
            // InternalRosSystemParser.g:1834:1: ruleuint32Array EOF
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
    // InternalRosSystemParser.g:1841:1: ruleuint32Array : ( ( rule__Uint32Array__Group__0 ) ) ;
    public final void ruleuint32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1845:2: ( ( ( rule__Uint32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1846:2: ( ( rule__Uint32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1846:2: ( ( rule__Uint32Array__Group__0 ) )
            // InternalRosSystemParser.g:1847:3: ( rule__Uint32Array__Group__0 )
            {
             before(grammarAccess.getUint32ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1848:3: ( rule__Uint32Array__Group__0 )
            // InternalRosSystemParser.g:1848:4: rule__Uint32Array__Group__0
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
    // InternalRosSystemParser.g:1857:1: entryRuleint64Array : ruleint64Array EOF ;
    public final void entryRuleint64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1858:1: ( ruleint64Array EOF )
            // InternalRosSystemParser.g:1859:1: ruleint64Array EOF
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
    // InternalRosSystemParser.g:1866:1: ruleint64Array : ( ( rule__Int64Array__Group__0 ) ) ;
    public final void ruleint64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1870:2: ( ( ( rule__Int64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1871:2: ( ( rule__Int64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1871:2: ( ( rule__Int64Array__Group__0 ) )
            // InternalRosSystemParser.g:1872:3: ( rule__Int64Array__Group__0 )
            {
             before(grammarAccess.getInt64ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1873:3: ( rule__Int64Array__Group__0 )
            // InternalRosSystemParser.g:1873:4: rule__Int64Array__Group__0
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
    // InternalRosSystemParser.g:1882:1: entryRuleuint64Array : ruleuint64Array EOF ;
    public final void entryRuleuint64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1883:1: ( ruleuint64Array EOF )
            // InternalRosSystemParser.g:1884:1: ruleuint64Array EOF
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
    // InternalRosSystemParser.g:1891:1: ruleuint64Array : ( ( rule__Uint64Array__Group__0 ) ) ;
    public final void ruleuint64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1895:2: ( ( ( rule__Uint64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1896:2: ( ( rule__Uint64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1896:2: ( ( rule__Uint64Array__Group__0 ) )
            // InternalRosSystemParser.g:1897:3: ( rule__Uint64Array__Group__0 )
            {
             before(grammarAccess.getUint64ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1898:3: ( rule__Uint64Array__Group__0 )
            // InternalRosSystemParser.g:1898:4: rule__Uint64Array__Group__0
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
    // InternalRosSystemParser.g:1907:1: entryRulefloat32Array : rulefloat32Array EOF ;
    public final void entryRulefloat32Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1908:1: ( rulefloat32Array EOF )
            // InternalRosSystemParser.g:1909:1: rulefloat32Array EOF
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
    // InternalRosSystemParser.g:1916:1: rulefloat32Array : ( ( rule__Float32Array__Group__0 ) ) ;
    public final void rulefloat32Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1920:2: ( ( ( rule__Float32Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1921:2: ( ( rule__Float32Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1921:2: ( ( rule__Float32Array__Group__0 ) )
            // InternalRosSystemParser.g:1922:3: ( rule__Float32Array__Group__0 )
            {
             before(grammarAccess.getFloat32ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1923:3: ( rule__Float32Array__Group__0 )
            // InternalRosSystemParser.g:1923:4: rule__Float32Array__Group__0
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
    // InternalRosSystemParser.g:1932:1: entryRulefloat64Array : rulefloat64Array EOF ;
    public final void entryRulefloat64Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1933:1: ( rulefloat64Array EOF )
            // InternalRosSystemParser.g:1934:1: rulefloat64Array EOF
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
    // InternalRosSystemParser.g:1941:1: rulefloat64Array : ( ( rule__Float64Array__Group__0 ) ) ;
    public final void rulefloat64Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1945:2: ( ( ( rule__Float64Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1946:2: ( ( rule__Float64Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1946:2: ( ( rule__Float64Array__Group__0 ) )
            // InternalRosSystemParser.g:1947:3: ( rule__Float64Array__Group__0 )
            {
             before(grammarAccess.getFloat64ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1948:3: ( rule__Float64Array__Group__0 )
            // InternalRosSystemParser.g:1948:4: rule__Float64Array__Group__0
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
    // InternalRosSystemParser.g:1957:1: entryRulestring0Array : rulestring0Array EOF ;
    public final void entryRulestring0Array() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1958:1: ( rulestring0Array EOF )
            // InternalRosSystemParser.g:1959:1: rulestring0Array EOF
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
    // InternalRosSystemParser.g:1966:1: rulestring0Array : ( ( rule__String0Array__Group__0 ) ) ;
    public final void rulestring0Array() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1970:2: ( ( ( rule__String0Array__Group__0 ) ) )
            // InternalRosSystemParser.g:1971:2: ( ( rule__String0Array__Group__0 ) )
            {
            // InternalRosSystemParser.g:1971:2: ( ( rule__String0Array__Group__0 ) )
            // InternalRosSystemParser.g:1972:3: ( rule__String0Array__Group__0 )
            {
             before(grammarAccess.getString0ArrayAccess().getGroup());
            // InternalRosSystemParser.g:1973:3: ( rule__String0Array__Group__0 )
            // InternalRosSystemParser.g:1973:4: rule__String0Array__Group__0
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
    // InternalRosSystemParser.g:1982:1: entryRulebyteArray : rulebyteArray EOF ;
    public final void entryRulebyteArray() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:1983:1: ( rulebyteArray EOF )
            // InternalRosSystemParser.g:1984:1: rulebyteArray EOF
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
    // InternalRosSystemParser.g:1991:1: rulebyteArray : ( ( rule__ByteArray__Group__0 ) ) ;
    public final void rulebyteArray() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:1995:2: ( ( ( rule__ByteArray__Group__0 ) ) )
            // InternalRosSystemParser.g:1996:2: ( ( rule__ByteArray__Group__0 ) )
            {
            // InternalRosSystemParser.g:1996:2: ( ( rule__ByteArray__Group__0 ) )
            // InternalRosSystemParser.g:1997:3: ( rule__ByteArray__Group__0 )
            {
             before(grammarAccess.getByteArrayAccess().getGroup());
            // InternalRosSystemParser.g:1998:3: ( rule__ByteArray__Group__0 )
            // InternalRosSystemParser.g:1998:4: rule__ByteArray__Group__0
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
    // InternalRosSystemParser.g:2007:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2008:1: ( ruleHeader EOF )
            // InternalRosSystemParser.g:2009:1: ruleHeader EOF
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
    // InternalRosSystemParser.g:2016:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2020:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalRosSystemParser.g:2021:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalRosSystemParser.g:2021:2: ( ( rule__Header__Group__0 ) )
            // InternalRosSystemParser.g:2022:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup());
            // InternalRosSystemParser.g:2023:3: ( rule__Header__Group__0 )
            // InternalRosSystemParser.g:2023:4: rule__Header__Group__0
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
    // InternalRosSystemParser.g:2032:1: entryRuleTopicSpecRef : ruleTopicSpecRef EOF ;
    public final void entryRuleTopicSpecRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2033:1: ( ruleTopicSpecRef EOF )
            // InternalRosSystemParser.g:2034:1: ruleTopicSpecRef EOF
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
    // InternalRosSystemParser.g:2041:1: ruleTopicSpecRef : ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) ;
    public final void ruleTopicSpecRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2045:2: ( ( ( rule__TopicSpecRef__TopicSpecAssignment ) ) )
            // InternalRosSystemParser.g:2046:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            {
            // InternalRosSystemParser.g:2046:2: ( ( rule__TopicSpecRef__TopicSpecAssignment ) )
            // InternalRosSystemParser.g:2047:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecAssignment());
            // InternalRosSystemParser.g:2048:3: ( rule__TopicSpecRef__TopicSpecAssignment )
            // InternalRosSystemParser.g:2048:4: rule__TopicSpecRef__TopicSpecAssignment
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
    // InternalRosSystemParser.g:2057:1: entryRuleArrayTopicSpecRef : ruleArrayTopicSpecRef EOF ;
    public final void entryRuleArrayTopicSpecRef() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2058:1: ( ruleArrayTopicSpecRef EOF )
            // InternalRosSystemParser.g:2059:1: ruleArrayTopicSpecRef EOF
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
    // InternalRosSystemParser.g:2066:1: ruleArrayTopicSpecRef : ( ( rule__ArrayTopicSpecRef__Group__0 ) ) ;
    public final void ruleArrayTopicSpecRef() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2070:2: ( ( ( rule__ArrayTopicSpecRef__Group__0 ) ) )
            // InternalRosSystemParser.g:2071:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            {
            // InternalRosSystemParser.g:2071:2: ( ( rule__ArrayTopicSpecRef__Group__0 ) )
            // InternalRosSystemParser.g:2072:3: ( rule__ArrayTopicSpecRef__Group__0 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getGroup());
            // InternalRosSystemParser.g:2073:3: ( rule__ArrayTopicSpecRef__Group__0 )
            // InternalRosSystemParser.g:2073:4: rule__ArrayTopicSpecRef__Group__0
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
    // InternalRosSystemParser.g:2082:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2083:1: ( ruleKEYWORD EOF )
            // InternalRosSystemParser.g:2084:1: ruleKEYWORD EOF
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
    // InternalRosSystemParser.g:2091:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2095:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalRosSystemParser.g:2096:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalRosSystemParser.g:2096:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalRosSystemParser.g:2097:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives());
            // InternalRosSystemParser.g:2098:3: ( rule__KEYWORD__Alternatives )
            // InternalRosSystemParser.g:2098:4: rule__KEYWORD__Alternatives
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
    // InternalRosSystemParser.g:2107:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:2108:1: ( ruleEString EOF )
            // InternalRosSystemParser.g:2109:1: ruleEString EOF
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
    // InternalRosSystemParser.g:2116:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2120:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystemParser.g:2121:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystemParser.g:2121:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystemParser.g:2122:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives());
            // InternalRosSystemParser.g:2123:3: ( rule__EString__Alternatives )
            // InternalRosSystemParser.g:2123:4: rule__EString__Alternatives
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
    // InternalRosSystemParser.g:2131:1: rule__RosSystem__Alternatives_3 : ( ( ( rule__RosSystem__Group_3_0__0 ) ) | ( ( rule__RosSystem__Group_3_1__0 ) ) | ( ( rule__RosSystem__Group_3_2__0 ) ) | ( ( rule__RosSystem__Group_3_3__0 ) ) );
    public final void rule__RosSystem__Alternatives_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2135:1: ( ( ( rule__RosSystem__Group_3_0__0 ) ) | ( ( rule__RosSystem__Group_3_1__0 ) ) | ( ( rule__RosSystem__Group_3_2__0 ) ) | ( ( rule__RosSystem__Group_3_3__0 ) ) )
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
                    // InternalRosSystemParser.g:2136:2: ( ( rule__RosSystem__Group_3_0__0 ) )
                    {
                    // InternalRosSystemParser.g:2136:2: ( ( rule__RosSystem__Group_3_0__0 ) )
                    // InternalRosSystemParser.g:2137:3: ( rule__RosSystem__Group_3_0__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_0());
                    // InternalRosSystemParser.g:2138:3: ( rule__RosSystem__Group_3_0__0 )
                    // InternalRosSystemParser.g:2138:4: rule__RosSystem__Group_3_0__0
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
                    // InternalRosSystemParser.g:2142:2: ( ( rule__RosSystem__Group_3_1__0 ) )
                    {
                    // InternalRosSystemParser.g:2142:2: ( ( rule__RosSystem__Group_3_1__0 ) )
                    // InternalRosSystemParser.g:2143:3: ( rule__RosSystem__Group_3_1__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_1());
                    // InternalRosSystemParser.g:2144:3: ( rule__RosSystem__Group_3_1__0 )
                    // InternalRosSystemParser.g:2144:4: rule__RosSystem__Group_3_1__0
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
                    // InternalRosSystemParser.g:2148:2: ( ( rule__RosSystem__Group_3_2__0 ) )
                    {
                    // InternalRosSystemParser.g:2148:2: ( ( rule__RosSystem__Group_3_2__0 ) )
                    // InternalRosSystemParser.g:2149:3: ( rule__RosSystem__Group_3_2__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_2());
                    // InternalRosSystemParser.g:2150:3: ( rule__RosSystem__Group_3_2__0 )
                    // InternalRosSystemParser.g:2150:4: rule__RosSystem__Group_3_2__0
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
                    // InternalRosSystemParser.g:2154:2: ( ( rule__RosSystem__Group_3_3__0 ) )
                    {
                    // InternalRosSystemParser.g:2154:2: ( ( rule__RosSystem__Group_3_3__0 ) )
                    // InternalRosSystemParser.g:2155:3: ( rule__RosSystem__Group_3_3__0 )
                    {
                     before(grammarAccess.getRosSystemAccess().getGroup_3_3());
                    // InternalRosSystemParser.g:2156:3: ( rule__RosSystem__Group_3_3__0 )
                    // InternalRosSystemParser.g:2156:4: rule__RosSystem__Group_3_3__0
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
    // InternalRosSystemParser.g:2164:1: rule__InterfaceReference__Alternatives : ( ( ruleInterfaceReference_Impl ) | ( ruleRosPublisherReference ) | ( ruleRosSubscriberReference ) | ( ruleRosServiceServerReference ) | ( ruleRosServerClientReference ) | ( ruleRosActionServerReference ) | ( ruleRosActionClientReference ) );
    public final void rule__InterfaceReference__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2168:1: ( ( ruleInterfaceReference_Impl ) | ( ruleRosPublisherReference ) | ( ruleRosSubscriberReference ) | ( ruleRosServiceServerReference ) | ( ruleRosServerClientReference ) | ( ruleRosActionServerReference ) | ( ruleRosActionClientReference ) )
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
                    // InternalRosSystemParser.g:2169:2: ( ruleInterfaceReference_Impl )
                    {
                    // InternalRosSystemParser.g:2169:2: ( ruleInterfaceReference_Impl )
                    // InternalRosSystemParser.g:2170:3: ruleInterfaceReference_Impl
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
                    // InternalRosSystemParser.g:2175:2: ( ruleRosPublisherReference )
                    {
                    // InternalRosSystemParser.g:2175:2: ( ruleRosPublisherReference )
                    // InternalRosSystemParser.g:2176:3: ruleRosPublisherReference
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
                    // InternalRosSystemParser.g:2181:2: ( ruleRosSubscriberReference )
                    {
                    // InternalRosSystemParser.g:2181:2: ( ruleRosSubscriberReference )
                    // InternalRosSystemParser.g:2182:3: ruleRosSubscriberReference
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
                    // InternalRosSystemParser.g:2187:2: ( ruleRosServiceServerReference )
                    {
                    // InternalRosSystemParser.g:2187:2: ( ruleRosServiceServerReference )
                    // InternalRosSystemParser.g:2188:3: ruleRosServiceServerReference
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
                    // InternalRosSystemParser.g:2193:2: ( ruleRosServerClientReference )
                    {
                    // InternalRosSystemParser.g:2193:2: ( ruleRosServerClientReference )
                    // InternalRosSystemParser.g:2194:3: ruleRosServerClientReference
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
                    // InternalRosSystemParser.g:2199:2: ( ruleRosActionServerReference )
                    {
                    // InternalRosSystemParser.g:2199:2: ( ruleRosActionServerReference )
                    // InternalRosSystemParser.g:2200:3: ruleRosActionServerReference
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
                    // InternalRosSystemParser.g:2205:2: ( ruleRosActionClientReference )
                    {
                    // InternalRosSystemParser.g:2205:2: ( ruleRosActionClientReference )
                    // InternalRosSystemParser.g:2206:3: ruleRosActionClientReference
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
    // InternalRosSystemParser.g:2215:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2219:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
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
                    // InternalRosSystemParser.g:2220:2: ( ruleGlobalNamespace )
                    {
                    // InternalRosSystemParser.g:2220:2: ( ruleGlobalNamespace )
                    // InternalRosSystemParser.g:2221:3: ruleGlobalNamespace
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
                    // InternalRosSystemParser.g:2226:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalRosSystemParser.g:2226:2: ( ruleRelativeNamespace_Impl )
                    // InternalRosSystemParser.g:2227:3: ruleRelativeNamespace_Impl
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
                    // InternalRosSystemParser.g:2232:2: ( rulePrivateNamespace )
                    {
                    // InternalRosSystemParser.g:2232:2: ( rulePrivateNamespace )
                    // InternalRosSystemParser.g:2233:3: rulePrivateNamespace
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
    // InternalRosSystemParser.g:2242:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2246:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
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
            case RULE_BEGIN:
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
                    // InternalRosSystemParser.g:2247:2: ( ruleParameterListType )
                    {
                    // InternalRosSystemParser.g:2247:2: ( ruleParameterListType )
                    // InternalRosSystemParser.g:2248:3: ruleParameterListType
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
                    // InternalRosSystemParser.g:2253:2: ( ruleParameterStructType )
                    {
                    // InternalRosSystemParser.g:2253:2: ( ruleParameterStructType )
                    // InternalRosSystemParser.g:2254:3: ruleParameterStructType
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
                    // InternalRosSystemParser.g:2259:2: ( ruleParameterIntegerType )
                    {
                    // InternalRosSystemParser.g:2259:2: ( ruleParameterIntegerType )
                    // InternalRosSystemParser.g:2260:3: ruleParameterIntegerType
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
                    // InternalRosSystemParser.g:2265:2: ( ruleParameterStringType )
                    {
                    // InternalRosSystemParser.g:2265:2: ( ruleParameterStringType )
                    // InternalRosSystemParser.g:2266:3: ruleParameterStringType
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
                    // InternalRosSystemParser.g:2271:2: ( ruleParameterDoubleType )
                    {
                    // InternalRosSystemParser.g:2271:2: ( ruleParameterDoubleType )
                    // InternalRosSystemParser.g:2272:3: ruleParameterDoubleType
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
                    // InternalRosSystemParser.g:2277:2: ( ruleParameterBooleanType )
                    {
                    // InternalRosSystemParser.g:2277:2: ( ruleParameterBooleanType )
                    // InternalRosSystemParser.g:2278:3: ruleParameterBooleanType
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
                    // InternalRosSystemParser.g:2283:2: ( ruleParameterBase64Type )
                    {
                    // InternalRosSystemParser.g:2283:2: ( ruleParameterBase64Type )
                    // InternalRosSystemParser.g:2284:3: ruleParameterBase64Type
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
                    // InternalRosSystemParser.g:2289:2: ( ruleParameterArrayType )
                    {
                    // InternalRosSystemParser.g:2289:2: ( ruleParameterArrayType )
                    // InternalRosSystemParser.g:2290:3: ruleParameterArrayType
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
    // InternalRosSystemParser.g:2299:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2303:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt5=7;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalRosSystemParser.g:2304:2: ( ruleParameterString )
                    {
                    // InternalRosSystemParser.g:2304:2: ( ruleParameterString )
                    // InternalRosSystemParser.g:2305:3: ruleParameterString
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
                    // InternalRosSystemParser.g:2310:2: ( ruleParameterBase64 )
                    {
                    // InternalRosSystemParser.g:2310:2: ( ruleParameterBase64 )
                    // InternalRosSystemParser.g:2311:3: ruleParameterBase64
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
                    // InternalRosSystemParser.g:2316:2: ( ruleParameterInteger )
                    {
                    // InternalRosSystemParser.g:2316:2: ( ruleParameterInteger )
                    // InternalRosSystemParser.g:2317:3: ruleParameterInteger
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
                    // InternalRosSystemParser.g:2322:2: ( ruleParameterDouble )
                    {
                    // InternalRosSystemParser.g:2322:2: ( ruleParameterDouble )
                    // InternalRosSystemParser.g:2323:3: ruleParameterDouble
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
                    // InternalRosSystemParser.g:2328:2: ( ruleParameterBoolean )
                    {
                    // InternalRosSystemParser.g:2328:2: ( ruleParameterBoolean )
                    // InternalRosSystemParser.g:2329:3: ruleParameterBoolean
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
                    // InternalRosSystemParser.g:2334:2: ( ruleParameterList )
                    {
                    // InternalRosSystemParser.g:2334:2: ( ruleParameterList )
                    // InternalRosSystemParser.g:2335:3: ruleParameterList
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
                    // InternalRosSystemParser.g:2340:2: ( ruleParameterStruct )
                    {
                    // InternalRosSystemParser.g:2340:2: ( ruleParameterStruct )
                    // InternalRosSystemParser.g:2341:3: ruleParameterStruct
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
    // InternalRosSystemParser.g:2350:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2354:1: ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) )
            int alt6=31;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalRosSystemParser.g:2355:2: ( rulebool )
                    {
                    // InternalRosSystemParser.g:2355:2: ( rulebool )
                    // InternalRosSystemParser.g:2356:3: rulebool
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
                    // InternalRosSystemParser.g:2361:2: ( ruleint8 )
                    {
                    // InternalRosSystemParser.g:2361:2: ( ruleint8 )
                    // InternalRosSystemParser.g:2362:3: ruleint8
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
                    // InternalRosSystemParser.g:2367:2: ( ruleuint8 )
                    {
                    // InternalRosSystemParser.g:2367:2: ( ruleuint8 )
                    // InternalRosSystemParser.g:2368:3: ruleuint8
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
                    // InternalRosSystemParser.g:2373:2: ( ruleint16 )
                    {
                    // InternalRosSystemParser.g:2373:2: ( ruleint16 )
                    // InternalRosSystemParser.g:2374:3: ruleint16
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
                    // InternalRosSystemParser.g:2379:2: ( ruleuint16 )
                    {
                    // InternalRosSystemParser.g:2379:2: ( ruleuint16 )
                    // InternalRosSystemParser.g:2380:3: ruleuint16
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
                    // InternalRosSystemParser.g:2385:2: ( ruleint32 )
                    {
                    // InternalRosSystemParser.g:2385:2: ( ruleint32 )
                    // InternalRosSystemParser.g:2386:3: ruleint32
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
                    // InternalRosSystemParser.g:2391:2: ( ruleuint32 )
                    {
                    // InternalRosSystemParser.g:2391:2: ( ruleuint32 )
                    // InternalRosSystemParser.g:2392:3: ruleuint32
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
                    // InternalRosSystemParser.g:2397:2: ( ruleint64 )
                    {
                    // InternalRosSystemParser.g:2397:2: ( ruleint64 )
                    // InternalRosSystemParser.g:2398:3: ruleint64
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
                    // InternalRosSystemParser.g:2403:2: ( ruleuint64 )
                    {
                    // InternalRosSystemParser.g:2403:2: ( ruleuint64 )
                    // InternalRosSystemParser.g:2404:3: ruleuint64
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
                    // InternalRosSystemParser.g:2409:2: ( rulefloat32 )
                    {
                    // InternalRosSystemParser.g:2409:2: ( rulefloat32 )
                    // InternalRosSystemParser.g:2410:3: rulefloat32
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
                    // InternalRosSystemParser.g:2415:2: ( rulefloat64 )
                    {
                    // InternalRosSystemParser.g:2415:2: ( rulefloat64 )
                    // InternalRosSystemParser.g:2416:3: rulefloat64
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
                    // InternalRosSystemParser.g:2421:2: ( rulestring0 )
                    {
                    // InternalRosSystemParser.g:2421:2: ( rulestring0 )
                    // InternalRosSystemParser.g:2422:3: rulestring0
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
                    // InternalRosSystemParser.g:2427:2: ( rulebyte )
                    {
                    // InternalRosSystemParser.g:2427:2: ( rulebyte )
                    // InternalRosSystemParser.g:2428:3: rulebyte
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
                    // InternalRosSystemParser.g:2433:2: ( ruletime )
                    {
                    // InternalRosSystemParser.g:2433:2: ( ruletime )
                    // InternalRosSystemParser.g:2434:3: ruletime
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
                    // InternalRosSystemParser.g:2439:2: ( ruleduration )
                    {
                    // InternalRosSystemParser.g:2439:2: ( ruleduration )
                    // InternalRosSystemParser.g:2440:3: ruleduration
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
                    // InternalRosSystemParser.g:2445:2: ( ruleHeader )
                    {
                    // InternalRosSystemParser.g:2445:2: ( ruleHeader )
                    // InternalRosSystemParser.g:2446:3: ruleHeader
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
                    // InternalRosSystemParser.g:2451:2: ( ruleboolArray )
                    {
                    // InternalRosSystemParser.g:2451:2: ( ruleboolArray )
                    // InternalRosSystemParser.g:2452:3: ruleboolArray
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
                    // InternalRosSystemParser.g:2457:2: ( ruleint8Array )
                    {
                    // InternalRosSystemParser.g:2457:2: ( ruleint8Array )
                    // InternalRosSystemParser.g:2458:3: ruleint8Array
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
                    // InternalRosSystemParser.g:2463:2: ( ruleuint8Array )
                    {
                    // InternalRosSystemParser.g:2463:2: ( ruleuint8Array )
                    // InternalRosSystemParser.g:2464:3: ruleuint8Array
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
                    // InternalRosSystemParser.g:2469:2: ( ruleint16Array )
                    {
                    // InternalRosSystemParser.g:2469:2: ( ruleint16Array )
                    // InternalRosSystemParser.g:2470:3: ruleint16Array
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
                    // InternalRosSystemParser.g:2475:2: ( ruleuint16Array )
                    {
                    // InternalRosSystemParser.g:2475:2: ( ruleuint16Array )
                    // InternalRosSystemParser.g:2476:3: ruleuint16Array
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
                    // InternalRosSystemParser.g:2481:2: ( ruleint32Array )
                    {
                    // InternalRosSystemParser.g:2481:2: ( ruleint32Array )
                    // InternalRosSystemParser.g:2482:3: ruleint32Array
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
                    // InternalRosSystemParser.g:2487:2: ( ruleuint32Array )
                    {
                    // InternalRosSystemParser.g:2487:2: ( ruleuint32Array )
                    // InternalRosSystemParser.g:2488:3: ruleuint32Array
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
                    // InternalRosSystemParser.g:2493:2: ( ruleint64Array )
                    {
                    // InternalRosSystemParser.g:2493:2: ( ruleint64Array )
                    // InternalRosSystemParser.g:2494:3: ruleint64Array
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
                    // InternalRosSystemParser.g:2499:2: ( ruleuint64Array )
                    {
                    // InternalRosSystemParser.g:2499:2: ( ruleuint64Array )
                    // InternalRosSystemParser.g:2500:3: ruleuint64Array
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
                    // InternalRosSystemParser.g:2505:2: ( rulefloat32Array )
                    {
                    // InternalRosSystemParser.g:2505:2: ( rulefloat32Array )
                    // InternalRosSystemParser.g:2506:3: rulefloat32Array
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
                    // InternalRosSystemParser.g:2511:2: ( rulefloat64Array )
                    {
                    // InternalRosSystemParser.g:2511:2: ( rulefloat64Array )
                    // InternalRosSystemParser.g:2512:3: rulefloat64Array
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
                    // InternalRosSystemParser.g:2517:2: ( rulestring0Array )
                    {
                    // InternalRosSystemParser.g:2517:2: ( rulestring0Array )
                    // InternalRosSystemParser.g:2518:3: rulestring0Array
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
                    // InternalRosSystemParser.g:2523:2: ( rulebyteArray )
                    {
                    // InternalRosSystemParser.g:2523:2: ( rulebyteArray )
                    // InternalRosSystemParser.g:2524:3: rulebyteArray
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
                    // InternalRosSystemParser.g:2529:2: ( ruleTopicSpecRef )
                    {
                    // InternalRosSystemParser.g:2529:2: ( ruleTopicSpecRef )
                    // InternalRosSystemParser.g:2530:3: ruleTopicSpecRef
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
                    // InternalRosSystemParser.g:2535:2: ( ruleArrayTopicSpecRef )
                    {
                    // InternalRosSystemParser.g:2535:2: ( ruleArrayTopicSpecRef )
                    // InternalRosSystemParser.g:2536:3: ruleArrayTopicSpecRef
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
    // InternalRosSystemParser.g:2545:1: rule__KEYWORD__Alternatives : ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2549:1: ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) )
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
                    // InternalRosSystemParser.g:2550:2: ( Goal )
                    {
                    // InternalRosSystemParser.g:2550:2: ( Goal )
                    // InternalRosSystemParser.g:2551:3: Goal
                    {
                     before(grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    match(input,Goal,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getGoalKeyword_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2556:2: ( Message )
                    {
                    // InternalRosSystemParser.g:2556:2: ( Message )
                    // InternalRosSystemParser.g:2557:3: Message
                    {
                     before(grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    match(input,Message,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getMessageKeyword_1());

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2562:2: ( Result )
                    {
                    // InternalRosSystemParser.g:2562:2: ( Result )
                    // InternalRosSystemParser.g:2563:3: Result
                    {
                     before(grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    match(input,Result,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getResultKeyword_2());

                    }


                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2568:2: ( Feedback )
                    {
                    // InternalRosSystemParser.g:2568:2: ( Feedback )
                    // InternalRosSystemParser.g:2569:3: Feedback
                    {
                     before(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    match(input,Feedback,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());

                    }


                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2574:2: ( Name )
                    {
                    // InternalRosSystemParser.g:2574:2: ( Name )
                    // InternalRosSystemParser.g:2575:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    match(input,Name,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_4());

                    }


                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2580:2: ( Value )
                    {
                    // InternalRosSystemParser.g:2580:2: ( Value )
                    // InternalRosSystemParser.g:2581:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    match(input,Value,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_5());

                    }


                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2586:2: ( Service )
                    {
                    // InternalRosSystemParser.g:2586:2: ( Service )
                    // InternalRosSystemParser.g:2587:3: Service
                    {
                     before(grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    match(input,Service,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getServiceKeyword_6());

                    }


                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:2592:2: ( Type )
                    {
                    // InternalRosSystemParser.g:2592:2: ( Type )
                    // InternalRosSystemParser.g:2593:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    match(input,Type,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7());

                    }


                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:2598:2: ( Action )
                    {
                    // InternalRosSystemParser.g:2598:2: ( Action )
                    // InternalRosSystemParser.g:2599:3: Action
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    match(input,Action,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_8());

                    }


                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:2604:2: ( Duration )
                    {
                    // InternalRosSystemParser.g:2604:2: ( Duration )
                    // InternalRosSystemParser.g:2605:3: Duration
                    {
                     before(grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    match(input,Duration,FOLLOW_2);
                     after(grammarAccess.getKEYWORDAccess().getDurationKeyword_9());

                    }


                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:2610:2: ( Time )
                    {
                    // InternalRosSystemParser.g:2610:2: ( Time )
                    // InternalRosSystemParser.g:2611:3: Time
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
    // InternalRosSystemParser.g:2620:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2624:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRosSystemParser.g:2625:2: ( RULE_STRING )
                    {
                    // InternalRosSystemParser.g:2625:2: ( RULE_STRING )
                    // InternalRosSystemParser.g:2626:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    match(input,RULE_STRING,FOLLOW_2);
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2631:2: ( RULE_ID )
                    {
                    // InternalRosSystemParser.g:2631:2: ( RULE_ID )
                    // InternalRosSystemParser.g:2632:3: RULE_ID
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
    // InternalRosSystemParser.g:2641:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2645:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystemParser.g:2646:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
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
    // InternalRosSystemParser.g:2653:1: rule__RosSystem__Group__0__Impl : ( ( rule__RosSystem__NameAssignment_0 ) ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2657:1: ( ( ( rule__RosSystem__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:2658:1: ( ( rule__RosSystem__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:2658:1: ( ( rule__RosSystem__NameAssignment_0 ) )
            // InternalRosSystemParser.g:2659:2: ( rule__RosSystem__NameAssignment_0 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:2660:2: ( rule__RosSystem__NameAssignment_0 )
            // InternalRosSystemParser.g:2660:3: rule__RosSystem__NameAssignment_0
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
    // InternalRosSystemParser.g:2668:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2672:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystemParser.g:2673:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
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
    // InternalRosSystemParser.g:2680:1: rule__RosSystem__Group__1__Impl : ( Colon ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2684:1: ( ( Colon ) )
            // InternalRosSystemParser.g:2685:1: ( Colon )
            {
            // InternalRosSystemParser.g:2685:1: ( Colon )
            // InternalRosSystemParser.g:2686:2: Colon
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
    // InternalRosSystemParser.g:2695:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2699:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystemParser.g:2700:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
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
    // InternalRosSystemParser.g:2707:1: rule__RosSystem__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2711:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2712:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2712:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2713:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:2722:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2726:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystemParser.g:2727:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
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
    // InternalRosSystemParser.g:2734:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Alternatives_3 )* ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2738:1: ( ( ( rule__RosSystem__Alternatives_3 )* ) )
            // InternalRosSystemParser.g:2739:1: ( ( rule__RosSystem__Alternatives_3 )* )
            {
            // InternalRosSystemParser.g:2739:1: ( ( rule__RosSystem__Alternatives_3 )* )
            // InternalRosSystemParser.g:2740:2: ( rule__RosSystem__Alternatives_3 )*
            {
             before(grammarAccess.getRosSystemAccess().getAlternatives_3());
            // InternalRosSystemParser.g:2741:2: ( rule__RosSystem__Alternatives_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Connections||(LA9_0>=Parameters && LA9_0<=Processes)||LA9_0==Nodes) ) {
                    alt9=1;
                }


                switch (alt9) {
                case 1 :
                    // InternalRosSystemParser.g:2741:3: rule__RosSystem__Alternatives_3
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
    // InternalRosSystemParser.g:2749:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2753:1: ( rule__RosSystem__Group__4__Impl )
            // InternalRosSystemParser.g:2754:2: rule__RosSystem__Group__4__Impl
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
    // InternalRosSystemParser.g:2760:1: rule__RosSystem__Group__4__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2764:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2765:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2765:1: ( RULE_END )
            // InternalRosSystemParser.g:2766:2: RULE_END
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
    // InternalRosSystemParser.g:2776:1: rule__RosSystem__Group_3_0__0 : rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1 ;
    public final void rule__RosSystem__Group_3_0__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2780:1: ( rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1 )
            // InternalRosSystemParser.g:2781:2: rule__RosSystem__Group_3_0__0__Impl rule__RosSystem__Group_3_0__1
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
    // InternalRosSystemParser.g:2788:1: rule__RosSystem__Group_3_0__0__Impl : ( Processes ) ;
    public final void rule__RosSystem__Group_3_0__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2792:1: ( ( Processes ) )
            // InternalRosSystemParser.g:2793:1: ( Processes )
            {
            // InternalRosSystemParser.g:2793:1: ( Processes )
            // InternalRosSystemParser.g:2794:2: Processes
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
    // InternalRosSystemParser.g:2803:1: rule__RosSystem__Group_3_0__1 : rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2 ;
    public final void rule__RosSystem__Group_3_0__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2807:1: ( rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2 )
            // InternalRosSystemParser.g:2808:2: rule__RosSystem__Group_3_0__1__Impl rule__RosSystem__Group_3_0__2
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
    // InternalRosSystemParser.g:2815:1: rule__RosSystem__Group_3_0__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_0__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2819:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2820:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2820:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2821:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:2830:1: rule__RosSystem__Group_3_0__2 : rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3 ;
    public final void rule__RosSystem__Group_3_0__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2834:1: ( rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3 )
            // InternalRosSystemParser.g:2835:2: rule__RosSystem__Group_3_0__2__Impl rule__RosSystem__Group_3_0__3
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
    // InternalRosSystemParser.g:2842:1: rule__RosSystem__Group_3_0__2__Impl : ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* ) ;
    public final void rule__RosSystem__Group_3_0__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2846:1: ( ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* ) )
            // InternalRosSystemParser.g:2847:1: ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* )
            {
            // InternalRosSystemParser.g:2847:1: ( ( rule__RosSystem__ProcessesAssignment_3_0_2 )* )
            // InternalRosSystemParser.g:2848:2: ( rule__RosSystem__ProcessesAssignment_3_0_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getProcessesAssignment_3_0_2());
            // InternalRosSystemParser.g:2849:2: ( rule__RosSystem__ProcessesAssignment_3_0_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
                case 1 :
                    // InternalRosSystemParser.g:2849:3: rule__RosSystem__ProcessesAssignment_3_0_2
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
    // InternalRosSystemParser.g:2857:1: rule__RosSystem__Group_3_0__3 : rule__RosSystem__Group_3_0__3__Impl ;
    public final void rule__RosSystem__Group_3_0__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2861:1: ( rule__RosSystem__Group_3_0__3__Impl )
            // InternalRosSystemParser.g:2862:2: rule__RosSystem__Group_3_0__3__Impl
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
    // InternalRosSystemParser.g:2868:1: rule__RosSystem__Group_3_0__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_0__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2872:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2873:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2873:1: ( RULE_END )
            // InternalRosSystemParser.g:2874:2: RULE_END
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
    // InternalRosSystemParser.g:2884:1: rule__RosSystem__Group_3_1__0 : rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1 ;
    public final void rule__RosSystem__Group_3_1__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2888:1: ( rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1 )
            // InternalRosSystemParser.g:2889:2: rule__RosSystem__Group_3_1__0__Impl rule__RosSystem__Group_3_1__1
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
    // InternalRosSystemParser.g:2896:1: rule__RosSystem__Group_3_1__0__Impl : ( Nodes ) ;
    public final void rule__RosSystem__Group_3_1__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2900:1: ( ( Nodes ) )
            // InternalRosSystemParser.g:2901:1: ( Nodes )
            {
            // InternalRosSystemParser.g:2901:1: ( Nodes )
            // InternalRosSystemParser.g:2902:2: Nodes
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
    // InternalRosSystemParser.g:2911:1: rule__RosSystem__Group_3_1__1 : rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2 ;
    public final void rule__RosSystem__Group_3_1__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2915:1: ( rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2 )
            // InternalRosSystemParser.g:2916:2: rule__RosSystem__Group_3_1__1__Impl rule__RosSystem__Group_3_1__2
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
    // InternalRosSystemParser.g:2923:1: rule__RosSystem__Group_3_1__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_1__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2927:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:2928:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:2928:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:2929:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:2938:1: rule__RosSystem__Group_3_1__2 : rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3 ;
    public final void rule__RosSystem__Group_3_1__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2942:1: ( rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3 )
            // InternalRosSystemParser.g:2943:2: rule__RosSystem__Group_3_1__2__Impl rule__RosSystem__Group_3_1__3
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
    // InternalRosSystemParser.g:2950:1: rule__RosSystem__Group_3_1__2__Impl : ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* ) ;
    public final void rule__RosSystem__Group_3_1__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2954:1: ( ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* ) )
            // InternalRosSystemParser.g:2955:1: ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* )
            {
            // InternalRosSystemParser.g:2955:1: ( ( rule__RosSystem__ComponentsAssignment_3_1_2 )* )
            // InternalRosSystemParser.g:2956:2: ( rule__RosSystem__ComponentsAssignment_3_1_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getComponentsAssignment_3_1_2());
            // InternalRosSystemParser.g:2957:2: ( rule__RosSystem__ComponentsAssignment_3_1_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
                case 1 :
                    // InternalRosSystemParser.g:2957:3: rule__RosSystem__ComponentsAssignment_3_1_2
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
    // InternalRosSystemParser.g:2965:1: rule__RosSystem__Group_3_1__3 : rule__RosSystem__Group_3_1__3__Impl ;
    public final void rule__RosSystem__Group_3_1__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2969:1: ( rule__RosSystem__Group_3_1__3__Impl )
            // InternalRosSystemParser.g:2970:2: rule__RosSystem__Group_3_1__3__Impl
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
    // InternalRosSystemParser.g:2976:1: rule__RosSystem__Group_3_1__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_1__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2980:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:2981:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:2981:1: ( RULE_END )
            // InternalRosSystemParser.g:2982:2: RULE_END
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
    // InternalRosSystemParser.g:2992:1: rule__RosSystem__Group_3_2__0 : rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1 ;
    public final void rule__RosSystem__Group_3_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:2996:1: ( rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1 )
            // InternalRosSystemParser.g:2997:2: rule__RosSystem__Group_3_2__0__Impl rule__RosSystem__Group_3_2__1
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
    // InternalRosSystemParser.g:3004:1: rule__RosSystem__Group_3_2__0__Impl : ( Parameters ) ;
    public final void rule__RosSystem__Group_3_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3008:1: ( ( Parameters ) )
            // InternalRosSystemParser.g:3009:1: ( Parameters )
            {
            // InternalRosSystemParser.g:3009:1: ( Parameters )
            // InternalRosSystemParser.g:3010:2: Parameters
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
    // InternalRosSystemParser.g:3019:1: rule__RosSystem__Group_3_2__1 : rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2 ;
    public final void rule__RosSystem__Group_3_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3023:1: ( rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2 )
            // InternalRosSystemParser.g:3024:2: rule__RosSystem__Group_3_2__1__Impl rule__RosSystem__Group_3_2__2
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
    // InternalRosSystemParser.g:3031:1: rule__RosSystem__Group_3_2__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3035:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3036:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3036:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3037:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:3046:1: rule__RosSystem__Group_3_2__2 : rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3 ;
    public final void rule__RosSystem__Group_3_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3050:1: ( rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3 )
            // InternalRosSystemParser.g:3051:2: rule__RosSystem__Group_3_2__2__Impl rule__RosSystem__Group_3_2__3
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
    // InternalRosSystemParser.g:3058:1: rule__RosSystem__Group_3_2__2__Impl : ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* ) ;
    public final void rule__RosSystem__Group_3_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3062:1: ( ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* ) )
            // InternalRosSystemParser.g:3063:1: ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* )
            {
            // InternalRosSystemParser.g:3063:1: ( ( rule__RosSystem__ParameterAssignment_3_2_2 )* )
            // InternalRosSystemParser.g:3064:2: ( rule__RosSystem__ParameterAssignment_3_2_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getParameterAssignment_3_2_2());
            // InternalRosSystemParser.g:3065:2: ( rule__RosSystem__ParameterAssignment_3_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
                    alt12=1;
                }


                switch (alt12) {
                case 1 :
                    // InternalRosSystemParser.g:3065:3: rule__RosSystem__ParameterAssignment_3_2_2
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
    // InternalRosSystemParser.g:3073:1: rule__RosSystem__Group_3_2__3 : rule__RosSystem__Group_3_2__3__Impl ;
    public final void rule__RosSystem__Group_3_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3077:1: ( rule__RosSystem__Group_3_2__3__Impl )
            // InternalRosSystemParser.g:3078:2: rule__RosSystem__Group_3_2__3__Impl
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
    // InternalRosSystemParser.g:3084:1: rule__RosSystem__Group_3_2__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3088:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3089:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3089:1: ( RULE_END )
            // InternalRosSystemParser.g:3090:2: RULE_END
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
    // InternalRosSystemParser.g:3100:1: rule__RosSystem__Group_3_3__0 : rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1 ;
    public final void rule__RosSystem__Group_3_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3104:1: ( rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1 )
            // InternalRosSystemParser.g:3105:2: rule__RosSystem__Group_3_3__0__Impl rule__RosSystem__Group_3_3__1
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
    // InternalRosSystemParser.g:3112:1: rule__RosSystem__Group_3_3__0__Impl : ( Connections ) ;
    public final void rule__RosSystem__Group_3_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3116:1: ( ( Connections ) )
            // InternalRosSystemParser.g:3117:1: ( Connections )
            {
            // InternalRosSystemParser.g:3117:1: ( Connections )
            // InternalRosSystemParser.g:3118:2: Connections
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
    // InternalRosSystemParser.g:3127:1: rule__RosSystem__Group_3_3__1 : rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2 ;
    public final void rule__RosSystem__Group_3_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3131:1: ( rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2 )
            // InternalRosSystemParser.g:3132:2: rule__RosSystem__Group_3_3__1__Impl rule__RosSystem__Group_3_3__2
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
    // InternalRosSystemParser.g:3139:1: rule__RosSystem__Group_3_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group_3_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3143:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3144:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3144:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3145:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:3154:1: rule__RosSystem__Group_3_3__2 : rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3 ;
    public final void rule__RosSystem__Group_3_3__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3158:1: ( rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3 )
            // InternalRosSystemParser.g:3159:2: rule__RosSystem__Group_3_3__2__Impl rule__RosSystem__Group_3_3__3
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
    // InternalRosSystemParser.g:3166:1: rule__RosSystem__Group_3_3__2__Impl : ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* ) ;
    public final void rule__RosSystem__Group_3_3__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3170:1: ( ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* ) )
            // InternalRosSystemParser.g:3171:1: ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* )
            {
            // InternalRosSystemParser.g:3171:1: ( ( rule__RosSystem__ConnectionsAssignment_3_3_2 )* )
            // InternalRosSystemParser.g:3172:2: ( rule__RosSystem__ConnectionsAssignment_3_3_2 )*
            {
             before(grammarAccess.getRosSystemAccess().getConnectionsAssignment_3_3_2());
            // InternalRosSystemParser.g:3173:2: ( rule__RosSystem__ConnectionsAssignment_3_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==HyphenMinusLeftSquareBracket) ) {
                    alt13=1;
                }


                switch (alt13) {
                case 1 :
                    // InternalRosSystemParser.g:3173:3: rule__RosSystem__ConnectionsAssignment_3_3_2
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
    // InternalRosSystemParser.g:3181:1: rule__RosSystem__Group_3_3__3 : rule__RosSystem__Group_3_3__3__Impl ;
    public final void rule__RosSystem__Group_3_3__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3185:1: ( rule__RosSystem__Group_3_3__3__Impl )
            // InternalRosSystemParser.g:3186:2: rule__RosSystem__Group_3_3__3__Impl
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
    // InternalRosSystemParser.g:3192:1: rule__RosSystem__Group_3_3__3__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group_3_3__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3196:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3197:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3197:1: ( RULE_END )
            // InternalRosSystemParser.g:3198:2: RULE_END
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
    // InternalRosSystemParser.g:3208:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3212:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // InternalRosSystemParser.g:3213:2: rule__Process__Group__0__Impl rule__Process__Group__1
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
    // InternalRosSystemParser.g:3220:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3224:1: ( ( () ) )
            // InternalRosSystemParser.g:3225:1: ( () )
            {
            // InternalRosSystemParser.g:3225:1: ( () )
            // InternalRosSystemParser.g:3226:2: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0());
            // InternalRosSystemParser.g:3227:2: ()
            // InternalRosSystemParser.g:3227:3:
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
    // InternalRosSystemParser.g:3235:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3239:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // InternalRosSystemParser.g:3240:2: rule__Process__Group__1__Impl rule__Process__Group__2
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
    // InternalRosSystemParser.g:3247:1: rule__Process__Group__1__Impl : ( ( rule__Process__NameAssignment_1 ) ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3251:1: ( ( ( rule__Process__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:3252:1: ( ( rule__Process__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3252:1: ( ( rule__Process__NameAssignment_1 ) )
            // InternalRosSystemParser.g:3253:2: ( rule__Process__NameAssignment_1 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_1());
            // InternalRosSystemParser.g:3254:2: ( rule__Process__NameAssignment_1 )
            // InternalRosSystemParser.g:3254:3: rule__Process__NameAssignment_1
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
    // InternalRosSystemParser.g:3262:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3266:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // InternalRosSystemParser.g:3267:2: rule__Process__Group__2__Impl rule__Process__Group__3
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
    // InternalRosSystemParser.g:3274:1: rule__Process__Group__2__Impl : ( Colon ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3278:1: ( ( Colon ) )
            // InternalRosSystemParser.g:3279:1: ( Colon )
            {
            // InternalRosSystemParser.g:3279:1: ( Colon )
            // InternalRosSystemParser.g:3280:2: Colon
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
    // InternalRosSystemParser.g:3289:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3293:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // InternalRosSystemParser.g:3294:2: rule__Process__Group__3__Impl rule__Process__Group__4
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
    // InternalRosSystemParser.g:3301:1: rule__Process__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3305:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3306:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3306:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3307:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:3316:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3320:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // InternalRosSystemParser.g:3321:2: rule__Process__Group__4__Impl rule__Process__Group__5
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
    // InternalRosSystemParser.g:3328:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3332:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // InternalRosSystemParser.g:3333:1: ( ( rule__Process__Group_4__0 )? )
            {
            // InternalRosSystemParser.g:3333:1: ( ( rule__Process__Group_4__0 )? )
            // InternalRosSystemParser.g:3334:2: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4());
            // InternalRosSystemParser.g:3335:2: ( rule__Process__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Nodes) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystemParser.g:3335:3: rule__Process__Group_4__0
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
    // InternalRosSystemParser.g:3343:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3347:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // InternalRosSystemParser.g:3348:2: rule__Process__Group__5__Impl rule__Process__Group__6
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
    // InternalRosSystemParser.g:3355:1: rule__Process__Group__5__Impl : ( ( rule__Process__Group_5__0 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3359:1: ( ( ( rule__Process__Group_5__0 ) ) )
            // InternalRosSystemParser.g:3360:1: ( ( rule__Process__Group_5__0 ) )
            {
            // InternalRosSystemParser.g:3360:1: ( ( rule__Process__Group_5__0 ) )
            // InternalRosSystemParser.g:3361:2: ( rule__Process__Group_5__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup_5());
            // InternalRosSystemParser.g:3362:2: ( rule__Process__Group_5__0 )
            // InternalRosSystemParser.g:3362:3: rule__Process__Group_5__0
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
    // InternalRosSystemParser.g:3370:1: rule__Process__Group__6 : rule__Process__Group__6__Impl ;
    public final void rule__Process__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3374:1: ( rule__Process__Group__6__Impl )
            // InternalRosSystemParser.g:3375:2: rule__Process__Group__6__Impl
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
    // InternalRosSystemParser.g:3381:1: rule__Process__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3385:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3386:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3386:1: ( RULE_END )
            // InternalRosSystemParser.g:3387:2: RULE_END
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
    // InternalRosSystemParser.g:3397:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3401:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // InternalRosSystemParser.g:3402:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
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
    // InternalRosSystemParser.g:3409:1: rule__Process__Group_4__0__Impl : ( Nodes ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3413:1: ( ( Nodes ) )
            // InternalRosSystemParser.g:3414:1: ( Nodes )
            {
            // InternalRosSystemParser.g:3414:1: ( Nodes )
            // InternalRosSystemParser.g:3415:2: Nodes
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
    // InternalRosSystemParser.g:3424:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl rule__Process__Group_4__2 ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3428:1: ( rule__Process__Group_4__1__Impl rule__Process__Group_4__2 )
            // InternalRosSystemParser.g:3429:2: rule__Process__Group_4__1__Impl rule__Process__Group_4__2
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
    // InternalRosSystemParser.g:3436:1: rule__Process__Group_4__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3440:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:3441:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:3441:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:3442:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:3451:1: rule__Process__Group_4__2 : rule__Process__Group_4__2__Impl rule__Process__Group_4__3 ;
    public final void rule__Process__Group_4__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3455:1: ( rule__Process__Group_4__2__Impl rule__Process__Group_4__3 )
            // InternalRosSystemParser.g:3456:2: rule__Process__Group_4__2__Impl rule__Process__Group_4__3
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
    // InternalRosSystemParser.g:3463:1: rule__Process__Group_4__2__Impl : ( ( rule__Process__ComponentsAssignment_4_2 ) ) ;
    public final void rule__Process__Group_4__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3467:1: ( ( ( rule__Process__ComponentsAssignment_4_2 ) ) )
            // InternalRosSystemParser.g:3468:1: ( ( rule__Process__ComponentsAssignment_4_2 ) )
            {
            // InternalRosSystemParser.g:3468:1: ( ( rule__Process__ComponentsAssignment_4_2 ) )
            // InternalRosSystemParser.g:3469:2: ( rule__Process__ComponentsAssignment_4_2 )
            {
             before(grammarAccess.getProcessAccess().getComponentsAssignment_4_2());
            // InternalRosSystemParser.g:3470:2: ( rule__Process__ComponentsAssignment_4_2 )
            // InternalRosSystemParser.g:3470:3: rule__Process__ComponentsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Process__ComponentsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getComponentsAssignment_4_2());

            }


            }

        }
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
    // InternalRosSystemParser.g:3478:1: rule__Process__Group_4__3 : rule__Process__Group_4__3__Impl rule__Process__Group_4__4 ;
    public final void rule__Process__Group_4__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3482:1: ( rule__Process__Group_4__3__Impl rule__Process__Group_4__4 )
            // InternalRosSystemParser.g:3483:2: rule__Process__Group_4__3__Impl rule__Process__Group_4__4
            {
            pushFollow(FOLLOW_15);
            rule__Process__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:3490:1: rule__Process__Group_4__3__Impl : ( ( rule__Process__Group_4_3__0 )* ) ;
    public final void rule__Process__Group_4__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3494:1: ( ( ( rule__Process__Group_4_3__0 )* ) )
            // InternalRosSystemParser.g:3495:1: ( ( rule__Process__Group_4_3__0 )* )
            {
            // InternalRosSystemParser.g:3495:1: ( ( rule__Process__Group_4_3__0 )* )
            // InternalRosSystemParser.g:3496:2: ( rule__Process__Group_4_3__0 )*
            {
             before(grammarAccess.getProcessAccess().getGroup_4_3());
            // InternalRosSystemParser.g:3497:2: ( rule__Process__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
                case 1 :
                    // InternalRosSystemParser.g:3497:3: rule__Process__Group_4_3__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__Process__Group_4_3__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop15;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getGroup_4_3());

            }


            }

        }
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


    // $ANTLR start "rule__Process__Group_4__4"
    // InternalRosSystemParser.g:3505:1: rule__Process__Group_4__4 : rule__Process__Group_4__4__Impl ;
    public final void rule__Process__Group_4__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3509:1: ( rule__Process__Group_4__4__Impl )
            // InternalRosSystemParser.g:3510:2: rule__Process__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4"


    // $ANTLR start "rule__Process__Group_4__4__Impl"
    // InternalRosSystemParser.g:3516:1: rule__Process__Group_4__4__Impl : ( RightSquareBracket ) ;
    public final void rule__Process__Group_4__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3520:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:3521:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:3521:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:3522:2: RightSquareBracket
            {
             before(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());
            match(input,RightSquareBracket,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4__4__Impl"


    // $ANTLR start "rule__Process__Group_4_3__0"
    // InternalRosSystemParser.g:3532:1: rule__Process__Group_4_3__0 : rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 ;
    public final void rule__Process__Group_4_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3536:1: ( rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1 )
            // InternalRosSystemParser.g:3537:2: rule__Process__Group_4_3__0__Impl rule__Process__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Process__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0"


    // $ANTLR start "rule__Process__Group_4_3__0__Impl"
    // InternalRosSystemParser.g:3544:1: rule__Process__Group_4_3__0__Impl : ( Comma ) ;
    public final void rule__Process__Group_4_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3548:1: ( ( Comma ) )
            // InternalRosSystemParser.g:3549:1: ( Comma )
            {
            // InternalRosSystemParser.g:3549:1: ( Comma )
            // InternalRosSystemParser.g:3550:2: Comma
            {
             before(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
            match(input,Comma,FOLLOW_2);
             after(grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__0__Impl"


    // $ANTLR start "rule__Process__Group_4_3__1"
    // InternalRosSystemParser.g:3559:1: rule__Process__Group_4_3__1 : rule__Process__Group_4_3__1__Impl ;
    public final void rule__Process__Group_4_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3563:1: ( rule__Process__Group_4_3__1__Impl )
            // InternalRosSystemParser.g:3564:2: rule__Process__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Process__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1"


    // $ANTLR start "rule__Process__Group_4_3__1__Impl"
    // InternalRosSystemParser.g:3570:1: rule__Process__Group_4_3__1__Impl : ( ( rule__Process__ComponentsAssignment_4_3_1 ) ) ;
    public final void rule__Process__Group_4_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3574:1: ( ( ( rule__Process__ComponentsAssignment_4_3_1 ) ) )
            // InternalRosSystemParser.g:3575:1: ( ( rule__Process__ComponentsAssignment_4_3_1 ) )
            {
            // InternalRosSystemParser.g:3575:1: ( ( rule__Process__ComponentsAssignment_4_3_1 ) )
            // InternalRosSystemParser.g:3576:2: ( rule__Process__ComponentsAssignment_4_3_1 )
            {
             before(grammarAccess.getProcessAccess().getComponentsAssignment_4_3_1());
            // InternalRosSystemParser.g:3577:2: ( rule__Process__ComponentsAssignment_4_3_1 )
            // InternalRosSystemParser.g:3577:3: rule__Process__ComponentsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Process__ComponentsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getComponentsAssignment_4_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group_4_3__1__Impl"


    // $ANTLR start "rule__Process__Group_5__0"
    // InternalRosSystemParser.g:3586:1: rule__Process__Group_5__0 : rule__Process__Group_5__0__Impl rule__Process__Group_5__1 ;
    public final void rule__Process__Group_5__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3590:1: ( rule__Process__Group_5__0__Impl rule__Process__Group_5__1 )
            // InternalRosSystemParser.g:3591:2: rule__Process__Group_5__0__Impl rule__Process__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystemParser.g:3598:1: rule__Process__Group_5__0__Impl : ( Threads ) ;
    public final void rule__Process__Group_5__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3602:1: ( ( Threads ) )
            // InternalRosSystemParser.g:3603:1: ( Threads )
            {
            // InternalRosSystemParser.g:3603:1: ( Threads )
            // InternalRosSystemParser.g:3604:2: Threads
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
    // InternalRosSystemParser.g:3613:1: rule__Process__Group_5__1 : rule__Process__Group_5__1__Impl ;
    public final void rule__Process__Group_5__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3617:1: ( rule__Process__Group_5__1__Impl )
            // InternalRosSystemParser.g:3618:2: rule__Process__Group_5__1__Impl
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
    // InternalRosSystemParser.g:3624:1: rule__Process__Group_5__1__Impl : ( ( rule__Process__ThreadsAssignment_5_1 ) ) ;
    public final void rule__Process__Group_5__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3628:1: ( ( ( rule__Process__ThreadsAssignment_5_1 ) ) )
            // InternalRosSystemParser.g:3629:1: ( ( rule__Process__ThreadsAssignment_5_1 ) )
            {
            // InternalRosSystemParser.g:3629:1: ( ( rule__Process__ThreadsAssignment_5_1 ) )
            // InternalRosSystemParser.g:3630:2: ( rule__Process__ThreadsAssignment_5_1 )
            {
             before(grammarAccess.getProcessAccess().getThreadsAssignment_5_1());
            // InternalRosSystemParser.g:3631:2: ( rule__Process__ThreadsAssignment_5_1 )
            // InternalRosSystemParser.g:3631:3: rule__Process__ThreadsAssignment_5_1
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
    // InternalRosSystemParser.g:3640:1: rule__RosNode__Group__0 : rule__RosNode__Group__0__Impl rule__RosNode__Group__1 ;
    public final void rule__RosNode__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3644:1: ( rule__RosNode__Group__0__Impl rule__RosNode__Group__1 )
            // InternalRosSystemParser.g:3645:2: rule__RosNode__Group__0__Impl rule__RosNode__Group__1
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
    // InternalRosSystemParser.g:3652:1: rule__RosNode__Group__0__Impl : ( () ) ;
    public final void rule__RosNode__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3656:1: ( ( () ) )
            // InternalRosSystemParser.g:3657:1: ( () )
            {
            // InternalRosSystemParser.g:3657:1: ( () )
            // InternalRosSystemParser.g:3658:2: ()
            {
             before(grammarAccess.getRosNodeAccess().getRosNodeAction_0());
            // InternalRosSystemParser.g:3659:2: ()
            // InternalRosSystemParser.g:3659:3:
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
    // InternalRosSystemParser.g:3667:1: rule__RosNode__Group__1 : rule__RosNode__Group__1__Impl rule__RosNode__Group__2 ;
    public final void rule__RosNode__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3671:1: ( rule__RosNode__Group__1__Impl rule__RosNode__Group__2 )
            // InternalRosSystemParser.g:3672:2: rule__RosNode__Group__1__Impl rule__RosNode__Group__2
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
    // InternalRosSystemParser.g:3679:1: rule__RosNode__Group__1__Impl : ( ( rule__RosNode__NameAssignment_1 ) ) ;
    public final void rule__RosNode__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3683:1: ( ( ( rule__RosNode__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:3684:1: ( ( rule__RosNode__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3684:1: ( ( rule__RosNode__NameAssignment_1 ) )
            // InternalRosSystemParser.g:3685:2: ( rule__RosNode__NameAssignment_1 )
            {
             before(grammarAccess.getRosNodeAccess().getNameAssignment_1());
            // InternalRosSystemParser.g:3686:2: ( rule__RosNode__NameAssignment_1 )
            // InternalRosSystemParser.g:3686:3: rule__RosNode__NameAssignment_1
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
    // InternalRosSystemParser.g:3694:1: rule__RosNode__Group__2 : rule__RosNode__Group__2__Impl rule__RosNode__Group__3 ;
    public final void rule__RosNode__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3698:1: ( rule__RosNode__Group__2__Impl rule__RosNode__Group__3 )
            // InternalRosSystemParser.g:3699:2: rule__RosNode__Group__2__Impl rule__RosNode__Group__3
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
    // InternalRosSystemParser.g:3706:1: rule__RosNode__Group__2__Impl : ( Colon ) ;
    public final void rule__RosNode__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3710:1: ( ( Colon ) )
            // InternalRosSystemParser.g:3711:1: ( Colon )
            {
            // InternalRosSystemParser.g:3711:1: ( Colon )
            // InternalRosSystemParser.g:3712:2: Colon
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
    // InternalRosSystemParser.g:3721:1: rule__RosNode__Group__3 : rule__RosNode__Group__3__Impl rule__RosNode__Group__4 ;
    public final void rule__RosNode__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3725:1: ( rule__RosNode__Group__3__Impl rule__RosNode__Group__4 )
            // InternalRosSystemParser.g:3726:2: rule__RosNode__Group__3__Impl rule__RosNode__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalRosSystemParser.g:3733:1: rule__RosNode__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3737:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3738:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3738:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3739:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:3748:1: rule__RosNode__Group__4 : rule__RosNode__Group__4__Impl rule__RosNode__Group__5 ;
    public final void rule__RosNode__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3752:1: ( rule__RosNode__Group__4__Impl rule__RosNode__Group__5 )
            // InternalRosSystemParser.g:3753:2: rule__RosNode__Group__4__Impl rule__RosNode__Group__5
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
    // InternalRosSystemParser.g:3760:1: rule__RosNode__Group__4__Impl : ( From ) ;
    public final void rule__RosNode__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3764:1: ( ( From ) )
            // InternalRosSystemParser.g:3765:1: ( From )
            {
            // InternalRosSystemParser.g:3765:1: ( From )
            // InternalRosSystemParser.g:3766:2: From
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
    // InternalRosSystemParser.g:3775:1: rule__RosNode__Group__5 : rule__RosNode__Group__5__Impl rule__RosNode__Group__6 ;
    public final void rule__RosNode__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3779:1: ( rule__RosNode__Group__5__Impl rule__RosNode__Group__6 )
            // InternalRosSystemParser.g:3780:2: rule__RosNode__Group__5__Impl rule__RosNode__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystemParser.g:3787:1: rule__RosNode__Group__5__Impl : ( ( rule__RosNode__FromAssignment_5 ) ) ;
    public final void rule__RosNode__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3791:1: ( ( ( rule__RosNode__FromAssignment_5 ) ) )
            // InternalRosSystemParser.g:3792:1: ( ( rule__RosNode__FromAssignment_5 ) )
            {
            // InternalRosSystemParser.g:3792:1: ( ( rule__RosNode__FromAssignment_5 ) )
            // InternalRosSystemParser.g:3793:2: ( rule__RosNode__FromAssignment_5 )
            {
             before(grammarAccess.getRosNodeAccess().getFromAssignment_5());
            // InternalRosSystemParser.g:3794:2: ( rule__RosNode__FromAssignment_5 )
            // InternalRosSystemParser.g:3794:3: rule__RosNode__FromAssignment_5
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
    // InternalRosSystemParser.g:3802:1: rule__RosNode__Group__6 : rule__RosNode__Group__6__Impl rule__RosNode__Group__7 ;
    public final void rule__RosNode__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3806:1: ( rule__RosNode__Group__6__Impl rule__RosNode__Group__7 )
            // InternalRosSystemParser.g:3807:2: rule__RosNode__Group__6__Impl rule__RosNode__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystemParser.g:3814:1: rule__RosNode__Group__6__Impl : ( ( rule__RosNode__Group_6__0 )? ) ;
    public final void rule__RosNode__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3818:1: ( ( ( rule__RosNode__Group_6__0 )? ) )
            // InternalRosSystemParser.g:3819:1: ( ( rule__RosNode__Group_6__0 )? )
            {
            // InternalRosSystemParser.g:3819:1: ( ( rule__RosNode__Group_6__0 )? )
            // InternalRosSystemParser.g:3820:2: ( rule__RosNode__Group_6__0 )?
            {
             before(grammarAccess.getRosNodeAccess().getGroup_6());
            // InternalRosSystemParser.g:3821:2: ( rule__RosNode__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Interfaces) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRosSystemParser.g:3821:3: rule__RosNode__Group_6__0
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
    // InternalRosSystemParser.g:3829:1: rule__RosNode__Group__7 : rule__RosNode__Group__7__Impl rule__RosNode__Group__8 ;
    public final void rule__RosNode__Group__7() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3833:1: ( rule__RosNode__Group__7__Impl rule__RosNode__Group__8 )
            // InternalRosSystemParser.g:3834:2: rule__RosNode__Group__7__Impl rule__RosNode__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalRosSystemParser.g:3841:1: rule__RosNode__Group__7__Impl : ( ( rule__RosNode__Group_7__0 )? ) ;
    public final void rule__RosNode__Group__7__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3845:1: ( ( ( rule__RosNode__Group_7__0 )? ) )
            // InternalRosSystemParser.g:3846:1: ( ( rule__RosNode__Group_7__0 )? )
            {
            // InternalRosSystemParser.g:3846:1: ( ( rule__RosNode__Group_7__0 )? )
            // InternalRosSystemParser.g:3847:2: ( rule__RosNode__Group_7__0 )?
            {
             before(grammarAccess.getRosNodeAccess().getGroup_7());
            // InternalRosSystemParser.g:3848:2: ( rule__RosNode__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Parameters) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystemParser.g:3848:3: rule__RosNode__Group_7__0
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
    // InternalRosSystemParser.g:3856:1: rule__RosNode__Group__8 : rule__RosNode__Group__8__Impl ;
    public final void rule__RosNode__Group__8() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3860:1: ( rule__RosNode__Group__8__Impl )
            // InternalRosSystemParser.g:3861:2: rule__RosNode__Group__8__Impl
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
    // InternalRosSystemParser.g:3867:1: rule__RosNode__Group__8__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group__8__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3871:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3872:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3872:1: ( RULE_END )
            // InternalRosSystemParser.g:3873:2: RULE_END
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
    // InternalRosSystemParser.g:3883:1: rule__RosNode__Group_6__0 : rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1 ;
    public final void rule__RosNode__Group_6__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3887:1: ( rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1 )
            // InternalRosSystemParser.g:3888:2: rule__RosNode__Group_6__0__Impl rule__RosNode__Group_6__1
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
    // InternalRosSystemParser.g:3895:1: rule__RosNode__Group_6__0__Impl : ( Interfaces ) ;
    public final void rule__RosNode__Group_6__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3899:1: ( ( Interfaces ) )
            // InternalRosSystemParser.g:3900:1: ( Interfaces )
            {
            // InternalRosSystemParser.g:3900:1: ( Interfaces )
            // InternalRosSystemParser.g:3901:2: Interfaces
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
    // InternalRosSystemParser.g:3910:1: rule__RosNode__Group_6__1 : rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2 ;
    public final void rule__RosNode__Group_6__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3914:1: ( rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2 )
            // InternalRosSystemParser.g:3915:2: rule__RosNode__Group_6__1__Impl rule__RosNode__Group_6__2
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
    // InternalRosSystemParser.g:3922:1: rule__RosNode__Group_6__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group_6__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3926:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:3927:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:3927:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:3928:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:3937:1: rule__RosNode__Group_6__2 : rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3 ;
    public final void rule__RosNode__Group_6__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3941:1: ( rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3 )
            // InternalRosSystemParser.g:3942:2: rule__RosNode__Group_6__2__Impl rule__RosNode__Group_6__3
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
    // InternalRosSystemParser.g:3949:1: rule__RosNode__Group_6__2__Impl : ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* ) ;
    public final void rule__RosNode__Group_6__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3953:1: ( ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* ) )
            // InternalRosSystemParser.g:3954:1: ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* )
            {
            // InternalRosSystemParser.g:3954:1: ( ( rule__RosNode__RosinterfacesAssignment_6_2 )* )
            // InternalRosSystemParser.g:3955:2: ( rule__RosNode__RosinterfacesAssignment_6_2 )*
            {
             before(grammarAccess.getRosNodeAccess().getRosinterfacesAssignment_6_2());
            // InternalRosSystemParser.g:3956:2: ( rule__RosNode__RosinterfacesAssignment_6_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
                case 1 :
                    // InternalRosSystemParser.g:3956:3: rule__RosNode__RosinterfacesAssignment_6_2
                    {
                    pushFollow(FOLLOW_8);
                    rule__RosNode__RosinterfacesAssignment_6_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop18;
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
    // InternalRosSystemParser.g:3964:1: rule__RosNode__Group_6__3 : rule__RosNode__Group_6__3__Impl ;
    public final void rule__RosNode__Group_6__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3968:1: ( rule__RosNode__Group_6__3__Impl )
            // InternalRosSystemParser.g:3969:2: rule__RosNode__Group_6__3__Impl
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
    // InternalRosSystemParser.g:3975:1: rule__RosNode__Group_6__3__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group_6__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3979:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:3980:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:3980:1: ( RULE_END )
            // InternalRosSystemParser.g:3981:2: RULE_END
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
    // InternalRosSystemParser.g:3991:1: rule__RosNode__Group_7__0 : rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1 ;
    public final void rule__RosNode__Group_7__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:3995:1: ( rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1 )
            // InternalRosSystemParser.g:3996:2: rule__RosNode__Group_7__0__Impl rule__RosNode__Group_7__1
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
    // InternalRosSystemParser.g:4003:1: rule__RosNode__Group_7__0__Impl : ( Parameters ) ;
    public final void rule__RosNode__Group_7__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4007:1: ( ( Parameters ) )
            // InternalRosSystemParser.g:4008:1: ( Parameters )
            {
            // InternalRosSystemParser.g:4008:1: ( Parameters )
            // InternalRosSystemParser.g:4009:2: Parameters
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
    // InternalRosSystemParser.g:4018:1: rule__RosNode__Group_7__1 : rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2 ;
    public final void rule__RosNode__Group_7__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4022:1: ( rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2 )
            // InternalRosSystemParser.g:4023:2: rule__RosNode__Group_7__1__Impl rule__RosNode__Group_7__2
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
    // InternalRosSystemParser.g:4030:1: rule__RosNode__Group_7__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group_7__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4034:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4035:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4035:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4036:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:4045:1: rule__RosNode__Group_7__2 : rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3 ;
    public final void rule__RosNode__Group_7__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4049:1: ( rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3 )
            // InternalRosSystemParser.g:4050:2: rule__RosNode__Group_7__2__Impl rule__RosNode__Group_7__3
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
    // InternalRosSystemParser.g:4057:1: rule__RosNode__Group_7__2__Impl : ( ( rule__RosNode__RosparametersAssignment_7_2 )* ) ;
    public final void rule__RosNode__Group_7__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4061:1: ( ( ( rule__RosNode__RosparametersAssignment_7_2 )* ) )
            // InternalRosSystemParser.g:4062:1: ( ( rule__RosNode__RosparametersAssignment_7_2 )* )
            {
            // InternalRosSystemParser.g:4062:1: ( ( rule__RosNode__RosparametersAssignment_7_2 )* )
            // InternalRosSystemParser.g:4063:2: ( rule__RosNode__RosparametersAssignment_7_2 )*
            {
             before(grammarAccess.getRosNodeAccess().getRosparametersAssignment_7_2());
            // InternalRosSystemParser.g:4064:2: ( rule__RosNode__RosparametersAssignment_7_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                    alt19=1;
                }


                switch (alt19) {
                case 1 :
                    // InternalRosSystemParser.g:4064:3: rule__RosNode__RosparametersAssignment_7_2
                    {
                    pushFollow(FOLLOW_8);
                    rule__RosNode__RosparametersAssignment_7_2();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop19;
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
    // InternalRosSystemParser.g:4072:1: rule__RosNode__Group_7__3 : rule__RosNode__Group_7__3__Impl ;
    public final void rule__RosNode__Group_7__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4076:1: ( rule__RosNode__Group_7__3__Impl )
            // InternalRosSystemParser.g:4077:2: rule__RosNode__Group_7__3__Impl
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
    // InternalRosSystemParser.g:4083:1: rule__RosNode__Group_7__3__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group_7__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4087:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4088:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4088:1: ( RULE_END )
            // InternalRosSystemParser.g:4089:2: RULE_END
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
    // InternalRosSystemParser.g:4099:1: rule__RosInterface__Group__0 : rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1 ;
    public final void rule__RosInterface__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4103:1: ( rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1 )
            // InternalRosSystemParser.g:4104:2: rule__RosInterface__Group__0__Impl rule__RosInterface__Group__1
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
    // InternalRosSystemParser.g:4111:1: rule__RosInterface__Group__0__Impl : ( ( rule__RosInterface__NameAssignment_0 ) ) ;
    public final void rule__RosInterface__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4115:1: ( ( ( rule__RosInterface__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:4116:1: ( ( rule__RosInterface__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:4116:1: ( ( rule__RosInterface__NameAssignment_0 ) )
            // InternalRosSystemParser.g:4117:2: ( rule__RosInterface__NameAssignment_0 )
            {
             before(grammarAccess.getRosInterfaceAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:4118:2: ( rule__RosInterface__NameAssignment_0 )
            // InternalRosSystemParser.g:4118:3: rule__RosInterface__NameAssignment_0
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
    // InternalRosSystemParser.g:4126:1: rule__RosInterface__Group__1 : rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2 ;
    public final void rule__RosInterface__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4130:1: ( rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2 )
            // InternalRosSystemParser.g:4131:2: rule__RosInterface__Group__1__Impl rule__RosInterface__Group__2
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
    // InternalRosSystemParser.g:4138:1: rule__RosInterface__Group__1__Impl : ( Colon ) ;
    public final void rule__RosInterface__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4142:1: ( ( Colon ) )
            // InternalRosSystemParser.g:4143:1: ( Colon )
            {
            // InternalRosSystemParser.g:4143:1: ( Colon )
            // InternalRosSystemParser.g:4144:2: Colon
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
    // InternalRosSystemParser.g:4153:1: rule__RosInterface__Group__2 : rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3 ;
    public final void rule__RosInterface__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4157:1: ( rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3 )
            // InternalRosSystemParser.g:4158:2: rule__RosInterface__Group__2__Impl rule__RosInterface__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalRosSystemParser.g:4165:1: rule__RosInterface__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosInterface__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4169:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4170:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4170:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4171:2: RULE_BEGIN
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
    // InternalRosSystemParser.g:4180:1: rule__RosInterface__Group__3 : rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4 ;
    public final void rule__RosInterface__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4184:1: ( rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4 )
            // InternalRosSystemParser.g:4185:2: rule__RosInterface__Group__3__Impl rule__RosInterface__Group__4
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
    // InternalRosSystemParser.g:4192:1: rule__RosInterface__Group__3__Impl : ( ( rule__RosInterface__ReferenceAssignment_3 ) ) ;
    public final void rule__RosInterface__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4196:1: ( ( ( rule__RosInterface__ReferenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:4197:1: ( ( rule__RosInterface__ReferenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:4197:1: ( ( rule__RosInterface__ReferenceAssignment_3 ) )
            // InternalRosSystemParser.g:4198:2: ( rule__RosInterface__ReferenceAssignment_3 )
            {
             before(grammarAccess.getRosInterfaceAccess().getReferenceAssignment_3());
            // InternalRosSystemParser.g:4199:2: ( rule__RosInterface__ReferenceAssignment_3 )
            // InternalRosSystemParser.g:4199:3: rule__RosInterface__ReferenceAssignment_3
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
    // InternalRosSystemParser.g:4207:1: rule__RosInterface__Group__4 : rule__RosInterface__Group__4__Impl ;
    public final void rule__RosInterface__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4211:1: ( rule__RosInterface__Group__4__Impl )
            // InternalRosSystemParser.g:4212:2: rule__RosInterface__Group__4__Impl
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
    // InternalRosSystemParser.g:4218:1: rule__RosInterface__Group__4__Impl : ( RULE_END ) ;
    public final void rule__RosInterface__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4222:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4223:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4223:1: ( RULE_END )
            // InternalRosSystemParser.g:4224:2: RULE_END
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
    // InternalRosSystemParser.g:4234:1: rule__RosPublisherReference__Group__0 : rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1 ;
    public final void rule__RosPublisherReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4238:1: ( rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1 )
            // InternalRosSystemParser.g:4239:2: rule__RosPublisherReference__Group__0__Impl rule__RosPublisherReference__Group__1
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
    // InternalRosSystemParser.g:4246:1: rule__RosPublisherReference__Group__0__Impl : ( FromPub ) ;
    public final void rule__RosPublisherReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4250:1: ( ( FromPub ) )
            // InternalRosSystemParser.g:4251:1: ( FromPub )
            {
            // InternalRosSystemParser.g:4251:1: ( FromPub )
            // InternalRosSystemParser.g:4252:2: FromPub
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
    // InternalRosSystemParser.g:4261:1: rule__RosPublisherReference__Group__1 : rule__RosPublisherReference__Group__1__Impl ;
    public final void rule__RosPublisherReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4265:1: ( rule__RosPublisherReference__Group__1__Impl )
            // InternalRosSystemParser.g:4266:2: rule__RosPublisherReference__Group__1__Impl
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
    // InternalRosSystemParser.g:4272:1: rule__RosPublisherReference__Group__1__Impl : ( ( rule__RosPublisherReference__FromAssignment_1 ) ) ;
    public final void rule__RosPublisherReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4276:1: ( ( ( rule__RosPublisherReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4277:1: ( ( rule__RosPublisherReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4277:1: ( ( rule__RosPublisherReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4278:2: ( rule__RosPublisherReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4279:2: ( rule__RosPublisherReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4279:3: rule__RosPublisherReference__FromAssignment_1
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
    // InternalRosSystemParser.g:4288:1: rule__RosSubscriberReference__Group__0 : rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1 ;
    public final void rule__RosSubscriberReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4292:1: ( rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1 )
            // InternalRosSystemParser.g:4293:2: rule__RosSubscriberReference__Group__0__Impl rule__RosSubscriberReference__Group__1
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
    // InternalRosSystemParser.g:4300:1: rule__RosSubscriberReference__Group__0__Impl : ( FromSub ) ;
    public final void rule__RosSubscriberReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4304:1: ( ( FromSub ) )
            // InternalRosSystemParser.g:4305:1: ( FromSub )
            {
            // InternalRosSystemParser.g:4305:1: ( FromSub )
            // InternalRosSystemParser.g:4306:2: FromSub
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
    // InternalRosSystemParser.g:4315:1: rule__RosSubscriberReference__Group__1 : rule__RosSubscriberReference__Group__1__Impl ;
    public final void rule__RosSubscriberReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4319:1: ( rule__RosSubscriberReference__Group__1__Impl )
            // InternalRosSystemParser.g:4320:2: rule__RosSubscriberReference__Group__1__Impl
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
    // InternalRosSystemParser.g:4326:1: rule__RosSubscriberReference__Group__1__Impl : ( ( rule__RosSubscriberReference__FromAssignment_1 ) ) ;
    public final void rule__RosSubscriberReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4330:1: ( ( ( rule__RosSubscriberReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4331:1: ( ( rule__RosSubscriberReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4331:1: ( ( rule__RosSubscriberReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4332:2: ( rule__RosSubscriberReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4333:2: ( rule__RosSubscriberReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4333:3: rule__RosSubscriberReference__FromAssignment_1
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
    // InternalRosSystemParser.g:4342:1: rule__RosServiceServerReference__Group__0 : rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1 ;
    public final void rule__RosServiceServerReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4346:1: ( rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1 )
            // InternalRosSystemParser.g:4347:2: rule__RosServiceServerReference__Group__0__Impl rule__RosServiceServerReference__Group__1
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
    // InternalRosSystemParser.g:4354:1: rule__RosServiceServerReference__Group__0__Impl : ( FromSS ) ;
    public final void rule__RosServiceServerReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4358:1: ( ( FromSS ) )
            // InternalRosSystemParser.g:4359:1: ( FromSS )
            {
            // InternalRosSystemParser.g:4359:1: ( FromSS )
            // InternalRosSystemParser.g:4360:2: FromSS
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
    // InternalRosSystemParser.g:4369:1: rule__RosServiceServerReference__Group__1 : rule__RosServiceServerReference__Group__1__Impl ;
    public final void rule__RosServiceServerReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4373:1: ( rule__RosServiceServerReference__Group__1__Impl )
            // InternalRosSystemParser.g:4374:2: rule__RosServiceServerReference__Group__1__Impl
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
    // InternalRosSystemParser.g:4380:1: rule__RosServiceServerReference__Group__1__Impl : ( ( rule__RosServiceServerReference__FromAssignment_1 ) ) ;
    public final void rule__RosServiceServerReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4384:1: ( ( ( rule__RosServiceServerReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4385:1: ( ( rule__RosServiceServerReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4385:1: ( ( rule__RosServiceServerReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4386:2: ( rule__RosServiceServerReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4387:2: ( rule__RosServiceServerReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4387:3: rule__RosServiceServerReference__FromAssignment_1
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
    // InternalRosSystemParser.g:4396:1: rule__RosServerClientReference__Group__0 : rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1 ;
    public final void rule__RosServerClientReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4400:1: ( rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1 )
            // InternalRosSystemParser.g:4401:2: rule__RosServerClientReference__Group__0__Impl rule__RosServerClientReference__Group__1
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
    // InternalRosSystemParser.g:4408:1: rule__RosServerClientReference__Group__0__Impl : ( FromSC ) ;
    public final void rule__RosServerClientReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4412:1: ( ( FromSC ) )
            // InternalRosSystemParser.g:4413:1: ( FromSC )
            {
            // InternalRosSystemParser.g:4413:1: ( FromSC )
            // InternalRosSystemParser.g:4414:2: FromSC
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
    // InternalRosSystemParser.g:4423:1: rule__RosServerClientReference__Group__1 : rule__RosServerClientReference__Group__1__Impl ;
    public final void rule__RosServerClientReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4427:1: ( rule__RosServerClientReference__Group__1__Impl )
            // InternalRosSystemParser.g:4428:2: rule__RosServerClientReference__Group__1__Impl
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
    // InternalRosSystemParser.g:4434:1: rule__RosServerClientReference__Group__1__Impl : ( ( rule__RosServerClientReference__FromAssignment_1 ) ) ;
    public final void rule__RosServerClientReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4438:1: ( ( ( rule__RosServerClientReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4439:1: ( ( rule__RosServerClientReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4439:1: ( ( rule__RosServerClientReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4440:2: ( rule__RosServerClientReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4441:2: ( rule__RosServerClientReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4441:3: rule__RosServerClientReference__FromAssignment_1
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
    // InternalRosSystemParser.g:4450:1: rule__RosActionServerReference__Group__0 : rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1 ;
    public final void rule__RosActionServerReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4454:1: ( rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1 )
            // InternalRosSystemParser.g:4455:2: rule__RosActionServerReference__Group__0__Impl rule__RosActionServerReference__Group__1
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
    // InternalRosSystemParser.g:4462:1: rule__RosActionServerReference__Group__0__Impl : ( FromAS ) ;
    public final void rule__RosActionServerReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4466:1: ( ( FromAS ) )
            // InternalRosSystemParser.g:4467:1: ( FromAS )
            {
            // InternalRosSystemParser.g:4467:1: ( FromAS )
            // InternalRosSystemParser.g:4468:2: FromAS
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
    // InternalRosSystemParser.g:4477:1: rule__RosActionServerReference__Group__1 : rule__RosActionServerReference__Group__1__Impl ;
    public final void rule__RosActionServerReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4481:1: ( rule__RosActionServerReference__Group__1__Impl )
            // InternalRosSystemParser.g:4482:2: rule__RosActionServerReference__Group__1__Impl
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
    // InternalRosSystemParser.g:4488:1: rule__RosActionServerReference__Group__1__Impl : ( ( rule__RosActionServerReference__FromAssignment_1 ) ) ;
    public final void rule__RosActionServerReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4492:1: ( ( ( rule__RosActionServerReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4493:1: ( ( rule__RosActionServerReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4493:1: ( ( rule__RosActionServerReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4494:2: ( rule__RosActionServerReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4495:2: ( rule__RosActionServerReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4495:3: rule__RosActionServerReference__FromAssignment_1
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
    // InternalRosSystemParser.g:4504:1: rule__RosActionClientReference__Group__0 : rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1 ;
    public final void rule__RosActionClientReference__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4508:1: ( rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1 )
            // InternalRosSystemParser.g:4509:2: rule__RosActionClientReference__Group__0__Impl rule__RosActionClientReference__Group__1
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
    // InternalRosSystemParser.g:4516:1: rule__RosActionClientReference__Group__0__Impl : ( FromAC ) ;
    public final void rule__RosActionClientReference__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4520:1: ( ( FromAC ) )
            // InternalRosSystemParser.g:4521:1: ( FromAC )
            {
            // InternalRosSystemParser.g:4521:1: ( FromAC )
            // InternalRosSystemParser.g:4522:2: FromAC
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
    // InternalRosSystemParser.g:4531:1: rule__RosActionClientReference__Group__1 : rule__RosActionClientReference__Group__1__Impl ;
    public final void rule__RosActionClientReference__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4535:1: ( rule__RosActionClientReference__Group__1__Impl )
            // InternalRosSystemParser.g:4536:2: rule__RosActionClientReference__Group__1__Impl
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
    // InternalRosSystemParser.g:4542:1: rule__RosActionClientReference__Group__1__Impl : ( ( rule__RosActionClientReference__FromAssignment_1 ) ) ;
    public final void rule__RosActionClientReference__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4546:1: ( ( ( rule__RosActionClientReference__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4547:1: ( ( rule__RosActionClientReference__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4547:1: ( ( rule__RosActionClientReference__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4548:2: ( rule__RosActionClientReference__FromAssignment_1 )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4549:2: ( rule__RosActionClientReference__FromAssignment_1 )
            // InternalRosSystemParser.g:4549:3: rule__RosActionClientReference__FromAssignment_1
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
    // InternalRosSystemParser.g:4558:1: rule__RosParameter__Group__0 : rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 ;
    public final void rule__RosParameter__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4562:1: ( rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1 )
            // InternalRosSystemParser.g:4563:2: rule__RosParameter__Group__0__Impl rule__RosParameter__Group__1
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
    // InternalRosSystemParser.g:4570:1: rule__RosParameter__Group__0__Impl : ( ( rule__RosParameter__NameAssignment_0 ) ) ;
    public final void rule__RosParameter__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4574:1: ( ( ( rule__RosParameter__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:4575:1: ( ( rule__RosParameter__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:4575:1: ( ( rule__RosParameter__NameAssignment_0 ) )
            // InternalRosSystemParser.g:4576:2: ( rule__RosParameter__NameAssignment_0 )
            {
             before(grammarAccess.getRosParameterAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:4577:2: ( rule__RosParameter__NameAssignment_0 )
            // InternalRosSystemParser.g:4577:3: rule__RosParameter__NameAssignment_0
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
    // InternalRosSystemParser.g:4585:1: rule__RosParameter__Group__1 : rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 ;
    public final void rule__RosParameter__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4589:1: ( rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2 )
            // InternalRosSystemParser.g:4590:2: rule__RosParameter__Group__1__Impl rule__RosParameter__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:4597:1: rule__RosParameter__Group__1__Impl : ( Colon ) ;
    public final void rule__RosParameter__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4601:1: ( ( Colon ) )
            // InternalRosSystemParser.g:4602:1: ( Colon )
            {
            // InternalRosSystemParser.g:4602:1: ( Colon )
            // InternalRosSystemParser.g:4603:2: Colon
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
    // InternalRosSystemParser.g:4612:1: rule__RosParameter__Group__2 : rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 ;
    public final void rule__RosParameter__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4616:1: ( rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3 )
            // InternalRosSystemParser.g:4617:2: rule__RosParameter__Group__2__Impl rule__RosParameter__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystemParser.g:4624:1: rule__RosParameter__Group__2__Impl : ( ( rule__RosParameter__FromAssignment_2 ) ) ;
    public final void rule__RosParameter__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4628:1: ( ( ( rule__RosParameter__FromAssignment_2 ) ) )
            // InternalRosSystemParser.g:4629:1: ( ( rule__RosParameter__FromAssignment_2 ) )
            {
            // InternalRosSystemParser.g:4629:1: ( ( rule__RosParameter__FromAssignment_2 ) )
            // InternalRosSystemParser.g:4630:2: ( rule__RosParameter__FromAssignment_2 )
            {
             before(grammarAccess.getRosParameterAccess().getFromAssignment_2());
            // InternalRosSystemParser.g:4631:2: ( rule__RosParameter__FromAssignment_2 )
            // InternalRosSystemParser.g:4631:3: rule__RosParameter__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getFromAssignment_2());

            }


            }

        }
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
    // InternalRosSystemParser.g:4639:1: rule__RosParameter__Group__3 : rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 ;
    public final void rule__RosParameter__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4643:1: ( rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4 )
            // InternalRosSystemParser.g:4644:2: rule__RosParameter__Group__3__Impl rule__RosParameter__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalRosSystemParser.g:4651:1: rule__RosParameter__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosParameter__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4655:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:4656:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:4656:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:4657:2: RULE_BEGIN
            {
             before(grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_3());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_3());

            }


            }

        }
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
    // InternalRosSystemParser.g:4666:1: rule__RosParameter__Group__4 : rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 ;
    public final void rule__RosParameter__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4670:1: ( rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5 )
            // InternalRosSystemParser.g:4671:2: rule__RosParameter__Group__4__Impl rule__RosParameter__Group__5
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
    // InternalRosSystemParser.g:4678:1: rule__RosParameter__Group__4__Impl : ( Value_1 ) ;
    public final void rule__RosParameter__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4682:1: ( ( Value_1 ) )
            // InternalRosSystemParser.g:4683:1: ( Value_1 )
            {
            // InternalRosSystemParser.g:4683:1: ( Value_1 )
            // InternalRosSystemParser.g:4684:2: Value_1
            {
             before(grammarAccess.getRosParameterAccess().getValueKeyword_4());
            match(input,Value_1,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getValueKeyword_4());

            }


            }

        }
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
    // InternalRosSystemParser.g:4693:1: rule__RosParameter__Group__5 : rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 ;
    public final void rule__RosParameter__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4697:1: ( rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6 )
            // InternalRosSystemParser.g:4698:2: rule__RosParameter__Group__5__Impl rule__RosParameter__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystemParser.g:4705:1: rule__RosParameter__Group__5__Impl : ( ( rule__RosParameter__ValueAssignment_5 ) ) ;
    public final void rule__RosParameter__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4709:1: ( ( ( rule__RosParameter__ValueAssignment_5 ) ) )
            // InternalRosSystemParser.g:4710:1: ( ( rule__RosParameter__ValueAssignment_5 ) )
            {
            // InternalRosSystemParser.g:4710:1: ( ( rule__RosParameter__ValueAssignment_5 ) )
            // InternalRosSystemParser.g:4711:2: ( rule__RosParameter__ValueAssignment_5 )
            {
             before(grammarAccess.getRosParameterAccess().getValueAssignment_5());
            // InternalRosSystemParser.g:4712:2: ( rule__RosParameter__ValueAssignment_5 )
            // InternalRosSystemParser.g:4712:3: rule__RosParameter__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRosParameterAccess().getValueAssignment_5());

            }


            }

        }
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
    // InternalRosSystemParser.g:4720:1: rule__RosParameter__Group__6 : rule__RosParameter__Group__6__Impl ;
    public final void rule__RosParameter__Group__6() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4724:1: ( rule__RosParameter__Group__6__Impl )
            // InternalRosSystemParser.g:4725:2: rule__RosParameter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosParameter__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:4731:1: rule__RosParameter__Group__6__Impl : ( RULE_END ) ;
    public final void rule__RosParameter__Group__6__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4735:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:4736:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:4736:1: ( RULE_END )
            // InternalRosSystemParser.g:4737:2: RULE_END
            {
             before(grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_6());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_6());

            }


            }

        }
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


    // $ANTLR start "rule__RosConnection__Group__0"
    // InternalRosSystemParser.g:4747:1: rule__RosConnection__Group__0 : rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1 ;
    public final void rule__RosConnection__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4751:1: ( rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1 )
            // InternalRosSystemParser.g:4752:2: rule__RosConnection__Group__0__Impl rule__RosConnection__Group__1
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
    // InternalRosSystemParser.g:4759:1: rule__RosConnection__Group__0__Impl : ( HyphenMinusLeftSquareBracket ) ;
    public final void rule__RosConnection__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4763:1: ( ( HyphenMinusLeftSquareBracket ) )
            // InternalRosSystemParser.g:4764:1: ( HyphenMinusLeftSquareBracket )
            {
            // InternalRosSystemParser.g:4764:1: ( HyphenMinusLeftSquareBracket )
            // InternalRosSystemParser.g:4765:2: HyphenMinusLeftSquareBracket
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
    // InternalRosSystemParser.g:4774:1: rule__RosConnection__Group__1 : rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2 ;
    public final void rule__RosConnection__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4778:1: ( rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2 )
            // InternalRosSystemParser.g:4779:2: rule__RosConnection__Group__1__Impl rule__RosConnection__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalRosSystemParser.g:4786:1: rule__RosConnection__Group__1__Impl : ( ( rule__RosConnection__FromAssignment_1 ) ) ;
    public final void rule__RosConnection__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4790:1: ( ( ( rule__RosConnection__FromAssignment_1 ) ) )
            // InternalRosSystemParser.g:4791:1: ( ( rule__RosConnection__FromAssignment_1 ) )
            {
            // InternalRosSystemParser.g:4791:1: ( ( rule__RosConnection__FromAssignment_1 ) )
            // InternalRosSystemParser.g:4792:2: ( rule__RosConnection__FromAssignment_1 )
            {
             before(grammarAccess.getRosConnectionAccess().getFromAssignment_1());
            // InternalRosSystemParser.g:4793:2: ( rule__RosConnection__FromAssignment_1 )
            // InternalRosSystemParser.g:4793:3: rule__RosConnection__FromAssignment_1
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
    // InternalRosSystemParser.g:4801:1: rule__RosConnection__Group__2 : rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3 ;
    public final void rule__RosConnection__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4805:1: ( rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3 )
            // InternalRosSystemParser.g:4806:2: rule__RosConnection__Group__2__Impl rule__RosConnection__Group__3
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
    // InternalRosSystemParser.g:4813:1: rule__RosConnection__Group__2__Impl : ( Comma ) ;
    public final void rule__RosConnection__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4817:1: ( ( Comma ) )
            // InternalRosSystemParser.g:4818:1: ( Comma )
            {
            // InternalRosSystemParser.g:4818:1: ( Comma )
            // InternalRosSystemParser.g:4819:2: Comma
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
    // InternalRosSystemParser.g:4828:1: rule__RosConnection__Group__3 : rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4 ;
    public final void rule__RosConnection__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4832:1: ( rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4 )
            // InternalRosSystemParser.g:4833:2: rule__RosConnection__Group__3__Impl rule__RosConnection__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystemParser.g:4840:1: rule__RosConnection__Group__3__Impl : ( ( rule__RosConnection__ToAssignment_3 ) ) ;
    public final void rule__RosConnection__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4844:1: ( ( ( rule__RosConnection__ToAssignment_3 ) ) )
            // InternalRosSystemParser.g:4845:1: ( ( rule__RosConnection__ToAssignment_3 ) )
            {
            // InternalRosSystemParser.g:4845:1: ( ( rule__RosConnection__ToAssignment_3 ) )
            // InternalRosSystemParser.g:4846:2: ( rule__RosConnection__ToAssignment_3 )
            {
             before(grammarAccess.getRosConnectionAccess().getToAssignment_3());
            // InternalRosSystemParser.g:4847:2: ( rule__RosConnection__ToAssignment_3 )
            // InternalRosSystemParser.g:4847:3: rule__RosConnection__ToAssignment_3
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
    // InternalRosSystemParser.g:4855:1: rule__RosConnection__Group__4 : rule__RosConnection__Group__4__Impl ;
    public final void rule__RosConnection__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4859:1: ( rule__RosConnection__Group__4__Impl )
            // InternalRosSystemParser.g:4860:2: rule__RosConnection__Group__4__Impl
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
    // InternalRosSystemParser.g:4866:1: rule__RosConnection__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__RosConnection__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4870:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:4871:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:4871:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:4872:2: RightSquareBracket
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
    // InternalRosSystemParser.g:4882:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4886:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalRosSystemParser.g:4887:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRosSystemParser.g:4894:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4898:1: ( ( () ) )
            // InternalRosSystemParser.g:4899:1: ( () )
            {
            // InternalRosSystemParser.g:4899:1: ( () )
            // InternalRosSystemParser.g:4900:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0());
            // InternalRosSystemParser.g:4901:2: ()
            // InternalRosSystemParser.g:4901:3:
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
    // InternalRosSystemParser.g:4909:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4913:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalRosSystemParser.g:4914:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
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
    // InternalRosSystemParser.g:4921:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4925:1: ( ( GlobalNamespace ) )
            // InternalRosSystemParser.g:4926:1: ( GlobalNamespace )
            {
            // InternalRosSystemParser.g:4926:1: ( GlobalNamespace )
            // InternalRosSystemParser.g:4927:2: GlobalNamespace
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
    // InternalRosSystemParser.g:4936:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4940:1: ( rule__GlobalNamespace__Group__2__Impl )
            // InternalRosSystemParser.g:4941:2: rule__GlobalNamespace__Group__2__Impl
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
    // InternalRosSystemParser.g:4947:1: rule__GlobalNamespace__Group__2__Impl : ( ( rule__GlobalNamespace__Group_2__0 )? ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4951:1: ( ( ( rule__GlobalNamespace__Group_2__0 )? ) )
            // InternalRosSystemParser.g:4952:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:4952:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            // InternalRosSystemParser.g:4953:2: ( rule__GlobalNamespace__Group_2__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2());
            // InternalRosSystemParser.g:4954:2: ( rule__GlobalNamespace__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftSquareBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystemParser.g:4954:3: rule__GlobalNamespace__Group_2__0
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
    // InternalRosSystemParser.g:4963:1: rule__GlobalNamespace__Group_2__0 : rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 ;
    public final void rule__GlobalNamespace__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4967:1: ( rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 )
            // InternalRosSystemParser.g:4968:2: rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:4975:1: rule__GlobalNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4979:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:4980:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:4980:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:4981:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:4990:1: rule__GlobalNamespace__Group_2__1 : rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 ;
    public final void rule__GlobalNamespace__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:4994:1: ( rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 )
            // InternalRosSystemParser.g:4995:2: rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5002:1: rule__GlobalNamespace__Group_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5006:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5007:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5007:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5008:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1());
            // InternalRosSystemParser.g:5009:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5009:3: rule__GlobalNamespace__PartsAssignment_2_1
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
    // InternalRosSystemParser.g:5017:1: rule__GlobalNamespace__Group_2__2 : rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 ;
    public final void rule__GlobalNamespace__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5021:1: ( rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 )
            // InternalRosSystemParser.g:5022:2: rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5029:1: rule__GlobalNamespace__Group_2__2__Impl : ( ( rule__GlobalNamespace__Group_2_2__0 )* ) ;
    public final void rule__GlobalNamespace__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5033:1: ( ( ( rule__GlobalNamespace__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5034:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5034:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5035:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2());
            // InternalRosSystemParser.g:5036:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
                case 1 :
                    // InternalRosSystemParser.g:5036:3: rule__GlobalNamespace__Group_2_2__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__GlobalNamespace__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop21;
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
    // InternalRosSystemParser.g:5044:1: rule__GlobalNamespace__Group_2__3 : rule__GlobalNamespace__Group_2__3__Impl ;
    public final void rule__GlobalNamespace__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5048:1: ( rule__GlobalNamespace__Group_2__3__Impl )
            // InternalRosSystemParser.g:5049:2: rule__GlobalNamespace__Group_2__3__Impl
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
    // InternalRosSystemParser.g:5055:1: rule__GlobalNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5059:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5060:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5060:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5061:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5071:1: rule__GlobalNamespace__Group_2_2__0 : rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 ;
    public final void rule__GlobalNamespace__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5075:1: ( rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 )
            // InternalRosSystemParser.g:5076:2: rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5083:1: rule__GlobalNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5087:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5088:1: ( Comma )
            {
            // InternalRosSystemParser.g:5088:1: ( Comma )
            // InternalRosSystemParser.g:5089:2: Comma
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
    // InternalRosSystemParser.g:5098:1: rule__GlobalNamespace__Group_2_2__1 : rule__GlobalNamespace__Group_2_2__1__Impl ;
    public final void rule__GlobalNamespace__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5102:1: ( rule__GlobalNamespace__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5103:2: rule__GlobalNamespace__Group_2_2__1__Impl
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
    // InternalRosSystemParser.g:5109:1: rule__GlobalNamespace__Group_2_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5113:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5114:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5114:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5115:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1());
            // InternalRosSystemParser.g:5116:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5116:3: rule__GlobalNamespace__PartsAssignment_2_2_1
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
    // InternalRosSystemParser.g:5125:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5129:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalRosSystemParser.g:5130:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
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
    // InternalRosSystemParser.g:5137:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5141:1: ( ( () ) )
            // InternalRosSystemParser.g:5142:1: ( () )
            {
            // InternalRosSystemParser.g:5142:1: ( () )
            // InternalRosSystemParser.g:5143:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0());
            // InternalRosSystemParser.g:5144:2: ()
            // InternalRosSystemParser.g:5144:3:
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
    // InternalRosSystemParser.g:5152:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5156:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalRosSystemParser.g:5157:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
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
    // InternalRosSystemParser.g:5164:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5168:1: ( ( RelativeNamespace ) )
            // InternalRosSystemParser.g:5169:1: ( RelativeNamespace )
            {
            // InternalRosSystemParser.g:5169:1: ( RelativeNamespace )
            // InternalRosSystemParser.g:5170:2: RelativeNamespace
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
    // InternalRosSystemParser.g:5179:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5183:1: ( rule__RelativeNamespace_Impl__Group__2__Impl )
            // InternalRosSystemParser.g:5184:2: rule__RelativeNamespace_Impl__Group__2__Impl
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
    // InternalRosSystemParser.g:5190:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5194:1: ( ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5195:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5195:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            // InternalRosSystemParser.g:5196:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2());
            // InternalRosSystemParser.g:5197:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftSquareBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystemParser.g:5197:3: rule__RelativeNamespace_Impl__Group_2__0
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
    // InternalRosSystemParser.g:5206:1: rule__RelativeNamespace_Impl__Group_2__0 : rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5210:1: ( rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 )
            // InternalRosSystemParser.g:5211:2: rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5218:1: rule__RelativeNamespace_Impl__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5222:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5223:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5223:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5224:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5233:1: rule__RelativeNamespace_Impl__Group_2__1 : rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 ;
    public final void rule__RelativeNamespace_Impl__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5237:1: ( rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 )
            // InternalRosSystemParser.g:5238:2: rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5245:1: rule__RelativeNamespace_Impl__Group_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5249:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5250:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5250:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5251:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1());
            // InternalRosSystemParser.g:5252:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5252:3: rule__RelativeNamespace_Impl__PartsAssignment_2_1
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
    // InternalRosSystemParser.g:5260:1: rule__RelativeNamespace_Impl__Group_2__2 : rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 ;
    public final void rule__RelativeNamespace_Impl__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5264:1: ( rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 )
            // InternalRosSystemParser.g:5265:2: rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5272:1: rule__RelativeNamespace_Impl__Group_2__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5276:1: ( ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5277:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5277:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5278:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2());
            // InternalRosSystemParser.g:5279:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
                case 1 :
                    // InternalRosSystemParser.g:5279:3: rule__RelativeNamespace_Impl__Group_2_2__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__RelativeNamespace_Impl__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop23;
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
    // InternalRosSystemParser.g:5287:1: rule__RelativeNamespace_Impl__Group_2__3 : rule__RelativeNamespace_Impl__Group_2__3__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5291:1: ( rule__RelativeNamespace_Impl__Group_2__3__Impl )
            // InternalRosSystemParser.g:5292:2: rule__RelativeNamespace_Impl__Group_2__3__Impl
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
    // InternalRosSystemParser.g:5298:1: rule__RelativeNamespace_Impl__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5302:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5303:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5303:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5304:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5314:1: rule__RelativeNamespace_Impl__Group_2_2__0 : rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5318:1: ( rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 )
            // InternalRosSystemParser.g:5319:2: rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5326:1: rule__RelativeNamespace_Impl__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5330:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5331:1: ( Comma )
            {
            // InternalRosSystemParser.g:5331:1: ( Comma )
            // InternalRosSystemParser.g:5332:2: Comma
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
    // InternalRosSystemParser.g:5341:1: rule__RelativeNamespace_Impl__Group_2_2__1 : rule__RelativeNamespace_Impl__Group_2_2__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5345:1: ( rule__RelativeNamespace_Impl__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5346:2: rule__RelativeNamespace_Impl__Group_2_2__1__Impl
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
    // InternalRosSystemParser.g:5352:1: rule__RelativeNamespace_Impl__Group_2_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5356:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5357:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5357:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5358:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1());
            // InternalRosSystemParser.g:5359:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5359:3: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1
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
    // InternalRosSystemParser.g:5368:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5372:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalRosSystemParser.g:5373:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
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
    // InternalRosSystemParser.g:5380:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5384:1: ( ( () ) )
            // InternalRosSystemParser.g:5385:1: ( () )
            {
            // InternalRosSystemParser.g:5385:1: ( () )
            // InternalRosSystemParser.g:5386:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0());
            // InternalRosSystemParser.g:5387:2: ()
            // InternalRosSystemParser.g:5387:3:
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
    // InternalRosSystemParser.g:5395:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5399:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalRosSystemParser.g:5400:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
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
    // InternalRosSystemParser.g:5407:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5411:1: ( ( PrivateNamespace ) )
            // InternalRosSystemParser.g:5412:1: ( PrivateNamespace )
            {
            // InternalRosSystemParser.g:5412:1: ( PrivateNamespace )
            // InternalRosSystemParser.g:5413:2: PrivateNamespace
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
    // InternalRosSystemParser.g:5422:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5426:1: ( rule__PrivateNamespace__Group__2__Impl )
            // InternalRosSystemParser.g:5427:2: rule__PrivateNamespace__Group__2__Impl
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
    // InternalRosSystemParser.g:5433:1: rule__PrivateNamespace__Group__2__Impl : ( ( rule__PrivateNamespace__Group_2__0 )? ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5437:1: ( ( ( rule__PrivateNamespace__Group_2__0 )? ) )
            // InternalRosSystemParser.g:5438:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:5438:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            // InternalRosSystemParser.g:5439:2: ( rule__PrivateNamespace__Group_2__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2());
            // InternalRosSystemParser.g:5440:2: ( rule__PrivateNamespace__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LeftSquareBracket) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystemParser.g:5440:3: rule__PrivateNamespace__Group_2__0
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
    // InternalRosSystemParser.g:5449:1: rule__PrivateNamespace__Group_2__0 : rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 ;
    public final void rule__PrivateNamespace__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5453:1: ( rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 )
            // InternalRosSystemParser.g:5454:2: rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5461:1: rule__PrivateNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5465:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5466:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5466:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5467:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5476:1: rule__PrivateNamespace__Group_2__1 : rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 ;
    public final void rule__PrivateNamespace__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5480:1: ( rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 )
            // InternalRosSystemParser.g:5481:2: rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5488:1: rule__PrivateNamespace__Group_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5492:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:5493:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:5493:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            // InternalRosSystemParser.g:5494:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1());
            // InternalRosSystemParser.g:5495:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            // InternalRosSystemParser.g:5495:3: rule__PrivateNamespace__PartsAssignment_2_1
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
    // InternalRosSystemParser.g:5503:1: rule__PrivateNamespace__Group_2__2 : rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 ;
    public final void rule__PrivateNamespace__Group_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5507:1: ( rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 )
            // InternalRosSystemParser.g:5508:2: rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5515:1: rule__PrivateNamespace__Group_2__2__Impl : ( ( rule__PrivateNamespace__Group_2_2__0 )* ) ;
    public final void rule__PrivateNamespace__Group_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5519:1: ( ( ( rule__PrivateNamespace__Group_2_2__0 )* ) )
            // InternalRosSystemParser.g:5520:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            {
            // InternalRosSystemParser.g:5520:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            // InternalRosSystemParser.g:5521:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2());
            // InternalRosSystemParser.g:5522:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
                case 1 :
                    // InternalRosSystemParser.g:5522:3: rule__PrivateNamespace__Group_2_2__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__PrivateNamespace__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop25;
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
    // InternalRosSystemParser.g:5530:1: rule__PrivateNamespace__Group_2__3 : rule__PrivateNamespace__Group_2__3__Impl ;
    public final void rule__PrivateNamespace__Group_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5534:1: ( rule__PrivateNamespace__Group_2__3__Impl )
            // InternalRosSystemParser.g:5535:2: rule__PrivateNamespace__Group_2__3__Impl
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
    // InternalRosSystemParser.g:5541:1: rule__PrivateNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5545:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5546:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5546:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5547:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5557:1: rule__PrivateNamespace__Group_2_2__0 : rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 ;
    public final void rule__PrivateNamespace__Group_2_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5561:1: ( rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 )
            // InternalRosSystemParser.g:5562:2: rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRosSystemParser.g:5569:1: rule__PrivateNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_2_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5573:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5574:1: ( Comma )
            {
            // InternalRosSystemParser.g:5574:1: ( Comma )
            // InternalRosSystemParser.g:5575:2: Comma
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
    // InternalRosSystemParser.g:5584:1: rule__PrivateNamespace__Group_2_2__1 : rule__PrivateNamespace__Group_2_2__1__Impl ;
    public final void rule__PrivateNamespace__Group_2_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5588:1: ( rule__PrivateNamespace__Group_2_2__1__Impl )
            // InternalRosSystemParser.g:5589:2: rule__PrivateNamespace__Group_2_2__1__Impl
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
    // InternalRosSystemParser.g:5595:1: rule__PrivateNamespace__Group_2_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5599:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalRosSystemParser.g:5600:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalRosSystemParser.g:5600:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            // InternalRosSystemParser.g:5601:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1());
            // InternalRosSystemParser.g:5602:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            // InternalRosSystemParser.g:5602:3: rule__PrivateNamespace__PartsAssignment_2_2_1
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


    // $ANTLR start "rule__ParameterListType__Group__0"
    // InternalRosSystemParser.g:5611:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5615:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalRosSystemParser.g:5616:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalRosSystemParser.g:5623:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5627:1: ( ( () ) )
            // InternalRosSystemParser.g:5628:1: ( () )
            {
            // InternalRosSystemParser.g:5628:1: ( () )
            // InternalRosSystemParser.g:5629:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0());
            // InternalRosSystemParser.g:5630:2: ()
            // InternalRosSystemParser.g:5630:3:
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
    // InternalRosSystemParser.g:5638:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5642:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalRosSystemParser.g:5643:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
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
    // InternalRosSystemParser.g:5650:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5654:1: ( ( List ) )
            // InternalRosSystemParser.g:5655:1: ( List )
            {
            // InternalRosSystemParser.g:5655:1: ( List )
            // InternalRosSystemParser.g:5656:2: List
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
    // InternalRosSystemParser.g:5665:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5669:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalRosSystemParser.g:5670:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
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
    // InternalRosSystemParser.g:5677:1: rule__ParameterListType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5681:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5682:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5682:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5683:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5692:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5696:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalRosSystemParser.g:5697:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5704:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5708:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:5709:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:5709:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalRosSystemParser.g:5710:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3());
            // InternalRosSystemParser.g:5711:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalRosSystemParser.g:5711:3: rule__ParameterListType__SequenceAssignment_3
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
    // InternalRosSystemParser.g:5719:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5723:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalRosSystemParser.g:5724:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5731:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5735:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:5736:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:5736:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalRosSystemParser.g:5737:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4());
            // InternalRosSystemParser.g:5738:2: ( rule__ParameterListType__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
                case 1 :
                    // InternalRosSystemParser.g:5738:3: rule__ParameterListType__Group_4__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__ParameterListType__Group_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop26;
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
    // InternalRosSystemParser.g:5746:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5750:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalRosSystemParser.g:5751:2: rule__ParameterListType__Group__5__Impl
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
    // InternalRosSystemParser.g:5757:1: rule__ParameterListType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5761:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5762:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5762:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5763:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5773:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5777:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalRosSystemParser.g:5778:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
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
    // InternalRosSystemParser.g:5785:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5789:1: ( ( Comma ) )
            // InternalRosSystemParser.g:5790:1: ( Comma )
            {
            // InternalRosSystemParser.g:5790:1: ( Comma )
            // InternalRosSystemParser.g:5791:2: Comma
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
    // InternalRosSystemParser.g:5800:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5804:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalRosSystemParser.g:5805:2: rule__ParameterListType__Group_4__1__Impl
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
    // InternalRosSystemParser.g:5811:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5815:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:5816:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:5816:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalRosSystemParser.g:5817:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1());
            // InternalRosSystemParser.g:5818:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalRosSystemParser.g:5818:3: rule__ParameterListType__SequenceAssignment_4_1
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
    // InternalRosSystemParser.g:5827:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5831:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalRosSystemParser.g:5832:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalRosSystemParser.g:5839:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5843:1: ( ( () ) )
            // InternalRosSystemParser.g:5844:1: ( () )
            {
            // InternalRosSystemParser.g:5844:1: ( () )
            // InternalRosSystemParser.g:5845:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0());
            // InternalRosSystemParser.g:5846:2: ()
            // InternalRosSystemParser.g:5846:3:
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
    // InternalRosSystemParser.g:5854:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5858:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalRosSystemParser.g:5859:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
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
    // InternalRosSystemParser.g:5866:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5870:1: ( ( Struct ) )
            // InternalRosSystemParser.g:5871:1: ( Struct )
            {
            // InternalRosSystemParser.g:5871:1: ( Struct )
            // InternalRosSystemParser.g:5872:2: Struct
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
    // InternalRosSystemParser.g:5881:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5885:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalRosSystemParser.g:5886:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
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
    // InternalRosSystemParser.g:5893:1: rule__ParameterStructType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5897:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:5898:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:5898:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:5899:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:5908:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5912:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalRosSystemParser.g:5913:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5920:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5924:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalRosSystemParser.g:5925:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalRosSystemParser.g:5925:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalRosSystemParser.g:5926:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3());
            // InternalRosSystemParser.g:5927:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalRosSystemParser.g:5927:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
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
    // InternalRosSystemParser.g:5935:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5939:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalRosSystemParser.g:5940:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:5947:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5951:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:5952:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:5952:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalRosSystemParser.g:5953:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4());
            // InternalRosSystemParser.g:5954:2: ( rule__ParameterStructType__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
                case 1 :
                    // InternalRosSystemParser.g:5954:3: rule__ParameterStructType__Group_4__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__ParameterStructType__Group_4__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop27;
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
    // InternalRosSystemParser.g:5962:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5966:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalRosSystemParser.g:5967:2: rule__ParameterStructType__Group__5__Impl
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
    // InternalRosSystemParser.g:5973:1: rule__ParameterStructType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5977:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:5978:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:5978:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:5979:2: RightSquareBracket
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
    // InternalRosSystemParser.g:5989:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:5993:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalRosSystemParser.g:5994:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
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
    // InternalRosSystemParser.g:6001:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6005:1: ( ( Comma ) )
            // InternalRosSystemParser.g:6006:1: ( Comma )
            {
            // InternalRosSystemParser.g:6006:1: ( Comma )
            // InternalRosSystemParser.g:6007:2: Comma
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
    // InternalRosSystemParser.g:6016:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6020:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalRosSystemParser.g:6021:2: rule__ParameterStructType__Group_4__1__Impl
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
    // InternalRosSystemParser.g:6027:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6031:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:6032:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:6032:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalRosSystemParser.g:6033:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1());
            // InternalRosSystemParser.g:6034:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalRosSystemParser.g:6034:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
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
    // InternalRosSystemParser.g:6043:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6047:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalRosSystemParser.g:6048:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalRosSystemParser.g:6055:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6059:1: ( ( () ) )
            // InternalRosSystemParser.g:6060:1: ( () )
            {
            // InternalRosSystemParser.g:6060:1: ( () )
            // InternalRosSystemParser.g:6061:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0());
            // InternalRosSystemParser.g:6062:2: ()
            // InternalRosSystemParser.g:6062:3:
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
    // InternalRosSystemParser.g:6070:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6074:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalRosSystemParser.g:6075:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6082:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6086:1: ( ( Integer ) )
            // InternalRosSystemParser.g:6087:1: ( Integer )
            {
            // InternalRosSystemParser.g:6087:1: ( Integer )
            // InternalRosSystemParser.g:6088:2: Integer
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
    // InternalRosSystemParser.g:6097:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6101:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalRosSystemParser.g:6102:2: rule__ParameterIntegerType__Group__2__Impl
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
    // InternalRosSystemParser.g:6108:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6112:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6113:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6113:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalRosSystemParser.g:6114:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6115:2: ( rule__ParameterIntegerType__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Default) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_DECINT) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystemParser.g:6115:3: rule__ParameterIntegerType__Group_2__0
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
    // InternalRosSystemParser.g:6124:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6128:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalRosSystemParser.g:6129:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRosSystemParser.g:6136:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6140:1: ( ( Default ) )
            // InternalRosSystemParser.g:6141:1: ( Default )
            {
            // InternalRosSystemParser.g:6141:1: ( Default )
            // InternalRosSystemParser.g:6142:2: Default
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
    // InternalRosSystemParser.g:6151:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6155:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6156:2: rule__ParameterIntegerType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6162:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6166:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6167:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6167:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6168:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6169:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6169:3: rule__ParameterIntegerType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6178:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6182:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalRosSystemParser.g:6183:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalRosSystemParser.g:6190:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6194:1: ( ( () ) )
            // InternalRosSystemParser.g:6195:1: ( () )
            {
            // InternalRosSystemParser.g:6195:1: ( () )
            // InternalRosSystemParser.g:6196:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0());
            // InternalRosSystemParser.g:6197:2: ()
            // InternalRosSystemParser.g:6197:3:
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
    // InternalRosSystemParser.g:6205:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6209:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalRosSystemParser.g:6210:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6217:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6221:1: ( ( String ) )
            // InternalRosSystemParser.g:6222:1: ( String )
            {
            // InternalRosSystemParser.g:6222:1: ( String )
            // InternalRosSystemParser.g:6223:2: String
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
    // InternalRosSystemParser.g:6232:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6236:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalRosSystemParser.g:6237:2: rule__ParameterStringType__Group__2__Impl
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
    // InternalRosSystemParser.g:6243:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6247:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6248:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6248:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalRosSystemParser.g:6249:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6250:2: ( rule__ParameterStringType__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Default) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>=RULE_ID && LA29_1<=RULE_STRING)) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystemParser.g:6250:3: rule__ParameterStringType__Group_2__0
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
    // InternalRosSystemParser.g:6259:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6263:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalRosSystemParser.g:6264:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
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
    // InternalRosSystemParser.g:6271:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6275:1: ( ( Default ) )
            // InternalRosSystemParser.g:6276:1: ( Default )
            {
            // InternalRosSystemParser.g:6276:1: ( Default )
            // InternalRosSystemParser.g:6277:2: Default
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
    // InternalRosSystemParser.g:6286:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6290:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6291:2: rule__ParameterStringType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6297:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6301:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6302:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6302:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6303:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6304:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6304:3: rule__ParameterStringType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6313:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6317:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalRosSystemParser.g:6318:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalRosSystemParser.g:6325:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6329:1: ( ( () ) )
            // InternalRosSystemParser.g:6330:1: ( () )
            {
            // InternalRosSystemParser.g:6330:1: ( () )
            // InternalRosSystemParser.g:6331:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0());
            // InternalRosSystemParser.g:6332:2: ()
            // InternalRosSystemParser.g:6332:3:
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
    // InternalRosSystemParser.g:6340:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6344:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalRosSystemParser.g:6345:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6352:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6356:1: ( ( Double ) )
            // InternalRosSystemParser.g:6357:1: ( Double )
            {
            // InternalRosSystemParser.g:6357:1: ( Double )
            // InternalRosSystemParser.g:6358:2: Double
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
    // InternalRosSystemParser.g:6367:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6371:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalRosSystemParser.g:6372:2: rule__ParameterDoubleType__Group__2__Impl
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
    // InternalRosSystemParser.g:6378:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6382:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6383:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6383:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalRosSystemParser.g:6384:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6385:2: ( rule__ParameterDoubleType__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Default) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_DOUBLE) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystemParser.g:6385:3: rule__ParameterDoubleType__Group_2__0
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
    // InternalRosSystemParser.g:6394:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6398:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalRosSystemParser.g:6399:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalRosSystemParser.g:6406:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6410:1: ( ( Default ) )
            // InternalRosSystemParser.g:6411:1: ( Default )
            {
            // InternalRosSystemParser.g:6411:1: ( Default )
            // InternalRosSystemParser.g:6412:2: Default
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
    // InternalRosSystemParser.g:6421:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6425:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6426:2: rule__ParameterDoubleType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6432:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6436:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6437:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6437:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6438:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6439:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6439:3: rule__ParameterDoubleType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6448:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6452:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalRosSystemParser.g:6453:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalRosSystemParser.g:6460:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6464:1: ( ( () ) )
            // InternalRosSystemParser.g:6465:1: ( () )
            {
            // InternalRosSystemParser.g:6465:1: ( () )
            // InternalRosSystemParser.g:6466:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0());
            // InternalRosSystemParser.g:6467:2: ()
            // InternalRosSystemParser.g:6467:3:
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
    // InternalRosSystemParser.g:6475:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6479:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalRosSystemParser.g:6480:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6487:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6491:1: ( ( Boolean ) )
            // InternalRosSystemParser.g:6492:1: ( Boolean )
            {
            // InternalRosSystemParser.g:6492:1: ( Boolean )
            // InternalRosSystemParser.g:6493:2: Boolean
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
    // InternalRosSystemParser.g:6502:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6506:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalRosSystemParser.g:6507:2: rule__ParameterBooleanType__Group__2__Impl
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
    // InternalRosSystemParser.g:6513:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6517:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6518:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6518:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalRosSystemParser.g:6519:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6520:2: ( rule__ParameterBooleanType__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Default) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_BOOLEAN) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystemParser.g:6520:3: rule__ParameterBooleanType__Group_2__0
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
    // InternalRosSystemParser.g:6529:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6533:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalRosSystemParser.g:6534:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalRosSystemParser.g:6541:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6545:1: ( ( Default ) )
            // InternalRosSystemParser.g:6546:1: ( Default )
            {
            // InternalRosSystemParser.g:6546:1: ( Default )
            // InternalRosSystemParser.g:6547:2: Default
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
    // InternalRosSystemParser.g:6556:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6560:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalRosSystemParser.g:6561:2: rule__ParameterBooleanType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6567:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6571:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6572:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6572:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6573:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6574:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6574:3: rule__ParameterBooleanType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6583:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6587:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalRosSystemParser.g:6588:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalRosSystemParser.g:6595:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6599:1: ( ( () ) )
            // InternalRosSystemParser.g:6600:1: ( () )
            {
            // InternalRosSystemParser.g:6600:1: ( () )
            // InternalRosSystemParser.g:6601:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0());
            // InternalRosSystemParser.g:6602:2: ()
            // InternalRosSystemParser.g:6602:3:
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
    // InternalRosSystemParser.g:6610:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6614:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalRosSystemParser.g:6615:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalRosSystemParser.g:6622:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6626:1: ( ( Base64 ) )
            // InternalRosSystemParser.g:6627:1: ( Base64 )
            {
            // InternalRosSystemParser.g:6627:1: ( Base64 )
            // InternalRosSystemParser.g:6628:2: Base64
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
    // InternalRosSystemParser.g:6637:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6641:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalRosSystemParser.g:6642:2: rule__ParameterBase64Type__Group__2__Impl
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
    // InternalRosSystemParser.g:6648:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6652:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalRosSystemParser.g:6653:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:6653:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalRosSystemParser.g:6654:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2());
            // InternalRosSystemParser.g:6655:2: ( rule__ParameterBase64Type__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==RULE_BINARY) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystemParser.g:6655:3: rule__ParameterBase64Type__Group_2__0
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
    // InternalRosSystemParser.g:6664:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6668:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalRosSystemParser.g:6669:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalRosSystemParser.g:6676:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6680:1: ( ( Default ) )
            // InternalRosSystemParser.g:6681:1: ( Default )
            {
            // InternalRosSystemParser.g:6681:1: ( Default )
            // InternalRosSystemParser.g:6682:2: Default
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
    // InternalRosSystemParser.g:6691:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6695:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalRosSystemParser.g:6696:2: rule__ParameterBase64Type__Group_2__1__Impl
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
    // InternalRosSystemParser.g:6702:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6706:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:6707:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:6707:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:6708:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1());
            // InternalRosSystemParser.g:6709:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:6709:3: rule__ParameterBase64Type__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:6718:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6722:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalRosSystemParser.g:6723:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalRosSystemParser.g:6730:1: rule__ParameterArrayType__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6734:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:6735:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:6735:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:6736:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());

            }


            }

        }
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
    // InternalRosSystemParser.g:6745:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6749:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalRosSystemParser.g:6750:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystemParser.g:6757:1: rule__ParameterArrayType__Group__1__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6761:1: ( ( Array ) )
            // InternalRosSystemParser.g:6762:1: ( Array )
            {
            // InternalRosSystemParser.g:6762:1: ( Array )
            // InternalRosSystemParser.g:6763:2: Array
            {
             before(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());
            match(input,Array,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());

            }


            }

        }
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
    // InternalRosSystemParser.g:6772:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6776:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalRosSystemParser.g:6777:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalRosSystemParser.g:6784:1: rule__ParameterArrayType__Group__2__Impl : ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6788:1: ( ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) )
            // InternalRosSystemParser.g:6789:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            {
            // InternalRosSystemParser.g:6789:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            // InternalRosSystemParser.g:6790:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2());
            // InternalRosSystemParser.g:6791:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            // InternalRosSystemParser.g:6791:3: rule__ParameterArrayType__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2());

            }


            }

        }
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
    // InternalRosSystemParser.g:6799:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6803:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalRosSystemParser.g:6804:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalRosSystemParser.g:6811:1: rule__ParameterArrayType__Group__3__Impl : ( ( rule__ParameterArrayType__Group_3__0 )? ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6815:1: ( ( ( rule__ParameterArrayType__Group_3__0 )? ) )
            // InternalRosSystemParser.g:6816:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            {
            // InternalRosSystemParser.g:6816:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            // InternalRosSystemParser.g:6817:2: ( rule__ParameterArrayType__Group_3__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_3());
            // InternalRosSystemParser.g:6818:2: ( rule__ParameterArrayType__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Default) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystemParser.g:6818:3: rule__ParameterArrayType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterArrayType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup_3());

            }


            }

        }
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
    // InternalRosSystemParser.g:6826:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6830:1: ( rule__ParameterArrayType__Group__4__Impl )
            // InternalRosSystemParser.g:6831:2: rule__ParameterArrayType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:6837:1: rule__ParameterArrayType__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6841:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:6842:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:6842:1: ( RULE_END )
            // InternalRosSystemParser.g:6843:2: RULE_END
            {
             before(grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_4());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_4());

            }


            }

        }
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


    // $ANTLR start "rule__ParameterArrayType__Group_3__0"
    // InternalRosSystemParser.g:6853:1: rule__ParameterArrayType__Group_3__0 : rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 ;
    public final void rule__ParameterArrayType__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6857:1: ( rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 )
            // InternalRosSystemParser.g:6858:2: rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterArrayType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__0"


    // $ANTLR start "rule__ParameterArrayType__Group_3__0__Impl"
    // InternalRosSystemParser.g:6865:1: rule__ParameterArrayType__Group_3__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6869:1: ( ( Default ) )
            // InternalRosSystemParser.g:6870:1: ( Default )
            {
            // InternalRosSystemParser.g:6870:1: ( Default )
            // InternalRosSystemParser.g:6871:2: Default
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());
            match(input,Default,FOLLOW_2);
             after(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_3__1"
    // InternalRosSystemParser.g:6880:1: rule__ParameterArrayType__Group_3__1 : rule__ParameterArrayType__Group_3__1__Impl ;
    public final void rule__ParameterArrayType__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6884:1: ( rule__ParameterArrayType__Group_3__1__Impl )
            // InternalRosSystemParser.g:6885:2: rule__ParameterArrayType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__1"


    // $ANTLR start "rule__ParameterArrayType__Group_3__1__Impl"
    // InternalRosSystemParser.g:6891:1: rule__ParameterArrayType__Group_3__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) ;
    public final void rule__ParameterArrayType__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6895:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:6896:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:6896:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            // InternalRosSystemParser.g:6897:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_3_1());
            // InternalRosSystemParser.g:6898:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            // InternalRosSystemParser.g:6898:3: rule__ParameterArrayType__DefaultAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__DefaultAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_3_1());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalRosSystemParser.g:6907:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6911:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalRosSystemParser.g:6912:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
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
    // InternalRosSystemParser.g:6919:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6923:1: ( ( () ) )
            // InternalRosSystemParser.g:6924:1: ( () )
            {
            // InternalRosSystemParser.g:6924:1: ( () )
            // InternalRosSystemParser.g:6925:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0());
            // InternalRosSystemParser.g:6926:2: ()
            // InternalRosSystemParser.g:6926:3:
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
    // InternalRosSystemParser.g:6934:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6938:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalRosSystemParser.g:6939:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystemParser.g:6946:1: rule__ParameterList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6950:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:6951:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:6951:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:6952:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:6961:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6965:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalRosSystemParser.g:6966:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:6973:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6977:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalRosSystemParser.g:6978:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalRosSystemParser.g:6978:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalRosSystemParser.g:6979:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2());
            // InternalRosSystemParser.g:6980:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalRosSystemParser.g:6980:3: rule__ParameterList__ValueAssignment_2
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
    // InternalRosSystemParser.g:6988:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:6992:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalRosSystemParser.g:6993:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:7000:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7004:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalRosSystemParser.g:7005:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalRosSystemParser.g:7005:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalRosSystemParser.g:7006:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3());
            // InternalRosSystemParser.g:7007:2: ( rule__ParameterList__Group_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
                case 1 :
                    // InternalRosSystemParser.g:7007:3: rule__ParameterList__Group_3__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__ParameterList__Group_3__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop34;
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
    // InternalRosSystemParser.g:7015:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7019:1: ( rule__ParameterList__Group__4__Impl )
            // InternalRosSystemParser.g:7020:2: rule__ParameterList__Group__4__Impl
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
    // InternalRosSystemParser.g:7026:1: rule__ParameterList__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7030:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7031:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7031:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7032:2: RightSquareBracket
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
    // InternalRosSystemParser.g:7042:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7046:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalRosSystemParser.g:7047:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystemParser.g:7054:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7058:1: ( ( Comma ) )
            // InternalRosSystemParser.g:7059:1: ( Comma )
            {
            // InternalRosSystemParser.g:7059:1: ( Comma )
            // InternalRosSystemParser.g:7060:2: Comma
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
    // InternalRosSystemParser.g:7069:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7073:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalRosSystemParser.g:7074:2: rule__ParameterList__Group_3__1__Impl
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
    // InternalRosSystemParser.g:7080:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7084:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:7085:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:7085:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalRosSystemParser.g:7086:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1());
            // InternalRosSystemParser.g:7087:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalRosSystemParser.g:7087:3: rule__ParameterList__ValueAssignment_3_1
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
    // InternalRosSystemParser.g:7096:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7100:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalRosSystemParser.g:7101:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalRosSystemParser.g:7108:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7112:1: ( ( () ) )
            // InternalRosSystemParser.g:7113:1: ( () )
            {
            // InternalRosSystemParser.g:7113:1: ( () )
            // InternalRosSystemParser.g:7114:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0());
            // InternalRosSystemParser.g:7115:2: ()
            // InternalRosSystemParser.g:7115:3:
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
    // InternalRosSystemParser.g:7123:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7127:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalRosSystemParser.g:7128:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalRosSystemParser.g:7135:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7139:1: ( ( ParameterAny ) )
            // InternalRosSystemParser.g:7140:1: ( ParameterAny )
            {
            // InternalRosSystemParser.g:7140:1: ( ParameterAny )
            // InternalRosSystemParser.g:7141:2: ParameterAny
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
    // InternalRosSystemParser.g:7150:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7154:1: ( rule__ParameterAny__Group__2__Impl )
            // InternalRosSystemParser.g:7155:2: rule__ParameterAny__Group__2__Impl
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
    // InternalRosSystemParser.g:7161:1: rule__ParameterAny__Group__2__Impl : ( ( rule__ParameterAny__Group_2__0 )? ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7165:1: ( ( ( rule__ParameterAny__Group_2__0 )? ) )
            // InternalRosSystemParser.g:7166:1: ( ( rule__ParameterAny__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:7166:1: ( ( rule__ParameterAny__Group_2__0 )? )
            // InternalRosSystemParser.g:7167:2: ( rule__ParameterAny__Group_2__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_2());
            // InternalRosSystemParser.g:7168:2: ( rule__ParameterAny__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRosSystemParser.g:7168:3: rule__ParameterAny__Group_2__0
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
    // InternalRosSystemParser.g:7177:1: rule__ParameterAny__Group_2__0 : rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 ;
    public final void rule__ParameterAny__Group_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7181:1: ( rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 )
            // InternalRosSystemParser.g:7182:2: rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1
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
    // InternalRosSystemParser.g:7189:1: rule__ParameterAny__Group_2__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7193:1: ( ( Value ) )
            // InternalRosSystemParser.g:7194:1: ( Value )
            {
            // InternalRosSystemParser.g:7194:1: ( Value )
            // InternalRosSystemParser.g:7195:2: Value
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
    // InternalRosSystemParser.g:7204:1: rule__ParameterAny__Group_2__1 : rule__ParameterAny__Group_2__1__Impl ;
    public final void rule__ParameterAny__Group_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7208:1: ( rule__ParameterAny__Group_2__1__Impl )
            // InternalRosSystemParser.g:7209:2: rule__ParameterAny__Group_2__1__Impl
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
    // InternalRosSystemParser.g:7215:1: rule__ParameterAny__Group_2__1__Impl : ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterAny__Group_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7219:1: ( ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:7220:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:7220:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            // InternalRosSystemParser.g:7221:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1());
            // InternalRosSystemParser.g:7222:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            // InternalRosSystemParser.g:7222:3: rule__ParameterAny__ValueAssignment_2_1
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
    // InternalRosSystemParser.g:7231:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7235:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalRosSystemParser.g:7236:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystemParser.g:7243:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7247:1: ( ( () ) )
            // InternalRosSystemParser.g:7248:1: ( () )
            {
            // InternalRosSystemParser.g:7248:1: ( () )
            // InternalRosSystemParser.g:7249:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0());
            // InternalRosSystemParser.g:7250:2: ()
            // InternalRosSystemParser.g:7250:3:
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
    // InternalRosSystemParser.g:7258:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7262:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalRosSystemParser.g:7263:2: rule__ParameterStruct__Group__1__Impl
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
    // InternalRosSystemParser.g:7269:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7273:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalRosSystemParser.g:7274:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalRosSystemParser.g:7274:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalRosSystemParser.g:7275:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1());
            // InternalRosSystemParser.g:7276:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftSquareBracket) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystemParser.g:7276:3: rule__ParameterStruct__Group_1__0
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
    // InternalRosSystemParser.g:7285:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7289:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalRosSystemParser.g:7290:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:7297:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7301:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7302:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7302:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7303:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:7312:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7316:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalRosSystemParser.g:7317:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:7324:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7328:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalRosSystemParser.g:7329:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalRosSystemParser.g:7329:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalRosSystemParser.g:7330:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1());
            // InternalRosSystemParser.g:7331:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalRosSystemParser.g:7331:3: rule__ParameterStruct__ValueAssignment_1_1
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
    // InternalRosSystemParser.g:7339:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7343:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalRosSystemParser.g:7344:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalRosSystemParser.g:7351:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7355:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalRosSystemParser.g:7356:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalRosSystemParser.g:7356:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalRosSystemParser.g:7357:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2());
            // InternalRosSystemParser.g:7358:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==Comma) ) {
                    alt37=1;
                }


                switch (alt37) {
                case 1 :
                    // InternalRosSystemParser.g:7358:3: rule__ParameterStruct__Group_1_2__0
                    {
                    pushFollow(FOLLOW_16);
                    rule__ParameterStruct__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

                default :
                    break loop37;
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
    // InternalRosSystemParser.g:7366:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7370:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalRosSystemParser.g:7371:2: rule__ParameterStruct__Group_1__3__Impl
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
    // InternalRosSystemParser.g:7377:1: rule__ParameterStruct__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7381:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7382:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7382:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7383:2: RightSquareBracket
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
    // InternalRosSystemParser.g:7393:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7397:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalRosSystemParser.g:7398:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
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
    // InternalRosSystemParser.g:7405:1: rule__ParameterStruct__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7409:1: ( ( Comma ) )
            // InternalRosSystemParser.g:7410:1: ( Comma )
            {
            // InternalRosSystemParser.g:7410:1: ( Comma )
            // InternalRosSystemParser.g:7411:2: Comma
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
    // InternalRosSystemParser.g:7420:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7424:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalRosSystemParser.g:7425:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:7432:1: rule__ParameterStruct__Group_1_2__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7436:1: ( ( LeftSquareBracket ) )
            // InternalRosSystemParser.g:7437:1: ( LeftSquareBracket )
            {
            // InternalRosSystemParser.g:7437:1: ( LeftSquareBracket )
            // InternalRosSystemParser.g:7438:2: LeftSquareBracket
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
    // InternalRosSystemParser.g:7447:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7451:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalRosSystemParser.g:7452:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystemParser.g:7459:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7463:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalRosSystemParser.g:7464:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalRosSystemParser.g:7464:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalRosSystemParser.g:7465:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2());
            // InternalRosSystemParser.g:7466:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalRosSystemParser.g:7466:3: rule__ParameterStruct__ValueAssignment_1_2_2
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
    // InternalRosSystemParser.g:7474:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7478:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalRosSystemParser.g:7479:2: rule__ParameterStruct__Group_1_2__3__Impl
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
    // InternalRosSystemParser.g:7485:1: rule__ParameterStruct__Group_1_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7489:1: ( ( RightSquareBracket ) )
            // InternalRosSystemParser.g:7490:1: ( RightSquareBracket )
            {
            // InternalRosSystemParser.g:7490:1: ( RightSquareBracket )
            // InternalRosSystemParser.g:7491:2: RightSquareBracket
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
    // InternalRosSystemParser.g:7501:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7505:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalRosSystemParser.g:7506:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:7513:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7517:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:7518:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:7518:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:7519:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:7520:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalRosSystemParser.g:7520:3: rule__ParameterStructMember__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0());

            }


            }

        }
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
    // InternalRosSystemParser.g:7528:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7532:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalRosSystemParser.g:7533:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystemParser.g:7540:1: rule__ParameterStructMember__Group__1__Impl : ( Colon ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7544:1: ( ( Colon ) )
            // InternalRosSystemParser.g:7545:1: ( Colon )
            {
            // InternalRosSystemParser.g:7545:1: ( Colon )
            // InternalRosSystemParser.g:7546:2: Colon
            {
             before(grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
            match(input,Colon,FOLLOW_2);
             after(grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());

            }


            }

        }
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
    // InternalRosSystemParser.g:7555:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7559:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalRosSystemParser.g:7560:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRosSystemParser.g:7567:1: rule__ParameterStructMember__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7571:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:7572:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:7572:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:7573:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());
            match(input,RULE_BEGIN,FOLLOW_2);
             after(grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());

            }


            }

        }
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
    // InternalRosSystemParser.g:7582:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7586:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalRosSystemParser.g:7587:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystemParser.g:7594:1: rule__ParameterStructMember__Group__3__Impl : ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7598:1: ( ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) )
            // InternalRosSystemParser.g:7599:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            {
            // InternalRosSystemParser.g:7599:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            // InternalRosSystemParser.g:7600:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3());
            // InternalRosSystemParser.g:7601:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            // InternalRosSystemParser.g:7601:3: rule__ParameterStructMember__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3());

            }


            }

        }
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
    // InternalRosSystemParser.g:7609:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7613:1: ( rule__ParameterStructMember__Group__4__Impl )
            // InternalRosSystemParser.g:7614:2: rule__ParameterStructMember__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructMember__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:7620:1: rule__ParameterStructMember__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7624:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:7625:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:7625:1: ( RULE_END )
            // InternalRosSystemParser.g:7626:2: RULE_END
            {
             before(grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_4());
            match(input,RULE_END,FOLLOW_2);
             after(grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_4());

            }


            }

        }
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


    // $ANTLR start "rule__ParameterStructTypeMember__Group__0"
    // InternalRosSystemParser.g:7636:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7640:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalRosSystemParser.g:7641:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
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
    // InternalRosSystemParser.g:7648:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7652:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:7653:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:7653:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:7654:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0());
            // InternalRosSystemParser.g:7655:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalRosSystemParser.g:7655:3: rule__ParameterStructTypeMember__NameAssignment_0
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
    // InternalRosSystemParser.g:7663:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7667:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalRosSystemParser.g:7668:2: rule__ParameterStructTypeMember__Group__1__Impl
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
    // InternalRosSystemParser.g:7674:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7678:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalRosSystemParser.g:7679:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalRosSystemParser.g:7679:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalRosSystemParser.g:7680:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1());
            // InternalRosSystemParser.g:7681:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalRosSystemParser.g:7681:3: rule__ParameterStructTypeMember__TypeAssignment_1
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
    // InternalRosSystemParser.g:7690:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7694:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalRosSystemParser.g:7695:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalRosSystemParser.g:7702:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7706:1: ( ( () ) )
            // InternalRosSystemParser.g:7707:1: ( () )
            {
            // InternalRosSystemParser.g:7707:1: ( () )
            // InternalRosSystemParser.g:7708:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0());
            // InternalRosSystemParser.g:7709:2: ()
            // InternalRosSystemParser.g:7709:3:
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
    // InternalRosSystemParser.g:7717:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7721:1: ( rule__Bool__Group__1__Impl )
            // InternalRosSystemParser.g:7722:2: rule__Bool__Group__1__Impl
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
    // InternalRosSystemParser.g:7728:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7732:1: ( ( Bool ) )
            // InternalRosSystemParser.g:7733:1: ( Bool )
            {
            // InternalRosSystemParser.g:7733:1: ( Bool )
            // InternalRosSystemParser.g:7734:2: Bool
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
    // InternalRosSystemParser.g:7744:1: rule__Int8__Group__0 : rule__Int8__Group__0__Impl rule__Int8__Group__1 ;
    public final void rule__Int8__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7748:1: ( rule__Int8__Group__0__Impl rule__Int8__Group__1 )
            // InternalRosSystemParser.g:7749:2: rule__Int8__Group__0__Impl rule__Int8__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalRosSystemParser.g:7756:1: rule__Int8__Group__0__Impl : ( () ) ;
    public final void rule__Int8__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7760:1: ( ( () ) )
            // InternalRosSystemParser.g:7761:1: ( () )
            {
            // InternalRosSystemParser.g:7761:1: ( () )
            // InternalRosSystemParser.g:7762:2: ()
            {
             before(grammarAccess.getInt8Access().getInt8Action_0());
            // InternalRosSystemParser.g:7763:2: ()
            // InternalRosSystemParser.g:7763:3:
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
    // InternalRosSystemParser.g:7771:1: rule__Int8__Group__1 : rule__Int8__Group__1__Impl ;
    public final void rule__Int8__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7775:1: ( rule__Int8__Group__1__Impl )
            // InternalRosSystemParser.g:7776:2: rule__Int8__Group__1__Impl
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
    // InternalRosSystemParser.g:7782:1: rule__Int8__Group__1__Impl : ( Int8 ) ;
    public final void rule__Int8__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7786:1: ( ( Int8 ) )
            // InternalRosSystemParser.g:7787:1: ( Int8 )
            {
            // InternalRosSystemParser.g:7787:1: ( Int8 )
            // InternalRosSystemParser.g:7788:2: Int8
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
    // InternalRosSystemParser.g:7798:1: rule__Uint8__Group__0 : rule__Uint8__Group__0__Impl rule__Uint8__Group__1 ;
    public final void rule__Uint8__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7802:1: ( rule__Uint8__Group__0__Impl rule__Uint8__Group__1 )
            // InternalRosSystemParser.g:7803:2: rule__Uint8__Group__0__Impl rule__Uint8__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalRosSystemParser.g:7810:1: rule__Uint8__Group__0__Impl : ( () ) ;
    public final void rule__Uint8__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7814:1: ( ( () ) )
            // InternalRosSystemParser.g:7815:1: ( () )
            {
            // InternalRosSystemParser.g:7815:1: ( () )
            // InternalRosSystemParser.g:7816:2: ()
            {
             before(grammarAccess.getUint8Access().getUint8Action_0());
            // InternalRosSystemParser.g:7817:2: ()
            // InternalRosSystemParser.g:7817:3:
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
    // InternalRosSystemParser.g:7825:1: rule__Uint8__Group__1 : rule__Uint8__Group__1__Impl ;
    public final void rule__Uint8__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7829:1: ( rule__Uint8__Group__1__Impl )
            // InternalRosSystemParser.g:7830:2: rule__Uint8__Group__1__Impl
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
    // InternalRosSystemParser.g:7836:1: rule__Uint8__Group__1__Impl : ( Uint8 ) ;
    public final void rule__Uint8__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7840:1: ( ( Uint8 ) )
            // InternalRosSystemParser.g:7841:1: ( Uint8 )
            {
            // InternalRosSystemParser.g:7841:1: ( Uint8 )
            // InternalRosSystemParser.g:7842:2: Uint8
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
    // InternalRosSystemParser.g:7852:1: rule__Int16__Group__0 : rule__Int16__Group__0__Impl rule__Int16__Group__1 ;
    public final void rule__Int16__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7856:1: ( rule__Int16__Group__0__Impl rule__Int16__Group__1 )
            // InternalRosSystemParser.g:7857:2: rule__Int16__Group__0__Impl rule__Int16__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalRosSystemParser.g:7864:1: rule__Int16__Group__0__Impl : ( () ) ;
    public final void rule__Int16__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7868:1: ( ( () ) )
            // InternalRosSystemParser.g:7869:1: ( () )
            {
            // InternalRosSystemParser.g:7869:1: ( () )
            // InternalRosSystemParser.g:7870:2: ()
            {
             before(grammarAccess.getInt16Access().getInt16Action_0());
            // InternalRosSystemParser.g:7871:2: ()
            // InternalRosSystemParser.g:7871:3:
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
    // InternalRosSystemParser.g:7879:1: rule__Int16__Group__1 : rule__Int16__Group__1__Impl ;
    public final void rule__Int16__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7883:1: ( rule__Int16__Group__1__Impl )
            // InternalRosSystemParser.g:7884:2: rule__Int16__Group__1__Impl
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
    // InternalRosSystemParser.g:7890:1: rule__Int16__Group__1__Impl : ( Int16 ) ;
    public final void rule__Int16__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7894:1: ( ( Int16 ) )
            // InternalRosSystemParser.g:7895:1: ( Int16 )
            {
            // InternalRosSystemParser.g:7895:1: ( Int16 )
            // InternalRosSystemParser.g:7896:2: Int16
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
    // InternalRosSystemParser.g:7906:1: rule__Uint16__Group__0 : rule__Uint16__Group__0__Impl rule__Uint16__Group__1 ;
    public final void rule__Uint16__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7910:1: ( rule__Uint16__Group__0__Impl rule__Uint16__Group__1 )
            // InternalRosSystemParser.g:7911:2: rule__Uint16__Group__0__Impl rule__Uint16__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalRosSystemParser.g:7918:1: rule__Uint16__Group__0__Impl : ( () ) ;
    public final void rule__Uint16__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7922:1: ( ( () ) )
            // InternalRosSystemParser.g:7923:1: ( () )
            {
            // InternalRosSystemParser.g:7923:1: ( () )
            // InternalRosSystemParser.g:7924:2: ()
            {
             before(grammarAccess.getUint16Access().getUint16Action_0());
            // InternalRosSystemParser.g:7925:2: ()
            // InternalRosSystemParser.g:7925:3:
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
    // InternalRosSystemParser.g:7933:1: rule__Uint16__Group__1 : rule__Uint16__Group__1__Impl ;
    public final void rule__Uint16__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7937:1: ( rule__Uint16__Group__1__Impl )
            // InternalRosSystemParser.g:7938:2: rule__Uint16__Group__1__Impl
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
    // InternalRosSystemParser.g:7944:1: rule__Uint16__Group__1__Impl : ( Uint16 ) ;
    public final void rule__Uint16__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7948:1: ( ( Uint16 ) )
            // InternalRosSystemParser.g:7949:1: ( Uint16 )
            {
            // InternalRosSystemParser.g:7949:1: ( Uint16 )
            // InternalRosSystemParser.g:7950:2: Uint16
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
    // InternalRosSystemParser.g:7960:1: rule__Int32__Group__0 : rule__Int32__Group__0__Impl rule__Int32__Group__1 ;
    public final void rule__Int32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7964:1: ( rule__Int32__Group__0__Impl rule__Int32__Group__1 )
            // InternalRosSystemParser.g:7965:2: rule__Int32__Group__0__Impl rule__Int32__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalRosSystemParser.g:7972:1: rule__Int32__Group__0__Impl : ( () ) ;
    public final void rule__Int32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7976:1: ( ( () ) )
            // InternalRosSystemParser.g:7977:1: ( () )
            {
            // InternalRosSystemParser.g:7977:1: ( () )
            // InternalRosSystemParser.g:7978:2: ()
            {
             before(grammarAccess.getInt32Access().getInt32Action_0());
            // InternalRosSystemParser.g:7979:2: ()
            // InternalRosSystemParser.g:7979:3:
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
    // InternalRosSystemParser.g:7987:1: rule__Int32__Group__1 : rule__Int32__Group__1__Impl ;
    public final void rule__Int32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:7991:1: ( rule__Int32__Group__1__Impl )
            // InternalRosSystemParser.g:7992:2: rule__Int32__Group__1__Impl
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
    // InternalRosSystemParser.g:7998:1: rule__Int32__Group__1__Impl : ( Int32 ) ;
    public final void rule__Int32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8002:1: ( ( Int32 ) )
            // InternalRosSystemParser.g:8003:1: ( Int32 )
            {
            // InternalRosSystemParser.g:8003:1: ( Int32 )
            // InternalRosSystemParser.g:8004:2: Int32
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
    // InternalRosSystemParser.g:8014:1: rule__Uint32__Group__0 : rule__Uint32__Group__0__Impl rule__Uint32__Group__1 ;
    public final void rule__Uint32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8018:1: ( rule__Uint32__Group__0__Impl rule__Uint32__Group__1 )
            // InternalRosSystemParser.g:8019:2: rule__Uint32__Group__0__Impl rule__Uint32__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalRosSystemParser.g:8026:1: rule__Uint32__Group__0__Impl : ( () ) ;
    public final void rule__Uint32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8030:1: ( ( () ) )
            // InternalRosSystemParser.g:8031:1: ( () )
            {
            // InternalRosSystemParser.g:8031:1: ( () )
            // InternalRosSystemParser.g:8032:2: ()
            {
             before(grammarAccess.getUint32Access().getUint32Action_0());
            // InternalRosSystemParser.g:8033:2: ()
            // InternalRosSystemParser.g:8033:3:
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
    // InternalRosSystemParser.g:8041:1: rule__Uint32__Group__1 : rule__Uint32__Group__1__Impl ;
    public final void rule__Uint32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8045:1: ( rule__Uint32__Group__1__Impl )
            // InternalRosSystemParser.g:8046:2: rule__Uint32__Group__1__Impl
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
    // InternalRosSystemParser.g:8052:1: rule__Uint32__Group__1__Impl : ( Uint32 ) ;
    public final void rule__Uint32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8056:1: ( ( Uint32 ) )
            // InternalRosSystemParser.g:8057:1: ( Uint32 )
            {
            // InternalRosSystemParser.g:8057:1: ( Uint32 )
            // InternalRosSystemParser.g:8058:2: Uint32
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
    // InternalRosSystemParser.g:8068:1: rule__Int64__Group__0 : rule__Int64__Group__0__Impl rule__Int64__Group__1 ;
    public final void rule__Int64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8072:1: ( rule__Int64__Group__0__Impl rule__Int64__Group__1 )
            // InternalRosSystemParser.g:8073:2: rule__Int64__Group__0__Impl rule__Int64__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalRosSystemParser.g:8080:1: rule__Int64__Group__0__Impl : ( () ) ;
    public final void rule__Int64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8084:1: ( ( () ) )
            // InternalRosSystemParser.g:8085:1: ( () )
            {
            // InternalRosSystemParser.g:8085:1: ( () )
            // InternalRosSystemParser.g:8086:2: ()
            {
             before(grammarAccess.getInt64Access().getInt64Action_0());
            // InternalRosSystemParser.g:8087:2: ()
            // InternalRosSystemParser.g:8087:3:
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
    // InternalRosSystemParser.g:8095:1: rule__Int64__Group__1 : rule__Int64__Group__1__Impl ;
    public final void rule__Int64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8099:1: ( rule__Int64__Group__1__Impl )
            // InternalRosSystemParser.g:8100:2: rule__Int64__Group__1__Impl
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
    // InternalRosSystemParser.g:8106:1: rule__Int64__Group__1__Impl : ( Int64 ) ;
    public final void rule__Int64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8110:1: ( ( Int64 ) )
            // InternalRosSystemParser.g:8111:1: ( Int64 )
            {
            // InternalRosSystemParser.g:8111:1: ( Int64 )
            // InternalRosSystemParser.g:8112:2: Int64
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
    // InternalRosSystemParser.g:8122:1: rule__Uint64__Group__0 : rule__Uint64__Group__0__Impl rule__Uint64__Group__1 ;
    public final void rule__Uint64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8126:1: ( rule__Uint64__Group__0__Impl rule__Uint64__Group__1 )
            // InternalRosSystemParser.g:8127:2: rule__Uint64__Group__0__Impl rule__Uint64__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalRosSystemParser.g:8134:1: rule__Uint64__Group__0__Impl : ( () ) ;
    public final void rule__Uint64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8138:1: ( ( () ) )
            // InternalRosSystemParser.g:8139:1: ( () )
            {
            // InternalRosSystemParser.g:8139:1: ( () )
            // InternalRosSystemParser.g:8140:2: ()
            {
             before(grammarAccess.getUint64Access().getUint64Action_0());
            // InternalRosSystemParser.g:8141:2: ()
            // InternalRosSystemParser.g:8141:3:
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
    // InternalRosSystemParser.g:8149:1: rule__Uint64__Group__1 : rule__Uint64__Group__1__Impl ;
    public final void rule__Uint64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8153:1: ( rule__Uint64__Group__1__Impl )
            // InternalRosSystemParser.g:8154:2: rule__Uint64__Group__1__Impl
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
    // InternalRosSystemParser.g:8160:1: rule__Uint64__Group__1__Impl : ( Uint64 ) ;
    public final void rule__Uint64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8164:1: ( ( Uint64 ) )
            // InternalRosSystemParser.g:8165:1: ( Uint64 )
            {
            // InternalRosSystemParser.g:8165:1: ( Uint64 )
            // InternalRosSystemParser.g:8166:2: Uint64
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
    // InternalRosSystemParser.g:8176:1: rule__Float32__Group__0 : rule__Float32__Group__0__Impl rule__Float32__Group__1 ;
    public final void rule__Float32__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8180:1: ( rule__Float32__Group__0__Impl rule__Float32__Group__1 )
            // InternalRosSystemParser.g:8181:2: rule__Float32__Group__0__Impl rule__Float32__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalRosSystemParser.g:8188:1: rule__Float32__Group__0__Impl : ( () ) ;
    public final void rule__Float32__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8192:1: ( ( () ) )
            // InternalRosSystemParser.g:8193:1: ( () )
            {
            // InternalRosSystemParser.g:8193:1: ( () )
            // InternalRosSystemParser.g:8194:2: ()
            {
             before(grammarAccess.getFloat32Access().getFloat32Action_0());
            // InternalRosSystemParser.g:8195:2: ()
            // InternalRosSystemParser.g:8195:3:
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
    // InternalRosSystemParser.g:8203:1: rule__Float32__Group__1 : rule__Float32__Group__1__Impl ;
    public final void rule__Float32__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8207:1: ( rule__Float32__Group__1__Impl )
            // InternalRosSystemParser.g:8208:2: rule__Float32__Group__1__Impl
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
    // InternalRosSystemParser.g:8214:1: rule__Float32__Group__1__Impl : ( Float32 ) ;
    public final void rule__Float32__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8218:1: ( ( Float32 ) )
            // InternalRosSystemParser.g:8219:1: ( Float32 )
            {
            // InternalRosSystemParser.g:8219:1: ( Float32 )
            // InternalRosSystemParser.g:8220:2: Float32
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
    // InternalRosSystemParser.g:8230:1: rule__Float64__Group__0 : rule__Float64__Group__0__Impl rule__Float64__Group__1 ;
    public final void rule__Float64__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8234:1: ( rule__Float64__Group__0__Impl rule__Float64__Group__1 )
            // InternalRosSystemParser.g:8235:2: rule__Float64__Group__0__Impl rule__Float64__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalRosSystemParser.g:8242:1: rule__Float64__Group__0__Impl : ( () ) ;
    public final void rule__Float64__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8246:1: ( ( () ) )
            // InternalRosSystemParser.g:8247:1: ( () )
            {
            // InternalRosSystemParser.g:8247:1: ( () )
            // InternalRosSystemParser.g:8248:2: ()
            {
             before(grammarAccess.getFloat64Access().getFloat64Action_0());
            // InternalRosSystemParser.g:8249:2: ()
            // InternalRosSystemParser.g:8249:3:
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
    // InternalRosSystemParser.g:8257:1: rule__Float64__Group__1 : rule__Float64__Group__1__Impl ;
    public final void rule__Float64__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8261:1: ( rule__Float64__Group__1__Impl )
            // InternalRosSystemParser.g:8262:2: rule__Float64__Group__1__Impl
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
    // InternalRosSystemParser.g:8268:1: rule__Float64__Group__1__Impl : ( Float64 ) ;
    public final void rule__Float64__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8272:1: ( ( Float64 ) )
            // InternalRosSystemParser.g:8273:1: ( Float64 )
            {
            // InternalRosSystemParser.g:8273:1: ( Float64 )
            // InternalRosSystemParser.g:8274:2: Float64
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
    // InternalRosSystemParser.g:8284:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8288:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalRosSystemParser.g:8289:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalRosSystemParser.g:8296:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8300:1: ( ( () ) )
            // InternalRosSystemParser.g:8301:1: ( () )
            {
            // InternalRosSystemParser.g:8301:1: ( () )
            // InternalRosSystemParser.g:8302:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0());
            // InternalRosSystemParser.g:8303:2: ()
            // InternalRosSystemParser.g:8303:3:
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
    // InternalRosSystemParser.g:8311:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8315:1: ( rule__String0__Group__1__Impl )
            // InternalRosSystemParser.g:8316:2: rule__String0__Group__1__Impl
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
    // InternalRosSystemParser.g:8322:1: rule__String0__Group__1__Impl : ( String_1 ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8326:1: ( ( String_1 ) )
            // InternalRosSystemParser.g:8327:1: ( String_1 )
            {
            // InternalRosSystemParser.g:8327:1: ( String_1 )
            // InternalRosSystemParser.g:8328:2: String_1
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
    // InternalRosSystemParser.g:8338:1: rule__Byte__Group__0 : rule__Byte__Group__0__Impl rule__Byte__Group__1 ;
    public final void rule__Byte__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8342:1: ( rule__Byte__Group__0__Impl rule__Byte__Group__1 )
            // InternalRosSystemParser.g:8343:2: rule__Byte__Group__0__Impl rule__Byte__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalRosSystemParser.g:8350:1: rule__Byte__Group__0__Impl : ( () ) ;
    public final void rule__Byte__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8354:1: ( ( () ) )
            // InternalRosSystemParser.g:8355:1: ( () )
            {
            // InternalRosSystemParser.g:8355:1: ( () )
            // InternalRosSystemParser.g:8356:2: ()
            {
             before(grammarAccess.getByteAccess().getByteAction_0());
            // InternalRosSystemParser.g:8357:2: ()
            // InternalRosSystemParser.g:8357:3:
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
    // InternalRosSystemParser.g:8365:1: rule__Byte__Group__1 : rule__Byte__Group__1__Impl ;
    public final void rule__Byte__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8369:1: ( rule__Byte__Group__1__Impl )
            // InternalRosSystemParser.g:8370:2: rule__Byte__Group__1__Impl
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
    // InternalRosSystemParser.g:8376:1: rule__Byte__Group__1__Impl : ( Byte ) ;
    public final void rule__Byte__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8380:1: ( ( Byte ) )
            // InternalRosSystemParser.g:8381:1: ( Byte )
            {
            // InternalRosSystemParser.g:8381:1: ( Byte )
            // InternalRosSystemParser.g:8382:2: Byte
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
    // InternalRosSystemParser.g:8392:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8396:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalRosSystemParser.g:8397:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalRosSystemParser.g:8404:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8408:1: ( ( () ) )
            // InternalRosSystemParser.g:8409:1: ( () )
            {
            // InternalRosSystemParser.g:8409:1: ( () )
            // InternalRosSystemParser.g:8410:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0());
            // InternalRosSystemParser.g:8411:2: ()
            // InternalRosSystemParser.g:8411:3:
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
    // InternalRosSystemParser.g:8419:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8423:1: ( rule__Time__Group__1__Impl )
            // InternalRosSystemParser.g:8424:2: rule__Time__Group__1__Impl
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
    // InternalRosSystemParser.g:8430:1: rule__Time__Group__1__Impl : ( Time ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8434:1: ( ( Time ) )
            // InternalRosSystemParser.g:8435:1: ( Time )
            {
            // InternalRosSystemParser.g:8435:1: ( Time )
            // InternalRosSystemParser.g:8436:2: Time
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
    // InternalRosSystemParser.g:8446:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8450:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalRosSystemParser.g:8451:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalRosSystemParser.g:8458:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8462:1: ( ( () ) )
            // InternalRosSystemParser.g:8463:1: ( () )
            {
            // InternalRosSystemParser.g:8463:1: ( () )
            // InternalRosSystemParser.g:8464:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0());
            // InternalRosSystemParser.g:8465:2: ()
            // InternalRosSystemParser.g:8465:3:
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
    // InternalRosSystemParser.g:8473:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8477:1: ( rule__Duration__Group__1__Impl )
            // InternalRosSystemParser.g:8478:2: rule__Duration__Group__1__Impl
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
    // InternalRosSystemParser.g:8484:1: rule__Duration__Group__1__Impl : ( Duration ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8488:1: ( ( Duration ) )
            // InternalRosSystemParser.g:8489:1: ( Duration )
            {
            // InternalRosSystemParser.g:8489:1: ( Duration )
            // InternalRosSystemParser.g:8490:2: Duration
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
    // InternalRosSystemParser.g:8500:1: rule__BoolArray__Group__0 : rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 ;
    public final void rule__BoolArray__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8504:1: ( rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 )
            // InternalRosSystemParser.g:8505:2: rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalRosSystemParser.g:8512:1: rule__BoolArray__Group__0__Impl : ( () ) ;
    public final void rule__BoolArray__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8516:1: ( ( () ) )
            // InternalRosSystemParser.g:8517:1: ( () )
            {
            // InternalRosSystemParser.g:8517:1: ( () )
            // InternalRosSystemParser.g:8518:2: ()
            {
             before(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0());
            // InternalRosSystemParser.g:8519:2: ()
            // InternalRosSystemParser.g:8519:3:
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
    // InternalRosSystemParser.g:8527:1: rule__BoolArray__Group__1 : rule__BoolArray__Group__1__Impl ;
    public final void rule__BoolArray__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8531:1: ( rule__BoolArray__Group__1__Impl )
            // InternalRosSystemParser.g:8532:2: rule__BoolArray__Group__1__Impl
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
    // InternalRosSystemParser.g:8538:1: rule__BoolArray__Group__1__Impl : ( Bool_1 ) ;
    public final void rule__BoolArray__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8542:1: ( ( Bool_1 ) )
            // InternalRosSystemParser.g:8543:1: ( Bool_1 )
            {
            // InternalRosSystemParser.g:8543:1: ( Bool_1 )
            // InternalRosSystemParser.g:8544:2: Bool_1
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
    // InternalRosSystemParser.g:8554:1: rule__Int8Array__Group__0 : rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 ;
    public final void rule__Int8Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8558:1: ( rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 )
            // InternalRosSystemParser.g:8559:2: rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalRosSystemParser.g:8566:1: rule__Int8Array__Group__0__Impl : ( () ) ;
    public final void rule__Int8Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8570:1: ( ( () ) )
            // InternalRosSystemParser.g:8571:1: ( () )
            {
            // InternalRosSystemParser.g:8571:1: ( () )
            // InternalRosSystemParser.g:8572:2: ()
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0());
            // InternalRosSystemParser.g:8573:2: ()
            // InternalRosSystemParser.g:8573:3:
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
    // InternalRosSystemParser.g:8581:1: rule__Int8Array__Group__1 : rule__Int8Array__Group__1__Impl ;
    public final void rule__Int8Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8585:1: ( rule__Int8Array__Group__1__Impl )
            // InternalRosSystemParser.g:8586:2: rule__Int8Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8592:1: rule__Int8Array__Group__1__Impl : ( Int8_1 ) ;
    public final void rule__Int8Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8596:1: ( ( Int8_1 ) )
            // InternalRosSystemParser.g:8597:1: ( Int8_1 )
            {
            // InternalRosSystemParser.g:8597:1: ( Int8_1 )
            // InternalRosSystemParser.g:8598:2: Int8_1
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
    // InternalRosSystemParser.g:8608:1: rule__Uint8Array__Group__0 : rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 ;
    public final void rule__Uint8Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8612:1: ( rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 )
            // InternalRosSystemParser.g:8613:2: rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1
            {
            pushFollow(FOLLOW_62);
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
    // InternalRosSystemParser.g:8620:1: rule__Uint8Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint8Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8624:1: ( ( () ) )
            // InternalRosSystemParser.g:8625:1: ( () )
            {
            // InternalRosSystemParser.g:8625:1: ( () )
            // InternalRosSystemParser.g:8626:2: ()
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0());
            // InternalRosSystemParser.g:8627:2: ()
            // InternalRosSystemParser.g:8627:3:
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
    // InternalRosSystemParser.g:8635:1: rule__Uint8Array__Group__1 : rule__Uint8Array__Group__1__Impl ;
    public final void rule__Uint8Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8639:1: ( rule__Uint8Array__Group__1__Impl )
            // InternalRosSystemParser.g:8640:2: rule__Uint8Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8646:1: rule__Uint8Array__Group__1__Impl : ( Uint8_1 ) ;
    public final void rule__Uint8Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8650:1: ( ( Uint8_1 ) )
            // InternalRosSystemParser.g:8651:1: ( Uint8_1 )
            {
            // InternalRosSystemParser.g:8651:1: ( Uint8_1 )
            // InternalRosSystemParser.g:8652:2: Uint8_1
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
    // InternalRosSystemParser.g:8662:1: rule__Int16Array__Group__0 : rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 ;
    public final void rule__Int16Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8666:1: ( rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 )
            // InternalRosSystemParser.g:8667:2: rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalRosSystemParser.g:8674:1: rule__Int16Array__Group__0__Impl : ( () ) ;
    public final void rule__Int16Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8678:1: ( ( () ) )
            // InternalRosSystemParser.g:8679:1: ( () )
            {
            // InternalRosSystemParser.g:8679:1: ( () )
            // InternalRosSystemParser.g:8680:2: ()
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0());
            // InternalRosSystemParser.g:8681:2: ()
            // InternalRosSystemParser.g:8681:3:
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
    // InternalRosSystemParser.g:8689:1: rule__Int16Array__Group__1 : rule__Int16Array__Group__1__Impl ;
    public final void rule__Int16Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8693:1: ( rule__Int16Array__Group__1__Impl )
            // InternalRosSystemParser.g:8694:2: rule__Int16Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8700:1: rule__Int16Array__Group__1__Impl : ( Int16_1 ) ;
    public final void rule__Int16Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8704:1: ( ( Int16_1 ) )
            // InternalRosSystemParser.g:8705:1: ( Int16_1 )
            {
            // InternalRosSystemParser.g:8705:1: ( Int16_1 )
            // InternalRosSystemParser.g:8706:2: Int16_1
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
    // InternalRosSystemParser.g:8716:1: rule__Uint16Array__Group__0 : rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 ;
    public final void rule__Uint16Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8720:1: ( rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 )
            // InternalRosSystemParser.g:8721:2: rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1
            {
            pushFollow(FOLLOW_64);
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
    // InternalRosSystemParser.g:8728:1: rule__Uint16Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint16Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8732:1: ( ( () ) )
            // InternalRosSystemParser.g:8733:1: ( () )
            {
            // InternalRosSystemParser.g:8733:1: ( () )
            // InternalRosSystemParser.g:8734:2: ()
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0());
            // InternalRosSystemParser.g:8735:2: ()
            // InternalRosSystemParser.g:8735:3:
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
    // InternalRosSystemParser.g:8743:1: rule__Uint16Array__Group__1 : rule__Uint16Array__Group__1__Impl ;
    public final void rule__Uint16Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8747:1: ( rule__Uint16Array__Group__1__Impl )
            // InternalRosSystemParser.g:8748:2: rule__Uint16Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8754:1: rule__Uint16Array__Group__1__Impl : ( Uint16_1 ) ;
    public final void rule__Uint16Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8758:1: ( ( Uint16_1 ) )
            // InternalRosSystemParser.g:8759:1: ( Uint16_1 )
            {
            // InternalRosSystemParser.g:8759:1: ( Uint16_1 )
            // InternalRosSystemParser.g:8760:2: Uint16_1
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
    // InternalRosSystemParser.g:8770:1: rule__Int32Array__Group__0 : rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 ;
    public final void rule__Int32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8774:1: ( rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 )
            // InternalRosSystemParser.g:8775:2: rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1
            {
            pushFollow(FOLLOW_65);
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
    // InternalRosSystemParser.g:8782:1: rule__Int32Array__Group__0__Impl : ( () ) ;
    public final void rule__Int32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8786:1: ( ( () ) )
            // InternalRosSystemParser.g:8787:1: ( () )
            {
            // InternalRosSystemParser.g:8787:1: ( () )
            // InternalRosSystemParser.g:8788:2: ()
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0());
            // InternalRosSystemParser.g:8789:2: ()
            // InternalRosSystemParser.g:8789:3:
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
    // InternalRosSystemParser.g:8797:1: rule__Int32Array__Group__1 : rule__Int32Array__Group__1__Impl ;
    public final void rule__Int32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8801:1: ( rule__Int32Array__Group__1__Impl )
            // InternalRosSystemParser.g:8802:2: rule__Int32Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8808:1: rule__Int32Array__Group__1__Impl : ( Int32_1 ) ;
    public final void rule__Int32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8812:1: ( ( Int32_1 ) )
            // InternalRosSystemParser.g:8813:1: ( Int32_1 )
            {
            // InternalRosSystemParser.g:8813:1: ( Int32_1 )
            // InternalRosSystemParser.g:8814:2: Int32_1
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
    // InternalRosSystemParser.g:8824:1: rule__Uint32Array__Group__0 : rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 ;
    public final void rule__Uint32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8828:1: ( rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 )
            // InternalRosSystemParser.g:8829:2: rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1
            {
            pushFollow(FOLLOW_66);
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
    // InternalRosSystemParser.g:8836:1: rule__Uint32Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8840:1: ( ( () ) )
            // InternalRosSystemParser.g:8841:1: ( () )
            {
            // InternalRosSystemParser.g:8841:1: ( () )
            // InternalRosSystemParser.g:8842:2: ()
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0());
            // InternalRosSystemParser.g:8843:2: ()
            // InternalRosSystemParser.g:8843:3:
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
    // InternalRosSystemParser.g:8851:1: rule__Uint32Array__Group__1 : rule__Uint32Array__Group__1__Impl ;
    public final void rule__Uint32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8855:1: ( rule__Uint32Array__Group__1__Impl )
            // InternalRosSystemParser.g:8856:2: rule__Uint32Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8862:1: rule__Uint32Array__Group__1__Impl : ( Uint32_1 ) ;
    public final void rule__Uint32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8866:1: ( ( Uint32_1 ) )
            // InternalRosSystemParser.g:8867:1: ( Uint32_1 )
            {
            // InternalRosSystemParser.g:8867:1: ( Uint32_1 )
            // InternalRosSystemParser.g:8868:2: Uint32_1
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
    // InternalRosSystemParser.g:8878:1: rule__Int64Array__Group__0 : rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 ;
    public final void rule__Int64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8882:1: ( rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 )
            // InternalRosSystemParser.g:8883:2: rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1
            {
            pushFollow(FOLLOW_67);
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
    // InternalRosSystemParser.g:8890:1: rule__Int64Array__Group__0__Impl : ( () ) ;
    public final void rule__Int64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8894:1: ( ( () ) )
            // InternalRosSystemParser.g:8895:1: ( () )
            {
            // InternalRosSystemParser.g:8895:1: ( () )
            // InternalRosSystemParser.g:8896:2: ()
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0());
            // InternalRosSystemParser.g:8897:2: ()
            // InternalRosSystemParser.g:8897:3:
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
    // InternalRosSystemParser.g:8905:1: rule__Int64Array__Group__1 : rule__Int64Array__Group__1__Impl ;
    public final void rule__Int64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8909:1: ( rule__Int64Array__Group__1__Impl )
            // InternalRosSystemParser.g:8910:2: rule__Int64Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8916:1: rule__Int64Array__Group__1__Impl : ( Int64_1 ) ;
    public final void rule__Int64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8920:1: ( ( Int64_1 ) )
            // InternalRosSystemParser.g:8921:1: ( Int64_1 )
            {
            // InternalRosSystemParser.g:8921:1: ( Int64_1 )
            // InternalRosSystemParser.g:8922:2: Int64_1
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
    // InternalRosSystemParser.g:8932:1: rule__Uint64Array__Group__0 : rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 ;
    public final void rule__Uint64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8936:1: ( rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 )
            // InternalRosSystemParser.g:8937:2: rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1
            {
            pushFollow(FOLLOW_68);
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
    // InternalRosSystemParser.g:8944:1: rule__Uint64Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8948:1: ( ( () ) )
            // InternalRosSystemParser.g:8949:1: ( () )
            {
            // InternalRosSystemParser.g:8949:1: ( () )
            // InternalRosSystemParser.g:8950:2: ()
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0());
            // InternalRosSystemParser.g:8951:2: ()
            // InternalRosSystemParser.g:8951:3:
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
    // InternalRosSystemParser.g:8959:1: rule__Uint64Array__Group__1 : rule__Uint64Array__Group__1__Impl ;
    public final void rule__Uint64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8963:1: ( rule__Uint64Array__Group__1__Impl )
            // InternalRosSystemParser.g:8964:2: rule__Uint64Array__Group__1__Impl
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
    // InternalRosSystemParser.g:8970:1: rule__Uint64Array__Group__1__Impl : ( Uint64_1 ) ;
    public final void rule__Uint64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8974:1: ( ( Uint64_1 ) )
            // InternalRosSystemParser.g:8975:1: ( Uint64_1 )
            {
            // InternalRosSystemParser.g:8975:1: ( Uint64_1 )
            // InternalRosSystemParser.g:8976:2: Uint64_1
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
    // InternalRosSystemParser.g:8986:1: rule__Float32Array__Group__0 : rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 ;
    public final void rule__Float32Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:8990:1: ( rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 )
            // InternalRosSystemParser.g:8991:2: rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1
            {
            pushFollow(FOLLOW_69);
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
    // InternalRosSystemParser.g:8998:1: rule__Float32Array__Group__0__Impl : ( () ) ;
    public final void rule__Float32Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9002:1: ( ( () ) )
            // InternalRosSystemParser.g:9003:1: ( () )
            {
            // InternalRosSystemParser.g:9003:1: ( () )
            // InternalRosSystemParser.g:9004:2: ()
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0());
            // InternalRosSystemParser.g:9005:2: ()
            // InternalRosSystemParser.g:9005:3:
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
    // InternalRosSystemParser.g:9013:1: rule__Float32Array__Group__1 : rule__Float32Array__Group__1__Impl ;
    public final void rule__Float32Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9017:1: ( rule__Float32Array__Group__1__Impl )
            // InternalRosSystemParser.g:9018:2: rule__Float32Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9024:1: rule__Float32Array__Group__1__Impl : ( Float32_1 ) ;
    public final void rule__Float32Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9028:1: ( ( Float32_1 ) )
            // InternalRosSystemParser.g:9029:1: ( Float32_1 )
            {
            // InternalRosSystemParser.g:9029:1: ( Float32_1 )
            // InternalRosSystemParser.g:9030:2: Float32_1
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
    // InternalRosSystemParser.g:9040:1: rule__Float64Array__Group__0 : rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 ;
    public final void rule__Float64Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9044:1: ( rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 )
            // InternalRosSystemParser.g:9045:2: rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1
            {
            pushFollow(FOLLOW_70);
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
    // InternalRosSystemParser.g:9052:1: rule__Float64Array__Group__0__Impl : ( () ) ;
    public final void rule__Float64Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9056:1: ( ( () ) )
            // InternalRosSystemParser.g:9057:1: ( () )
            {
            // InternalRosSystemParser.g:9057:1: ( () )
            // InternalRosSystemParser.g:9058:2: ()
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0());
            // InternalRosSystemParser.g:9059:2: ()
            // InternalRosSystemParser.g:9059:3:
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
    // InternalRosSystemParser.g:9067:1: rule__Float64Array__Group__1 : rule__Float64Array__Group__1__Impl ;
    public final void rule__Float64Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9071:1: ( rule__Float64Array__Group__1__Impl )
            // InternalRosSystemParser.g:9072:2: rule__Float64Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9078:1: rule__Float64Array__Group__1__Impl : ( Float64_1 ) ;
    public final void rule__Float64Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9082:1: ( ( Float64_1 ) )
            // InternalRosSystemParser.g:9083:1: ( Float64_1 )
            {
            // InternalRosSystemParser.g:9083:1: ( Float64_1 )
            // InternalRosSystemParser.g:9084:2: Float64_1
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
    // InternalRosSystemParser.g:9094:1: rule__String0Array__Group__0 : rule__String0Array__Group__0__Impl rule__String0Array__Group__1 ;
    public final void rule__String0Array__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9098:1: ( rule__String0Array__Group__0__Impl rule__String0Array__Group__1 )
            // InternalRosSystemParser.g:9099:2: rule__String0Array__Group__0__Impl rule__String0Array__Group__1
            {
            pushFollow(FOLLOW_71);
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
    // InternalRosSystemParser.g:9106:1: rule__String0Array__Group__0__Impl : ( () ) ;
    public final void rule__String0Array__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9110:1: ( ( () ) )
            // InternalRosSystemParser.g:9111:1: ( () )
            {
            // InternalRosSystemParser.g:9111:1: ( () )
            // InternalRosSystemParser.g:9112:2: ()
            {
             before(grammarAccess.getString0ArrayAccess().getStringArrayAction_0());
            // InternalRosSystemParser.g:9113:2: ()
            // InternalRosSystemParser.g:9113:3:
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
    // InternalRosSystemParser.g:9121:1: rule__String0Array__Group__1 : rule__String0Array__Group__1__Impl ;
    public final void rule__String0Array__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9125:1: ( rule__String0Array__Group__1__Impl )
            // InternalRosSystemParser.g:9126:2: rule__String0Array__Group__1__Impl
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
    // InternalRosSystemParser.g:9132:1: rule__String0Array__Group__1__Impl : ( String_2 ) ;
    public final void rule__String0Array__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9136:1: ( ( String_2 ) )
            // InternalRosSystemParser.g:9137:1: ( String_2 )
            {
            // InternalRosSystemParser.g:9137:1: ( String_2 )
            // InternalRosSystemParser.g:9138:2: String_2
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
    // InternalRosSystemParser.g:9148:1: rule__ByteArray__Group__0 : rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 ;
    public final void rule__ByteArray__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9152:1: ( rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 )
            // InternalRosSystemParser.g:9153:2: rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1
            {
            pushFollow(FOLLOW_72);
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
    // InternalRosSystemParser.g:9160:1: rule__ByteArray__Group__0__Impl : ( () ) ;
    public final void rule__ByteArray__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9164:1: ( ( () ) )
            // InternalRosSystemParser.g:9165:1: ( () )
            {
            // InternalRosSystemParser.g:9165:1: ( () )
            // InternalRosSystemParser.g:9166:2: ()
            {
             before(grammarAccess.getByteArrayAccess().getByteArrayAction_0());
            // InternalRosSystemParser.g:9167:2: ()
            // InternalRosSystemParser.g:9167:3:
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
    // InternalRosSystemParser.g:9175:1: rule__ByteArray__Group__1 : rule__ByteArray__Group__1__Impl ;
    public final void rule__ByteArray__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9179:1: ( rule__ByteArray__Group__1__Impl )
            // InternalRosSystemParser.g:9180:2: rule__ByteArray__Group__1__Impl
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
    // InternalRosSystemParser.g:9186:1: rule__ByteArray__Group__1__Impl : ( Byte_1 ) ;
    public final void rule__ByteArray__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9190:1: ( ( Byte_1 ) )
            // InternalRosSystemParser.g:9191:1: ( Byte_1 )
            {
            // InternalRosSystemParser.g:9191:1: ( Byte_1 )
            // InternalRosSystemParser.g:9192:2: Byte_1
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
    // InternalRosSystemParser.g:9202:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9206:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalRosSystemParser.g:9207:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_73);
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
    // InternalRosSystemParser.g:9214:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9218:1: ( ( () ) )
            // InternalRosSystemParser.g:9219:1: ( () )
            {
            // InternalRosSystemParser.g:9219:1: ( () )
            // InternalRosSystemParser.g:9220:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0());
            // InternalRosSystemParser.g:9221:2: ()
            // InternalRosSystemParser.g:9221:3:
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
    // InternalRosSystemParser.g:9229:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9233:1: ( rule__Header__Group__1__Impl )
            // InternalRosSystemParser.g:9234:2: rule__Header__Group__1__Impl
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
    // InternalRosSystemParser.g:9240:1: rule__Header__Group__1__Impl : ( Header ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9244:1: ( ( Header ) )
            // InternalRosSystemParser.g:9245:1: ( Header )
            {
            // InternalRosSystemParser.g:9245:1: ( Header )
            // InternalRosSystemParser.g:9246:2: Header
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
    // InternalRosSystemParser.g:9256:1: rule__ArrayTopicSpecRef__Group__0 : rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 ;
    public final void rule__ArrayTopicSpecRef__Group__0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9260:1: ( rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1 )
            // InternalRosSystemParser.g:9261:2: rule__ArrayTopicSpecRef__Group__0__Impl rule__ArrayTopicSpecRef__Group__1
            {
            pushFollow(FOLLOW_74);
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
    // InternalRosSystemParser.g:9268:1: rule__ArrayTopicSpecRef__Group__0__Impl : ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) ) ;
    public final void rule__ArrayTopicSpecRef__Group__0__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9272:1: ( ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) ) )
            // InternalRosSystemParser.g:9273:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) )
            {
            // InternalRosSystemParser.g:9273:1: ( ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 ) )
            // InternalRosSystemParser.g:9274:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecAssignment_0());
            // InternalRosSystemParser.g:9275:2: ( rule__ArrayTopicSpecRef__TopicSpecAssignment_0 )
            // InternalRosSystemParser.g:9275:3: rule__ArrayTopicSpecRef__TopicSpecAssignment_0
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
    // InternalRosSystemParser.g:9283:1: rule__ArrayTopicSpecRef__Group__1 : rule__ArrayTopicSpecRef__Group__1__Impl ;
    public final void rule__ArrayTopicSpecRef__Group__1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9287:1: ( rule__ArrayTopicSpecRef__Group__1__Impl )
            // InternalRosSystemParser.g:9288:2: rule__ArrayTopicSpecRef__Group__1__Impl
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
    // InternalRosSystemParser.g:9294:1: rule__ArrayTopicSpecRef__Group__1__Impl : ( LeftSquareBracketRightSquareBracket ) ;
    public final void rule__ArrayTopicSpecRef__Group__1__Impl() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9298:1: ( ( LeftSquareBracketRightSquareBracket ) )
            // InternalRosSystemParser.g:9299:1: ( LeftSquareBracketRightSquareBracket )
            {
            // InternalRosSystemParser.g:9299:1: ( LeftSquareBracketRightSquareBracket )
            // InternalRosSystemParser.g:9300:2: LeftSquareBracketRightSquareBracket
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
    // InternalRosSystemParser.g:9310:1: rule__RosSystem__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9314:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9315:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9315:2: ( ruleEString )
            // InternalRosSystemParser.g:9316:3: ruleEString
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
    // InternalRosSystemParser.g:9325:1: rule__RosSystem__ProcessesAssignment_3_0_2 : ( ruleProcess ) ;
    public final void rule__RosSystem__ProcessesAssignment_3_0_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9329:1: ( ( ruleProcess ) )
            // InternalRosSystemParser.g:9330:2: ( ruleProcess )
            {
            // InternalRosSystemParser.g:9330:2: ( ruleProcess )
            // InternalRosSystemParser.g:9331:3: ruleProcess
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
    // InternalRosSystemParser.g:9340:1: rule__RosSystem__ComponentsAssignment_3_1_2 : ( ruleRosNode ) ;
    public final void rule__RosSystem__ComponentsAssignment_3_1_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9344:1: ( ( ruleRosNode ) )
            // InternalRosSystemParser.g:9345:2: ( ruleRosNode )
            {
            // InternalRosSystemParser.g:9345:2: ( ruleRosNode )
            // InternalRosSystemParser.g:9346:3: ruleRosNode
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
    // InternalRosSystemParser.g:9355:1: rule__RosSystem__ParameterAssignment_3_2_2 : ( ruleRosParameter ) ;
    public final void rule__RosSystem__ParameterAssignment_3_2_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9359:1: ( ( ruleRosParameter ) )
            // InternalRosSystemParser.g:9360:2: ( ruleRosParameter )
            {
            // InternalRosSystemParser.g:9360:2: ( ruleRosParameter )
            // InternalRosSystemParser.g:9361:3: ruleRosParameter
            {
             before(grammarAccess.getRosSystemAccess().getParameterRosParameterParserRuleCall_3_2_2_0());
            pushFollow(FOLLOW_2);
            ruleRosParameter();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getParameterRosParameterParserRuleCall_3_2_2_0());

            }


            }

        }
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
    // InternalRosSystemParser.g:9370:1: rule__RosSystem__ConnectionsAssignment_3_3_2 : ( ruleRosConnection ) ;
    public final void rule__RosSystem__ConnectionsAssignment_3_3_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9374:1: ( ( ruleRosConnection ) )
            // InternalRosSystemParser.g:9375:2: ( ruleRosConnection )
            {
            // InternalRosSystemParser.g:9375:2: ( ruleRosConnection )
            // InternalRosSystemParser.g:9376:3: ruleRosConnection
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
    // InternalRosSystemParser.g:9385:1: rule__Process__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9389:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9390:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9390:2: ( ruleEString )
            // InternalRosSystemParser.g:9391:3: ruleEString
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


    // $ANTLR start "rule__Process__ComponentsAssignment_4_2"
    // InternalRosSystemParser.g:9400:1: rule__Process__ComponentsAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Process__ComponentsAssignment_4_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9404:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9405:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9405:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9406:3: ( ruleEString )
            {
             before(grammarAccess.getProcessAccess().getComponentsComponentCrossReference_4_2_0());
            // InternalRosSystemParser.g:9407:3: ( ruleEString )
            // InternalRosSystemParser.g:9408:4: ruleEString
            {
             before(grammarAccess.getProcessAccess().getComponentsComponentEStringParserRuleCall_4_2_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getComponentsComponentEStringParserRuleCall_4_2_0_1());

            }

             after(grammarAccess.getProcessAccess().getComponentsComponentCrossReference_4_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ComponentsAssignment_4_2"


    // $ANTLR start "rule__Process__ComponentsAssignment_4_3_1"
    // InternalRosSystemParser.g:9419:1: rule__Process__ComponentsAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Process__ComponentsAssignment_4_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9423:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9424:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9424:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9425:3: ( ruleEString )
            {
             before(grammarAccess.getProcessAccess().getComponentsComponentCrossReference_4_3_1_0());
            // InternalRosSystemParser.g:9426:3: ( ruleEString )
            // InternalRosSystemParser.g:9427:4: ruleEString
            {
             before(grammarAccess.getProcessAccess().getComponentsComponentEStringParserRuleCall_4_3_1_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getComponentsComponentEStringParserRuleCall_4_3_1_0_1());

            }

             after(grammarAccess.getProcessAccess().getComponentsComponentCrossReference_4_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__ComponentsAssignment_4_3_1"


    // $ANTLR start "rule__Process__ThreadsAssignment_5_1"
    // InternalRosSystemParser.g:9438:1: rule__Process__ThreadsAssignment_5_1 : ( ruleInteger0 ) ;
    public final void rule__Process__ThreadsAssignment_5_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9442:1: ( ( ruleInteger0 ) )
            // InternalRosSystemParser.g:9443:2: ( ruleInteger0 )
            {
            // InternalRosSystemParser.g:9443:2: ( ruleInteger0 )
            // InternalRosSystemParser.g:9444:3: ruleInteger0
            {
             before(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());
            pushFollow(FOLLOW_2);
            ruleInteger0();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());

            }


            }

        }
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
    // InternalRosSystemParser.g:9453:1: rule__RosNode__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RosNode__NameAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9457:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9458:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9458:2: ( ruleEString )
            // InternalRosSystemParser.g:9459:3: ruleEString
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
    // InternalRosSystemParser.g:9468:1: rule__RosNode__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__RosNode__FromAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9472:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9473:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9473:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9474:3: ( ruleEString )
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0());
            // InternalRosSystemParser.g:9475:3: ( ruleEString )
            // InternalRosSystemParser.g:9476:4: ruleEString
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
    // InternalRosSystemParser.g:9487:1: rule__RosNode__RosinterfacesAssignment_6_2 : ( ruleRosInterface ) ;
    public final void rule__RosNode__RosinterfacesAssignment_6_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9491:1: ( ( ruleRosInterface ) )
            // InternalRosSystemParser.g:9492:2: ( ruleRosInterface )
            {
            // InternalRosSystemParser.g:9492:2: ( ruleRosInterface )
            // InternalRosSystemParser.g:9493:3: ruleRosInterface
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
    // InternalRosSystemParser.g:9502:1: rule__RosNode__RosparametersAssignment_7_2 : ( ruleRosParameter ) ;
    public final void rule__RosNode__RosparametersAssignment_7_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9506:1: ( ( ruleRosParameter ) )
            // InternalRosSystemParser.g:9507:2: ( ruleRosParameter )
            {
            // InternalRosSystemParser.g:9507:2: ( ruleRosParameter )
            // InternalRosSystemParser.g:9508:3: ruleRosParameter
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
    // InternalRosSystemParser.g:9517:1: rule__RosInterface__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosInterface__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9521:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9522:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9522:2: ( ruleEString )
            // InternalRosSystemParser.g:9523:3: ruleEString
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
    // InternalRosSystemParser.g:9532:1: rule__RosInterface__ReferenceAssignment_3 : ( ruleInterfaceReference ) ;
    public final void rule__RosInterface__ReferenceAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9536:1: ( ( ruleInterfaceReference ) )
            // InternalRosSystemParser.g:9537:2: ( ruleInterfaceReference )
            {
            // InternalRosSystemParser.g:9537:2: ( ruleInterfaceReference )
            // InternalRosSystemParser.g:9538:3: ruleInterfaceReference
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
    // InternalRosSystemParser.g:9547:1: rule__RosPublisherReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosPublisherReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9551:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9552:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9552:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9553:3: ( ruleEString )
            {
             before(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_1_0());
            // InternalRosSystemParser.g:9554:3: ( ruleEString )
            // InternalRosSystemParser.g:9555:4: ruleEString
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
    // InternalRosSystemParser.g:9566:1: rule__RosSubscriberReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosSubscriberReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9570:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9571:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9571:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9572:3: ( ruleEString )
            {
             before(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_1_0());
            // InternalRosSystemParser.g:9573:3: ( ruleEString )
            // InternalRosSystemParser.g:9574:4: ruleEString
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
    // InternalRosSystemParser.g:9585:1: rule__RosServiceServerReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServiceServerReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9589:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9590:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9590:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9591:3: ( ruleEString )
            {
             before(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_1_0());
            // InternalRosSystemParser.g:9592:3: ( ruleEString )
            // InternalRosSystemParser.g:9593:4: ruleEString
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
    // InternalRosSystemParser.g:9604:1: rule__RosServerClientReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosServerClientReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9608:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9609:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9609:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9610:3: ( ruleEString )
            {
             before(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_1_0());
            // InternalRosSystemParser.g:9611:3: ( ruleEString )
            // InternalRosSystemParser.g:9612:4: ruleEString
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
    // InternalRosSystemParser.g:9623:1: rule__RosActionServerReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosActionServerReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9627:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9628:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9628:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9629:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_1_0());
            // InternalRosSystemParser.g:9630:3: ( ruleEString )
            // InternalRosSystemParser.g:9631:4: ruleEString
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
    // InternalRosSystemParser.g:9642:1: rule__RosActionClientReference__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosActionClientReference__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9646:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9647:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9647:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9648:3: ( ruleEString )
            {
             before(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_1_0());
            // InternalRosSystemParser.g:9649:3: ( ruleEString )
            // InternalRosSystemParser.g:9650:4: ruleEString
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
    // InternalRosSystemParser.g:9661:1: rule__RosParameter__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosParameter__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9665:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9666:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:9666:2: ( ruleEString )
            // InternalRosSystemParser.g:9667:3: ruleEString
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


    // $ANTLR start "rule__RosParameter__FromAssignment_2"
    // InternalRosSystemParser.g:9676:1: rule__RosParameter__FromAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__RosParameter__FromAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9680:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9681:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9681:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9682:3: ( ruleEString )
            {
             before(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_2_0());
            // InternalRosSystemParser.g:9683:3: ( ruleEString )
            // InternalRosSystemParser.g:9684:4: ruleEString
            {
             before(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_2_0_1());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getFromParameterEStringParserRuleCall_2_0_1());

            }

             after(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__FromAssignment_2"


    // $ANTLR start "rule__RosParameter__ValueAssignment_5"
    // InternalRosSystemParser.g:9695:1: rule__RosParameter__ValueAssignment_5 : ( ruleParameterValue ) ;
    public final void rule__RosParameter__ValueAssignment_5() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9699:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:9700:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:9700:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:9701:3: ruleParameterValue
            {
             before(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_5_0());
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_5_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosParameter__ValueAssignment_5"


    // $ANTLR start "rule__RosConnection__FromAssignment_1"
    // InternalRosSystemParser.g:9710:1: rule__RosConnection__FromAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__RosConnection__FromAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9714:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9715:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9715:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9716:3: ( ruleEString )
            {
             before(grammarAccess.getRosConnectionAccess().getFromRosInterfaceCrossReference_1_0());
            // InternalRosSystemParser.g:9717:3: ( ruleEString )
            // InternalRosSystemParser.g:9718:4: ruleEString
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
    // InternalRosSystemParser.g:9729:1: rule__RosConnection__ToAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__RosConnection__ToAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9733:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:9734:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:9734:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:9735:3: ( ruleEString )
            {
             before(grammarAccess.getRosConnectionAccess().getToRosInterfaceCrossReference_3_0());
            // InternalRosSystemParser.g:9736:3: ( ruleEString )
            // InternalRosSystemParser.g:9737:4: ruleEString
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
    // InternalRosSystemParser.g:9748:1: rule__GlobalNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9752:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9753:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9753:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9754:3: ruleGraphName
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
    // InternalRosSystemParser.g:9763:1: rule__GlobalNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9767:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9768:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9768:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9769:3: ruleGraphName
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
    // InternalRosSystemParser.g:9778:1: rule__RelativeNamespace_Impl__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9782:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9783:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9783:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9784:3: ruleGraphName
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
    // InternalRosSystemParser.g:9793:1: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9797:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9798:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9798:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9799:3: ruleGraphName
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
    // InternalRosSystemParser.g:9808:1: rule__PrivateNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9812:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9813:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9813:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9814:3: ruleGraphName
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
    // InternalRosSystemParser.g:9823:1: rule__PrivateNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9827:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:9828:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:9828:2: ( ruleGraphName )
            // InternalRosSystemParser.g:9829:3: ruleGraphName
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


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_3"
    // InternalRosSystemParser.g:9838:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9842:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:9843:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:9843:2: ( ruleParameterType )
            // InternalRosSystemParser.g:9844:3: ruleParameterType
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
    // InternalRosSystemParser.g:9853:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9857:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:9858:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:9858:2: ( ruleParameterType )
            // InternalRosSystemParser.g:9859:3: ruleParameterType
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
    // InternalRosSystemParser.g:9868:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9872:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:9873:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:9873:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:9874:3: ruleParameterStructTypeMember
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
    // InternalRosSystemParser.g:9883:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9887:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:9888:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:9888:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:9889:3: ruleParameterStructTypeMember
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
    // InternalRosSystemParser.g:9898:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9902:1: ( ( ruleParameterInteger ) )
            // InternalRosSystemParser.g:9903:2: ( ruleParameterInteger )
            {
            // InternalRosSystemParser.g:9903:2: ( ruleParameterInteger )
            // InternalRosSystemParser.g:9904:3: ruleParameterInteger
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
    // InternalRosSystemParser.g:9913:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9917:1: ( ( ruleParameterString ) )
            // InternalRosSystemParser.g:9918:2: ( ruleParameterString )
            {
            // InternalRosSystemParser.g:9918:2: ( ruleParameterString )
            // InternalRosSystemParser.g:9919:3: ruleParameterString
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
    // InternalRosSystemParser.g:9928:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9932:1: ( ( ruleParameterDouble ) )
            // InternalRosSystemParser.g:9933:2: ( ruleParameterDouble )
            {
            // InternalRosSystemParser.g:9933:2: ( ruleParameterDouble )
            // InternalRosSystemParser.g:9934:3: ruleParameterDouble
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
    // InternalRosSystemParser.g:9943:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9947:1: ( ( ruleParameterBoolean ) )
            // InternalRosSystemParser.g:9948:2: ( ruleParameterBoolean )
            {
            // InternalRosSystemParser.g:9948:2: ( ruleParameterBoolean )
            // InternalRosSystemParser.g:9949:3: ruleParameterBoolean
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
    // InternalRosSystemParser.g:9958:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9962:1: ( ( ruleParameterBase64 ) )
            // InternalRosSystemParser.g:9963:2: ( ruleParameterBase64 )
            {
            // InternalRosSystemParser.g:9963:2: ( ruleParameterBase64 )
            // InternalRosSystemParser.g:9964:3: ruleParameterBase64
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


    // $ANTLR start "rule__ParameterArrayType__TypeAssignment_2"
    // InternalRosSystemParser.g:9973:1: rule__ParameterArrayType__TypeAssignment_2 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9977:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:9978:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:9978:2: ( ruleParameterType )
            // InternalRosSystemParser.g:9979:3: ruleParameterType
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__TypeAssignment_2"


    // $ANTLR start "rule__ParameterArrayType__DefaultAssignment_3_1"
    // InternalRosSystemParser.g:9988:1: rule__ParameterArrayType__DefaultAssignment_3_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:9992:1: ( ( ruleParameterList ) )
            // InternalRosSystemParser.g:9993:2: ( ruleParameterList )
            {
            // InternalRosSystemParser.g:9993:2: ( ruleParameterList )
            // InternalRosSystemParser.g:9994:3: ruleParameterList
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__DefaultAssignment_3_1"


    // $ANTLR start "rule__ParameterList__ValueAssignment_2"
    // InternalRosSystemParser.g:10003:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10007:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10008:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10008:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10009:3: ruleParameterValue
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
    // InternalRosSystemParser.g:10018:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10022:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10023:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10023:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10024:3: ruleParameterValue
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
    // InternalRosSystemParser.g:10033:1: rule__ParameterAny__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_2_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10037:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10038:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10038:2: ( ruleEString )
            // InternalRosSystemParser.g:10039:3: ruleEString
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
    // InternalRosSystemParser.g:10048:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10052:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10053:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10053:2: ( ruleEString )
            // InternalRosSystemParser.g:10054:3: ruleEString
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
    // InternalRosSystemParser.g:10063:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10067:1: ( ( ruleBase64Binary ) )
            // InternalRosSystemParser.g:10068:2: ( ruleBase64Binary )
            {
            // InternalRosSystemParser.g:10068:2: ( ruleBase64Binary )
            // InternalRosSystemParser.g:10069:3: ruleBase64Binary
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
    // InternalRosSystemParser.g:10078:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10082:1: ( ( ruleInteger0 ) )
            // InternalRosSystemParser.g:10083:2: ( ruleInteger0 )
            {
            // InternalRosSystemParser.g:10083:2: ( ruleInteger0 )
            // InternalRosSystemParser.g:10084:3: ruleInteger0
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
    // InternalRosSystemParser.g:10093:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10097:1: ( ( ruleDouble0 ) )
            // InternalRosSystemParser.g:10098:2: ( ruleDouble0 )
            {
            // InternalRosSystemParser.g:10098:2: ( ruleDouble0 )
            // InternalRosSystemParser.g:10099:3: ruleDouble0
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
    // InternalRosSystemParser.g:10108:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10112:1: ( ( ruleboolean0 ) )
            // InternalRosSystemParser.g:10113:2: ( ruleboolean0 )
            {
            // InternalRosSystemParser.g:10113:2: ( ruleboolean0 )
            // InternalRosSystemParser.g:10114:3: ruleboolean0
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
    // InternalRosSystemParser.g:10123:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10127:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:10128:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:10128:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:10129:3: ruleParameterStructMember
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
    // InternalRosSystemParser.g:10138:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10142:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:10143:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:10143:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:10144:3: ruleParameterStructMember
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
    // InternalRosSystemParser.g:10153:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10157:1: ( ( ruleDateTime0 ) )
            // InternalRosSystemParser.g:10158:2: ( ruleDateTime0 )
            {
            // InternalRosSystemParser.g:10158:2: ( ruleDateTime0 )
            // InternalRosSystemParser.g:10159:3: ruleDateTime0
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


    // $ANTLR start "rule__ParameterStructMember__NameAssignment_0"
    // InternalRosSystemParser.g:10168:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10172:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10173:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10173:2: ( ruleEString )
            // InternalRosSystemParser.g:10174:3: ruleEString
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__NameAssignment_0"


    // $ANTLR start "rule__ParameterStructMember__ValueAssignment_3"
    // InternalRosSystemParser.g:10183:1: rule__ParameterStructMember__ValueAssignment_3 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_3() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10187:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:10188:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:10188:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:10189:3: ruleParameterValue
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            pushFollow(FOLLOW_2);
            ruleParameterValue();

            state._fsp--;

             after(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

                restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructMember__ValueAssignment_3"


    // $ANTLR start "rule__ParameterStructTypeMember__NameAssignment_0"
    // InternalRosSystemParser.g:10198:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10202:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10203:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:10203:2: ( ruleEString )
            // InternalRosSystemParser.g:10204:3: ruleEString
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
    // InternalRosSystemParser.g:10213:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10217:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:10218:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:10218:2: ( ruleParameterType )
            // InternalRosSystemParser.g:10219:3: ruleParameterType
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
    // InternalRosSystemParser.g:10228:1: rule__TopicSpecRef__TopicSpecAssignment : ( ( ruleEString ) ) ;
    public final void rule__TopicSpecRef__TopicSpecAssignment() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10232:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10233:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10233:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10234:3: ( ruleEString )
            {
             before(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0());
            // InternalRosSystemParser.g:10235:3: ( ruleEString )
            // InternalRosSystemParser.g:10236:4: ruleEString
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
    // InternalRosSystemParser.g:10247:1: rule__ArrayTopicSpecRef__TopicSpecAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ArrayTopicSpecRef__TopicSpecAssignment_0() throws RecognitionException {

                int stackSize = keepStackSize();

        try {
            // InternalRosSystemParser.g:10251:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:10252:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:10252:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:10253:3: ( ruleEString )
            {
             before(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0_0());
            // InternalRosSystemParser.g:10254:3: ( ruleEString )
            // InternalRosSystemParser.g:10255:4: ruleEString
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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\115\5\uffff\1\115\1\uffff\2\115\1\uffff";
    static final String dfa_4s = "\1\141\5\uffff\1\135\1\uffff\2\120\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\uffff\1\6\1\7\1\uffff\1\2\1\5\1\3\1\4\6\uffff\2\1\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\2\12\1\uffff\4\12\6\uffff\1\11\1\10",
            "",
            "\1\12\1\7\1\uffff\1\12",
            "\1\12\1\7\1\uffff\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2299:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );";
        }
    }
    static final String dfa_8s = "\42\uffff";
    static final String dfa_9s = "\36\uffff\2\40\2\uffff";
    static final String dfa_10s = "\1\15\35\uffff\2\114\2\uffff";
    static final String dfa_11s = "\1\135\35\uffff\2\114\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\36\1\37";
    static final String dfa_13s = "\42\uffff}>";
    static final String[] dfa_14s = {
            "\1\32\1\33\1\uffff\1\17\3\uffff\1\34\1\uffff\1\25\1\27\1\31\2\uffff\1\12\1\13\4\uffff\1\24\1\26\1\30\2\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\22\2\uffff\1\14\1\5\1\7\1\11\2\uffff\1\4\1\6\1\10\1\uffff\1\3\3\uffff\1\1\1\15\1\uffff\1\2\2\uffff\1\16\24\uffff\1\37\1\36",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2350:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleTopicSpecRef ) | ( ruleArrayTopicSpecRef ) );";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000D00L,0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000000000D02L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000230000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000600L,0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001E00C0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x00000000303C8000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001B0006000000L,0x0000000100000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}
