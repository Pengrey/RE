package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
class C1477r {

    /* renamed from: a */
    private static AtomicBoolean f4360a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.java */
    /* renamed from: androidx.lifecycle.r$a */
    /* loaded from: classes.dex */
    static class C1478a extends C1453k {
        C1478a() {
        }

        @Override // androidx.lifecycle.C1453k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            FragmentC1454k0.m37013g(activity);
        }

        @Override // androidx.lifecycle.C1453k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C1453k, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m36982a(Context context) {
        if (f4360a.getAndSet(true)) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1478a());
    }
}
