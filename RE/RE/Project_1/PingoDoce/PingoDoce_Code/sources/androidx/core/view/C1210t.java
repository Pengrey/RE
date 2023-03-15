package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.t */
/* loaded from: classes.dex */
public class C1210t {

    /* renamed from: a */
    private int f3578a;

    /* renamed from: b */
    private int f3579b;

    public C1210t(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m38022a() {
        return this.f3578a | this.f3579b;
    }

    /* renamed from: b */
    public void m38021b(View view, View view2, int i) {
        m38020c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m38020c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f3579b = i;
        } else {
            this.f3578a = i;
        }
    }

    /* renamed from: d */
    public void m38019d(View view) {
        m38018e(view, 0);
    }

    /* renamed from: e */
    public void m38018e(View view, int i) {
        if (i == 1) {
            this.f3579b = 0;
        } else {
            this.f3578a = 0;
        }
    }
}
