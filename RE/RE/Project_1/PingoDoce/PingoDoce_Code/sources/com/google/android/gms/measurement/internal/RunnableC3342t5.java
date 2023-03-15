package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* loaded from: classes.dex */
public final class RunnableC3342t5 implements Runnable {

    /* renamed from: w */
    final /* synthetic */ Bundle f9011w;

    /* renamed from: x */
    final /* synthetic */ C3233j6 f9012x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3342t5(C3233j6 c3233j6, Bundle bundle) {
        this.f9012x = c3233j6;
        this.f9011w = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3233j6 c3233j6 = this.f9012x;
        Bundle bundle = this.f9011w;
        c3233j6.mo30825h();
        c3233j6.m30845i();
        C2597i.m33076j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C2597i.m33080f(string);
        C2597i.m33080f(string2);
        C2597i.m33076j(bundle.get("value"));
        if (!c3233j6.f8410a.m31105o()) {
            c3233j6.f8410a.mo31116d().m31328v().m31398a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzks zzksVar = new zzks(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            zzau m31266w0 = c3233j6.f8410a.m31124N().m31266w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c3233j6.f8410a.m31126L().m30860s(new zzab(bundle.getString("app_id"), string2, zzksVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c3233j6.f8410a.m31124N().m31266w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m31266w0, bundle.getLong("time_to_live"), c3233j6.f8410a.m31124N().m31266w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
