package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p031b9.C1844a;
import p031b9.InterfaceC1864u;
import p080e9.C5021a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.t2 */
/* loaded from: classes.dex */
public final class C3903t2 {

    /* renamed from: e */
    private static final C1844a f11159e = new C1844a("AssetPackManager");

    /* renamed from: a */
    private final C3924z f11160a;

    /* renamed from: b */
    private final InterfaceC1864u<InterfaceC3833c3> f11161b;

    /* renamed from: c */
    private final C3900t f11162c;

    /* renamed from: d */
    private final InterfaceC1864u<Executor> f11163d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3903t2(C3924z c3924z, InterfaceC1864u<InterfaceC3833c3> interfaceC1864u, C3900t c3900t, C5021a c5021a, C3862j1 c3862j1, C3909v0 c3909v0, C3861j0 c3861j0, InterfaceC1864u<Executor> interfaceC1864u2) {
        new Handler(Looper.getMainLooper());
        this.f11160a = c3924z;
        this.f11161b = interfaceC1864u;
        this.f11162c = c3900t;
        this.f11163d = interfaceC1864u2;
    }

    /* renamed from: d */
    private final void m28626d() {
        this.f11163d.m35248c().execute(new Runnable(this) { // from class: com.google.android.play.core.assetpacks.q2

            /* renamed from: w */
            private final C3903t2 f11109w;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11109w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11109w.m28627c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28628b(boolean z) {
        boolean m34691d = this.f11162c.m34691d();
        this.f11162c.m34692c(z);
        if (!z || m34691d) {
            return;
        }
        m28626d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m28627c() {
        C3924z c3924z = this.f11160a;
        c3924z.getClass();
        this.f11161b.m35248c().mo28656D(this.f11160a.m28590l()).mo24371c(this.f11163d.m35248c(), C3895r2.m28644a(c3924z)).mo24372b(this.f11163d.m35248c(), C3899s2.f11140a);
    }
}
