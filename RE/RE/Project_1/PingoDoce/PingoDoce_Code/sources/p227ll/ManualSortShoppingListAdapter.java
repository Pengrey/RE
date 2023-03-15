package p227ll;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.aachartmodel.aainfographics.BuildConfig;
import fm.C5579c;
import ie.BindableAdapter;
import ie.BindableViewHolder;
import java.util.Collections;
import java.util.List;
import p181jd.Intrinsics;
import p426wg.AbstractC11805he;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* renamed from: ll.f */
/* loaded from: classes2.dex */
public final class ManualSortShoppingListAdapter extends BindableAdapter implements InterfaceC7071a {

    /* compiled from: ManualSortShoppingListAdapter.kt */
    /* renamed from: ll.f$a */
    /* loaded from: classes2.dex */
    public static final class C7075a extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7075a(AbstractC11805he abstractC11805he) {
            super(abstractC11805he);
            Intrinsics.isThisObjectNull(abstractC11805he, "binding");
        }
    }

    /* renamed from: G */
    public final List m19364G() {
        return m22154E();
    }

    /* renamed from: H */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        ShoppingListProduct shoppingListProduct = (ShoppingListProduct) m22155D(i);
        if (shoppingListProduct != null) {
            ((AbstractC11805he) bindableViewHolder.m22151M()).mo4179S(shoppingListProduct);
            if (!shoppingListProduct.m14350D()) {
                ((AbstractC11805he) bindableViewHolder.m22151M()).mo4178T(C5579c.m23715d(shoppingListProduct.m14328r(), null, 1, null));
                ((AbstractC11805he) bindableViewHolder.m22151M()).mo4178T(C5579c.m23715d(shoppingListProduct.m14328r(), null, 1, null));
                ((AbstractC11805he) bindableViewHolder.m22151M()).f30500z.setVisibility(0);
                ((AbstractC11805he) bindableViewHolder.m22151M()).mo4177U(shoppingListProduct.m14336e());
                ((AbstractC11805he) bindableViewHolder.m22151M()).f30498x.setVisibility(shoppingListProduct.m14351A() ? 0 : 8);
                return;
            }
            ((AbstractC11805he) bindableViewHolder.m22151M()).mo4178T(BuildConfig.VERSION_NAME);
            ((AbstractC11805he) bindableViewHolder.m22151M()).f30500z.setVisibility(8);
            ((AbstractC11805he) bindableViewHolder.m22151M()).mo4177U(BuildConfig.VERSION_NAME);
            ((AbstractC11805he) bindableViewHolder.m22151M()).f30498x.setVisibility(8);
        }
    }

    /* renamed from: I */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11805he m4225Q = AbstractC11805he.m4225Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4225Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C7075a(m4225Q);
    }

    /* renamed from: c */
    public void mo19367c(int i, int i2) {
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(m22154E(), i3, i4);
                i3 = i4;
            }
        } else {
            int i5 = i2 + 1;
            if (i5 <= i) {
                int i6 = i;
                while (true) {
                    Collections.swap(m22154E(), i6, i6 - 1);
                    if (i6 == i5) {
                        break;
                    }
                    i6--;
                }
            }
        }
        m36539n(i, i2);
    }
}
