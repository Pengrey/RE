package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayStatus;

/* compiled from: TakeAwayManager.kt */
/* renamed from: mg.p1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7382p1<T> {

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.p1$a */
    /* loaded from: classes2.dex */
    public static final class C7383a extends AbstractC7382p1 {

        /* renamed from: a */
        private final BaseException f19591a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7383a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19591a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18625a() {
            return this.f19591a;
        }
    }

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.p1$b */
    /* loaded from: classes2.dex */
    public static final class C7384b extends AbstractC7382p1 {

        /* renamed from: a */
        private final TakeAwayStatus f19592a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7384b(TakeAwayStatus takeAwayStatus) {
            super(null);
            Intrinsics.isThisObjectNull(takeAwayStatus, "data");
            this.f19592a = takeAwayStatus;
        }

        /* renamed from: a */
        public final TakeAwayStatus m18624a() {
            return this.f19592a;
        }
    }

    private AbstractC7382p1() {
    }

    public /* synthetic */ AbstractC7382p1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
