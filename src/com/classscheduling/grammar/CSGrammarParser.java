// Generated from /home/agus/Project/ClassScheduling/src/main/antlr4/CSGrammar.g4 by ANTLR 4.7
package com.classscheduling.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INTEGER_NUMBER=14, TWODIGIT=15, 
		TWODIGITOPT=16, THREELETTER=17, WORD=18, WHITESPACE=19, NEWLINE=20, HYPHEN=21, 
		COMMA=22, EQUAL=23, WITH=24, COLON=25, CLASSROOM=26, TIME=27, NAME=28, 
		LECTURER=29, LECTURERS=30, LECTURE=31, CONFIGURE_COMMAND=32, REQUIREMENT_COMMAND=33, 
		LECTURER_COMMAND=34, PREFER_COMMAND=35, CONSTRAINT_COMMAND=36;
	public static final int
		RULE_amount_capacity_classroom = 0, RULE_amount_facility_classroom = 1, 
		RULE_facility_name_classroom = 2, RULE_capacity_config_classroom = 3, 
		RULE_facilities_config_classroom = 4, RULE_class_config = 5, RULE_classroom_name = 6, 
		RULE_define_class_config = 7, RULE_amount_capacity_lecture = 8, RULE_amount_facility_lecture = 9, 
		RULE_facility_name_lecture = 10, RULE_capacity_config_lecture = 11, RULE_facility_config_lecture = 12, 
		RULE_group_lecture = 13, RULE_group_config_lecture = 14, RULE_lecture_requirement = 15, 
		RULE_lecture = 16, RULE_define_lecture_requirement = 17, RULE_group_lecturer = 18, 
		RULE_group_config_lecturer = 19, RULE_time = 20, RULE_day_day = 21, RULE_day_day_time = 22, 
		RULE_availability_day = 23, RULE_availability_day_time = 24, RULE_lecturer_details = 25, 
		RULE_lecturer = 26, RULE_define_lecturer = 27, RULE_lecture_preference = 28, 
		RULE_lecture_constraint = 29, RULE_prefer_cooccurrence = 30, RULE_constraint_separation = 31, 
		RULE_schedule = 32, RULE_entry = 33, RULE_main = 34;
	public static final String[] ruleNames = {
		"amount_capacity_classroom", "amount_facility_classroom", "facility_name_classroom", 
		"capacity_config_classroom", "facilities_config_classroom", "class_config", 
		"classroom_name", "define_class_config", "amount_capacity_lecture", "amount_facility_lecture", 
		"facility_name_lecture", "capacity_config_lecture", "facility_config_lecture", 
		"group_lecture", "group_config_lecture", "lecture_requirement", "lecture", 
		"define_lecture_requirement", "group_lecturer", "group_config_lecturer", 
		"time", "day_day", "day_day_time", "availability_day", "availability_day_time", 
		"lecturer_details", "lecturer", "define_lecturer", "lecture_preference", 
		"lecture_constraint", "prefer_cooccurrence", "constraint_separation", 
		"schedule", "entry", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CAPACITY'", "'='", "'FACILITIES'", "'-'", "'GROUP='", "'MONDAY'", 
		"'TUESDAY'", "'WEDNESDAY'", "'THURSDAY'", "'FRIDAY'", "'AVAILABILITY_DAY='", 
		"'AVAILABILITY_DAYTIME='", "'SCHEDULE'", null, null, null, null, null, 
		null, null, null, null, null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "INTEGER_NUMBER", "TWODIGIT", "TWODIGITOPT", "THREELETTER", 
		"WORD", "WHITESPACE", "NEWLINE", "HYPHEN", "COMMA", "EQUAL", "WITH", "COLON", 
		"CLASSROOM", "TIME", "NAME", "LECTURER", "LECTURERS", "LECTURE", "CONFIGURE_COMMAND", 
		"REQUIREMENT_COMMAND", "LECTURER_COMMAND", "PREFER_COMMAND", "CONSTRAINT_COMMAND"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Amount_capacity_classroomContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(CSGrammarParser.INTEGER_NUMBER, 0); }
		public Amount_capacity_classroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount_capacity_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAmount_capacity_classroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAmount_capacity_classroom(this);
		}
	}

	public final Amount_capacity_classroomContext amount_capacity_classroom() throws RecognitionException {
		Amount_capacity_classroomContext _localctx = new Amount_capacity_classroomContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_amount_capacity_classroom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(INTEGER_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Amount_facility_classroomContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(CSGrammarParser.INTEGER_NUMBER, 0); }
		public Amount_facility_classroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount_facility_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAmount_facility_classroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAmount_facility_classroom(this);
		}
	}

	public final Amount_facility_classroomContext amount_facility_classroom() throws RecognitionException {
		Amount_facility_classroomContext _localctx = new Amount_facility_classroomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_amount_facility_classroom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(INTEGER_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Facility_name_classroomContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSGrammarParser.WORD, 0); }
		public Facility_name_classroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility_name_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterFacility_name_classroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitFacility_name_classroom(this);
		}
	}

	public final Facility_name_classroomContext facility_name_classroom() throws RecognitionException {
		Facility_name_classroomContext _localctx = new Facility_name_classroomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_facility_name_classroom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capacity_config_classroomContext extends ParserRuleContext {
		public Amount_capacity_classroomContext amount_capacity_classroom() {
			return getRuleContext(Amount_capacity_classroomContext.class,0);
		}
		public Capacity_config_classroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacity_config_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterCapacity_config_classroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitCapacity_config_classroom(this);
		}
	}

	public final Capacity_config_classroomContext capacity_config_classroom() throws RecognitionException {
		Capacity_config_classroomContext _localctx = new Capacity_config_classroomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_capacity_config_classroom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			match(T__1);
			setState(78);
			amount_capacity_classroom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Facilities_config_classroomContext extends ParserRuleContext {
		public Facility_name_classroomContext facility_name_classroom() {
			return getRuleContext(Facility_name_classroomContext.class,0);
		}
		public Amount_facility_classroomContext amount_facility_classroom() {
			return getRuleContext(Amount_facility_classroomContext.class,0);
		}
		public Facilities_config_classroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facilities_config_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterFacilities_config_classroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitFacilities_config_classroom(this);
		}
	}

	public final Facilities_config_classroomContext facilities_config_classroom() throws RecognitionException {
		Facilities_config_classroomContext _localctx = new Facilities_config_classroomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_facilities_config_classroom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__2);
			setState(81);
			match(T__1);
			setState(82);
			facility_name_classroom();
			setState(83);
			match(T__3);
			setState(84);
			amount_facility_classroom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_configContext extends ParserRuleContext {
		public Capacity_config_classroomContext capacity_config_classroom() {
			return getRuleContext(Capacity_config_classroomContext.class,0);
		}
		public Facilities_config_classroomContext facilities_config_classroom() {
			return getRuleContext(Facilities_config_classroomContext.class,0);
		}
		public Class_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterClass_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitClass_config(this);
		}
	}

	public final Class_configContext class_config() throws RecognitionException {
		Class_configContext _localctx = new Class_configContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(86);
				capacity_config_classroom();
				}
				break;
			case T__2:
				{
				setState(87);
				facilities_config_classroom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Classroom_nameContext extends ParserRuleContext {
		public TerminalNode CLASSROOM() { return getToken(CSGrammarParser.CLASSROOM, 0); }
		public Classroom_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classroom_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterClassroom_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitClassroom_name(this);
		}
	}

	public final Classroom_nameContext classroom_name() throws RecognitionException {
		Classroom_nameContext _localctx = new Classroom_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classroom_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(CLASSROOM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_class_configContext extends ParserRuleContext {
		public TerminalNode CONFIGURE_COMMAND() { return getToken(CSGrammarParser.CONFIGURE_COMMAND, 0); }
		public Classroom_nameContext classroom_name() {
			return getRuleContext(Classroom_nameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(CSGrammarParser.WITH, 0); }
		public List<Class_configContext> class_config() {
			return getRuleContexts(Class_configContext.class);
		}
		public Class_configContext class_config(int i) {
			return getRuleContext(Class_configContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSGrammarParser.COMMA, i);
		}
		public Define_class_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterDefine_class_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitDefine_class_config(this);
		}
	}

	public final Define_class_configContext define_class_config() throws RecognitionException {
		Define_class_configContext _localctx = new Define_class_configContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_class_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(CONFIGURE_COMMAND);
			setState(93);
			classroom_name();
			setState(94);
			match(WITH);
			setState(95);
			class_config();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				class_config();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Amount_capacity_lectureContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(CSGrammarParser.INTEGER_NUMBER, 0); }
		public Amount_capacity_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount_capacity_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAmount_capacity_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAmount_capacity_lecture(this);
		}
	}

	public final Amount_capacity_lectureContext amount_capacity_lecture() throws RecognitionException {
		Amount_capacity_lectureContext _localctx = new Amount_capacity_lectureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_amount_capacity_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(INTEGER_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Amount_facility_lectureContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(CSGrammarParser.INTEGER_NUMBER, 0); }
		public Amount_facility_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount_facility_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAmount_facility_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAmount_facility_lecture(this);
		}
	}

	public final Amount_facility_lectureContext amount_facility_lecture() throws RecognitionException {
		Amount_facility_lectureContext _localctx = new Amount_facility_lectureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_amount_facility_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(INTEGER_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Facility_name_lectureContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSGrammarParser.WORD, 0); }
		public Facility_name_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility_name_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterFacility_name_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitFacility_name_lecture(this);
		}
	}

	public final Facility_name_lectureContext facility_name_lecture() throws RecognitionException {
		Facility_name_lectureContext _localctx = new Facility_name_lectureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_facility_name_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Capacity_config_lectureContext extends ParserRuleContext {
		public Amount_capacity_lectureContext amount_capacity_lecture() {
			return getRuleContext(Amount_capacity_lectureContext.class,0);
		}
		public Capacity_config_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacity_config_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterCapacity_config_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitCapacity_config_lecture(this);
		}
	}

	public final Capacity_config_lectureContext capacity_config_lecture() throws RecognitionException {
		Capacity_config_lectureContext _localctx = new Capacity_config_lectureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capacity_config_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__0);
			setState(110);
			match(T__1);
			setState(111);
			amount_capacity_lecture();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Facility_config_lectureContext extends ParserRuleContext {
		public Facility_name_lectureContext facility_name_lecture() {
			return getRuleContext(Facility_name_lectureContext.class,0);
		}
		public Amount_facility_lectureContext amount_facility_lecture() {
			return getRuleContext(Amount_facility_lectureContext.class,0);
		}
		public Facility_config_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facility_config_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterFacility_config_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitFacility_config_lecture(this);
		}
	}

	public final Facility_config_lectureContext facility_config_lecture() throws RecognitionException {
		Facility_config_lectureContext _localctx = new Facility_config_lectureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_facility_config_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__2);
			setState(114);
			match(T__1);
			setState(115);
			facility_name_lecture();
			setState(116);
			match(T__3);
			setState(117);
			amount_facility_lecture();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_lectureContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSGrammarParser.WORD, 0); }
		public Group_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterGroup_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitGroup_lecture(this);
		}
	}

	public final Group_lectureContext group_lecture() throws RecognitionException {
		Group_lectureContext _localctx = new Group_lectureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_group_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_config_lectureContext extends ParserRuleContext {
		public Group_lectureContext group_lecture() {
			return getRuleContext(Group_lectureContext.class,0);
		}
		public Group_config_lectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_config_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterGroup_config_lecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitGroup_config_lecture(this);
		}
	}

	public final Group_config_lectureContext group_config_lecture() throws RecognitionException {
		Group_config_lectureContext _localctx = new Group_config_lectureContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_group_config_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__4);
			setState(122);
			group_lecture();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lecture_requirementContext extends ParserRuleContext {
		public Capacity_config_lectureContext capacity_config_lecture() {
			return getRuleContext(Capacity_config_lectureContext.class,0);
		}
		public Facility_config_lectureContext facility_config_lecture() {
			return getRuleContext(Facility_config_lectureContext.class,0);
		}
		public Group_config_lectureContext group_config_lecture() {
			return getRuleContext(Group_config_lectureContext.class,0);
		}
		public Lecture_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterLecture_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitLecture_requirement(this);
		}
	}

	public final Lecture_requirementContext lecture_requirement() throws RecognitionException {
		Lecture_requirementContext _localctx = new Lecture_requirementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lecture_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(124);
				capacity_config_lecture();
				}
				break;
			case T__2:
				{
				setState(125);
				facility_config_lecture();
				}
				break;
			case T__4:
				{
				setState(126);
				group_config_lecture();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LectureContext extends ParserRuleContext {
		public TerminalNode LECTURE() { return getToken(CSGrammarParser.LECTURE, 0); }
		public LectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterLecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitLecture(this);
		}
	}

	public final LectureContext lecture() throws RecognitionException {
		LectureContext _localctx = new LectureContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LECTURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_lecture_requirementContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT_COMMAND() { return getToken(CSGrammarParser.REQUIREMENT_COMMAND, 0); }
		public LectureContext lecture() {
			return getRuleContext(LectureContext.class,0);
		}
		public TerminalNode WITH() { return getToken(CSGrammarParser.WITH, 0); }
		public List<Lecture_requirementContext> lecture_requirement() {
			return getRuleContexts(Lecture_requirementContext.class);
		}
		public Lecture_requirementContext lecture_requirement(int i) {
			return getRuleContext(Lecture_requirementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSGrammarParser.COMMA, i);
		}
		public Define_lecture_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_lecture_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterDefine_lecture_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitDefine_lecture_requirement(this);
		}
	}

	public final Define_lecture_requirementContext define_lecture_requirement() throws RecognitionException {
		Define_lecture_requirementContext _localctx = new Define_lecture_requirementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_define_lecture_requirement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(REQUIREMENT_COMMAND);
			setState(132);
			lecture();
			setState(133);
			match(WITH);
			setState(134);
			lecture_requirement();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				lecture_requirement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_lecturerContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSGrammarParser.WORD, 0); }
		public Group_lecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_lecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterGroup_lecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitGroup_lecturer(this);
		}
	}

	public final Group_lecturerContext group_lecturer() throws RecognitionException {
		Group_lecturerContext _localctx = new Group_lecturerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_group_lecturer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_config_lecturerContext extends ParserRuleContext {
		public Group_lecturerContext group_lecturer() {
			return getRuleContext(Group_lecturerContext.class,0);
		}
		public Group_config_lecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_config_lecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterGroup_config_lecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitGroup_config_lecturer(this);
		}
	}

	public final Group_config_lecturerContext group_config_lecturer() throws RecognitionException {
		Group_config_lecturerContext _localctx = new Group_config_lecturerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_group_config_lecturer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__4);
			setState(145);
			group_lecturer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(CSGrammarParser.TIME, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(TIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Day_dayContext extends ParserRuleContext {
		public Day_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterDay_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitDay_day(this);
		}
	}

	public final Day_dayContext day_day() throws RecognitionException {
		Day_dayContext _localctx = new Day_dayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_day_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Day_day_timeContext extends ParserRuleContext {
		public Day_day_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_day_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterDay_day_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitDay_day_time(this);
		}
	}

	public final Day_day_timeContext day_day_time() throws RecognitionException {
		Day_day_timeContext _localctx = new Day_day_timeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_day_day_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_dayContext extends ParserRuleContext {
		public Day_dayContext day_day() {
			return getRuleContext(Day_dayContext.class,0);
		}
		public Availability_dayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAvailability_day(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAvailability_day(this);
		}
	}

	public final Availability_dayContext availability_day() throws RecognitionException {
		Availability_dayContext _localctx = new Availability_dayContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_availability_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__10);
			setState(154);
			day_day();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Availability_day_timeContext extends ParserRuleContext {
		public Day_day_timeContext day_day_time() {
			return getRuleContext(Day_day_timeContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public Availability_day_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availability_day_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAvailability_day_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAvailability_day_time(this);
		}
	}

	public final Availability_day_timeContext availability_day_time() throws RecognitionException {
		Availability_day_timeContext _localctx = new Availability_day_timeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_availability_day_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__11);
			setState(157);
			day_day_time();
			setState(158);
			match(T__3);
			setState(159);
			time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lecturer_detailsContext extends ParserRuleContext {
		public Availability_dayContext availability_day() {
			return getRuleContext(Availability_dayContext.class,0);
		}
		public Availability_day_timeContext availability_day_time() {
			return getRuleContext(Availability_day_timeContext.class,0);
		}
		public Group_config_lecturerContext group_config_lecturer() {
			return getRuleContext(Group_config_lecturerContext.class,0);
		}
		public Lecturer_detailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturer_details; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterLecturer_details(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitLecturer_details(this);
		}
	}

	public final Lecturer_detailsContext lecturer_details() throws RecognitionException {
		Lecturer_detailsContext _localctx = new Lecturer_detailsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lecturer_details);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(161);
				availability_day();
				}
				break;
			case T__11:
				{
				setState(162);
				availability_day_time();
				}
				break;
			case T__4:
				{
				setState(163);
				group_config_lecturer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturerContext extends ParserRuleContext {
		public TerminalNode THREELETTER() { return getToken(CSGrammarParser.THREELETTER, 0); }
		public LecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterLecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitLecturer(this);
		}
	}

	public final LecturerContext lecturer() throws RecognitionException {
		LecturerContext _localctx = new LecturerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lecturer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(THREELETTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Define_lecturerContext extends ParserRuleContext {
		public TerminalNode LECTURER_COMMAND() { return getToken(CSGrammarParser.LECTURER_COMMAND, 0); }
		public LecturerContext lecturer() {
			return getRuleContext(LecturerContext.class,0);
		}
		public List<Lecturer_detailsContext> lecturer_details() {
			return getRuleContexts(Lecturer_detailsContext.class);
		}
		public Lecturer_detailsContext lecturer_details(int i) {
			return getRuleContext(Lecturer_detailsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSGrammarParser.COMMA, i);
		}
		public Define_lecturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_lecturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterDefine_lecturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitDefine_lecturer(this);
		}
	}

	public final Define_lecturerContext define_lecturer() throws RecognitionException {
		Define_lecturerContext _localctx = new Define_lecturerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_define_lecturer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LECTURER_COMMAND);
			setState(169);
			lecturer();
			setState(170);
			match(T__3);
			setState(171);
			lecturer_details();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				lecturer_details();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lecture_preferenceContext extends ParserRuleContext {
		public TerminalNode LECTURE() { return getToken(CSGrammarParser.LECTURE, 0); }
		public Lecture_preferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture_preference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterLecture_preference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitLecture_preference(this);
		}
	}

	public final Lecture_preferenceContext lecture_preference() throws RecognitionException {
		Lecture_preferenceContext _localctx = new Lecture_preferenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lecture_preference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LECTURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lecture_constraintContext extends ParserRuleContext {
		public TerminalNode LECTURE() { return getToken(CSGrammarParser.LECTURE, 0); }
		public Lecture_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterLecture_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitLecture_constraint(this);
		}
	}

	public final Lecture_constraintContext lecture_constraint() throws RecognitionException {
		Lecture_constraintContext _localctx = new Lecture_constraintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_lecture_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LECTURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefer_cooccurrenceContext extends ParserRuleContext {
		public TerminalNode PREFER_COMMAND() { return getToken(CSGrammarParser.PREFER_COMMAND, 0); }
		public List<Lecture_preferenceContext> lecture_preference() {
			return getRuleContexts(Lecture_preferenceContext.class);
		}
		public Lecture_preferenceContext lecture_preference(int i) {
			return getRuleContext(Lecture_preferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSGrammarParser.COMMA, i);
		}
		public Prefer_cooccurrenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefer_cooccurrence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterPrefer_cooccurrence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitPrefer_cooccurrence(this);
		}
	}

	public final Prefer_cooccurrenceContext prefer_cooccurrence() throws RecognitionException {
		Prefer_cooccurrenceContext _localctx = new Prefer_cooccurrenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_prefer_cooccurrence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(PREFER_COMMAND);
			setState(184);
			lecture_preference();
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				lecture_preference();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constraint_separationContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT_COMMAND() { return getToken(CSGrammarParser.CONSTRAINT_COMMAND, 0); }
		public List<Lecture_constraintContext> lecture_constraint() {
			return getRuleContexts(Lecture_constraintContext.class);
		}
		public Lecture_constraintContext lecture_constraint(int i) {
			return getRuleContext(Lecture_constraintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSGrammarParser.COMMA, i);
		}
		public Constraint_separationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint_separation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterConstraint_separation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitConstraint_separation(this);
		}
	}

	public final Constraint_separationContext constraint_separation() throws RecognitionException {
		Constraint_separationContext _localctx = new Constraint_separationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constraint_separation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(CONSTRAINT_COMMAND);
			setState(192);
			lecture_constraint();
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				lecture_constraint();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScheduleContext extends ParserRuleContext {
		public ScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitSchedule(this);
		}
	}

	public final ScheduleContext schedule() throws RecognitionException {
		ScheduleContext _localctx = new ScheduleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_schedule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntryContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(CSGrammarParser.NEWLINE, 0); }
		public ScheduleContext schedule() {
			return getRuleContext(ScheduleContext.class,0);
		}
		public Prefer_cooccurrenceContext prefer_cooccurrence() {
			return getRuleContext(Prefer_cooccurrenceContext.class,0);
		}
		public Constraint_separationContext constraint_separation() {
			return getRuleContext(Constraint_separationContext.class,0);
		}
		public Define_lecturerContext define_lecturer() {
			return getRuleContext(Define_lecturerContext.class,0);
		}
		public Define_lecture_requirementContext define_lecture_requirement() {
			return getRuleContext(Define_lecture_requirementContext.class,0);
		}
		public Define_class_configContext define_class_config() {
			return getRuleContext(Define_class_configContext.class,0);
		}
		public EntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitEntry(this);
		}
	}

	public final EntryContext entry() throws RecognitionException {
		EntryContext _localctx = new EntryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(201);
				schedule();
				}
				break;
			case PREFER_COMMAND:
				{
				setState(202);
				prefer_cooccurrence();
				}
				break;
			case CONSTRAINT_COMMAND:
				{
				setState(203);
				constraint_separation();
				}
				break;
			case LECTURER_COMMAND:
				{
				setState(204);
				define_lecturer();
				}
				break;
			case REQUIREMENT_COMMAND:
				{
				setState(205);
				define_lecture_requirement();
				}
				break;
			case CONFIGURE_COMMAND:
				{
				setState(206);
				define_class_config();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public List<EntryContext> entry() {
			return getRuleContexts(EntryContext.class);
		}
		public EntryContext entry(int i) {
			return getRuleContext(EntryContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				entry();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << CONFIGURE_COMMAND) | (1L << REQUIREMENT_COMMAND) | (1L << LECTURER_COMMAND) | (1L << PREFER_COMMAND) | (1L << CONSTRAINT_COMMAND))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7[\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\te\n\t\f\t\16\th\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u0082\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u008c\n\23\f"+
		"\23\16\23\u008f\13\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u00a7"+
		"\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u00b1\n\35\f\35\16"+
		"\35\u00b4\13\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \6 \u00be\n \r \16 \u00bf"+
		"\3!\3!\3!\3!\6!\u00c6\n!\r!\16!\u00c7\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u00d2"+
		"\n#\3#\3#\3$\6$\u00d7\n$\r$\16$\u00d8\3$\2\2%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\3\3\2\b\f\2\u00c7\2H\3"+
		"\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nR\3\2\2\2\fZ\3\2\2\2\16\\\3\2"+
		"\2\2\20^\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26m\3\2\2\2\30o\3\2\2\2\32s\3"+
		"\2\2\2\34y\3\2\2\2\36{\3\2\2\2 \u0081\3\2\2\2\"\u0083\3\2\2\2$\u0085\3"+
		"\2\2\2&\u0090\3\2\2\2(\u0092\3\2\2\2*\u0095\3\2\2\2,\u0097\3\2\2\2.\u0099"+
		"\3\2\2\2\60\u009b\3\2\2\2\62\u009e\3\2\2\2\64\u00a6\3\2\2\2\66\u00a8\3"+
		"\2\2\28\u00aa\3\2\2\2:\u00b5\3\2\2\2<\u00b7\3\2\2\2>\u00b9\3\2\2\2@\u00c1"+
		"\3\2\2\2B\u00c9\3\2\2\2D\u00d1\3\2\2\2F\u00d6\3\2\2\2HI\7\20\2\2I\3\3"+
		"\2\2\2JK\7\20\2\2K\5\3\2\2\2LM\7\24\2\2M\7\3\2\2\2NO\7\3\2\2OP\7\4\2\2"+
		"PQ\5\2\2\2Q\t\3\2\2\2RS\7\5\2\2ST\7\4\2\2TU\5\6\4\2UV\7\6\2\2VW\5\4\3"+
		"\2W\13\3\2\2\2X[\5\b\5\2Y[\5\n\6\2ZX\3\2\2\2ZY\3\2\2\2[\r\3\2\2\2\\]\7"+
		"\34\2\2]\17\3\2\2\2^_\7\"\2\2_`\5\16\b\2`a\7\32\2\2af\5\f\7\2bc\7\30\2"+
		"\2ce\5\f\7\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2"+
		"\2\2ij\7\20\2\2j\23\3\2\2\2kl\7\20\2\2l\25\3\2\2\2mn\7\24\2\2n\27\3\2"+
		"\2\2op\7\3\2\2pq\7\4\2\2qr\5\22\n\2r\31\3\2\2\2st\7\5\2\2tu\7\4\2\2uv"+
		"\5\26\f\2vw\7\6\2\2wx\5\24\13\2x\33\3\2\2\2yz\7\24\2\2z\35\3\2\2\2{|\7"+
		"\7\2\2|}\5\34\17\2}\37\3\2\2\2~\u0082\5\30\r\2\177\u0082\5\32\16\2\u0080"+
		"\u0082\5\36\20\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082!\3\2\2\2\u0083\u0084\7!\2\2\u0084#\3\2\2\2\u0085\u0086\7#\2\2\u0086"+
		"\u0087\5\"\22\2\u0087\u0088\7\32\2\2\u0088\u008d\5 \21\2\u0089\u008a\7"+
		"\30\2\2\u008a\u008c\5 \21\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e%\3\2\2\2\u008f\u008d\3\2\2\2"+
		"\u0090\u0091\7\24\2\2\u0091\'\3\2\2\2\u0092\u0093\7\7\2\2\u0093\u0094"+
		"\5&\24\2\u0094)\3\2\2\2\u0095\u0096\7\35\2\2\u0096+\3\2\2\2\u0097\u0098"+
		"\t\2\2\2\u0098-\3\2\2\2\u0099\u009a\t\2\2\2\u009a/\3\2\2\2\u009b\u009c"+
		"\7\r\2\2\u009c\u009d\5,\27\2\u009d\61\3\2\2\2\u009e\u009f\7\16\2\2\u009f"+
		"\u00a0\5.\30\2\u00a0\u00a1\7\6\2\2\u00a1\u00a2\5*\26\2\u00a2\63\3\2\2"+
		"\2\u00a3\u00a7\5\60\31\2\u00a4\u00a7\5\62\32\2\u00a5\u00a7\5(\25\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\65\3\2\2"+
		"\2\u00a8\u00a9\7\23\2\2\u00a9\67\3\2\2\2\u00aa\u00ab\7$\2\2\u00ab\u00ac"+
		"\5\66\34\2\u00ac\u00ad\7\6\2\2\u00ad\u00b2\5\64\33\2\u00ae\u00af\7\30"+
		"\2\2\u00af\u00b1\5\64\33\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b39\3\2\2\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b6\7!\2\2\u00b6;\3\2\2\2\u00b7\u00b8\7!\2\2\u00b8=\3\2\2\2\u00b9"+
		"\u00ba\7%\2\2\u00ba\u00bd\5:\36\2\u00bb\u00bc\7\30\2\2\u00bc\u00be\5:"+
		"\36\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0?\3\2\2\2\u00c1\u00c2\7&\2\2\u00c2\u00c5\5<\37\2\u00c3"+
		"\u00c4\7\30\2\2\u00c4\u00c6\5<\37\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8A\3\2\2\2\u00c9\u00ca"+
		"\7\17\2\2\u00caC\3\2\2\2\u00cb\u00d2\5B\"\2\u00cc\u00d2\5> \2\u00cd\u00d2"+
		"\5@!\2\u00ce\u00d2\58\35\2\u00cf\u00d2\5$\23\2\u00d0\u00d2\5\20\t\2\u00d1"+
		"\u00cb\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\7\26\2\2\u00d4E\3\2\2\2\u00d5\u00d7\5D#\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9G\3\2\2\2"+
		"\fZf\u0081\u008d\u00a6\u00b2\u00bf\u00c7\u00d1\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}