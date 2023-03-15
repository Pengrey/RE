package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0981a {

    /* renamed from: a */
    private static Method f3273a;

    /* renamed from: b */
    private static boolean f3274b;

    /* renamed from: c */
    private static Method f3275c;

    /* renamed from: d */
    private static boolean f3276d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableCompat.java */
    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: classes.dex */
    public static class C0982a {
        /* renamed from: a */
        static int m38858a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m38857b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m38856c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m38855d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m38854e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableCompat.java */
    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    public static class C0983b {
        /* renamed from: a */
        static void m38853a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m38852b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m38851c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m38850d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m38849e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m38848f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m38847g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m38846h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m38845i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableCompat.java */
    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: classes.dex */
    public static class C0984c {
        /* renamed from: a */
        static int m38844a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m38843b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m38876a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38853a(drawable, theme);
        }
    }

    /* renamed from: b */
    public static boolean m38875b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0983b.m38852b(drawable);
        }
        return false;
    }

    /* renamed from: c */
    public static void m38874c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m38874c(C0982a.m38856c((InsetDrawable) drawable));
            } else if (drawable instanceof InterfaceC0986c) {
                m38874c(((InterfaceC0986c) drawable).mo38841b());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable m38857b = C0982a.m38857b(drawableContainerState, i2);
                    if (m38857b != null) {
                        m38874c(m38857b);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: d */
    public static int m38873d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0982a.m38858a(drawable);
        }
        return 0;
    }

    /* renamed from: e */
    public static ColorFilter m38872e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0983b.m38851c(drawable);
        }
        return null;
    }

    /* renamed from: f */
    public static int m38871f(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0984c.m38844a(drawable);
        }
        if (i >= 17) {
            if (!f3276d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f3275c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f3276d = true;
            }
            Method method = f3275c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f3275c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m38870g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38850d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: h */
    public static boolean m38869h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0982a.m38855d(drawable);
        }
        return false;
    }

    @Deprecated
    /* renamed from: i */
    public static void m38868i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m38867j(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0982a.m38854e(drawable, z);
        }
    }

    /* renamed from: k */
    public static void m38866k(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38849e(drawable, f, f2);
        }
    }

    /* renamed from: l */
    public static void m38865l(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38848f(drawable, i, i2, i3, i4);
        }
    }

    /* renamed from: m */
    public static boolean m38864m(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C0984c.m38843b(drawable, i);
        }
        if (i2 >= 17) {
            if (!f3274b) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    f3273a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f3274b = true;
            }
            Method method = f3273a;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f3273a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m38863n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38847g(drawable, i);
        } else if (drawable instanceof InterfaceC0985b) {
            ((InterfaceC0985b) drawable).setTint(i);
        }
    }

    /* renamed from: o */
    public static void m38862o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38846h(drawable, colorStateList);
        } else if (drawable instanceof InterfaceC0985b) {
            ((InterfaceC0985b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: p */
    public static void m38861p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0983b.m38845i(drawable, mode);
        } else if (drawable instanceof InterfaceC0985b) {
            ((InterfaceC0985b) drawable).setTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static <T extends Drawable> T m38860q(Drawable drawable) {
        return drawable instanceof InterfaceC0986c ? (T) ((InterfaceC0986c) drawable).mo38841b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m38859r(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return i >= 23 ? drawable : i >= 21 ? !(drawable instanceof InterfaceC0985b) ? new C0988e(drawable) : drawable : !(drawable instanceof InterfaceC0985b) ? new C0987d(drawable) : drawable;
    }
}
