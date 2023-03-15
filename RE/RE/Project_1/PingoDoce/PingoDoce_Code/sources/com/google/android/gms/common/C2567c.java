package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import p078e7.C5007h;
import p119g7.C5615c;
import p292p7.C8447d;
import p484z6.C13706d0;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.c */
/* loaded from: classes.dex */
public class C2567c {

    /* renamed from: a */
    public static final int f7388a = C2569e.f7391a;

    /* renamed from: b */
    private static final C2567c f7389b = new C2567c();

    /* renamed from: f */
    public static C2567c m33224f() {
        return f7389b;
    }

    /* renamed from: a */
    public int m33229a(Context context) {
        return C2569e.m33216a(context);
    }

    /* renamed from: b */
    public Intent mo33228b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            return C13706d0.m567c("com.google.android.gms");
        } else if (context != null && C5007h.m25907d(context)) {
            return C13706d0.m569a();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f7388a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(C5615c.m23567a(context).m23570e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C13706d0.m568b("com.google.android.gms", sb2.toString());
        }
    }

    /* renamed from: c */
    public PendingIntent mo33227c(Context context, int i, int i2) {
        return m33226d(context, i, i2, null);
    }

    /* renamed from: d */
    public PendingIntent m33226d(Context context, int i, int i2, String str) {
        Intent mo33228b = mo33228b(context, i, str);
        if (mo33228b == null) {
            return null;
        }
        return C8447d.m15391a(context, i2, mo33228b, C8447d.f21850a | 134217728);
    }

    /* renamed from: e */
    public String mo33225e(int i) {
        return C2569e.m33215b(i);
    }

    /* renamed from: g */
    public int mo33223g(Context context) {
        return mo33222h(context, f7388a);
    }

    /* renamed from: h */
    public int mo33222h(Context context, int i) {
        int m33211f = C2569e.m33211f(context, i);
        if (C2569e.m33210g(context, m33211f)) {
            return 18;
        }
        return m33211f;
    }

    /* renamed from: i */
    public boolean m33221i(Context context, String str) {
        return C2569e.m33206k(context, str);
    }

    /* renamed from: j */
    public boolean mo33220j(int i) {
        return C2569e.m33208i(i);
    }
}
