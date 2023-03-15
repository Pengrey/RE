package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.s5 */
/* loaded from: classes.dex */
public final class C2969s5 {
    /* renamed from: a */
    public static double m32127a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i == 0) {
            return d;
        }
        return (i > 0 ? 1 : -1) * Math.floor(Math.abs(d));
    }

    /* renamed from: b */
    public static int m32126b(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((i > 0 ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* renamed from: c */
    public static int m32125c(C2952r4 c2952r4) {
        int m32126b = m32126b(c2952r4.m32160d("runtime.counter").mo31992c().doubleValue() + 1.0d);
        if (m32126b <= 1000000) {
            c2952r4.m32157g("runtime.counter", new C2803i(Double.valueOf(m32126b)));
            return m32126b;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* renamed from: d */
    public static long m32124d(double d) {
        return m32126b(d) & 4294967295L;
    }

    /* renamed from: e */
    public static EnumC2884n0 m32123e(String str) {
        EnumC2884n0 enumC2884n0 = null;
        if (str != null && !str.isEmpty()) {
            enumC2884n0 = EnumC2884n0.zza(Integer.parseInt(str));
        }
        if (enumC2884n0 != null) {
            return enumC2884n0;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* renamed from: f */
    public static Object m32122f(InterfaceC2931q interfaceC2931q) {
        if (InterfaceC2931q.f7931g.equals(interfaceC2931q)) {
            return null;
        }
        if (InterfaceC2931q.f7930f.equals(interfaceC2931q)) {
            return BuildConfig.VERSION_NAME;
        }
        if (interfaceC2931q instanceof C2883n) {
            return m32121g((C2883n) interfaceC2931q);
        }
        if (interfaceC2931q instanceof C2755f) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((C2755f) interfaceC2931q).iterator();
            while (it.hasNext()) {
                Object m32122f = m32122f((InterfaceC2931q) it.next());
                if (m32122f != null) {
                    arrayList.add(m32122f);
                }
            }
            return arrayList;
        } else if (!interfaceC2931q.mo31992c().isNaN()) {
            return interfaceC2931q.mo31992c();
        } else {
            return interfaceC2931q.mo31990g();
        }
    }

    /* renamed from: g */
    public static Map m32121g(C2883n c2883n) {
        HashMap hashMap = new HashMap();
        for (String str : c2883n.m32461a()) {
            Object m32122f = m32122f(c2883n.mo32459o(str));
            if (m32122f != null) {
                hashMap.put(str, m32122f);
            }
        }
        return hashMap;
    }

    /* renamed from: h */
    public static void m32120h(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: i */
    public static void m32119i(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: j */
    public static void m32118j(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    /* renamed from: k */
    public static boolean m32117k(InterfaceC2931q interfaceC2931q) {
        if (interfaceC2931q == null) {
            return false;
        }
        Double mo31992c = interfaceC2931q.mo31992c();
        return !mo31992c.isNaN() && mo31992c.doubleValue() >= 0.0d && mo31992c.equals(Double.valueOf(Math.floor(mo31992c.doubleValue())));
    }

    /* renamed from: l */
    public static boolean m32116l(InterfaceC2931q interfaceC2931q, InterfaceC2931q interfaceC2931q2) {
        if (interfaceC2931q.getClass().equals(interfaceC2931q2.getClass())) {
            if ((interfaceC2931q instanceof C3009v) || (interfaceC2931q instanceof C2899o)) {
                return true;
            }
            if (interfaceC2931q instanceof C2803i) {
                if (Double.isNaN(interfaceC2931q.mo31992c().doubleValue()) || Double.isNaN(interfaceC2931q2.mo31992c().doubleValue())) {
                    return false;
                }
                return interfaceC2931q.mo31992c().equals(interfaceC2931q2.mo31992c());
            } else if (interfaceC2931q instanceof C2994u) {
                return interfaceC2931q.mo31990g().equals(interfaceC2931q2.mo31990g());
            } else {
                if (interfaceC2931q instanceof C2771g) {
                    return interfaceC2931q.mo31991f().equals(interfaceC2931q2.mo31991f());
                }
                return interfaceC2931q == interfaceC2931q2;
            }
        }
        return false;
    }
}
