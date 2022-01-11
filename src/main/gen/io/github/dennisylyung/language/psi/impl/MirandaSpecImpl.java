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

public class MirandaSpecImpl extends ASTWrapperPsiElement implements MirandaSpec {

  public MirandaSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitSpec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
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

  @Override
  @Nullable
  public PsiElement getLineEnding() {
    return findChildByType(LINE_ENDING);
  }

}
