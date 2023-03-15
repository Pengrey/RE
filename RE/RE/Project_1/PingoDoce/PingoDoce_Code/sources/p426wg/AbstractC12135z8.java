package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.button.MaterialButton;
import p048cj.ProductDetailViewModel;

/* renamed from: wg.z8 */
/* loaded from: classes2.dex */
public abstract class AbstractC12135z8 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f32049A;

    /* renamed from: B */
    public final LinearLayout f32050B;

    /* renamed from: C */
    public final QuantityPickerView f32051C;

    /* renamed from: D */
    protected ProductDetailViewModel f32052D;

    /* renamed from: x */
    public final MaterialButton f32053x;

    /* renamed from: y */
    public final TextView f32054y;

    /* renamed from: z */
    public final ImageView f32055z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12135z8(Object obj, View view, int i, MaterialButton materialButton, TextView textView, Guideline guideline, ImageView imageView, TextView textView2, LinearLayout linearLayout, QuantityPickerView quantityPickerView) {
        super(obj, view, i);
        this.f32053x = materialButton;
        this.f32054y = textView;
        this.f32055z = imageView;
        this.f32049A = textView2;
        this.f32050B = linearLayout;
        this.f32051C = quantityPickerView;
    }

    /* renamed from: Q */
    public abstract void mo3571Q(ProductDetailViewModel productDetailViewModel);
}
