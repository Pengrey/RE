package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.w */
/* loaded from: classes.dex */
public final class C3109w implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        List<Location> list = LocationResult.f8175x;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            if (SafeParcelReader.m33048j(m33040r) != 1) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                list = SafeParcelReader.m33050h(parcel, m33040r, Location.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i) {
        return new LocationResult[i];
    }
}
