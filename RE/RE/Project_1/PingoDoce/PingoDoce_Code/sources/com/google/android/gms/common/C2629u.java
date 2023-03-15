package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.u */
/* loaded from: classes.dex */
public final class C2629u implements Parcelable.Creator<zzq> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzq createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 2) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzq(z, str, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzq[] newArray(int i) {
        return new zzq[i];
    }
}
