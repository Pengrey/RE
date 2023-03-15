package p052d1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: KeyInputModifier.kt */
/* renamed from: d1.f */
/* loaded from: classes.dex */
public final class C4704f {

    /* compiled from: InspectableValue.kt */
    /* renamed from: d1.f$a */
    /* loaded from: classes.dex */
    public static final class C4705a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f12833w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4705a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f12833w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m26894a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("onKeyEvent");
            c0816w0.m39492a().m39649b("onKeyEvent", this.f12833w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m26894a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m26895a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onKeyEvent");
        InterfaceC6108l c4705a = C0812v0.m39495c() ? new C4705a(interfaceC6108l) : C0812v0.m39497a();
        InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
        return C0812v0.m39496b(interfaceC9570f, c4705a, new KeyInputModifier(interfaceC6108l, null));
    }
}
