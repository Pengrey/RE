package androidx.compose.p018ui.platform;

import android.graphics.Matrix;
import id.InterfaceC6112p;
import p181jd.Intrinsics;
import p393v0.C11020g;

/* renamed from: androidx.compose.ui.platform.a1 */
/* loaded from: classes.dex */
public final class LayerMatrixCache<T> {

    /* renamed from: a */
    private final InterfaceC6112p f2159a;

    /* renamed from: b */
    private Matrix f2160b;

    /* renamed from: c */
    private Matrix f2161c;

    /* renamed from: d */
    private float[] f2162d;

    /* renamed from: e */
    private float[] f2163e;

    /* renamed from: f */
    private boolean f2164f;

    /* renamed from: g */
    private boolean f2165g;

    /* renamed from: h */
    private boolean f2166h;

    public LayerMatrixCache(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "getMatrix");
        this.f2159a = interfaceC6112p;
        this.f2164f = true;
        this.f2165g = true;
        this.f2166h = true;
    }

    /* renamed from: a */
    public final float[] m39832a(Object obj) {
        float[] fArr = this.f2163e;
        if (fArr == null) {
            fArr = p393v0.Matrix.m6435b(null, 1, null);
            this.f2163e = fArr;
        }
        if (this.f2165g) {
            this.f2166h = InvertMatrix.m39455a(m39831b(obj), fArr);
            this.f2165g = false;
        }
        if (this.f2166h) {
            return fArr;
        }
        return null;
    }

    /* renamed from: b */
    public final float[] m39831b(Object obj) {
        float[] fArr = this.f2162d;
        if (fArr == null) {
            fArr = p393v0.Matrix.m6435b(null, 1, null);
            this.f2162d = fArr;
        }
        if (this.f2164f) {
            Matrix matrix = this.f2160b;
            if (matrix == null) {
                matrix = new Matrix();
                this.f2160b = matrix;
            }
            this.f2159a.mo39856d(obj, matrix);
            Matrix matrix2 = this.f2161c;
            if (matrix2 == null || !Intrinsics.equals(matrix, matrix2)) {
                C11020g.m6510b(fArr, matrix);
                this.f2160b = matrix2;
                this.f2161c = matrix;
            }
            this.f2164f = false;
            return fArr;
        }
        return fArr;
    }

    /* renamed from: c */
    public final void m39830c() {
        this.f2164f = true;
        this.f2165g = true;
    }
}
