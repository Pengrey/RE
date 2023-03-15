package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.remote.models.response.CardOwnerResponse;

/* compiled from: OnboardingManager.kt */
/* renamed from: mg.v1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7460v1<T> {

    /* compiled from: OnboardingManager.kt */
    /* renamed from: mg.v1$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7461a extends AbstractC7460v1 {

        /* renamed from: a */
        private final BaseException f19751a;

        /* compiled from: OnboardingManager.kt */
        /* renamed from: mg.v1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7462a extends AbstractC7461a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7462a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: OnboardingManager.kt */
        /* renamed from: mg.v1$a$b */
        /* loaded from: classes2.dex */
        public static final class C7463b extends AbstractC7461a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7463b(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: OnboardingManager.kt */
        /* renamed from: mg.v1$a$c */
        /* loaded from: classes2.dex */
        public static final class C7464c extends AbstractC7461a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7464c(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7461a(BaseException baseException) {
            super(null);
            this.f19751a = baseException;
        }

        public /* synthetic */ AbstractC7461a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }

        /* renamed from: a */
        public final BaseException m18438a() {
            return this.f19751a;
        }
    }

    /* compiled from: OnboardingManager.kt */
    /* renamed from: mg.v1$b */
    /* loaded from: classes2.dex */
    public static final class C7465b extends AbstractC7460v1 {

        /* renamed from: a */
        private final CardOwnerResponse f19752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7465b(CardOwnerResponse cardOwnerResponse) {
            super(null);
            Intrinsics.isThisObjectNull(cardOwnerResponse, "data");
            this.f19752a = cardOwnerResponse;
        }

        /* renamed from: a */
        public final CardOwnerResponse m18437a() {
            return this.f19752a;
        }
    }

    private AbstractC7460v1() {
    }

    public /* synthetic */ AbstractC7460v1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
