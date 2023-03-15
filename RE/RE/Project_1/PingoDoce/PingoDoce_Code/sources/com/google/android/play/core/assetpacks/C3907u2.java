package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;
import p080e9.C5021a;

/* renamed from: com.google.android.play.core.assetpacks.u2 */
/* loaded from: classes.dex */
public final class C3907u2 implements InterfaceC1867x<C3903t2> {

    /* renamed from: a */
    private final InterfaceC1867x<C3924z> f11182a;

    /* renamed from: b */
    private final InterfaceC1867x<InterfaceC3833c3> f11183b;

    /* renamed from: c */
    private final InterfaceC1867x<C3900t> f11184c;

    /* renamed from: d */
    private final InterfaceC1867x<C5021a> f11185d;

    /* renamed from: e */
    private final InterfaceC1867x<C3862j1> f11186e;

    /* renamed from: f */
    private final InterfaceC1867x<C3909v0> f11187f;

    /* renamed from: g */
    private final InterfaceC1867x<C3861j0> f11188g;

    /* renamed from: h */
    private final InterfaceC1867x<Executor> f11189h;

    public C3907u2(InterfaceC1867x<C3924z> interfaceC1867x, InterfaceC1867x<InterfaceC3833c3> interfaceC1867x2, InterfaceC1867x<C3900t> interfaceC1867x3, InterfaceC1867x<C5021a> interfaceC1867x4, InterfaceC1867x<C3862j1> interfaceC1867x5, InterfaceC1867x<C3909v0> interfaceC1867x6, InterfaceC1867x<C3861j0> interfaceC1867x7, InterfaceC1867x<Executor> interfaceC1867x8) {
        this.f11182a = interfaceC1867x;
        this.f11183b = interfaceC1867x2;
        this.f11184c = interfaceC1867x3;
        this.f11185d = interfaceC1867x4;
        this.f11186e = interfaceC1867x5;
        this.f11187f = interfaceC1867x6;
        this.f11188g = interfaceC1867x7;
        this.f11189h = interfaceC1867x8;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3903t2 mo1547c() {
        return new C3903t2(this.f11182a.mo1547c(), C1866w.m35245b(this.f11183b), this.f11184c.mo1547c(), this.f11185d.mo1547c(), this.f11186e.mo1547c(), this.f11187f.mo1547c(), this.f11188g.mo1547c(), C1866w.m35245b(this.f11189h));
    }
}
