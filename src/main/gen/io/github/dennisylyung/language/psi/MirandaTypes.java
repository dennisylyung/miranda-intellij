// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.dennisylyung.language.psi.impl.*;

public interface MirandaTypes {

  IElementType DELIMITER = new MirandaElementType("DELIMITER");
  IElementType FLOAT = new MirandaElementType("FLOAT");
  IElementType LAYOUT = new MirandaElementType("LAYOUT");
  IElementType LITERAL = new MirandaElementType("LITERAL");
  IElementType NUMERAL = new MirandaElementType("NUMERAL");
  IElementType TOKEN = new MirandaElementType("TOKEN");

  IElementType CHAR = new MirandaTokenType("CHAR");
  IElementType COMMENT = new MirandaTokenType("COMMENT");
  IElementType DECIMAL = new MirandaTokenType("DECIMAL");
  IElementType EPART = new MirandaTokenType("EPART");
  IElementType IDENTIFIER = new MirandaTokenType("IDENTIFIER");
  IElementType KEYWORD = new MirandaTokenType("KEYWORD");
  IElementType NATURAL_NUMBER = new MirandaTokenType("NATURAL_NUMBER");
  IElementType NEW_LINE = new MirandaTokenType("NEW_LINE");
  IElementType OPERATOR = new MirandaTokenType("OPERATOR");
  IElementType STRING = new MirandaTokenType("STRING");
  IElementType TYPEVAR = new MirandaTokenType("TYPEVAR");
  IElementType WHITE_SPACE = new MirandaTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == DELIMITER) {
        return new MirandaDelimiterImpl(node);
      }
      else if (type == FLOAT) {
        return new MirandaFloatImpl(node);
      }
      else if (type == LAYOUT) {
        return new MirandaLayoutImpl(node);
      }
      else if (type == LITERAL) {
        return new MirandaLiteralImpl(node);
      }
      else if (type == NUMERAL) {
        return new MirandaNumeralImpl(node);
      }
      else if (type == TOKEN) {
        return new MirandaTokenImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
