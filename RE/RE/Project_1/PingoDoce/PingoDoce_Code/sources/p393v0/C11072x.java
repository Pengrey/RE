package p393v0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p181jd.Intrinsics;

/* compiled from: CanvasUtils.android.kt */
/* renamed from: v0.x */
/* loaded from: classes.dex */
public final class C11072x {

    /* renamed from: a */
    public static final C11072x f28450a = new C11072x();

    /* renamed from: b */
    private static Method f28451b;

    /* renamed from: c */
    private static Method f28452c;

    /* renamed from: d */
    private static boolean f28453d;

    private C11072x() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public final void m6237a(Canvas canvas, boolean z) {
        Method method;
        Intrinsics.isThisObjectNull(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C11074y.f28454a.m6236a(canvas, z);
            return;
        }
        if (!f28453d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f28451b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f28452c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f28451b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f28452c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f28451b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f28452c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f28453d = true;
        }
        if (z) {
            try {
                Method method4 = f28451b;
                if (method4 != null) {
                    Intrinsics.ifNullDoSomething(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f28452c) == null) {
            return;
        }
        Intrinsics.ifNullDoSomething(method);
        method.invoke(canvas, new Object[0]);
    }
}
