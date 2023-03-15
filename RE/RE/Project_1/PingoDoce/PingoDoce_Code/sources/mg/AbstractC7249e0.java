package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.remote.models.request.MadeForYou;

/* compiled from: UserManager.kt */
/* renamed from: mg.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7249e0<T> {

    /* compiled from: UserManager.kt */
    /* renamed from: mg.e0$a */
    /* loaded from: classes2.dex */
    public static final class C7250a extends AbstractC7249e0 {

        /* renamed from: a */
        private final BaseException f19178a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7250a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19178a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18865a() {
            return this.f19178a;
        }
    }

    /* compiled from: UserManager.kt */
    /* renamed from: mg.e0$b */
    /* loaded from: classes2.dex */
    public static final class C7251b extends AbstractC7249e0 {

        /* renamed from: a */
        private final MadeForYou f19179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7251b(MadeForYou madeForYou) {
            super(null);
            Intrinsics.isThisObjectNull(madeForYou, "data");
            this.f19179a = madeForYou;
        }

        /* renamed from: a */
        public final MadeForYou m18864a() {
            return this.f19179a;
        }
    }

    /* compiled from: UserManager.kt */
    /* renamed from: mg.e0$c */
    /* loaded from: classes2.dex */
    public static final class C7252c extends AbstractC7249e0 {

        /* renamed from: a */
        public static final C7252c f19180a = new C7252c();

        private C7252c() {
            super(null);
        }
    }

    private AbstractC7249e0() {
    }

    public /* synthetic */ AbstractC7249e0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
