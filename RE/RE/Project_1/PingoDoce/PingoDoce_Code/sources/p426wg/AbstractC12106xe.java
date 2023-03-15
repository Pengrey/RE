package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.xe */
/* loaded from: classes2.dex */
public abstract class AbstractC12106xe extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31904A;

    /* renamed from: B */
    public final View f31905B;

    /* renamed from: C */
    public final QuantityPickerView f31906C;

    /* renamed from: D */
    public final TextView f31907D;

    /* renamed from: E */
    public final TextView f31908E;

    /* renamed from: F */
    protected TakeAwayProduct f31909F;

    /* renamed from: x */
    public final ImageView f31910x;

    /* renamed from: y */
    public final ConstraintLayout f31911y;

    /* renamed from: z */
    public final TextView f31912z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12106xe(Object obj, View view, int i, ImageView imageView, FrameLayout frameLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, View view2, QuantityPickerView quantityPickerView, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.f31910x = imageView;
        this.f31911y = constraintLayout2;
        this.f31912z = textView;
        this.f31904A = textView2;
        this.f31905B = view2;
        this.f31906C = quantityPickerView;
        this.f31907D = textView3;
        this.f31908E = textView4;
    }

    /* renamed from: Q */
    public static AbstractC12106xe m3651Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3650R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12106xe m3650R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12106xe) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_order_list_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3596S(TakeAwayProduct takeAwayProduct);
}
