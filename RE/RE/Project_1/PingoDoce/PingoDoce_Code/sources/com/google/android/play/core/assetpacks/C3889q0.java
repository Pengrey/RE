package com.google.android.play.core.assetpacks;

import p031b9.C1866w;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.q0 */
/* loaded from: classes.dex */
public final class C3889q0 implements InterfaceC1867x<C3885p0> {

    /* renamed from: a */
    private final InterfaceC1867x<C3924z> f11103a;

    /* renamed from: b */
    private final InterfaceC1867x<InterfaceC3833c3> f11104b;

    /* renamed from: c */
    private final InterfaceC1867x<C3900t> f11105c;

    /* renamed from: d */
    private final InterfaceC1867x<C3909v0> f11106d;

    public C3889q0(InterfaceC1867x<C3924z> interfaceC1867x, InterfaceC1867x<InterfaceC3833c3> interfaceC1867x2, InterfaceC1867x<C3900t> interfaceC1867x3, InterfaceC1867x<C3909v0> interfaceC1867x4) {
        this.f11103a = interfaceC1867x;
        this.f11104b = interfaceC1867x2;
        this.f11105c = interfaceC1867x3;
        this.f11106d = interfaceC1867x4;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3885p0 mo1547c() {
        return new C3885p0(this.f11103a.mo1547c(), C1866w.m35245b(this.f11104b), C1866w.m35245b(this.f11105c), this.f11106d.mo1547c());
    }
}
