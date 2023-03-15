package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C2900o0;
import com.google.android.gms.internal.measurement.C2932q0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u2 */
/* loaded from: classes.dex */
public final class C3349u2 extends C2900o0 implements InterfaceC3369w2 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3349u2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: I0 */
    public final void mo30926I0(zzks zzksVar, zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzksVar);
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(2, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: L */
    public final void mo30925L(zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(20, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: M */
    public final void mo30924M(long j, String str, String str2, String str3) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeLong(j);
        m32405s.writeString(str);
        m32405s.writeString(str2);
        m32405s.writeString(str3);
        m32406H(10, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: N0 */
    public final List mo30922N0(String str, String str2, String str3) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(null);
        m32405s.writeString(str2);
        m32405s.writeString(str3);
        Parcel m32404y = m32404y(17, m32405s);
        ArrayList createTypedArrayList = m32404y.createTypedArrayList(zzab.CREATOR);
        m32404y.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: Q */
    public final void mo30921Q(Bundle bundle, zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, bundle);
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(19, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: R */
    public final List mo30920R(String str, String str2, boolean z, zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32197c(m32405s, z);
        C2932q0.m32196d(m32405s, zzpVar);
        Parcel m32404y = m32404y(14, m32405s);
        ArrayList createTypedArrayList = m32404y.createTypedArrayList(zzks.CREATOR);
        m32404y.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: a0 */
    public final void mo30917a0(zzab zzabVar, zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzabVar);
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(12, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: e0 */
    public final List mo30916e0(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(null);
        m32405s.writeString(str2);
        m32405s.writeString(str3);
        C2932q0.m32197c(m32405s, z);
        Parcel m32404y = m32404y(15, m32405s);
        ArrayList createTypedArrayList = m32404y.createTypedArrayList(zzks.CREATOR);
        m32404y.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: h1 */
    public final void mo30915h1(zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(4, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: j1 */
    public final void mo30914j1(zzau zzauVar, zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzauVar);
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(1, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: o0 */
    public final void mo30913o0(zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(18, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: q1 */
    public final List mo30912q1(String str, String str2, zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        m32405s.writeString(str);
        m32405s.writeString(str2);
        C2932q0.m32196d(m32405s, zzpVar);
        Parcel m32404y = m32404y(16, m32405s);
        ArrayList createTypedArrayList = m32404y.createTypedArrayList(zzab.CREATOR);
        m32404y.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: w0 */
    public final String mo30911w0(zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzpVar);
        Parcel m32404y = m32404y(11, m32405s);
        String readString = m32404y.readString();
        m32404y.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: x1 */
    public final void mo30910x1(zzp zzpVar) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzpVar);
        m32406H(6, m32405s);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3369w2
    /* renamed from: z1 */
    public final byte[] mo30909z1(zzau zzauVar, String str) throws RemoteException {
        Parcel m32405s = m32405s();
        C2932q0.m32196d(m32405s, zzauVar);
        m32405s.writeString(str);
        Parcel m32404y = m32404y(9, m32405s);
        byte[] createByteArray = m32404y.createByteArray();
        m32404y.recycle();
        return createByteArray;
    }
}
