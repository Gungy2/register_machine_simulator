// Generated from /home/gungy/IdeaProjects/register_machine/antlr/Register.g4 by ANTLR 4.9

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegisterLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION);
  }
  
  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
      new PredictionContextCache();
  public static final int
      T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, LABEL = 6, REGISTER = 7, HALT = 8, NEWLINE = 9,
      WS = 10;
  public static String[] channelNames = {
      "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
  };
  
  public static String[] modeNames = {
      "DEFAULT_MODE"
  };
  
  private static String[] makeRuleNames() {
    return new String[]{
        "T__0", "T__1", "T__2", "T__3", "T__4", "LABEL", "REGISTER", "HALT",
        "NUM", "NEWLINE", "WS"
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
  
  
  public RegisterLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
  public String[] getChannelNames() {
    return channelNames;
  }
  
  @Override
  public String[] getModeNames() {
    return modeNames;
  }
  
  @Override
  public ATN getATN() {
    return _ATN;
  }
  
  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f@\b\1\4\2\t\2\4" +
          "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
          "\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3" +
          "\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\n\61\n\n\r\n\16\n\62\3\13\5\13\66" +
          "\n\13\3\13\3\13\3\f\6\f;\n\f\r\f\16\f<\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13" +
          "\7\r\b\17\t\21\n\23\2\25\13\27\f\3\2\b\5\2JJjj~~\5\2CCcc~~\5\2NNnn~~\5" +
          "\2VVvv~~\3\2\62;\4\2\13\13\"\"\2A\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2" +
          "\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3" +
          "\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t \3\2\2\2" +
          "\13\"\3\2\2\2\r$\3\2\2\2\17\'\3\2\2\2\21*\3\2\2\2\23\60\3\2\2\2\25\65" +
          "\3\2\2\2\27:\3\2\2\2\31\32\7<\2\2\32\4\3\2\2\2\33\34\7-\2\2\34\6\3\2\2" +
          "\2\35\36\7/\2\2\36\37\7@\2\2\37\b\3\2\2\2 !\7/\2\2!\n\3\2\2\2\"#\7.\2" +
          "\2#\f\3\2\2\2$%\7N\2\2%&\5\23\n\2&\16\3\2\2\2\'(\7T\2\2()\5\23\n\2)\20" +
          "\3\2\2\2*+\t\2\2\2+,\t\3\2\2,-\t\4\2\2-.\t\5\2\2.\22\3\2\2\2/\61\t\6\2" +
          "\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\24\3\2\2\2" +
          "\64\66\7\17\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7\f\2\2" +
          "8\26\3\2\2\29;\t\7\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2" +
          "\2>?\b\f\2\2?\30\3\2\2\2\6\2\62\65<\3\b\2\2";
  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}