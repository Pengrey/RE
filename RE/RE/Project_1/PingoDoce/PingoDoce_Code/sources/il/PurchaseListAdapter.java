package il;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.Objects;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p183jg.InterfaceC6458c;
import p183jg.PurchaseDate;
import p426wg.AbstractC11915nd;
import p426wg.AbstractC11994rd;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: il.h */
/* loaded from: classes2.dex */
public final class PurchaseListAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f16974e;

    /* renamed from: f */
    private final boolean f16975f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PurchaseListAdapter.kt */
    /* renamed from: il.h$a */
    /* loaded from: classes2.dex */
    public static final class C6190a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6190a f16976w = new C6190a();

        C6190a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(InterfaceC6458c interfaceC6458c, InterfaceC6458c interfaceC6458c2) {
            Intrinsics.isThisObjectNull(interfaceC6458c, "old");
            Intrinsics.isThisObjectNull(interfaceC6458c2, "new");
            boolean z = interfaceC6458c instanceof Purchase;
            String str = interfaceC6458c;
            String str2 = interfaceC6458c2;
            if (z) {
                boolean z2 = interfaceC6458c2 instanceof Purchase;
                str = interfaceC6458c;
                str2 = interfaceC6458c2;
                if (z2) {
                    str = ((Purchase) interfaceC6458c).m14434i();
                    str2 = ((Purchase) interfaceC6458c2).m14434i();
                }
            }
            return Boolean.valueOf(Intrinsics.equals(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PurchaseListAdapter.kt */
    /* renamed from: il.h$b */
    /* loaded from: classes2.dex */
    public static final class C6191b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6191b(AbstractC11994rd abstractC11994rd) {
            super(abstractC11994rd);
            Intrinsics.isThisObjectNull(abstractC11994rd, "binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PurchaseListAdapter.kt */
    /* renamed from: il.h$c */
    /* loaded from: classes2.dex */
    public static final class C6192c extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6192c(AbstractC11915nd abstractC11915nd) {
            super(abstractC11915nd);
            Intrinsics.isThisObjectNull(abstractC11915nd, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseListAdapter(InterfaceC6108l interfaceC6108l, boolean z) {
        super(C6190a.f16976w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onClick");
        this.f16974e = interfaceC6108l;
        this.f16975f = z;
    }

    /* renamed from: I */
    public static /* synthetic */ void m21954I(PurchaseListAdapter purchaseListAdapter, BindableViewHolder bindableViewHolder, View view) {
        m21952K(purchaseListAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m21952K(PurchaseListAdapter purchaseListAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(purchaseListAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        InterfaceC6108l interfaceC6108l = purchaseListAdapter.f16974e;
        Object m22155D = purchaseListAdapter.m22155D(((C6192c) bindableViewHolder).m36568j());
        Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.purchases.Purchase");
        interfaceC6108l.mo9587d((Purchase) m22155D);
    }

    /* renamed from: J */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        InterfaceC6458c interfaceC6458c = (InterfaceC6458c) m22155D(i);
        if (interfaceC6458c != null) {
            if (interfaceC6458c instanceof Purchase) {
                C6192c c6192c = (C6192c) bindableViewHolder;
                ((AbstractC11915nd) c6192c.m22151M()).mo3918S((Purchase) interfaceC6458c);
                ((AbstractC11915nd) c6192c.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: il.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PurchaseListAdapter.m21952K(PurchaseListAdapter.this, bindableViewHolder, view);
                    }
                });
            } else if (interfaceC6458c instanceof PurchaseDate) {
                if (i == 0 && this.f16975f) {
                    View m37802s = bindableViewHolder.m22151M().m37802s();
                    Intrinsics.checkIfNull(m37802s, "holder.binding.root");
                    bindableViewHolder.m22151M().m37802s().setPadding(m37802s.getPaddingLeft(), 0, m37802s.getPaddingRight(), m37802s.getPaddingBottom());
                }
                ((AbstractC11994rd) ((C6191b) bindableViewHolder).m22151M()).mo3776S(((PurchaseDate) interfaceC6458c).m20848a());
            }
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (i == 0) {
            AbstractC11915nd m3973Q = AbstractC11915nd.m3973Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3973Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C6192c(m3973Q);
        }
        AbstractC11994rd m3825Q = AbstractC11994rd.m3825Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3825Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C6191b(m3825Q);
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return !(m22155D(i) instanceof Purchase) ? 1 : 0;
    }
}
