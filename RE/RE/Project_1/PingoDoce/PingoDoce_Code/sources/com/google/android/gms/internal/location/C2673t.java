package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.zzs;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.t */
/* loaded from: classes.dex */
public final class C2673t implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        zzs zzsVar = zzj.f7624A;
        List<ClientIdentity> list = zzj.f7625z;
        String str = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                zzsVar = (zzs) SafeParcelReader.m33055c(parcel, m33040r, zzs.CREATOR);
            } else if (m33048j == 2) {
                list = SafeParcelReader.m33050h(parcel, m33040r, ClientIdentity.CREATOR);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzj(zzsVar, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
