package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
class C0357h {

    /* renamed from: a */
    private static Field f913a;

    /* renamed from: b */
    private static boolean f914b;

    /* renamed from: c */
    private static Class<?> f915c;

    /* renamed from: d */
    private static boolean f916d;

    /* renamed from: e */
    private static Field f917e;

    /* renamed from: f */
    private static boolean f918f;

    /* renamed from: g */
    private static Field f919g;

    /* renamed from: h */
    private static boolean f920h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m41120a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m41117d(resources);
        } else if (i >= 23) {
            m41118c(resources);
        } else if (i >= 21) {
            m41119b(resources);
        }
    }

    /* renamed from: b */
    private static void m41119b(Resources resources) {
        if (!f914b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f913a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f914b = true;
        }
        Field field = f913a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m41118c(Resources resources) {
        if (!f914b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f913a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f914b = true;
        }
        Object obj = null;
        Field field = f913a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj == null) {
            return;
        }
        m41116e(obj);
    }

    /* renamed from: d */
    private static void m41117d(Resources resources) {
        Object obj;
        if (!f920h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f919g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f920h = true;
        }
        Field field = f919g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f914b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f913a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f914b = true;
        }
        Field field2 = f913a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m41116e(obj2);
        }
    }

    /* renamed from: e */
    private static void m41116e(Object obj) {
        if (!f916d) {
            try {
                f915c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f916d = true;
        }
        Class<?> cls = f915c;
        if (cls == null) {
            return;
        }
        if (!f918f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f917e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f918f = true;
        }
        Field field = f917e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
