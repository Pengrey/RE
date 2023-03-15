package p432x;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;
import p127h1.InterfaceC5764e0;
import p127h1.RemeasurementModifier;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: x.p */
/* loaded from: classes.dex */
public final class LazyLayoutState {

    /* renamed from: a */
    private final InterfaceC5220m0 f32263a;

    /* renamed from: b */
    private InterfaceC12210b f32264b;

    /* renamed from: c */
    private InterfaceC5764e0 f32265c;

    /* renamed from: d */
    private final RemeasurementModifier f32266d;

    /* renamed from: e */
    private InterfaceC6097a f32267e;

    /* renamed from: f */
    private InterfaceC12221i f32268f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutState.kt */
    /* renamed from: x.p$a */
    /* loaded from: classes.dex */
    public static final class C12229a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C12229a f32269w = new C12229a();

        C12229a() {
            super(0);
        }

        /* renamed from: a */
        public final C12233s mo42214q() {
            return C12233s.f32271a;
        }
    }

    /* compiled from: LazyLayoutState.kt */
    /* renamed from: x.p$b */
    /* loaded from: classes.dex */
    public static final class C12230b implements RemeasurementModifier {
        C12230b() {
        }

        /* renamed from: C */
        public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
            return RemeasurementModifier.C5766a.m23127a(this, interfaceC6108l);
        }

        /* renamed from: V */
        public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
            return RemeasurementModifier.C5766a.m23125c(this, obj, interfaceC6112p);
        }

        /* renamed from: o */
        public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
            return RemeasurementModifier.C5766a.m23126b(this, obj, interfaceC6112p);
        }

        /* renamed from: t */
        public void m3327t(InterfaceC5764e0 interfaceC5764e0) {
            Intrinsics.isThisObjectNull(interfaceC5764e0, "remeasurement");
            LazyLayoutState.m3340a(LazyLayoutState.this, interfaceC5764e0);
        }

        /* renamed from: u */
        public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
            return RemeasurementModifier.C5766a.m23124d(this, interfaceC9570f);
        }
    }

    public LazyLayoutState() {
        InterfaceC5220m0 m24962d;
        m24962d = C5232o1.m24962d(C12209a.f32208a, null, 2, null);
        this.f32263a = m24962d;
        this.f32266d = new C12230b();
        this.f32267e = C12229a.f32269w;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m3340a(LazyLayoutState lazyLayoutState, InterfaceC5764e0 interfaceC5764e0) {
        lazyLayoutState.f32265c = interfaceC5764e0;
    }

    /* renamed from: b */
    public final InterfaceC6097a m3339b() {
        return this.f32267e;
    }

    /* renamed from: c */
    public final InterfaceC5220m0 m3338c() {
        return this.f32263a;
    }

    /* renamed from: d */
    public final InterfaceC12221i m3337d() {
        return this.f32268f;
    }

    /* renamed from: e */
    public final RemeasurementModifier m3336e() {
        return this.f32266d;
    }

    /* renamed from: f */
    public final C13195u m3335f() {
        InterfaceC5764e0 interfaceC5764e0 = this.f32265c;
        if (interfaceC5764e0 == null) {
            return null;
        }
        interfaceC5764e0.mo23130a();
        return C13195u.f34156a;
    }

    /* renamed from: g */
    public final void m3334g(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "<set-?>");
        this.f32267e = interfaceC6097a;
    }

    /* renamed from: h */
    public final void m3333h(InterfaceC12210b interfaceC12210b) {
        Intrinsics.isThisObjectNull(interfaceC12210b, "<set-?>");
        this.f32264b = interfaceC12210b;
    }

    /* renamed from: i */
    public final void m3332i(InterfaceC12221i interfaceC12221i) {
        this.f32268f = interfaceC12221i;
    }
}
