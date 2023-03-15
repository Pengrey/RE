package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.c0 */
/* loaded from: classes.dex */
public final class C2585c0 implements Parcelable.Creator<GetServiceRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m33119a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, getServiceRequest.f7422w);
        C0066a.m42009l(parcel, 2, getServiceRequest.f7423x);
        C0066a.m42009l(parcel, 3, getServiceRequest.f7424y);
        C0066a.m42003r(parcel, 4, getServiceRequest.f7425z, false);
        C0066a.m42010k(parcel, 5, getServiceRequest.f7412A, false);
        C0066a.m42000u(parcel, 6, getServiceRequest.f7413B, i, false);
        C0066a.m42016e(parcel, 7, getServiceRequest.f7414C, false);
        C0066a.m42004q(parcel, 8, getServiceRequest.f7415D, i, false);
        C0066a.m42000u(parcel, 10, getServiceRequest.f7416E, i, false);
        C0066a.m42000u(parcel, 11, getServiceRequest.f7417F, i, false);
        C0066a.m42018c(parcel, 12, getServiceRequest.f7418G);
        C0066a.m42009l(parcel, 13, getServiceRequest.f7419H);
        C0066a.m42018c(parcel, 14, getServiceRequest.f7420I);
        C0066a.m42003r(parcel, 15, getServiceRequest.m33193h(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GetServiceRequest createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            switch (SafeParcelReader.m33048j(m33040r)) {
                case 1:
                    i = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 2:
                    i2 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 3:
                    i3 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 4:
                    str = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m33039s(parcel, m33040r);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m33051g(parcel, m33040r, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m33057a(parcel, m33040r);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m33055c(parcel, m33040r, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.m33033y(parcel, m33040r);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m33051g(parcel, m33040r, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m33051g(parcel, m33040r, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 13:
                    i4 = SafeParcelReader.m33038t(parcel, m33040r);
                    break;
                case 14:
                    z2 = SafeParcelReader.m33047k(parcel, m33040r);
                    break;
                case 15:
                    str2 = SafeParcelReader.m33054d(parcel, m33040r);
                    break;
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
