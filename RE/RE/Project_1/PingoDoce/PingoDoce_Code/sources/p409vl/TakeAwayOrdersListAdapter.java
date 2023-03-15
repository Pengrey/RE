package p409vl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11995re;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* renamed from: vl.h */
/* loaded from: classes2.dex */
public final class TakeAwayOrdersListAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f29263e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayOrdersListAdapter.kt */
    /* renamed from: vl.h$a */
    /* loaded from: classes2.dex */
    public static final class C11404a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C11404a f29264w = new C11404a();

        C11404a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(TakeAwayOrder takeAwayOrder, TakeAwayOrder takeAwayOrder2) {
            Intrinsics.isThisObjectNull(takeAwayOrder, "old");
            Intrinsics.isThisObjectNull(takeAwayOrder2, "new");
            return Boolean.valueOf(Intrinsics.equals(takeAwayOrder.m14283c(), takeAwayOrder2.m14283c()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TakeAwayOrdersListAdapter.kt */
    /* renamed from: vl.h$b */
    /* loaded from: classes2.dex */
    public static final class C11405b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11405b(AbstractC11995re abstractC11995re) {
            super(abstractC11995re);
            Intrinsics.isThisObjectNull(abstractC11995re, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayOrdersListAdapter(InterfaceC6108l interfaceC6108l) {
        super(C11404a.f29264w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "onClick");
        this.f29263e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m5224I(TakeAwayOrdersListAdapter takeAwayOrdersListAdapter, BindableViewHolder bindableViewHolder, View view) {
        m5222K(takeAwayOrdersListAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m5222K(TakeAwayOrdersListAdapter takeAwayOrdersListAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(takeAwayOrdersListAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        TakeAwayOrder takeAwayOrder = (TakeAwayOrder) takeAwayOrdersListAdapter.m22155D(bindableViewHolder.m36568j());
        if (takeAwayOrder != null) {
            takeAwayOrdersListAdapter.f29263e.mo9587d(takeAwayOrder);
        }
    }

    /* renamed from: J */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        TakeAwayOrder takeAwayOrder = (TakeAwayOrder) m22155D(i);
        if (takeAwayOrder != null) {
            ((AbstractC11995re) bindableViewHolder.m22151M()).mo3775S(takeAwayOrder);
            ((AbstractC11995re) bindableViewHolder.m22151M()).m37802s().setOnClickListener(new View.OnClickListener() { // from class: vl.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TakeAwayOrdersListAdapter.m5222K(TakeAwayOrdersListAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11995re m3823Q = AbstractC11995re.m3823Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3823Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C11405b(m3823Q);
    }
}
