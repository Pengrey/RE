package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.h */
/* loaded from: classes.dex */
public final class C2422h implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = BuildConfig.VERSION_NAME;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = BuildConfig.VERSION_NAME;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 4) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m33055c(parcel, m33040r, GoogleSignInAccount.CREATOR);
            } else if (m33048j != 8) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                str2 = SafeParcelReader.m33054d(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
