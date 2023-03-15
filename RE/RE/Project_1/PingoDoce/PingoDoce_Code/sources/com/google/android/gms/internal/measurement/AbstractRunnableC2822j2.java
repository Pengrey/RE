package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2822j2 implements Runnable {

    /* renamed from: w */
    final long f7796w;

    /* renamed from: x */
    final long f7797x;

    /* renamed from: y */
    final boolean f7798y;

    /* renamed from: z */
    final /* synthetic */ C2997u2 f7799z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC2822j2(C2997u2 c2997u2, boolean z) {
        this.f7799z = c2997u2;
        this.f7796w = c2997u2.f8023b.mo25914a();
        this.f7797x = c2997u2.f8023b.mo25912c();
        this.f7798y = z;
    }

    /* renamed from: a */
    abstract void mo31730a() throws RemoteException;

    /* renamed from: b */
    protected void mo31729b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f7799z.f8028g;
        if (z) {
            mo31729b();
            return;
        }
        try {
            mo31730a();
        } catch (Exception e) {
            this.f7799z.m32031j(e, false, this.f7798y);
            mo31729b();
        }
    }
}
