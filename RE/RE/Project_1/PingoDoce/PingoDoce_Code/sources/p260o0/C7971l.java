package p260o0;

import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.ExceptionsH;
import p092f0.C5235p1;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.SnapshotIdSet;
import p468yc.C13195u;
import p489zc._Collections;

/* compiled from: Snapshot.kt */
/* renamed from: o0.l */
/* loaded from: classes.dex */
public final class C7971l {

    /* renamed from: a */
    private static final InterfaceC6108l f20665a = C7973b.f20675w;

    /* renamed from: b */
    private static final C5235p1 f20666b = new C5235p1();

    /* renamed from: c */
    private static final Object f20667c = new Object();

    /* renamed from: d */
    private static SnapshotIdSet f20668d;

    /* renamed from: e */
    private static int f20669e;

    /* renamed from: f */
    private static final List f20670f;

    /* renamed from: g */
    private static final List f20671g;

    /* renamed from: h */
    private static final AtomicReference f20672h;

    /* renamed from: i */
    private static final AbstractC7961h f20673i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    /* renamed from: o0.l$a */
    /* loaded from: classes.dex */
    public static final class C7972a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7972a f20674w = new C7972a();

        C7972a() {
            super(1);
        }

        /* renamed from: a */
        public final void m17296a(SnapshotIdSet snapshotIdSet) {
            Intrinsics.isThisObjectNull(snapshotIdSet, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17296a((SnapshotIdSet) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* renamed from: o0.l$b */
    /* loaded from: classes.dex */
    static final class C7973b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C7973b f20675w = new C7973b();

        C7973b() {
            super(1);
        }

        /* renamed from: a */
        public final void m17295a(SnapshotIdSet snapshotIdSet) {
            Intrinsics.isThisObjectNull(snapshotIdSet, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17295a((SnapshotIdSet) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    /* renamed from: o0.l$c */
    /* loaded from: classes.dex */
    public static final class C7974c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f20676w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f20677x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7974c(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            super(1);
            this.f20676w = interfaceC6108l;
            this.f20677x = interfaceC6108l2;
        }

        /* renamed from: a */
        public final void m17294a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "state");
            this.f20676w.mo9587d(obj);
            this.f20677x.mo9587d(obj);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17294a(obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    /* renamed from: o0.l$d */
    /* loaded from: classes.dex */
    public static final class C7975d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f20678w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f20679x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7975d(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            super(1);
            this.f20678w = interfaceC6108l;
            this.f20679x = interfaceC6108l2;
        }

        /* renamed from: a */
        public final void m17293a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "state");
            this.f20678w.mo9587d(obj);
            this.f20679x.mo9587d(obj);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17293a(obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    /* renamed from: o0.l$e */
    /* loaded from: classes.dex */
    public static final class C7976e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f20680w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7976e(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f20680w = interfaceC6108l;
        }

        /* renamed from: a */
        public final AbstractC7961h mo9587d(SnapshotIdSet snapshotIdSet) {
            Intrinsics.isThisObjectNull(snapshotIdSet, "invalid");
            AbstractC7961h abstractC7961h = (AbstractC7961h) this.f20680w.mo9587d(snapshotIdSet);
            synchronized (C7971l.m17297z()) {
                C7971l.m17306q(C7971l.m17315h().m17348x(abstractC7961h.m17384d()));
                C13195u c13195u = C13195u.f34156a;
            }
            return abstractC7961h;
        }
    }

    static {
        SnapshotIdSet.C7968a c7968a = SnapshotIdSet.f20653A;
        f20668d = c7968a.m17347a();
        f20669e = 1;
        f20670f = new ArrayList();
        f20671g = new ArrayList();
        int i = f20669e;
        f20669e = i + 1;
        Snapshot snapshot = new Snapshot(i, c7968a.m17347a());
        f20668d = f20668d.m17348x(snapshot.m17384d());
        AtomicReference atomicReference = new AtomicReference(snapshot);
        f20672h = atomicReference;
        Object obj = atomicReference.get();
        Intrinsics.checkIfNull(obj, "currentGlobalSnapshot.get()");
        f20673i = (AbstractC7961h) obj;
    }

    /* renamed from: A */
    public static final AbstractC7961h m17342A() {
        return f20673i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final InterfaceC6108l m17341B(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        if (interfaceC6108l == null || interfaceC6108l2 == null || Intrinsics.equals(interfaceC6108l, interfaceC6108l2)) {
            return interfaceC6108l == null ? interfaceC6108l2 : interfaceC6108l;
        }
        return new C7974c(interfaceC6108l, interfaceC6108l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final InterfaceC6108l m17340C(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        if (interfaceC6108l == null || interfaceC6108l2 == null || Intrinsics.equals(interfaceC6108l, interfaceC6108l2)) {
            return interfaceC6108l == null ? interfaceC6108l2 : interfaceC6108l;
        }
        return new C7975d(interfaceC6108l, interfaceC6108l2);
    }

    /* renamed from: D */
    public static final AbstractC7953c0 m17339D(AbstractC7953c0 abstractC7953c0, InterfaceC7950b0 interfaceC7950b0, AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "<this>");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        AbstractC7953c0 m17327P = m17327P(interfaceC7950b0, abstractC7961h.m17384d(), f20668d);
        if (m17327P == null) {
            m17327P = null;
        } else {
            m17327P.m17442f(Reader.READ_DONE);
        }
        if (m17327P == null) {
            AbstractC7953c0 mo17446b = abstractC7953c0.mo17446b();
            mo17446b.m17442f(Reader.READ_DONE);
            mo17446b.m17443e(interfaceC7950b0.m17475b());
            interfaceC7950b0.m17474f(mo17446b);
            return mo17446b;
        }
        return m17327P;
    }

    /* renamed from: E */
    public static final AbstractC7953c0 m17338E(AbstractC7953c0 abstractC7953c0, InterfaceC7950b0 interfaceC7950b0, AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "<this>");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        AbstractC7953c0 m17339D = m17339D(abstractC7953c0, interfaceC7950b0, abstractC7961h);
        m17339D.mo17447a(abstractC7953c0);
        m17339D.m17442f(abstractC7961h.m17384d());
        return m17339D;
    }

    /* renamed from: F */
    public static final void m17337F(AbstractC7961h abstractC7961h, InterfaceC7950b0 interfaceC7950b0) {
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        InterfaceC6108l m17380h = abstractC7961h.m17380h();
        if (m17380h == null) {
            return;
        }
        m17380h.mo9587d(interfaceC7950b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static final Map m17336G(C7952c c7952c, C7952c c7952c2, SnapshotIdSet snapshotIdSet) {
        AbstractC7953c0 m17333J;
        Set<InterfaceC7950b0> m17450x = c7952c2.m17450x();
        int m17384d = c7952c.m17384d();
        if (m17450x == null) {
            return null;
        }
        SnapshotIdSet m17349v = c7952c2.m17383e().m17348x(c7952c2.m17384d()).m17349v(c7952c2.m17449y());
        HashMap hashMap = null;
        for (InterfaceC7950b0 interfaceC7950b0 : m17450x) {
            AbstractC7953c0 m17475b = interfaceC7950b0.m17475b();
            AbstractC7953c0 m17333J2 = m17333J(m17475b, m17384d, snapshotIdSet);
            if (m17333J2 != null && (m17333J = m17333J(m17475b, m17384d, m17349v)) != null && !Intrinsics.equals(m17333J2, m17333J)) {
                AbstractC7953c0 m17333J3 = m17333J(m17475b, c7952c2.m17384d(), c7952c2.m17383e());
                if (m17333J3 != null) {
                    AbstractC7953c0 m17473h = interfaceC7950b0.m17473h(m17333J, m17333J2, m17333J3);
                    if (m17473h == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(m17333J2, m17473h);
                    hashMap = hashMap;
                } else {
                    m17334I();
                    throw new ExceptionsH();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: H */
    public static final AbstractC7953c0 m17335H(AbstractC7953c0 abstractC7953c0, InterfaceC7950b0 interfaceC7950b0, AbstractC7961h abstractC7961h, AbstractC7953c0 abstractC7953c02) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "<this>");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        Intrinsics.isThisObjectNull(abstractC7953c02, "candidate");
        if (abstractC7961h.m17381g()) {
            abstractC7961h.m17375m(interfaceC7950b0);
        }
        int m17384d = abstractC7961h.m17384d();
        if (abstractC7953c02.m17444d() == m17384d) {
            return abstractC7953c02;
        }
        AbstractC7953c0 m17339D = m17339D(abstractC7953c0, interfaceC7950b0, abstractC7961h);
        m17339D.m17442f(m17384d);
        abstractC7961h.m17375m(interfaceC7950b0);
        return m17339D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final Void m17334I() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final AbstractC7953c0 m17333J(AbstractC7953c0 abstractC7953c0, int i, SnapshotIdSet snapshotIdSet) {
        AbstractC7953c0 abstractC7953c02 = null;
        while (abstractC7953c0 != null) {
            if (m17325R(abstractC7953c0, i, snapshotIdSet) && (abstractC7953c02 == null || abstractC7953c02.m17444d() < abstractC7953c0.m17444d())) {
                abstractC7953c02 = abstractC7953c0;
            }
            abstractC7953c0 = abstractC7953c0.m17445c();
        }
        if (abstractC7953c02 != null) {
            return abstractC7953c02;
        }
        return null;
    }

    /* renamed from: K */
    public static final AbstractC7953c0 m17332K(AbstractC7953c0 abstractC7953c0, InterfaceC7950b0 interfaceC7950b0) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "<this>");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        return m17331L(abstractC7953c0, interfaceC7950b0, m17298y());
    }

    /* renamed from: L */
    public static final AbstractC7953c0 m17331L(AbstractC7953c0 abstractC7953c0, InterfaceC7950b0 interfaceC7950b0, AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "<this>");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        InterfaceC6108l m17382f = abstractC7961h.m17382f();
        if (m17382f != null) {
            m17382f.mo9587d(interfaceC7950b0);
        }
        AbstractC7953c0 m17333J = m17333J(abstractC7953c0, abstractC7961h.m17384d(), abstractC7961h.m17383e());
        if (m17333J != null) {
            return m17333J;
        }
        m17334I();
        throw new ExceptionsH();
    }

    /* renamed from: M */
    private static final Void m17330M() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final Object m17329N(AbstractC7961h abstractC7961h, InterfaceC6108l interfaceC6108l) {
        Object mo9587d = interfaceC6108l.mo9587d(f20668d.m17352q(abstractC7961h.m17384d()));
        synchronized (m17297z()) {
            int i = f20669e;
            f20669e = i + 1;
            f20668d = f20668d.m17352q(abstractC7961h.m17384d());
            f20672h.set(new Snapshot(i, f20668d));
            f20668d = f20668d.m17348x(i);
            C13195u c13195u = C13195u.f34156a;
        }
        return mo9587d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final AbstractC7961h m17328O(InterfaceC6108l interfaceC6108l) {
        return (AbstractC7961h) m17301v(new C7976e(interfaceC6108l));
    }

    /* renamed from: P */
    private static final AbstractC7953c0 m17327P(InterfaceC7950b0 interfaceC7950b0, int i, SnapshotIdSet snapshotIdSet) {
        int m17350u = snapshotIdSet.m17350u(i);
        AbstractC7953c0 abstractC7953c0 = null;
        for (AbstractC7953c0 m17475b = interfaceC7950b0.m17475b(); m17475b != null; m17475b = m17475b.m17445c()) {
            if (m17475b.m17444d() == 0) {
                return m17475b;
            }
            if (m17325R(m17475b, m17350u, snapshotIdSet)) {
                if (abstractC7953c0 != null) {
                    return m17475b.m17444d() < abstractC7953c0.m17444d() ? m17475b : abstractC7953c0;
                }
                abstractC7953c0 = m17475b;
            }
        }
        return null;
    }

    /* renamed from: Q */
    private static final boolean m17326Q(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return (i2 == 0 || i2 > i || snapshotIdSet.m17351t(i2)) ? false : true;
    }

    /* renamed from: R */
    private static final boolean m17325R(AbstractC7953c0 abstractC7953c0, int i, SnapshotIdSet snapshotIdSet) {
        return m17326Q(i, abstractC7953c0.m17444d(), snapshotIdSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m17324S(AbstractC7961h abstractC7961h) {
        if (!f20668d.m17351t(abstractC7961h.m17384d())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    /* renamed from: T */
    public static final AbstractC7953c0 m17323T(AbstractC7953c0 abstractC7953c0, InterfaceC7950b0 interfaceC7950b0, AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "<this>");
        Intrinsics.isThisObjectNull(interfaceC7950b0, "state");
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        if (abstractC7961h.m17381g()) {
            abstractC7961h.m17375m(interfaceC7950b0);
        }
        AbstractC7953c0 m17333J = m17333J(abstractC7953c0, abstractC7961h.m17384d(), abstractC7961h.m17383e());
        if (m17333J != null) {
            if (m17333J.m17444d() == abstractC7961h.m17384d()) {
                return m17333J;
            }
            AbstractC7953c0 m17338E = m17338E(m17333J, interfaceC7950b0, abstractC7961h);
            abstractC7961h.m17375m(interfaceC7950b0);
            return m17338E;
        }
        m17334I();
        throw new ExceptionsH();
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m17322a(InterfaceC6108l interfaceC6108l) {
        return m17301v(interfaceC6108l);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m17321b() {
        m17300w();
    }

    /* renamed from: c */
    public static final /* synthetic */ List m17320c() {
        return f20670f;
    }

    /* renamed from: d */
    public static final /* synthetic */ AtomicReference m17319d() {
        return f20672h;
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC6108l m17318e() {
        return f20665a;
    }

    /* renamed from: f */
    public static final /* synthetic */ List m17317f() {
        return f20671g;
    }

    /* renamed from: g */
    public static final /* synthetic */ int m17316g() {
        return f20669e;
    }

    /* renamed from: h */
    public static final /* synthetic */ SnapshotIdSet m17315h() {
        return f20668d;
    }

    /* renamed from: i */
    public static final /* synthetic */ C5235p1 m17314i() {
        return f20666b;
    }

    /* renamed from: j */
    public static final /* synthetic */ InterfaceC6108l m17313j(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        return m17341B(interfaceC6108l, interfaceC6108l2);
    }

    /* renamed from: k */
    public static final /* synthetic */ InterfaceC6108l m17312k(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
        return m17340C(interfaceC6108l, interfaceC6108l2);
    }

    /* renamed from: l */
    public static final /* synthetic */ Map m17311l(C7952c c7952c, C7952c c7952c2, SnapshotIdSet snapshotIdSet) {
        return m17336G(c7952c, c7952c2, snapshotIdSet);
    }

    /* renamed from: m */
    public static final /* synthetic */ Void m17310m() {
        return m17334I();
    }

    /* renamed from: n */
    public static final /* synthetic */ AbstractC7953c0 m17309n(AbstractC7953c0 abstractC7953c0, int i, SnapshotIdSet snapshotIdSet) {
        return m17333J(abstractC7953c0, i, snapshotIdSet);
    }

    /* renamed from: o */
    public static final /* synthetic */ Void m17308o() {
        return m17330M();
    }

    /* renamed from: p */
    public static final /* synthetic */ void m17307p(int i) {
        f20669e = i;
    }

    /* renamed from: q */
    public static final /* synthetic */ void m17306q(SnapshotIdSet snapshotIdSet) {
        f20668d = snapshotIdSet;
    }

    /* renamed from: r */
    public static final /* synthetic */ Object m17305r(AbstractC7961h abstractC7961h, InterfaceC6108l interfaceC6108l) {
        return m17329N(abstractC7961h, interfaceC6108l);
    }

    /* renamed from: s */
    public static final /* synthetic */ AbstractC7961h m17304s(InterfaceC6108l interfaceC6108l) {
        return m17328O(interfaceC6108l);
    }

    /* renamed from: t */
    public static final /* synthetic */ void m17303t(AbstractC7961h abstractC7961h) {
        m17324S(abstractC7961h);
    }

    /* renamed from: u */
    public static final SnapshotIdSet m17302u(SnapshotIdSet snapshotIdSet, int i, int i2) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.m17348x(i);
            i++;
        }
        return snapshotIdSet;
    }

    /* renamed from: v */
    private static final Object m17301v(InterfaceC6108l interfaceC6108l) {
        Object m17329N;
        List m453p0;
        Snapshot snapshot = (Snapshot) f20672h.get();
        synchronized (m17297z()) {
            Intrinsics.checkIfNull(snapshot, "previousGlobalSnapshot");
            m17329N = m17329N(snapshot, interfaceC6108l);
        }
        Set m17450x = snapshot.m17450x();
        if (m17450x != null) {
            synchronized (m17297z()) {
                m453p0 = _Collections.m453p0(f20670f);
            }
            int size = m453p0.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC6112p) m453p0.get(i)).mo39856d(m17450x, snapshot);
            }
        }
        return m17329N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m17300w() {
        m17301v(C7972a.f20674w);
    }

    /* renamed from: x */
    public static final AbstractC7953c0 m17299x(AbstractC7953c0 abstractC7953c0, AbstractC7961h abstractC7961h) {
        Intrinsics.isThisObjectNull(abstractC7953c0, "r");
        Intrinsics.isThisObjectNull(abstractC7961h, "snapshot");
        AbstractC7953c0 m17333J = m17333J(abstractC7953c0, abstractC7961h.m17384d(), abstractC7961h.m17383e());
        if (m17333J != null) {
            return m17333J;
        }
        m17334I();
        throw new ExceptionsH();
    }

    /* renamed from: y */
    public static final AbstractC7961h m17298y() {
        AbstractC7961h abstractC7961h = (AbstractC7961h) f20666b.m24956a();
        if (abstractC7961h == null) {
            Object obj = f20672h.get();
            Intrinsics.checkIfNull(obj, "currentGlobalSnapshot.get()");
            return (AbstractC7961h) obj;
        }
        return abstractC7961h;
    }

    /* renamed from: z */
    public static final Object m17297z() {
        return f20667c;
    }
}
