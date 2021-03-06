// Generated from C:\Users\igorc\Desktop\LFA\tmp\T1\grammar\t1.g4 by ANTLR 4.1
package t1;
import t1.ast.Train;
import java.util.List;
import java.util.LinkedList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class t1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, PLUS=3, LKEYS=4, RKEYS=5, SPLIT=6, MINUS=7, APPEND=8, 
		EQUALS=9, REMOVE=10, COMP_BIGER=11, COMP_SMALLER=12, COMMAND_END=13, IF=14, 
		COMP_DIFF=15, COMP_EQUALS=16, FOR=17, INT=18, ELSE=19, HEAD=20, TAIL=21, 
		TRAIN=22, WAGON=23, LOCOM=24, VALUE=25, ID=26, WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'('", "')'", "PLUS", "'{'", "'}'", "'/'", "MINUS", "APPEND", "'='", "REMOVE", 
		"'>'", "'<'", "';'", "'if'", "'!='", "'=='", "'for'", "'int'", "'else'", 
		"'head'", "'tail'", "'Train'", "'Wagon'", "'Locomotive'", "VALUE", "ID", 
		"WS"
	};
	public static final String[] ruleNames = {
		"LPAR", "RPAR", "PLUS", "LKEYS", "RKEYS", "SPLIT", "MINUS", "APPEND", 
		"EQUALS", "REMOVE", "COMP_BIGER", "COMP_SMALLER", "COMMAND_END", "IF", 
		"COMP_DIFF", "COMP_EQUALS", "FOR", "INT", "ELSE", "HEAD", "TAIL", "TRAIN", 
		"WAGON", "LOCOM", "VALUE", "ID", "WS"
	};


	public t1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "t1.g4"; }

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
		case 26: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\6\32\u008c\n\32\r\32\16\32\u008d\3\33\3\33\7\33\u0092\n\33\f\33"+
		"\16\33\u0095\13\33\3\34\6\34\u0098\n\34\r\34\16\34\u0099\3\34\3\34\2\35"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\2\3\2\6\3\2\62;\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2"+
		"\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2"+
		"\2\27M\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37V\3\2\2\2!Y\3\2\2"+
		"\2#\\\3\2\2\2%`\3\2\2\2\'d\3\2\2\2)i\3\2\2\2+n\3\2\2\2-s\3\2\2\2/y\3\2"+
		"\2\2\61\177\3\2\2\2\63\u008b\3\2\2\2\65\u008f\3\2\2\2\67\u0097\3\2\2\2"+
		"9:\7*\2\2:\4\3\2\2\2;<\7+\2\2<\6\3\2\2\2=>\7-\2\2>\b\3\2\2\2?@\7}\2\2"+
		"@\n\3\2\2\2AB\7\177\2\2B\f\3\2\2\2CD\7\61\2\2D\16\3\2\2\2EF\7/\2\2F\20"+
		"\3\2\2\2GH\7-\2\2H\22\3\2\2\2IJ\7?\2\2J\24\3\2\2\2KL\7/\2\2L\26\3\2\2"+
		"\2MN\7@\2\2N\30\3\2\2\2OP\7>\2\2P\32\3\2\2\2QR\7=\2\2R\34\3\2\2\2ST\7"+
		"k\2\2TU\7h\2\2U\36\3\2\2\2VW\7#\2\2WX\7?\2\2X \3\2\2\2YZ\7?\2\2Z[\7?\2"+
		"\2[\"\3\2\2\2\\]\7h\2\2]^\7q\2\2^_\7t\2\2_$\3\2\2\2`a\7k\2\2ab\7p\2\2"+
		"bc\7v\2\2c&\3\2\2\2de\7g\2\2ef\7n\2\2fg\7u\2\2gh\7g\2\2h(\3\2\2\2ij\7"+
		"j\2\2jk\7g\2\2kl\7c\2\2lm\7f\2\2m*\3\2\2\2no\7v\2\2op\7c\2\2pq\7k\2\2"+
		"qr\7n\2\2r,\3\2\2\2st\7V\2\2tu\7t\2\2uv\7c\2\2vw\7k\2\2wx\7p\2\2x.\3\2"+
		"\2\2yz\7Y\2\2z{\7c\2\2{|\7i\2\2|}\7q\2\2}~\7p\2\2~\60\3\2\2\2\177\u0080"+
		"\7N\2\2\u0080\u0081\7q\2\2\u0081\u0082\7e\2\2\u0082\u0083\7q\2\2\u0083"+
		"\u0084\7o\2\2\u0084\u0085\7q\2\2\u0085\u0086\7v\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u0088\7x\2\2\u0088\u0089\7g\2\2\u0089\62\3\2\2\2\u008a\u008c\t"+
		"\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\64\3\2\2\2\u008f\u0093\t\3\2\2\u0090\u0092\t\4\2"+
		"\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\66\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\t\5\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\34\2\2\u009c8\3\2\2\2\6\2\u008d"+
		"\u0093\u0099";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}