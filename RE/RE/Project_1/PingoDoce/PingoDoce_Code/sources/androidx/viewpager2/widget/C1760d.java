package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.d */
/* loaded from: classes.dex */
public final class C1760d extends ViewPager2.AbstractC1747i {

    /* renamed from: a */
    private final LinearLayoutManager f5396a;

    /* renamed from: b */
    private ViewPager2.InterfaceC1752k f5397b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1760d(LinearLayoutManager linearLayoutManager) {
        this.f5396a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
    /* renamed from: a */
    public void mo29096a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
    /* renamed from: b */
    public void mo29095b(int i, float f, int i2) {
        if (this.f5397b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f5396a.m36483K(); i3++) {
            View m36484J = this.f5396a.m36484J(i3);
            if (m36484J != null) {
                this.f5397b.m35451a(m36484J, (this.f5396a.m36442i0(m36484J) - i) + f2);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f5396a.m36483K())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
    /* renamed from: c */
    public void mo29094c(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public ViewPager2.InterfaceC1752k m35440d() {
        return this.f5397b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35439e(ViewPager2.InterfaceC1752k interfaceC1752k) {
        this.f5397b = interfaceC1752k;
    }
}
