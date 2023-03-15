package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p331r7.C9819a;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes.dex */
public final class zzaa extends AbstractSafeParcelable implements InterfaceC13123e {
    public static final Parcelable.Creator<zzaa> CREATOR;

    /* renamed from: w */
    private final Status f7605w;

    static {
        new zzaa(Status.f7155B);
        CREATOR = new C9819a();
    }

    public zzaa(Status status) {
        this.f7605w = status;
    }

    @Override // p462y6.InterfaceC13123e
    public final Status getStatus() {
        return this.f7605w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 1, this.f7605w, i, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
