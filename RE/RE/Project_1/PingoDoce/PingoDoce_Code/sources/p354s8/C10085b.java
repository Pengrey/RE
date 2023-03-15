package p354s8;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: s8.b */
/* loaded from: classes.dex */
public class C10085b {
    /* renamed from: a */
    public static TypedValue m9234a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m9233b(Context context, int i, boolean z) {
        TypedValue m9234a = m9234a(context, i);
        return (m9234a == null || m9234a.type != 18) ? z : m9234a.data != 0;
    }

    /* renamed from: c */
    public static int m9232c(Context context, int i, int i2) {
        TypedValue m9234a = m9234a(context, i);
        return (m9234a == null || m9234a.type != 16) ? i2 : m9234a.data;
    }

    /* renamed from: d */
    public static int m9231d(Context context, int i, String str) {
        TypedValue m9234a = m9234a(context, i);
        if (m9234a != null) {
            return m9234a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: e */
    public static int m9230e(View view, int i) {
        return m9231d(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
