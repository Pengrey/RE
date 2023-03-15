package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.o3 */
/* loaded from: classes.dex */
public final class C3285o3 {

    /* renamed from: a */
    private final String f8729a;

    /* renamed from: b */
    private final boolean f8730b;

    /* renamed from: c */
    private boolean f8731c;

    /* renamed from: d */
    private boolean f8732d;

    /* renamed from: e */
    final /* synthetic */ C3340t3 f8733e;

    public C3285o3(C3340t3 c3340t3, String str, boolean z) {
        this.f8733e = c3340t3;
        C2597i.m33080f(str);
        this.f8729a = str;
        this.f8730b = z;
    }

    /* renamed from: a */
    public final void m31057a(boolean z) {
        SharedPreferences.Editor edit = this.f8733e.m31006o().edit();
        edit.putBoolean(this.f8729a, z);
        edit.apply();
        this.f8732d = z;
    }

    /* renamed from: b */
    public final boolean m31056b() {
        if (!this.f8731c) {
            this.f8731c = true;
            this.f8732d = this.f8733e.m31006o().getBoolean(this.f8729a, this.f8730b);
        }
        return this.f8732d;
    }
}
