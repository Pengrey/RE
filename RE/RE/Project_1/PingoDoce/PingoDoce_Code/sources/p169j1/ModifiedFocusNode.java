package p169j1;

import p127h1.LayoutCoordinates;
import p181jd.Intrinsics;
import p358t0.C10341m;
import p358t0.EnumC10353v;
import p358t0.FocusModifier;
import p358t0.FocusNodeUtils;
import p358t0.InterfaceC10331g;
import p358t0.InterfaceC10352u;
import p373u0.Rect;

/* renamed from: j1.s */
/* loaded from: classes.dex */
public final class ModifiedFocusNode extends DelegatingLayoutNodeWrapper {

    /* compiled from: ModifiedFocusNode.kt */
    /* renamed from: j1.s$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C6293a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17261a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.Active.ordinal()] = 1;
            iArr[EnumC10353v.Captured.ordinal()] = 2;
            iArr[EnumC10353v.ActiveParent.ordinal()] = 3;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC10353v.Deactivated.ordinal()] = 5;
            iArr[EnumC10353v.Inactive.ordinal()] = 6;
            f17261a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedFocusNode(LayoutNodeWrapper layoutNodeWrapper, FocusModifier focusModifier) {
        super(layoutNodeWrapper, focusModifier);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(focusModifier, "modifier");
    }

    /* renamed from: C0 */
    public void m21315C0() {
        super.m21420C0();
        m21306b2(m21308Z1());
    }

    /* renamed from: C1 */
    public void m21314C1(C10341m c10341m) {
        Intrinsics.isThisObjectNull(c10341m, "focusOrder");
    }

    /* renamed from: D1 */
    public void m21313D1(InterfaceC10352u interfaceC10352u) {
        Intrinsics.isThisObjectNull(interfaceC10352u, "focusState");
    }

    /* renamed from: F0 */
    public void m21312F0() {
        InterfaceC10331g focusManager;
        EnumC10353v enumC10353v;
        EnumC10353v m21308Z1 = m21308Z1();
        int[] iArr = C6293a.f17261a;
        int i = iArr[m21308Z1.ordinal()];
        if (i == 1 || i == 2) {
            InterfaceC6253f0 m21549Z = m21378c1().m21549Z();
            if (m21549Z != null && (focusManager = m21549Z.getFocusManager()) != null) {
                focusManager.mo8246b(true);
            }
        } else {
            if (i == 3 || i == 4) {
                ModifiedFocusNode m21398N0 = m21742k1().m21398N0(false);
                if (m21398N0 == null) {
                    m21398N0 = FocusNodeUtils.m8213c(m21378c1(), null, false, 1, null);
                }
                ModifiedFocusNode m21395P0 = m21395P0();
                if (m21395P0 != null) {
                    ((FocusModifier) m21395P0.m21755P1()).m8226i(m21398N0);
                    if (m21398N0 != null) {
                        m21306b2(m21398N0.m21308Z1());
                    } else {
                        int i2 = iArr[m21395P0.m21308Z1().ordinal()];
                        if (i2 == 3) {
                            enumC10353v = EnumC10353v.Inactive;
                        } else if (i2 != 4) {
                            enumC10353v = m21395P0.m21308Z1();
                        } else {
                            enumC10353v = EnumC10353v.Deactivated;
                        }
                        m21395P0.m21305c2(enumC10353v);
                    }
                }
            } else if (i == 5) {
                ModifiedFocusNode m21398N02 = m21742k1().m21398N0(false);
                if (m21398N02 == null) {
                    m21398N02 = FocusNodeUtils.m8213c(m21378c1(), null, false, 1, null);
                }
                EnumC10353v m21308Z12 = m21398N02 != null ? m21398N02.m21308Z1() : null;
                if (m21308Z12 == null) {
                    m21308Z12 = EnumC10353v.Inactive;
                }
                m21306b2(m21308Z12);
            }
        }
        super.m21414F0();
    }

    /* renamed from: N0 */
    public ModifiedFocusNode m21311N0(boolean z) {
        return (((FocusModifier) m21755P1()).m8232c().isDeactivated() && z) ? super.m21758N0(z) : this;
    }

    /* renamed from: R0 */
    public ModifiedFocusNode m21310R0() {
        return this;
    }

    /* renamed from: Y1 */
    public final Rect m21309Y1() {
        return LayoutCoordinates.m23092c(this).mo23106c0(this, false);
    }

    /* renamed from: Z1 */
    public final EnumC10353v m21308Z1() {
        return ((FocusModifier) m21755P1()).m8232c();
    }

    /* renamed from: a2 */
    public final ModifiedFocusNode m21307a2() {
        return ((FocusModifier) m21755P1()).m8231d();
    }

    /* renamed from: b2 */
    public final void m21306b2(InterfaceC10352u interfaceC10352u) {
        LayoutNodeWrapper m21368l1;
        Intrinsics.isThisObjectNull(interfaceC10352u, "focusState");
        if (mo23109S() && ((FocusModifier) m21755P1()).m8230e() && (m21368l1 = m21368l1()) != null) {
            m21368l1.m21417D1(interfaceC10352u);
        }
    }

    /* renamed from: c2 */
    public final void m21305c2(EnumC10353v enumC10353v) {
        Intrinsics.isThisObjectNull(enumC10353v, "value");
        ((FocusModifier) m21755P1()).m8227h(enumC10353v);
        m21306b2(enumC10353v);
    }

    /* renamed from: d2 */
    public final void m21304d2(ModifiedFocusNode modifiedFocusNode) {
        ((FocusModifier) m21755P1()).m8226i(modifiedFocusNode);
    }

    /* renamed from: v1 */
    public void m21303v1() {
        super.m21737v1();
        ((FocusModifier) m21755P1()).m8228g(this);
    }

    /* renamed from: y1 */
    public void m21302y1() {
        super.m21346y1();
        m21306b2(m21308Z1());
    }
}
