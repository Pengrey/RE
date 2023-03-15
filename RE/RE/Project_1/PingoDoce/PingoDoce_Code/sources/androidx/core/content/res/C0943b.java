package androidx.core.content.res;

import android.graphics.Color;
import androidx.core.graphics.C0969a;

/* renamed from: androidx.core.content.res.b */
/* loaded from: classes.dex */
final class C0943b {

    /* renamed from: a */
    static final float[][] f3202a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b */
    static final float[][] f3203b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c */
    static final float[] f3204c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d */
    static final float[][] f3205d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m39055a(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f3204c;
        return C0969a.m38947b(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m39054b(int i) {
        return m39053c(m39049g(i));
    }

    /* renamed from: c */
    static float m39053c(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static float m39052d(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: e */
    static float m39051e(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static float[] m39050f(int i) {
        float m39051e = m39051e(Color.red(i));
        float m39051e2 = m39051e(Color.green(i));
        float m39051e3 = m39051e(Color.blue(i));
        float[][] fArr = f3205d;
        return new float[]{(fArr[0][0] * m39051e) + (fArr[0][1] * m39051e2) + (fArr[0][2] * m39051e3), (fArr[1][0] * m39051e) + (fArr[1][1] * m39051e2) + (fArr[1][2] * m39051e3), (m39051e * fArr[2][0]) + (m39051e2 * fArr[2][1]) + (m39051e3 * fArr[2][2])};
    }

    /* renamed from: g */
    static float m39049g(int i) {
        float m39051e = m39051e(Color.red(i));
        float m39051e2 = m39051e(Color.green(i));
        float m39051e3 = m39051e(Color.blue(i));
        float[][] fArr = f3205d;
        return (m39051e * fArr[1][0]) + (m39051e2 * fArr[1][1]) + (m39051e3 * fArr[1][2]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static float m39048h(float f) {
        return (f > 8.0f ? (float) Math.pow((f + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
