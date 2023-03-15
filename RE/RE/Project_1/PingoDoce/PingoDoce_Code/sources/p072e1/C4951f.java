package p072e1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import bd.C1894h;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p072e1.InterfaceC4949e;
import p092f0.C5240r;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* compiled from: NestedScrollModifier.kt */
/* renamed from: e1.f */
/* loaded from: classes.dex */
public final class C4951f {

    /* compiled from: InspectableValue.kt */
    /* renamed from: e1.f$a */
    /* loaded from: classes.dex */
    public static final class C4952a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ NestedScrollModifier f13747w;

        /* renamed from: x */
        final /* synthetic */ C4945d f13748x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4952a(NestedScrollModifier nestedScrollModifier, C4945d c4945d) {
            super(1);
            this.f13747w = nestedScrollModifier;
            this.f13748x = c4945d;
        }

        /* renamed from: a */
        public final void m26191a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("nestedScroll");
            c0816w0.m39492a().m39649b("connection", this.f13747w);
            c0816w0.m39492a().m39649b("dispatcher", this.f13748x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m26191a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NestedScrollModifier.kt */
    /* renamed from: e1.f$b */
    /* loaded from: classes.dex */
    public static final class C4953b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ C4945d f13749w;

        /* renamed from: x */
        final /* synthetic */ NestedScrollModifier f13750x;

        /* compiled from: NestedScrollModifier.kt */
        /* renamed from: e1.f$b$a */
        /* loaded from: classes.dex */
        public static final class C4954a implements InterfaceC4949e {

            /* renamed from: A */
            final /* synthetic */ InterfaceC10524i0 f13751A;

            /* renamed from: w */
            private final C4945d f13752w;

            /* renamed from: x */
            private final NestedScrollModifier f13753x;

            /* renamed from: y */
            final /* synthetic */ C4945d f13754y;

            /* renamed from: z */
            final /* synthetic */ NestedScrollModifier f13755z;

            C4954a(C4945d c4945d, NestedScrollModifier nestedScrollModifier, InterfaceC10524i0 interfaceC10524i0) {
                this.f13754y = c4945d;
                this.f13755z = nestedScrollModifier;
                this.f13751A = interfaceC10524i0;
                c4945d.m26201j(interfaceC10524i0);
                this.f13752w = c4945d;
                this.f13753x = nestedScrollModifier;
            }

            /* renamed from: C */
            public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
                return InterfaceC4949e.C4950a.m26196a(this, interfaceC6108l);
            }

            /* renamed from: V */
            public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
                return InterfaceC4949e.C4950a.m26194c(this, obj, interfaceC6112p);
            }

            /* renamed from: a0 */
            public C4945d m26189a0() {
                return this.f13752w;
            }

            /* renamed from: k */
            public NestedScrollModifier m26188k() {
                return this.f13753x;
            }

            /* renamed from: o */
            public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
                return InterfaceC4949e.C4950a.m26195b(this, obj, interfaceC6112p);
            }

            /* renamed from: u */
            public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
                return InterfaceC4949e.C4950a.m26193d(this, interfaceC9570f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4953b(C4945d c4945d, NestedScrollModifier nestedScrollModifier) {
            super(3);
            this.f13749w = c4945d;
            this.f13750x = nestedScrollModifier;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m26190a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m26190a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(100476458);
            interfaceC5179i.mo25263g(-723524056);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            if (mo25262h == c5180a.m25243a()) {
                Object c5240r = new C5240r(Effects.m25533i(C1894h.f5621w, interfaceC5179i));
                interfaceC5179i.mo25247w(c5240r);
                mo25262h = c5240r;
            }
            interfaceC5179i.mo25282C();
            InterfaceC10524i0 m24924c = ((C5240r) mo25262h).m24924c();
            interfaceC5179i.mo25282C();
            C4945d c4945d = this.f13749w;
            interfaceC5179i.mo25263g(100476571);
            if (c4945d == null) {
                interfaceC5179i.mo25263g(-3687241);
                Object mo25262h2 = interfaceC5179i.mo25262h();
                if (mo25262h2 == c5180a.m25243a()) {
                    mo25262h2 = new C4945d();
                    interfaceC5179i.mo25247w(mo25262h2);
                }
                interfaceC5179i.mo25282C();
                c4945d = (C4945d) mo25262h2;
            }
            interfaceC5179i.mo25282C();
            NestedScrollModifier nestedScrollModifier = this.f13750x;
            interfaceC5179i.mo25263g(-3686095);
            boolean mo25276I = interfaceC5179i.mo25276I(nestedScrollModifier) | interfaceC5179i.mo25276I(c4945d) | interfaceC5179i.mo25276I(m24924c);
            Object mo25262h3 = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h3 == c5180a.m25243a()) {
                mo25262h3 = new C4954a(c4945d, nestedScrollModifier, m24924c);
                interfaceC5179i.mo25247w(mo25262h3);
            }
            interfaceC5179i.mo25282C();
            C4954a c4954a = (C4954a) mo25262h3;
            interfaceC5179i.mo25282C();
            return c4954a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m26192a(InterfaceC9570f interfaceC9570f, NestedScrollModifier nestedScrollModifier, C4945d c4945d) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(nestedScrollModifier, "connection");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C4952a(nestedScrollModifier, c4945d) : C0812v0.m39497a(), new C4953b(c4945d, nestedScrollModifier));
    }
}
