package p039c3;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: c3.e0 */
/* loaded from: classes.dex */
class C2019e0 extends C2013d0 {

    /* renamed from: f */
    private static boolean f5862f = true;

    /* renamed from: g */
    private static boolean f5863g = true;

    @Override // p039c3.C2027i0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo34905h(View view, Matrix matrix) {
        if (f5862f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5862f = false;
            }
        }
    }

    @Override // p039c3.C2027i0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo34904i(View view, Matrix matrix) {
        if (f5863g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5863g = false;
            }
        }
    }
}
