package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.credentials.c */
/* loaded from: classes.dex */
public final class C2413c implements Parcelable.Creator<HintRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HintRequest createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j != 1000) {
                switch (m33048j) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m33055c(parcel, m33040r, CredentialPickerConfig.CREATOR);
                        continue;
                    case 2:
                        z = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 3:
                        z2 = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 4:
                        strArr = SafeParcelReader.m33053e(parcel, m33040r);
                        continue;
                    case 5:
                        z3 = SafeParcelReader.m33047k(parcel, m33040r);
                        continue;
                    case 6:
                        str = SafeParcelReader.m33054d(parcel, m33040r);
                        continue;
                    case 7:
                        str2 = SafeParcelReader.m33054d(parcel, m33040r);
                        continue;
                    default:
                        SafeParcelReader.m33033y(parcel, m33040r);
                        continue;
                }
            } else {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ HintRequest[] newArray(int i) {
        return new HintRequest[i];
    }
}
