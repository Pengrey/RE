package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.remote.models.response.Store;

/* compiled from: TakeAwayManager.kt */
/* renamed from: mg.o1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7373o1<T> {

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.o1$a */
    /* loaded from: classes2.dex */
    public static final class C7374a extends AbstractC7373o1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7374a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
        }
    }

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.o1$b */
    /* loaded from: classes2.dex */
    public static final class C7375b extends AbstractC7373o1 {

        /* renamed from: a */
        private final Store f19580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7375b(Store store) {
            super(null);
            Intrinsics.isThisObjectNull(store, "store");
            this.f19580a = store;
        }

        /* renamed from: a */
        public final Store m18630a() {
            return this.f19580a;
        }
    }

    private AbstractC7373o1() {
    }

    public /* synthetic */ AbstractC7373o1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
