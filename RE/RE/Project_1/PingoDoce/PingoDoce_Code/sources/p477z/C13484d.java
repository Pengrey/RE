package p477z;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5264x;
import p127h1.C5811y;
import p127h1.InterfaceC5776j;
import p149i1.InterfaceC5991e;
import p149i1.ModifierLocalConsumer;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: BringIntoViewRequester.kt */
/* renamed from: z.d */
/* loaded from: classes.dex */
public final class C13484d {

    /* compiled from: InspectableValue.kt */
    /* renamed from: z.d$a */
    /* loaded from: classes.dex */
    public static final class C13485a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC13480b f34290w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13485a(InterfaceC13480b interfaceC13480b) {
            super(1);
            this.f34290w = interfaceC13480b;
        }

        /* renamed from: a */
        public final void m1283a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("bringIntoViewRequester");
            c0816w0.m39492a().m39649b("bringIntoViewRequester", this.f34290w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1283a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BringIntoViewRequester.kt */
    /* renamed from: z.d$b */
    /* loaded from: classes.dex */
    public static final class C13486b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC13480b f34291w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BringIntoViewRequester.kt */
        /* renamed from: z.d$b$a */
        /* loaded from: classes.dex */
        public static final class C13487a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC13480b f34292w;

            /* renamed from: x */
            final /* synthetic */ BringIntoViewRequester f34293x;

            /* compiled from: Effects.kt */
            /* renamed from: z.d$b$a$a */
            /* loaded from: classes.dex */
            public static final class C13488a implements InterfaceC5264x {

                /* renamed from: a */
                final /* synthetic */ InterfaceC13480b f34294a;

                /* renamed from: b */
                final /* synthetic */ BringIntoViewRequester f34295b;

                public C13488a(InterfaceC13480b interfaceC13480b, BringIntoViewRequester bringIntoViewRequester) {
                    this.f34294a = interfaceC13480b;
                    this.f34295b = bringIntoViewRequester;
                }

                /* renamed from: b */
                public void mo24852b() {
                    ((C13482c) this.f34294a).m1286b().m23644u(this.f34295b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13487a(InterfaceC13480b interfaceC13480b, BringIntoViewRequester bringIntoViewRequester) {
                super(1);
                this.f34292w = interfaceC13480b;
                this.f34293x = bringIntoViewRequester;
            }

            /* renamed from: a */
            public final InterfaceC5264x mo9587d(C5266y c5266y) {
                Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                ((C13482c) this.f34292w).m1286b().m23659c(this.f34293x);
                return new C13488a(this.f34292w, this.f34293x);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BringIntoViewRequester.kt */
        /* renamed from: z.d$b$b */
        /* loaded from: classes.dex */
        public static final class C13489b extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ BringIntoViewRequester f34296w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13489b(BringIntoViewRequester bringIntoViewRequester) {
                super(1);
                this.f34296w = bringIntoViewRequester;
            }

            /* renamed from: a */
            public final void m1278a(InterfaceC5776j interfaceC5776j) {
                Intrinsics.isThisObjectNull(interfaceC5776j, "it");
                this.f34296w.m1291d(interfaceC5776j);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m1278a((InterfaceC5776j) obj);
                return C13195u.f34156a;
            }
        }

        /* compiled from: BringIntoViewRequester.kt */
        /* renamed from: z.d$b$c */
        /* loaded from: classes.dex */
        public static final class C13490c implements ModifierLocalConsumer {

            /* renamed from: w */
            final /* synthetic */ BringIntoViewRequester f34297w;

            C13490c(BringIntoViewRequester bringIntoViewRequester) {
                this.f34297w = bringIntoViewRequester;
            }

            /* renamed from: C */
            public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
                return ModifierLocalConsumer.C5989a.m22452a(this, interfaceC6108l);
            }

            /* renamed from: K */
            public void m1276K(InterfaceC5991e interfaceC5991e) {
                Intrinsics.isThisObjectNull(interfaceC5991e, "scope");
                this.f34297w.m1290e((BringIntoViewResponder) interfaceC5991e.mo22443t(BringIntoViewResponder.f34298v.m1270a()));
            }

            /* renamed from: V */
            public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
                return ModifierLocalConsumer.C5989a.m22450c(this, obj, interfaceC6112p);
            }

            /* renamed from: o */
            public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
                return ModifierLocalConsumer.C5989a.m22451b(this, obj, interfaceC6112p);
            }

            /* renamed from: u */
            public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
                return ModifierLocalConsumer.C5989a.m22449d(this, interfaceC9570f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13486b(InterfaceC13480b interfaceC13480b) {
            super(3);
            this.f34291w = interfaceC13480b;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m1281a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m1281a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-1614341944);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            if (mo25262h == c5180a.m25243a()) {
                mo25262h = new BringIntoViewRequester(new C13494f(), null, null, 6, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) mo25262h;
            interfaceC5179i.mo25263g(-1614341844);
            InterfaceC13480b interfaceC13480b = this.f34291w;
            if (interfaceC13480b instanceof C13482c) {
                Effects.m25541a(interfaceC13480b, new C13487a(interfaceC13480b, bringIntoViewRequester), interfaceC5179i, 0);
            }
            interfaceC5179i.mo25282C();
            InterfaceC9570f m22982a = C5811y.m22982a(C13495g.m1262b(InterfaceC9570f.f25164r, bringIntoViewRequester.m1294a()), new C13489b(bringIntoViewRequester));
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h2 = interfaceC5179i.mo25262h();
            if (mo25262h2 == c5180a.m25243a()) {
                mo25262h2 = new C13490c(bringIntoViewRequester);
                interfaceC5179i.mo25247w(mo25262h2);
            }
            interfaceC5179i.mo25282C();
            InterfaceC9570f mo7205u = m22982a.mo7205u((InterfaceC9570f) mo25262h2);
            interfaceC5179i.mo25282C();
            return mo7205u;
        }
    }

    /* renamed from: a */
    public static final InterfaceC13480b m1285a() {
        return new C13482c();
    }

    /* renamed from: b */
    public static final InterfaceC9570f m1284b(InterfaceC9570f interfaceC9570f, InterfaceC13480b interfaceC13480b) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC13480b, "bringIntoViewRequester");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C13485a(interfaceC13480b) : C0812v0.m39497a(), new C13486b(interfaceC13480b));
    }
}
