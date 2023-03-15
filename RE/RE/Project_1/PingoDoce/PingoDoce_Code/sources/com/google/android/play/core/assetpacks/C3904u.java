package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;
import p010a9.C0092b;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.u */
/* loaded from: classes.dex */
public final class C3904u implements InterfaceC1867x<C3900t> {

    /* renamed from: a */
    private final InterfaceC1867x<Context> f11164a;

    /* renamed from: b */
    private final InterfaceC1867x<C3862j1> f11165b;

    /* renamed from: c */
    private final InterfaceC1867x<C3897s0> f11166c;

    /* renamed from: d */
    private final InterfaceC1867x<InterfaceC3833c3> f11167d;

    /* renamed from: e */
    private final InterfaceC1867x<C3909v0> f11168e;

    /* renamed from: f */
    private final InterfaceC1867x<C3861j0> f11169f;

    /* renamed from: g */
    private final InterfaceC1867x<C0092b> f11170g;

    /* renamed from: h */
    private final InterfaceC1867x<Executor> f11171h;

    /* renamed from: i */
    private final InterfaceC1867x<Executor> f11172i;

    public C3904u(InterfaceC1867x<Context> interfaceC1867x, InterfaceC1867x<C3862j1> interfaceC1867x2, InterfaceC1867x<C3897s0> interfaceC1867x3, InterfaceC1867x<InterfaceC3833c3> interfaceC1867x4, InterfaceC1867x<C3909v0> interfaceC1867x5, InterfaceC1867x<C3861j0> interfaceC1867x6, InterfaceC1867x<C0092b> interfaceC1867x7, InterfaceC1867x<Executor> interfaceC1867x8, InterfaceC1867x<Executor> interfaceC1867x9) {
        this.f11164a = interfaceC1867x;
        this.f11165b = interfaceC1867x2;
        this.f11166c = interfaceC1867x3;
        this.f11167d = interfaceC1867x4;
        this.f11168e = interfaceC1867x5;
        this.f11169f = interfaceC1867x6;
        this.f11170g = interfaceC1867x7;
        this.f11171h = interfaceC1867x8;
        this.f11172i = interfaceC1867x9;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3900t mo1547c() {
        return new C3900t(((C3927z2) this.f11164a).mo1547c(), this.f11165b.mo1547c(), this.f11166c.mo1547c(), C1866w.m35245b(this.f11167d), this.f11168e.mo1547c(), this.f11169f.mo1547c(), this.f11170g.mo1547c(), C1866w.m35245b(this.f11171h), C1866w.m35245b(this.f11172i));
    }
}
