package p087ej;

import android.widget.ImageView;
import android.widget.TextView;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import p181jd.Intrinsics;
import p426wg.AbstractC11804hd;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductListAdapter.kt */
/* renamed from: ej.j */
/* loaded from: classes2.dex */
public final class C5123j extends AbstractC5124k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5123j(AbstractC11804hd abstractC11804hd) {
        super(abstractC11804hd);
        Intrinsics.isThisObjectNull(abstractC11804hd, "binding");
    }

    /* renamed from: O */
    public void m25625O(CatalogProduct catalogProduct) {
        Intrinsics.isThisObjectNull(catalogProduct, "value");
        ((AbstractC11804hd) m22151M()).mo4181U(catalogProduct);
        ((AbstractC11804hd) m22151M()).mo4180V(catalogProduct.m14512e());
        ((AbstractC11804hd) m22151M()).mo4182T(catalogProduct.m14523V());
    }

    /* renamed from: P */
    public MaterialCardView m25624P() {
        MaterialCardView materialCardView = ((AbstractC11804hd) m22151M()).f30481G;
        Intrinsics.checkIfNull(materialCardView, "binding.productMaterialCardView");
        return materialCardView;
    }

    /* renamed from: R */
    public QuantityPickerView m25622R() {
        QuantityPickerView quantityPickerView = ((AbstractC11804hd) m22151M()).f30483I;
        Intrinsics.checkIfNull(quantityPickerView, "binding.productQuantityPickerView");
        return quantityPickerView;
    }

    /* renamed from: T */
    public TextView m25623Q() {
        TextView textView = ((AbstractC11804hd) m22151M()).f30477C;
        Intrinsics.checkIfNull(textView, "binding.lxPxSpecialTextView");
        return textView;
    }

    /* renamed from: U */
    public final void m25619U(boolean z) {
        ((AbstractC11804hd) m22151M()).mo4183S(Boolean.valueOf(z));
    }

    /* renamed from: V */
    public ImageView m25621S() {
        ImageView imageView = ((AbstractC11804hd) m22151M()).f30479E;
        Intrinsics.checkIfNull(imageView, "binding.productImage");
        return imageView;
    }
}
