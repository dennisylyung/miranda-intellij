// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.dennisylyung.language.psi.MirandaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.dennisylyung.language.psi.*;

public class MirandaSimpleImpl extends ASTWrapperPsiElement implements MirandaSimple {

  public MirandaSimpleImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitSimple(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaConstructor getConstructor() {
    return findChildByClass(MirandaConstructor.class);
  }

  @Override
  @Nullable
  public MirandaE1 getE1() {
    return findChildByClass(MirandaE1.class);
  }

  @Override
  @NotNull
  public List<MirandaExp> getExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaExp.class);
  }

  @Override
  @Nullable
  public MirandaExps getExps() {
    return findChildByClass(MirandaExps.class);
  }

  @Override
  @Nullable
  public MirandaInfix getInfix() {
    return findChildByClass(MirandaInfix.class);
  }

  @Override
  @Nullable
  public MirandaLiteral getLiteral() {
    return findChildByClass(MirandaLiteral.class);
  }

  @Override
  @Nullable
  public MirandaQualifs getQualifs() {
    return findChildByClass(MirandaQualifs.class);
  }

  @Override
  @Nullable
  public MirandaVarUsage getVarUsage() {
    return findChildByClass(MirandaVarUsage.class);
  }

}
