package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.C4175c;
import com.google.firebase.installations.C4259c;
import java.util.concurrent.ExecutionException;
import p157i9.InterfaceC6056a;
import p270oa.C8051a;
import p270oa.C8056b;
import p461y5.AbstractC13112c;
import p461y5.C13111b;
import p461y5.InterfaceC13115f;
import p461y5.InterfaceC13116g;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.g0 */
/* loaded from: classes.dex */
public class C4294g0 {
    /* renamed from: A */
    public static boolean m28014A(Intent intent) {
        if (intent == null || m27995r(intent)) {
            return false;
        }
        return m28013B(intent.getExtras());
    }

    /* renamed from: B */
    public static boolean m28013B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m28012a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C4175c.m28440i();
            Context m28441h = C4175c.m28440i().m28441h();
            SharedPreferences sharedPreferences = m28441h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m28441h.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m28441h.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C8051a m28011b(C8051a.EnumC8053b enumC8053b, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C8051a.C8052a m17044p = C8051a.m17044p();
        m17044p.m17031m(m27997p(extras));
        m17044p.m17039e(enumC8053b);
        m17044p.m17038f(m28007f(extras));
        m17044p.m17035i(m28000m());
        m17044p.m17033k(C8051a.EnumC8055d.ANDROID);
        m17044p.m17036h(m28002k(extras));
        String m28005h = m28005h(extras);
        if (m28005h != null) {
            m17044p.m17037g(m28005h);
        }
        String m27998o = m27998o(extras);
        if (m27998o != null) {
            m17044p.m17032l(m27998o);
        }
        String m28010c = m28010c(extras);
        if (m28010c != null) {
            m17044p.m17041c(m28010c);
        }
        String m28004i = m28004i(extras);
        if (m28004i != null) {
            m17044p.m17042b(m28004i);
        }
        String m28008e = m28008e(extras);
        if (m28008e != null) {
            m17044p.m17040d(m28008e);
        }
        long m27999n = m27999n(extras);
        if (m27999n > 0) {
            m17044p.m17034j(m27999n);
        }
        return m17044p.m17043a();
    }

    /* renamed from: c */
    static String m28010c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m28009d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m28008e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m28007f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (TextUtils.isEmpty(string)) {
            try {
                return (String) C3425g.m30769a(C4259c.m28159o(C4175c.m28440i()).getId());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return string;
    }

    /* renamed from: g */
    static String m28006g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m28005h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: i */
    static String m28004i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m28003j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C8051a.EnumC8054c m28002k(Bundle bundle) {
        if (bundle != null && C4301i0.m27950t(bundle)) {
            return C8051a.EnumC8054c.DISPLAY_NOTIFICATION;
        }
        return C8051a.EnumC8054c.DATA_MESSAGE;
    }

    /* renamed from: l */
    static String m28001l(Bundle bundle) {
        return true != C4301i0.m27950t(bundle) ? "data" : "display";
    }

    /* renamed from: m */
    static String m28000m() {
        return C4175c.m28440i().m28441h().getPackageName();
    }

    /* renamed from: n */
    static long m27999n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C4175c m28440i = C4175c.m28440i();
        String m28180d = m28440i.m28438k().m28180d();
        if (m28180d != null) {
            try {
                return Long.parseLong(m28180d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String m28181c = m28440i.m28438k().m28181c();
        if (!m28181c.startsWith("1:")) {
            try {
                return Long.parseLong(m28181c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            String[] split = m28181c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    static String m27998o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m27997p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(obj)));
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    static String m27996q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m27995r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m27994s(Intent intent) {
        m27989x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m27993t(Intent intent) {
        m27989x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m27992u(Bundle bundle) {
        m27988y(bundle);
        m27989x("_no", bundle);
    }

    /* renamed from: v */
    public static void m27991v(Intent intent) {
        if (m28014A(intent)) {
            m27989x("_nr", intent.getExtras());
        }
        if (m27987z(intent)) {
            m27990w(C8051a.EnumC8053b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m28118k());
        }
    }

    /* renamed from: w */
    private static void m27990w(C8051a.EnumC8053b enumC8053b, Intent intent, InterfaceC13116g interfaceC13116g) {
        if (interfaceC13116g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C8051a m28011b = m28011b(enumC8053b, intent);
        if (m28011b == null) {
            return;
        }
        try {
            InterfaceC13115f mo1575a = interfaceC13116g.mo1575a("FCM_CLIENT_EVENT_LOGGING", C8056b.class, C13111b.m1584b("proto"), C4290f0.f11673a);
            C8056b.C8057a m17029b = C8056b.m17029b();
            m17029b.m17026b(m28011b);
            mo1575a.mo1576b(AbstractC13112c.m1580d(m17029b.m17027a()));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    /* renamed from: x */
    static void m27989x(String str, Bundle bundle) {
        try {
            C4175c.m28440i();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m28009d = m28009d(bundle);
            if (m28009d != null) {
                bundle2.putString("_nmid", m28009d);
            }
            String m28008e = m28008e(bundle);
            if (m28008e != null) {
                bundle2.putString("_nmn", m28008e);
            }
            String m28004i = m28004i(bundle);
            if (!TextUtils.isEmpty(m28004i)) {
                bundle2.putString("label", m28004i);
            }
            String m28006g = m28006g(bundle);
            if (!TextUtils.isEmpty(m28006g)) {
                bundle2.putString("message_channel", m28006g);
            }
            String m27998o = m27998o(bundle);
            if (m27998o != null) {
                bundle2.putString("_nt", m27998o);
            }
            String m28003j = m28003j(bundle);
            if (m28003j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m28003j));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String m27996q = m27996q(bundle);
            if (m27996q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m27996q));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String m28001l = m28001l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m28001l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String obj = bundle2.toString();
                StringBuilder sb2 = new StringBuilder(str.length() + 37 + obj.length());
                sb2.append("Logging to scion event=");
                sb2.append(str);
                sb2.append(" scionPayload=");
                sb2.append(obj);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            InterfaceC6056a interfaceC6056a = (InterfaceC6056a) C4175c.m28440i().m28442g(InterfaceC6056a.class);
            if (interfaceC6056a != null) {
                interfaceC6056a.mo22295c("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m27988y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if ("1".equals(bundle.getString("google.c.a.tc"))) {
            InterfaceC6056a interfaceC6056a = (InterfaceC6056a) C4175c.m28440i().m28442g(InterfaceC6056a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC6056a != null) {
                String string = bundle.getString("google.c.a.c_id");
                interfaceC6056a.mo22296b("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                interfaceC6056a.mo22295c("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    /* renamed from: z */
    public static boolean m27987z(Intent intent) {
        if (intent == null || m27995r(intent)) {
            return false;
        }
        return m28012a();
    }
}
