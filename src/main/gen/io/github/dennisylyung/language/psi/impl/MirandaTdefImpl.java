// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.psi.MirandaConstructs;
import io.github.dennisylyung.language.psi.MirandaSig;
import io.github.dennisylyung.language.psi.MirandaStatementEnding;
import io.github.dennisylyung.language.psi.MirandaTdef;
import io.github.dennisylyung.language.psi.MirandaTform;
import io.github.dennisylyung.language.psi.MirandaTformList;
import io.github.dennisylyung.language.psi.MirandaType;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaTdefImpl extends ASTWrapperPsiElement implements MirandaTdef {

  public MirandaTdefImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitTdef(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaConstructs getConstructs() {
    return findChildByClass(MirandaConstructs.class);
  }

  @Override
  @Nullable
  public MirandaSig getSig() {
    return findChildByClass(MirandaSig.class);
  }

  @Override
  @NotNull
  public MirandaStatementEnding getStatementEnding() {
    return findNotNullChildByClass(MirandaStatementEnding.class);
  }

  @Override
  @Nullable
  public MirandaTform getTform() {
    return findChildByClass(MirandaTform.class);
  }

  @Override
  @Nullable
  public MirandaTformList getTformList() {
    return findChildByClass(MirandaTformList.class);
  }

  @Override
  @Nullable
  public MirandaType getType() {
    return findChildByClass(MirandaType.class);
  }

}
