package p071e0;

import id.InterfaceC6097a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p092f0.InterfaceC5269z0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p220ld.C7037c;
import p373u0.C10781l;
import p392v.C10988p;
import p393v0.C11002c;
import p393v0.Color;
import p393v0.InterfaceC11064u;
import p433x0.InterfaceC12238c;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* compiled from: Ripple.android.kt */
/* renamed from: e0.a */
/* loaded from: classes.dex */
public final class C4907a extends AbstractC4928m implements InterfaceC5269z0 {

    /* renamed from: A */
    private final InterfaceC5242r1 f13621A;

    /* renamed from: B */
    private final C4923i f13622B;

    /* renamed from: C */
    private final InterfaceC5220m0 f13623C;

    /* renamed from: D */
    private final InterfaceC5220m0 f13624D;

    /* renamed from: E */
    private long f13625E;

    /* renamed from: F */
    private int f13626F;

    /* renamed from: G */
    private final InterfaceC6097a f13627G;

    /* renamed from: x */
    private final boolean f13628x;

    /* renamed from: y */
    private final float f13629y;

    /* renamed from: z */
    private final InterfaceC5242r1 f13630z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ripple.android.kt */
    /* renamed from: e0.a$a */
    /* loaded from: classes.dex */
    public static final class C4908a extends AbstractC6438m implements InterfaceC6097a {
        C4908a() {
            super(0);
        }

        /* renamed from: a */
        public final void m26308a() {
            C4907a c4907a = C4907a.this;
            C4907a.m26315j(c4907a, !C4907a.m26316i(c4907a));
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m26308a();
            return C13195u.f34156a;
        }
    }

    private C4907a(boolean z, float f, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, C4923i c4923i) {
        super(z, interfaceC5242r12);
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        this.f13628x = z;
        this.f13629y = f;
        this.f13630z = interfaceC5242r1;
        this.f13621A = interfaceC5242r12;
        this.f13622B = c4923i;
        m24962d = C5232o1.m24962d(null, null, 2, null);
        this.f13623C = m24962d;
        m24962d2 = C5232o1.m24962d(Boolean.TRUE, null, 2, null);
        this.f13624D = m24962d2;
        this.f13625E = C10781l.f27885b.m7086b();
        this.f13626F = -1;
        this.f13627G = new C4908a();
    }

    public /* synthetic */ C4907a(boolean z, float f, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, C4923i c4923i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC5242r1, interfaceC5242r12, c4923i);
    }

    /* renamed from: i */
    public static final /* synthetic */ boolean m26316i(C4907a c4907a) {
        return c4907a.m26313l();
    }

    /* renamed from: j */
    public static final /* synthetic */ void m26315j(C4907a c4907a, boolean z) {
        c4907a.m26310o(z);
    }

    /* renamed from: k */
    private final void m26314k() {
        this.f13622B.m26274a(this);
    }

    /* renamed from: l */
    private final boolean m26313l() {
        return ((Boolean) this.f13624D.getValue()).booleanValue();
    }

    /* renamed from: m */
    private final C4926l m26312m() {
        return (C4926l) this.f13623C.getValue();
    }

    /* renamed from: o */
    private final void m26310o(boolean z) {
        this.f13624D.setValue(Boolean.valueOf(z));
    }

    /* renamed from: p */
    private final void m26309p(C4926l c4926l) {
        this.f13623C.setValue(c4926l);
    }

    /* renamed from: a */
    public void mo24845a() {
    }

    /* renamed from: b */
    public void mo24844b() {
        m26314k();
    }

    /* renamed from: c */
    public void mo8303c(InterfaceC12238c interfaceC12238c) {
        int m898O;
        Intrinsics.isThisObjectNull(interfaceC12238c, "<this>");
        this.f13625E = interfaceC12238c.m3263a();
        if (Float.isNaN(this.f13629y)) {
            m898O = C7037c.m19530c(C4922h.m26276a(interfaceC12238c, this.f13628x, interfaceC12238c.m3263a()));
        } else {
            m898O = interfaceC12238c.m898O(this.f13629y);
        }
        this.f13626F = m898O;
        long m6638v = ((Color) this.f13630z.getValue()).m6638v();
        float m26295d = ((C4914f) this.f13621A.getValue()).m26295d();
        interfaceC12238c.mo3277g0();
        m26261f(interfaceC12238c, this.f13629y, m6638v);
        InterfaceC11064u mo3275b = interfaceC12238c.m3272B().mo3275b();
        m26313l();
        C4926l m26312m = m26312m();
        if (m26312m == null) {
            return;
        }
        m26312m.m26263f(interfaceC12238c.m3263a(), this.f13626F, m6638v, m26295d);
        m26312m.draw(C11002c.m6596c(mo3275b));
    }

    /* renamed from: d */
    public void m26318d(C10988p c10988p, InterfaceC10524i0 interfaceC10524i0) {
        Intrinsics.isThisObjectNull(c10988p, "interaction");
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        C4926l m26273b = this.f13622B.m26273b(this);
        m26273b.m26267b(c10988p, this.f13628x, this.f13625E, this.f13626F, ((Color) this.f13630z.getValue()).m6638v(), ((C4914f) this.f13621A.getValue()).m26295d(), this.f13627G);
        m26309p(m26273b);
    }

    /* renamed from: e */
    public void mo24843e() {
        m26314k();
    }

    /* renamed from: g */
    public void m26317g(C10988p c10988p) {
        Intrinsics.isThisObjectNull(c10988p, "interaction");
        C4926l m26312m = m26312m();
        if (m26312m == null) {
            return;
        }
        m26312m.m26264e();
    }

    /* renamed from: n */
    public final void m26311n() {
        m26309p(null);
    }
}
