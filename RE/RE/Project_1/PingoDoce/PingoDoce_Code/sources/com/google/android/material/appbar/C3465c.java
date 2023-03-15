package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: classes.dex */
public class C3465c<V extends View> extends CoordinatorLayout.AbstractC0873c<V> {

    /* renamed from: a */
    private C3466d f9389a;

    /* renamed from: b */
    private int f9390b;

    /* renamed from: c */
    private int f9391c;

    public C3465c() {
        this.f9390b = 0;
        this.f9391c = 0;
    }

    /* renamed from: E */
    public int m30612E() {
        C3466d c3466d = this.f9389a;
        if (c3466d != null) {
            return c3466d.m30607c();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo30611F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m39354I(v, i);
    }

    /* renamed from: G */
    public boolean m30610G(int i) {
        C3466d c3466d = this.f9389a;
        if (c3466d != null) {
            return c3466d.m30604f(i);
        }
        this.f9390b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0873c
    /* renamed from: l */
    public boolean mo30696h0(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo30611F(coordinatorLayout, v, i);
        if (this.f9389a == null) {
            this.f9389a = new C3466d(v);
        }
        this.f9389a.m30606d();
        this.f9389a.m30609a();
        int i2 = this.f9390b;
        if (i2 != 0) {
            this.f9389a.m30604f(i2);
            this.f9390b = 0;
        }
        int i3 = this.f9391c;
        if (i3 != 0) {
            this.f9389a.m30605e(i3);
            this.f9391c = 0;
            return true;
        }
        return true;
    }

    public C3465c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9390b = 0;
        this.f9391c = 0;
    }
}
