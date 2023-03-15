package p169j1;

import p112g0.MutableVector;
import p181jd.Intrinsics;
import p358t0.C10349s;
import p358t0.FocusNodeUtils;
import p358t0.InterfaceC10351t;

/* renamed from: j1.u */
/* loaded from: classes.dex */
public final class ModifiedFocusRequesterNode extends DelegatingLayoutNodeWrapper {

    /* renamed from: Z */
    private C10349s f17262Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedFocusRequesterNode(LayoutNodeWrapper layoutNodeWrapper, InterfaceC10351t interfaceC10351t) {
        super(layoutNodeWrapper, interfaceC10351t);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(interfaceC10351t, "modifier");
    }

    /* renamed from: Z1 */
    private final void m21297Z1(C10349s c10349s) {
        MutableVector<ModifiedFocusRequesterNode> m8190b;
        MutableVector<ModifiedFocusRequesterNode> m8190b2;
        C10349s c10349s2 = this.f17262Z;
        if (c10349s2 != null && (m8190b2 = c10349s2.m8190b()) != null) {
            m8190b2.m23644u(this);
        }
        this.f17262Z = c10349s;
        if (c10349s == null || (m8190b = c10349s.m8190b()) == null) {
            return;
        }
        m8190b.m23659c(this);
    }

    /* renamed from: C0 */
    public void m21300C0() {
        super.m21420C0();
        m21297Z1(((InterfaceC10351t) m21755P1()).m8187e0());
    }

    /* renamed from: F0 */
    public void m21299F0() {
        m21297Z1(null);
        super.m21414F0();
    }

    /* renamed from: Y1 */
    public final ModifiedFocusNode m21298Y1() {
        ModifiedFocusNode m21758N0 = m21758N0(false);
        return m21758N0 == null ? FocusNodeUtils.m8213c(m21378c1(), null, false, 1, null) : m21758N0;
    }

    /* renamed from: y1 */
    public void m21296y1() {
        super.m21346y1();
        m21297Z1(((InterfaceC10351t) m21755P1()).m8187e0());
    }
}
