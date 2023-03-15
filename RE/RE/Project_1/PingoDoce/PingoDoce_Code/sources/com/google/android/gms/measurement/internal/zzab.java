package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* loaded from: classes.dex */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new C3149c();

    /* renamed from: A */
    public boolean f9163A;

    /* renamed from: B */
    public String f9164B;

    /* renamed from: C */
    public final zzau f9165C;

    /* renamed from: D */
    public long f9166D;

    /* renamed from: E */
    public zzau f9167E;

    /* renamed from: F */
    public final long f9168F;

    /* renamed from: G */
    public final zzau f9169G;

    /* renamed from: w */
    public String f9170w;

    /* renamed from: x */
    public String f9171x;

    /* renamed from: y */
    public zzks f9172y;

    /* renamed from: z */
    public long f9173z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzab zzabVar) {
        C2597i.m33076j(zzabVar);
        this.f9170w = zzabVar.f9170w;
        this.f9171x = zzabVar.f9171x;
        this.f9172y = zzabVar.f9172y;
        this.f9173z = zzabVar.f9173z;
        this.f9163A = zzabVar.f9163A;
        this.f9164B = zzabVar.f9164B;
        this.f9165C = zzabVar.f9165C;
        this.f9166D = zzabVar.f9166D;
        this.f9167E = zzabVar.f9167E;
        this.f9168F = zzabVar.f9168F;
        this.f9169G = zzabVar.f9169G;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 2, this.f9170w, false);
        C0066a.m42003r(parcel, 3, this.f9171x, false);
        C0066a.m42004q(parcel, 4, this.f9172y, i, false);
        C0066a.m42006o(parcel, 5, this.f9173z);
        C0066a.m42018c(parcel, 6, this.f9163A);
        C0066a.m42003r(parcel, 7, this.f9164B, false);
        C0066a.m42004q(parcel, 8, this.f9165C, i, false);
        C0066a.m42006o(parcel, 9, this.f9166D);
        C0066a.m42004q(parcel, 10, this.f9167E, i, false);
        C0066a.m42006o(parcel, 11, this.f9168F);
        C0066a.m42004q(parcel, 12, this.f9169G, i, false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(String str, String str2, zzks zzksVar, long j, boolean z, String str3, zzau zzauVar, long j2, zzau zzauVar2, long j3, zzau zzauVar3) {
        this.f9170w = str;
        this.f9171x = str2;
        this.f9172y = zzksVar;
        this.f9173z = j;
        this.f9163A = z;
        this.f9164B = str3;
        this.f9165C = zzauVar;
        this.f9166D = j2;
        this.f9167E = zzauVar2;
        this.f9168F = j3;
        this.f9169G = zzauVar3;
    }
}
