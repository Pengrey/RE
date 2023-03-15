package p297pd;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pd.h */
/* loaded from: classes2.dex */
public class Ranges {
    /* renamed from: a */
    public static final void m15008a(boolean z, Number number) {
        Intrinsics.isThisObjectNull(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* renamed from: b */
    public static InterfaceC8606b m15007b(float f, float f2) {
        return new C8605a(f, f2);
    }
}
