package p439x6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: x6.d */
/* loaded from: classes.dex */
public final class C12289d implements Parcelable.Creator<Feature> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Feature createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j == 2) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                j = SafeParcelReader.m33036v(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new Feature(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Feature[] newArray(int i) {
        return new Feature[i];
    }
}
