// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaGenerator extends PsiElement {

  @NotNull
  List<MirandaExp> getExpList();

  @Nullable
  MirandaPat getPat();

  @Nullable
  MirandaPatList getPatList();

}
