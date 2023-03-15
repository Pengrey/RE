package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p008a7.C0066a;
import p070e.C4906j;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzba extends AbstractSafeParcelable {

    /* renamed from: A */
    final boolean f7607A;

    /* renamed from: B */
    final boolean f7608B;

    /* renamed from: C */
    final String f7609C;

    /* renamed from: D */
    final boolean f7610D;

    /* renamed from: E */
    boolean f7611E;

    /* renamed from: F */
    String f7612F;

    /* renamed from: G */
    long f7613G;

    /* renamed from: w */
    final LocationRequest f7614w;

    /* renamed from: x */
    final List<ClientIdentity> f7615x;

    /* renamed from: y */
    final String f7616y;

    /* renamed from: z */
    final boolean f7617z;

    /* renamed from: H */
    static final List<ClientIdentity> f7606H = Collections.emptyList();
    public static final Parcelable.Creator<zzba> CREATOR = new C2669p();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.f7614w = locationRequest;
        this.f7615x = list;
        this.f7616y = str;
        this.f7617z = z;
        this.f7607A = z2;
        this.f7608B = z3;
        this.f7609C = str2;
        this.f7610D = z4;
        this.f7611E = z5;
        this.f7612F = str3;
        this.f7613G = j;
    }

    /* renamed from: h */
    public static zzba m32936h(String str, LocationRequest locationRequest) {
        return new zzba(locationRequest, f7606H, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (C13701c.m575a(this.f7614w, zzbaVar.f7614w) && C13701c.m575a(this.f7615x, zzbaVar.f7615x) && C13701c.m575a(this.f7616y, zzbaVar.f7616y) && this.f7617z == zzbaVar.f7617z && this.f7607A == zzbaVar.f7607A && this.f7608B == zzbaVar.f7608B && C13701c.m575a(this.f7609C, zzbaVar.f7609C) && this.f7610D == zzbaVar.f7610D && this.f7611E == zzbaVar.f7611E && C13701c.m575a(this.f7612F, zzbaVar.f7612F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7614w.hashCode();
    }

    /* renamed from: t */
    public final zzba m32935t(long j) {
        if (this.f7614w.m31626v() <= this.f7614w.m31627t()) {
            this.f7613G = 10000L;
            return this;
        }
        long m31627t = this.f7614w.m31627t();
        long m31626v = this.f7614w.m31626v();
        StringBuilder sb2 = new StringBuilder((int) C4906j.f13390C0);
        sb2.append("could not set max age when location batching is requested, interval=");
        sb2.append(m31627t);
        sb2.append("maxWaitTime=");
        sb2.append(m31626v);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7614w);
        if (this.f7616y != null) {
            sb2.append(" tag=");
            sb2.append(this.f7616y);
        }
        if (this.f7609C != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f7609C);
        }
        if (this.f7612F != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f7612F);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f7617z);
        sb2.append(" clients=");
        sb2.append(this.f7615x);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f7607A);
        if (this.f7608B) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f7610D) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f7611E) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    /* renamed from: v */
    public final zzba m32934v(String str) {
        this.f7612F = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 1, this.f7614w, i, false);
        C0066a.m41999v(parcel, 5, this.f7615x, false);
        C0066a.m42003r(parcel, 6, this.f7616y, false);
        C0066a.m42018c(parcel, 7, this.f7617z);
        C0066a.m42018c(parcel, 8, this.f7607A);
        C0066a.m42018c(parcel, 9, this.f7608B);
        C0066a.m42003r(parcel, 10, this.f7609C, false);
        C0066a.m42018c(parcel, 11, this.f7610D);
        C0066a.m42018c(parcel, 12, this.f7611E);
        C0066a.m42003r(parcel, 13, this.f7612F, false);
        C0066a.m42006o(parcel, 14, this.f7613G);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public final zzba m32933y(boolean z) {
        this.f7611E = true;
        return this;
    }
}
