package p463y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.MapStyleOptions;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.g */
/* loaded from: classes.dex */
public final class C13134g implements Parcelable.Creator<MapStyleOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MapStyleOptions createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            if (SafeParcelReader.m33048j(m33040r) != 2) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new MapStyleOptions(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MapStyleOptions[] newArray(int i) {
        return new MapStyleOptions[i];
    }
}
