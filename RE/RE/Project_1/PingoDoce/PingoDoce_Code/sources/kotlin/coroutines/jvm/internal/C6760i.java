package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugMetadata.kt */
/* renamed from: kotlin.coroutines.jvm.internal.i */
/* loaded from: classes2.dex */
public final class C6760i {

    /* renamed from: a */
    public static final C6760i f18120a = new C6760i();

    /* renamed from: b */
    private static final C6761a f18121b = new C6761a(null, null, null);

    /* renamed from: c */
    private static C6761a f18122c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugMetadata.kt */
    /* renamed from: kotlin.coroutines.jvm.internal.i$a */
    /* loaded from: classes2.dex */
    public static final class C6761a {

        /* renamed from: a */
        public final Method f18123a;

        /* renamed from: b */
        public final Method f18124b;

        /* renamed from: c */
        public final Method f18125c;

        public C6761a(Method method, Method method2, Method method3) {
            this.f18123a = method;
            this.f18124b = method2;
            this.f18125c = method3;
        }
    }

    private C6760i() {
    }

    /* renamed from: a */
    private final C6761a m20185a(ContinuationImpl continuationImpl) {
        try {
            C6761a c6761a = new C6761a(Class.class.getDeclaredMethod("getModule", new Class[0]), continuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), continuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f18122c = c6761a;
            return c6761a;
        } catch (Exception unused) {
            C6761a c6761a2 = f18121b;
            f18122c = c6761a2;
            return c6761a2;
        }
    }

    /* renamed from: b */
    public final String m20184b(ContinuationImpl continuationImpl) {
        Intrinsics.isThisObjectNull(continuationImpl, "continuation");
        C6761a c6761a = f18122c;
        if (c6761a == null) {
            c6761a = m20185a(continuationImpl);
        }
        if (c6761a == f18121b) {
            return null;
        }
        Method method = c6761a.f18123a;
        Object invoke = method != null ? method.invoke(continuationImpl.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = c6761a.f18124b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = c6761a.f18125c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
