package p358t0;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;
import p358t0.C10325c;
import p489zc.C13777q;

/* renamed from: t0.y */
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearch {

    /* compiled from: OneDimensionalFocusSearch.kt */
    /* renamed from: t0.y$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10357a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26949a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.ActiveParent.ordinal()] = 1;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 2;
            iArr[EnumC10353v.Active.ordinal()] = 3;
            iArr[EnumC10353v.Captured.ordinal()] = 4;
            iArr[EnumC10353v.Deactivated.ordinal()] = 5;
            iArr[EnumC10353v.Inactive.ordinal()] = 6;
            f26949a = iArr;
        }
    }

    /* renamed from: a */
    private static final ModifiedFocusNode m8173a(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode m8173a;
        ModifiedFocusNode m8173a2;
        ModifiedFocusNode m8173a3;
        ModifiedFocusNode m8173a4;
        ModifiedFocusNode m8173a5;
        EnumC10353v m21308Z1 = modifiedFocusNode.m21308Z1();
        int[] iArr = C10357a.f26949a;
        boolean z = false;
        switch (iArr[m21308Z1.ordinal()]) {
            case 1:
                ModifiedFocusNode m21307a2 = modifiedFocusNode.m21307a2();
                if (m21307a2 != null) {
                    switch (iArr[m21307a2.m21308Z1().ordinal()]) {
                        case 1:
                            ModifiedFocusNode m8173a6 = m8173a(m21307a2);
                            return m8173a6 == null ? m21307a2 : m8173a6;
                        case 2:
                            ModifiedFocusNode m8173a7 = m8173a(m21307a2);
                            if (m8173a7 == null) {
                                List m21389U0 = modifiedFocusNode.m21389U0(false);
                                int size = m21389U0.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i = size - 1;
                                        if (z && (m8173a = m8173a((ModifiedFocusNode) m21389U0.get(size))) != null) {
                                            return m8173a;
                                        }
                                        if (Intrinsics.equals(m21389U0.get(size), m21307a2)) {
                                            z = true;
                                        }
                                        if (i >= 0) {
                                            size = i;
                                        }
                                    }
                                }
                                if (m8171c(modifiedFocusNode)) {
                                    return null;
                                }
                                return modifiedFocusNode;
                            }
                            return m8173a7;
                        case 3:
                        case 4:
                            List m21389U02 = modifiedFocusNode.m21389U0(false);
                            int size2 = m21389U02.size() - 1;
                            if (size2 >= 0) {
                                while (true) {
                                    int i2 = size2 - 1;
                                    if (z && (m8173a2 = m8173a((ModifiedFocusNode) m21389U02.get(size2))) != null) {
                                        return m8173a2;
                                    }
                                    if (Intrinsics.equals(m21389U02.get(size2), m21307a2)) {
                                        z = true;
                                    }
                                    if (i2 >= 0) {
                                        size2 = i2;
                                    }
                                }
                            }
                            if (m8171c(modifiedFocusNode)) {
                                return null;
                            }
                            return modifiedFocusNode;
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 2:
                ModifiedFocusNode m21307a22 = modifiedFocusNode.m21307a2();
                if (m21307a22 != null) {
                    switch (iArr[m21307a22.m21308Z1().ordinal()]) {
                        case 1:
                            ModifiedFocusNode m8173a8 = m8173a(m21307a22);
                            return m8173a8 == null ? m21307a22 : m8173a8;
                        case 2:
                            ModifiedFocusNode m8173a9 = m8173a(m21307a22);
                            if (m8173a9 == null) {
                                List m21389U03 = modifiedFocusNode.m21389U0(false);
                                int size3 = m21389U03.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i3 = size3 - 1;
                                        if (z && (m8173a3 = m8173a((ModifiedFocusNode) m21389U03.get(size3))) != null) {
                                            return m8173a3;
                                        }
                                        if (Intrinsics.equals(m21389U03.get(size3), m21307a22)) {
                                            z = true;
                                        }
                                        if (i3 >= 0) {
                                            size3 = i3;
                                        }
                                    }
                                }
                                return null;
                            }
                            return m8173a9;
                        case 3:
                        case 4:
                            List m21389U04 = modifiedFocusNode.m21389U0(false);
                            int size4 = m21389U04.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i4 = size4 - 1;
                                    if (z && (m8173a4 = m8173a((ModifiedFocusNode) m21389U04.get(size4))) != null) {
                                        return m8173a4;
                                    }
                                    if (Intrinsics.equals(m21389U04.get(size4), m21307a22)) {
                                        z = true;
                                    }
                                    if (i4 >= 0) {
                                        size4 = i4;
                                    }
                                }
                            }
                            return null;
                        case 5:
                        case 6:
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 6:
                ModifiedFocusNode modifiedFocusNode2 = (ModifiedFocusNode) C13777q.m248X(modifiedFocusNode.m21389U0(true));
                return (modifiedFocusNode2 == null || (m8173a5 = m8173a(modifiedFocusNode2)) == null) ? modifiedFocusNode : m8173a5;
            case 5:
                ModifiedFocusNode modifiedFocusNode3 = (ModifiedFocusNode) C13777q.m248X(modifiedFocusNode.m21389U0(true));
                if (modifiedFocusNode3 == null) {
                    return null;
                }
                return m8173a(modifiedFocusNode3);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private static final ModifiedFocusNode m8172b(ModifiedFocusNode modifiedFocusNode) {
        ModifiedFocusNode m8172b;
        int i = 0;
        switch (C10357a.f26949a[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
            case 2:
                ModifiedFocusNode m21307a2 = modifiedFocusNode.m21307a2();
                if (m21307a2 != null) {
                    ModifiedFocusNode m8172b2 = m8172b(m21307a2);
                    if (m8172b2 == null) {
                        List m21389U0 = modifiedFocusNode.m21389U0(false);
                        int size = m21389U0.size();
                        boolean z = false;
                        while (i < size) {
                            int i2 = i + 1;
                            if (z && (m8172b = m8172b((ModifiedFocusNode) m21389U0.get(i))) != null) {
                                return m8172b;
                            }
                            if (Intrinsics.equals(m21389U0.get(i), m21307a2)) {
                                z = true;
                            }
                            i = i2;
                        }
                        return null;
                    }
                    return m8172b2;
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            case 3:
            case 4:
            case 5:
                List m21389U02 = modifiedFocusNode.m21389U0(false);
                int size2 = m21389U02.size();
                while (i < size2) {
                    int i3 = i + 1;
                    ModifiedFocusNode m8172b3 = m8172b((ModifiedFocusNode) m21389U02.get(i));
                    if (m8172b3 != null) {
                        return m8172b3;
                    }
                    i = i3;
                }
                return null;
            case 6:
                return modifiedFocusNode;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    private static final boolean m8171c(ModifiedFocusNode modifiedFocusNode) {
        return modifiedFocusNode.m21395P0() == null;
    }

    /* renamed from: d */
    public static final ModifiedFocusNode m8170d(ModifiedFocusNode modifiedFocusNode, int i) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "$this$oneDimensionalFocusSearch");
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8261d())) {
            return m8172b(modifiedFocusNode);
        }
        if (C10325c.m8268l(i, c10326a.m8259f())) {
            return m8173a(modifiedFocusNode);
        }
        throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
    }
}
