package p350s4;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p076e5.CrashShieldHandler;

/* renamed from: s4.g */
/* loaded from: classes.dex */
public class C10060g {

    /* renamed from: g */
    private static C10060g f26307g;

    /* renamed from: h */
    private static final AtomicBoolean f26308h = new AtomicBoolean(false);

    /* renamed from: a */
    private final Class<?> f26309a;

    /* renamed from: b */
    private final Class<?> f26310b;

    /* renamed from: c */
    private final Method f26311c;

    /* renamed from: d */
    private final Method f26312d;

    /* renamed from: e */
    private final Method f26313e;

    /* renamed from: f */
    private final Method f26314f;

    public C10060g(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f26309a = cls;
        this.f26310b = cls2;
        this.f26311c = method;
        this.f26312d = method2;
        this.f26313e = method3;
        this.f26314f = method4;
    }

    /* renamed from: a */
    private static void m9284a() {
        if (CrashShieldHandler.m25963d(C10060g.class)) {
            return;
        }
        try {
            Class<?> m9280a = C10061h.m9280a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> m9280a2 = C10061h.m9280a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (m9280a != null && m9280a2 != null) {
                Method m9279b = C10061h.m9279b(m9280a, "newBuilder", new Class[0]);
                Method m9279b2 = C10061h.m9279b(m9280a2, "setType", String.class);
                Method m9279b3 = C10061h.m9279b(m9280a2, "setSkusList", List.class);
                Method m9279b4 = C10061h.m9279b(m9280a2, "build", new Class[0]);
                if (m9279b != null && m9279b2 != null && m9279b3 != null && m9279b4 != null) {
                    f26307g = new C10060g(m9280a, m9280a2, m9279b, m9279b2, m9279b3, m9279b4);
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10060g.class);
        }
    }

    /* renamed from: b */
    public static C10060g m9283b() {
        if (CrashShieldHandler.m25963d(C10060g.class)) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = f26308h;
            if (atomicBoolean.get()) {
                return f26307g;
            }
            m9284a();
            atomicBoolean.set(true);
            return f26307g;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10060g.class);
            return null;
        }
    }

    /* renamed from: c */
    public Object m9282c(String str, List<String> list) {
        Object m9278c;
        Object m9278c2;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Object m9278c3 = C10061h.m9278c(this.f26309a, this.f26311c, null, new Object[0]);
            if (m9278c3 == null || (m9278c = C10061h.m9278c(this.f26310b, this.f26312d, m9278c3, str)) == null || (m9278c2 = C10061h.m9278c(this.f26310b, this.f26313e, m9278c, list)) == null) {
                return null;
            }
            return C10061h.m9278c(this.f26310b, this.f26314f, m9278c2, new Object[0]);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    public Class<?> m9281d() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return this.f26309a;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }
}
