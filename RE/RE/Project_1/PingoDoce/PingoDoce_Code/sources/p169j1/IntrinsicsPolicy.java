package p169j1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.InterfaceC5220m0;
import p127h1.InterfaceC5804s;
import p181jd.Intrinsics;

/* renamed from: j1.i */
/* loaded from: classes.dex */
public final class IntrinsicsPolicy {

    /* renamed from: a */
    private InterfaceC5220m0 f17152a;

    /* renamed from: b */
    private InterfaceC5804s f17153b;

    /* compiled from: IntrinsicsPolicy.kt */
    /* renamed from: j1.i$a */
    /* loaded from: classes.dex */
    private static final class C6264a {
        private C6264a() {
        }

        public /* synthetic */ C6264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6264a(null);
    }

    public IntrinsicsPolicy(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
    }

    /* renamed from: a */
    public final void m21602a(InterfaceC5804s interfaceC5804s) {
        Intrinsics.isThisObjectNull(interfaceC5804s, "measurePolicy");
        InterfaceC5220m0 interfaceC5220m0 = this.f17152a;
        if (interfaceC5220m0 != null) {
            Intrinsics.ifNullDoSomething(interfaceC5220m0);
            interfaceC5220m0.setValue(interfaceC5804s);
            return;
        }
        this.f17153b = interfaceC5804s;
    }
}
