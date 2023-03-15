package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;
import p292p7.C8444a;
import p292p7.C8446c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamite.n */
/* loaded from: classes.dex */
public final class C2653n extends C8444a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2653n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: H */
    public final InterfaceC5867b m32962H(InterfaceC5867b interfaceC5867b, String str, int i, InterfaceC5867b interfaceC5867b2) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        m15398y.writeInt(i);
        C8446c.m15393d(m15398y, interfaceC5867b2);
        Parcel m15399s = m15399s(2, m15398y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }

    /* renamed from: S1 */
    public final InterfaceC5867b m32961S1(InterfaceC5867b interfaceC5867b, String str, int i, InterfaceC5867b interfaceC5867b2) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        m15398y.writeInt(i);
        C8446c.m15393d(m15398y, interfaceC5867b2);
        Parcel m15399s = m15399s(3, m15398y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }
}
