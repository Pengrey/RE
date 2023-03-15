package p468yc;

import java.io.Serializable;
import p181jd.Intrinsics;

/* renamed from: yc.l */
/* loaded from: classes2.dex */
public final class C13182l<A, B> implements Serializable {

    /* renamed from: w */
    private final Object f34141w;

    /* renamed from: x */
    private final Object f34142x;

    public C13182l(Object obj, Object obj2) {
        this.f34141w = obj;
        this.f34142x = obj2;
    }

    /* renamed from: a */
    public final Object m1462a() {
        return this.f34141w;
    }

    /* renamed from: b */
    public final Object m1461b() {
        return this.f34142x;
    }

    /* renamed from: c */
    public final Object m1460c() {
        return this.f34141w;
    }

    /* renamed from: d */
    public final Object m1459d() {
        return this.f34142x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13182l) {
            C13182l c13182l = (C13182l) obj;
            return Intrinsics.equals(this.f34141w, c13182l.f34141w) && Intrinsics.equals(this.f34142x, c13182l.f34142x);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f34141w;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f34142x;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f34141w + ", " + this.f34142x + ')';
    }
}
