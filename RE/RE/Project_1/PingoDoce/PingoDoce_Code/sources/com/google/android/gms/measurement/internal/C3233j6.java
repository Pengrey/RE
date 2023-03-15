package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.util.C2633d;
import com.google.android.gms.internal.measurement.C2864lc;
import com.google.android.gms.internal.measurement.C2912oc;
import com.google.android.gms.internal.measurement.C3008ud;
import com.google.android.gms.internal.measurement.C3022vc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p009a8.C0068a;
import p009a8.C0078k;
import p009a8.C0079l;
import p009a8.InterfaceC0082o;
import p009a8.InterfaceC0083p;
import p078e7.C5004e;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j6 */
/* loaded from: classes.dex */
public final class C3233j6 extends AbstractC3380x3 {

    /* renamed from: c */
    protected C3222i6 f8563c;

    /* renamed from: d */
    private InterfaceC0082o f8564d;

    /* renamed from: e */
    private final Set f8565e;

    /* renamed from: f */
    private boolean f8566f;

    /* renamed from: g */
    private final AtomicReference f8567g;

    /* renamed from: h */
    private final Object f8568h;

    /* renamed from: i */
    private C0068a f8569i;

    /* renamed from: j */
    private int f8570j;

    /* renamed from: k */
    private final AtomicLong f8571k;

    /* renamed from: l */
    private long f8572l;

    /* renamed from: m */
    private int f8573m;

    /* renamed from: n */
    final C3269m9 f8574n;

    /* renamed from: o */
    protected boolean f8575o;

    /* renamed from: p */
    private final InterfaceC3192f9 f8576p;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3233j6(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8565e = new CopyOnWriteArraySet();
        this.f8568h = new Object();
        this.f8575o = true;
        this.f8576p = new C3392y5(this);
        this.f8567g = new AtomicReference();
        this.f8569i = new C0068a(null, null);
        this.f8570j = 100;
        this.f8572l = -1L;
        this.f8573m = 100;
        this.f8571k = new AtomicLong(0L);
        this.f8574n = new C3269m9(c3242k4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m31155p(Bundle bundle, long j) {
        if (TextUtils.isEmpty(this.f8410a.m31136B().m30847t())) {
            m31185F(bundle, 0, j);
        } else {
            this.f8410a.mo31116d().m31326x().m31398a("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final void m31174Q(Boolean bool, boolean z) {
        mo30825h();
        m30845i();
        this.f8410a.mo31116d().m31333q().m31397b("Setting app measurement enabled (FE)", bool);
        this.f8410a.m31132F().m31002s(bool);
        if (z) {
            C3340t3 m31132F = this.f8410a.m31132F();
            C3242k4 c3242k4 = m31132F.f8410a;
            m31132F.mo30825h();
            SharedPreferences.Editor edit = m31132F.m31006o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f8410a.m31104p() || !(bool == null || bool.booleanValue())) {
            m31173R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m31173R() {
        mo30825h();
        String m31016a = this.f8410a.m31132F().f8969m.m31016a();
        if (m31016a != null) {
            if ("unset".equals(m31016a)) {
                m31177N("app", "_npa", null, this.f8410a.mo31115e().mo25914a());
            } else {
                m31177N("app", "_npa", Long.valueOf(true != "true".equals(m31016a) ? 0L : 1L), this.f8410a.mo31115e().mo25914a());
            }
        }
        if (this.f8410a.m31105o() && this.f8575o) {
            this.f8410a.mo31116d().m31333q().m31398a("Recording app launch after enabling measurement for the first time (FE)");
            m31158g0();
            C3022vc.m31917b();
            if (this.f8410a.m31094z().m31373B(null, C3339t2.f8920f0)) {
                this.f8410a.m31125M().f8687d.m31093a();
            }
            this.f8410a.mo31118b().m31239z(new RunnableC3276n5(this));
            return;
        }
        this.f8410a.mo31116d().m31333q().m31398a("Updating Scion state (FE)");
        this.f8410a.m31126L().m30856w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* synthetic */ void m31161d0(C3233j6 c3233j6, C0068a c0068a, int i, long j, boolean z, boolean z2) {
        c3233j6.mo30825h();
        c3233j6.m30845i();
        if (j <= c3233j6.f8572l && C0068a.m41983j(c3233j6.f8573m, i)) {
            c3233j6.f8410a.mo31116d().m31329u().m31397b("Dropped out-of-date consent setting, proposed settings", c0068a);
            return;
        }
        C3340t3 m31132F = c3233j6.f8410a.m31132F();
        C3242k4 c3242k4 = m31132F.f8410a;
        m31132F.mo30825h();
        if (m31132F.m30998w(i)) {
            SharedPreferences.Editor edit = m31132F.m31006o().edit();
            edit.putString("consent_settings", c0068a.m41985h());
            edit.putInt("consent_source", i);
            edit.apply();
            c3233j6.f8572l = j;
            c3233j6.f8573m = i;
            c3233j6.f8410a.m31126L().m30859t(z);
            if (z2) {
                c3233j6.f8410a.m31126L().m30869S(new AtomicReference());
                return;
            }
            return;
        }
        c3233j6.f8410a.mo31116d().m31329u().m31397b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
    }

    /* renamed from: A */
    protected final void m31190A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f8410a.mo31118b().m31239z(new RunnableC3309q5(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: B */
    final void m31189B(String str, String str2, long j, Object obj) {
        this.f8410a.mo31118b().m31239z(new RunnableC3320r5(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final void m31188C(String str) {
        this.f8567g.set(str);
    }

    /* renamed from: D */
    public final void m31187D(Bundle bundle) {
        m31186E(bundle, this.f8410a.mo31115e().mo25914a());
    }

    /* renamed from: E */
    public final void m31186E(Bundle bundle, long j) {
        C2597i.m33076j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f8410a.mo31116d().m31327w().m31398a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C2597i.m33076j(bundle2);
        C0078k.m41976a(bundle2, "app_id", String.class, null);
        C0078k.m41976a(bundle2, "origin", String.class, null);
        C0078k.m41976a(bundle2, "name", String.class, null);
        C0078k.m41976a(bundle2, "value", Object.class, null);
        C0078k.m41976a(bundle2, "trigger_event_name", String.class, null);
        C0078k.m41976a(bundle2, "trigger_timeout", Long.class, 0L);
        C0078k.m41976a(bundle2, "timed_out_event_name", String.class, null);
        C0078k.m41976a(bundle2, "timed_out_event_params", Bundle.class, null);
        C0078k.m41976a(bundle2, "triggered_event_name", String.class, null);
        C0078k.m41976a(bundle2, "triggered_event_params", Bundle.class, null);
        C0078k.m41976a(bundle2, "time_to_live", Long.class, 0L);
        C0078k.m41976a(bundle2, "expired_event_name", String.class, null);
        C0078k.m41976a(bundle2, "expired_event_params", Bundle.class, null);
        C2597i.m33080f(bundle2.getString("name"));
        C2597i.m33080f(bundle2.getString("origin"));
        C2597i.m33076j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f8410a.m31124N().m31284n0(string) == 0) {
            if (this.f8410a.m31124N().m31288j0(string, obj) == 0) {
                Object m31281p = this.f8410a.m31124N().m31281p(string, obj);
                if (m31281p == null) {
                    this.f8410a.mo31116d().m31332r().m31396c("Unable to normalize conditional user property value", this.f8410a.m31134D().m31452f(string), obj);
                    return;
                }
                C0078k.m41975b(bundle2, m31281p);
                long j2 = bundle2.getLong("trigger_timeout");
                if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                    this.f8410a.m31094z();
                    if (j2 > 15552000000L || j2 < 1) {
                        this.f8410a.mo31116d().m31332r().m31396c("Invalid conditional user property timeout", this.f8410a.m31134D().m31452f(string), Long.valueOf(j2));
                        return;
                    }
                }
                long j3 = bundle2.getLong("time_to_live");
                this.f8410a.m31094z();
                if (j3 <= 15552000000L && j3 >= 1) {
                    this.f8410a.mo31118b().m31239z(new RunnableC3342t5(this, bundle2));
                    return;
                } else {
                    this.f8410a.mo31116d().m31332r().m31396c("Invalid conditional user property time to live", this.f8410a.m31134D().m31452f(string), Long.valueOf(j3));
                    return;
                }
            }
            this.f8410a.mo31116d().m31332r().m31396c("Invalid conditional user property value", this.f8410a.m31134D().m31452f(string), obj);
            return;
        }
        this.f8410a.mo31116d().m31332r().m31397b("Invalid conditional user property name", this.f8410a.m31134D().m31452f(string));
    }

    /* renamed from: F */
    public final void m31185F(Bundle bundle, int i, long j) {
        m30845i();
        String m41986g = C0068a.m41986g(bundle);
        if (m41986g != null) {
            this.f8410a.mo31116d().m31326x().m31397b("Ignoring invalid consent setting", m41986g);
            this.f8410a.mo31116d().m31326x().m31398a("Valid consent values are 'granted', 'denied'");
        }
        m31184G(C0068a.m41992a(bundle), i, j);
    }

    /* renamed from: G */
    public final void m31184G(C0068a c0068a, int i, long j) {
        boolean z;
        boolean z2;
        C0068a c0068a2;
        boolean z3;
        m30845i();
        if (i != -10 && c0068a.m41988e() == null && c0068a.m41987f() == null) {
            this.f8410a.mo31116d().m31326x().m31398a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f8568h) {
            z = true;
            z2 = false;
            if (C0068a.m41983j(i, this.f8570j)) {
                boolean m41982k = c0068a.m41982k(this.f8569i);
                EnumC3193g enumC3193g = EnumC3193g.ANALYTICS_STORAGE;
                if (c0068a.m41984i(enumC3193g) && !this.f8569i.m41984i(enumC3193g)) {
                    z2 = true;
                }
                C0068a m41989d = c0068a.m41989d(this.f8569i);
                this.f8569i = m41989d;
                this.f8570j = i;
                c0068a2 = m41989d;
                z3 = z2;
                z2 = m41982k;
            } else {
                c0068a2 = c0068a;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.f8410a.mo31116d().m31329u().m31397b("Ignoring lower-priority consent settings, proposed settings", c0068a2);
            return;
        }
        long andIncrement = this.f8571k.getAndIncrement();
        if (z2) {
            this.f8567g.set(null);
            this.f8410a.mo31118b().m31255A(new RunnableC3178e6(this, c0068a2, j, i, andIncrement, z3));
        } else if (i != 30 && i != -10) {
            this.f8410a.mo31118b().m31239z(new RunnableC3200g6(this, c0068a2, i, andIncrement, z3));
        } else {
            this.f8410a.mo31118b().m31255A(new RunnableC3189f6(this, c0068a2, i, andIncrement, z3));
        }
    }

    /* renamed from: H */
    public final void m31183H(final Bundle bundle, final long j) {
        C2912oc.m32332b();
        if (this.f8410a.m31094z().m31373B(null, C3339t2.f8930k0)) {
            this.f8410a.mo31118b().m31255A(new Runnable() { // from class: com.google.android.gms.measurement.internal.l5
                @Override // java.lang.Runnable
                public final void run() {
                    C3233j6.this.m31155p(bundle, j);
                }
            });
        } else {
            m31155p(bundle, j);
        }
    }

    /* renamed from: I */
    public final void m31182I(InterfaceC0082o interfaceC0082o) {
        InterfaceC0082o interfaceC0082o2;
        mo30825h();
        m30845i();
        if (interfaceC0082o != null && interfaceC0082o != (interfaceC0082o2 = this.f8564d)) {
            C2597i.m33072n(interfaceC0082o2 == null, "EventInterceptor already set.");
        }
        this.f8564d = interfaceC0082o;
    }

    /* renamed from: J */
    public final void m31181J(Boolean bool) {
        m30845i();
        this.f8410a.mo31118b().m31239z(new RunnableC3167d6(this, bool));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final void m31180K(C0068a c0068a) {
        mo30825h();
        boolean z = (c0068a.m41984i(EnumC3193g.ANALYTICS_STORAGE) && c0068a.m41984i(EnumC3193g.AD_STORAGE)) || this.f8410a.m31126L().m30887A();
        if (z != this.f8410a.m31104p()) {
            this.f8410a.m31108l(z);
            C3340t3 m31132F = this.f8410a.m31132F();
            C3242k4 c3242k4 = m31132F.f8410a;
            m31132F.mo30825h();
            Boolean valueOf = m31132F.m31006o().contains("measurement_enabled_from_api") ? Boolean.valueOf(m31132F.m31006o().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m31174Q(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: L */
    public final void m31179L(String str, String str2, Object obj, boolean z) {
        m31178M("auto", "_ldl", obj, true, this.f8410a.mo31115e().mo25914a());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31178M(java.lang.String r16, java.lang.String r17, java.lang.Object r18, boolean r19, long r20) {
        /*
            r15 = this;
            r6 = r15
            r2 = r17
            r0 = r18
            if (r16 != 0) goto La
            java.lang.String r1 = "app"
            goto Lc
        La:
            r1 = r16
        Lc:
            r3 = 6
            r4 = 0
            r5 = 24
            if (r19 == 0) goto L1e
            com.google.android.gms.measurement.internal.k4 r3 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r3 = r3.m31124N()
            int r3 = r3.m31284n0(r2)
        L1c:
            r11 = r3
            goto L46
        L1e:
            com.google.android.gms.measurement.internal.k4 r7 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r7 = r7.m31124N()
            java.lang.String r8 = "user property"
            boolean r9 = r7.m31307Q(r8, r2)
            if (r9 != 0) goto L2d
        L2c:
            goto L1c
        L2d:
            java.lang.String[] r9 = p009a8.C0081n.f192a
            r10 = 0
            boolean r9 = r7.m31311M(r8, r9, r10, r2)
            if (r9 != 0) goto L39
            r3 = 15
            goto L1c
        L39:
            com.google.android.gms.measurement.internal.k4 r9 = r7.f8410a
            r9.m31094z()
            boolean r7 = r7.m31312L(r8, r5, r2)
            if (r7 != 0) goto L45
            goto L2c
        L45:
            r11 = r4
        L46:
            r3 = 1
            if (r11 == 0) goto L6e
            com.google.android.gms.measurement.internal.k4 r0 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r0 = r0.m31124N()
            com.google.android.gms.measurement.internal.k4 r1 = r6.f8410a
            r1.m31094z()
            java.lang.String r13 = r0.m31279q(r2, r5, r3)
            if (r2 == 0) goto L5e
            int r4 = r17.length()
        L5e:
            r14 = r4
            com.google.android.gms.measurement.internal.k4 r0 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r8 = r0.m31124N()
            com.google.android.gms.measurement.internal.f9 r9 = r6.f8576p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.m31323A(r9, r10, r11, r12, r13, r14)
            return
        L6e:
            if (r0 == 0) goto Lc0
            com.google.android.gms.measurement.internal.k4 r7 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r7 = r7.m31124N()
            int r11 = r7.m31288j0(r2, r0)
            if (r11 == 0) goto Lab
            com.google.android.gms.measurement.internal.k4 r1 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r1 = r1.m31124N()
            com.google.android.gms.measurement.internal.k4 r7 = r6.f8410a
            r7.m31094z()
            java.lang.String r13 = r1.m31279q(r2, r5, r3)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L93
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L9b
        L93:
            java.lang.String r0 = r18.toString()
            int r4 = r0.length()
        L9b:
            r14 = r4
            com.google.android.gms.measurement.internal.k4 r0 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r8 = r0.m31124N()
            com.google.android.gms.measurement.internal.f9 r9 = r6.f8576p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.m31323A(r9, r10, r11, r12, r13, r14)
            return
        Lab:
            com.google.android.gms.measurement.internal.k4 r3 = r6.f8410a
            com.google.android.gms.measurement.internal.g9 r3 = r3.m31124N()
            java.lang.Object r5 = r3.m31281p(r2, r0)
            if (r5 == 0) goto Lbf
            r0 = r15
            r2 = r17
            r3 = r20
            r0.m31189B(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r5 = 0
            r0 = r15
            r2 = r17
            r3 = r20
            r0.m31189B(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3233j6.m31178M(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31177N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.C2597i.m33080f(r9)
            com.google.android.gms.common.internal.C2597i.m33080f(r10)
            r8.mo30825h()
            r8.m30845i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L64
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L52
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.k4 r10 = r8.f8410a
            com.google.android.gms.measurement.internal.t3 r10 = r10.m31132F()
            com.google.android.gms.measurement.internal.s3 r10 = r10.f8969m
            long r4 = r11.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r10.m31015b(r0)
            goto L61
        L52:
            if (r11 != 0) goto L64
            com.google.android.gms.measurement.internal.k4 r10 = r8.f8410a
            com.google.android.gms.measurement.internal.t3 r10 = r10.m31132F()
            com.google.android.gms.measurement.internal.s3 r10 = r10.f8969m
            java.lang.String r0 = "unset"
            r10.m31015b(r0)
        L61:
            r6 = r11
            r3 = r1
            goto L66
        L64:
            r3 = r10
            r6 = r11
        L66:
            com.google.android.gms.measurement.internal.k4 r10 = r8.f8410a
            boolean r10 = r10.m31105o()
            if (r10 != 0) goto L7e
            com.google.android.gms.measurement.internal.k4 r9 = r8.f8410a
            com.google.android.gms.measurement.internal.g3 r9 = r9.mo31116d()
            com.google.android.gms.measurement.internal.e3 r9 = r9.m31328v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m31398a(r10)
            return
        L7e:
            com.google.android.gms.measurement.internal.k4 r10 = r8.f8410a
            boolean r10 = r10.m31102r()
            if (r10 != 0) goto L87
            return
        L87:
            com.google.android.gms.measurement.internal.zzks r10 = new com.google.android.gms.measurement.internal.zzks
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.k4 r9 = r8.f8410a
            com.google.android.gms.measurement.internal.w7 r9 = r9.m31126L()
            r9.m30854y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3233j6.m31177N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: O */
    public final void m31176O(InterfaceC0083p interfaceC0083p) {
        m30845i();
        C2597i.m33076j(interfaceC0083p);
        if (this.f8565e.remove(interfaceC0083p)) {
            return;
        }
        this.f8410a.mo31116d().m31327w().m31398a("OnEventListener had not been registered");
    }

    /* renamed from: S */
    public final int m31172S(String str) {
        C2597i.m33080f(str);
        this.f8410a.m31094z();
        return 25;
    }

    /* renamed from: T */
    public final Boolean m31171T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f8410a.mo31118b().m31247r(atomicReference, 15000L, "boolean test flag value", new RunnableC3362v5(this, atomicReference));
    }

    /* renamed from: U */
    public final Double m31170U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f8410a.mo31118b().m31247r(atomicReference, 15000L, "double test flag value", new RunnableC3156c6(this, atomicReference));
    }

    /* renamed from: V */
    public final Integer m31169V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f8410a.mo31118b().m31247r(atomicReference, 15000L, "int test flag value", new RunnableC3145b6(this, atomicReference));
    }

    /* renamed from: W */
    public final Long m31168W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f8410a.mo31118b().m31247r(atomicReference, 15000L, "long test flag value", new RunnableC3134a6(this, atomicReference));
    }

    /* renamed from: X */
    public final String m31167X() {
        return (String) this.f8567g.get();
    }

    /* renamed from: Y */
    public final String m31166Y() {
        C3299p6 m30895s = this.f8410a.m31127K().m30895s();
        if (m30895s != null) {
            return m30895s.f8775b;
        }
        return null;
    }

    /* renamed from: Z */
    public final String m31165Z() {
        C3299p6 m30895s = this.f8410a.m31127K().m30895s();
        if (m30895s != null) {
            return m30895s.f8774a;
        }
        return null;
    }

    /* renamed from: a0 */
    public final String m31164a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f8410a.mo31118b().m31247r(atomicReference, 15000L, "String test flag value", new RunnableC3402z5(this, atomicReference));
    }

    /* renamed from: b0 */
    public final ArrayList m31163b0(String str, String str2) {
        if (this.f8410a.mo31118b().m31253C()) {
            this.f8410a.mo31116d().m31332r().m31398a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f8410a.mo31114f();
        if (C3138b.m31458a()) {
            this.f8410a.mo31116d().m31332r().m31398a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f8410a.mo31118b().m31247r(atomicReference, 5000L, "get conditional user properties", new RunnableC3372w5(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f8410a.mo31116d().m31332r().m31397b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return C3203g9.m31271u(list);
    }

    /* renamed from: c0 */
    public final Map m31162c0(String str, String str2, boolean z) {
        if (this.f8410a.mo31118b().m31253C()) {
            this.f8410a.mo31116d().m31332r().m31398a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f8410a.mo31114f();
        if (C3138b.m31458a()) {
            this.f8410a.mo31116d().m31332r().m31398a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f8410a.mo31118b().m31247r(atomicReference, 5000L, "get user properties", new RunnableC3382x5(this, atomicReference, null, str, str2, z));
        List<zzks> list = (List) atomicReference.get();
        if (list == null) {
            this.f8410a.mo31116d().m31332r().m31397b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C9545a c9545a = new C9545a(list.size());
        for (zzks zzksVar : list) {
            Object m30815h = zzksVar.m30815h();
            if (m30815h != null) {
                c9545a.put(zzksVar.f9183x, m30815h);
            }
        }
        return c9545a;
    }

    /* renamed from: g0 */
    public final void m31158g0() {
        mo30825h();
        m30845i();
        if (this.f8410a.m31102r()) {
            if (this.f8410a.m31094z().m31373B(null, C3339t2.f8908Z)) {
                C3182f m31094z = this.f8410a.m31094z();
                m31094z.f8410a.mo31114f();
                Boolean m31354t = m31094z.m31354t("google_analytics_deferred_deep_link_enabled");
                if (m31354t != null && m31354t.booleanValue()) {
                    this.f8410a.mo31116d().m31333q().m31398a("Deferred Deep Link feature enabled.");
                    this.f8410a.mo31118b().m31239z(new Runnable() { // from class: com.google.android.gms.measurement.internal.j5
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3233j6 c3233j6 = C3233j6.this;
                            c3233j6.mo30825h();
                            if (!c3233j6.f8410a.m31132F().f8974r.m31056b()) {
                                long m31039a = c3233j6.f8410a.m31132F().f8975s.m31039a();
                                c3233j6.f8410a.m31132F().f8975s.m31038b(1 + m31039a);
                                c3233j6.f8410a.m31094z();
                                if (m31039a >= 5) {
                                    c3233j6.f8410a.mo31116d().m31327w().m31398a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                    c3233j6.f8410a.m31132F().f8974r.m31057a(true);
                                    return;
                                }
                                c3233j6.f8410a.m31110j();
                                return;
                            }
                            c3233j6.f8410a.mo31116d().m31333q().m31398a("Deferred Deep Link already retrieved. Not fetching again.");
                        }
                    });
                }
            }
            this.f8410a.m31126L().m30873O();
            this.f8575o = false;
            C3340t3 m31132F = this.f8410a.m31132F();
            m31132F.mo30825h();
            String string = m31132F.m31006o().getString("previous_os_version", null);
            m31132F.f8410a.m31137A().m31346k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m31132F.m31006o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f8410a.m31137A().m31346k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m31150u("auto", "_ou", bundle);
        }
    }

    /* renamed from: h0 */
    public final void m31157h0(String str, String str2, Bundle bundle) {
        long mo25914a = this.f8410a.mo31115e().mo25914a();
        C2597i.m33080f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo25914a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f8410a.mo31118b().m31239z(new RunnableC3352u5(this, bundle2));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3380x3
    /* renamed from: n */
    protected final boolean mo30840n() {
        return false;
    }

    /* renamed from: o */
    public final void m31156o() {
        if (!(this.f8410a.mo31117c().getApplicationContext() instanceof Application) || this.f8563c == null) {
            return;
        }
        ((Application) this.f8410a.mo31117c().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f8563c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void m31154q(Bundle bundle) {
        if (bundle == null) {
            this.f8410a.m31132F().f8979w.m31048b(new Bundle());
            return;
        }
        Bundle m31049a = this.f8410a.m31132F().f8979w.m31049a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f8410a.m31124N().m31304T(obj)) {
                    this.f8410a.m31124N().m31323A(this.f8576p, null, 27, null, null, 0);
                }
                this.f8410a.mo31116d().m31326x().m31396c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C3203g9.m31302V(str)) {
                this.f8410a.mo31116d().m31326x().m31397b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m31049a.remove(str);
            } else {
                C3203g9 m31124N = this.f8410a.m31124N();
                this.f8410a.m31094z();
                if (m31124N.m31310N("param", str, 100, obj)) {
                    this.f8410a.m31124N().m31322B(m31049a, str, obj);
                }
            }
        }
        this.f8410a.m31124N();
        int m31361m = this.f8410a.m31094z().m31361m();
        if (m31049a.size() > m31361m) {
            int i = 0;
            for (String str2 : new TreeSet(m31049a.keySet())) {
                i++;
                if (i > m31361m) {
                    m31049a.remove(str2);
                }
            }
            this.f8410a.m31124N().m31323A(this.f8576p, null, 26, null, null, 0);
            this.f8410a.mo31116d().m31326x().m31398a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f8410a.m31132F().f8979w.m31048b(m31049a);
        this.f8410a.m31126L().m30857v(m31049a);
    }

    /* renamed from: r */
    public final void m31153r(String str, String str2, Bundle bundle) {
        m31152s(str, str2, bundle, true, true, this.f8410a.mo31115e().mo25914a());
    }

    /* renamed from: s */
    public final void m31152s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (C3203g9.m31298Z(str2, "screen_view")) {
            this.f8410a.m31127K().m30902F(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.f8564d != null && !C3203g9.m31302V(str2)) {
            z3 = false;
        }
        m31190A(str3, str2, j, bundle2, z2, z3, z, null);
    }

    /* renamed from: t */
    public final void m31151t(String str, String str2, Bundle bundle, String str3) {
        C3242k4.m31100t();
        m31190A("auto", str2, this.f8410a.mo31115e().mo25914a(), bundle, false, true, true, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m31150u(String str, String str2, Bundle bundle) {
        mo30825h();
        m31149v(str, str2, this.f8410a.mo31115e().mo25914a(), bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final void m31149v(String str, String str2, long j, Bundle bundle) {
        mo30825h();
        m31148w(str, str2, j, bundle, true, this.f8564d == null || C3203g9.m31302V(str2), true, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m31148w(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        long j2;
        String str5;
        String str6;
        Bundle[] bundleArr;
        Class<?> cls;
        C2597i.m33080f(str);
        C2597i.m33076j(bundle);
        mo30825h();
        m30845i();
        if (this.f8410a.m31105o()) {
            List m30846u = this.f8410a.m31136B().m30846u();
            if (m30846u != null && !m30846u.contains(str2)) {
                this.f8410a.mo31116d().m31333q().m31396c("Dropping non-safelisted event. event name, origin", str2, str);
                return;
            }
            if (!this.f8566f) {
                this.f8566f = true;
                try {
                    if (!this.f8410a.m31101s()) {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f8410a.mo31117c().getClassLoader());
                    } else {
                        cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                    }
                    try {
                        cls.getDeclaredMethod("initialize", Context.class).invoke(null, this.f8410a.mo31117c());
                    } catch (Exception e) {
                        this.f8410a.mo31116d().m31327w().m31397b("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException unused) {
                    this.f8410a.mo31116d().m31329u().m31398a("Tag Manager is not found and thus will not be used");
                }
            }
            if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
                this.f8410a.mo31114f();
                m31177N("auto", "_lgclid", bundle.getString("gclid"), this.f8410a.mo31115e().mo25914a());
            }
            this.f8410a.mo31114f();
            if (z && C3203g9.m31297a0(str2)) {
                this.f8410a.m31124N().m31264y(bundle, this.f8410a.m31132F().f8979w.m31049a());
            }
            if (!z3) {
                this.f8410a.mo31114f();
                if (!"_iap".equals(str2)) {
                    C3203g9 m31124N = this.f8410a.m31124N();
                    int i = 2;
                    if (m31124N.m31307Q("event", str2)) {
                        if (m31124N.m31311M("event", C0079l.f184a, C0079l.f185b, str2)) {
                            m31124N.f8410a.m31094z();
                            if (m31124N.m31312L("event", 40, str2)) {
                                i = 0;
                            }
                        } else {
                            i = 13;
                        }
                    }
                    if (i != 0) {
                        this.f8410a.mo31116d().m31331s().m31397b("Invalid public event name. Event will not be logged (FE)", this.f8410a.m31134D().m31454d(str2));
                        C3203g9 m31124N2 = this.f8410a.m31124N();
                        this.f8410a.m31094z();
                        this.f8410a.m31124N().m31323A(this.f8576p, null, i, "_ev", m31124N2.m31279q(str2, 40, true), str2 != null ? str2.length() : 0);
                        return;
                    }
                }
            }
            C3008ud.m31995b();
            if (this.f8410a.m31094z().m31373B(null, C3339t2.f8946s0)) {
                this.f8410a.mo31114f();
                C3299p6 m30894t = this.f8410a.m31127K().m30894t(false);
                if (m30894t != null && !bundle.containsKey("_sc")) {
                    m30894t.f8777d = true;
                }
                C3203g9.m31265x(m30894t, bundle, z && !z3);
            } else {
                this.f8410a.mo31114f();
                C3299p6 m30894t2 = this.f8410a.m31127K().m30894t(false);
                if (m30894t2 != null && !bundle.containsKey("_sc")) {
                    m30894t2.f8777d = true;
                }
                C3203g9.m31265x(m30894t2, bundle, z && !z3);
            }
            boolean equals = "am".equals(str);
            boolean m31302V = C3203g9.m31302V(str2);
            if (!z || this.f8564d == null || m31302V) {
                z4 = equals;
            } else if (!equals) {
                this.f8410a.mo31116d().m31333q().m31396c("Passing event to registered event handler (FE)", this.f8410a.m31134D().m31454d(str2), this.f8410a.m31134D().m31456b(bundle));
                C2597i.m33076j(this.f8564d);
                this.f8564d.mo31140a(str, str2, bundle, j);
                return;
            } else {
                z4 = true;
            }
            if (this.f8410a.m31102r()) {
                int m31287k0 = this.f8410a.m31124N().m31287k0(str2);
                if (m31287k0 != 0) {
                    this.f8410a.mo31116d().m31331s().m31397b("Invalid event name. Event will not be logged (FE)", this.f8410a.m31134D().m31454d(str2));
                    C3203g9 m31124N3 = this.f8410a.m31124N();
                    this.f8410a.m31094z();
                    this.f8410a.m31124N().m31323A(this.f8576p, str3, m31287k0, "_ev", m31124N3.m31279q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
                Bundle m31268v0 = this.f8410a.m31124N().m31268v0(str3, str2, bundle, C5004e.m25916c("_o", "_sn", "_sc", "_si"), z3);
                C2597i.m33076j(m31268v0);
                this.f8410a.mo31114f();
                if (this.f8410a.m31127K().m30894t(false) != null && "_ae".equals(str2)) {
                    C3235j8 c3235j8 = this.f8410a.m31125M().f8688e;
                    long mo25912c = c3235j8.f8582d.f8410a.mo31115e().mo25912c();
                    long j3 = mo25912c - c3235j8.f8580b;
                    c3235j8.f8580b = mo25912c;
                    if (j3 > 0) {
                        this.f8410a.m31124N().m31269v(m31268v0, j3);
                    }
                }
                C2864lc.m32472b();
                if (this.f8410a.m31094z().m31373B(null, C3339t2.f8918e0)) {
                    if (!"auto".equals(str) && "_ssr".equals(str2)) {
                        C3203g9 m31124N4 = this.f8410a.m31124N();
                        String string = m31268v0.getString("_ffr");
                        if (C2633d.m32992a(string)) {
                            string = null;
                        } else if (string != null) {
                            string = string.trim();
                        }
                        if (!C3203g9.m31298Z(string, m31124N4.f8410a.m31132F().f8976t.m31016a())) {
                            m31124N4.f8410a.m31132F().f8976t.m31015b(string);
                        } else {
                            m31124N4.f8410a.mo31116d().m31333q().m31398a("Not logging duplicate session_start_with_rollout event");
                            return;
                        }
                    } else if ("_ae".equals(str2)) {
                        String m31016a = this.f8410a.m31124N().f8410a.m31132F().f8976t.m31016a();
                        if (!TextUtils.isEmpty(m31016a)) {
                            m31268v0.putString("_ffr", m31016a);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(m31268v0);
                if (this.f8410a.m31132F().f8971o.m31039a() > 0 && this.f8410a.m31132F().m30999v(j) && this.f8410a.m31132F().f8973q.m31056b()) {
                    this.f8410a.mo31116d().m31328v().m31398a("Current session is expired, remove the session number, ID, and engagement time");
                    str4 = "_ae";
                    j2 = 0;
                    m31177N("auto", "_sid", null, this.f8410a.mo31115e().mo25914a());
                    m31177N("auto", "_sno", null, this.f8410a.mo31115e().mo25914a());
                    m31177N("auto", "_se", null, this.f8410a.mo31115e().mo25914a());
                } else {
                    str4 = "_ae";
                    j2 = 0;
                }
                if (m31268v0.getLong("extend_session", j2) == 1) {
                    this.f8410a.mo31116d().m31328v().m31398a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    this.f8410a.m31125M().f8687d.m31092b(j, true);
                }
                ArrayList arrayList2 = new ArrayList(m31268v0.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String str7 = (String) arrayList2.get(i2);
                    if (str7 != null) {
                        this.f8410a.m31124N();
                        Object obj = m31268v0.get(str7);
                        if (obj instanceof Bundle) {
                            bundleArr = new Bundle[]{(Bundle) obj};
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            m31268v0.putParcelableArray(str7, bundleArr);
                        }
                    }
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    Bundle bundle2 = (Bundle) arrayList.get(i3);
                    if (i3 != 0) {
                        str6 = "_ep";
                        str5 = str;
                    } else {
                        str5 = str;
                        str6 = str2;
                    }
                    bundle2.putString("_o", str5);
                    if (z2) {
                        bundle2 = this.f8410a.m31124N().m31270u0(bundle2);
                    }
                    Bundle bundle3 = bundle2;
                    this.f8410a.m31126L().m30864o(new zzau(str6, new zzas(bundle3), str, j), str3);
                    if (!z4) {
                        for (InterfaceC0083p interfaceC0083p : this.f8565e) {
                            interfaceC0083p.mo28450a(str, str2, new Bundle(bundle3), j);
                        }
                    }
                }
                this.f8410a.mo31114f();
                if (this.f8410a.m31127K().m30894t(false) == null || !str4.equals(str2)) {
                    return;
                }
                this.f8410a.m31125M().f8688e.m31141d(true, true, this.f8410a.mo31115e().mo25912c());
                return;
            }
            return;
        }
        this.f8410a.mo31116d().m31333q().m31398a("Event not sent since app measurement is disabled");
    }

    /* renamed from: x */
    public final void m31147x(InterfaceC0083p interfaceC0083p) {
        m30845i();
        C2597i.m33076j(interfaceC0083p);
        if (this.f8565e.add(interfaceC0083p)) {
            return;
        }
        this.f8410a.mo31116d().m31327w().m31398a("OnEventListener already registered");
    }

    /* renamed from: y */
    public final void m31146y(long j) {
        this.f8567g.set(null);
        this.f8410a.mo31118b().m31239z(new RunnableC3331s5(this, j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m31145z(long j, boolean z) {
        mo30825h();
        m30845i();
        this.f8410a.mo31116d().m31333q().m31398a("Resetting analytics data (FE)");
        C3268m8 m31125M = this.f8410a.m31125M();
        m31125M.mo30825h();
        m31125M.f8688e.m31144a();
        boolean m31105o = this.f8410a.m31105o();
        C3340t3 m31132F = this.f8410a.m31132F();
        m31132F.f8961e.m31038b(j);
        if (!TextUtils.isEmpty(m31132F.f8410a.m31132F().f8976t.m31016a())) {
            m31132F.f8976t.m31015b(null);
        }
        C3022vc.m31917b();
        C3182f m31094z = m31132F.f8410a.m31094z();
        C3328s2 c3328s2 = C3339t2.f8920f0;
        if (m31094z.m31373B(null, c3328s2)) {
            m31132F.f8971o.m31038b(0L);
        }
        if (!m31132F.f8410a.m31094z().m31370E()) {
            m31132F.m31001t(!m31105o);
        }
        m31132F.f8977u.m31015b(null);
        m31132F.f8978v.m31038b(0L);
        m31132F.f8979w.m31048b(null);
        if (z) {
            this.f8410a.m31126L().m30862q();
        }
        C3022vc.m31917b();
        if (this.f8410a.m31094z().m31373B(null, c3328s2)) {
            this.f8410a.m31125M().f8687d.m31093a();
        }
        this.f8575o = !m31105o;
    }
}
