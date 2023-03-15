package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2744e4;
import com.google.android.gms.internal.measurement.C2760f4;
import com.google.android.gms.internal.measurement.C2776g4;
import com.google.android.gms.internal.measurement.C2792h4;
import com.google.android.gms.internal.measurement.C2808i4;
import com.google.android.gms.internal.measurement.C2824j4;
import com.google.android.gms.internal.measurement.C2872m4;
import com.google.android.gms.internal.measurement.C2888n4;
import com.google.android.gms.internal.measurement.C2904o4;
import com.google.android.gms.internal.measurement.C2920p4;
import com.google.android.gms.internal.measurement.C2936q4;
import com.google.android.gms.internal.measurement.C2984t4;
import com.google.android.gms.internal.measurement.C3059y4;
import com.google.android.gms.internal.measurement.C3074z4;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p009a8.C0068a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes.dex */
final class CallableC3391y4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzau f9122a;

    /* renamed from: b */
    final /* synthetic */ String f9123b;

    /* renamed from: c */
    final /* synthetic */ BinderC3166d5 f9124c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3391y4(BinderC3166d5 binderC3166d5, zzau zzauVar, String str) {
        this.f9124c = binderC3166d5;
        this.f9122a = zzauVar;
        this.f9123b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        byte[] bArr;
        C3137a9 c3137a93;
        C3181e9 c3181e9;
        C3341t4 c3341t4;
        C2872m4 c2872m4;
        String str;
        Bundle bundle;
        C2904o4 c2904o4;
        Object obj;
        C3292p m31050c;
        long j;
        c3137a9 = this.f9124c.f8386a;
        c3137a9.m31490a();
        c3137a92 = this.f9124c.f8386a;
        C3288o6 m31487c0 = c3137a92.m31487c0();
        zzau zzauVar = this.f9122a;
        String str2 = this.f9123b;
        m31487c0.mo30825h();
        C3242k4.m31100t();
        C2597i.m33076j(zzauVar);
        C2597i.m33080f(str2);
        if (!m31487c0.f8410a.m31094z().m31373B(str2, C3339t2.f8903U)) {
            m31487c0.f8410a.mo31116d().m31333q().m31397b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if (!"_iap".equals(zzauVar.f9175w) && !"_iapx".equals(zzauVar.f9175w)) {
            m31487c0.f8410a.mo31116d().m31333q().m31396c("Generating a payload for this event is not available. package_name, event_name", str2, zzauVar.f9175w);
            return null;
        } else {
            C2872m4 m32447A = C2888n4.m32447A();
            m31487c0.f8820b.m31495V().m31208e0();
            try {
                C3341t4 m31221R = m31487c0.f8820b.m31495V().m31221R(str2);
                if (m31221R == null) {
                    m31487c0.f8410a.mo31116d().m31333q().m31397b("Log and bundle not available. package_name", str2);
                    bArr = new byte[0];
                    c3137a93 = m31487c0.f8820b;
                } else if (!m31221R.m30989I()) {
                    m31487c0.f8410a.mo31116d().m31333q().m31397b("Log and bundle disabled. package_name", str2);
                    bArr = new byte[0];
                    c3137a93 = m31487c0.f8820b;
                } else {
                    C2904o4 m32299H1 = C2920p4.m32299H1();
                    m32299H1.m32375U(1);
                    m32299H1.m32379Q("android");
                    if (!TextUtils.isEmpty(m31221R.m30966c0())) {
                        m32299H1.m32352r(m31221R.m30966c0());
                    }
                    if (!TextUtils.isEmpty(m31221R.m30962e0())) {
                        m32299H1.m32347u((String) C2597i.m33076j(m31221R.m30962e0()));
                    }
                    if (!TextUtils.isEmpty(m31221R.m30960f0())) {
                        m32299H1.m32344w((String) C2597i.m33076j(m31221R.m30960f0()));
                    }
                    if (m31221R.m30987K() != -2147483648L) {
                        m32299H1.m32342x((int) m31221R.m30987K());
                    }
                    m32299H1.m32383M(m31221R.m30976V());
                    m32299H1.m32390H(m31221R.m30978T());
                    String m30956h0 = m31221R.m30956h0();
                    String m30970a0 = m31221R.m30970a0();
                    if (!TextUtils.isEmpty(m30956h0)) {
                        m32299H1.m32384L(m30956h0);
                    } else if (!TextUtils.isEmpty(m30970a0)) {
                        m32299H1.m32389H0(m30970a0);
                    }
                    C0068a m31496U = m31487c0.f8820b.m31496U(str2);
                    m32299H1.m32397D(m31221R.m30979S());
                    if (m31487c0.f8410a.m31105o() && m31487c0.f8410a.m31094z().m31372C(m32299H1.m32363g0()) && m31496U.m41984i(EnumC3193g.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        m32299H1.m32392G(null);
                    }
                    m32299H1.m32399C(m31496U.m41985h());
                    if (m31496U.m41984i(EnumC3193g.AD_STORAGE)) {
                        Pair m30837n = m31487c0.f8820b.m31486d0().m30837n(m31221R.m30966c0(), m31496U);
                        if (m31221R.m30990H() && !TextUtils.isEmpty((CharSequence) m30837n.first)) {
                            try {
                                m32299H1.m32373W(C3288o6.m31055a((String) m30837n.first, Long.toString(zzauVar.f9178z)));
                                Object obj2 = m30837n.second;
                                if (obj2 != null) {
                                    m32299H1.m32381O(((Boolean) obj2).booleanValue());
                                }
                            } catch (SecurityException e) {
                                m31487c0.f8410a.mo31116d().m31333q().m31397b("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                c3137a93 = m31487c0.f8820b;
                            }
                        }
                    }
                    m31487c0.f8410a.m31137A().m31346k();
                    m32299H1.m32394F(Build.MODEL);
                    m31487c0.f8410a.m31137A().m31346k();
                    m32299H1.m32380P(Build.VERSION.RELEASE);
                    m32299H1.m32369a0((int) m31487c0.f8410a.m31137A().m31071p());
                    m32299H1.m32365e0(m31487c0.f8410a.m31137A().m31070q());
                    try {
                        if (m31496U.m41984i(EnumC3193g.ANALYTICS_STORAGE) && m31221R.m30964d0() != null) {
                            m32299H1.m32350s(C3288o6.m31055a((String) C2597i.m33076j(m31221R.m30964d0()), Long.toString(zzauVar.f9178z)));
                        }
                        if (!TextUtils.isEmpty(m31221R.m30958g0())) {
                            m32299H1.m32385K((String) C2597i.m33076j(m31221R.m30958g0()));
                        }
                        String m30966c0 = m31221R.m30966c0();
                        List m31210c0 = m31487c0.f8820b.m31495V().m31210c0(m30966c0);
                        Iterator it = m31210c0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c3181e9 = null;
                                break;
                            }
                            c3181e9 = (C3181e9) it.next();
                            if ("_lte".equals(c3181e9.f8424c)) {
                                break;
                            }
                        }
                        if (c3181e9 == null || c3181e9.f8426e == null) {
                            C3181e9 c3181e92 = new C3181e9(m30966c0, "auto", "_lte", m31487c0.f8410a.mo31115e().mo25914a(), 0L);
                            m31210c0.add(c3181e92);
                            m31487c0.f8820b.m31495V().m31193x(c3181e92);
                        }
                        C3159c9 m31484f0 = m31487c0.f8820b.m31484f0();
                        m31484f0.f8410a.mo31116d().m31328v().m31398a("Checking account type status for ad personalization signals");
                        if (m31484f0.f8410a.m31137A().m31068s()) {
                            String m30966c02 = m31221R.m30966c0();
                            C2597i.m33076j(m30966c02);
                            if (m31221R.m30990H() && m31484f0.f8820b.m31491Z().m31381t(m30966c02)) {
                                m31484f0.f8410a.mo31116d().m31333q().m31398a("Turning off ad personalization due to account type");
                                Iterator it2 = m31210c0.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((C3181e9) it2.next()).f8424c)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                m31210c0.add(new C3181e9(m30966c02, "auto", "_npa", m31484f0.f8410a.mo31115e().mo25914a(), 1L));
                            }
                        }
                        C3074z4[] c3074z4Arr = new C3074z4[m31210c0.size()];
                        for (int i = 0; i < m31210c0.size(); i++) {
                            C3059y4 m31708D = C3074z4.m31708D();
                            m31708D.m31803z(((C3181e9) m31210c0.get(i)).f8424c);
                            m31708D.m31810A(((C3181e9) m31210c0.get(i)).f8425d);
                            m31487c0.f8820b.m31484f0().m31428K(m31708D, ((C3181e9) m31210c0.get(i)).f8426e);
                            c3074z4Arr[i] = (C3074z4) m31708D.m32426p();
                        }
                        m32299H1.m32351r0(Arrays.asList(c3074z4Arr));
                        C3208h3 m31261b = C3208h3.m31261b(zzauVar);
                        m31487c0.f8410a.m31124N().m31264y(m31261b.f8493d, m31487c0.f8820b.m31495V().m31222Q(str2));
                        m31487c0.f8410a.m31124N().m31263z(m31261b, m31487c0.f8410a.m31094z().m31360n(str2));
                        Bundle bundle2 = m31261b.f8493d;
                        bundle2.putLong("_c", 1L);
                        m31487c0.f8410a.mo31116d().m31333q().m31398a("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzauVar.f9177y);
                        if (m31487c0.f8410a.m31124N().m31305S(m32299H1.m32363g0())) {
                            m31487c0.f8410a.m31124N().m31322B(bundle2, "_dbg", 1L);
                            m31487c0.f8410a.m31124N().m31322B(bundle2, "_r", 1L);
                        }
                        C3292p m31217V = m31487c0.f8820b.m31495V().m31217V(str2, zzauVar.f9175w);
                        if (m31217V == null) {
                            c2904o4 = m32299H1;
                            c3341t4 = m31221R;
                            c2872m4 = m32447A;
                            str = str2;
                            bundle = bundle2;
                            obj = null;
                            m31050c = new C3292p(str2, zzauVar.f9175w, 0L, 0L, 0L, zzauVar.f9178z, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            c3341t4 = m31221R;
                            c2872m4 = m32447A;
                            str = str2;
                            bundle = bundle2;
                            c2904o4 = m32299H1;
                            obj = null;
                            long j2 = m31217V.f8755f;
                            m31050c = m31217V.m31050c(zzauVar.f9178z);
                            j = j2;
                        }
                        m31487c0.f8820b.m31495V().m31200q(m31050c);
                        C3281o c3281o = new C3281o(m31487c0.f8410a, zzauVar.f9177y, str, zzauVar.f9175w, zzauVar.f9178z, j, bundle);
                        C2744e4 m32737E = C2760f4.m32737E();
                        m32737E.m32771H(c3281o.f8723d);
                        m32737E.m32775C(c3281o.f8721b);
                        m32737E.m32772G(c3281o.f8724e);
                        C3303q c3303q = new C3303q(c3281o.f8725f);
                        while (c3303q.hasNext()) {
                            String next = c3303q.next();
                            C2808i4 m32554E = C2824j4.m32554E();
                            m32554E.m32576D(next);
                            Object m30821E = c3281o.f8725f.m30821E(next);
                            if (m30821E != null) {
                                m31487c0.f8820b.m31484f0().m31429J(m32554E, m30821E);
                                m32737E.m32762x(m32554E);
                            }
                        }
                        C2904o4 c2904o42 = c2904o4;
                        c2904o42.m32349s0(m32737E);
                        C2936q4 m32073A = C2984t4.m32073A();
                        C2776g4 m32604A = C2792h4.m32604A();
                        m32604A.m32629r(m31050c.f8752c);
                        m32604A.m32628s(zzauVar.f9175w);
                        m32073A.m32192r(m32604A);
                        c2904o42.m32378R(m32073A);
                        c2904o42.m32355o0(m31487c0.f8820b.m31498S().m31014m(c3341t4.m30966c0(), Collections.emptyList(), c2904o42.m32360j0(), Long.valueOf(m32737E.m32764u()), Long.valueOf(m32737E.m32764u())));
                        if (m32737E.m32767L()) {
                            c2904o42.m32370Z(m32737E.m32764u());
                            c2904o42.m32388I(m32737E.m32764u());
                        }
                        long m30975W = c3341t4.m30975W();
                        int i2 = (m30975W > 0L ? 1 : (m30975W == 0L ? 0 : -1));
                        if (i2 != 0) {
                            c2904o42.m32377S(m30975W);
                        }
                        long m30973Y = c3341t4.m30973Y();
                        if (m30973Y != 0) {
                            c2904o42.m32376T(m30973Y);
                        } else if (i2 != 0) {
                            c2904o42.m32376T(m30975W);
                        }
                        c3341t4.m30965d();
                        c2904o42.m32339z((int) c3341t4.m30974X());
                        m31487c0.f8410a.m31094z().m31357q();
                        c2904o42.m32367c0(55005L);
                        c2904o42.m32368b0(m31487c0.f8410a.mo31115e().mo25914a());
                        c2904o42.m32371Y(true);
                        C2872m4 c2872m42 = c2872m4;
                        c2872m42.m32469r(c2904o42);
                        C3341t4 c3341t42 = c3341t4;
                        c3341t42.m30995C(c2904o42.m32357m0());
                        c3341t42.m30937z(c2904o42.m32358l0());
                        m31487c0.f8820b.m31495V().m31201p(c3341t42);
                        m31487c0.f8820b.m31495V().m31202o();
                        try {
                            return m31487c0.f8820b.m31484f0().m31424O(((C2888n4) c2872m42.m32426p()).m32865k());
                        } catch (IOException e2) {
                            m31487c0.f8410a.mo31116d().m31332r().m31396c("Data loss. Failed to bundle and serialize. appId", C3197g3.m31324z(str), e2);
                            return obj;
                        }
                    } catch (SecurityException e3) {
                        m31487c0.f8410a.mo31116d().m31333q().m31397b("app instance id encryption failed", e3.getMessage());
                        bArr = new byte[0];
                        c3137a93 = m31487c0.f8820b;
                    }
                }
                c3137a93.m31495V().m31207f0();
                return bArr;
            } finally {
                m31487c0.f8820b.m31495V().m31207f0();
            }
        }
    }
}
