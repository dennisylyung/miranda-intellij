package io.github.dennisylyung.language.psi.impl;

import com.intellij.psi.PsiElement;
import io.github.dennisylyung.language.MirandaReference;
import io.github.dennisylyung.language.psi.MirandaElementFactory;

public class MirandaPsiImplUtil {

    public static String getName(PsiElement element) {
        return element.getText();
    }

    public static PsiElement setName(PsiElement element, String newName) {
        return MirandaElementFactory.createNamedElement(element.getProject(), newName);
    }

    public static PsiElement getNameIdentifier(PsiElement element) {
        return element.getNode().getPsi();
    }

    public static MirandaReference getReference(PsiElement element) {
        return new MirandaReference(element);
    }
}
