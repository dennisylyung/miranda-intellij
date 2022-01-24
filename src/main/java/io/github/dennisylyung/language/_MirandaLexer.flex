package io.github.dennisylyung.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static io.github.dennisylyung.language.psi.MirandaTypes.*;

%%

%{
  public _MirandaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _MirandaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

WHITE_SPACE=[ \t]+
LINE_ENDING=[;\r\n]+
COMMENT=\|\|.*[\r\n]+
CHAR='[^']?'
STRING=[\"][^\"]*[\"]
NUMBER=[0-9]+
IDENTIFIER_LOWER=[a-z][a-zA-Z0-9]*
IDENTIFIER_UPPER=[A-Z][a-zA-Z0-9]*
PATHNAME=('[^'\s]+')|(\<[^>\s]+\>)

%%
<YYINITIAL> {
  {WHITE_SPACE}           { return WHITE_SPACE; }

  "="                     { return OP_EQ; }
  "=="                    { return OP_DOUBLE_EQ; }
  "::="                   { return OP_IS; }
  "::"                    { return OP_SPEC; }
  "->"                    { return OP_ARG; }
  "<-"                    { return OP_GENERATE; }
  "|"                     { return OP_OR; }
  "?"                     { return OP_OPT; }
  "+"                     { return OP_ONEMORE; }
  "*"                     { return OP_ZEROMORE; }
  "&"                     { return OP_AND; }
  "!"                     { return OP_NOT; }
  "-"                     { return OP_MINUS; }
  ".."                    { return OP_DOTS; }
  "++"                    { return OP_DOUBLE_ADD; }
  "--"                    { return OP_DOUBLE_MINUS; }
  "\\/"                   { return OP_BACK_FWD_SLASH; }
  ">"                     { return OP_GREATER; }
  ">="                    { return OP_GREATER_EQUAL; }
  "~+"                    { return OP_SNAKE_ADD; }
  "<="                    { return OP_SMALLER_EQUAL; }
  "<"                     { return OP_SMALLER; }
  "^"                     { return OP_EXPONENT; }
  "."                     { return OP_DOT; }
  "~"                     { return OP_SIMILAR; }
  "#"                     { return OP_HASH; }
  "$"                     { return OP_DOLLAR; }
  ","                     { return SEP_COMMA; }
  ":"                     { return COLON; }
  ";"                     { return SEMICOLON; }
  "/"                     { return SLASH; }
  "//"                    { return DOUBLE_SLASH; }
  "{"                     { return LEFT_BRACE; }
  "}"                     { return RIGHT_BRACE; }
  "["                     { return LEFT_BRACKET; }
  "]"                     { return RIGHT_BRACKET; }
  "("                     { return LEFT_PAREN; }
  ")"                     { return RIGHT_PAREN; }
  "<<"                    { return EXTERNAL_START; }
  ">>"                    { return EXTERNAL_END; }
  "if"                    { return IF; }
  "otherwise"             { return OTHERWISE; }
  "abstype"               { return ABSTYPE; }
  "with"                  { return WITH; }
  "where"                 { return WHERE; }
  "div"                   { return DIV; }
  "mod"                   { return MOD; }
  "readvals"              { return READVALS; }
  "show"                  { return SHOW; }
  "%include"              { return INCLUDE; }
  "%export"               { return EXPORT; }
  "%free"                 { return FREE; }
  "True"                  { return TRUE; }
  "False"                 { return FALSE; }

  {WHITE_SPACE}           { return WHITE_SPACE; }
  {LINE_ENDING}           { return LINE_ENDING; }
  {COMMENT}               { return COMMENT; }
  {CHAR}                  { return CHAR; }
  {STRING}                { return STRING; }
  {NUMBER}                { return NUMBER; }
  {IDENTIFIER_LOWER}      { return IDENTIFIER_LOWER; }
  {IDENTIFIER_UPPER}      { return IDENTIFIER_UPPER; }
  {PATHNAME}              { return PATHNAME; }

}

[^] { return BAD_CHARACTER; }
