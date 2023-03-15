package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.data.remote.models.response.ElectronicInvoice;

/* compiled from: LoyaltyCardManager.kt */
/* renamed from: mg.u */
/* loaded from: classes2.dex */
public abstract class AbstractC7425u<T> {

    /* compiled from: LoyaltyCardManager.kt */
    /* renamed from: mg.u$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7426a extends AbstractC7425u {

        /* renamed from: a */
        private final BaseException f19704a;

        /* compiled from: LoyaltyCardManager.kt */
        /* renamed from: mg.u$a$a */
        /* loaded from: classes2.dex */
        public static final class C7427a extends AbstractC7426a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7427a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7426a(BaseException baseException) {
            super(null);
            this.f19704a = baseException;
        }

        public /* synthetic */ AbstractC7426a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }

        /* renamed from: a */
        public final BaseException m18463a() {
            return this.f19704a;
        }
    }

    /* compiled from: LoyaltyCardManager.kt */
    /* renamed from: mg.u$b */
    /* loaded from: classes2.dex */
    public static final class C7428b extends AbstractC7425u {

        /* renamed from: a */
        private final ElectronicInvoice f19705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7428b(ElectronicInvoice electronicInvoice) {
            super(null);
            Intrinsics.isThisObjectNull(electronicInvoice, "data");
            this.f19705a = electronicInvoice;
        }

        /* renamed from: a */
        public final ElectronicInvoice m18462a() {
            return this.f19705a;
        }
    }

    private AbstractC7425u() {
    }

    public /* synthetic */ AbstractC7425u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
