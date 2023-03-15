package p323r;

/* renamed from: r.d */
/* loaded from: classes.dex */
public final class C9779d {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m9977b(float[] fArr, float[] fArr2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        int i2;
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        while (true) {
            float f12 = 1.0f;
            if (i3 < i) {
                int i4 = i3 + 1;
                float f13 = i3 / i;
                float f14 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f14 - f10) / 2.0f) + f10;
                    f3 = f12 - f2;
                    f4 = f2 * 3.0f * f3;
                    f5 = f2 * f2 * f2;
                    float f15 = (((f3 * 0.175f) + (f2 * 0.35000002f)) * f4) + f5;
                    if (Math.abs(f15 - f13) < 1.0E-5d) {
                        break;
                    }
                    int i5 = i4;
                    if (f15 > f13) {
                        f14 = f2;
                    } else {
                        f10 = f2;
                    }
                    i4 = i5;
                    f12 = 1.0f;
                }
                fArr[i3] = (f4 * ((f3 * 0.5f) + f2)) + f5;
                float f16 = f12;
                while (true) {
                    f6 = ((f16 - f11) / f) + f11;
                    f7 = f12 - f6;
                    f8 = f6 * 3.0f * f7;
                    f9 = f6 * f6 * f6;
                    float f17 = (((f7 * 0.5f) + f6) * f8) + f9;
                    i2 = i4;
                    if (Math.abs(f17 - f13) < 1.0E-5d) {
                        break;
                    }
                    if (f17 > f13) {
                        f16 = f6;
                    } else {
                        f11 = f6;
                    }
                    i4 = i2;
                    f12 = 1.0f;
                    f = 2.0f;
                }
                fArr2[i3] = (f8 * ((f7 * 0.175f) + (f6 * 0.35000002f))) + f9;
                i3 = i2;
            } else {
                fArr2[i] = 1.0f;
                fArr[i] = fArr2[i];
                return;
            }
        }
    }
}
