package p146hl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p183jg.InterfaceC6457b;
import p426wg.AbstractC11876ld;
import p426wg.AbstractC12030td;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.data.local.models.purchases.PurchaseProduct;

/* renamed from: hl.f */
/* loaded from: classes2.dex */
public final class PurchaseDetailAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f16477e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseDetailAdapter.kt */
    /* renamed from: hl.f$a */
    /* loaded from: classes2.dex */
    public static final class C5967a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C5967a f16478w = new C5967a();

        C5967a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(InterfaceC6457b interfaceC6457b, InterfaceC6457b interfaceC6457b2) {
            Intrinsics.isThisObjectNull(interfaceC6457b, "old");
            Intrinsics.isThisObjectNull(interfaceC6457b2, "new");
            return Boolean.valueOf(Intrinsics.equals(interfaceC6457b, interfaceC6457b2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PurchaseDetailAdapter.kt */
    /* renamed from: hl.f$b */
    /* loaded from: classes2.dex */
    public static final class C5968b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5968b(AbstractC11876ld abstractC11876ld) {
            super(abstractC11876ld);
            Intrinsics.isThisObjectNull(abstractC11876ld, "binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PurchaseDetailAdapter.kt */
    /* renamed from: hl.f$c */
    /* loaded from: classes2.dex */
    public static final class C5969c extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5969c(AbstractC12030td abstractC12030td) {
            super(abstractC12030td);
            Intrinsics.isThisObjectNull(abstractC12030td, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDetailAdapter(InterfaceC6108l interfaceC6108l) {
        super(C5967a.f16478w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onClick");
        this.f16477e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m22576I(PurchaseDetailAdapter purchaseDetailAdapter, InterfaceC6457b interfaceC6457b, View view) {
        m22574K(purchaseDetailAdapter, interfaceC6457b, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m22574K(PurchaseDetailAdapter purchaseDetailAdapter, InterfaceC6457b interfaceC6457b, View view) {
        Intrinsics.isThisObjectNull(purchaseDetailAdapter, "this$0");
        Intrinsics.isThisObjectNull(interfaceC6457b, "$purchase");
        purchaseDetailAdapter.f16477e.mo9587d(interfaceC6457b);
    }

    /* renamed from: J */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final InterfaceC6457b interfaceC6457b = (InterfaceC6457b) m22155D(i);
        if (interfaceC6457b != null) {
            if (interfaceC6457b instanceof PurchaseProduct) {
                ((AbstractC12030td) ((C5969c) bindableViewHolder).m22151M()).mo3707S((PurchaseProduct) interfaceC6457b);
            } else if (interfaceC6457b instanceof Purchase) {
                C5968b c5968b = (C5968b) bindableViewHolder;
                ((AbstractC11876ld) c5968b.m22151M()).mo3995T(61);
                Purchase purchase = (Purchase) interfaceC6457b;
                ((AbstractC11876ld) c5968b.m22151M()).mo3996S(purchase.m14439c());
                ((AbstractC11876ld) c5968b.m22151M()).mo3994U(purchase);
                ((AbstractC11876ld) c5968b.m22151M()).f30885x.setOnClickListener(new View.OnClickListener() { // from class: hl.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PurchaseDetailAdapter.m22574K(PurchaseDetailAdapter.this, interfaceC6457b, view);
                    }
                });
            }
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (i == 0) {
            AbstractC11876ld m4045Q = AbstractC11876ld.m4045Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4045Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C5968b(m4045Q);
        }
        AbstractC12030td m3767Q = AbstractC12030td.m3767Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3767Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5969c(m3767Q);
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return i == 0 ? 0 : 1;
    }
}
