package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.p */
/* loaded from: classes.dex */
public final class C2669p implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        ArrayList arrayList = zzba.f7606H;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        long j = Long.MAX_VALUE;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j != 1) {
                switch (m33048j) {
                    case 5:
                        arrayList = SafeParcelReader.m33050h(parcel, m33040r, ClientIdentity.CREATOR);
                        continue;
                    case 6:
                        str = SafeParcelReader.m33054d(parcel, m33040r);
                        continue;
                    case 7:
                        z = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 8:
                        z2 = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 9:
                        z3 = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 10:
                        str2 = SafeParcelReader.m33054d(parcel, m33040r);
                        continue;
                    case 11:
                        z4 = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 12:
                        z5 = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 13:
                        str3 = SafeParcelReader.m33054d(parcel, m33040r);
                        continue;
                    case 14:
                        j = SafeParcelReader.m33036v(parcel, m33040r);
                        continue;
                    default:
                        SafeParcelReader.m33033y(parcel, m33040r);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m33055c(parcel, m33040r, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzba(locationRequest, arrayList, str, z, z2, z3, str2, z4, z5, str3, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i) {
        return new zzba[i];
    }
}
