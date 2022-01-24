// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.LightPsiParser;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

import static com.intellij.lang.parser.GeneratedParserUtilBase.Parser;
import static com.intellij.lang.parser.GeneratedParserUtilBase.TRUE_CONDITION;
import static com.intellij.lang.parser.GeneratedParserUtilBase._COLLAPSE_;
import static com.intellij.lang.parser.GeneratedParserUtilBase._LEFT_;
import static com.intellij.lang.parser.GeneratedParserUtilBase._NONE_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.adapt_builder_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.addVariant;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeToken;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeTokenSmart;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeTokens;
import static com.intellij.lang.parser.GeneratedParserUtilBase.consumeTokensSmart;
import static com.intellij.lang.parser.GeneratedParserUtilBase.create_token_set_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.current_position_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.empty_element_parsed_guard_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.enter_section_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.eof;
import static com.intellij.lang.parser.GeneratedParserUtilBase.exit_section_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.nextTokenIs;
import static com.intellij.lang.parser.GeneratedParserUtilBase.nextTokenIsSmart;
import static com.intellij.lang.parser.GeneratedParserUtilBase.parseTokens;
import static com.intellij.lang.parser.GeneratedParserUtilBase.recursion_guard_;
import static com.intellij.lang.parser.GeneratedParserUtilBase.report_error_;
import static io.github.dennisylyung.language.psi.MirandaTypes.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MirandaParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return script(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(E_1, E_1_INFIX, E_1_PREFIX, E_1_SIMPLE),
    create_token_set_(TYPE, TYPENAME_ARGTYPE, TYPE_ARGTYPE, TYPE_NAME_TYPE,
      TYPE_TO_TYPE),
    create_token_set_(PAT, PAT_COLON_PAT, PAT_CONSTRUCT_FORMAL, PAT_CONSTRUCT_PAT,
      PAT_FORMAL, PAT_NUMERAL, PAT_PARENTHESIS_FORMAL, PAT_PLUS_PAT),
  };

  /* ********************************************************** */
  // identifier_lower '/' identifier_lower
  //     | identifier_upper '/' identifier_upper
  public static boolean aliase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliase")) return false;
    if (!nextTokenIs(b, "<aliase>", IDENTIFIER_LOWER, IDENTIFIER_UPPER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIASE, "<aliase>");
    r = parseTokens(b, 0, IDENTIFIER_LOWER, SLASH, IDENTIFIER_LOWER);
    if (!r) r = parseTokens(b, 0, IDENTIFIER_UPPER, SLASH, IDENTIFIER_UPPER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // aliase+
  public static boolean aliases(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliases")) return false;
    if (!nextTokenIs(b, "<aliases>", IDENTIFIER_LOWER, IDENTIFIER_UPPER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALIASES, "<aliases>");
    r = aliase(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!aliase(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aliases", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // exp ',' 'if'? exp
  public static boolean alt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ALT, "<alt>");
    r = exp(b, l + 1);
    r = r && consumeToken(b, SEP_COMMA);
    r = r && alt_2(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'if'?
  private static boolean alt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alt_2")) return false;
    consumeToken(b, IF);
    return true;
  }

  /* ********************************************************** */
  // typename
  //     | typevar
  //     | '(' type-list ')'
  //     | '[' type-list ']'
  public static boolean argtype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argtype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGTYPE, "<argtype>");
    r = typename(b, l + 1);
    if (!r) r = typevar(b, l + 1);
    if (!r) r = argtype_2(b, l + 1);
    if (!r) r = argtype_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' type-list ')'
  private static boolean argtype_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argtype_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && type_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' type-list ']'
  private static boolean argtype_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argtype_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && type_list(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' binding+ '}'
  public static boolean binder(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binder")) return false;
    if (!nextTokenIs(b, LEFT_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACE);
    r = r && binder_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, BINDER, r);
    return r;
  }

  // binding+
  private static boolean binder_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binder_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = binding(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!binding(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "binder_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // var '=' exp statement_ending
  //     | tform '==' type statement_ending
  public static boolean binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding")) return false;
    if (!nextTokenIs(b, "<binding>", IDENTIFIER_LOWER, OP_ZEROMORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BINDING, "<binding>");
    r = binding_0(b, l + 1);
    if (!r) r = binding_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var '=' exp statement_ending
  private static boolean binding_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && exp(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tform '==' type statement_ending
  private static boolean binding_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binding_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tform(b, l + 1);
    r = r && consumeToken(b, OP_DOUBLE_EQ);
    r = r && type(b, l + 1, -1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'True' | 'False'
  public static boolean bool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool")) return false;
    if (!nextTokenIs(b, "<bool>", FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOL, "<bool>");
    r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // alt line_ending '=' cases
  //     | lastcase statement_ending
  public static boolean cases(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cases")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CASES, "<cases>");
    r = cases_0(b, l + 1);
    if (!r) r = cases_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // alt line_ending '=' cases
  private static boolean cases_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cases_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = alt(b, l + 1);
    r = r && consumeTokens(b, 0, LINE_ENDING, OP_EQ);
    r = r && cases(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // lastcase statement_ending
  private static boolean cases_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cases_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = lastcase(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type '$' constructor type
  //     | '(' construct ')' argtype*
  //     | constructor argtype*
  public static boolean construct(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCT, "<construct>");
    r = construct_0(b, l + 1);
    if (!r) r = construct_1(b, l + 1);
    if (!r) r = construct_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type '$' constructor type
  private static boolean construct_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1, -1);
    r = r && consumeToken(b, OP_DOLLAR);
    r = r && constructor(b, l + 1);
    r = r && type(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' construct ')' argtype*
  private static boolean construct_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && construct(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    r = r && construct_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argtype*
  private static boolean construct_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argtype(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "construct_1_3", c)) break;
    }
    return true;
  }

  // constructor argtype*
  private static boolean construct_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constructor(b, l + 1);
    r = r && construct_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argtype*
  private static boolean construct_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "construct_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argtype(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "construct_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier_upper
  public static boolean constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor")) return false;
    if (!nextTokenIs(b, IDENTIFIER_UPPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_UPPER);
    exit_section_(b, m, CONSTRUCTOR, r);
    return r;
  }

  /* ********************************************************** */
  // construct '|' constructs
  //     | construct
  public static boolean constructs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTS, "<constructs>");
    r = constructs_0(b, l + 1);
    if (!r) r = construct(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // construct '|' constructs
  private static boolean constructs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = construct(b, l + 1);
    r = r && consumeToken(b, OP_OR);
    r = r && constructs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // def | tdef | spec | libdir | line_ending
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL, "<decl>");
    r = def(b, l + 1);
    if (!r) r = tdef(b, l + 1);
    if (!r) r = spec(b, l + 1);
    if (!r) r = libdir(b, l + 1);
    if (!r) r = consumeToken(b, LINE_ENDING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fnform '=' rhs| pat '=' rhs
  public static boolean def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEF, "<def>");
    r = def_0(b, l + 1);
    if (!r) r = def_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // fnform '=' rhs
  private static boolean def_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fnform(b, l + 1);
    r = r && consumeToken(b, OP_EQ);
    r = r && rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pat '=' rhs
  private static boolean def_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1, -1);
    r = r && consumeToken(b, OP_EQ);
    r = r && rhs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pathname binder? aliases?
  public static boolean env(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env")) return false;
    if (!nextTokenIs(b, PATHNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PATHNAME);
    r = r && env_1(b, l + 1);
    r = r && env_2(b, l + 1);
    exit_section_(b, m, ENV, r);
    return r;
  }

  // binder?
  private static boolean env_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_1")) return false;
    binder(b, l + 1);
    return true;
  }

  // aliases?
  private static boolean env_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_2")) return false;
    aliases(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // e1 | prefix1 | infix
  public static boolean exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXP, "<exp>");
    r = e1(b, l + 1, -1);
    if (!r) r = prefix1(b, l + 1);
    if (!r) r = infix(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<list exp>>
  public static boolean exps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exps")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPS, "<exps>");
    r = list(b, l + 1, MirandaParser::exp);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // pat '$' var_decl pat
  //     | '(' fnform ')' formal*
  //     | var_decl formal*
  public static boolean fnform(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnform")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FNFORM, "<fnform>");
    r = fnform_0(b, l + 1);
    if (!r) r = fnform_1(b, l + 1);
    if (!r) r = fnform_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pat '$' var_decl pat
  private static boolean fnform_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnform_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1, -1);
    r = r && consumeToken(b, OP_DOLLAR);
    r = r && var_decl(b, l + 1);
    r = r && pat(b, l + 1, -1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' fnform ')' formal*
  private static boolean fnform_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnform_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && fnform(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    r = r && fnform_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // formal*
  private static boolean fnform_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnform_1_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formal(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fnform_1_3", c)) break;
    }
    return true;
  }

  // var_decl formal*
  private static boolean fnform_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnform_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_decl(b, l + 1);
    r = r && fnform_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // formal*
  private static boolean fnform_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fnform_2_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formal(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fnform_2_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // var_decl
  //     | constructor
  //     | literal
  //     | '(' pat-list? ')'
  //     | '[' pat-list? ']'
  public static boolean formal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FORMAL, "<formal>");
    r = var_decl(b, l + 1);
    if (!r) r = constructor(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = formal_3(b, l + 1);
    if (!r) r = formal_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' pat-list? ')'
  private static boolean formal_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && formal_3_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // pat-list?
  private static boolean formal_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_3_1")) return false;
    pat_list(b, l + 1);
    return true;
  }

  // '[' pat-list? ']'
  private static boolean formal_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && formal_4_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // pat-list?
  private static boolean formal_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_4_1")) return false;
    pat_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // pat-list '<-' exp
  //     | pat '<-' exp ',' exp '..'
  public static boolean generator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, GENERATOR, "<generator>");
    r = generator_0(b, l + 1);
    if (!r) r = generator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pat-list '<-' exp
  private static boolean generator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat_list(b, l + 1);
    r = r && consumeToken(b, OP_GENERATE);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // pat '<-' exp ',' exp '..'
  private static boolean generator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pat(b, l + 1, -1);
    r = r && consumeToken(b, OP_GENERATE);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, SEP_COMMA);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, OP_DOTS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '++'|'--'|':'|'\/'|'&'|'>'|'>='|'='|'~+'|'<='|'<'|'+'|'-'|'*'|'/'|'div'|'mod'|'^'|'.'|'!'
  public static boolean infix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "infix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INFIX, "<infix>");
    r = consumeToken(b, OP_DOUBLE_ADD);
    if (!r) r = consumeToken(b, OP_DOUBLE_MINUS);
    if (!r) r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, OP_BACK_FWD_SLASH);
    if (!r) r = consumeToken(b, OP_AND);
    if (!r) r = consumeToken(b, OP_GREATER);
    if (!r) r = consumeToken(b, OP_GREATER_EQUAL);
    if (!r) r = consumeToken(b, OP_EQ);
    if (!r) r = consumeToken(b, OP_SNAKE_ADD);
    if (!r) r = consumeToken(b, OP_SMALLER_EQUAL);
    if (!r) r = consumeToken(b, OP_SMALLER);
    if (!r) r = consumeToken(b, OP_ONEMORE);
    if (!r) r = consumeToken(b, OP_MINUS);
    if (!r) r = consumeToken(b, OP_ZEROMORE);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    if (!r) r = consumeToken(b, OP_EXPONENT);
    if (!r) r = consumeToken(b, OP_DOT);
    if (!r) r = consumeToken(b, OP_NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // exp ',' 'if'? exp
  //     | exp ',' 'otherwise'
  public static boolean lastalt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastalt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LASTALT, "<lastalt>");
    r = lastalt_0(b, l + 1);
    if (!r) r = lastalt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // exp ',' 'if'? exp
  private static boolean lastalt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastalt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && consumeToken(b, SEP_COMMA);
    r = r && lastalt_0_2(b, l + 1);
    r = r && exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'if'?
  private static boolean lastalt_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastalt_0_2")) return false;
    consumeToken(b, IF);
    return true;
  }

  // exp ',' 'otherwise'
  private static boolean lastalt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastalt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && consumeTokens(b, 0, SEP_COMMA, OTHERWISE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // lastalt whdefs?
  public static boolean lastcase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastcase")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LASTCASE, "<lastcase>");
    r = lastalt(b, l + 1);
    r = r && lastcase_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // whdefs?
  private static boolean lastcase_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastcase_1")) return false;
    whdefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '%include' env statement_ending
  //     | '%export' parts statement_ending
  //     | '%free' '{' sig '}'
  public static boolean libdir(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "libdir")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIBDIR, "<libdir>");
    r = libdir_0(b, l + 1);
    if (!r) r = libdir_1(b, l + 1);
    if (!r) r = libdir_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '%include' env statement_ending
  private static boolean libdir_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "libdir_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE);
    r = r && env(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%export' parts statement_ending
  private static boolean libdir_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "libdir_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXPORT);
    r = r && parts(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '%free' '{' sig '}'
  private static boolean libdir_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "libdir_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FREE, LEFT_BRACE);
    r = r && sig(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<param>> ( ',' <<param>> ) *
  public static boolean list(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "list")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = _param.parse(b, l);
    r = r && list_1(b, l + 1, _param);
    exit_section_(b, m, LIST, r);
    return r;
  }

  // ( ',' <<param>> ) *
  private static boolean list_1(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "list_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!list_1_0(b, l + 1, _param)) break;
      if (!empty_element_parsed_guard_(b, "list_1", c)) break;
    }
    return true;
  }

  // ',' <<param>>
  private static boolean list_1_0(PsiBuilder b, int l, Parser _param) {
    if (!recursion_guard_(b, l, "list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEP_COMMA);
    r = r && _param.parse(b, l);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // number | char | string | bool
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = bool(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier_lower
  //     | pathname
  //     | '+'
  //     | '-'identifier_lower
  public static boolean part(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "part")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PART, "<part>");
    r = consumeToken(b, IDENTIFIER_LOWER);
    if (!r) r = consumeToken(b, PATHNAME);
    if (!r) r = consumeToken(b, OP_ONEMORE);
    if (!r) r = parseTokens(b, 0, OP_MINUS, IDENTIFIER_LOWER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // part+
  public static boolean parts(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parts")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARTS, "<parts>");
    r = part(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!part(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parts", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<list pat>>
  public static boolean pat_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_LIST, "<pat list>");
    r = list(b, l + 1, pat_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '~' | '#' | '-'
  public static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX, "<prefix>");
    r = consumeToken(b, OP_SIMILAR);
    if (!r) r = consumeToken(b, OP_HASH);
    if (!r) r = consumeToken(b, OP_MINUS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '~' | '#'
  public static boolean prefix1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix1")) return false;
    if (!nextTokenIs(b, "<prefix 1>", OP_HASH, OP_SIMILAR)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_1, "<prefix 1>");
    r = consumeToken(b, OP_SIMILAR);
    if (!r) r = consumeToken(b, OP_HASH);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // exp | generator
  public static boolean qualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFIER, "<qualifier>");
    r = exp(b, l + 1);
    if (!r) r = generator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // qualifier line_ending qualifs | qualifier
  public static boolean qualifs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, QUALIFS, "<qualifs>");
    r = qualifs_0(b, l + 1);
    if (!r) r = qualifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // qualifier line_ending qualifs
  private static boolean qualifs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualifs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualifier(b, l + 1);
    r = r && consumeToken(b, LINE_ENDING);
    r = r && qualifs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // cases| simple_rhs statement_ending
  public static boolean rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RHS, "<rhs>");
    r = cases(b, l + 1);
    if (!r) r = rhs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // simple_rhs statement_ending
  private static boolean rhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rhs_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = simple_rhs(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl*
  static boolean script(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "script")) return false;
    while (true) {
      int c = current_position_(b);
      if (!decl(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "script", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // spec+
  public static boolean sig(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sig")) return false;
    if (!nextTokenIs(b, "<sig>", IDENTIFIER_LOWER, OP_ZEROMORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIG, "<sig>");
    r = spec(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!spec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sig", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // var_usage
  //     | constructor
  //     | literal
  //     | 'readvals'
  //     | 'show'
  //     | '(' infix e1 ')'
  //     | '(' e1 infix ')'
  //     | '(' exps? ')'
  //     | '[' exps? ']'
  //     | '[' exp '..' exp? ']'
  //     | '[' exp ',' exp '..' exp? ']'
  //     | '[' exp '|' qualifs ']'
  //     | '[' exp '//' qualifs ']'
  public static boolean simple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE, "<simple>");
    r = var_usage(b, l + 1);
    if (!r) r = constructor(b, l + 1);
    if (!r) r = literal(b, l + 1);
    if (!r) r = consumeToken(b, READVALS);
    if (!r) r = consumeToken(b, SHOW);
    if (!r) r = simple_5(b, l + 1);
    if (!r) r = simple_6(b, l + 1);
    if (!r) r = simple_7(b, l + 1);
    if (!r) r = simple_8(b, l + 1);
    if (!r) r = simple_9(b, l + 1);
    if (!r) r = simple_10(b, l + 1);
    if (!r) r = simple_11(b, l + 1);
    if (!r) r = simple_12(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' infix e1 ')'
  private static boolean simple_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && infix(b, l + 1);
    r = r && e1(b, l + 1, -1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' e1 infix ')'
  private static boolean simple_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && e1(b, l + 1, -1);
    r = r && infix(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' exps? ')'
  private static boolean simple_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_PAREN);
    r = r && simple_7_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // exps?
  private static boolean simple_7_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_7_1")) return false;
    exps(b, l + 1);
    return true;
  }

  // '[' exps? ']'
  private static boolean simple_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && simple_8_1(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // exps?
  private static boolean simple_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_8_1")) return false;
    exps(b, l + 1);
    return true;
  }

  // '[' exp '..' exp? ']'
  private static boolean simple_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, OP_DOTS);
    r = r && simple_9_3(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // exp?
  private static boolean simple_9_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_9_3")) return false;
    exp(b, l + 1);
    return true;
  }

  // '[' exp ',' exp '..' exp? ']'
  private static boolean simple_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, SEP_COMMA);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, OP_DOTS);
    r = r && simple_10_5(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // exp?
  private static boolean simple_10_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_10_5")) return false;
    exp(b, l + 1);
    return true;
  }

  // '[' exp '|' qualifs ']'
  private static boolean simple_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, OP_OR);
    r = r && qualifs(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' exp '//' qualifs ']'
  private static boolean simple_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_BRACKET);
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, DOUBLE_SLASH);
    r = r && qualifs(b, l + 1);
    r = r && consumeToken(b, RIGHT_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exp whdefs?
  public static boolean simple_rhs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_rhs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SIMPLE_RHS, "<simple rhs>");
    r = exp(b, l + 1);
    r = r && simple_rhs_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // whdefs?
  private static boolean simple_rhs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_rhs_1")) return false;
    whdefs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // var-list '::' type statement_ending
  //     | tform-list '::' type statement_ending
  public static boolean spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "spec")) return false;
    if (!nextTokenIs(b, "<spec>", IDENTIFIER_LOWER, OP_ZEROMORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPEC, "<spec>");
    r = spec_0(b, l + 1);
    if (!r) r = spec_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // var-list '::' type statement_ending
  private static boolean spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "spec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var_list(b, l + 1);
    r = r && consumeToken(b, OP_SPEC);
    r = r && type(b, l + 1, -1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tform-list '::' type statement_ending
  private static boolean spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "spec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tform_list(b, l + 1);
    r = r && consumeToken(b, OP_SPEC);
    r = r && type(b, l + 1, -1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // <<eof>> | line_ending
  public static boolean statement_ending(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_ending")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_ENDING, "<statement ending>");
    r = eof(b, l + 1);
    if (!r) r = consumeToken(b, LINE_ENDING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // tform '==' type statement_ending
  //     | tform '::=' constructs statement_ending
  //     | 'abstype' tform-list 'with' sig statement_ending
  public static boolean tdef(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tdef")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TDEF, "<tdef>");
    r = tdef_0(b, l + 1);
    if (!r) r = tdef_1(b, l + 1);
    if (!r) r = tdef_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // tform '==' type statement_ending
  private static boolean tdef_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tdef_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tform(b, l + 1);
    r = r && consumeToken(b, OP_DOUBLE_EQ);
    r = r && type(b, l + 1, -1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // tform '::=' constructs statement_ending
  private static boolean tdef_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tdef_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tform(b, l + 1);
    r = r && consumeToken(b, OP_IS);
    r = r && constructs(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'abstype' tform-list 'with' sig statement_ending
  private static boolean tdef_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tdef_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ABSTYPE);
    r = r && tform_list(b, l + 1);
    r = r && consumeToken(b, WITH);
    r = r && sig(b, l + 1);
    r = r && statement_ending(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // typevar '$' typename typevar
  //     | typename typevar*
  public static boolean tform(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tform")) return false;
    if (!nextTokenIs(b, "<tform>", IDENTIFIER_LOWER, OP_ZEROMORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TFORM, "<tform>");
    r = tform_0(b, l + 1);
    if (!r) r = tform_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // typevar '$' typename typevar
  private static boolean tform_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tform_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typevar(b, l + 1);
    r = r && consumeToken(b, OP_DOLLAR);
    r = r && typename(b, l + 1);
    r = r && typevar(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typename typevar*
  private static boolean tform_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tform_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typename(b, l + 1);
    r = r && tform_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typevar*
  private static boolean tform_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tform_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!typevar(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "tform_1_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // <<list tform>>
  public static boolean tform_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tform_list")) return false;
    if (!nextTokenIs(b, "<tform list>", IDENTIFIER_LOWER, OP_ZEROMORE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TFORM_LIST, "<tform list>");
    r = list(b, l + 1, MirandaParser::tform);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // <<list type>>
  public static boolean type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_LIST, "<type list>");
    r = list(b, l + 1, type_parser_);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier_lower
  public static boolean typename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typename")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LOWER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_LOWER);
    exit_section_(b, m, TYPENAME, r);
    return r;
  }

  /* ********************************************************** */
  // '*'+
  public static boolean typevar(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typevar")) return false;
    if (!nextTokenIs(b, OP_ZEROMORE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OP_ZEROMORE);
    while (r) {
      int c = current_position_(b);
      if (!consumeToken(b, OP_ZEROMORE)) break;
      if (!empty_element_parsed_guard_(b, "typevar", c)) break;
    }
    exit_section_(b, m, TYPEVAR, r);
    return r;
  }

  /* ********************************************************** */
  // identifier_lower
  public static boolean var(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LOWER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER_LOWER);
    exit_section_(b, m, VAR, r);
    return r;
  }

  /* ********************************************************** */
  // <<list var_decl>>
  public static boolean var_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LOWER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = list(b, l + 1, MirandaParser::var_decl);
    exit_section_(b, m, VAR_LIST, r);
    return r;
  }

  /* ********************************************************** */
  // var
  public static boolean var_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_decl")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LOWER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    exit_section_(b, m, VAR_DECL, r);
    return r;
  }

  /* ********************************************************** */
  // var
  public static boolean var_usage(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "var_usage")) return false;
    if (!nextTokenIs(b, IDENTIFIER_LOWER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = var(b, l + 1);
    exit_section_(b, m, VAR_USAGE, r);
    return r;
  }

  /* ********************************************************** */
  // 'where' def+
  public static boolean whdefs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whdefs")) return false;
    if (!nextTokenIs(b, WHERE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHERE);
    r = r && whdefs_1(b, l + 1);
    exit_section_(b, m, WHDEFS, r);
    return r;
  }

  // def+
  private static boolean whdefs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whdefs_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = def(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!def(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "whdefs_1", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Expression root: e1
  // Operator priority table:
  // 0: ATOM(e1_simple)
  // 1: PREFIX(e1_prefix)
  // 2: BINARY(e1_infix)
  public static boolean e1(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "e1")) return false;
    addVariant(b, "<e 1>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<e 1>");
    r = e1_simple(b, l + 1);
    if (!r) r = e1_prefix(b, l + 1);
    p = r;
    r = r && e1_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean e1_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "e1_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 2 && infix(b, l + 1)) {
        r = e1(b, l, 2);
        exit_section_(b, l, m, E_1_INFIX, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // simple+
  public static boolean e1_simple(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "e1_simple")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, E_1_SIMPLE, "<e 1 simple>");
    r = simple(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!simple(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "e1_simple", c)) break;
    }
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  public static boolean e1_prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "e1_prefix")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = prefix(b, l + 1);
    p = r;
    r = p && e1(b, l, 1);
    exit_section_(b, l, m, E_1_PREFIX, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // Expression root: pat
  // Operator priority table:
  // 0: ATOM(pat_numeral)
  // 1: ATOM(pat_construct_formal)
  // 2: BINARY(pat_colon_pat)
  // 3: BINARY(pat_plus_pat)
  // 4: BINARY(pat_construct_pat)
  // 5: PREFIX(pat_parenthesis_formal)
  // 6: ATOM(pat_formal)
  public static boolean pat(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "pat")) return false;
    addVariant(b, "<pat>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<pat>");
    r = pat_numeral(b, l + 1);
    if (!r) r = pat_construct_formal(b, l + 1);
    if (!r) r = pat_parenthesis_formal(b, l + 1);
    if (!r) r = pat_formal(b, l + 1);
    p = r;
    r = r && pat_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean pat_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "pat_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 2 && consumeTokenSmart(b, COLON)) {
        r = pat(b, l, 2);
        exit_section_(b, l, m, PAT_COLON_PAT, r, true, null);
      }
      else if (g < 3 && consumeTokenSmart(b, OP_ONEMORE)) {
        r = pat(b, l, 3);
        exit_section_(b, l, m, PAT_PLUS_PAT, r, true, null);
      } else if (g < 4 && pat_construct_pat_0(b, l + 1)) {
        r = pat(b, l, 4);
        exit_section_(b, l, m, PAT_CONSTRUCT_PAT, r, true, null);
      } else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // '-' number
  public static boolean pat_numeral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_numeral")) return false;
    if (!nextTokenIsSmart(b, OP_MINUS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokensSmart(b, 0, OP_MINUS, NUMBER);
    exit_section_(b, m, PAT_NUMERAL, r);
    return r;
  }

  // constructor formal*
  public static boolean pat_construct_formal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_construct_formal")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER_UPPER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constructor(b, l + 1);
    r = r && pat_construct_formal_1(b, l + 1);
    exit_section_(b, m, PAT_CONSTRUCT_FORMAL, r);
    return r;
  }

  // formal*
  private static boolean pat_construct_formal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_construct_formal_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formal(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pat_construct_formal_1", c)) break;
    }
    return true;
  }

  // '$' constructor
  private static boolean pat_construct_pat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_construct_pat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OP_DOLLAR);
    r = r && constructor(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  public static boolean pat_parenthesis_formal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_parenthesis_formal")) return false;
    if (!nextTokenIsSmart(b, LEFT_PAREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, LEFT_PAREN);
    p = r;
    r = p && pat(b, l, 5);
    r = p && report_error_(b, pat_parenthesis_formal_1(b, l + 1)) && r;
    exit_section_(b, l, m, PAT_PARENTHESIS_FORMAL, r, p, null);
    return r || p;
  }

  // ')' formal*
  private static boolean pat_parenthesis_formal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_parenthesis_formal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RIGHT_PAREN);
    r = r && pat_parenthesis_formal_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // formal*
  private static boolean pat_parenthesis_formal_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_parenthesis_formal_1_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!formal(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "pat_parenthesis_formal_1_1", c)) break;
    }
    return true;
  }

  // formal
  public static boolean pat_formal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pat_formal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PAT_FORMAL, "<pat formal>");
    r = formal(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: type
  // Operator priority table:
  // 0: ATOM(typename_argtype)
  // 1: BINARY(type_to_type)
  // 2: BINARY(type_name_type)
  // 3: ATOM(type_argtype)
  public static boolean type(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "type")) return false;
    addVariant(b, "<type>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = typename_argtype(b, l + 1);
    if (!r) r = type_argtype(b, l + 1);
    p = r;
    r = r && type_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean type_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 1 && consumeTokenSmart(b, OP_ARG)) {
        r = type(b, l, 1);
        exit_section_(b, l, m, TYPE_TO_TYPE, r, true, null);
      } else if (g < 2 && type_name_type_0(b, l + 1)) {
        r = type(b, l, 2);
        exit_section_(b, l, m, TYPE_NAME_TYPE, r, true, null);
      } else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  // typename argtype*
  public static boolean typename_argtype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typename_argtype")) return false;
    if (!nextTokenIsSmart(b, IDENTIFIER_LOWER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typename(b, l + 1);
    r = r && typename_argtype_1(b, l + 1);
    exit_section_(b, m, TYPENAME_ARGTYPE, r);
    return r;
  }

  // argtype*
  private static boolean typename_argtype_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typename_argtype_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!argtype(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typename_argtype_1", c)) break;
    }
    return true;
  }

  // '$' typename
  private static boolean type_name_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, OP_DOLLAR);
    r = r && typename(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // argtype
  public static boolean type_argtype(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_argtype")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ARGTYPE, "<type argtype>");
    r = argtype(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  static final Parser pat_parser_ = (b, l) -> pat(b, l + 1, -1);
  static final Parser type_parser_ = (b, l) -> type(b, l + 1, -1);
}
