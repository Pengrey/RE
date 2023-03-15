package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.signin.internal.g */
/* loaded from: classes.dex */
public final class C3412g implements Parcelable.Creator<zak> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zak createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        zav zavVar = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m33055c(parcel, m33040r, ConnectionResult.CREATOR);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                zavVar = (zav) SafeParcelReader.m33055c(parcel, m33040r, zav.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zak(i, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zak[] newArray(int i) {
        return new zak[i];
    }
}
