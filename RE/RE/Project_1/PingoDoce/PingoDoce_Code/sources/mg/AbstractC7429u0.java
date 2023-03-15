package mg;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: ShoppingListManager.kt */
/* renamed from: mg.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7429u0<T> {

    /* compiled from: ShoppingListManager.kt */
    /* renamed from: mg.u0$a */
    /* loaded from: classes2.dex */
    public static final class C7430a extends AbstractC7429u0 {

        /* renamed from: a */
        private final BaseException f19706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7430a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19706a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18461a() {
            return this.f19706a;
        }
    }

    /* compiled from: ShoppingListManager.kt */
    /* renamed from: mg.u0$b */
    /* loaded from: classes2.dex */
    public static final class C7431b extends AbstractC7429u0 {

        /* renamed from: a */
        private final List f19707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7431b(List list) {
            super(null);
            Intrinsics.isThisObjectNull(list, "data");
            this.f19707a = list;
        }

        /* renamed from: a */
        public final List m18460a() {
            return this.f19707a;
        }
    }

    private AbstractC7429u0() {
    }

    public /* synthetic */ AbstractC7429u0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
