package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.w6 */
/* loaded from: classes.dex */
public final class C3373w6 extends AbstractC3380x3 {

    /* renamed from: c */
    private volatile C3299p6 f9059c;

    /* renamed from: d */
    private volatile C3299p6 f9060d;

    /* renamed from: e */
    protected C3299p6 f9061e;

    /* renamed from: f */
    private final Map f9062f;

    /* renamed from: g */
    private Activity f9063g;

    /* renamed from: h */
    private volatile boolean f9064h;

    /* renamed from: i */
    private volatile C3299p6 f9065i;

    /* renamed from: j */
    private C3299p6 f9066j;

    /* renamed from: k */
    private boolean f9067k;

    /* renamed from: l */
    private final Object f9068l;

    /* renamed from: m */
    private String f9069m;

    public C3373w6(C3242k4 c3242k4) {
        super(c3242k4);
        this.f9068l = new Object();
        this.f9062f = new ConcurrentHashMap();
    }

    /* renamed from: H */
    private final C3299p6 m30900H(Activity activity) {
        C2597i.m33076j(activity);
        C3299p6 c3299p6 = (C3299p6) this.f9062f.get(activity);
        if (c3299p6 == null) {
            C3299p6 c3299p62 = new C3299p6(null, m30893u(activity.getClass(), "Activity"), this.f8410a.m31124N().m31276r0());
            this.f9062f.put(activity, c3299p62);
            c3299p6 = c3299p62;
        }
        return this.f9065i != null ? this.f9065i : c3299p6;
    }

    /* renamed from: o */
    private final void m30899o(Activity activity, C3299p6 c3299p6, boolean z) {
        C3299p6 c3299p62;
        C3299p6 c3299p63 = this.f9059c == null ? this.f9060d : this.f9059c;
        if (c3299p6.f8775b == null) {
            c3299p62 = new C3299p6(c3299p6.f8774a, activity != null ? m30893u(activity.getClass(), "Activity") : null, c3299p6.f8776c, c3299p6.f8778e, c3299p6.f8779f);
        } else {
            c3299p62 = c3299p6;
        }
        this.f9060d = this.f9059c;
        this.f9059c = c3299p62;
        this.f8410a.mo31118b().m31239z(new RunnableC3321r6(this, c3299p62, c3299p63, this.f8410a.mo31115e().mo25912c(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m30898p(C3299p6 c3299p6, C3299p6 c3299p62, long j, boolean z, Bundle bundle) {
        Bundle bundle2;
        long j2;
        long j3;
        mo30825h();
        boolean z2 = false;
        boolean z3 = (c3299p62 != null && c3299p62.f8776c == c3299p6.f8776c && C3203g9.m31298Z(c3299p62.f8775b, c3299p6.f8775b) && C3203g9.m31298Z(c3299p62.f8774a, c3299p6.f8774a)) ? false : true;
        if (z && this.f9061e != null) {
            z2 = true;
        }
        if (z3) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            C3203g9.m31265x(c3299p6, bundle3, true);
            if (c3299p62 != null) {
                String str = c3299p62.f8774a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = c3299p62.f8775b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", c3299p62.f8776c);
            }
            if (z2) {
                C3235j8 c3235j8 = this.f8410a.m31125M().f8688e;
                long j4 = j - c3235j8.f8580b;
                c3235j8.f8580b = j;
                if (j4 > 0) {
                    this.f8410a.m31124N().m31269v(bundle3, j4);
                }
            }
            if (!this.f8410a.m31094z().m31371D()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != c3299p6.f8778e ? "auto" : "app";
            long mo25914a = this.f8410a.mo31115e().mo25914a();
            if (c3299p6.f8778e) {
                j2 = mo25914a;
                long j5 = c3299p6.f8779f;
                if (j5 != 0) {
                    j3 = j5;
                    this.f8410a.m31129I().m31149v(str3, "_vs", j3, bundle3);
                }
            } else {
                j2 = mo25914a;
            }
            j3 = j2;
            this.f8410a.m31129I().m31149v(str3, "_vs", j3, bundle3);
        }
        if (z2) {
            m30897q(this.f9061e, true, j);
        }
        this.f9061e = c3299p6;
        if (c3299p6.f8778e) {
            this.f9066j = c3299p6;
        }
        this.f8410a.m31126L().m30858u(c3299p6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m30897q(C3299p6 c3299p6, boolean z, long j) {
        this.f8410a.m31095y().m30829n(this.f8410a.mo31115e().mo25912c());
        if (!this.f8410a.m31125M().f8688e.m31141d(c3299p6 != null && c3299p6.f8777d, z, j) || c3299p6 == null) {
            return;
        }
        c3299p6.f8777d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static /* bridge */ /* synthetic */ void m30890x(C3373w6 c3373w6, Bundle bundle, C3299p6 c3299p6, C3299p6 c3299p62, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c3373w6.m30898p(c3299p6, c3299p62, j, true, c3373w6.f8410a.m31124N().m31268v0(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m30907A(Activity activity) {
        synchronized (this.f9068l) {
            if (activity == this.f9063g) {
                this.f9063g = null;
            }
        }
        if (this.f8410a.m31094z().m31371D()) {
            this.f9062f.remove(activity);
        }
    }

    /* renamed from: B */
    public final void m30906B(Activity activity) {
        synchronized (this.f9068l) {
            this.f9067k = false;
            this.f9064h = true;
        }
        long mo25912c = this.f8410a.mo31115e().mo25912c();
        if (!this.f8410a.m31094z().m31371D()) {
            this.f9059c = null;
            this.f8410a.mo31118b().m31239z(new RunnableC3343t6(this, mo25912c));
            return;
        }
        C3299p6 m30900H = m30900H(activity);
        this.f9060d = this.f9059c;
        this.f9059c = null;
        this.f8410a.mo31118b().m31239z(new RunnableC3353u6(this, m30900H, mo25912c));
    }

    /* renamed from: C */
    public final void m30905C(Activity activity) {
        synchronized (this.f9068l) {
            this.f9067k = true;
            if (activity != this.f9063g) {
                synchronized (this.f9068l) {
                    this.f9063g = activity;
                    this.f9064h = false;
                }
                if (this.f8410a.m31094z().m31371D()) {
                    this.f9065i = null;
                    this.f8410a.mo31118b().m31239z(new RunnableC3363v6(this));
                }
            }
        }
        if (!this.f8410a.m31094z().m31371D()) {
            this.f9059c = this.f9065i;
            this.f8410a.mo31118b().m31239z(new RunnableC3332s6(this));
            return;
        }
        m30899o(activity, m30900H(activity), false);
        C3398z1 m31095y = this.f8410a.m31095y();
        m31095y.f8410a.mo31118b().m31239z(new RunnableC3387y0(m31095y, m31095y.f8410a.mo31115e().mo25912c()));
    }

    /* renamed from: D */
    public final void m30904D(Activity activity, Bundle bundle) {
        C3299p6 c3299p6;
        if (!this.f8410a.m31094z().m31371D() || bundle == null || (c3299p6 = (C3299p6) this.f9062f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c3299p6.f8776c);
        bundle2.putString("name", c3299p6.f8774a);
        bundle2.putString("referrer_name", c3299p6.f8775b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m30903E(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.k4 r0 = r3.f8410a
            com.google.android.gms.measurement.internal.f r0 = r0.m31094z()
            boolean r0 = r0.m31371D()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31326x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.m31398a(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.p6 r0 = r3.f9059c
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31326x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.m31398a(r5)
            return
        L30:
            java.util.Map r1 = r3.f9062f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31326x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.m31398a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.m30893u(r6, r1)
        L54:
            java.lang.String r1 = r0.f8775b
            boolean r1 = com.google.android.gms.measurement.internal.C3203g9.m31298Z(r1, r6)
            java.lang.String r0 = r0.f8774a
            boolean r0 = com.google.android.gms.measurement.internal.C3203g9.m31298Z(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31326x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.m31398a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.k4 r1 = r3.f8410a
            r1.m31094z()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31326x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.m31397b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.k4 r1 = r3.f8410a
            r1.m31094z()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.k4 r4 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r4 = r4.mo31116d()
            com.google.android.gms.measurement.internal.e3 r4 = r4.m31326x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.m31397b(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.k4 r0 = r3.f8410a
            com.google.android.gms.measurement.internal.g3 r0 = r0.mo31116d()
            com.google.android.gms.measurement.internal.e3 r0 = r0.m31328v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.m31396c(r2, r1, r6)
            com.google.android.gms.measurement.internal.p6 r0 = new com.google.android.gms.measurement.internal.p6
            com.google.android.gms.measurement.internal.k4 r1 = r3.f8410a
            com.google.android.gms.measurement.internal.g9 r1 = r1.m31124N()
            long r1 = r1.m31276r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f9062f
            r5.put(r4, r0)
            r5 = 1
            r3.m30899o(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3373w6.m30903E(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m30902F(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3373w6.m30902F(android.os.Bundle, long):void");
    }

    /* renamed from: G */
    public final void m30901G(String str, C3299p6 c3299p6) {
        mo30825h();
        synchronized (this) {
            String str2 = this.f9069m;
            if (str2 == null || str2.equals(str) || c3299p6 != null) {
                this.f9069m = str;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3380x3
    /* renamed from: n */
    protected final boolean mo30840n() {
        return false;
    }

    /* renamed from: s */
    public final C3299p6 m30895s() {
        return this.f9059c;
    }

    /* renamed from: t */
    public final C3299p6 m30894t(boolean z) {
        m30845i();
        mo30825h();
        if (z) {
            C3299p6 c3299p6 = this.f9061e;
            return c3299p6 != null ? c3299p6 : this.f9066j;
        }
        return this.f9061e;
    }

    /* renamed from: u */
    final String m30893u(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : BuildConfig.VERSION_NAME;
        int length2 = str2.length();
        this.f8410a.m31094z();
        if (length2 > 100) {
            this.f8410a.m31094z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: z */
    public final void m30888z(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f8410a.m31094z().m31371D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f9062f.put(activity, new C3299p6(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
