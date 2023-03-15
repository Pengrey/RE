package p087ej;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import ie.BindableViewHolder;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* compiled from: ProductListAdapter.kt */
/* renamed from: ej.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5124k<ViewBinding extends ViewDataBinding> extends BindableViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5124k(ViewDataBinding viewDataBinding) {
        super(viewDataBinding);
        Intrinsics.isThisObjectNull(viewDataBinding, "binding");
    }

    /* renamed from: O */
    public abstract void m25617O(CatalogProduct catalogProduct);

    /* renamed from: P */
    public abstract MaterialCardView m25616P();

    /* renamed from: Q */
    public abstract View m25615Q();

    /* renamed from: R */
    public abstract QuantityPickerView m25614R();

    /* renamed from: S */
    public abstract View m25613S();
}
