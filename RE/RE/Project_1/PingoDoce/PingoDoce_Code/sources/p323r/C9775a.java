package p323r;

import androidx.constraintlayout.widget.C0868i;
import p181jd.Intrinsics;

/* renamed from: r.a */
/* loaded from: classes.dex */
public final class C9775a {

    /* renamed from: a */
    public static final C9775a f25704a = new C9775a();

    /* renamed from: b */
    private static final float[] f25705b;

    /* renamed from: c */
    private static final float[] f25706c;

    /* compiled from: SplineBasedDecay.kt */
    /* renamed from: r.a$a */
    /* loaded from: classes.dex */
    public static final class C9776a {

        /* renamed from: a */
        private final float f25707a;

        /* renamed from: b */
        private final float f25708b;

        public C9776a(float f, float f2) {
            this.f25707a = f;
            this.f25708b = f2;
        }

        /* renamed from: a */
        public final float m9990a() {
            return this.f25707a;
        }

        /* renamed from: b */
        public final float m9989b() {
            return this.f25708b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9776a) {
                C9776a c9776a = (C9776a) obj;
                return Intrinsics.equals(Float.valueOf(this.f25707a), Float.valueOf(c9776a.f25707a)) && Intrinsics.equals(Float.valueOf(this.f25708b), Float.valueOf(c9776a.f25708b));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f25707a) * 31) + Float.hashCode(this.f25708b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f25707a + ", velocityCoefficient=" + this.f25708b + ')';
        }
    }

    static {
        float[] fArr = new float[C0868i.f2743B0];
        f25705b = fArr;
        float[] fArr2 = new float[C0868i.f2743B0];
        f25706c = fArr2;
        C9779d.m9977b(fArr, fArr2, 100);
    }

    private C9775a() {
    }

    /* renamed from: a */
    public final double m9992a(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    /* renamed from: b */
    public final C9776a m9991b(float f) {
        float f2;
        float f3;
        float f4 = 100;
        int i = (int) (f4 * f);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = f25705b;
            float f7 = fArr[i];
            f3 = (fArr[i2] - f7) / (f6 - f5);
            f2 = f7 + ((f - f5) * f3);
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return new C9776a(f2, f3);
    }
}
