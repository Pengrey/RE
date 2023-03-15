package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0981a;
import androidx.core.graphics.drawable.InterfaceC0986c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p125h.C5729c;

/* renamed from: androidx.appcompat.widget.b0 */
/* loaded from: classes.dex */
public class C0456b0 {

    /* renamed from: a */
    private static final int[] f1520a = {16842912};

    /* renamed from: b */
    private static final int[] f1521b = new int[0];

    /* renamed from: c */
    public static final Rect f1522c = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableUtils.java */
    /* renamed from: androidx.appcompat.widget.b0$a */
    /* loaded from: classes.dex */
    public static class C0457a {

        /* renamed from: a */
        private static final boolean f1523a;

        /* renamed from: b */
        private static final Method f1524b;

        /* renamed from: c */
        private static final Field f1525c;

        /* renamed from: d */
        private static final Field f1526d;

        /* renamed from: e */
        private static final Field f1527e;

        /* renamed from: f */
        private static final Field f1528f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r2
                goto L47
            L2f:
                r6 = r2
                goto L46
            L31:
                r6 = r2
                goto L46
            L33:
                r6 = r2
                goto L46
            L35:
                r5 = r2
                goto L3d
            L37:
                r5 = r2
                goto L41
            L39:
                r5 = r2
                goto L45
            L3b:
                r4 = r2
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r2
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r2
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r8 = r1
                r3 = r2
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.C0456b0.C0457a.f1524b = r4
                androidx.appcompat.widget.C0456b0.C0457a.f1525c = r5
                androidx.appcompat.widget.C0456b0.C0457a.f1526d = r6
                androidx.appcompat.widget.C0456b0.C0457a.f1527e = r7
                androidx.appcompat.widget.C0456b0.C0457a.f1528f = r3
                androidx.appcompat.widget.C0456b0.C0457a.f1523a = r0
                goto L64
            L58:
                androidx.appcompat.widget.C0456b0.C0457a.f1524b = r2
                androidx.appcompat.widget.C0456b0.C0457a.f1525c = r2
                androidx.appcompat.widget.C0456b0.C0457a.f1526d = r2
                androidx.appcompat.widget.C0456b0.C0457a.f1527e = r2
                androidx.appcompat.widget.C0456b0.C0457a.f1528f = r2
                androidx.appcompat.widget.C0456b0.C0457a.f1523a = r1
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0456b0.C0457a.<clinit>():void");
        }

        /* renamed from: a */
        static Rect m40677a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1523a) {
                try {
                    Object invoke = f1524b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1525c.getInt(invoke), f1526d.getInt(invoke), f1527e.getInt(invoke), f1528f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C0456b0.f1522c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawableUtils.java */
    /* renamed from: androidx.appcompat.widget.b0$b */
    /* loaded from: classes.dex */
    public static class C0458b {
        /* renamed from: a */
        static Insets m40676a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    /* renamed from: a */
    public static boolean m40682a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 15 || !(drawable instanceof InsetDrawable)) {
            if (i >= 15 || !(drawable instanceof GradientDrawable)) {
                if (i >= 17 || !(drawable instanceof LayerDrawable)) {
                    if (drawable instanceof DrawableContainer) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState instanceof DrawableContainer.DrawableContainerState) {
                            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                                if (!m40682a(drawable2)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return true;
                    } else if (drawable instanceof InterfaceC0986c) {
                        return m40682a(((InterfaceC0986c) drawable).mo38841b());
                    } else {
                        if (drawable instanceof C5729c) {
                            return m40682a(((C5729c) drawable).m23221a());
                        }
                        if (drawable instanceof ScaleDrawable) {
                            return m40682a(((ScaleDrawable) drawable).getDrawable());
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m40681b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            m40680c(drawable);
        } else if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
        } else {
            m40680c(drawable);
        }
    }

    /* renamed from: c */
    private static void m40680c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f1521b);
        } else {
            drawable.setState(f1520a);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m40679d(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets m40676a = C0458b.m40676a(drawable);
            return new Rect(m40676a.left, m40676a.top, m40676a.right, m40676a.bottom);
        } else if (i >= 18) {
            return C0457a.m40677a(C0981a.m38860q(drawable));
        } else {
            return f1522c;
        }
    }

    /* renamed from: e */
    public static PorterDuff.Mode m40678e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
