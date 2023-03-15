package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.remote.models.request.AppNotifications;

/* renamed from: mg.b */
/* loaded from: classes2.dex */
public abstract class UserManager<T> {

    /* compiled from: UserManager.kt */
    /* renamed from: mg.b$a */
    /* loaded from: classes2.dex */
    public static final class C7200a extends UserManager {

        /* renamed from: a */
        private final BaseException f19042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7200a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19042a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18953a() {
            return this.f19042a;
        }
    }

    /* compiled from: UserManager.kt */
    /* renamed from: mg.b$b */
    /* loaded from: classes2.dex */
    public static final class C7201b extends UserManager {

        /* renamed from: a */
        private final AppNotifications f19043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7201b(AppNotifications appNotifications) {
            super(null);
            Intrinsics.isThisObjectNull(appNotifications, "data");
            this.f19043a = appNotifications;
        }

        /* renamed from: a */
        public final AppNotifications m18952a() {
            return this.f19043a;
        }
    }

    /* compiled from: UserManager.kt */
    /* renamed from: mg.b$c */
    /* loaded from: classes2.dex */
    public static final class C7202c extends UserManager {

        /* renamed from: a */
        public static final C7202c f19044a = new C7202c();

        private C7202c() {
            super(null);
        }
    }

    private UserManager() {
    }

    public /* synthetic */ UserManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
