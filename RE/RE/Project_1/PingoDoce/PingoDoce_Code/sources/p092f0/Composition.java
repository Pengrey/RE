package p092f0;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.EnumC0646b;
import androidx.compose.runtime.Recomposer;
import bd.CoroutineContext;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p112g0.IdentityArrayMap;
import p112g0.IdentityArraySet;
import p112g0.IdentityScopeMap;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p260o0.InterfaceC7950b0;
import p468yc.C13195u;
import p489zc.C13768k;

/* renamed from: f0.n */
/* loaded from: classes.dex */
public final class Composition implements InterfaceC5243s {

    /* renamed from: A */
    private final HashSet f14464A;

    /* renamed from: B */
    private final C5164e1 f14465B;

    /* renamed from: C */
    private final IdentityScopeMap f14466C;

    /* renamed from: D */
    private final IdentityScopeMap f14467D;

    /* renamed from: E */
    private final List f14468E;

    /* renamed from: F */
    private final IdentityScopeMap f14469F;

    /* renamed from: G */
    private IdentityArrayMap f14470G;

    /* renamed from: H */
    private boolean f14471H;

    /* renamed from: I */
    private final C5184j f14472I;

    /* renamed from: J */
    private final CoroutineContext f14473J;

    /* renamed from: K */
    private boolean f14474K;

    /* renamed from: L */
    private InterfaceC6112p f14475L;

    /* renamed from: w */
    private final CompositionContext f14476w;

    /* renamed from: x */
    private final Applier f14477x;

    /* renamed from: y */
    private final AtomicReference f14478y;

    /* renamed from: z */
    private final Object f14479z;

    /* compiled from: Composition.kt */
    /* renamed from: f0.n$a */
    /* loaded from: classes.dex */
    private static final class C5228a implements InterfaceC5267y0 {

        /* renamed from: a */
        private final Set f14480a;

        /* renamed from: b */
        private final List f14481b;

        /* renamed from: c */
        private final List f14482c;

        /* renamed from: d */
        private final List f14483d;

        public C5228a(Set set) {
            Intrinsics.isThisObjectNull(set, "abandoning");
            this.f14480a = set;
            this.f14481b = new ArrayList();
            this.f14482c = new ArrayList();
            this.f14483d = new ArrayList();
        }

        /* renamed from: a */
        public void mo24849a(InterfaceC5269z0 interfaceC5269z0) {
            Intrinsics.isThisObjectNull(interfaceC5269z0, "instance");
            int lastIndexOf = this.f14482c.lastIndexOf(interfaceC5269z0);
            if (lastIndexOf >= 0) {
                this.f14482c.remove(lastIndexOf);
                this.f14480a.remove(interfaceC5269z0);
                return;
            }
            this.f14481b.add(interfaceC5269z0);
        }

        /* renamed from: b */
        public void mo24848b(InterfaceC6097a interfaceC6097a) {
            Intrinsics.isThisObjectNull(interfaceC6097a, "effect");
            this.f14483d.add(interfaceC6097a);
        }

        /* renamed from: c */
        public void mo24847c(InterfaceC5269z0 interfaceC5269z0) {
            Intrinsics.isThisObjectNull(interfaceC5269z0, "instance");
            int lastIndexOf = this.f14481b.lastIndexOf(interfaceC5269z0);
            if (lastIndexOf >= 0) {
                this.f14481b.remove(lastIndexOf);
                this.f14480a.remove(interfaceC5269z0);
                return;
            }
            this.f14482c.add(interfaceC5269z0);
        }

        /* renamed from: d */
        public final void m24975d() {
            if (!this.f14480a.isEmpty()) {
                Iterator it = this.f14480a.iterator();
                while (it.hasNext()) {
                    it.remove();
                    ((InterfaceC5269z0) it.next()).mo24844b();
                }
            }
        }

        /* renamed from: e */
        public final void m24974e() {
            int i;
            if ((!this.f14482c.isEmpty()) && this.f14482c.size() - 1 >= 0) {
                while (true) {
                    int i2 = i - 1;
                    InterfaceC5269z0 interfaceC5269z0 = (InterfaceC5269z0) this.f14482c.get(i);
                    if (!this.f14480a.contains(interfaceC5269z0)) {
                        interfaceC5269z0.mo24843e();
                    }
                    if (i2 < 0) {
                        break;
                    }
                    i = i2;
                }
            }
            if (!this.f14481b.isEmpty()) {
                List list = this.f14481b;
                int i3 = 0;
                int size = list.size();
                while (i3 < size) {
                    int i4 = i3 + 1;
                    InterfaceC5269z0 interfaceC5269z02 = (InterfaceC5269z0) list.get(i3);
                    this.f14480a.remove(interfaceC5269z02);
                    interfaceC5269z02.mo24845a();
                    i3 = i4;
                }
            }
        }

        /* renamed from: f */
        public final void m24973f() {
            if (!this.f14483d.isEmpty()) {
                List list = this.f14483d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC6097a) list.get(i)).mo42214q();
                }
                this.f14483d.clear();
            }
        }
    }

    public Composition(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(compositionContext, "parent");
        Intrinsics.isThisObjectNull(applier, "applier");
        this.f14476w = compositionContext;
        this.f14477x = applier;
        this.f14478y = new AtomicReference(null);
        this.f14479z = new Object();
        HashSet hashSet = new HashSet();
        this.f14464A = hashSet;
        C5164e1 c5164e1 = new C5164e1();
        this.f14465B = c5164e1;
        this.f14466C = new IdentityScopeMap();
        this.f14467D = new IdentityScopeMap();
        ArrayList arrayList = new ArrayList();
        this.f14468E = arrayList;
        this.f14469F = new IdentityScopeMap();
        this.f14470G = new IdentityArrayMap(0, 1, null);
        C5184j c5184j = new C5184j(applier, compositionContext, c5164e1, hashSet, arrayList, this);
        compositionContext.m39991i(c5184j);
        this.f14472I = c5184j;
        this.f14473J = coroutineContext;
        boolean z = compositionContext instanceof Recomposer;
        this.f14475L = C5169g.f14286a.m25375a();
    }

    /* renamed from: a */
    private final void m24991a(Set set) {
        C6449y c6449y = new C6449y();
        for (Object obj : set) {
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).m24866r(null);
            } else {
                m24989c(this, c6449y, obj);
                IdentityScopeMap identityScopeMap = this.f14467D;
                int m23675a = IdentityScopeMap.m23675a(identityScopeMap, obj);
                if (m23675a >= 0) {
                    for (InterfaceC5257v interfaceC5257v : IdentityScopeMap.m23674b(identityScopeMap, m23675a)) {
                        m24989c(this, c6449y, interfaceC5257v);
                    }
                }
            }
        }
        HashSet hashSet = (HashSet) c6449y.f17533w;
        if (hashSet == null) {
            return;
        }
        IdentityScopeMap identityScopeMap2 = this.f14466C;
        int m23666j = identityScopeMap2.m23666j();
        int i = 0;
        int i2 = 0;
        while (i < m23666j) {
            int i3 = i + 1;
            int i4 = identityScopeMap2.m23665k()[i];
            IdentityArraySet identityArraySet = identityScopeMap2.m23667i()[i4];
            Intrinsics.ifNullDoSomething(identityArraySet);
            int size = identityArraySet.size();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size) {
                int i7 = i5 + 1;
                Object obj2 = identityArraySet.m23678l()[i5];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!hashSet.contains((RecomposeScopeImpl) obj2)) {
                    if (i6 != i5) {
                        identityArraySet.m23678l()[i6] = obj2;
                    }
                    i6++;
                }
                i5 = i7;
            }
            int size2 = identityArraySet.size();
            for (int i8 = i6; i8 < size2; i8++) {
                identityArraySet.m23678l()[i8] = null;
            }
            identityArraySet.m23676p(i6);
            if (identityArraySet.size() > 0) {
                if (i2 != i) {
                    int i9 = identityScopeMap2.m23665k()[i2];
                    identityScopeMap2.m23665k()[i2] = i4;
                    identityScopeMap2.m23665k()[i] = i9;
                }
                i2++;
            }
            i = i3;
        }
        int m23666j2 = identityScopeMap2.m23666j();
        for (int i10 = i2; i10 < m23666j2; i10++) {
            identityScopeMap2.m23664l()[identityScopeMap2.m23665k()[i10]] = null;
        }
        identityScopeMap2.m23661o(i2);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet, T] */
    /* renamed from: c */
    private static final void m24989c(Composition composition, C6449y c6449y, Object obj) {
        IdentityScopeMap identityScopeMap = composition.f14466C;
        int m23675a = IdentityScopeMap.m23675a(identityScopeMap, obj);
        if (m23675a >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : IdentityScopeMap.m23674b(identityScopeMap, m23675a)) {
                if (!composition.f14469F.m23663m(obj, recomposeScopeImpl) && recomposeScopeImpl.m24866r(obj) != EnumC0646b.IGNORED) {
                    HashSet hashSet = (HashSet) c6449y.f17533w;
                    HashSet hashSet2 = hashSet;
                    if (hashSet == null) {
                        ?? hashSet3 = new HashSet();
                        c6449y.f17533w = hashSet3;
                        hashSet2 = hashSet3;
                    }
                    hashSet2.add(recomposeScopeImpl);
                }
            }
        }
    }

    /* renamed from: d */
    private final void m24988d() {
        Object andSet = this.f14478y.getAndSet(C5231o.m24967c());
        if (andSet == null) {
            return;
        }
        if (!Intrinsics.equals(andSet, C5231o.m24967c())) {
            if (andSet instanceof Set) {
                m24991a((Set) andSet);
                return;
            } else if (!(andSet instanceof Object[])) {
                throw new IllegalStateException(Intrinsics.addStrAndObj("corrupt pendingModifications drain: ", this.f14478y).toString());
            } else {
                Set[] setArr = (Set[]) andSet;
                int i = 0;
                int length = setArr.length;
                while (i < length) {
                    Set set = setArr[i];
                    i++;
                    m24991a(set);
                }
                return;
            }
        }
        throw new IllegalStateException("pending composition has not been applied".toString());
    }

    /* renamed from: e */
    private final void m24987e() {
        Object andSet = this.f14478y.getAndSet(null);
        if (Intrinsics.equals(andSet, C5231o.m24967c())) {
            return;
        }
        if (andSet instanceof Set) {
            m24991a((Set) andSet);
        } else if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            }
            throw new IllegalStateException(Intrinsics.addStrAndObj("corrupt pendingModifications drain: ", this.f14478y).toString());
        } else {
            Set[] setArr = (Set[]) andSet;
            int i = 0;
            int length = setArr.length;
            while (i < length) {
                Set set = setArr[i];
                i++;
                m24991a(set);
            }
        }
    }

    /* renamed from: f */
    private final boolean m24986f() {
        return this.f14472I.m25152m0();
    }

    /* renamed from: v */
    private final void m24980v(Object obj) {
        IdentityScopeMap identityScopeMap = this.f14466C;
        int m23675a = IdentityScopeMap.m23675a(identityScopeMap, obj);
        if (m23675a >= 0) {
            for (RecomposeScopeImpl recomposeScopeImpl : IdentityScopeMap.m23674b(identityScopeMap, m23675a)) {
                if (recomposeScopeImpl.m24866r(obj) == EnumC0646b.IMMINENT) {
                    this.f14469F.m23673c(obj, recomposeScopeImpl);
                }
            }
        }
    }

    /* renamed from: z */
    private final IdentityArrayMap m24976z() {
        IdentityArrayMap identityArrayMap = this.f14470G;
        this.f14470G = new IdentityArrayMap(0, 1, null);
        return identityArrayMap;
    }

    /* renamed from: b */
    public void mo25009b() {
        synchronized (this.f14479z) {
            if (!this.f14474K) {
                this.f14474K = true;
                m24978x(C5169g.f14286a.m25374b());
                boolean z = this.f14465B.m25436p() > 0;
                if (z || (true ^ this.f14464A.isEmpty())) {
                    C5228a c5228a = new C5228a(this.f14464A);
                    if (z) {
                        C5173g1 m25430y = this.f14465B.m25430y();
                        C5210k.m25051N(m25430y, c5228a);
                        C13195u c13195u = C13195u.f34156a;
                        m25430y.m25327h();
                        this.f14477x.clear();
                        c5228a.m24974e();
                    }
                    c5228a.m24975d();
                }
                this.f14472I.m25182c0();
            }
            C13195u c13195u2 = C13195u.f34156a;
        }
        this.f14476w.m39988l(this);
    }

    /* renamed from: g */
    public final boolean m24985g() {
        return this.f14471H;
    }

    /* renamed from: h */
    public void mo24923h() {
        synchronized (this.f14479z) {
            C5228a c5228a = new C5228a(this.f14464A);
            this.f14477x.mo25547d();
            C5173g1 m25430y = this.f14465B.m25430y();
            Applier applier = this.f14477x;
            List list = this.f14468E;
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC6113q) list.get(i2)).mo4533i(applier, m25430y, c5228a);
            }
            this.f14468E.clear();
            C13195u c13195u = C13195u.f34156a;
            m25430y.m25327h();
            this.f14477x.mo25546f();
            c5228a.m24974e();
            c5228a.m24973f();
            if (m24985g()) {
                m24977y(false);
                IdentityScopeMap identityScopeMap = this.f14466C;
                int m23666j = identityScopeMap.m23666j();
                int i3 = 0;
                int i4 = 0;
                while (i3 < m23666j) {
                    int i5 = i3 + 1;
                    int i6 = identityScopeMap.m23665k()[i3];
                    IdentityArraySet identityArraySet = identityScopeMap.m23667i()[i6];
                    Intrinsics.ifNullDoSomething(identityArraySet);
                    int size2 = identityArraySet.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < size2) {
                        int i9 = i7 + 1;
                        Object obj = identityArraySet.m23678l()[i7];
                        if (obj != null) {
                            if (!(!((RecomposeScopeImpl) obj).m24867q())) {
                                if (i8 != i7) {
                                    identityArraySet.m23678l()[i8] = obj;
                                }
                                i8++;
                            }
                            i7 = i9;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                    }
                    int size3 = identityArraySet.size();
                    for (int i10 = i8; i10 < size3; i10++) {
                        identityArraySet.m23678l()[i10] = null;
                    }
                    identityArraySet.m23676p(i8);
                    if (identityArraySet.size() > 0) {
                        if (i4 != i3) {
                            int i11 = identityScopeMap.m23665k()[i4];
                            identityScopeMap.m23665k()[i4] = i6;
                            identityScopeMap.m23665k()[i3] = i11;
                        }
                        i4++;
                    }
                    i3 = i5;
                }
                int m23666j2 = identityScopeMap.m23666j();
                for (int i12 = i4; i12 < m23666j2; i12++) {
                    identityScopeMap.m23664l()[identityScopeMap.m23665k()[i12]] = null;
                }
                identityScopeMap.m23661o(i4);
                IdentityScopeMap identityScopeMap2 = this.f14467D;
                int m23666j3 = identityScopeMap2.m23666j();
                int i13 = 0;
                int i14 = 0;
                while (i13 < m23666j3) {
                    int i15 = i13 + 1;
                    int i16 = identityScopeMap2.m23665k()[i13];
                    IdentityArraySet identityArraySet2 = identityScopeMap2.m23667i()[i16];
                    Intrinsics.ifNullDoSomething(identityArraySet2);
                    int size4 = identityArraySet2.size();
                    int i17 = i;
                    int i18 = i17;
                    while (i17 < size4) {
                        int i19 = i17 + 1;
                        Object obj2 = identityArraySet2.m23678l()[i17];
                        if (obj2 != null) {
                            if (!(!this.f14466C.m23671e((InterfaceC5257v) obj2))) {
                                if (i18 != i17) {
                                    identityArraySet2.m23678l()[i18] = obj2;
                                }
                                i18++;
                            }
                            i17 = i19;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        }
                    }
                    int size5 = identityArraySet2.size();
                    for (int i20 = i18; i20 < size5; i20++) {
                        identityArraySet2.m23678l()[i20] = null;
                    }
                    identityArraySet2.m23676p(i18);
                    if (identityArraySet2.size() > 0) {
                        if (i14 != i13) {
                            int i21 = identityScopeMap2.m23665k()[i14];
                            identityScopeMap2.m23665k()[i14] = i16;
                            identityScopeMap2.m23665k()[i13] = i21;
                        }
                        i14++;
                    }
                    i13 = i15;
                    i = 0;
                }
                int m23666j4 = identityScopeMap2.m23666j();
                for (int i22 = i14; i22 < m23666j4; i22++) {
                    identityScopeMap2.m23664l()[identityScopeMap2.m23665k()[i22]] = null;
                }
                identityScopeMap2.m23661o(i14);
            }
            c5228a.m24975d();
            m24987e();
            C13195u c13195u2 = C13195u.f34156a;
        }
    }

    /* renamed from: i */
    public boolean mo24922i() {
        return this.f14472I.m25134s0();
    }

    /* renamed from: j */
    public void mo24921j(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        this.f14472I.m25125w0(interfaceC6097a);
    }

    /* renamed from: k */
    public void mo24920k(Object obj) {
        Intrinsics.isThisObjectNull(obj, "value");
        synchronized (this.f14479z) {
            m24980v(obj);
            IdentityScopeMap identityScopeMap = this.f14467D;
            int m23675a = IdentityScopeMap.m23675a(identityScopeMap, obj);
            if (m23675a >= 0) {
                for (InterfaceC5257v interfaceC5257v : IdentityScopeMap.m23674b(identityScopeMap, m23675a)) {
                    m24980v(interfaceC5257v);
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo24919l(java.util.Set r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            g0.d r1 = r2.f14466C
            boolean r1 = r1.m23671e(r0)
            if (r1 != 0) goto L23
            g0.d r1 = r2.f14467D
            boolean r0 = r1.m23671e(r0)
            if (r0 == 0) goto L9
        L23:
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p092f0.Composition.mo24919l(java.util.Set):boolean");
    }

    /* renamed from: m */
    public boolean mo25008m() {
        boolean z;
        synchronized (this.f14479z) {
            z = this.f14470G.m23686f() > 0;
        }
        return z;
    }

    /* renamed from: n */
    public final EnumC0646b m24983n(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Intrinsics.isThisObjectNull(recomposeScopeImpl, "scope");
        if (recomposeScopeImpl.m24873k()) {
            recomposeScopeImpl.m24858z(true);
        }
        C5159d m24875i = recomposeScopeImpl.m24875i();
        if (m24875i != null && this.f14465B.m25443B(m24875i) && m24875i.m25510b()) {
            if (m24875i.m25508d(this.f14465B) < 0) {
                return EnumC0646b.IGNORED;
            }
            if (mo24922i() && this.f14472I.m25166h1(recomposeScopeImpl, obj)) {
                return EnumC0646b.IMMINENT;
            }
            if (obj == null) {
                this.f14470G.m23682j(recomposeScopeImpl, null);
            } else {
                C5231o.m24968b(this.f14470G, recomposeScopeImpl, obj);
            }
            this.f14476w.m39993g(this);
            return mo24922i() ? EnumC0646b.DEFERRED : EnumC0646b.SCHEDULED;
        }
        return EnumC0646b.IGNORED;
    }

    /* renamed from: o */
    public void mo24918o(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        try {
            synchronized (this.f14479z) {
                m24988d();
                this.f14472I.m25191Z(m24976z(), interfaceC6112p);
                C13195u c13195u = C13195u.f34156a;
            }
        } catch (Throwable th2) {
            if (!this.f14464A.isEmpty()) {
                new C5228a(this.f14464A).m24975d();
            }
            throw th2;
        }
    }

    /* renamed from: p */
    public void mo24917p(Object obj) {
        RecomposeScopeImpl m25146o0;
        Intrinsics.isThisObjectNull(obj, "value");
        if (m24986f() || (m25146o0 = this.f14472I.m25146o0()) == null) {
            return;
        }
        m25146o0.m24885D(true);
        this.f14466C.m23673c(obj, m25146o0);
        if (obj instanceof InterfaceC5257v) {
            for (InterfaceC7950b0 interfaceC7950b0 : ((InterfaceC5257v) obj).mo24891c()) {
                this.f14467D.m23673c(interfaceC7950b0, obj);
            }
        }
        m25146o0.m24864t(obj);
    }

    /* renamed from: q */
    public boolean mo25007q() {
        return this.f14474K;
    }

    /* renamed from: r */
    public void mo25006r(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        if (!this.f14474K) {
            this.f14475L = interfaceC6112p;
            this.f14476w.m39999a(this, interfaceC6112p);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* renamed from: s */
    public boolean mo24916s() {
        boolean m25234D0;
        synchronized (this.f14479z) {
            m24988d();
            m25234D0 = this.f14472I.m25234D0(m24976z());
            if (!m25234D0) {
                m24987e();
            }
        }
        return m25234D0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    /* renamed from: t */
    public void mo24915t(Set set) {
        Object obj;
        Set set2;
        Intrinsics.isThisObjectNull(set, "values");
        do {
            obj = this.f14478y.get();
            if (obj == null ? true : Intrinsics.equals(obj, C5231o.m24967c())) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{(Set) obj, set};
            } else if (!(obj instanceof Object[])) {
                throw new IllegalStateException(Intrinsics.addStrAndObj("corrupt pendingModifications: ", this.f14478y).toString());
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set2 = C13768k.m343u((Set[]) obj, set);
            }
        } while (!this.f14478y.compareAndSet(obj, set2));
        if (obj == null) {
            synchronized (this.f14479z) {
                m24987e();
                C13195u c13195u = C13195u.f34156a;
            }
        }
    }

    /* renamed from: u */
    public void mo24914u() {
        synchronized (this.f14479z) {
            Object[] m25435q = this.f14465B.m25435q();
            int i = 0;
            int length = m25435q.length;
            while (i < length) {
                Object obj = m25435q[i];
                i++;
                RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: w */
    public final void m24979w(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        Intrinsics.isThisObjectNull(obj, "instance");
        Intrinsics.isThisObjectNull(recomposeScopeImpl, "scope");
        this.f14466C.m23663m(obj, recomposeScopeImpl);
    }

    /* renamed from: x */
    public final void m24978x(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "<set-?>");
        this.f14475L = interfaceC6112p;
    }

    /* renamed from: y */
    public final void m24977y(boolean z) {
        this.f14471H = z;
    }

    public /* synthetic */ Composition(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }
}
