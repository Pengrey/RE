package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.x */
/* loaded from: classes.dex */
public final class BinderC2615x extends AbstractBinderC2607p {

    /* renamed from: a */
    private AbstractC2576b f7523a;

    /* renamed from: b */
    private final int f7524b;

    public BinderC2615x(AbstractC2576b abstractC2576b, int i) {
        this.f7523a = abstractC2576b;
        this.f7524b = i;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2593g
    /* renamed from: P */
    public final void mo33019P(int i, IBinder iBinder, zzj zzjVar) {
        AbstractC2576b abstractC2576b = this.f7523a;
        C2597i.m33075k(abstractC2576b, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C2597i.m33076j(zzjVar);
        AbstractC2576b.m33158c0(abstractC2576b, zzjVar);
        mo33018P1(i, iBinder, zzjVar.f7538w);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2593g
    /* renamed from: P1 */
    public final void mo33018P1(int i, IBinder iBinder, Bundle bundle) {
        C2597i.m33075k(this.f7523a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f7523a.m33174N(i, iBinder, bundle, this.f7524b);
        this.f7523a = null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2593g
    /* renamed from: X0 */
    public final void mo33017X0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
