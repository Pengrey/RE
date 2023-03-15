package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC13123e {
    public static final Parcelable.Creator<zaa> CREATOR = new C3407b();

    /* renamed from: w */
    final int f9213w;

    /* renamed from: x */
    private int f9214x;

    /* renamed from: y */
    private Intent f9215y;

    public zaa() {
        this(2, 0, null);
    }

    @Override // p462y6.InterfaceC13123e
    public final Status getStatus() {
        return this.f9214x == 0 ? Status.f7155B : Status.f7159F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f9213w);
        C0066a.m42009l(parcel, 2, this.f9214x);
        C0066a.m42004q(parcel, 3, this.f9215y, i, false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zaa(int i, int i2, Intent intent) {
        this.f9213w = i;
        this.f9214x = i2;
        this.f9215y = intent;
    }
}
