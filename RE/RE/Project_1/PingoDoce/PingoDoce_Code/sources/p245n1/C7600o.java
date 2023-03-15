package p245n1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: SemanticsModifier.kt */
/* renamed from: n1.o */
/* loaded from: classes.dex */
public final class C7600o {

    /* compiled from: InspectableValue.kt */
    /* renamed from: n1.o$a */
    /* loaded from: classes.dex */
    public static final class C7601a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ boolean f20122w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f20123x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7601a(boolean z, InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f20122w = z;
            this.f20123x = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m18014a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("semantics");
            c0816w0.m39492a().m39649b("mergeDescendants", Boolean.valueOf(this.f20122w));
            c0816w0.m39492a().m39649b("properties", this.f20123x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m18014a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsModifier.kt */
    /* renamed from: n1.o$b */
    /* loaded from: classes.dex */
    public static final class C7602b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ boolean f20124w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6108l f20125x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7602b(boolean z, InterfaceC6108l interfaceC6108l) {
            super(3);
            this.f20124w = z;
            this.f20125x = interfaceC6108l;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m18013a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m18013a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(2121191606);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = Integer.valueOf(C7598n.f20118y.m18017a());
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            C7598n c7598n = new C7598n(((Number) mo25262h).intValue(), this.f20124w, false, this.f20125x);
            interfaceC5179i.mo25282C();
            return c7598n;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m18016a(InterfaceC9570f interfaceC9570f, boolean z, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "properties");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C7601a(z, interfaceC6108l) : C0812v0.m39497a(), new C7602b(z, interfaceC6108l));
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9570f m18015b(InterfaceC9570f interfaceC9570f, boolean z, InterfaceC6108l interfaceC6108l, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m18016a(interfaceC9570f, z, interfaceC6108l);
    }
}
