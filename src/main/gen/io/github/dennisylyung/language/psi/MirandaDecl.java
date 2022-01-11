// This is a generated file. Not intended for manual editing.
package io.github.dennisylyung.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MirandaDecl extends PsiElement {

  @Nullable
  MirandaDef getDef();

  @Nullable
  MirandaLibdir getLibdir();

  @Nullable
  MirandaSpec getSpec();

  @Nullable
  MirandaTdef getTdef();

  @Nullable
  PsiElement getLineEnding();

}
