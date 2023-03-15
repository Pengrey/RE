package p087ej;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.List;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;
import p426wg.AbstractC11765fb;
import p489zc.C13780s;

/* renamed from: ej.c */
/* loaded from: classes2.dex */
public final class ItemSmallPlaceHolderAdapter extends BindableAdapter implements InterfaceC11569a {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ItemSmallPlaceHolderAdapter.kt */
    /* renamed from: ej.c$a */
    /* loaded from: classes2.dex */
    public static final class C5113a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5113a(AbstractC11765fb abstractC11765fb) {
            super(abstractC11765fb);
            Intrinsics.isThisObjectNull(abstractC11765fb, "binding");
        }
    }

    public ItemSmallPlaceHolderAdapter() {
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
        AbstractC11765fb m4308Q = AbstractC11765fb.m4308Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4308Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5113a(m4308Q);
    }
}
