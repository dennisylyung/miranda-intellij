// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaConstruct extends PsiElement {

  @NotNull
  List<MirandaArgtype> getArgtypeList();

  @Nullable
  MirandaConstruct getConstruct();

  @Nullable
  MirandaConstructor getConstructor();

  @NotNull
  List<MirandaType> getTypeList();

}
