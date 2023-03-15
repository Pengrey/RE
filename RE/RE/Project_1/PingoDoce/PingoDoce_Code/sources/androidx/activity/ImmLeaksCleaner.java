package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC1485s {

    /* renamed from: A */
    private static Field f633A;

    /* renamed from: x */
    private static int f634x;

    /* renamed from: y */
    private static Field f635y;

    /* renamed from: z */
    private static Field f636z;

    /* renamed from: w */
    private Activity f637w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f637w = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: b */
    private static void m41361b() {
        try {
            f634x = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f636z = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f633A = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f635y = declaredField3;
            declaredField3.setAccessible(true);
            f634x = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        if (enumC1471b != AbstractC1469p.EnumC1471b.ON_DESTROY) {
            return;
        }
        if (f634x == 0) {
            m41361b();
        }
        if (f634x == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f637w.getSystemService("input_method");
            try {
                Object obj = f635y.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f636z.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f633A.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
