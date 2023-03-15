package com.squareup.moshi;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p313qc.C9712b;

/* renamed from: com.squareup.moshi.b */
/* loaded from: classes2.dex */
abstract class AbstractC4457b<T> {

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$a */
    /* loaded from: classes2.dex */
    class C4458a extends AbstractC4457b<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f12051a;

        /* renamed from: b */
        final /* synthetic */ Class f12052b;

        C4458a(Constructor constructor, Class cls) {
            this.f12051a = constructor;
            this.f12052b = cls;
        }

        @Override // com.squareup.moshi.AbstractC4457b
        /* renamed from: b */
        public T mo27489b() throws IllegalAccessException, InvocationTargetException, InstantiationException {
            return (T) this.f12051a.newInstance(null);
        }

        public String toString() {
            return this.f12052b.getName();
        }
    }

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$b */
    /* loaded from: classes2.dex */
    class C4459b extends AbstractC4457b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f12053a;

        /* renamed from: b */
        final /* synthetic */ Object f12054b;

        /* renamed from: c */
        final /* synthetic */ Class f12055c;

        C4459b(Method method, Object obj, Class cls) {
            this.f12053a = method;
            this.f12054b = obj;
            this.f12055c = cls;
        }

        @Override // com.squareup.moshi.AbstractC4457b
        /* renamed from: b */
        public T mo27489b() throws InvocationTargetException, IllegalAccessException {
            return (T) this.f12053a.invoke(this.f12054b, this.f12055c);
        }

        public String toString() {
            return this.f12055c.getName();
        }
    }

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$c */
    /* loaded from: classes2.dex */
    class C4460c extends AbstractC4457b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f12056a;

        /* renamed from: b */
        final /* synthetic */ Class f12057b;

        /* renamed from: c */
        final /* synthetic */ int f12058c;

        C4460c(Method method, Class cls, int i) {
            this.f12056a = method;
            this.f12057b = cls;
            this.f12058c = i;
        }

        @Override // com.squareup.moshi.AbstractC4457b
        /* renamed from: b */
        public T mo27489b() throws InvocationTargetException, IllegalAccessException {
            return (T) this.f12056a.invoke(null, this.f12057b, Integer.valueOf(this.f12058c));
        }

        public String toString() {
            return this.f12057b.getName();
        }
    }

    /* compiled from: ClassFactory.java */
    /* renamed from: com.squareup.moshi.b$d */
    /* loaded from: classes2.dex */
    class C4461d extends AbstractC4457b<T> {

        /* renamed from: a */
        final /* synthetic */ Method f12059a;

        /* renamed from: b */
        final /* synthetic */ Class f12060b;

        C4461d(Method method, Class cls) {
            this.f12059a = method;
            this.f12060b = cls;
        }

        @Override // com.squareup.moshi.AbstractC4457b
        /* renamed from: b */
        public T mo27489b() throws InvocationTargetException, IllegalAccessException {
            return (T) this.f12059a.invoke(null, this.f12060b, Object.class);
        }

        public String toString() {
            return this.f12060b.getName();
        }
    }

    AbstractC4457b() {
    }

    /* renamed from: a */
    public static <T> AbstractC4457b<T> m27490a(Class<?> cls) {
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C4458a(declaredConstructor, cls);
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new C4459b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                try {
                    try {
                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                        declaredMethod.setAccessible(true);
                        int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        return new C4460c(declaredMethod2, cls, intValue);
                    } catch (IllegalAccessException unused3) {
                        throw new AssertionError();
                    } catch (NoSuchMethodException unused4) {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        return new C4461d(declaredMethod3, cls);
                    } catch (InvocationTargetException e) {
                        throw C9712b.m10124s(e);
                    }
                } catch (Exception unused5) {
                    throw new IllegalArgumentException("cannot construct instances of " + cls.getName());
                }
            } catch (IllegalAccessException unused6) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract T mo27489b() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
