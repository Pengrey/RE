package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.c2 */
/* loaded from: classes.dex */
public final class C3832c2 implements InterfaceC1867x<C3827b2> {

    /* renamed from: a */
    private final InterfaceC1867x<C3924z> f10904a;

    /* renamed from: b */
    private final InterfaceC1867x<InterfaceC3833c3> f10905b;

    /* renamed from: c */
    private final InterfaceC1867x<C3862j1> f10906c;

    /* renamed from: d */
    private final InterfaceC1867x<Executor> f10907d;

    /* renamed from: e */
    private final InterfaceC1867x<C3909v0> f10908e;

    public C3832c2(InterfaceC1867x<C3924z> interfaceC1867x, InterfaceC1867x<InterfaceC3833c3> interfaceC1867x2, InterfaceC1867x<C3862j1> interfaceC1867x3, InterfaceC1867x<Executor> interfaceC1867x4, InterfaceC1867x<C3909v0> interfaceC1867x5) {
        this.f10904a = interfaceC1867x;
        this.f10905b = interfaceC1867x2;
        this.f10906c = interfaceC1867x3;
        this.f10907d = interfaceC1867x4;
        this.f10908e = interfaceC1867x5;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3827b2 mo1547c() {
        C3924z mo1547c = this.f10904a.mo1547c();
        return new C3827b2(mo1547c, C1866w.m35245b(this.f10905b), this.f10906c.mo1547c(), C1866w.m35245b(this.f10907d), this.f10908e.mo1547c());
    }
}
