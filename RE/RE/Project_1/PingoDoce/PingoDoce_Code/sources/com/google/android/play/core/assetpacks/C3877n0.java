package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.util.concurrent.Executor;
import p010a9.C0092b;
import p010a9.C0094d;
import p031b9.C1865v;
import p031b9.C1866w;
import p031b9.InterfaceC1867x;
import p080e9.C5021a;
import p080e9.C5022b;
import p464y8.C13139d;
import p464y8.C13140e;
import p464y8.InterfaceC13136a;

/* renamed from: com.google.android.play.core.assetpacks.n0 */
/* loaded from: classes.dex */
public final class C3877n0 implements InterfaceC13136a {

    /* renamed from: a */
    private final C3911v2 f11036a;

    /* renamed from: b */
    private InterfaceC1867x<Context> f11037b;

    /* renamed from: c */
    private InterfaceC1867x<C3837d2> f11038c;

    /* renamed from: d */
    private InterfaceC1867x<C3924z> f11039d;

    /* renamed from: e */
    private InterfaceC1867x<C3909v0> f11040e;

    /* renamed from: f */
    private InterfaceC1867x<C3880o> f11041f;

    /* renamed from: g */
    private InterfaceC1867x<String> f11042g;

    /* renamed from: h */
    private InterfaceC1867x<InterfaceC3833c3> f11043h;

    /* renamed from: i */
    private InterfaceC1867x<Executor> f11044i;

    /* renamed from: j */
    private InterfaceC1867x<C3862j1> f11045j;

    /* renamed from: k */
    private InterfaceC1867x<C3900t> f11046k;

    /* renamed from: l */
    private InterfaceC1867x<C3885p0> f11047l;

    /* renamed from: m */
    private InterfaceC1867x<C3879n2> f11048m;

    /* renamed from: n */
    private InterfaceC1867x<C3918x1> f11049n;

    /* renamed from: o */
    private InterfaceC1867x<C3827b2> f11050o;

    /* renamed from: p */
    private InterfaceC1867x<C0092b> f11051p;

    /* renamed from: q */
    private InterfaceC1867x<C3851g2> f11052q;

    /* renamed from: r */
    private InterfaceC1867x<C3849g0> f11053r;

    /* renamed from: s */
    private InterfaceC1867x<C3874m1> f11054s;

    /* renamed from: t */
    private InterfaceC1867x<C3897s0> f11055t;

    /* renamed from: u */
    private InterfaceC1867x<C3861j0> f11056u;

    /* renamed from: v */
    private InterfaceC1867x<Executor> f11057v;

    /* renamed from: w */
    private InterfaceC1867x<C3894r1> f11058w;

    /* renamed from: x */
    private InterfaceC1867x<C5021a> f11059x;

    /* renamed from: y */
    private InterfaceC1867x<C3903t2> f11060y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3877n0(C3911v2 c3911v2) {
        C3917x0 c3917x0;
        C13139d c13139d;
        C3869l0 c3869l0;
        C13140e c13140e;
        this.f11036a = c3911v2;
        C3927z2 c3927z2 = new C3927z2(c3911v2);
        this.f11037b = c3927z2;
        InterfaceC1867x<C3837d2> m35246a = C1866w.m35246a(new C3842e2(c3927z2));
        this.f11038c = m35246a;
        this.f11039d = C1866w.m35246a(new C3820a0(this.f11037b, m35246a));
        c3917x0 = C3913w0.f11202a;
        InterfaceC1867x<C3909v0> m35246a2 = C1866w.m35246a(c3917x0);
        this.f11040e = m35246a2;
        this.f11041f = C1866w.m35246a(new C3884p(this.f11037b, m35246a2));
        this.f11042g = C1866w.m35246a(new C3823a3(this.f11037b));
        this.f11043h = new C1865v();
        c13139d = C3915w2.f11206a;
        InterfaceC1867x<Executor> m35246a3 = C1866w.m35246a(c13139d);
        this.f11044i = m35246a3;
        this.f11045j = C1866w.m35246a(new C3866k1(this.f11039d, this.f11043h, this.f11040e, m35246a3));
        C1865v c1865v = new C1865v();
        this.f11046k = c1865v;
        this.f11047l = C1866w.m35246a(new C3889q0(this.f11039d, this.f11043h, c1865v, this.f11040e));
        this.f11048m = C1866w.m35246a(new C3883o2(this.f11039d));
        this.f11049n = C1866w.m35246a(new C3922y1(this.f11039d));
        this.f11050o = C1866w.m35246a(new C3832c2(this.f11039d, this.f11043h, this.f11045j, this.f11044i, this.f11040e));
        InterfaceC1867x<C0092b> m35246a4 = C1866w.m35246a(C0094d.m41965a());
        this.f11051p = m35246a4;
        this.f11052q = C1866w.m35246a(new C3855h2(this.f11039d, this.f11043h, m35246a4));
        InterfaceC1867x<C3849g0> m35246a5 = C1866w.m35246a(new C3853h0(this.f11043h));
        this.f11053r = m35246a5;
        InterfaceC1867x<C3874m1> m35246a6 = C1866w.m35246a(new C3878n1(this.f11045j, this.f11039d, m35246a5));
        this.f11054s = m35246a6;
        this.f11055t = C1866w.m35246a(new C3901t0(this.f11045j, this.f11043h, this.f11047l, this.f11048m, this.f11049n, this.f11050o, this.f11052q, m35246a6));
        c3869l0 = C3865k0.f11012a;
        this.f11056u = C1866w.m35246a(c3869l0);
        c13140e = C3828b3.f10895a;
        InterfaceC1867x<Executor> m35246a7 = C1866w.m35246a(c13140e);
        this.f11057v = m35246a7;
        C1865v.m35247a(this.f11046k, C1866w.m35246a(new C3904u(this.f11037b, this.f11045j, this.f11055t, this.f11043h, this.f11040e, this.f11056u, this.f11051p, this.f11044i, m35246a7)));
        InterfaceC1867x<C3894r1> m35246a8 = C1866w.m35246a(new C3898s1(this.f11042g, this.f11046k, this.f11040e, this.f11037b, this.f11038c, this.f11044i));
        this.f11058w = m35246a8;
        C1865v.m35247a(this.f11043h, C1866w.m35246a(new C3923y2(this.f11037b, this.f11041f, m35246a8)));
        InterfaceC1867x<C5021a> m35246a9 = C1866w.m35246a(C5022b.m25880a(this.f11037b));
        this.f11059x = m35246a9;
        InterfaceC1867x<C3903t2> m35246a10 = C1866w.m35246a(new C3907u2(this.f11039d, this.f11043h, this.f11046k, m35246a9, this.f11045j, this.f11040e, this.f11056u, this.f11044i));
        this.f11060y = m35246a10;
        C1866w.m35246a(new C3919x2(m35246a10, this.f11037b));
    }

    @Override // p464y8.InterfaceC13136a
    /* renamed from: a */
    public final void mo1550a(AssetPackExtractionService assetPackExtractionService) {
        assetPackExtractionService.f10875x = C3927z2.m28574a(this.f11036a);
        assetPackExtractionService.f10876y = this.f11060y.mo1547c();
        assetPackExtractionService.f10877z = this.f11039d.mo1547c();
    }
}
