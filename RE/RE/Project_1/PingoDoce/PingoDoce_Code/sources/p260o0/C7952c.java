package p260o0;

import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsH;
import p181jd.Intrinsics;
import p260o0.AbstractC7965i;
import p468yc.C13182l;
import p468yc.C13191r;
import p468yc.C13195u;

/* compiled from: Snapshot.kt */
/* renamed from: o0.c */
/* loaded from: classes.dex */
public class C7952c extends AbstractC7961h {

    /* renamed from: e */
    private final InterfaceC6108l f20621e;

    /* renamed from: f */
    private final InterfaceC6108l f20622f;

    /* renamed from: g */
    private Set f20623g;

    /* renamed from: h */
    private SnapshotIdSet f20624h;

    /* renamed from: i */
    private int f20625i;

    /* renamed from: j */
    private boolean f20626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7952c(int i, SnapshotIdSet snapshotIdSet, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        super(i, snapshotIdSet, null);
        Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
        this.f20621e = interfaceC6108l;
        this.f20622f = interfaceC6108l2;
        this.f20624h = SnapshotIdSet.f20653A.m17347a();
        this.f20625i = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r3 != false) goto L15;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m17454t() {
        /*
            r5 = this;
            java.util.Set r0 = r5.m17450x()
            if (r0 == 0) goto L46
            r5.m17465G()
            r1 = 0
            r5.m17468D(r1)
            int r1 = r5.m17384d()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r0.next()
            o0.b0 r2 = (p260o0.InterfaceC7950b0) r2
            o0.c0 r2 = r2.m17475b()
        L25:
            if (r2 == 0) goto L15
            int r3 = r2.m17444d()
            if (r3 == r1) goto L3d
            o0.j r3 = r5.f20624h
            int r4 = r2.m17444d()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = p489zc.C13777q.m262E(r3, r4)
            if (r3 == 0) goto L41
        L3d:
            r3 = 0
            r2.m17442f(r3)
        L41:
            o0.c0 r2 = r2.m17445c()
            goto L25
        L46:
            r5.m17464a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C7952c.m17454t():void");
    }

    /* renamed from: A */
    public final void m17471A(int i) {
        synchronized (C7971l.m17297z()) {
            m17467E(m17449y().m17348x(i));
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: B */
    public final void m17470B(SnapshotIdSet snapshotIdSet) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "snapshots");
        synchronized (C7971l.m17297z()) {
            m17467E(m17449y().m17349v(snapshotIdSet));
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: C */
    public final void m17469C(boolean z) {
        this.f20626j = z;
    }

    /* renamed from: D */
    public void m17468D(Set set) {
        this.f20623g = set;
    }

    /* renamed from: E */
    public final void m17467E(SnapshotIdSet snapshotIdSet) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "<set-?>");
        this.f20624h = snapshotIdSet;
    }

    /* renamed from: F */
    public C7952c m17466F(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        C7954d c7954d;
        m17369s();
        m17465G();
        m17471A(m17384d());
        synchronized (C7971l.m17297z()) {
            int m17316g = C7971l.m17316g();
            C7971l.m17307p(m17316g + 1);
            C7971l.m17306q(C7971l.m17315h().m17348x(m17316g));
            SnapshotIdSet m17383e = m17383e();
            m17371q(m17383e.m17348x(m17316g));
            c7954d = new C7954d(m17316g, C7971l.m17302u(m17383e, m17384d() + 1, m17316g), C7971l.m17313j(interfaceC6108l, m17462f()), C7971l.m17312k(interfaceC6108l2, m17460h()), this);
        }
        int m17384d = m17384d();
        synchronized (C7971l.m17297z()) {
            int m17316g2 = C7971l.m17316g();
            C7971l.m17307p(m17316g2 + 1);
            m17372p(m17316g2);
            C7971l.m17306q(C7971l.m17315h().m17348x(m17384d()));
            C13195u c13195u = C13195u.f34156a;
        }
        m17371q(C7971l.m17302u(m17383e(), m17384d + 1, m17384d()));
        return c7954d;
    }

    /* renamed from: G */
    public final void m17465G() {
        if (!(!this.f20626j)) {
            throw new IllegalArgumentException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* renamed from: a */
    public void m17464a() {
        synchronized (C7971l.m17297z()) {
            C7971l.m17306q(C7971l.m17315h().m17352q(m17384d()).m17353p(m17449y()));
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: b */
    public void m17463b() {
        if (m17385c()) {
            return;
        }
        super.m17386b();
        m17458k(this);
    }

    /* renamed from: f */
    public InterfaceC6108l m17462f() {
        return this.f20621e;
    }

    /* renamed from: g */
    public boolean m17461g() {
        return false;
    }

    /* renamed from: h */
    public InterfaceC6108l m17460h() {
        return this.f20622f;
    }

    /* renamed from: j */
    public void m17459j(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        this.f20625i++;
    }

    /* renamed from: k */
    public void m17458k(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        int i = this.f20625i;
        if (i > 0) {
            int i2 = i - 1;
            this.f20625i = i2;
            if (i2 != 0 || this.f20626j) {
                return;
            }
            m17454t();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: l */
    public void m17457l() {
        if (this.f20626j || m17385c()) {
            return;
        }
        m17453u();
    }

    /* renamed from: m */
    public void m17456m(InterfaceC7950b0 interfaceC7950b0) {
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        Set m17450x = m17450x();
        if (m17450x == null) {
            m17450x = new HashSet();
            m17468D(m17450x);
        }
        m17450x.add(interfaceC7950b0);
    }

    /* renamed from: r */
    public AbstractC7961h m17455r(InterfaceC6108l interfaceC6108l) {
        C7956e c7956e;
        m17369s();
        m17465G();
        int m17384d = m17384d();
        m17471A(m17384d());
        synchronized (C7971l.m17297z()) {
            int m17316g = C7971l.m17316g();
            C7971l.m17307p(m17316g + 1);
            C7971l.m17306q(C7971l.m17315h().m17348x(m17316g));
            c7956e = new C7956e(m17316g, C7971l.m17302u(m17383e(), m17384d + 1, m17316g), interfaceC6108l, this);
        }
        int m17384d2 = m17384d();
        synchronized (C7971l.m17297z()) {
            int m17316g2 = C7971l.m17316g();
            C7971l.m17307p(m17316g2 + 1);
            m17372p(m17316g2);
            C7971l.m17306q(C7971l.m17315h().m17348x(m17384d()));
            C13195u c13195u = C13195u.f34156a;
        }
        m17371q(C7971l.m17302u(m17383e(), m17384d2 + 1, m17384d()));
        return c7956e;
    }

    /* renamed from: u */
    public final void m17453u() {
        m17471A(m17384d());
        C13195u c13195u = C13195u.f34156a;
        int m17384d = m17384d();
        synchronized (C7971l.m17297z()) {
            int m17316g = C7971l.m17316g();
            C7971l.m17307p(m17316g + 1);
            m17372p(m17316g);
            C7971l.m17306q(C7971l.m17315h().m17348x(m17384d()));
        }
        m17371q(C7971l.m17302u(m17383e(), m17384d + 1, m17384d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[LOOP:0: B:30:0x00eb->B:31:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109 A[LOOP:1: B:36:0x0107->B:37:0x0109, LOOP_END] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p260o0.AbstractC7965i m17452v() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C7952c.m17452v():o0.i");
    }

    /* renamed from: w */
    public final boolean m17451w() {
        return this.f20626j;
    }

    /* renamed from: x */
    public Set m17450x() {
        return this.f20623g;
    }

    /* renamed from: y */
    public final SnapshotIdSet m17449y() {
        return this.f20624h;
    }

    /* renamed from: z */
    public final AbstractC7965i m17448z(int i, Map map, SnapshotIdSet snapshotIdSet) {
        AbstractC7953c0 m17309n;
        Intrinsics.isThisObjectNull(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet m17349v = m17383e().m17348x(m17384d()).m17349v(this.f20624h);
        Set<InterfaceC7950b0> m17450x = m17450x();
        Intrinsics.ifNullDoSomething(m17450x);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (InterfaceC7950b0 interfaceC7950b0 : m17450x) {
            AbstractC7953c0 m17475b = interfaceC7950b0.m17475b();
            AbstractC7953c0 m17309n2 = C7971l.m17309n(m17475b, i, snapshotIdSet);
            if (m17309n2 != null && (m17309n = C7971l.m17309n(m17475b, m17384d(), m17349v)) != null && !Intrinsics.equals(m17309n2, m17309n)) {
                AbstractC7953c0 m17309n3 = C7971l.m17309n(m17475b, m17384d(), m17383e());
                if (m17309n3 != null) {
                    AbstractC7953c0 abstractC7953c0 = map == null ? null : (AbstractC7953c0) map.get(m17309n2);
                    if (abstractC7953c0 == null) {
                        abstractC7953c0 = interfaceC7950b0.m17473h(m17309n, m17309n2, m17309n3);
                    }
                    if (abstractC7953c0 == null) {
                        return new AbstractC7965i.C7966a(this);
                    }
                    if (!Intrinsics.equals(abstractC7953c0, m17309n3)) {
                        if (Intrinsics.equals(abstractC7953c0, m17309n2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(C13191r.m1447a(interfaceC7950b0, m17309n2.mo17446b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(interfaceC7950b0);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(!Intrinsics.equals(abstractC7953c0, m17309n) ? C13191r.m1447a(interfaceC7950b0, abstractC7953c0) : C13191r.m1447a(interfaceC7950b0, m17309n.mo17446b()));
                        }
                    }
                } else {
                    C7971l.m17310m();
                    throw new ExceptionsH();
                }
            }
        }
        if (arrayList != null) {
            m17453u();
            int i2 = 0;
            int size = arrayList.size();
            while (i2 < size) {
                int i3 = i2 + 1;
                C13182l c13182l = (C13182l) arrayList.get(i2);
                InterfaceC7950b0 interfaceC7950b02 = (InterfaceC7950b0) c13182l.m1462a();
                AbstractC7953c0 abstractC7953c02 = (AbstractC7953c0) c13182l.m1461b();
                abstractC7953c02.m17442f(m17384d());
                synchronized (C7971l.m17297z()) {
                    abstractC7953c02.m17443e(interfaceC7950b02.m17475b());
                    interfaceC7950b02.m17474f(abstractC7953c02);
                    C13195u c13195u = C13195u.f34156a;
                }
                i2 = i3;
            }
        }
        if (arrayList2 != null) {
            m17450x.removeAll(arrayList2);
        }
        return AbstractC7965i.C7967b.f20652a;
    }
}
