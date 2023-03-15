package p127h1;

import id.InterfaceC6113q;
import p092f0.C5262w1;
import p092f0.Composer;
import p092f0.InterfaceC5179i;
import p169j1.ComposeUiNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p229m0.ComposableLambda;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: h1.p */
/* loaded from: classes.dex */
public final class Layout {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Layout.kt */
    /* renamed from: h1.p$a */
    /* loaded from: classes.dex */
    public static final class C5801a extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9570f f16132w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5801a(InterfaceC9570f interfaceC9570f) {
            super(3);
            this.f16132w = interfaceC9570f;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m23013a(((Composer) obj).m25512f(), (InterfaceC5179i) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m23013a(InterfaceC5179i interfaceC5179i, InterfaceC5179i interfaceC5179i2, int i) {
            Intrinsics.isThisObjectNull(interfaceC5179i, "$this$null");
            InterfaceC9570f m10580b = C9567e.m10580b(interfaceC5179i2, this.f16132w);
            interfaceC5179i.mo25263g(509942095);
            C5262w1.m24854c(C5262w1.m24856a(interfaceC5179i), m10580b, ComposeUiNode.f17063o.m21772e());
            interfaceC5179i.mo25282C();
        }
    }

    /* renamed from: a */
    public static final InterfaceC6113q m23014a(InterfaceC9570f interfaceC9570f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "modifier");
        return ComposableLambda.m19326c(-985542424, true, new C5801a(interfaceC9570f));
    }
}
