lexer grammar ReactLexer;

// Keywords
APP        : 'App';
JSX        : 'JSX';
DIV        : 'div';
P          : 'p';
IMG        : 'img';
SRC        : 'src';
COMPONENT  : 'Component';
USESTATE   : 'useState';
USEREF     : 'useRef';
USEEFFECT  : 'useEffect';
SETTIMEOUT : 'setTimeout';
SETINTERVAL: 'setInterval';
ONCLICK    : 'onClick';
IF         : 'if';
ELSE       : 'else';
FOR        : 'for';
IN         : 'in';
TRUE       : 'true';
FALSE      : 'false';
DASH       : '-';

// Symbols
LPAREN     : '(';
RPAREN     : ')';
LBRACE     : '{';
RBRACE     : '}';
LBRACK     : '[';
RBRACK     : ']';
COMMA      : ',';
COLON      : ':';
SEMI       : ';';
EQUALS     : '=';
DOT        : '.';
QUESTION   : '?';

// Arithmetic Operators
PLUS       : '+';
MULTIPLY   : '*';
DIVIDE     : '/';
MODULO     : '%';

// CSS Properties
CLASS              : 'class';
POSITION           : 'relative';
TOP                : 'top';
RIGHT              : 'right';
LEFT               : 'left';
BOTTOM             : 'bottom';
FLEX               : 'flex';
FLEX_COLUMN        : 'flex-col';
FLEX_ROW           : 'flex-row';
JUSTIFY_CENTER     : 'justify-center';
JUSTIFY_START      : 'justify-start';
JUSTIFY_END        : 'justify-end';
JUSTIFY_AROUND     : 'justify-around';
JUSTIFY_EVENLY     : 'justify-evenly';
JUSTIFY_BETWEEN    : 'justify-between';
GAP                : 'gap';
BORDER             : 'border';
BORDER_BOTTOM      : 'border-b';
BORDER_RADIUS_SM   : 'rounded-sm';
BORDER_RADIUS_MD   : 'rounded-md';
BORDER_RADIUS_LG   : 'rounded-lg';
BORDER_RADIUS_XL   : 'rounded-xl';
BORDER_RADIUS_2XL  : 'rounded-2xl';
BORDER_RADIUS_3XL  : 'rounded-3xl';
BORDER_RADIUS_FULL : 'rounded-full';
CURSOR_POINTER     : 'cursor-pointer';
MARGIN             : 'm';
MARGIN_AUTO        : 'm-auto';
TEXT               : 'text';
TEXT_SM            : 'text-sm';
TEXT_LG            : 'text-lg';
TEXT_XL            : 'text-xl';
TEXT_2XL           : 'text-2xl';
TEXT_3XL           : 'text-3xl';
FONT_BOLD          : 'font-bold';
FONT_MEDIUM        : 'font-medium';
WIDTH              : 'w';
HEIGHT             : 'h';

// Identifiers and Literals
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*;
STRING     : '"' (~["\r\n])* '"';
NUMBER     : [0-9]+;

// Whitespace
WS         : [ \t\r\n]+ -> skip; // skip spaces, tabs, newlines
