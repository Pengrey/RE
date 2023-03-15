package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.s */
/* loaded from: classes.dex */
public final class C2627s implements Parcelable.Creator<zzn> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzn createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j == 2) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 3) {
                z2 = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 4) {
                iBinder = SafeParcelReader.m33039s(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                z3 = SafeParcelReader.m33047k(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzn(str, z, z2, iBinder, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzn[] newArray(int i) {
        return new zzn[i];
    }
}
