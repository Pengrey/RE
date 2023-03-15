package nl;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11952pb;
import p489zc.C13780s;

/* renamed from: nl.a */
/* loaded from: classes2.dex */
public final class ListItemSmallPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListItemSmallPlaceHolderAdapter.kt */
    /* renamed from: nl.a$a */
    /* loaded from: classes2.dex */
    public static final class C7933a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7933a(AbstractC11952pb abstractC11952pb) {
            super(abstractC11952pb);
            Intrinsics.isThisObjectNull(abstractC11952pb, "binding");
        }
    }

    public ListItemSmallPlaceHolderAdapter() {
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
        AbstractC11952pb m3900Q = AbstractC11952pb.m3900Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3900Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7933a(m3900Q);
    }
}
