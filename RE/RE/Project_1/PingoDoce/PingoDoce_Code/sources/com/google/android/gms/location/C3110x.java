package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.x */
/* loaded from: classes.dex */
public final class C3110x implements Parcelable.Creator<zzbo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 3) {
                j = SafeParcelReader.m33036v(parcel, m33040r);
            } else if (m33048j != 4) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                j2 = SafeParcelReader.m33036v(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzbo(i, i2, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbo[] newArray(int i) {
        return new zzbo[i];
    }
}
