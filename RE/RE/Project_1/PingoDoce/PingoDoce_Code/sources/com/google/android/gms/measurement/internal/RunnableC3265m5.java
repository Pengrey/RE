package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes.dex */
final class RunnableC3265m5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ boolean f8676w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f8677x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3265m5(C3233j6 c3233j6, boolean z) {
        this.f8677x = c3233j6;
        this.f8676w = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m31105o = this.f8677x.f8410a.m31105o();
        boolean m31106n = this.f8677x.f8410a.m31106n();
        this.f8677x.f8410a.m31109k(this.f8676w);
        if (m31106n == this.f8676w) {
            this.f8677x.f8410a.mo31116d().m31328v().m31397b("Default data collection state already set to", Boolean.valueOf(this.f8676w));
        }
        if (this.f8677x.f8410a.m31105o() == m31105o || this.f8677x.f8410a.m31105o() != this.f8677x.f8410a.m31106n()) {
            this.f8677x.f8410a.mo31116d().m31326x().m31396c("Default data collection is different than actual status", Boolean.valueOf(this.f8676w), Boolean.valueOf(m31105o));
        }
        this.f8677x.m31173R();
    }
}
