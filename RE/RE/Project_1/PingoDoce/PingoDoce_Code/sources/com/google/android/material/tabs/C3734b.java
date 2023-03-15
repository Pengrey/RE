package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p120g8.C5616a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.b */
/* loaded from: classes.dex */
public class C3734b extends C3735c {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.C3735c
    /* renamed from: d */
    public void mo29105d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float m23564b;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF m29108a = C3735c.m29108a(tabLayout, view);
        if (i < 0) {
            m23564b = C5616a.m23564b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            m23564b = C5616a.m23564b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) m29108a.left, drawable.getBounds().top, (int) m29108a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (m23564b * 255.0f));
    }
}
