// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import io.github.dennisylyung.language.psi.impl.MirandaAliaseImpl;
import io.github.dennisylyung.language.psi.impl.MirandaAliasesImpl;
import io.github.dennisylyung.language.psi.impl.MirandaAltImpl;
import io.github.dennisylyung.language.psi.impl.MirandaArgtypeImpl;
import io.github.dennisylyung.language.psi.impl.MirandaBinderImpl;
import io.github.dennisylyung.language.psi.impl.MirandaBindingImpl;
import io.github.dennisylyung.language.psi.impl.MirandaBoolImpl;
import io.github.dennisylyung.language.psi.impl.MirandaCasesImpl;
import io.github.dennisylyung.language.psi.impl.MirandaConstructImpl;
import io.github.dennisylyung.language.psi.impl.MirandaConstructorImpl;
import io.github.dennisylyung.language.psi.impl.MirandaConstructsImpl;
import io.github.dennisylyung.language.psi.impl.MirandaDeclImpl;
import io.github.dennisylyung.language.psi.impl.MirandaDefImpl;
import io.github.dennisylyung.language.psi.impl.MirandaE1InfixImpl;
import io.github.dennisylyung.language.psi.impl.MirandaE1PrefixImpl;
import io.github.dennisylyung.language.psi.impl.MirandaE1SimpleImpl;
import io.github.dennisylyung.language.psi.impl.MirandaEnvImpl;
import io.github.dennisylyung.language.psi.impl.MirandaExpImpl;
import io.github.dennisylyung.language.psi.impl.MirandaExpsImpl;
import io.github.dennisylyung.language.psi.impl.MirandaFnformImpl;
import io.github.dennisylyung.language.psi.impl.MirandaFormalImpl;
import io.github.dennisylyung.language.psi.impl.MirandaGeneratorImpl;
import io.github.dennisylyung.language.psi.impl.MirandaInfixImpl;
import io.github.dennisylyung.language.psi.impl.MirandaLastaltImpl;
import io.github.dennisylyung.language.psi.impl.MirandaLastcaseImpl;
import io.github.dennisylyung.language.psi.impl.MirandaLibdirImpl;
import io.github.dennisylyung.language.psi.impl.MirandaListImpl;
import io.github.dennisylyung.language.psi.impl.MirandaLiteralImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPartImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPartsImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatColonPatImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatConstructFormalImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatConstructPatImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatFormalImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatListImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatNumeralImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatParenthesisFormalImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPatPlusPatImpl;
import io.github.dennisylyung.language.psi.impl.MirandaPrefix1Impl;
import io.github.dennisylyung.language.psi.impl.MirandaPrefixImpl;
import io.github.dennisylyung.language.psi.impl.MirandaQualifierImpl;
import io.github.dennisylyung.language.psi.impl.MirandaQualifsImpl;
import io.github.dennisylyung.language.psi.impl.MirandaRhsImpl;
import io.github.dennisylyung.language.psi.impl.MirandaSigImpl;
import io.github.dennisylyung.language.psi.impl.MirandaSimpleImpl;
import io.github.dennisylyung.language.psi.impl.MirandaSimpleRhsImpl;
import io.github.dennisylyung.language.psi.impl.MirandaSpecImpl;
import io.github.dennisylyung.language.psi.impl.MirandaStatementEndingImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTdefImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTformImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTformListImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypeArgtypeImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypeListImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypeNameTypeImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypeToTypeImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypenameArgtypeImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypenameImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypevarImpl;
import io.github.dennisylyung.language.psi.impl.MirandaVarDeclImpl;
import io.github.dennisylyung.language.psi.impl.MirandaVarImpl;
import io.github.dennisylyung.language.psi.impl.MirandaVarListImpl;
import io.github.dennisylyung.language.psi.impl.MirandaVarUsageImpl;
import io.github.dennisylyung.language.psi.impl.MirandaWhdefsImpl;

public interface MirandaTypes {

  IElementType ALIASE = new MirandaElementType("ALIASE");
  IElementType ALIASES = new MirandaElementType("ALIASES");
  IElementType ALT = new MirandaElementType("ALT");
  IElementType ARGTYPE = new MirandaElementType("ARGTYPE");
  IElementType BINDER = new MirandaElementType("BINDER");
  IElementType BINDING = new MirandaElementType("BINDING");
  IElementType BOOL = new MirandaElementType("BOOL");
  IElementType CASES = new MirandaElementType("CASES");
  IElementType CONSTRUCT = new MirandaElementType("CONSTRUCT");
  IElementType CONSTRUCTOR = new MirandaElementType("CONSTRUCTOR");
  IElementType CONSTRUCTS = new MirandaElementType("CONSTRUCTS");
  IElementType DECL = new MirandaElementType("DECL");
  IElementType DEF = new MirandaElementType("DEF");
  IElementType ENV = new MirandaElementType("ENV");
  IElementType EXP = new MirandaElementType("EXP");
  IElementType EXPS = new MirandaElementType("EXPS");
  IElementType E_1 = new MirandaElementType("E_1");
  IElementType E_1_INFIX = new MirandaElementType("E_1_INFIX");
  IElementType E_1_PREFIX = new MirandaElementType("E_1_PREFIX");
  IElementType E_1_SIMPLE = new MirandaElementType("E_1_SIMPLE");
  IElementType FNFORM = new MirandaElementType("FNFORM");
  IElementType FORMAL = new MirandaElementType("FORMAL");
  IElementType GENERATOR = new MirandaElementType("GENERATOR");
  IElementType INFIX = new MirandaElementType("INFIX");
  IElementType LASTALT = new MirandaElementType("LASTALT");
  IElementType LASTCASE = new MirandaElementType("LASTCASE");
  IElementType LIBDIR = new MirandaElementType("LIBDIR");
  IElementType LIST = new MirandaElementType("LIST");
  IElementType LITERAL = new MirandaElementType("LITERAL");
  IElementType PART = new MirandaElementType("PART");
  IElementType PARTS = new MirandaElementType("PARTS");
  IElementType PAT = new MirandaElementType("PAT");
  IElementType PAT_COLON_PAT = new MirandaElementType("PAT_COLON_PAT");
  IElementType PAT_CONSTRUCT_FORMAL = new MirandaElementType("PAT_CONSTRUCT_FORMAL");
  IElementType PAT_CONSTRUCT_PAT = new MirandaElementType("PAT_CONSTRUCT_PAT");
  IElementType PAT_FORMAL = new MirandaElementType("PAT_FORMAL");
  IElementType PAT_LIST = new MirandaElementType("PAT_LIST");
  IElementType PAT_NUMERAL = new MirandaElementType("PAT_NUMERAL");
  IElementType PAT_PARENTHESIS_FORMAL = new MirandaElementType("PAT_PARENTHESIS_FORMAL");
  IElementType PAT_PLUS_PAT = new MirandaElementType("PAT_PLUS_PAT");
  IElementType PREFIX = new MirandaElementType("PREFIX");
  IElementType PREFIX_1 = new MirandaElementType("PREFIX_1");
  IElementType QUALIFIER = new MirandaElementType("QUALIFIER");
  IElementType QUALIFS = new MirandaElementType("QUALIFS");
  IElementType RHS = new MirandaElementType("RHS");
  IElementType SIG = new MirandaElementType("SIG");
  IElementType SIMPLE = new MirandaElementType("SIMPLE");
  IElementType SIMPLE_RHS = new MirandaElementType("SIMPLE_RHS");
  IElementType SPEC = new MirandaElementType("SPEC");
  IElementType STATEMENT_ENDING = new MirandaElementType("STATEMENT_ENDING");
  IElementType TDEF = new MirandaElementType("TDEF");
  IElementType TFORM = new MirandaElementType("TFORM");
  IElementType TFORM_LIST = new MirandaElementType("TFORM_LIST");
  IElementType TYPE = new MirandaElementType("TYPE");
  IElementType TYPENAME = new MirandaElementType("TYPENAME");
  IElementType TYPENAME_ARGTYPE = new MirandaElementType("TYPENAME_ARGTYPE");
  IElementType TYPEVAR = new MirandaElementType("TYPEVAR");
  IElementType TYPE_ARGTYPE = new MirandaElementType("TYPE_ARGTYPE");
  IElementType TYPE_LIST = new MirandaElementType("TYPE_LIST");
  IElementType TYPE_NAME_TYPE = new MirandaElementType("TYPE_NAME_TYPE");
  IElementType TYPE_TO_TYPE = new MirandaElementType("TYPE_TO_TYPE");
  IElementType VAR = new MirandaElementType("VAR");
  IElementType VAR_DECL = new MirandaElementType("VAR_DECL");
  IElementType VAR_LIST = new MirandaElementType("VAR_LIST");
  IElementType VAR_USAGE = new MirandaElementType("VAR_USAGE");
  IElementType WHDEFS = new MirandaElementType("WHDEFS");

  IElementType ABSTYPE = new MirandaTokenType("abstype");
  IElementType CHAR = new MirandaTokenType("char");
  IElementType COLON = new MirandaTokenType(":");
  IElementType COMMENT = new MirandaTokenType("comment");
  IElementType DIV = new MirandaTokenType("div");
  IElementType DOUBLE_SLASH = new MirandaTokenType("//");
  IElementType EXPORT = new MirandaTokenType("%export");
  IElementType EXTERNAL_END = new MirandaTokenType(">>");
  IElementType EXTERNAL_START = new MirandaTokenType("<<");
  IElementType FALSE = new MirandaTokenType("False");
  IElementType FREE = new MirandaTokenType("%free");
  IElementType IDENTIFIER_LOWER = new MirandaTokenType("identifier_lower");
  IElementType IDENTIFIER_UPPER = new MirandaTokenType("identifier_upper");
  IElementType IF = new MirandaTokenType("if");
  IElementType INCLUDE = new MirandaTokenType("%include");
  IElementType LEFT_BRACE = new MirandaTokenType("{");
  IElementType LEFT_BRACKET = new MirandaTokenType("[");
  IElementType LEFT_PAREN = new MirandaTokenType("(");
  IElementType LINE_ENDING = new MirandaTokenType("line_ending");
  IElementType MOD = new MirandaTokenType("mod");
  IElementType NUMBER = new MirandaTokenType("number");
  IElementType OP_AND = new MirandaTokenType("&");
  IElementType OP_ARG = new MirandaTokenType("->");
  IElementType OP_BACK_FWD_SLASH = new MirandaTokenType("\\/");
  IElementType OP_DOT = new MirandaTokenType(".");
  IElementType OP_DOTS = new MirandaTokenType("..");
  IElementType OP_DOUBLE_ADD = new MirandaTokenType("++");
  IElementType OP_DOUBLE_EQ = new MirandaTokenType("==");
  IElementType OP_DOUBLE_MINUS = new MirandaTokenType("--");
  IElementType OP_EQ = new MirandaTokenType("=");
  IElementType OP_EXPONENT = new MirandaTokenType("^");
  IElementType OP_GENERATE = new MirandaTokenType("<-");
  IElementType OP_GREATER = new MirandaTokenType(">");
  IElementType OP_GREATER_EQUAL = new MirandaTokenType(">=");
  IElementType OP_HASH = new MirandaTokenType("#");
  IElementType OP_IS = new MirandaTokenType("::=");
  IElementType OP_MINUS = new MirandaTokenType("-");
  IElementType OP_NOT = new MirandaTokenType("!");
  IElementType OP_ONEMORE = new MirandaTokenType("+");
  IElementType OP_OPT = new MirandaTokenType("?");
  IElementType OP_OR = new MirandaTokenType("|");
  IElementType OP_SIMILAR = new MirandaTokenType("~");
  IElementType OP_SMALLER = new MirandaTokenType("<");
  IElementType OP_SMALLER_EQUAL = new MirandaTokenType("<=");
  IElementType OP_SNAKE_ADD = new MirandaTokenType("~+");
  IElementType OP_SPEC = new MirandaTokenType("::");
  IElementType OP_ZEROMORE = new MirandaTokenType("*");
  IElementType OTHERWISE = new MirandaTokenType("otherwise");
  IElementType PATHNAME = new MirandaTokenType("pathname");
  IElementType READVALS = new MirandaTokenType("readvals");
  IElementType RIGHT_BRACE = new MirandaTokenType("}");
  IElementType RIGHT_BRACKET = new MirandaTokenType("]");
  IElementType RIGHT_PAREN = new MirandaTokenType(")");
  IElementType SEMICOLON = new MirandaTokenType(";");
  IElementType SEP_COMMA = new MirandaTokenType(",");
  IElementType SHOW = new MirandaTokenType("show");
  IElementType SLASH = new MirandaTokenType("/");
  IElementType STRING = new MirandaTokenType("string");
  IElementType TRUE = new MirandaTokenType("True");
  IElementType WHERE = new MirandaTokenType("where");
  IElementType WITH = new MirandaTokenType("with");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ALIASE) {
        return new MirandaAliaseImpl(node);
      }
      else if (type == ALIASES) {
        return new MirandaAliasesImpl(node);
      }
      else if (type == ALT) {
        return new MirandaAltImpl(node);
      }
      else if (type == ARGTYPE) {
        return new MirandaArgtypeImpl(node);
      }
      else if (type == BINDER) {
        return new MirandaBinderImpl(node);
      }
      else if (type == BINDING) {
        return new MirandaBindingImpl(node);
      }
      else if (type == BOOL) {
        return new MirandaBoolImpl(node);
      }
      else if (type == CASES) {
        return new MirandaCasesImpl(node);
      }
      else if (type == CONSTRUCT) {
        return new MirandaConstructImpl(node);
      }
      else if (type == CONSTRUCTOR) {
        return new MirandaConstructorImpl(node);
      }
      else if (type == CONSTRUCTS) {
        return new MirandaConstructsImpl(node);
      }
      else if (type == DECL) {
        return new MirandaDeclImpl(node);
      }
      else if (type == DEF) {
        return new MirandaDefImpl(node);
      }
      else if (type == ENV) {
        return new MirandaEnvImpl(node);
      }
      else if (type == EXP) {
        return new MirandaExpImpl(node);
      }
      else if (type == EXPS) {
        return new MirandaExpsImpl(node);
      }
      else if (type == E_1_INFIX) {
        return new MirandaE1InfixImpl(node);
      }
      else if (type == E_1_PREFIX) {
        return new MirandaE1PrefixImpl(node);
      }
      else if (type == E_1_SIMPLE) {
        return new MirandaE1SimpleImpl(node);
      }
      else if (type == FNFORM) {
        return new MirandaFnformImpl(node);
      }
      else if (type == FORMAL) {
        return new MirandaFormalImpl(node);
      }
      else if (type == GENERATOR) {
        return new MirandaGeneratorImpl(node);
      }
      else if (type == INFIX) {
        return new MirandaInfixImpl(node);
      }
      else if (type == LASTALT) {
        return new MirandaLastaltImpl(node);
      }
      else if (type == LASTCASE) {
        return new MirandaLastcaseImpl(node);
      }
      else if (type == LIBDIR) {
        return new MirandaLibdirImpl(node);
      }
      else if (type == LIST) {
        return new MirandaListImpl(node);
      }
      else if (type == LITERAL) {
        return new MirandaLiteralImpl(node);
      }
      else if (type == PART) {
        return new MirandaPartImpl(node);
      }
      else if (type == PARTS) {
        return new MirandaPartsImpl(node);
      }
      else if (type == PAT_COLON_PAT) {
        return new MirandaPatColonPatImpl(node);
      }
      else if (type == PAT_CONSTRUCT_FORMAL) {
        return new MirandaPatConstructFormalImpl(node);
      }
      else if (type == PAT_CONSTRUCT_PAT) {
        return new MirandaPatConstructPatImpl(node);
      }
      else if (type == PAT_FORMAL) {
        return new MirandaPatFormalImpl(node);
      }
      else if (type == PAT_LIST) {
        return new MirandaPatListImpl(node);
      }
      else if (type == PAT_NUMERAL) {
        return new MirandaPatNumeralImpl(node);
      }
      else if (type == PAT_PARENTHESIS_FORMAL) {
        return new MirandaPatParenthesisFormalImpl(node);
      }
      else if (type == PAT_PLUS_PAT) {
        return new MirandaPatPlusPatImpl(node);
      }
      else if (type == PREFIX) {
        return new MirandaPrefixImpl(node);
      }
      else if (type == PREFIX_1) {
        return new MirandaPrefix1Impl(node);
      }
      else if (type == QUALIFIER) {
        return new MirandaQualifierImpl(node);
      }
      else if (type == QUALIFS) {
        return new MirandaQualifsImpl(node);
      }
      else if (type == RHS) {
        return new MirandaRhsImpl(node);
      }
      else if (type == SIG) {
        return new MirandaSigImpl(node);
      }
      else if (type == SIMPLE) {
        return new MirandaSimpleImpl(node);
      }
      else if (type == SIMPLE_RHS) {
        return new MirandaSimpleRhsImpl(node);
      }
      else if (type == SPEC) {
        return new MirandaSpecImpl(node);
      } else if (type == STATEMENT_ENDING) {
        return new MirandaStatementEndingImpl(node);
      } else if (type == TDEF) {
        return new MirandaTdefImpl(node);
      } else if (type == TFORM) {
        return new MirandaTformImpl(node);
      } else if (type == TFORM_LIST) {
        return new MirandaTformListImpl(node);
      } else if (type == TYPENAME) {
        return new MirandaTypenameImpl(node);
      } else if (type == TYPENAME_ARGTYPE) {
        return new MirandaTypenameArgtypeImpl(node);
      } else if (type == TYPEVAR) {
        return new MirandaTypevarImpl(node);
      } else if (type == TYPE_ARGTYPE) {
        return new MirandaTypeArgtypeImpl(node);
      } else if (type == TYPE_LIST) {
        return new MirandaTypeListImpl(node);
      } else if (type == TYPE_NAME_TYPE) {
        return new MirandaTypeNameTypeImpl(node);
      } else if (type == TYPE_TO_TYPE) {
        return new MirandaTypeToTypeImpl(node);
      } else if (type == VAR) {
        return new MirandaVarImpl(node);
      } else if (type == VAR_DECL) {
        return new MirandaVarDeclImpl(node);
      } else if (type == VAR_LIST) {
        return new MirandaVarListImpl(node);
      } else if (type == VAR_USAGE) {
        return new MirandaVarUsageImpl(node);
      } else if (type == WHDEFS) {
        return new MirandaWhdefsImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
