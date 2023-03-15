package p463y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.d */
/* loaded from: classes.dex */
public final class C13131d implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        LatLng latLng = null;
        float f3 = 0.0f;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 2) {
                latLng = (LatLng) SafeParcelReader.m33055c(parcel, m33040r, LatLng.CREATOR);
            } else if (m33048j == 3) {
                f = SafeParcelReader.m33042p(parcel, m33040r);
            } else if (m33048j == 4) {
                f3 = SafeParcelReader.m33042p(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                f2 = SafeParcelReader.m33042p(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new CameraPosition(latLng, f, f3, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }
}
