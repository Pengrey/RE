package p127h1;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: LayoutId.kt */
/* renamed from: h1.m */
/* loaded from: classes.dex */
public final class C5797m {

    /* compiled from: InspectableValue.kt */
    /* renamed from: h1.m$a */
    /* loaded from: classes.dex */
    public static final class C5798a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Object f16131w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5798a(Object obj) {
            super(1);
            this.f16131w = obj;
        }

        /* renamed from: a */
        public final void m23018a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("layoutId");
            c0816w0.m39490c(this.f16131w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m23018a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final Object m23020a(InterfaceC5803r interfaceC5803r) {
        Intrinsics.isThisObjectNull(interfaceC5803r, "<this>");
        Object mo23120x = interfaceC5803r.mo23120x();
        InterfaceC5799n interfaceC5799n = mo23120x instanceof InterfaceC5799n ? (InterfaceC5799n) mo23120x : null;
        if (interfaceC5799n == null) {
            return null;
        }
        return interfaceC5799n.mo23017a();
    }

    /* renamed from: b */
    public static final InterfaceC9570f m23019b(InterfaceC9570f interfaceC9570f, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(obj, "layoutId");
        return interfaceC9570f.mo7205u(new LayoutId(obj, C0812v0.m39495c() ? new C5798a(obj) : C0812v0.m39497a()));
    }
}
