package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p251n7.C7682a;
import p251n7.C7684c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.signin.internal.e */
/* loaded from: classes.dex */
public final class C3410e extends C7682a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3410e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: S1 */
    public final void m30810S1(zai zaiVar, InterfaceC3409d interfaceC3409d) throws RemoteException {
        Parcel m17724s = m17724s();
        C7684c.m17720b(m17724s, zaiVar);
        C7684c.m17719c(m17724s, interfaceC3409d);
        m17723y(12, m17724s);
    }
}
