package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.g */
/* loaded from: classes.dex */
public class C1162g {

    /* renamed from: a */
    private static boolean f3517a = false;

    /* renamed from: b */
    private static Method f3518b = null;

    /* renamed from: c */
    private static boolean f3519c = false;

    /* renamed from: d */
    private static Field f3520d;

    /* compiled from: KeyEventDispatcher.java */
    /* renamed from: androidx.core.view.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1163a {
        /* renamed from: k */
        boolean mo25551k(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m38179a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3517a) {
            try {
                f3518b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f3517a = true;
        }
        Method method = f3518b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m38178b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m38179a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1112b0.m38424j(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m38177c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m38174f = m38174f(dialog);
        if (m38174f == null || !m38174f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (C1112b0.m38424j(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m38176d(View view, KeyEvent keyEvent) {
        return C1112b0.m38422k(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m38175e(InterfaceC1163a interfaceC1163a, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (interfaceC1163a == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC1163a.mo25551k(keyEvent);
        }
        if (callback instanceof Activity) {
            return m38178b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m38177c((Dialog) callback, keyEvent);
        }
        return (view != null && C1112b0.m38424j(view, keyEvent)) || interfaceC1163a.mo25551k(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m38174f(Dialog dialog) {
        if (!f3519c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3520d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3519c = true;
        }
        Field field = f3520d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
