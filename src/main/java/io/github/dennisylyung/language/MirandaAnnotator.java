package io.github.dennisylyung.language;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.dennisylyung.language.psi.MirandaConstruct;
import io.github.dennisylyung.language.psi.MirandaConstructor;
import io.github.dennisylyung.language.psi.MirandaConstructs;
import io.github.dennisylyung.language.psi.MirandaList;
import io.github.dennisylyung.language.psi.MirandaVarDecl;
import io.github.dennisylyung.language.psi.MirandaVarList;
import io.github.dennisylyung.language.psi.impl.MirandaFnformImpl;
import io.github.dennisylyung.language.psi.impl.MirandaSpecImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTdefImpl;
import io.github.dennisylyung.language.psi.impl.MirandaTypevarImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static io.github.dennisylyung.language.MirandaSyntaxHighlighter.TYPEVAR;

public class MirandaAnnotator implements Annotator {

    @Override
    public void annotate(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {

        if (element instanceof MirandaFnformImpl) {
            annotateFunctionDeclaration(element, holder);
        }

        if (element instanceof MirandaSpecImpl) {
            annotateFunctionSpec(element, holder);
        }

        if (element instanceof MirandaTdefImpl) {
            annotateTypeConstructor(element, holder);
        }

        if (element instanceof MirandaTypevarImpl) {
            annotateTypevar(element, holder);
        }
    }


    private void annotateFunctionDeclaration(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        @Nullable MirandaVarDecl var = PsiTreeUtil.getChildOfType(element, MirandaVarDecl.class);
        if (var == null) {
            return;
        }
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(var.getTextRange()).textAttributes(DefaultLanguageHighlighterColors.FUNCTION_DECLARATION).create();
    }

    private void annotateFunctionSpec(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        @Nullable MirandaVarList varList = PsiTreeUtil.findChildOfType(element, MirandaVarList.class);
        if (varList == null) {
            return;
        }
        @Nullable MirandaList list = PsiTreeUtil.findChildOfType(varList, MirandaList.class);
        if (list == null) {
            return;
        }
        @Nullable MirandaVarDecl[] vars = PsiTreeUtil.getChildrenOfType(list, MirandaVarDecl.class);
        if (vars == null) {
            return;
        }
        for (MirandaVarDecl var : vars) {
            if (var == null) {
                continue;
            }
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(var.getTextRange()).textAttributes(DefaultLanguageHighlighterColors.FUNCTION_DECLARATION).create();
        }

    }

    private void annotateTypeConstructor(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        List<MirandaConstructor> constructors = getConstructors(element);
        for (MirandaConstructor constructor : constructors) {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .range(constructor.getTextRange()).textAttributes(DefaultLanguageHighlighterColors.FUNCTION_DECLARATION).create();

        }
    }

    private List<MirandaConstructor> getConstructors(@NotNull final PsiElement element) {
        List<MirandaConstructor> constructors = new ArrayList<>();
        MirandaConstructor constructor = PsiTreeUtil.findChildOfType(element, MirandaConstructor.class);
        if (constructor != null) {
            constructors.add(constructor);
        }

        List<PsiElement> constructs = PsiTreeUtil.getChildrenOfAnyType(element, MirandaConstruct.class, MirandaConstructs.class);
        for (PsiElement construct : constructs) {
            if (construct != null) {
                constructors.addAll(getConstructors(construct));
            }
        }
        return constructors;
    }

    private void annotateTypevar(@NotNull final PsiElement element, @NotNull AnnotationHolder holder) {
        holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                .range(element.getTextRange()).textAttributes(TYPEVAR).create();
    }

}
