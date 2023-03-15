package p087ej;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11731db;
import p489zc.C13780s;

/* renamed from: ej.b */
/* loaded from: classes2.dex */
public final class ItemFixPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ItemFixPlaceHolderAdapter.kt */
    /* renamed from: ej.b$a */
    /* loaded from: classes2.dex */
    public static final class C5112a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5112a(AbstractC11731db abstractC11731db) {
            super(abstractC11731db);
            Intrinsics.isThisObjectNull(abstractC11731db, "binding");
        }
    }

    public ItemFixPlaceHolderAdapter() {
        List m194j;
        List m22154E = m22154E();
        m194j = C13780s.m194j(1, 2, 3);
        m22154E.addAll(m194j);
    }

    /* renamed from: G */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
    }

    /* renamed from: H */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11731db m4406Q = AbstractC11731db.m4406Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4406Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5112a(m4406Q);
    }
}
