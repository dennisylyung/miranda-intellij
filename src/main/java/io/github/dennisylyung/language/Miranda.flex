package io.github.dennisylyung.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.github.dennisylyung.language.psi.MirandaTypes;
import com.intellij.psi.TokenType;

%%

%class MirandaLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

NEW_LINE=[\n\r]
WHITE_SPACE=[\ \n\t\f]
COMMENT="||"[^\r\n]*{NEW_LINE}
IDENTIFIER=[a-zA-Z][a-zA-Z0-9_']*
NATURAL_NUMBER=[0-9]+
DECIMAL=[0-9]*"."{NATURAL_NUMBER}
EPART="e"("+"|"-")?{NATURAL_NUMBER}
CHAR="'"[^\']"'"
STRING=[\"][^\"]*[\"]
TYPEVAR=\*+
OPERATOR=("++"|"--"|"\/"|"&"|">"|">="|"="|"~+"|"<="|"<"|"+"|"*"|"/"|"div"|"mod"|"^"|"."|"!")
KEYWORD=("abstype"|"if"|"otherwise"|"readvals"|"show"|"type"|"where"|"with"|"%export"|"%free"|"%include"|"%insert"|"%list"|"%nolist"|"="|"=="|": ::="|"::"|"=>"|"vertical_bar"|"//"|"->"|";"|","|"("|")"|"["|"]"|"{"|"}"|"<-"|".."|"$$"|"$-"|"$+"|"$*")


%state WAITING_VALUE

%%

<YYINITIAL> {
      {NEW_LINE}                      { return MirandaTypes.NEW_LINE; }
      {WHITE_SPACE}                   { return MirandaTypes.WHITE_SPACE; }
      {COMMENT}                       { return MirandaTypes.COMMENT; }
      {IDENTIFIER}                    { return MirandaTypes.IDENTIFIER; }
      {NATURAL_NUMBER}                { return MirandaTypes.NATURAL_NUMBER; }
      {DECIMAL}                       { return MirandaTypes.DECIMAL; }
      {EPART}                         { return MirandaTypes.EPART; }
      {CHAR}                          { return MirandaTypes.CHAR; }
      {STRING}                        { return MirandaTypes.STRING; }
      {TYPEVAR}                       { return MirandaTypes.TYPEVAR; }
      {OPERATOR}                      { return MirandaTypes.OPERATOR; }
      {KEYWORD}                       { return MirandaTypes.KEYWORD; }
    }

/* error fallback */
[^]                                   { return TokenType.BAD_CHARACTER; }
