package p169j1;

import id.InterfaceC6108l;
import p093f1.PointerEvent;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: j1.i0 */
/* loaded from: classes.dex */
public final class PointerInputDelegatingWrapper extends DelegatingLayoutNodeWrapper {

    /* compiled from: PointerInputDelegatingWrapper.kt */
    /* renamed from: j1.i0$a */
    /* loaded from: classes.dex */
    static final class C6265a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ long f17155x;

        /* renamed from: y */
        final /* synthetic */ HitTestResult f17156y;

        /* renamed from: z */
        final /* synthetic */ boolean f17157z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6265a(long j, HitTestResult hitTestResult, boolean z) {
            super(1);
            this.f17155x = j;
            this.f17156y = hitTestResult;
            this.f17157z = z;
        }

        /* renamed from: a */
        public final void m21596a(boolean z) {
            PointerInputDelegatingWrapper.m21600Y1(PointerInputDelegatingWrapper.this, this.f17155x, this.f17156y, this.f17157z, z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21596a(((Boolean) obj).booleanValue());
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInputDelegatingWrapper(LayoutNodeWrapper layoutNodeWrapper, PointerEvent pointerEvent) {
        super(layoutNodeWrapper, pointerEvent);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(pointerEvent, "modifier");
    }

    /* renamed from: Y1 */
    public static final /* synthetic */ void m21600Y1(PointerInputDelegatingWrapper pointerInputDelegatingWrapper, long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        pointerInputDelegatingWrapper.m21599Z1(j, hitTestResult, z, z2);
    }

    /* renamed from: Z1 */
    private final void m21599Z1(long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        m21742k1().m21366n1(m21742k1().m21387V0(j), hitTestResult, z, z2);
    }

    /* renamed from: K1 */
    public boolean m21601K1() {
        return ((PointerEvent) m21755P1()).m24832h0().m24838m0() || m21742k1().m21403K1();
    }

    /* renamed from: n1 */
    public void m21598n1(long j, HitTestResult hitTestResult, boolean z, boolean z2) {
        Intrinsics.isThisObjectNull(hitTestResult, "hitTestResult");
        m21752R1(j, hitTestResult, ((PointerEvent) m21755P1()).m24832h0().mo24840k0(), z, z2, ((PointerEvent) m21755P1()).m24832h0(), new C6265a(j, hitTestResult, z));
    }

    /* renamed from: v1 */
    public void m21597v1() {
        super.m21737v1();
        ((PointerEvent) m21755P1()).m24832h0().m24834q0(this);
    }
}
