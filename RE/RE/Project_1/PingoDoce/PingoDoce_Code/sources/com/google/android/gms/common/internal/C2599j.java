package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.p020os.C1011c;
import com.google.android.gms.common.C2568d;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import p078e7.C5007h;
import p119g7.C5615c;
import p301q.C9558g;
import p399v6.C11128b;
import p439x6.C12287b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.j */
/* loaded from: classes.dex */
public final class C2599j {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C9558g<String, String> f7508a = new C9558g<>();
    @GuardedBy("sCache")

    /* renamed from: b */
    private static Locale f7509b;

    /* renamed from: a */
    public static String m33071a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C5615c.m23567a(context).m23571d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m33070b(Context context) {
        return context.getResources().getString(C11128b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m33069c(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(C11128b.common_google_play_services_enable_button);
            }
            return resources.getString(C11128b.common_google_play_services_update_button);
        }
        return resources.getString(C11128b.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m33068d(Context context, int i) {
        Resources resources = context.getResources();
        String m33071a = m33071a(context);
        if (i != 1) {
            if (i == 2) {
                return C5007h.m25907d(context) ? resources.getString(C11128b.common_google_play_services_wear_update_text) : resources.getString(C11128b.common_google_play_services_update_text, m33071a);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case 16:
                                        return m33064h(context, "common_google_play_services_api_unavailable_text", m33071a);
                                    case 17:
                                        return m33064h(context, "common_google_play_services_sign_in_failed_text", m33071a);
                                    case 18:
                                        return resources.getString(C11128b.common_google_play_services_updating_text, m33071a);
                                    default:
                                        return resources.getString(C12287b.common_google_play_services_unknown_issue, m33071a);
                                }
                            }
                            return m33064h(context, "common_google_play_services_restricted_profile_text", m33071a);
                        }
                        return resources.getString(C11128b.common_google_play_services_unsupported_text, m33071a);
                    }
                    return m33064h(context, "common_google_play_services_network_error_text", m33071a);
                }
                return m33064h(context, "common_google_play_services_invalid_account_text", m33071a);
            } else {
                return resources.getString(C11128b.common_google_play_services_enable_text, m33071a);
            }
        }
        return resources.getString(C11128b.common_google_play_services_install_text, m33071a);
    }

    /* renamed from: e */
    public static String m33067e(Context context, int i) {
        if (i != 6 && i != 19) {
            return m33068d(context, i);
        }
        return m33064h(context, "common_google_play_services_resolution_required_text", m33071a(context));
    }

    /* renamed from: f */
    public static String m33066f(Context context, int i) {
        String m33065g;
        if (i == 6) {
            m33065g = m33063i(context, "common_google_play_services_resolution_required_title");
        } else {
            m33065g = m33065g(context, i);
        }
        return m33065g == null ? context.getResources().getString(C11128b.common_google_play_services_notification_ticker) : m33065g;
    }

    /* renamed from: g */
    public static String m33065g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C11128b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C11128b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C11128b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m33063i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m33063i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unexpected error code ");
                sb2.append(i);
                Log.e("GoogleApiAvailability", sb2.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m33063i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m33063i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    private static String m33064h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m33063i = m33063i(context, str);
        if (m33063i == null) {
            m33063i = resources.getString(C12287b.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, m33063i, str2);
    }

    /* renamed from: i */
    private static String m33063i(Context context, String str) {
        String str2;
        String str3;
        C9558g<String, String> c9558g = f7508a;
        synchronized (c9558g) {
            Locale m38747c = C1011c.m38753a(context.getResources().getConfiguration()).m38747c(0);
            if (!m38747c.equals(f7509b)) {
                c9558g.clear();
                f7509b = m38747c;
            }
            String str4 = c9558g.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources m33218d = C2568d.m33218d(context);
            if (m33218d == null) {
                return null;
            }
            int identifier = m33218d.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = m33218d.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                c9558g.put(str, string);
                return string;
            }
            if (str.length() != 0) {
                str2 = "Got empty resource: ".concat(str);
            } else {
                str2 = new String("Got empty resource: ");
            }
            Log.w("GoogleApiAvailability", str2);
            return null;
        }
    }
}
