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

  @Override
  @Nullable
  public PsiElement getLineEnding() {
    return findChildByType(LINE_ENDING);
  }

}
