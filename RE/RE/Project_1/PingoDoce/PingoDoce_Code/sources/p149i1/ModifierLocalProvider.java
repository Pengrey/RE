package p149i1;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* renamed from: i1.d */
/* loaded from: classes.dex */
public interface ModifierLocalProvider<T> extends InterfaceC9570f.InterfaceC9573c {

    /* compiled from: ModifierLocalProvider.kt */
    /* renamed from: i1.d$a */
    /* loaded from: classes.dex */
    public static final class C5990a {
        /* renamed from: a */
        public static boolean m22447a(ModifierLocalProvider modifierLocalProvider, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(modifierLocalProvider, "this");
            Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10576a(modifierLocalProvider, interfaceC6108l);
        }

        /* renamed from: b */
        public static Object m22446b(ModifierLocalProvider modifierLocalProvider, Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(modifierLocalProvider, "this");
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10575b(modifierLocalProvider, obj, interfaceC6112p);
        }

        /* renamed from: c */
        public static Object m22445c(ModifierLocalProvider modifierLocalProvider, Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(modifierLocalProvider, "this");
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10574c(modifierLocalProvider, obj, interfaceC6112p);
        }

        /* renamed from: d */
        public static InterfaceC9570f m22444d(ModifierLocalProvider modifierLocalProvider, InterfaceC9570f interfaceC9570f) {
            Intrinsics.isThisObjectNull(modifierLocalProvider, "this");
            Intrinsics.isThisObjectNull(interfaceC9570f, "other");
            return InterfaceC9570f.InterfaceC9573c.C9574a.m10573d(modifierLocalProvider, interfaceC9570f);
        }
    }

    C5992f getKey();

    /* renamed from: getValue */
    Object mo41263getValue();
}
