package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.p7 */
/* loaded from: classes.dex */
public final class RunnableC3300p7 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ boolean f8780A;

    /* renamed from: B */
    final /* synthetic */ C3374w7 f8781B;

    /* renamed from: w */
    final /* synthetic */ AtomicReference f8782w;

    /* renamed from: x */
    final /* synthetic */ String f8783x;

    /* renamed from: y */
    final /* synthetic */ String f8784y;

    /* renamed from: z */
    final /* synthetic */ zzp f8785z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3300p7(C3374w7 c3374w7, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z) {
        this.f8781B = c3374w7;
        this.f8782w = atomicReference;
        this.f8783x = str2;
        this.f8784y = str3;
        this.f8785z = zzpVar;
        this.f8780A = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3374w7 c3374w7;
        InterfaceC3369w2 interfaceC3369w2;
        synchronized (this.f8782w) {
            try {
                c3374w7 = this.f8781B;
                interfaceC3369w2 = c3374w7.f9071d;
            } catch (RemoteException e) {
                this.f8781B.f8410a.mo31116d().m31332r().m31395d("(legacy) Failed to get user properties; remote exception", null, this.f8783x, e);
                this.f8782w.set(Collections.emptyList());
                atomicReference = this.f8782w;
            }
            if (interfaceC3369w2 == null) {
                c3374w7.f8410a.mo31116d().m31332r().m31395d("(legacy) Failed to get user properties; not connected to service", null, this.f8783x, this.f8784y);
                this.f8782w.set(Collections.emptyList());
                this.f8782w.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                C2597i.m33076j(this.f8785z);
                this.f8782w.set(interfaceC3369w2.mo30920R(this.f8783x, this.f8784y, this.f8780A, this.f8785z));
            } else {
                this.f8782w.set(interfaceC3369w2.mo30916e0(null, this.f8783x, this.f8784y, this.f8780A));
            }
            this.f8781B.m30883E();
            atomicReference = this.f8782w;
            atomicReference.notify();
        }
    }
}
