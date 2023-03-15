package mg;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: LoyaltyCardManager.kt */
/* renamed from: mg.c1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7229c1<T> {

    /* compiled from: LoyaltyCardManager.kt */
    /* renamed from: mg.c1$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7230a extends AbstractC7229c1 {

        /* compiled from: LoyaltyCardManager.kt */
        /* renamed from: mg.c1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7231a extends AbstractC7230a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7231a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7230a(BaseException baseException) {
            super(null);
        }

        public /* synthetic */ AbstractC7230a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }
    }

    /* compiled from: LoyaltyCardManager.kt */
    /* renamed from: mg.c1$b */
    /* loaded from: classes2.dex */
    public static final class C7232b extends AbstractC7229c1 {

        /* renamed from: a */
        private final List f19114a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7232b(List list) {
            super(null);
            Intrinsics.isThisObjectNull(list, "data");
            this.f19114a = list;
        }

        /* renamed from: a */
        public final List m18907a() {
            return this.f19114a;
        }
    }

    private AbstractC7229c1() {
    }

    public /* synthetic */ AbstractC7229c1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
