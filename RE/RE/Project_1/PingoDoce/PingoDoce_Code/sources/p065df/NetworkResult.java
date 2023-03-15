package p065df;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* renamed from: df.d */
/* loaded from: classes2.dex */
public abstract class NetworkResult<T> {

    /* compiled from: NetworkResult.kt */
    /* renamed from: df.d$a */
    /* loaded from: classes2.dex */
    public static final class C4791a extends NetworkResult {

        /* renamed from: a */
        private final BaseException f13120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4791a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f13120a = baseException;
        }

        /* renamed from: a */
        public final BaseException m26591a() {
            return this.f13120a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4791a) && Intrinsics.equals(this.f13120a, ((C4791a) obj).f13120a);
        }

        public int hashCode() {
            return this.f13120a.hashCode();
        }

        public String toString() {
            BaseException baseException = this.f13120a;
            return "Error(exception=" + baseException + ")";
        }
    }

    /* compiled from: NetworkResult.kt */
    /* renamed from: df.d$b */
    /* loaded from: classes2.dex */
    public static final class C4792b<T> extends NetworkResult {

        /* renamed from: a */
        private final Object f13121a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4792b(Object obj) {
            super(null);
            Intrinsics.isThisObjectNull(obj, "data");
            this.f13121a = obj;
        }

        /* renamed from: a */
        public final Object m26590a() {
            return this.f13121a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C4792b) && Intrinsics.equals(this.f13121a, ((C4792b) obj).f13121a);
        }

        public int hashCode() {
            return this.f13121a.hashCode();
        }

        public String toString() {
            Object obj = this.f13121a;
            return "Success(data=" + obj + ")";
        }
    }

    private NetworkResult() {
    }

    public /* synthetic */ NetworkResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
