package p078e7;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.C2569e;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.h */
/* loaded from: classes.dex */
public final class C5007h {

    /* renamed from: a */
    private static Boolean f13942a;

    /* renamed from: b */
    private static Boolean f13943b;

    /* renamed from: c */
    private static Boolean f13944c;

    /* renamed from: d */
    private static Boolean f13945d;

    /* renamed from: a */
    public static boolean m25910a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f13945d == null) {
            boolean z = false;
            if (C5009j.m25895h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f13945d = Boolean.valueOf(z);
        }
        return f13945d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m25909b() {
        int i = C2569e.f7391a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    /* renamed from: c */
    public static boolean m25908c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f13942a == null) {
            boolean z = false;
            if (C5009j.m25898e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f13942a = Boolean.valueOf(z);
        }
        return f13942a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: d */
    public static boolean m25907d(Context context) {
        if (m25908c(context)) {
            if (!C5009j.m25896g()) {
                return true;
            }
            if (m25906e(context) && !C5009j.m25895h()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static boolean m25906e(Context context) {
        if (f13943b == null) {
            boolean z = false;
            if (C5009j.m25897f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f13943b = Boolean.valueOf(z);
        }
        return f13943b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m25905f(Context context) {
        if (f13944c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f13944c = Boolean.valueOf(z);
        }
        return f13944c.booleanValue();
    }
}
