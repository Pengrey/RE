package p341ri;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC12138zb;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;

/* renamed from: ri.a */
/* loaded from: classes2.dex */
public final class ApprovedAdapter extends DiffUtilAsyncBindableAdapter {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ApprovedAdapter.kt */
    /* renamed from: ri.a$a */
    /* loaded from: classes2.dex */
    public static final class C9907a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C9907a f25908w = new C9907a();

        C9907a() {
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
    /* compiled from: ApprovedAdapter.kt */
    /* renamed from: ri.a$b */
    /* loaded from: classes2.dex */
    public static final class C9908b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9908b(AbstractC12138zb abstractC12138zb) {
            super(abstractC12138zb);
            Intrinsics.isThisObjectNull(abstractC12138zb, "binding");
        }
    }

    public ApprovedAdapter() {
        super(C9907a.f25908w);
    }

    /* renamed from: I */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        LoyaltyCardAssociation loyaltyCardAssociation = (LoyaltyCardAssociation) m22155D(bindableViewHolder.m36568j());
        if (loyaltyCardAssociation != null) {
            ((AbstractC12138zb) bindableViewHolder.m22151M()).mo3567S(loyaltyCardAssociation);
        }
    }

    /* renamed from: J */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC12138zb m3569Q = AbstractC12138zb.m3569Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3569Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C9908b(m3569Q);
    }
}
