package p410w;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9560a;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: Column.kt */
/* renamed from: w.l */
/* loaded from: classes.dex */
public final class C11473l implements InterfaceC11470k {

    /* renamed from: a */
    public static final C11473l f29399a = new C11473l();

    /* compiled from: InspectableValue.kt */
    /* renamed from: w.l$a */
    /* loaded from: classes.dex */
    public static final class C11474a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC9560a.InterfaceC9562b f29400w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11474a(InterfaceC9560a.InterfaceC9562b interfaceC9562b) {
            super(1);
            this.f29400w = interfaceC9562b;
        }

        /* renamed from: a */
        public final void m5037a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("align");
            c0816w0.m39490c(this.f29400w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5037a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    private C11473l() {
    }

    /* renamed from: a */
    public InterfaceC9570f mo5046a(InterfaceC9570f interfaceC9570f, InterfaceC9560a.InterfaceC9562b interfaceC9562b) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC9562b, "alignment");
        return interfaceC9570f.mo7205u(new C11485p(interfaceC9562b, C0812v0.m39495c() ? new C11474a(interfaceC9562b) : C0812v0.m39497a()));
    }
}
