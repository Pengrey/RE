package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1635o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
class C3572m extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* renamed from: com.google.android.material.datepicker.m$a */
    /* loaded from: classes.dex */
    class C3573a extends C1635o {
        C3573a(C3572m c3572m, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1635o
        /* renamed from: v */
        protected float mo29857v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3572m(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1546o
    /* renamed from: J1 */
    public void mo29858J1(RecyclerView recyclerView, RecyclerView.C1564z c1564z, int i) {
        C3573a c3573a = new C3573a(this, recyclerView.getContext());
        c3573a.m36338p(i);
        m36482K1(c3573a);
    }
}
