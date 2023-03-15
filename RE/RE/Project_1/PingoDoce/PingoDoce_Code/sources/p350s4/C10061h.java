package p350s4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p076e5.CrashShieldHandler;

/* renamed from: s4.h */
/* loaded from: classes.dex */
public class C10061h {
    /* renamed from: a */
    public static Class<?> m9280a(String str) {
        if (CrashShieldHandler.m25963d(C10061h.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10061h.class);
            return null;
        }
    }

    /* renamed from: b */
    public static Method m9279b(Class<?> cls, String str, Class<?>... clsArr) {
        if (CrashShieldHandler.m25963d(C10061h.class)) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C10061h.class);
            return null;
        }
    }

    /* renamed from: c */
    public static Object m9278c(Class<?> cls, Method method, Object obj, Object... objArr) {
        if (CrashShieldHandler.m25963d(C10061h.class)) {
            return null;
        }
        if (obj != null) {
            try {
                obj = cls.cast(obj);
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, C10061h.class);
                return null;
            }
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
