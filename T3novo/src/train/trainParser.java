// Generated from C:\Users\igorc\Desktop\LFA\tmp\T3\Grammar\train.g4 by ANTLR 4.1

        package train;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class trainParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GETS=1, PLUS=2, MINUS=3, LPAR=4, RPAR=5, LKEYS=6, RKEYS=7, MULT=8, DIVISION=9, 
		LESS=10, GREATER=11, COMAND_END=12, NOT=13, COMMA=14, AND=15, OR=16, EQUALS=17, 
		IF=18, ELSE=19, While=20, SLPIT=21, APPEND=22, REMOVE=23, STRING=24, BOOLEAN=25, 
		INTEGER=26, WAGON=27, TRAIN=28, LOCOM=29, POS=30, BOOL=31, INT=32, STR=33, 
		ID=34, WS=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "'+'", "'-'", "'('", "')'", "'{'", "'}'", "'*'", "'/'", 
		"'<'", "'>'", "';'", "'!'", "','", "'&&'", "'||'", "'=='", "'if'", "'else'", 
		"'wile'", "'split'", "'append'", "'remove'", "'String'", "'Boolean'", 
		"'Integer'", "'Wagon'", "'Train'", "'Locomotive'", "POS", "BOOL", "INT", 
		"STR", "ID", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_definition = 2, RULE_train_operation = 3, 
		RULE_assignment = 4, RULE_control_structure = 5, RULE_function_call = 6, 
		RULE_math_operations = 7, RULE_math_op1 = 8, RULE_logical = 9, RULE_logical_operation = 10, 
		RULE_compare_operation = 11, RULE_value = 12, RULE_data = 13, RULE_type = 14, 
		RULE_primitive_type = 15, RULE_object_type = 16;
	public static final String[] ruleNames = {
		"prog", "code", "definition", "train_operation", "assignment", "control_structure", 
		"function_call", "math_operations", "math_op1", "logical", "logical_operation", 
		"compare_operation", "value", "data", "type", "primitive_type", "object_type"
	};

	@Override
	public String getGrammarFileName() { return "train.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public trainParser(TokenStream input) {
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
			setState(34); code();
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
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<Control_structureContext> control_structure() {
			return getRuleContexts(Control_structureContext.class);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<Train_operationContext> train_operation() {
			return getRuleContexts(Train_operationContext.class);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public Train_operationContext train_operation(int i) {
			return getRuleContext(Train_operationContext.class,i);
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << While) | (1L << STRING) | (1L << BOOLEAN) | (1L << INTEGER) | (1L << WAGON) | (1L << TRAIN) | (1L << LOCOM) | (1L << ID))) != 0)) {
				{
				setState(41);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(36); definition();
					}
					break;

				case 2:
					{
					setState(37); train_operation();
					}
					break;

				case 3:
					{
					setState(38); assignment();
					}
					break;

				case 4:
					{
					setState(39); control_structure();
					}
					break;

				case 5:
					{
					setState(40); function_call();
					}
					break;
				}
				}
				setState(45);
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

	public static class DefinitionContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode ID() { return getToken(trainParser.ID, 0); }
		public TerminalNode GETS() { return getToken(trainParser.GETS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); type();
			setState(47); match(ID);
			setState(50);
			_la = _input.LA(1);
			if (_la==GETS) {
				{
				setState(48); match(GETS);
				setState(49); data();
				}
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

	public static class Train_operationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(trainParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(trainParser.ID, i);
		}
		public TerminalNode SLPIT() { return getToken(trainParser.SLPIT, 0); }
		public TerminalNode REMOVE() { return getToken(trainParser.REMOVE, 0); }
		public TerminalNode INT() { return getToken(trainParser.INT, 0); }
		public TerminalNode APPEND() { return getToken(trainParser.APPEND, 0); }
		public TerminalNode POS() { return getToken(trainParser.POS, 0); }
		public TerminalNode COMAND_END() { return getToken(trainParser.COMAND_END, 0); }
		public Train_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_train_operation; }
	}

	public final Train_operationContext train_operation() throws RecognitionException {
		Train_operationContext _localctx = new Train_operationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_train_operation);
		try {
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); match(ID);
				setState(53); match(SLPIT);
				setState(54); match(INT);
				setState(55); match(COMAND_END);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56); match(ID);
				setState(57); match(APPEND);
				setState(58); match(ID);
				setState(59); match(POS);
				setState(60); match(COMAND_END);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); match(ID);
				setState(62); match(REMOVE);
				setState(63); match(POS);
				setState(64); match(COMAND_END);
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
		public Assignment result;
		public Token ID;
		public ValueContext value;
		public Math_operationsContext math_operations;
		public TerminalNode ID() { return getToken(trainParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode GETS() { return getToken(trainParser.GETS, 0); }
		public Math_operationsContext math_operations() {
			return getRuleContext(Math_operationsContext.class,0);
		}
		public TerminalNode COMAND_END() { return getToken(trainParser.COMAND_END, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); ((AssignmentContext)_localctx).ID = match(ID);
				setState(68); match(GETS);
				setState(69); ((AssignmentContext)_localctx).value = value();
				setState(70); match(COMAND_END);
				((AssignmentContext)_localctx).result =  new Assignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).value.result);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); ((AssignmentContext)_localctx).ID = match(ID);
				setState(74); match(GETS);
				setState(75); ((AssignmentContext)_localctx).math_operations = math_operations();
				setState(76); match(COMAND_END);
				((AssignmentContext)_localctx).result =  new Assignment((((AssignmentContext)_localctx).ID!=null?((AssignmentContext)_localctx).ID.getText():null), ((AssignmentContext)_localctx).math_operations.result);
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
		public TerminalNode While() { return getToken(trainParser.While, 0); }
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(trainParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(trainParser.IF, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<TerminalNode> RKEYS() { return getTokens(trainParser.RKEYS); }
		public List<TerminalNode> LKEYS() { return getTokens(trainParser.LKEYS); }
		public TerminalNode LKEYS(int i) {
			return getToken(trainParser.LKEYS, i);
		}
		public TerminalNode RKEYS(int i) {
			return getToken(trainParser.RKEYS, i);
		}
		public Control_structureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_structure; }
	}

	public final Control_structureContext control_structure() throws RecognitionException {
		Control_structureContext _localctx = new Control_structureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_control_structure);
		int _la;
		try {
			setState(99);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(IF);
				{
				setState(82); logical();
				}
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
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(While);
				{
				setState(94); logical();
				}
				setState(95); match(LKEYS);
				setState(96); code();
				setState(97); match(RKEYS);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(trainParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(trainParser.COMMA); }
		public TerminalNode LPAR() { return getToken(trainParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(trainParser.RPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(trainParser.COMMA, i);
		}
		public TerminalNode COMAND_END() { return getToken(trainParser.COMAND_END, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(ID);
			setState(102); match(LPAR);
			setState(103); value();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(104); match(COMMA);
				setState(105); value();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111); match(RPAR);
			setState(112); match(COMAND_END);
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

	public static class Math_operationsContext extends ParserRuleContext {
		public Value result;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public List<Math_op1Context> math_op1() {
			return getRuleContexts(Math_op1Context.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(trainParser.MINUS, i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Math_op1Context math_op1(int i) {
			return getRuleContext(Math_op1Context.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(trainParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(trainParser.MINUS); }
		public TerminalNode LPAR() { return getToken(trainParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(trainParser.RPAR, 0); }
		public TerminalNode PLUS(int i) {
			return getToken(trainParser.PLUS, i);
		}
		public Math_operationsContext math_operations() {
			return getRuleContext(Math_operationsContext.class,0);
		}
		public Math_operationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operations; }
	}

	public final Math_operationsContext math_operations() throws RecognitionException {
		Math_operationsContext _localctx = new Math_operationsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_math_operations);
		int _la;
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(114); value();
					}
					break;

				case 2:
					{
					setState(115); math_op1();
					}
					break;
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(118);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(121);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(119); value();
						}
						break;

					case 2:
						{
						setState(120); math_op1();
						}
						break;
					}
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); match(LPAR);
				setState(129); math_operations();
				setState(130); match(RPAR);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(132); value();
					}
					break;

				case 2:
					{
					setState(133); math_op1();
					}
					break;
				}
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

	public static class Math_op1Context extends ParserRuleContext {
		public TerminalNode INT(int i) {
			return getToken(trainParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(trainParser.ID); }
		public TerminalNode MULT(int i) {
			return getToken(trainParser.MULT, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(trainParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(trainParser.DIVISION, i);
		}
		public List<TerminalNode> MULT() { return getTokens(trainParser.MULT); }
		public TerminalNode ID(int i) {
			return getToken(trainParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(trainParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(trainParser.RPAR, 0); }
		public List<TerminalNode> INT() { return getTokens(trainParser.INT); }
		public Math_operationsContext math_operations() {
			return getRuleContext(Math_operationsContext.class,0);
		}
		public Math_op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op1; }
	}

	public final Math_op1Context math_op1() throws RecognitionException {
		Math_op1Context _localctx = new Math_op1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_math_op1);
		int _la;
		try {
			setState(150);
			switch (_input.LA(1)) {
			case INT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIVISION) {
					{
					{
					setState(139);
					_la = _input.LA(1);
					if ( !(_la==MULT || _la==DIVISION) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(140);
					_la = _input.LA(1);
					if ( !(_la==INT || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(LPAR);
				setState(147); math_operations();
				setState(148); match(RPAR);
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

	public static class LogicalContext extends ParserRuleContext {
		public Compare_operationContext compare_operation() {
			return getRuleContext(Compare_operationContext.class,0);
		}
		public TerminalNode NOT() { return getToken(trainParser.NOT, 0); }
		public List<TerminalNode> ID() { return getTokens(trainParser.ID); }
		public Logical_operationContext logical_operation() {
			return getRuleContext(Logical_operationContext.class,0);
		}
		public LogicalContext logical() {
			return getRuleContext(LogicalContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(trainParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(trainParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(trainParser.RPAR, 0); }
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_logical);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(ID);
				setState(153); compare_operation();
				setState(154); match(ID);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(ID);
				setState(157); logical_operation();
				setState(158); match(ID);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160); match(LPAR);
				setState(161); logical();
				setState(162); match(RPAR);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164); match(NOT);
				setState(165); logical();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166); match(ID);
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

	public static class Logical_operationContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(trainParser.AND, 0); }
		public TerminalNode OR() { return getToken(trainParser.OR, 0); }
		public Logical_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operation; }
	}

	public final Logical_operationContext logical_operation() throws RecognitionException {
		Logical_operationContext _localctx = new Logical_operationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class Compare_operationContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(trainParser.LESS, 0); }
		public TerminalNode EQUALS() { return getToken(trainParser.EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(trainParser.GREATER, 0); }
		public Compare_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_operation; }
	}

	public final Compare_operationContext compare_operation() throws RecognitionException {
		Compare_operationContext _localctx = new Compare_operationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << EQUALS))) != 0)) ) {
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

	public static class ValueContext extends ParserRuleContext {
		public Value result;
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode ID() { return getToken(trainParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(ID);
				}
				break;
			case BOOL:
			case INT:
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); data();
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(trainParser.BOOL, 0); }
		public TerminalNode STR() { return getToken(trainParser.STR, 0); }
		public TerminalNode INT() { return getToken(trainParser.INT, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INT) | (1L << STR))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public Type result;
		public Primitive_typeContext primitive_type;
		public Object_typeContext object_type;
		public Primitive_typeContext primitive_type() {
			return getRuleContext(Primitive_typeContext.class,0);
		}
		public Object_typeContext object_type() {
			return getRuleContext(Object_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case STRING:
			case BOOLEAN:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); ((TypeContext)_localctx).primitive_type = primitive_type();
				((TypeContext)_localctx).result =  new Type(((TypeContext)_localctx).primitive_type.result);
				}
				break;
			case WAGON:
			case TRAIN:
			case LOCOM:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); ((TypeContext)_localctx).object_type = object_type();
				((TypeContext)_localctx).result =  new Type(((TypeContext)_localctx).object_type.result);
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

	public static class Primitive_typeContext extends ParserRuleContext {
		public Type result;
		public Token STRING;
		public Token BOOLEAN;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(trainParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(trainParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(trainParser.BOOLEAN, 0); }
		public Primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_type; }
	}

	public final Primitive_typeContext primitive_type() throws RecognitionException {
		Primitive_typeContext _localctx = new Primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_primitive_type);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); ((Primitive_typeContext)_localctx).STRING = match(STRING);
				((Primitive_typeContext)_localctx).result =  new Type((((Primitive_typeContext)_localctx).STRING!=null?((Primitive_typeContext)_localctx).STRING.getText():null));
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); ((Primitive_typeContext)_localctx).BOOLEAN = match(BOOLEAN);
				((Primitive_typeContext)_localctx).result =  new Type((((Primitive_typeContext)_localctx).BOOLEAN!=null?((Primitive_typeContext)_localctx).BOOLEAN.getText():null));
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); ((Primitive_typeContext)_localctx).INTEGER = match(INTEGER);
				((Primitive_typeContext)_localctx).result =  new Type((((Primitive_typeContext)_localctx).INTEGER!=null?((Primitive_typeContext)_localctx).INTEGER.getText():null));
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

	public static class Object_typeContext extends ParserRuleContext {
		public Type result;
		public Token TRAIN;
		public Token WAGON;
		public Token LOCOM;
		public TerminalNode LOCOM() { return getToken(trainParser.LOCOM, 0); }
		public TerminalNode TRAIN() { return getToken(trainParser.TRAIN, 0); }
		public TerminalNode WAGON() { return getToken(trainParser.WAGON, 0); }
		public Object_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_type; }
	}

	public final Object_typeContext object_type() throws RecognitionException {
		Object_typeContext _localctx = new Object_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object_type);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case TRAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(195); ((Object_typeContext)_localctx).TRAIN = match(TRAIN);
				((Object_typeContext)_localctx).result =  new Type((((Object_typeContext)_localctx).TRAIN!=null?((Object_typeContext)_localctx).TRAIN.getText():null));
				}
				break;
			case WAGON:
				enterOuterAlt(_localctx, 2);
				{
				setState(197); ((Object_typeContext)_localctx).WAGON = match(WAGON);
				((Object_typeContext)_localctx).result =  new Type((((Object_typeContext)_localctx).WAGON!=null?((Object_typeContext)_localctx).WAGON.getText():null));
				}
				break;
			case LOCOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); ((Object_typeContext)_localctx).LOCOM = match(LOCOM);
				((Object_typeContext)_localctx).result =  new Type((((Object_typeContext)_localctx).LOCOM!=null?((Object_typeContext)_localctx).LOCOM.getText():null));
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3%\u00ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4\5"+
		"\4\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7f\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\b\3\b\3\b\3\t\3\t\5\tw"+
		"\n\t\3\t\3\t\3\t\5\t|\n\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0089\n\t\5\t\u008b\n\t\3\n\3\n\3\n\7\n\u0090\n\n\f\n\16"+
		"\n\u0093\13\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00bc\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\2\23\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"\2\b\3\2\4\5\4\2\"\"$$\3\2\n\13\3\2\21\22\4"+
		"\2\f\r\23\23\3\2!#\u00da\2$\3\2\2\2\4-\3\2\2\2\6\60\3\2\2\2\bC\3\2\2\2"+
		"\nQ\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20\u008a\3\2\2\2\22\u0098\3\2\2\2\24"+
		"\u00a9\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2\2\2\32\u00b1\3\2\2\2\34\u00b3"+
		"\3\2\2\2\36\u00bb\3\2\2\2 \u00c3\3\2\2\2\"\u00cb\3\2\2\2$%\5\4\3\2%\3"+
		"\3\2\2\2&,\5\6\4\2\',\5\b\5\2(,\5\n\6\2),\5\f\7\2*,\5\16\b\2+&\3\2\2\2"+
		"+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2"+
		"\2.\5\3\2\2\2/-\3\2\2\2\60\61\5\36\20\2\61\64\7$\2\2\62\63\7\3\2\2\63"+
		"\65\5\34\17\2\64\62\3\2\2\2\64\65\3\2\2\2\65\7\3\2\2\2\66\67\7$\2\2\67"+
		"8\7\27\2\289\7\"\2\29D\7\16\2\2:;\7$\2\2;<\7\30\2\2<=\7$\2\2=>\7 \2\2"+
		">D\7\16\2\2?@\7$\2\2@A\7\31\2\2AB\7 \2\2BD\7\16\2\2C\66\3\2\2\2C:\3\2"+
		"\2\2C?\3\2\2\2D\t\3\2\2\2EF\7$\2\2FG\7\3\2\2GH\5\32\16\2HI\7\16\2\2IJ"+
		"\b\6\1\2JR\3\2\2\2KL\7$\2\2LM\7\3\2\2MN\5\20\t\2NO\7\16\2\2OP\b\6\1\2"+
		"PR\3\2\2\2QE\3\2\2\2QK\3\2\2\2R\13\3\2\2\2ST\7\24\2\2TU\5\24\13\2UV\7"+
		"\b\2\2VW\5\4\3\2W]\7\t\2\2XY\7\25\2\2YZ\7\b\2\2Z[\5\4\3\2[\\\7\t\2\2\\"+
		"^\3\2\2\2]X\3\2\2\2]^\3\2\2\2^f\3\2\2\2_`\7\26\2\2`a\5\24\13\2ab\7\b\2"+
		"\2bc\5\4\3\2cd\7\t\2\2df\3\2\2\2eS\3\2\2\2e_\3\2\2\2f\r\3\2\2\2gh\7$\2"+
		"\2hi\7\6\2\2in\5\32\16\2jk\7\20\2\2km\5\32\16\2lj\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\7\2\2rs\7\16\2\2s\17\3\2\2"+
		"\2tw\5\32\16\2uw\5\22\n\2vt\3\2\2\2vu\3\2\2\2w\177\3\2\2\2x{\t\2\2\2y"+
		"|\5\32\16\2z|\5\22\n\2{y\3\2\2\2{z\3\2\2\2|~\3\2\2\2}x\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u008b\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7\7\2\2"+
		"\u0085\u008b\3\2\2\2\u0086\u0089\5\32\16\2\u0087\u0089\5\22\n\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\u008b\3\2\2\2\u008av\3\2\2\2"+
		"\u008a\u0082\3\2\2\2\u008a\u0088\3\2\2\2\u008b\21\3\2\2\2\u008c\u0091"+
		"\t\3\2\2\u008d\u008e\t\4\2\2\u008e\u0090\t\3\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0099\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\6\2\2\u0095\u0096\5\20\t\2\u0096"+
		"\u0097\7\7\2\2\u0097\u0099\3\2\2\2\u0098\u008c\3\2\2\2\u0098\u0094\3\2"+
		"\2\2\u0099\23\3\2\2\2\u009a\u009b\7$\2\2\u009b\u009c\5\30\r\2\u009c\u009d"+
		"\7$\2\2\u009d\u00aa\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a0\5\26\f\2\u00a0"+
		"\u00a1\7$\2\2\u00a1\u00aa\3\2\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\5\24"+
		"\13\2\u00a4\u00a5\7\7\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\7\17\2\2\u00a7"+
		"\u00aa\5\24\13\2\u00a8\u00aa\7$\2\2\u00a9\u009a\3\2\2\2\u00a9\u009e\3"+
		"\2\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\25\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\t\6\2\2\u00ae"+
		"\31\3\2\2\2\u00af\u00b2\7$\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00af\3\2\2"+
		"\2\u00b1\u00b0\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\t\7\2\2\u00b4\35\3"+
		"\2\2\2\u00b5\u00b6\5 \21\2\u00b6\u00b7\b\20\1\2\u00b7\u00bc\3\2\2\2\u00b8"+
		"\u00b9\5\"\22\2\u00b9\u00ba\b\20\1\2\u00ba\u00bc\3\2\2\2\u00bb\u00b5\3"+
		"\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00be\7\32\2\2\u00be"+
		"\u00c4\b\21\1\2\u00bf\u00c0\7\33\2\2\u00c0\u00c4\b\21\1\2\u00c1\u00c2"+
		"\7\34\2\2\u00c2\u00c4\b\21\1\2\u00c3\u00bd\3\2\2\2\u00c3\u00bf\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7\36\2\2\u00c6\u00cc\b"+
		"\22\1\2\u00c7\u00c8\7\35\2\2\u00c8\u00cc\b\22\1\2\u00c9\u00ca\7\37\2\2"+
		"\u00ca\u00cc\b\22\1\2\u00cb\u00c5\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc#\3\2\2\2\26+-\64CQ]env{\177\u0088\u008a\u0091\u0098\u00a9"+
		"\u00b1\u00bb\u00c3\u00cb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}