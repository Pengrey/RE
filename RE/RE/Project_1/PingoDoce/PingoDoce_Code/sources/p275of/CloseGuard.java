package p275of;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: of.h */
/* loaded from: classes2.dex */
public final class CloseGuard {

    /* renamed from: d */
    public static final C8070a f20868d = new C8070a(null);

    /* renamed from: a */
    private final Method f20869a;

    /* renamed from: b */
    private final Method f20870b;

    /* renamed from: c */
    private final Method f20871c;

    /* compiled from: CloseGuard.kt */
    /* renamed from: of.h$a */
    /* loaded from: classes2.dex */
    public static final class C8070a {
        private C8070a() {
        }

        public /* synthetic */ C8070a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CloseGuard m16980a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.f20869a = method;
        this.f20870b = method2;
        this.f20871c = method3;
    }

    /* renamed from: a */
    public final Object m16982a(String str) {
        Intrinsics.isThisObjectNull(str, "closer");
        Method method = this.f20869a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = this.f20870b;
                Intrinsics.ifNullDoSomething(method2);
                method2.invoke(invoke, str);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m16981b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f20871c;
                Intrinsics.ifNullDoSomething(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
