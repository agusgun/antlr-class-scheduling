/*
 * Lexer Rules
 */
/*
Unused
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

DAY: (M O N | T U E S | W E D | T H U R S | F R I) D A Y ;
*/
grammar CSGrammar;

fragment LOWERCASE: [a-z] ;
fragment UPPERCASE: [A-Z] ;
fragment LETTER: (UPPERCASE | LOWERCASE) ;
fragment TWOLETTER: LETTER LETTER ;
fragment DIGIT: ('0'..'9') ;
fragment ALPHANUMERIC: [A-Za-z0-9] ;
fragment SLASH: WHITESPACE '/' WHITESPACE ;

/* FIX Result */
INTEGER_NUMBER: DIGIT+;
TWODIGIT: DIGIT DIGIT ;
TWODIGITOPT: DIGIT DIGIT? ;
THREELETTER: LETTER LETTER LETTER ;
WORD: (LETTER | '_' )+ ;
WHITESPACE: (' ' | '\t')+ ;

NEWLINE: '\r'? '\n' | '\r';
HYPHEN: WHITESPACE '-' WHITESPACE ;
COMMA: ',' WHITESPACE ;
EQUAL: WHITESPACE '=' WHITESPACE ;
WITH: WHITESPACE 'WITH' WHITESPACE ;
COLON: ':';

CLASSROOM: ALPHANUMERIC+ ;
TIME: TWODIGITOPT COLON TWODIGIT ;
NAME: (WORD | WORD WHITESPACE*)+ ;
LECTURER: NAME ;
LECTURERS: LECTURER (SLASH LECTURER)? ;
LECTURE: TWOLETTER TWODIGIT TWODIGIT WHITESPACE LETTER DIGIT;

/* Related to Parse */
CONFIGURE_COMMAND: 'CONFIGURE:' WHITESPACE ;
REQUIREMENT_COMMAND: 'REQUIREMENT:' WHITESPACE ;
LECTURER_COMMAND: 'LECTURER:' WHITESPACE;
PREFER_COMMAND: 'PREFER:' WHITESPACE 'COOCCUR' WHITESPACE 'LECTURES' EQUAL ;
CONSTRAINT_COMMAND: 'CONSTRAINT:' WHITESPACE 'SEPARATE' WHITESPACE 'LECTURES' EQUAL ;

/*
 * Parser Rules
 */


/* Define class configuration */
amount: INTEGER_NUMBER ;
facilities: WORD ;

capacity_config: 'CAPACITY' '=' amount;
facilities_config: 'FACILITIES' '=' facilities '-' amount;
class_config: (capacity_config | facilities_config ) ;
classroom: CLASSROOM ;
define_class_config: CONFIGURE_COMMAND classroom WITH class_config (COMMA class_config)*;


/* Define class requirement */
group: WORD ;
group_config: 'GROUP=' group ;
lecture_requirement: (capacity_config | facilities_config | group_config) ;
lecture: LECTURE ;
define_class_requirement: REQUIREMENT_COMMAND lecture WITH lecture_requirement (COMMA lecture_requirement)*;


/* Define lecturer */
time: TIME ;
day: 'MONDAY' | 'TUESDAY' | 'WEDNESDAY' | 'THURSDAY' | 'FRIDAY' ;
availability_day: 'AVAILABILITY_DAY=' day ;
availability_day_time: 'AVAILABILITY_DAYTIME=' day '-' time;
lecturer_details: (availability_day | availability_day_time | group_config) ;

lecturer: THREELETTER;
define_lecturer: LECTURER_COMMAND lecturer '-' lecturer_details (COMMA lecturer_details)*;


/* Preference & Constraint */
prefer_cooccurrence: PREFER_COMMAND lecture (COMMA lecture)+ ;
constraint_separation: CONSTRAINT_COMMAND lecture (COMMA lecture)+ ;

/* Schedule */
schedule: 'SCHEDULE' ;

/* Entry */
entry: (schedule | prefer_cooccurrence | constraint_separation | define_lecturer | define_class_requirement | define_class_config) NEWLINE ;

/* Main */
main: entry+ ;