// Generated from /home/gungy/IdeaProjects/register_machine/antlr/Register.g4 by ANTLR 4.9

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegisterParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION);
  }
  
  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
      new PredictionContextCache();
  public static final int
      T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, LABEL = 6, REGISTER = 7, HALT = 8, NEWLINE = 9,
      WS = 10;
  public static final int
      RULE_prog = 0, RULE_stat = 1, RULE_command = 2;
  
  private static String[] makeRuleNames() {
    return new String[]{
        "prog", "stat", "command"
    };
  }
  
  public static final String[] ruleNames = makeRuleNames();
  
  private static String[] makeLiteralNames() {
    return new String[]{
        null, "':'", "'+'", "'->'", "'-'", "','"
    };
  }
  
  private static final String[] _LITERAL_NAMES = makeLiteralNames();
  
  private static String[] makeSymbolicNames() {
    return new String[]{
        null, null, null, null, null, null, "LABEL", "REGISTER", "HALT", "NEWLINE",
        "WS"
    };
  }
  
  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
  public String getGrammarFileName() {
    return "Register.g4";
  }
  
  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }
  
  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }
  
  @Override
  public ATN getATN() {
    return _ATN;
  }
  
  public RegisterParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }
  
  public static class ProgContext extends ParserRuleContext {
    public List<StatContext> stat() {
      return getRuleContexts(StatContext.class);
    }
    
    public StatContext stat(int i) {
      return getRuleContext(StatContext.class, i);
    }
    
    public ProgContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    
    @Override
    public int getRuleIndex() {
      return RULE_prog;
    }
    
    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).enterProg(this);
    }
    
    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).exitProg(this);
    }
  }
  
  public final ProgContext prog() throws RecognitionException {
    ProgContext _localctx = new ProgContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_prog);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(7);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(6);
              stat();
            }
          }
          setState(9);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == LABEL);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }
  
  public static class StatContext extends ParserRuleContext {
    public TerminalNode LABEL() {
      return getToken(RegisterParser.LABEL, 0);
    }
    
    public CommandContext command() {
      return getRuleContext(CommandContext.class, 0);
    }
    
    public StatContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    
    @Override
    public int getRuleIndex() {
      return RULE_stat;
    }
    
    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).enterStat(this);
    }
    
    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).exitStat(this);
    }
  }
  
  public final StatContext stat() throws RecognitionException {
    StatContext _localctx = new StatContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_stat);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(11);
        match(LABEL);
        setState(12);
        match(T__0);
        setState(13);
        command();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }
  
  public static class CommandContext extends ParserRuleContext {
    public CommandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    
    @Override
    public int getRuleIndex() {
      return RULE_command;
    }
    
    public CommandContext() {
    }
    
    public void copyFrom(CommandContext ctx) {
      super.copyFrom(ctx);
    }
  }
  
  public static class HaltContext extends CommandContext {
    public TerminalNode HALT() {
      return getToken(RegisterParser.HALT, 0);
    }
    
    public TerminalNode NEWLINE() {
      return getToken(RegisterParser.NEWLINE, 0);
    }
    
    public HaltContext(CommandContext ctx) {
      copyFrom(ctx);
    }
    
    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).enterHalt(this);
    }
    
    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).exitHalt(this);
    }
  }
  
  public static class BlankContext extends CommandContext {
    public TerminalNode NEWLINE() {
      return getToken(RegisterParser.NEWLINE, 0);
    }
    
    public BlankContext(CommandContext ctx) {
      copyFrom(ctx);
    }
    
    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).enterBlank(this);
    }
    
    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).exitBlank(this);
    }
  }
  
  public static class IncreaseContext extends CommandContext {
    public TerminalNode REGISTER() {
      return getToken(RegisterParser.REGISTER, 0);
    }
    
    public TerminalNode LABEL() {
      return getToken(RegisterParser.LABEL, 0);
    }
    
    public TerminalNode NEWLINE() {
      return getToken(RegisterParser.NEWLINE, 0);
    }
    
    public IncreaseContext(CommandContext ctx) {
      copyFrom(ctx);
    }
    
    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).enterIncrease(this);
    }
    
    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).exitIncrease(this);
    }
  }
  
  public static class DecreaseContext extends CommandContext {
    public TerminalNode REGISTER() {
      return getToken(RegisterParser.REGISTER, 0);
    }
    
    public List<TerminalNode> LABEL() {
      return getTokens(RegisterParser.LABEL);
    }
    
    public TerminalNode LABEL(int i) {
      return getToken(RegisterParser.LABEL, i);
    }
    
    public TerminalNode NEWLINE() {
      return getToken(RegisterParser.NEWLINE, 0);
    }
    
    public DecreaseContext(CommandContext ctx) {
      copyFrom(ctx);
    }
    
    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).enterDecrease(this);
    }
    
    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof RegisterListener) ((RegisterListener) listener).exitDecrease(this);
    }
  }
  
  public final CommandContext command() throws RecognitionException {
    CommandContext _localctx = new CommandContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_command);
    try {
      setState(30);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
        case 1:
          _localctx = new IncreaseContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(15);
          match(REGISTER);
          setState(16);
          match(T__1);
          setState(17);
          match(T__2);
          setState(18);
          match(LABEL);
          setState(19);
          match(NEWLINE);
        }
        break;
        case 2:
          _localctx = new DecreaseContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(20);
          match(REGISTER);
          setState(21);
          match(T__3);
          setState(22);
          match(T__2);
          setState(23);
          match(LABEL);
          setState(24);
          match(T__4);
          setState(25);
          match(LABEL);
          setState(26);
          match(NEWLINE);
        }
        break;
        case 3:
          _localctx = new HaltContext(_localctx);
          enterOuterAlt(_localctx, 3);
        {
          setState(27);
          match(HALT);
          setState(28);
          match(NEWLINE);
        }
        break;
        case 4:
          _localctx = new BlankContext(_localctx);
          enterOuterAlt(_localctx, 4);
        {
          setState(29);
          match(NEWLINE);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }
  
  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f#\4\2\t\2\4\3\t" +
          "\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3" +
          "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\4\2\2\5\2\4\6\2" +
          "\2\2#\2\t\3\2\2\2\4\r\3\2\2\2\6 \3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13" +
          "\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\7\b\2\2\16\17\7\3" +
          "\2\2\17\20\5\6\4\2\20\5\3\2\2\2\21\22\7\t\2\2\22\23\7\4\2\2\23\24\7\5" +
          "\2\2\24\25\7\b\2\2\25!\7\13\2\2\26\27\7\t\2\2\27\30\7\6\2\2\30\31\7\5" +
          "\2\2\31\32\7\b\2\2\32\33\7\7\2\2\33\34\7\b\2\2\34!\7\13\2\2\35\36\7\n" +
          "\2\2\36!\7\13\2\2\37!\7\13\2\2 \21\3\2\2\2 \26\3\2\2\2 \35\3\2\2\2 \37" +
          "\3\2\2\2!\7\3\2\2\2\4\13 ";
  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}