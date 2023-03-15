package p404vd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: vd.i */
/* loaded from: classes2.dex */
public final class C11227i<T> {

    /* renamed from: b */
    public static final C11229b f28808b = new C11229b(null);

    /* renamed from: c */
    private static final C11230c f28809c = new C11230c();

    /* renamed from: a */
    private final Object f28810a;

    /* compiled from: Channel.kt */
    /* renamed from: vd.i$a */
    /* loaded from: classes2.dex */
    public static final class C11228a extends C11230c {

        /* renamed from: a */
        public final Throwable f28811a;

        public C11228a(Throwable th2) {
            this.f28811a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C11228a) && Intrinsics.equals(this.f28811a, ((C11228a) obj).f28811a);
        }

        public int hashCode() {
            Throwable th2 = this.f28811a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f28811a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* renamed from: vd.i$b */
    /* loaded from: classes2.dex */
    public static final class C11229b {
        private C11229b() {
        }

        public /* synthetic */ C11229b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Object m5680a(Throwable th2) {
            return C11227i.m5689c(new C11228a(th2));
        }

        /* renamed from: b */
        public final Object m5679b() {
            return C11227i.m5689c(C11227i.m5691a());
        }

        /* renamed from: c */
        public final Object m5678c(Object obj) {
            return C11227i.m5689c(obj);
        }
    }

    /* compiled from: Channel.kt */
    /* renamed from: vd.i$c */
    /* loaded from: classes2.dex */
    public static class C11230c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C11227i(Object obj) {
        this.f28810a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11230c m5691a() {
        return f28809c;
    }

    /* renamed from: b */
    public static final /* synthetic */ C11227i m5690b(Object obj) {
        return new C11227i(obj);
    }

    /* renamed from: c */
    public static Object m5689c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m5688d(Object obj, Object obj2) {
        return (obj2 instanceof C11227i) && Intrinsics.equals(obj, ((C11227i) obj2).m5681k());
    }

    /* renamed from: e */
    public static final Throwable m5687e(Object obj) {
        C11228a c11228a = obj instanceof C11228a ? (C11228a) obj : null;
        if (c11228a != null) {
            return c11228a.f28811a;
        }
        return null;
    }

    /* renamed from: f */
    public static final Object m5686f(Object obj) {
        if (obj instanceof C11230c) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static final Object m5685g(Object obj) {
        Throwable th2;
        if (obj instanceof C11230c) {
            if (!(obj instanceof C11228a) || (th2 = ((C11228a) obj).f28811a) == null) {
                throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
            }
            throw th2;
        }
        return obj;
    }

    /* renamed from: h */
    public static int m5684h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public static final boolean m5683i(Object obj) {
        return obj instanceof C11228a;
    }

    /* renamed from: j */
    public static String m5682j(Object obj) {
        if (obj instanceof C11228a) {
            return ((C11228a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m5688d(this.f28810a, obj);
    }

    public int hashCode() {
        return m5684h(this.f28810a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m5681k() {
        return this.f28810a;
    }

    public String toString() {
        return m5682j(this.f28810a);
    }
}
