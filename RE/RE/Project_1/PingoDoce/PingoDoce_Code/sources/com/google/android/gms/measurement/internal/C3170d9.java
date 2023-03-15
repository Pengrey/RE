package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* loaded from: classes.dex */
public final class C3170d9 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m31399a(zzks zzksVar, Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, zzksVar.f9182w);
        C0066a.m42003r(parcel, 2, zzksVar.f9183x, false);
        C0066a.m42006o(parcel, 3, zzksVar.f9184y);
        C0066a.m42005p(parcel, 4, zzksVar.f9185z, false);
        C0066a.m42011j(parcel, 5, null, false);
        C0066a.m42003r(parcel, 6, zzksVar.f9179A, false);
        C0066a.m42003r(parcel, 7, zzksVar.f9180B, false);
        C0066a.m42013h(parcel, 8, zzksVar.f9181C, false);
        C0066a.m42019b(parcel, m42020a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 2:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 3:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 4:
                    l = SafeParcelReader.m33035w(parcel, m33040r);
                    break;
                case 5:
                    f = SafeParcelReader.m33041q(parcel, m33040r);
                    break;
                case 6:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 7:
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 8:
                    d = SafeParcelReader.m33043o(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzks(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzks[i];
    }
}
