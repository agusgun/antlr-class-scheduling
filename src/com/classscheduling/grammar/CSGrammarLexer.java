// Generated from /home/agus/Project/ClassScheduling/src/main/antlr4/CSGrammar.g4 by ANTLR 4.7
package com.classscheduling.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "LOWERCASE", "UPPERCASE", "LETTER", 
		"TWOLETTER", "DIGIT", "ALPHANUMERIC", "SLASH", "INTEGER_NUMBER", "TWODIGIT", 
		"TWODIGITOPT", "THREELETTER", "WORD", "WHITESPACE", "NEWLINE", "HYPHEN", 
		"COMMA", "EQUAL", "WITH", "COLON", "CLASSROOM", "TIME", "NAME", "LECTURER", 
		"LECTURERS", "LECTURE", "CONFIGURE_COMMAND", "REQUIREMENT_COMMAND", "LECTURER_COMMAND", 
		"PREFER_COMMAND", "CONSTRAINT_COMMAND"
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


	public CSGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00d9\n\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\6\26\u00e7\n\26\r\26"+
		"\16\26\u00e8\3\27\3\27\3\27\3\30\3\30\5\30\u00f0\n\30\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\6\32\u00f8\n\32\r\32\16\32\u00f9\3\33\6\33\u00fd\n\33\r"+
		"\33\16\33\u00fe\3\34\5\34\u0102\n\34\3\34\3\34\5\34\u0106\n\34\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3!\3!\3\"\6\"\u011e\n\"\r\"\16\"\u011f\3#\3#\3#\3#\3$\3$\3$\7$\u0129"+
		"\n$\f$\16$\u012c\13$\6$\u012e\n$\r$\16$\u012f\3%\3%\3&\3&\3&\3&\5&\u0138"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\2\2-"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\20-\21/\22\61\23\63\24\65\25\67\269\27;\30=\31?\32"+
		"A\33C\34E\35G\36I\37K M!O\"Q#S$U%W&\3\2\6\3\2c|\3\2C\\\5\2\62;C\\c|\4"+
		"\2\13\13\"\"\2\u01ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5b\3\2\2\2\7d\3\2\2\2\to\3\2\2"+
		"\2\13q\3\2\2\2\rx\3\2\2\2\17\177\3\2\2\2\21\u0087\3\2\2\2\23\u0091\3\2"+
		"\2\2\25\u009a\3\2\2\2\27\u00a1\3\2\2\2\31\u00b3\3\2\2\2\33\u00c9\3\2\2"+
		"\2\35\u00d2\3\2\2\2\37\u00d4\3\2\2\2!\u00d8\3\2\2\2#\u00da\3\2\2\2%\u00dd"+
		"\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e6\3\2\2\2-\u00ea\3\2\2\2"+
		"/\u00ed\3\2\2\2\61\u00f1\3\2\2\2\63\u00f7\3\2\2\2\65\u00fc\3\2\2\2\67"+
		"\u0105\3\2\2\29\u0107\3\2\2\2;\u010b\3\2\2\2=\u010e\3\2\2\2?\u0112\3\2"+
		"\2\2A\u011a\3\2\2\2C\u011d\3\2\2\2E\u0121\3\2\2\2G\u012d\3\2\2\2I\u0131"+
		"\3\2\2\2K\u0133\3\2\2\2M\u0139\3\2\2\2O\u0140\3\2\2\2Q\u014d\3\2\2\2S"+
		"\u015c\3\2\2\2U\u0168\3\2\2\2W\u0185\3\2\2\2YZ\7E\2\2Z[\7C\2\2[\\\7R\2"+
		"\2\\]\7C\2\2]^\7E\2\2^_\7K\2\2_`\7V\2\2`a\7[\2\2a\4\3\2\2\2bc\7?\2\2c"+
		"\6\3\2\2\2de\7H\2\2ef\7C\2\2fg\7E\2\2gh\7K\2\2hi\7N\2\2ij\7K\2\2jk\7V"+
		"\2\2kl\7K\2\2lm\7G\2\2mn\7U\2\2n\b\3\2\2\2op\7/\2\2p\n\3\2\2\2qr\7I\2"+
		"\2rs\7T\2\2st\7Q\2\2tu\7W\2\2uv\7R\2\2vw\7?\2\2w\f\3\2\2\2xy\7O\2\2yz"+
		"\7Q\2\2z{\7P\2\2{|\7F\2\2|}\7C\2\2}~\7[\2\2~\16\3\2\2\2\177\u0080\7V\2"+
		"\2\u0080\u0081\7W\2\2\u0081\u0082\7G\2\2\u0082\u0083\7U\2\2\u0083\u0084"+
		"\7F\2\2\u0084\u0085\7C\2\2\u0085\u0086\7[\2\2\u0086\20\3\2\2\2\u0087\u0088"+
		"\7Y\2\2\u0088\u0089\7G\2\2\u0089\u008a\7F\2\2\u008a\u008b\7P\2\2\u008b"+
		"\u008c\7G\2\2\u008c\u008d\7U\2\2\u008d\u008e\7F\2\2\u008e\u008f\7C\2\2"+
		"\u008f\u0090\7[\2\2\u0090\22\3\2\2\2\u0091\u0092\7V\2\2\u0092\u0093\7"+
		"J\2\2\u0093\u0094\7W\2\2\u0094\u0095\7T\2\2\u0095\u0096\7U\2\2\u0096\u0097"+
		"\7F\2\2\u0097\u0098\7C\2\2\u0098\u0099\7[\2\2\u0099\24\3\2\2\2\u009a\u009b"+
		"\7H\2\2\u009b\u009c\7T\2\2\u009c\u009d\7K\2\2\u009d\u009e\7F\2\2\u009e"+
		"\u009f\7C\2\2\u009f\u00a0\7[\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7C\2\2\u00a2"+
		"\u00a3\7X\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7N\2\2"+
		"\u00a6\u00a7\7C\2\2\u00a7\u00a8\7D\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa"+
		"\7N\2\2\u00aa\u00ab\7K\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad\7[\2\2\u00ad"+
		"\u00ae\7a\2\2\u00ae\u00af\7F\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1\7[\2\2"+
		"\u00b1\u00b2\7?\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\7C\2\2\u00b4\u00b5\7"+
		"X\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7N\2\2\u00b8\u00b9"+
		"\7C\2\2\u00b9\u00ba\7D\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc\7N\2\2\u00bc"+
		"\u00bd\7K\2\2\u00bd\u00be\7V\2\2\u00be\u00bf\7[\2\2\u00bf\u00c0\7a\2\2"+
		"\u00c0\u00c1\7F\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7[\2\2\u00c3\u00c4"+
		"\7V\2\2\u00c4\u00c5\7K\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c7\7G\2\2\u00c7"+
		"\u00c8\7?\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7U\2\2\u00ca\u00cb\7E\2\2\u00cb"+
		"\u00cc\7J\2\2\u00cc\u00cd\7G\2\2\u00cd\u00ce\7F\2\2\u00ce\u00cf\7W\2\2"+
		"\u00cf\u00d0\7N\2\2\u00d0\u00d1\7G\2\2\u00d1\34\3\2\2\2\u00d2\u00d3\t"+
		"\2\2\2\u00d3\36\3\2\2\2\u00d4\u00d5\t\3\2\2\u00d5 \3\2\2\2\u00d6\u00d9"+
		"\5\37\20\2\u00d7\u00d9\5\35\17\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2"+
		"\2\u00d9\"\3\2\2\2\u00da\u00db\5!\21\2\u00db\u00dc\5!\21\2\u00dc$\3\2"+
		"\2\2\u00dd\u00de\4\62;\2\u00de&\3\2\2\2\u00df\u00e0\t\4\2\2\u00e0(\3\2"+
		"\2\2\u00e1\u00e2\5\65\33\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\5\65\33\2"+
		"\u00e4*\3\2\2\2\u00e5\u00e7\5%\23\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9,\3\2\2\2\u00ea\u00eb"+
		"\5%\23\2\u00eb\u00ec\5%\23\2\u00ec.\3\2\2\2\u00ed\u00ef\5%\23\2\u00ee"+
		"\u00f0\5%\23\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\60\3\2\2"+
		"\2\u00f1\u00f2\5!\21\2\u00f2\u00f3\5!\21\2\u00f3\u00f4\5!\21\2\u00f4\62"+
		"\3\2\2\2\u00f5\u00f8\5!\21\2\u00f6\u00f8\7a\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\64\3\2\2\2\u00fb\u00fd\t\5\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\66\3\2\2\2\u0100"+
		"\u0102\7\17\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3"+
		"\2\2\2\u0103\u0106\7\f\2\2\u0104\u0106\7\17\2\2\u0105\u0101\3\2\2\2\u0105"+
		"\u0104\3\2\2\2\u01068\3\2\2\2\u0107\u0108\5\65\33\2\u0108\u0109\7/\2\2"+
		"\u0109\u010a\5\65\33\2\u010a:\3\2\2\2\u010b\u010c\7.\2\2\u010c\u010d\5"+
		"\65\33\2\u010d<\3\2\2\2\u010e\u010f\5\65\33\2\u010f\u0110\7?\2\2\u0110"+
		"\u0111\5\65\33\2\u0111>\3\2\2\2\u0112\u0113\5\65\33\2\u0113\u0114\7Y\2"+
		"\2\u0114\u0115\7K\2\2\u0115\u0116\7V\2\2\u0116\u0117\7J\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\5\65\33\2\u0119@\3\2\2\2\u011a\u011b\7<\2\2\u011b"+
		"B\3\2\2\2\u011c\u011e\5\'\24\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120D\3\2\2\2\u0121\u0122\5"+
		"/\30\2\u0122\u0123\5A!\2\u0123\u0124\5-\27\2\u0124F\3\2\2\2\u0125\u012e"+
		"\5\63\32\2\u0126\u012a\5\63\32\2\u0127\u0129\5\65\33\2\u0128\u0127\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"H\3\2\2\2\u0131\u0132\5G$\2\u0132J\3\2\2\2\u0133\u0137\5I%\2\u0134\u0135"+
		"\5)\25\2\u0135\u0136\5I%\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138L\3\2\2\2\u0139\u013a\5#\22\2\u013a\u013b\5-\27\2"+
		"\u013b\u013c\5-\27\2\u013c\u013d\5\65\33\2\u013d\u013e\5!\21\2\u013e\u013f"+
		"\5%\23\2\u013fN\3\2\2\2\u0140\u0141\7E\2\2\u0141\u0142\7Q\2\2\u0142\u0143"+
		"\7P\2\2\u0143\u0144\7H\2\2\u0144\u0145\7K\2\2\u0145\u0146\7I\2\2\u0146"+
		"\u0147\7W\2\2\u0147\u0148\7T\2\2\u0148\u0149\7G\2\2\u0149\u014a\7<\2\2"+
		"\u014a\u014b\3\2\2\2\u014b\u014c\5\65\33\2\u014cP\3\2\2\2\u014d\u014e"+
		"\7T\2\2\u014e\u014f\7G\2\2\u014f\u0150\7S\2\2\u0150\u0151\7W\2\2\u0151"+
		"\u0152\7K\2\2\u0152\u0153\7T\2\2\u0153\u0154\7G\2\2\u0154\u0155\7O\2\2"+
		"\u0155\u0156\7G\2\2\u0156\u0157\7P\2\2\u0157\u0158\7V\2\2\u0158\u0159"+
		"\7<\2\2\u0159\u015a\3\2\2\2\u015a\u015b\5\65\33\2\u015bR\3\2\2\2\u015c"+
		"\u015d\7N\2\2\u015d\u015e\7G\2\2\u015e\u015f\7E\2\2\u015f\u0160\7V\2\2"+
		"\u0160\u0161\7W\2\2\u0161\u0162\7T\2\2\u0162\u0163\7G\2\2\u0163\u0164"+
		"\7T\2\2\u0164\u0165\7<\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5\65\33\2\u0167"+
		"T\3\2\2\2\u0168\u0169\7R\2\2\u0169\u016a\7T\2\2\u016a\u016b\7G\2\2\u016b"+
		"\u016c\7H\2\2\u016c\u016d\7G\2\2\u016d\u016e\7T\2\2\u016e\u016f\7<\2\2"+
		"\u016f\u0170\3\2\2\2\u0170\u0171\5\65\33\2\u0171\u0172\7E\2\2\u0172\u0173"+
		"\7Q\2\2\u0173\u0174\7Q\2\2\u0174\u0175\7E\2\2\u0175\u0176\7E\2\2\u0176"+
		"\u0177\7W\2\2\u0177\u0178\7T\2\2\u0178\u0179\3\2\2\2\u0179\u017a\5\65"+
		"\33\2\u017a\u017b\7N\2\2\u017b\u017c\7G\2\2\u017c\u017d\7E\2\2\u017d\u017e"+
		"\7V\2\2\u017e\u017f\7W\2\2\u017f\u0180\7T\2\2\u0180\u0181\7G\2\2\u0181"+
		"\u0182\7U\2\2\u0182\u0183\3\2\2\2\u0183\u0184\5=\37\2\u0184V\3\2\2\2\u0185"+
		"\u0186\7E\2\2\u0186\u0187\7Q\2\2\u0187\u0188\7P\2\2\u0188\u0189\7U\2\2"+
		"\u0189\u018a\7V\2\2\u018a\u018b\7T\2\2\u018b\u018c\7C\2\2\u018c\u018d"+
		"\7K\2\2\u018d\u018e\7P\2\2\u018e\u018f\7V\2\2\u018f\u0190\7<\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0192\5\65\33\2\u0192\u0193\7U\2\2\u0193\u0194\7"+
		"G\2\2\u0194\u0195\7R\2\2\u0195\u0196\7C\2\2\u0196\u0197\7T\2\2\u0197\u0198"+
		"\7C\2\2\u0198\u0199\7V\2\2\u0199\u019a\7G\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\5\65\33\2\u019c\u019d\7N\2\2\u019d\u019e\7G\2\2\u019e\u019f\7E"+
		"\2\2\u019f\u01a0\7V\2\2\u01a0\u01a1\7W\2\2\u01a1\u01a2\7T\2\2\u01a2\u01a3"+
		"\7G\2\2\u01a3\u01a4\7U\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\5=\37\2\u01a6"+
		"X\3\2\2\2\20\2\u00d8\u00e8\u00ef\u00f7\u00f9\u00fe\u0101\u0105\u011f\u012a"+
		"\u012d\u012f\u0137\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}