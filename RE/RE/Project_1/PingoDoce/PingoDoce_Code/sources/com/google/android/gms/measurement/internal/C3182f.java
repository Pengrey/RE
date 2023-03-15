package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.C2632c;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.f */
/* loaded from: classes.dex */
public final class C3182f extends C3177e5 {

    /* renamed from: b */
    private Boolean f8427b;

    /* renamed from: c */
    private InterfaceC3171e f8428c;

    /* renamed from: d */
    private Boolean f8429d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3182f(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8428c = C3160d.f8374a;
    }

    /* renamed from: I */
    public static final long m31366I() {
        return ((Long) C3339t2.f8917e.m31018a(null)).longValue();
    }

    /* renamed from: i */
    public static final long m31365i() {
        return ((Long) C3339t2.f8887E.m31018a(null)).longValue();
    }

    /* renamed from: j */
    private final String m31364j(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.VERSION_NAME);
            C2597i.m33076j(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.f8410a.mo31116d().m31332r().m31397b("Could not find SystemProperties class", e);
            return BuildConfig.VERSION_NAME;
        } catch (IllegalAccessException e2) {
            this.f8410a.mo31116d().m31332r().m31397b("Could not access SystemProperties.get()", e2);
            return BuildConfig.VERSION_NAME;
        } catch (NoSuchMethodException e3) {
            this.f8410a.mo31116d().m31332r().m31397b("Could not find SystemProperties.get() method", e3);
            return BuildConfig.VERSION_NAME;
        } catch (InvocationTargetException e4) {
            this.f8410a.mo31116d().m31332r().m31397b("SystemProperties.get() threw an exception", e4);
            return BuildConfig.VERSION_NAME;
        }
    }

    /* renamed from: A */
    public final boolean m31374A() {
        Boolean m31354t = m31354t("google_analytics_adid_collection_enabled");
        return m31354t == null || m31354t.booleanValue();
    }

    /* renamed from: B */
    public final boolean m31373B(String str, C3328s2 c3328s2) {
        if (str == null) {
            return ((Boolean) c3328s2.m31018a(null)).booleanValue();
        }
        String mo31389a = this.f8428c.mo31389a(str, c3328s2.m31017b());
        if (TextUtils.isEmpty(mo31389a)) {
            return ((Boolean) c3328s2.m31018a(null)).booleanValue();
        }
        return ((Boolean) c3328s2.m31018a(Boolean.valueOf("1".equals(mo31389a)))).booleanValue();
    }

    /* renamed from: C */
    public final boolean m31372C(String str) {
        return "1".equals(this.f8428c.mo31389a(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean m31371D() {
        Boolean m31354t = m31354t("google_analytics_automatic_screen_reporting_enabled");
        return m31354t == null || m31354t.booleanValue();
    }

    /* renamed from: E */
    public final boolean m31370E() {
        this.f8410a.mo31114f();
        Boolean m31354t = m31354t("firebase_analytics_collection_deactivated");
        return m31354t != null && m31354t.booleanValue();
    }

    /* renamed from: F */
    public final boolean m31369F(String str) {
        return "1".equals(this.f8428c.mo31389a(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final boolean m31368G() {
        if (this.f8427b == null) {
            Boolean m31354t = m31354t("app_measurement_lite");
            this.f8427b = m31354t;
            if (m31354t == null) {
                this.f8427b = Boolean.FALSE;
            }
        }
        return this.f8427b.booleanValue() || !this.f8410a.m31101s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean m31367H() {
        if (this.f8429d == null) {
            synchronized (this) {
                if (this.f8429d == null) {
                    ApplicationInfo applicationInfo = this.f8410a.mo31117c().getApplicationInfo();
                    String m32993a = C2632c.m32993a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(m32993a)) {
                            z = true;
                        }
                        this.f8429d = Boolean.valueOf(z);
                    }
                    if (this.f8429d == null) {
                        this.f8429d = Boolean.TRUE;
                        this.f8410a.mo31116d().m31332r().m31398a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f8429d.booleanValue();
    }

    /* renamed from: k */
    public final double m31363k(String str, C3328s2 c3328s2) {
        if (str == null) {
            return ((Double) c3328s2.m31018a(null)).doubleValue();
        }
        String mo31389a = this.f8428c.mo31389a(str, c3328s2.m31017b());
        if (TextUtils.isEmpty(mo31389a)) {
            return ((Double) c3328s2.m31018a(null)).doubleValue();
        }
        try {
            return ((Double) c3328s2.m31018a(Double.valueOf(Double.parseDouble(mo31389a)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c3328s2.m31018a(null)).doubleValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final int m31362l(String str) {
        return m31358p(str, C3339t2.f8891I, 500, 2000);
    }

    /* renamed from: m */
    public final int m31361m() {
        C3203g9 m31124N = this.f8410a.m31124N();
        Boolean m30878J = m31124N.f8410a.m31126L().m30878J();
        if (m31124N.m31282o0() < 201500) {
            return (m30878J == null || m30878J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: n */
    public final int m31360n(String str) {
        return m31358p(str, C3339t2.f8892J, 25, 100);
    }

    /* renamed from: o */
    public final int m31359o(String str, C3328s2 c3328s2) {
        if (str == null) {
            return ((Integer) c3328s2.m31018a(null)).intValue();
        }
        String mo31389a = this.f8428c.mo31389a(str, c3328s2.m31017b());
        if (TextUtils.isEmpty(mo31389a)) {
            return ((Integer) c3328s2.m31018a(null)).intValue();
        }
        try {
            return ((Integer) c3328s2.m31018a(Integer.valueOf(Integer.parseInt(mo31389a)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c3328s2.m31018a(null)).intValue();
        }
    }

    /* renamed from: p */
    public final int m31358p(String str, C3328s2 c3328s2, int i, int i2) {
        return Math.max(Math.min(m31359o(str, c3328s2), i2), i);
    }

    /* renamed from: q */
    public final long m31357q() {
        this.f8410a.mo31114f();
        return 55005L;
    }

    /* renamed from: r */
    public final long m31356r(String str, C3328s2 c3328s2) {
        if (str == null) {
            return ((Long) c3328s2.m31018a(null)).longValue();
        }
        String mo31389a = this.f8428c.mo31389a(str, c3328s2.m31017b());
        if (TextUtils.isEmpty(mo31389a)) {
            return ((Long) c3328s2.m31018a(null)).longValue();
        }
        try {
            return ((Long) c3328s2.m31018a(Long.valueOf(Long.parseLong(mo31389a)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c3328s2.m31018a(null)).longValue();
        }
    }

    /* renamed from: s */
    final Bundle m31355s() {
        try {
            if (this.f8410a.mo31117c().getPackageManager() == null) {
                this.f8410a.mo31116d().m31332r().m31398a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m23572c = C5615c.m23567a(this.f8410a.mo31117c()).m23572c(this.f8410a.mo31117c().getPackageName(), 128);
            if (m23572c == null) {
                this.f8410a.mo31116d().m31332r().m31398a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return m23572c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            this.f8410a.mo31116d().m31332r().m31397b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final Boolean m31354t(String str) {
        C2597i.m33080f(str);
        Bundle m31355s = m31355s();
        if (m31355s == null) {
            this.f8410a.mo31116d().m31332r().m31398a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (m31355s.containsKey(str)) {
            return Boolean.valueOf(m31355s.getBoolean(str));
        } else {
            return null;
        }
    }

    /* renamed from: u */
    public final String m31353u() {
        return m31364j("debug.firebase.analytics.app", BuildConfig.VERSION_NAME);
    }

    /* renamed from: v */
    public final String m31352v() {
        return m31364j("debug.deferred.deeplink", BuildConfig.VERSION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final String m31351w() {
        this.f8410a.mo31114f();
        return "FA";
    }

    /* renamed from: x */
    public final String m31350x(String str, C3328s2 c3328s2) {
        if (str == null) {
            return (String) c3328s2.m31018a(null);
        }
        return (String) c3328s2.m31018a(this.f8428c.mo31389a(str, c3328s2.m31017b()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m31349y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.C2597i.m33080f(r4)
            android.os.Bundle r0 = r3.m31355s()
            r1 = 0
            if (r0 != 0) goto L1d
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31332r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m31398a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.google.android.gms.measurement.internal.k4 r0 = r3.f8410a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.mo31117c()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.google.android.gms.measurement.internal.k4 r0 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r0 = r0.mo31116d()
            com.google.android.gms.measurement.internal.e3 r0 = r0.m31332r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m31397b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3182f.m31349y(java.lang.String):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m31348z(InterfaceC3171e interfaceC3171e) {
        this.f8428c = interfaceC3171e;
    }
}
