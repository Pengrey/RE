package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p009a8.C0084q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
@TargetApi(14)
/* renamed from: com.google.android.gms.measurement.internal.i6 */
/* loaded from: classes.dex */
public final class C3222i6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w */
    final /* synthetic */ C3233j6 f8535w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3222i6(C3233j6 c3233j6, C0084q c0084q) {
        this.f8535w = c3233j6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C3242k4 c3242k4;
        try {
            try {
                this.f8535w.f8410a.mo31116d().m31328v().m31398a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    c3242k4 = this.f8535w.f8410a;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.f8535w.f8410a.m31124N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f8535w.f8410a.mo31118b().m31239z(new RunnableC3211h6(this, z, data, str, queryParameter));
                        c3242k4 = this.f8535w.f8410a;
                    }
                    c3242k4 = this.f8535w.f8410a;
                }
            } catch (RuntimeException e) {
                this.f8535w.f8410a.mo31116d().m31332r().m31397b("Throwable caught in onActivityCreated", e);
                c3242k4 = this.f8535w.f8410a;
            }
            c3242k4.m31127K().m30888z(activity, bundle);
        } catch (Throwable th2) {
            this.f8535w.f8410a.m31127K().m30888z(activity, bundle);
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8535w.f8410a.m31127K().m30907A(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8535w.f8410a.m31127K().m30906B(activity);
        C3268m8 m31125M = this.f8535w.f8410a.m31125M();
        m31125M.f8410a.mo31118b().m31239z(new RunnableC3180e8(m31125M, m31125M.f8410a.mo31115e().mo25912c()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C3268m8 m31125M = this.f8535w.f8410a.m31125M();
        m31125M.f8410a.mo31118b().m31239z(new RunnableC3169d8(m31125M, m31125M.f8410a.mo31115e().mo25912c()));
        this.f8535w.f8410a.m31127K().m30905C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f8535w.f8410a.m31127K().m30904D(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
