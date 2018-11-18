/*
 * Lexer Rules
 */
grammar CSGrammar;

fragment DIGIT: [0-9] ;
fragment TWODIGIT: DIGIT DIGIT ;
fragment TWODIGITOPT: DIGIT DIGIT? ;
fragment LOWERCASE: [a-z] ;
fragment UPPERCASE: [A-Z] ;
fragment LETTER: (UPPERCASE | LOWERCASE) ;
fragment TWOLETTER: LETTER LETTER ;
fragment THREELETTER: LETTER LETTER LETTER ;
fragment WORD: (LETTER | '_' )+ ;
fragment ALPHANUMERIC: [A-Za-z0-9] ;

WHITESPACE: (' ' | '\t')+ ;

NEWLINE: '\r'? '\n' | '\r';
HYPHEN: WHITESPACE '-' WHITESPACE ;
COMMA: WHITESPACE ',' WHITESPACE ;
EQUAL: WHITESPACE '=' WHITESPACE ;
WITH: WHITESPACE 'WITH' WHITESPACE ;
fragment COLON: WHITESPACE ':' WHITESPACE ;
fragment SLASH: WHITESPACE '/' WHITESPACE ;

fragment S: ('S' | 's') ;
fragment U: ('U' | 'u') ;
fragment N: ('N' | 'n') ;
fragment D: ('D' | 'd') ;
fragment A: ('A' | 'a') ;
fragment Y: ('Y' | 'y') ;
fragment M: ('M' | 'm') ;
fragment O: ('O' | 'o') ;
fragment T: ('T' | 't') ;
fragment E: ('E' | 'e') ;
fragment W: ('W' | 'w') ;
fragment H: ('H' | 'h') ;
fragment R: ('R' | 'r') ;
fragment F: ('F' | 'f') ;
fragment I: ('I' | 'i') ;

CLASSROOM: ALPHANUMERIC+ ;
DAY: (M O N | T U E S | W E D | T H U R S | F R I) D A Y ;
TIME: TWODIGITOPT COLON TWODIGIT ;
NAME: (WORD WHITESPACE*)+ ;
FACILITIES: NAME ;
AMOUNT: DIGIT+ ;
GROUP: NAME ;
LECTURER: NAME ;
LECTURERS: LECTURER (SLASH LECTURER)? ;
LECTURE: TWOLETTER TWODIGIT TWODIGIT WHITESPACE LETTER DIGIT;

/* Related to Parse */
CAPACITY_CONFIG: 'CAPACITY' EQUAL AMOUNT ;
FACILITIES_CONFIG: 'FACILITIES' EQUAL FACILITIES HYPHEN AMOUNT ;
GROUP_CONFIG: 'GROUP' EQUAL GROUP ;
AVAILABILITY_DAY: 'AVAILABILITY_DAY' EQUAL DAY ;
AVAILABILITY_DAY_TIME: 'AVAILABILITY_DAYTIME' EQUAL DAY HYPHEN TIME ;

LECTURER_COMMAND: 'LECTURER:' WHITESPACE LECTURER WHITESPACE '-' WHITESPACE;
PREFER_COMMAND: 'PREFER:' WHITESPACE 'COOCCUR' WHITESPACE 'LECTURES' ;
SEPARATE_COMMAND: 'CONSTRAINT:' WHITESPACE 'SEPARATE' WHITESPACE 'LECTURES';
/*
 * Parser Rules
 */


/* Define class configuration */
class_config: (CAPACITY_CONFIG | FACILITIES_CONFIG) ;
define_class_config: 'CONFIGURE:' WHITESPACE CLASSROOM WITH class_config ;


/* Define class requirement */
class_requirement: (CAPACITY_CONFIG | FACILITIES_CONFIG | GROUP_CONFIG) ;

define_class_requirement: 'REQUIREMENT:' WHITESPACE LECTURE EQUAL class_requirement ;


/* Define lecturer */
lecturer_details: (AVAILABILITY_DAY | AVAILABILITY_DAY_TIME | GROUP_CONFIG) ;

define_lecturer: LECTURER_COMMAND lecturer_details ;


/* Preference & Constraint */
prefer_cooccurrence: PREFER_COMMAND EQUAL LECTURE (COMMA LECTURE)+ ;
constraint_separation: SEPARATE_COMMAND EQUAL LECTURE (COMMA LECTURE)+ ;

/* Schedule */
schedule: 'SCHEDULE' ;

/* Entry */
entry: (schedule | prefer_cooccurrence | constraint_separation | define_lecturer | define_class_requirement | define_class_config) NEWLINE ;

/* Main */
main: entry+ ;



