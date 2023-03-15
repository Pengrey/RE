package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C1112b0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.adapter.a */
/* loaded from: classes.dex */
public final class C1736a extends RecyclerView.AbstractC1531c0 {
    private C1736a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public static C1736a m35502M(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C1112b0.m38418m());
        frameLayout.setSaveEnabled(false);
        return new C1736a(frameLayout);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public FrameLayout m35501N() {
        return (FrameLayout) this.f4581a;
    }
}
