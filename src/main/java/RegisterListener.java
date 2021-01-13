// Generated from /home/gungy/IdeaProjects/register_machine/antlr/Register.g4 by ANTLR 4.9

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegisterParser}.
 */
public interface RegisterListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link RegisterParser#prog}.
   *
   * @param ctx the parse tree
   */
  void enterProg(RegisterParser.ProgContext ctx);
  
  /**
   * Exit a parse tree produced by {@link RegisterParser#prog}.
   *
   * @param ctx the parse tree
   */
  void exitProg(RegisterParser.ProgContext ctx);
  
  /**
   * Enter a parse tree produced by {@link RegisterParser#stat}.
   *
   * @param ctx the parse tree
   */
  void enterStat(RegisterParser.StatContext ctx);
  
  /**
   * Exit a parse tree produced by {@link RegisterParser#stat}.
   *
   * @param ctx the parse tree
   */
  void exitStat(RegisterParser.StatContext ctx);
  
  /**
   * Enter a parse tree produced by the {@code increase}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void enterIncrease(RegisterParser.IncreaseContext ctx);
  
  /**
   * Exit a parse tree produced by the {@code increase}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void exitIncrease(RegisterParser.IncreaseContext ctx);
  
  /**
   * Enter a parse tree produced by the {@code decrease}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void enterDecrease(RegisterParser.DecreaseContext ctx);
  
  /**
   * Exit a parse tree produced by the {@code decrease}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void exitDecrease(RegisterParser.DecreaseContext ctx);
  
  /**
   * Enter a parse tree produced by the {@code halt}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void enterHalt(RegisterParser.HaltContext ctx);
  
  /**
   * Exit a parse tree produced by the {@code halt}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void exitHalt(RegisterParser.HaltContext ctx);
  
  /**
   * Enter a parse tree produced by the {@code blank}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void enterBlank(RegisterParser.BlankContext ctx);
  
  /**
   * Exit a parse tree produced by the {@code blank}
   * labeled alternative in {@link RegisterParser#command}.
   *
   * @param ctx the parse tree
   */
  void exitBlank(RegisterParser.BlankContext ctx);
}