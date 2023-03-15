package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r8 */
/* loaded from: classes.dex */
public abstract class AbstractC3323r8 extends C3312q8 {

    /* renamed from: c */
    private boolean f8851c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3323r8(C3137a9 c3137a9) {
        super(c3137a9);
        this.f8820b.m31468q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m31026i() {
        if (!m31024k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void m31025j() {
        if (!this.f8851c) {
            mo30839l();
            this.f8820b.m31473l();
            this.f8851c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean m31024k() {
        return this.f8851c;
    }

    /* renamed from: l */
    protected abstract boolean mo30839l();
}
