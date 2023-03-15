package ie;

import p181jd.Intrinsics;

/* renamed from: ie.c */
/* loaded from: classes2.dex */
public final class C6120c<T> {

    /* renamed from: a */
    private final Object f16802a;

    /* renamed from: b */
    private final Object f16803b;

    public C6120c(Object obj, Object obj2) {
        this.f16802a = obj;
        this.f16803b = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6120c) {
            C6120c c6120c = (C6120c) obj;
            return Intrinsics.equals(this.f16802a, c6120c.f16802a) && Intrinsics.equals(this.f16803b, c6120c.f16803b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f16802a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f16803b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        Object obj = this.f16802a;
        Object obj2 = this.f16803b;
        return "Change(oldData=" + obj + ", newData=" + obj2 + ")";
    }
}
