package p472yh;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11991ra;
import p489zc.CollectionsJVM;

/* renamed from: yh.e */
/* loaded from: classes2.dex */
public final class BannerPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BannerPlaceHolderAdapter.kt */
    /* renamed from: yh.e$a */
    /* loaded from: classes2.dex */
    public static final class C13444a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13444a(AbstractC11991ra abstractC11991ra) {
            super(abstractC11991ra);
            Intrinsics.isThisObjectNull(abstractC11991ra, "binding");
        }
    }

    public BannerPlaceHolderAdapter() {
        List m202b;
        List m22154E = m22154E();
        m202b = CollectionsJVM.m202b(1);
        m22154E.addAll(m202b);
    }

    /* renamed from: G */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
    }

    /* renamed from: H */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11991ra m3827Q = AbstractC11991ra.m3827Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3827Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C13444a(m3827Q);
    }
}
