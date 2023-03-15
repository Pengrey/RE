package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: androidx.core.view.h */
/* loaded from: classes.dex */
public final class C1165h {

    /* renamed from: a */
    private static Field f3523a;

    /* renamed from: b */
    private static boolean f3524b;

    /* renamed from: a */
    private static void m38173a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f3524b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f3523a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f3524b = true;
        }
        Field field = f3523a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m38172b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m38173a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m38173a(layoutInflater, factory2);
            }
        }
    }
}
