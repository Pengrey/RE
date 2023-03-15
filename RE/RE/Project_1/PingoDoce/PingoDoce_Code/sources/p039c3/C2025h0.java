package p039c3;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: c3.h0 */
/* loaded from: classes.dex */
class C2025h0 extends C2023g0 {
    @Override // p039c3.C2013d0, p039c3.C2027i0
    /* renamed from: c */
    public float mo34910c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p039c3.C2021f0, p039c3.C2027i0
    /* renamed from: e */
    public void mo34908e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p039c3.C2013d0, p039c3.C2027i0
    /* renamed from: f */
    public void mo34907f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p039c3.C2023g0, p039c3.C2027i0
    /* renamed from: g */
    public void mo34906g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p039c3.C2019e0, p039c3.C2027i0
    /* renamed from: h */
    public void mo34905h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p039c3.C2019e0, p039c3.C2027i0
    /* renamed from: i */
    public void mo34904i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
