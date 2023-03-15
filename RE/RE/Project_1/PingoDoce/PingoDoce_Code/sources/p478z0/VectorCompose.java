package p478z0;

import p092f0.AbstractC5150a;
import p181jd.Intrinsics;

/* renamed from: z0.j */
/* loaded from: classes.dex */
public final class VectorCompose extends AbstractC5150a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorCompose(AbstractC13528i abstractC13528i) {
        super(abstractC13528i);
        Intrinsics.isThisObjectNull(abstractC13528i, "root");
    }

    /* renamed from: m */
    private final Vector m1068m(AbstractC13528i abstractC13528i) {
        if (abstractC13528i instanceof Vector) {
            return (Vector) abstractC13528i;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    /* renamed from: g */
    public void m1071g(int i, int i2, int i3) {
        m1068m((AbstractC13528i) mo25549a()).m1248i(i, i2, i3);
    }

    /* renamed from: h */
    public void m1070h(int i, int i2) {
        m1068m((AbstractC13528i) mo25549a()).m1247j(i, i2);
    }

    /* renamed from: k */
    protected void mo25543k() {
        Vector m1068m = m1068m((AbstractC13528i) m25544j());
        m1068m.m1247j(0, m1068m.m1251f());
    }

    /* renamed from: n */
    public void m1073b(int i, AbstractC13528i abstractC13528i) {
        Intrinsics.isThisObjectNull(abstractC13528i, "instance");
    }

    /* renamed from: o */
    public void m1072e(int i, AbstractC13528i abstractC13528i) {
        Intrinsics.isThisObjectNull(abstractC13528i, "instance");
        m1068m((AbstractC13528i) mo25549a()).m1249h(i, abstractC13528i);
    }
}
