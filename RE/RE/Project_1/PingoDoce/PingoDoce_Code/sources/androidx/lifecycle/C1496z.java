package androidx.lifecycle;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public class C1496z {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f4377a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC1464n>>> f4378b = new HashMap();

    /* renamed from: a */
    private static InterfaceC1464n m36950a(Constructor<? extends InterfaceC1464n> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC1464n> m36949b(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : BuildConfig.VERSION_NAME;
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String m36948c = m36948c(canonicalName);
            if (!name.isEmpty()) {
                m36948c = name + "." + m36948c;
            }
            Constructor declaredConstructor = Class.forName(m36948c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m36948c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m36947d(Class<?> cls) {
        Integer num = f4377a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m36944g = m36944g(cls);
        f4377a.put(cls, Integer.valueOf(m36944g));
        return m36944g;
    }

    /* renamed from: e */
    private static boolean m36946e(Class<?> cls) {
        return cls != null && InterfaceC1489u.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static InterfaceC1485s m36945f(Object obj) {
        boolean z = obj instanceof InterfaceC1485s;
        boolean z2 = obj instanceof InterfaceC1462m;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((InterfaceC1462m) obj, (InterfaceC1485s) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((InterfaceC1462m) obj, null);
        }
        if (z) {
            return (InterfaceC1485s) obj;
        }
        Class<?> cls = obj.getClass();
        if (m36947d(cls) == 2) {
            List<Constructor<? extends InterfaceC1464n>> list = f4378b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m36950a(list.get(0), obj));
            }
            InterfaceC1464n[] interfaceC1464nArr = new InterfaceC1464n[list.size()];
            for (int i = 0; i < list.size(); i++) {
                interfaceC1464nArr[i] = m36950a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC1464nArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private static int m36944g(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1464n> m36949b = m36949b(cls);
        if (m36949b != null) {
            f4378b.put(cls, Collections.singletonList(m36949b));
            return 2;
        } else if (C1432d.f4284c.m37049d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m36946e(superclass)) {
                if (m36947d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f4378b.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m36946e(cls2)) {
                    if (m36947d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4378b.get(cls2));
                }
            }
            if (arrayList != null) {
                f4378b.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
