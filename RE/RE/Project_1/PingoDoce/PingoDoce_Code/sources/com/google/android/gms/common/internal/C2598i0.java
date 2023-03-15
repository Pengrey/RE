package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;
import p292p7.C8444a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.i0 */
/* loaded from: classes.dex */
public final class C2598i0 extends C8444a implements InterfaceC2602k0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2598i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2602k0
    /* renamed from: a */
    public final int mo33011a() throws RemoteException {
        Parcel m15399s = m15399s(2, m15398y());
        int readInt = m15399s.readInt();
        m15399s.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2602k0
    /* renamed from: b */
    public final InterfaceC5867b mo33010b() throws RemoteException {
        Parcel m15399s = m15399s(1, m15398y());
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }
}
