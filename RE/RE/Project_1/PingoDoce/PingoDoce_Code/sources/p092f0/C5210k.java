package p092f0;

import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ExceptionsH;
import p112g0.IdentityArraySet;
import p126h0.C5732a;
import p126h0.InterfaceC5740f;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;
import p468yc.C13195u;
import p489zc.C13777q;

/* compiled from: Composer.kt */
/* renamed from: f0.k */
/* loaded from: classes.dex */
public final class C5210k {

    /* renamed from: a */
    private static final InterfaceC6113q f14423a = C5212b.f14433w;

    /* renamed from: b */
    private static final InterfaceC6113q f14424b = C5211a.f14432w;

    /* renamed from: c */
    private static final InterfaceC6113q f14425c = C5213c.f14434w;

    /* renamed from: d */
    private static final Object f14426d = new OpaqueKey("provider");

    /* renamed from: e */
    private static final Object f14427e = new OpaqueKey("provider");

    /* renamed from: f */
    private static final Object f14428f = new OpaqueKey("compositionLocalMap");

    /* renamed from: g */
    private static final Object f14429g = new OpaqueKey("providerValues");

    /* renamed from: h */
    private static final Object f14430h = new OpaqueKey("providers");

    /* renamed from: i */
    private static final Object f14431i = new OpaqueKey("reference");

    /* compiled from: Composer.kt */
    /* renamed from: f0.k$a */
    /* loaded from: classes.dex */
    static final class C5211a extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C5211a f14432w = new C5211a();

        C5211a() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25021a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25021a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25315n();
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.k$b */
    /* loaded from: classes.dex */
    static final class C5212b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C5212b f14433w = new C5212b();

        C5212b() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25020a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25020a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "rememberManager");
            C5210k.m25051N(c5173g1, interfaceC5267y0);
        }
    }

    /* compiled from: Composer.kt */
    /* renamed from: f0.k$c */
    /* loaded from: classes.dex */
    static final class C5213c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C5213c f14434w = new C5213c();

        C5213c() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m25019a((Applier) obj, (C5173g1) obj2, (InterfaceC5267y0) obj3);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m25019a(Applier applier, C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
            Intrinsics.isThisObjectNull(applier, "$noName_0");
            Intrinsics.isThisObjectNull(c5173g1, "slots");
            Intrinsics.isThisObjectNull(interfaceC5267y0, "$noName_2");
            c5173g1.m25311p(0);
        }
    }

    /* renamed from: A */
    public static final Object m25064A() {
        return f14427e;
    }

    /* renamed from: B */
    public static final Object m25063B() {
        return f14430h;
    }

    /* renamed from: C */
    public static final Object m25062C() {
        return f14429g;
    }

    /* renamed from: D */
    public static final Object m25061D() {
        return f14431i;
    }

    /* renamed from: E */
    public static final Object m25060E(InterfaceC5740f interfaceC5740f, AbstractC5233p abstractC5233p) {
        Intrinsics.isThisObjectNull(interfaceC5740f, "<this>");
        Intrinsics.isThisObjectNull(abstractC5233p, "key");
        InterfaceC5242r1 interfaceC5242r1 = (InterfaceC5242r1) interfaceC5740f.get(abstractC5233p);
        if (interfaceC5242r1 == null) {
            return null;
        }
        return interfaceC5242r1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m25059F(List list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int m25026v = m25026v(list, i);
        IdentityArraySet identityArraySet = null;
        if (m25026v < 0) {
            int i2 = -(m25026v + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i2, new C5163e0(recomposeScopeImpl, i, identityArraySet));
        } else if (obj == null) {
            ((C5163e0) list.get(m25026v)).m25444e(null);
        } else {
            IdentityArraySet m25448a = ((C5163e0) list.get(m25026v)).m25448a();
            if (m25448a == null) {
                return;
            }
            m25448a.add(obj);
        }
    }

    /* renamed from: G */
    public static final void m25058G(InterfaceC5179i interfaceC5179i, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        Intrinsics.isThisObjectNull(interfaceC6112p, "composable");
        ((InterfaceC6112p) C6431d0.m20951d(interfaceC6112p, 2)).mo39856d(interfaceC5179i, 1);
    }

    /* renamed from: H */
    public static final Object m25057H(InterfaceC5179i interfaceC5179i, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        Intrinsics.isThisObjectNull(interfaceC6112p, "composable");
        return ((InterfaceC6112p) C6431d0.m20951d(interfaceC6112p, 2)).mo39856d(interfaceC5179i, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final HashMap m25056I() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final int m25055J(C5161d1 c5161d1, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (c5161d1.m25492H(i) == i2) {
            return i2;
        }
        if (c5161d1.m25492H(i2) == i) {
            return i;
        }
        if (c5161d1.m25492H(i) == c5161d1.m25492H(i2)) {
            return c5161d1.m25492H(i);
        }
        int m25027u = m25027u(c5161d1, i, i3);
        int m25027u2 = m25027u(c5161d1, i2, i3);
        int i4 = m25027u - m25027u2;
        int i5 = 0;
        int i6 = 0;
        while (i6 < i4) {
            i6++;
            i = c5161d1.m25492H(i);
        }
        int i7 = m25027u2 - m25027u;
        while (i5 < i7) {
            i5++;
            i2 = c5161d1.m25492H(i2);
        }
        while (i != i2) {
            i = c5161d1.m25492H(i);
            i2 = c5161d1.m25492H(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final Object m25054K(HashMap hashMap, Object obj) {
        Object m255M;
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet == null || (m255M = C13777q.m255M(linkedHashSet)) == null) {
            return null;
        }
        m25052M(hashMap, obj, m255M);
        return m255M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final boolean m25053L(HashMap hashMap, Object obj, Object obj2) {
        Object obj3 = hashMap.get(obj);
        if (obj3 == null) {
            obj3 = new LinkedHashSet();
            hashMap.put(obj, obj3);
        }
        return ((LinkedHashSet) obj3).add(obj2);
    }

    /* renamed from: M */
    private static final C13195u m25052M(HashMap hashMap, Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(obj);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(obj2);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(obj);
        }
        return C13195u.f34156a;
    }

    /* renamed from: N */
    public static final void m25051N(C5173g1 c5173g1, InterfaceC5267y0 interfaceC5267y0) {
        RecomposeScopeImpl recomposeScopeImpl;
        Composition m24874j;
        Intrinsics.isThisObjectNull(c5173g1, "<this>");
        Intrinsics.isThisObjectNull(interfaceC5267y0, "rememberManager");
        Iterator m25364D = c5173g1.m25364D();
        while (m25364D.hasNext()) {
            Object next = m25364D.next();
            if (next instanceof InterfaceC5269z0) {
                interfaceC5267y0.mo24847c((InterfaceC5269z0) next);
            } else if ((next instanceof RecomposeScopeImpl) && (m24874j = (recomposeScopeImpl = (RecomposeScopeImpl) next).m24874j()) != null) {
                m24874j.m24977y(true);
                recomposeScopeImpl.m24860x(null);
            }
        }
        c5173g1.m25348T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final C5163e0 m25050O(List list, int i) {
        int m25026v = m25026v(list, i);
        if (m25026v >= 0) {
            return (C5163e0) list.remove(m25026v);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m25049P(List list, int i, int i2) {
        int m25026v = m25026v(list, i);
        if (m25026v < 0) {
            m25026v = -(m25026v + 1);
        }
        while (m25026v < list.size() && ((C5163e0) list.get(m25026v)).m25447b() < i2) {
            list.remove(m25026v);
        }
    }

    /* renamed from: Q */
    public static final void m25048Q(boolean z) {
        if (z) {
            return;
        }
        m25030r("Check failed".toString());
        throw new ExceptionsH();
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m25047a(int i) {
        return m25032p(i);
    }

    /* renamed from: b */
    public static final /* synthetic */ int m25046b(boolean z) {
        return m25031q(z);
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC5740f m25045c(C5255u0[] c5255u0Arr, InterfaceC5740f interfaceC5740f, InterfaceC5179i interfaceC5179i, int i) {
        return m25029s(c5255u0Arr, interfaceC5740f, interfaceC5179i, i);
    }

    /* renamed from: d */
    public static final /* synthetic */ C5163e0 m25044d(List list, int i, int i2) {
        return m25025w(list, i, i2);
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC6113q m25043e() {
        return f14424b;
    }

    /* renamed from: f */
    public static final /* synthetic */ Object m25042f(C5172g0 c5172g0) {
        return m25022z(c5172g0);
    }

    /* renamed from: g */
    public static final /* synthetic */ InterfaceC6113q m25041g() {
        return f14423a;
    }

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC6113q m25040h() {
        return f14425c;
    }

    /* renamed from: i */
    public static final /* synthetic */ void m25039i(List list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        m25059F(list, i, recomposeScopeImpl, obj);
    }

    /* renamed from: j */
    public static final /* synthetic */ HashMap m25038j() {
        return m25056I();
    }

    /* renamed from: k */
    public static final /* synthetic */ int m25037k(C5161d1 c5161d1, int i, int i2, int i3) {
        return m25055J(c5161d1, i, i2, i3);
    }

    /* renamed from: l */
    public static final /* synthetic */ Object m25036l(HashMap hashMap, Object obj) {
        return m25054K(hashMap, obj);
    }

    /* renamed from: m */
    public static final /* synthetic */ boolean m25035m(HashMap hashMap, Object obj, Object obj2) {
        return m25053L(hashMap, obj, obj2);
    }

    /* renamed from: n */
    public static final /* synthetic */ C5163e0 m25034n(List list, int i) {
        return m25050O(list, i);
    }

    /* renamed from: o */
    public static final /* synthetic */ void m25033o(List list, int i, int i2) {
        m25049P(list, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final boolean m25032p(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final int m25031q(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: r */
    public static final Void m25030r(String str) {
        Intrinsics.isThisObjectNull(str, "message");
        throw new IllegalStateException(("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final InterfaceC5740f m25029s(C5255u0[] c5255u0Arr, InterfaceC5740f interfaceC5740f, InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(680852469);
        InterfaceC5740f.InterfaceC5741a mo23201i = C5732a.m23211a().mo23201i();
        int length = c5255u0Arr.length;
        int i2 = 0;
        while (i2 < length) {
            C5255u0 c5255u0 = c5255u0Arr[i2];
            i2++;
            if (c5255u0.m24895a() || !m25028t(interfaceC5740f, c5255u0.m24894b())) {
                mo23201i.put(c5255u0.m24894b(), c5255u0.m24894b().mo24959b(c5255u0.m24893c(), interfaceC5179i, 72));
            }
        }
        InterfaceC5740f mo21191h = mo23201i.mo21191h();
        interfaceC5179i.mo25282C();
        return mo21191h;
    }

    /* renamed from: t */
    public static final boolean m25028t(InterfaceC5740f interfaceC5740f, AbstractC5233p abstractC5233p) {
        Intrinsics.isThisObjectNull(interfaceC5740f, "<this>");
        Intrinsics.isThisObjectNull(abstractC5233p, "key");
        return interfaceC5740f.containsKey(abstractC5233p);
    }

    /* renamed from: u */
    private static final int m25027u(C5161d1 c5161d1, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = c5161d1.m25492H(i);
            i3++;
        }
        return i3;
    }

    /* renamed from: v */
    private static final int m25026v(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int isLessOrEqual = Intrinsics.isLessOrEqual(((C5163e0) list.get(i3)).m25447b(), i);
            if (isLessOrEqual < 0) {
                i2 = i3 + 1;
            } else if (isLessOrEqual <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final C5163e0 m25025w(List list, int i, int i2) {
        int m25026v = m25026v(list, i);
        if (m25026v < 0) {
            m25026v = -(m25026v + 1);
        }
        if (m25026v < list.size()) {
            C5163e0 c5163e0 = (C5163e0) list.get(m25026v);
            if (c5163e0.m25447b() < i2) {
                return c5163e0;
            }
            return null;
        }
        return null;
    }

    /* renamed from: x */
    public static final Object m25024x() {
        return f14428f;
    }

    /* renamed from: y */
    public static final Object m25023y() {
        return f14426d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static final Object m25022z(C5172g0 c5172g0) {
        return c5172g0.m25368d() != null ? new C5167f0(Integer.valueOf(c5172g0.m25371a()), c5172g0.m25368d()) : Integer.valueOf(c5172g0.m25371a());
    }
}
