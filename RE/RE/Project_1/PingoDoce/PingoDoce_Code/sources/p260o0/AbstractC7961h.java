package p260o0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: Snapshot.kt */
/* renamed from: o0.h */
/* loaded from: classes.dex */
public abstract class AbstractC7961h {

    /* renamed from: d */
    public static final C7962a f20646d = new C7962a(null);

    /* renamed from: a */
    private SnapshotIdSet f20647a;

    /* renamed from: b */
    private int f20648b;

    /* renamed from: c */
    private boolean f20649c;

    /* compiled from: Snapshot.kt */
    /* renamed from: o0.h$a */
    /* loaded from: classes.dex */
    public static final class C7962a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snapshot.kt */
        /* renamed from: o0.h$a$a */
        /* loaded from: classes.dex */
        public static final class C7963a implements InterfaceC7959f {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6112p f20650a;

            C7963a(InterfaceC6112p interfaceC6112p) {
                this.f20650a = interfaceC6112p;
            }

            /* renamed from: b */
            public final void mo17397b() {
                InterfaceC6112p interfaceC6112p = this.f20650a;
                synchronized (C7971l.m17297z()) {
                    C7971l.m17320c().remove(interfaceC6112p);
                    C13195u c13195u = C13195u.f34156a;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Snapshot.kt */
        /* renamed from: o0.h$a$b */
        /* loaded from: classes.dex */
        public static final class C7964b implements InterfaceC7959f {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6108l f20651a;

            C7964b(InterfaceC6108l interfaceC6108l) {
                this.f20651a = interfaceC6108l;
            }

            /* renamed from: b */
            public final void mo17397b() {
                InterfaceC6108l interfaceC6108l = this.f20651a;
                synchronized (C7971l.m17297z()) {
                    C7971l.m17317f().remove(interfaceC6108l);
                }
                C7971l.m17321b();
            }
        }

        private C7962a() {
        }

        public /* synthetic */ C7962a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7961h m17368a() {
            return C7971l.m17298y();
        }

        /* renamed from: b */
        public final void m17367b() {
            C7971l.m17298y().m17376l();
        }

        /* renamed from: c */
        public final Object m17366c(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2, InterfaceC6097a interfaceC6097a) {
            AbstractC7961h c7958e0;
            Intrinsics.isThisObjectNull(interfaceC6097a, "block");
            if (interfaceC6108l == null && interfaceC6108l2 == null) {
                return interfaceC6097a.mo42214q();
            }
            AbstractC7961h abstractC7961h = (AbstractC7961h) C7971l.m17314i().m24956a();
            if (abstractC7961h == null || (abstractC7961h instanceof C7952c)) {
                c7958e0 = new C7958e0(abstractC7961h instanceof C7952c ? (C7952c) abstractC7961h : null, interfaceC6108l, interfaceC6108l2);
            } else if (interfaceC6108l == null) {
                return interfaceC6097a.mo42214q();
            } else {
                c7958e0 = abstractC7961h.m17370r(interfaceC6108l);
            }
            try {
                AbstractC7961h m17379i = c7958e0.m17379i();
                Object mo42214q = interfaceC6097a.mo42214q();
                c7958e0.m17374n(m17379i);
                return mo42214q;
            } finally {
                c7958e0.m17386b();
            }
        }

        /* renamed from: d */
        public final InterfaceC7959f m17365d(InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "observer");
            C7971l.m17322a(C7971l.m17318e());
            synchronized (C7971l.m17297z()) {
                C7971l.m17320c().add(interfaceC6112p);
            }
            return new C7963a(interfaceC6112p);
        }

        /* renamed from: e */
        public final InterfaceC7959f m17364e(InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(interfaceC6108l, "observer");
            synchronized (C7971l.m17297z()) {
                C7971l.m17317f().add(interfaceC6108l);
            }
            C7971l.m17321b();
            return new C7964b(interfaceC6108l);
        }

        /* renamed from: f */
        public final void m17363f() {
            Set m17450x;
            boolean z;
            synchronized (C7971l.m17297z()) {
                z = false;
                if (((Snapshot) C7971l.m17319d().get()).m17450x() != null) {
                    if (!m17450x.isEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                C7971l.m17321b();
            }
        }

        /* renamed from: g */
        public final C7952c m17362g(InterfaceC6108l interfaceC6108l, InterfaceC6108l interfaceC6108l2) {
            AbstractC7961h m17298y = C7971l.m17298y();
            C7952c c7952c = m17298y instanceof C7952c ? (C7952c) m17298y : null;
            C7952c m17466F = c7952c != null ? c7952c.m17466F(interfaceC6108l, interfaceC6108l2) : null;
            if (m17466F != null) {
                return m17466F;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        /* renamed from: h */
        public final AbstractC7961h m17361h(InterfaceC6108l interfaceC6108l) {
            return C7971l.m17298y().m17370r(interfaceC6108l);
        }
    }

    private AbstractC7961h(int i, SnapshotIdSet snapshotIdSet) {
        this.f20647a = snapshotIdSet;
        this.f20648b = i;
    }

    public /* synthetic */ AbstractC7961h(int i, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    /* renamed from: a */
    public void m17387a() {
        synchronized (C7971l.m17297z()) {
            C7971l.m17306q(C7971l.m17315h().m17352q(m17384d()));
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: b */
    public void m17386b() {
        this.f20649c = true;
    }

    /* renamed from: c */
    public final boolean m17385c() {
        return this.f20649c;
    }

    /* renamed from: d */
    public int m17384d() {
        return this.f20648b;
    }

    /* renamed from: e */
    public SnapshotIdSet m17383e() {
        return this.f20647a;
    }

    /* renamed from: f */
    public abstract InterfaceC6108l m17382f();

    /* renamed from: g */
    public abstract boolean m17381g();

    /* renamed from: h */
    public abstract InterfaceC6108l m17380h();

    /* renamed from: i */
    public AbstractC7961h m17379i() {
        AbstractC7961h abstractC7961h = (AbstractC7961h) C7971l.m17314i().m24956a();
        C7971l.m17314i().m24955b(this);
        return abstractC7961h;
    }

    /* renamed from: j */
    public abstract void m17378j(AbstractC7961h abstractC7961h);

    /* renamed from: k */
    public abstract void m17377k(AbstractC7961h abstractC7961h);

    /* renamed from: l */
    public abstract void m17376l();

    /* renamed from: m */
    public abstract void m17375m(InterfaceC7950b0 interfaceC7950b0);

    /* renamed from: n */
    public void m17374n(AbstractC7961h abstractC7961h) {
        C7971l.m17314i().m24955b(abstractC7961h);
    }

    /* renamed from: o */
    public final void m17373o(boolean z) {
        this.f20649c = z;
    }

    /* renamed from: p */
    public void m17372p(int i) {
        this.f20648b = i;
    }

    /* renamed from: q */
    public void m17371q(SnapshotIdSet snapshotIdSet) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "<set-?>");
        this.f20647a = snapshotIdSet;
    }

    /* renamed from: r */
    public abstract AbstractC7961h m17370r(InterfaceC6108l interfaceC6108l);

    /* renamed from: s */
    public final void m17369s() {
        if (!(!this.f20649c)) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
        }
    }
}
