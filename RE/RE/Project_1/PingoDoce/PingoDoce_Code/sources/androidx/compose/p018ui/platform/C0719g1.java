package androidx.compose.p018ui.platform;

import java.util.List;
import p169j1.InterfaceC6257g0;
import p181jd.Intrinsics;
import p245n1.C7593i;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* renamed from: androidx.compose.ui.platform.g1 */
/* loaded from: classes.dex */
public final class C0719g1 implements InterfaceC6257g0 {

    /* renamed from: A */
    private C7593i f2258A;

    /* renamed from: B */
    private C7593i f2259B;

    /* renamed from: w */
    private final int f2260w;

    /* renamed from: x */
    private final List f2261x;

    /* renamed from: y */
    private Float f2262y;

    /* renamed from: z */
    private Float f2263z;

    public C0719g1(int i, List list, Float f, Float f2, C7593i c7593i, C7593i c7593i2) {
        Intrinsics.isThisObjectNull(list, "allScopes");
        this.f2260w = i;
        this.f2261x = list;
        this.f2262y = f;
        this.f2263z = f2;
        this.f2258A = c7593i;
        this.f2259B = c7593i2;
    }

    /* renamed from: a */
    public final C7593i m39748a() {
        return this.f2258A;
    }

    /* renamed from: b */
    public final Float m39747b() {
        return this.f2262y;
    }

    /* renamed from: c */
    public final Float m39746c() {
        return this.f2263z;
    }

    /* renamed from: d */
    public final int m39745d() {
        return this.f2260w;
    }

    /* renamed from: e */
    public final C7593i m39744e() {
        return this.f2259B;
    }

    /* renamed from: f */
    public final void m39743f(C7593i c7593i) {
        this.f2258A = c7593i;
    }

    /* renamed from: g */
    public final void m39742g(Float f) {
        this.f2262y = f;
    }

    /* renamed from: h */
    public final void m39741h(Float f) {
        this.f2263z = f;
    }

    /* renamed from: i */
    public final void m39740i(C7593i c7593i) {
        this.f2259B = c7593i;
    }

    /* renamed from: k */
    public boolean mo21638k() {
        return this.f2261x.contains(this);
    }
}
