package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;
import p099f7.ThreadFactoryC5416b;
import p267o7.C8031e;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.q */
/* loaded from: classes.dex */
public final class C2457q {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: e */
    private static C2457q f7128e;

    /* renamed from: a */
    private final Context f7129a;

    /* renamed from: b */
    private final ScheduledExecutorService f7130b;
    @GuardedBy("this")

    /* renamed from: c */
    private ServiceConnectionC2452l f7131c = new ServiceConnectionC2452l(this, null);
    @GuardedBy("this")

    /* renamed from: d */
    private int f7132d = 1;

    C2457q(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f7130b = scheduledExecutorService;
        this.f7129a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m33535a(C2457q c2457q) {
        return c2457q.f7129a;
    }

    /* renamed from: b */
    public static synchronized C2457q m33534b(Context context) {
        C2457q c2457q;
        synchronized (C2457q.class) {
            if (f7128e == null) {
                C8031e.m17126a();
                f7128e = new C2457q(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC5416b("MessengerIpcClient"))));
            }
            c2457q = f7128e;
        }
        return c2457q;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m33531e(C2457q c2457q) {
        return c2457q.f7130b;
    }

    /* renamed from: f */
    private final synchronized int m33530f() {
        int i;
        i = this.f7132d;
        this.f7132d = i + 1;
        return i;
    }

    /* renamed from: g */
    private final synchronized <T> AbstractC3419d<T> m33529g(AbstractC2455o<T> abstractC2455o) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC2455o);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f7131c.m33541g(abstractC2455o)) {
            ServiceConnectionC2452l serviceConnectionC2452l = new ServiceConnectionC2452l(this, null);
            this.f7131c = serviceConnectionC2452l;
            serviceConnectionC2452l.m33541g(abstractC2455o);
        }
        return abstractC2455o.f7125b.m30802a();
    }

    /* renamed from: c */
    public final AbstractC3419d<Void> m33533c(int i, Bundle bundle) {
        return m33529g(new C2454n(m33530f(), 2, bundle));
    }

    /* renamed from: d */
    public final AbstractC3419d<Bundle> m33532d(int i, Bundle bundle) {
        return m33529g(new C2456p(m33530f(), 1, bundle));
    }
}
