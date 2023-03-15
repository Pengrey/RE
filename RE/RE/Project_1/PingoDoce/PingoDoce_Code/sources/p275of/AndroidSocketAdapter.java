package p275of;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import p181jd.Intrinsics;
import p275of.DeferredSocketAdapter;
import sd.C10150d;
import sd.StringsJVM;

/* renamed from: of.f */
/* loaded from: classes2.dex */
public class AndroidSocketAdapter implements InterfaceC8074k {

    /* renamed from: f */
    public static final C8066a f20858f;

    /* renamed from: g */
    private static final DeferredSocketAdapter.InterfaceC8073a f20859g;

    /* renamed from: a */
    private final Class f20860a;

    /* renamed from: b */
    private final Method f20861b;

    /* renamed from: c */
    private final Method f20862c;

    /* renamed from: d */
    private final Method f20863d;

    /* renamed from: e */
    private final Method f20864e;

    /* compiled from: AndroidSocketAdapter.kt */
    /* renamed from: of.f$a */
    /* loaded from: classes2.dex */
    public static final class C8066a {

        /* compiled from: AndroidSocketAdapter.kt */
        /* renamed from: of.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C8067a implements DeferredSocketAdapter.InterfaceC8073a {

            /* renamed from: a */
            final /* synthetic */ String f20865a;

            C8067a(String str) {
                this.f20865a = str;
            }

            /* renamed from: a */
            public boolean m16988a(SSLSocket sSLSocket) {
                boolean m8948C;
                Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                Intrinsics.checkIfNull(name, "sslSocket.javaClass.name");
                m8948C = StringsJVM.m8948C(name, Intrinsics.addStrAndObj(this.f20865a, "."), false, 2, null);
                return m8948C;
            }

            /* renamed from: b */
            public InterfaceC8074k m16987b(SSLSocket sSLSocket) {
                Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
                return C8066a.m16992a(AndroidSocketAdapter.f20858f, sSLSocket.getClass());
            }
        }

        private C8066a() {
        }

        public /* synthetic */ C8066a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ AndroidSocketAdapter m16992a(C8066a c8066a, Class cls) {
            return c8066a.m16991b(cls);
        }

        /* renamed from: b */
        private final AndroidSocketAdapter m16991b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !Intrinsics.equals(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError(Intrinsics.addStrAndObj("No OpenSSLSocketImpl superclass of socket of type ", cls));
                }
            }
            Intrinsics.ifNullDoSomething(cls2);
            return new AndroidSocketAdapter(cls2);
        }

        /* renamed from: c */
        public final DeferredSocketAdapter.InterfaceC8073a m16990c(String str) {
            Intrinsics.isThisObjectNull(str, "packageName");
            return new C8067a(str);
        }

        /* renamed from: d */
        public final DeferredSocketAdapter.InterfaceC8073a m16989d() {
            return AndroidSocketAdapter.m16993e();
        }
    }

    static {
        C8066a c8066a = new C8066a(null);
        f20858f = c8066a;
        f20859g = c8066a.m16990c("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class cls) {
        Intrinsics.isThisObjectNull(cls, "sslSocketClass");
        this.f20860a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkIfNull(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f20861b = declaredMethod;
        this.f20862c = cls.getMethod("setHostname", String.class);
        this.f20863d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f20864e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    /* renamed from: e */
    public static final /* synthetic */ DeferredSocketAdapter.InterfaceC8073a m16993e() {
        return f20859g;
    }

    /* renamed from: a */
    public boolean mo16972a(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        return this.f20860a.isInstance(sSLSocket);
    }

    /* renamed from: b */
    public String mo16971b(SSLSocket sSLSocket) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        if (mo16972a(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f20863d.invoke(sSLSocket, new Object[0]);
                if (bArr == null) {
                    return null;
                }
                return new String(bArr, C10150d.f26472b);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if ((cause instanceof NullPointerException) && Intrinsics.equals(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    return null;
                }
                throw new AssertionError(e2);
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo16970c() {
        return AndroidPlatform.f21187f.m16513b();
    }

    /* renamed from: d */
    public void mo16969d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.isThisObjectNull(sSLSocket, "sslSocket");
        Intrinsics.isThisObjectNull(list, "protocols");
        if (mo16972a(sSLSocket)) {
            try {
                this.f20861b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f20862c.invoke(sSLSocket, str);
                }
                this.f20864e.invoke(sSLSocket, Platform.f21214a.m16461c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
