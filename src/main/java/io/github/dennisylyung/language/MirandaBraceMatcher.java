package io.github.dennisylyung.language;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import io.github.dennisylyung.language.psi.MirandaTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MirandaBraceMatcher implements PairedBraceMatcher {

    private static final BracePair[] PAIRS = new BracePair[]{
            new BracePair(MirandaTypes.LEFT_PAREN, MirandaTypes.RIGHT_PAREN, false),
            new BracePair(MirandaTypes.LEFT_BRACE, MirandaTypes.RIGHT_BRACE, false),
            new BracePair(MirandaTypes.LEFT_BRACKET, MirandaTypes.RIGHT_BRACKET, false),
            new BracePair(MirandaTypes.EXTERNAL_START, MirandaTypes.EXTERNAL_END, false)
    };

    @Override
    public BracePair @NotNull [] getPairs() {
        return PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType t) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}