// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaBinding extends PsiElement {

  @Nullable
  MirandaExp getExp();

  @Nullable
  MirandaTform getTform();

  @Nullable
  MirandaType getType();

  @Nullable
  MirandaVar getVar();

  @Nullable
  PsiElement getLineEnding();

}
