package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import p009a8.C0072e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* loaded from: classes.dex */
public final class C3318r3 {

    /* renamed from: a */
    final String f8830a;

    /* renamed from: b */
    private final String f8831b;

    /* renamed from: c */
    private final String f8832c;

    /* renamed from: d */
    private final long f8833d;

    /* renamed from: e */
    final /* synthetic */ C3340t3 f8834e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3318r3(C3340t3 c3340t3, String str, long j, C0072e c0072e) {
        this.f8834e = c3340t3;
        C2597i.m33080f("health_monitor");
        C2597i.m33085a(j > 0);
        this.f8830a = "health_monitor:start";
        this.f8831b = "health_monitor:count";
        this.f8832c = "health_monitor:value";
        this.f8833d = j;
    }

    /* renamed from: c */
    private final long m31028c() {
        return this.f8834e.m31006o().getLong(this.f8830a, 0L);
    }

    /* renamed from: d */
    private final void m31027d() {
        this.f8834e.mo30825h();
        long mo25914a = this.f8834e.f8410a.mo31115e().mo25914a();
        SharedPreferences.Editor edit = this.f8834e.m31006o().edit();
        edit.remove(this.f8831b);
        edit.remove(this.f8832c);
        edit.putLong(this.f8830a, mo25914a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair m31030a() {
        long abs;
        this.f8834e.mo30825h();
        this.f8834e.mo30825h();
        long m31028c = m31028c();
        if (m31028c == 0) {
            m31027d();
            abs = 0;
        } else {
            abs = Math.abs(m31028c - this.f8834e.f8410a.mo31115e().mo25914a());
        }
        long j = this.f8833d;
        if (abs < j) {
            return null;
        }
        if (abs > j + j) {
            m31027d();
            return null;
        }
        String string = this.f8834e.m31006o().getString(this.f8832c, null);
        long j2 = this.f8834e.m31006o().getLong(this.f8831b, 0L);
        m31027d();
        if (string != null && j2 > 0) {
            return new Pair(string, Long.valueOf(j2));
        }
        return C3340t3.f8958x;
    }

    /* renamed from: b */
    public final void m31029b(String str, long j) {
        this.f8834e.mo30825h();
        if (m31028c() == 0) {
            m31027d();
        }
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        long j2 = this.f8834e.m31006o().getLong(this.f8831b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f8834e.m31006o().edit();
            edit.putString(this.f8832c, str);
            edit.putLong(this.f8831b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f8834e.f8410a.m31124N().m31273t().nextLong();
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f8834e.m31006o().edit();
        if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f8832c, str);
        }
        edit2.putLong(this.f8831b, j3);
        edit2.apply();
    }
}
