package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p009a8.C0079l;
import p009a8.C0081n;
import p078e7.C5000a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.b */
/* loaded from: classes.dex */
public final class C4169b {

    /* renamed from: a */
    private static final Set f11382a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    private static final List f11383b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final List f11384c = Arrays.asList("auto", "app", "am");

    /* renamed from: d */
    private static final List f11385d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    private static final List f11386e = Arrays.asList((String[]) C5000a.m25922a(C0081n.f192a, C0081n.f193b));

    /* renamed from: f */
    private static final List f11387f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static String m28458a(String str) {
        String m41974a = C0079l.m41974a(str);
        return m41974a != null ? m41974a : str;
    }

    /* renamed from: b */
    public static void m28457b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: c */
    public static boolean m28456c(String str, String str2, Bundle bundle) {
        char c;
        if ("_cmp".equals(str2)) {
            if (m28453f(str) && bundle != null) {
                for (String str3 : f11385d) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals("fcm")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals("fiam")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m28455d(String str, Bundle bundle) {
        if (f11383b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : f11385d) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m28454e(String str) {
        return !f11382a.contains(str);
    }

    /* renamed from: f */
    public static boolean m28453f(String str) {
        return !f11384c.contains(str);
    }

    /* renamed from: g */
    public static boolean m28452g(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (f11386e.contains(str2)) {
            return false;
        } else {
            for (String str3 : f11387f) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
