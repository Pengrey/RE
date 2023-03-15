package androidx.compose.p018ui.platform;

import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: InspectableValue.kt */
/* renamed from: androidx.compose.ui.platform.v0 */
/* loaded from: classes.dex */
public final class C0812v0 {

    /* renamed from: a */
    private static final InterfaceC6108l f2428a = C0813a.f2431w;

    /* renamed from: b */
    private static boolean f2429b;

    /* renamed from: c */
    public static final /* synthetic */ int f2430c = 0;

    /* compiled from: InspectableValue.kt */
    /* renamed from: androidx.compose.ui.platform.v0$a */
    /* loaded from: classes.dex */
    static final class C0813a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C0813a f2431w = new C0813a();

        C0813a() {
            super(1);
        }

        /* renamed from: a */
        public final void m39494a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m39494a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC6108l m39497a() {
        return f2428a;
    }

    /* renamed from: b */
    public static final InterfaceC9570f m39496b(InterfaceC9570f interfaceC9570f, InterfaceC6108l interfaceC6108l, InterfaceC9570f interfaceC9570f2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC6108l, "inspectorInfo");
        Intrinsics.isThisObjectNull(interfaceC9570f2, "wrapped");
        C0808u0 c0808u0 = new C0808u0(interfaceC6108l);
        return interfaceC9570f.mo7205u(c0808u0).mo7205u(interfaceC9570f2).mo7205u(c0808u0.m39503b());
    }

    /* renamed from: c */
    public static final boolean m39495c() {
        return f2429b;
    }
}
