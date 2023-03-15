package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC2590f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13701c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C2605n();

    /* renamed from: A */
    private final boolean f7533A;

    /* renamed from: w */
    final int f7534w;

    /* renamed from: x */
    final IBinder f7535x;

    /* renamed from: y */
    private final ConnectionResult f7536y;

    /* renamed from: z */
    private final boolean f7537z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f7534w = i;
        this.f7535x = iBinder;
        this.f7536y = connectionResult;
        this.f7537z = z;
        this.f7533A = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zav) {
            zav zavVar = (zav) obj;
            return this.f7536y.equals(zavVar.f7536y) && C13701c.m575a(m33013t(), zavVar.m33013t());
        }
        return false;
    }

    /* renamed from: h */
    public final ConnectionResult m33014h() {
        return this.f7536y;
    }

    /* renamed from: t */
    public final InterfaceC2590f m33013t() {
        IBinder iBinder = this.f7535x;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC2590f.AbstractBinderC2591a.m33097y(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7534w);
        C0066a.m42010k(parcel, 2, this.f7535x, false);
        C0066a.m42004q(parcel, 3, this.f7536y, i, false);
        C0066a.m42018c(parcel, 4, this.f7537z);
        C0066a.m42018c(parcel, 5, this.f7533A);
        C0066a.m42019b(parcel, m42020a);
    }
}
