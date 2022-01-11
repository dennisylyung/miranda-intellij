// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.dennisylyung.language.psi.MirandaTypes.*;
import io.github.dennisylyung.language.psi.*;

public class MirandaTypenameArgtypeImpl extends MirandaTypeImpl implements MirandaTypenameArgtype {

  public MirandaTypenameArgtypeImpl(@NotNull ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitTypenameArgtype(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MirandaArgtype> getArgtypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MirandaArgtype.class);
  }

  @Override
  @NotNull
  public MirandaTypename getTypename() {
    return findNotNullChildByClass(MirandaTypename.class);
  }

}
