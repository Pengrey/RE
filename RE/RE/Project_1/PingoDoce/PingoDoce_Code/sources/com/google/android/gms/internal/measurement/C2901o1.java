package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* loaded from: classes.dex */
public final class C2901o1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 2:
                    j2 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 3:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 4:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 5:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 6:
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 7:
                    bundle = SafeParcelReader.m33057a(parcel, m33040r);
                    break;
                case 8:
                    str4 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzcl(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
