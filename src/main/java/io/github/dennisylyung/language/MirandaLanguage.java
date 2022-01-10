package io.github.dennisylyung.language;

import com.intellij.lang.Language;

public class MirandaLanguage extends Language {

    public static final MirandaLanguage INSTANCE = new MirandaLanguage();

    private MirandaLanguage() {
        super("Miranda");
    }

}