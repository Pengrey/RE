package p092f0;

import java.util.ArrayList;

/* renamed from: f0.q1 */
/* loaded from: classes.dex */
public final class C5239q1<T> {

    /* renamed from: a */
    private final ArrayList<T> f14507a = new ArrayList<>();

    /* renamed from: a */
    public final void m24933a() {
        this.f14507a.clear();
    }

    /* renamed from: b */
    public final int m24932b() {
        return this.f14507a.size();
    }

    /* renamed from: c */
    public final boolean m24931c() {
        return this.f14507a.isEmpty();
    }

    /* renamed from: d */
    public final boolean m24930d() {
        return !m24931c();
    }

    /* renamed from: e */
    public final T m24929e() {
        return this.f14507a.get(m24932b() - 1);
    }

    /* renamed from: f */
    public final T m24928f(int i) {
        return this.f14507a.get(i);
    }

    /* renamed from: g */
    public final T m24927g() {
        return this.f14507a.remove(m24932b() - 1);
    }

    /* renamed from: h */
    public final boolean m24926h(T t) {
        return this.f14507a.add(t);
    }

    /* renamed from: i */
    public final T[] m24925i() {
        int size = this.f14507a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = this.f14507a.get(i);
        }
        return tArr;
    }
}
