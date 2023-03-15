package p242mj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11874lb;
import p489zc.C13780s;

/* renamed from: mj.d */
/* loaded from: classes2.dex */
public final class StorePlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: StorePlaceHolderAdapter.kt */
    /* renamed from: mj.d$a */
    /* loaded from: classes2.dex */
    public static final class C7490a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7490a(AbstractC11874lb abstractC11874lb) {
            super(abstractC11874lb);
            Intrinsics.isThisObjectNull(abstractC11874lb, "binding");
        }
    }

    public StorePlaceHolderAdapter() {
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
        AbstractC11874lb m4049Q = AbstractC11874lb.m4049Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4049Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7490a(m4049Q);
    }
}
