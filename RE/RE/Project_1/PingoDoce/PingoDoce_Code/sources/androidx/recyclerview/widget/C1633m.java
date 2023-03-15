package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.core.view.C1112b0;
import p480z2.C13629c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes.dex */
public class C1633m implements InterfaceC1632l {

    /* renamed from: a */
    static final InterfaceC1632l f4977a = new C1633m();

    C1633m() {
    }

    /* renamed from: e */
    private static float m35923e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float m38394y = C1112b0.m38394y(childAt);
                if (m38394y > f) {
                    f = m38394y;
                }
            }
        }
        return f;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1632l
    /* renamed from: a */
    public void mo35927a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i = C13629c.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                C1112b0.m38391z0(view, ((Float) tag).floatValue());
            }
            view.setTag(i, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1632l
    /* renamed from: b */
    public void mo35926b(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1632l
    /* renamed from: c */
    public void mo35925c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1632l
    /* renamed from: d */
    public void mo35924d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z) {
            int i2 = C13629c.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C1112b0.m38394y(view));
                C1112b0.m38391z0(view, m35923e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
