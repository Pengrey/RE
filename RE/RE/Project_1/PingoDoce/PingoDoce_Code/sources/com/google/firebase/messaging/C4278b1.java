package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p059d8.C4748a;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.b1 */
/* loaded from: classes.dex */
final class C4278b1 {

    /* renamed from: a */
    private static final long f11648a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final Object f11649b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")

    /* renamed from: c */
    private static C4748a f11650c;

    @GuardedBy("WakeLockHolder.syncObject")
    /* renamed from: a */
    private static void m28052a(Context context) {
        if (f11650c == null) {
            C4748a c4748a = new C4748a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f11650c = c4748a;
            c4748a.m26701d(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m28051b(Intent intent) {
        synchronized (f11649b) {
            if (f11650c != null && m28050c(intent)) {
                m28049d(intent, false);
                f11650c.m26702c();
            }
        }
    }

    /* renamed from: c */
    static boolean m28050c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: d */
    private static void m28049d(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static ComponentName m28048e(Context context, Intent intent) {
        synchronized (f11649b) {
            m28052a(context);
            boolean m28050c = m28050c(intent);
            m28049d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!m28050c) {
                f11650c.m26704a(f11648a);
            }
            return startService;
        }
    }
}
