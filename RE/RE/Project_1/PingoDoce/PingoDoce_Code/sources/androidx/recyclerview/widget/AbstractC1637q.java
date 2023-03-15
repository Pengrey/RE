package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1578c;
import androidx.recyclerview.widget.C1580d;
import androidx.recyclerview.widget.C1601h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC1531c0;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.q */
/* loaded from: classes.dex */
public abstract class AbstractC1637q<T, VH extends RecyclerView.AbstractC1531c0> extends RecyclerView.AbstractC1535g<VH> {

    /* renamed from: c */
    final C1580d<T> f4997c;

    /* renamed from: d */
    private final C1580d.InterfaceC1584b<T> f4998d;

    /* compiled from: ListAdapter.java */
    /* renamed from: androidx.recyclerview.widget.q$a */
    /* loaded from: classes.dex */
    class C1638a implements C1580d.InterfaceC1584b<Object> {
        C1638a() {
        }

        @Override // androidx.recyclerview.widget.C1580d.InterfaceC1584b
        /* renamed from: a */
        public void mo35899a(List<Object> list, List<Object> list2) {
            AbstractC1637q.this.m35901E(list, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1637q(C1601h.AbstractC1605d<T> abstractC1605d) {
        C1638a c1638a = new C1638a();
        this.f4998d = c1638a;
        C1580d<T> c1580d = new C1580d<>(new C1577b(this), new C1578c.C1579a(abstractC1605d).m36116a());
        this.f4997c = c1580d;
        c1580d.m36115a(c1638a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public T m35902D(int i) {
        return this.f4997c.m36114b().get(i);
    }

    /* renamed from: E */
    public void m35901E(List<T> list, List<T> list2) {
    }

    /* renamed from: F */
    public void m35900F(List<T> list) {
        this.f4997c.m36111e(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: f */
    public int mo29834f() {
        return this.f4997c.m36114b().size();
    }
}
