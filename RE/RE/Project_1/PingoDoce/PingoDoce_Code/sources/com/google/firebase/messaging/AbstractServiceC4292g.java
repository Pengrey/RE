package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.messaging.BinderC4287e1;
import java.util.concurrent.ExecutorService;
import p079e8.InterfaceC5016c;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* renamed from: com.google.firebase.messaging.g */
/* loaded from: classes.dex */
public abstract class AbstractServiceC4292g extends Service {

    /* renamed from: x */
    private Binder f11677x;

    /* renamed from: z */
    private int f11679z;

    /* renamed from: w */
    final ExecutorService f11676w = C4310n.m27926b();

    /* renamed from: y */
    private final Object f11678y = new Object();

    /* renamed from: A */
    private int f11675A = 0;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.g$a */
    /* loaded from: classes.dex */
    class C4293a implements BinderC4287e1.InterfaceC4288a {
        C4293a() {
        }

        @Override // com.google.firebase.messaging.BinderC4287e1.InterfaceC4288a
        /* renamed from: a */
        public AbstractC3419d<Void> mo28015a(Intent intent) {
            return AbstractServiceC4292g.this.m28017h(intent);
        }
    }

    /* renamed from: b */
    private void m28023b(Intent intent) {
        if (intent != null) {
            C4278b1.m28051b(intent);
        }
        synchronized (this.f11678y) {
            int i = this.f11675A - 1;
            this.f11675A = i;
            if (i == 0) {
                m28016i(this.f11679z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public AbstractC3419d<Void> m28017h(final Intent intent) {
        if (m28020e(intent)) {
            return C3425g.m30765e(null);
        }
        final C3421e c3421e = new C3421e();
        this.f11676w.execute(new Runnable() { // from class: com.google.firebase.messaging.e
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC4292g.this.m28018g(intent, c3421e);
            }
        });
        return c3421e.m30802a();
    }

    /* renamed from: c */
    protected abstract Intent mo28022c(Intent intent);

    /* renamed from: d */
    public abstract void mo28021d(Intent intent);

    /* renamed from: e */
    public boolean m28020e(Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public /* synthetic */ void m28019f(Intent intent, AbstractC3419d abstractC3419d) {
        m28023b(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public /* synthetic */ void m28018g(Intent intent, C3421e c3421e) {
        try {
            mo28021d(intent);
        } finally {
            c3421e.m30800c(null);
        }
    }

    /* renamed from: i */
    boolean m28016i(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f11677x == null) {
            this.f11677x = new BinderC4287e1(new C4293a());
        }
        return this.f11677x;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f11676w.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.f11678y) {
            this.f11679z = i2;
            this.f11675A++;
        }
        Intent mo28022c = mo28022c(intent);
        if (mo28022c == null) {
            m28023b(intent);
            return 2;
        }
        AbstractC3419d<Void> m28017h = m28017h(mo28022c);
        if (m28017h.mo30781o()) {
            m28023b(intent);
            return 2;
        }
        m28017h.mo30793c(ExecutorC4289f.f11672w, new InterfaceC5016c() { // from class: com.google.firebase.messaging.d
            @Override // p079e8.InterfaceC5016c
            /* renamed from: a */
            public final void mo4683a(AbstractC3419d abstractC3419d) {
                AbstractServiceC4292g.this.m28019f(intent, abstractC3419d);
            }
        });
        return 3;
    }
}
