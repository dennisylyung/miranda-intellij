package io.github.dennisylyung.language;

import com.intellij.lexer.FlexAdapter;

public class MirandaLexerAdapter extends FlexAdapter {

    public MirandaLexerAdapter() {
        super(new MirandaLexer(null));
    }
}
