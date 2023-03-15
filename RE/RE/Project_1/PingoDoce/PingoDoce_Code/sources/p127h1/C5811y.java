package p127h1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: OnGloballyPositionedModifier.kt */
/* renamed from: h1.y */
/* loaded from: classes.dex */
public final class C5811y {

    /* compiled from: InspectableValue.kt */
    /* renamed from: h1.y$a */
    /* loaded from: classes.dex */
    public static final class C5812a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f16142w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5812a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f16142w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m22981a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("onGloballyPositioned");
            c0816w0.m39492a().m39649b("onGloballyPositioned", this.f16142w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22981a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m22982a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onGloballyPositioned");
        return interfaceC9570f.mo7205u(new C5810x(interfaceC6108l, C0812v0.m39495c() ? new C5812a(interfaceC6108l) : C0812v0.m39497a()));
    }
}
