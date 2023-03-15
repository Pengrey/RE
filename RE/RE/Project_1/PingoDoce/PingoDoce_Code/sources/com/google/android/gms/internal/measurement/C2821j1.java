package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* loaded from: classes.dex */
public final class C2821j1 extends C2900o0 implements InterfaceC2853l1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2821j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853l1
    /* renamed from: N */
    public final void mo32501N(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32196d(m32405s, bundle);
        m32405s.writeLong(j);
        m32406H(1, m32405s);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853l1
    /* renamed from: b */
    public final int mo32500b() throws RemoteException {
        Parcel m32404y = m32404y(2, m32405s());
        int readInt = m32404y.readInt();
        m32404y.recycle();
        return readInt;
    }
}
