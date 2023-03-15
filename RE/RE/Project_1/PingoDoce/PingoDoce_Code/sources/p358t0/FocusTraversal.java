package p358t0;

import kotlin.NoWhenBranchMatchedException;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;
import p358t0.C10325c;
import p479z1.EnumC13618o;

/* renamed from: t0.x */
/* loaded from: classes.dex */
public final class FocusTraversal {

    /* compiled from: FocusTraversal.kt */
    /* renamed from: t0.x$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10356a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26947a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26948b;

        static {
            int[] iArr = new int[EnumC13618o.values().length];
            iArr[EnumC13618o.Rtl.ordinal()] = 1;
            iArr[EnumC13618o.Ltr.ordinal()] = 2;
            f26947a = iArr;
            int[] iArr2 = new int[EnumC10353v.values().length];
            iArr2[EnumC10353v.Active.ordinal()] = 1;
            iArr2[EnumC10353v.Captured.ordinal()] = 2;
            iArr2[EnumC10353v.ActiveParent.ordinal()] = 3;
            iArr2[EnumC10353v.DeactivatedParent.ordinal()] = 4;
            iArr2[EnumC10353v.Inactive.ordinal()] = 5;
            iArr2[EnumC10353v.Deactivated.ordinal()] = 6;
            f26948b = iArr2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final ModifiedFocusNode m8176a(ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        switch (C10356a.f26948b[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
            case 2:
                return modifiedFocusNode;
            case 3:
            case 4:
                ModifiedFocusNode m21307a2 = modifiedFocusNode.m21307a2();
                if (m21307a2 != null) {
                    return m8176a(m21307a2);
                }
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    /* renamed from: b */
    public static final ModifiedFocusNode m8175b(ModifiedFocusNode modifiedFocusNode) {
        Intrinsics.isThisObjectNull(modifiedFocusNode, "<this>");
        ModifiedFocusNode m21395P0 = modifiedFocusNode.m21395P0();
        if (m21395P0 == null) {
            return null;
        }
        switch (C10356a.f26948b[modifiedFocusNode.m21308Z1().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return m8175b(m21395P0);
            case 3:
                return modifiedFocusNode;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public static final ModifiedFocusNode m8174c(ModifiedFocusNode modifiedFocusNode, int i, EnumC13618o enumC13618o) {
        int m8262c;
        Intrinsics.isThisObjectNull(modifiedFocusNode, "$this$focusSearch");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8261d()) ? true : C10325c.m8268l(i, c10326a.m8259f())) {
            return OneDimensionalFocusSearch.m8170d(modifiedFocusNode, i);
        }
        if (C10325c.m8268l(i, c10326a.m8262c()) ? true : C10325c.m8268l(i, c10326a.m8258g()) ? true : C10325c.m8268l(i, c10326a.m8257h()) ? true : C10325c.m8268l(i, c10326a.m8264a())) {
            return TwoDimensionalFocusSearch.m8156n(modifiedFocusNode, i);
        }
        if (C10325c.m8268l(i, c10326a.m8263b())) {
            int i2 = C10356a.f26947a[enumC13618o.ordinal()];
            if (i2 == 1) {
                m8262c = c10326a.m8262c();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m8262c = c10326a.m8258g();
            }
            ModifiedFocusNode m8176a = m8176a(modifiedFocusNode);
            if (m8176a == null) {
                return null;
            }
            return TwoDimensionalFocusSearch.m8156n(m8176a, m8262c);
        } else if (C10325c.m8268l(i, c10326a.m8260e())) {
            ModifiedFocusNode m8176a2 = m8176a(modifiedFocusNode);
            ModifiedFocusNode m8175b = m8176a2 == null ? null : m8175b(m8176a2);
            if (Intrinsics.equals(m8175b, modifiedFocusNode)) {
                return null;
            }
            return m8175b;
        } else {
            throw new IllegalStateException("Invalid FocusDirection".toString());
        }
    }
}
