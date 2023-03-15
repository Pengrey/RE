package androidx.core.view.animation;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: androidx.core.view.animation.b */
/* loaded from: classes.dex */
public final class C1107b {

    /* compiled from: PathInterpolatorCompat.java */
    /* renamed from: androidx.core.view.animation.b$a */
    /* loaded from: classes.dex */
    static class C1108a {
        /* renamed from: a */
        static PathInterpolator m38489a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        static PathInterpolator m38488b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        static PathInterpolator m38487c(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: a */
    public static Interpolator m38491a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1108a.m38488b(f, f2, f3, f4);
        }
        return new animationInterpolatorC1106a(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static Interpolator m38490b(Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1108a.m38487c(path);
        }
        return new animationInterpolatorC1106a(path);
    }
}
