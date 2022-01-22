// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MirandaBinding extends PsiElement {

  @Nullable
  MirandaExp getExp();

  @NotNull
  MirandaStatementEnding getStatementEnding();

  @Nullable
  MirandaTform getTform();

  @Nullable
  MirandaType getType();

  @Nullable
  MirandaVar getVar();

}
