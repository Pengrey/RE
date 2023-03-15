package p358t0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import p092f0.C5232o1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: t0.b */
/* loaded from: classes.dex */
public final class FocusChangedModifier {

    /* compiled from: InspectableValue.kt */
    /* renamed from: t0.b$a */
    /* loaded from: classes.dex */
    public static final class C10322a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26898w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10322a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26898w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m8282a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("onFocusChanged");
            c0816w0.m39492a().m39649b("onFocusChanged", this.f26898w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8282a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FocusChangedModifier.kt */
    /* renamed from: t0.b$b */
    /* loaded from: classes.dex */
    public static final class C10323b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26899w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FocusChangedModifier.kt */
        /* renamed from: t0.b$b$a */
        /* loaded from: classes.dex */
        public static final class C10324a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f26900w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6108l f26901x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10324a(InterfaceC5220m0 interfaceC5220m0, InterfaceC6108l interfaceC6108l) {
                super(1);
                this.f26900w = interfaceC5220m0;
                this.f26901x = interfaceC6108l;
            }

            /* renamed from: a */
            public final void m8280a(InterfaceC10352u interfaceC10352u) {
                Intrinsics.isThisObjectNull(interfaceC10352u, "it");
                if (Intrinsics.equals(this.f26900w.getValue(), interfaceC10352u)) {
                    return;
                }
                this.f26900w.setValue(interfaceC10352u);
                this.f26901x.mo9587d(interfaceC10352u);
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m8280a((InterfaceC10352u) obj);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10323b(InterfaceC6108l interfaceC6108l) {
            super(3);
            this.f26899w = interfaceC6108l;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8281a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m8281a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-610209312);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = C5232o1.m24962d(null, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            InterfaceC9570f m8249a = C10329f.m8249a(InterfaceC9570f.f25164r, new C10324a((InterfaceC5220m0) mo25262h, this.f26899w));
            interfaceC5179i.mo25282C();
            return m8249a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8283a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onFocusChanged");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10322a(interfaceC6108l) : C0812v0.m39497a(), new C10323b(interfaceC6108l));
    }
}
