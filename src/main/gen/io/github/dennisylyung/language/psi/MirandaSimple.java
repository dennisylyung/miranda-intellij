// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaSimple extends PsiElement {

  @Nullable
  MirandaConstructor getConstructor();

  @Nullable
  MirandaE1 getE1();

  @NotNull
  List<MirandaExp> getExpList();

  @Nullable
  MirandaExps getExps();

  @Nullable
  MirandaInfix getInfix();

  @Nullable
  MirandaLiteral getLiteral();

  @Nullable
  MirandaQualifs getQualifs();

  @Nullable
  MirandaVarUsage getVarUsage();

}
