package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C3412g();

    /* renamed from: w */
    final int f9220w;

    /* renamed from: x */
    private final ConnectionResult f9221x;

    /* renamed from: y */
    private final zav f9222y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.f9220w = i;
        this.f9221x = connectionResult;
        this.f9222y = zavVar;
    }

    /* renamed from: h */
    public final ConnectionResult m30809h() {
        return this.f9221x;
    }

    /* renamed from: t */
    public final zav m30808t() {
        return this.f9222y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f9220w);
        C0066a.m42004q(parcel, 2, this.f9221x, i, false);
        C0066a.m42004q(parcel, 3, this.f9222y, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
