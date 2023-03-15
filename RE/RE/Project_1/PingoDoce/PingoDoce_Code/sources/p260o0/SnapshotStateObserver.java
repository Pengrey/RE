package p260o0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p112g0.IdentityArraySet;
import p112g0.IdentityScopeMap;
import p112g0.MutableVector;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: o0.v */
/* loaded from: classes.dex */
public final class SnapshotStateObserver {

    /* renamed from: a */
    private final InterfaceC6108l f20696a;

    /* renamed from: b */
    private final InterfaceC6112p f20697b;

    /* renamed from: c */
    private final InterfaceC6108l f20698c;

    /* renamed from: d */
    private final MutableVector f20699d;

    /* renamed from: e */
    private InterfaceC7959f f20700e;

    /* renamed from: f */
    private boolean f20701f;

    /* renamed from: g */
    private boolean f20702g;

    /* renamed from: h */
    private C7990a f20703h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    /* renamed from: o0.v$a */
    /* loaded from: classes.dex */
    public static final class C7990a<T> {

        /* renamed from: a */
        private final InterfaceC6108l f20704a;

        /* renamed from: b */
        private final IdentityScopeMap f20705b;

        /* renamed from: c */
        private final HashSet f20706c;

        /* renamed from: d */
        private Object f20707d;

        public C7990a(InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(interfaceC6108l, "onChanged");
            this.f20704a = interfaceC6108l;
            this.f20705b = new IdentityScopeMap();
            this.f20706c = new HashSet();
        }

        /* renamed from: a */
        public final void m17224a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "value");
            IdentityScopeMap identityScopeMap = this.f20705b;
            Object obj2 = this.f20707d;
            Intrinsics.ifNullDoSomething(obj2);
            identityScopeMap.m23673c(obj, obj2);
        }

        /* renamed from: b */
        public final void m17223b(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "scopes");
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                m17219f().mo9587d(it.next());
            }
        }

        /* renamed from: c */
        public final Object m17222c() {
            return this.f20707d;
        }

        /* renamed from: d */
        public final HashSet m17221d() {
            return this.f20706c;
        }

        /* renamed from: e */
        public final IdentityScopeMap m17220e() {
            return this.f20705b;
        }

        /* renamed from: f */
        public final InterfaceC6108l m17219f() {
            return this.f20704a;
        }

        /* renamed from: g */
        public final void m17218g(Object obj) {
            this.f20707d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotStateObserver.kt */
    /* renamed from: o0.v$b */
    /* loaded from: classes.dex */
    public static final class C7991b extends AbstractC6438m implements InterfaceC6112p {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SnapshotStateObserver.kt */
        /* renamed from: o0.v$b$a */
        /* loaded from: classes.dex */
        public static final class C7992a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ SnapshotStateObserver f20709w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7992a(SnapshotStateObserver snapshotStateObserver) {
                super(0);
                this.f20709w = snapshotStateObserver;
            }

            /* renamed from: a */
            public final void m17216a() {
                SnapshotStateObserver.m17237a(this.f20709w);
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m17216a();
                return C13195u.f34156a;
            }
        }

        C7991b() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m17217a((Set) obj, (AbstractC7961h) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m17217a(Set set, AbstractC7961h abstractC7961h) {
            int i;
            Intrinsics.isThisObjectNull(set, "applied");
            Intrinsics.isThisObjectNull(abstractC7961h, "$noName_1");
            MutableVector m17236b = SnapshotStateObserver.m17236b(SnapshotStateObserver.this);
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            synchronized (m17236b) {
                MutableVector m17236b2 = SnapshotStateObserver.m17236b(snapshotStateObserver);
                int m23649p = m17236b2.m23649p();
                i = 0;
                if (m23649p > 0) {
                    Object[] m23650o = m17236b2.m23650o();
                    int i2 = 0;
                    do {
                        C7990a c7990a = (C7990a) m23650o[i];
                        HashSet m17221d = c7990a.m17221d();
                        IdentityScopeMap m17220e = c7990a.m17220e();
                        for (Object obj : set) {
                            int m23675a = IdentityScopeMap.m23675a(m17220e, obj);
                            if (m23675a >= 0) {
                                for (Object obj2 : IdentityScopeMap.m23674b(m17220e, m23675a)) {
                                    m17221d.add(obj2);
                                    i2 = 1;
                                }
                            }
                        }
                        i++;
                    } while (i < m23649p);
                    i = i2;
                }
                C13195u c13195u = C13195u.f34156a;
            }
            if (i != 0) {
                SnapshotStateObserver.m17234d(SnapshotStateObserver.this).mo9587d(new C7992a(SnapshotStateObserver.this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotStateObserver.kt */
    /* renamed from: o0.v$c */
    /* loaded from: classes.dex */
    public static final class C7993c extends AbstractC6438m implements InterfaceC6108l {
        C7993c() {
            super(1);
        }

        /* renamed from: a */
        public final void m17215a(Object obj) {
            Intrinsics.isThisObjectNull(obj, "state");
            if (SnapshotStateObserver.m17233e(SnapshotStateObserver.this)) {
                return;
            }
            MutableVector m17236b = SnapshotStateObserver.m17236b(SnapshotStateObserver.this);
            SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
            synchronized (m17236b) {
                C7990a m17235c = SnapshotStateObserver.m17235c(snapshotStateObserver);
                Intrinsics.ifNullDoSomething(m17235c);
                m17235c.m17224a(obj);
                C13195u c13195u = C13195u.f34156a;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m17215a(obj);
            return C13195u.f34156a;
        }
    }

    public SnapshotStateObserver(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "onChangedExecutor");
        this.f20696a = interfaceC6108l;
        this.f20697b = new C7991b();
        this.f20698c = new C7993c();
        this.f20699d = new MutableVector(new C7990a[16], 0);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m17237a(SnapshotStateObserver snapshotStateObserver) {
        snapshotStateObserver.m17232f();
    }

    /* renamed from: b */
    public static final /* synthetic */ MutableVector m17236b(SnapshotStateObserver snapshotStateObserver) {
        return snapshotStateObserver.f20699d;
    }

    /* renamed from: c */
    public static final /* synthetic */ C7990a m17235c(SnapshotStateObserver snapshotStateObserver) {
        return snapshotStateObserver.f20703h;
    }

    /* renamed from: d */
    public static final /* synthetic */ InterfaceC6108l m17234d(SnapshotStateObserver snapshotStateObserver) {
        return snapshotStateObserver.f20696a;
    }

    /* renamed from: e */
    public static final /* synthetic */ boolean m17233e(SnapshotStateObserver snapshotStateObserver) {
        return snapshotStateObserver.f20702g;
    }

    /* renamed from: f */
    private final void m17232f() {
        MutableVector mutableVector = this.f20699d;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            int i = 0;
            Object[] m23650o = mutableVector.m23650o();
            do {
                C7990a c7990a = (C7990a) m23650o[i];
                HashSet m17221d = c7990a.m17221d();
                if (!m17221d.isEmpty()) {
                    c7990a.m17223b(m17221d);
                    m17221d.clear();
                }
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: i */
    private final C7990a m17229i(InterfaceC6108l interfaceC6108l) {
        int i;
        MutableVector mutableVector = this.f20699d;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = mutableVector.m23650o();
            i = 0;
            do {
                if (((C7990a) m23650o[i]).m17219f() == interfaceC6108l) {
                    break;
                }
                i++;
            } while (i < m23649p);
            i = -1;
        } else {
            i = -1;
        }
        if (i == -1) {
            C7990a c7990a = new C7990a(interfaceC6108l);
            this.f20699d.m23659c(c7990a);
            return c7990a;
        }
        return (C7990a) this.f20699d.m23650o()[i];
    }

    /* renamed from: g */
    public final void m17231g() {
        synchronized (this.f20699d) {
            MutableVector mutableVector = this.f20699d;
            int m23649p = mutableVector.m23649p();
            if (m23649p > 0) {
                int i = 0;
                Object[] m23650o = mutableVector.m23650o();
                do {
                    ((C7990a) m23650o[i]).m17220e().m23672d();
                    i++;
                } while (i < m23649p);
                C13195u c13195u = C13195u.f34156a;
            } else {
                C13195u c13195u2 = C13195u.f34156a;
            }
        }
    }

    /* renamed from: h */
    public final void m17230h(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        synchronized (this.f20699d) {
            MutableVector mutableVector = this.f20699d;
            int m23649p = mutableVector.m23649p();
            if (m23649p > 0) {
                Object[] m23650o = mutableVector.m23650o();
                int i = 0;
                while (true) {
                    IdentityScopeMap m17220e = ((C7990a) m23650o[i]).m17220e();
                    int m23666j = m17220e.m23666j();
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < m23666j) {
                        int i4 = i2 + 1;
                        int i5 = m17220e.m23665k()[i2];
                        IdentityArraySet identityArraySet = m17220e.m23667i()[i5];
                        Intrinsics.ifNullDoSomething(identityArraySet);
                        int size = identityArraySet.size();
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < size) {
                            int i8 = i6 + 1;
                            Object obj = identityArraySet.m23678l()[i6];
                            if (obj != null) {
                                if (!((Boolean) interfaceC6108l.mo9587d(obj)).booleanValue()) {
                                    if (i7 != i6) {
                                        identityArraySet.m23678l()[i7] = obj;
                                    }
                                    i7++;
                                }
                                i6 = i8;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                        int size2 = identityArraySet.size();
                        for (int i9 = i7; i9 < size2; i9++) {
                            identityArraySet.m23678l()[i9] = null;
                        }
                        identityArraySet.m23676p(i7);
                        if (identityArraySet.size() > 0) {
                            if (i3 != i2) {
                                int i10 = m17220e.m23665k()[i3];
                                m17220e.m23665k()[i3] = i5;
                                m17220e.m23665k()[i2] = i10;
                            }
                            i3++;
                        }
                        i2 = i4;
                    }
                    int m23666j2 = m17220e.m23666j();
                    for (int i11 = i3; i11 < m23666j2; i11++) {
                        m17220e.m23664l()[m17220e.m23665k()[i11]] = null;
                    }
                    m17220e.m23661o(i3);
                    i++;
                    if (i >= m23649p) {
                        break;
                    }
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: j */
    public final void m17228j(Object obj, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        C7990a m17229i;
        Intrinsics.isThisObjectNull(obj, "scope");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onValueChangedForScope");
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        C7990a c7990a = this.f20703h;
        boolean z = this.f20702g;
        synchronized (this.f20699d) {
            m17229i = m17229i(interfaceC6108l);
        }
        Object m17222c = m17229i.m17222c();
        m17229i.m17218g(obj);
        this.f20703h = m17229i;
        this.f20702g = false;
        synchronized (this.f20699d) {
            IdentityScopeMap m17220e = m17229i.m17220e();
            int m23666j = m17220e.m23666j();
            int i = 0;
            int i2 = 0;
            while (i < m23666j) {
                int i3 = i + 1;
                int i4 = m17220e.m23665k()[i];
                IdentityArraySet identityArraySet = m17220e.m23667i()[i4];
                Intrinsics.ifNullDoSomething(identityArraySet);
                int size = identityArraySet.size();
                int i5 = m23666j;
                int i6 = 0;
                int i7 = 0;
                while (i7 < size) {
                    int i8 = i7 + 1;
                    int i9 = size;
                    Object obj2 = identityArraySet.m23678l()[i7];
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    }
                    if (!(obj2 == obj)) {
                        if (i6 != i7) {
                            identityArraySet.m23678l()[i6] = obj2;
                        }
                        i6++;
                    }
                    i7 = i8;
                    size = i9;
                }
                int size2 = identityArraySet.size();
                for (int i10 = i6; i10 < size2; i10++) {
                    identityArraySet.m23678l()[i10] = null;
                }
                identityArraySet.m23676p(i6);
                if (identityArraySet.size() > 0) {
                    if (i2 != i) {
                        int i11 = m17220e.m23665k()[i2];
                        m17220e.m23665k()[i2] = i4;
                        m17220e.m23665k()[i] = i11;
                    }
                    i2++;
                }
                i = i3;
                m23666j = i5;
            }
            int m23666j2 = m17220e.m23666j();
            for (int i12 = i2; i12 < m23666j2; i12++) {
                m17220e.m23664l()[m17220e.m23665k()[i12]] = null;
            }
            m17220e.m23661o(i2);
            C13195u c13195u = C13195u.f34156a;
        }
        if (!this.f20701f) {
            this.f20701f = true;
            try {
                AbstractC7961h.f20646d.m17366c(this.f20698c, null, interfaceC6097a);
            } finally {
                this.f20701f = false;
            }
        } else {
            interfaceC6097a.mo42214q();
        }
        this.f20703h = c7990a;
        m17229i.m17218g(m17222c);
        this.f20702g = z;
    }

    /* renamed from: k */
    public final void m17227k() {
        this.f20700e = AbstractC7961h.f20646d.m17365d(this.f20697b);
    }

    /* renamed from: l */
    public final void m17226l() {
        InterfaceC7959f interfaceC7959f = this.f20700e;
        if (interfaceC7959f == null) {
            return;
        }
        interfaceC7959f.mo17397b();
    }

    /* renamed from: m */
    public final void m17225m(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        boolean z = this.f20702g;
        this.f20702g = true;
        try {
            interfaceC6097a.mo42214q();
        } finally {
            this.f20702g = z;
        }
    }
}
