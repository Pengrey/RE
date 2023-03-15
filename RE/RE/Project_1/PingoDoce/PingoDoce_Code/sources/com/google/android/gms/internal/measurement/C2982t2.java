package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t2 */
/* loaded from: classes.dex */
public final class C2982t2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: w */
    final /* synthetic */ C2997u2 f8002w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2982t2(C2997u2 c2997u2) {
        this.f8002w = c2997u2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f8002w.m32029l(new C2854l2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f8002w.m32029l(new C2966s2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f8002w.m32029l(new C2902o2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f8002w.m32029l(new C2886n2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        BinderC2693b1 binderC2693b1 = new BinderC2693b1();
        this.f8002w.m32029l(new C2950r2(this, activity, binderC2693b1));
        Bundle m32892y = binderC2693b1.m32892y(50L);
        if (m32892y != null) {
            bundle.putAll(m32892y);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f8002w.m32029l(new C2870m2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f8002w.m32029l(new C2934q2(this, activity));
    }
}
