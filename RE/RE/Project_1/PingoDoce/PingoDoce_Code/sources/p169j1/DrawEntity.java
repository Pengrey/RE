package p169j1;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p127h1.MeasureScope;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p346s0.InterfaceC10022a;
import p346s0.InterfaceC10023d;
import p346s0.InterfaceC10024e;
import p393v0.InterfaceC11064u;
import p433x0.CanvasDrawScope;
import p468yc.C13195u;
import p479z1.C13617n;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: j1.e */
/* loaded from: classes.dex */
public final class DrawEntity implements InterfaceC6257g0 {

    /* renamed from: D */
    private static final InterfaceC6108l f17115D;

    /* renamed from: A */
    private final InterfaceC10022a f17116A;

    /* renamed from: B */
    private boolean f17117B;

    /* renamed from: C */
    private final InterfaceC6097a f17118C;

    /* renamed from: w */
    private final LayoutNodeWrapper f17119w;

    /* renamed from: x */
    private final InterfaceC10024e f17120x;

    /* renamed from: y */
    private DrawEntity f17121y;

    /* renamed from: z */
    private InterfaceC10023d f17122z;

    /* compiled from: DrawEntity.kt */
    /* renamed from: j1.e$a */
    /* loaded from: classes.dex */
    static final class C6246a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6246a f17123w = new C6246a();

        C6246a() {
            super(1);
        }

        /* renamed from: a */
        public final void m21678a(DrawEntity drawEntity) {
            Intrinsics.isThisObjectNull(drawEntity, "drawEntity");
            if (drawEntity.mo21638k()) {
                DrawEntity.m21689d(drawEntity, true);
                drawEntity.m21686g().m21362p1();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21678a((DrawEntity) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: DrawEntity.kt */
    /* renamed from: j1.e$b */
    /* loaded from: classes.dex */
    public static final class C6247b {
        private C6247b() {
        }

        public /* synthetic */ C6247b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DrawEntity.kt */
    /* renamed from: j1.e$c */
    /* loaded from: classes.dex */
    public static final class C6248c implements InterfaceC10022a {

        /* renamed from: a */
        private final Density f17124a;

        C6248c() {
            this.f17124a = DrawEntity.m21690c(DrawEntity.this).m21573K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DrawEntity.kt */
    /* renamed from: j1.e$d */
    /* loaded from: classes.dex */
    public static final class C6249d extends AbstractC6438m implements InterfaceC6097a {
        C6249d() {
            super(0);
        }

        /* renamed from: a */
        public final void m21677a() {
            InterfaceC10023d m21691b = DrawEntity.m21691b(DrawEntity.this);
            if (m21691b != null) {
                m21691b.m9378F(DrawEntity.m21692a(DrawEntity.this));
            }
            DrawEntity.m21689d(DrawEntity.this, false);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21677a();
            return C13195u.f34156a;
        }
    }

    static {
        new C6247b(null);
        f17115D = C6246a.f17123w;
    }

    public DrawEntity(LayoutNodeWrapper layoutNodeWrapper, InterfaceC10024e interfaceC10024e) {
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "layoutNodeWrapper");
        Intrinsics.isThisObjectNull(interfaceC10024e, "modifier");
        this.f17119w = layoutNodeWrapper;
        this.f17120x = interfaceC10024e;
        this.f17122z = m21679o();
        this.f17116A = new C6248c();
        this.f17117B = true;
        this.f17118C = new C6249d();
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC10022a m21692a(DrawEntity drawEntity) {
        return drawEntity.f17116A;
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC10023d m21691b(DrawEntity drawEntity) {
        return drawEntity.f17122z;
    }

    /* renamed from: c */
    public static final /* synthetic */ LayoutNode m21690c(DrawEntity drawEntity) {
        return drawEntity.m21687f();
    }

    /* renamed from: d */
    public static final /* synthetic */ void m21689d(DrawEntity drawEntity, boolean z) {
        drawEntity.f17117B = z;
    }

    /* renamed from: f */
    private final LayoutNode m21687f() {
        return this.f17119w.m21378c1();
    }

    /* renamed from: j */
    private final long m21683j() {
        return this.f17119w.mo23107b();
    }

    /* renamed from: o */
    private final InterfaceC10023d m21679o() {
        InterfaceC10024e interfaceC10024e = this.f17120x;
        if (interfaceC10024e instanceof InterfaceC10023d) {
            return (InterfaceC10023d) interfaceC10024e;
        }
        return null;
    }

    /* renamed from: e */
    public final void m21688e(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "canvas");
        long m818b = C13617n.m818b(m21683j());
        if (this.f17122z != null && this.f17117B) {
            C6284n.m21433a(m21687f()).getSnapshotObserver().m21610e(this, f17115D, this.f17118C);
        }
        LayoutNodeDrawScope m21559R = m21687f().m21559R();
        LayoutNodeWrapper layoutNodeWrapper = this.f17119w;
        DrawEntity m21437n = LayoutNodeDrawScope.m21437n(m21559R);
        LayoutNodeDrawScope.m21436o(m21559R, this);
        CanvasDrawScope m21438k = LayoutNodeDrawScope.m21438k(m21559R);
        MeasureScope m21376e1 = layoutNodeWrapper.m21376e1();
        EnumC13618o layoutDirection = layoutNodeWrapper.m21376e1().getLayoutDirection();
        CanvasDrawScope.C12234a m3299q = m21438k.m3299q();
        Density m3293a = m3299q.m3293a();
        EnumC13618o m3292b = m3299q.m3292b();
        InterfaceC11064u m3291c = m3299q.m3291c();
        long m3290d = m3299q.m3290d();
        CanvasDrawScope.C12234a m3299q2 = m21438k.m3299q();
        m3299q2.m3284j(m21376e1);
        m3299q2.m3283k(layoutDirection);
        m3299q2.m3285i(interfaceC11064u);
        m3299q2.m3282l(m818b);
        interfaceC11064u.m6269h();
        m21685h().m9377p(m21559R);
        interfaceC11064u.m6270g();
        CanvasDrawScope.C12234a m3299q3 = m21438k.m3299q();
        m3299q3.m3284j(m3293a);
        m3299q3.m3283k(m3292b);
        m3299q3.m3285i(m3291c);
        m3299q3.m3282l(m3290d);
        LayoutNodeDrawScope.m21436o(m21559R, m21437n);
    }

    /* renamed from: g */
    public final LayoutNodeWrapper m21686g() {
        return this.f17119w;
    }

    /* renamed from: h */
    public final InterfaceC10024e m21685h() {
        return this.f17120x;
    }

    /* renamed from: i */
    public final DrawEntity m21684i() {
        return this.f17121y;
    }

    /* renamed from: k */
    public boolean mo21638k() {
        return this.f17119w.mo23109S();
    }

    /* renamed from: l */
    public final void m21682l() {
        this.f17122z = m21679o();
        this.f17117B = true;
        DrawEntity drawEntity = this.f17121y;
        if (drawEntity == null) {
            return;
        }
        drawEntity.m21682l();
    }

    /* renamed from: m */
    public final void m21681m(int i, int i2) {
        this.f17117B = true;
        DrawEntity drawEntity = this.f17121y;
        if (drawEntity == null) {
            return;
        }
        drawEntity.m21681m(i, i2);
    }

    /* renamed from: n */
    public final void m21680n(DrawEntity drawEntity) {
        this.f17121y = drawEntity;
    }
}
