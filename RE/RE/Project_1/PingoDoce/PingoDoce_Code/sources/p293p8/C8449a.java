package p293p8;

/* renamed from: p8.a */
/* loaded from: classes.dex */
public final class C8449a {
    /* renamed from: a */
    public static float m15390a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f3 - f, f4 - f2);
    }

    /* renamed from: b */
    public static float m15389b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m15387d(m15390a(f, f2, f3, f4), m15390a(f, f2, f5, f4), m15390a(f, f2, f5, f6), m15390a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static float m15388c(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: d */
    private static float m15387d(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
