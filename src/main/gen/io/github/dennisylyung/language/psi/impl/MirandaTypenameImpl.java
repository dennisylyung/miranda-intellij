// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import io.github.dennisylyung.language.MirandaReference;
import io.github.dennisylyung.language.psi.MirandaTypename;
import io.github.dennisylyung.language.psi.MirandaVisitor;
import org.jetbrains.annotations.NotNull;

import static io.github.dennisylyung.language.psi.MirandaTypes.IDENTIFIER_LOWER;

public class MirandaTypenameImpl extends MirandaNamedElementImpl implements MirandaTypename {

  public MirandaTypenameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MirandaVisitor visitor) {
    visitor.visitTypename(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MirandaVisitor) accept((MirandaVisitor) visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getIdentifierLower() {
    return findNotNullChildByType(IDENTIFIER_LOWER);
  }

  @Override
  public String getName() {
    return MirandaPsiImplUtil.getName(this);
  }

  @Override
  public PsiElement setName(String newName) {
    return MirandaPsiImplUtil.setName(this, newName);
  }

  @Override
  public PsiElement getNameIdentifier() {
    return MirandaPsiImplUtil.getNameIdentifier(this);
  }

  @Override
  public MirandaReference getReference() {
    return MirandaPsiImplUtil.getReference(this);
  }

}
