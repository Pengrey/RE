package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;

/* renamed from: wg.fd */
/* loaded from: classes2.dex */
public abstract class AbstractC11767fd extends ViewDataBinding {

    /* renamed from: A */
    protected String f30339A;

    /* renamed from: x */
    public final AbstractC11733dd f30340x;

    /* renamed from: y */
    protected CatalogProduct f30341y;

    /* renamed from: z */
    protected Promotion f30342z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11767fd(Object obj, View view, int i, AbstractC11733dd abstractC11733dd) {
        super(obj, view, i);
        this.f30340x = abstractC11733dd;
    }

    /* renamed from: Q */
    public static AbstractC11767fd m4306Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4305R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11767fd m4305R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11767fd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_product_item_fixed, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4243S(String str);

    /* renamed from: T */
    public abstract void mo4242T(CatalogProduct catalogProduct);

    /* renamed from: U */
    public abstract void mo4241U(Promotion promotion);
}
