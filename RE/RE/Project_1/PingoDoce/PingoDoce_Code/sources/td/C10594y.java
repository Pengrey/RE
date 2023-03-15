package td;

import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* renamed from: td.y */
/* loaded from: classes2.dex */
public final class C10594y {

    /* renamed from: a */
    public final Object f27306a;

    /* renamed from: b */
    public final InterfaceC6108l f27307b;

    public C10594y(Object obj, InterfaceC6108l interfaceC6108l) {
        this.f27306a = obj;
        this.f27307b = interfaceC6108l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10594y) {
            C10594y c10594y = (C10594y) obj;
            return Intrinsics.equals(this.f27306a, c10594y.f27306a) && Intrinsics.equals(this.f27307b, c10594y.f27307b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f27306a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f27307b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f27306a + ", onCancellation=" + this.f27307b + ')';
    }
}
