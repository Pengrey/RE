package p039c3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: c3.i0 */
/* loaded from: classes.dex */
class C2027i0 {

    /* renamed from: a */
    private static Method f5872a;

    /* renamed from: b */
    private static boolean f5873b;

    /* renamed from: c */
    private static Field f5874c;

    /* renamed from: d */
    private static boolean f5875d;

    @SuppressLint({"PrivateApi"})
    /* renamed from: b */
    private void m34911b() {
        if (f5873b) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f5872a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
        }
        f5873b = true;
    }

    /* renamed from: a */
    public void mo34912a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C2028j.save_non_transition_alpha, null);
        }
    }

    /* renamed from: c */
    public float mo34910c(View view) {
        Float f = (Float) view.getTag(C2028j.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo34909d(View view) {
        int i = C2028j.save_non_transition_alpha;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: e */
    public void mo34908e(View view, int i, int i2, int i3, int i4) {
        m34911b();
        Method method = f5872a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: f */
    public void mo34907f(View view, float f) {
        Float f2 = (Float) view.getTag(C2028j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: g */
    public void mo34906g(View view, int i) {
        if (!f5875d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5874c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5875d = true;
        }
        Field field = f5874c;
        if (field != null) {
            try {
                f5874c.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public void mo34905h(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo34905h(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: i */
    public void mo34904i(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo34904i(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
