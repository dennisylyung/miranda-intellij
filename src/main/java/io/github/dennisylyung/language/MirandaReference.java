package io.github.dennisylyung.language;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementResolveResult;
import com.intellij.psi.PsiPolyVariantReference;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.ResolveResult;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVarDecl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MirandaReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {

    private final String key;

    public MirandaReference(@NotNull PsiElement element) {
        super(element, TextRange.from(element.getStartOffsetInParent(), element.getTextLength()));
        key = element.getText();
    }

    @Override
    public ResolveResult @NotNull [] multiResolve(boolean incompleteCode) {
        if (!(myElement instanceof MirandaVar)) {
            return ResolveResult.EMPTY_ARRAY;
        }
        MirandaVar var = (MirandaVar) myElement;
        final List<MirandaVarDecl> vars = MirandaUtil.findDeclarations(var, key);
        List<ResolveResult> results = new ArrayList<>();
        for (MirandaVarDecl Var : vars) {
            results.add(new PsiElementResolveResult(Var));
        }
        return results.toArray(new ResolveResult[0]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @Override
    public Object @NotNull [] getVariants() {
        if (!(myElement instanceof MirandaVar)) {
            return ResolveResult.EMPTY_ARRAY;
        }
        MirandaVar var = (MirandaVar) myElement;
        List<MirandaVarDecl> vars = MirandaUtil.findDeclarations(var, null);
        List<LookupElement> variants = new ArrayList<>();
        for (final MirandaVarDecl Var : vars) {
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
