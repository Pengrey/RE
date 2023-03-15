package p087ej;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import p181jd.Intrinsics;
import p426wg.AbstractC11767fd;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductListAdapter.kt */
/* renamed from: ej.e */
/* loaded from: classes2.dex */
public final class C5114e extends AbstractC5124k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5114e(AbstractC11767fd abstractC11767fd) {
        super(abstractC11767fd);
        Intrinsics.isThisObjectNull(abstractC11767fd, "binding");
    }

    /* renamed from: O */
    public void m25656O(CatalogProduct catalogProduct) {
        Intrinsics.isThisObjectNull(catalogProduct, "value");
        ((AbstractC11767fd) m22151M()).mo4242T(catalogProduct);
        ((AbstractC11767fd) m22151M()).mo4241U(catalogProduct.m14512e());
        ((AbstractC11767fd) m22151M()).mo4243S(catalogProduct.m14523V());
    }

    /* renamed from: P */
    public MaterialCardView m25655P() {
        MaterialCardView materialCardView = ((AbstractC11767fd) m22151M()).f30340x.f30127G;
        Intrinsics.checkIfNull(materialCardView, "binding.productBigIncluded.productMaterialCardView");
        return materialCardView;
    }

    /* renamed from: R */
    public QuantityPickerView m25653R() {
        QuantityPickerView quantityPickerView = ((AbstractC11767fd) m22151M()).f30340x.f30129I;
        Intrinsics.checkIfNull(quantityPickerView, "binding.productBigInclud…productQuantityPickerView");
        return quantityPickerView;
    }

    /* renamed from: T */
    public ConstraintLayout m25654Q() {
        ConstraintLayout constraintLayout = ((AbstractC11767fd) m22151M()).f30340x.f30123C;
        Intrinsics.checkIfNull(constraintLayout, "binding.productBigIncluded.contentConstraintLayout");
        return constraintLayout;
    }

    /* renamed from: U */
    public ImageView m25652S() {
        ImageView imageView = ((AbstractC11767fd) m22151M()).f30340x.f30125E;
        Intrinsics.checkIfNull(imageView, "binding.productBigIncluded.productImage");
        return imageView;
    }
}
