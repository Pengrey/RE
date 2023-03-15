package p233m4;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.C2290b;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.EnumC2289a;
import com.facebook.EnumC2303d;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p233m4.GraphRequestBatch;
import p435x2.C12256a;

/* renamed from: m4.b */
/* loaded from: classes.dex */
public final class AccessTokenManager {

    /* renamed from: f */
    private static AccessTokenManager f18883f;

    /* renamed from: g */
    public static final C7117a f18884g = new C7117a(null);

    /* renamed from: a */
    private AccessToken f18885a;

    /* renamed from: b */
    private final AtomicBoolean f18886b;

    /* renamed from: c */
    private Date f18887c;

    /* renamed from: d */
    private final C12256a f18888d;

    /* renamed from: e */
    private final AccessTokenCache f18889e;

    /* compiled from: AccessTokenManager.kt */
    /* renamed from: m4.b$a */
    /* loaded from: classes.dex */
    public static final class C7117a {
        private C7117a() {
        }

        /* renamed from: a */
        public static final /* synthetic */ GraphRequest m19165a(C7117a c7117a, AccessToken accessToken, GraphRequest.InterfaceC2278b interfaceC2278b) {
            return c7117a.m19163c(accessToken, interfaceC2278b);
        }

        /* renamed from: b */
        public static final /* synthetic */ GraphRequest m19164b(C7117a c7117a, AccessToken accessToken, GraphRequest.InterfaceC2278b interfaceC2278b) {
            return c7117a.m19162d(accessToken, interfaceC2278b);
        }

        /* renamed from: c */
        private final GraphRequest m19163c(AccessToken accessToken, GraphRequest.InterfaceC2278b interfaceC2278b) {
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", "fb_extend_sso_token");
            bundle.putString("client_id", accessToken.m34256b());
            return new GraphRequest(accessToken, "oauth/access_token", bundle, EnumC2303d.GET, interfaceC2278b, null, 32, null);
        }

        /* renamed from: d */
        private final GraphRequest m19162d(AccessToken accessToken, GraphRequest.InterfaceC2278b interfaceC2278b) {
            return new GraphRequest(accessToken, "me/permissions", new Bundle(), EnumC2303d.GET, interfaceC2278b, null, 32, null);
        }

        /* renamed from: e */
        public final AccessTokenManager m19161e() {
            AccessTokenManager m19181a;
            AccessTokenManager m19181a2 = AccessTokenManager.m19181a();
            if (m19181a2 == null) {
                synchronized (this) {
                    m19181a = AccessTokenManager.m19181a();
                    if (m19181a == null) {
                        C12256a m3182b = C12256a.m3182b(C2290b.m34110e());
                        Intrinsics.checkIfNull(m3182b, "LocalBroadcastManager.ge…tance(applicationContext)");
                        AccessTokenManager accessTokenManager = new AccessTokenManager(m3182b, new AccessTokenCache());
                        AccessTokenManager.m19178d(accessTokenManager);
                        m19181a = accessTokenManager;
                    }
                }
                return m19181a;
            }
            return m19181a2;
        }

        public /* synthetic */ C7117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: m4.b$b */
    /* loaded from: classes.dex */
    public static final class C7118b {

        /* renamed from: a */
        private String f18890a;

        /* renamed from: b */
        private int f18891b;

        /* renamed from: c */
        private Long f18892c;

        /* renamed from: d */
        private String f18893d;

        /* renamed from: a */
        public final String m19160a() {
            return this.f18890a;
        }

        /* renamed from: b */
        public final Long m19159b() {
            return this.f18892c;
        }

        /* renamed from: c */
        public final int m19158c() {
            return this.f18891b;
        }

        /* renamed from: d */
        public final String m19157d() {
            return this.f18893d;
        }

        /* renamed from: e */
        public final void m19156e(String str) {
            this.f18890a = str;
        }

        /* renamed from: f */
        public final void m19155f(Long l) {
            this.f18892c = l;
        }

        /* renamed from: g */
        public final void m19154g(int i) {
            this.f18891b = i;
        }

        /* renamed from: h */
        public final void m19153h(String str) {
            this.f18893d = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: m4.b$c */
    /* loaded from: classes.dex */
    public static final class RunnableC7119c implements Runnable {

        /* renamed from: x */
        final /* synthetic */ AccessToken.InterfaceC2263a f18895x;

        RunnableC7119c(AccessToken.InterfaceC2263a interfaceC2263a) {
            this.f18895x = interfaceC2263a;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                AccessTokenManager.m19179c(AccessTokenManager.this, this.f18895x);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: m4.b$d */
    /* loaded from: classes.dex */
    public static final class C7120d implements GraphRequestBatch.InterfaceC7124a {

        /* renamed from: b */
        final /* synthetic */ C7118b f18897b;

        /* renamed from: c */
        final /* synthetic */ AccessToken f18898c;

        /* renamed from: d */
        final /* synthetic */ AccessToken.InterfaceC2263a f18899d;

        /* renamed from: e */
        final /* synthetic */ AtomicBoolean f18900e;

        /* renamed from: f */
        final /* synthetic */ Set f18901f;

        /* renamed from: g */
        final /* synthetic */ Set f18902g;

        /* renamed from: h */
        final /* synthetic */ Set f18903h;

        C7120d(C7118b c7118b, AccessToken accessToken, AccessToken.InterfaceC2263a interfaceC2263a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f18897b = c7118b;
            this.f18898c = accessToken;
            this.f18899d = interfaceC2263a;
            this.f18900e = atomicBoolean;
            this.f18901f = set;
            this.f18902g = set2;
            this.f18903h = set3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m19152a(GraphRequestBatch graphRequestBatch) {
            AccessToken accessToken;
            AccessToken.InterfaceC2263a interfaceC2263a;
            C7117a c7117a;
            Date m34254d;
            Intrinsics.isThisObjectNull(graphRequestBatch, "it");
            String m19160a = this.f18897b.m19160a();
            int m19158c = this.f18897b.m19158c();
            Long m19159b = this.f18897b.m19159b();
            boolean z = this.f18897b;
            String m19157d = z.m19157d();
            try {
                c7117a = AccessTokenManager.f18884g;
            } catch (Throwable th2) {
                th = th2;
                z = 0;
            }
            try {
                if (c7117a.m19161e().m19175g() != null) {
                    AccessToken m19175g = c7117a.m19161e().m19175g();
                    if ((m19175g != null ? m19175g.m34245r() : null) == this.f18898c.m34245r()) {
                        if (!this.f18900e.get() && m19160a == null && m19158c == 0) {
                            AccessToken.InterfaceC2263a interfaceC2263a2 = this.f18899d;
                            if (interfaceC2263a2 != null) {
                                interfaceC2263a2.m34240a(new FacebookException("Failed to refresh access token"));
                            }
                            AccessTokenManager.m19180b(AccessTokenManager.this).set(false);
                            return;
                        }
                        if (m19160a == null) {
                            m19160a = this.f18898c.m34246n();
                        }
                        String str = m19160a;
                        String m34256b = this.f18898c.m34256b();
                        String m34245r = this.f18898c.m34245r();
                        Set m34248k = this.f18900e.get() ? this.f18901f : this.f18898c.m34248k();
                        Set m34253e = this.f18900e.get() ? this.f18902g : this.f18898c.m34253e();
                        Set m34252f = this.f18900e.get() ? this.f18903h : this.f18898c.m34252f();
                        EnumC2289a m34247m = this.f18898c.m34247m();
                        Date date = this.f18897b.m19158c() != 0 ? new Date(this.f18897b.m19158c() * 1000) : this.f18898c.m34251h();
                        Date date2 = new Date();
                        if (m19159b != null) {
                            m34254d = new Date(1000 * m19159b.longValue());
                        } else {
                            m34254d = this.f18898c.m34254d();
                        }
                        z = 0;
                        accessToken = new AccessToken(str, m34256b, m34245r, m34248k, m34253e, m34252f, m34247m, date, date2, m34254d, m19157d);
                        try {
                            c7117a.m19161e().m19169m(accessToken);
                            AccessTokenManager.m19180b(AccessTokenManager.this).set(false);
                            AccessToken.InterfaceC2263a interfaceC2263a3 = this.f18899d;
                            if (interfaceC2263a3 != null) {
                                interfaceC2263a3.m34239b(accessToken);
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            AccessTokenManager.m19180b(AccessTokenManager.this).set(z);
                            interfaceC2263a = this.f18899d;
                            if (interfaceC2263a != null) {
                                interfaceC2263a.m34239b(accessToken);
                            }
                            throw th;
                        }
                    }
                }
                AccessToken.InterfaceC2263a interfaceC2263a4 = this.f18899d;
                if (interfaceC2263a4 != null) {
                    interfaceC2263a4.m34240a(new FacebookException("No current access token to refresh"));
                }
                AccessTokenManager.m19180b(AccessTokenManager.this).set(false);
            } catch (Throwable th4) {
                th = th4;
                accessToken = null;
                AccessTokenManager.m19180b(AccessTokenManager.this).set(z);
                interfaceC2263a = this.f18899d;
                if (interfaceC2263a != null && accessToken != null) {
                    interfaceC2263a.m34239b(accessToken);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: m4.b$e */
    /* loaded from: classes.dex */
    public static final class C7121e implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f18904a;

        /* renamed from: b */
        final /* synthetic */ Set f18905b;

        /* renamed from: c */
        final /* synthetic */ Set f18906c;

        /* renamed from: d */
        final /* synthetic */ Set f18907d;

        C7121e(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f18904a = atomicBoolean;
            this.f18905b = set;
            this.f18906c = set2;
            this.f18907d = set3;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            JSONArray optJSONArray;
            Intrinsics.isThisObjectNull(graphResponse, "response");
            JSONObject m34081d = graphResponse.m34081d();
            if (m34081d == null || (optJSONArray = m34081d.optJSONArray("data")) == null) {
                return;
            }
            this.f18904a.set(true);
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("permission");
                    String optString2 = optJSONObject.optString("status");
                    if (!Utility.m33977G(optString) && !Utility.m33977G(optString2)) {
                        Intrinsics.checkIfNull(optString2, "status");
                        Locale locale = Locale.US;
                        Intrinsics.checkIfNull(locale, "Locale.US");
                        Objects.requireNonNull(optString2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = optString2.toLowerCase(locale);
                        Intrinsics.checkIfNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (lowerCase != null) {
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                        this.f18906c.add(optString);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    this.f18905b.add(optString);
                                }
                            } else if (lowerCase.equals("expired")) {
                                this.f18907d.add(optString);
                            }
                        }
                        Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessTokenManager.kt */
    /* renamed from: m4.b$f */
    /* loaded from: classes.dex */
    public static final class C7122f implements GraphRequest.InterfaceC2278b {

        /* renamed from: a */
        final /* synthetic */ C7118b f18908a;

        C7122f(C7118b c7118b) {
            this.f18908a = c7118b;
        }

        /* renamed from: a */
        public final void mo15411a(GraphResponse graphResponse) {
            Intrinsics.isThisObjectNull(graphResponse, "response");
            JSONObject m34081d = graphResponse.m34081d();
            if (m34081d != null) {
                this.f18908a.m19156e(m34081d.optString("access_token"));
                this.f18908a.m19154g(m34081d.optInt("expires_at"));
                this.f18908a.m19155f(Long.valueOf(m34081d.optLong("data_access_expiration_time")));
                this.f18908a.m19153h(m34081d.optString("graph_domain", null));
            }
        }
    }

    public AccessTokenManager(C12256a c12256a, AccessTokenCache accessTokenCache) {
        Intrinsics.isThisObjectNull(c12256a, "localBroadcastManager");
        Intrinsics.isThisObjectNull(accessTokenCache, "accessTokenCache");
        this.f18888d = c12256a;
        this.f18889e = accessTokenCache;
        this.f18886b = new AtomicBoolean(false);
        this.f18887c = new Date(0L);
    }

    /* renamed from: a */
    public static final /* synthetic */ AccessTokenManager m19181a() {
        return f18883f;
    }

    /* renamed from: b */
    public static final /* synthetic */ AtomicBoolean m19180b(AccessTokenManager accessTokenManager) {
        return accessTokenManager.f18886b;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m19179c(AccessTokenManager accessTokenManager, AccessToken.InterfaceC2263a interfaceC2263a) {
        accessTokenManager.m19171k(interfaceC2263a);
    }

    /* renamed from: d */
    public static final /* synthetic */ void m19178d(AccessTokenManager accessTokenManager) {
        f18883f = accessTokenManager;
    }

    /* renamed from: h */
    public static final AccessTokenManager m19174h() {
        return f18884g.m19161e();
    }

    /* renamed from: k */
    private final void m19171k(AccessToken.InterfaceC2263a interfaceC2263a) {
        AccessToken m19175g = m19175g();
        if (m19175g == null) {
            if (interfaceC2263a != null) {
                interfaceC2263a.m34240a(new FacebookException("No current access token to refresh"));
            }
        } else if (!this.f18886b.compareAndSet(false, true)) {
            if (interfaceC2263a != null) {
                interfaceC2263a.m34240a(new FacebookException("Refresh already in progress"));
            }
        } else {
            this.f18887c = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            C7118b c7118b = new C7118b();
            C7117a c7117a = f18884g;
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(C7117a.m19164b(c7117a, m19175g, new C7121e(atomicBoolean, hashSet, hashSet2, hashSet3)), C7117a.m19165a(c7117a, m19175g, new C7122f(c7118b)));
            graphRequestBatch.m19138g(new C7120d(c7118b, m19175g, interfaceC2263a, atomicBoolean, hashSet, hashSet2, hashSet3));
            graphRequestBatch.m19134p();
        }
    }

    /* renamed from: l */
    private final void m19170l(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C2290b.m34110e(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f18888d.m3180d(intent);
    }

    /* renamed from: n */
    private final void m19168n(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f18885a;
        this.f18885a = accessToken;
        this.f18886b.set(false);
        this.f18887c = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f18889e.m19184g(accessToken);
            } else {
                this.f18889e.m19190a();
                Context m34110e = C2290b.m34110e();
                Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
                Utility.m33954d(m34110e);
            }
        }
        if (Utility.m33957a(accessToken2, accessToken)) {
            return;
        }
        m19170l(accessToken2, accessToken);
        m19167o();
    }

    /* renamed from: o */
    private final void m19167o() {
        Context m34110e = C2290b.m34110e();
        AccessToken.C2265c c2265c = AccessToken.f6572L;
        AccessToken m34232e = c2265c.m34232e();
        AlarmManager alarmManager = (AlarmManager) m34110e.getSystemService("alarm");
        if (c2265c.m34230g()) {
            if ((m34232e != null ? m34232e.m34251h() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(m34110e, CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, m34232e.m34251h().getTime(), PendingIntent.getBroadcast(m34110e, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: p */
    private final boolean m19166p() {
        AccessToken m19175g = m19175g();
        if (m19175g != null) {
            long time = new Date().getTime();
            return m19175g.m34247m().canExtendToken() && time - this.f18887c.getTime() > ((long) DateTimeConstants.MILLIS_PER_HOUR) && time - m19175g.m34249j().getTime() > ((long) DateTimeConstants.MILLIS_PER_DAY);
        }
        return false;
    }

    /* renamed from: e */
    public final void m19177e() {
        m19170l(m19175g(), m19175g());
    }

    /* renamed from: f */
    public final void m19176f() {
        if (m19166p()) {
            m19172j(null);
        }
    }

    /* renamed from: g */
    public final AccessToken m19175g() {
        return this.f18885a;
    }

    /* renamed from: i */
    public final boolean m19173i() {
        AccessToken m19185f = this.f18889e.m19185f();
        if (m19185f != null) {
            m19168n(m19185f, false);
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m19172j(AccessToken.InterfaceC2263a interfaceC2263a) {
        if (Intrinsics.equals(Looper.getMainLooper(), Looper.myLooper())) {
            m19171k(interfaceC2263a);
        } else {
            new Handler(Looper.getMainLooper()).post(new RunnableC7119c(interfaceC2263a));
        }
    }

    /* renamed from: m */
    public final void m19169m(AccessToken accessToken) {
        m19168n(accessToken, true);
    }
}
