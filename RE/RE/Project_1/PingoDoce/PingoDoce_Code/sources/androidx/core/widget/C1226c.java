package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* loaded from: classes.dex */
public final class C1226c {

    /* renamed from: a */
    private static Field f3644a;

    /* renamed from: b */
    private static boolean f3645b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompoundButtonCompat.java */
    /* renamed from: androidx.core.widget.c$a */
    /* loaded from: classes.dex */
    public static class C1227a {
        /* renamed from: a */
        static ColorStateList m37924a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m37923b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m37922c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m37921d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CompoundButtonCompat.java */
    /* renamed from: androidx.core.widget.c$b */
    /* loaded from: classes.dex */
    public static class C1228b {
        /* renamed from: a */
        static Drawable m37920a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m37928a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1228b.m37920a(compoundButton);
        }
        if (!f3645b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3644a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f3645b = true;
        }
        Field field = f3644a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f3644a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m37927b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1227a.m37924a(compoundButton);
        }
        if (compoundButton instanceof InterfaceC1250k) {
            return ((InterfaceC1250k) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m37926c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1227a.m37922c(compoundButton, colorStateList);
        } else if (compoundButton instanceof InterfaceC1250k) {
            ((InterfaceC1250k) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m37925d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1227a.m37921d(compoundButton, mode);
        } else if (compoundButton instanceof InterfaceC1250k) {
            ((InterfaceC1250k) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
