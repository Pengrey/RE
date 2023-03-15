package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.v */
/* loaded from: classes.dex */
public final class C3108v implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 2:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 3:
                    j2 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 4:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 5:
                    j3 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 6:
                    i2 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 7:
                    f = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 8:
                    j4 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 9:
                    z2 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
