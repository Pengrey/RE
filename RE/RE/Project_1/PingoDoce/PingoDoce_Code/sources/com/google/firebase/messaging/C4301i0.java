package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.i0 */
/* loaded from: classes.dex */
public class C4301i0 {

    /* renamed from: a */
    private final Bundle f11698a;

    public C4301i0(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f11698a = new Bundle(bundle);
    }

    /* renamed from: d */
    private static int m27966d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m27951s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m27950t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m27948v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m27949u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m27948v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m27947w(String str) {
        if (!this.f11698a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m27948v = m27948v(str);
            if (this.f11698a.containsKey(m27948v)) {
                return m27948v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m27944z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m27969a(String str) {
        String m27954p = m27954p(str);
        return "1".equals(m27954p) || Boolean.parseBoolean(m27954p);
    }

    /* renamed from: b */
    public Integer m27968b(String str) {
        String m27954p = m27954p(str);
        if (TextUtils.isEmpty(m27954p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m27954p));
        } catch (NumberFormatException unused) {
            String m27944z = m27944z(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m27944z).length() + 38 + String.valueOf(m27954p).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(m27944z);
            sb2.append("(");
            sb2.append(m27954p);
            sb2.append(") into an int");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m27967c(String str) {
        String m27954p = m27954p(str);
        if (TextUtils.isEmpty(m27954p)) {
            return null;
        }
        try {
            return new JSONArray(m27954p);
        } catch (JSONException unused) {
            String m27944z = m27944z(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m27944z).length() + 50 + String.valueOf(m27954p).length());
            sb2.append("Malformed JSON for key ");
            sb2.append(m27944z);
            sb2.append(": ");
            sb2.append(m27954p);
            sb2.append(", falling back to default");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m27965e() {
        JSONArray m27967c = m27967c("gcm.n.light_settings");
        if (m27967c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m27967c.length() == 3) {
                iArr[0] = m27966d(m27967c.optString(0));
                iArr[1] = m27967c.optInt(1);
                iArr[2] = m27967c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            String obj = m27967c.toString();
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(obj.length() + 60 + String.valueOf(message).length());
            sb2.append("LightSettings is invalid: ");
            sb2.append(obj);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb2.toString());
            return null;
        } catch (JSONException unused) {
            String obj2 = m27967c.toString();
            StringBuilder sb3 = new StringBuilder(obj2.length() + 58);
            sb3.append("LightSettings is invalid: ");
            sb3.append(obj2);
            sb3.append(". Skipping setting LightSettings");
            Log.w("NotificationParams", sb3.toString());
            return null;
        }
    }

    /* renamed from: f */
    public Uri m27964f() {
        String m27954p = m27954p("gcm.n.link_android");
        if (TextUtils.isEmpty(m27954p)) {
            m27954p = m27954p("gcm.n.link");
        }
        if (TextUtils.isEmpty(m27954p)) {
            return null;
        }
        return Uri.parse(m27954p);
    }

    /* renamed from: g */
    public Object[] m27963g(String str) {
        JSONArray m27967c = m27967c(String.valueOf(str).concat("_loc_args"));
        if (m27967c == null) {
            return null;
        }
        int length = m27967c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m27967c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m27962h(String str) {
        return m27954p(String.valueOf(str).concat("_loc_key"));
    }

    /* renamed from: i */
    public String m27961i(Resources resources, String str, String str2) {
        String m27962h = m27962h(str2);
        if (TextUtils.isEmpty(m27962h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m27962h, "string", str);
        if (identifier == 0) {
            String m27944z = m27944z(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb2 = new StringBuilder(String.valueOf(m27944z).length() + 49 + String.valueOf(str2).length());
            sb2.append(m27944z);
            sb2.append(" resource not found: ");
            sb2.append(str2);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
        Object[] m27963g = m27963g(str2);
        if (m27963g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m27963g);
        } catch (MissingFormatArgumentException e) {
            String m27944z2 = m27944z(str2);
            String arrays = Arrays.toString(m27963g);
            StringBuilder sb3 = new StringBuilder(String.valueOf(m27944z2).length() + 58 + String.valueOf(arrays).length());
            sb3.append("Missing format argument for ");
            sb3.append(m27944z2);
            sb3.append(": ");
            sb3.append(arrays);
            sb3.append(" Default value will be used.");
            Log.w("NotificationParams", sb3.toString(), e);
            return null;
        }
    }

    /* renamed from: j */
    public Long m27960j(String str) {
        String m27954p = m27954p(str);
        if (TextUtils.isEmpty(m27954p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m27954p));
        } catch (NumberFormatException unused) {
            String m27944z = m27944z(str);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m27944z).length() + 38 + String.valueOf(m27954p).length());
            sb2.append("Couldn't parse value of ");
            sb2.append(m27944z);
            sb2.append("(");
            sb2.append(m27954p);
            sb2.append(") into a long");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* renamed from: k */
    public String m27959k() {
        return m27954p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m27958l() {
        Integer m27968b = m27968b("gcm.n.notification_count");
        if (m27968b == null) {
            return null;
        }
        if (m27968b.intValue() < 0) {
            String obj = m27968b.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 67);
            sb2.append("notificationCount is invalid: ");
            sb2.append(obj);
            sb2.append(". Skipping setting notificationCount.");
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
        return m27968b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m27957m() {
        Integer m27968b = m27968b("gcm.n.notification_priority");
        if (m27968b == null) {
            return null;
        }
        if (m27968b.intValue() < -2 || m27968b.intValue() > 2) {
            String obj = m27968b.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 72);
            sb2.append("notificationPriority is invalid ");
            sb2.append(obj);
            sb2.append(". Skipping setting notificationPriority.");
            Log.w("FirebaseMessaging", sb2.toString());
            return null;
        }
        return m27968b;
    }

    /* renamed from: n */
    public String m27956n(Resources resources, String str, String str2) {
        String m27954p = m27954p(str2);
        return !TextUtils.isEmpty(m27954p) ? m27954p : m27961i(resources, str, str2);
    }

    /* renamed from: o */
    public String m27955o() {
        String m27954p = m27954p("gcm.n.sound2");
        return TextUtils.isEmpty(m27954p) ? m27954p("gcm.n.sound") : m27954p;
    }

    /* renamed from: p */
    public String m27954p(String str) {
        return this.f11698a.getString(m27947w(str));
    }

    /* renamed from: q */
    public long[] m27953q() {
        JSONArray m27967c = m27967c("gcm.n.vibrate_timings");
        if (m27967c == null) {
            return null;
        }
        try {
            if (m27967c.length() > 1) {
                int length = m27967c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = m27967c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String obj = m27967c.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 74);
            sb2.append("User defined vibrateTimings is invalid: ");
            sb2.append(obj);
            sb2.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m27952r() {
        Integer m27968b = m27968b("gcm.n.visibility");
        if (m27968b == null) {
            return null;
        }
        if (m27968b.intValue() < -1 || m27968b.intValue() > 1) {
            String obj = m27968b.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 53);
            sb2.append("visibility is invalid: ");
            sb2.append(obj);
            sb2.append(". Skipping setting visibility.");
            Log.w("NotificationParams", sb2.toString());
            return null;
        }
        return m27968b;
    }

    /* renamed from: x */
    public Bundle m27946x() {
        Bundle bundle = new Bundle(this.f11698a);
        for (String str : this.f11698a.keySet()) {
            if (!m27951s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m27945y() {
        Bundle bundle = new Bundle(this.f11698a);
        for (String str : this.f11698a.keySet()) {
            if (m27949u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
