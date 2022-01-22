// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MirandaTdef extends PsiElement {

  @Nullable
  MirandaConstructs getConstructs();

  @Nullable
  MirandaSig getSig();

  @NotNull
  MirandaStatementEnding getStatementEnding();

  @Nullable
  MirandaTform getTform();

  @Nullable
  MirandaTformList getTformList();

  @Nullable
  MirandaType getType();

}
