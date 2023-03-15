package p320qj;

import p181jd.Intrinsics;

/* compiled from: DebugViewModel.kt */
/* renamed from: qj.b */
/* loaded from: classes2.dex */
public final class C9754b {
    /* renamed from: a */
    public static final String m10015a(String str, int i) {
        Intrinsics.isThisObjectNull(str, "str");
        if (str.length() > i) {
            String substring = str.substring(str.length() - i, str.length());
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }
}
