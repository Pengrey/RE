package p207kl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11837jb;
import p489zc.C13780s;

/* renamed from: kl.n0 */
/* loaded from: classes2.dex */
public final class ShoppingListItemPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShoppingListItemPlaceHolderAdapter.kt */
    /* renamed from: kl.n0$a */
    /* loaded from: classes2.dex */
    public static final class C6729a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6729a(AbstractC11837jb abstractC11837jb) {
            super(abstractC11837jb);
            Intrinsics.isThisObjectNull(abstractC11837jb, "binding");
        }
    }

    public ShoppingListItemPlaceHolderAdapter() {
        List m194j;
        List m22154E = m22154E();
        m194j = C13780s.m194j(1, 2, 3, 4, 5, 6);
        m22154E.addAll(m194j);
    }

    /* renamed from: G */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
    }

    /* renamed from: H */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11837jb m4141Q = AbstractC11837jb.m4141Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4141Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C6729a(m4141Q);
    }
}
