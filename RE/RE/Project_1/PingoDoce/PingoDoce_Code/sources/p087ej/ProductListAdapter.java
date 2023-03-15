package p087ej;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import p181jd.Intrinsics;
import p426wg.AbstractC11733dd;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ej.d */
/* loaded from: classes2.dex */
public final class ProductListAdapter extends AbstractC5124k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductListAdapter(AbstractC11733dd abstractC11733dd) {
        super(abstractC11733dd);
        Intrinsics.isThisObjectNull(abstractC11733dd, "binding");
    }

    /* renamed from: O */
    public void m25663O(CatalogProduct catalogProduct) {
        Intrinsics.isThisObjectNull(catalogProduct, "value");
        ((AbstractC11733dd) m22151M()).mo4357T(catalogProduct);
        ((AbstractC11733dd) m22151M()).mo4356U(catalogProduct.m14512e());
        ((AbstractC11733dd) m22151M()).mo4358S(catalogProduct.m14523V());
    }

    /* renamed from: P */
    public MaterialCardView m25662P() {
        MaterialCardView materialCardView = ((AbstractC11733dd) m22151M()).f30127G;
        Intrinsics.checkIfNull(materialCardView, "binding.productMaterialCardView");
        return materialCardView;
    }

    /* renamed from: R */
    public QuantityPickerView m25660R() {
        QuantityPickerView quantityPickerView = ((AbstractC11733dd) m22151M()).f30129I;
        Intrinsics.checkIfNull(quantityPickerView, "binding.productQuantityPickerView");
        return quantityPickerView;
    }

    /* renamed from: T */
    public ConstraintLayout m25661Q() {
        ConstraintLayout constraintLayout = ((AbstractC11733dd) m22151M()).f30123C;
        Intrinsics.checkIfNull(constraintLayout, "binding.contentConstraintLayout");
        return constraintLayout;
    }

    /* renamed from: U */
    public ImageView m25659S() {
        ImageView imageView = ((AbstractC11733dd) m22151M()).f30125E;
        Intrinsics.checkIfNull(imageView, "binding.productImage");
        return imageView;
    }
}
