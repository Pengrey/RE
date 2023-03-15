package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2709c1;
import com.google.android.gms.internal.measurement.C2745e5;
import com.google.android.gms.internal.measurement.C2777g5;
import com.google.android.gms.internal.measurement.C2882me;
import com.google.android.gms.internal.measurement.C2898ne;
import com.google.android.gms.internal.measurement.C2919p3;
import com.google.android.gms.internal.measurement.C2943qb;
import com.google.android.gms.internal.measurement.C2967s3;
import com.google.android.gms.internal.measurement.C2983t3;
import com.google.android.gms.internal.measurement.C3013v3;
import com.google.android.gms.internal.measurement.InterfaceC2850ke;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.measurement.internal.C3176e4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p009a8.C0079l;
import p301q.C9545a;
import p301q.C9557f;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* loaded from: classes.dex */
public final class C3176e4 extends AbstractC3323r8 implements InterfaceC3171e {

    /* renamed from: d */
    private final Map f8402d;

    /* renamed from: e */
    final Map f8403e;

    /* renamed from: f */
    final Map f8404f;

    /* renamed from: g */
    private final Map f8405g;

    /* renamed from: h */
    private final Map f8406h;

    /* renamed from: i */
    final C9557f f8407i;

    /* renamed from: j */
    final InterfaceC2850ke f8408j;

    /* renamed from: k */
    private final Map f8409k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3176e4(C3137a9 c3137a9) {
        super(c3137a9);
        this.f8402d = new C9545a();
        this.f8403e = new C9545a();
        this.f8404f = new C9545a();
        this.f8405g = new C9545a();
        this.f8409k = new C9545a();
        this.f8406h = new C9545a();
        this.f8407i = new C3143b4(this, 20);
        this.f8408j = new C3154c4(this);
    }

    /* renamed from: A */
    private final C2983t3 m31394A(String str, byte[] bArr) {
        if (bArr == null) {
            return C2983t3.m32083G();
        }
        try {
            C2983t3 c2983t3 = (C2983t3) ((C2967s3) C3159c9.m31436C(C2983t3.m32085E(), bArr)).m32426p();
            this.f8410a.mo31116d().m31328v().m31396c("Parsed config. version, gmp_app_id", c2983t3.m32074P() ? Long.valueOf(c2983t3.m32087C()) : null, c2983t3.m32075O() ? c2983t3.m32082H() : null);
            return c2983t3;
        } catch (zzkh e) {
            this.f8410a.mo31116d().m31327w().m31396c("Unable to merge remote config. appId", C3197g3.m31324z(str), e);
            return C2983t3.m32083G();
        } catch (RuntimeException e2) {
            this.f8410a.mo31116d().m31327w().m31396c("Unable to merge remote config. appId", C3197g3.m31324z(str), e2);
            return C2983t3.m32083G();
        }
    }

    /* renamed from: B */
    private final void m31393B(String str, C2967s3 c2967s3) {
        C9545a c9545a = new C9545a();
        C9545a c9545a2 = new C9545a();
        C9545a c9545a3 = new C9545a();
        if (c2967s3 != null) {
            for (int i = 0; i < c2967s3.m32132r(); i++) {
                C2919p3 c2919p3 = (C2919p3) c2967s3.m32131s(i).m32185p();
                if (TextUtils.isEmpty(c2919p3.m32326u())) {
                    this.f8410a.mo31116d().m31327w().m31398a("EventConfig contained null event name");
                } else {
                    String m32326u = c2919p3.m32326u();
                    String m41973b = C0079l.m41973b(c2919p3.m32326u());
                    if (!TextUtils.isEmpty(m41973b)) {
                        c2919p3.m32327s(m41973b);
                        c2967s3.m32129w(i, c2919p3);
                    }
                    if (c2919p3.m32323z() && c2919p3.m32325w()) {
                        c9545a.put(m32326u, Boolean.TRUE);
                    }
                    if (c2919p3.m32330A() && c2919p3.m32324x()) {
                        c9545a2.put(c2919p3.m32326u(), Boolean.TRUE);
                    }
                    if (c2919p3.m32329B()) {
                        if (c2919p3.m32328r() >= 2 && c2919p3.m32328r() <= 65535) {
                            c9545a3.put(c2919p3.m32326u(), Integer.valueOf(c2919p3.m32328r()));
                        } else {
                            this.f8410a.mo31116d().m31327w().m31396c("Invalid sampling rate. Event name, sample rate", c2919p3.m32326u(), Integer.valueOf(c2919p3.m32328r()));
                        }
                    }
                }
            }
        }
        this.f8403e.put(str, c9545a);
        this.f8404f.put(str, c9545a2);
        this.f8406h.put(str, c9545a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x00f3: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:32:0x00f3 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m31392C(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3176e4.m31392C(java.lang.String):void");
    }

    /* renamed from: D */
    private final void m31391D(final String str, C2983t3 c2983t3) {
        if (c2983t3.m32089A() != 0) {
            this.f8410a.mo31116d().m31328v().m31397b("EES programs found", Integer.valueOf(c2983t3.m32089A()));
            C2777g5 c2777g5 = (C2777g5) c2983t3.m32080J().get(0);
            try {
                C2709c1 c2709c1 = new C2709c1();
                c2709c1.m32819d("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.z3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C2943qb("internal.remoteConfig", new C3165d4(C3176e4.this, str));
                    }
                });
                c2709c1.m32819d("internal.appMetadata", new Callable() { // from class: a8.h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final C3176e4 c3176e4 = C3176e4.this;
                        final String str2 = str;
                        return new C2898ne("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.a4
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                C3176e4 c3176e42 = C3176e4.this;
                                String str3 = str2;
                                C3341t4 m31221R = c3176e42.f8820b.m31495V().m31221R(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", "android");
                                hashMap.put("package_name", str3);
                                c3176e42.f8410a.m31094z().m31357q();
                                hashMap.put("gmp_version", 55005L);
                                if (m31221R != null) {
                                    String m30960f0 = m31221R.m30960f0();
                                    if (m30960f0 != null) {
                                        hashMap.put("app_version", m30960f0);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(m31221R.m30987K()));
                                    hashMap.put("dynamite_version", Long.valueOf(m31221R.m30978T()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                c2709c1.m32819d("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.y3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new C2882me(C3176e4.this.f8408j);
                    }
                });
                c2709c1.m32820c(c2777g5);
                this.f8407i.m10629f(str, c2709c1);
                this.f8410a.mo31116d().m31328v().m31396c("EES program loaded for appId, activities", str, Integer.valueOf(c2777g5.m32627A().m32813A()));
                for (C2745e5 c2745e5 : c2777g5.m32627A().m32810D()) {
                    this.f8410a.mo31116d().m31328v().m31397b("EES program activity", c2745e5.m32759B());
                }
                return;
            } catch (zzd unused) {
                this.f8410a.mo31116d().m31332r().m31397b("Failed to load EES program. appId", str);
                return;
            }
        }
        this.f8407i.m10628g(str);
    }

    /* renamed from: E */
    private static final Map m31390E(C2983t3 c2983t3) {
        C9545a c9545a = new C9545a();
        if (c2983t3 != null) {
            for (C3013v3 c3013v3 : c2983t3.m32079K()) {
                c9545a.put(c3013v3.m31985B(), c3013v3.m31984C());
            }
        }
        return c9545a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static /* bridge */ /* synthetic */ C2709c1 m31387n(C3176e4 c3176e4, String str) {
        c3176e4.m31026i();
        C2597i.m33080f(str);
        if (c3176e4.m31380u(str)) {
            if (c3176e4.f8405g.containsKey(str) && c3176e4.f8405g.get(str) != null) {
                c3176e4.m31391D(str, (C2983t3) c3176e4.f8405g.get(str));
            } else {
                c3176e4.m31392C(str);
            }
            return (C2709c1) c3176e4.f8407i.m10624k().get(str);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC3171e
    /* renamed from: a */
    public final String mo31389a(String str, String str2) {
        mo30825h();
        m31392C(str);
        Map map = (Map) this.f8402d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3323r8
    /* renamed from: l */
    protected final boolean mo30839l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final int m31388m(String str, String str2) {
        Integer num;
        mo30825h();
        m31392C(str);
        Map map = (Map) this.f8406h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final C2983t3 m31386o(String str) {
        m31026i();
        mo30825h();
        C2597i.m33080f(str);
        m31392C(str);
        return (C2983t3) this.f8405g.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final String m31385p(String str) {
        mo30825h();
        return (String) this.f8409k.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m31383r(String str) {
        mo30825h();
        this.f8409k.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m31382s(String str) {
        mo30825h();
        this.f8405g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean m31381t(String str) {
        mo30825h();
        C2983t3 m31386o = m31386o(str);
        if (m31386o == null) {
            return false;
        }
        return m31386o.m32076N();
    }

    /* renamed from: u */
    public final boolean m31380u(String str) {
        C2983t3 c2983t3;
        return (TextUtils.isEmpty(str) || (c2983t3 = (C2983t3) this.f8405g.get(str)) == null || c2983t3.m32089A() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean m31379v(String str) {
        return "1".equals(mo31389a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m31378w(String str, String str2) {
        Boolean bool;
        mo30825h();
        m31392C(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f8404f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final boolean m31377x(String str, String str2) {
        Boolean bool;
        mo30825h();
        m31392C(str);
        if (m31379v(str) && C3203g9.m31302V(str2)) {
            return true;
        }
        if (m31376y(str) && C3203g9.m31301W(str2)) {
            return true;
        }
        Map map = (Map) this.f8403e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean m31376y(String str) {
        return "1".equals(mo31389a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean m31375z(String str, byte[] bArr, String str2) {
        m31026i();
        mo30825h();
        C2597i.m33080f(str);
        C2967s3 c2967s3 = (C2967s3) m31394A(str, bArr).m32185p();
        if (c2967s3 == null) {
            return false;
        }
        m31393B(str, c2967s3);
        m31391D(str, (C2983t3) c2967s3.m32426p());
        this.f8405g.put(str, (C2983t3) c2967s3.m32426p());
        this.f8409k.put(str, str2);
        this.f8402d.put(str, m31390E((C2983t3) c2967s3.m32426p()));
        this.f8820b.m31495V().m31203n(str, new ArrayList(c2967s3.m32128x()));
        try {
            c2967s3.m32130u();
            bArr = ((C2983t3) c2967s3.m32426p()).m32865k();
        } catch (RuntimeException e) {
            this.f8410a.mo31116d().m31327w().m31396c("Unable to serialize reduced-size config. Storing full config instead. appId", C3197g3.m31324z(str), e);
        }
        C3226j m31495V = this.f8820b.m31495V();
        C2597i.m33080f(str);
        m31495V.mo30825h();
        m31495V.m31026i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        try {
            if (m31495V.m31223P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                m31495V.f8410a.mo31116d().m31332r().m31397b("Failed to update remote config (got 0). appId", C3197g3.m31324z(str));
            }
        } catch (SQLiteException e2) {
            m31495V.f8410a.mo31116d().m31332r().m31396c("Error storing remote config. appId", C3197g3.m31324z(str), e2);
        }
        this.f8405g.put(str, (C2983t3) c2967s3.m32426p());
        return true;
    }
}
