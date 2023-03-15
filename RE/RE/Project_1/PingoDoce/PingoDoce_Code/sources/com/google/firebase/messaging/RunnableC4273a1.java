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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.a1 */
/* loaded from: classes.dex */
public class RunnableC4273a1 implements Runnable {

    /* renamed from: B */
    private static final Object f11636B = new Object();

    /* renamed from: C */
    private static Boolean f11637C;

    /* renamed from: D */
    private static Boolean f11638D;

    /* renamed from: A */
    private final long f11639A;

    /* renamed from: w */
    private final Context f11640w;

    /* renamed from: x */
    private final C4297h0 f11641x;

    /* renamed from: y */
    private final PowerManager.WakeLock f11642y;

    /* renamed from: z */
    private final C4338z0 f11643z;

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.a1$a */
    /* loaded from: classes.dex */
    class C4274a extends BroadcastReceiver {

        /* renamed from: a */
        private RunnableC4273a1 f11644a;

        public C4274a(RunnableC4273a1 runnableC4273a1) {
            this.f11644a = runnableC4273a1;
        }

        /* renamed from: a */
        public void m28054a() {
            if (RunnableC4273a1.m28055j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            RunnableC4273a1.this.f11640w.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            RunnableC4273a1 runnableC4273a1 = this.f11644a;
            if (runnableC4273a1 == null) {
                return;
            }
            if (runnableC4273a1.m28056i()) {
                if (RunnableC4273a1.m28055j()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f11644a.f11643z.m27863l(this.f11644a, 0L);
                context.unregisterReceiver(this);
                this.f11644a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4273a1(C4338z0 c4338z0, Context context, C4297h0 c4297h0, long j) {
        this.f11643z = c4338z0;
        this.f11640w = context;
        this.f11639A = j;
        this.f11641x = c4297h0;
        this.f11642y = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m28060e(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 142);
        sb2.append("Missing Permission: ");
        sb2.append(str);
        sb2.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb2.toString();
    }

    /* renamed from: f */
    private static boolean m28059f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f11636B) {
            Boolean bool = f11638D;
            if (bool == null) {
                booleanValue = m28058g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f11638D = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* renamed from: g */
    private static boolean m28058g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z;
        }
        Log.d("FirebaseMessaging", m28060e(str));
        return false;
    }

    /* renamed from: h */
    private static boolean m28057h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f11636B) {
            Boolean bool = f11637C;
            if (bool == null) {
                booleanValue = m28058g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f11637C = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m28056i() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f11640w.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m28055j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (m28057h(this.f11640w)) {
            this.f11642y.acquire(C4275b.f11646a);
        }
        try {
            try {
                this.f11643z.m27861n(true);
                if (!this.f11641x.m27980g()) {
                    this.f11643z.m27861n(false);
                    if (m28057h(this.f11640w)) {
                        try {
                            this.f11642y.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (m28059f(this.f11640w) && !m28056i()) {
                    new C4274a(this).m28054a();
                    if (m28057h(this.f11640w)) {
                        try {
                            this.f11642y.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f11643z.m27857r()) {
                        this.f11643z.m27861n(false);
                    } else {
                        this.f11643z.m27856s(this.f11639A);
                    }
                    if (m28057h(this.f11640w)) {
                        try {
                            this.f11642y.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(valueOf) : new String("Failed to sync topics. Won't retry sync. "));
                this.f11643z.m27861n(false);
                if (m28057h(this.f11640w)) {
                    try {
                        this.f11642y.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (Throwable th2) {
            if (m28057h(this.f11640w)) {
                try {
                    this.f11642y.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
