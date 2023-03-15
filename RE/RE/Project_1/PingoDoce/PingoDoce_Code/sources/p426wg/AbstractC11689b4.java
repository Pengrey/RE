package p426wg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import cm.TakeAwayProductDetailViewModel;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: wg.b4 */
/* loaded from: classes2.dex */
public abstract class AbstractC11689b4 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f29913A;

    /* renamed from: B */
    public final TextView f29914B;

    /* renamed from: C */
    public final ImageView f29915C;

    /* renamed from: D */
    public final TextView f29916D;

    /* renamed from: E */
    public final QuantityPickerView f29917E;

    /* renamed from: F */
    protected TakeAwayProductDetailViewModel f29918F;

    /* renamed from: x */
    public final AbstractC11760f6 f29919x;

    /* renamed from: y */
    public final TextView f29920y;

    /* renamed from: z */
    public final TextView f29921z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11689b4(Object obj, View view, int i, AbstractC11760f6 abstractC11760f6, TextView textView, AppBarLayout appBarLayout, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout, CollapsingToolbarLayout collapsingToolbarLayout, ImageView imageView, TextView textView5, QuantityPickerView quantityPickerView, Toolbar toolbar) {
        super(obj, view, i);
        this.f29919x = abstractC11760f6;
        this.f29920y = textView;
        this.f29921z = textView2;
        this.f29913A = textView3;
        this.f29914B = textView4;
        this.f29915C = imageView;
        this.f29916D = textView5;
        this.f29917E = quantityPickerView;
    }
}
