package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C2597i;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import p058d7.C4747a;
import p267o7.HandlerC8032f;
import p417w6.C11573d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.l */
/* loaded from: classes.dex */
public final class ServiceConnectionC2452l implements ServiceConnection {

    /* renamed from: c */
    C2453m f7118c;

    /* renamed from: f */
    final /* synthetic */ C2457q f7121f;
    @GuardedBy("this")

    /* renamed from: a */
    int f7116a = 0;

    /* renamed from: b */
    final Messenger f7117b = new Messenger(new HandlerC8032f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.f
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC2452l serviceConnectionC2452l = ServiceConnectionC2452l.this;
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (serviceConnectionC2452l) {
                AbstractC2455o<?> abstractC2455o = serviceConnectionC2452l.f7120e.get(i);
                if (abstractC2455o == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                serviceConnectionC2452l.f7120e.remove(i);
                serviceConnectionC2452l.m33542f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC2455o.m33539c(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC2455o.mo33537a(data);
                return true;
            }
        }
    }));
    @GuardedBy("this")

    /* renamed from: d */
    final Queue<AbstractC2455o<?>> f7119d = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: e */
    final SparseArray<AbstractC2455o<?>> f7120e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC2452l(C2457q c2457q, C11573d c11573d) {
        this.f7121f = c2457q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m33547a(int i, String str) {
        m33546b(i, str, null);
    }

    /* renamed from: b */
    final synchronized void m33546b(int i, String str, Throwable th2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f7116a;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            this.f7116a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f7116a = 4;
        C4747a.m26711b().m26710c(C2457q.m33535a(this.f7121f), this);
        zzq zzqVar = new zzq(i, str, th2);
        for (AbstractC2455o<?> abstractC2455o : this.f7119d) {
            abstractC2455o.m33539c(zzqVar);
        }
        this.f7119d.clear();
        for (int i3 = 0; i3 < this.f7120e.size(); i3++) {
            this.f7120e.valueAt(i3).m33539c(zzqVar);
        }
        this.f7120e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m33545c() {
        C2457q.m33531e(this.f7121f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.h
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC2455o<?> poll;
                final ServiceConnectionC2452l serviceConnectionC2452l = ServiceConnectionC2452l.this;
                while (true) {
                    synchronized (serviceConnectionC2452l) {
                        if (serviceConnectionC2452l.f7116a != 2) {
                            return;
                        }
                        if (serviceConnectionC2452l.f7119d.isEmpty()) {
                            serviceConnectionC2452l.m33542f();
                            return;
                        }
                        poll = serviceConnectionC2452l.f7119d.poll();
                        serviceConnectionC2452l.f7120e.put(poll.f7124a, poll);
                        C2457q.m33531e(serviceConnectionC2452l.f7121f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                ServiceConnectionC2452l.this.m33543e(poll.f7124a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context m33535a = C2457q.m33535a(serviceConnectionC2452l.f7121f);
                    Messenger messenger = serviceConnectionC2452l.f7117b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f7126c;
                    obtain.arg1 = poll.f7124a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo33536b());
                    bundle.putString("pkg", m33535a.getPackageName());
                    bundle.putBundle("data", poll.f7127d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC2452l.f7118c.m33540a(obtain);
                    } catch (RemoteException e) {
                        serviceConnectionC2452l.m33547a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m33544d() {
        if (this.f7116a == 1) {
            m33547a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m33543e(int i) {
        AbstractC2455o<?> abstractC2455o = this.f7120e.get(i);
        if (abstractC2455o != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f7120e.remove(i);
            abstractC2455o.m33539c(new zzq(3, "Timed out waiting for response", null));
            m33542f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m33542f() {
        if (this.f7116a == 2 && this.f7119d.isEmpty() && this.f7120e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f7116a = 3;
            C4747a.m26711b().m26710c(C2457q.m33535a(this.f7121f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean m33541g(AbstractC2455o<?> abstractC2455o) {
        int i = this.f7116a;
        if (i != 0) {
            if (i == 1) {
                this.f7119d.add(abstractC2455o);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                this.f7119d.add(abstractC2455o);
                m33545c();
                return true;
            }
        }
        this.f7119d.add(abstractC2455o);
        C2597i.m33073m(this.f7116a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f7116a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!C4747a.m26711b().m26712a(C2457q.m33535a(this.f7121f), intent, this, 1)) {
                m33547a(0, "Unable to bind to service");
            } else {
                C2457q.m33531e(this.f7121f).schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC2452l.this.m33544d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            m33546b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        C2457q.m33531e(this.f7121f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.j
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2452l serviceConnectionC2452l = ServiceConnectionC2452l.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC2452l) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC2452l.m33547a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC2452l.f7118c = new C2453m(iBinder2);
                            serviceConnectionC2452l.f7116a = 2;
                            serviceConnectionC2452l.m33545c();
                        } catch (RemoteException e) {
                            serviceConnectionC2452l.m33547a(0, e.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        C2457q.m33531e(this.f7121f).execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.g
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC2452l.this.m33547a(2, "Service disconnected");
            }
        });
    }
}
