package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.u */
/* loaded from: classes.dex */
public final class C3107u implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 1;
        int i2 = 1;
        int i3 = 1000;
        long j = 0;
        zzbo[] zzboVarArr = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 3) {
                j = SafeParcelReader.m33036v(parcel, m33040r);
            } else if (m33048j == 4) {
                i3 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                zzboVarArr = (zzbo[]) SafeParcelReader.m33051g(parcel, m33040r, zzbo.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new LocationAvailability(i3, i, i2, j, zzboVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
