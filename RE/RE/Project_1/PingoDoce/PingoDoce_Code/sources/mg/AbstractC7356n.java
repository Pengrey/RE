package mg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p425we.BaseException;

/* compiled from: ShoppingListManager.kt */
/* renamed from: mg.n */
/* loaded from: classes2.dex */
public abstract class AbstractC7356n<T> {

    /* compiled from: ShoppingListManager.kt */
    /* renamed from: mg.n$a */
    /* loaded from: classes2.dex */
    public static final class C7357a extends AbstractC7356n {

        /* renamed from: a */
        private final BaseException f19528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7357a(BaseException baseException) {
            super(null);
            Intrinsics.isThisObjectNull(baseException, "exception");
            this.f19528a = baseException;
        }

        /* renamed from: a */
        public final BaseException m18665a() {
            return this.f19528a;
        }
    }

    /* compiled from: ShoppingListManager.kt */
    /* renamed from: mg.n$b */
    /* loaded from: classes2.dex */
    public static final class C7358b extends AbstractC7356n {

        /* renamed from: a */
        private final String f19529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7358b(String str) {
            super(null);
            Intrinsics.isThisObjectNull(str, "url");
            this.f19529a = str;
        }

        /* renamed from: a */
        public final String m18664a() {
            return this.f19529a;
        }
    }

    private AbstractC7356n() {
    }

    public /* synthetic */ AbstractC7356n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
