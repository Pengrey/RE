package p130h4;

/* renamed from: h4.b */
/* loaded from: classes.dex */
public class C5846b {
    /* renamed from: a */
    private static float m22939a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m22938b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: c */
    public static int m22937c(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float m22939a = m22939a(((i >> 16) & 255) / 255.0f);
        float m22939a2 = m22939a(((i >> 8) & 255) / 255.0f);
        float m22939a3 = m22939a((i & 255) / 255.0f);
        float m22939a4 = m22939a(((i2 >> 16) & 255) / 255.0f);
        float m22939a5 = m22939a(((i2 >> 8) & 255) / 255.0f);
        float m22939a6 = m22939a3 + (f * (m22939a((i2 & 255) / 255.0f) - m22939a3));
        return (Math.round(m22938b(m22939a + ((m22939a4 - m22939a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m22938b(m22939a2 + ((m22939a5 - m22939a2) * f)) * 255.0f) << 8) | Math.round(m22938b(m22939a6) * 255.0f);
    }
}
