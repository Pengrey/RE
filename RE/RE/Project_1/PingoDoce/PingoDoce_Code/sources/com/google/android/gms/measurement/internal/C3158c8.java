package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2597i;
import p009a8.InterfaceC0087t;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c8 */
/* loaded from: classes.dex */
public final class C3158c8 {

    /* renamed from: a */
    private final Context f8373a;

    public C3158c8(Context context) {
        C2597i.m33076j(context);
        this.f8373a = context;
    }

    /* renamed from: k */
    private final C3197g3 m31439k() {
        return C3242k4.m31130H(this.f8373a, null, null).mo31116d();
    }

    /* renamed from: a */
    public final int m31449a(final Intent intent, int i, final int i2) {
        C3242k4 m31130H = C3242k4.m31130H(this.f8373a, null, null);
        final C3197g3 mo31116d = m31130H.mo31116d();
        if (intent == null) {
            mo31116d.m31327w().m31398a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m31130H.mo31114f();
        mo31116d.m31328v().m31396c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m31442h(new Runnable() { // from class: com.google.android.gms.measurement.internal.z7
                @Override // java.lang.Runnable
                public final void run() {
                    C3158c8.this.m31447c(i2, mo31116d, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m31448b(Intent intent) {
        if (intent == null) {
            m31439k().m31332r().m31398a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC3166d5(C3137a9.m31485e0(this.f8373a), null);
        }
        m31439k().m31327w().m31397b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m31447c(int i, C3197g3 c3197g3, Intent intent) {
        if (((InterfaceC0087t) this.f8373a).mo31530b(i)) {
            c3197g3.m31328v().m31397b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m31439k().m31328v().m31398a("Completed wakeful intent.");
            ((InterfaceC0087t) this.f8373a).mo31531a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m31446d(C3197g3 c3197g3, JobParameters jobParameters) {
        c3197g3.m31328v().m31398a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC0087t) this.f8373a).mo31529c(jobParameters, false);
    }

    /* renamed from: e */
    public final void m31445e() {
        C3242k4 m31130H = C3242k4.m31130H(this.f8373a, null, null);
        C3197g3 mo31116d = m31130H.mo31116d();
        m31130H.mo31114f();
        mo31116d.m31328v().m31398a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m31444f() {
        C3242k4 m31130H = C3242k4.m31130H(this.f8373a, null, null);
        C3197g3 mo31116d = m31130H.mo31116d();
        m31130H.mo31114f();
        mo31116d.m31328v().m31398a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m31443g(Intent intent) {
        if (intent == null) {
            m31439k().m31332r().m31398a("onRebind called with null intent");
            return;
        }
        m31439k().m31328v().m31397b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void m31442h(Runnable runnable) {
        C3137a9 m31485e0 = C3137a9.m31485e0(this.f8373a);
        m31485e0.mo31118b().m31239z(new RunnableC3147b8(this, m31485e0, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean m31441i(final JobParameters jobParameters) {
        C3242k4 m31130H = C3242k4.m31130H(this.f8373a, null, null);
        final C3197g3 mo31116d = m31130H.mo31116d();
        String string = jobParameters.getExtras().getString("action");
        m31130H.mo31114f();
        mo31116d.m31328v().m31397b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m31442h(new Runnable() { // from class: com.google.android.gms.measurement.internal.a8
                @Override // java.lang.Runnable
                public final void run() {
                    C3158c8.this.m31446d(mo31116d, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m31440j(Intent intent) {
        if (intent == null) {
            m31439k().m31332r().m31398a("onUnbind called with null intent");
            return true;
        }
        m31439k().m31328v().m31397b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
