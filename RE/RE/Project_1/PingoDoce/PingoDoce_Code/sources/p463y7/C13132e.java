package p463y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.e */
/* loaded from: classes.dex */
public final class C13132e implements Parcelable.Creator<LatLngBounds> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLngBounds createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 2) {
                latLng = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                latLng2 = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLngBounds[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
