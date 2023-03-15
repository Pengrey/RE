package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;
import p425we.BaseException;

/* renamed from: mg.b1 */
/* loaded from: classes2.dex */
public abstract class OnboardingManager<T> {

    /* compiled from: OnboardingManager.kt */
    /* renamed from: mg.b1$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7206a extends OnboardingManager {

        /* renamed from: a */
        private final BaseException f19046a;

        /* compiled from: OnboardingManager.kt */
        /* renamed from: mg.b1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7207a extends AbstractC7206a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7207a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: OnboardingManager.kt */
        /* renamed from: mg.b1$a$b */
        /* loaded from: classes2.dex */
        public static final class C7208b extends AbstractC7206a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7208b(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7206a(BaseException baseException) {
            super(null);
            this.f19046a = baseException;
        }

        public /* synthetic */ AbstractC7206a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }

        /* renamed from: a */
        public final BaseException m18950a() {
            return this.f19046a;
        }
    }

    /* compiled from: OnboardingManager.kt */
    /* renamed from: mg.b1$b */
    /* loaded from: classes2.dex */
    public static final class C7209b extends OnboardingManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7209b(User user) {
            super(null);
            Intrinsics.isThisObjectNull(user, "data");
        }
    }

    private OnboardingManager() {
    }

    public /* synthetic */ OnboardingManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
