package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.d0 */
/* loaded from: classes.dex */
public final class C1148d0 {

    /* renamed from: a */
    private static Method f3490a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewConfigurationCompat.java */
    /* renamed from: androidx.core.view.d0$a */
    /* loaded from: classes.dex */
    public static class C1149a {
        /* renamed from: a */
        static float m38214a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* renamed from: b */
        static float m38213b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    /* renamed from: androidx.core.view.d0$b */
    /* loaded from: classes.dex */
    static class C1150b {
        /* renamed from: a */
        static int m38212a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* renamed from: b */
        static boolean m38211b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f3490a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    private static float m38219a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f3490a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m38218b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1149a.m38214a(viewConfiguration);
        }
        return m38219a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m38217c(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1150b.m38212a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: d */
    public static float m38216d(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C1149a.m38213b(viewConfiguration);
        }
        return m38219a(viewConfiguration, context);
    }

    /* renamed from: e */
    public static boolean m38215e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1150b.m38211b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
