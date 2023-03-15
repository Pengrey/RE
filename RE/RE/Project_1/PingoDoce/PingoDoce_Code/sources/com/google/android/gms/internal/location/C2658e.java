package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p331r7.C9824f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.e */
/* loaded from: classes.dex */
public final class C2658e extends C2654a implements InterfaceC2659f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2658e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2659f
    /* renamed from: I1 */
    public final void mo32957I1(zzl zzlVar) throws RemoteException {
        Parcel m32959s = m32959s();
        C9824f.m9913c(m32959s, zzlVar);
        m32960H(75, m32959s);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2659f
    /* renamed from: M1 */
    public final void mo32956M1(boolean z) throws RemoteException {
        Parcel m32959s = m32959s();
        C9824f.m9915a(m32959s, z);
        m32960H(12, m32959s);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2659f
    /* renamed from: i1 */
    public final Location mo32955i1(String str) throws RemoteException {
        Parcel m32959s = m32959s();
        m32959s.writeString(str);
        Parcel m32958y = m32958y(80, m32959s);
        Location location = (Location) C9824f.m9914b(m32958y, Location.CREATOR);
        m32958y.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2659f
    /* renamed from: j0 */
    public final void mo32954j0(zzbc zzbcVar) throws RemoteException {
        Parcel m32959s = m32959s();
        C9824f.m9913c(m32959s, zzbcVar);
        m32960H(59, m32959s);
    }

    @Override // com.google.android.gms.internal.location.InterfaceC2659f
    /* renamed from: t */
    public final Location mo32953t() throws RemoteException {
        Parcel m32958y = m32958y(7, m32959s());
        Location location = (Location) C9824f.m9914b(m32958y, Location.CREATOR);
        m32958y.recycle();
        return location;
    }
}
