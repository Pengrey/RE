package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.credentials.b */
/* loaded from: classes.dex */
public final class C2412b implements Parcelable.Creator<CredentialPickerConfig> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CredentialPickerConfig createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                z = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 2) {
                z2 = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 3) {
                z3 = SafeParcelReader.m33047k(parcel, m33040r);
            } else if (m33048j == 4) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 1000) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new CredentialPickerConfig(i, z, z2, z3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CredentialPickerConfig[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
