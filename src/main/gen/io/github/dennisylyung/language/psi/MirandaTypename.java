// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import com.intellij.psi.PsiElement;
import io.github.dennisylyung.language.MirandaReference;
import org.jetbrains.annotations.NotNull;

public interface MirandaTypename extends MirandaNamedElement {

  @NotNull
  PsiElement getIdentifierLower();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

  MirandaReference getReference();

}
