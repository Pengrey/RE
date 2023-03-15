package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: EmailManager.kt */
/* renamed from: mg.x */
/* loaded from: classes2.dex */
public abstract class AbstractC7468x<T> {

    /* compiled from: EmailManager.kt */
    /* renamed from: mg.x$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7469a extends AbstractC7468x {

        /* renamed from: a */
        private final BaseException f19756a;

        /* compiled from: EmailManager.kt */
        /* renamed from: mg.x$a$a */
        /* loaded from: classes2.dex */
        public static final class C7470a extends AbstractC7469a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7470a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: EmailManager.kt */
        /* renamed from: mg.x$a$b */
        /* loaded from: classes2.dex */
        public static final class C7471b extends AbstractC7469a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7471b(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7469a(BaseException baseException) {
            super(null);
            this.f19756a = baseException;
        }

        public /* synthetic */ AbstractC7469a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }

        /* renamed from: a */
        public final BaseException m18430a() {
            return this.f19756a;
        }
    }

    /* compiled from: EmailManager.kt */
    /* renamed from: mg.x$b */
    /* loaded from: classes2.dex */
    public static final class C7472b extends AbstractC7468x {

        /* renamed from: a */
        public static final C7472b f19757a = new C7472b();

        private C7472b() {
            super(null);
        }
    }

    private AbstractC7468x() {
    }

    public /* synthetic */ AbstractC7468x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
