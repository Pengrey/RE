package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import p008a7.C0066a;
import p484z6.C13714k;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C13714k();

    /* renamed from: w */
    private final int f7440w;
    @Nullable

    /* renamed from: x */
    private List<MethodInvocation> f7441x;

    public TelemetryData(int i, @Nullable List<MethodInvocation> list) {
        this.f7440w = i;
        this.f7441x = list;
    }

    /* renamed from: h */
    public final int m33187h() {
        return this.f7440w;
    }

    /* renamed from: t */
    public final List<MethodInvocation> m33186t() {
        return this.f7441x;
    }

    /* renamed from: v */
    public final void m33185v(MethodInvocation methodInvocation) {
        if (this.f7441x == null) {
            this.f7441x = new ArrayList();
        }
        this.f7441x.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m42020a = C0066a.m42020a(parcel);
        C0066a.m42009l(parcel, 1, this.f7440w);
        C0066a.m41999v(parcel, 2, this.f7441x, false);
        C0066a.m42019b(parcel, m42020a);
    }
}
