package ml;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11802hb;
import p489zc.C13780s;

/* renamed from: ml.b */
/* loaded from: classes2.dex */
public final class ShoppingListPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShoppingListPlaceHolderAdapter.kt */
    /* renamed from: ml.b$a */
    /* loaded from: classes2.dex */
    public static final class C7505a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7505a(AbstractC11802hb abstractC11802hb) {
            super(abstractC11802hb);
            Intrinsics.isThisObjectNull(abstractC11802hb, "binding");
        }
    }

    public ShoppingListPlaceHolderAdapter() {
        List m194j;
        List m22154E = m22154E();
        m194j = C13780s.m194j(1, 2, 3, 4);
        m22154E.addAll(m194j);
    }

    /* renamed from: G */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
    }

    /* renamed from: H */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11802hb m4229Q = AbstractC11802hb.m4229Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4229Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7505a(m4229Q);
    }
}
