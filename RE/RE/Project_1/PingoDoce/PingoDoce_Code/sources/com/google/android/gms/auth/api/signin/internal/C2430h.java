package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.Status;
import p462y6.InterfaceC13123e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
/* loaded from: classes.dex */
public final class C2430h extends AbstractC2431i<Status> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2430h(AbstractC2475c abstractC2475c) {
        super(abstractC2475c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC13123e mo1566c(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2493d
    /* renamed from: l */
    protected final /* bridge */ /* synthetic */ void mo33446l(C2426d c2426d) throws RemoteException {
        C2426d c2426d2 = c2426d;
        ((C2437o) c2426d2.m33182D()).m33564H(new BinderC2429g(this), c2426d2.m33571m0());
    }
}
