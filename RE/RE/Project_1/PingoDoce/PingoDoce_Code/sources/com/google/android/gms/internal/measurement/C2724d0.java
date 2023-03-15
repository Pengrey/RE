package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d0 */
/* loaded from: classes.dex */
public final class C2724d0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static InterfaceC2931q m32796a(String str, C2755f c2755f, C2952r4 c2952r4, List list) {
        String str2;
        char c;
        String str3;
        double min;
        AbstractC2819j abstractC2819j;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                if (str.equals(str2)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 0;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\n';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 17;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 3;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 19;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 7;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\b';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 5;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = '\t';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 15;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 16;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    c = 1;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '\r';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 14;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 11;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '\f';
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 4;
                    str2 = "toString";
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            default:
                str2 = "toString";
                c = 65535;
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                InterfaceC2931q mo31993b = c2755f.mo31993b();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) it.next());
                        if (!(m32162b instanceof C2787h)) {
                            C2755f c2755f2 = (C2755f) mo31993b;
                            int m32746u = c2755f2.m32746u();
                            if (m32162b instanceof C2755f) {
                                C2755f c2755f3 = (C2755f) m32162b;
                                Iterator m32743y = c2755f3.m32743y();
                                while (m32743y.hasNext()) {
                                    Integer num = (Integer) m32743y.next();
                                    c2755f2.m32749F(num.intValue() + m32746u, c2755f3.m32745v(num.intValue()));
                                }
                            } else {
                                c2755f2.m32749F(m32746u, m32162b);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return mo31993b;
            case 1:
                C2969s5.m32120h("every", 1, list);
                InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                if (m32162b2 instanceof C2915p) {
                    if (c2755f.m32746u() != 0 && m32795b(c2755f, c2952r4, (C2915p) m32162b2, Boolean.FALSE, Boolean.TRUE).m32746u() != c2755f.m32746u()) {
                        return InterfaceC2931q.f7936l;
                    }
                    return InterfaceC2931q.f7935k;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 2:
                C2969s5.m32120h("filter", 1, list);
                InterfaceC2931q m32162b3 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                if (m32162b3 instanceof C2915p) {
                    if (c2755f.m32747t() == 0) {
                        return new C2755f();
                    }
                    InterfaceC2931q mo31993b2 = c2755f.mo31993b();
                    C2755f m32795b = m32795b(c2755f, c2952r4, (C2915p) m32162b3, null, Boolean.TRUE);
                    C2755f c2755f4 = new C2755f();
                    Iterator m32743y2 = m32795b.m32743y();
                    while (m32743y2.hasNext()) {
                        c2755f4.m32749F(c2755f4.m32746u(), ((C2755f) mo31993b2).m32745v(((Integer) m32743y2.next()).intValue()));
                    }
                    return c2755f4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                C2969s5.m32120h("forEach", 1, list);
                InterfaceC2931q m32162b4 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                if (m32162b4 instanceof C2915p) {
                    if (c2755f.m32747t() == 0) {
                        return InterfaceC2931q.f7930f;
                    }
                    m32795b(c2755f, c2952r4, (C2915p) m32162b4, null, null);
                    return InterfaceC2931q.f7930f;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 4:
                C2969s5.m32118j("indexOf", 2, list);
                InterfaceC2931q interfaceC2931q = InterfaceC2931q.f7930f;
                if (!list.isEmpty()) {
                    interfaceC2931q = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                }
                if (list.size() > 1) {
                    double m32127a = C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue());
                    if (m32127a >= c2755f.m32746u()) {
                        return new C2803i(Double.valueOf(-1.0d));
                    }
                    d = m32127a < 0.0d ? c2755f.m32746u() + m32127a : m32127a;
                }
                Iterator m32743y3 = c2755f.m32743y();
                while (m32743y3.hasNext()) {
                    int intValue = ((Integer) m32743y3.next()).intValue();
                    double d2 = intValue;
                    if (d2 >= d && C2969s5.m32116l(c2755f.m32745v(intValue), interfaceC2931q)) {
                        return new C2803i(Double.valueOf(d2));
                    }
                }
                return new C2803i(Double.valueOf(-1.0d));
            case 5:
                C2969s5.m32118j("join", 1, list);
                if (c2755f.m32746u() == 0) {
                    return InterfaceC2931q.f7937m;
                }
                if (list.size() > 0) {
                    InterfaceC2931q m32162b5 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                    str3 = ((m32162b5 instanceof C2899o) || (m32162b5 instanceof C3009v)) ? BuildConfig.VERSION_NAME : m32162b5.mo31990g();
                } else {
                    str3 = ",";
                }
                return new C2994u(c2755f.m32744x(str3));
            case 6:
                C2969s5.m32118j("lastIndexOf", 2, list);
                InterfaceC2931q interfaceC2931q2 = InterfaceC2931q.f7930f;
                if (!list.isEmpty()) {
                    interfaceC2931q2 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                }
                double m32746u2 = c2755f.m32746u() - 1;
                if (list.size() > 1) {
                    InterfaceC2931q m32162b6 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
                    m32746u2 = Double.isNaN(m32162b6.mo31992c().doubleValue()) ? c2755f.m32746u() - 1 : C2969s5.m32127a(m32162b6.mo31992c().doubleValue());
                    if (m32746u2 < 0.0d) {
                        m32746u2 += c2755f.m32746u();
                    }
                }
                if (m32746u2 < 0.0d) {
                    return new C2803i(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(c2755f.m32746u(), m32746u2); min2 >= 0; min2--) {
                    if (c2755f.m32748G(min2) && C2969s5.m32116l(c2755f.m32745v(min2), interfaceC2931q2)) {
                        return new C2803i(Double.valueOf(min2));
                    }
                }
                return new C2803i(Double.valueOf(-1.0d));
            case 7:
                C2969s5.m32120h("map", 1, list);
                InterfaceC2931q m32162b7 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                if (m32162b7 instanceof C2915p) {
                    if (c2755f.m32746u() == 0) {
                        return new C2755f();
                    }
                    return m32795b(c2755f, c2952r4, (C2915p) m32162b7, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\b':
                C2969s5.m32120h("pop", 0, list);
                int m32746u3 = c2755f.m32746u();
                if (m32746u3 == 0) {
                    return InterfaceC2931q.f7930f;
                }
                int i = m32746u3 - 1;
                InterfaceC2931q m32745v = c2755f.m32745v(i);
                c2755f.m32750E(i);
                return m32745v;
            case '\t':
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c2755f.m32749F(c2755f.m32746u(), c2952r4.m32162b((InterfaceC2931q) it2.next()));
                    }
                }
                return new C2803i(Double.valueOf(c2755f.m32746u()));
            case '\n':
                return m32794c(c2755f, c2952r4, list, true);
            case 11:
                return m32794c(c2755f, c2952r4, list, false);
            case '\f':
                C2969s5.m32120h("reverse", 0, list);
                int m32746u4 = c2755f.m32746u();
                if (m32746u4 != 0) {
                    for (int i2 = 0; i2 < m32746u4 / 2; i2++) {
                        if (c2755f.m32748G(i2)) {
                            InterfaceC2931q m32745v2 = c2755f.m32745v(i2);
                            c2755f.m32749F(i2, null);
                            int i3 = (m32746u4 - 1) - i2;
                            if (c2755f.m32748G(i3)) {
                                c2755f.m32749F(i2, c2755f.m32745v(i3));
                            }
                            c2755f.m32749F(i3, m32745v2);
                        }
                    }
                }
                return c2755f;
            case '\r':
                C2969s5.m32120h("shift", 0, list);
                if (c2755f.m32746u() == 0) {
                    return InterfaceC2931q.f7930f;
                }
                InterfaceC2931q m32745v3 = c2755f.m32745v(0);
                c2755f.m32750E(0);
                return m32745v3;
            case 14:
                C2969s5.m32118j("slice", 2, list);
                if (list.isEmpty()) {
                    return c2755f.mo31993b();
                }
                double m32746u5 = c2755f.m32746u();
                double m32127a2 = C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue());
                if (m32127a2 < 0.0d) {
                    min = Math.max(m32127a2 + m32746u5, 0.0d);
                } else {
                    min = Math.min(m32127a2, m32746u5);
                }
                if (list.size() == 2) {
                    double m32127a3 = C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue());
                    if (m32127a3 < 0.0d) {
                        m32746u5 = Math.max(m32746u5 + m32127a3, 0.0d);
                    } else {
                        m32746u5 = Math.min(m32746u5, m32127a3);
                    }
                }
                C2755f c2755f5 = new C2755f();
                for (int i4 = (int) min; i4 < m32746u5; i4++) {
                    c2755f5.m32749F(c2755f5.m32746u(), c2755f.m32745v(i4));
                }
                return c2755f5;
            case 15:
                C2969s5.m32120h("some", 1, list);
                InterfaceC2931q m32162b8 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                if (m32162b8 instanceof AbstractC2819j) {
                    if (c2755f.m32746u() == 0) {
                        return InterfaceC2931q.f7936l;
                    }
                    AbstractC2819j abstractC2819j2 = (AbstractC2819j) m32162b8;
                    Iterator m32743y4 = c2755f.m32743y();
                    while (m32743y4.hasNext()) {
                        int intValue2 = ((Integer) m32743y4.next()).intValue();
                        if (c2755f.m32748G(intValue2) && abstractC2819j2.mo32094a(c2952r4, Arrays.asList(c2755f.m32745v(intValue2), new C2803i(Double.valueOf(intValue2)), c2755f)).mo31991f().booleanValue()) {
                            return InterfaceC2931q.f7935k;
                        }
                    }
                    return InterfaceC2931q.f7936l;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 16:
                C2969s5.m32118j("sort", 1, list);
                if (c2755f.m32746u() >= 2) {
                    List<InterfaceC2931q> m32753B = c2755f.m32753B();
                    if (list.isEmpty()) {
                        abstractC2819j = null;
                    } else {
                        InterfaceC2931q m32162b9 = c2952r4.m32162b((InterfaceC2931q) list.get(0));
                        if (m32162b9 instanceof AbstractC2819j) {
                            abstractC2819j = (AbstractC2819j) m32162b9;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    }
                    Collections.sort(m32753B, new C2708c0(abstractC2819j, c2952r4));
                    c2755f.m32752C();
                    int i5 = 0;
                    for (InterfaceC2931q interfaceC2931q3 : m32753B) {
                        c2755f.m32749F(i5, interfaceC2931q3);
                        i5++;
                    }
                }
                return c2755f;
            case 17:
                if (list.isEmpty()) {
                    return new C2755f();
                }
                int m32127a4 = (int) C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(0)).mo31992c().doubleValue());
                if (m32127a4 < 0) {
                    m32127a4 = Math.max(0, m32127a4 + c2755f.m32746u());
                } else if (m32127a4 > c2755f.m32746u()) {
                    m32127a4 = c2755f.m32746u();
                }
                int m32746u6 = c2755f.m32746u();
                C2755f c2755f6 = new C2755f();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) C2969s5.m32127a(c2952r4.m32162b((InterfaceC2931q) list.get(1)).mo31992c().doubleValue()));
                    if (max > 0) {
                        for (int i6 = m32127a4; i6 < Math.min(m32746u6, m32127a4 + max); i6++) {
                            c2755f6.m32749F(c2755f6.m32746u(), c2755f.m32745v(m32127a4));
                            c2755f.m32750E(m32127a4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            InterfaceC2931q m32162b10 = c2952r4.m32162b((InterfaceC2931q) list.get(i7));
                            if (!(m32162b10 instanceof C2787h)) {
                                c2755f.m32751D((m32127a4 + i7) - 2, m32162b10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (m32127a4 < m32746u6) {
                        c2755f6.m32749F(c2755f6.m32746u(), c2755f.m32745v(m32127a4));
                        c2755f.m32749F(m32127a4, null);
                        m32127a4++;
                    }
                }
                return c2755f6;
            case 18:
                C2969s5.m32120h(str2, 0, list);
                return new C2994u(c2755f.m32744x(","));
            case 19:
                if (!list.isEmpty()) {
                    C2755f c2755f7 = new C2755f();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        InterfaceC2931q m32162b11 = c2952r4.m32162b((InterfaceC2931q) it3.next());
                        if (!(m32162b11 instanceof C2787h)) {
                            c2755f7.m32749F(c2755f7.m32746u(), m32162b11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int m32746u7 = c2755f7.m32746u();
                    Iterator m32743y5 = c2755f.m32743y();
                    while (m32743y5.hasNext()) {
                        Integer num2 = (Integer) m32743y5.next();
                        c2755f7.m32749F(num2.intValue() + m32746u7, c2755f.m32745v(num2.intValue()));
                    }
                    c2755f.m32752C();
                    Iterator m32743y6 = c2755f7.m32743y();
                    while (m32743y6.hasNext()) {
                        Integer num3 = (Integer) m32743y6.next();
                        c2755f.m32749F(num3.intValue(), c2755f7.m32745v(num3.intValue()));
                    }
                }
                return new C2803i(Double.valueOf(c2755f.m32746u()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* renamed from: b */
    private static C2755f m32795b(C2755f c2755f, C2952r4 c2952r4, AbstractC2819j abstractC2819j, Boolean bool, Boolean bool2) {
        C2755f c2755f2 = new C2755f();
        Iterator m32743y = c2755f.m32743y();
        while (m32743y.hasNext()) {
            int intValue = ((Integer) m32743y.next()).intValue();
            if (c2755f.m32748G(intValue)) {
                InterfaceC2931q mo32094a = abstractC2819j.mo32094a(c2952r4, Arrays.asList(c2755f.m32745v(intValue), new C2803i(Double.valueOf(intValue)), c2755f));
                if (mo32094a.mo31991f().equals(bool)) {
                    return c2755f2;
                }
                if (bool2 == null || mo32094a.mo31991f().equals(bool2)) {
                    c2755f2.m32749F(intValue, mo32094a);
                }
            }
        }
        return c2755f2;
    }

    /* renamed from: c */
    private static InterfaceC2931q m32794c(C2755f c2755f, C2952r4 c2952r4, List list, boolean z) {
        InterfaceC2931q interfaceC2931q;
        C2969s5.m32119i("reduce", 1, list);
        C2969s5.m32118j("reduce", 2, list);
        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
        if (m32162b instanceof AbstractC2819j) {
            if (list.size() == 2) {
                interfaceC2931q = c2952r4.m32162b((InterfaceC2931q) list.get(1));
                if (interfaceC2931q instanceof C2787h) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c2755f.m32746u() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                interfaceC2931q = null;
            }
            AbstractC2819j abstractC2819j = (AbstractC2819j) m32162b;
            int m32746u = c2755f.m32746u();
            int i = z ? 0 : m32746u - 1;
            int i2 = z ? m32746u - 1 : 0;
            int i3 = true == z ? 1 : -1;
            if (interfaceC2931q == null) {
                interfaceC2931q = c2755f.m32745v(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (c2755f.m32748G(i)) {
                    interfaceC2931q = abstractC2819j.mo32094a(c2952r4, Arrays.asList(interfaceC2931q, c2755f.m32745v(i), new C2803i(Double.valueOf(i)), c2755f));
                    if (interfaceC2931q instanceof C2787h) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return interfaceC2931q;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
