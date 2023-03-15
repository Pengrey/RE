package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;
import pt.pingodoce.app.presentation.common.search.models.FilterData;

/* renamed from: mg.a0 */
/* loaded from: classes2.dex */
public abstract class CatalogManager<T> {

    /* compiled from: CatalogManager.kt */
    /* renamed from: mg.a0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7196a extends CatalogManager {

        /* compiled from: CatalogManager.kt */
        /* renamed from: mg.a0$a$a */
        /* loaded from: classes2.dex */
        public static final class C7197a extends AbstractC7196a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7197a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7196a(BaseException baseException) {
            super(null);
        }

        public /* synthetic */ AbstractC7196a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }
    }

    /* compiled from: CatalogManager.kt */
    /* renamed from: mg.a0$b */
    /* loaded from: classes2.dex */
    public static final class C7198b extends CatalogManager {

        /* renamed from: a */
        private final FilterData f19040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7198b(FilterData filterData) {
            super(null);
            Intrinsics.isThisObjectNull(filterData, "data");
            this.f19040a = filterData;
        }

        /* renamed from: a */
        public final FilterData m18957a() {
            return this.f19040a;
        }
    }

    private CatalogManager() {
    }

    public /* synthetic */ CatalogManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
