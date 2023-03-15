package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.r0 */
/* loaded from: classes.dex */
public class C4320r0 {

    /* renamed from: e */
    private static C4320r0 f11720e;
    @GuardedBy("this")

    /* renamed from: a */
    private String f11721a = null;

    /* renamed from: b */
    private Boolean f11722b = null;

    /* renamed from: c */
    private Boolean f11723c = null;

    /* renamed from: d */
    private final Queue<Intent> f11724d = new ArrayDeque();

    private C4320r0() {
    }

    /* renamed from: a */
    private int m27917a(Context context, Intent intent) {
        ComponentName startService;
        String str;
        String m27912f = m27912f(context, intent);
        if (m27912f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                if (m27912f.length() != 0) {
                    str = "Restricting intent to a specific service: ".concat(m27912f);
                } else {
                    str = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", str);
            }
            intent.setClassName(context.getPackageName(), m27912f);
        }
        try {
            if (m27913e(context)) {
                startService = C4278b1.m28048e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e.toString()));
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C4320r0 m27916b() {
        C4320r0 c4320r0;
        synchronized (C4320r0.class) {
            if (f11720e == null) {
                f11720e = new C4320r0();
            }
            c4320r0 = f11720e;
        }
        return c4320r0;
    }

    /* renamed from: f */
    private synchronized String m27912f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f11721a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.f11721a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.f11721a = serviceInfo.name;
                }
                return this.f11721a;
            }
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
            sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb2.append(str3);
            sb2.append("/");
            sb2.append(str4);
            Log.e("FirebaseMessaging", sb2.toString());
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent m27915c() {
        return this.f11724d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m27914d(Context context) {
        if (this.f11723c == null) {
            this.f11723c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f11722b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11723c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m27913e(Context context) {
        if (this.f11722b == null) {
            this.f11722b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f11722b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11722b.booleanValue();
    }

    /* renamed from: g */
    public int m27911g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f11724d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m27917a(context, intent2);
    }
}
