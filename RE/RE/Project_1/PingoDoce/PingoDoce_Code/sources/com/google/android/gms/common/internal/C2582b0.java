package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.b0 */
/* loaded from: classes.dex */
public final class C2582b0 implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int m33032z = SafeParcelReader.m33032z(parcel);
        Bundle bundle = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < m33032z) {
            int m33040r = SafeParcelReader.m33040r(parcel);
            int m33048j = SafeParcelReader.m33048j(m33040r);
            if (m33048j == 1) {
                bundle = SafeParcelReader.m33057a(parcel, m33040r);
            } else if (m33048j == 2) {
                featureArr = (Feature[]) SafeParcelReader.m33051g(parcel, m33040r, Feature.CREATOR);
            } else if (m33048j == 3) {
                i = SafeParcelReader.m33038t(parcel, m33040r);
            } else if (m33048j != 4) {
                SafeParcelReader.m33033y(parcel, m33040r);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m33055c(parcel, m33040r, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m33049i(parcel, m33032z);
        return new zzj(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzj[] newArray(int i) {
        return new zzj[i];
    }
}
