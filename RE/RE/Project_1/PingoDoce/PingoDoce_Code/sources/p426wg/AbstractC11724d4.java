package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import cm.TakeAwayProductDetailViewModel;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: wg.d4 */
/* loaded from: classes2.dex */
public abstract class AbstractC11724d4 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30080A;

    /* renamed from: B */
    public final TextView f30081B;

    /* renamed from: C */
    public final TextView f30082C;

    /* renamed from: D */
    public final QuantityPickerView f30083D;

    /* renamed from: E */
    protected TakeAwayProductDetailViewModel f30084E;

    /* renamed from: x */
    public final AbstractC11760f6 f30085x;

    /* renamed from: y */
    public final ImageView f30086y;

    /* renamed from: z */
    public final ImageView f30087z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11724d4(Object obj, View view, int i, AbstractC11760f6 abstractC11760f6, ImageView imageView, AppBarLayout appBarLayout, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, CollapsingToolbarLayout collapsingToolbarLayout, QuantityPickerView quantityPickerView, Toolbar toolbar) {
        super(obj, view, i);
        this.f30085x = abstractC11760f6;
        this.f30086y = imageView;
        this.f30087z = imageView2;
        this.f30080A = textView;
        this.f30081B = textView2;
        this.f30082C = textView3;
        this.f30083D = quantityPickerView;
    }
}
