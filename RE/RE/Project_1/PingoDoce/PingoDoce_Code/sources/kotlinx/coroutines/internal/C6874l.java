package kotlinx.coroutines.internal;

import ad.C0127b;
import id.InterfaceC6108l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import p139hd.JvmClassMapping;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import p489zc._Arrays;
import td.InterfaceC10490c0;

/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes2.dex */
public final class C6874l {

    /* renamed from: a */
    private static final int f18324a = m19931f(Throwable.class, -1);

    /* renamed from: b */
    private static final AbstractC6868i f18325b;

    /* compiled from: Comparisons.kt */
    /* renamed from: kotlinx.coroutines.internal.l$a */
    /* loaded from: classes2.dex */
    public static final class C6875a<T> implements Comparator {
        public final int compare(Object obj, Object obj2) {
            int m41795a;
            m41795a = C0127b.m41795a(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
            return m41795a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstructor.kt */
    /* renamed from: kotlinx.coroutines.internal.l$b */
    /* loaded from: classes2.dex */
    public static final class C6876b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6876b f18326w = new C6876b();

        C6876b() {
            super(1);
        }

        /* renamed from: a */
        public final Void mo9587d(Throwable th2) {
            return null;
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    /* renamed from: kotlinx.coroutines.internal.l$c */
    /* loaded from: classes2.dex */
    public static final class C6877c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Constructor f18327w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6877c(Constructor constructor) {
            super(1);
            this.f18327w = constructor;
        }

        /* renamed from: a */
        public final Throwable mo9587d(Throwable th2) {
            Object m1458a;
            Object newInstance;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                newInstance = this.f18327w.newInstance(th2.getMessage(), th2);
            } catch (Throwable th3) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th3));
            }
            if (newInstance != null) {
                m1458a = C13183m.m1458a((Throwable) newInstance);
                if (C13183m.m1456c(m1458a)) {
                    m1458a = null;
                }
                return (Throwable) m1458a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    /* renamed from: kotlinx.coroutines.internal.l$d */
    /* loaded from: classes2.dex */
    public static final class C6878d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Constructor f18328w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6878d(Constructor constructor) {
            super(1);
            this.f18328w = constructor;
        }

        /* renamed from: a */
        public final Throwable mo9587d(Throwable th2) {
            Object m1458a;
            Object newInstance;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                newInstance = this.f18328w.newInstance(th2);
            } catch (Throwable th3) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th3));
            }
            if (newInstance != null) {
                m1458a = C13183m.m1458a((Throwable) newInstance);
                if (C13183m.m1456c(m1458a)) {
                    m1458a = null;
                }
                return (Throwable) m1458a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    /* renamed from: kotlinx.coroutines.internal.l$e */
    /* loaded from: classes2.dex */
    public static final class C6879e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Constructor f18329w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6879e(Constructor constructor) {
            super(1);
            this.f18329w = constructor;
        }

        /* renamed from: a */
        public final Throwable mo9587d(Throwable th2) {
            Object m1458a;
            Object newInstance;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                newInstance = this.f18329w.newInstance(th2.getMessage());
            } catch (Throwable th3) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                m1458a = C13183m.m1458a(th4);
                if (C13183m.m1456c(m1458a)) {
                    m1458a = null;
                }
                return (Throwable) m1458a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstructor.kt */
    /* renamed from: kotlinx.coroutines.internal.l$f */
    /* loaded from: classes2.dex */
    public static final class C6880f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Constructor f18330w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6880f(Constructor constructor) {
            super(1);
            this.f18330w = constructor;
        }

        /* renamed from: a */
        public final Throwable mo9587d(Throwable th2) {
            Object m1458a;
            Object newInstance;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                newInstance = this.f18330w.newInstance(new Object[0]);
            } catch (Throwable th3) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                m1458a = C13183m.m1458a(th4);
                if (C13183m.m1456c(m1458a)) {
                    m1458a = null;
                }
                return (Throwable) m1458a;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    static {
        AbstractC6868i abstractC6868i;
        try {
            abstractC6868i = C6887n.m19899a() ? C6892p0.f18350a : C6857d.f18303a;
        } catch (Throwable unused) {
            abstractC6868i = C6892p0.f18350a;
        }
        f18325b = abstractC6868i;
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC6108l m19936a(Class cls) {
        return m19935b(cls);
    }

    /* renamed from: b */
    private static final InterfaceC6108l m19935b(Class cls) {
        List<Constructor> m278P;
        C6876b c6876b = C6876b.f18326w;
        if (f18324a != m19931f(cls, 0)) {
            return c6876b;
        }
        m278P = _Arrays.m278P(cls.getConstructors(), new C6875a());
        for (Constructor constructor : m278P) {
            InterfaceC6108l m19934c = m19934c(constructor);
            if (m19934c != null) {
                return m19934c;
            }
        }
        return c6876b;
    }

    /* renamed from: c */
    private static final InterfaceC6108l m19934c(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && Intrinsics.equals(parameterTypes[0], String.class) && Intrinsics.equals(parameterTypes[1], Throwable.class)) {
                    return new C6877c(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (Intrinsics.equals(cls, Throwable.class)) {
                return new C6878d(constructor);
            }
            if (Intrinsics.equals(cls, String.class)) {
                return new C6879e(constructor);
            }
            return null;
        }
        return new C6880f(constructor);
    }

    /* renamed from: d */
    private static final int m19933d(Class cls, int i) {
        Field[] declaredFields;
        do {
            int length = cls.getDeclaredFields().length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(declaredFields[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }

    /* renamed from: e */
    static /* synthetic */ int m19932e(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m19933d(cls, i);
    }

    /* renamed from: f */
    private static final int m19931f(Class cls, int i) {
        Integer m1458a;
        JvmClassMapping.m22765c(cls);
        try {
            C13183m.C13184a c13184a = C13183m.f34143w;
            m1458a = C13183m.m1458a(Integer.valueOf(m19932e(cls, 0, 1, null)));
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m1458a = C13183m.m1458a(C13186n.m1454a(th2));
        }
        Integer valueOf = Integer.valueOf(i);
        if (C13183m.m1456c(m1458a)) {
            m1458a = valueOf;
        }
        return ((Number) m1458a).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final Throwable m19930g(Throwable th2) {
        Object m1458a;
        if (th2 instanceof InterfaceC10490c0) {
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m1458a = C13183m.m1458a(((InterfaceC10490c0) th2).mo7843a());
            } catch (Throwable th3) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th3));
            }
            if (C13183m.m1456c(m1458a)) {
                m1458a = null;
            }
            return (Throwable) m1458a;
        }
        return f18325b.mo19889a(th2.getClass()).mo9587d(th2);
    }
}
