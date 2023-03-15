package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import p099f7.ThreadFactoryC5416b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: classes.dex */
public class RunnableC4329v0 implements Runnable {

    /* renamed from: w */
    private final long f11744w;

    /* renamed from: x */
    private final PowerManager.WakeLock f11745x;

    /* renamed from: y */
    private final FirebaseMessaging f11746y;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.v0$a */
    /* loaded from: classes.dex */
    static class C4330a extends BroadcastReceiver {
        @Nullable

        /* renamed from: a */
        private RunnableC4329v0 f11747a;

        public C4330a(RunnableC4329v0 runnableC4329v0) {
            this.f11747a = runnableC4329v0;
        }

        /* renamed from: a */
        public void m27886a() {
            if (RunnableC4329v0.m27889c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f11747a.m27890b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            RunnableC4329v0 runnableC4329v0 = this.f11747a;
            if (runnableC4329v0 != null && runnableC4329v0.m27888d()) {
                if (RunnableC4329v0.m27889c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11747a.f11746y.m28125d(this.f11747a, 0L);
                this.f11747a.m27890b().unregisterReceiver(this);
                this.f11747a = null;
            }
        }
    }

    @SuppressLint({"InvalidWakeLockTag"})
    public RunnableC4329v0(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC5416b("firebase-iid-executor"));
        this.f11746y = firebaseMessaging;
        this.f11744w = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) m27890b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f11745x = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m27889c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* renamed from: b */
    Context m27890b() {
        return this.f11746y.m28124e();
    }

    /* renamed from: d */
    boolean m27888d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) m27890b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: e */
    boolean m27887e() throws IOException {
        try {
            if (this.f11746y.m28126c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            if (C4280c0.m28037f(e.getMessage())) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseMessaging", sb2.toString());
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (C4320r0.m27916b().m27913e(m27890b())) {
            this.f11745x.acquire();
        }
        try {
            try {
                this.f11746y.m28107v(true);
                if (!this.f11746y.m28115n()) {
                    this.f11746y.m28107v(false);
                    if (!C4320r0.m27916b().m27913e(m27890b())) {
                        return;
                    }
                } else if (C4320r0.m27916b().m27914d(m27890b()) && !m27888d()) {
                    new C4330a(this).m27886a();
                    if (!C4320r0.m27916b().m27913e(m27890b())) {
                        return;
                    }
                } else {
                    if (m27887e()) {
                        this.f11746y.m28107v(false);
                    } else {
                        this.f11746y.m28103z(this.f11744w);
                    }
                    if (!C4320r0.m27916b().m27913e(m27890b())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
                sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb2.append(message);
                sb2.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb2.toString());
                this.f11746y.m28107v(false);
                if (!C4320r0.m27916b().m27913e(m27890b())) {
                    return;
                }
            }
            this.f11745x.release();
        } catch (Throwable th2) {
            if (C4320r0.m27916b().m27913e(m27890b())) {
                this.f11745x.release();
            }
            throw th2;
        }
    }
}
