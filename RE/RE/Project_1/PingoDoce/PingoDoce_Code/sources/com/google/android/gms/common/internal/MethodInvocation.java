package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13722s;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C13722s();

    /* renamed from: A */
    private final long f7426A;

    /* renamed from: B */
    private final String f7427B;

    /* renamed from: C */
    private final String f7428C;

    /* renamed from: D */
    private final int f7429D;

    /* renamed from: E */
    private final int f7430E;

    /* renamed from: w */
    private final int f7431w;

    /* renamed from: x */
    private final int f7432x;

    /* renamed from: y */
    private final int f7433y;

    /* renamed from: z */
    private final long f7434z;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f7431w = i;
        this.f7432x = i2;
        this.f7433y = i3;
        this.f7434z = j;
        this.f7426A = j2;
        this.f7427B = str;
        this.f7428C = str2;
        this.f7429D = i4;
        this.f7430E = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7431w);
        C0066a.m42009l(parcel, 2, this.f7432x);
        C0066a.m42009l(parcel, 3, this.f7433y);
        C0066a.m42006o(parcel, 4, this.f7434z);
        C0066a.m42006o(parcel, 5, this.f7426A);
        C0066a.m42003r(parcel, 6, this.f7427B, false);
        C0066a.m42003r(parcel, 7, this.f7428C, false);
        C0066a.m42009l(parcel, 8, this.f7429D);
        C0066a.m42009l(parcel, 9, this.f7430E);
        C0066a.m42019b(parcel, m42020a);
    }
}
