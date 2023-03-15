package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.signin.internal.b */
/* loaded from: classes.dex */
public final class C3407b implements Parcelable.Creator<zaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zaa createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 3) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                intent = (Intent) SafeParcelReader.m33055c(parcel, m33040r, Intent.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zaa(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zaa[] newArray(int i) {
        return new zaa[i];
    }
}
