package io.github.dennisylyung.language.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import io.github.dennisylyung.language.MirandaFileType;

public class MirandaElementFactory {
    public static MirandaVarDecl createVar(Project project, String name) {
        final MirandaFile file = createFile(project, name);
        return (MirandaVarDecl) file.getFirstChild();
    }

    public static MirandaFile createFile(Project project, String text) {
        String name = "dummy.m";
        return (MirandaFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, MirandaFileType.INSTANCE, text);
    }
}
