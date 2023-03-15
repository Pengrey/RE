package p468yc;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: Result.kt */
/* renamed from: yc.m */
/* loaded from: classes2.dex */
public final class C13183m<T> implements Serializable {

    /* renamed from: w */
    public static final C13184a f34143w = new C13184a(null);

    /* compiled from: Result.kt */
    /* renamed from: yc.m$a */
    /* loaded from: classes2.dex */
    public static final class C13184a {
        private C13184a() {
        }

        public /* synthetic */ C13184a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* renamed from: yc.m$b */
    /* loaded from: classes2.dex */
    public static final class C13185b implements Serializable {

        /* renamed from: w */
        public final Throwable f34144w;

        public C13185b(Throwable th2) {
            Intrinsics.isThisObjectNull(th2, "exception");
            this.f34144w = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13185b) && Intrinsics.equals(this.f34144w, ((C13185b) obj).f34144w);
        }

        public int hashCode() {
            return this.f34144w.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f34144w + ')';
        }
    }

    /* renamed from: a */
    public static Object m1458a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m1457b(Object obj) {
        if (obj instanceof C13185b) {
            return ((C13185b) obj).f34144w;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m1456c(Object obj) {
        return obj instanceof C13185b;
    }

    /* renamed from: d */
    public static final boolean m1455d(Object obj) {
        return !(obj instanceof C13185b);
    }
}
