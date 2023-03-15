package p372u;

import androidx.compose.foundation.gestures.EnumC0627a;
import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.C5209j1;
import p092f0.C5232o1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p092f0.InterfaceC5264x;
import p093f1.C5293i0;
import p093f1.C5307n;
import p093f1.C5318u;
import p093f1.InterfaceC5274c;
import p093f1.InterfaceC5276c0;
import p113g1.C5596f;
import p113g1.C5597g;
import p181jd.AbstractC6438m;
import p181jd.C6446v;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p372u.AbstractC10690i;
import p373u0.C10774f;
import p373u0.C10776g;
import p392v.C10974b;
import p392v.DragInteraction;
import p392v.InterfaceC10987m;
import p404vd.C11226h;
import p404vd.InterfaceC11222e;
import p404vd.InterfaceC11244w;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p479z1.C13624s;
import td.C10531j0;
import td.InterfaceC10524i0;

/* compiled from: Draggable.kt */
/* renamed from: u.m */
/* loaded from: classes.dex */
public final class C10730m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt", m20196f = "Draggable.kt", m20195l = {309, 318, 327, 329}, m20194m = "awaitDownAndSlop")
    /* renamed from: u.m$a */
    /* loaded from: classes.dex */
    public static final class C10731a extends AbstractC6757d {

        /* renamed from: A */
        Object f27736A;

        /* renamed from: B */
        /* synthetic */ Object f27737B;

        /* renamed from: C */
        int f27738C;

        /* renamed from: w */
        Object f27739w;

        /* renamed from: x */
        Object f27740x;

        /* renamed from: y */
        Object f27741y;

        /* renamed from: z */
        Object f27742z;

        C10731a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27737B = obj;
            this.f27738C |= Integer.MIN_VALUE;
            return C10730m.m7258b(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    /* renamed from: u.m$b */
    /* loaded from: classes.dex */
    public static final class C10732b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ C5596f f27743w;

        /* renamed from: x */
        final /* synthetic */ C6446v f27744x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10732b(C5596f c5596f, C6446v c6446v) {
            super(2);
            this.f27743w = c5596f;
            this.f27744x = c6446v;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m7245a((C5318u) obj, ((Number) obj2).floatValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m7245a(C5318u c5318u, float f) {
            Intrinsics.isThisObjectNull(c5318u, "event");
            C5597g.m23617a(this.f27743w, c5318u);
            C5307n.m24697g(c5318u);
            this.f27744x.f17530w = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    /* renamed from: u.m$c */
    /* loaded from: classes.dex */
    public static final class C10733c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C5596f f27745w;

        /* renamed from: x */
        final /* synthetic */ EnumC0627a f27746x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC11244w f27747y;

        /* renamed from: z */
        final /* synthetic */ boolean f27748z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10733c(C5596f c5596f, EnumC0627a enumC0627a, InterfaceC11244w interfaceC11244w, boolean z) {
            super(1);
            this.f27745w = c5596f;
            this.f27746x = enumC0627a;
            this.f27747y = interfaceC11244w;
            this.f27748z = z;
        }

        /* renamed from: a */
        public final void m7244a(C5318u c5318u) {
            Intrinsics.isThisObjectNull(c5318u, "event");
            C5597g.m23617a(this.f27745w, c5318u);
            float m7256d = C10730m.m7256d(C5307n.m24694j(c5318u), this.f27746x);
            C5307n.m24697g(c5318u);
            InterfaceC11244w interfaceC11244w = this.f27747y;
            if (this.f27748z) {
                m7256d *= -1;
            }
            interfaceC11244w.mo5641i(new AbstractC10690i.C10692b(m7256d, c5318u.m24651h(), null));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m7244a((C5318u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: u.m$d */
    /* loaded from: classes.dex */
    public static final class C10734d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ InterfaceC10987m f27749A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6097a f27750B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC6113q f27751C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6113q f27752D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC6112p f27753E;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f27754w;

        /* renamed from: x */
        final /* synthetic */ EnumC0627a f27755x;

        /* renamed from: y */
        final /* synthetic */ boolean f27756y;

        /* renamed from: z */
        final /* synthetic */ boolean f27757z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10734d(InterfaceC6108l interfaceC6108l, EnumC0627a enumC0627a, boolean z, boolean z2, InterfaceC10987m interfaceC10987m, InterfaceC6097a interfaceC6097a, InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, InterfaceC6112p interfaceC6112p) {
            super(1);
            this.f27754w = interfaceC6108l;
            this.f27755x = enumC0627a;
            this.f27756y = z;
            this.f27757z = z2;
            this.f27749A = interfaceC10987m;
            this.f27750B = interfaceC6097a;
            this.f27751C = interfaceC6113q;
            this.f27752D = interfaceC6113q2;
            this.f27753E = interfaceC6112p;
        }

        /* renamed from: a */
        public final void m7243a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("draggable");
            c0816w0.m39492a().m39649b("canDrag", this.f27754w);
            c0816w0.m39492a().m39649b("orientation", this.f27755x);
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f27756y));
            c0816w0.m39492a().m39649b("reverseDirection", Boolean.valueOf(this.f27757z));
            c0816w0.m39492a().m39649b("interactionSource", this.f27749A);
            c0816w0.m39492a().m39649b("startDragImmediately", this.f27750B);
            c0816w0.m39492a().m39649b("onDragStarted", this.f27751C);
            c0816w0.m39492a().m39649b("onDragStopped", this.f27752D);
            c0816w0.m39492a().m39649b("stateFactory", this.f27753E);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m7243a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$1", m20196f = "Draggable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.m$e */
    /* loaded from: classes.dex */
    public static final class C10735e extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: x */
        int f27758x;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10735e(InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7242d((InterfaceC10524i0) obj, ((C10774f) obj2).m7137s(), (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m7242d(InterfaceC10524i0 interfaceC10524i0, long j, InterfaceC1886d interfaceC1886d) {
            return new C10735e(interfaceC1886d).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27758x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$2", m20196f = "Draggable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.m$f */
    /* loaded from: classes.dex */
    public static final class C10736f extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: x */
        int f27759x;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10736f(InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7241d((InterfaceC10524i0) obj, ((Number) obj2).floatValue(), (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m7241d(InterfaceC10524i0 interfaceC10524i0, float f, InterfaceC1886d interfaceC1886d) {
            return new C10736f(interfaceC1886d).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27759x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    /* renamed from: u.m$g */
    /* loaded from: classes.dex */
    public static final class C10737g extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10751n f27760w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10737g(InterfaceC10751n interfaceC10751n) {
            super(2);
            this.f27760w = interfaceC10751n;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m7240a((InterfaceC5179i) obj, ((Number) obj2).intValue());
        }

        /* renamed from: a */
        public final InterfaceC10766x m7240a(InterfaceC5179i interfaceC5179i, int i) {
            interfaceC5179i.mo25263g(-1197727804);
            InterfaceC10751n interfaceC10751n = this.f27760w;
            interfaceC5179i.mo25263g(-3686930);
            boolean mo25276I = interfaceC5179i.mo25276I(interfaceC10751n);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C10758r(interfaceC10751n);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            C10758r c10758r = (C10758r) mo25262h;
            interfaceC5179i.mo25282C();
            return c10758r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    /* renamed from: u.m$h */
    /* loaded from: classes.dex */
    public static final class C10738h extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C10738h f27761w = new C10738h();

        C10738h() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(C5318u c5318u) {
            Intrinsics.isThisObjectNull(c5318u, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    /* renamed from: u.m$i */
    /* loaded from: classes.dex */
    public static final class C10739i extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ boolean f27762w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10739i(boolean z) {
            super(0);
            this.f27762w = z;
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.valueOf(this.f27762w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$6", m20196f = "Draggable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.m$j */
    /* loaded from: classes.dex */
    public static final class C10740j extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: x */
        int f27763x;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10740j(InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7237d((InterfaceC10524i0) obj, ((C10774f) obj2).m7137s(), (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m7237d(InterfaceC10524i0 interfaceC10524i0, long j, InterfaceC1886d interfaceC1886d) {
            return new C10740j(interfaceC1886d).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27763x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$7", m20196f = "Draggable.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: u.m$k */
    /* loaded from: classes.dex */
    public static final class C10741k extends AbstractC6764l implements InterfaceC6113q {

        /* renamed from: x */
        int f27764x;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C10741k(InterfaceC1886d interfaceC1886d) {
            super(3, interfaceC1886d);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7236d((InterfaceC10524i0) obj, ((Number) obj2).floatValue(), (InterfaceC1886d) obj3);
        }

        /* renamed from: d */
        public final Object m7236d(InterfaceC10524i0 interfaceC10524i0, float f, InterfaceC1886d interfaceC1886d) {
            return new C10741k(interfaceC1886d).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f27764x == 0) {
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Draggable.kt */
    /* renamed from: u.m$l */
    /* loaded from: classes.dex */
    public static final class C10742l extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6113q f27765A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6113q f27766B;

        /* renamed from: C */
        final /* synthetic */ EnumC0627a f27767C;

        /* renamed from: D */
        final /* synthetic */ boolean f27768D;

        /* renamed from: E */
        final /* synthetic */ boolean f27769E;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f27770w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10987m f27771x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6097a f27772y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6108l f27773z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Draggable.kt */
        /* renamed from: u.m$l$a */
        /* loaded from: classes.dex */
        public static final class C10743a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f27774w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10987m f27775x;

            /* compiled from: Effects.kt */
            /* renamed from: u.m$l$a$a */
            /* loaded from: classes.dex */
            public static final class C10744a implements InterfaceC5264x {

                /* renamed from: a */
                final /* synthetic */ InterfaceC5220m0 f27776a;

                /* renamed from: b */
                final /* synthetic */ InterfaceC10987m f27777b;

                public C10744a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                    this.f27776a = interfaceC5220m0;
                    this.f27777b = interfaceC10987m;
                }

                /* renamed from: b */
                public void mo24852b() {
                    C10974b c10974b = (C10974b) this.f27776a.getValue();
                    if (c10974b == null) {
                        return;
                    }
                    InterfaceC10987m interfaceC10987m = this.f27777b;
                    if (interfaceC10987m != null) {
                        interfaceC10987m.mo6671b(new DragInteraction(c10974b));
                    }
                    this.f27776a.setValue(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10743a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                super(1);
                this.f27774w = interfaceC5220m0;
                this.f27775x = interfaceC10987m;
            }

            /* renamed from: a */
            public final InterfaceC5264x mo9587d(C5266y c5266y) {
                Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                return new C10744a(this.f27774w, this.f27775x);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Draggable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", m20196f = "Draggable.kt", m20195l = {237, 239, 241, 251, 253, 257}, m20194m = "invokeSuspend")
        /* renamed from: u.m$l$b */
        /* loaded from: classes.dex */
        public static final class C10745b extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            private /* synthetic */ Object f27778A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC11222e f27779B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC10766x f27780C;

            /* renamed from: D */
            final /* synthetic */ InterfaceC5242r1 f27781D;

            /* renamed from: x */
            Object f27782x;

            /* renamed from: y */
            Object f27783y;

            /* renamed from: z */
            int f27784z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Draggable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", m20196f = "Draggable.kt", m20195l = {246}, m20194m = "invokeSuspend")
            /* renamed from: u.m$l$b$a */
            /* loaded from: classes.dex */
            public static final class C10746a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ C6449y f27785A;

                /* renamed from: B */
                final /* synthetic */ InterfaceC11222e f27786B;

                /* renamed from: x */
                Object f27787x;

                /* renamed from: y */
                int f27788y;

                /* renamed from: z */
                private /* synthetic */ Object f27789z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10746a(C6449y c6449y, InterfaceC11222e interfaceC11222e, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f27785A = c6449y;
                    this.f27786B = interfaceC11222e;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    C10746a c10746a = new C10746a(this.f27785A, this.f27786B, interfaceC1886d);
                    c10746a.f27789z = obj;
                    return c10746a;
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10765w interfaceC10765w, InterfaceC1886d interfaceC1886d) {
                    return ((C10746a) create(interfaceC10765w, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005f -> B:24:0x0065). Please submit an issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = cd.C2111b.m34640d()
                        int r1 = r8.f27788y
                        r2 = 1
                        if (r1 == 0) goto L23
                        if (r1 != r2) goto L1b
                        java.lang.Object r1 = r8.f27787x
                        jd.y r1 = (p181jd.C6449y) r1
                        java.lang.Object r3 = r8.f27789z
                        u.w r3 = (p372u.InterfaceC10765w) r3
                        p468yc.C13186n.m1453b(r9)
                        r4 = r3
                        r3 = r1
                        r1 = r0
                        r0 = r8
                        goto L65
                    L1b:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L23:
                        p468yc.C13186n.m1453b(r9)
                        java.lang.Object r9 = r8.f27789z
                        u.w r9 = (p372u.InterfaceC10765w) r9
                        r3 = r9
                        r9 = r8
                    L2c:
                        jd.y r1 = r9.f27785A
                        T r1 = r1.f17533w
                        boolean r4 = r1 instanceof p372u.AbstractC10690i.C10694d
                        if (r4 != 0) goto L6b
                        boolean r4 = r1 instanceof p372u.AbstractC10690i.C10691a
                        if (r4 != 0) goto L6b
                        boolean r4 = r1 instanceof p372u.AbstractC10690i.C10692b
                        if (r4 == 0) goto L3f
                        u.i$b r1 = (p372u.AbstractC10690i.C10692b) r1
                        goto L40
                    L3f:
                        r1 = 0
                    L40:
                        if (r1 != 0) goto L43
                        goto L4e
                    L43:
                        float r4 = r1.m7314a()
                        long r5 = r1.m7313b()
                        r3.mo7191b(r4, r5)
                    L4e:
                        jd.y r1 = r9.f27785A
                        vd.e r4 = r9.f27786B
                        r9.f27789z = r3
                        r9.f27787x = r1
                        r9.f27788y = r2
                        java.lang.Object r4 = r4.mo5652g(r9)
                        if (r4 != r0) goto L5f
                        return r0
                    L5f:
                        r7 = r0
                        r0 = r9
                        r9 = r4
                        r4 = r3
                        r3 = r1
                        r1 = r7
                    L65:
                        r3.f17533w = r9
                        r9 = r0
                        r0 = r1
                        r3 = r4
                        goto L2c
                    L6b:
                        yc.u r9 = p468yc.C13195u.f34156a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p372u.C10730m.C10742l.C10745b.C10746a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10745b(InterfaceC11222e interfaceC11222e, InterfaceC10766x interfaceC10766x, InterfaceC5242r1 interfaceC5242r1, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27779B = interfaceC11222e;
                this.f27780C = interfaceC10766x;
                this.f27781D = interfaceC5242r1;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10745b c10745b = new C10745b(this.f27779B, this.f27780C, this.f27781D, interfaceC1886d);
                c10745b.f27778A = obj;
                return c10745b;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10745b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[Catch: CancellationException -> 0x0104, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:39:0x00cc, B:41:0x00d8, B:46:0x00ee, B:48:0x00f2), top: B:67:0x00cc }] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[Catch: CancellationException -> 0x0104, TryCatch #3 {CancellationException -> 0x0104, blocks: (B:39:0x00cc, B:41:0x00d8, B:46:0x00ee, B:48:0x00f2), top: B:67:0x00cc }] */
            /* JADX WARN: Removed duplicated region for block: B:56:0x011b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
            /* JADX WARN: Type inference failed for: r10v12, types: [T] */
            /* JADX WARN: Type inference failed for: r10v21 */
            /* JADX WARN: Type inference failed for: r10v29 */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v35 */
            /* JADX WARN: Type inference failed for: r1v43 */
            /* JADX WARN: Type inference failed for: r1v44 */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0093 -> B:22:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e9 -> B:22:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0100 -> B:22:0x0068). Please submit an issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011c -> B:22:0x0068). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 310
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p372u.C10730m.C10742l.C10745b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Draggable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", m20196f = "Draggable.kt", m20195l = {263}, m20194m = "invokeSuspend")
        /* renamed from: u.m$l$c */
        /* loaded from: classes.dex */
        public static final class C10747c extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC5242r1 f27790A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC5242r1 f27791B;

            /* renamed from: C */
            final /* synthetic */ EnumC0627a f27792C;

            /* renamed from: D */
            final /* synthetic */ InterfaceC11222e f27793D;

            /* renamed from: E */
            final /* synthetic */ boolean f27794E;

            /* renamed from: x */
            int f27795x;

            /* renamed from: y */
            private /* synthetic */ Object f27796y;

            /* renamed from: z */
            final /* synthetic */ boolean f27797z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Draggable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1", m20196f = "Draggable.kt", m20195l = {264}, m20194m = "invokeSuspend")
            /* renamed from: u.m$l$c$a */
            /* loaded from: classes.dex */
            public static final class C10748a extends AbstractC6764l implements InterfaceC6112p {

                /* renamed from: A */
                final /* synthetic */ InterfaceC5242r1 f27798A;

                /* renamed from: B */
                final /* synthetic */ InterfaceC5242r1 f27799B;

                /* renamed from: C */
                final /* synthetic */ EnumC0627a f27800C;

                /* renamed from: D */
                final /* synthetic */ InterfaceC11222e f27801D;

                /* renamed from: E */
                final /* synthetic */ boolean f27802E;

                /* renamed from: x */
                int f27803x;

                /* renamed from: y */
                private /* synthetic */ Object f27804y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC5276c0 f27805z;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Draggable.kt */
                @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1", m20196f = "Draggable.kt", m20195l = {265}, m20194m = "invokeSuspend")
                /* renamed from: u.m$l$c$a$a */
                /* loaded from: classes.dex */
                public static final class C10749a extends AbstractC6764l implements InterfaceC6112p {

                    /* renamed from: A */
                    final /* synthetic */ InterfaceC5242r1 f27806A;

                    /* renamed from: B */
                    final /* synthetic */ EnumC0627a f27807B;

                    /* renamed from: C */
                    final /* synthetic */ InterfaceC11222e f27808C;

                    /* renamed from: D */
                    final /* synthetic */ boolean f27809D;

                    /* renamed from: E */
                    final /* synthetic */ InterfaceC10524i0 f27810E;

                    /* renamed from: x */
                    int f27811x;

                    /* renamed from: y */
                    private /* synthetic */ Object f27812y;

                    /* renamed from: z */
                    final /* synthetic */ InterfaceC5242r1 f27813z;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: Draggable.kt */
                    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3$1$1$1", m20196f = "Draggable.kt", m20195l = {267, 275}, m20194m = "invokeSuspend")
                    /* renamed from: u.m$l$c$a$a$a */
                    /* loaded from: classes.dex */
                    public static final class C10750a extends AbstractC6763k implements InterfaceC6112p {

                        /* renamed from: A */
                        boolean f27814A;

                        /* renamed from: B */
                        int f27815B;

                        /* renamed from: C */
                        int f27816C;

                        /* renamed from: D */
                        private /* synthetic */ Object f27817D;

                        /* renamed from: E */
                        final /* synthetic */ InterfaceC5242r1 f27818E;

                        /* renamed from: F */
                        final /* synthetic */ InterfaceC5242r1 f27819F;

                        /* renamed from: G */
                        final /* synthetic */ EnumC0627a f27820G;

                        /* renamed from: H */
                        final /* synthetic */ InterfaceC11222e f27821H;

                        /* renamed from: I */
                        final /* synthetic */ boolean f27822I;

                        /* renamed from: J */
                        final /* synthetic */ InterfaceC10524i0 f27823J;

                        /* renamed from: x */
                        Object f27824x;

                        /* renamed from: y */
                        Object f27825y;

                        /* renamed from: z */
                        Object f27826z;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C10750a(InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, EnumC0627a enumC0627a, InterfaceC11222e interfaceC11222e, boolean z, InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                            super(2, interfaceC1886d);
                            this.f27818E = interfaceC5242r1;
                            this.f27819F = interfaceC5242r12;
                            this.f27820G = enumC0627a;
                            this.f27821H = interfaceC11222e;
                            this.f27822I = z;
                            this.f27823J = interfaceC10524i0;
                        }

                        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                            C10750a c10750a = new C10750a(this.f27818E, this.f27819F, this.f27820G, this.f27821H, this.f27822I, this.f27823J, interfaceC1886d);
                            c10750a.f27817D = obj;
                            return c10750a;
                        }

                        /* renamed from: d */
                        public final Object mo39856d(InterfaceC5274c interfaceC5274c, InterfaceC1886d interfaceC1886d) {
                            return ((C10750a) create(interfaceC5274c, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
                        /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
                        /* JADX WARN: Removed duplicated region for block: B:58:0x00f6 A[Catch: all -> 0x00f7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00f7, blocks: (B:53:0x00e8, B:58:0x00f6), top: B:71:0x00e8 }] */
                        /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
                        /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                            /*
                                Method dump skipped, instructions count: 276
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p372u.C10730m.C10742l.C10747c.C10748a.C10749a.C10750a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C10749a(InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, EnumC0627a enumC0627a, InterfaceC11222e interfaceC11222e, boolean z, InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                        super(2, interfaceC1886d);
                        this.f27813z = interfaceC5242r1;
                        this.f27806A = interfaceC5242r12;
                        this.f27807B = enumC0627a;
                        this.f27808C = interfaceC11222e;
                        this.f27809D = z;
                        this.f27810E = interfaceC10524i0;
                    }

                    public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                        C10749a c10749a = new C10749a(this.f27813z, this.f27806A, this.f27807B, this.f27808C, this.f27809D, this.f27810E, interfaceC1886d);
                        c10749a.f27812y = obj;
                        return c10749a;
                    }

                    /* renamed from: d */
                    public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
                        return ((C10749a) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object m34636d;
                        m34636d = C2116d.m34636d();
                        int i = this.f27811x;
                        if (i == 0) {
                            C13186n.m1453b(obj);
                            C10750a c10750a = new C10750a(this.f27813z, this.f27806A, this.f27807B, this.f27808C, this.f27809D, this.f27810E, null);
                            this.f27811x = 1;
                            if (((InterfaceC5276c0) this.f27812y).mo24820Z(c10750a, this) == m34636d) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10748a(InterfaceC5276c0 interfaceC5276c0, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, EnumC0627a enumC0627a, InterfaceC11222e interfaceC11222e, boolean z, InterfaceC1886d interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f27805z = interfaceC5276c0;
                    this.f27798A = interfaceC5242r1;
                    this.f27799B = interfaceC5242r12;
                    this.f27800C = enumC0627a;
                    this.f27801D = interfaceC11222e;
                    this.f27802E = z;
                }

                public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                    C10748a c10748a = new C10748a(this.f27805z, this.f27798A, this.f27799B, this.f27800C, this.f27801D, this.f27802E, interfaceC1886d);
                    c10748a.f27804y = obj;
                    return c10748a;
                }

                /* renamed from: d */
                public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                    return ((C10748a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f27803x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f27804y;
                        InterfaceC5276c0 interfaceC5276c0 = this.f27805z;
                        C10749a c10749a = new C10749a(this.f27798A, this.f27799B, this.f27800C, this.f27801D, this.f27802E, interfaceC10524i0, null);
                        this.f27803x = 1;
                        if (ForEachGesture.m7214d(interfaceC5276c0, c10749a, this) == m34636d) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10747c(boolean z, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, EnumC0627a enumC0627a, InterfaceC11222e interfaceC11222e, boolean z2, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f27797z = z;
                this.f27790A = interfaceC5242r1;
                this.f27791B = interfaceC5242r12;
                this.f27792C = enumC0627a;
                this.f27793D = interfaceC11222e;
                this.f27794E = z2;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10747c c10747c = new C10747c(this.f27797z, this.f27790A, this.f27791B, this.f27792C, this.f27793D, this.f27794E, interfaceC1886d);
                c10747c.f27796y = obj;
                return c10747c;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
                return ((C10747c) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f27795x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC5276c0 interfaceC5276c0 = (InterfaceC5276c0) this.f27796y;
                    if (!this.f27797z) {
                        return C13195u.f34156a;
                    }
                    C10748a c10748a = new C10748a(interfaceC5276c0, this.f27790A, this.f27791B, this.f27792C, this.f27793D, this.f27794E, null);
                    this.f27795x = 1;
                    if (C10531j0.m7768d(c10748a, this) == m34636d) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10742l(InterfaceC6112p interfaceC6112p, InterfaceC10987m interfaceC10987m, InterfaceC6097a interfaceC6097a, InterfaceC6108l interfaceC6108l, InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, EnumC0627a enumC0627a, boolean z, boolean z2) {
            super(3);
            this.f27770w = interfaceC6112p;
            this.f27771x = interfaceC10987m;
            this.f27772y = interfaceC6097a;
            this.f27773z = interfaceC6108l;
            this.f27765A = interfaceC6113q;
            this.f27766B = interfaceC6113q2;
            this.f27767C = enumC0627a;
            this.f27768D = z;
            this.f27769E = z2;
        }

        /* renamed from: a */
        public static final /* synthetic */ C10725k m7235a(InterfaceC5242r1 interfaceC5242r1) {
            return m7233c(interfaceC5242r1);
        }

        /* renamed from: c */
        private static final C10725k m7233c(InterfaceC5242r1 interfaceC5242r1) {
            return (C10725k) interfaceC5242r1.getValue();
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m7234b((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: b */
        public final InterfaceC9570f m7234b(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-1197726397);
            InterfaceC10766x interfaceC10766x = (InterfaceC10766x) this.f27770w.mo39856d(interfaceC5179i, 0);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            if (mo25262h == c5180a.m25243a()) {
                mo25262h = C5232o1.m24962d(null, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
            InterfaceC10987m interfaceC10987m = this.f27771x;
            Effects.m25541a(interfaceC10987m, new C10743a(interfaceC5220m0, interfaceC10987m), interfaceC5179i, 0);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h2 = interfaceC5179i.mo25262h();
            if (mo25262h2 == c5180a.m25243a()) {
                mo25262h2 = C11226h.m5692b(Reader.READ_DONE, null, null, 6, null);
                interfaceC5179i.mo25247w(mo25262h2);
            }
            interfaceC5179i.mo25282C();
            InterfaceC11222e interfaceC11222e = (InterfaceC11222e) mo25262h2;
            InterfaceC5242r1 m25067k = C5209j1.m25067k(this.f27772y, interfaceC5179i, 0);
            InterfaceC5242r1 m25067k2 = C5209j1.m25067k(this.f27773z, interfaceC5179i, 0);
            Effects.m25539c(interfaceC10766x, new C10745b(interfaceC11222e, interfaceC10766x, C5209j1.m25067k(new C10725k(this.f27765A, this.f27766B, interfaceC5220m0, this.f27771x), interfaceC5179i, 0), null), interfaceC5179i, 0);
            InterfaceC9570f m24737d = C5293i0.m24737d(InterfaceC9570f.f25164r, new Object[]{this.f27767C, Boolean.valueOf(this.f27768D), Boolean.valueOf(this.f27769E)}, new C10747c(this.f27768D, m25067k2, m25067k, this.f27767C, interfaceC11222e, this.f27769E, null));
            interfaceC5179i.mo25282C();
            return m24737d;
        }
    }

    /* renamed from: a */
    public static final InterfaceC10751n m7259a(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDelta");
        return new Draggable(interfaceC6108l);
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m7258b(InterfaceC5274c interfaceC5274c, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, C5596f c5596f, EnumC0627a enumC0627a, InterfaceC1886d interfaceC1886d) {
        return m7254f(interfaceC5274c, interfaceC5242r1, interfaceC5242r12, c5596f, enumC0627a, interfaceC1886d);
    }

    /* renamed from: c */
    public static final /* synthetic */ Object m7257c(InterfaceC5274c interfaceC5274c, C13182l c13182l, C5596f c5596f, InterfaceC11244w interfaceC11244w, boolean z, EnumC0627a enumC0627a, InterfaceC1886d interfaceC1886d) {
        return m7253g(interfaceC5274c, c13182l, c5596f, interfaceC11244w, z, enumC0627a, interfaceC1886d);
    }

    /* renamed from: d */
    public static final /* synthetic */ float m7256d(long j, EnumC0627a enumC0627a) {
        return m7248l(j, enumC0627a);
    }

    /* renamed from: e */
    public static final /* synthetic */ float m7255e(long j, EnumC0627a enumC0627a) {
        return m7247m(j, enumC0627a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.Object m7254f(p093f1.InterfaceC5274c r9, p092f0.InterfaceC5242r1 r10, p092f0.InterfaceC5242r1 r11, p113g1.C5596f r12, androidx.compose.foundation.gestures.EnumC0627a r13, bd.InterfaceC1886d r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p372u.C10730m.m7254f(f1.c, f0.r1, f0.r1, g1.f, androidx.compose.foundation.gestures.a, bd.d):java.lang.Object");
    }

    /* renamed from: g */
    private static final Object m7253g(InterfaceC5274c interfaceC5274c, C13182l c13182l, C5596f c5596f, InterfaceC11244w interfaceC11244w, boolean z, EnumC0627a enumC0627a, InterfaceC1886d interfaceC1886d) {
        float floatValue = ((Number) c13182l.m1459d()).floatValue();
        C5318u c5318u = (C5318u) c13182l.m1460c();
        long m7141o = C10774f.m7141o(c5318u.m24651h(), C10774f.m7139q(m7246n(floatValue, enumC0627a), Math.signum(m7248l(c5318u.m24651h(), enumC0627a))));
        interfaceC11244w.mo5641i(new AbstractC10690i.C10693c(m7141o, null));
        if (z) {
            floatValue *= -1;
        }
        interfaceC11244w.mo5641i(new AbstractC10690i.C10692b(floatValue, m7141o, null));
        C10733c c10733c = new C10733c(c5596f, enumC0627a, interfaceC11244w, z);
        if (enumC0627a == EnumC0627a.Vertical) {
            return DragGestureDetector.m7274l(interfaceC5274c, c5318u.m24652g(), c10733c, interfaceC1886d);
        }
        return DragGestureDetector.m7277i(interfaceC5274c, c5318u.m24652g(), c10733c, interfaceC1886d);
    }

    /* renamed from: h */
    public static final InterfaceC9570f m7252h(InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l, EnumC0627a enumC0627a, boolean z, InterfaceC10987m interfaceC10987m, InterfaceC6097a interfaceC6097a, InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, boolean z2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6112p, "stateFactory");
        Intrinsics.isThisObjectNull(interfaceC6108l, "canDrag");
        Intrinsics.isThisObjectNull(enumC0627a, "orientation");
        Intrinsics.isThisObjectNull(interfaceC6097a, "startDragImmediately");
        Intrinsics.isThisObjectNull(interfaceC6113q, "onDragStarted");
        Intrinsics.isThisObjectNull(interfaceC6113q2, "onDragStopped");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10734d(interfaceC6108l, enumC0627a, z, z2, interfaceC10987m, interfaceC6097a, interfaceC6113q, interfaceC6113q2, interfaceC6112p) : C0812v0.m39497a(), new C10742l(interfaceC6112p, interfaceC10987m, interfaceC6097a, interfaceC6108l, interfaceC6113q, interfaceC6113q2, enumC0627a, z, z2));
    }

    /* renamed from: i */
    public static final InterfaceC9570f m7251i(InterfaceC9570f interfaceC9570f, InterfaceC10751n interfaceC10751n, EnumC0627a enumC0627a, boolean z, InterfaceC10987m interfaceC10987m, boolean z2, InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, boolean z3) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10751n, "state");
        Intrinsics.isThisObjectNull(enumC0627a, "orientation");
        Intrinsics.isThisObjectNull(interfaceC6113q, "onDragStarted");
        Intrinsics.isThisObjectNull(interfaceC6113q2, "onDragStopped");
        return m7252h(interfaceC9570f, new C10737g(interfaceC10751n), C10738h.f27761w, enumC0627a, z, interfaceC10987m, new C10739i(z2), interfaceC6113q, interfaceC6113q2, z3);
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC9570f m7250j(InterfaceC9570f interfaceC9570f, InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l, EnumC0627a enumC0627a, boolean z, InterfaceC10987m interfaceC10987m, InterfaceC6097a interfaceC6097a, InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, boolean z2, int i, Object obj) {
        return m7252h(interfaceC9570f, interfaceC6112p, interfaceC6108l, enumC0627a, (i & 8) != 0 ? true : z, (i & 16) != 0 ? null : interfaceC10987m, interfaceC6097a, (i & 64) != 0 ? new C10740j(null) : interfaceC6113q, (i & 128) != 0 ? new C10741k(null) : interfaceC6113q2, (i & 256) != 0 ? false : z2);
    }

    /* renamed from: k */
    public static /* synthetic */ InterfaceC9570f m7249k(InterfaceC9570f interfaceC9570f, InterfaceC10751n interfaceC10751n, EnumC0627a enumC0627a, boolean z, InterfaceC10987m interfaceC10987m, boolean z2, InterfaceC6113q interfaceC6113q, InterfaceC6113q interfaceC6113q2, boolean z3, int i, Object obj) {
        return m7251i(interfaceC9570f, interfaceC10751n, enumC0627a, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : interfaceC10987m, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? new C10735e(null) : interfaceC6113q, (i & 64) != 0 ? new C10736f(null) : interfaceC6113q2, (i & 128) != 0 ? false : z3);
    }

    /* renamed from: l */
    private static final float m7248l(long j, EnumC0627a enumC0627a) {
        return enumC0627a == EnumC0627a.Vertical ? C10774f.m7144l(j) : C10774f.m7145k(j);
    }

    /* renamed from: m */
    private static final float m7247m(long j, EnumC0627a enumC0627a) {
        return enumC0627a == EnumC0627a.Vertical ? C13624s.m779i(j) : C13624s.m780h(j);
    }

    /* renamed from: n */
    private static final long m7246n(float f, EnumC0627a enumC0627a) {
        return enumC0627a == EnumC0627a.Vertical ? C10776g.m7133a(0.0f, f) : C10776g.m7133a(f, 0.0f);
    }
}
