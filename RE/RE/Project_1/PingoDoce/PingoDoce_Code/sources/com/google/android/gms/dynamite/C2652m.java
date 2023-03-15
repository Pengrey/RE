package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p133h7.InterfaceC5867b;
import p292p7.C8444a;
import p292p7.C8446c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamite.m */
/* loaded from: classes.dex */
public final class C2652m extends C8444a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2652m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: H */
    public final int m32969H() throws RemoteException {
        Parcel m15399s = m15399s(6, m15398y());
        int readInt = m15399s.readInt();
        m15399s.recycle();
        return readInt;
    }

    /* renamed from: S1 */
    public final int m32968S1(InterfaceC5867b interfaceC5867b, String str, boolean z) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        C8446c.m15395b(m15398y, z);
        Parcel m15399s = m15399s(3, m15398y);
        int readInt = m15399s.readInt();
        m15399s.recycle();
        return readInt;
    }

    /* renamed from: T1 */
    public final int m32967T1(InterfaceC5867b interfaceC5867b, String str, boolean z) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        C8446c.m15395b(m15398y, z);
        Parcel m15399s = m15399s(5, m15398y);
        int readInt = m15399s.readInt();
        m15399s.recycle();
        return readInt;
    }

    /* renamed from: U1 */
    public final InterfaceC5867b m32966U1(InterfaceC5867b interfaceC5867b, String str, int i) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        m15398y.writeInt(i);
        Parcel m15399s = m15399s(2, m15398y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }

    /* renamed from: V1 */
    public final InterfaceC5867b m32965V1(InterfaceC5867b interfaceC5867b, String str, int i, InterfaceC5867b interfaceC5867b2) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        m15398y.writeInt(i);
        C8446c.m15393d(m15398y, interfaceC5867b2);
        Parcel m15399s = m15399s(8, m15398y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }

    /* renamed from: W1 */
    public final InterfaceC5867b m32964W1(InterfaceC5867b interfaceC5867b, String str, int i) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        m15398y.writeInt(i);
        Parcel m15399s = m15399s(4, m15398y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }

    /* renamed from: X1 */
    public final InterfaceC5867b m32963X1(InterfaceC5867b interfaceC5867b, String str, boolean z, long j) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15393d(m15398y, interfaceC5867b);
        m15398y.writeString(str);
        C8446c.m15395b(m15398y, z);
        m15398y.writeLong(j);
        Parcel m15399s = m15399s(7, m15398y);
        InterfaceC5867b m22841y = InterfaceC5867b.AbstractBinderC5868a.m22841y(m15399s.readStrongBinder());
        m15399s.recycle();
        return m22841y;
    }
}
