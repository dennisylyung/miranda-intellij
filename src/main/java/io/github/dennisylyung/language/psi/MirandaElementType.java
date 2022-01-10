package io.github.dennisylyung.language.psi;

import com.intellij.psi.tree.IElementType;
import io.github.dennisylyung.language.MirandaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MirandaElementType extends IElementType {

    public MirandaElementType(@NotNull @NonNls String debugName) {
        super(debugName, MirandaLanguage.INSTANCE);
    }
}
