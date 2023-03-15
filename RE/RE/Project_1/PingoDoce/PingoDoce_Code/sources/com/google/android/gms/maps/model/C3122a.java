package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: com.google.android.gms.maps.model.a */
/* loaded from: classes.dex */
public final class C3122a implements Parcelable.Creator<MarkerOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MarkerOptions createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.5f;
        float f7 = 1.0f;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 4:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m33039s(parcel, m33040r);
                    break;
                case 6:
                    f = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 7:
                    f2 = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 8:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 9:
                    z2 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 10:
                    z3 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 11:
                    f3 = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 12:
                    f6 = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 13:
                    f4 = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 14:
                    f7 = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                case 15:
                    f5 = SafeParcelReader.m33042p(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f6, f4, f7, f5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
