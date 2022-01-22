// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.psi.MirandaBinding;
import io.github.dennisylyung.language.psi.MirandaExp;
import io.github.dennisylyung.language.psi.MirandaStatementEnding;
import io.github.dennisylyung.language.psi.MirandaTform;
import io.github.dennisylyung.language.psi.MirandaType;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaBindingImpl extends ASTWrapperPsiElement implements MirandaBinding {

  public MirandaBindingImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitBinding(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaExp getExp() {
    return findChildByClass(MirandaExp.class);
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
  public MirandaType getType() {
    return findChildByClass(MirandaType.class);
  }

  @Override
  @Nullable
  public MirandaVar getVar() {
    return findChildByClass(MirandaVar.class);
  }

}
