/*
 * generated by Xtext 2.25.0
 */
lexer grammar InternalRosSystemLexer;

@header {
package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

ParameterStructMember : 'ParameterStructMember';

ExternalDependency : 'ExternalDependency';

RelativeNamespace : 'RelativeNamespace';

PrivateNamespace : 'PrivateNamespace';

GlobalNamespace : 'GlobalNamespace';

Serviceclient : 'serviceclient:';

Serviceserver : 'serviceserver:';

Actionclient : 'actionclient:';

Actionserver : 'actionserver:';

Dependencies : 'dependencies:';

AmentPackage : 'AmentPackage';

ParameterAny : 'ParameterAny';

Connections : 'connections:';

FromGitRepo : 'fromGitRepo:';

Subscribers : 'subscribers:';

Interfaces : 'interfaces:';

Parameters_1 : 'parameters:';

Publishers : 'publishers:';

Parameters : 'Parameters';

Artifacts : 'artifacts:';

Processes : 'processes:';

GraphName : 'GraphName';

Feedback_1 : 'feedback:';

Float32_1 : 'float32[]';

Float64_1 : 'float64[]';

Response : 'response:';

Duration : 'duration';

Feedback : 'feedback';

FromPub : 'fromPub:';

FromSub : 'fromSub:';

Message_1 : 'message:';

Request : 'request:';

String_2 : 'string[]';

Threads : 'threads:';

Uint16_1 : 'uint16[]';

Uint32_1 : 'uint32[]';

Uint64_1 : 'uint64[]';

Boolean : 'Boolean';

Integer : 'Integer';

Action_1 : 'action:';

Default : 'default';

Float32 : 'float32';

Float64 : 'float64';

Int16_1 : 'int16[]';

Int32_1 : 'int32[]';

Int64_1 : 'int64[]';

Message : 'message';

Result_1 : 'result:';

Service : 'service';

Uint8_1 : 'uint8[]';

Array : 'Array:';

Base64 : 'Base64';

Double : 'Double';

Header : 'Header';

String : 'String';

Struct : 'Struct';

Action : 'action';

Bool_1 : 'bool[]';

Byte_1 : 'byte[]';

Int8_1 : 'int8[]';

Nodes : 'nodes:';

Result : 'result';

Specs : 'specs:';

String_1 : 'string';

Uint16 : 'uint16';

Uint32 : 'uint32';

Uint64 : 'uint64';

From : 'from:';

Goal_1 : 'goal:';

Int16 : 'int16';

Int32 : 'int32';

Int64 : 'int64';

Node_1 : 'node:';

Type_1 : 'type:';

Uint8 : 'uint8';

Value : 'value';

Date : 'Date';

List : 'List';

Bool : 'bool';

Byte : 'byte';

Goal : 'goal';

Int8 : 'int8';

Msg : 'msg:';

Name : 'name';

Node : 'node';

Srv : 'srv:';

Time : 'time';

Type : 'type';

Any : 'Any';

Ns : 'ns:';

HyphenMinusLeftSquareBracket : '-[';

LeftSquareBracketRightSquareBracket : '[]';

Comma : ',';

Colon : ':';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_SL_COMMENT : '#' ~(('\n'|'\r'))*;

RULE_ROS_CONVENTION_A : ('/' RULE_ID|RULE_ID '/')*;

RULE_ROS_CONVENTION_PARAM : ('/' RULE_STRING|RULE_STRING '/'|'~' RULE_STRING)*;

fragment RULE_DIGIT : '0'..'9';

RULE_BINARY : ('0b'|'0B') ('0'|'1')+;

RULE_BOOLEAN : ('true'|'false');

RULE_DOUBLE : RULE_DIGIT ('.' RULE_DECINT*|('.' RULE_DIGIT*)? ('E'|'e') ('-'|'+')? RULE_DIGIT);

RULE_DECINT : ('0'|'1'..'9' RULE_DIGIT*|'-' '0'..'9' RULE_DIGIT*);

fragment RULE_DAY : ('1'..'9'|'1'..'3' '0'..'9');

fragment RULE_MONTH : ('1'..'9'|'1' '0'..'2');

fragment RULE_YEAR : '0'..'2' '0'..'9' '0'..'9' '0'..'9';

fragment RULE_HOUR : ('0'..'1' '0'..'9'|'2' '0'..'3');

fragment RULE_MIN_SEC : '0'..'5' '0'..'9';

RULE_DATE_TIME : RULE_YEAR '-' RULE_MONTH '-' RULE_DAY 'T' RULE_HOUR ':' RULE_MIN_SEC ':' RULE_MIN_SEC;

RULE_MESSAGE_ASIGMENT : (RULE_ID|RULE_STRING) '=' (RULE_ID|RULE_STRING|RULE_INT|'-' RULE_INT);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
