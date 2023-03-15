package p022b0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p036c0.C1963e;
import p036c0.C1973h;
import p036c0.C1979l;
import p036c0.InterfaceC1961b;
import p036c0.InterfaceC1962d;
import p036c0.InterfaceC1965f;
import p036c0.InterfaceC1972g;
import p036c0.MultiWidgetSelectionDelegate;
import p092f0.InterfaceC5269z0;
import p093f1.C5293i0;
import p093f1.InterfaceC5276c0;
import p093f1.PointerIcon;
import p127h1.AlignmentLine;
import p127h1.C5767g;
import p127h1.C5811y;
import p127h1.InterfaceC5776j;
import p127h1.InterfaceC5803r;
import p127h1.InterfaceC5804s;
import p127h1.InterfaceC5805t;
import p127h1.LayoutCoordinates;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p286p1.C8392u;
import p302q0.InterfaceC9570f;
import p346s0.C10026f;
import p373u0.C10774f;
import p373u0.Rect;
import p393v0.C11015f0;
import p433x0.DrawScope;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13191r;
import p468yc.C13195u;
import p479z1.C13601c;
import p479z1.C13612k;
import p479z1.C13614l;
import p479z1.C13615m;
import p489zc.C13769l0;

/* compiled from: CoreText.kt */
/* renamed from: b0.d */
/* loaded from: classes.dex */
public final class C1773d implements InterfaceC5269z0 {

    /* renamed from: A */
    private final InterfaceC9570f f5433A;

    /* renamed from: B */
    private InterfaceC9570f f5434B;

    /* renamed from: w */
    private final C1789i f5435w;

    /* renamed from: x */
    private InterfaceC1972g f5436x;

    /* renamed from: y */
    public InterfaceC1787f f5437y;

    /* renamed from: z */
    private final InterfaceC5804s f5438z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$a */
    /* loaded from: classes.dex */
    public static final class C1774a extends AbstractC6438m implements InterfaceC6108l {
        C1774a() {
            super(1);
        }

        /* renamed from: a */
        public final void m35396a(InterfaceC5776j interfaceC5776j) {
            InterfaceC1972g m35406c;
            Intrinsics.isThisObjectNull(interfaceC5776j, "it");
            C1773d.this.m35400j().m35356h(interfaceC5776j);
            if (C1973h.m34999b(C1773d.m35406c(C1773d.this), C1773d.this.m35400j().m35358f())) {
                long m23090e = LayoutCoordinates.m23090e(interfaceC5776j);
                if (!C10774f.m7147i(m23090e, C1773d.this.m35400j().m35360d()) && (m35406c = C1773d.m35406c(C1773d.this)) != null) {
                    m35406c.m35004g(C1773d.this.m35400j().m35358f());
                }
                C1773d.this.m35400j().m35353k(m23090e);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35396a((InterfaceC5776j) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$b */
    /* loaded from: classes.dex */
    public static final class C1775b extends AbstractC6438m implements InterfaceC6108l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoreText.kt */
        /* renamed from: b0.d$b$a */
        /* loaded from: classes.dex */
        public static final class C1776a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ C1773d f5441w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1776a(C1773d c1773d) {
                super(1);
                this.f5441w = c1773d;
            }

            /* renamed from: a */
            public final Boolean mo9587d(List list) {
                boolean z;
                Intrinsics.isThisObjectNull(list, "it");
                if (this.f5441w.m35400j().m35362b() != null) {
                    C8392u m35362b = this.f5441w.m35400j().m35362b();
                    Intrinsics.ifNullDoSomething(m35362b);
                    list.add(m35362b);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        C1775b() {
            super(1);
        }

        /* renamed from: a */
        public final void m35395a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
            C7617t.m17916v(interfaceC7621v, C1773d.this.m35400j().m35357g().m35375g());
            C7617t.m17932f(interfaceC7621v, null, new C1776a(C1773d.this), 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35395a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$c */
    /* loaded from: classes.dex */
    public static final class C1777c extends AbstractC6438m implements InterfaceC6108l {
        C1777c() {
            super(1);
        }

        /* renamed from: a */
        public final void m35393a(DrawScope drawScope) {
            Map<Long, C1963e> m35006e;
            Intrinsics.isThisObjectNull(drawScope, "$this$drawBehind");
            C8392u m35362b = C1773d.this.m35400j().m35362b();
            if (m35362b == null) {
                return;
            }
            C1773d c1773d = C1773d.this;
            InterfaceC1972g m35406c = C1773d.m35406c(c1773d);
            C1963e c1963e = (m35406c == null || (m35006e = m35406c.m35006e()) == null) ? null : m35006e.get(Long.valueOf(c1773d.m35400j().m35358f()));
            if (c1963e != null) {
                if (!c1963e.m35016b()) {
                    c1963e.m35015c();
                    throw null;
                } else {
                    c1963e.m35017a();
                    throw null;
                }
            }
            TextDelegate.f5460k.m35371a(drawScope.m3272B().mo3275b(), m35362b);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35393a((DrawScope) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$d */
    /* loaded from: classes.dex */
    public static final class C1778d implements InterfaceC5804s {

        /* compiled from: CoreText.kt */
        /* renamed from: b0.d$d$a */
        /* loaded from: classes.dex */
        static final class C1779a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ List f5444w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1779a(List list) {
                super(1);
                this.f5444w = list;
            }

            /* renamed from: a */
            public final void m35392a(Placeable.AbstractC5751a abstractC5751a) {
                Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
                List list = this.f5444w;
                int size = list.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    C13182l c13182l = (C13182l) list.get(i);
                    Placeable.AbstractC5751a.m23157p(abstractC5751a, (Placeable) c13182l.m1460c(), ((C13612k) c13182l.m1459d()).m835l(), 0.0f, 2, null);
                    i = i2;
                }
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m35392a((Placeable.AbstractC5751a) obj);
                return C13195u.f34156a;
            }
        }

        C1778d() {
        }

        /* renamed from: a */
        public InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
            int m19530c;
            int m19530c2;
            Map m331h;
            int i;
            int m19530c3;
            int m19530c4;
            C13182l c13182l;
            InterfaceC1972g m35406c;
            Intrinsics.isThisObjectNull(measureScope, "$receiver");
            Intrinsics.isThisObjectNull(list, "measurables");
            C8392u m35374h = C1773d.this.m35400j().m35357g().m35374h(j, measureScope.getLayoutDirection(), C1773d.this.m35400j().m35362b());
            if (!Intrinsics.equals(C1773d.this.m35400j().m35362b(), m35374h)) {
                C1773d.this.m35400j().m35361c().mo9587d(m35374h);
                C8392u m35362b = C1773d.this.m35400j().m35362b();
                if (m35362b != null) {
                    C1773d c1773d = C1773d.this;
                    if (!Intrinsics.equals(m35362b.m15558h().m15566l(), m35374h.m15558h().m15566l()) && (m35406c = C1773d.m35406c(c1773d)) != null) {
                        m35406c.m35009b(c1773d.m35400j().m35358f());
                    }
                }
            }
            C1773d.this.m35400j().m35355i(m35374h);
            if (list.size() >= m35374h.m15547s().size()) {
                List m15547s = m35374h.m15547s();
                ArrayList arrayList = new ArrayList(m15547s.size());
                int size = m15547s.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    Rect rect = (Rect) m15547s.get(i2);
                    if (rect == null) {
                        c13182l = null;
                        i = size;
                    } else {
                        i = size;
                        Placeable mo23007n = ((InterfaceC5803r) list.get(i2)).mo23007n(C13601c.m906b(0, (int) Math.floor(rect.m7120k()), 0, (int) Math.floor(rect.m7126e()), 5, null));
                        m19530c3 = C7037c.m19530c(rect.m7125f());
                        m19530c4 = C7037c.m19530c(rect.m7122i());
                        c13182l = new C13182l(mo23007n, C13612k.m845b(C13614l.m833a(m19530c3, m19530c4)));
                    }
                    if (c13182l != null) {
                        arrayList.add(c13182l);
                    }
                    i2 = i3;
                    size = i;
                }
                int m824g = C13615m.m824g(m35374h.m15546t());
                int m825f = C13615m.m825f(m35374h.m15546t());
                C5767g m23198a = AlignmentLine.m23198a();
                m19530c = C7037c.m19530c(m35374h.m15561e());
                C5767g m23197b = AlignmentLine.m23197b();
                m19530c2 = C7037c.m19530c(m35374h.m15559g());
                m331h = C13769l0.m331h(C13191r.m1447a(m23198a, Integer.valueOf(m19530c)), C13191r.m1447a(m23197b, Integer.valueOf(m19530c2)));
                return measureScope.m23001s(m824g, m825f, m331h, new C1779a(arrayList));
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$e */
    /* loaded from: classes.dex */
    static final class C1780e extends AbstractC6438m implements InterfaceC6097a {
        C1780e() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC5776j mo42214q() {
            return C1773d.this.m35400j().m35363a();
        }
    }

    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$f */
    /* loaded from: classes.dex */
    static final class C1781f extends AbstractC6438m implements InterfaceC6097a {
        C1781f() {
            super(0);
        }

        /* renamed from: a */
        public final C8392u mo42214q() {
            return C1773d.this.m35400j().m35362b();
        }
    }

    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$g */
    /* loaded from: classes.dex */
    public static final class C1782g implements InterfaceC1787f {

        /* renamed from: a */
        private long f5447a;

        /* renamed from: b */
        private long f5448b;

        /* renamed from: d */
        final /* synthetic */ InterfaceC1972g f5450d;

        C1782g(InterfaceC1972g interfaceC1972g) {
            this.f5450d = interfaceC1972g;
            C10774f.C10775a c10775a = C10774f.f27866b;
            this.f5447a = c10775a.m7134c();
            this.f5448b = c10775a.m7134c();
        }

        /* renamed from: a */
        public void mo35370a() {
            if (C1973h.m34999b(this.f5450d, C1773d.this.m35400j().m35358f())) {
                this.f5450d.m35007d();
            }
        }

        /* renamed from: b */
        public void mo35369b() {
            if (C1973h.m34999b(this.f5450d, C1773d.this.m35400j().m35358f())) {
                this.f5450d.m35007d();
            }
        }

        /* renamed from: c */
        public void mo35368c(long j) {
            InterfaceC5776j m35363a = C1773d.this.m35400j().m35363a();
            if (m35363a != null) {
                C1773d c1773d = C1773d.this;
                InterfaceC1972g interfaceC1972g = this.f5450d;
                if (!m35363a.mo23109S()) {
                    return;
                }
                if (C1773d.m35405d(c1773d, j, j)) {
                    interfaceC1972g.m35001j(c1773d.m35400j().m35358f());
                } else {
                    interfaceC1972g.m35002i(m35363a, j, InterfaceC1965f.f5780a.m35011d());
                }
                m35386h(j);
            }
            if (C1973h.m34999b(this.f5450d, C1773d.this.m35400j().m35358f())) {
                this.f5448b = C10774f.f27866b.m7134c();
            }
        }

        /* renamed from: d */
        public void mo35367d(long j) {
            InterfaceC5776j m35363a = C1773d.this.m35400j().m35363a();
            if (m35363a == null) {
                return;
            }
            InterfaceC1972g interfaceC1972g = this.f5450d;
            C1773d c1773d = C1773d.this;
            if (m35363a.mo23109S() && C1973h.m34999b(interfaceC1972g, c1773d.m35400j().m35358f())) {
                m35387g(C10774f.m7140p(m35389e(), j));
                long m7140p = C10774f.m7140p(m35388f(), m35389e());
                if (C1773d.m35405d(c1773d, m35388f(), m7140p) || !interfaceC1972g.m35003h(m35363a, m7140p, m35388f(), false, InterfaceC1965f.f5780a.m35014a())) {
                    return;
                }
                m35386h(m7140p);
                m35387g(C10774f.f27866b.m7134c());
            }
        }

        /* renamed from: e */
        public final long m35389e() {
            return this.f5448b;
        }

        /* renamed from: f */
        public final long m35388f() {
            return this.f5447a;
        }

        /* renamed from: g */
        public final void m35387g(long j) {
            this.f5448b = j;
        }

        /* renamed from: h */
        public final void m35386h(long j) {
            this.f5447a = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreText.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.text.TextController$update$2", m20196f = "CoreText.kt", m20195l = {179}, m20194m = "invokeSuspend")
    /* renamed from: b0.d$h */
    /* loaded from: classes.dex */
    public static final class C1783h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f5451x;

        /* renamed from: y */
        private /* synthetic */ Object f5452y;

        C1783h(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C1783h c1783h = new C1783h(interfaceC1886d);
            c1783h.f5452y = obj;
            return c1783h;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
            return ((C1783h) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f5451x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC1787f m35403g = C1773d.this.m35403g();
                this.f5451x = 1;
                if (LongPressTextDragObserver.m35411a((InterfaceC5276c0) this.f5452y, m35403g, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoreText.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.text.TextController$update$3", m20196f = "CoreText.kt", m20195l = {270}, m20194m = "invokeSuspend")
    /* renamed from: b0.d$i */
    /* loaded from: classes.dex */
    public static final class C1784i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f5454x;

        /* renamed from: y */
        private /* synthetic */ Object f5455y;

        /* renamed from: z */
        final /* synthetic */ C1785j f5456z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1784i(C1785j c1785j, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f5456z = c1785j;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C1784i c1784i = new C1784i(this.f5456z, interfaceC1886d);
            c1784i.f5455y = obj;
            return c1784i;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
            return ((C1784i) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f5454x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C1785j c1785j = this.f5456z;
                this.f5454x = 1;
                if (C1979l.m34989c((InterfaceC5276c0) this.f5455y, c1785j, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: CoreText.kt */
    /* renamed from: b0.d$j */
    /* loaded from: classes.dex */
    public static final class C1785j implements InterfaceC1961b {

        /* renamed from: a */
        private long f5457a = C10774f.f27866b.m7134c();

        /* renamed from: c */
        final /* synthetic */ InterfaceC1972g f5459c;

        C1785j(InterfaceC1972g interfaceC1972g) {
            this.f5459c = interfaceC1972g;
        }

        /* renamed from: a */
        public boolean mo35021a(long j, InterfaceC1965f interfaceC1965f) {
            Intrinsics.isThisObjectNull(interfaceC1965f, "adjustment");
            InterfaceC5776j m35363a = C1773d.this.m35400j().m35363a();
            if (m35363a == null) {
                return false;
            }
            InterfaceC1972g interfaceC1972g = this.f5459c;
            C1773d c1773d = C1773d.this;
            if (m35363a.mo23109S()) {
                interfaceC1972g.m35002i(m35363a, j, interfaceC1965f);
                m35382f(j);
                return C1973h.m34999b(interfaceC1972g, c1773d.m35400j().m35358f());
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo35020b(long j) {
            InterfaceC5776j m35363a = C1773d.this.m35400j().m35363a();
            if (m35363a == null) {
                return true;
            }
            InterfaceC1972g interfaceC1972g = this.f5459c;
            C1773d c1773d = C1773d.this;
            if (m35363a.mo23109S() && C1973h.m34999b(interfaceC1972g, c1773d.m35400j().m35358f())) {
                if (interfaceC1972g.m35003h(m35363a, j, m35383e(), false, InterfaceC1965f.f5780a.m35013b())) {
                    m35382f(j);
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo35019c(long j, InterfaceC1965f interfaceC1965f) {
            Intrinsics.isThisObjectNull(interfaceC1965f, "adjustment");
            InterfaceC5776j m35363a = C1773d.this.m35400j().m35363a();
            if (m35363a != null) {
                InterfaceC1972g interfaceC1972g = this.f5459c;
                C1773d c1773d = C1773d.this;
                if (!m35363a.mo23109S() || !C1973h.m34999b(interfaceC1972g, c1773d.m35400j().m35358f())) {
                    return false;
                }
                if (interfaceC1972g.m35003h(m35363a, j, m35383e(), false, interfaceC1965f)) {
                    m35382f(j);
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo35018d(long j) {
            InterfaceC5776j m35363a = C1773d.this.m35400j().m35363a();
            if (m35363a == null) {
                return false;
            }
            InterfaceC1972g interfaceC1972g = this.f5459c;
            C1773d c1773d = C1773d.this;
            if (m35363a.mo23109S()) {
                if (interfaceC1972g.m35003h(m35363a, j, m35383e(), false, InterfaceC1965f.f5780a.m35013b())) {
                    m35382f(j);
                }
                return C1973h.m34999b(interfaceC1972g, c1773d.m35400j().m35358f());
            }
            return false;
        }

        /* renamed from: e */
        public final long m35383e() {
            return this.f5457a;
        }

        /* renamed from: f */
        public final void m35382f(long j) {
            this.f5457a = j;
        }
    }

    public C1773d(C1789i c1789i) {
        Intrinsics.isThisObjectNull(c1789i, "state");
        this.f5435w = c1789i;
        this.f5438z = new C1778d();
        InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
        this.f5433A = C7600o.m18015b(C5811y.m22982a(m35404f(c9571a), new C1774a()), false, new C1775b(), 1, null);
        this.f5434B = c9571a;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC1972g m35406c(C1773d c1773d) {
        return c1773d.f5436x;
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m35405d(C1773d c1773d, long j, long j2) {
        return c1773d.m35399k(j, j2);
    }

    /* renamed from: f */
    private final InterfaceC9570f m35404f(InterfaceC9570f interfaceC9570f) {
        return C10026f.m9372a(C11015f0.m6528c(interfaceC9570f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 16383, null), new C1777c());
    }

    /* renamed from: k */
    private final boolean m35399k(long j, long j2) {
        C8392u m35362b = this.f5435w.m35362b();
        if (m35362b == null) {
            return false;
        }
        int length = m35362b.m15558h().m15566l().m15771f().length();
        int m15549q = m35362b.m15549q(j);
        int m15549q2 = m35362b.m15549q(j2);
        int i = length - 1;
        return (m15549q >= i && m15549q2 >= i) || (m15549q < 0 && m15549q2 < 0);
    }

    /* renamed from: a */
    public void mo24845a() {
        InterfaceC1972g interfaceC1972g = this.f5436x;
        if (interfaceC1972g == null) {
            return;
        }
        m35400j().m35352l(interfaceC1972g.m35008c(new MultiWidgetSelectionDelegate(m35400j().m35358f(), new C1780e(), new C1781f())));
    }

    /* renamed from: b */
    public void mo24844b() {
        InterfaceC1972g interfaceC1972g;
        InterfaceC1962d m35359e = this.f5435w.m35359e();
        if (m35359e == null || (interfaceC1972g = this.f5436x) == null) {
            return;
        }
        interfaceC1972g.m35010a(m35359e);
    }

    /* renamed from: e */
    public void mo24843e() {
        InterfaceC1972g interfaceC1972g;
        InterfaceC1962d m35359e = this.f5435w.m35359e();
        if (m35359e == null || (interfaceC1972g = this.f5436x) == null) {
            return;
        }
        interfaceC1972g.m35010a(m35359e);
    }

    /* renamed from: g */
    public final InterfaceC1787f m35403g() {
        InterfaceC1787f interfaceC1787f = this.f5437y;
        if (interfaceC1787f != null) {
            return interfaceC1787f;
        }
        Intrinsics.throwUninitPropException("longPressDragObserver");
        return null;
    }

    /* renamed from: h */
    public final InterfaceC5804s m35402h() {
        return this.f5438z;
    }

    /* renamed from: i */
    public final InterfaceC9570f m35401i() {
        return this.f5433A.mo7205u(this.f5434B);
    }

    /* renamed from: j */
    public final C1789i m35400j() {
        return this.f5435w;
    }

    /* renamed from: l */
    public final void m35398l(InterfaceC1787f interfaceC1787f) {
        Intrinsics.isThisObjectNull(interfaceC1787f, "<set-?>");
        this.f5437y = interfaceC1787f;
    }

    /* renamed from: m */
    public final void m35397m(InterfaceC1972g interfaceC1972g) {
        InterfaceC9570f interfaceC9570f;
        this.f5436x = interfaceC1972g;
        if (interfaceC1972g != null) {
            if (C1791j.m35348a()) {
                m35398l(new C1782g(interfaceC1972g));
                interfaceC9570f = C5293i0.m24739b(InterfaceC9570f.f25164r, m35403g(), new C1783h(null));
            } else {
                C1785j c1785j = new C1785j(interfaceC1972g);
                interfaceC9570f = PointerIcon.m24672b(C5293i0.m24739b(InterfaceC9570f.f25164r, c1785j, new C1784i(c1785j, null)), C1788h.m35364a(), false, 2, null);
            }
        } else {
            interfaceC9570f = InterfaceC9570f.f25164r;
        }
        this.f5434B = interfaceC9570f;
    }
}
