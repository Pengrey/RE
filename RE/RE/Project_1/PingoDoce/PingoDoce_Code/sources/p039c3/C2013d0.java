package p039c3;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: c3.d0 */
/* loaded from: classes.dex */
class C2013d0 extends C2027i0 {

    /* renamed from: e */
    private static boolean f5852e = true;

    @Override // p039c3.C2027i0
    /* renamed from: a */
    public void mo34912a(View view) {
    }

    @Override // p039c3.C2027i0
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo34910c(View view) {
        if (f5852e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5852e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p039c3.C2027i0
    /* renamed from: d */
    public void mo34909d(View view) {
    }

    @Override // p039c3.C2027i0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo34907f(View view, float f) {
        if (f5852e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5852e = false;
            }
        }
        view.setAlpha(f);
    }
}
