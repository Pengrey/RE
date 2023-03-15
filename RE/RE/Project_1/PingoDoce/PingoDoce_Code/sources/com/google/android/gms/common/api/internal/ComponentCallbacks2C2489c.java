package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import p078e7.C5009j;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C2489c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: A */
    private static final ComponentCallbacks2C2489c f7213A = new ComponentCallbacks2C2489c();

    /* renamed from: w */
    private final AtomicBoolean f7214w = new AtomicBoolean();

    /* renamed from: x */
    private final AtomicBoolean f7215x = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: y */
    private final ArrayList<InterfaceC2490a> f7216y = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: z */
    private boolean f7217z = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2490a {
        /* renamed from: a */
        void mo28426a(boolean z);
    }

    private ComponentCallbacks2C2489c() {
    }

    /* renamed from: b */
    public static ComponentCallbacks2C2489c m33451b() {
        return f7213A;
    }

    /* renamed from: c */
    public static void m33450c(Application application) {
        ComponentCallbacks2C2489c componentCallbacks2C2489c = f7213A;
        synchronized (componentCallbacks2C2489c) {
            if (!componentCallbacks2C2489c.f7217z) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C2489c);
                application.registerComponentCallbacks(componentCallbacks2C2489c);
                componentCallbacks2C2489c.f7217z = true;
            }
        }
    }

    /* renamed from: f */
    private final void m33447f(boolean z) {
        synchronized (f7213A) {
            Iterator<InterfaceC2490a> it = this.f7216y.iterator();
            while (it.hasNext()) {
                it.next().mo28426a(z);
            }
        }
    }

    /* renamed from: a */
    public void m33452a(InterfaceC2490a interfaceC2490a) {
        synchronized (f7213A) {
            this.f7216y.add(interfaceC2490a);
        }
    }

    /* renamed from: d */
    public boolean m33449d() {
        return this.f7214w.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m33448e(boolean z) {
        if (!this.f7215x.get()) {
            if (!C5009j.m25901b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f7215x.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f7214w.set(true);
            }
        }
        return m33449d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7214w.compareAndSet(true, false);
        this.f7215x.set(true);
        if (compareAndSet) {
            m33447f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7214w.compareAndSet(true, false);
        this.f7215x.set(true);
        if (compareAndSet) {
            m33447f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f7214w.compareAndSet(false, true)) {
            this.f7215x.set(true);
            m33447f(true);
        }
    }
}
