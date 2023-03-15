package p260o0;

import id.InterfaceC6108l;
import java.util.List;
import kotlin.ExceptionsH;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: o0.a */
/* loaded from: classes.dex */
public final class Snapshot extends C7952c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    /* renamed from: o0.a$a */
    /* loaded from: classes.dex */
    public static final class C7947a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ List f20617w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7947a(List list) {
            super(1);
            this.f20617w = list;
        }

        /* renamed from: a */
        public final void m17483a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "state");
            List list = this.f20617w;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC6108l) list.get(i)).mo9587d(obj);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17483a(obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* renamed from: o0.a$b */
    /* loaded from: classes.dex */
    static final class C7948b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f20618w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f20619x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7948b(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            super(1);
            this.f20618w = interfaceC6108l;
            this.f20619x = interfaceC6108l2;
        }

        /* renamed from: a */
        public final C7952c mo9587d(SnapshotIdSet snapshotIdSet) {
            int m17316g;
            Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
            synchronized (C7971l.m17297z()) {
                m17316g = C7971l.m17316g();
                C7971l.m17307p(m17316g + 1);
            }
            return new C7952c(m17316g, snapshotIdSet, this.f20618w, this.f20619x);
        }
    }

    /* compiled from: Snapshot.kt */
    /* renamed from: o0.a$c */
    /* loaded from: classes.dex */
    static final class C7949c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f20620w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7949c(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f20620w = interfaceC6108l;
        }

        /* renamed from: a */
        public final C7960g mo9587d(SnapshotIdSet snapshotIdSet) {
            int m17316g;
            Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
            synchronized (C7971l.m17297z()) {
                m17316g = C7971l.m17316g();
                C7971l.m17307p(m17316g + 1);
            }
            return new C7960g(m17316g, snapshotIdSet, this.f20620w);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Snapshot(int r5, p260o0.SnapshotIdSet r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            p181jd.Intrinsics.isThisObjectNull(r6, r0)
            java.lang.Object r0 = p260o0.C7971l.m17297z()
            monitor-enter(r0)
            java.util.List r1 = p260o0.C7971l.m17317f()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L37
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L20
            java.util.List r1 = p260o0.C7971l.m17317f()     // Catch: java.lang.Throwable -> L37
            java.util.List r1 = p489zc.C13777q.m221p0(r1)     // Catch: java.lang.Throwable -> L37
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 != 0) goto L25
            r3 = r2
            goto L32
        L25:
            java.lang.Object r3 = p489zc.C13777q.m236g0(r1)     // Catch: java.lang.Throwable -> L37
            id.l r3 = (id.InterfaceC6108l) r3     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L32
            o0.a$a r3 = new o0.a$a     // Catch: java.lang.Throwable -> L37
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
        L32:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p260o0.Snapshot.<init>(int, o0.j):void");
    }

    /* renamed from: F */
    public C7952c m17492F(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        return (C7952c) C7971l.m17304s(new C7948b(interfaceC6108l, interfaceC6108l2));
    }

    /* renamed from: H */
    public Void m17488j(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: I */
    public Void m17487k(AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        C7989u.m17238b();
        throw new ExceptionsH();
    }

    /* renamed from: b */
    public void m17489b() {
    }

    /* renamed from: l */
    public void m17486l() {
        C7971l.m17321b();
    }

    /* renamed from: r */
    public AbstractC7961h m17485r(InterfaceC6108l interfaceC6108l) {
        return C7971l.m17304s(new C7949c(interfaceC6108l));
    }

    /* renamed from: v */
    public AbstractC7965i m17484v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }
}
