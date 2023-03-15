package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* loaded from: classes.dex */
public final class C3258l9 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        int i = 0;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = BuildConfig.VERSION_NAME;
        long j6 = -2147483648L;
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
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 5:
                    str4 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 6:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 7:
                    j2 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 8:
                    str5 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 9:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 10:
                    z3 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 11:
                    j6 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 12:
                    str6 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 13:
                    j3 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 14:
                    j4 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 15:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 16:
                    z2 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
                case 18:
                    z4 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 19:
                    str7 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 21:
                    bool = SafeParcelReader.m33046l(parcel, m33040r);
                    break;
                case 22:
                    j5 = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 23:
                    arrayList = SafeParcelReader.m33052f(parcel, m33040r);
                    break;
                case 24:
                    str8 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 25:
                    str9 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzp(str, str2, str3, str4, j, j2, str5, z, z3, j6, str6, j3, j4, i, z2, z4, str7, bool, j5, arrayList, str8, str9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzp[i];
    }
}
