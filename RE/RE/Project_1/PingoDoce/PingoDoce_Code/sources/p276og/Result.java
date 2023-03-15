package p276og;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: og.a */
/* loaded from: classes2.dex */
public abstract class Result<V> {

    /* compiled from: Result.kt */
    /* renamed from: og.a$a */
    /* loaded from: classes2.dex */
    public static final class C8076a {
        private C8076a() {
        }

        public /* synthetic */ C8076a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* renamed from: og.a$b */
    /* loaded from: classes2.dex */
    public static final class C8077b<V> extends Result {

        /* renamed from: a */
        private final Throwable f20877a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8077b(Throwable th2) {
            super(null);
            Intrinsics.isThisObjectNull(th2, "error");
            this.f20877a = th2;
        }

        /* renamed from: a */
        public Object m16965a() {
            throw this.f20877a;
        }

        /* renamed from: b */
        public final Throwable m16964b() {
            return this.f20877a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8077b) && Intrinsics.equals(this.f20877a, ((C8077b) obj).f20877a);
        }

        public int hashCode() {
            return this.f20877a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f20877a;
            return "[Error: " + th2 + "]";
        }
    }

    /* compiled from: Result.kt */
    /* renamed from: og.a$c */
    /* loaded from: classes2.dex */
    public static final class C8078c<V> extends Result {

        /* renamed from: a */
        private final Object f20878a;

        public C8078c(Object obj) {
            super(null);
            this.f20878a = obj;
        }

        /* renamed from: a */
        public Object m16963a() {
            return this.f20878a;
        }

        /* renamed from: b */
        public final Object m16962b() {
            return this.f20878a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C8078c) && Intrinsics.equals(this.f20878a, ((C8078c) obj).f20878a);
        }

        public int hashCode() {
            Object obj = this.f20878a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            Object obj = this.f20878a;
            return "[Success: " + obj + "]";
        }
    }

    static {
        new C8076a(null);
    }

    private Result() {
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract Object m16966a();
}
