package p181jd;

import id.InterfaceC6097a;
import id.InterfaceC6098b;
import id.InterfaceC6099c;
import id.InterfaceC6100d;
import id.InterfaceC6101e;
import id.InterfaceC6102f;
import id.InterfaceC6103g;
import id.InterfaceC6104h;
import id.InterfaceC6105i;
import id.InterfaceC6106j;
import id.InterfaceC6107k;
import id.InterfaceC6108l;
import id.InterfaceC6109m;
import id.InterfaceC6110n;
import id.InterfaceC6111o;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import id.InterfaceC6115s;
import id.InterfaceC6116t;
import id.InterfaceC6117u;
import id.InterfaceC6118v;
import id.InterfaceC6119w;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p203kd.InterfaceC6650a;
import p203kd.InterfaceC6651b;
import p203kd.InterfaceC6652c;
import p203kd.InterfaceC6653d;
import p203kd.InterfaceC6655e;
import p468yc.InterfaceC13174c;

/* renamed from: jd.d0 */
/* loaded from: classes2.dex */
public class C6431d0 {
    /* renamed from: a */
    public static Iterable m20954a(Object obj) {
        if ((obj instanceof InterfaceC6650a) && !(obj instanceof InterfaceC6651b)) {
            m20941n(obj, "kotlin.collections.MutableIterable");
        }
        return m20950e(obj);
    }

    /* renamed from: b */
    public static List m20953b(Object obj) {
        if ((obj instanceof InterfaceC6650a) && !(obj instanceof InterfaceC6652c)) {
            m20941n(obj, "kotlin.collections.MutableList");
        }
        return m20949f(obj);
    }

    /* renamed from: c */
    public static Map m20952c(Object obj) {
        if ((obj instanceof InterfaceC6650a) && !(obj instanceof InterfaceC6653d)) {
            m20941n(obj, "kotlin.collections.MutableMap");
        }
        return m20948g(obj);
    }

    /* renamed from: d */
    public static Object m20951d(Object obj, int i) {
        if (obj != null && !m20946i(obj, i)) {
            m20941n(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: e */
    public static Iterable m20950e(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m20942m(e);
        }
    }

    /* renamed from: f */
    public static List m20949f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m20942m(e);
        }
    }

    /* renamed from: g */
    public static Map m20948g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m20942m(e);
        }
    }

    /* renamed from: h */
    public static int m20947h(Object obj) {
        if (obj instanceof InterfaceC6433g) {
            return ((InterfaceC6433g) obj).getArity();
        }
        if (obj instanceof InterfaceC6097a) {
            return 0;
        }
        if (obj instanceof InterfaceC6108l) {
            return 1;
        }
        if (obj instanceof InterfaceC6112p) {
            return 2;
        }
        if (obj instanceof InterfaceC6113q) {
            return 3;
        }
        if (obj instanceof InterfaceC6114r) {
            return 4;
        }
        if (obj instanceof InterfaceC6115s) {
            return 5;
        }
        if (obj instanceof InterfaceC6116t) {
            return 6;
        }
        if (obj instanceof InterfaceC6117u) {
            return 7;
        }
        if (obj instanceof InterfaceC6118v) {
            return 8;
        }
        if (obj instanceof InterfaceC6119w) {
            return 9;
        }
        if (obj instanceof InterfaceC6098b) {
            return 10;
        }
        if (obj instanceof InterfaceC6099c) {
            return 11;
        }
        if (obj instanceof InterfaceC6100d) {
            return 12;
        }
        if (obj instanceof InterfaceC6101e) {
            return 13;
        }
        if (obj instanceof InterfaceC6102f) {
            return 14;
        }
        if (obj instanceof InterfaceC6103g) {
            return 15;
        }
        if (obj instanceof InterfaceC6104h) {
            return 16;
        }
        if (obj instanceof InterfaceC6105i) {
            return 17;
        }
        if (obj instanceof InterfaceC6106j) {
            return 18;
        }
        if (obj instanceof InterfaceC6107k) {
            return 19;
        }
        if (obj instanceof InterfaceC6109m) {
            return 20;
        }
        if (obj instanceof InterfaceC6110n) {
            return 21;
        }
        return obj instanceof InterfaceC6111o ? 22 : -1;
    }

    /* renamed from: i */
    public static boolean m20946i(Object obj, int i) {
        return (obj instanceof InterfaceC13174c) && m20947h(obj) == i;
    }

    /* renamed from: j */
    public static boolean m20945j(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof InterfaceC6650a) || (obj instanceof InterfaceC6653d.InterfaceC6654a));
    }

    /* renamed from: k */
    public static boolean m20944k(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof InterfaceC6650a) || (obj instanceof InterfaceC6655e));
    }

    /* renamed from: l */
    private static <T extends Throwable> T m20943l(T t) {
        return (T) Intrinsics.m20920o(t, C6431d0.class.getName());
    }

    /* renamed from: m */
    public static ClassCastException m20942m(ClassCastException classCastException) {
        throw ((ClassCastException) m20943l(classCastException));
    }

    /* renamed from: n */
    public static void m20941n(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m20940o(name + " cannot be cast to " + str);
    }

    /* renamed from: o */
    public static void m20940o(String str) {
        throw m20942m(new ClassCastException(str));
    }
}
