package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.signin.internal.f */
/* loaded from: classes.dex */
public final class C3411f implements Parcelable.Creator<zai> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zai createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        zat zatVar = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 2) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                zatVar = (zat) SafeParcelReader.m33055c(parcel, m33040r, zat.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zai(i, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zai[] newArray(int i) {
        return new zai[i];
    }
}
