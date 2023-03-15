package p463y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.h */
/* loaded from: classes.dex */
public final class C13135h implements Parcelable.Creator<VisibleRegion> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ VisibleRegion createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 2) {
                latLng = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            } else if (m33048j == 3) {
                latLng2 = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            } else if (m33048j == 4) {
                latLng3 = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            } else if (m33048j == 5) {
                latLng4 = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            } else if (m33048j != 6) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.m33055c(parcel, m33040r, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
