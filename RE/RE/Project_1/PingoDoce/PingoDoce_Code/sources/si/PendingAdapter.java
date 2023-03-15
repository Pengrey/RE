package si;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11698bd;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;

/* renamed from: si.c */
/* loaded from: classes2.dex */
public final class PendingAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6112p f26645e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PendingAdapter.kt */
    /* renamed from: si.c$a */
    /* loaded from: classes2.dex */
    public static final class C10222a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C10222a f26646w = new C10222a();

        C10222a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(LoyaltyCardAssociation loyaltyCardAssociation, LoyaltyCardAssociation loyaltyCardAssociation2) {
            Intrinsics.isThisObjectNull(loyaltyCardAssociation, "old");
            Intrinsics.isThisObjectNull(loyaltyCardAssociation2, "new");
            return Boolean.valueOf(Intrinsics.equals(loyaltyCardAssociation, loyaltyCardAssociation2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PendingAdapter.kt */
    /* renamed from: si.c$b */
    /* loaded from: classes2.dex */
    public static final class C10223b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10223b(AbstractC11698bd abstractC11698bd) {
            super(abstractC11698bd);
            Intrinsics.isThisObjectNull(abstractC11698bd, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingAdapter(InterfaceC6112p interfaceC6112p) {
        super(C10222a.f26646w);
        Intrinsics.isThisObjectNull(interfaceC6112p, "onClick");
        this.f26645e = interfaceC6112p;
    }

    /* renamed from: I */
    public static /* synthetic */ void m8479I(PendingAdapter pendingAdapter, BindableViewHolder bindableViewHolder, View view) {
        m8476L(pendingAdapter, bindableViewHolder, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m8478J(PendingAdapter pendingAdapter, BindableViewHolder bindableViewHolder, View view) {
        m8475M(pendingAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m8476L(PendingAdapter pendingAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(pendingAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        LoyaltyCardAssociation loyaltyCardAssociation = (LoyaltyCardAssociation) pendingAdapter.m22155D(bindableViewHolder.m36568j());
        if (loyaltyCardAssociation != null) {
            pendingAdapter.f26645e.mo39856d(loyaltyCardAssociation, Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m8475M(PendingAdapter pendingAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(pendingAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        LoyaltyCardAssociation loyaltyCardAssociation = (LoyaltyCardAssociation) pendingAdapter.m22155D(bindableViewHolder.m36568j());
        if (loyaltyCardAssociation != null) {
            pendingAdapter.f26645e.mo39856d(loyaltyCardAssociation, Boolean.FALSE);
        }
    }

    /* renamed from: K */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        LoyaltyCardAssociation loyaltyCardAssociation = (LoyaltyCardAssociation) m22155D(bindableViewHolder.m36568j());
        if (loyaltyCardAssociation != null) {
            ((AbstractC11698bd) bindableViewHolder.m22151M()).mo4417S(loyaltyCardAssociation);
            ((AbstractC11698bd) bindableViewHolder.m22151M()).f29960x.setOnClickListener(new View.OnClickListener() { // from class: si.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PendingAdapter.m8476L(PendingAdapter.this, bindableViewHolder, view);
                }
            });
            ((AbstractC11698bd) bindableViewHolder.m22151M()).f29958A.setOnClickListener(new View.OnClickListener() { // from class: si.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PendingAdapter.m8475M(PendingAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: N */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11698bd m4458Q = AbstractC11698bd.m4458Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4458Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C10223b(m4458Q);
    }
}
