package p260o0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateList.kt */
/* renamed from: o0.w */
/* loaded from: classes.dex */
public final class C7994w<T> implements ListIterator, InterfaceC6650a {

    /* renamed from: w */
    private final C7982r f20711w;

    /* renamed from: x */
    private int f20712x;

    /* renamed from: y */
    private int f20713y;

    public C7994w(C7982r c7982r, int i) {
        Intrinsics.isThisObjectNull(c7982r, "list");
        this.f20711w = c7982r;
        this.f20712x = i - 1;
        this.f20713y = c7982r.m17275l();
    }

    /* renamed from: a */
    private final void m17214a() {
        if (this.f20711w.m17275l() != this.f20713y) {
            throw new ConcurrentModificationException();
        }
    }

    public void add(Object obj) {
        m17214a();
        this.f20711w.add(this.f20712x + 1, obj);
        this.f20712x++;
        this.f20713y = this.f20711w.m17275l();
    }

    public boolean hasNext() {
        return this.f20712x < this.f20711w.size() - 1;
    }

    public boolean hasPrevious() {
        return this.f20712x >= 0;
    }

    public Object next() {
        m17214a();
        int i = this.f20712x + 1;
        C7986s.m17256e(i, this.f20711w.size());
        Object obj = this.f20711w.get(i);
        this.f20712x = i;
        return obj;
    }

    public int nextIndex() {
        return this.f20712x + 1;
    }

    public Object previous() {
        m17214a();
        C7986s.m17256e(this.f20712x, this.f20711w.size());
        this.f20712x--;
        return this.f20711w.get(this.f20712x);
    }

    public int previousIndex() {
        return this.f20712x;
    }

    public void remove() {
        m17214a();
        this.f20711w.remove(this.f20712x);
        this.f20712x--;
        this.f20713y = this.f20711w.m17275l();
    }

    public void set(Object obj) {
        m17214a();
        this.f20711w.set(this.f20712x, obj);
        this.f20713y = this.f20711w.m17275l();
    }
}
