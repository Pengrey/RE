package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.s */
/* loaded from: classes.dex */
public final class C3325s implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m31019a(zzau zzauVar, Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 2, zzauVar.f9175w, false);
        C0066a.m42004q(parcel, 3, zzauVar.f9176x, i, false);
        C0066a.m42003r(parcel, 4, zzauVar.f9177y, false);
        C0066a.m42006o(parcel, 5, zzauVar.f9178z);
        C0066a.m42019b(parcel, m42020a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        zzas zzasVar = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 2) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j == 3) {
                zzasVar = (zzas) SafeParcelReader.m33055c(parcel, m33040r, zzas.CREATOR);
            } else if (m33048j == 4) {
                str2 = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j != 5) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                j = SafeParcelReader.m33036v(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzau(str, zzasVar, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
