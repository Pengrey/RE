package p039c3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: c3.g0 */
/* loaded from: classes.dex */
class C2023g0 extends C2021f0 {

    /* renamed from: i */
    private static boolean f5865i = true;

    @Override // p039c3.C2027i0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo34906g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo34906g(view, i);
        } else if (f5865i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5865i = false;
            }
        }
    }
}
