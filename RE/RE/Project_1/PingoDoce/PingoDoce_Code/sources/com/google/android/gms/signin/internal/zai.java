package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C3411f();

    /* renamed from: w */
    final int f9218w;

    /* renamed from: x */
    final zat f9219x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zai(int i, zat zatVar) {
        this.f9218w = i;
        this.f9219x = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f9218w);
        C0066a.m42004q(parcel, 2, this.f9219x, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
