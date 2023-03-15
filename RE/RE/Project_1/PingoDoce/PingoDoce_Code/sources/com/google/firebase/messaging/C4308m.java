package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3425g;
import com.google.android.gms.tasks.InterfaceC3415b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import p078e7.C5009j;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.m */
/* loaded from: classes.dex */
public class C4308m {

    /* renamed from: c */
    private static final Object f11707c = new Object();
    @GuardedBy("lock")

    /* renamed from: d */
    private static ServiceConnectionC4298h1 f11708d;

    /* renamed from: a */
    private final Context f11709a;

    /* renamed from: b */
    private final Executor f11710b = ExecutorC4306l.f11706w;

    public C4308m(Context context) {
        this.f11709a = context;
    }

    /* renamed from: a */
    private static AbstractC3419d<Integer> m27938a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m27937b(context, "com.google.firebase.MESSAGING_EVENT").m27976c(intent).mo30788h(ExecutorC4306l.f11706w, C4300i.f11697a);
    }

    /* renamed from: b */
    private static ServiceConnectionC4298h1 m27937b(Context context, String str) {
        ServiceConnectionC4298h1 serviceConnectionC4298h1;
        synchronized (f11707c) {
            if (f11708d == null) {
                f11708d = new ServiceConnectionC4298h1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            serviceConnectionC4298h1 = f11708d;
        }
        return serviceConnectionC4298h1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ Integer m27936c(AbstractC3419d abstractC3419d) throws Exception {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ Integer m27934e(AbstractC3419d abstractC3419d) throws Exception {
        return 403;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ AbstractC3419d m27933f(Context context, Intent intent, AbstractC3419d abstractC3419d) throws Exception {
        return (C5009j.m25895h() && ((Integer) abstractC3419d.mo30784l()).intValue() == 402) ? m27938a(context, intent).mo30788h(ExecutorC4306l.f11706w, C4302j.f11699a) : abstractC3419d;
    }

    /* renamed from: g */
    public AbstractC3419d<Integer> m27932g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m27931h(this.f11709a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: h */
    public AbstractC3419d<Integer> m27931h(final Context context, final Intent intent) {
        boolean z = false;
        if (C5009j.m25895h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return m27938a(context, intent);
        }
        return C3425g.m30767c(this.f11710b, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(C4320r0.m27916b().m27911g(context, intent));
                return valueOf;
            }
        }).mo30786j(this.f11710b, new InterfaceC3415b() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d) {
                return C4308m.m27933f(context, intent, abstractC3419d);
            }
        });
    }
}
