package sa;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: sa.m */
/* loaded from: classes2.dex */
public abstract class AbstractC10138m {

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: sa.m$a */
    /* loaded from: classes2.dex */
    class C10139a extends AbstractC10138m {

        /* renamed from: a */
        final /* synthetic */ Method f26440a;

        /* renamed from: b */
        final /* synthetic */ Object f26441b;

        C10139a(Method method, Object obj) {
            this.f26440a = method;
            this.f26441b = obj;
        }

        @Override // sa.AbstractC10138m
        /* renamed from: c */
        public <T> T mo9072c(Class<T> cls) throws Exception {
            AbstractC10138m.m9074a(cls);
            return (T) this.f26440a.invoke(this.f26441b, cls);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: sa.m$b */
    /* loaded from: classes2.dex */
    class C10140b extends AbstractC10138m {

        /* renamed from: a */
        final /* synthetic */ Method f26442a;

        /* renamed from: b */
        final /* synthetic */ int f26443b;

        C10140b(Method method, int i) {
            this.f26442a = method;
            this.f26443b = i;
        }

        @Override // sa.AbstractC10138m
        /* renamed from: c */
        public <T> T mo9072c(Class<T> cls) throws Exception {
            AbstractC10138m.m9074a(cls);
            return (T) this.f26442a.invoke(null, cls, Integer.valueOf(this.f26443b));
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: sa.m$c */
    /* loaded from: classes2.dex */
    class C10141c extends AbstractC10138m {

        /* renamed from: a */
        final /* synthetic */ Method f26444a;

        C10141c(Method method) {
            this.f26444a = method;
        }

        @Override // sa.AbstractC10138m
        /* renamed from: c */
        public <T> T mo9072c(Class<T> cls) throws Exception {
            AbstractC10138m.m9074a(cls);
            return (T) this.f26444a.invoke(null, cls, Object.class);
        }
    }

    /* compiled from: UnsafeAllocator.java */
    /* renamed from: sa.m$d */
    /* loaded from: classes2.dex */
    class C10142d extends AbstractC10138m {
        C10142d() {
        }

        @Override // sa.AbstractC10138m
        /* renamed from: c */
        public <T> T mo9072c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    static void m9074a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (Modifier.isAbstract(modifiers)) {
                throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
            }
            return;
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    /* renamed from: b */
    public static AbstractC10138m m9073b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C10139a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new C10140b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new C10141c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new C10142d();
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo9072c(Class<T> cls) throws Exception;
}
