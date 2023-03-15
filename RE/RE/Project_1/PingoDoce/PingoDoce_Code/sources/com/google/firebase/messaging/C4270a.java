package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0908j;
import androidx.core.content.C0928a;
import java.util.concurrent.atomic.AtomicInteger;
import p070e.C4906j;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.a */
/* loaded from: classes.dex */
public final class C4270a {

    /* renamed from: a */
    private static final AtomicInteger f11631a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: classes.dex */
    public static class C4271a {

        /* renamed from: a */
        public final C0908j.C0916e f11632a;

        /* renamed from: b */
        public final String f11633b;

        /* renamed from: c */
        public final int f11634c = 0;

        C4271a(C0908j.C0916e c0916e, String str, int i) {
            this.f11632a = c0916e;
            this.f11633b = str;
        }
    }

    /* renamed from: a */
    private static PendingIntent m28081a(Context context, C4301i0 c4301i0, String str, PackageManager packageManager) {
        Intent m28076f = m28076f(str, c4301i0, packageManager);
        if (m28076f == null) {
            return null;
        }
        m28076f.addFlags(67108864);
        m28076f.putExtras(c4301i0.m27945y());
        if (m28065q(c4301i0)) {
            m28076f.putExtra("gcm.n.analytics_data", c4301i0.m27946x());
        }
        return PendingIntent.getActivity(context, m28075g(), m28076f, m28070l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m28080b(Context context, C4301i0 c4301i0) {
        if (m28065q(c4301i0)) {
            return m28079c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c4301i0.m27946x()));
        }
        return null;
    }

    /* renamed from: c */
    private static PendingIntent m28079c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m28075g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m28070l(1073741824));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C4271a m28078d(Context context, C4301i0 c4301i0) {
        Bundle m28072j = m28072j(context.getPackageManager(), context.getPackageName());
        return m28077e(context, context.getPackageName(), c4301i0, m28071k(context, c4301i0.m27959k(), m28072j), context.getResources(), context.getPackageManager(), m28072j);
    }

    /* renamed from: e */
    public static C4271a m28077e(Context context, String str, C4301i0 c4301i0, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        C0908j.C0916e c0916e = new C0908j.C0916e(context, str2);
        String m27956n = c4301i0.m27956n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(m27956n)) {
            c0916e.m39182k(m27956n);
        }
        String m27956n2 = c4301i0.m27956n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(m27956n2)) {
            c0916e.m39183j(m27956n2);
            c0916e.m39170w(new C0908j.C0914c().m39195h(m27956n2));
        }
        c0916e.m39172u(m28069m(packageManager, resources, str, c4301i0.m27954p("gcm.n.icon"), bundle));
        Uri m28068n = m28068n(str, c4301i0, resources);
        if (m28068n != null) {
            c0916e.m39171v(m28068n);
        }
        c0916e.m39184i(m28081a(context, c4301i0, str, packageManager));
        PendingIntent m28080b = m28080b(context, c4301i0);
        if (m28080b != null) {
            c0916e.m39180m(m28080b);
        }
        Integer m28074h = m28074h(context, c4301i0.m27954p("gcm.n.color"), bundle);
        if (m28074h != null) {
            c0916e.m39185h(m28074h.intValue());
        }
        c0916e.m39187f(!c4301i0.m27969a("gcm.n.sticky"));
        c0916e.m39176q(c4301i0.m27969a("gcm.n.local_only"));
        String m27954p = c4301i0.m27954p("gcm.n.ticker");
        if (m27954p != null) {
            c0916e.m39169x(m27954p);
        }
        Integer m27957m = c4301i0.m27957m();
        if (m27957m != null) {
            c0916e.m39174s(m27957m.intValue());
        }
        Integer m27952r = c4301i0.m27952r();
        if (m27952r != null) {
            c0916e.m39167z(m27952r.intValue());
        }
        Integer m27958l = c4301i0.m27958l();
        if (m27958l != null) {
            c0916e.m39175r(m27958l.intValue());
        }
        Long m27960j = c4301i0.m27960j("gcm.n.event_time");
        if (m27960j != null) {
            c0916e.m39173t(true);
            c0916e.m39193A(m27960j.longValue());
        }
        long[] m27953q = c4301i0.m27953q();
        if (m27953q != null) {
            c0916e.m39168y(m27953q);
        }
        int[] m27965e = c4301i0.m27965e();
        if (m27965e != null) {
            c0916e.m39177p(m27965e[0], m27965e[1], m27965e[2]);
        }
        c0916e.m39181l(m28073i(c4301i0));
        return new C4271a(c0916e, m28067o(c4301i0), 0);
    }

    /* renamed from: f */
    private static Intent m28076f(String str, C4301i0 c4301i0, PackageManager packageManager) {
        String m27954p = c4301i0.m27954p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m27954p)) {
            Intent intent = new Intent(m27954p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m27964f = c4301i0.m27964f();
        if (m27964f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m27964f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m28075g() {
        return f11631a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m28074h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
                sb2.append("Color is invalid: ");
                sb2.append(str);
                sb2.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0928a.m39113d(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: i */
    private static int m28073i(C4301i0 c4301i0) {
        boolean m27969a = c4301i0.m27969a("gcm.n.default_sound");
        ?? r0 = m27969a;
        if (c4301i0.m27969a("gcm.n.default_vibrate_timings")) {
            r0 = (m27969a ? 1 : 0) | true;
        }
        return c4301i0.m27969a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    /* renamed from: j */
    private static Bundle m28072j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e.toString()));
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m28071k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + C4906j.f13400E0);
                    sb2.append("Notification Channel requested (");
                    sb2.append(str);
                    sb2.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb2.toString());
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(string2)) {
                    if (notificationManager.getNotificationChannel(string2) != null) {
                        return string2;
                    }
                    Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                } else {
                    Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                }
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: l */
    private static int m28070l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    /* renamed from: m */
    private static int m28069m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m28066p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m28066p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61);
            sb2.append("Icon resource ");
            sb2.append(str2);
            sb2.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb2.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m28066p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e.toString()));
            }
        }
        if (i == 0 || !m28066p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m28068n(String str, C4301i0 c4301i0, Resources resources) {
        String m27955o = c4301i0.m27955o();
        if (TextUtils.isEmpty(m27955o)) {
            return null;
        }
        if (!"default".equals(m27955o) && resources.getIdentifier(m27955o, "raw", str) != 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(m27955o).length());
            sb2.append("android.resource://");
            sb2.append(str);
            sb2.append("/raw/");
            sb2.append(m27955o);
            return Uri.parse(sb2.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }

    /* renamed from: o */
    private static String m28067o(C4301i0 c4301i0) {
        String m27954p = c4301i0.m27954p("gcm.n.tag");
        if (TextUtils.isEmpty(m27954p)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("FCM-Notification:");
            sb2.append(uptimeMillis);
            return sb2.toString();
        }
        return m27954p;
    }

    @TargetApi(26)
    /* renamed from: p */
    private static boolean m28066p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i, null) instanceof AdaptiveIconDrawable) {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                sb2.append(i);
                Log.e("FirebaseMessaging", sb2.toString());
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Couldn't find resource ");
            sb3.append(i);
            sb3.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb3.toString());
            return false;
        }
    }

    /* renamed from: q */
    static boolean m28065q(C4301i0 c4301i0) {
        return c4301i0.m27969a("google.c.a.e");
    }
}
