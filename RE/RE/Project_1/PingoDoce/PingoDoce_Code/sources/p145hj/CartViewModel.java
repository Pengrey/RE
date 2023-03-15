package p145hj;

import androidx.lifecycle.C1459l0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.NoConnectionViewModel;
import mg.C7256f1;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p241mi.C7485d;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p470yf.SnackBarAction;
import p494zh.BaseViewModel;
import p494zh.C13833f2;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;
import pt.pingodoce.app.data.local.models.purchases.PurchaseProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* renamed from: hj.a */
/* loaded from: classes2.dex */
public abstract class CartViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final C7256f1 f16463p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CartViewModel.kt */
    /* renamed from: hj.a$a */
    /* loaded from: classes2.dex */
    public static final class C5955a extends AbstractC6438m implements InterfaceC6097a {
        C5955a() {
            super(0);
        }

        /* renamed from: a */
        public final void m22602a() {
            if (CartViewModel.this.m22608U() instanceof C5956b) {
                BaseViewModel.m119C(CartViewModel.this, C13833f2.f34941a, null, 2, null);
            }
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m22602a();
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7256f1 c7256f1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7256f1, "shoppingListManager");
        this.f16463p = c7256f1;
        m22606W();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: R */
    public final void m22611R(List list) {
        Intrinsics.isThisObjectNull(list, "products");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PurchaseProduct purchaseProduct = (PurchaseProduct) it.next();
            if (purchaseProduct.m14407y().length() == 0) {
                String m14416E = purchaseProduct.m14416E();
                ShoppingListCategory m18858C = this.f16463p.m18858C(purchaseProduct.m14502t());
                if (m18858C == null) {
                    m18858C = new ShoppingListCategory(null, null, purchaseProduct.m14502t(), 3, null);
                }
                m22609T(new LiteralProduct(null, 0L, m18858C, m14416E, 0, false, null, 0, 0, false, 1011, null));
            } else {
                m22610S(purchaseProduct, 1);
            }
        }
        m22606W();
    }

    /* renamed from: S */
    public final void m22610S(CatalogProduct catalogProduct, int i) {
        String m14465b;
        String m14462e;
        String m14463d;
        String m14456m;
        Intrinsics.isThisObjectNull(catalogProduct, "product");
        Promotion m14512e = catalogProduct.m14512e();
        C7256f1 c7256f1 = this.f16463p;
        String m14499y = catalogProduct.m14499y();
        ShoppingListCategory m18858C = this.f16463p.m18858C(catalogProduct.m14502t());
        if (m18858C == null) {
            m18858C = new ShoppingListCategory(null, null, catalogProduct.m14502t(), 3, null);
        }
        c7256f1.m18833f(new ShoppingListProduct(m14499y, 0L, m18858C, catalogProduct.m14540E(), i, false, catalogProduct.m14541D(), (m14512e == null || (m14456m = m14512e.m14456m()) == null) ? BuildConfig.VERSION_NAME : m14456m, (m14512e == null || (m14463d = m14512e.m14463d()) == null) ? BuildConfig.VERSION_NAME : m14463d, (m14512e == null || (m14462e = m14512e.m14462e()) == null) ? BuildConfig.VERSION_NAME : m14462e, m14512e != null ? m14512e.m14455n() : false, (m14512e == null || (m14465b = m14512e.m14465b()) == null) ? BuildConfig.VERSION_NAME : m14465b, catalogProduct.m14520Y(), catalogProduct.m14520Y(), null, catalogProduct.m14537H(), 0, false, 213026, null));
        m22606W();
    }

    /* renamed from: T */
    public final void m22609T(LiteralProduct literalProduct) {
        Intrinsics.isThisObjectNull(literalProduct, "product");
        this.f16463p.m18833f(literalProduct);
        m22606W();
    }

    /* renamed from: U */
    protected AbstractC5957c m22608U() {
        return C5956b.f16465a;
    }

    /* renamed from: V */
    public final ShoppingListProduct m22607V(String str) {
        Intrinsics.isThisObjectNull(str, "id");
        return this.f16463p.m18815x(str);
    }

    /* renamed from: W */
    public final void m22606W() {
        C7485d.f19794a.m18382b(this.f16463p.m18814y());
    }

    /* renamed from: X */
    public final void m22605X() {
        SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
        String string = m20390g().m6899a().getString(C2336R.string.lbl_product_added);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String string2 = m20390g().m6899a().getString(C2336R.string.btn_shopping_list_alt2);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        SnackBarLiveData.m21968c(snackBarLiveData, string, new SnackBarAction(string2, new C5955a()), 0, 0, 4, null);
    }

    /* renamed from: Y */
    public final void m22604Y(List list) {
        Intrinsics.isThisObjectNull(list, "values");
        this.f16463p.m18834e(list);
    }

    /* renamed from: Z */
    public final List m22603Z(List list) {
        Intrinsics.isThisObjectNull(list, "value");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CatalogProduct m14513d = ((CatalogProduct) it.next()).m14513d();
            m14513d.m14521X(0);
            ShoppingListProduct m22607V = m22607V(m14513d.m14499y());
            if (m22607V != null) {
                m14513d.m14521X(m22607V.m14332j() ? m14513d.m14538G() : m22607V.m14327s());
            }
            arrayList.add(m14513d);
        }
        return arrayList;
    }
}
