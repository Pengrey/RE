package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: okhttp3.internal.platform.e */
/* loaded from: classes2.dex */
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: i */
    public static final C8152b f21200i = new C8152b(null);

    /* renamed from: d */
    private final Method f21201d;

    /* renamed from: e */
    private final Method f21202e;

    /* renamed from: f */
    private final Method f21203f;

    /* renamed from: g */
    private final Class f21204g;

    /* renamed from: h */
    private final Class f21205h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    /* renamed from: okhttp3.internal.platform.e$a */
    /* loaded from: classes2.dex */
    private static final class C8151a implements InvocationHandler {

        /* renamed from: a */
        private final List f21206a;

        /* renamed from: b */
        private boolean f21207b;

        /* renamed from: c */
        private String f21208c;

        public C8151a(List list) {
            Intrinsics.isThisObjectNull(list, "protocols");
            this.f21206a = list;
        }

        /* renamed from: a */
        public final String m16493a() {
            return this.f21208c;
        }

        /* renamed from: b */
        public final boolean m16492b() {
            return this.f21207b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Intrinsics.isThisObjectNull(obj, "proxy");
            Intrinsics.isThisObjectNull(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.equals(name, "supports") && Intrinsics.equals(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.equals(name, "unsupported") && Intrinsics.equals(Void.TYPE, returnType)) {
                this.f21207b = true;
                return null;
            }
            if (Intrinsics.equals(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f21206a;
                }
            }
            if ((Intrinsics.equals(name, "selectProtocol") || Intrinsics.equals(name, "select")) && Intrinsics.equals(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object obj3 = list.get(i);
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (this.f21206a.contains(str)) {
                            this.f21208c = str;
                            return str;
                        } else if (i == size) {
                            break;
                        } else {
                            i = i2;
                        }
                    }
                }
                String str2 = (String) this.f21206a.get(0);
                this.f21208c = str2;
                return str2;
            } else if ((Intrinsics.equals(name, "protocolSelected") || Intrinsics.equals(name, "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f21208c = (String) obj4;
                return null;
            } else {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    /* renamed from: okhttp3.internal.platform.e$b */
    /* loaded from: classes2.dex */
    public static final class C8152b {
        private C8152b() {
        }

        public /* synthetic */ C8152b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Platform m16491a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkIfNull(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName(Intrinsics.addStrAndObj("org.eclipse.jetty.alpn.ALPN", "$Provider"), true, null);
                Class<?> cls3 = Class.forName(Intrinsics.addStrAndObj("org.eclipse.jetty.alpn.ALPN", "$ClientProvider"), true, null);
                Class<?> cls4 = Class.forName(Intrinsics.addStrAndObj("org.eclipse.jetty.alpn.ALPN", "$ServerProvider"), true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                Intrinsics.checkIfNull(method, "putMethod");
                Intrinsics.checkIfNull(method2, "getMethod");
                Intrinsics.checkIfNull(method3, "removeMethod");
                Intrinsics.checkIfNull(cls3, "clientProviderClass");
                Intrinsics.checkIfNull(cls4, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        Intrinsics.isThisObjectNull(method, "putMethod");
        Intrinsics.isThisObjectNull(method2, "getMethod");
        Intrinsics.isThisObjectNull(method3, "removeMethod");
        Intrinsics.isThisObjectNull(cls, "clientProviderClass");
        Intrinsics.isThisObjectNull(cls2, "serverProviderClass");
        this.f21201d = method;
        this.f21202e = method2;
        this.f21203f = method3;
        this.f21204g = cls;
        this.f21205h = cls2;
    }

    /* renamed from: b */
    public void m16496b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        try {
            this.f21203f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    /* renamed from: e */
    public void m16495e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        try {
            this.f21201d.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f21204g, this.f21205h}, new C8151a(Platform.f21214a.m16462b(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: g */
    public String m16494g(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f21202e.invoke(null, sSLSocket));
            if (invocationHandler != null) {
                C8151a c8151a = (C8151a) invocationHandler;
                if (!c8151a.m16492b() && c8151a.m16493a() == null) {
                    Platform.m16468k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (c8151a.m16492b()) {
                    return null;
                } else {
                    return c8151a.m16493a();
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
