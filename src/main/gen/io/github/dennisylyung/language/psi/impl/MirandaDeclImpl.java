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

public class MirandaDeclImpl extends ASTWrapperPsiElement implements MirandaDecl {

  public MirandaDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public MirandaDef getDef() {
    return findChildByClass(MirandaDef.class);
  }

  @Override
  @Nullable
  public MirandaLibdir getLibdir() {
    return findChildByClass(MirandaLibdir.class);
  }

  @Override
  @Nullable
  public MirandaSpec getSpec() {
    return findChildByClass(MirandaSpec.class);
  }

  @Override
  @Nullable
  public MirandaTdef getTdef() {
    return findChildByClass(MirandaTdef.class);
  }

  @Override
  @Nullable
  public PsiElement getLineEnding() {
    return findChildByType(LINE_ENDING);
  }

}
