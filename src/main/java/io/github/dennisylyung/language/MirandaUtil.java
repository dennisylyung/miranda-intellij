package io.github.dennisylyung.language;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import io.github.dennisylyung.language.psi.MirandaFile;
import io.github.dennisylyung.language.psi.MirandaVar;
import io.github.dennisylyung.language.psi.MirandaVarDecl;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MirandaUtil {

    /**
     * Searches the entire project for Miranda language files with instances of the Miranda var with the given key.
     *
     * @param project current project
     * @param key     to check
     * @return matching properties
     */
    public static List<MirandaVarDecl> findVars(Project project, String key) {
        List<MirandaVarDecl> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(MirandaFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            MirandaFile MirandaFile = (MirandaFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (MirandaFile != null) {
                MirandaVarDecl[] properties = PsiTreeUtil.getChildrenOfType(MirandaFile, MirandaVarDecl.class);
                if (properties != null) {
                    for (MirandaVarDecl var : properties) {
                        if (key.equals(var.getText())) {
                            result.add(var);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<MirandaVar> findVars(Project project) {
        List<MirandaVar> result = new ArrayList<>();
        Collection<VirtualFile> virtualFiles =
                FileTypeIndex.getFiles(MirandaFileType.INSTANCE, GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            MirandaFile MirandaFile = (MirandaFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (MirandaFile != null) {
                @Nullable MirandaVar vars = PsiTreeUtil.findChildOfType(MirandaFile, MirandaVar.class);
                result.add(vars);
            }
        }
        return result;
    }

}
