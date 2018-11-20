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
LECTURE: (TWOLETTER TWODIGIT TWODIGIT WHITESPACE LETTER DIGIT) ;

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
amount_capacity_classroom: INTEGER_NUMBER ;
amount_facility_classroom: INTEGER_NUMBER ;
facility_name_classroom: WORD ;
capacity_config_classroom: 'CAPACITY' '=' amount_capacity_classroom;
facilities_config_classroom: 'FACILITIES' '=' facility_name_classroom '-' amount_facility_classroom;
class_config: (capacity_config_classroom | facilities_config_classroom ) ;
classroom_name: CLASSROOM ;
define_class_config: CONFIGURE_COMMAND classroom_name WITH class_config (COMMA class_config)*;


/* Define class requirement */
amount_capacity_lecture: INTEGER_NUMBER ;
amount_facility_lecture: INTEGER_NUMBER ;
facility_name_lecture: WORD ;
capacity_config_lecture: 'CAPACITY' '=' amount_capacity_lecture ;
facility_config_lecture: 'FACILITIES' '=' facility_name_lecture '-' amount_facility_lecture;
group_lecture: WORD ;
group_config_lecture: 'GROUP=' group_lecture ;
lecture_requirement: (capacity_config_lecture | facility_config_lecture | group_config_lecture) ;
lecture: LECTURE ;
define_lecture_requirement: REQUIREMENT_COMMAND lecture WITH lecture_requirement (COMMA lecture_requirement)*;


/* Define lecturer */
group_lecturer: WORD ;
group_config_lecturer: 'GROUP=' group_lecturer ;
time: TIME ;
day_day: 'MONDAY' | 'TUESDAY' | 'WEDNESDAY' | 'THURSDAY' | 'FRIDAY' ;
day_day_time: 'MONDAY' | 'TUESDAY' | 'WEDNESDAY' | 'THURSDAY' | 'FRIDAY' ;
availability_day: 'AVAILABILITY_DAY=' day_day ;
availability_day_time: 'AVAILABILITY_DAYTIME=' day_day_time '-' time;
lecturer_details: (availability_day | availability_day_time | group_config_lecturer) ;

lecturer: THREELETTER;
define_lecturer: LECTURER_COMMAND lecturer '-' lecturer_details (COMMA lecturer_details)*;


/* Preference & Constraint */
lecture_preference: LECTURE;
lecture_constraint: LECTURE;
prefer_cooccurrence: PREFER_COMMAND lecture_preference (COMMA lecture_preference)+ ;
constraint_separation: CONSTRAINT_COMMAND lecture_constraint (COMMA lecture_constraint)+ ;

/* ScheduleController */
schedule: 'SCHEDULE' ;

/* Entry */
entry: (schedule | prefer_cooccurrence | constraint_separation | define_lecturer | define_lecture_requirement | define_class_config) NEWLINE ;

/* Main */
main: entry+ ;