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

public class MirandaFnformImpl extends ASTWrapperPsiElement implements MirandaFnform {

  public MirandaFnformImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitFnform(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaFnform getFnform() {
    return findChildByClass(MirandaFnform.class);
  }

  @Override
  @NotNull
  public List<MirandaFormal> getFormalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaFormal.class);
  }

  @Override
  @NotNull
  public List<MirandaPat> getPatList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaPat.class);
  }

  @Override
  @Nullable
  public MirandaVarDecl getVarDecl() {
    return findChildByClass(MirandaVarDecl.class);
  }

}
