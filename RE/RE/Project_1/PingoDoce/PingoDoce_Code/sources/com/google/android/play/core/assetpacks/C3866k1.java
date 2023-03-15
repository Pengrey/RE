package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.k1 */
/* loaded from: classes.dex */
public final class C3866k1 implements InterfaceC1867x<C3862j1> {

    /* renamed from: a */
    private final InterfaceC1867x<C3924z> f11013a;

    /* renamed from: b */
    private final InterfaceC1867x<InterfaceC3833c3> f11014b;

    /* renamed from: c */
    private final InterfaceC1867x<C3909v0> f11015c;

    /* renamed from: d */
    private final InterfaceC1867x<Executor> f11016d;

    public C3866k1(InterfaceC1867x<C3924z> interfaceC1867x, InterfaceC1867x<InterfaceC3833c3> interfaceC1867x2, InterfaceC1867x<C3909v0> interfaceC1867x3, InterfaceC1867x<Executor> interfaceC1867x4) {
        this.f11013a = interfaceC1867x;
        this.f11014b = interfaceC1867x2;
        this.f11015c = interfaceC1867x3;
        this.f11016d = interfaceC1867x4;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3862j1 mo1547c() {
        C3924z mo1547c = this.f11013a.mo1547c();
        return new C3862j1(mo1547c, C1866w.m35245b(this.f11014b), this.f11015c.mo1547c(), C1866w.m35245b(this.f11016d));
    }
}
