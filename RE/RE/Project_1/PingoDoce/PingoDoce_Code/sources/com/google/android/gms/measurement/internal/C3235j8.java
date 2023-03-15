package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3022vc;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* loaded from: classes.dex */
public final class C3235j8 {

    /* renamed from: a */
    protected long f8579a;

    /* renamed from: b */
    protected long f8580b;

    /* renamed from: c */
    private final AbstractC3259m f8581c;

    /* renamed from: d */
    final /* synthetic */ C3268m8 f8582d;

    public C3235j8(C3268m8 c3268m8) {
        this.f8582d = c3268m8;
        this.f8581c = new C3224i8(this, c3268m8.f8410a);
        long mo25912c = c3268m8.f8410a.mo31115e().mo25912c();
        this.f8579a = mo25912c;
        this.f8580b = mo25912c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31144a() {
        this.f8581c.m31086b();
        this.f8579a = 0L;
        this.f8580b = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31143b(long j) {
        this.f8581c.m31086b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31142c(long j) {
        this.f8582d.mo30825h();
        this.f8581c.m31086b();
        this.f8579a = j;
        this.f8580b = j;
    }

    /* renamed from: d */
    public final boolean m31141d(boolean z, boolean z2, long j) {
        this.f8582d.mo30825h();
        this.f8582d.m30845i();
        C3022vc.m31917b();
        if (this.f8582d.f8410a.m31094z().m31373B(null, C3339t2.f8920f0)) {
            if (this.f8582d.f8410a.m31105o()) {
                this.f8582d.f8410a.m31132F().f8971o.m31038b(this.f8582d.f8410a.mo31115e().mo25914a());
            }
        } else {
            this.f8582d.f8410a.m31132F().f8971o.m31038b(this.f8582d.f8410a.mo31115e().mo25914a());
        }
        long j2 = j - this.f8579a;
        if (!z && j2 < 1000) {
            this.f8582d.f8410a.mo31116d().m31328v().m31397b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (!z2) {
            j2 = j - this.f8580b;
            this.f8580b = j;
        }
        this.f8582d.f8410a.mo31116d().m31328v().m31397b("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        C3203g9.m31265x(this.f8582d.f8410a.m31127K().m30894t(!this.f8582d.f8410a.m31094z().m31371D()), bundle, true);
        if (!z2) {
            this.f8582d.f8410a.m31129I().m31150u("auto", "_e", bundle);
        }
        this.f8579a = j;
        this.f8581c.m31086b();
        this.f8581c.m31085d(3600000L);
        return true;
    }
}
