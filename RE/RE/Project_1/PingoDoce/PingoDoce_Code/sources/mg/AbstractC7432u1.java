package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: SmsManager.kt */
/* renamed from: mg.u1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7432u1<T> {

    /* compiled from: SmsManager.kt */
    /* renamed from: mg.u1$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7433a extends AbstractC7432u1 {

        /* renamed from: a */
        private final BaseException f19708a;

        /* compiled from: SmsManager.kt */
        /* renamed from: mg.u1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7434a extends AbstractC7433a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7434a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: SmsManager.kt */
        /* renamed from: mg.u1$a$b */
        /* loaded from: classes2.dex */
        public static final class C7435b extends AbstractC7433a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7435b(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: SmsManager.kt */
        /* renamed from: mg.u1$a$c */
        /* loaded from: classes2.dex */
        public static final class C7436c extends AbstractC7433a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7436c(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7433a(BaseException baseException) {
            super(null);
            this.f19708a = baseException;
        }

        public /* synthetic */ AbstractC7433a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }

        /* renamed from: a */
        public final BaseException m18459a() {
            return this.f19708a;
        }
    }

    /* compiled from: SmsManager.kt */
    /* renamed from: mg.u1$b */
    /* loaded from: classes2.dex */
    public static final class C7437b extends AbstractC7432u1 {

        /* renamed from: a */
        private final User f19709a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7437b(User user) {
            super(null);
            Intrinsics.isThisObjectNull(user, "data");
            this.f19709a = user;
        }

        /* renamed from: a */
        public final User m18458a() {
            return this.f19709a;
        }
    }

    /* compiled from: SmsManager.kt */
    /* renamed from: mg.u1$c */
    /* loaded from: classes2.dex */
    public static final class C7438c extends AbstractC7432u1 {

        /* renamed from: a */
        public static final C7438c f19710a = new C7438c();

        private C7438c() {
            super(null);
        }
    }

    /* compiled from: SmsManager.kt */
    /* renamed from: mg.u1$d */
    /* loaded from: classes2.dex */
    public static final class C7439d extends AbstractC7432u1 {

        /* renamed from: a */
        private final User f19711a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7439d(User user) {
            super(null);
            Intrinsics.isThisObjectNull(user, "data");
            this.f19711a = user;
        }

        /* renamed from: a */
        public final User m18457a() {
            return this.f19711a;
        }
    }

    /* compiled from: SmsManager.kt */
    /* renamed from: mg.u1$e */
    /* loaded from: classes2.dex */
    public static final class C7440e extends AbstractC7432u1 {

        /* renamed from: a */
        public static final C7440e f19712a = new C7440e();

        private C7440e() {
            super(null);
        }
    }

    private AbstractC7432u1() {
    }

    public /* synthetic */ AbstractC7432u1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
