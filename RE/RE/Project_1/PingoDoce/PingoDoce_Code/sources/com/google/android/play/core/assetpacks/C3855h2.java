package com.google.android.play.core.assetpacks;

import p010a9.C0092b;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.h2 */
/* loaded from: classes.dex */
public final class C3855h2 implements InterfaceC1867x<C3851g2> {

    /* renamed from: a */
    private final InterfaceC1867x<C3924z> f10980a;

    /* renamed from: b */
    private final InterfaceC1867x<InterfaceC3833c3> f10981b;

    /* renamed from: c */
    private final InterfaceC1867x<C0092b> f10982c;

    public C3855h2(InterfaceC1867x<C3924z> interfaceC1867x, InterfaceC1867x<InterfaceC3833c3> interfaceC1867x2, InterfaceC1867x<C0092b> interfaceC1867x3) {
        this.f10980a = interfaceC1867x;
        this.f10981b = interfaceC1867x2;
        this.f10982c = interfaceC1867x3;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3851g2 mo1547c() {
        return new C3851g2(this.f10980a.mo1547c(), C1866w.m35245b(this.f10981b), this.f10982c.mo1547c());
    }
}
