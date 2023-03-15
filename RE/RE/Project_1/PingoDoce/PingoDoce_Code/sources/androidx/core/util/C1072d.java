package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* loaded from: classes.dex */
public class C1072d<F, S> {

    /* renamed from: a */
    public final F f3406a;

    /* renamed from: b */
    public final S f3407b;

    public C1072d(F f, S s) {
        this.f3406a = f;
        this.f3407b = s;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1072d) {
            C1072d c1072d = (C1072d) obj;
            return C1070c.m38634a(c1072d.f3406a, this.f3406a) && C1070c.m38634a(c1072d.f3407b, this.f3407b);
        }
        return false;
    }

    public int hashCode() {
        F f = this.f3406a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f3407b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3406a + " " + this.f3407b + "}";
    }
}
