package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.C4175c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p078e7.C5009j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.h0 */
/* loaded from: classes.dex */
public class C4297h0 {

    /* renamed from: a */
    private final Context f11684a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f11685b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f11686c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f11687d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f11688e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4297h0(Context context) {
        this.f11684a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m27984c(C4175c c4175c) {
        String m28180d = c4175c.m28438k().m28180d();
        if (m28180d != null) {
            return m28180d;
        }
        String m28181c = c4175c.m28438k().m28181c();
        if (m28181c.startsWith("1:")) {
            String[] split = m28181c.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return m28181c;
    }

    /* renamed from: f */
    private PackageInfo m27981f(String str) {
        try {
            return this.f11684a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m27979h() {
        PackageInfo m27981f = m27981f(this.f11684a.getPackageName());
        if (m27981f != null) {
            this.f11685b = Integer.toString(m27981f.versionCode);
            this.f11686c = m27981f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m27986a() {
        if (this.f11685b == null) {
            m27979h();
        }
        return this.f11685b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m27985b() {
        if (this.f11686c == null) {
            m27979h();
        }
        return this.f11686c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m27983d() {
        PackageInfo m27981f;
        if (this.f11687d == 0 && (m27981f = m27981f("com.google.android.gms")) != null) {
            this.f11687d = m27981f.versionCode;
        }
        return this.f11687d;
    }

    /* renamed from: e */
    synchronized int m27982e() {
        int i = this.f11688e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f11684a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C5009j.m25895h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11688e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f11688e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (C5009j.m25895h()) {
            this.f11688e = 2;
            i2 = 2;
        } else {
            this.f11688e = 1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m27980g() {
        return m27982e() != 0;
    }
}
