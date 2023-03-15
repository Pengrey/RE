package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.auth.api.signin.c */
/* loaded from: classes.dex */
public final class C2417c implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 4:
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 5:
                    str4 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.m33055c(parcel, m33040r, Uri.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 8:
                    j = SafeParcelReader.m33036v(parcel, m33040r);
                    break;
                case 9:
                    str6 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 10:
                    arrayList = SafeParcelReader.m33050h(parcel, m33040r, Scope.CREATOR);
                    break;
                case 11:
                    str7 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 12:
                    str8 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
