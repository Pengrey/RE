package mg;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* renamed from: mg.l0 */
/* loaded from: classes2.dex */
public abstract class TakeAwayManager<T> {

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.l0$a */
    /* loaded from: classes2.dex */
    public static final class C7335a extends TakeAwayManager {

        /* renamed from: a */
        private final BaseException f19473a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7335a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19473a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18703a() {
            return this.f19473a;
        }
    }

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.l0$b */
    /* loaded from: classes2.dex */
    public static final class C7336b extends TakeAwayManager {

        /* renamed from: a */
        private final List f19474a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7336b(List list) {
            super(null);
            Intrinsics.isThisObjectNull(list, "data");
            this.f19474a = list;
        }

        /* renamed from: a */
        public final List m18702a() {
            return this.f19474a;
        }
    }

    private TakeAwayManager() {
    }

    public /* synthetic */ TakeAwayManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
