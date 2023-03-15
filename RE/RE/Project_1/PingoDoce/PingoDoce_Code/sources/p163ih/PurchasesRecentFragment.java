package p163ih;

import ae.InterfaceC0131a;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12023t6;
import p494zh.AbstractC13876n;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: ih.g */
/* loaded from: classes2.dex */
public final class PurchasesRecentFragment extends AbstractC13876n {

    /* renamed from: A0 */
    public ViewModelFactoryByInjection f16878A0;

    /* renamed from: z0 */
    private final InterfaceC6108l f16879z0;

    /* compiled from: PurchasesRecentFragment.kt */
    /* renamed from: ih.g$a */
    /* loaded from: classes2.dex */
    public static final class C6148a {
        private C6148a() {
        }

        public /* synthetic */ C6148a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PurchasesRecentFragment.kt */
    /* renamed from: ih.g$b */
    /* loaded from: classes2.dex */
    static final class C6149b extends AbstractC6438m implements InterfaceC6097a {
        C6149b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(PurchasesRecentFragment.this.m22058t2(), PurchasesRecentFragment.this, null, 2, null);
        }
    }

    /* compiled from: PurchasesRecentFragment.kt */
    /* renamed from: ih.g$c */
    /* loaded from: classes2.dex */
    public static final class C6150c implements InterfaceC0131a {
        C6150c() {
        }

        /* renamed from: b */
        public void mo41791a(Purchase purchase, int i) {
            Intrinsics.isThisObjectNull(purchase, "item");
            InterfaceC6108l m22059s2 = PurchasesRecentFragment.m22059s2(PurchasesRecentFragment.this);
            if (m22059s2 != null) {
                m22059s2.mo9587d(purchase);
            }
        }
    }

    static {
        new C6148a(null);
    }

    public PurchasesRecentFragment() {
        this(null, 1, null);
    }

    public /* synthetic */ PurchasesRecentFragment(InterfaceC6108l interfaceC6108l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC6108l);
    }

    /* renamed from: s2 */
    public static final /* synthetic */ InterfaceC6108l m22059s2(PurchasesRecentFragment purchasesRecentFragment) {
        return purchasesRecentFragment.f16879z0;
    }

    /* renamed from: i2 */
    protected int m22063i2() {
        return C2336R.layout.fragment_purchases_recent;
    }

    /* renamed from: k2 */
    protected InterfaceC9717b m22062k2() {
        return C6450z.m20906b(PurchasesRecentViewModel.class);
    }

    /* renamed from: l2 */
    protected InterfaceC6097a m22061l2() {
        return new C6149b();
    }

    /* renamed from: t2 */
    public final ViewModelFactoryByInjection m22058t2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f16878A0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u2 */
    public void m22060p2(AbstractC12023t6 abstractC12023t6, PurchasesRecentViewModel purchasesRecentViewModel) {
        Intrinsics.isThisObjectNull(abstractC12023t6, "binding");
        Intrinsics.isThisObjectNull(purchasesRecentViewModel, "viewModel");
        abstractC12023t6.mo3722Q(new C6150c());
    }

    public PurchasesRecentFragment(InterfaceC6108l interfaceC6108l) {
        this.f16879z0 = interfaceC6108l;
    }
}
