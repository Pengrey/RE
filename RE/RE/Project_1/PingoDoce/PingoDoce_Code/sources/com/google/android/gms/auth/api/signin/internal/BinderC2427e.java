package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
/* loaded from: classes.dex */
final class BinderC2427e extends BinderC2425c {

    /* renamed from: a */
    final /* synthetic */ C2428f f7090a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2427e(C2428f c2428f) {
        this.f7090a = c2428f;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.BinderC2425c, com.google.android.gms.auth.api.signin.internal.InterfaceC2436n
    /* renamed from: W */
    public final void mo33565W(Status status) throws RemoteException {
        this.f7090a.m33473f(status);
    }
}
