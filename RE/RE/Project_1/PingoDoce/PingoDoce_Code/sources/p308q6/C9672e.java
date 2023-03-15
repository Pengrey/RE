package p308q6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: q6.e */
/* loaded from: classes.dex */
public final class C9672e implements Parcelable.Creator<IdToken> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IdToken createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j != 2) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                str2 = SafeParcelReader.m33054d(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new IdToken(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ IdToken[] newArray(int i) {
        return new IdToken[i];
    }
}
