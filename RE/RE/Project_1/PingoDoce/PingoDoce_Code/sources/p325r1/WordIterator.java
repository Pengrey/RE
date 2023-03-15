package p325r1;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p303q1.CharSequenceCharacterIterator;

/* renamed from: r1.b */
/* loaded from: classes.dex */
public final class WordIterator {

    /* renamed from: a */
    private final CharSequence f25729a;

    /* renamed from: b */
    private final BreakIterator f25730b;

    /* compiled from: WordIterator.kt */
    /* renamed from: r1.b$a */
    /* loaded from: classes.dex */
    public static final class C9791a {
        private C9791a() {
        }

        public /* synthetic */ C9791a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9791a(null);
    }

    public WordIterator(CharSequence charSequence, int i, int i2, Locale locale) {
        Intrinsics.isThisObjectNull(charSequence, "charSequence");
        this.f25729a = charSequence;
        boolean z = true;
        if (i >= 0 && i <= charSequence.length()) {
            if ((i2 < 0 || i2 > charSequence.length()) ? false : z) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                Intrinsics.checkIfNull(wordInstance, "getWordInstance(locale)");
                this.f25730b = wordInstance;
                Math.max(0, i - 50);
                Math.min(charSequence.length(), i2 + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i, i2));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }
}
