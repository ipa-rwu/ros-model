package de.fraunhofer.ipa.componentInterface.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentInterfaceLexer extends Lexer {
    public static final int RULE_HEX=14;
    public static final int RULE_SIGN=10;
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=18;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=8;
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

    public InternalComponentInterfaceLexer() {;} 
    public InternalComponentInterfaceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalComponentInterfaceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalComponentInterface.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:11:7: ( 'ComponentInterface' )
            // InternalComponentInterface.g:11:9: 'ComponentInterface'
            {
            match("ComponentInterface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:12:7: ( '{' )
            // InternalComponentInterface.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:13:7: ( 'name' )
            // InternalComponentInterface.g:13:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:14:7: ( 'NameSpace' )
            // InternalComponentInterface.g:14:9: 'NameSpace'
            {
            match("NameSpace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:15:7: ( 'RosPublishers' )
            // InternalComponentInterface.g:15:9: 'RosPublishers'
            {
            match("RosPublishers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:16:7: ( ',' )
            // InternalComponentInterface.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:17:7: ( '}' )
            // InternalComponentInterface.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:18:7: ( 'RosSubscribers' )
            // InternalComponentInterface.g:18:9: 'RosSubscribers'
            {
            match("RosSubscribers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:19:7: ( 'RosSrvServers' )
            // InternalComponentInterface.g:19:9: 'RosSrvServers'
            {
            match("RosSrvServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:20:7: ( 'RosSrvClients' )
            // InternalComponentInterface.g:20:9: 'RosSrvClients'
            {
            match("RosSrvClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:21:7: ( 'RosActionServers' )
            // InternalComponentInterface.g:21:9: 'RosActionServers'
            {
            match("RosActionServers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:22:7: ( 'RosActionClients' )
            // InternalComponentInterface.g:22:9: 'RosActionClients'
            {
            match("RosActionClients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:23:7: ( 'RosParameters' )
            // InternalComponentInterface.g:23:9: 'RosParameters'
            {
            match("RosParameters"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:24:7: ( 'RosPublisher' )
            // InternalComponentInterface.g:24:9: 'RosPublisher'
            {
            match("RosPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:25:7: ( 'ns' )
            // InternalComponentInterface.g:25:9: 'ns'
            {
            match("ns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:26:7: ( 'RefPublisher' )
            // InternalComponentInterface.g:26:9: 'RefPublisher'
            {
            match("RefPublisher"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:27:7: ( 'RosSubscriber' )
            // InternalComponentInterface.g:27:9: 'RosSubscriber'
            {
            match("RosSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:28:7: ( 'RefSubscriber' )
            // InternalComponentInterface.g:28:9: 'RefSubscriber'
            {
            match("RefSubscriber"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:29:7: ( 'RosServiceServer' )
            // InternalComponentInterface.g:29:9: 'RosServiceServer'
            {
            match("RosServiceServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:30:7: ( 'RefServer' )
            // InternalComponentInterface.g:30:9: 'RefServer'
            {
            match("RefServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:31:7: ( 'RosServiceClient' )
            // InternalComponentInterface.g:31:9: 'RosServiceClient'
            {
            match("RosServiceClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:32:7: ( 'RefClient' )
            // InternalComponentInterface.g:32:9: 'RefClient'
            {
            match("RefClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:33:7: ( 'RosActionServer' )
            // InternalComponentInterface.g:33:9: 'RosActionServer'
            {
            match("RosActionServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:34:7: ( 'RosActionClient' )
            // InternalComponentInterface.g:34:9: 'RosActionClient'
            {
            match("RosActionClient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:35:7: ( 'RosParameter' )
            // InternalComponentInterface.g:35:9: 'RosParameter'
            {
            match("RosParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:36:7: ( 'RefParameter' )
            // InternalComponentInterface.g:36:9: 'RefParameter'
            {
            match("RefParameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:37:7: ( 'value' )
            // InternalComponentInterface.g:37:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1479:14: ( ( 'true' | 'false' ) )
            // InternalComponentInterface.g:1479:16: ( 'true' | 'false' )
            {
            // InternalComponentInterface.g:1479:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentInterface.g:1479:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1479:24: 'false'
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalComponentInterface.g:1481:21: ( '0' .. '9' )
            // InternalComponentInterface.g:1481:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1483:13: ( RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT ) )
            // InternalComponentInterface.g:1483:15: RULE_DECINT ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            {
            mRULE_DECINT(); 
            // InternalComponentInterface.g:1483:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalComponentInterface.g:1483:28: '.' ( RULE_DIGIT )*
                    {
                    match('.'); 
                    // InternalComponentInterface.g:1483:32: ( RULE_DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1483:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1483:44: ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT
                    {
                    // InternalComponentInterface.g:1483:44: ( '.' ( RULE_DIGIT )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalComponentInterface.g:1483:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalComponentInterface.g:1483:49: ( RULE_DIGIT )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalComponentInterface.g:1483:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
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

                    // InternalComponentInterface.g:1483:73: ( '-' | '+' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalComponentInterface.g:
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

                    mRULE_DECINT(); 

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
            // InternalComponentInterface.g:1485:13: ( ( '0' | '1' .. '9' ( RULE_DIGIT )* ) )
            // InternalComponentInterface.g:1485:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            {
            // InternalComponentInterface.g:1485:15: ( '0' | '1' .. '9' ( RULE_DIGIT )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='0') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentInterface.g:1485:16: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1485:20: '1' .. '9' ( RULE_DIGIT )*
                    {
                    matchRange('1','9'); 
                    // InternalComponentInterface.g:1485:29: ( RULE_DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1485:29: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            // InternalComponentInterface.g:1487:20: ( ( '+' | '-' ) )
            // InternalComponentInterface.g:1487:22: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_SIGNED_INT"
    public final void mRULE_SIGNED_INT() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1489:17: ( ( '-' )* ( RULE_INT )* )
            // InternalComponentInterface.g:1489:19: ( '-' )* ( RULE_INT )*
            {
            // InternalComponentInterface.g:1489:19: ( '-' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='-') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentInterface.g:1489:19: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalComponentInterface.g:1489:24: ( RULE_INT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentInterface.g:1489:24: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalComponentInterface.g:1491:25: ( ( RULE_DIGIT | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalComponentInterface.g:1491:27: ( RULE_DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1493:10: ( '0x' ( RULE_HEX_DIGIT )* )
            // InternalComponentInterface.g:1493:12: '0x' ( RULE_HEX_DIGIT )*
            {
            match("0x"); 

            // InternalComponentInterface.g:1493:17: ( RULE_HEX_DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||(LA11_0>='a' && LA11_0<='f')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentInterface.g:1493:17: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_BINARY_DIGIT"
    public final void mRULE_BINARY_DIGIT() throws RecognitionException {
        try {
            // InternalComponentInterface.g:1495:28: ( ( '0' | '1' ) )
            // InternalComponentInterface.g:1495:30: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_DIGIT"

    // $ANTLR start "RULE_BINARY"
    public final void mRULE_BINARY() throws RecognitionException {
        try {
            int _type = RULE_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1497:13: ( '0b' ( RULE_BINARY_DIGIT ( '_' )* )* )
            // InternalComponentInterface.g:1497:15: '0b' ( RULE_BINARY_DIGIT ( '_' )* )*
            {
            match("0b"); 

            // InternalComponentInterface.g:1497:20: ( RULE_BINARY_DIGIT ( '_' )* )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='1')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentInterface.g:1497:21: RULE_BINARY_DIGIT ( '_' )*
            	    {
            	    mRULE_BINARY_DIGIT(); 
            	    // InternalComponentInterface.g:1497:39: ( '_' )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0=='_') ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalComponentInterface.g:1497:39: '_'
            	    	    {
            	    	    match('_'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1499:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalComponentInterface.g:1499:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalComponentInterface.g:1499:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentInterface.g:1499:11: '^'
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

            // InternalComponentInterface.g:1499:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalComponentInterface.g:
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
            	    break loop15;
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
            // InternalComponentInterface.g:1501:19: ( ( '0' .. '9' )+ )
            // InternalComponentInterface.g:1501:21: ( '0' .. '9' )+
            {
            // InternalComponentInterface.g:1501:21: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalComponentInterface.g:1501:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

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
            // InternalComponentInterface.g:1503:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalComponentInterface.g:1503:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalComponentInterface.g:1503:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentInterface.g:1503:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalComponentInterface.g:1503:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1503:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComponentInterface.g:1503:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalComponentInterface.g:1503:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalComponentInterface.g:1503:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalComponentInterface.g:1503:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalComponentInterface.g:1503:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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
            // InternalComponentInterface.g:1505:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalComponentInterface.g:1505:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalComponentInterface.g:1505:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentInterface.g:1505:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1507:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalComponentInterface.g:1507:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalComponentInterface.g:1507:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentInterface.g:1507:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // InternalComponentInterface.g:1507:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentInterface.g:1507:41: ( '\\r' )? '\\n'
                    {
                    // InternalComponentInterface.g:1507:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalComponentInterface.g:1507:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalComponentInterface.g:1509:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalComponentInterface.g:1509:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalComponentInterface.g:1509:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalComponentInterface.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // InternalComponentInterface.g:1511:16: ( . )
            // InternalComponentInterface.g:1511:18: .
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
        // InternalComponentInterface.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_SIGNED_INT | RULE_HEX | RULE_BINARY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=39;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // InternalComponentInterface.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalComponentInterface.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalComponentInterface.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalComponentInterface.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalComponentInterface.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalComponentInterface.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalComponentInterface.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalComponentInterface.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalComponentInterface.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalComponentInterface.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalComponentInterface.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalComponentInterface.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalComponentInterface.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalComponentInterface.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalComponentInterface.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // InternalComponentInterface.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // InternalComponentInterface.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // InternalComponentInterface.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // InternalComponentInterface.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // InternalComponentInterface.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // InternalComponentInterface.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // InternalComponentInterface.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // InternalComponentInterface.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // InternalComponentInterface.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // InternalComponentInterface.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // InternalComponentInterface.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // InternalComponentInterface.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // InternalComponentInterface.g:1:172: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 29 :
                // InternalComponentInterface.g:1:185: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 30 :
                // InternalComponentInterface.g:1:197: RULE_DECINT
                {
                mRULE_DECINT(); 

                }
                break;
            case 31 :
                // InternalComponentInterface.g:1:209: RULE_SIGNED_INT
                {
                mRULE_SIGNED_INT(); 

                }
                break;
            case 32 :
                // InternalComponentInterface.g:1:225: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 33 :
                // InternalComponentInterface.g:1:234: RULE_BINARY
                {
                mRULE_BINARY(); 

                }
                break;
            case 34 :
                // InternalComponentInterface.g:1:246: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // InternalComponentInterface.g:1:254: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 36 :
                // InternalComponentInterface.g:1:266: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 37 :
                // InternalComponentInterface.g:1:282: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 38 :
                // InternalComponentInterface.g:1:298: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 39 :
                // InternalComponentInterface.g:1:306: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA6_eotS =
        "\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\2\145\1\uffff\1\145\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA6_specialS =
        "\5\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1483:27: ( '.' ( RULE_DIGIT )* | ( '.' ( RULE_DIGIT )* )? ( 'E' | 'e' ) ( '-' | '+' )? RULE_DECINT )";
        }
    }
    static final String DFA25_eotS =
        "\1\16\1\27\1\uffff\3\27\2\uffff\3\27\2\45\2\uffff\1\25\1\uffff\3\25\2\uffff\1\27\2\uffff\1\27\1\56\3\27\2\uffff\3\27\4\uffff\1\45\4\uffff\2\27\1\uffff\7\27\1\102\10\27\1\120\2\27\1\uffff\14\27\1\137\1\uffff\1\120\15\27\1\uffff\35\27\1\u008b\12\27\1\u0097\1\u0098\1\27\1\uffff\13\27\2\uffff\16\27\1\u00b5\1\u00b7\7\27\1\u00bf\1\u00c0\2\27\1\u00c3\1\uffff\1\u00c4\1\uffff\1\u00c6\1\u00c7\1\u00c8\4\27\2\uffff\1\u00cd\1\27\2\uffff\1\u00cf\3\uffff\4\27\1\uffff\1\27\1\uffff\2\27\1\u00d8\1\u00da\1\27\1\u00dc\1\u00dd\1\u00de\1\uffff\1\u00df\1\uffff\1\27\4\uffff\1\u00e1\1\uffff";
    static final String DFA25_eofS =
        "\u00e2\uffff";
    static final String DFA25_minS =
        "\1\0\1\157\1\uffff\2\141\1\145\2\uffff\1\141\1\162\1\141\2\56\2\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\155\2\uffff\1\155\1\60\1\155\1\163\1\146\2\uffff\1\154\1\165\1\154\4\uffff\1\56\4\uffff\1\160\1\145\1\uffff\1\145\1\101\1\103\1\165\1\145\1\163\1\157\1\60\1\123\1\141\1\145\1\143\1\141\1\145\1\154\1\145\1\60\1\145\1\156\1\uffff\1\160\1\142\1\162\1\142\1\166\1\162\1\164\1\142\1\162\1\142\1\162\1\151\1\60\1\uffff\1\60\1\145\1\141\1\154\1\141\1\163\1\103\1\166\1\151\1\154\1\141\1\163\1\166\1\145\1\uffff\1\156\1\143\1\151\1\155\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\143\1\145\1\156\1\164\1\145\1\163\1\145\2\162\1\151\1\143\1\156\1\163\1\145\2\162\1\164\1\111\1\60\1\150\1\164\1\151\1\166\2\145\1\103\1\150\1\164\1\151\2\60\1\156\1\uffff\2\145\1\142\1\145\1\156\1\103\1\145\1\154\2\145\1\142\2\uffff\1\164\2\162\1\145\1\162\1\164\1\145\1\154\1\162\1\151\2\162\2\145\2\60\1\162\2\163\1\162\1\151\1\166\1\145\2\60\2\162\1\60\1\uffff\1\60\1\uffff\3\60\1\166\2\145\1\156\2\uffff\1\60\1\146\2\uffff\1\60\3\uffff\1\145\1\156\1\162\1\164\1\uffff\1\141\1\uffff\1\162\1\164\2\60\1\143\3\60\1\uffff\1\60\1\uffff\1\145\4\uffff\1\60\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\157\1\uffff\1\163\1\141\1\157\2\uffff\1\141\1\162\1\141\1\170\1\145\2\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\155\2\uffff\1\155\1\172\1\155\1\163\1\146\2\uffff\1\154\1\165\1\154\4\uffff\1\145\4\uffff\1\160\1\145\1\uffff\1\145\2\123\1\165\1\145\1\163\1\157\1\172\1\123\2\165\1\143\2\165\1\154\1\145\1\172\1\145\1\156\1\uffff\1\160\1\142\1\162\1\142\1\166\1\162\1\164\1\142\1\162\1\142\1\162\1\151\1\172\1\uffff\1\172\1\145\1\141\1\154\1\141\1\163\1\123\1\166\1\151\1\154\1\141\1\163\1\166\1\145\1\uffff\1\156\1\143\1\151\1\155\1\143\1\145\1\154\1\151\1\157\1\151\1\155\1\143\1\145\1\156\1\164\1\145\1\163\1\145\2\162\1\151\1\143\1\156\1\163\1\145\2\162\1\164\1\111\1\172\1\150\1\164\1\151\1\166\2\145\1\123\1\150\1\164\1\151\2\172\1\156\1\uffff\2\145\1\142\1\145\1\156\1\123\1\145\1\154\2\145\1\142\2\uffff\1\164\2\162\1\145\1\162\1\164\1\145\1\154\1\162\1\151\2\162\2\145\2\172\1\162\2\163\1\162\1\151\1\166\1\145\2\172\2\162\1\172\1\uffff\1\172\1\uffff\3\172\1\166\2\145\1\156\2\uffff\1\172\1\146\2\uffff\1\172\3\uffff\1\145\1\156\1\162\1\164\1\uffff\1\141\1\uffff\1\162\1\164\2\172\1\143\3\172\1\uffff\1\172\1\uffff\1\145\4\uffff\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\1\7\5\uffff\2\37\1\uffff\1\42\3\uffff\1\46\1\47\1\uffff\1\42\1\2\5\uffff\1\6\1\7\3\uffff\1\40\1\41\1\36\1\35\1\uffff\1\43\1\44\1\45\1\46\2\uffff\1\17\23\uffff\1\3\15\uffff\1\34\16\uffff\1\33\53\uffff\1\4\13\uffff\1\24\1\26\34\uffff\1\16\1\uffff\1\31\7\uffff\1\20\1\32\2\uffff\1\5\1\15\1\uffff\1\21\1\11\1\12\4\uffff\1\22\1\uffff\1\10\10\uffff\1\27\1\uffff\1\30\1\uffff\1\23\1\25\1\13\1\14\1\uffff\1\1";
    static final String DFA25_specialS =
        "\1\0\20\uffff\1\1\1\2\u00cf\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\4\25\1\6\1\15\1\25\1\23\1\13\11\14\7\25\2\20\1\1\12\20\1\4\3\20\1\5\10\20\3\25\1\17\1\20\1\25\5\20\1\12\7\20\1\3\5\20\1\11\1\20\1\10\4\20\1\2\1\25\1\7\uff82\25",
            "\1\26",
            "",
            "\1\31\21\uffff\1\32",
            "\1\33",
            "\1\35\11\uffff\1\34",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\46\1\uffff\12\16\13\uffff\1\46\34\uffff\1\44\2\uffff\1\46\22\uffff\1\43",
            "\1\46\1\uffff\12\47\13\uffff\1\46\37\uffff\1\46",
            "",
            "",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\50",
            "\0\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "\1\54",
            "",
            "",
            "\1\55",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\46\1\uffff\12\47\13\uffff\1\46\37\uffff\1\46",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "",
            "\1\67",
            "\1\72\16\uffff\1\70\2\uffff\1\71",
            "\1\75\14\uffff\1\73\2\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\103",
            "\1\105\23\uffff\1\104",
            "\1\110\14\uffff\1\107\2\uffff\1\106",
            "\1\111",
            "\1\113\23\uffff\1\112",
            "\1\115\17\uffff\1\114",
            "\1\116",
            "\1\117",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\146\17\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0093\17\uffff\1\u0092",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\17\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00b4\7\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00b6\7\27",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c1",
            "\1\u00c2",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00c5\7\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\u00ce",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00d7\7\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\22\27\1\u00d9\7\27",
            "\1\u00db",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\u00e0",
            "",
            "",
            "",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_BOOLEAN | RULE_DOUBLE | RULE_DECINT | RULE_SIGNED_INT | RULE_HEX | RULE_BINARY | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='C') ) {s = 1;}

                        else if ( (LA25_0=='{') ) {s = 2;}

                        else if ( (LA25_0=='n') ) {s = 3;}

                        else if ( (LA25_0=='N') ) {s = 4;}

                        else if ( (LA25_0=='R') ) {s = 5;}

                        else if ( (LA25_0==',') ) {s = 6;}

                        else if ( (LA25_0=='}') ) {s = 7;}

                        else if ( (LA25_0=='v') ) {s = 8;}

                        else if ( (LA25_0=='t') ) {s = 9;}

                        else if ( (LA25_0=='f') ) {s = 10;}

                        else if ( (LA25_0=='0') ) {s = 11;}

                        else if ( ((LA25_0>='1' && LA25_0<='9')) ) {s = 12;}

                        else if ( (LA25_0=='-') ) {s = 13;}

                        else if ( (LA25_0=='^') ) {s = 15;}

                        else if ( ((LA25_0>='A' && LA25_0<='B')||(LA25_0>='D' && LA25_0<='M')||(LA25_0>='O' && LA25_0<='Q')||(LA25_0>='S' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='e')||(LA25_0>='g' && LA25_0<='m')||(LA25_0>='o' && LA25_0<='s')||LA25_0=='u'||(LA25_0>='w' && LA25_0<='z')) ) {s = 16;}

                        else if ( (LA25_0=='\"') ) {s = 17;}

                        else if ( (LA25_0=='\'') ) {s = 18;}

                        else if ( (LA25_0=='/') ) {s = 19;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 20;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='#' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='+')||LA25_0=='.'||(LA25_0>=':' && LA25_0<='@')||(LA25_0>='[' && LA25_0<=']')||LA25_0=='`'||LA25_0=='|'||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 21;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_17 = input.LA(1);

                        s = -1;
                        if ( ((LA25_17>='\u0000' && LA25_17<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_18 = input.LA(1);

                        s = -1;
                        if ( ((LA25_18>='\u0000' && LA25_18<='\uFFFF')) ) {s = 40;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}