package ne;

import android.text.SpannableString;
import android.text.Spanned;
import p181jd.Intrinsics;

/* renamed from: ne.a */
/* loaded from: classes2.dex */
public abstract class DialogEvent<T> extends AbstractC7703b {

    /* renamed from: b */
    private final String f20302b;

    /* renamed from: c */
    private final Spanned f20303c;

    public DialogEvent(String str, Spanned spanned) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        this.f20302b = str;
        this.f20303c = spanned;
    }

    /* renamed from: c */
    public final Spanned m17673c() {
        return this.f20303c;
    }

    /* renamed from: d */
    public final String m17672d() {
        return this.f20302b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogEvent(String str, String str2) {
        this(str, new SpannableString(str2));
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(str2, "message");
    }
}
