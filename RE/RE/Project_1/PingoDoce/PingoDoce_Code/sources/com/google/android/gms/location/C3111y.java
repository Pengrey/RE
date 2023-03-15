package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.y */
/* loaded from: classes.dex */
public final class C3111y implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = true;
        long j = 50;
        float f = 0.0f;
        long j2 = Long.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 2) {
                j = SafeParcelReader.m33036v(parcel, m33040r);
            } else if (m33048j == 3) {
                f = SafeParcelReader.m33042p(parcel, m33040r);
            } else if (m33048j == 4) {
                j2 = SafeParcelReader.m33036v(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzs(z, j, f, j2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i) {
        return new zzs[i];
    }
}
