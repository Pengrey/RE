package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* loaded from: classes.dex */
public final class C2986t6 {
    /* renamed from: a */
    public static InterfaceC2931q m32065a(C2857l5 c2857l5) {
        if (c2857l5 == null) {
            return InterfaceC2931q.f7930f;
        }
        int m32489J = c2857l5.m32489J() - 1;
        if (m32489J == 1) {
            if (c2857l5.m32490I()) {
                return new C2994u(c2857l5.m32495D());
            }
            return InterfaceC2931q.f7937m;
        } else if (m32489J == 2) {
            if (c2857l5.m32491H()) {
                return new C2803i(Double.valueOf(c2857l5.m32498A()));
            }
            return new C2803i(null);
        } else if (m32489J == 3) {
            if (c2857l5.m32492G()) {
                return new C2771g(Boolean.valueOf(c2857l5.m32493F()));
            }
            return new C2771g(null);
        } else if (m32489J == 4) {
            List<C2857l5> m32494E = c2857l5.m32494E();
            ArrayList arrayList = new ArrayList();
            for (C2857l5 c2857l52 : m32494E) {
                arrayList.add(m32065a(c2857l52));
            }
            return new C2947r(c2857l5.m32496C(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    /* renamed from: b */
    public static InterfaceC2931q m32064b(Object obj) {
        if (obj == null) {
            return InterfaceC2931q.f7931g;
        }
        if (obj instanceof String) {
            return new C2994u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2803i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2803i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2803i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2771g((Boolean) obj);
        }
        if (obj instanceof Map) {
            C2883n c2883n = new C2883n();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                InterfaceC2931q m32064b = m32064b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    c2883n.mo32458q((String) obj2, m32064b);
                }
            }
            return c2883n;
        } else if (obj instanceof List) {
            C2755f c2755f = new C2755f();
            for (Object obj3 : (List) obj) {
                c2755f.m32749F(c2755f.m32746u(), m32064b(obj3));
            }
            return c2755f;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
