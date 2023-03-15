package p345s;

import p181jd.C6432f;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C9937b {
    /* renamed from: a */
    public static final Animatable<Float, C9962l> m9628a(float f, float f2) {
        return new Animatable<>(Float.valueOf(f), C9983s0.m9455b(C6432f.f17524a), Float.valueOf(f2));
    }

    /* renamed from: b */
    public static /* synthetic */ Animatable m9627b(float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.01f;
        }
        return m9628a(f, f2);
    }
}
