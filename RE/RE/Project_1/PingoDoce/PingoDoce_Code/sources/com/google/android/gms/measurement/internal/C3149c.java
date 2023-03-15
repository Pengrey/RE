package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c */
/* loaded from: classes.dex */
public final class C3149c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        zzks zzksVar = null;
        String str3 = null;
        zzau zzauVar = null;
        zzau zzauVar2 = null;
        zzau zzauVar3 = null;
        boolean z = false;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 2:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 3:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 4:
                    zzksVar = (zzks) SafeParcelReader.m33055c(parcel, m33040r, zzks.CREATOR);
                    break;
                case 5:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 6:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 7:
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 8:
                    zzauVar = (zzau) SafeParcelReader.m33055c(parcel, m33040r, zzau.CREATOR);
                    break;
                case 9:
                    j2 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 10:
                    zzauVar2 = (zzau) SafeParcelReader.m33055c(parcel, m33040r, zzau.CREATOR);
                    break;
                case 11:
                    j3 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 12:
                    zzauVar3 = (zzau) SafeParcelReader.m33055c(parcel, m33040r, zzau.CREATOR);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzab(str, str2, zzksVar, j, z, str3, zzauVar, j2, zzauVar2, j3, zzauVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzab[i];
    }
}
