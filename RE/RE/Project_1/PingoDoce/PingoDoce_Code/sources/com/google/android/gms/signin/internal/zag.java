package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p008a7.C0066a;
import p044c8.C2095b;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC13123e {
    public static final Parcelable.Creator<zag> CREATOR = new C2095b();

    /* renamed from: w */
    private final List<String> f9216w;

    /* renamed from: x */
    private final String f9217x;

    public zag(List<String> list, String str) {
        this.f9216w = list;
        this.f9217x = str;
    }

    @Override // p462y6.InterfaceC13123e
    public final Status getStatus() {
        return this.f9217x != null ? Status.f7155B : Status.f7159F;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42001t(parcel, 1, this.f9216w, false);
        C0066a.m42003r(parcel, 2, this.f9217x, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
