package p302q0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.Intrinsics;

/* compiled from: Modifier.kt */
/* renamed from: q0.f */
/* loaded from: classes.dex */
public interface InterfaceC9570f {

    /* renamed from: r */
    public static final C9571a f25164r = C9571a.f25165w;

    /* compiled from: Modifier.kt */
    /* renamed from: q0.f$a */
    /* loaded from: classes.dex */
    public static final class C9571a implements InterfaceC9570f {

        /* renamed from: w */
        static final /* synthetic */ C9571a f25165w = new C9571a();

        private C9571a() {
        }

        /* renamed from: C */
        public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
            return true;
        }

        /* renamed from: V */
        public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return obj;
        }

        /* renamed from: o */
        public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
            return obj;
        }

        public String toString() {
            return "Modifier";
        }

        /* renamed from: u */
        public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "other");
            return interfaceC9570f;
        }
    }

    /* compiled from: Modifier.kt */
    /* renamed from: q0.f$b */
    /* loaded from: classes.dex */
    public static final class C9572b {
        /* renamed from: a */
        public static InterfaceC9570f m10577a(InterfaceC9570f interfaceC9570f, InterfaceC9570f interfaceC9570f2) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "this");
            Intrinsics.isThisObjectNull(interfaceC9570f2, "other");
            return interfaceC9570f2 == InterfaceC9570f.f25164r ? interfaceC9570f : new Modifier(interfaceC9570f, interfaceC9570f2);
        }
    }

    /* compiled from: Modifier.kt */
    /* renamed from: q0.f$c */
    /* loaded from: classes.dex */
    public interface InterfaceC9573c extends InterfaceC9570f {

        /* compiled from: Modifier.kt */
        /* renamed from: q0.f$c$a */
        /* loaded from: classes.dex */
        public static final class C9574a {
            /* renamed from: a */
            public static boolean m10576a(InterfaceC9573c interfaceC9573c, InterfaceC6108l interfaceC6108l) {
                Intrinsics.isThisObjectNull(interfaceC9573c, "this");
                Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
                return ((Boolean) interfaceC6108l.mo9587d(interfaceC9573c)).booleanValue();
            }

            /* renamed from: b */
            public static Object m10575b(InterfaceC9573c interfaceC9573c, Object obj, InterfaceC6112p interfaceC6112p) {
                Intrinsics.isThisObjectNull(interfaceC9573c, "this");
                Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
                return interfaceC6112p.mo39856d(obj, interfaceC9573c);
            }

            /* renamed from: c */
            public static Object m10574c(InterfaceC9573c interfaceC9573c, Object obj, InterfaceC6112p interfaceC6112p) {
                Intrinsics.isThisObjectNull(interfaceC9573c, "this");
                Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
                return interfaceC6112p.mo39856d(interfaceC9573c, obj);
            }

            /* renamed from: d */
            public static InterfaceC9570f m10573d(InterfaceC9573c interfaceC9573c, InterfaceC9570f interfaceC9570f) {
                Intrinsics.isThisObjectNull(interfaceC9573c, "this");
                Intrinsics.isThisObjectNull(interfaceC9570f, "other");
                return C9572b.m10577a(interfaceC9573c, interfaceC9570f);
            }
        }
    }

    /* renamed from: C */
    boolean mo7209C(InterfaceC6108l interfaceC6108l);

    /* renamed from: V */
    Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p);

    /* renamed from: o */
    Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p);

    /* renamed from: u */
    InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f);
}
