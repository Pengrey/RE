package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p120g8.C5616a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes.dex */
public class C3733a extends C3735c {
    /* renamed from: e */
    private static float m29110e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m29109f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.tabs.C3735c
    /* renamed from: d */
    public void mo29105d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float m29109f;
        float m29110e;
        RectF m29108a = C3735c.m29108a(tabLayout, view);
        RectF m29108a2 = C3735c.m29108a(tabLayout, view2);
        if (m29108a.left < m29108a2.left) {
            m29109f = m29110e(f);
            m29110e = m29109f(f);
        } else {
            m29109f = m29109f(f);
            m29110e = m29110e(f);
        }
        drawable.setBounds(C5616a.m23563c((int) m29108a.left, (int) m29108a2.left, m29109f), drawable.getBounds().top, C5616a.m23563c((int) m29108a.right, (int) m29108a2.right, m29110e), drawable.getBounds().bottom);
    }
}
