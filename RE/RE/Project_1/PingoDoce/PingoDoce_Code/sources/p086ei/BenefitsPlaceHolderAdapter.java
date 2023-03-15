package p086ei;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11951pa;
import p489zc.C13780s;

/* renamed from: ei.n */
/* loaded from: classes2.dex */
public final class BenefitsPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BenefitsPlaceHolderAdapter.kt */
    /* renamed from: ei.n$a */
    /* loaded from: classes2.dex */
    public static final class C5094a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5094a(AbstractC11951pa abstractC11951pa) {
            super(abstractC11951pa);
            Intrinsics.isThisObjectNull(abstractC11951pa, "binding");
        }
    }

    public BenefitsPlaceHolderAdapter() {
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
        AbstractC11951pa m3902Q = AbstractC11951pa.m3902Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3902Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5094a(m3902Q);
    }
}
