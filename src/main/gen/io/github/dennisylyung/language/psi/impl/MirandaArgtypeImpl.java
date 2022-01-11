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

public class MirandaArgtypeImpl extends ASTWrapperPsiElement implements MirandaArgtype {

  public MirandaArgtypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitArgtype(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaTypeList getTypeList() {
    return findChildByClass(MirandaTypeList.class);
  }

  @Override
  @Nullable
  public MirandaTypename getTypename() {
    return findChildByClass(MirandaTypename.class);
  }

  @Override
  @Nullable
  public MirandaTypevar getTypevar() {
    return findChildByClass(MirandaTypevar.class);
  }

}
