// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.dennisylyung.language.psi.MirandaTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MirandaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return mirandaFile(b, l + 1);
  }

  /* ********************************************************** */
  // OPERATOR | KEYWORD | '$' IDENTIFIER
  public static boolean delimiter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delimiter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DELIMITER, "<delimiter>");
    r = consumeToken(b, OPERATOR);
    if (!r) r = consumeToken(b, KEYWORD);
    if (!r) r = delimiter_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '$' IDENTIFIER
  private static boolean delimiter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delimiter_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "$");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DECIMAL EPART? | NATURAL_NUMBER EPART
  public static boolean float_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_$")) return false;
    if (!nextTokenIs(b, "<float $>", DECIMAL, NATURAL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLOAT, "<float $>");
    r = float_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, NATURAL_NUMBER, EPART);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DECIMAL EPART?
  private static boolean float_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECIMAL);
    r = r && float_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EPART?
  private static boolean float_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "float_0_1")) return false;
    consumeToken(b, EPART);
    return true;
  }

  /* ********************************************************** */
  // NEW_LINE | WHITE_SPACE | COMMENT
  public static boolean layout(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "layout")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LAYOUT, "<layout>");
    r = consumeToken(b, NEW_LINE);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // numeral | CHAR | STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = numeral(b, l + 1);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (token | layout)*
  static boolean mirandaFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mirandaFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!mirandaFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "mirandaFile", c)) break;
    }
    return true;
  }

  // token | layout
  private static boolean mirandaFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mirandaFile_0")) return false;
    boolean r;
    r = token(b, l + 1);
    if (!r) r = layout(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NATURAL_NUMBER | float
  public static boolean numeral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeral")) return false;
    if (!nextTokenIs(b, "<numeral>", DECIMAL, NATURAL_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUMERAL, "<numeral>");
    r = consumeToken(b, NATURAL_NUMBER);
    if (!r) r = float_$(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER | literal | TYPEVAR | delimiter
  public static boolean token(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "token")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TOKEN, "<token>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, TYPEVAR);
    if (!r) r = delimiter(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
