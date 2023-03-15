package p358t0;

import kotlin.NoWhenBranchMatchedException;
import p169j1.LayoutNodeWrapper;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;
import p358t0.C10325c;
import p479z1.EnumC13618o;

/* renamed from: t0.o */
/* loaded from: classes.dex */
public final class FocusOrderModifier {

    /* compiled from: FocusOrderModifier.kt */
    /* renamed from: t0.o$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10343a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26934a;

        static {
            int[] iArr = new int[EnumC13618o.values().length];
            iArr[EnumC13618o.Ltr.ordinal()] = 1;
            iArr[EnumC13618o.Rtl.ordinal()] = 2;
            f26934a = iArr;
        }
    }

    /* renamed from: a */
    public static final C10349s m8203a(ModifiedFocusNode modifiedFocusNode, int i, EnumC13618o enumC13618o) {
        C10349s m8211b;
        C10349s m8206g;
        Intrinsics.isThisObjectNull(modifiedFocusNode, "$this$customFocusSearch");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        C10341m c10341m = new C10341m();
        LayoutNodeWrapper m21368l1 = modifiedFocusNode.m21368l1();
        if (m21368l1 != null) {
            m21368l1.m21419C1(c10341m);
        }
        C10325c.C10326a c10326a = C10325c.f26902b;
        if (C10325c.m8268l(i, c10326a.m8261d())) {
            return c10341m.m8209d();
        }
        if (C10325c.m8268l(i, c10326a.m8259f())) {
            return c10341m.m8208e();
        }
        if (C10325c.m8268l(i, c10326a.m8257h())) {
            return c10341m.m8205h();
        }
        if (C10325c.m8268l(i, c10326a.m8264a())) {
            return c10341m.m8212a();
        }
        if (C10325c.m8268l(i, c10326a.m8262c())) {
            int i2 = C10343a.f26934a[enumC13618o.ordinal()];
            if (i2 == 1) {
                m8206g = c10341m.m8206g();
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m8206g = c10341m.m8211b();
            }
            if (Intrinsics.equals(m8206g, C10349s.f26942b.m8188a())) {
                m8206g = null;
            }
            return m8206g == null ? c10341m.m8210c() : m8206g;
        } else if (C10325c.m8268l(i, c10326a.m8258g())) {
            int i3 = C10343a.f26934a[enumC13618o.ordinal()];
            if (i3 == 1) {
                m8211b = c10341m.m8211b();
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                m8211b = c10341m.m8206g();
            }
            if (Intrinsics.equals(m8211b, C10349s.f26942b.m8188a())) {
                m8211b = null;
            }
            return m8211b == null ? c10341m.m8207f() : m8211b;
        } else if (C10325c.m8268l(i, c10326a.m8263b())) {
            return C10349s.f26942b.m8188a();
        } else {
            if (C10325c.m8268l(i, c10326a.m8260e())) {
                return C10349s.f26942b.m8188a();
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
    }
}
