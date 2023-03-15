package mg;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* renamed from: mg.b0 */
/* loaded from: classes2.dex */
public abstract class ShoppingListManager<T> {

    /* compiled from: ShoppingListManager.kt */
    /* renamed from: mg.b0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7203a extends ShoppingListManager {

        /* compiled from: ShoppingListManager.kt */
        /* renamed from: mg.b0$a$a */
        /* loaded from: classes2.dex */
        public static final class C7204a extends AbstractC7203a {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7204a(BaseException baseException) {
                super(baseException, null);
                Intrinsics.isThisObjectNull(baseException, "exception");
            }
        }

        private AbstractC7203a(BaseException baseException) {
            super(null);
        }

        public /* synthetic */ AbstractC7203a(BaseException baseException, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseException);
        }
    }

    /* compiled from: ShoppingListManager.kt */
    /* renamed from: mg.b0$b */
    /* loaded from: classes2.dex */
    public static final class C7205b extends ShoppingListManager {

        /* renamed from: a */
        private final List f19045a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7205b(List list) {
            super(null);
            Intrinsics.isThisObjectNull(list, "data");
            this.f19045a = list;
        }

        /* renamed from: a */
        public final List m18951a() {
            return this.f19045a;
        }
    }

    private ShoppingListManager() {
    }

    public /* synthetic */ ShoppingListManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
