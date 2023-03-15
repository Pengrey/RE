package p324r0;

import android.view.ViewStructure;
import p181jd.Intrinsics;

/* compiled from: AndroidAutofill.android.kt */
/* renamed from: r0.e */
/* loaded from: classes.dex */
public final class C9785e {

    /* renamed from: a */
    public static final C9785e f25722a = new C9785e();

    private C9785e() {
    }

    /* renamed from: a */
    public final int m9967a(ViewStructure viewStructure, int i) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        return viewStructure.addChildCount(i);
    }

    /* renamed from: b */
    public final ViewStructure m9966b(ViewStructure viewStructure, int i) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        return viewStructure.newChild(i);
    }

    /* renamed from: c */
    public final void m9965c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: d */
    public final void m9964d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        Intrinsics.isThisObjectNull(viewStructure, "structure");
        viewStructure.setId(i, str, str2, str3);
    }
}
