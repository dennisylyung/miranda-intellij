package io.github.dennisylyung.language;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import io.github.dennisylyung.language.psi.MirandaVar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaRefactoringSupportProvider extends RefactoringSupportProvider {

    @Override
    public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement elementToRename, @Nullable PsiElement context) {
        return (elementToRename instanceof MirandaVar);
    }

}
