// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MirandaSpec extends PsiElement {

  @NotNull
  MirandaStatementEnding getStatementEnding();

  @Nullable
  MirandaTformList getTformList();

  @NotNull
  MirandaType getType();

  @Nullable
  MirandaVarList getVarList();

}
