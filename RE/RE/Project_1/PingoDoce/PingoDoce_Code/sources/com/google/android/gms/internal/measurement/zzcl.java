package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* loaded from: classes.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C2901o1();

    /* renamed from: A */
    public final String f8153A;

    /* renamed from: B */
    public final String f8154B;

    /* renamed from: C */
    public final Bundle f8155C;

    /* renamed from: D */
    public final String f8156D;

    /* renamed from: w */
    public final long f8157w;

    /* renamed from: x */
    public final long f8158x;

    /* renamed from: y */
    public final boolean f8159y;

    /* renamed from: z */
    public final String f8160z;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f8157w = j;
        this.f8158x = j2;
        this.f8159y = z;
        this.f8160z = str;
        this.f8153A = str2;
        this.f8154B = str3;
        this.f8155C = bundle;
        this.f8156D = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42006o(parcel, 1, this.f8157w);
        C0066a.m42006o(parcel, 2, this.f8158x);
        C0066a.m42018c(parcel, 3, this.f8159y);
        C0066a.m42003r(parcel, 4, this.f8160z, false);
        C0066a.m42003r(parcel, 5, this.f8153A, false);
        C0066a.m42003r(parcel, 6, this.f8154B, false);
        C0066a.m42016e(parcel, 7, this.f8155C, false);
        C0066a.m42003r(parcel, 8, this.f8156D, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
