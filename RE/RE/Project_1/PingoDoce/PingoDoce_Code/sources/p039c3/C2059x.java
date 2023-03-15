package p039c3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: c3.x */
/* loaded from: classes.dex */
class C2059x {

    /* renamed from: a */
    private static boolean f5967a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC2058w m34809a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C2057v(viewGroup);
        }
        return C2056u.m34812g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m34808b(ViewGroup viewGroup, boolean z) {
        if (f5967a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5967a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m34807c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m34808b(viewGroup, z);
        } else {
            C2060y.m34805b(viewGroup, z);
        }
    }
}
