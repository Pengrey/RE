package com.google.android.play.core.assetpacks;

import java.io.File;
import java.util.concurrent.Executor;
import p031b9.InterfaceC1864u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.b2 */
/* loaded from: classes.dex */
public final class C3827b2 {

    /* renamed from: a */
    private final C3924z f10890a;

    /* renamed from: b */
    private final InterfaceC1864u<InterfaceC3833c3> f10891b;

    /* renamed from: c */
    private final C3862j1 f10892c;

    /* renamed from: d */
    private final InterfaceC1864u<Executor> f10893d;

    /* renamed from: e */
    private final C3909v0 f10894e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3827b2(C3924z c3924z, InterfaceC1864u<InterfaceC3833c3> interfaceC1864u, C3862j1 c3862j1, InterfaceC1864u<Executor> interfaceC1864u2, C3909v0 c3909v0) {
        this.f10890a = c3924z;
        this.f10891b = interfaceC1864u;
        this.f10892c = c3862j1;
        this.f10893d = interfaceC1864u2;
        this.f10894e = c3909v0;
    }

    /* renamed from: a */
    public final void m28761a(C3926z1 c3926z1) {
        File m28589m = this.f10890a.m28589m(c3926z1.f11020b, c3926z1.f11227c, c3926z1.f11228d);
        File m28580v = this.f10890a.m28580v(c3926z1.f11020b, c3926z1.f11227c, c3926z1.f11228d);
        if (!m28589m.exists() || !m28580v.exists()) {
            throw new C3893r0(String.format("Cannot find pack files to move for pack %s.", c3926z1.f11020b), c3926z1.f11019a);
        }
        File m28600b = this.f10890a.m28600b(c3926z1.f11020b, c3926z1.f11227c, c3926z1.f11228d);
        m28600b.mkdirs();
        if (!m28589m.renameTo(m28600b)) {
            throw new C3893r0("Cannot move merged pack files to final location.", c3926z1.f11019a);
        }
        new File(this.f10890a.m28600b(c3926z1.f11020b, c3926z1.f11227c, c3926z1.f11228d), "merge.tmp").delete();
        File m28592j = this.f10890a.m28592j(c3926z1.f11020b, c3926z1.f11227c, c3926z1.f11228d);
        m28592j.mkdirs();
        if (!m28580v.renameTo(m28592j)) {
            throw new C3893r0("Cannot move metadata files to final location.", c3926z1.f11019a);
        }
        C3924z c3924z = this.f10890a;
        c3924z.getClass();
        this.f10893d.m35248c().execute(RunnableC3822a2.m28766a(c3924z));
        this.f10892c.m28729d(c3926z1.f11020b, c3926z1.f11227c, c3926z1.f11228d);
        this.f10894e.m28623b(c3926z1.f11020b);
        this.f10891b.m35248c().mo28653a(c3926z1.f11019a, c3926z1.f11020b);
    }
}
