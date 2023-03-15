package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes.dex */
public final class C1758b extends ViewPager2.AbstractC1747i {

    /* renamed from: a */
    private final List<ViewPager2.AbstractC1747i> f5394a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1758b(int i) {
        this.f5394a = new ArrayList(i);
    }

    /* renamed from: f */
    private void m35442f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
    /* renamed from: a */
    public void mo29096a(int i) {
        try {
            for (ViewPager2.AbstractC1747i abstractC1747i : this.f5394a) {
                abstractC1747i.mo29096a(i);
            }
        } catch (ConcurrentModificationException e) {
            m35442f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
    /* renamed from: b */
    public void mo29095b(int i, float f, int i2) {
        try {
            for (ViewPager2.AbstractC1747i abstractC1747i : this.f5394a) {
                abstractC1747i.mo29095b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m35442f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1747i
    /* renamed from: c */
    public void mo29094c(int i) {
        try {
            for (ViewPager2.AbstractC1747i abstractC1747i : this.f5394a) {
                abstractC1747i.mo29094c(i);
            }
        } catch (ConcurrentModificationException e) {
            m35442f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35444d(ViewPager2.AbstractC1747i abstractC1747i) {
        this.f5394a.add(abstractC1747i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m35443e(ViewPager2.AbstractC1747i abstractC1747i) {
        this.f5394a.remove(abstractC1747i);
    }
}
