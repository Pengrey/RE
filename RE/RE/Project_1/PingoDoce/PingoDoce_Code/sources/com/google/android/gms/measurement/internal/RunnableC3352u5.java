package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.u5 */
/* loaded from: classes.dex */
public final class RunnableC3352u5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ Bundle f9026w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f9027x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3352u5(C3233j6 c3233j6, Bundle bundle) {
        this.f9027x = c3233j6;
        this.f9026w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3233j6 c3233j6 = this.f9027x;
        Bundle bundle = this.f9026w;
        c3233j6.mo30825h();
        c3233j6.m30845i();
        C2597i.m33076j(bundle);
        String m33080f = C2597i.m33080f(bundle.getString("name"));
        if (!c3233j6.f8410a.m31105o()) {
            c3233j6.f8410a.mo31116d().m31328v().m31398a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c3233j6.f8410a.m31126L().m30860s(new zzab(bundle.getString("app_id"), BuildConfig.VERSION_NAME, new zzks(m33080f, 0L, null, BuildConfig.VERSION_NAME), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c3233j6.f8410a.m31124N().m31266w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.VERSION_NAME, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
