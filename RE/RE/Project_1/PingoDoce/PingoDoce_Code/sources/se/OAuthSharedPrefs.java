package se;

import android.content.SharedPreferences;
import com.github.aachartmodel.aainfographics.BuildConfig;
import jm.C6537a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: se.a */
/* loaded from: classes2.dex */
public final class OAuthSharedPrefs {

    /* renamed from: a */
    private final SharedPreferences f26505a;

    /* compiled from: OAuthSharedPrefs.kt */
    /* renamed from: se.a$a */
    /* loaded from: classes2.dex */
    public static final class C10176a {
        private C10176a() {
        }

        public /* synthetic */ C10176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10176a(null);
    }

    public OAuthSharedPrefs(SharedPreferences sharedPreferences) {
        Intrinsics.isThisObjectNull(sharedPreferences, "prefs");
        this.f26505a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m8864a() {
        try {
            this.f26505a.edit().clear().apply();
        } catch (Exception unused) {
            this.f26505a.edit().remove("AUTH_TOKEN").apply();
            this.f26505a.edit().remove("AUTH_REFRESH_TOKEN").apply();
            this.f26505a.edit().remove("AUTH_TOKEN_TTL").apply();
        }
    }

    /* renamed from: b */
    public final String m8863b() {
        if (this.f26505a.contains("AUTH_TOKEN")) {
            return String.valueOf(this.f26505a.getString("AUTH_TOKEN", BuildConfig.VERSION_NAME));
        }
        return null;
    }

    /* renamed from: c */
    public final Long m8862c() {
        if (this.f26505a.contains("AUTH_TOKEN_TTL")) {
            return Long.valueOf(this.f26505a.getLong("AUTH_TOKEN_TTL", 100L));
        }
        return null;
    }

    /* renamed from: d */
    public final String m8861d() {
        if (this.f26505a.contains("AUTH_REFRESH_TOKEN")) {
            return String.valueOf(this.f26505a.getString("AUTH_REFRESH_TOKEN", BuildConfig.VERSION_NAME));
        }
        return null;
    }

    /* renamed from: e */
    public final Boolean m8860e() {
        Long m8862c = m8862c();
        if (m8862c == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C6537a.m20678a("TimetoLeave: " + m8862c, new Object[0]);
        C6537a.m20678a("TimetoLeave: " + currentTimeMillis, new Object[0]);
        return Boolean.valueOf(m8862c.longValue() - ((long) 300000) < currentTimeMillis);
    }

    /* renamed from: f */
    public final void m8859f(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        this.f26505a.edit().putString("AUTH_TOKEN", str).apply();
    }

    /* renamed from: g */
    public final void m8858g(long j) {
        C6537a.m20678a("Adding TTL: " + j, new Object[0]);
        this.f26505a.edit().putLong("AUTH_TOKEN_TTL", j).apply();
    }

    /* renamed from: h */
    public final void m8857h(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        this.f26505a.edit().putString("AUTH_REFRESH_TOKEN", str).apply();
    }
}
