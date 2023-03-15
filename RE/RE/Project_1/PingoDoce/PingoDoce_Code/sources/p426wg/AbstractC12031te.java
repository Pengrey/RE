package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: wg.te */
/* loaded from: classes2.dex */
public abstract class AbstractC12031te extends ViewDataBinding {

    /* renamed from: A */
    public final ConstraintLayout f31564A;

    /* renamed from: B */
    protected TakeAwayCheckout f31565B;

    /* renamed from: x */
    public final ConstraintLayout f31566x;

    /* renamed from: y */
    public final TextView f31567y;

    /* renamed from: z */
    public final ConstraintLayout f31568z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12031te(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, ImageView imageView2, TextView textView5, TextView textView6, ConstraintLayout constraintLayout, TextView textView7, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        super(obj, view, i);
        this.f31566x = constraintLayout;
        this.f31567y = textView7;
        this.f31568z = constraintLayout2;
        this.f31564A = constraintLayout3;
    }

    /* renamed from: Q */
    public static AbstractC12031te m3765Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3764R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12031te m3764R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12031te) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_order_footer, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3705S(TakeAwayCheckout takeAwayCheckout);
}
