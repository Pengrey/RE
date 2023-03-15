package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.firebase.messaging.ServiceConnectionC4298h1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p058d7.C4747a;
import p079e8.InterfaceC5016c;
import p099f7.ThreadFactoryC5416b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.h1 */
/* loaded from: classes.dex */
public class ServiceConnectionC4298h1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f11689a;

    /* renamed from: b */
    private final Intent f11690b;

    /* renamed from: c */
    private final ScheduledExecutorService f11691c;

    /* renamed from: d */
    private final Queue<C4299a> f11692d;

    /* renamed from: e */
    private BinderC4287e1 f11693e;

    /* renamed from: f */
    private boolean f11694f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.h1$a */
    /* loaded from: classes.dex */
    public static class C4299a {

        /* renamed from: a */
        final Intent f11695a;

        /* renamed from: b */
        private final C3421e<Void> f11696b = new C3421e<>();

        C4299a(Intent intent) {
            this.f11695a = intent;
        }

        /* renamed from: a */
        void m27974a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.g1
                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC4298h1.C4299a.this.m27971d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            m27972c().mo30793c(scheduledExecutorService, new InterfaceC5016c() { // from class: com.google.firebase.messaging.f1
                @Override // p079e8.InterfaceC5016c
                /* renamed from: a */
                public final void mo4683a(AbstractC3419d abstractC3419d) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m27973b() {
            this.f11696b.m30798e(null);
        }

        /* renamed from: c */
        AbstractC3419d<Void> m27972c() {
            return this.f11696b.m30802a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public /* synthetic */ void m27971d() {
            String action = this.f11695a.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
            sb2.append("Service took too long to process intent: ");
            sb2.append(action);
            sb2.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb2.toString());
            m27973b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC4298h1(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new ThreadFactoryC5416b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m27978a() {
        while (!this.f11692d.isEmpty()) {
            this.f11692d.poll().m27973b();
        }
    }

    /* renamed from: b */
    private synchronized void m27977b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f11692d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            BinderC4287e1 binderC4287e1 = this.f11693e;
            if (binderC4287e1 != null && binderC4287e1.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f11693e.m28025b(this.f11692d.poll());
            } else {
                m27975d();
                return;
            }
        }
    }

    /* renamed from: d */
    private void m27975d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z = this.f11694f;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f11694f) {
            return;
        }
        this.f11694f = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (C4747a.m26711b().m26712a(this.f11689a, this.f11690b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f11694f = false;
        m27978a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized AbstractC3419d<Void> m27976c(Intent intent) {
        C4299a c4299a;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        c4299a = new C4299a(intent);
        c4299a.m27974a(this.f11691c);
        this.f11692d.add(c4299a);
        m27977b();
        return c4299a.m27972c();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.f11694f = false;
        if (!(iBinder instanceof BinderC4287e1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
            m27978a();
            return;
        }
        this.f11693e = (BinderC4287e1) iBinder;
        m27977b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        m27977b();
    }

    ServiceConnectionC4298h1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f11692d = new ArrayDeque();
        this.f11694f = false;
        Context applicationContext = context.getApplicationContext();
        this.f11689a = applicationContext;
        this.f11690b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f11691c = scheduledExecutorService;
    }
}
