package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import p133h7.InterfaceC5867b;
import p292p7.C8444a;
import p292p7.C8446c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes.dex */
public final class C2609r extends C8444a implements InterfaceC2611t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2609r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2611t
    /* renamed from: C1 */
    public final boolean mo33031C1(zzs zzsVar, InterfaceC5867b interfaceC5867b) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15394c(m15398y, zzsVar);
        C8446c.m15393d(m15398y, interfaceC5867b);
        Parcel m15399s = m15399s(5, m15398y);
        boolean m15392e = C8446c.m15392e(m15399s);
        m15399s.recycle();
        return m15392e;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2611t
    /* renamed from: F1 */
    public final zzq mo33030F1(zzn zznVar) throws RemoteException {
        Parcel m15398y = m15398y();
        C8446c.m15394c(m15398y, zznVar);
        Parcel m15399s = m15399s(6, m15398y);
        zzq zzqVar = (zzq) C8446c.m15396a(m15399s, zzq.CREATOR);
        m15399s.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2611t
    /* renamed from: f */
    public final boolean mo33029f() throws RemoteException {
        Parcel m15399s = m15399s(7, m15398y());
        boolean m15392e = C8446c.m15392e(m15399s);
        m15399s.recycle();
        return m15392e;
    }
}
