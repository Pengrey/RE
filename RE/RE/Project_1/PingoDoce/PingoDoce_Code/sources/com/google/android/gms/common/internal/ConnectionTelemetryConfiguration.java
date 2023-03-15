package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p008a7.C0066a;
import p484z6.C13729z;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C13729z();

    /* renamed from: A */
    private final int f7406A;

    /* renamed from: B */
    private final int[] f7407B;

    /* renamed from: w */
    private final RootTelemetryConfiguration f7408w;

    /* renamed from: x */
    private final boolean f7409x;

    /* renamed from: y */
    private final boolean f7410y;

    /* renamed from: z */
    private final int[] f7411z;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f7408w = rootTelemetryConfiguration;
        this.f7409x = z;
        this.f7410y = z2;
        this.f7411z = iArr;
        this.f7406A = i;
        this.f7407B = iArr2;
    }

    /* renamed from: D */
    public boolean m33199D() {
        return this.f7410y;
    }

    /* renamed from: E */
    public final RootTelemetryConfiguration m33198E() {
        return this.f7408w;
    }

    /* renamed from: h */
    public int m33197h() {
        return this.f7406A;
    }

    /* renamed from: t */
    public int[] m33196t() {
        return this.f7411z;
    }

    /* renamed from: v */
    public int[] m33195v() {
        return this.f7407B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42004q(parcel, 1, this.f7408w, i, false);
        C0066a.m42018c(parcel, 2, m33194y());
        C0066a.m42018c(parcel, 3, m33199D());
        C0066a.m42008m(parcel, 4, m33196t(), false);
        C0066a.m42009l(parcel, 5, m33197h());
        C0066a.m42008m(parcel, 6, m33195v(), false);
        C0066a.m42019b(parcel, m42020a);
    }

    /* renamed from: y */
    public boolean m33194y() {
        return this.f7409x;
    }
}
