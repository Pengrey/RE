package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import p008a7.C0066a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C2629u();

    /* renamed from: w */
    private final boolean f7564w;
    @Nullable

    /* renamed from: x */
    private final String f7565x;

    /* renamed from: y */
    private final int f7566y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(boolean z, String str, int i) {
        this.f7564w = z;
        this.f7565x = str;
        this.f7566y = C2628t.m33000a(i) - 1;
    }

    @Nullable
    /* renamed from: h */
    public final String m32986h() {
        return this.f7565x;
    }

    /* renamed from: t */
    public final boolean m32985t() {
        return this.f7564w;
    }

    /* renamed from: v */
    public final int m32984v() {
        return C2628t.m33000a(this.f7566y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42018c(parcel, 1, this.f7564w);
        C0066a.m42003r(parcel, 2, this.f7565x, false);
        C0066a.m42009l(parcel, 3, this.f7566y);
        C0066a.m42019b(parcel, m42020a);
    }
}
