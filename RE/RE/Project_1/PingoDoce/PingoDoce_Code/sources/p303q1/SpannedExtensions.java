package p303q1;

import android.text.Spanned;
import p181jd.Intrinsics;

/* renamed from: q1.g */
/* loaded from: classes.dex */
public final class SpannedExtensions {
    /* renamed from: a */
    public static final boolean m10553a(Spanned spanned, Class cls) {
        Intrinsics.isThisObjectNull(spanned, "<this>");
        Intrinsics.isThisObjectNull(cls, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
