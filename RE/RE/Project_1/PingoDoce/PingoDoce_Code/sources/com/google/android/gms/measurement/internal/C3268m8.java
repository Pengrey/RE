package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC2677a1;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m8 */
/* loaded from: classes.dex */
public final class C3268m8 extends AbstractC3380x3 {

    /* renamed from: c */
    private Handler f8686c;

    /* renamed from: d */
    protected final C3246k8 f8687d;

    /* renamed from: e */
    protected final C3235j8 f8688e;

    /* renamed from: f */
    protected final C3213h8 f8689f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3268m8(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8687d = new C3246k8(this);
        this.f8688e = new C3235j8(this);
        this.f8689f = new C3213h8(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m31080q(C3268m8 c3268m8, long j) {
        c3268m8.mo30825h();
        c3268m8.m31078s();
        c3268m8.f8410a.mo31116d().m31328v().m31397b("Activity paused, time", Long.valueOf(j));
        c3268m8.f8689f.m31257a(j);
        if (c3268m8.f8410a.m31094z().m31371D()) {
            c3268m8.f8688e.m31143b(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m31079r(C3268m8 c3268m8, long j) {
        c3268m8.mo30825h();
        c3268m8.m31078s();
        c3268m8.f8410a.mo31116d().m31328v().m31397b("Activity resumed, time", Long.valueOf(j));
        if (c3268m8.f8410a.m31094z().m31371D() || c3268m8.f8410a.m31132F().f8973q.m31056b()) {
            c3268m8.f8688e.m31142c(j);
        }
        c3268m8.f8689f.m31256b();
        C3246k8 c3246k8 = c3268m8.f8687d;
        c3246k8.f8639a.mo30825h();
        if (c3246k8.f8639a.f8410a.m31105o()) {
            c3246k8.m31092b(c3246k8.f8639a.f8410a.mo31115e().mo25914a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m31078s() {
        mo30825h();
        if (this.f8686c == null) {
            this.f8686c = new HandlerC2677a1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3380x3
    /* renamed from: n */
    protected final boolean mo30840n() {
        return false;
    }
}
