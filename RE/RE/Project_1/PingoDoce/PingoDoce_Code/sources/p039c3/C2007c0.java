package p039c3;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C1112b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c3.c0 */
/* loaded from: classes.dex */
public class C2007c0 {

    /* renamed from: a */
    private static final C2027i0 f5847a;

    /* renamed from: b */
    static final Property<View, Float> f5848b;

    /* compiled from: ViewUtils.java */
    /* renamed from: c3.c0$a */
    /* loaded from: classes.dex */
    static class C2008a extends Property<View, Float> {
        C2008a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C2007c0.m34947c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f) {
            C2007c0.m34943g(view, f.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: c3.c0$b */
    /* loaded from: classes.dex */
    static class C2009b extends Property<View, Rect> {
        C2009b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return C1112b0.m38398w(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            C1112b0.m38393y0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f5847a = new C2025h0();
        } else if (i >= 23) {
            f5847a = new C2023g0();
        } else if (i >= 22) {
            f5847a = new C2021f0();
        } else if (i >= 21) {
            f5847a = new C2019e0();
        } else if (i >= 19) {
            f5847a = new C2013d0();
        } else {
            f5847a = new C2027i0();
        }
        f5848b = new C2008a(Float.class, "translationAlpha");
        new C2009b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m34949a(View view) {
        f5847a.mo34912a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC1994b0 m34948b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C1992a0(view);
        }
        return C2062z.m34802e(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m34947c(View view) {
        return f5847a.mo34910c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC2044m0 m34946d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C2036l0(view);
        }
        return new C2034k0(view.getWindowToken());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m34945e(View view) {
        f5847a.mo34909d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m34944f(View view, int i, int i2, int i3, int i4) {
        f5847a.mo34908e(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m34943g(View view, float f) {
        f5847a.mo34907f(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m34942h(View view, int i) {
        f5847a.mo34906g(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m34941i(View view, Matrix matrix) {
        f5847a.mo34905h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m34940j(View view, Matrix matrix) {
        f5847a.mo34904i(view, matrix);
    }
}
