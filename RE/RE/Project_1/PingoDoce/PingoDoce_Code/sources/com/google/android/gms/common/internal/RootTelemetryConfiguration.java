package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13728y;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C13728y();

    /* renamed from: A */
    private final int f7435A;

    /* renamed from: w */
    private final int f7436w;

    /* renamed from: x */
    private final boolean f7437x;

    /* renamed from: y */
    private final boolean f7438y;

    /* renamed from: z */
    private final int f7439z;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f7436w = i;
        this.f7437x = z;
        this.f7438y = z2;
        this.f7439z = i2;
        this.f7435A = i3;
    }

    /* renamed from: D */
    public int m33192D() {
        return this.f7436w;
    }

    /* renamed from: h */
    public int m33191h() {
        return this.f7439z;
    }

    /* renamed from: t */
    public int m33190t() {
        return this.f7435A;
    }

    /* renamed from: v */
    public boolean m33189v() {
        return this.f7437x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, m33192D());
        C0066a.m42018c(parcel, 2, m33189v());
        C0066a.m42018c(parcel, 3, m33188y());
        C0066a.m42009l(parcel, 4, m33191h());
        C0066a.m42009l(parcel, 5, m33190t());
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public boolean m33188y() {
        return this.f7438y;
    }
}
