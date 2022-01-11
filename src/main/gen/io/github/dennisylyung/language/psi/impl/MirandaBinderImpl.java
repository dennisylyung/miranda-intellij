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

public class MirandaBinderImpl extends ASTWrapperPsiElement implements MirandaBinder {

  public MirandaBinderImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitBinder(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MirandaBinding> getBindingList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaBinding.class);
  }

}
