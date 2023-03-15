package p455y;

import java.util.ArrayList;
import java.util.List;

/* renamed from: y.y */
/* loaded from: classes.dex */
public final class C13055y<T> implements InterfaceC13017c<T> {

    /* renamed from: a */
    private final List<C13016b<T>> f33941a;

    /* renamed from: b */
    private final List<C13016b<T>> f33942b;

    /* renamed from: c */
    private int f33943c;

    public C13055y() {
        ArrayList arrayList = new ArrayList();
        this.f33941a = arrayList;
        this.f33942b = arrayList;
    }

    @Override // p455y.InterfaceC13017c
    /* renamed from: a */
    public List<C13016b<T>> mo1783a() {
        return this.f33942b;
    }

    @Override // p455y.InterfaceC13017c
    /* renamed from: b */
    public int mo1782b() {
        return this.f33943c;
    }

    /* renamed from: c */
    public final void m1781c(int i, T t) {
        if (i == 0) {
            return;
        }
        C13016b<T> c13016b = new C13016b<>(mo1782b(), i, t);
        this.f33943c = mo1782b() + i;
        this.f33941a.add(c13016b);
    }
}
