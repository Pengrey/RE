package p092f0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: Composer.kt */
/* renamed from: f0.w1 */
/* loaded from: classes.dex */
public final class C5262w1<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: f0.w1$a */
    /* loaded from: classes.dex */
    public static final class C5263a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f14542w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5263a(InterfaceC6108l interfaceC6108l) {
            super(2);
            this.f14542w = interfaceC6108l;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m24853a(obj, (C13195u) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m24853a(Object obj, C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            this.f14542w.mo9587d(obj);
        }
    }

    /* renamed from: a */
    public static InterfaceC5179i m24856a(InterfaceC5179i interfaceC5179i) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "composer");
        return interfaceC5179i;
    }

    /* renamed from: b */
    public static final void m24855b(InterfaceC5179i interfaceC5179i, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "arg0");
        Intrinsics.isThisObjectNull(interfaceC6108l, "block");
        if (interfaceC5179i.mo25254p()) {
            interfaceC5179i.mo25277H(C13195u.f34156a, new C5263a(interfaceC6108l));
        }
    }

    /* renamed from: c */
    public static final void m24854c(InterfaceC5179i interfaceC5179i, Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC5179i, "arg0");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        if (interfaceC5179i.mo25254p() || !Intrinsics.equals(interfaceC5179i.mo25262h(), obj)) {
            interfaceC5179i.mo25247w(obj);
            interfaceC5179i.mo25277H(obj, interfaceC6112p);
        }
    }
}
