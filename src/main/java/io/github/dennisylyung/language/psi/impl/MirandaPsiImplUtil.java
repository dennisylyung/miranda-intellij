package io.github.dennisylyung.language.psi.impl;

import com.intellij.psi.PsiElement;
import io.github.dennisylyung.language.MirandaReference;
import io.github.dennisylyung.language.psi.MirandaElementFactory;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVarDecl;

public class MirandaPsiImplUtil {

    public static String getName(MirandaVarDecl element) {
        return element.getText();
    }

    public static PsiElement setName(MirandaVarDecl element, String newName) {
        return MirandaElementFactory.createVar(element.getProject(), newName);
    }

    public static PsiElement getNameIdentifier(MirandaVarDecl element) {
        return element.getNode().getPsi();
    }

    public static MirandaReference getReference(MirandaVar element) {
        return new MirandaReference(element);
    }
}
