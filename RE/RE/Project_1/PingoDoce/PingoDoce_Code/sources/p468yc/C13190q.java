package p468yc;

import java.io.Serializable;
import p181jd.Intrinsics;

/* renamed from: yc.q */
/* loaded from: classes2.dex */
public final class C13190q<A, B, C> implements Serializable {

    /* renamed from: w */
    private final Object f34151w;

    /* renamed from: x */
    private final Object f34152x;

    /* renamed from: y */
    private final Object f34153y;

    public C13190q(Object obj, Object obj2, Object obj3) {
        this.f34151w = obj;
        this.f34152x = obj2;
        this.f34153y = obj3;
    }

    /* renamed from: a */
    public final Object m1450a() {
        return this.f34151w;
    }

    /* renamed from: b */
    public final Object m1449b() {
        return this.f34152x;
    }

    /* renamed from: c */
    public final Object m1448c() {
        return this.f34153y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13190q) {
            C13190q c13190q = (C13190q) obj;
            return Intrinsics.equals(this.f34151w, c13190q.f34151w) && Intrinsics.equals(this.f34152x, c13190q.f34152x) && Intrinsics.equals(this.f34153y, c13190q.f34153y);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f34151w;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34152x;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f34153y;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f34151w + ", " + this.f34152x + ", " + this.f34153y + ')';
    }
}
