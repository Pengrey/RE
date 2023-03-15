package p092f0;

import p181jd.Intrinsics;

/* compiled from: SlotTable.kt */
/* renamed from: f0.d */
/* loaded from: classes.dex */
public final class C5159d {

    /* renamed from: a */
    private int f14250a;

    public C5159d(int i) {
        this.f14250a = i;
    }

    /* renamed from: a */
    public final int m25511a() {
        return this.f14250a;
    }

    /* renamed from: b */
    public final boolean m25510b() {
        return this.f14250a != Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public final void m25509c(int i) {
        this.f14250a = i;
    }

    /* renamed from: d */
    public final int m25508d(C5164e1 c5164e1) {
        Intrinsics.isThisObjectNull(c5164e1, "slots");
        return c5164e1.m25441b(this);
    }

    /* renamed from: e */
    public final int m25507e(C5173g1 c5173g1) {
        Intrinsics.isThisObjectNull(c5173g1, "writer");
        return c5173g1.m25333e(this);
    }
}
