package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.auth.api.signin.e */
/* loaded from: classes.dex */
public final class C2419e implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m33050h(parcel, m33040r, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m33055c(parcel, m33040r, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 5:
                    z2 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 6:
                    z3 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 7:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 8:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m33050h(parcel, m33040r, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
