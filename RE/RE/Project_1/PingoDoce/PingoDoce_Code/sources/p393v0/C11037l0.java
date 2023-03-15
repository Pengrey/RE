package p393v0;

import p181jd.Intrinsics;

/* compiled from: Matrix.kt */
/* renamed from: v0.l0 */
/* loaded from: classes.dex */
public final class C11037l0 {
    /* renamed from: a */
    public static final boolean m6427a(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "$this$isIdentity");
        int i = 0;
        while (i < 4) {
            int i2 = i + 1;
            int i3 = 0;
            while (i3 < 4) {
                int i4 = i3 + 1;
                if (!(fArr[(i * 4) + i3] == (i == i3 ? 1.0f : 0.0f))) {
                    return false;
                }
                i3 = i4;
            }
            i = i2;
        }
        return true;
    }
}
