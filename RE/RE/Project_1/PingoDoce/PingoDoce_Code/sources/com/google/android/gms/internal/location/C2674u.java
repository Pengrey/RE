package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.internal.location.u */
/* loaded from: classes.dex */
public final class C2674u implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        zzj zzjVar = null;
        int i = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                zzjVar = (zzj) SafeParcelReader.m33055c(parcel, m33040r, zzj.CREATOR);
            } else if (m33048j == 3) {
                iBinder = SafeParcelReader.m33039s(parcel, m33040r);
            } else if (m33048j != 4) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                iBinder2 = SafeParcelReader.m33039s(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzl(i, zzjVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i) {
        return new zzl[i];
    }
}
