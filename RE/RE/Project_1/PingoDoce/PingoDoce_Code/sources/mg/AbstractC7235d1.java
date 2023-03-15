package mg;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: CatalogManager.kt */
/* renamed from: mg.d1 */
/* loaded from: classes2.dex */
public abstract class AbstractC7235d1<T> {

    /* compiled from: CatalogManager.kt */
    /* renamed from: mg.d1$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7236a extends AbstractC7235d1 {

        /* compiled from: CatalogManager.kt */
        /* renamed from: mg.d1$a$a */
        /* loaded from: classes2.dex */
        public static final class C7237a extends AbstractC7236a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7237a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7236a(BaseException baseException) {
            super(null);
        }

        public /* synthetic */ AbstractC7236a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }
    }

    /* compiled from: CatalogManager.kt */
    /* renamed from: mg.d1$b */
    /* loaded from: classes2.dex */
    public static final class C7238b extends AbstractC7235d1 {

        /* renamed from: a */
        private final List f19122a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7238b(List list) {
            super(null);
            Intrinsics.isThisObjectNull(list, "data");
            this.f19122a = list;
        }

        /* renamed from: a */
        public final List m18900a() {
            return this.f19122a;
        }
    }

    private AbstractC7235d1() {
    }

    public /* synthetic */ AbstractC7235d1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
