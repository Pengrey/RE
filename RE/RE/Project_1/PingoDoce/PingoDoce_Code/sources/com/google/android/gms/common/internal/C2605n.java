package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.n */
/* loaded from: classes.dex */
public final class C2605n implements Parcelable.Creator<zav> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zav createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                iBinder = SafeParcelReader.m33039s(parcel, m33040r);
            } else if (m33048j == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m33055c(parcel, m33040r, ConnectionResult.CREATOR);
            } else if (m33048j == 4) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                z2 = SafeParcelReader.m33047k(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zav[] newArray(int i) {
        return new zav[i];
    }
}
