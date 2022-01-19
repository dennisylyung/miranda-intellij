package io.github.dennisylyung.language;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.dennisylyung.language.psi.MirandaDecl;
import io.github.dennisylyung.language.psi.MirandaDef;
import io.github.dennisylyung.language.psi.MirandaFnform;
import io.github.dennisylyung.language.psi.MirandaFormal;
import io.github.dennisylyung.language.psi.MirandaList;
import io.github.dennisylyung.language.psi.MirandaPat;
import io.github.dennisylyung.language.psi.MirandaPatList;
import io.github.dennisylyung.language.psi.MirandaRhs;
import io.github.dennisylyung.language.psi.MirandaSpec;
import io.github.dennisylyung.language.psi.MirandaTdef;
import io.github.dennisylyung.language.psi.MirandaTform;
import io.github.dennisylyung.language.psi.MirandaTformList;
import io.github.dennisylyung.language.psi.MirandaType;
import io.github.dennisylyung.language.psi.MirandaTypename;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVarDecl;
import io.github.dennisylyung.language.psi.MirandaVarList;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MirandaUtil {

    public static List<MirandaVarDecl> findFunctionDeclarations(MirandaVar reference, @Nullable String key) {
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
            MirandaVarDecl var = findVarInFormal(formal, key);
            if (var != null) {
                return var;
            }
        }
        return null;
    }

    @Nullable
    static MirandaVarDecl findVarInFormal(MirandaFormal formal, @Nullable String key) {
        MirandaVarDecl var = PsiTreeUtil.getChildOfType(formal, MirandaVarDecl.class);
        if (var != null) {
            if (key == null || key.equals(var.getText())) {
                return var;
            } else {
                return null;
            }
        }
        MirandaPatList patList = PsiTreeUtil.getChildOfType(formal, MirandaPatList.class);
        if (patList != null) {
            MirandaList list = PsiTreeUtil.getChildOfType(patList, MirandaList.class);
            if (list != null) {
                MirandaPat[] pats = PsiTreeUtil.getChildrenOfType(list, MirandaPat.class);
                if (pats != null) {
                    for (MirandaPat pat : pats) {
                        var = findVarInPat(pat, key);
                        if (var != null) {
                            return var;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    static MirandaVarDecl findVarInPat(MirandaPat pat, @Nullable String key) {
        MirandaFormal[] formals = PsiTreeUtil.getChildrenOfType(pat, MirandaFormal.class);
        if (formals != null) {
            for (MirandaFormal f : formals) {
                MirandaVarDecl var = findVarInFormal(f, key);
                if (var != null) {
                    return var;
                }
            }
        }
        MirandaPat[] pats = PsiTreeUtil.getChildrenOfType(pat, MirandaPat.class);
        if (pats != null) {
            for (MirandaPat p : pats) {
                MirandaVarDecl var = findVarInPat(p, key);
                if (var != null) {
                    return var;
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
            }
            MirandaSpec spec = PsiTreeUtil.getChildOfType(statement, MirandaSpec.class);
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
        return declarations;
    }

    public static List<MirandaTypename> findTypeDefinitions(MirandaTypename reference, @Nullable String key) {
        List<MirandaTypename> types = new ArrayList<>();
        if (PsiTreeUtil.getParentOfType(reference, MirandaType.class) == null) {
            return types;
        }
        PsiFile file = PsiTreeUtil.getParentOfType(reference, PsiFile.class);
        @Nullable MirandaDecl[] statements = PsiTreeUtil.getChildrenOfType(file, MirandaDecl.class);
        if (statements == null) {
            return types;
        }
        for (MirandaDecl statement : statements) {
            PsiElement definition = PsiTreeUtil.getChildOfAnyType(statement, MirandaTdef.class, MirandaSpec.class);
            if (definition != null) {
                MirandaTformList tformList = PsiTreeUtil.findChildOfType(definition, MirandaTformList.class);
                if (tformList != null) {
                    MirandaList list = PsiTreeUtil.getChildOfType(tformList, MirandaList.class);
                    if (list != null) {
                        MirandaTform[] tforms = PsiTreeUtil.getChildrenOfType(list, MirandaTform.class);
                        if (tforms != null) {
                            for (MirandaTform tform : tforms) {
                                MirandaTypename type = PsiTreeUtil.findChildOfType(tform, MirandaTypename.class);
                                if (type != null) {
                                    if (key == null || key.equals(type.getText())) {
                                        types.add(type);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    MirandaTform tform = PsiTreeUtil.findChildOfType(definition, MirandaTform.class);
                    if (tform != null) {
                        MirandaTypename type = PsiTreeUtil.findChildOfType(tform, MirandaTypename.class);
                        if (type != null) {
                            if (key == null || key.equals(type.getText())) {
                                types.add(type);
                            }
                        }
                    }
                }
            }
        }
        return types;
    }
}
