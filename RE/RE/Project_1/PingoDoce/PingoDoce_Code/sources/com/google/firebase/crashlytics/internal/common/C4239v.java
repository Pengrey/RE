package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p158ia.InterfaceC6066d;
import p219l9.C7011f;

/* renamed from: com.google.firebase.crashlytics.internal.common.v */
/* loaded from: classes.dex */
public class C4239v implements InterfaceC4240w {

    /* renamed from: g */
    private static final Pattern f11552g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h */
    private static final String f11553h = Pattern.quote("/");

    /* renamed from: a */
    private final C4241x f11554a;

    /* renamed from: b */
    private final Context f11555b;

    /* renamed from: c */
    private final String f11556c;

    /* renamed from: d */
    private final InterfaceC6066d f11557d;

    /* renamed from: e */
    private final C4232r f11558e;

    /* renamed from: f */
    private String f11559f;

    public C4239v(Context context, String str, InterfaceC6066d interfaceC6066d, C4232r c4232r) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str != null) {
            this.f11555b = context;
            this.f11556c = str;
            this.f11557d = interfaceC6066d;
            this.f11558e = c4232r;
            this.f11554a = new C4241x();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    /* renamed from: b */
    private synchronized String m28207b(String str, SharedPreferences sharedPreferences) {
        String m28204e;
        m28204e = m28204e(UUID.randomUUID().toString());
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19608i("Created new Crashlytics installation ID: " + m28204e + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", m28204e).putString("firebase.installation.id", str).apply();
        return m28204e;
    }

    /* renamed from: c */
    static String m28206c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    /* renamed from: d */
    private String m28205d() {
        try {
            return (String) C4204h0.m28337d(this.f11557d.getId());
        } catch (Exception e) {
            C7011f.m19611f().m19605l("Failed to retrieve Firebase Installations ID.", e);
            return null;
        }
    }

    /* renamed from: e */
    private static String m28204e(String str) {
        if (str == null) {
            return null;
        }
        return f11552g.matcher(str).replaceAll(BuildConfig.VERSION_NAME).toLowerCase(Locale.US);
    }

    /* renamed from: k */
    static boolean m28198k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    /* renamed from: l */
    private String m28197l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    /* renamed from: m */
    private String m28196m(String str) {
        return str.replaceAll(f11553h, BuildConfig.VERSION_NAME);
    }

    @Override // com.google.firebase.crashlytics.internal.common.InterfaceC4240w
    /* renamed from: a */
    public synchronized String mo28195a() {
        String str = this.f11559f;
        if (str != null) {
            return str;
        }
        C7011f.m19611f().m19608i("Determining Crashlytics installation ID...");
        SharedPreferences m28360r = C4196g.m28360r(this.f11555b);
        String string = m28360r.getString("firebase.installation.id", null);
        C7011f m19611f = C7011f.m19611f();
        m19611f.m19608i("Cached Firebase Installation ID: " + string);
        if (this.f11558e.m28219d()) {
            String m28205d = m28205d();
            C7011f m19611f2 = C7011f.m19611f();
            m19611f2.m19608i("Fetched Firebase Installation ID: " + m28205d);
            if (m28205d == null) {
                m28205d = string == null ? m28206c() : string;
            }
            if (m28205d.equals(string)) {
                this.f11559f = m28197l(m28360r);
            } else {
                this.f11559f = m28207b(m28205d, m28360r);
            }
        } else if (m28198k(string)) {
            this.f11559f = m28197l(m28360r);
        } else {
            this.f11559f = m28207b(m28206c(), m28360r);
        }
        if (this.f11559f == null) {
            C7011f.m19611f().m19606k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f11559f = m28207b(m28206c(), m28360r);
        }
        C7011f m19611f3 = C7011f.m19611f();
        m19611f3.m19608i("Crashlytics installation ID: " + this.f11559f);
        return this.f11559f;
    }

    /* renamed from: f */
    public String m28203f() {
        return this.f11556c;
    }

    /* renamed from: g */
    public String m28202g() {
        return this.f11554a.m28194a(this.f11555b);
    }

    /* renamed from: h */
    public String m28201h() {
        return String.format(Locale.US, "%s/%s", m28196m(Build.MANUFACTURER), m28196m(Build.MODEL));
    }

    /* renamed from: i */
    public String m28200i() {
        return m28196m(Build.VERSION.INCREMENTAL);
    }

    /* renamed from: j */
    public String m28199j() {
        return m28196m(Build.VERSION.RELEASE);
    }
}
