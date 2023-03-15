package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0928a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.u0 */
/* loaded from: classes.dex */
public class C4326u0 {

    /* renamed from: a */
    final SharedPreferences f11736a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.u0$a */
    /* loaded from: classes.dex */
    public static class C4327a {

        /* renamed from: d */
        private static final long f11737d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f11738a;

        /* renamed from: b */
        final String f11739b;

        /* renamed from: c */
        final long f11740c;

        private C4327a(String str, String str2, long j) {
            this.f11738a = str;
            this.f11739b = str2;
            this.f11740c = j;
        }

        /* renamed from: a */
        static String m27894a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
                return null;
            }
        }

        /* renamed from: c */
        static C4327a m27892c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C4327a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                    return null;
                }
            }
            return new C4327a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m27893b(String str) {
            return System.currentTimeMillis() > this.f11740c + f11737d || !str.equals(this.f11739b);
        }
    }

    public C4326u0(Context context) {
        this.f11736a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m27900a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m27900a(Context context, String str) {
        File file = new File(C0928a.m39108i(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || m27896e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            m27898c();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseMessaging", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* renamed from: b */
    private String m27899b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|*");
        return sb2.toString();
    }

    /* renamed from: c */
    public synchronized void m27898c() {
        this.f11736a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized C4327a m27897d(String str, String str2) {
        return C4327a.m27892c(this.f11736a.getString(m27899b(str, str2), null));
    }

    /* renamed from: e */
    public synchronized boolean m27896e() {
        return this.f11736a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void m27895f(String str, String str2, String str3, String str4) {
        String m27894a = C4327a.m27894a(str3, str4, System.currentTimeMillis());
        if (m27894a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f11736a.edit();
        edit.putString(m27899b(str, str2), m27894a);
        edit.commit();
    }
}
