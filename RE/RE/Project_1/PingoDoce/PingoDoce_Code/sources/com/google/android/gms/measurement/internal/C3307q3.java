package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.q3 */
/* loaded from: classes.dex */
public final class C3307q3 {

    /* renamed from: a */
    private final String f8795a;

    /* renamed from: b */
    private final long f8796b;

    /* renamed from: c */
    private boolean f8797c;

    /* renamed from: d */
    private long f8798d;

    /* renamed from: e */
    final /* synthetic */ C3340t3 f8799e;

    public C3307q3(C3340t3 c3340t3, String str, long j) {
        this.f8799e = c3340t3;
        C2597i.m33080f(str);
        this.f8795a = str;
        this.f8796b = j;
    }

    /* renamed from: a */
    public final long m31039a() {
        if (!this.f8797c) {
            this.f8797c = true;
            this.f8798d = this.f8799e.m31006o().getLong(this.f8795a, this.f8796b);
        }
        return this.f8798d;
    }

    /* renamed from: b */
    public final void m31038b(long j) {
        SharedPreferences.Editor edit = this.f8799e.m31006o().edit();
        edit.putLong(this.f8795a, j);
        edit.apply();
        this.f8798d = j;
    }
}
