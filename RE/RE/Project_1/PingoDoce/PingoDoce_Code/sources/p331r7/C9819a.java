package p331r7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzaa;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: r7.a */
/* loaded from: classes.dex */
public final class C9819a implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        Status status = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            if (SafeParcelReader.m33048j(m33040r) != 1) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                status = (Status) SafeParcelReader.m33055c(parcel, m33040r, Status.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i) {
        return new zzaa[i];
    }
}
