// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.psi.MirandaEnv;
import io.github.dennisylyung.language.psi.MirandaLibdir;
import io.github.dennisylyung.language.psi.MirandaParts;
import io.github.dennisylyung.language.psi.MirandaSig;
import io.github.dennisylyung.language.psi.MirandaStatementEnding;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaLibdirImpl extends ASTWrapperPsiElement implements MirandaLibdir {

  public MirandaLibdirImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitLibdir(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaEnv getEnv() {
    return findChildByClass(MirandaEnv.class);
  }

  @Override
  @Nullable
  public MirandaParts getParts() {
    return findChildByClass(MirandaParts.class);
  }

  @Override
  @Nullable
  public MirandaSig getSig() {
    return findChildByClass(MirandaSig.class);
  }

  @Override
  @Nullable
  public MirandaStatementEnding getStatementEnding() {
    return findChildByClass(MirandaStatementEnding.class);
  }

}
