package p410w;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* renamed from: w.s */
/* loaded from: classes.dex */
public final class Offset {

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.s$a */
    /* loaded from: classes.dex */
    public static final class C11488a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f29413w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11488a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f29413w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m5004a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("offset");
            c0816w0.m39492a().m39649b("offset", this.f29413w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5004a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m5005a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "offset");
        return interfaceC9570f.mo7205u(new C11489t(interfaceC6108l, true, C0812v0.m39495c() ? new C11488a(interfaceC6108l) : C0812v0.m39497a()));
    }
}
