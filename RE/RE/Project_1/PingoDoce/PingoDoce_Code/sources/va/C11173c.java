package va;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: va.c */
/* loaded from: classes2.dex */
final class C11173c extends AbstractC11172b {

    /* renamed from: d */
    private static Class f28709d;

    /* renamed from: b */
    private final Object f28710b = m5826d();

    /* renamed from: c */
    private final Field f28711c = m5827c();

    /* renamed from: c */
    private static Field m5827c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m5826d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f28709d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // va.AbstractC11172b
    /* renamed from: b */
    public void mo5828b(AccessibleObject accessibleObject) {
        if (m5825e(accessibleObject)) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
        }
    }

    /* renamed from: e */
    boolean m5825e(AccessibleObject accessibleObject) {
        if (this.f28710b != null && this.f28711c != null) {
            try {
                f28709d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f28710b, accessibleObject, Long.valueOf(((Long) f28709d.getMethod("objectFieldOffset", Field.class).invoke(this.f28710b, this.f28711c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
