package p120g8;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p348s2.C10037a;
import p348s2.C10038b;
import p348s2.C10039c;

/* renamed from: g8.a */
/* loaded from: classes.dex */
public class C5616a {

    /* renamed from: a */
    public static final TimeInterpolator f15853a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f15854b = new C10038b();

    /* renamed from: c */
    public static final TimeInterpolator f15855c = new C10037a();

    /* renamed from: d */
    public static final TimeInterpolator f15856d = new C10039c();

    /* renamed from: e */
    public static final TimeInterpolator f15857e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m23565a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m23564b(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m23565a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m23563c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
