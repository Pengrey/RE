package p463y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.f */
/* loaded from: classes.dex */
public final class C13133f implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LatLng createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 2) {
                d = SafeParcelReader.m33044n(parcel, m33040r);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                d2 = SafeParcelReader.m33044n(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new LatLng(d, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng[] newArray(int i) {
        return new LatLng[i];
    }
}
