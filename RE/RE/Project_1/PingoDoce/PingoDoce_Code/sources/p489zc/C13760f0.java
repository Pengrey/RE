package p489zc;

import p181jd.Intrinsics;

/* renamed from: zc.f0 */
/* loaded from: classes2.dex */
public final class C13760f0<T> {

    /* renamed from: a */
    private final int f34880a;

    /* renamed from: b */
    private final Object f34881b;

    public C13760f0(int i, Object obj) {
        this.f34880a = i;
        this.f34881b = obj;
    }

    /* renamed from: a */
    public final int m407a() {
        return this.f34880a;
    }

    /* renamed from: b */
    public final Object m406b() {
        return this.f34881b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13760f0) {
            C13760f0 c13760f0 = (C13760f0) obj;
            return this.f34880a == c13760f0.f34880a && Intrinsics.equals(this.f34881b, c13760f0.f34881b);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f34880a * 31;
        Object obj = this.f34881b;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f34880a + ", value=" + this.f34881b + ')';
    }
}
