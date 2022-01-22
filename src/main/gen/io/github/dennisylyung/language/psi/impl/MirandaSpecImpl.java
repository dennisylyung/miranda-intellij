// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.psi.MirandaSpec;
import io.github.dennisylyung.language.psi.MirandaStatementEnding;
import io.github.dennisylyung.language.psi.MirandaTformList;
import io.github.dennisylyung.language.psi.MirandaType;
import io.github.dennisylyung.language.psi.MirandaVarList;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaSpecImpl extends ASTWrapperPsiElement implements MirandaSpec {

  public MirandaSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitSpec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public MirandaStatementEnding getStatementEnding() {
    return findNotNullChildByClass(MirandaStatementEnding.class);
  }

  @Override
  @Nullable
  public MirandaTformList getTformList() {
    return findChildByClass(MirandaTformList.class);
  }

  @Override
  @NotNull
  public MirandaType getType() {
    return findNotNullChildByClass(MirandaType.class);
  }

  @Override
  @Nullable
  public MirandaVarList getVarList() {
    return findChildByClass(MirandaVarList.class);
  }

}
