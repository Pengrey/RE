package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.x0 */
/* loaded from: classes.dex */
public final class C4334x0 {

    /* renamed from: d */
    private static WeakReference<C4334x0> f11754d;

    /* renamed from: a */
    private final SharedPreferences f11755a;

    /* renamed from: b */
    private C4324t0 f11756b;

    /* renamed from: c */
    private final Executor f11757c;

    private C4334x0(SharedPreferences sharedPreferences, Executor executor) {
        this.f11757c = executor;
        this.f11755a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C4334x0 m27878b(Context context, Executor executor) {
        synchronized (C4334x0.class) {
            WeakReference<C4334x0> weakReference = f11754d;
            C4334x0 c4334x0 = weakReference != null ? weakReference.get() : null;
            if (c4334x0 == null) {
                C4334x0 c4334x02 = new C4334x0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c4334x02.m27876d();
                f11754d = new WeakReference<>(c4334x02);
                return c4334x02;
            }
            return c4334x0;
        }
    }

    /* renamed from: d */
    private synchronized void m27876d() {
        this.f11756b = C4324t0.m27907d(this.f11755a, "topic_operation_queue", ",", this.f11757c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m27879a(C4332w0 c4332w0) {
        return this.f11756b.m27909b(c4332w0.m27881e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized C4332w0 m27877c() {
        return C4332w0.m27885a(this.f11756b.m27905f());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized boolean m27875e(C4332w0 c4332w0) {
        return this.f11756b.m27904g(c4332w0.m27881e());
    }
}
