package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* compiled from: TakeAwayManager.kt */
/* renamed from: mg.m0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7343m0<T> {

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.m0$a */
    /* loaded from: classes2.dex */
    public static final class C7344a extends AbstractC7343m0 {

        /* renamed from: a */
        private final BaseException f19490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7344a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19490a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18697a() {
            return this.f19490a;
        }
    }

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.m0$b */
    /* loaded from: classes2.dex */
    public static final class C7345b extends AbstractC7343m0 {

        /* renamed from: a */
        private final String f19491a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7345b(String str) {
            super(null);
            Intrinsics.isThisObjectNull(str, "message");
            this.f19491a = str;
        }

        /* renamed from: a */
        public final String m18696a() {
            return this.f19491a;
        }
    }

    /* compiled from: TakeAwayManager.kt */
    /* renamed from: mg.m0$c */
    /* loaded from: classes2.dex */
    public static final class C7346c extends AbstractC7343m0 {

        /* renamed from: a */
        private final TakeAwayOrder f19492a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7346c(TakeAwayOrder takeAwayOrder) {
            super(null);
            Intrinsics.isThisObjectNull(takeAwayOrder, "data");
            this.f19492a = takeAwayOrder;
        }

        /* renamed from: a */
        public final TakeAwayOrder m18695a() {
            return this.f19492a;
        }
    }

    private AbstractC7343m0() {
    }

    public /* synthetic */ AbstractC7343m0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
