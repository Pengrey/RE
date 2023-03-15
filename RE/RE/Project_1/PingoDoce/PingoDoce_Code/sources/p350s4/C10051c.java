package p350s4;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;

/* renamed from: s4.c */
/* loaded from: classes.dex */
public class C10051c {

    /* renamed from: s */
    private static final AtomicBoolean f26269s = new AtomicBoolean(false);

    /* renamed from: t */
    private static C10051c f26270t = null;

    /* renamed from: u */
    public static final AtomicBoolean f26271u = new AtomicBoolean(false);

    /* renamed from: v */
    public static final Map<String, JSONObject> f26272v = new ConcurrentHashMap();

    /* renamed from: w */
    public static final Map<String, JSONObject> f26273w = new ConcurrentHashMap();

    /* renamed from: a */
    private final Context f26274a;

    /* renamed from: b */
    private final Object f26275b;

    /* renamed from: c */
    private final C10060g f26276c;

    /* renamed from: d */
    private final Class<?> f26277d;

    /* renamed from: e */
    private final Class<?> f26278e;

    /* renamed from: f */
    private final Class<?> f26279f;

    /* renamed from: g */
    private final Class<?> f26280g;

    /* renamed from: h */
    private final Class<?> f26281h;

    /* renamed from: i */
    private final Class<?> f26282i;

    /* renamed from: j */
    private final Class<?> f26283j;

    /* renamed from: k */
    private final Method f26284k;

    /* renamed from: l */
    private final Method f26285l;

    /* renamed from: m */
    private final Method f26286m;

    /* renamed from: n */
    private final Method f26287n;

    /* renamed from: o */
    private final Method f26288o;

    /* renamed from: p */
    private final Method f26289p;

    /* renamed from: q */
    private final Method f26290q;

    /* renamed from: r */
    private final Set<String> f26291r = new CopyOnWriteArraySet();

    /* compiled from: InAppPurchaseBillingClientWrapper.java */
    /* renamed from: s4.c$a */
    /* loaded from: classes.dex */
    class RunnableC10052a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ Runnable f26292w;

        RunnableC10052a(Runnable runnable) {
            this.f26292w = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                C10051c.m9327b(C10051c.this, "inapp", new ArrayList(C10051c.m9328a(C10051c.this)), this.f26292w);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseBillingClientWrapper.java */
    /* renamed from: s4.c$b */
    /* loaded from: classes.dex */
    public static class C10053b implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onBillingSetupFinished")) {
                C10051c.f26271u.set(true);
                return null;
            } else if (method.getName().endsWith("onBillingServiceDisconnected")) {
                C10051c.f26271u.set(false);
                return null;
            } else {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseBillingClientWrapper.java */
    /* renamed from: s4.c$c */
    /* loaded from: classes.dex */
    public class C10054c implements InvocationHandler {

        /* renamed from: a */
        Runnable f26294a;

        public C10054c(Runnable runnable) {
            this.f26294a = runnable;
        }

        /* renamed from: a */
        private void m9313a(List<?> list) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object m9278c = C10061h.m9278c(C10051c.m9326c(C10051c.this), C10051c.m9325d(C10051c.this), it.next(), new Object[0]);
                    if (m9278c instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) m9278c);
                        jSONObject.put("packageName", C10051c.m9324e(C10051c.this).getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            C10051c.m9328a(C10051c.this).add(string);
                            C10051c.f26272v.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f26294a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onPurchaseHistoryResponse")) {
                Object obj2 = objArr[1];
                if (obj2 instanceof List) {
                    m9313a((List) obj2);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseBillingClientWrapper.java */
    /* renamed from: s4.c$d */
    /* loaded from: classes.dex */
    public static class C10055d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseBillingClientWrapper.java */
    /* renamed from: s4.c$e */
    /* loaded from: classes.dex */
    public class C10056e implements InvocationHandler {

        /* renamed from: a */
        Runnable f26296a;

        public C10056e(Runnable runnable) {
            this.f26296a = runnable;
        }

        /* renamed from: a */
        void m9312a(List<?> list) {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                try {
                    Object m9278c = C10061h.m9278c(C10051c.m9323f(C10051c.this), C10051c.m9322g(C10051c.this), it.next(), new Object[0]);
                    if (m9278c instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) m9278c);
                        if (jSONObject.has("productId")) {
                            C10051c.f26273w.put(jSONObject.getString("productId"), jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f26296a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getName().equals("onSkuDetailsResponse")) {
                Object obj2 = objArr[1];
                if (obj2 instanceof List) {
                    m9312a((List) obj2);
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    private C10051c(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C10060g c10060g) {
        this.f26274a = context;
        this.f26275b = obj;
        this.f26277d = cls;
        this.f26278e = cls2;
        this.f26279f = cls3;
        this.f26280g = cls4;
        this.f26281h = cls5;
        this.f26282i = cls6;
        this.f26283j = cls7;
        this.f26284k = method;
        this.f26285l = method2;
        this.f26286m = method3;
        this.f26287n = method4;
        this.f26288o = method5;
        this.f26289p = method6;
        this.f26290q = method7;
        this.f26276c = c10060g;
    }

    /* renamed from: a */
    static /* synthetic */ Set m9328a(C10051c c10051c) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            return c10051c.f26291r;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m9327b(C10051c c10051c, String str, List list, Runnable runnable) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return;
        }
        try {
            c10051c.m9315n(str, list, runnable);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
        }
    }

    /* renamed from: c */
    static /* synthetic */ Class m9326c(C10051c c10051c) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            return c10051c.f26281h;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: d */
    static /* synthetic */ Method m9325d(C10051c c10051c) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            return c10051c.f26288o;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ Context m9324e(C10051c c10051c) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            return c10051c.f26274a;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ Class m9323f(C10051c c10051c) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            return c10051c.f26280g;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ Method m9322g(C10051c c10051c) {
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            return c10051c.f26287n;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: h */
    static Object m9321h(Context context, Class<?> cls) {
        Object m9278c;
        Object m9278c2;
        Object m9278c3;
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return null;
        }
        try {
            Class<?> m9280a = C10061h.m9280a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> m9280a2 = C10061h.m9280a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (m9280a != null && m9280a2 != null) {
                Method m9279b = C10061h.m9279b(cls, "newBuilder", Context.class);
                Method m9279b2 = C10061h.m9279b(m9280a, "enablePendingPurchases", new Class[0]);
                Method m9279b3 = C10061h.m9279b(m9280a, "setListener", m9280a2);
                Method m9279b4 = C10061h.m9279b(m9280a, "build", new Class[0]);
                if (m9279b == null || m9279b2 == null || m9279b3 == null || m9279b4 == null || (m9278c = C10061h.m9278c(cls, m9279b, null, context)) == null || (m9278c2 = C10061h.m9278c(m9280a, m9279b3, m9278c, Proxy.newProxyInstance(m9280a2.getClassLoader(), new Class[]{m9280a2}, new C10055d()))) == null || (m9278c3 = C10061h.m9278c(m9280a, m9279b2, m9278c2, new Object[0])) == null) {
                    return null;
                }
                return C10061h.m9278c(m9280a, m9279b4, m9278c3, new Object[0]);
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
            return null;
        }
    }

    /* renamed from: i */
    private static void m9320i(Context context) {
        Object m9321h;
        if (CrashShieldHandler.m25963d(C10051c.class)) {
            return;
        }
        try {
            C10060g m9283b = C10060g.m9283b();
            if (m9283b == null) {
                return;
            }
            Class<?> m9280a = C10061h.m9280a("com.android.billingclient.api.BillingClient");
            Class<?> m9280a2 = C10061h.m9280a("com.android.billingclient.api.Purchase");
            Class<?> m9280a3 = C10061h.m9280a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> m9280a4 = C10061h.m9280a("com.android.billingclient.api.SkuDetails");
            Class<?> m9280a5 = C10061h.m9280a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> m9280a6 = C10061h.m9280a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> m9280a7 = C10061h.m9280a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (m9280a != null && m9280a3 != null && m9280a2 != null && m9280a4 != null && m9280a6 != null && m9280a5 != null && m9280a7 != null) {
                Method m9279b = C10061h.m9279b(m9280a, "queryPurchases", String.class);
                Method m9279b2 = C10061h.m9279b(m9280a3, "getPurchasesList", new Class[0]);
                Method m9279b3 = C10061h.m9279b(m9280a2, "getOriginalJson", new Class[0]);
                Method m9279b4 = C10061h.m9279b(m9280a4, "getOriginalJson", new Class[0]);
                Method m9279b5 = C10061h.m9279b(m9280a5, "getOriginalJson", new Class[0]);
                Method m9279b6 = C10061h.m9279b(m9280a, "querySkuDetailsAsync", m9283b.m9281d(), m9280a6);
                Method m9279b7 = C10061h.m9279b(m9280a, "queryPurchaseHistoryAsync", String.class, m9280a7);
                if (m9279b == null || m9279b2 == null || m9279b3 == null || m9279b4 == null || m9279b5 == null || m9279b6 == null || m9279b7 == null || (m9321h = m9321h(context, m9280a)) == null) {
                    return;
                }
                C10051c c10051c = new C10051c(context, m9321h, m9280a, m9280a3, m9280a2, m9280a4, m9280a5, m9280a6, m9280a7, m9279b, m9279b2, m9279b3, m9279b4, m9279b5, m9279b6, m9279b7, m9283b);
                f26270t = c10051c;
                c10051c.m9314o();
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10051c.class);
        }
    }

    /* renamed from: j */
    public static synchronized C10051c m9319j(Context context) {
        synchronized (C10051c.class) {
            if (CrashShieldHandler.m25963d(C10051c.class)) {
                return null;
            }
            AtomicBoolean atomicBoolean = f26269s;
            if (atomicBoolean.get()) {
                return f26270t;
            }
            m9320i(context);
            atomicBoolean.set(true);
            return f26270t;
        }
    }

    /* renamed from: m */
    private void m9316m(String str, Runnable runnable) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            C10061h.m9278c(this.f26277d, this.f26290q, this.f26275b, str, Proxy.newProxyInstance(this.f26283j.getClassLoader(), new Class[]{this.f26283j}, new C10054c(runnable)));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: n */
    private void m9315n(String str, List<String> list, Runnable runnable) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(this.f26282i.getClassLoader(), new Class[]{this.f26282i}, new C10056e(runnable));
            C10061h.m9278c(this.f26277d, this.f26289p, this.f26275b, this.f26276c.m9282c(str, list), newProxyInstance);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: o */
    private void m9314o() {
        Method m9279b;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Class<?> m9280a = C10061h.m9280a("com.android.billingclient.api.BillingClientStateListener");
            if (m9280a == null || (m9279b = C10061h.m9279b(this.f26277d, "startConnection", m9280a)) == null) {
                return;
            }
            C10061h.m9278c(this.f26277d, m9279b, this.f26275b, Proxy.newProxyInstance(m9280a.getClassLoader(), new Class[]{m9280a}, new C10053b()));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: k */
    public void m9318k(String str, Runnable runnable) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Object m9278c = C10061h.m9278c(this.f26278e, this.f26285l, C10061h.m9278c(this.f26277d, this.f26284k, this.f26275b, "inapp"), new Object[0]);
            if (m9278c instanceof List) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (List) m9278c) {
                        Object m9278c2 = C10061h.m9278c(this.f26279f, this.f26286m, obj, new Object[0]);
                        if (m9278c2 instanceof String) {
                            JSONObject jSONObject = new JSONObject((String) m9278c2);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                arrayList.add(string);
                                f26272v.put(string, jSONObject);
                            }
                        }
                    }
                    m9315n(str, arrayList, runnable);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: l */
    public void m9317l(String str, Runnable runnable) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            m9316m(str, new RunnableC10052a(runnable));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
