package p188jl;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Arrays;
import java.util.List;
import mg.C7256f1;
import mg.PurchasesManager;
import p145hj.CartViewModel;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p470yf.SnackBarAction;
import p494zh.BaseViewModel;

/* renamed from: jl.i */
/* loaded from: classes2.dex */
public final class PurchaseProductsViewModel extends CartViewModel {

    /* renamed from: q */
    private final InterfaceC6108l f17693q;

    /* renamed from: r */
    private final C1436e0 f17694r;

    /* renamed from: s */
    private final C1436e0 f17695s;

    /* renamed from: t */
    private final C1436e0 f17696t;

    /* renamed from: u */
    private int f17697u;

    /* renamed from: v */
    private final LiveData f17698v;

    /* renamed from: w */
    private final LiveData f17699w;

    /* renamed from: x */
    private final LiveData f17700x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseProductsViewModel.kt */
    /* renamed from: jl.i$a */
    /* loaded from: classes2.dex */
    public static final class C6532a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C6532a f17701w = new C6532a();

        C6532a() {
            super(0);
        }

        /* renamed from: a */
        public final void m20685a() {
            UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m20685a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseProductsViewModel.kt */
    /* renamed from: jl.i$b */
    /* loaded from: classes2.dex */
    public static final class C6533b extends AbstractC6438m implements InterfaceC6108l {
        C6533b() {
            super(1);
        }

        /* renamed from: a */
        public final void m20684a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            PurchaseProductsViewModel.m20693b0(PurchaseProductsViewModel.this).mo166p(C13195u.f34156a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20684a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProductsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1, PurchasesManager purchasesManager) {
        super(c1459l0, resourcesProvider, c7256f1);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        Intrinsics.isThisObjectNull(purchasesManager, "purchasesManager");
        this.f17693q = BaseViewModel.m113I(this, 0L, new C6533b(), 1, null);
        C1436e0 c1436e0 = new C1436e0(purchasesManager.m18450c());
        this.f17694r = c1436e0;
        C6429c0 c6429c0 = C6429c0.f17515a;
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_add_to_shoppinglist_alt);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String format = String.format(string, Arrays.copyOf(new Object[]{0}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        C1436e0 c1436e02 = new C1436e0(format);
        this.f17695s = c1436e02;
        C1436e0 c1436e03 = new C1436e0();
        this.f17696t = c1436e03;
        this.f17698v = c1436e0;
        this.f17699w = c1436e02;
        this.f17700x = c1436e03;
        purchasesManager.m18451b();
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m20694a0(PurchaseProductsViewModel purchaseProductsViewModel, View view) {
        m20691d0(purchaseProductsViewModel, view);
    }

    /* renamed from: b0 */
    public static final /* synthetic */ C1436e0 m20693b0(PurchaseProductsViewModel purchaseProductsViewModel) {
        return purchaseProductsViewModel.f17696t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m20691d0(PurchaseProductsViewModel purchaseProductsViewModel, View view) {
        Intrinsics.isThisObjectNull(purchaseProductsViewModel, "this$0");
        purchaseProductsViewModel.f17693q.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N */
    protected void m20695N() {
    }

    /* renamed from: c0 */
    public final View.OnClickListener m20692c0() {
        return new View.OnClickListener() { // from class: jl.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PurchaseProductsViewModel.m20691d0(PurchaseProductsViewModel.this, view);
            }
        };
    }

    /* renamed from: e0 */
    public final void m20690e0(List list) {
        Intrinsics.isThisObjectNull(list, "selectedProducts");
        if (!list.isEmpty()) {
            m22611R(list);
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            C6429c0 c6429c0 = C6429c0.f17515a;
            ResourcesProvider m20390g = m20390g();
            int i = this.f17697u;
            String quantityString = m20390g.m6899a().getResources().getQuantityString(C2336R.plurals.lbl_product_added_plurals, i, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkIfNull(quantityString, "ctx.resources.getQuantit…d, quantity, *formatArgs)");
            String format = String.format(quantityString, Arrays.copyOf(new Object[0], 0));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            String string = m20390g().m6899a().getString(C2336R.string.btn_shopping_list_alt2);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            SnackBarLiveData.m21968c(snackBarLiveData, format, new SnackBarAction(string, C6532a.f17701w), 0, 0, 4, null);
        }
    }

    /* renamed from: f0 */
    public final LiveData m20689f0() {
        return this.f17700x;
    }

    /* renamed from: g0 */
    public final LiveData m20688g0() {
        return this.f17699w;
    }

    /* renamed from: h0 */
    public final LiveData m20687h0() {
        return this.f17698v;
    }

    /* renamed from: i0 */
    public final void m20686i0(int i) {
        this.f17697u = i;
        C1436e0 c1436e0 = this.f17695s;
        C6429c0 c6429c0 = C6429c0.f17515a;
        String string = m20390g().m6899a().getString(C2336R.string.btn_add_to_shoppinglist_alt);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        c1436e0.mo166p(format);
    }
}
