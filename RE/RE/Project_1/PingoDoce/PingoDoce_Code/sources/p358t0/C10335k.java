package p358t0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import p092f0.InterfaceC5179i;
import p149i1.C5992f;
import p149i1.ModifierLocal;
import p149i1.ModifierLocalProvider;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: FocusModifier.kt */
/* renamed from: t0.k */
/* loaded from: classes.dex */
public final class C10335k {

    /* renamed from: a */
    private static final C5992f f26922a = ModifierLocal.m22448a(C10336a.f26924w);

    /* renamed from: b */
    private static final InterfaceC9570f f26923b = InterfaceC9570f.f25164r.mo7205u(new C10337b()).mo7205u(new C10338c());

    /* compiled from: FocusModifier.kt */
    /* renamed from: t0.k$a */
    /* loaded from: classes.dex */
    static final class C10336a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C10336a f26924w = new C10336a();

        C10336a() {
            super(0);
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: FocusModifier.kt */
    /* renamed from: t0.k$b */
    /* loaded from: classes.dex */
    public static final class C10337b implements ModifierLocalProvider {
        C10337b() {
        }

        /* renamed from: C */
        public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
            return ModifierLocalProvider.C5990a.m22447a(this, interfaceC6108l);
        }

        /* renamed from: V */
        public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
            return ModifierLocalProvider.C5990a.m22445c(this, obj, interfaceC6112p);
        }

        /* renamed from: a */
        public InterfaceC10344p mo41263getValue() {
            return C10321a.f26897a;
        }

        public C5992f getKey() {
            return FocusProperties.m8199b();
        }

        /* renamed from: o */
        public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
            return ModifierLocalProvider.C5990a.m22446b(this, obj, interfaceC6112p);
        }

        /* renamed from: u */
        public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
            return ModifierLocalProvider.C5990a.m22444d(this, interfaceC9570f);
        }
    }

    /* compiled from: FocusModifier.kt */
    /* renamed from: t0.k$c */
    /* loaded from: classes.dex */
    public static final class C10338c implements ModifierLocalProvider {
        C10338c() {
        }

        /* renamed from: C */
        public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
            return ModifierLocalProvider.C5990a.m22447a(this, interfaceC6108l);
        }

        /* renamed from: V */
        public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
            return ModifierLocalProvider.C5990a.m22445c(this, obj, interfaceC6112p);
        }

        /* renamed from: a */
        public Boolean mo41263getValue() {
            return Boolean.FALSE;
        }

        public C5992f getKey() {
            return C10335k.m8221c();
        }

        /* renamed from: o */
        public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
            return ModifierLocalProvider.C5990a.m22446b(this, obj, interfaceC6112p);
        }

        /* renamed from: u */
        public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
            return ModifierLocalProvider.C5990a.m22444d(this, interfaceC9570f);
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: t0.k$d */
    /* loaded from: classes.dex */
    public static final class C10339d extends AbstractC6438m implements InterfaceC6108l {
        public C10339d() {
            super(1);
        }

        /* renamed from: a */
        public final void m8217a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("focusTarget");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8217a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusModifier.kt */
    /* renamed from: t0.k$e */
    /* loaded from: classes.dex */
    public static final class C10340e extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        public static final C10340e f26925w = new C10340e();

        C10340e() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8216a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m8216a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(1906540397);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new FocusModifier(EnumC10353v.Inactive, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            InterfaceC9570f m8222b = C10335k.m8222b(interfaceC9570f, (FocusModifier) mo25262h);
            interfaceC5179i.mo25282C();
            return m8222b;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8223a(InterfaceC9570f interfaceC9570f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10339d() : C0812v0.m39497a(), C10340e.f26925w);
    }

    /* renamed from: b */
    public static final InterfaceC9570f m8222b(InterfaceC9570f interfaceC9570f, FocusModifier focusModifier) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(focusModifier, "focusModifier");
        return interfaceC9570f.mo7205u(focusModifier).mo7205u(f26923b);
    }

    /* renamed from: c */
    public static final C5992f m8221c() {
        return f26922a;
    }
}
