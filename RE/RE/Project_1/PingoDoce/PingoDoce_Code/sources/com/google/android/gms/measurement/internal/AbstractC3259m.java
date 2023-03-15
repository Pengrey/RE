package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.HandlerC2677a1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC3259m {

    /* renamed from: d */
    private static volatile Handler f8664d;

    /* renamed from: a */
    private final InterfaceC3199g5 f8665a;

    /* renamed from: b */
    private final Runnable f8666b;

    /* renamed from: c */
    private volatile long f8667c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3259m(InterfaceC3199g5 interfaceC3199g5) {
        C2597i.m33076j(interfaceC3199g5);
        this.f8665a = interfaceC3199g5;
        this.f8666b = new RunnableC3248l(this, interfaceC3199g5);
    }

    /* renamed from: f */
    private final Handler m31083f() {
        Handler handler;
        if (f8664d != null) {
            return f8664d;
        }
        synchronized (AbstractC3259m.class) {
            if (f8664d == null) {
                f8664d = new HandlerC2677a1(this.f8665a.mo31117c().getMainLooper());
            }
            handler = f8664d;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31086b() {
        this.f8667c = 0L;
        m31083f().removeCallbacks(this.f8666b);
    }

    /* renamed from: c */
    public abstract void mo31054c();

    /* renamed from: d */
    public final void m31085d(long j) {
        m31086b();
        if (j >= 0) {
            this.f8667c = this.f8665a.mo31115e().mo25914a();
            if (m31083f().postDelayed(this.f8666b, j)) {
                return;
            }
            this.f8665a.mo31116d().m31332r().m31397b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    /* renamed from: e */
    public final boolean m31084e() {
        return this.f8667c != 0;
    }
}
