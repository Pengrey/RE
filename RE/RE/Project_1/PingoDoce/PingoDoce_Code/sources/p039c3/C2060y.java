package p039c3;

import android.animation.LayoutTransition;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c3.y */
/* loaded from: classes.dex */
class C2060y {

    /* renamed from: a */
    private static LayoutTransition f5968a;

    /* renamed from: b */
    private static Field f5969b;

    /* renamed from: c */
    private static boolean f5970c;

    /* renamed from: d */
    private static Method f5971d;

    /* renamed from: e */
    private static boolean f5972e;

    /* compiled from: ViewGroupUtilsApi14.java */
    /* renamed from: c3.y$a */
    /* loaded from: classes.dex */
    static class C2061a extends LayoutTransition {
        C2061a() {
        }

        @Override // android.animation.LayoutTransition
        public boolean isChangingLayout() {
            return true;
        }
    }

    /* renamed from: a */
    private static void m34806a(LayoutTransition layoutTransition) {
        if (!f5972e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                f5971d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            }
            f5972e = true;
        }
        Method method = f5971d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
            } catch (InvocationTargetException unused3) {
                Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m34805b(android.view.ViewGroup r5, boolean r6) {
        /*
            android.animation.LayoutTransition r0 = p039c3.C2060y.f5968a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L28
            c3.y$a r0 = new c3.y$a
            r0.<init>()
            p039c3.C2060y.f5968a = r0
            r4 = 2
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p039c3.C2060y.f5968a
            r0.setAnimator(r2, r3)
            android.animation.LayoutTransition r0 = p039c3.C2060y.f5968a
            r0.setAnimator(r1, r3)
            android.animation.LayoutTransition r0 = p039c3.C2060y.f5968a
            r4 = 3
            r0.setAnimator(r4, r3)
            android.animation.LayoutTransition r0 = p039c3.C2060y.f5968a
            r4 = 4
            r0.setAnimator(r4, r3)
        L28:
            if (r6 == 0) goto L48
            android.animation.LayoutTransition r6 = r5.getLayoutTransition()
            if (r6 == 0) goto L42
            boolean r0 = r6.isRunning()
            if (r0 == 0) goto L39
            m34806a(r6)
        L39:
            android.animation.LayoutTransition r0 = p039c3.C2060y.f5968a
            if (r6 == r0) goto L42
            int r0 = p039c3.C2028j.transition_layout_save
            r5.setTag(r0, r6)
        L42:
            android.animation.LayoutTransition r6 = p039c3.C2060y.f5968a
            r5.setLayoutTransition(r6)
            goto L94
        L48:
            r5.setLayoutTransition(r3)
            boolean r6 = p039c3.C2060y.f5970c
            java.lang.String r0 = "ViewGroupUtilsApi14"
            if (r6 != 0) goto L66
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r4 = "mLayoutSuppressed"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L5f
            p039c3.C2060y.f5969b = r6     // Catch: java.lang.NoSuchFieldException -> L5f
            r6.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L5f
            goto L64
        L5f:
            java.lang.String r6 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L64:
            p039c3.C2060y.f5970c = r1
        L66:
            java.lang.reflect.Field r6 = p039c3.C2060y.f5969b
            if (r6 == 0) goto L7f
            boolean r6 = r6.getBoolean(r5)     // Catch: java.lang.IllegalAccessException -> L7a
            if (r6 == 0) goto L78
            java.lang.reflect.Field r1 = p039c3.C2060y.f5969b     // Catch: java.lang.IllegalAccessException -> L76
            r1.setBoolean(r5, r2)     // Catch: java.lang.IllegalAccessException -> L76
            goto L78
        L76:
            r2 = r6
            goto L7a
        L78:
            r2 = r6
            goto L7f
        L7a:
            java.lang.String r6 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r0, r6)
        L7f:
            if (r2 == 0) goto L84
            r5.requestLayout()
        L84:
            int r6 = p039c3.C2028j.transition_layout_save
            java.lang.Object r0 = r5.getTag(r6)
            android.animation.LayoutTransition r0 = (android.animation.LayoutTransition) r0
            if (r0 == 0) goto L94
            r5.setTag(r6, r3)
            r5.setLayoutTransition(r0)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p039c3.C2060y.m34805b(android.view.ViewGroup, boolean):void");
    }
}
