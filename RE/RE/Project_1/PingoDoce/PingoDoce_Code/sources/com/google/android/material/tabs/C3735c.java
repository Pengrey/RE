package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C3649p;
import com.google.android.material.tabs.TabLayout;
import p120g8.C5616a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.tabs.c */
/* loaded from: classes.dex */
public class C3735c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static RectF m29108a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.m29168z() && (view instanceof TabLayout.C3730h)) {
            return m29107b((TabLayout.C3730h) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    static RectF m29107b(TabLayout.C3730h c3730h, int i) {
        int contentWidth = c3730h.getContentWidth();
        int contentHeight = c3730h.getContentHeight();
        int m29491b = (int) C3649p.m29491b(c3730h.getContext(), i);
        if (contentWidth < m29491b) {
            contentWidth = m29491b;
        }
        int left = (c3730h.getLeft() + c3730h.getRight()) / 2;
        int top = (c3730h.getTop() + c3730h.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m29106c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m29108a = m29108a(tabLayout, view);
        drawable.setBounds((int) m29108a.left, drawable.getBounds().top, (int) m29108a.right, drawable.getBounds().bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo29105d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF m29108a = m29108a(tabLayout, view);
        RectF m29108a2 = m29108a(tabLayout, view2);
        drawable.setBounds(C5616a.m23563c((int) m29108a.left, (int) m29108a2.left, f), drawable.getBounds().top, C5616a.m23563c((int) m29108a.right, (int) m29108a2.right, f), drawable.getBounds().bottom);
    }
}
