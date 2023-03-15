package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: PhoneManager.kt */
/* renamed from: mg.p0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7377p0<T> {

    /* compiled from: PhoneManager.kt */
    /* renamed from: mg.p0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7378a extends AbstractC7377p0 {

        /* renamed from: a */
        private final BaseException f19589a;

        /* compiled from: PhoneManager.kt */
        /* renamed from: mg.p0$a$a */
        /* loaded from: classes2.dex */
        public static final class C7379a extends AbstractC7378a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7379a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        /* compiled from: PhoneManager.kt */
        /* renamed from: mg.p0$a$b */
        /* loaded from: classes2.dex */
        public static final class C7380b extends AbstractC7378a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7380b(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7378a(BaseException baseException) {
            super(null);
            this.f19589a = baseException;
        }

        public /* synthetic */ AbstractC7378a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }

        /* renamed from: a */
        public final BaseException m18626a() {
            return this.f19589a;
        }
    }

    /* compiled from: PhoneManager.kt */
    /* renamed from: mg.p0$b */
    /* loaded from: classes2.dex */
    public static final class C7381b extends AbstractC7377p0 {

        /* renamed from: a */
        public static final C7381b f19590a = new C7381b();

        private C7381b() {
            super(null);
        }
    }

    private AbstractC7377p0() {
    }

    public /* synthetic */ AbstractC7377p0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
