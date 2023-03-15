package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.n7 */
/* loaded from: classes.dex */
public final class RunnableC3278n7 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ C3374w7 f8705A;

    /* renamed from: w */
    final /* synthetic */ AtomicReference f8706w;

    /* renamed from: x */
    final /* synthetic */ String f8707x;

    /* renamed from: y */
    final /* synthetic */ String f8708y;

    /* renamed from: z */
    final /* synthetic */ zzp f8709z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3278n7(C3374w7 c3374w7, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar) {
        this.f8705A = c3374w7;
        this.f8706w = atomicReference;
        this.f8707x = str2;
        this.f8708y = str3;
        this.f8709z = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C3374w7 c3374w7;
        InterfaceC3369w2 interfaceC3369w2;
        synchronized (this.f8706w) {
            try {
                c3374w7 = this.f8705A;
                interfaceC3369w2 = c3374w7.f9071d;
            } catch (RemoteException e) {
                this.f8705A.f8410a.mo31116d().m31332r().m31395d("(legacy) Failed to get conditional properties; remote exception", null, this.f8707x, e);
                this.f8706w.set(Collections.emptyList());
                atomicReference = this.f8706w;
            }
            if (interfaceC3369w2 == null) {
                c3374w7.f8410a.mo31116d().m31332r().m31395d("(legacy) Failed to get conditional properties; not connected to service", null, this.f8707x, this.f8708y);
                this.f8706w.set(Collections.emptyList());
                this.f8706w.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                C2597i.m33076j(this.f8709z);
                this.f8706w.set(interfaceC3369w2.mo30912q1(this.f8707x, this.f8708y, this.f8709z));
            } else {
                this.f8706w.set(interfaceC3369w2.mo30922N0(null, this.f8707x, this.f8708y));
            }
            this.f8705A.m30883E();
            atomicReference = this.f8706w;
            atomicReference.notify();
        }
    }
}
