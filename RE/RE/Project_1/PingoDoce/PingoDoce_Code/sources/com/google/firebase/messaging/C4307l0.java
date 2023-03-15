package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.C3425g;
import java.util.concurrent.Executor;
import p078e7.C5009j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.l0 */
/* loaded from: classes.dex */
public final class C4307l0 {
    /* renamed from: a */
    private static boolean m27943a(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m27942b(Context context) {
        if (C4309m0.m27929b(context)) {
            return;
        }
        m27940d(ExecutorC4305k0.f11705w, context, m27939e(context));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m27941c(Context context, boolean z, C3421e c3421e) {
        try {
            if (!m27943a(context)) {
                String valueOf = String.valueOf(context.getPackageName());
                Log.e("FirebaseMessaging", valueOf.length() != 0 ? "error configuring notification delegate for package ".concat(valueOf) : new String("error configuring notification delegate for package "));
                return;
            }
            C4309m0.m27928c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c3421e.m30798e(null);
        }
    }

    @TargetApi(29)
    /* renamed from: d */
    static AbstractC3419d<Void> m27940d(Executor executor, final Context context, final boolean z) {
        if (!C5009j.m25893j()) {
            return C3425g.m30765e(null);
        }
        final C3421e c3421e = new C3421e();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.j0
            @Override // java.lang.Runnable
            public final void run() {
                C4307l0.m27941c(context, z, c3421e);
            }
        });
        return c3421e.m30802a();
    }

    /* renamed from: e */
    private static boolean m27939e(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
