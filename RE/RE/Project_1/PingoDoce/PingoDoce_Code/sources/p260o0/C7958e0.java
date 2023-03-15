package p260o0;

import id.InterfaceC6108l;
import java.util.Set;
import kotlin.ExceptionsH;
import p181jd.Intrinsics;

/* compiled from: Snapshot.kt */
/* renamed from: o0.e0 */
/* loaded from: classes.dex */
public final class C7958e0 extends C7952c {

    /* renamed from: k */
    private final C7952c f20641k;

    /* renamed from: l */
    private final InterfaceC6108l f20642l;

    /* renamed from: m */
    private final InterfaceC6108l f20643m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7958e0(p260o0.C7952c r5, id.InterfaceC6108l r6, id.InterfaceC6108l r7) {
        /*
            r4 = this;
            o0.j$a r0 = p260o0.SnapshotIdSet.f20653A
            o0.j r0 = r0.m17347a()
            r1 = 0
            if (r5 != 0) goto Lb
            r2 = r1
            goto Lf
        Lb:
            id.l r2 = r5.m17462f()
        Lf:
            if (r2 != 0) goto L1f
            java.util.concurrent.atomic.AtomicReference r2 = p260o0.C7971l.m17319d()
            java.lang.Object r2 = r2.get()
            o0.a r2 = (p260o0.Snapshot) r2
            id.l r2 = r2.m17462f()
        L1f:
            id.l r2 = p260o0.C7971l.m17313j(r6, r2)
            if (r5 != 0) goto L26
            goto L2a
        L26:
            id.l r1 = r5.m17460h()
        L2a:
            if (r1 != 0) goto L3a
            java.util.concurrent.atomic.AtomicReference r1 = p260o0.C7971l.m17319d()
            java.lang.Object r1 = r1.get()
            o0.a r1 = (p260o0.Snapshot) r1
            id.l r1 = r1.m17460h()
        L3a:
            id.l r1 = p260o0.C7971l.m17312k(r7, r1)
            r3 = 0
            r4.<init>(r3, r0, r2, r1)
            r4.f20641k = r5
            r4.f20642l = r6
            r4.f20643m = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C7958e0.<init>(o0.c, id.l, id.l):void");
    }

    /* renamed from: H */
    private final C7952c m17413H() {
        C7952c c7952c = this.f20641k;
        if (c7952c == null) {
            Object obj = C7971l.m17319d().get();
            Intrinsics.checkIfNull(obj, "currentGlobalSnapshot.get()");
            return (C7952c) obj;
        }
        return c7952c;
    }

    /* renamed from: D */
    public void m17415D(Set set) {
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: F */
    public C7952c m17414F(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        return m17413H().m17466F(C7971l.m17313j(interfaceC6108l, m17462f()), C7971l.m17312k(interfaceC6108l2, m17460h()));
    }

    /* renamed from: I */
    public Void m17406j(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: J */
    public Void m17405k(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: b */
    public void m17410b() {
        m17373o(true);
    }

    /* renamed from: d */
    public int m17409d() {
        return m17413H().m17384d();
    }

    /* renamed from: e */
    public SnapshotIdSet m17408e() {
        return m17413H().m17383e();
    }

    /* renamed from: g */
    public boolean m17407g() {
        return m17413H().m17461g();
    }

    /* renamed from: l */
    public void m17404l() {
        m17413H().m17457l();
    }

    /* renamed from: m */
    public void m17403m(InterfaceC7950b0 interfaceC7950b0) {
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        m17413H().m17456m(interfaceC7950b0);
    }

    /* renamed from: p */
    public void m17402p(int i) {
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: q */
    public void m17401q(SnapshotIdSet snapshotIdSet) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "value");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: r */
    public AbstractC7961h m17400r(InterfaceC6108l interfaceC6108l) {
        return m17413H().m17455r(C7971l.m17313j(interfaceC6108l, m17462f()));
    }

    /* renamed from: v */
    public AbstractC7965i m17399v() {
        return m17413H().m17452v();
    }

    /* renamed from: x */
    public Set m17398x() {
        return m17413H().m17450x();
    }
}
