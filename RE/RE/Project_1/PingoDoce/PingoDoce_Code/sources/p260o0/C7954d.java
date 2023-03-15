package p260o0;

import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* compiled from: Snapshot.kt */
/* renamed from: o0.d */
/* loaded from: classes.dex */
public final class C7954d extends C7952c {

    /* renamed from: k */
    private final C7952c f20629k;

    /* renamed from: l */
    private boolean f20630l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7954d(int i, SnapshotIdSet snapshotIdSet, InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, C7952c c7952c) {
        super(i, snapshotIdSet, interfaceC6108l, interfaceC6108l2);
        Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
        Intrinsics.isThisObjectNull(c7952c, "parent");
        this.f20629k = c7952c;
        c7952c.m17459j(this);
    }

    /* renamed from: H */
    private final void m17441H() {
        if (this.f20630l) {
            return;
        }
        this.f20630l = true;
        this.f20629k.m17458k(this);
    }

    /* renamed from: I */
    public final C7952c m17440I() {
        return this.f20629k;
    }

    /* renamed from: b */
    public void m17439b() {
        if (m17385c()) {
            return;
        }
        super.m17463b();
        m17441H();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: all -> 0x00bf, TryCatch #0 {, blocks: (B:13:0x002d, B:15:0x0032, B:18:0x0039, B:22:0x0057, B:24:0x0061, B:25:0x006d, B:27:0x0074, B:29:0x007e, B:30:0x0085, B:26:0x0071), top: B:39:0x002d }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p260o0.AbstractC7965i m17438v() {
        /*
            r6 = this;
            o0.c r0 = r6.f20629k
            boolean r0 = r0.m17451w()
            if (r0 != 0) goto Lc2
            o0.c r0 = r6.f20629k
            boolean r0 = r0.m17385c()
            if (r0 == 0) goto L12
            goto Lc2
        L12:
            java.util.Set r0 = r6.m17450x()
            int r1 = r6.m17384d()
            if (r0 == 0) goto L27
            o0.c r2 = r6.f20629k
            o0.j r3 = r2.m17383e()
            java.util.Map r2 = p260o0.C7971l.m17311l(r2, r6, r3)
            goto L28
        L27:
            r2 = 0
        L28:
            java.lang.Object r3 = p260o0.C7971l.m17297z()
            monitor-enter(r3)
            p260o0.C7971l.m17303t(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto L71
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto L39
            goto L71
        L39:
            o0.c r4 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            int r4 = r4.m17384d()     // Catch: java.lang.Throwable -> Lbf
            o0.c r5 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            o0.j r5 = r5.m17383e()     // Catch: java.lang.Throwable -> Lbf
            o0.i r2 = r6.m17448z(r4, r2, r5)     // Catch: java.lang.Throwable -> Lbf
            o0.i$b r4 = p260o0.AbstractC7965i.C7967b.f20652a     // Catch: java.lang.Throwable -> Lbf
            boolean r4 = p181jd.Intrinsics.equals(r2, r4)     // Catch: java.lang.Throwable -> Lbf
            if (r4 != 0) goto L57
            monitor-exit(r3)
            return r2
        L57:
            o0.c r2 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            java.util.Set r2 = r2.m17450x()     // Catch: java.lang.Throwable -> Lbf
            if (r2 != 0) goto L6d
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lbf
            r2.<init>()     // Catch: java.lang.Throwable -> Lbf
            o0.c r4 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            r4.m17468D(r2)     // Catch: java.lang.Throwable -> Lbf
        L6d:
            r2.addAll(r0)     // Catch: java.lang.Throwable -> Lbf
            goto L74
        L71:
            r6.m17464a()     // Catch: java.lang.Throwable -> Lbf
        L74:
            o0.c r0 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            int r0 = r0.m17384d()     // Catch: java.lang.Throwable -> Lbf
            if (r0 >= r1) goto L85
            o0.c r0 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            r0.m17453u()     // Catch: java.lang.Throwable -> Lbf
        L85:
            o0.c r0 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            o0.c r2 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            o0.j r2 = r2.m17383e()     // Catch: java.lang.Throwable -> Lbf
            o0.j r2 = r2.m17352q(r1)     // Catch: java.lang.Throwable -> Lbf
            o0.j r4 = r6.m17449y()     // Catch: java.lang.Throwable -> Lbf
            o0.j r2 = r2.m17353p(r4)     // Catch: java.lang.Throwable -> Lbf
            r0.m17371q(r2)     // Catch: java.lang.Throwable -> Lbf
            o0.c r0 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            r0.m17471A(r1)     // Catch: java.lang.Throwable -> Lbf
            o0.c r0 = r6.m17440I()     // Catch: java.lang.Throwable -> Lbf
            o0.j r1 = r6.m17449y()     // Catch: java.lang.Throwable -> Lbf
            r0.m17470B(r1)     // Catch: java.lang.Throwable -> Lbf
            yc.u r0 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r3)
            r0 = 1
            r6.m17469C(r0)
            r6.m17441H()
            o0.i$b r0 = p260o0.AbstractC7965i.C7967b.f20652a
            return r0
        Lbf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        Lc2:
            o0.i$a r0 = new o0.i$a
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.C7954d.m17438v():o0.i");
    }
}
