package p245n1;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* renamed from: n1.m */
/* loaded from: classes.dex */
public interface SemanticsModifier extends InterfaceC9570f.InterfaceC9573c {

    /* compiled from: SemanticsModifier.kt */
    /* renamed from: n1.m$a */
    /* loaded from: classes.dex */
    public static final class C7597a {
        /* renamed from: a */
        public static boolean m18023a(SemanticsModifier semanticsModifier, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(semanticsModifier, "this");
            Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10576a(semanticsModifier, interfaceC6108l);
        }

        /* renamed from: b */
        public static Object m18022b(SemanticsModifier semanticsModifier, Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(semanticsModifier, "this");
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10575b(semanticsModifier, obj, interfaceC6112p);
        }

        /* renamed from: c */
        public static Object m18021c(SemanticsModifier semanticsModifier, Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(semanticsModifier, "this");
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10574c(semanticsModifier, obj, interfaceC6112p);
        }

        /* renamed from: d */
        public static InterfaceC9570f m18020d(SemanticsModifier semanticsModifier, InterfaceC9570f interfaceC9570f) {
            Intrinsics.isThisObjectNull(semanticsModifier, "this");
            Intrinsics.isThisObjectNull(interfaceC9570f, "other");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10573d(semanticsModifier, interfaceC9570f);
        }
    }

    /* renamed from: c0 */
    SemanticsConfiguration m18024c0();

    int getId();
}
