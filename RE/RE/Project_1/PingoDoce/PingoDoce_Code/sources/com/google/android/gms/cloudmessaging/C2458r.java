package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import p078e7.C5009j;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.r */
/* loaded from: classes.dex */
public final class C2458r {

    /* renamed from: a */
    private final Context f7133a;
    @GuardedBy("this")

    /* renamed from: b */
    private int f7134b;
    @GuardedBy("this")

    /* renamed from: c */
    private int f7135c = 0;

    public C2458r(Context context) {
        this.f7133a = context;
    }

    /* renamed from: a */
    public final synchronized int m33528a() {
        PackageInfo packageInfo;
        if (this.f7134b == 0) {
            try {
                packageInfo = C5615c.m23567a(this.f7133a).m23570e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f7134b = packageInfo.versionCode;
            }
        }
        return this.f7134b;
    }

    /* renamed from: b */
    public final synchronized int m33527b() {
        int i = this.f7135c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f7133a.getPackageManager();
        if (C5615c.m23567a(this.f7133a).m23573b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C5009j.m25895h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7135c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f7135c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C5009j.m25895h()) {
            this.f7135c = 2;
            i2 = 2;
        } else {
            this.f7135c = 1;
        }
        return i2;
    }
}
