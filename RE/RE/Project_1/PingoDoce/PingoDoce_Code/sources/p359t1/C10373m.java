package p359t1;

import p181jd.Intrinsics;

/* renamed from: t1.m */
/* loaded from: classes.dex */
public final class C10373m implements InterfaceC10362d {

    /* renamed from: a */
    private final int f26982a;

    /* renamed from: b */
    private final FontWeight f26983b;

    /* renamed from: c */
    private final int f26984c;

    /* renamed from: b */
    public int mo8154b() {
        return this.f26984c;
    }

    /* renamed from: c */
    public FontWeight mo8153c() {
        return this.f26983b;
    }

    /* renamed from: d */
    public final int m8094d() {
        return this.f26982a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10373m) {
            C10373m c10373m = (C10373m) obj;
            return this.f26982a == c10373m.f26982a && Intrinsics.equals(mo8153c(), c10373m.mo8153c()) && C10366h.m8133f(mo8154b(), c10373m.mo8154b());
        }
        return false;
    }

    public int hashCode() {
        return (((this.f26982a * 31) + mo8153c().hashCode()) * 31) + C10366h.m8132g(mo8154b());
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f26982a + ", weight=" + mo8153c() + ", style=" + ((Object) C10366h.m8131h(mo8154b())) + ')';
    }
}
