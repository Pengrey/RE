package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.fa */
/* loaded from: classes.dex */
final class C2766fa {

    /* renamed from: a */
    private static final Class f7738a;

    /* renamed from: b */
    private static final AbstractC2958ra f7739b;

    /* renamed from: c */
    private static final AbstractC2958ra f7740c;

    /* renamed from: d */
    private static final AbstractC2958ra f7741d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7738a = cls;
        f7739b = m32697C(false);
        f7740c = m32697C(true);
        f7741d = new C2990ta();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static int m32699A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3062y7.m31798a(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m32698B(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31668k(i, list, z);
    }

    /* renamed from: C */
    private static AbstractC2958ra m32697C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC2958ra) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public static int m32696D(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public static int m32695E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m31799D = size * AbstractC3062y7.m31799D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            m31799D += AbstractC3062y7.m31775x((AbstractC2955r7) list.get(i2));
        }
        return m31799D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static int m32694F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32693G(list) + (size * AbstractC3062y7.m31799D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public static int m32693G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2956r8) {
            C2956r8 c2956r8 = (C2956r8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31773z(c2956r8.m32142f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31773z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static int m32692H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3062y7.m31798a(i << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static int m32691I(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m32690J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC3062y7.m31798a(i << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public static int m32689K(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static int m32688L(int i, List list, InterfaceC2734da interfaceC2734da) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += AbstractC3062y7.m31774y(i, (InterfaceC2973s9) list.get(i3), interfaceC2734da);
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static int m32687M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32686N(list) + (size * AbstractC3062y7.m31799D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static int m32686N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2956r8) {
            C2956r8 c2956r8 = (C2956r8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31773z(c2956r8.m32142f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31773z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public static int m32685O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m32684P(list) + (list.size() * AbstractC3062y7.m31799D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static int m32684P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2781g9) {
            C2781g9 c2781g9 = (C2781g9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31797b(c2781g9.mo31957e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31797b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public static int m32683Q(int i, Object obj, InterfaceC2734da interfaceC2734da) {
        if (obj instanceof C3078z8) {
            int m31798a = AbstractC3062y7.m31798a(i << 3);
            int m31652a = ((C3078z8) obj).m31652a();
            return m31798a + AbstractC3062y7.m31798a(m31652a) + m31652a;
        }
        return AbstractC3062y7.m31798a(i << 3) + AbstractC3062y7.m31801B((InterfaceC2973s9) obj, interfaceC2734da);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static int m32682R(int i, List list, InterfaceC2734da interfaceC2734da) {
        int m31801B;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m31799D = AbstractC3062y7.m31799D(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C3078z8) {
                m31801B = AbstractC3062y7.m31802A((C3078z8) obj);
            } else {
                m31801B = AbstractC3062y7.m31801B((InterfaceC2973s9) obj, interfaceC2734da);
            }
            m31799D += m31801B;
        }
        return m31799D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static int m32681S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32680T(list) + (size * AbstractC3062y7.m31799D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static int m32680T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2956r8) {
            C2956r8 c2956r8 = (C2956r8) list;
            i = 0;
            while (i2 < size) {
                int m32142f = c2956r8.m32142f(i2);
                i += AbstractC3062y7.m31798a((m32142f >> 31) ^ (m32142f + m32142f));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += AbstractC3062y7.m31798a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static int m32679U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32678V(list) + (size * AbstractC3062y7.m31799D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static int m32678V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2781g9) {
            C2781g9 c2781g9 = (C2781g9) list;
            i = 0;
            while (i2 < size) {
                long mo31957e = c2781g9.mo31957e(i2);
                i += AbstractC3062y7.m31797b((mo31957e >> 63) ^ (mo31957e + mo31957e));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += AbstractC3062y7.m31797b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static int m32677W(int i, List list) {
        int m31800C;
        int m31800C2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int m31799D = AbstractC3062y7.m31799D(i) * size;
        if (list instanceof InterfaceC2701b9) {
            InterfaceC2701b9 interfaceC2701b9 = (InterfaceC2701b9) list;
            while (i2 < size) {
                Object mo31891s = interfaceC2701b9.mo31891s(i2);
                if (mo31891s instanceof AbstractC2955r7) {
                    m31800C2 = AbstractC3062y7.m31775x((AbstractC2955r7) mo31891s);
                } else {
                    m31800C2 = AbstractC3062y7.m31800C((String) mo31891s);
                }
                m31799D += m31800C2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof AbstractC2955r7) {
                    m31800C = AbstractC3062y7.m31775x((AbstractC2955r7) obj);
                } else {
                    m31800C = AbstractC3062y7.m31800C((String) obj);
                }
                m31799D += m31800C;
                i2++;
            }
        }
        return m31799D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static int m32676X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32675Y(list) + (size * AbstractC3062y7.m31799D(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static int m32675Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2956r8) {
            C2956r8 c2956r8 = (C2956r8) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31798a(c2956r8.m32142f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31798a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static int m32674Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m32672a0(list) + (size * AbstractC3062y7.m31799D(i));
    }

    /* renamed from: a */
    public static AbstractC2958ra m32673a() {
        return f7740c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static int m32672a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2781g9) {
            C2781g9 c2781g9 = (C2781g9) list;
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31797b(c2781g9.mo31957e(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC3062y7.m31797b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static AbstractC2958ra m32671b() {
        return f7741d;
    }

    /* renamed from: b0 */
    public static AbstractC2958ra m32670b0() {
        return f7739b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Object m32669c(int i, List list, InterfaceC2988t8 interfaceC2988t8, Object obj, AbstractC2958ra abstractC2958ra) {
        if (interfaceC2988t8 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (interfaceC2988t8.mo31842e(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m32668d(i, intValue, obj, abstractC2958ra);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!interfaceC2988t8.mo31842e(intValue2)) {
                    obj = m32668d(i, intValue2, obj, abstractC2958ra);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m32668d(int i, int i2, Object obj, AbstractC2958ra abstractC2958ra) {
        if (obj == null) {
            obj = abstractC2958ra.mo32057e();
        }
        abstractC2958ra.mo32056f(obj, i, i2);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m32667e(AbstractC2748e8 abstractC2748e8, Object obj, Object obj2) {
        abstractC2748e8.mo32706a(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m32666f(AbstractC2958ra abstractC2958ra, Object obj, Object obj2) {
        abstractC2958ra.mo32054h(obj, abstractC2958ra.mo32058d(abstractC2958ra.mo32059c(obj), abstractC2958ra.mo32059c(obj2)));
    }

    /* renamed from: g */
    public static void m32665g(Class cls) {
        Class cls2;
        if (!AbstractC2940q8.class.isAssignableFrom(cls) && (cls2 = f7738a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m32664h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m32663i(C2877m9 c2877m9, Object obj, Object obj2, long j) {
        C2703bb.m32833x(obj, j, C2877m9.m32465b(C2703bb.m32846k(obj, j), C2703bb.m32846k(obj2, j)));
    }

    /* renamed from: j */
    public static void m32662j(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31665n(i, list, z);
    }

    /* renamed from: k */
    public static void m32661k(int i, List list, C3077z7 c3077z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31663p(i, list);
    }

    /* renamed from: l */
    public static void m32660l(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31661r(i, list, z);
    }

    /* renamed from: m */
    public static void m32659m(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31658u(i, list, z);
    }

    /* renamed from: n */
    public static void m32658n(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31656w(i, list, z);
    }

    /* renamed from: o */
    public static void m32657o(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31654y(i, list, z);
    }

    /* renamed from: p */
    public static void m32656p(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31689A(i, list, z);
    }

    /* renamed from: q */
    public static void m32655q(int i, List list, C3077z7 c3077z7, InterfaceC2734da interfaceC2734da) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3077z7.m31688B(i, list.get(i2), interfaceC2734da);
        }
    }

    /* renamed from: r */
    public static void m32654r(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31686D(i, list, z);
    }

    /* renamed from: s */
    public static void m32653s(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31684F(i, list, z);
    }

    /* renamed from: t */
    public static void m32652t(int i, List list, C3077z7 c3077z7, InterfaceC2734da interfaceC2734da) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c3077z7.m31683G(i, list.get(i2), interfaceC2734da);
        }
    }

    /* renamed from: u */
    public static void m32651u(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31681I(i, list, z);
    }

    /* renamed from: v */
    public static void m32650v(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31679K(i, list, z);
    }

    /* renamed from: w */
    public static void m32649w(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31677b(i, list, z);
    }

    /* renamed from: x */
    public static void m32648x(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31675d(i, list, z);
    }

    /* renamed from: y */
    public static void m32647y(int i, List list, C3077z7 c3077z7) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31672g(i, list);
    }

    /* renamed from: z */
    public static void m32646z(int i, List list, C3077z7 c3077z7, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c3077z7.m31670i(i, list, z);
    }
}
