package p358t0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: FocusEventModifier.kt */
/* renamed from: t0.f */
/* loaded from: classes.dex */
public final class C10329f {

    /* compiled from: InspectableValue.kt */
    /* renamed from: t0.f$a */
    /* loaded from: classes.dex */
    public static final class C10330a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l f26913w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10330a(InterfaceC6108l interfaceC6108l) {
            super(1);
            this.f26913w = interfaceC6108l;
        }

        /* renamed from: a */
        public final void m8248a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("onFocusEvent");
            c0816w0.m39492a().m39649b("onFocusEvent", this.f26913w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8248a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m8249a(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onFocusEvent");
        return interfaceC9570f.mo7205u(new C10328e(interfaceC6108l, C0812v0.m39495c() ? new C10330a(interfaceC6108l) : C0812v0.m39497a()));
    }
}
