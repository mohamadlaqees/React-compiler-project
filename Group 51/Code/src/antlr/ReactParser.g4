parser grammar ReactParser;

options { tokenVocab=ReactLexer; }

program:
(statement)+ EOF;

statement:
component
| callComponent
| assignment
| ifStatement
| forStatement
| functionCall
| function
| timeFunction
| array
| object
| htmlTag
| hooks;

component:
COMPONENT LPAREN STRING
(COMMA (LBRACE ((IDENTIFIER) COMMA)* (IDENTIFIER) RBRACE))?
RPAREN LBRACE (statement)* jsx RBRACE;

callComponent:
COMPONENT LPAREN STRING
(COMMA ((LBRACE ((IDENTIFIER | componentAttribute) COMMA)* (IDENTIFIER | componentAttribute) RBRACE) | (componentAttribute)*))?
RPAREN;

assignment:
IDENTIFIER EQUALS expression;

componentAttribute:
IDENTIFIER EQUALS expression;

functionAttribute:
IDENTIFIER EQUALS expression;

ifStatement:
IF expression LBRACE (statement)* RBRACE
(ELSE LBRACE (statement)* RBRACE)?;

forStatement:
FOR IDENTIFIER IN IDENTIFIER LBRACE (statement)* (jsx)? RBRACE;

functionCall:
IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN;

function:
IDENTIFIER LPAREN (((IDENTIFIER | functionAttribute) COMMA)* (IDENTIFIER | functionAttribute)?) RPAREN
LBRACE (statement)* (jsx)? RBRACE;

timeFunction:
(SETTIMEOUT | SETINTERVAL) LPAREN LBRACE (statement)* (jsx)? RBRACE COMMA NUMBER RPAREN;

array:
(IDENTIFIER)? LBRACK (object | (object COMMA)*) RBRACK;

object:
LBRACE(IDENTIFIER COLON (STRING | NUMBER) | (IDENTIFIER COLON (STRING | NUMBER) COMMA)*) RBRACE;

htmlTag:
div | p | img;

div:
DIV LPAREN (props (COMMA props)*)? RPAREN LBRACE (statement|expression)* RBRACE;

p:
P LPAREN props (COMMA props)? RPAREN LBRACE (statement|expression)* RBRACE;

img:
IMG LPAREN props (COMMA props)? RPAREN;

props:
(CLASS EQUALS expression) | events | src | className;

events:
onClick;

onClick:
ONCLICK LPAREN (statement)* (jsx)? RPAREN;

src:
SRC EQUALS expression;

className:
CLASS EQUALS cssProps*;

cssProps:
FLEX
| POSITION
| top
| right
| left
| bottom
| FLEX_COLUMN
| FLEX_ROW
| JUSTIFY_CENTER
| JUSTIFY_START
| JUSTIFY_END
| JUSTIFY_AROUND
| JUSTIFY_EVENLY
| JUSTIFY_BETWEEN
| gabDash
| BORDER
| borderDash
| borderBottomDash
| BORDER_RADIUS_SM
| BORDER_RADIUS_MD
| BORDER_RADIUS_LG
| BORDER_RADIUS_XL
| BORDER_RADIUS_2XL
| BORDER_RADIUS_3XL
| BORDER_RADIUS_FULL
| CURSOR_POINTER
| MARGIN_AUTO
| marginDash
| pDash
| textDash
| TEXT_SM
| TEXT_LG
| TEXT_XL
| TEXT_2XL
| TEXT_3XL
| FONT_BOLD
| widthDash
| heightDash;

gabDash:
GAP DASH NUMBER;

borderDash:
BORDER DASH NUMBER;

borderBottomDash:
BORDER_BOTTOM DASH NUMBER;

marginDash:
MARGIN DASH NUMBER;

pDash:
P DASH NUMBER;

textDash:
TEXT DASH IDENTIFIER;

widthDash:
WIDTH DASH NUMBER;

heightDash:
HEIGHT DASH NUMBER;

top:
TOP DASH NUMBER;

bottom:
BOTTOM DASH NUMBER;

right:
RIGHT DASH NUMBER;

left:
LEFT DASH NUMBER;

hooks:
useStateHook
| useRefHook
| useEffectHook;

useStateHook:
USESTATE LPAREN ((hookContent COMMA hookContent COMMA hookContent) | hookContent) RPAREN;

useRefHook:
USEREF LPAREN (hookContent) RPAREN;

useEffectHook:
USEEFFECT LPAREN LBRACE (statement)* (jsx)? RBRACE (COMMA (STRING | IDENTIFIER))? RPAREN;

hookContent:
IDENTIFIER
| STRING
| NUMBER
| LBRACE RBRACE
| TRUE
| FALSE
| array
| object;

jsx:
JSX LBRACE (callComponent | functionCall | htmlTag | ifStatement)+ RBRACE;

expression:
    literal                                                             # LiteralExpression
    | functionCall                                                      # FunctionCallExpression
    | function                                                          # FunctionExpression
    | LPAREN expression+ RPAREN                                         # ParenExpression
    | LBRACE RBRACE                                                     # EmptyBraceExpression
    | IDENTIFIER DOT IDENTIFIER                                         # DotExpression
    | IDENTIFIER LBRACK IDENTIFIER  RBRACK DOT IDENTIFIER               # BracketDotExpression
    | boolean                                                           # BooleanExpression
    | IDENTIFIER QUESTION (expression | cssProps) COLON expression      # TernaryExpression
    | expression arithmaticOperator expression                          # ArithmaticExpression;



literal:
STRING
| NUMBER
| IDENTIFIER;

boolean:
TRUE
| FALSE;

arithmaticOperator:
PLUS | MULTIPLY | DIVIDE | DASH | MODULO;
