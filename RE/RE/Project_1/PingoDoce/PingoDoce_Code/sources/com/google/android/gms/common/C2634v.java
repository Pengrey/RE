package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.v */
/* loaded from: classes.dex */
public final class C2634v implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j == 2) {
                iBinder = SafeParcelReader.m33039s(parcel, m33040r);
            } else if (m33048j == 3) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j != 4) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                z2 = SafeParcelReader.m33047k(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzs(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzs[] newArray(int i) {
        return new zzs[i];
    }
}
