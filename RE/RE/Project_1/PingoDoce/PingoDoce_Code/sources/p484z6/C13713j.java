package p484z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.j */
/* loaded from: classes.dex */
public final class C13713j implements Parcelable.Creator<ClientIdentity> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ClientIdentity createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 2) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new ClientIdentity(i, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ClientIdentity[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
