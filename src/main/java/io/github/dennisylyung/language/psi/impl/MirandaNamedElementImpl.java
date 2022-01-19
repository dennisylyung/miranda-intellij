package io.github.dennisylyung.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import io.github.dennisylyung.language.psi.MirandaNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class MirandaNamedElementImpl extends ASTWrapperPsiElement implements MirandaNamedElement {

    public MirandaNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
