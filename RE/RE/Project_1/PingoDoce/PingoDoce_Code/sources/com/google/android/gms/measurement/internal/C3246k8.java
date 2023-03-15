package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2864lc;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.k8 */
/* loaded from: classes.dex */
public final class C3246k8 {

    /* renamed from: a */
    final /* synthetic */ C3268m8 f8639a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3246k8(C3268m8 c3268m8) {
        this.f8639a = c3268m8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31093a() {
        this.f8639a.mo30825h();
        if (this.f8639a.f8410a.m31132F().m30999v(this.f8639a.f8410a.mo31115e().mo25914a())) {
            this.f8639a.f8410a.m31132F().f8968l.m31057a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f8639a.f8410a.mo31116d().m31328v().m31398a("Detected application was in foreground");
                m31091c(this.f8639a.f8410a.mo31115e().mo25914a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31092b(long j, boolean z) {
        this.f8639a.mo30825h();
        this.f8639a.m31078s();
        if (this.f8639a.f8410a.m31132F().m30999v(j)) {
            this.f8639a.f8410a.m31132F().f8968l.m31057a(true);
        }
        this.f8639a.f8410a.m31132F().f8971o.m31038b(j);
        if (this.f8639a.f8410a.m31132F().f8968l.m31056b()) {
            m31091c(j, z);
        }
    }

    /* renamed from: c */
    final void m31091c(long j, boolean z) {
        this.f8639a.mo30825h();
        if (this.f8639a.f8410a.m31105o()) {
            this.f8639a.f8410a.m31132F().f8971o.m31038b(j);
            this.f8639a.f8410a.mo31116d().m31328v().m31397b("Session started, time", Long.valueOf(this.f8639a.f8410a.mo31115e().mo25912c()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f8639a.f8410a.m31129I().m31177N("auto", "_sid", valueOf, j);
            this.f8639a.f8410a.m31132F().f8968l.m31057a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f8639a.f8410a.m31094z().m31373B(null, C3339t2.f8912b0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.f8639a.f8410a.m31129I().m31149v("auto", "_s", j, bundle);
            C2864lc.m32472b();
            if (this.f8639a.f8410a.m31094z().m31373B(null, C3339t2.f8918e0)) {
                String m31016a = this.f8639a.f8410a.m31132F().f8976t.m31016a();
                if (TextUtils.isEmpty(m31016a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", m31016a);
                this.f8639a.f8410a.m31129I().m31149v("auto", "_ssr", j, bundle2);
            }
        }
    }
}
