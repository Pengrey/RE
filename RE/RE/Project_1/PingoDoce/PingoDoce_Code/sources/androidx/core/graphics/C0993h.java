package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.h */
/* loaded from: classes.dex */
public class C0993h extends C0992g {
    @Override // androidx.core.graphics.C0992g
    /* renamed from: l */
    protected Typeface mo38813l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3298g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3304m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C0992g
    /* renamed from: x */
    protected Method mo38812x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
