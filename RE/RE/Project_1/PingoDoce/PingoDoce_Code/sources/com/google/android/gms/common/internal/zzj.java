package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C2582b0();

    /* renamed from: w */
    Bundle f7538w;

    /* renamed from: x */
    Feature[] f7539x;

    /* renamed from: y */
    int f7540y;

    /* renamed from: z */
    ConnectionTelemetryConfiguration f7541z;

    public zzj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f7538w = bundle;
        this.f7539x = featureArr;
        this.f7540y = i;
        this.f7541z = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42016e(parcel, 1, this.f7538w, false);
        C0066a.m42000u(parcel, 2, this.f7539x, i, false);
        C0066a.m42009l(parcel, 3, this.f7540y);
        C0066a.m42004q(parcel, 4, this.f7541z, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
