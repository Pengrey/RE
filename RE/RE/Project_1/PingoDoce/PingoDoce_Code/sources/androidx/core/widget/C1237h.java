package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.h */
/* loaded from: classes.dex */
public final class C1237h {

    /* renamed from: a */
    private static Method f3647a;

    /* renamed from: b */
    private static boolean f3648b;

    /* renamed from: c */
    private static Field f3649c;

    /* renamed from: d */
    private static boolean f3650d;

    /* compiled from: PopupWindowCompat.java */
    /* renamed from: androidx.core.widget.h$a */
    /* loaded from: classes.dex */
    static class C1238a {
        /* renamed from: a */
        static void m37893a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* compiled from: PopupWindowCompat.java */
    /* renamed from: androidx.core.widget.h$b */
    /* loaded from: classes.dex */
    static class C1239b {
        /* renamed from: a */
        static boolean m37892a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m37891b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m37890c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        static void m37889d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m37896a(PopupWindow popupWindow, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C1239b.m37890c(popupWindow, z);
        } else if (i >= 21) {
            if (!f3650d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f3649c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f3650d = true;
            }
            Field field = f3649c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m37895b(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1239b.m37889d(popupWindow, i);
            return;
        }
        if (!f3648b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f3647a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f3648b = true;
        }
        Method method = f3647a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m37894c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 19) {
            C1238a.m37893a(popupWindow, view, i, i2, i3);
            return;
        }
        if ((C1158f.m38197b(i3, C1112b0.m38476E(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }
}
