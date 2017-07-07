// Generated from C:\Users\igorc\Desktop\LFA\tmp\T3\Grammar\train.g4 by ANTLR 4.1

        package train;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class trainLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GETS=1, PLUS=2, MINUS=3, LPAR=4, RPAR=5, LKEYS=6, RKEYS=7, MULT=8, DIVISION=9, 
		LESS=10, GREATER=11, COMAND_END=12, NOT=13, COMMA=14, AND=15, OR=16, EQUALS=17, 
		IF=18, ELSE=19, While=20, SLPIT=21, APPEND=22, REMOVE=23, STRING=24, BOOLEAN=25, 
		INTEGER=26, WAGON=27, TRAIN=28, LOCOM=29, POS=30, BOOL=31, INT=32, STR=33, 
		ID=34, WS=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'*'", "'/'", "'<'", 
		"'>'", "';'", "'!'", "','", "'&&'", "'||'", "'=='", "'if'", "'else'", 
		"'wile'", "'split'", "'append'", "'remove'", "'String'", "'Boolean'", 
		"'Integer'", "'Wagon'", "'Train'", "'Locomotive'", "POS", "BOOL", "INT", 
		"STR", "ID", "WS"
	};
	public static final String[] ruleNames = {
		"NUMBER", "QM", "GETS", "PLUS", "MINUS", "LPAR", "RPAR", "LKEYS", "RKEYS", 
		"MULT", "DIVISION", "LESS", "GREATER", "COMAND_END", "NOT", "COMMA", "AND", 
		"OR", "EQUALS", "IF", "ELSE", "While", "SLPIT", "APPEND", "REMOVE", "STRING", 
		"BOOLEAN", "INTEGER", "WAGON", "TRAIN", "LOCOM", "POS", "BOOL", "INT", 
		"STR", "ID", "WS"
	};


	public trainLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "train.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 36: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2%\u00f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2O\n\2\r\2\16\2P\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u00d1\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00dc\n\"\3#\3#"+
		"\3$\3$\7$\u00e2\n$\f$\16$\u00e5\13$\3$\3$\3%\3%\7%\u00eb\n%\f%\16%\u00ee"+
		"\13%\3&\6&\u00f1\n&\r&\16&\u00f2\3&\3&\2\'\3\2\1\5\2\1\7\3\1\t\4\1\13"+
		"\5\1\r\6\1\17\7\1\21\b\1\23\t\1\25\n\1\27\13\1\31\f\1\33\r\1\35\16\1\37"+
		"\17\1!\20\1#\21\1%\22\1\'\23\1)\24\1+\25\1-\26\1/\27\1\61\30\1\63\31\1"+
		"\65\32\1\67\33\19\34\1;\35\1=\36\1?\37\1A \1C!\1E\"\1G#\1I$\1K%\2\3\2"+
		"\6\3\2\62;\6\2\62;C\\aac|\5\2C\\aac|\5\2\13\f\17\17\"\"\u00f9\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3N\3\2\2"+
		"\2\5R\3\2\2\2\7T\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2"+
		"\2\21^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2"+
		"\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%s\3\2\2\2\'v\3\2\2\2"+
		")y\3\2\2\2+|\3\2\2\2-\u0081\3\2\2\2/\u0086\3\2\2\2\61\u008c\3\2\2\2\63"+
		"\u0093\3\2\2\2\65\u009a\3\2\2\2\67\u00a1\3\2\2\29\u00a9\3\2\2\2;\u00b1"+
		"\3\2\2\2=\u00b7\3\2\2\2?\u00bd\3\2\2\2A\u00d0\3\2\2\2C\u00db\3\2\2\2E"+
		"\u00dd\3\2\2\2G\u00df\3\2\2\2I\u00e8\3\2\2\2K\u00f0\3\2\2\2MO\t\2\2\2"+
		"NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\4\3\2\2\2RS\7$\2\2S\6\3\2\2"+
		"\2TU\7?\2\2U\b\3\2\2\2VW\7-\2\2W\n\3\2\2\2XY\7/\2\2Y\f\3\2\2\2Z[\7*\2"+
		"\2[\16\3\2\2\2\\]\7+\2\2]\20\3\2\2\2^_\7}\2\2_\22\3\2\2\2`a\7\177\2\2"+
		"a\24\3\2\2\2bc\7,\2\2c\26\3\2\2\2de\7\61\2\2e\30\3\2\2\2fg\7>\2\2g\32"+
		"\3\2\2\2hi\7@\2\2i\34\3\2\2\2jk\7=\2\2k\36\3\2\2\2lm\7#\2\2m \3\2\2\2"+
		"no\7.\2\2o\"\3\2\2\2pq\7(\2\2qr\7(\2\2r$\3\2\2\2st\7~\2\2tu\7~\2\2u&\3"+
		"\2\2\2vw\7?\2\2wx\7?\2\2x(\3\2\2\2yz\7k\2\2z{\7h\2\2{*\3\2\2\2|}\7g\2"+
		"\2}~\7n\2\2~\177\7u\2\2\177\u0080\7g\2\2\u0080,\3\2\2\2\u0081\u0082\7"+
		"y\2\2\u0082\u0083\7k\2\2\u0083\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085."+
		"\3\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7r\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7k\2\2\u008a\u008b\7v\2\2\u008b\60\3\2\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7r\2\2\u008e\u008f\7r\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2"+
		"\u0091\u0092\7f\2\2\u0092\62\3\2\2\2\u0093\u0094\7t\2\2\u0094\u0095\7"+
		"g\2\2\u0095\u0096\7o\2\2\u0096\u0097\7q\2\2\u0097\u0098\7x\2\2\u0098\u0099"+
		"\7g\2\2\u0099\64\3\2\2\2\u009a\u009b\7U\2\2\u009b\u009c\7v\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7i\2\2\u00a0"+
		"\66\3\2\2\2\u00a1\u00a2\7D\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7q\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7p\2\2"+
		"\u00a88\3\2\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2"+
		"\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7i\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7Y\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4"+
		"\7i\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7p\2\2\u00b6<\3\2\2\2\u00b7\u00b8"+
		"\7V\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bc\7p\2\2\u00bc>\3\2\2\2\u00bd\u00be\7N\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7e\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3\7q\2\2"+
		"\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7@\3\2\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00d1\7f\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d1\7n\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cc\3\2\2"+
		"\2\u00d1B\3\2\2\2\u00d2\u00d3\7V\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7"+
		"w\2\2\u00d5\u00dc\7g\2\2\u00d6\u00d7\7H\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9"+
		"\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00dc\7g\2\2\u00db\u00d2\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00dcD\3\2\2\2\u00dd\u00de\5\3\2\2\u00deF\3\2\2\2\u00df"+
		"\u00e3\5\5\3\2\u00e0\u00e2\t\3\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\5\5\3\2\u00e7H\3\2\2\2\u00e8\u00ec\t\4\2\2"+
		"\u00e9\u00eb\t\3\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00edJ\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f1\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b&\2\2\u00f5"+
		"L\3\2\2\2\t\2P\u00d0\u00db\u00e3\u00ec\u00f2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}