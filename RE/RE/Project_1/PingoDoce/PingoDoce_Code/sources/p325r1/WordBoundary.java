package p325r1;

import java.util.Locale;
import p181jd.Intrinsics;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public final class WordBoundary {
    public WordBoundary(Locale locale, CharSequence charSequence) {
        Intrinsics.isThisObjectNull(locale, "locale");
        Intrinsics.isThisObjectNull(charSequence, "text");
        new WordIterator(charSequence, 0, charSequence.length(), locale);
    }
}
