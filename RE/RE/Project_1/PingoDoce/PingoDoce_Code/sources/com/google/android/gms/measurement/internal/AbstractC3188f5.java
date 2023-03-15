package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.f5 */
/* loaded from: classes.dex */
public abstract class AbstractC3188f5 extends C3177e5 {

    /* renamed from: b */
    private boolean f8436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3188f5(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8410a.m31111i();
    }

    /* renamed from: i */
    protected void mo31008i() {
    }

    /* renamed from: j */
    protected abstract boolean mo31007j();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m31346k() {
        if (!m31343n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void m31345l() {
        if (!this.f8436b) {
            if (mo31007j()) {
                return;
            }
            this.f8410a.m31113g();
            this.f8436b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: m */
    public final void m31344m() {
        if (!this.f8436b) {
            mo31008i();
            this.f8410a.m31113g();
            this.f8436b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean m31343n() {
        return this.f8436b;
    }
}
