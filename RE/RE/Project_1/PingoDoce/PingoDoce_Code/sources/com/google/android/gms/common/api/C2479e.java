package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.e */
/* loaded from: classes.dex */
public final class C2479e implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                i2 = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j == 2) {
                str = SafeParcelReader.m33054d(parcel, m33040r);
            } else if (m33048j == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m33055c(parcel, m33040r, PendingIntent.CREATOR);
            } else if (m33048j == 4) {
                connectionResult = (ConnectionResult) SafeParcelReader.m33055c(parcel, m33040r, ConnectionResult.CREATOR);
            } else if (m33048j != 1000) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
