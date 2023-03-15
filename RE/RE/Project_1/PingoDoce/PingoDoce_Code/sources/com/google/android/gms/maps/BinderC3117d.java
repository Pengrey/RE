package com.google.android.gms.maps;

import android.os.RemoteException;
import p418w7.C11581c;
import p418w7.InterfaceC11590d;
import p440x7.AbstractBinderC12310m;
import p440x7.InterfaceC12293b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: com.google.android.gms.maps.d */
/* loaded from: classes.dex */
public final class BinderC3117d extends AbstractBinderC12310m {

    /* renamed from: a */
    final /* synthetic */ InterfaceC11590d f8236a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC3117d(C3118e c3118e, InterfaceC11590d interfaceC11590d) {
        this.f8236a = interfaceC11590d;
    }

    @Override // p440x7.InterfaceC12311n
    /* renamed from: U */
    public final void mo3110U(InterfaceC12293b interfaceC12293b) throws RemoteException {
        this.f8236a.mo4652l(new C11581c(interfaceC12293b));
    }
}
