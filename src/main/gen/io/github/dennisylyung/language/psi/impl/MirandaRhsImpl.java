// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.psi.MirandaCases;
import io.github.dennisylyung.language.psi.MirandaRhs;
import io.github.dennisylyung.language.psi.MirandaSimpleRhs;
import io.github.dennisylyung.language.psi.MirandaStatementEnding;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaRhsImpl extends ASTWrapperPsiElement implements MirandaRhs {

  public MirandaRhsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitRhs(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaCases getCases() {
    return findChildByClass(MirandaCases.class);
  }

  @Override
  @Nullable
  public MirandaSimpleRhs getSimpleRhs() {
    return findChildByClass(MirandaSimpleRhs.class);
  }

  @Override
  @Nullable
  public MirandaStatementEnding getStatementEnding() {
    return findChildByClass(MirandaStatementEnding.class);
  }

}
