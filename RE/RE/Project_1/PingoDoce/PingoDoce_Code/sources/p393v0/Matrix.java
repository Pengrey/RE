package p393v0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10773d;
import p373u0.C10774f;
import p373u0.C10776g;

/* renamed from: v0.k0 */
/* loaded from: classes.dex */
public final class Matrix {

    /* compiled from: Matrix.kt */
    /* renamed from: v0.k0$a */
    /* loaded from: classes.dex */
    public static final class C11035a {
        private C11035a() {
        }

        public /* synthetic */ C11035a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11035a(null);
    }

    /* renamed from: a */
    public static float[] m6436a(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "values");
        return fArr;
    }

    /* renamed from: b */
    public static /* synthetic */ float[] m6435b(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m6436a(fArr);
    }

    /* renamed from: c */
    public static final long m6434c(float[] fArr, long j) {
        Intrinsics.isThisObjectNull(fArr, "arg0");
        float m7145k = C10774f.m7145k(j);
        float m7144l = C10774f.m7144l(j);
        float f = (fArr[3] * m7145k) + (fArr[7] * m7144l) + fArr[15];
        float f2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? 0.0f : 1.0f / f;
        return C10776g.m7133a(((fArr[0] * m7145k) + (fArr[4] * m7144l) + fArr[12]) * f2, f2 * ((fArr[1] * m7145k) + (fArr[5] * m7144l) + fArr[13]));
    }

    /* renamed from: d */
    public static final void m6433d(float[] fArr, C10773d c10773d) {
        Intrinsics.isThisObjectNull(fArr, "arg0");
        Intrinsics.isThisObjectNull(c10773d, "rect");
        long m6434c = m6434c(fArr, C10776g.m7133a(c10773d.m7166b(), c10773d.m7164d()));
        long m6434c2 = m6434c(fArr, C10776g.m7133a(c10773d.m7166b(), c10773d.m7167a()));
        long m6434c3 = m6434c(fArr, C10776g.m7133a(c10773d.m7165c(), c10773d.m7164d()));
        long m6434c4 = m6434c(fArr, C10776g.m7133a(c10773d.m7165c(), c10773d.m7167a()));
        c10773d.m7159i(Math.min(Math.min(C10774f.m7145k(m6434c), C10774f.m7145k(m6434c2)), Math.min(C10774f.m7145k(m6434c3), C10774f.m7145k(m6434c4))));
        c10773d.m7157k(Math.min(Math.min(C10774f.m7144l(m6434c), C10774f.m7144l(m6434c2)), Math.min(C10774f.m7144l(m6434c3), C10774f.m7144l(m6434c4))));
        c10773d.m7158j(Math.max(Math.max(C10774f.m7145k(m6434c), C10774f.m7145k(m6434c2)), Math.max(C10774f.m7145k(m6434c3), C10774f.m7145k(m6434c4))));
        c10773d.m7160h(Math.max(Math.max(C10774f.m7144l(m6434c), C10774f.m7144l(m6434c2)), Math.max(C10774f.m7144l(m6434c3), C10774f.m7144l(m6434c4))));
    }

    /* renamed from: e */
    public static final void m6432e(float[] fArr) {
        Intrinsics.isThisObjectNull(fArr, "arg0");
        int i = 0;
        while (i < 4) {
            int i2 = i + 1;
            int i3 = 0;
            while (i3 < 4) {
                int i4 = i3 + 1;
                fArr[(i3 * 4) + i] = i == i3 ? 1.0f : 0.0f;
                i3 = i4;
            }
            i = i2;
        }
    }

    /* renamed from: f */
    public static final void m6431f(float[] fArr, float f) {
        Intrinsics.isThisObjectNull(fArr, "arg0");
        double d = (f * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -sin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (cos * f2) + (sin * f3);
        fArr[1] = (cos * f5) + (sin * f6);
        fArr[2] = (cos * f7) + (sin * f8);
        fArr[3] = (cos * f9) + (sin * f10);
        fArr[4] = (f2 * f4) + (f3 * cos);
        fArr[5] = (f5 * f4) + (f6 * cos);
        fArr[6] = (f7 * f4) + (f8 * cos);
        fArr[7] = (f4 * f9) + (cos * f10);
    }

    /* renamed from: g */
    public static final void m6430g(float[] fArr, float f, float f2, float f3) {
        Intrinsics.isThisObjectNull(fArr, "arg0");
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: h */
    public static final void m6429h(float[] fArr, float f, float f2, float f3) {
        Intrinsics.isThisObjectNull(fArr, "arg0");
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
    }

    /* renamed from: i */
    public static /* synthetic */ void m6428i(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m6429h(fArr, f, f2, f3);
    }
}
