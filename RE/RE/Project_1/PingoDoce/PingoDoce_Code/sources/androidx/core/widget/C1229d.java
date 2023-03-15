package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.d */
/* loaded from: classes.dex */
public final class C1229d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EdgeEffectCompat.java */
    /* renamed from: androidx.core.widget.d$a */
    /* loaded from: classes.dex */
    public static class C1230a {
        /* renamed from: a */
        static void m37915a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EdgeEffectCompat.java */
    /* renamed from: androidx.core.widget.d$b */
    /* loaded from: classes.dex */
    public static class C1231b {
        /* renamed from: a */
        public static EdgeEffect m37914a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m37913b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m37912c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m37919a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1231b.m37914a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m37918b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1231b.m37913b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m37917c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1230a.m37915a(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: d */
    public static float m37916d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1231b.m37912c(edgeEffect, f, f2);
        }
        m37917c(edgeEffect, f, f2);
        return f;
    }
}
