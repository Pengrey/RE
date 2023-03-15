package p358t0;

import kotlin.NoWhenBranchMatchedException;
import p169j1.InterfaceC6253f0;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;

/* renamed from: t0.w */
/* loaded from: classes.dex */
public final class FocusTransactions {

    /* compiled from: FocusTransactions.kt */
    /* renamed from: t0.w$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10355a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26946a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.Active.ordinal()] = 1;
            iArr[EnumC10353v.Captured.ordinal()] = 2;
            iArr[EnumC10353v.Deactivated.ordinal()] = 3;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 4;
            iArr[EnumC10353v.ActiveParent.ordinal()] = 5;
            iArr[EnumC10353v.Inactive.ordinal()] = 6;
            f26946a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m8186a(ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        int i = C10355a.f26946a[modifiedFocusNode.m21308Z1().ordinal()];
        if (i == 3) {
            modifiedFocusNode.m21305c2(EnumC10353v.Inactive);
        } else if (i != 4) {
        } else {
            modifiedFocusNode.m21305c2(EnumC10353v.ActiveParent);
        }
    }

    /* renamed from: b */
    private static final boolean m8185b(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode m21307a2 = modifiedFocusNode.m21307a2();
        if (m21307a2 != null) {
            if (m8183d(m21307a2, false, 1, null)) {
                modifiedFocusNode.m21304d2(null);
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: c */
    public static final boolean m8184c(ModifiedFocusNode modifiedFocusNode, boolean z) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        switch (C10355a.f26946a[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
                modifiedFocusNode.m21305c2(EnumC10353v.Inactive);
                return true;
            case 2:
                if (z) {
                    modifiedFocusNode.m21305c2(EnumC10353v.Inactive);
                    return z;
                }
                return z;
            case 3:
            case 6:
                return true;
            case 4:
                if (m8185b(modifiedFocusNode)) {
                    modifiedFocusNode.m21305c2(EnumC10353v.Deactivated);
                    return true;
                }
                return false;
            case 5:
                if (m8185b(modifiedFocusNode)) {
                    modifiedFocusNode.m21305c2(EnumC10353v.Inactive);
                    return true;
                }
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m8183d(ModifiedFocusNode modifiedFocusNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m8184c(modifiedFocusNode, z);
    }

    /* renamed from: e */
    public static final void m8182e(ModifiedFocusNode modifiedFocusNode) {
        InterfaceC10331g focusManager;
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        int i = C10355a.f26946a[modifiedFocusNode.m21308Z1().ordinal()];
        if (i == 1 || i == 2) {
            InterfaceC6253f0 m21549Z = modifiedFocusNode.m21378c1().m21549Z();
            if (m21549Z != null && (focusManager = m21549Z.getFocusManager()) != null) {
                focusManager.mo8246b(true);
            }
            modifiedFocusNode.m21305c2(EnumC10353v.Deactivated);
        } else if (i == 5) {
            modifiedFocusNode.m21305c2(EnumC10353v.DeactivatedParent);
        } else if (i != 6) {
        } else {
            modifiedFocusNode.m21305c2(EnumC10353v.Deactivated);
        }
    }

    /* renamed from: f */
    private static final void m8181f(ModifiedFocusNode modifiedFocusNode) {
        EnumC10353v enumC10353v;
        switch (C10355a.f26946a[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
            case 5:
            case 6:
                enumC10353v = EnumC10353v.Active;
                break;
            case 2:
                enumC10353v = EnumC10353v.Captured;
                break;
            case 3:
            case 4:
                throw new IllegalStateException("Granting focus to a deactivated node.".toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        modifiedFocusNode.m21305c2(enumC10353v);
    }

    /* renamed from: g */
    private static final boolean m8180g(ModifiedFocusNode modifiedFocusNode, ModifiedFocusNode modifiedFocusNode2) {
        m8181f(modifiedFocusNode2);
        modifiedFocusNode.m21304d2(modifiedFocusNode2);
        return true;
    }

    /* renamed from: h */
    public static final void m8179h(ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        switch (C10355a.f26946a[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                modifiedFocusNode.m21306b2(modifiedFocusNode.m21308Z1());
                return;
            case 5:
                if (m8185b(modifiedFocusNode)) {
                    m8181f(modifiedFocusNode);
                    return;
                }
                return;
            case 6:
                ModifiedFocusNode m21395P0 = modifiedFocusNode.m21395P0();
                if (m21395P0 != null) {
                    m8178i(m21395P0, modifiedFocusNode);
                    return;
                } else if (m8177j(modifiedFocusNode)) {
                    m8181f(modifiedFocusNode);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: i */
    private static final boolean m8178i(ModifiedFocusNode modifiedFocusNode, ModifiedFocusNode modifiedFocusNode2) {
        if (modifiedFocusNode.m21389U0(false).contains(modifiedFocusNode2)) {
            switch (C10355a.f26946a[modifiedFocusNode.m21308Z1().ordinal()]) {
                case 1:
                    modifiedFocusNode.m21305c2(EnumC10353v.ActiveParent);
                    return m8180g(modifiedFocusNode, modifiedFocusNode2);
                case 2:
                    return false;
                case 3:
                    m8186a(modifiedFocusNode);
                    boolean m8178i = m8178i(modifiedFocusNode, modifiedFocusNode2);
                    m8182e(modifiedFocusNode);
                    return m8178i;
                case 4:
                    if (modifiedFocusNode.m21307a2() == null || m8185b(modifiedFocusNode)) {
                        return m8180g(modifiedFocusNode, modifiedFocusNode2);
                    }
                    return false;
                case 5:
                    if (m8185b(modifiedFocusNode)) {
                        return m8180g(modifiedFocusNode, modifiedFocusNode2);
                    }
                    return false;
                case 6:
                    ModifiedFocusNode m21395P0 = modifiedFocusNode.m21395P0();
                    if (m21395P0 == null && m8177j(modifiedFocusNode)) {
                        modifiedFocusNode.m21305c2(EnumC10353v.Active);
                        return m8178i(modifiedFocusNode, modifiedFocusNode2);
                    } else if (m21395P0 == null || !m8178i(m21395P0, modifiedFocusNode)) {
                        return false;
                    } else {
                        return m8178i(modifiedFocusNode, modifiedFocusNode2);
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    /* renamed from: j */
    private static final boolean m8177j(ModifiedFocusNode modifiedFocusNode) {
        InterfaceC6253f0 m21549Z = modifiedFocusNode.m21378c1().m21549Z();
        Boolean valueOf = m21549Z == null ? null : Boolean.valueOf(m21549Z.requestFocus());
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
