package io.github.dennisylyung.language;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVarDecl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MirandaReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    public MirandaReference(@NotNull PsiElement element) {
        super(element, element.getTextRange());
        key = element.getText();
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<MirandaVarDecl> vars = MirandaUtil.findVars(project, key);
        List<ResolveResult> results = new ArrayList<>();
        for (MirandaVarDecl Var : vars) {
            results.add(new PsiElementResolveResult(Var));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @Override
    public Object @NotNull [] getVariants() {
        Project project = myElement.getProject();
        List<MirandaVar> properties = MirandaUtil.findVars(project);
        List<LookupElement> variants = new ArrayList<>();
        for (final MirandaVar Var : properties) {
            if (Var.getText() != null && Var.getText().length() > 0) {
                variants.add(LookupElementBuilder
                        .create(Var).withIcon(MirandaIcons.FILE)
                        .withTypeText(Var.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }

}
