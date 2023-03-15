package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.credentials.a */
/* loaded from: classes.dex */
public final class C2411a implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Credential createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 2:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.m33055c(parcel, m33040r, Uri.CREATOR);
                    break;
                case 4:
                    arrayList = SafeParcelReader.m33050h(parcel, m33040r, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 6:
                    str4 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 7:
                case 8:
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
                case 9:
                    str5 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 10:
                    str6 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new Credential(str, str2, uri, arrayList, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Credential[] newArray(int i) {
        return new Credential[i];
    }
}
