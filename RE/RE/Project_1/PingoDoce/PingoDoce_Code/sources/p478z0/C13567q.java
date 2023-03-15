package p478z0;

import androidx.compose.runtime.CompositionContext;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6114r;
import p092f0.C5175h;
import p092f0.C5231o;
import p092f0.C5232o1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5216l;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p373u0.C10781l;
import p393v0.ColorFilter;
import p433x0.DrawScope;
import p456y0.Painter;
import p468yc.C13195u;

/* compiled from: VectorPainter.kt */
/* renamed from: z0.q */
/* loaded from: classes.dex */
public final class C13567q extends Painter {

    /* renamed from: f */
    private final InterfaceC5220m0 f34533f;

    /* renamed from: g */
    private final C13529k f34534g;

    /* renamed from: h */
    private InterfaceC5216l f34535h;

    /* renamed from: i */
    private final InterfaceC5220m0 f34536i;

    /* renamed from: j */
    private float f34537j;

    /* renamed from: k */
    private ColorFilter f34538k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.q$a */
    /* loaded from: classes.dex */
    public static final class C13568a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5216l f34539w;

        /* compiled from: Effects.kt */
        /* renamed from: z0.q$a$a */
        /* loaded from: classes.dex */
        public static final class C13569a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ InterfaceC5216l f34540a;

            public C13569a(InterfaceC5216l interfaceC5216l) {
                this.f34540a = interfaceC5216l;
            }

            /* renamed from: b */
            public void mo24852b() {
                this.f34540a.mo25009b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13568a(InterfaceC5216l interfaceC5216l) {
            super(1);
            this.f34539w = interfaceC5216l;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            return new C13569a(this.f34539w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.q$b */
    /* loaded from: classes.dex */
    public static final class C13570b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6114r f34541A;

        /* renamed from: B */
        final /* synthetic */ int f34542B;

        /* renamed from: x */
        final /* synthetic */ String f34544x;

        /* renamed from: y */
        final /* synthetic */ float f34545y;

        /* renamed from: z */
        final /* synthetic */ float f34546z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13570b(String str, float f, float f2, InterfaceC6114r interfaceC6114r, int i) {
            super(2);
            this.f34544x = str;
            this.f34545y = f;
            this.f34546z = f2;
            this.f34541A = interfaceC6114r;
            this.f34542B = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m960a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m960a(InterfaceC5179i interfaceC5179i, int i) {
            C13567q.this.m972k(this.f34544x, this.f34545y, this.f34546z, this.f34541A, interfaceC5179i, this.f34542B | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.q$c */
    /* loaded from: classes.dex */
    public static final class C13571c extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6114r f34547w;

        /* renamed from: x */
        final /* synthetic */ C13567q f34548x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13571c(InterfaceC6114r interfaceC6114r, C13567q c13567q) {
            super(2);
            this.f34547w = interfaceC6114r;
            this.f34548x = c13567q;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m958a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m958a(InterfaceC5179i interfaceC5179i, int i) {
            if (((i & 11) ^ 2) == 0 && interfaceC5179i.mo25245y()) {
                interfaceC5179i.mo25264f();
            } else {
                this.f34547w.mo22157a0(Float.valueOf(C13567q.m971l(this.f34548x).m1057l()), Float.valueOf(C13567q.m971l(this.f34548x).m1058k()), interfaceC5179i, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* renamed from: z0.q$d */
    /* loaded from: classes.dex */
    public static final class C13572d extends AbstractC6438m implements InterfaceC6097a {
        C13572d() {
            super(0);
        }

        /* renamed from: a */
        public final void m957a() {
            C13567q.m970m(C13567q.this, true);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m957a();
            return C13195u.f34156a;
        }
    }

    public C13567q() {
        InterfaceC5220m0 m24962d;
        InterfaceC5220m0 m24962d2;
        m24962d = C5232o1.m24962d(C10781l.m7097c(C10781l.f27885b.m7086b()), null, 2, null);
        this.f34533f = m24962d;
        C13529k c13529k = new C13529k();
        c13529k.m1055n(new C13572d());
        this.f34534g = c13529k;
        m24962d2 = C5232o1.m24962d(Boolean.TRUE, null, 2, null);
        this.f34536i = m24962d2;
        this.f34537j = 1.0f;
    }

    /* renamed from: l */
    public static final /* synthetic */ C13529k m971l(C13567q c13567q) {
        return c13567q.f34534g;
    }

    /* renamed from: m */
    public static final /* synthetic */ void m970m(C13567q c13567q, boolean z) {
        c13567q.m966q(z);
    }

    /* renamed from: n */
    private final InterfaceC5216l m969n(CompositionContext compositionContext, InterfaceC6114r interfaceC6114r) {
        InterfaceC5216l interfaceC5216l = this.f34535h;
        if (interfaceC5216l == null || interfaceC5216l.mo25007q()) {
            interfaceC5216l = C5231o.m24969a(new VectorCompose(this.f34534g.m1059j()), compositionContext);
        }
        this.f34535h = interfaceC5216l;
        interfaceC5216l.mo25006r(ComposableLambda.m19326c(-985537011, true, new C13571c(interfaceC6114r, this)));
        return interfaceC5216l;
    }

    /* renamed from: p */
    private final boolean m967p() {
        return ((Boolean) this.f34536i.getValue()).booleanValue();
    }

    /* renamed from: q */
    private final void m966q(boolean z) {
        this.f34536i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    protected boolean m976a(float f) {
        this.f34537j = f;
        return true;
    }

    /* renamed from: b */
    protected boolean m975b(ColorFilter colorFilter) {
        this.f34538k = colorFilter;
        return true;
    }

    /* renamed from: h */
    public long m974h() {
        return m968o();
    }

    /* renamed from: j */
    protected void m973j(DrawScope drawScope) {
        Intrinsics.isThisObjectNull(drawScope, "<this>");
        C13529k c13529k = this.f34534g;
        float f = this.f34537j;
        ColorFilter colorFilter = this.f34538k;
        if (colorFilter == null) {
            colorFilter = c13529k.m1061h();
        }
        c13529k.m1062g(drawScope, f, colorFilter);
        if (m967p()) {
            m966q(false);
        }
    }

    /* renamed from: k */
    public final void m972k(String str, float f, float f2, InterfaceC6114r interfaceC6114r, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(interfaceC6114r, "content");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(625569543);
        C13529k c13529k = this.f34534g;
        c13529k.m1054o(str);
        c13529k.m1052q(f);
        c13529k.m1053p(f2);
        InterfaceC5216l m969n = m969n(C5175h.m25296d(mo25249u, 0), interfaceC6114r);
        Effects.m25541a(m969n, new C13568a(m969n), mo25249u, 8);
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C13570b(str, f, f2, interfaceC6114r, i));
    }

    /* renamed from: o */
    public final long m968o() {
        return ((C10781l) this.f34533f.getValue()).m7088l();
    }

    /* renamed from: r */
    public final void m965r(ColorFilter colorFilter) {
        this.f34534g.m1056m(colorFilter);
    }

    /* renamed from: s */
    public final void m964s(long j) {
        this.f34533f.setValue(C10781l.m7097c(j));
    }
}
