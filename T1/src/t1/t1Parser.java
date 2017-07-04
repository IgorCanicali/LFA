// Generated from C:\Users\igorc\Desktop\LFA\tmp\T1\grammar\t1.g4 by ANTLR 4.1
package t1;
import t1.ast.Train;
import java.util.List;
import java.util.LinkedList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class t1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAR=1, RPAR=2, PLUS=3, LKEYS=4, RKEYS=5, SPLIT=6, MINUS=7, APPEND=8, 
		EQUALS=9, REMOVE=10, COMP_BIGER=11, COMP_SMALLER=12, COMMAND_END=13, IF=14, 
		COMP_DIFF=15, COMP_EQUALS=16, FOR=17, INT=18, ELSE=19, HEAD=20, TAIL=21, 
		TRAIN=22, WAGON=23, LOCOM=24, VALUE=25, ID=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "PLUS", "'{'", "'}'", "'/'", "MINUS", "APPEND", 
		"'='", "REMOVE", "'>'", "'<'", "';'", "'if'", "'!='", "'=='", "'for'", 
		"'int'", "'else'", "'head'", "'tail'", "'Train'", "'Wagon'", "'Locomotive'", 
		"VALUE", "ID", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_var_dec = 2, RULE_assignment = 3, RULE_control_structure = 4, 
		RULE_function = 5, RULE_type = 6, RULE_math = 7, RULE_comparable = 8, 
		RULE_position = 9, RULE_parameter = 10;
	public static final String[] ruleNames = {
		"prog", "code", "var_dec", "assignment", "control_structure", "function", 
		"type", "math", "comparable", "position", "parameter"
	};

	@Override
	public String getGrammarFileName() { return "t1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public t1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); code();
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

	public static class CodeContext extends ParserRuleContext {
		public List<Control_structureContext> control_structure() {
			return getRuleContexts(Control_structureContext.class);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<Var_decContext> var_dec() {
			return getRuleContexts(Var_decContext.class);
		}
		public Var_decContext var_dec(int i) {
			return getRuleContext(Var_decContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public Control_structureContext control_structure(int i) {
			return getRuleContext(Control_structureContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRAIN) | (1L << WAGON) | (1L << LOCOM))) != 0)) {
				{
				{
				setState(24); var_dec();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ID))) != 0)) {
				{
				setState(33);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(30); assignment();
					}
					break;

				case 2:
					{
					setState(31); control_structure();
					}
					break;

				case 3:
					{
					setState(32); function();
					}
					break;
				}
				}
				setState(37);
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

	public static class Var_decContext extends ParserRuleContext {
		public Definition result;
		public TypeContext t;
		public Token var;
		public Token val;
		public TerminalNode COMMAND_END() { return getToken(t1Parser.COMMAND_END, 0); }
		public TerminalNode ID() { return getToken(t1Parser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(t1Parser.EQUALS, 0); }
		public TerminalNode VALUE() { return getToken(t1Parser.VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_dec);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); ((Var_decContext)_localctx).t = type();
				setState(39); ((Var_decContext)_localctx).var = match(ID);
				setState(40); match(COMMAND_END);
				_localctx.result = new Definiton(((Var_decContext)_localctx).t.result, (((Var_decContext)_localctx).var!=null?((Var_decContext)_localctx).var.getText():null))
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); ((Var_decContext)_localctx).t = type();
				setState(44); ((Var_decContext)_localctx).var = match(ID);
				setState(45); match(EQUALS);
				setState(46); ((Var_decContext)_localctx).val = match(VALUE);
				setState(47); match(COMMAND_END);
				_localctx.result = new Definiton(((Var_decContext)_localctx).t.result, (((Var_decContext)_localctx).var!=null?((Var_decContext)_localctx).var.getText():null), (((Var_decContext)_localctx).val!=null?((Var_decContext)_localctx).val.getText():null))
				}
				break;
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(t1Parser.ID); }
		public TerminalNode EQUALS() { return getToken(t1Parser.EQUALS, 0); }
		public TerminalNode COMMAND_END() { return getToken(t1Parser.COMMAND_END, 0); }
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public TerminalNode SPLIT() { return getToken(t1Parser.SPLIT, 0); }
		public TerminalNode VALUE() { return getToken(t1Parser.VALUE, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(t1Parser.ID, i);
		}
		public TerminalNode REMOVE() { return getToken(t1Parser.REMOVE, 0); }
		public TerminalNode APPEND() { return getToken(t1Parser.APPEND, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(75);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(ID);
				setState(53); match(EQUALS);
				setState(57);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(54); match(ID);
					}
					break;

				case 2:
					{
					setState(55); match(VALUE);
					}
					break;

				case 3:
					{
					setState(56); math();
					}
					break;
				}
				setState(59); match(COMMAND_END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); match(ID);
				setState(61); match(SPLIT);
				setState(62); match(VALUE);
				setState(63); match(COMMAND_END);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64); match(ID);
				setState(65); match(REMOVE);
				setState(66); position();
				setState(67); match(COMMAND_END);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); match(ID);
				setState(70); match(APPEND);
				setState(71); position();
				setState(72); match(ID);
				setState(73); match(COMMAND_END);
				}
				break;
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

	public static class Control_structureContext extends ParserRuleContext {
		public ComparableContext comparable() {
			return getRuleContext(ComparableContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(t1Parser.ELSE, 0); }
		public List<TerminalNode> COMMAND_END() { return getTokens(t1Parser.COMMAND_END); }
		public TerminalNode IF() { return getToken(t1Parser.IF, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public TerminalNode FOR() { return getToken(t1Parser.FOR, 0); }
		public TerminalNode ID(int i) {
			return getToken(t1Parser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(t1Parser.LPAR, 0); }
		public TerminalNode RKEYS(int i) {
			return getToken(t1Parser.RKEYS, i);
		}
		public TerminalNode INT() { return getToken(t1Parser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(t1Parser.ID); }
		public List<TerminalNode> EQUALS() { return getTokens(t1Parser.EQUALS); }
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<TerminalNode> RKEYS() { return getTokens(t1Parser.RKEYS); }
		public List<TerminalNode> LKEYS() { return getTokens(t1Parser.LKEYS); }
		public TerminalNode LKEYS(int i) {
			return getToken(t1Parser.LKEYS, i);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(t1Parser.EQUALS, i);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public List<TerminalNode> VALUE() { return getTokens(t1Parser.VALUE); }
		public TerminalNode RPAR() { return getToken(t1Parser.RPAR, 0); }
		public TerminalNode COMMAND_END(int i) {
			return getToken(t1Parser.COMMAND_END, i);
		}
		public TerminalNode VALUE(int i) {
			return getToken(t1Parser.VALUE, i);
		}
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_control_structure);
		int _la;
		try {
			setState(115);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); match(IF);
				setState(78); match(LPAR);
				setState(79); match(ID);
				setState(80); comparable();
				setState(81); match(ID);
				setState(82); match(RPAR);
				setState(83); match(LKEYS);
				setState(84); code();
				setState(85); match(RKEYS);
				setState(91);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(86); match(ELSE);
					setState(87); match(LKEYS);
					setState(88); code();
					setState(89); match(RKEYS);
					}
				}

				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(FOR);
				{
				setState(95);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(94); match(INT);
					}
				}

				setState(97); match(ID);
				setState(100);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(98); match(EQUALS);
					setState(99); match(VALUE);
					}
				}

				setState(102); match(COMMAND_END);
				setState(103); match(ID);
				setState(104); comparable();
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(106); match(COMMAND_END);
				setState(107); match(ID);
				setState(108); match(EQUALS);
				setState(109); math();
				}
				setState(111); match(LKEYS);
				setState(112); code();
				setState(113); match(RKEYS);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(t1Parser.ID, 0); }
		public TerminalNode COMMAND_END() { return getToken(t1Parser.COMMAND_END, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(t1Parser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(t1Parser.RPAR, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(ID);
			setState(118); match(LPAR);
			setState(120);
			_la = _input.LA(1);
			if (_la==VALUE || _la==ID) {
				{
				setState(119); parameter();
				}
			}

			setState(122); match(RPAR);
			setState(123); match(COMMAND_END);
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

	public static class TypeContext extends ParserRuleContext {
		public Type result;
		public Token tt;
		public Token tw;
		public Token tl;
		public Token ti;
		public TerminalNode LOCOM() { return getToken(t1Parser.LOCOM, 0); }
		public TerminalNode TRAIN() { return getToken(t1Parser.TRAIN, 0); }
		public TerminalNode WAGON() { return getToken(t1Parser.WAGON, 0); }
		public TerminalNode INT() { return getToken(t1Parser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case TRAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); ((TypeContext)_localctx).tt = match(TRAIN);
				_localctx.result = new Type((((TypeContext)_localctx).tt!=null?((TypeContext)_localctx).tt.getText():null))
				}
				break;
			case WAGON:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); ((TypeContext)_localctx).tw = match(WAGON);
				_localctx.result = new Type((((TypeContext)_localctx).tw!=null?((TypeContext)_localctx).tw.getText():null))
				}
				break;
			case LOCOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(129); ((TypeContext)_localctx).tl = match(LOCOM);
				_localctx.result = new Type((((TypeContext)_localctx).tl!=null?((TypeContext)_localctx).tl.getText():null))
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(131); ((TypeContext)_localctx).ti = match(INT);
				_localctx.result = new Type((((TypeContext)_localctx).ti!=null?((TypeContext)_localctx).ti.getText():null))
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MathContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(t1Parser.ID); }
		public TerminalNode MINUS(int i) {
			return getToken(t1Parser.MINUS, i);
		}
		public List<TerminalNode> VALUE() { return getTokens(t1Parser.VALUE); }
		public TerminalNode ID(int i) {
			return getToken(t1Parser.ID, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(t1Parser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(t1Parser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(t1Parser.PLUS, i);
		}
		public TerminalNode VALUE(int i) {
			return getToken(t1Parser.VALUE, i);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(137);
				_la = _input.LA(1);
				if ( !(_la==VALUE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(142);
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

	public static class ComparableContext extends ParserRuleContext {
		public TerminalNode COMP_EQUALS() { return getToken(t1Parser.COMP_EQUALS, 0); }
		public TerminalNode COMP_DIFF() { return getToken(t1Parser.COMP_DIFF, 0); }
		public TerminalNode COMP_SMALLER() { return getToken(t1Parser.COMP_SMALLER, 0); }
		public TerminalNode COMP_BIGER() { return getToken(t1Parser.COMP_BIGER, 0); }
		public ComparableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparable; }
	}

	public final ComparableContext comparable() throws RecognitionException {
		ComparableContext _localctx = new ComparableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMP_BIGER) | (1L << COMP_SMALLER) | (1L << COMP_DIFF) | (1L << COMP_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode TAIL() { return getToken(t1Parser.TAIL, 0); }
		public TerminalNode HEAD() { return getToken(t1Parser.HEAD, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_position);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !(_la==HEAD || _la==TAIL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(t1Parser.ID, 0); }
		public TerminalNode VALUE() { return getToken(t1Parser.VALUE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\35\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\3\3\7\3"+
		"$\n\3\f\3\16\3\'\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\65\n\4\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\6\3\6\5\6b\n\6\3\6\3\6\3\6\5"+
		"\6g\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6v\n\6\3"+
		"\7\3\7\3\7\5\7{\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0088"+
		"\n\b\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090\13\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\6\3\2\33\34\4\2\5\5\t\t\4"+
		"\2\r\16\21\22\3\2\26\27\u009f\2\30\3\2\2\2\4\35\3\2\2\2\6\64\3\2\2\2\b"+
		"M\3\2\2\2\nu\3\2\2\2\fw\3\2\2\2\16\u0087\3\2\2\2\20\u0089\3\2\2\2\22\u0091"+
		"\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2"+
		"\32\34\5\6\4\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2"+
		"\36%\3\2\2\2\37\35\3\2\2\2 $\5\b\5\2!$\5\n\6\2\"$\5\f\7\2# \3\2\2\2#!"+
		"\3\2\2\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2"+
		"\2()\5\16\b\2)*\7\34\2\2*+\7\17\2\2+,\b\4\1\2,\65\3\2\2\2-.\5\16\b\2."+
		"/\7\34\2\2/\60\7\13\2\2\60\61\7\33\2\2\61\62\7\17\2\2\62\63\b\4\1\2\63"+
		"\65\3\2\2\2\64(\3\2\2\2\64-\3\2\2\2\65\7\3\2\2\2\66\67\7\34\2\2\67;\7"+
		"\13\2\28<\7\34\2\29<\7\33\2\2:<\5\20\t\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2"+
		"<=\3\2\2\2=N\7\17\2\2>?\7\34\2\2?@\7\b\2\2@A\7\33\2\2AN\7\17\2\2BC\7\34"+
		"\2\2CD\7\f\2\2DE\5\24\13\2EF\7\17\2\2FN\3\2\2\2GH\7\34\2\2HI\7\n\2\2I"+
		"J\5\24\13\2JK\7\34\2\2KL\7\17\2\2LN\3\2\2\2M\66\3\2\2\2M>\3\2\2\2MB\3"+
		"\2\2\2MG\3\2\2\2N\t\3\2\2\2OP\7\20\2\2PQ\7\3\2\2QR\7\34\2\2RS\5\22\n\2"+
		"ST\7\34\2\2TU\7\4\2\2UV\7\6\2\2VW\5\4\3\2W]\7\7\2\2XY\7\25\2\2YZ\7\6\2"+
		"\2Z[\5\4\3\2[\\\7\7\2\2\\^\3\2\2\2]X\3\2\2\2]^\3\2\2\2^v\3\2\2\2_a\7\23"+
		"\2\2`b\7\24\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cf\7\34\2\2de\7\13\2\2eg"+
		"\7\33\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\17\2\2ij\7\34\2\2jk\5\22\n"+
		"\2kl\t\2\2\2lm\7\17\2\2mn\7\34\2\2no\7\13\2\2op\5\20\t\2pq\3\2\2\2qr\7"+
		"\6\2\2rs\5\4\3\2st\7\7\2\2tv\3\2\2\2uO\3\2\2\2u_\3\2\2\2v\13\3\2\2\2w"+
		"x\7\34\2\2xz\7\3\2\2y{\5\26\f\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\4\2"+
		"\2}~\7\17\2\2~\r\3\2\2\2\177\u0080\7\30\2\2\u0080\u0088\b\b\1\2\u0081"+
		"\u0082\7\31\2\2\u0082\u0088\b\b\1\2\u0083\u0084\7\32\2\2\u0084\u0088\b"+
		"\b\1\2\u0085\u0086\7\24\2\2\u0086\u0088\b\b\1\2\u0087\177\3\2\2\2\u0087"+
		"\u0081\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0085\3\2\2\2\u0088\17\3\2\2"+
		"\2\u0089\u008e\t\2\2\2\u008a\u008b\t\3\2\2\u008b\u008d\t\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\t\4\2\2\u0092\23\3\2\2\2\u0093"+
		"\u0094\t\5\2\2\u0094\25\3\2\2\2\u0095\u0096\t\2\2\2\u0096\27\3\2\2\2\17"+
		"\35#%\64;M]afuz\u0087\u008e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}