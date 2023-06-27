/**
 * Copyright 2017-2022 LinkedIn Corporation. All rights reserved.
 * Licensed under the BSD-2 Clause license.
 * See LICENSE in the project root for license information.
 */
package com.linkedin.coral.hive.hive2rel.parsetree.parser;

import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


//spotless:off
public class ParseDriver {

  private static final Log LOG = LogFactory.getLog("ParseDriver");

  /**
   * ANTLRNoCaseStringStream.
   *
   */
  //This class provides and implementation for a case insensitive token checker
  //for the lexical analysis part of antlr. By converting the token stream into
  //upper case at the time when lexical rules are checked, this class ensures that the
  //lexical rules need to just match the token with upper case letters as opposed to
  //combination of upper case and lower case characteres. This is purely used for matching lexical
  //rules. The actual token text is stored in the same way as the user input without
  //actually converting it into an upper case. The token values are generated by the consume()
  //function of the super class ANTLRStringStream. The LA() function is the lookahead funtion
  //and is purely used for matching lexical rules. This also means that the grammar will only
  //accept capitalized tokens in case it is run from other tools like antlrworks which
  //do not have the ANTLRNoCaseStringStream implementation.
  public static class ANTLRNoCaseStringStream extends ANTLRStringStream {

    public ANTLRNoCaseStringStream(String input) {
      super(input);
    }

    @Override
    public int LA(int i) {

      int returnChar = super.LA(i);
      if (returnChar == CharStream.EOF) {
        return returnChar;
      } else if (returnChar == 0) {
        return returnChar;
      }

      return Character.toUpperCase((char) returnChar);
    }
  }

  /**
   * HiveLexerX.
   *
   */
  public static class HiveLexerX extends HiveLexer {

    private final ArrayList<ParseError> errors;

    public HiveLexerX() {
      super();
      errors = new ArrayList<>();
    }

    public HiveLexerX(CharStream input) {
      super(input);
      errors = new ArrayList<>();
    }

    @Override
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {

      errors.add(new ParseError(this, e, tokenNames));
    }

    @Override
    public String getErrorMessage(RecognitionException e, String[] tokenNames) {
      String msg = null;

      if (e instanceof NoViableAltException) {
        @SuppressWarnings("unused")
        NoViableAltException nvae = (NoViableAltException) e;
        // for development, can add
        // "decision=<<"+nvae.grammarDecisionDescription+">>"
        // and "(decision="+nvae.decisionNumber+") and
        // "state "+nvae.stateNumber
        msg = "character " + getCharErrorDisplay(e.c) + " not supported here";
      } else {
        msg = super.getErrorMessage(e, tokenNames);
      }

      return msg;
    }

    public ArrayList<ParseError> getErrors() {
      return errors;
    }
  }

  /**
   * Tree adaptor for making antlr return ASTNodes instead of CommonTree nodes
   * so that the graph walking algorithms and the rules framework defined in
   * ql.lib can be used with the AST Nodes.
   */
  public static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
    /**
     * Creates an ASTNode for the given token. The ASTNode is a wrapper around
     * antlr's CommonTree class that implements the Node interface.
     *
     * @param payload
     *          The token.
     * @return Object (which is actually an ASTNode) for the token.
     */
    @Override
    public Object create(Token payload) {
      return new ASTNode(payload);
    }

    @Override
    public Object dupNode(Object t) {

      return create(((CommonTree) t).token);
    }

    @Override
    public Object errorNode(TokenStream input, Token start, Token stop, RecognitionException e) {
      return new ASTErrorNode(input, start, stop, e);
    }
  };

  /**
   * Parses a command, optionally assigning the parser's token stream to the
   * given context.
   *
   * @param command command to parse
   * @return {@link ASTNode} object for parsed AST
   * @throws ParseException when parsing error is detected
   */
  public ASTNode parse(String command) throws ParseException {
    if (LOG.isDebugEnabled()) {
      LOG.debug("Parsing command: " + command);
    }

    HiveLexerX lexer = new HiveLexerX(new ANTLRNoCaseStringStream(command));
    TokenRewriteStream tokens = new TokenRewriteStream(lexer);
    HiveParser parser = new HiveParser(tokens);
    parser.setTreeAdaptor(adaptor);
    HiveParser.statement_return r = null;
    try {
      r = parser.statement();
    } catch (RecognitionException e) {
      e.printStackTrace();
      throw new ParseException(parser.errors);
    }

    if (lexer.getErrors().size() == 0 && parser.errors.size() == 0) {
      LOG.debug("Parse Completed");
    } else if (lexer.getErrors().size() != 0) {
      throw new ParseException(lexer.getErrors());
    } else {
      throw new ParseException(parser.errors);
    }

    ASTNode tree = (ASTNode) r.getTree();
    tree.setUnknownTokenBoundaries();
    return tree;
  }

  /*
   * parse a String as a Select List. This allows table functions to be passed expression Strings
   * that are translated in
   * the context they define at invocation time. Currently used by NPath to allow users to specify
   * what output they want.
   * NPath allows expressions n 'tpath' a column that represents the matched set of rows. This
   * column doesn't exist in
   * the input schema and hence the Result Expression cannot be analyzed by the regular Hive
   * translation process.
   */
  public ASTNode parseSelect(String command) throws ParseException {
    if (LOG.isDebugEnabled()) {
      LOG.debug("Parsing command: " + command);
    }

    HiveLexerX lexer = new HiveLexerX(new ANTLRNoCaseStringStream(command));
    TokenRewriteStream tokens = new TokenRewriteStream(lexer);
    HiveParser parser = new HiveParser(tokens);
    parser.setTreeAdaptor(adaptor);
    HiveParser_SelectClauseParser.selectClause_return r = null;
    try {
      r = parser.selectClause();
    } catch (RecognitionException e) {
      e.printStackTrace();
      throw new ParseException(parser.errors);
    }

    if (lexer.getErrors().size() == 0 && parser.errors.size() == 0) {
      LOG.debug("Parse Completed");
    } else if (lexer.getErrors().size() != 0) {
      throw new ParseException(lexer.getErrors());
    } else {
      throw new ParseException(parser.errors);
    }

    return (ASTNode) r.getTree();
  }
}
//spotless:on
