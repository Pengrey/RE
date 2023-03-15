package p188jl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC12030td;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.models.purchases.PurchaseProduct;

/* renamed from: jl.g */
/* loaded from: classes2.dex */
public final class PurchaseProductsListAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f17690e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseProductsListAdapter.kt */
    /* renamed from: jl.g$a */
    /* loaded from: classes2.dex */
    public static final class C6530a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6530a f17691w = new C6530a();

        C6530a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(PurchaseProduct purchaseProduct, PurchaseProduct purchaseProduct2) {
            Intrinsics.isThisObjectNull(purchaseProduct, "old");
            Intrinsics.isThisObjectNull(purchaseProduct2, "new");
            return Boolean.valueOf(Intrinsics.equals(purchaseProduct, purchaseProduct2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseProductsListAdapter(InterfaceC6108l interfaceC6108l) {
        super(C6530a.f17691w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onItemsCheckUpdate");
        this.f17690e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20705I(PurchaseProductsListAdapter purchaseProductsListAdapter, View view) {
        m20700N(purchaseProductsListAdapter, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m20704J(BindableViewHolder bindableViewHolder, View view) {
        m20701M(bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m20701M(BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        ((AbstractC12030td) bindableViewHolder.m22151M()).f31558D.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m20700N(PurchaseProductsListAdapter purchaseProductsListAdapter, View view) {
        Intrinsics.isThisObjectNull(purchaseProductsListAdapter, "this$0");
        InterfaceC6108l interfaceC6108l = purchaseProductsListAdapter.f17690e;
        List<PurchaseProduct> m22154E = purchaseProductsListAdapter.m22154E();
        int i = 0;
        if (!(m22154E instanceof Collection) || !m22154E.isEmpty()) {
            for (PurchaseProduct purchaseProduct : m22154E) {
                if (purchaseProduct.m14409h0() && (i = i + 1) < 0) {
                    C13780s.m188p();
                }
            }
        }
        interfaceC6108l.mo9587d(Integer.valueOf(i));
    }

    /* renamed from: K */
    public final List m20703K() {
        List m22154E = m22154E();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m22154E) {
            if (((PurchaseProduct) obj).m14409h0()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        PurchaseProduct purchaseProduct = (PurchaseProduct) m22155D(i);
        if (purchaseProduct != null) {
            ((AbstractC12030td) bindableViewHolder.m22151M()).mo3707S(purchaseProduct);
            ((AbstractC12030td) bindableViewHolder.m22151M()).mo3706T(true);
            ((AbstractC12030td) bindableViewHolder.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: jl.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PurchaseProductsListAdapter.m20701M(BindableViewHolder.this, view);
                }
            });
            ((AbstractC12030td) bindableViewHolder.m22151M()).f31558D.setOnClickListener(new View.OnClickListener() { // from class: jl.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PurchaseProductsListAdapter.m20700N(PurchaseProductsListAdapter.this, view);
                }
            });
        }
    }

    /* renamed from: O */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC12030td m3767Q = AbstractC12030td.m3767Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3767Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C6536l(m3767Q);
    }
}
