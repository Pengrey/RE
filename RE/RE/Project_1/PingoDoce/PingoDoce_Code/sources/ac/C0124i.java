package ac;

import java.lang.reflect.Array;
import p254nb.C7693a;
import p488zb.C13744a;

/* renamed from: ac.i */
/* loaded from: classes2.dex */
final class C0124i {

    /* renamed from: a */
    private static final float[][] f295a = (float[][]) Array.newInstance(float.class, C13744a.f34862b.length, 8);

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C13744a.f34862b;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int i4 = i3 & 1;
            int i5 = 0;
            while (i5 < 8) {
                float f = 0.0f;
                while (true) {
                    i = i3 & 1;
                    if (i == i4) {
                        f += 1.0f;
                        i3 >>= 1;
                    }
                }
                f295a[i2][(8 - i5) - 1] = f / 17.0f;
                i5++;
                i4 = i;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private static int m41825a(int[] iArr) {
        long j = 0;
        for (int i = 0; i < iArr.length; i++) {
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j2 = j << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j = j2 | i3;
            }
        }
        return (int) j;
    }

    /* renamed from: b */
    private static int m41824b(int[] iArr) {
        int m17702d = C7693a.m17702d(iArr);
        float[] fArr = new float[8];
        if (m17702d > 1) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = iArr[i] / m17702d;
            }
        }
        float f = Float.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f295a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float f2 = 0.0f;
            float[] fArr3 = fArr2[i3];
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C13744a.f34862b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: c */
    private static int m41823c(int[] iArr) {
        int m41825a = m41825a(iArr);
        if (C13744a.m519a(m41825a) == -1) {
            return -1;
        }
        return m41825a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m41822d(int[] iArr) {
        int m41823c = m41823c(m41821e(iArr));
        return m41823c != -1 ? m41823c : m41824b(iArr);
    }

    /* renamed from: e */
    private static int[] m41821e(int[] iArr) {
        float m17702d = C7693a.m17702d(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (iArr[i2] + i <= (m17702d / 34.0f) + ((i3 * m17702d) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
