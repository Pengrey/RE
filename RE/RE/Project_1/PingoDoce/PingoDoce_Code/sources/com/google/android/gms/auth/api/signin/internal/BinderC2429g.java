package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
/* loaded from: classes.dex */
final class BinderC2429g extends BinderC2425c {

    /* renamed from: a */
    final /* synthetic */ C2430h f7091a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC2429g(C2430h c2430h) {
        this.f7091a = c2430h;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.BinderC2425c, com.google.android.gms.auth.api.signin.internal.InterfaceC2436n
    /* renamed from: K1 */
    public final void mo33567K1(Status status) throws RemoteException {
        this.f7091a.m33473f(status);
    }
}
