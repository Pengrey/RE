package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes.dex */
public abstract class AbstractC3380x3 extends C3399z2 {

    /* renamed from: b */
    private boolean f9094b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3380x3(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8410a.m31111i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m30845i() {
        if (!m30841m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m30844j() {
        if (this.f9094b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo30840n()) {
            return;
        }
        this.f8410a.m31113g();
        this.f9094b = true;
    }

    /* renamed from: k */
    public final void m30843k() {
        if (!this.f9094b) {
            mo30842l();
            this.f8410a.m31113g();
            this.f9094b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: l */
    protected void mo30842l() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m30841m() {
        return this.f9094b;
    }

    /* renamed from: n */
    protected abstract boolean mo30840n();
}
