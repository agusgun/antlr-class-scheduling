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
		RULE_amount = 0, RULE_facilities = 1, RULE_capacity_config = 2, RULE_facilities_config = 3, 
		RULE_class_config = 4, RULE_classroom = 5, RULE_define_class_config = 6, 
		RULE_group = 7, RULE_group_config = 8, RULE_lecture_requirement = 9, RULE_lecture = 10, 
		RULE_define_lecture_requirement = 11, RULE_time = 12, RULE_day = 13, RULE_availability_day = 14, 
		RULE_availability_day_time = 15, RULE_lecturer_details = 16, RULE_lecturer = 17, 
		RULE_define_lecturer = 18, RULE_prefer_cooccurrence = 19, RULE_constraint_separation = 20, 
		RULE_schedule = 21, RULE_entry = 22, RULE_main = 23;
	public static final String[] ruleNames = {
		"amount", "facilities", "capacity_config", "facilities_config", "class_config", 
		"classroom", "define_class_config", "group", "group_config", "lecture_requirement", 
		"lecture", "define_lecture_requirement", "time", "day", "availability_day", 
		"availability_day_time", "lecturer_details", "lecturer", "define_lecturer", 
		"prefer_cooccurrence", "constraint_separation", "schedule", "entry", "main"
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
	public static class AmountContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(CSGrammarParser.INTEGER_NUMBER, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitAmount(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_amount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
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

	public static class FacilitiesContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSGrammarParser.WORD, 0); }
		public FacilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterFacilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitFacilities(this);
		}
	}

	public final FacilitiesContext facilities() throws RecognitionException {
		FacilitiesContext _localctx = new FacilitiesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_facilities);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
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

	public static class Capacity_configContext extends ParserRuleContext {
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public Capacity_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capacity_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterCapacity_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitCapacity_config(this);
		}
	}

	public final Capacity_configContext capacity_config() throws RecognitionException {
		Capacity_configContext _localctx = new Capacity_configContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_capacity_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(T__1);
			setState(54);
			amount();
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

	public static class Facilities_configContext extends ParserRuleContext {
		public FacilitiesContext facilities() {
			return getRuleContext(FacilitiesContext.class,0);
		}
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public Facilities_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facilities_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterFacilities_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitFacilities_config(this);
		}
	}

	public final Facilities_configContext facilities_config() throws RecognitionException {
		Facilities_configContext _localctx = new Facilities_configContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_facilities_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(57);
			match(T__1);
			setState(58);
			facilities();
			setState(59);
			match(T__3);
			setState(60);
			amount();
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
		public Capacity_configContext capacity_config() {
			return getRuleContext(Capacity_configContext.class,0);
		}
		public Facilities_configContext facilities_config() {
			return getRuleContext(Facilities_configContext.class,0);
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
		enterRule(_localctx, 8, RULE_class_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(62);
				capacity_config();
				}
				break;
			case T__2:
				{
				setState(63);
				facilities_config();
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

	public static class ClassroomContext extends ParserRuleContext {
		public TerminalNode CLASSROOM() { return getToken(CSGrammarParser.CLASSROOM, 0); }
		public ClassroomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classroom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterClassroom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitClassroom(this);
		}
	}

	public final ClassroomContext classroom() throws RecognitionException {
		ClassroomContext _localctx = new ClassroomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classroom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		public ClassroomContext classroom() {
			return getRuleContext(ClassroomContext.class,0);
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
		enterRule(_localctx, 12, RULE_define_class_config);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CONFIGURE_COMMAND);
			setState(69);
			classroom();
			setState(70);
			match(WITH);
			setState(71);
			class_config();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				class_config();
				}
				}
				setState(78);
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(CSGrammarParser.WORD, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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

	public static class Group_configContext extends ParserRuleContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public Group_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterGroup_config(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitGroup_config(this);
		}
	}

	public final Group_configContext group_config() throws RecognitionException {
		Group_configContext _localctx = new Group_configContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_group_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
			setState(82);
			group();
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
		public Capacity_configContext capacity_config() {
			return getRuleContext(Capacity_configContext.class,0);
		}
		public Facilities_configContext facilities_config() {
			return getRuleContext(Facilities_configContext.class,0);
		}
		public Group_configContext group_config() {
			return getRuleContext(Group_configContext.class,0);
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
		enterRule(_localctx, 18, RULE_lecture_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(84);
				capacity_config();
				}
				break;
			case T__2:
				{
				setState(85);
				facilities_config();
				}
				break;
			case T__4:
				{
				setState(86);
				group_config();
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
		enterRule(_localctx, 20, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
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
		enterRule(_localctx, 22, RULE_define_lecture_requirement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(REQUIREMENT_COMMAND);
			setState(92);
			lecture();
			setState(93);
			match(WITH);
			setState(94);
			lecture_requirement();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				lecture_requirement();
				}
				}
				setState(101);
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
		enterRule(_localctx, 24, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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

	public static class DayContext extends ParserRuleContext {
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSGrammarListener ) ((CSGrammarListener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_day);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
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
		enterRule(_localctx, 28, RULE_availability_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__10);
			setState(107);
			day();
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
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
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
		enterRule(_localctx, 30, RULE_availability_day_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__11);
			setState(110);
			day();
			setState(111);
			match(T__3);
			setState(112);
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
		public Group_configContext group_config() {
			return getRuleContext(Group_configContext.class,0);
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
		enterRule(_localctx, 32, RULE_lecturer_details);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(114);
				availability_day();
				}
				break;
			case T__11:
				{
				setState(115);
				availability_day_time();
				}
				break;
			case T__4:
				{
				setState(116);
				group_config();
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
		enterRule(_localctx, 34, RULE_lecturer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 36, RULE_define_lecturer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LECTURER_COMMAND);
			setState(122);
			lecturer();
			setState(123);
			match(T__3);
			setState(124);
			lecturer_details();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				lecturer_details();
				}
				}
				setState(131);
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

	public static class Prefer_cooccurrenceContext extends ParserRuleContext {
		public TerminalNode PREFER_COMMAND() { return getToken(CSGrammarParser.PREFER_COMMAND, 0); }
		public List<LectureContext> lecture() {
			return getRuleContexts(LectureContext.class);
		}
		public LectureContext lecture(int i) {
			return getRuleContext(LectureContext.class,i);
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
		enterRule(_localctx, 38, RULE_prefer_cooccurrence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(PREFER_COMMAND);
			setState(133);
			lecture();
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				lecture();
				}
				}
				setState(138); 
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
		public List<LectureContext> lecture() {
			return getRuleContexts(LectureContext.class);
		}
		public LectureContext lecture(int i) {
			return getRuleContext(LectureContext.class,i);
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
		enterRule(_localctx, 40, RULE_constraint_separation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CONSTRAINT_COMMAND);
			setState(141);
			lecture();
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				lecture();
				}
				}
				setState(146); 
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
		enterRule(_localctx, 42, RULE_schedule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		enterRule(_localctx, 44, RULE_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(150);
				schedule();
				}
				break;
			case PREFER_COMMAND:
				{
				setState(151);
				prefer_cooccurrence();
				}
				break;
			case CONSTRAINT_COMMAND:
				{
				setState(152);
				constraint_separation();
				}
				break;
			case LECTURER_COMMAND:
				{
				setState(153);
				define_lecturer();
				}
				break;
			case REQUIREMENT_COMMAND:
				{
				setState(154);
				define_lecture_requirement();
				}
				break;
			case CONFIGURE_COMMAND:
				{
				setState(155);
				define_class_config();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
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
		enterRule(_localctx, 46, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				entry();
				}
				}
				setState(163); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6C"+
		"\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\5\13Z\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\rd\n\r\f\r\16\rg\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\5\22x\n\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0082\n\24\f\24\16\24\u0085\13\24\3\25\3\25\3\25\3\25"+
		"\6\25\u008b\n\25\r\25\16\25\u008c\3\26\3\26\3\26\3\26\6\26\u0093\n\26"+
		"\r\26\16\26\u0094\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u009f\n"+
		"\30\3\30\3\30\3\31\6\31\u00a4\n\31\r\31\16\31\u00a5\3\31\2\2\32\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2\b\f\2\u009f\2\62"+
		"\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b:\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16"+
		"F\3\2\2\2\20Q\3\2\2\2\22S\3\2\2\2\24Y\3\2\2\2\26[\3\2\2\2\30]\3\2\2\2"+
		"\32h\3\2\2\2\34j\3\2\2\2\36l\3\2\2\2 o\3\2\2\2\"w\3\2\2\2$y\3\2\2\2&{"+
		"\3\2\2\2(\u0086\3\2\2\2*\u008e\3\2\2\2,\u0096\3\2\2\2.\u009e\3\2\2\2\60"+
		"\u00a3\3\2\2\2\62\63\7\20\2\2\63\3\3\2\2\2\64\65\7\24\2\2\65\5\3\2\2\2"+
		"\66\67\7\3\2\2\678\7\4\2\289\5\2\2\29\7\3\2\2\2:;\7\5\2\2;<\7\4\2\2<="+
		"\5\4\3\2=>\7\6\2\2>?\5\2\2\2?\t\3\2\2\2@C\5\6\4\2AC\5\b\5\2B@\3\2\2\2"+
		"BA\3\2\2\2C\13\3\2\2\2DE\7\34\2\2E\r\3\2\2\2FG\7\"\2\2GH\5\f\7\2HI\7\32"+
		"\2\2IN\5\n\6\2JK\7\30\2\2KM\5\n\6\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2O\17\3\2\2\2PN\3\2\2\2QR\7\24\2\2R\21\3\2\2\2ST\7\7\2\2TU\5\20\t"+
		"\2U\23\3\2\2\2VZ\5\6\4\2WZ\5\b\5\2XZ\5\22\n\2YV\3\2\2\2YW\3\2\2\2YX\3"+
		"\2\2\2Z\25\3\2\2\2[\\\7!\2\2\\\27\3\2\2\2]^\7#\2\2^_\5\26\f\2_`\7\32\2"+
		"\2`e\5\24\13\2ab\7\30\2\2bd\5\24\13\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2f\31\3\2\2\2ge\3\2\2\2hi\7\35\2\2i\33\3\2\2\2jk\t\2\2\2k\35\3"+
		"\2\2\2lm\7\r\2\2mn\5\34\17\2n\37\3\2\2\2op\7\16\2\2pq\5\34\17\2qr\7\6"+
		"\2\2rs\5\32\16\2s!\3\2\2\2tx\5\36\20\2ux\5 \21\2vx\5\22\n\2wt\3\2\2\2"+
		"wu\3\2\2\2wv\3\2\2\2x#\3\2\2\2yz\7\23\2\2z%\3\2\2\2{|\7$\2\2|}\5$\23\2"+
		"}~\7\6\2\2~\u0083\5\"\22\2\177\u0080\7\30\2\2\u0080\u0082\5\"\22\2\u0081"+
		"\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\'\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7%\2\2\u0087\u008a"+
		"\5\26\f\2\u0088\u0089\7\30\2\2\u0089\u008b\5\26\f\2\u008a\u0088\3\2\2"+
		"\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d)"+
		"\3\2\2\2\u008e\u008f\7&\2\2\u008f\u0092\5\26\f\2\u0090\u0091\7\30\2\2"+
		"\u0091\u0093\5\26\f\2\u0092\u0090\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095+\3\2\2\2\u0096\u0097\7\17\2\2\u0097"+
		"-\3\2\2\2\u0098\u009f\5,\27\2\u0099\u009f\5(\25\2\u009a\u009f\5*\26\2"+
		"\u009b\u009f\5&\24\2\u009c\u009f\5\30\r\2\u009d\u009f\5\16\b\2\u009e\u0098"+
		"\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\26"+
		"\2\2\u00a1/\3\2\2\2\u00a2\u00a4\5.\30\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\61\3\2\2\2\fBN"+
		"Yew\u0083\u008c\u0094\u009e\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}