package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.d */
/* loaded from: classes.dex */
final class C1432d {

    /* renamed from: c */
    static C1432d f4284c = new C1432d();

    /* renamed from: a */
    private final Map<Class<?>, C1433a> f4285a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f4286b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.d$a */
    /* loaded from: classes.dex */
    public static class C1433a {

        /* renamed from: a */
        final Map<AbstractC1469p.EnumC1471b, List<C1434b>> f4287a = new HashMap();

        /* renamed from: b */
        final Map<C1434b, AbstractC1469p.EnumC1471b> f4288b;

        C1433a(Map<C1434b, AbstractC1469p.EnumC1471b> map) {
            this.f4288b = map;
            for (Map.Entry<C1434b, AbstractC1469p.EnumC1471b> entry : map.entrySet()) {
                AbstractC1469p.EnumC1471b value = entry.getValue();
                List<C1434b> list = this.f4287a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4287a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m37046b(List<C1434b> list, InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m37045a(interfaceC1491v, enumC1471b, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m37047a(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b, Object obj) {
            m37046b(this.f4287a.get(enumC1471b), interfaceC1491v, enumC1471b, obj);
            m37046b(this.f4287a.get(AbstractC1469p.EnumC1471b.ON_ANY), interfaceC1491v, enumC1471b, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassesInfoCache.java */
    @Deprecated
    /* renamed from: androidx.lifecycle.d$b */
    /* loaded from: classes.dex */
    public static final class C1434b {

        /* renamed from: a */
        final int f4289a;

        /* renamed from: b */
        final Method f4290b;

        C1434b(int i, Method method) {
            this.f4289a = i;
            this.f4290b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m37045a(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b, Object obj) {
            try {
                int i = this.f4289a;
                if (i == 0) {
                    this.f4290b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f4290b.invoke(obj, interfaceC1491v);
                } else if (i != 2) {
                } else {
                    this.f4290b.invoke(obj, interfaceC1491v, enumC1471b);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1434b) {
                C1434b c1434b = (C1434b) obj;
                return this.f4289a == c1434b.f4289a && this.f4290b.getName().equals(c1434b.f4290b.getName());
            }
            return false;
        }

        public int hashCode() {
            return (this.f4289a * 31) + this.f4290b.getName().hashCode();
        }
    }

    C1432d() {
    }

    /* renamed from: a */
    private C1433a m37052a(Class<?> cls, Method[] methodArr) {
        int i;
        C1433a m37050c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m37050c = m37050c(superclass)) != null) {
            hashMap.putAll(m37050c.f4288b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1434b, AbstractC1469p.EnumC1471b> entry : m37050c(cls2).f4288b.entrySet()) {
                m37048e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m37051b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC1442g0 interfaceC1442g0 = (InterfaceC1442g0) method.getAnnotation(InterfaceC1442g0.class);
            if (interfaceC1442g0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(InterfaceC1491v.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                AbstractC1469p.EnumC1471b value = interfaceC1442g0.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(AbstractC1469p.EnumC1471b.class)) {
                        if (value != AbstractC1469p.EnumC1471b.ON_ANY) {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m37048e(hashMap, new C1434b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1433a c1433a = new C1433a(hashMap);
        this.f4285a.put(cls, c1433a);
        this.f4286b.put(cls, Boolean.valueOf(z));
        return c1433a;
    }

    /* renamed from: b */
    private Method[] m37051b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m37048e(Map<C1434b, AbstractC1469p.EnumC1471b> map, C1434b c1434b, AbstractC1469p.EnumC1471b enumC1471b, Class<?> cls) {
        AbstractC1469p.EnumC1471b enumC1471b2 = map.get(c1434b);
        if (enumC1471b2 == null || enumC1471b == enumC1471b2) {
            if (enumC1471b2 == null) {
                map.put(c1434b, enumC1471b);
                return;
            }
            return;
        }
        Method method = c1434b.f4290b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1471b2 + ", new value " + enumC1471b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C1433a m37050c(Class<?> cls) {
        C1433a c1433a = this.f4285a.get(cls);
        return c1433a != null ? c1433a : m37052a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m37049d(Class<?> cls) {
        Boolean bool = this.f4286b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m37051b = m37051b(cls);
        for (Method method : m37051b) {
            if (((InterfaceC1442g0) method.getAnnotation(InterfaceC1442g0.class)) != null) {
                m37052a(cls, m37051b);
                return true;
            }
        }
        this.f4286b.put(cls, Boolean.FALSE);
        return false;
    }
}
