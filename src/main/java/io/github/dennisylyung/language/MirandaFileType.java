package io.github.dennisylyung.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MirandaFileType extends LanguageFileType {

    public static final MirandaFileType INSTANCE = new MirandaFileType();

    private MirandaFileType() {
        super(MirandaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Miranda File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Miranda language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "m";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MirandaIcons.FILE;
    }

}
