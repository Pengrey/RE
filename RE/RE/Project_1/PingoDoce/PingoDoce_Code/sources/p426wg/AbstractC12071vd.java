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

/* renamed from: wg.vd */
/* loaded from: classes2.dex */
public abstract class AbstractC12071vd extends ViewDataBinding {

    /* renamed from: x */
    public final ConstraintLayout f31739x;

    /* renamed from: y */
    public final TextView f31740y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12071vd(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, TextView textView) {
        super(obj, view, i);
        this.f31739x = constraintLayout;
        this.f31740y = textView;
    }

    /* renamed from: Q */
    public static AbstractC12071vd m3697Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3696R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12071vd m3696R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12071vd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_recent_product_item, viewGroup, z, obj);
    }
}
