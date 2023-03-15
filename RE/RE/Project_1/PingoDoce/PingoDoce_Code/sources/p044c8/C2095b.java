package p044c8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: c8.b */
/* loaded from: classes.dex */
public final class C2095b implements Parcelable.Creator<zag> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zag createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                arrayList = SafeParcelReader.m33052f(parcel, m33040r);
            } else if (m33048j != 2) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zag(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zag[] newArray(int i) {
        return new zag[i];
    }
}
