package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: com.google.android.gms.maps.c */
/* loaded from: classes.dex */
public final class C3116c implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b = -1;
        byte b2 = -1;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        int i = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 2:
                    b = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 3:
                    b2 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 4:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.m33055c(parcel, m33040r, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 7:
                    b4 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 8:
                    b5 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 9:
                    b6 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 10:
                    b7 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 11:
                    b8 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 12:
                    b9 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 13:
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
                case 14:
                    b10 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 15:
                    b11 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 16:
                    f = SafeParcelReader.m33041q(parcel, m33040r);
                    break;
                case 17:
                    f2 = SafeParcelReader.m33041q(parcel, m33040r);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m33055c(parcel, m33040r, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.m33045m(parcel, m33040r);
                    break;
                case 20:
                    num = SafeParcelReader.m33037u(parcel, m33040r);
                    break;
                case 21:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
