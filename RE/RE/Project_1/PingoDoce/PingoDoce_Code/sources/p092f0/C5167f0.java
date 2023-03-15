package p092f0;

import p181jd.Intrinsics;

/* renamed from: f0.f0 */
/* loaded from: classes.dex */
public final class C5167f0 {

    /* renamed from: a */
    private final Object f14284a;

    /* renamed from: b */
    private final Object f14285b;

    public C5167f0(Object obj, Object obj2) {
        this.f14284a = obj;
        this.f14285b = obj2;
    }

    /* renamed from: a */
    private final int m25418a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5167f0) {
            C5167f0 c5167f0 = (C5167f0) obj;
            return Intrinsics.equals(this.f14284a, c5167f0.f14284a) && Intrinsics.equals(this.f14285b, c5167f0.f14285b);
        }
        return false;
    }

    public int hashCode() {
        return (m25418a(this.f14284a) * 31) + m25418a(this.f14285b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f14284a + ", right=" + this.f14285b + ')';
    }
}
