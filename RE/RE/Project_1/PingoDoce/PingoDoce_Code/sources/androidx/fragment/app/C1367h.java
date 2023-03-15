package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p301q.C9558g;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes.dex */
public class C1367h {

    /* renamed from: a */
    private static final C9558g<ClassLoader, C9558g<String, Class<?>>> f4068a = new C9558g<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m37280b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m37279c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m37279c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C9558g<ClassLoader, C9558g<String, Class<?>>> c9558g = f4068a;
        C9558g<String, Class<?>> c9558g2 = c9558g.get(classLoader);
        if (c9558g2 == null) {
            c9558g2 = new C9558g<>();
            c9558g.put(classLoader, c9558g2);
        }
        Class<?> cls = c9558g2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c9558g2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m37278d(ClassLoader classLoader, String str) {
        try {
            return m37279c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo37281a(ClassLoader classLoader, String str) {
        throw null;
    }
}
