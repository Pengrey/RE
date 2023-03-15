package androidx.compose.p018ui.platform;

import p181jd.Intrinsics;

/* compiled from: AccessibilityIterators.android.kt */
/* renamed from: androidx.compose.ui.platform.b */
/* loaded from: classes.dex */
public abstract class AbstractC0686b implements InterfaceC0717g {

    /* renamed from: a */
    protected String f2168a;

    /* renamed from: b */
    private final int[] f2169b = new int[2];

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final int[] m39828c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f2169b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final String m39827d() {
        String str = this.f2168a;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitPropException("text");
        return null;
    }

    /* renamed from: e */
    public void m39826e(String str) {
        Intrinsics.isThisObjectNull(str, "text");
        m39825f(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final void m39825f(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f2168a = str;
    }
}
