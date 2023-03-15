package p039c3;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: c3.f0 */
/* loaded from: classes.dex */
class C2021f0 extends C2019e0 {

    /* renamed from: h */
    private static boolean f5864h = true;

    @Override // p039c3.C2027i0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo34908e(View view, int i, int i2, int i3, int i4) {
        if (f5864h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5864h = false;
            }
        }
    }
}
