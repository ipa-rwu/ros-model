package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemLexer extends Lexer {
    public static final int Connections=9;
    public static final int Float32_1=14;
    public static final int Node=71;
    public static final int RULE_DATE_TIME=92;
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
    public static final int RULE_ID=93;
    public static final int RULE_DIGIT=82;
    public static final int GlobalNamespace=7;
    public static final int Int16_1=34;
    public static final int Header=43;
    public static final int RULE_INT=95;
    public static final int Byte=67;
    public static final int RULE_ML_COMMENT=102;
    public static final int LeftSquareBracket=80;
    public static final int Base64=41;
    public static final int FromSS=33;
    public static final int Comma=78;
    public static final int RULE_MESSAGE_ASIGMENT=96;
    public static final int LeftSquareBracketRightSquareBracket=77;
    public static final int Int32=59;
    public static final int RULE_DECINT=85;
    public static final int Uint32=54;
    public static final int RULE_HOUR=90;
    public static final int Int8=69;
    public static final int Default=27;
    public static final int Int8_1=49;
    public static final int Uint16_1=22;
    public static final int Type=73;
    public static final int Float64=29;
    public static final int Int32_1=35;
    public static final int FromSC=32;
    public static final int RULE_BINARY=83;
    public static final int String_1=52;
    public static final int String_2=20;
    public static final int FromAC=30;
    public static final int RULE_DAY=87;
    public static final int RULE_BEGIN=97;
    public static final int RULE_BOOLEAN=84;
    public static final int RelativeNamespace=5;
    public static final int RULE_YEAR=89;
    public static final int Result=51;
    public static final int Name=70;
    public static final int RULE_MIN_SEC=91;
    public static final int FromAS=31;
    public static final int ParameterAny=8;
    public static final int List=65;
    public static final int RightSquareBracket=81;
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
    public static final int RULE_END=98;
    public static final int Message=37;
    public static final int Value_1=56;
    public static final int Time=72;
    public static final int RULE_STRING=94;
    public static final int Bool_1=47;
    public static final int Any=74;
    public static final int Struct=45;
    public static final int RULE_SL_COMMENT=99;
    public static final int Uint8_1=39;
    public static final int RULE_DOUBLE=86;
    public static final int Feedback=17;
    public static final int ParameterStructMember=4;
    public static final int RULE_ROS_CONVENTION_A=100;
    public static final int RULE_ROS_CONVENTION_PARAM=101;
    public static final int Colon=79;
    public static final int EOF=-1;
    public static final int FromSub=19;
    public static final int Ns=75;
    public static final int RULE_WS=103;
    public static final int HyphenMinusLeftSquareBracket=76;
    public static final int Int64_1=36;
    public static final int Service=38;
    public static final int From=57;
    public static final int RULE_ANY_OTHER=104;
    public static final int Nodes=50;
    public static final int Date=64;
    public static final int Interfaces=10;
    public static final int Threads=21;
    public static final int Integer=26;
    public static final int Array=40;
    public static final int Int64=60;
    public static final int RULE_MONTH=88;

    // delegates
    // delegators

    public InternalRosSystemLexer() {;} 
    public InternalRosSystemLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRosSystemLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRosSystemLexer.g"; }

    // $ANTLR start "ParameterStructMember"
    public final void mParameterStructMember() throws RecognitionException {
        try {
            int _type = ParameterStructMember;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:14:23: ( 'ParameterStructMember' )
            // InternalRosSystemLexer.g:14:25: 'ParameterStructMember'
            {
            match("ParameterStructMember"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterStructMember"

    // $ANTLR start "RelativeNamespace"
    public final void mRelativeNamespace() throws RecognitionException {
        try {
            int _type = RelativeNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:16:19: ( 'RelativeNamespace' )
            // InternalRosSystemLexer.g:16:21: 'RelativeNamespace'
            {
            match("RelativeNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RelativeNamespace"

    // $ANTLR start "PrivateNamespace"
    public final void mPrivateNamespace() throws RecognitionException {
        try {
            int _type = PrivateNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:18:18: ( 'PrivateNamespace' )
            // InternalRosSystemLexer.g:18:20: 'PrivateNamespace'
            {
            match("PrivateNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PrivateNamespace"

    // $ANTLR start "GlobalNamespace"
    public final void mGlobalNamespace() throws RecognitionException {
        try {
            int _type = GlobalNamespace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:20:17: ( 'GlobalNamespace' )
            // InternalRosSystemLexer.g:20:19: 'GlobalNamespace'
            {
            match("GlobalNamespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GlobalNamespace"

    // $ANTLR start "ParameterAny"
    public final void mParameterAny() throws RecognitionException {
        try {
            int _type = ParameterAny;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:22:14: ( 'ParameterAny' )
            // InternalRosSystemLexer.g:22:16: 'ParameterAny'
            {
            match("ParameterAny"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParameterAny"

    // $ANTLR start "Connections"
    public final void mConnections() throws RecognitionException {
        try {
            int _type = Connections;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:24:13: ( 'connections:' )
            // InternalRosSystemLexer.g:24:15: 'connections:'
            {
            match("connections:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Connections"

    // $ANTLR start "Interfaces"
    public final void mInterfaces() throws RecognitionException {
        try {
            int _type = Interfaces;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:26:12: ( 'interfaces:' )
            // InternalRosSystemLexer.g:26:14: 'interfaces:'
            {
            match("interfaces:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Interfaces"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:28:12: ( 'parameters:' )
            // InternalRosSystemLexer.g:28:14: 'parameters:'
            {
            match("parameters:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Processes"
    public final void mProcesses() throws RecognitionException {
        try {
            int _type = Processes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:30:11: ( 'processes:' )
            // InternalRosSystemLexer.g:30:13: 'processes:'
            {
            match("processes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Processes"

    // $ANTLR start "GraphName"
    public final void mGraphName() throws RecognitionException {
        try {
            int _type = GraphName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:32:11: ( 'GraphName' )
            // InternalRosSystemLexer.g:32:13: 'GraphName'
            {
            match("GraphName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GraphName"

    // $ANTLR start "Float32_1"
    public final void mFloat32_1() throws RecognitionException {
        try {
            int _type = Float32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:34:11: ( 'float32[]' )
            // InternalRosSystemLexer.g:34:13: 'float32[]'
            {
            match("float32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32_1"

    // $ANTLR start "Float64_1"
    public final void mFloat64_1() throws RecognitionException {
        try {
            int _type = Float64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:36:11: ( 'float64[]' )
            // InternalRosSystemLexer.g:36:13: 'float64[]'
            {
            match("float64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64_1"

    // $ANTLR start "Duration"
    public final void mDuration() throws RecognitionException {
        try {
            int _type = Duration;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:38:10: ( 'duration' )
            // InternalRosSystemLexer.g:38:12: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Duration"

    // $ANTLR start "Feedback"
    public final void mFeedback() throws RecognitionException {
        try {
            int _type = Feedback;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:40:10: ( 'feedback' )
            // InternalRosSystemLexer.g:40:12: 'feedback'
            {
            match("feedback"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Feedback"

    // $ANTLR start "FromPub"
    public final void mFromPub() throws RecognitionException {
        try {
            int _type = FromPub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:42:9: ( 'fromPub:' )
            // InternalRosSystemLexer.g:42:11: 'fromPub:'
            {
            match("fromPub:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromPub"

    // $ANTLR start "FromSub"
    public final void mFromSub() throws RecognitionException {
        try {
            int _type = FromSub;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:44:9: ( 'fromSub:' )
            // InternalRosSystemLexer.g:44:11: 'fromSub:'
            {
            match("fromSub:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromSub"

    // $ANTLR start "String_2"
    public final void mString_2() throws RecognitionException {
        try {
            int _type = String_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:46:10: ( 'string[]' )
            // InternalRosSystemLexer.g:46:12: 'string[]'
            {
            match("string[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_2"

    // $ANTLR start "Threads"
    public final void mThreads() throws RecognitionException {
        try {
            int _type = Threads;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:48:9: ( 'threads:' )
            // InternalRosSystemLexer.g:48:11: 'threads:'
            {
            match("threads:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Threads"

    // $ANTLR start "Uint16_1"
    public final void mUint16_1() throws RecognitionException {
        try {
            int _type = Uint16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:50:10: ( 'uint16[]' )
            // InternalRosSystemLexer.g:50:12: 'uint16[]'
            {
            match("uint16[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16_1"

    // $ANTLR start "Uint32_1"
    public final void mUint32_1() throws RecognitionException {
        try {
            int _type = Uint32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:52:10: ( 'uint32[]' )
            // InternalRosSystemLexer.g:52:12: 'uint32[]'
            {
            match("uint32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32_1"

    // $ANTLR start "Uint64_1"
    public final void mUint64_1() throws RecognitionException {
        try {
            int _type = Uint64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:54:10: ( 'uint64[]' )
            // InternalRosSystemLexer.g:54:12: 'uint64[]'
            {
            match("uint64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64_1"

    // $ANTLR start "Boolean"
    public final void mBoolean() throws RecognitionException {
        try {
            int _type = Boolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:56:9: ( 'Boolean' )
            // InternalRosSystemLexer.g:56:11: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Boolean"

    // $ANTLR start "Integer"
    public final void mInteger() throws RecognitionException {
        try {
            int _type = Integer;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:58:9: ( 'Integer' )
            // InternalRosSystemLexer.g:58:11: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Integer"

    // $ANTLR start "Default"
    public final void mDefault() throws RecognitionException {
        try {
            int _type = Default;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:60:9: ( 'default' )
            // InternalRosSystemLexer.g:60:11: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Default"

    // $ANTLR start "Float32"
    public final void mFloat32() throws RecognitionException {
        try {
            int _type = Float32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:62:9: ( 'float32' )
            // InternalRosSystemLexer.g:62:11: 'float32'
            {
            match("float32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float32"

    // $ANTLR start "Float64"
    public final void mFloat64() throws RecognitionException {
        try {
            int _type = Float64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:64:9: ( 'float64' )
            // InternalRosSystemLexer.g:64:11: 'float64'
            {
            match("float64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Float64"

    // $ANTLR start "FromAC"
    public final void mFromAC() throws RecognitionException {
        try {
            int _type = FromAC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:66:8: ( 'fromAC:' )
            // InternalRosSystemLexer.g:66:10: 'fromAC:'
            {
            match("fromAC:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromAC"

    // $ANTLR start "FromAS"
    public final void mFromAS() throws RecognitionException {
        try {
            int _type = FromAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:68:8: ( 'fromAS:' )
            // InternalRosSystemLexer.g:68:10: 'fromAS:'
            {
            match("fromAS:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromAS"

    // $ANTLR start "FromSC"
    public final void mFromSC() throws RecognitionException {
        try {
            int _type = FromSC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:70:8: ( 'fromSC:' )
            // InternalRosSystemLexer.g:70:10: 'fromSC:'
            {
            match("fromSC:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromSC"

    // $ANTLR start "FromSS"
    public final void mFromSS() throws RecognitionException {
        try {
            int _type = FromSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:72:8: ( 'fromSS:' )
            // InternalRosSystemLexer.g:72:10: 'fromSS:'
            {
            match("fromSS:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FromSS"

    // $ANTLR start "Int16_1"
    public final void mInt16_1() throws RecognitionException {
        try {
            int _type = Int16_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:74:9: ( 'int16[]' )
            // InternalRosSystemLexer.g:74:11: 'int16[]'
            {
            match("int16[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16_1"

    // $ANTLR start "Int32_1"
    public final void mInt32_1() throws RecognitionException {
        try {
            int _type = Int32_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:76:9: ( 'int32[]' )
            // InternalRosSystemLexer.g:76:11: 'int32[]'
            {
            match("int32[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32_1"

    // $ANTLR start "Int64_1"
    public final void mInt64_1() throws RecognitionException {
        try {
            int _type = Int64_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:78:9: ( 'int64[]' )
            // InternalRosSystemLexer.g:78:11: 'int64[]'
            {
            match("int64[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64_1"

    // $ANTLR start "Message"
    public final void mMessage() throws RecognitionException {
        try {
            int _type = Message;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:80:9: ( 'message' )
            // InternalRosSystemLexer.g:80:11: 'message'
            {
            match("message"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message"

    // $ANTLR start "Service"
    public final void mService() throws RecognitionException {
        try {
            int _type = Service;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:82:9: ( 'service' )
            // InternalRosSystemLexer.g:82:11: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Service"

    // $ANTLR start "Uint8_1"
    public final void mUint8_1() throws RecognitionException {
        try {
            int _type = Uint8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:84:9: ( 'uint8[]' )
            // InternalRosSystemLexer.g:84:11: 'uint8[]'
            {
            match("uint8[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8_1"

    // $ANTLR start "Array"
    public final void mArray() throws RecognitionException {
        try {
            int _type = Array;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:86:7: ( 'Array:' )
            // InternalRosSystemLexer.g:86:9: 'Array:'
            {
            match("Array:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Array"

    // $ANTLR start "Base64"
    public final void mBase64() throws RecognitionException {
        try {
            int _type = Base64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:88:8: ( 'Base64' )
            // InternalRosSystemLexer.g:88:10: 'Base64'
            {
            match("Base64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Base64"

    // $ANTLR start "Double"
    public final void mDouble() throws RecognitionException {
        try {
            int _type = Double;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:90:8: ( 'Double' )
            // InternalRosSystemLexer.g:90:10: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Double"

    // $ANTLR start "Header"
    public final void mHeader() throws RecognitionException {
        try {
            int _type = Header;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:92:8: ( 'Header' )
            // InternalRosSystemLexer.g:92:10: 'Header'
            {
            match("Header"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Header"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:94:8: ( 'String' )
            // InternalRosSystemLexer.g:94:10: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Struct"
    public final void mStruct() throws RecognitionException {
        try {
            int _type = Struct;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:96:8: ( 'Struct' )
            // InternalRosSystemLexer.g:96:10: 'Struct'
            {
            match("Struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Struct"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:98:8: ( 'action' )
            // InternalRosSystemLexer.g:98:10: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Bool_1"
    public final void mBool_1() throws RecognitionException {
        try {
            int _type = Bool_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:100:8: ( 'bool[]' )
            // InternalRosSystemLexer.g:100:10: 'bool[]'
            {
            match("bool[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool_1"

    // $ANTLR start "Byte_1"
    public final void mByte_1() throws RecognitionException {
        try {
            int _type = Byte_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:102:8: ( 'byte[]' )
            // InternalRosSystemLexer.g:102:10: 'byte[]'
            {
            match("byte[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte_1"

    // $ANTLR start "Int8_1"
    public final void mInt8_1() throws RecognitionException {
        try {
            int _type = Int8_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:104:8: ( 'int8[]' )
            // InternalRosSystemLexer.g:104:10: 'int8[]'
            {
            match("int8[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8_1"

    // $ANTLR start "Nodes"
    public final void mNodes() throws RecognitionException {
        try {
            int _type = Nodes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:106:7: ( 'nodes:' )
            // InternalRosSystemLexer.g:106:9: 'nodes:'
            {
            match("nodes:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nodes"

    // $ANTLR start "Result"
    public final void mResult() throws RecognitionException {
        try {
            int _type = Result;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:108:8: ( 'result' )
            // InternalRosSystemLexer.g:108:10: 'result'
            {
            match("result"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Result"

    // $ANTLR start "String_1"
    public final void mString_1() throws RecognitionException {
        try {
            int _type = String_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:110:10: ( 'string' )
            // InternalRosSystemLexer.g:110:12: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "String_1"

    // $ANTLR start "Uint16"
    public final void mUint16() throws RecognitionException {
        try {
            int _type = Uint16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:112:8: ( 'uint16' )
            // InternalRosSystemLexer.g:112:10: 'uint16'
            {
            match("uint16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint16"

    // $ANTLR start "Uint32"
    public final void mUint32() throws RecognitionException {
        try {
            int _type = Uint32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:114:8: ( 'uint32' )
            // InternalRosSystemLexer.g:114:10: 'uint32'
            {
            match("uint32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint32"

    // $ANTLR start "Uint64"
    public final void mUint64() throws RecognitionException {
        try {
            int _type = Uint64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:116:8: ( 'uint64' )
            // InternalRosSystemLexer.g:116:10: 'uint64'
            {
            match("uint64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint64"

    // $ANTLR start "Value_1"
    public final void mValue_1() throws RecognitionException {
        try {
            int _type = Value_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:118:9: ( 'value:' )
            // InternalRosSystemLexer.g:118:11: 'value:'
            {
            match("value:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value_1"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:120:6: ( 'from:' )
            // InternalRosSystemLexer.g:120:8: 'from:'
            {
            match("from:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Int16"
    public final void mInt16() throws RecognitionException {
        try {
            int _type = Int16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:122:7: ( 'int16' )
            // InternalRosSystemLexer.g:122:9: 'int16'
            {
            match("int16"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int16"

    // $ANTLR start "Int32"
    public final void mInt32() throws RecognitionException {
        try {
            int _type = Int32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:124:7: ( 'int32' )
            // InternalRosSystemLexer.g:124:9: 'int32'
            {
            match("int32"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int32"

    // $ANTLR start "Int64"
    public final void mInt64() throws RecognitionException {
        try {
            int _type = Int64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:126:7: ( 'int64' )
            // InternalRosSystemLexer.g:126:9: 'int64'
            {
            match("int64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int64"

    // $ANTLR start "Type_1"
    public final void mType_1() throws RecognitionException {
        try {
            int _type = Type_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:128:8: ( 'type:' )
            // InternalRosSystemLexer.g:128:10: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type_1"

    // $ANTLR start "Uint8"
    public final void mUint8() throws RecognitionException {
        try {
            int _type = Uint8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:130:7: ( 'uint8' )
            // InternalRosSystemLexer.g:130:9: 'uint8'
            {
            match("uint8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uint8"

    // $ANTLR start "Value"
    public final void mValue() throws RecognitionException {
        try {
            int _type = Value;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:132:7: ( 'value' )
            // InternalRosSystemLexer.g:132:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Value"

    // $ANTLR start "Date"
    public final void mDate() throws RecognitionException {
        try {
            int _type = Date;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:134:6: ( 'Date' )
            // InternalRosSystemLexer.g:134:8: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Date"

    // $ANTLR start "List"
    public final void mList() throws RecognitionException {
        try {
            int _type = List;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:136:6: ( 'List' )
            // InternalRosSystemLexer.g:136:8: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "List"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:138:6: ( 'bool' )
            // InternalRosSystemLexer.g:138:8: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Byte"
    public final void mByte() throws RecognitionException {
        try {
            int _type = Byte;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:140:6: ( 'byte' )
            // InternalRosSystemLexer.g:140:8: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Byte"

    // $ANTLR start "Goal"
    public final void mGoal() throws RecognitionException {
        try {
            int _type = Goal;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:142:6: ( 'goal' )
            // InternalRosSystemLexer.g:142:8: 'goal'
            {
            match("goal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Goal"

    // $ANTLR start "Int8"
    public final void mInt8() throws RecognitionException {
        try {
            int _type = Int8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:144:6: ( 'int8' )
            // InternalRosSystemLexer.g:144:8: 'int8'
            {
            match("int8"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int8"

    // $ANTLR start "Name"
    public final void mName() throws RecognitionException {
        try {
            int _type = Name;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:146:6: ( 'name' )
            // InternalRosSystemLexer.g:146:8: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Name"

    // $ANTLR start "Node"
    public final void mNode() throws RecognitionException {
        try {
            int _type = Node;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:148:6: ( 'node' )
            // InternalRosSystemLexer.g:148:8: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Node"

    // $ANTLR start "Time"
    public final void mTime() throws RecognitionException {
        try {
            int _type = Time;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:150:6: ( 'time' )
            // InternalRosSystemLexer.g:150:8: 'time'
            {
            match("time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Time"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:152:6: ( 'type' )
            // InternalRosSystemLexer.g:152:8: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Any"
    public final void mAny() throws RecognitionException {
        try {
            int _type = Any;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:154:5: ( 'Any' )
            // InternalRosSystemLexer.g:154:7: 'Any'
            {
            match("Any"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Any"

    // $ANTLR start "Ns"
    public final void mNs() throws RecognitionException {
        try {
            int _type = Ns;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:156:4: ( 'ns:' )
            // InternalRosSystemLexer.g:156:6: 'ns:'
            {
            match("ns:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ns"

    // $ANTLR start "HyphenMinusLeftSquareBracket"
    public final void mHyphenMinusLeftSquareBracket() throws RecognitionException {
        try {
            int _type = HyphenMinusLeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:158:30: ( '-[' )
            // InternalRosSystemLexer.g:158:32: '-['
            {
            match("-["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusLeftSquareBracket"

    // $ANTLR start "LeftSquareBracketRightSquareBracket"
    public final void mLeftSquareBracketRightSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracketRightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:160:37: ( '[]' )
            // InternalRosSystemLexer.g:160:39: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracketRightSquareBracket"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:162:7: ( ',' )
            // InternalRosSystemLexer.g:162:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:164:7: ( ':' )
            // InternalRosSystemLexer.g:164:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:166:19: ( '[' )
            // InternalRosSystemLexer.g:166:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:168:20: ( ']' )
            // InternalRosSystemLexer.g:168:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:170:21: ( '0' .. '9' )
            // InternalRosSystemLexer.g:170:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:172:13: ( ( '0b' | '0B' ) ( '0' | '1' )+ )
            // InternalRosSystemLexer.g:172:15: ( '0b' | '0B' ) ( '0' | '1' )+
            {
            // InternalRosSystemLexer.g:172:15: ( '0b' | '0B' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='0') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='b') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='B') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosSystemLexer.g:172:16: '0b'
                    {
                    match("0b"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:172:21: '0B'
                    {
                    match("0B"); 


                    }
                    break;

            }

            // InternalRosSystemLexer.g:172:27: ( '0' | '1' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='1')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:174:14: ( ( 'true' | 'false' ) )
            // InternalRosSystemLexer.g:174:16: ( 'true' | 'false' )
            {
            // InternalRosSystemLexer.g:174:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystemLexer.g:174:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:174:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:176:13: ( RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT ) )
            // InternalRosSystemLexer.g:176:15: RULE_DIGIT ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            {
            mRULE_DIGIT(); 
            // InternalRosSystemLexer.g:176:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalRosSystemLexer.g:176:27: '.' ( RULE_DECINT )*
                    {
                    match('.'); 
                    // InternalRosSystemLexer.g:176:31: ( RULE_DECINT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='-'||(LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:176:31: RULE_DECINT
                    	    {
                    	    mRULE_DECINT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:176:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT
                    {
                    // InternalRosSystemLexer.g:176:44: ( '.' ( RULE_DIGIT )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRosSystemLexer.g:176:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalRosSystemLexer.g:176:49: ( RULE_DIGIT )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalRosSystemLexer.g:176:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalRosSystemLexer.g:176:73: ( '-' | '+' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRosSystemLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_DIGIT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_DECINT"
    public final void mRULE_DECINT() throws RecognitionException {
        try {
            int _type = RULE_DECINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:178:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* ) )
            // InternalRosSystemLexer.g:178:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            {
            // InternalRosSystemLexer.g:178:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* | '-' '0' .. '9' ( RULE_DIGIT )* )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt11=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt11=2;
                }
                break;
            case '-':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRosSystemLexer.g:178:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:178:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalRosSystemLexer.g:178:29: ( RULE_DIGIT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:178:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:178:41: '-' '0' .. '9' ( RULE_DIGIT )*
                    {
                    match('-'); 
                    matchRange('0','9'); 
                    // InternalRosSystemLexer.g:178:54: ( RULE_DIGIT )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:178:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECINT"

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:180:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalRosSystemLexer.g:180:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalRosSystemLexer.g:180:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='1' && LA12_0<='3')) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='9')) ) {
                    alt12=2;
                }
                else {
                    alt12=1;}
            }
            else if ( ((LA12_0>='4' && LA12_0<='9')) ) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystemLexer.g:180:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:180:31: '1' .. '3' '0' .. '9'
                    {
                    matchRange('1','3'); 
                    matchRange('0','9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:182:21: ( ( '1' .. '9' | '1' '0' .. '2' ) )
            // InternalRosSystemLexer.g:182:23: ( '1' .. '9' | '1' '0' .. '2' )
            {
            // InternalRosSystemLexer.g:182:23: ( '1' .. '9' | '1' '0' .. '2' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='1') ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='2')) ) {
                    alt13=2;
                }
                else {
                    alt13=1;}
            }
            else if ( ((LA13_0>='2' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosSystemLexer.g:182:24: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:182:33: '1' '0' .. '2'
                    {
                    match('1'); 
                    matchRange('0','2'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:184:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalRosSystemLexer.g:184:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','2'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_HOUR"
    public final void mRULE_HOUR() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:186:20: ( ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' ) )
            // InternalRosSystemLexer.g:186:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            {
            // InternalRosSystemLexer.g:186:22: ( '0' .. '1' '0' .. '9' | '2' '0' .. '3' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>='0' && LA14_0<='1')) ) {
                alt14=1;
            }
            else if ( (LA14_0=='2') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystemLexer.g:186:23: '0' .. '1' '0' .. '9'
                    {
                    matchRange('0','1'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:186:41: '2' '0' .. '3'
                    {
                    match('2'); 
                    matchRange('0','3'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HOUR"

    // $ANTLR start "RULE_MIN_SEC"
    public final void mRULE_MIN_SEC() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:188:23: ( '0' .. '5' '0' .. '9' )
            // InternalRosSystemLexer.g:188:25: '0' .. '5' '0' .. '9'
            {
            matchRange('0','5'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIN_SEC"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:190:16: ( RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC )
            // InternalRosSystemLexer.g:190:18: RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC
            {
            mRULE_YEAR(); 
            match('-'); 
            mRULE_MONTH(); 
            match('-'); 
            mRULE_DAY(); 
            match('T'); 
            mRULE_HOUR(); 
            match(':'); 
            mRULE_MIN_SEC(); 
            match(':'); 
            mRULE_MIN_SEC(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_MESSAGE_ASIGMENT"
    public final void mRULE_MESSAGE_ASIGMENT() throws RecognitionException {
        try {
            int _type = RULE_MESSAGE_ASIGMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:192:23: ( ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT ) )
            // InternalRosSystemLexer.g:192:25: ( RULE_ID | RULE_STRING ) '=' ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            {
            // InternalRosSystemLexer.g:192:25: ( RULE_ID | RULE_STRING )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='^' && LA15_0<='_')||(LA15_0>='a' && LA15_0<='z')) ) {
                alt15=1;
            }
            else if ( (LA15_0=='\"'||LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystemLexer.g:192:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:192:34: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;

            }

            match('='); 
            // InternalRosSystemLexer.g:192:51: ( RULE_ID | RULE_STRING | RULE_INT | '-' RULE_INT )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt16=1;
                }
                break;
            case '\"':
            case '\'':
                {
                alt16=2;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt16=3;
                }
                break;
            case '-':
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRosSystemLexer.g:192:52: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:192:60: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 3 :
                    // InternalRosSystemLexer.g:192:72: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 4 :
                    // InternalRosSystemLexer.g:192:81: '-' RULE_INT
                    {
                    match('-'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MESSAGE_ASIGMENT"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:194:21: ()
            // InternalRosSystemLexer.g:194:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalRosSystemLexer.g:196:19: ()
            // InternalRosSystemLexer.g:196:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:198:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* )
            // InternalRosSystemLexer.g:198:19: '#' (~ ( ( '\\n' | '\\r' ) ) )*
            {
            match('#'); 
            // InternalRosSystemLexer.g:198:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRosSystemLexer.g:198:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ROS_CONVENTION_A"
    public final void mRULE_ROS_CONVENTION_A() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:200:23: ( ( '/' RULE_ID | RULE_ID '/' )* )
            // InternalRosSystemLexer.g:200:25: ( '/' RULE_ID | RULE_ID '/' )*
            {
            // InternalRosSystemLexer.g:200:25: ( '/' RULE_ID | RULE_ID '/' )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='/') ) {
                    alt18=1;
                }
                else if ( ((LA18_0>='A' && LA18_0<='Z')||(LA18_0>='^' && LA18_0<='_')||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRosSystemLexer.g:200:26: '/' RULE_ID
            	    {
            	    match('/'); 
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:200:38: RULE_ID '/'
            	    {
            	    mRULE_ID(); 
            	    match('/'); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_A"

    // $ANTLR start "RULE_ROS_CONVENTION_PARAM"
    public final void mRULE_ROS_CONVENTION_PARAM() throws RecognitionException {
        try {
            int _type = RULE_ROS_CONVENTION_PARAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:202:27: ( ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )* )
            // InternalRosSystemLexer.g:202:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            {
            // InternalRosSystemLexer.g:202:29: ( '/' RULE_STRING | RULE_STRING '/' | '~' RULE_STRING )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt19=1;
                    }
                    break;
                case '\"':
                case '\'':
                    {
                    alt19=2;
                    }
                    break;
                case '~':
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalRosSystemLexer.g:202:30: '/' RULE_STRING
            	    {
            	    match('/'); 
            	    mRULE_STRING(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemLexer.g:202:46: RULE_STRING '/'
            	    {
            	    mRULE_STRING(); 
            	    match('/'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystemLexer.g:202:62: '~' RULE_STRING
            	    {
            	    match('~'); 
            	    mRULE_STRING(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROS_CONVENTION_PARAM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:204:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRosSystemLexer.g:204:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalRosSystemLexer.g:204:11: ( '^' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='^') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystemLexer.g:204:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRosSystemLexer.g:204:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:206:10: ( ( '0' .. '9' )+ )
            // InternalRosSystemLexer.g:206:12: ( '0' .. '9' )+
            {
            // InternalRosSystemLexer.g:206:12: ( '0' .. '9' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystemLexer.g:206:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:208:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRosSystemLexer.g:208:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRosSystemLexer.g:208:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\"') ) {
                alt25=1;
            }
            else if ( (LA25_0=='\'') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystemLexer.g:208:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRosSystemLexer.g:208:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop23:
                    do {
                        int alt23=3;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\\') ) {
                            alt23=1;
                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                            alt23=2;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:208:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:208:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRosSystemLexer.g:208:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRosSystemLexer.g:208:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\\') ) {
                            alt24=1;
                        }
                        else if ( ((LA24_0>='\u0000' && LA24_0<='&')||(LA24_0>='(' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRosSystemLexer.g:208:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRosSystemLexer.g:208:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:210:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalRosSystemLexer.g:210:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalRosSystemLexer.g:210:24: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRosSystemLexer.g:210:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:212:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRosSystemLexer.g:212:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRosSystemLexer.g:212:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\t' && LA27_0<='\n')||LA27_0=='\r'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRosSystemLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRosSystemLexer.g:214:16: ( . )
            // InternalRosSystemLexer.g:214:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRosSystemLexer.g:1:8: ( ParameterStructMember | RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | Duration | Feedback | FromPub | FromSub | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Default | Float32 | Float64 | FromAC | FromAS | FromSC | FromSS | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt28=93;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // InternalRosSystemLexer.g:1:10: ParameterStructMember
                {
                mParameterStructMember(); 

                }
                break;
            case 2 :
                // InternalRosSystemLexer.g:1:32: RelativeNamespace
                {
                mRelativeNamespace(); 

                }
                break;
            case 3 :
                // InternalRosSystemLexer.g:1:50: PrivateNamespace
                {
                mPrivateNamespace(); 

                }
                break;
            case 4 :
                // InternalRosSystemLexer.g:1:67: GlobalNamespace
                {
                mGlobalNamespace(); 

                }
                break;
            case 5 :
                // InternalRosSystemLexer.g:1:83: ParameterAny
                {
                mParameterAny(); 

                }
                break;
            case 6 :
                // InternalRosSystemLexer.g:1:96: Connections
                {
                mConnections(); 

                }
                break;
            case 7 :
                // InternalRosSystemLexer.g:1:108: Interfaces
                {
                mInterfaces(); 

                }
                break;
            case 8 :
                // InternalRosSystemLexer.g:1:119: Parameters
                {
                mParameters(); 

                }
                break;
            case 9 :
                // InternalRosSystemLexer.g:1:130: Processes
                {
                mProcesses(); 

                }
                break;
            case 10 :
                // InternalRosSystemLexer.g:1:140: GraphName
                {
                mGraphName(); 

                }
                break;
            case 11 :
                // InternalRosSystemLexer.g:1:150: Float32_1
                {
                mFloat32_1(); 

                }
                break;
            case 12 :
                // InternalRosSystemLexer.g:1:160: Float64_1
                {
                mFloat64_1(); 

                }
                break;
            case 13 :
                // InternalRosSystemLexer.g:1:170: Duration
                {
                mDuration(); 

                }
                break;
            case 14 :
                // InternalRosSystemLexer.g:1:179: Feedback
                {
                mFeedback(); 

                }
                break;
            case 15 :
                // InternalRosSystemLexer.g:1:188: FromPub
                {
                mFromPub(); 

                }
                break;
            case 16 :
                // InternalRosSystemLexer.g:1:196: FromSub
                {
                mFromSub(); 

                }
                break;
            case 17 :
                // InternalRosSystemLexer.g:1:204: String_2
                {
                mString_2(); 

                }
                break;
            case 18 :
                // InternalRosSystemLexer.g:1:213: Threads
                {
                mThreads(); 

                }
                break;
            case 19 :
                // InternalRosSystemLexer.g:1:221: Uint16_1
                {
                mUint16_1(); 

                }
                break;
            case 20 :
                // InternalRosSystemLexer.g:1:230: Uint32_1
                {
                mUint32_1(); 

                }
                break;
            case 21 :
                // InternalRosSystemLexer.g:1:239: Uint64_1
                {
                mUint64_1(); 

                }
                break;
            case 22 :
                // InternalRosSystemLexer.g:1:248: Boolean
                {
                mBoolean(); 

                }
                break;
            case 23 :
                // InternalRosSystemLexer.g:1:256: Integer
                {
                mInteger(); 

                }
                break;
            case 24 :
                // InternalRosSystemLexer.g:1:264: Default
                {
                mDefault(); 

                }
                break;
            case 25 :
                // InternalRosSystemLexer.g:1:272: Float32
                {
                mFloat32(); 

                }
                break;
            case 26 :
                // InternalRosSystemLexer.g:1:280: Float64
                {
                mFloat64(); 

                }
                break;
            case 27 :
                // InternalRosSystemLexer.g:1:288: FromAC
                {
                mFromAC(); 

                }
                break;
            case 28 :
                // InternalRosSystemLexer.g:1:295: FromAS
                {
                mFromAS(); 

                }
                break;
            case 29 :
                // InternalRosSystemLexer.g:1:302: FromSC
                {
                mFromSC(); 

                }
                break;
            case 30 :
                // InternalRosSystemLexer.g:1:309: FromSS
                {
                mFromSS(); 

                }
                break;
            case 31 :
                // InternalRosSystemLexer.g:1:316: Int16_1
                {
                mInt16_1(); 

                }
                break;
            case 32 :
                // InternalRosSystemLexer.g:1:324: Int32_1
                {
                mInt32_1(); 

                }
                break;
            case 33 :
                // InternalRosSystemLexer.g:1:332: Int64_1
                {
                mInt64_1(); 

                }
                break;
            case 34 :
                // InternalRosSystemLexer.g:1:340: Message
                {
                mMessage(); 

                }
                break;
            case 35 :
                // InternalRosSystemLexer.g:1:348: Service
                {
                mService(); 

                }
                break;
            case 36 :
                // InternalRosSystemLexer.g:1:356: Uint8_1
                {
                mUint8_1(); 

                }
                break;
            case 37 :
                // InternalRosSystemLexer.g:1:364: Array
                {
                mArray(); 

                }
                break;
            case 38 :
                // InternalRosSystemLexer.g:1:370: Base64
                {
                mBase64(); 

                }
                break;
            case 39 :
                // InternalRosSystemLexer.g:1:377: Double
                {
                mDouble(); 

                }
                break;
            case 40 :
                // InternalRosSystemLexer.g:1:384: Header
                {
                mHeader(); 

                }
                break;
            case 41 :
                // InternalRosSystemLexer.g:1:391: String
                {
                mString(); 

                }
                break;
            case 42 :
                // InternalRosSystemLexer.g:1:398: Struct
                {
                mStruct(); 

                }
                break;
            case 43 :
                // InternalRosSystemLexer.g:1:405: Action
                {
                mAction(); 

                }
                break;
            case 44 :
                // InternalRosSystemLexer.g:1:412: Bool_1
                {
                mBool_1(); 

                }
                break;
            case 45 :
                // InternalRosSystemLexer.g:1:419: Byte_1
                {
                mByte_1(); 

                }
                break;
            case 46 :
                // InternalRosSystemLexer.g:1:426: Int8_1
                {
                mInt8_1(); 

                }
                break;
            case 47 :
                // InternalRosSystemLexer.g:1:433: Nodes
                {
                mNodes(); 

                }
                break;
            case 48 :
                // InternalRosSystemLexer.g:1:439: Result
                {
                mResult(); 

                }
                break;
            case 49 :
                // InternalRosSystemLexer.g:1:446: String_1
                {
                mString_1(); 

                }
                break;
            case 50 :
                // InternalRosSystemLexer.g:1:455: Uint16
                {
                mUint16(); 

                }
                break;
            case 51 :
                // InternalRosSystemLexer.g:1:462: Uint32
                {
                mUint32(); 

                }
                break;
            case 52 :
                // InternalRosSystemLexer.g:1:469: Uint64
                {
                mUint64(); 

                }
                break;
            case 53 :
                // InternalRosSystemLexer.g:1:476: Value_1
                {
                mValue_1(); 

                }
                break;
            case 54 :
                // InternalRosSystemLexer.g:1:484: From
                {
                mFrom(); 

                }
                break;
            case 55 :
                // InternalRosSystemLexer.g:1:489: Int16
                {
                mInt16(); 

                }
                break;
            case 56 :
                // InternalRosSystemLexer.g:1:495: Int32
                {
                mInt32(); 

                }
                break;
            case 57 :
                // InternalRosSystemLexer.g:1:501: Int64
                {
                mInt64(); 

                }
                break;
            case 58 :
                // InternalRosSystemLexer.g:1:507: Type_1
                {
                mType_1(); 

                }
                break;
            case 59 :
                // InternalRosSystemLexer.g:1:514: Uint8
                {
                mUint8(); 

                }
                break;
            case 60 :
                // InternalRosSystemLexer.g:1:520: Value
                {
                mValue(); 

                }
                break;
            case 61 :
                // InternalRosSystemLexer.g:1:526: Date
                {
                mDate(); 

                }
                break;
            case 62 :
                // InternalRosSystemLexer.g:1:531: List
                {
                mList(); 

                }
                break;
            case 63 :
                // InternalRosSystemLexer.g:1:536: Bool
                {
                mBool(); 

                }
                break;
            case 64 :
                // InternalRosSystemLexer.g:1:541: Byte
                {
                mByte(); 

                }
                break;
            case 65 :
                // InternalRosSystemLexer.g:1:546: Goal
                {
                mGoal(); 

                }
                break;
            case 66 :
                // InternalRosSystemLexer.g:1:551: Int8
                {
                mInt8(); 

                }
                break;
            case 67 :
                // InternalRosSystemLexer.g:1:556: Name
                {
                mName(); 

                }
                break;
            case 68 :
                // InternalRosSystemLexer.g:1:561: Node
                {
                mNode(); 

                }
                break;
            case 69 :
                // InternalRosSystemLexer.g:1:566: Time
                {
                mTime(); 

                }
                break;
            case 70 :
                // InternalRosSystemLexer.g:1:571: Type
                {
                mType(); 

                }
                break;
            case 71 :
                // InternalRosSystemLexer.g:1:576: Any
                {
                mAny(); 

                }
                break;
            case 72 :
                // InternalRosSystemLexer.g:1:580: Ns
                {
                mNs(); 

                }
                break;
            case 73 :
                // InternalRosSystemLexer.g:1:583: HyphenMinusLeftSquareBracket
                {
                mHyphenMinusLeftSquareBracket(); 

                }
                break;
            case 74 :
                // InternalRosSystemLexer.g:1:612: LeftSquareBracketRightSquareBracket
                {
                mLeftSquareBracketRightSquareBracket(); 

                }
                break;
            case 75 :
                // InternalRosSystemLexer.g:1:648: Comma
                {
                mComma(); 

                }
                break;
            case 76 :
                // InternalRosSystemLexer.g:1:654: Colon
                {
                mColon(); 

                }
                break;
            case 77 :
                // InternalRosSystemLexer.g:1:660: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 78 :
                // InternalRosSystemLexer.g:1:678: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 79 :
                // InternalRosSystemLexer.g:1:697: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 80 :
                // InternalRosSystemLexer.g:1:709: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 81 :
                // InternalRosSystemLexer.g:1:722: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 82 :
                // InternalRosSystemLexer.g:1:734: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 83 :
                // InternalRosSystemLexer.g:1:746: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 84 :
                // InternalRosSystemLexer.g:1:761: RULE_MESSAGE_ASIGMENT
                {
                mRULE_MESSAGE_ASIGMENT(); 

                }
                break;
            case 85 :
                // InternalRosSystemLexer.g:1:783: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 86 :
                // InternalRosSystemLexer.g:1:799: RULE_ROS_CONVENTION_A
                {
                mRULE_ROS_CONVENTION_A(); 

                }
                break;
            case 87 :
                // InternalRosSystemLexer.g:1:821: RULE_ROS_CONVENTION_PARAM
                {
                mRULE_ROS_CONVENTION_PARAM(); 

                }
                break;
            case 88 :
                // InternalRosSystemLexer.g:1:847: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 89 :
                // InternalRosSystemLexer.g:1:855: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 90 :
                // InternalRosSystemLexer.g:1:864: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 91 :
                // InternalRosSystemLexer.g:1:876: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 92 :
                // InternalRosSystemLexer.g:1:892: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // InternalRosSystemLexer.g:1:900: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA8_eotS =
        "\1\uffff\1\5\1\uffff\2\5\1\uffff\2\5";
    static final String DFA8_eofS =
        "\10\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\2\60\1\uffff\2\60";
    static final String DFA8_maxS =
        "\2\145\1\uffff\2\145\1\uffff\2\145";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\2\uffff";
    static final String DFA8_specialS =
        "\10\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\3\11\4\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2",
            "\1\6\11\7\13\uffff\1\2\37\uffff\1\2"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "176:26: ( '.' ( RULE_DECINT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DIGIT )";
        }
    }
    static final String DFA28_eotS =
        "\1\50\31\57\1\53\1\134\3\uffff\3\132\1\53\1\57\2\53\1\uffff\1\53\1\uffff\1\53\2\uffff\3\57\2\uffff\50\57\10\uffff\1\u009b\1\uffff\2\132\1\57\2\uffff\1\u009e\2\uffff\1\u009e\4\uffff\33\57\1\u00bf\11\57\1\uffff\4\57\1\u009b\1\uffff\1\132\3\uffff\12\57\1\u00db\13\57\1\u00eb\1\u00ec\1\u00ed\6\57\1\uffff\1\57\1\u00f8\4\57\1\u00fe\1\u0100\1\u0102\1\u0103\2\57\1\u0106\1\u0107\1\u009b\1\132\7\57\1\u0111\1\u0113\1\u0115\2\uffff\7\57\1\uffff\1\u00ed\5\57\4\uffff\3\57\1\u012a\6\57\1\uffff\4\57\4\uffff\1\57\2\uffff\1\57\1\u0138\3\uffff\7\57\6\uffff\15\57\1\u014e\2\57\1\u0152\1\u0154\1\u0156\2\uffff\1\57\1\u0158\2\57\1\uffff\1\u015b\1\u015c\1\u015d\1\u015e\1\u015f\1\uffff\1\u0160\2\uffff\11\57\1\u016b\1\u016d\3\57\4\uffff\1\57\1\u0172\2\uffff\1\u0173\1\57\6\uffff\1\u0175\1\uffff\1\u0176\1\u0177\6\uffff\11\57\4\uffff\1\u0181\2\uffff\1\u0182\6\uffff\4\57\1\u0188\4\57\2\uffff\5\57\1\uffff\3\57\1\uffff\6\57\2\uffff\1\57\1\u019c\3\57\1\uffff\1\57\1\uffff\12\57\1\u01ab\1\57\1\u01ad\1\57\1\uffff\1\57\1\uffff\1\u01b0\1\57\1\uffff\2\57\1\u01b4\1\uffff";
    static final String DFA28_eofS =
        "\u01b5\uffff";
    static final String DFA28_minS =
        "\1\0\31\57\1\60\1\135\3\uffff\3\56\1\101\1\57\2\0\1\uffff\1\42\1\uffff\1\42\2\uffff\3\57\2\uffff\50\57\10\uffff\1\60\1\uffff\2\60\1\57\2\0\1\57\2\0\1\57\4\uffff\45\57\1\uffff\4\57\1\60\1\uffff\1\60\1\0\1\uffff\1\0\37\57\1\uffff\16\57\2\55\12\57\2\uffff\7\57\1\uffff\6\57\4\uffff\12\57\1\uffff\4\57\4\uffff\1\57\2\uffff\2\57\3\uffff\7\57\6\uffff\23\57\2\uffff\4\57\1\uffff\5\57\1\uffff\1\57\2\uffff\16\57\4\uffff\2\57\2\uffff\2\57\6\uffff\1\57\1\uffff\2\57\6\uffff\11\57\4\uffff\1\57\2\uffff\1\57\6\uffff\11\57\2\uffff\5\57\1\uffff\3\57\1\uffff\6\57\2\uffff\5\57\1\uffff\1\57\1\uffff\16\57\1\uffff\1\57\1\uffff\2\57\1\uffff\3\57\1\uffff";
    static final String DFA28_maxS =
        "\1\uffff\31\172\1\133\1\135\3\uffff\3\145\2\172\2\uffff\1\uffff\1\172\1\uffff\1\47\2\uffff\3\172\2\uffff\50\172\10\uffff\1\71\1\uffff\2\71\1\172\2\uffff\1\75\2\uffff\1\75\4\uffff\45\172\1\uffff\4\172\1\71\1\uffff\1\71\1\uffff\1\uffff\1\uffff\37\172\1\uffff\16\172\1\55\1\71\12\172\2\uffff\7\172\1\uffff\6\172\4\uffff\12\172\1\uffff\4\172\4\uffff\1\172\2\uffff\2\172\3\uffff\7\172\6\uffff\23\172\2\uffff\4\172\1\uffff\5\172\1\uffff\1\172\2\uffff\16\172\4\uffff\2\172\2\uffff\2\172\6\uffff\1\172\1\uffff\2\172\6\uffff\11\172\4\uffff\1\172\2\uffff\1\172\6\uffff\11\172\2\uffff\5\172\1\uffff\3\172\1\uffff\6\172\2\uffff\5\172\1\uffff\1\172\1\uffff\16\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff";
    static final String DFA28_acceptS =
        "\34\uffff\1\113\1\114\1\116\7\uffff\1\125\1\uffff\1\126\1\uffff\1\134\1\135\3\uffff\1\130\1\124\50\uffff\1\111\1\122\1\112\1\115\1\113\1\114\1\116\1\117\1\uffff\1\121\11\uffff\1\125\1\133\1\127\1\134\45\uffff\1\110\5\uffff\1\131\2\uffff\1\132\40\uffff\1\107\32\uffff\1\56\1\102\7\uffff\1\66\6\uffff\1\72\1\106\1\105\1\120\12\uffff\1\75\4\uffff\1\54\1\77\1\55\1\100\1\uffff\1\104\1\103\2\uffff\1\76\1\101\1\123\7\uffff\1\37\1\67\1\40\1\70\1\41\1\71\23\uffff\1\44\1\73\4\uffff\1\45\5\uffff\1\57\1\uffff\1\65\1\74\16\uffff\1\35\1\36\1\33\1\34\2\uffff\1\21\1\61\2\uffff\1\23\1\62\1\24\1\63\1\25\1\64\1\uffff\1\46\2\uffff\1\47\1\50\1\51\1\52\1\53\1\60\11\uffff\1\13\1\31\1\14\1\32\1\uffff\1\17\1\20\1\uffff\1\30\1\43\1\22\1\26\1\27\1\42\11\uffff\1\16\1\15\5\uffff\1\12\3\uffff\1\11\6\uffff\1\7\1\10\5\uffff\1\6\1\uffff\1\5\16\uffff\1\4\1\uffff\1\3\2\uffff\1\2\3\uffff\1\1";
    static final String DFA28_specialS =
        "\1\3\43\uffff\1\6\1\0\100\uffff\1\4\1\2\1\uffff\1\5\1\10\62\uffff\1\1\1\uffff\1\7\u0115\uffff}>";
    static final String[] DFA28_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\53\1\44\1\46\3\53\1\45\4\53\1\34\1\32\1\53\1\47\1\37\2\40\7\41\1\35\6\53\1\17\1\14\1\43\1\20\2\43\1\3\1\21\1\15\2\43\1\30\3\43\1\1\1\43\1\2\1\22\7\43\1\33\1\53\1\36\1\42\1\43\1\53\1\23\1\24\1\4\1\10\1\43\1\7\1\31\1\43\1\5\3\43\1\16\1\25\1\43\1\6\1\43\1\26\1\11\1\12\1\13\1\27\4\43\3\53\1\51\uff81\53",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\54\20\56\1\55\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\61\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\62\5\56\1\63\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\64\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\65\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\66\20\56\1\67\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\73\3\56\1\71\6\56\1\70\5\56\1\72\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\75\17\56\1\74\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\77\16\56\1\76\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\100\1\102\10\56\1\103\6\56\1\101\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\104\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\106\15\56\1\105\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\107\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\110\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\112\3\56\1\111\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\114\15\56\1\113\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\115\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\116\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\117\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\120\11\56\1\121\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\123\15\56\1\122\3\56\1\124\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\125\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\126\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\127\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\130\13\56",
            "\12\132\41\uffff\1\131",
            "\1\133",
            "",
            "",
            "",
            "\1\142\1\uffff\12\141\10\uffff\1\140\2\uffff\1\142\34\uffff\1\140\2\uffff\1\142",
            "\1\142\1\uffff\12\143\13\uffff\1\142\37\uffff\1\142",
            "\1\142\1\uffff\12\144\13\uffff\1\142\37\uffff\1\142",
            "\32\145\4\uffff\1\145\1\uffff\32\145",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\42\147\1\150\71\147\1\146\uffa3\147",
            "\47\152\1\153\64\152\1\151\uffa3\152",
            "",
            "\1\156\4\uffff\1\156\2\uffff\1\155\26\uffff\32\50\3\uffff\2\50\1\uffff\32\50",
            "",
            "\1\156\4\uffff\1\156",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\160\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\161\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\162\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\163\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\164\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\165\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\166\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\167\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\170\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\171\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\172\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\173\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\174\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\175\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\176\24\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\177\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0080\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0081\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0082\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0083\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0084\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0085\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0086\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0087\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0088\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0089\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u008a\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u008b\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u008c\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u008d\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u008e\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u008f\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0090\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u0091\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0092\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0093\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0094\15\56",
            "\1\50\12\56\1\u0095\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0096\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0097\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0098\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0099\31\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u009a",
            "",
            "\12\u009c",
            "\12\144",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\0\u009d",
            "\42\147\1\150\71\147\1\146\uffa3\147",
            "\1\156\15\uffff\1\60",
            "\0\u009f",
            "\47\152\1\153\64\152\1\151\uffa3\152",
            "\1\156\15\uffff\1\60",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a0\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00a1\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00a2\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00a3\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u00a4\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00a5\14\56",
            "\1\50\1\56\1\u00a7\1\56\1\u00a8\2\56\1\u00a9\1\56\1\u00aa\1\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a6\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ab\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00ac\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00ad\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00ae\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00af\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00b0\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b1\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00b2\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00b3\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u00b4\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b5\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b6\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b7\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b8\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00b9\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00ba\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00bb\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00bc\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u00bd\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00be\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00c0\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c1\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00c2\26\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00c3\13\56\1\u00c4\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00c5\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00c6\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c7\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c8\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c9\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00ca\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00cb\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00cc\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00cd\16\56",
            "\12\u00ce",
            "",
            "\12\u00cf",
            "\42\147\1\150\71\147\1\146\uffa3\147",
            "",
            "\47\152\1\153\64\152\1\151\uffa3\152",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00d0\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00d1\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00d2\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00d3\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00d4\22\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00d5\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00d6\10\56",
            "\1\50\6\56\1\u00d7\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u00d8\7\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u00d9\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u00da\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u00dc\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00dd\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00de\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u00df\30\56",
            "\1\50\12\56\1\u00e3\2\uffff\1\60\3\uffff\1\u00e2\16\56\1\u00e0\2\56\1\u00e1\7\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00e4\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00e5\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00e6\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00e7\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00e8\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00e9\31\56",
            "\1\50\12\56\1\u00ea\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\1\56\1\u00ee\1\56\1\u00ef\2\56\1\u00f0\1\56\1\u00f1\1\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f2\25\56",
            "\1\50\6\56\1\u00f3\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u00f4\23\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u00f5\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u00f6\1\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u00f7\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00f9\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00fa\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u00fb\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u00fc\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u00fd\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u00ff\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0101\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0104\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0105\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0108",
            "\1\u0108\2\uffff\12\144",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0109\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u010a\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u010b\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u010c\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u010d\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u010e\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u010f\24\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0110\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0112\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0114\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0116\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0117\7\56",
            "\1\50\3\56\1\u0118\2\56\1\u0119\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u011a\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u011b\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\2\56\1\u011d\17\56\1\u011e\7\56\4\uffff\1\56\1\uffff\24\56\1\u011c\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\2\56\1\u011f\17\56\1\u0120\7\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0121\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0122\16\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0123\23\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0124\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u0125\26\56",
            "",
            "",
            "",
            "",
            "\1\50\6\56\1\u0126\3\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\2\56\1\u0127\7\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u0128\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0129\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u012b\31\56",
            "\1\50\4\56\1\u012c\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u012d\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u012e\23\56",
            "\1\50\12\56\1\u012f\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0130\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0131\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0132\23\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0133\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0134\14\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\1\u0135\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0136\6\56",
            "\1\50\12\56\1\u0137\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0139\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u013a\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\25\56\1\u013b\4\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u013c\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u013d\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u013e\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u013f\31\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0140\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0141\7\56",
            "\1\50\2\56\1\u0142\7\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\4\56\1\u0143\5\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0144\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0145\30\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u0146\30\56",
            "\1\50\12\56\1\u0147\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0148\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0149\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u014a\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u014b\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u014c\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u014d\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u014f\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0150\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0151\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0153\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u0155\3\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0157\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0159\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u015a\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0161\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u0162\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0163\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0164\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0165\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u0166\21\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0167\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0168\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0169\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u016a\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\1\u016c\3\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u016e\17\56",
            "\1\50\12\56\1\u016f\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0170\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0171\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0174\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0178\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0179\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\15\56\1\u017a\14\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u017b\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017c\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\u017d\13\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u017e\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u017f\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0180\7\56",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\1\u0184\21\56\1\u0183\7\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0185\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u0186\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0187\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0189\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u018a\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u018b\7\56",
            "\1\50\12\56\1\u018c\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u018d\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u018e\14\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u018f\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u0190\15\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0191\7\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0192\7\56",
            "\1\50\12\56\1\u0193\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\1\u0194\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u0195\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\30\56\1\u0196\1\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0197\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0198\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u0199\12\56",
            "\1\50\12\56\1\u019a\2\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u019b\5\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u019d\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u019e\7\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u019f\31\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01a0\27\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01a1\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\17\56\1\u01a2\12\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01a3\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u01a4\6\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01a5\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\u01a6\31\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a7\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\14\56\1\u01a8\15\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01a9\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u01aa\27\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01ac\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01ae\25\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\14\56\1\u01af\15\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\1\56\1\u01b1\30\56",
            "",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u01b2\25\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u01b3\10\56",
            "\1\50\12\56\3\uffff\1\60\3\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ParameterStructMember | RelativeNamespace | PrivateNamespace | GlobalNamespace | ParameterAny | Connections | Interfaces | Parameters | Processes | GraphName | Float32_1 | Float64_1 | Duration | Feedback | FromPub | FromSub | String_2 | Threads | Uint16_1 | Uint32_1 | Uint64_1 | Boolean | Integer | Default | Float32 | Float64 | FromAC | FromAS | FromSC | FromSS | Int16_1 | Int32_1 | Int64_1 | Message | Service | Uint8_1 | Array | Base64 | Double | Header | String | Struct | Action | Bool_1 | Byte_1 | Int8_1 | Nodes | Result | String_1 | Uint16 | Uint32 | Uint64 | Value_1 | From | Int16 | Int32 | Int64 | Type_1 | Uint8 | Value | Date | List | Bool | Byte | Goal | Int8 | Name | Node | Time | Type | Any | Ns | HyphenMinusLeftSquareBracket | LeftSquareBracketRightSquareBracket | Comma | Colon | LeftSquareBracket | RightSquareBracket | RULE_BINARY | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_DATE_TIME | RULE_MESSAGE_ASIGMENT | RULE_SL_COMMENT | RULE_ROS_CONVENTION_A | RULE_ROS_CONVENTION_PARAM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_37 = input.LA(1);

                        s = -1;
                        if ( (LA28_37=='\\') ) {s = 105;}

                        else if ( ((LA28_37>='\u0000' && LA28_37<='&')||(LA28_37>='(' && LA28_37<='[')||(LA28_37>=']' && LA28_37<='\uFFFF')) ) {s = 106;}

                        else if ( (LA28_37=='\'') ) {s = 107;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_157 = input.LA(1);

                        s = -1;
                        if ( (LA28_157=='\"') ) {s = 104;}

                        else if ( (LA28_157=='\\') ) {s = 102;}

                        else if ( ((LA28_157>='\u0000' && LA28_157<='!')||(LA28_157>='#' && LA28_157<='[')||(LA28_157>=']' && LA28_157<='\uFFFF')) ) {s = 103;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_103 = input.LA(1);

                        s = -1;
                        if ( (LA28_103=='\"') ) {s = 104;}

                        else if ( (LA28_103=='\\') ) {s = 102;}

                        else if ( ((LA28_103>='\u0000' && LA28_103<='!')||(LA28_103>='#' && LA28_103<='[')||(LA28_103>=']' && LA28_103<='\uFFFF')) ) {s = 103;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_0 = input.LA(1);

                        s = -1;
                        if ( (LA28_0=='P') ) {s = 1;}

                        else if ( (LA28_0=='R') ) {s = 2;}

                        else if ( (LA28_0=='G') ) {s = 3;}

                        else if ( (LA28_0=='c') ) {s = 4;}

                        else if ( (LA28_0=='i') ) {s = 5;}

                        else if ( (LA28_0=='p') ) {s = 6;}

                        else if ( (LA28_0=='f') ) {s = 7;}

                        else if ( (LA28_0=='d') ) {s = 8;}

                        else if ( (LA28_0=='s') ) {s = 9;}

                        else if ( (LA28_0=='t') ) {s = 10;}

                        else if ( (LA28_0=='u') ) {s = 11;}

                        else if ( (LA28_0=='B') ) {s = 12;}

                        else if ( (LA28_0=='I') ) {s = 13;}

                        else if ( (LA28_0=='m') ) {s = 14;}

                        else if ( (LA28_0=='A') ) {s = 15;}

                        else if ( (LA28_0=='D') ) {s = 16;}

                        else if ( (LA28_0=='H') ) {s = 17;}

                        else if ( (LA28_0=='S') ) {s = 18;}

                        else if ( (LA28_0=='a') ) {s = 19;}

                        else if ( (LA28_0=='b') ) {s = 20;}

                        else if ( (LA28_0=='n') ) {s = 21;}

                        else if ( (LA28_0=='r') ) {s = 22;}

                        else if ( (LA28_0=='v') ) {s = 23;}

                        else if ( (LA28_0=='L') ) {s = 24;}

                        else if ( (LA28_0=='g') ) {s = 25;}

                        else if ( (LA28_0=='-') ) {s = 26;}

                        else if ( (LA28_0=='[') ) {s = 27;}

                        else if ( (LA28_0==',') ) {s = 28;}

                        else if ( (LA28_0==':') ) {s = 29;}

                        else if ( (LA28_0==']') ) {s = 30;}

                        else if ( (LA28_0=='0') ) {s = 31;}

                        else if ( ((LA28_0>='1' && LA28_0<='2')) ) {s = 32;}

                        else if ( ((LA28_0>='3' && LA28_0<='9')) ) {s = 33;}

                        else if ( (LA28_0=='^') ) {s = 34;}

                        else if ( (LA28_0=='C'||(LA28_0>='E' && LA28_0<='F')||(LA28_0>='J' && LA28_0<='K')||(LA28_0>='M' && LA28_0<='O')||LA28_0=='Q'||(LA28_0>='T' && LA28_0<='Z')||LA28_0=='_'||LA28_0=='e'||LA28_0=='h'||(LA28_0>='j' && LA28_0<='l')||LA28_0=='o'||LA28_0=='q'||(LA28_0>='w' && LA28_0<='z')) ) {s = 35;}

                        else if ( (LA28_0=='\"') ) {s = 36;}

                        else if ( (LA28_0=='\'') ) {s = 37;}

                        else if ( (LA28_0=='#') ) {s = 38;}

                        else if ( (LA28_0=='/') ) {s = 39;}

                        else if ( (LA28_0=='~') ) {s = 41;}

                        else if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {s = 42;}

                        else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='\u001F')||LA28_0=='!'||(LA28_0>='$' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='+')||LA28_0=='.'||(LA28_0>=';' && LA28_0<='@')||LA28_0=='\\'||LA28_0=='`'||(LA28_0>='{' && LA28_0<='}')||(LA28_0>='\u007F' && LA28_0<='\uFFFF')) ) {s = 43;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_102 = input.LA(1);

                        s = -1;
                        if ( ((LA28_102>='\u0000' && LA28_102<='\uFFFF')) ) {s = 157;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA28_105 = input.LA(1);

                        s = -1;
                        if ( ((LA28_105>='\u0000' && LA28_105<='\uFFFF')) ) {s = 159;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA28_36 = input.LA(1);

                        s = -1;
                        if ( (LA28_36=='\\') ) {s = 102;}

                        else if ( ((LA28_36>='\u0000' && LA28_36<='!')||(LA28_36>='#' && LA28_36<='[')||(LA28_36>=']' && LA28_36<='\uFFFF')) ) {s = 103;}

                        else if ( (LA28_36=='\"') ) {s = 104;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA28_159 = input.LA(1);

                        s = -1;
                        if ( (LA28_159=='\'') ) {s = 107;}

                        else if ( (LA28_159=='\\') ) {s = 105;}

                        else if ( ((LA28_159>='\u0000' && LA28_159<='&')||(LA28_159>='(' && LA28_159<='[')||(LA28_159>=']' && LA28_159<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA28_106 = input.LA(1);

                        s = -1;
                        if ( (LA28_106=='\'') ) {s = 107;}

                        else if ( (LA28_106=='\\') ) {s = 105;}

                        else if ( ((LA28_106>='\u0000' && LA28_106<='&')||(LA28_106>='(' && LA28_106<='[')||(LA28_106>=']' && LA28_106<='\uFFFF')) ) {s = 106;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}