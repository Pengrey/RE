package p092f0;

import androidx.compose.runtime.EnumC0646b;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Objects;
import p112g0.IdentityArrayIntMap;
import p112g0.IdentityArrayMap;
import p112g0.IdentityArraySet;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: f0.w0 */
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements InterfaceC5151a1, InterfaceC5258v0 {

    /* renamed from: a */
    private Composition f14532a;

    /* renamed from: b */
    private int f14533b;

    /* renamed from: c */
    private C5159d f14534c;

    /* renamed from: d */
    private InterfaceC6112p f14535d;

    /* renamed from: e */
    private int f14536e;

    /* renamed from: f */
    private IdentityArrayIntMap f14537f;

    /* renamed from: g */
    private IdentityArrayMap f14538g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecomposeScopeImpl.kt */
    /* renamed from: f0.w0$a */
    /* loaded from: classes.dex */
    public static final class C5261a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ int f14540x;

        /* renamed from: y */
        final /* synthetic */ IdentityArrayIntMap f14541y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5261a(int i, IdentityArrayIntMap identityArrayIntMap) {
            super(1);
            this.f14540x = i;
            this.f14541y = identityArrayIntMap;
        }

        /* renamed from: a */
        public final void m24857a(InterfaceC5216l interfaceC5216l) {
            IdentityArrayMap m24881c;
            Intrinsics.isThisObjectNull(interfaceC5216l, "composition");
            if (RecomposeScopeImpl.m24882b(RecomposeScopeImpl.this) == this.f14540x && Intrinsics.equals(this.f14541y, RecomposeScopeImpl.m24880d(RecomposeScopeImpl.this)) && (interfaceC5216l instanceof Composition)) {
                IdentityArrayIntMap identityArrayIntMap = this.f14541y;
                int i = this.f14540x;
                RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                int m23694e = identityArrayIntMap.m23694e();
                int i2 = 0;
                int i3 = 0;
                while (i2 < m23694e) {
                    int i4 = i2 + 1;
                    Object obj = identityArrayIntMap.m23695d()[i2];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i5 = identityArrayIntMap.m23693f()[i2];
                    boolean z = i5 != i;
                    if (z) {
                        ((Composition) interfaceC5216l).m24979w(obj, recomposeScopeImpl);
                        InterfaceC5257v interfaceC5257v = obj instanceof InterfaceC5257v ? (InterfaceC5257v) obj : null;
                        if (interfaceC5257v != null && (m24881c = RecomposeScopeImpl.m24881c(recomposeScopeImpl)) != null) {
                            m24881c.m23683i(interfaceC5257v);
                            if (m24881c.m23686f() == 0) {
                                RecomposeScopeImpl.m24879e(recomposeScopeImpl, null);
                            }
                        }
                    }
                    if (!z) {
                        if (i3 != i2) {
                            identityArrayIntMap.m23695d()[i3] = obj;
                            identityArrayIntMap.m23693f()[i3] = i5;
                        }
                        i3++;
                    }
                    i2 = i4;
                }
                int m23694e2 = identityArrayIntMap.m23694e();
                for (int i6 = i3; i6 < m23694e2; i6++) {
                    identityArrayIntMap.m23695d()[i6] = null;
                }
                identityArrayIntMap.m23692g(i3);
                if (this.f14541y.m23694e() == 0) {
                    RecomposeScopeImpl.m24878f(RecomposeScopeImpl.this, null);
                }
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m24857a((InterfaceC5216l) obj);
            return C13195u.f34156a;
        }
    }

    public RecomposeScopeImpl(Composition composition) {
        this.f14532a = composition;
    }

    /* renamed from: B */
    private final void m24887B(boolean z) {
        if (z) {
            this.f14533b |= 32;
        } else {
            this.f14533b &= -33;
        }
    }

    /* renamed from: C */
    private final void m24886C(boolean z) {
        if (z) {
            this.f14533b |= 16;
        } else {
            this.f14533b &= -17;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ int m24882b(RecomposeScopeImpl recomposeScopeImpl) {
        return recomposeScopeImpl.f14536e;
    }

    /* renamed from: c */
    public static final /* synthetic */ IdentityArrayMap m24881c(RecomposeScopeImpl recomposeScopeImpl) {
        return recomposeScopeImpl.f14538g;
    }

    /* renamed from: d */
    public static final /* synthetic */ IdentityArrayIntMap m24880d(RecomposeScopeImpl recomposeScopeImpl) {
        return recomposeScopeImpl.f14537f;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m24879e(RecomposeScopeImpl recomposeScopeImpl, IdentityArrayMap identityArrayMap) {
        recomposeScopeImpl.f14538g = identityArrayMap;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m24878f(RecomposeScopeImpl recomposeScopeImpl, IdentityArrayIntMap identityArrayIntMap) {
        recomposeScopeImpl.f14537f = identityArrayIntMap;
    }

    /* renamed from: n */
    private final boolean m24870n() {
        return (this.f14533b & 32) != 0;
    }

    /* renamed from: A */
    public final void m24888A(boolean z) {
        if (z) {
            this.f14533b |= 8;
        } else {
            this.f14533b &= -9;
        }
    }

    /* renamed from: D */
    public final void m24885D(boolean z) {
        if (z) {
            this.f14533b |= 1;
        } else {
            this.f14533b &= -2;
        }
    }

    /* renamed from: E */
    public final void m24884E(int i) {
        this.f14536e = i;
        m24886C(false);
    }

    /* renamed from: a */
    public void mo25532a(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        this.f14535d = interfaceC6112p;
    }

    /* renamed from: g */
    public final void m24877g(InterfaceC5179i interfaceC5179i) {
        C13195u c13195u;
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        InterfaceC6112p interfaceC6112p = this.f14535d;
        if (interfaceC6112p == null) {
            c13195u = null;
        } else {
            interfaceC6112p.mo39856d(interfaceC5179i, 1);
            c13195u = C13195u.f34156a;
        }
        if (c13195u == null) {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    /* renamed from: h */
    public final InterfaceC6108l m24876h(int i) {
        IdentityArrayIntMap identityArrayIntMap = this.f14537f;
        if (identityArrayIntMap == null || m24869o()) {
            return null;
        }
        int m23694e = identityArrayIntMap.m23694e();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= m23694e) {
                break;
            }
            int i3 = i2 + 1;
            Objects.requireNonNull(identityArrayIntMap.m23695d()[i2], "null cannot be cast to non-null type kotlin.Any");
            if (identityArrayIntMap.m23693f()[i2] != i) {
                z = true;
                break;
            }
            i2 = i3;
        }
        if (z) {
            return new C5261a(i, identityArrayIntMap);
        }
        return null;
    }

    /* renamed from: i */
    public final C5159d m24875i() {
        return this.f14534c;
    }

    public void invalidate() {
        Composition composition = this.f14532a;
        if (composition == null) {
            return;
        }
        composition.m24983n(this, null);
    }

    /* renamed from: j */
    public final Composition m24874j() {
        return this.f14532a;
    }

    /* renamed from: k */
    public final boolean m24873k() {
        return (this.f14533b & 2) != 0;
    }

    /* renamed from: l */
    public final boolean m24872l() {
        return (this.f14533b & 4) != 0;
    }

    /* renamed from: m */
    public final boolean m24871m() {
        return (this.f14533b & 8) != 0;
    }

    /* renamed from: o */
    public final boolean m24869o() {
        return (this.f14533b & 16) != 0;
    }

    /* renamed from: p */
    public final boolean m24868p() {
        return (this.f14533b & 1) != 0;
    }

    /* renamed from: q */
    public final boolean m24867q() {
        if (this.f14532a != null) {
            C5159d c5159d = this.f14534c;
            return c5159d == null ? false : c5159d.m25510b();
        }
        return false;
    }

    /* renamed from: r */
    public final EnumC0646b m24866r(Object obj) {
        Composition composition = this.f14532a;
        EnumC0646b m24983n = composition == null ? null : composition.m24983n(this, obj);
        return m24983n == null ? EnumC0646b.IGNORED : m24983n;
    }

    /* renamed from: s */
    public final boolean m24865s(IdentityArraySet identityArraySet) {
        IdentityArrayMap identityArrayMap;
        boolean z;
        boolean z2;
        if (identityArraySet != null && (identityArrayMap = this.f14538g) != null && identityArraySet.m23677o()) {
            if (!identityArraySet.isEmpty()) {
                for (Object obj : identityArraySet) {
                    if ((obj instanceof InterfaceC5257v) && Intrinsics.equals(identityArrayMap.m23688d(obj), ((InterfaceC5257v) obj).getValue())) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: t */
    public final void m24864t(Object obj) {
        Intrinsics.isThisObjectNull(obj, "instance");
        if (m24870n()) {
            return;
        }
        IdentityArrayIntMap identityArrayIntMap = this.f14537f;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.f14537f = identityArrayIntMap;
        }
        identityArrayIntMap.m23698a(obj, this.f14536e);
        if (obj instanceof InterfaceC5257v) {
            IdentityArrayMap identityArrayMap = this.f14538g;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap(0, 1, null);
                this.f14538g = identityArrayMap;
            }
            identityArrayMap.m23682j(obj, ((InterfaceC5257v) obj).mo24892a());
        }
    }

    /* renamed from: u */
    public final void m24863u() {
        IdentityArrayIntMap identityArrayIntMap;
        Composition composition = this.f14532a;
        if (composition == null || (identityArrayIntMap = this.f14537f) == null) {
            return;
        }
        m24887B(true);
        try {
            int m23694e = identityArrayIntMap.m23694e();
            int i = 0;
            while (i < m23694e) {
                int i2 = i + 1;
                Object obj = identityArrayIntMap.m23695d()[i];
                if (obj != null) {
                    int i3 = identityArrayIntMap.m23693f()[i];
                    composition.mo24917p(obj);
                    i = i2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
            }
        } finally {
            m24887B(false);
        }
    }

    /* renamed from: v */
    public final void m24862v() {
        m24886C(true);
    }

    /* renamed from: w */
    public final void m24861w(C5159d c5159d) {
        this.f14534c = c5159d;
    }

    /* renamed from: x */
    public final void m24860x(Composition composition) {
        this.f14532a = composition;
    }

    /* renamed from: y */
    public final void m24859y(boolean z) {
        if (z) {
            this.f14533b |= 2;
        } else {
            this.f14533b &= -3;
        }
    }

    /* renamed from: z */
    public final void m24858z(boolean z) {
        if (z) {
            this.f14533b |= 4;
        } else {
            this.f14533b &= -5;
        }
    }
}
