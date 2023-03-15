package p233m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C2290b;
import com.facebook.LegacyTokenHelper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: m4.a */
/* loaded from: classes.dex */
public final class AccessTokenCache {

    /* renamed from: a */
    private LegacyTokenHelper f18880a;

    /* renamed from: b */
    private final SharedPreferences f18881b;

    /* renamed from: c */
    private final C7116b f18882c;

    /* compiled from: AccessTokenCache.kt */
    /* renamed from: m4.a$a */
    /* loaded from: classes.dex */
    public static final class C7115a {
        private C7115a() {
        }

        public /* synthetic */ C7115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AccessTokenCache.kt */
    /* renamed from: m4.a$b */
    /* loaded from: classes.dex */
    public static final class C7116b {
        /* renamed from: a */
        public final LegacyTokenHelper m19182a() {
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
            return new LegacyTokenHelper(m34110e, null, 2, null);
        }
    }

    static {
        new C7115a(null);
    }

    public AccessTokenCache(SharedPreferences sharedPreferences, C7116b c7116b) {
        Intrinsics.isThisObjectNull(sharedPreferences, "sharedPreferences");
        Intrinsics.isThisObjectNull(c7116b, "tokenCachingStrategyFactory");
        this.f18881b = sharedPreferences;
        this.f18882c = c7116b;
    }

    /* renamed from: b */
    private final AccessToken m19189b() {
        String string = this.f18881b.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                return AccessToken.f6572L.m34235b(new JSONObject(string));
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    private final AccessToken m19188c() {
        Bundle m34071c = m19187d().m34071c();
        if (m34071c == null || !LegacyTokenHelper.f6673d.m34064g(m34071c)) {
            return null;
        }
        return AccessToken.f6572L.m34234c(m34071c);
    }

    /* renamed from: d */
    private final LegacyTokenHelper m19187d() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            if (this.f18880a == null) {
                synchronized (this) {
                    if (this.f18880a == null) {
                        this.f18880a = this.f18882c.m19182a();
                    }
                    C13195u c13195u = C13195u.f34156a;
                }
            }
            LegacyTokenHelper legacyTokenHelper = this.f18880a;
            if (legacyTokenHelper != null) {
                return legacyTokenHelper;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: e */
    private final boolean m19186e() {
        return this.f18881b.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: h */
    private final boolean m19183h() {
        return C2290b.m34094u();
    }

    /* renamed from: a */
    public final void m19190a() {
        this.f18881b.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m19183h()) {
            m19187d().m34073a();
        }
    }

    /* renamed from: f */
    public final AccessToken m19185f() {
        if (m19186e()) {
            return m19189b();
        }
        if (m19183h()) {
            AccessToken m19188c = m19188c();
            if (m19188c != null) {
                m19184g(m19188c);
                m19187d().m34073a();
                return m19188c;
            }
            return m19188c;
        }
        return null;
    }

    /* renamed from: g */
    public final void m19184g(AccessToken accessToken) {
        Intrinsics.isThisObjectNull(accessToken, "accessToken");
        try {
            this.f18881b.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m34242v().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AccessTokenCache() {
        /*
            r3 = this;
            android.content.Context r0 = com.facebook.C2290b.m34110e()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)"
            p181jd.Intrinsics.checkIfNull(r0, r1)
            m4.a$b r1 = new m4.a$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p233m4.AccessTokenCache.<init>():void");
    }
}
