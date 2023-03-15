package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p031b9.C1869z;

/* renamed from: com.google.android.play.core.internal.r */
/* loaded from: classes.dex */
public final class C3949r extends C3940i implements InterfaceC3950s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3949r(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // com.google.android.play.core.internal.InterfaceC3950s
    /* renamed from: D */
    public final void mo28533D(Bundle bundle) throws RemoteException {
        Parcel m28559s = m28559s();
        C1869z.m35240c(m28559s, bundle);
        m28558y(4, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3950s
    /* renamed from: i */
    public final void mo28532i(Bundle bundle) throws RemoteException {
        Parcel m28559s = m28559s();
        C1869z.m35240c(m28559s, bundle);
        m28558y(3, m28559s);
    }

    @Override // com.google.android.play.core.internal.InterfaceC3950s
    /* renamed from: z */
    public final void mo28531z(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel m28559s = m28559s();
        C1869z.m35240c(m28559s, bundle);
        C1869z.m35240c(m28559s, bundle2);
        m28558y(2, m28559s);
    }
}
