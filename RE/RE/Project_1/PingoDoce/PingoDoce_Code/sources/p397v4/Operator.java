package p397v4;

import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;

/* renamed from: v4.f */
/* loaded from: classes.dex */
public final class Operator {
    static {
        new Operator();
    }

    private Operator() {
    }

    /* renamed from: a */
    public static final void m6062a(MTensor mTensor, MTensor mTensor2) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            Intrinsics.isThisObjectNull(mTensor2, "b");
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            int m6106b3 = mTensor.m6106b(2);
            float[] m6107a = mTensor.m6107a();
            float[] m6107a2 = mTensor2.m6107a();
            for (int i = 0; i < m6106b; i++) {
                for (int i2 = 0; i2 < m6106b2; i2++) {
                    for (int i3 = 0; i3 < m6106b3; i3++) {
                        int i4 = (i * m6106b2 * m6106b3) + (i2 * m6106b3) + i3;
                        m6107a[i4] = m6107a[i4] + m6107a2[i3];
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
        }
    }

    /* renamed from: b */
    public static final MTensor m6061b(MTensor[] mTensorArr) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensorArr, "tensors");
            int m6106b = mTensorArr[0].m6106b(0);
            int i = 0;
            for (MTensor mTensor : mTensorArr) {
                i += mTensor.m6106b(1);
            }
            MTensor mTensor2 = new MTensor(new int[]{m6106b, i});
            float[] m6107a = mTensor2.m6107a();
            for (int i2 = 0; i2 < m6106b; i2++) {
                int i3 = i2 * i;
                int length = mTensorArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    float[] m6107a2 = mTensorArr[i4].m6107a();
                    int m6106b2 = mTensorArr[i4].m6106b(1);
                    System.arraycopy(m6107a2, i2 * m6106b2, m6107a, i3, m6106b2);
                    i3 += m6106b2;
                }
            }
            return mTensor2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final MTensor m6060c(MTensor mTensor, MTensor mTensor2) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            Intrinsics.isThisObjectNull(mTensor2, "w");
            int i = 0;
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            int m6106b3 = mTensor.m6106b(2);
            int m6106b4 = mTensor2.m6106b(0);
            int i2 = (m6106b2 - m6106b4) + 1;
            int m6106b5 = mTensor2.m6106b(2);
            MTensor mTensor3 = new MTensor(new int[]{m6106b, i2, m6106b5});
            float[] m6107a = mTensor.m6107a();
            float[] m6107a2 = mTensor3.m6107a();
            float[] m6107a3 = mTensor2.m6107a();
            int i3 = 0;
            while (i3 < m6106b) {
                int i4 = i;
                while (i4 < m6106b5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < m6106b4) {
                            for (int i6 = 0; i6 < m6106b3; i6++) {
                                f += m6107a[(m6106b2 * m6106b3 * i3) + ((i + i5) * m6106b3) + i6] * m6107a3[(((i * m6106b3) + i6) * m6106b5) + i4];
                            }
                            i++;
                        }
                        m6107a2[(i2 * m6106b5 * i3) + (i5 * m6106b5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return mTensor3;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final MTensor m6059d(MTensor mTensor, MTensor mTensor2, MTensor mTensor3) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            Intrinsics.isThisObjectNull(mTensor2, "w");
            Intrinsics.isThisObjectNull(mTensor3, "b");
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor3.m6106b(0);
            MTensor m6055h = m6055h(mTensor, mTensor2);
            float[] m6107a = mTensor3.m6107a();
            float[] m6107a2 = m6055h.m6107a();
            for (int i = 0; i < m6106b; i++) {
                for (int i2 = 0; i2 < m6106b2; i2++) {
                    int i3 = (i * m6106b2) + i2;
                    m6107a2[i3] = m6107a2[i3] + m6107a[i2];
                }
            }
            return m6055h;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final MTensor m6058e(String[] strArr, int i, MTensor mTensor) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(strArr, "texts");
            Intrinsics.isThisObjectNull(mTensor, "w");
            int length = strArr.length;
            int m6106b = mTensor.m6106b(1);
            MTensor mTensor2 = new MTensor(new int[]{length, i, m6106b});
            float[] m6107a = mTensor2.m6107a();
            float[] m6107a2 = mTensor.m6107a();
            for (int i2 = 0; i2 < length; i2++) {
                int[] m6047d = C11126g.f28556a.m6047d(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(m6107a2, m6047d[i3] * m6106b, m6107a, (m6106b * i * i2) + (m6106b * i3), m6106b);
                }
            }
            return mTensor2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m6057f(MTensor mTensor, int i) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            if (i >= mTensor.m6105c()) {
                return;
            }
            int m6105c = mTensor.m6105c();
            int i2 = 1;
            for (int i3 = i; i3 < m6105c; i3++) {
                i2 *= mTensor.m6106b(i3);
            }
            int[] iArr = new int[i + 1];
            for (int i4 = 0; i4 < i; i4++) {
                iArr[i4] = mTensor.m6106b(i4);
            }
            iArr[i] = i2;
            mTensor.m6104d(iArr);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
        }
    }

    /* renamed from: g */
    public static final MTensor m6056g(MTensor mTensor, int i) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            int i2 = 0;
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            int m6106b3 = mTensor.m6106b(2);
            int i3 = (m6106b2 - i) + 1;
            MTensor mTensor2 = new MTensor(new int[]{m6106b, i3, m6106b3});
            float[] m6107a = mTensor.m6107a();
            float[] m6107a2 = mTensor2.m6107a();
            int i4 = 0;
            while (i4 < m6106b) {
                int i5 = i2;
                while (i5 < m6106b3) {
                    int i6 = i2;
                    while (i6 < i3) {
                        int i7 = i6 * m6106b3;
                        int i8 = (i4 * i3 * m6106b3) + i7 + i5;
                        int i9 = (i4 * m6106b2 * m6106b3) + i7 + i5;
                        m6107a2[i8] = Float.MIN_VALUE;
                        for (int i10 = i2; i10 < i; i10++) {
                            m6107a2[i8] = Math.max(m6107a2[i8], m6107a[i9 + (i10 * m6106b3)]);
                        }
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return mTensor2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final MTensor m6055h(MTensor mTensor, MTensor mTensor2) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            Intrinsics.isThisObjectNull(mTensor2, "w");
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor2.m6106b(0);
            int m6106b3 = mTensor2.m6106b(1);
            MTensor mTensor3 = new MTensor(new int[]{m6106b, m6106b3});
            float[] m6107a = mTensor.m6107a();
            float[] m6107a2 = mTensor2.m6107a();
            float[] m6107a3 = mTensor3.m6107a();
            for (int i = 0; i < m6106b; i++) {
                for (int i2 = 0; i2 < m6106b3; i2++) {
                    int i3 = (i * m6106b3) + i2;
                    m6107a3[i3] = 0.0f;
                    for (int i4 = 0; i4 < m6106b2; i4++) {
                        m6107a3[i3] = m6107a3[i3] + (m6107a[(i * m6106b2) + i4] * m6107a2[(i4 * m6106b3) + i2]);
                    }
                }
            }
            return mTensor3;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m6054i(MTensor mTensor) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            float[] m6107a = mTensor.m6107a();
            int length = m6107a.length;
            for (int i = 0; i < length; i++) {
                if (m6107a[i] < 0) {
                    m6107a[i] = 0.0f;
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
        }
    }

    /* renamed from: j */
    public static final void m6053j(MTensor mTensor) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            float[] m6107a = mTensor.m6107a();
            for (int i = 0; i < m6106b; i++) {
                int i2 = i * m6106b2;
                int i3 = i2 + m6106b2;
                float f = Float.MIN_VALUE;
                float f2 = 0.0f;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (m6107a[i4] > f) {
                        f = m6107a[i4];
                    }
                }
                for (int i5 = i2; i5 < i3; i5++) {
                    m6107a[i5] = (float) Math.exp(m6107a[i5] - f);
                    f2 += m6107a[i5];
                }
                while (i2 < i3) {
                    m6107a[i2] = m6107a[i2] / f2;
                    i2++;
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
        }
    }

    /* renamed from: k */
    public static final MTensor m6052k(MTensor mTensor) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            MTensor mTensor2 = new MTensor(new int[]{m6106b2, m6106b});
            float[] m6107a = mTensor.m6107a();
            float[] m6107a2 = mTensor2.m6107a();
            for (int i = 0; i < m6106b; i++) {
                for (int i2 = 0; i2 < m6106b2; i2++) {
                    m6107a2[(i2 * m6106b) + i] = m6107a[(i * m6106b2) + i2];
                }
            }
            return mTensor2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final MTensor m6051l(MTensor mTensor) {
        if (CrashShieldHandler.m25963d(Operator.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "x");
            int m6106b = mTensor.m6106b(0);
            int m6106b2 = mTensor.m6106b(1);
            int m6106b3 = mTensor.m6106b(2);
            MTensor mTensor2 = new MTensor(new int[]{m6106b3, m6106b2, m6106b});
            float[] m6107a = mTensor.m6107a();
            float[] m6107a2 = mTensor2.m6107a();
            for (int i = 0; i < m6106b; i++) {
                for (int i2 = 0; i2 < m6106b2; i2++) {
                    for (int i3 = 0; i3 < m6106b3; i3++) {
                        m6107a2[(i3 * m6106b * m6106b2) + (i2 * m6106b) + i] = m6107a[(i * m6106b2 * m6106b3) + (i2 * m6106b3) + i3];
                    }
                }
            }
            return mTensor2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Operator.class);
            return null;
        }
    }
}
