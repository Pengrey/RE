package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.C2612u;
import java.util.concurrent.atomic.AtomicBoolean;
import p078e7.C5007h;
import p078e7.C5009j;
import p078e7.C5010k;
import p078e7.C5012m;
import p119g7.C5615c;
import p439x6.C12287b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.e */
/* loaded from: classes.dex */
public class C2569e {
    @Deprecated

    /* renamed from: a */
    public static final int f7391a = 12451000;

    /* renamed from: c */
    private static boolean f7393c = false;

    /* renamed from: d */
    static boolean f7394d = false;

    /* renamed from: b */
    static final AtomicBoolean f7392b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f7395e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static int m33216a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: b */
    public static String m33215b(int i) {
        return ConnectionResult.m33523E(i);
    }

    /* renamed from: c */
    public static Context m33214c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Resources m33213d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static boolean m33212e(Context context) {
        try {
            if (!f7394d) {
                PackageInfo m23570e = C5615c.m23567a(context).m23570e("com.google.android.gms", 64);
                C2570f.m33205a(context);
                if (m23570e == null || C2570f.m33201e(m23570e, false) || !C2570f.m33201e(m23570e, true)) {
                    f7393c = false;
                } else {
                    f7393c = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f7394d = true;
        }
        return f7393c || !C5007h.m25909b();
    }

    @Deprecated
    /* renamed from: f */
    public static int m33211f(Context context, int i) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C12287b.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f7395e.get()) {
            int m33028a = C2612u.m33028a(context);
            if (m33028a != 0) {
                if (m33028a != f7391a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(m33028a);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        boolean z = (C5007h.m25907d(context) || C5007h.m25905f(context)) ? false : true;
        C2597i.m33085a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C2570f.m33205a(context);
            if (!C2570f.m33201e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z) {
                    C2597i.m33076j(packageInfo);
                    if (!C2570f.m33201e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (C5012m.m25886a(packageInfo2.versionCode) < C5012m.m25886a(i)) {
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i);
                    sb2.append(" but found ");
                    sb2.append(i2);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m33210g(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m33206k(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: h */
    public static boolean m33209h(Context context) {
        if (C5009j.m25900c()) {
            Object systemService = context.getSystemService("user");
            C2597i.m33076j(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        return false;
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m33208i(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: j */
    public static boolean m33207j(Context context, int i, String str) {
        return C5010k.m25890b(context, i, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(21)
    /* renamed from: k */
    public static boolean m33206k(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C5009j.m25897f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        return applicationInfo.enabled && !m33209h(context);
    }
}
