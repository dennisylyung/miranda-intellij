// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.psi.MirandaAlt;
import io.github.dennisylyung.language.psi.MirandaCases;
import io.github.dennisylyung.language.psi.MirandaLastcase;
import io.github.dennisylyung.language.psi.MirandaStatementEnding;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static io.github.dennisylyung.language.psi.MirandaTypes.LINE_ENDING;

public class MirandaCasesImpl extends ASTWrapperPsiElement implements MirandaCases {

  public MirandaCasesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitCases(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaAlt getAlt() {
    return findChildByClass(MirandaAlt.class);
  }

  @Override
  @Nullable
  public MirandaCases getCases() {
    return findChildByClass(MirandaCases.class);
  }

  @Override
  @Nullable
  public MirandaLastcase getLastcase() {
    return findChildByClass(MirandaLastcase.class);
  }

  @Override
  @Nullable
  public MirandaStatementEnding getStatementEnding() {
    return findChildByClass(MirandaStatementEnding.class);
  }

  @Override
  @Nullable
  public PsiElement getLineEnding() {
    return findChildByType(LINE_ENDING);
  }

}
