package io.github.dennisylyung.language;

import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.dennisylyung.language.psi.MirandaDecl;
import io.github.dennisylyung.language.psi.MirandaDef;
import io.github.dennisylyung.language.psi.MirandaFnform;
import io.github.dennisylyung.language.psi.MirandaFormal;
import io.github.dennisylyung.language.psi.MirandaList;
import io.github.dennisylyung.language.psi.MirandaRhs;
import io.github.dennisylyung.language.psi.MirandaSpec;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVarDecl;
import io.github.dennisylyung.language.psi.MirandaVarList;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MirandaUtil {

    public static List<MirandaVarDecl> findDeclarations(MirandaVar reference, @Nullable String key) {
        List<MirandaVarDecl> declarations = new ArrayList<>();
        @Nullable MirandaRhs rhs = PsiTreeUtil.getParentOfType(reference, MirandaRhs.class);
        if (rhs != null) {
            @Nullable MirandaVarDecl boundedDeclaration = findBoundedDeclaration(rhs, key);
            if (boundedDeclaration != null) {
                declarations.add(boundedDeclaration);
                return declarations;
            }
        }
        PsiFile rootScope = PsiTreeUtil.getParentOfType(reference, PsiFile.class);
        if (rootScope != null) {
            return findFreeDeclaration(rootScope, key);
        }
        return declarations;
    }

    public static @Nullable MirandaVarDecl findBoundedDeclaration(MirandaRhs rhs, @Nullable String key) {
        @Nullable MirandaFnform fnform = PsiTreeUtil.getPrevSiblingOfType(rhs, MirandaFnform.class);
        if (fnform == null) {
            return null;
        }
        @Nullable MirandaFormal[] formals = PsiTreeUtil.getChildrenOfType(fnform, MirandaFormal.class);
        if (formals == null) {
            return null;
        }
        for (MirandaFormal formal : formals) {
            @Nullable MirandaVarDecl varDecl = PsiTreeUtil.getChildOfType(formal, MirandaVarDecl.class);
            if (varDecl != null) {
                if (key == null || key.equals(varDecl.getText())) {
                    return varDecl;
                }
            }
        }
        return null;
    }

    public static List<MirandaVarDecl> findFreeDeclaration(PsiFile script, @Nullable String key) {
        List<MirandaVarDecl> declarations = new ArrayList<>();
        @Nullable MirandaDecl[] statements = PsiTreeUtil.getChildrenOfType(script, MirandaDecl.class);
        if (statements == null) {
            return declarations;
        }
        for (MirandaDecl statement : statements) {
            MirandaDef def = PsiTreeUtil.getChildOfType(statement, MirandaDef.class);
            if (def != null) {
                MirandaFnform fnform = PsiTreeUtil.getChildOfType(def, MirandaFnform.class);
                if (fnform != null) {
                    MirandaVarDecl varDecl = PsiTreeUtil.findChildOfType(fnform, MirandaVarDecl.class);
                    if (varDecl != null) {
                        if (key == null || key.equals(varDecl.getText())) {
                            declarations.add(varDecl);
                        }
                    }
                    continue;
                }
                MirandaSpec spec = PsiTreeUtil.getChildOfType(def, MirandaSpec.class);
                if (spec != null) {
                    MirandaVarList varList = PsiTreeUtil.getChildOfType(spec, MirandaVarList.class);
                    if (varList != null) {
                        MirandaList list = PsiTreeUtil.getChildOfType(varList, MirandaList.class);
                        if (list != null) {
                            MirandaVarDecl[] varDecls = PsiTreeUtil.getChildrenOfType(list, MirandaVarDecl.class);
                            if (varDecls != null) {
                                for (MirandaVarDecl varDecl : varDecls) {
                                    if (key == null || key.equals(varDecl.getText())) {
                                        declarations.add(varDecl);
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return declarations;
    }

}
