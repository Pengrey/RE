package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C3258l9();

    /* renamed from: A */
    public final long f9186A;

    /* renamed from: B */
    public final long f9187B;

    /* renamed from: C */
    public final String f9188C;

    /* renamed from: D */
    public final boolean f9189D;

    /* renamed from: E */
    public final boolean f9190E;

    /* renamed from: F */
    public final long f9191F;

    /* renamed from: G */
    public final String f9192G;

    /* renamed from: H */
    public final long f9193H;

    /* renamed from: I */
    public final long f9194I;

    /* renamed from: J */
    public final int f9195J;

    /* renamed from: K */
    public final boolean f9196K;

    /* renamed from: L */
    public final boolean f9197L;

    /* renamed from: M */
    public final String f9198M;

    /* renamed from: N */
    public final Boolean f9199N;

    /* renamed from: O */
    public final long f9200O;

    /* renamed from: P */
    public final List f9201P;

    /* renamed from: Q */
    public final String f9202Q;

    /* renamed from: R */
    public final String f9203R;

    /* renamed from: w */
    public final String f9204w;

    /* renamed from: x */
    public final String f9205x;

    /* renamed from: y */
    public final String f9206y;

    /* renamed from: z */
    public final String f9207z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9) {
        C2597i.m33080f(str);
        this.f9204w = str;
        this.f9205x = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f9206y = str3;
        this.f9191F = j;
        this.f9207z = str4;
        this.f9186A = j2;
        this.f9187B = j3;
        this.f9188C = str5;
        this.f9189D = z;
        this.f9190E = z2;
        this.f9192G = str6;
        this.f9193H = j4;
        this.f9194I = j5;
        this.f9195J = i;
        this.f9196K = z3;
        this.f9197L = z4;
        this.f9198M = str7;
        this.f9199N = bool;
        this.f9200O = j6;
        this.f9201P = list;
        this.f9202Q = null;
        this.f9203R = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42003r(parcel, 2, this.f9204w, false);
        C0066a.m42003r(parcel, 3, this.f9205x, false);
        C0066a.m42003r(parcel, 4, this.f9206y, false);
        C0066a.m42003r(parcel, 5, this.f9207z, false);
        C0066a.m42006o(parcel, 6, this.f9186A);
        C0066a.m42006o(parcel, 7, this.f9187B);
        C0066a.m42003r(parcel, 8, this.f9188C, false);
        C0066a.m42018c(parcel, 9, this.f9189D);
        C0066a.m42018c(parcel, 10, this.f9190E);
        C0066a.m42006o(parcel, 11, this.f9191F);
        C0066a.m42003r(parcel, 12, this.f9192G, false);
        C0066a.m42006o(parcel, 13, this.f9193H);
        C0066a.m42006o(parcel, 14, this.f9194I);
        C0066a.m42009l(parcel, 15, this.f9195J);
        C0066a.m42018c(parcel, 16, this.f9196K);
        C0066a.m42018c(parcel, 18, this.f9197L);
        C0066a.m42003r(parcel, 19, this.f9198M, false);
        C0066a.m42017d(parcel, 21, this.f9199N, false);
        C0066a.m42006o(parcel, 22, this.f9200O);
        C0066a.m42001t(parcel, 23, this.f9201P, false);
        C0066a.m42003r(parcel, 24, this.f9202Q, false);
        C0066a.m42003r(parcel, 25, this.f9203R, false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9) {
        this.f9204w = str;
        this.f9205x = str2;
        this.f9206y = str3;
        this.f9191F = j3;
        this.f9207z = str4;
        this.f9186A = j;
        this.f9187B = j2;
        this.f9188C = str5;
        this.f9189D = z;
        this.f9190E = z2;
        this.f9192G = str6;
        this.f9193H = j4;
        this.f9194I = j5;
        this.f9195J = i;
        this.f9196K = z3;
        this.f9197L = z4;
        this.f9198M = str7;
        this.f9199N = bool;
        this.f9200O = j6;
        this.f9201P = list;
        this.f9202Q = str8;
        this.f9203R = str9;
    }
}
