package p169j1;

import id.InterfaceC6097a;
import p127h1.InterfaceC5745a0;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: j1.k0 */
/* loaded from: classes.dex */
public final class RemeasureModifierWrapper extends DelegatingLayoutNodeWrapper {

    /* compiled from: RemeasureModifierWrapper.kt */
    /* renamed from: j1.k0$a */
    /* loaded from: classes.dex */
    static final class C6281a extends AbstractC6438m implements InterfaceC6097a {
        C6281a() {
            super(0);
        }

        /* renamed from: a */
        public final void m21474a() {
            ((InterfaceC5745a0) RemeasureModifierWrapper.this.m21755P1()).m23199n(RemeasureModifierWrapper.m21476Y1(RemeasureModifierWrapper.this));
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21474a();
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemeasureModifierWrapper(LayoutNodeWrapper layoutNodeWrapper, InterfaceC5745a0 interfaceC5745a0) {
        super(layoutNodeWrapper, interfaceC5745a0);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(interfaceC5745a0, "modifier");
    }

    /* renamed from: Y1 */
    public static final /* synthetic */ long m21476Y1(RemeasureModifierWrapper remeasureModifierWrapper) {
        return remeasureModifierWrapper.m23180n0();
    }

    /* renamed from: n */
    public Placeable mo23007n(long j) {
        OwnerSnapshotObserver snapshotObserver;
        Placeable mo23007n = super.mo23007n(j);
        C6281a c6281a = new C6281a();
        InterfaceC6253f0 m21549Z = m21378c1().m21549Z();
        C13195u c13195u = null;
        if (m21549Z != null && (snapshotObserver = m21549Z.getSnapshotObserver()) != null) {
            snapshotObserver.m21607h(c6281a);
            c13195u = C13195u.f34156a;
        }
        if (c13195u == null) {
            c6281a.mo42214q();
        }
        return mo23007n;
    }
}
