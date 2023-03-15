package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;

/* renamed from: wg.re */
/* loaded from: classes2.dex */
public abstract class AbstractC11995re extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31394x;

    /* renamed from: y */
    protected TakeAwayOrder f31395y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11995re(Object obj, View view, int i, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f31394x = textView;
    }

    /* renamed from: Q */
    public static AbstractC11995re m3823Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3822R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11995re m3822R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11995re) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_order, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3775S(TakeAwayOrder takeAwayOrder);
}
