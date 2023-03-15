package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.m */
/* loaded from: classes.dex */
public final class C2604m implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zat createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                account = (Account) SafeParcelReader.m33055c(parcel, m33040r, Account.CREATOR);
            } else if (m33048j == 3) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 4) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m33055c(parcel, m33040r, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zat(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i) {
        return new zat[i];
    }
}
