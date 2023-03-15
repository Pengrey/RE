package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.AbstractC2890n6;
import com.google.android.gms.internal.measurement.C2864lc;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0068a;
import p009a8.C0077j;
import p078e7.C5006g;
import p078e7.InterfaceC5003d;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.k4 */
/* loaded from: classes.dex */
public final class C3242k4 implements InterfaceC3199g5 {

    /* renamed from: H */
    private static volatile C3242k4 f8594H;

    /* renamed from: A */
    private volatile Boolean f8595A;

    /* renamed from: B */
    protected Boolean f8596B;

    /* renamed from: C */
    protected Boolean f8597C;

    /* renamed from: D */
    private volatile boolean f8598D;

    /* renamed from: E */
    private int f8599E;

    /* renamed from: G */
    final long f8601G;

    /* renamed from: a */
    private final Context f8602a;

    /* renamed from: b */
    private final String f8603b;

    /* renamed from: c */
    private final String f8604c;

    /* renamed from: d */
    private final String f8605d;

    /* renamed from: e */
    private final boolean f8606e;

    /* renamed from: f */
    private final C3138b f8607f;

    /* renamed from: g */
    private final C3182f f8608g;

    /* renamed from: h */
    private final C3340t3 f8609h;

    /* renamed from: i */
    private final C3197g3 f8610i;

    /* renamed from: j */
    private final C3220i4 f8611j;

    /* renamed from: k */
    private final C3268m8 f8612k;

    /* renamed from: l */
    private final C3203g9 f8613l;

    /* renamed from: m */
    private final C3142b3 f8614m;

    /* renamed from: n */
    private final InterfaceC5003d f8615n;

    /* renamed from: o */
    private final C3373w6 f8616o;

    /* renamed from: p */
    private final C3233j6 f8617p;

    /* renamed from: q */
    private final C3398z1 f8618q;

    /* renamed from: r */
    private final C3277n6 f8619r;

    /* renamed from: s */
    private final String f8620s;

    /* renamed from: t */
    private C3131a3 f8621t;

    /* renamed from: u */
    private C3374w7 f8622u;

    /* renamed from: v */
    private C3270n f8623v;

    /* renamed from: w */
    private C3379x2 f8624w;

    /* renamed from: y */
    private Boolean f8626y;

    /* renamed from: z */
    private long f8627z;

    /* renamed from: x */
    private boolean f8625x = false;

    /* renamed from: F */
    private final AtomicInteger f8600F = new AtomicInteger(0);

    C3242k4(C3221i5 c3221i5) {
        long mo25914a;
        Bundle bundle;
        boolean z = false;
        C2597i.m33076j(c3221i5);
        Context context = c3221i5.f8525a;
        C3138b c3138b = new C3138b(context);
        this.f8607f = c3138b;
        C3317r2.f8829a = c3138b;
        this.f8602a = context;
        this.f8603b = c3221i5.f8526b;
        this.f8604c = c3221i5.f8527c;
        this.f8605d = c3221i5.f8528d;
        this.f8606e = c3221i5.f8532h;
        this.f8595A = c3221i5.f8529e;
        this.f8620s = c3221i5.f8534j;
        this.f8598D = true;
        zzcl zzclVar = c3221i5.f8531g;
        if (zzclVar != null && (bundle = zzclVar.f8155C) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f8596B = (Boolean) obj;
            }
            Object obj2 = zzclVar.f8155C.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f8597C = (Boolean) obj2;
            }
        }
        AbstractC2890n6.m32435e(context);
        InterfaceC5003d m25911d = C5006g.m25911d();
        this.f8615n = m25911d;
        Long l = c3221i5.f8533i;
        if (l != null) {
            mo25914a = l.longValue();
        } else {
            mo25914a = m25911d.mo25914a();
        }
        this.f8601G = mo25914a;
        this.f8608g = new C3182f(this);
        C3340t3 c3340t3 = new C3340t3(this);
        c3340t3.m31345l();
        this.f8609h = c3340t3;
        C3197g3 c3197g3 = new C3197g3(this);
        c3197g3.m31345l();
        this.f8610i = c3197g3;
        C3203g9 c3203g9 = new C3203g9(this);
        c3203g9.m31345l();
        this.f8613l = c3203g9;
        this.f8614m = new C3142b3(new C3210h5(c3221i5, this));
        this.f8618q = new C3398z1(this);
        C3373w6 c3373w6 = new C3373w6(this);
        c3373w6.m30844j();
        this.f8616o = c3373w6;
        C3233j6 c3233j6 = new C3233j6(this);
        c3233j6.m30844j();
        this.f8617p = c3233j6;
        C3268m8 c3268m8 = new C3268m8(this);
        c3268m8.m30844j();
        this.f8612k = c3268m8;
        C3277n6 c3277n6 = new C3277n6(this);
        c3277n6.m31345l();
        this.f8619r = c3277n6;
        C3220i4 c3220i4 = new C3220i4(this);
        c3220i4.m31345l();
        this.f8611j = c3220i4;
        zzcl zzclVar2 = c3221i5.f8531g;
        z = (zzclVar2 == null || zzclVar2.f8158x == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            C3233j6 m31129I = m31129I();
            if (m31129I.f8410a.f8602a.getApplicationContext() instanceof Application) {
                Application application = (Application) m31129I.f8410a.f8602a.getApplicationContext();
                if (m31129I.f8563c == null) {
                    m31129I.f8563c = new C3222i6(m31129I, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(m31129I.f8563c);
                    application.registerActivityLifecycleCallbacks(m31129I.f8563c);
                    m31129I.f8410a.mo31116d().m31328v().m31398a("Registered activity lifecycle callback");
                }
            }
        } else {
            mo31116d().m31327w().m31398a("Application context is not an Application");
        }
        c3220i4.m31239z(new RunnableC3231j4(this, c3221i5));
    }

    /* renamed from: H */
    public static C3242k4 m31130H(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f8153A == null || zzclVar.f8154B == null)) {
            zzclVar = new zzcl(zzclVar.f8157w, zzclVar.f8158x, zzclVar.f8159y, zzclVar.f8160z, null, null, zzclVar.f8155C, null);
        }
        C2597i.m33076j(context);
        C2597i.m33076j(context.getApplicationContext());
        if (f8594H == null) {
            synchronized (C3242k4.class) {
                if (f8594H == null) {
                    f8594H = new C3242k4(new C3221i5(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f8155C) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C2597i.m33076j(f8594H);
            f8594H.f8595A = Boolean.valueOf(zzclVar.f8155C.getBoolean("dataCollectionDefaultEnabled"));
        }
        C2597i.m33076j(f8594H);
        return f8594H;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m31119a(C3242k4 c3242k4, C3221i5 c3221i5) {
        c3242k4.mo31118b().mo30825h();
        c3242k4.f8608g.m31351w();
        C3270n c3270n = new C3270n(c3242k4);
        c3270n.m31345l();
        c3242k4.f8623v = c3270n;
        C3379x2 c3379x2 = new C3379x2(c3242k4, c3221i5.f8530f);
        c3379x2.m30844j();
        c3242k4.f8624w = c3379x2;
        C3131a3 c3131a3 = new C3131a3(c3242k4);
        c3131a3.m30844j();
        c3242k4.f8621t = c3131a3;
        C3374w7 c3374w7 = new C3374w7(c3242k4);
        c3374w7.m30844j();
        c3242k4.f8622u = c3374w7;
        c3242k4.f8613l.m31344m();
        c3242k4.f8609h.m31344m();
        c3242k4.f8624w.m30843k();
        C3175e3 m31329u = c3242k4.mo31116d().m31329u();
        c3242k4.f8608g.m31357q();
        m31329u.m31397b("App measurement initialized, version", 55005L);
        c3242k4.mo31116d().m31329u().m31398a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m30848s = c3379x2.m30848s();
        if (TextUtils.isEmpty(c3242k4.f8603b)) {
            if (c3242k4.m31124N().m31305S(m30848s)) {
                c3242k4.mo31116d().m31329u().m31398a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C3175e3 m31329u2 = c3242k4.mo31116d().m31329u();
                String valueOf = String.valueOf(m30848s);
                m31329u2.m31398a(valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "));
            }
        }
        c3242k4.mo31116d().m31333q().m31398a("Debug-level message logging enabled");
        if (c3242k4.f8599E != c3242k4.f8600F.get()) {
            c3242k4.mo31116d().m31332r().m31396c("Not all components initialized", Integer.valueOf(c3242k4.f8599E), Integer.valueOf(c3242k4.f8600F.get()));
        }
        c3242k4.f8625x = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static final void m31100t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    private static final void m31099u(C3177e5 c3177e5) {
        if (c3177e5 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    private static final void m31098v(AbstractC3380x3 abstractC3380x3) {
        if (abstractC3380x3 != null) {
            if (!abstractC3380x3.m30841m()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC3380x3.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: w */
    private static final void m31097w(AbstractC3188f5 abstractC3188f5) {
        if (abstractC3188f5 != null) {
            if (!abstractC3188f5.m31343n()) {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC3188f5.getClass())));
            }
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: A */
    public final C3270n m31137A() {
        m31097w(this.f8623v);
        return this.f8623v;
    }

    @Pure
    /* renamed from: B */
    public final C3379x2 m31136B() {
        m31098v(this.f8624w);
        return this.f8624w;
    }

    @Pure
    /* renamed from: C */
    public final C3131a3 m31135C() {
        m31098v(this.f8621t);
        return this.f8621t;
    }

    @Pure
    /* renamed from: D */
    public final C3142b3 m31134D() {
        return this.f8614m;
    }

    /* renamed from: E */
    public final C3197g3 m31133E() {
        C3197g3 c3197g3 = this.f8610i;
        if (c3197g3 == null || !c3197g3.m31343n()) {
            return null;
        }
        return c3197g3;
    }

    @Pure
    /* renamed from: F */
    public final C3340t3 m31132F() {
        m31099u(this.f8609h);
        return this.f8609h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SideEffectFree
    /* renamed from: G */
    public final C3220i4 m31131G() {
        return this.f8611j;
    }

    @Pure
    /* renamed from: I */
    public final C3233j6 m31129I() {
        m31098v(this.f8617p);
        return this.f8617p;
    }

    @Pure
    /* renamed from: J */
    public final C3277n6 m31128J() {
        m31097w(this.f8619r);
        return this.f8619r;
    }

    @Pure
    /* renamed from: K */
    public final C3373w6 m31127K() {
        m31098v(this.f8616o);
        return this.f8616o;
    }

    @Pure
    /* renamed from: L */
    public final C3374w7 m31126L() {
        m31098v(this.f8622u);
        return this.f8622u;
    }

    @Pure
    /* renamed from: M */
    public final C3268m8 m31125M() {
        m31098v(this.f8612k);
        return this.f8612k;
    }

    @Pure
    /* renamed from: N */
    public final C3203g9 m31124N() {
        m31099u(this.f8613l);
        return this.f8613l;
    }

    @Pure
    /* renamed from: O */
    public final String m31123O() {
        return this.f8603b;
    }

    @Pure
    /* renamed from: P */
    public final String m31122P() {
        return this.f8604c;
    }

    @Pure
    /* renamed from: Q */
    public final String m31121Q() {
        return this.f8605d;
    }

    @Pure
    /* renamed from: R */
    public final String m31120R() {
        return this.f8620s;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3199g5
    @Pure
    /* renamed from: b */
    public final C3220i4 mo31118b() {
        m31097w(this.f8611j);
        return this.f8611j;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3199g5
    @Pure
    /* renamed from: c */
    public final Context mo31117c() {
        return this.f8602a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3199g5
    @Pure
    /* renamed from: d */
    public final C3197g3 mo31116d() {
        m31097w(this.f8610i);
        return this.f8610i;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3199g5
    @Pure
    /* renamed from: e */
    public final InterfaceC5003d mo31115e() {
        return this.f8615n;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3199g5
    @Pure
    /* renamed from: f */
    public final C3138b mo31114f() {
        return this.f8607f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m31113g() {
        this.f8600F.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m31112h(String str, int i, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            mo31116d().m31327w().m31396c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th2);
        }
        if (th2 == null) {
            m31132F().f8974r.m31057a(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString("deeplink", BuildConfig.VERSION_NAME);
                    String optString2 = jSONObject.optString("gclid", BuildConfig.VERSION_NAME);
                    double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(optString)) {
                        mo31116d().m31333q().m31398a("Deferred Deep Link is empty.");
                        return;
                    }
                    C3203g9 m31124N = m31124N();
                    C3242k4 c3242k4 = m31124N.f8410a;
                    if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m31124N.f8410a.f8602a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f8617p.m31150u("auto", "_cmp", bundle);
                        C3203g9 m31124N2 = m31124N();
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = m31124N2.f8410a.f8602a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                m31124N2.f8410a.f8602a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e) {
                            m31124N2.f8410a.mo31116d().m31332r().m31397b("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                    mo31116d().m31327w().m31396c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                } catch (JSONException e2) {
                    mo31116d().m31332r().m31397b("Failed to parse the Deferred Deep Link response. exception", e2);
                    return;
                }
            }
            mo31116d().m31333q().m31398a("Deferred Deep Link response empty.");
            return;
        }
        mo31116d().m31327w().m31396c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m31111i() {
        this.f8599E++;
    }

    /* renamed from: j */
    public final void m31110j() {
        mo31118b().mo30825h();
        m31097w(m31128J());
        String m30848s = m31136B().m30848s();
        Pair m31005p = m31132F().m31005p(m30848s);
        if (this.f8608g.m31374A() && !((Boolean) m31005p.second).booleanValue() && !TextUtils.isEmpty((CharSequence) m31005p.first)) {
            C3277n6 m31128J = m31128J();
            m31128J.m31346k();
            ConnectivityManager connectivityManager = (ConnectivityManager) m31128J.f8410a.f8602a.getSystemService("connectivity");
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (SecurityException unused) {
                }
            }
            if (networkInfo != null && networkInfo.isConnected()) {
                C3203g9 m31124N = m31124N();
                m31136B().f8410a.f8608g.m31357q();
                URL m31277r = m31124N.m31277r(55005L, m30848s, (String) m31005p.first, m31132F().f8975s.m31039a() - 1);
                if (m31277r != null) {
                    C3277n6 m31128J2 = m31128J();
                    C0077j c0077j = new C0077j(this);
                    m31128J2.mo30825h();
                    m31128J2.m31346k();
                    C2597i.m33076j(m31277r);
                    C2597i.m33076j(c0077j);
                    m31128J2.f8410a.mo31118b().m31240y(new RunnableC3255l6(m31128J2, m30848s, m31277r, null, null, c0077j, null));
                    return;
                }
                return;
            }
            mo31116d().m31327w().m31398a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        mo31116d().m31333q().m31398a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m31109k(boolean z) {
        this.f8595A = Boolean.valueOf(z);
    }

    /* renamed from: l */
    public final void m31108l(boolean z) {
        mo31118b().mo30825h();
        this.f8598D = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final void m31107m(zzcl zzclVar) {
        C0068a c0068a;
        mo31118b().mo30825h();
        C0068a m31004q = m31132F().m31004q();
        C3340t3 m31132F = m31132F();
        C3242k4 c3242k4 = m31132F.f8410a;
        m31132F.mo30825h();
        int i = 100;
        int i2 = m31132F.m31006o().getInt("consent_source", 100);
        C3182f c3182f = this.f8608g;
        C3242k4 c3242k42 = c3182f.f8410a;
        Boolean m31354t = c3182f.m31354t("google_analytics_default_allow_ad_storage");
        C3182f c3182f2 = this.f8608g;
        C3242k4 c3242k43 = c3182f2.f8410a;
        Boolean m31354t2 = c3182f2.m31354t("google_analytics_default_allow_analytics_storage");
        if ((m31354t != null || m31354t2 != null) && m31132F().m30998w(-10)) {
            c0068a = new C0068a(m31354t, m31354t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(m31136B().m30847t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                m31129I().m31184G(C0068a.f178b, -10, this.f8601G);
            } else if (TextUtils.isEmpty(m31136B().m30847t()) && zzclVar != null && zzclVar.f8155C != null && m31132F().m30998w(30)) {
                c0068a = C0068a.m41992a(zzclVar.f8155C);
                if (!c0068a.equals(C0068a.f178b)) {
                    i = 30;
                }
            }
            c0068a = null;
        }
        if (c0068a != null) {
            m31129I().m31184G(c0068a, i, this.f8601G);
            m31004q = c0068a;
        }
        m31129I().m31180K(m31004q);
        if (m31132F().f8961e.m31039a() == 0) {
            mo31116d().m31328v().m31397b("Persisting first open", Long.valueOf(this.f8601G));
            m31132F().f8961e.m31038b(this.f8601G);
        }
        m31129I().f8574n.m31075c();
        if (!m31102r()) {
            if (m31105o()) {
                if (!m31124N().m31306R("android.permission.INTERNET")) {
                    mo31116d().m31332r().m31398a("App is missing INTERNET permission");
                }
                if (!m31124N().m31306R("android.permission.ACCESS_NETWORK_STATE")) {
                    mo31116d().m31332r().m31398a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!C5615c.m23567a(this.f8602a).m23569f() && !this.f8608g.m31368G()) {
                    if (!C3203g9.m31300X(this.f8602a)) {
                        mo31116d().m31332r().m31398a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!C3203g9.m31299Y(this.f8602a, false)) {
                        mo31116d().m31332r().m31398a("AppMeasurementService not registered/enabled");
                    }
                }
                mo31116d().m31332r().m31398a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(m31136B().m30847t()) || !TextUtils.isEmpty(m31136B().m30849r())) {
                C3203g9 m31124N = m31124N();
                String m30847t = m31136B().m30847t();
                C3340t3 m31132F2 = m31132F();
                m31132F2.mo30825h();
                String string = m31132F2.m31006o().getString("gmp_app_id", null);
                String m30849r = m31136B().m30849r();
                C3340t3 m31132F3 = m31132F();
                m31132F3.mo30825h();
                if (m31124N.m31296b0(m30847t, string, m30849r, m31132F3.m31006o().getString("admob_app_id", null))) {
                    mo31116d().m31329u().m31398a("Rechecking which service to use due to a GMP App Id change");
                    C3340t3 m31132F4 = m31132F();
                    m31132F4.mo30825h();
                    Boolean m31003r = m31132F4.m31003r();
                    SharedPreferences.Editor edit = m31132F4.m31006o().edit();
                    edit.clear();
                    edit.apply();
                    if (m31003r != null) {
                        m31132F4.m31002s(m31003r);
                    }
                    m31135C().m31524q();
                    this.f8622u.m30871Q();
                    this.f8622u.m30872P();
                    m31132F().f8961e.m31038b(this.f8601G);
                    m31132F().f8963g.m31015b(null);
                }
                C3340t3 m31132F5 = m31132F();
                String m30847t2 = m31136B().m30847t();
                m31132F5.mo30825h();
                SharedPreferences.Editor edit2 = m31132F5.m31006o().edit();
                edit2.putString("gmp_app_id", m30847t2);
                edit2.apply();
                C3340t3 m31132F6 = m31132F();
                String m30849r2 = m31136B().m30849r();
                m31132F6.mo30825h();
                SharedPreferences.Editor edit3 = m31132F6.m31006o().edit();
                edit3.putString("admob_app_id", m30849r2);
                edit3.apply();
            }
            if (!m31132F().m31004q().m41984i(EnumC3193g.ANALYTICS_STORAGE)) {
                m31132F().f8963g.m31015b(null);
            }
            m31129I().m31188C(m31132F().f8963g.m31016a());
            C2864lc.m32472b();
            if (this.f8608g.m31373B(null, C3339t2.f8918e0)) {
                try {
                    m31124N().f8410a.f8602a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(m31132F().f8976t.m31016a())) {
                        mo31116d().m31327w().m31398a("Remote config removed with active feature rollouts");
                        m31132F().f8976t.m31015b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m31136B().m30847t()) || !TextUtils.isEmpty(m31136B().m30849r())) {
                boolean m31105o = m31105o();
                if (!m31132F().m31000u() && !this.f8608g.m31370E()) {
                    m31132F().m31001t(!m31105o);
                }
                if (m31105o) {
                    m31129I().m31158g0();
                }
                m31125M().f8687d.m31093a();
                m31126L().m30869S(new AtomicReference());
                m31126L().m30857v(m31132F().f8979w.m31049a());
            }
        }
        m31132F().f8970n.m31057a(true);
    }

    /* renamed from: n */
    public final boolean m31106n() {
        return this.f8595A != null && this.f8595A.booleanValue();
    }

    /* renamed from: o */
    public final boolean m31105o() {
        return m31096x() == 0;
    }

    /* renamed from: p */
    public final boolean m31104p() {
        mo31118b().mo30825h();
        return this.f8598D;
    }

    @Pure
    /* renamed from: q */
    public final boolean m31103q() {
        return TextUtils.isEmpty(this.f8603b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean m31102r() {
        if (this.f8625x) {
            mo31118b().mo30825h();
            Boolean bool = this.f8626y;
            if (bool == null || this.f8627z == 0 || (!bool.booleanValue() && Math.abs(this.f8615n.mo25912c() - this.f8627z) > 1000)) {
                this.f8627z = this.f8615n.mo25912c();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(m31124N().m31306R("android.permission.INTERNET") && m31124N().m31306R("android.permission.ACCESS_NETWORK_STATE") && (C5615c.m23567a(this.f8602a).m23569f() || this.f8608g.m31368G() || (C3203g9.m31300X(this.f8602a) && C3203g9.m31299Y(this.f8602a, false))));
                this.f8626y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!m31124N().m31313K(m31136B().m30847t(), m31136B().m30849r()) && TextUtils.isEmpty(m31136B().m30849r())) {
                        z = false;
                    }
                    this.f8626y = Boolean.valueOf(z);
                }
            }
            return this.f8626y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: s */
    public final boolean m31101s() {
        return this.f8606e;
    }

    /* renamed from: x */
    public final int m31096x() {
        mo31118b().mo30825h();
        if (this.f8608g.m31370E()) {
            return 1;
        }
        Boolean bool = this.f8597C;
        if (bool == null || !bool.booleanValue()) {
            mo31118b().mo30825h();
            if (this.f8598D) {
                Boolean m31003r = m31132F().m31003r();
                if (m31003r != null) {
                    return m31003r.booleanValue() ? 0 : 3;
                }
                C3182f c3182f = this.f8608g;
                C3138b c3138b = c3182f.f8410a.f8607f;
                Boolean m31354t = c3182f.m31354t("firebase_analytics_collection_enabled");
                if (m31354t != null) {
                    return m31354t.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.f8596B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f8595A == null || this.f8595A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Pure
    /* renamed from: y */
    public final C3398z1 m31095y() {
        C3398z1 c3398z1 = this.f8618q;
        if (c3398z1 != null) {
            return c3398z1;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final C3182f m31094z() {
        return this.f8608g;
    }
}
