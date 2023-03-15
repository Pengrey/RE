package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p048cj.ProductDetailViewModel;

/* renamed from: wg.z5 */
/* loaded from: classes2.dex */
public abstract class AbstractC12132z5 extends ViewDataBinding {

    /* renamed from: A */
    protected ProductDetailViewModel f32039A;

    /* renamed from: x */
    public final ImageView f32040x;

    /* renamed from: y */
    public final TextView f32041y;

    /* renamed from: z */
    public final TextView f32042z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12132z5(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2, View view2, TextView textView3) {
        super(obj, view, i);
        this.f32040x = imageView;
        this.f32041y = textView;
        this.f32042z = textView2;
    }

    /* renamed from: Q */
    public static AbstractC12132z5 m3574Q(LayoutInflater layoutInflater) {
        return m3573R(layoutInflater, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12132z5 m3573R(LayoutInflater layoutInflater, Object obj) {
        return (AbstractC12132z5) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.bottomsheet_for_product_detail_info, null, false, obj);
    }

    /* renamed from: S */
    public abstract void mo3572S(ProductDetailViewModel productDetailViewModel);
}
