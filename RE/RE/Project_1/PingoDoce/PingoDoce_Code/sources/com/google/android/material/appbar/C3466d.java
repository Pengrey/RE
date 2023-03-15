package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C1112b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: classes.dex */
public class C3466d {

    /* renamed from: a */
    private final View f9392a;

    /* renamed from: b */
    private int f9393b;

    /* renamed from: c */
    private int f9394c;

    /* renamed from: d */
    private int f9395d;

    /* renamed from: e */
    private int f9396e;

    /* renamed from: f */
    private boolean f9397f = true;

    /* renamed from: g */
    private boolean f9398g = true;

    public C3466d(View view) {
        this.f9392a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m30609a() {
        View view = this.f9392a;
        C1112b0.m38435d0(view, this.f9395d - (view.getTop() - this.f9393b));
        View view2 = this.f9392a;
        C1112b0.m38437c0(view2, this.f9396e - (view2.getLeft() - this.f9394c));
    }

    /* renamed from: b */
    public int m30608b() {
        return this.f9393b;
    }

    /* renamed from: c */
    public int m30607c() {
        return this.f9395d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m30606d() {
        this.f9393b = this.f9392a.getTop();
        this.f9394c = this.f9392a.getLeft();
    }

    /* renamed from: e */
    public boolean m30605e(int i) {
        if (!this.f9398g || this.f9396e == i) {
            return false;
        }
        this.f9396e = i;
        m30609a();
        return true;
    }

    /* renamed from: f */
    public boolean m30604f(int i) {
        if (!this.f9397f || this.f9395d == i) {
            return false;
        }
        this.f9395d = i;
        m30609a();
        return true;
    }
}
