package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.ve */
/* loaded from: classes2.dex */
public abstract class AbstractC12072ve extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f31741x;

    /* renamed from: y */
    protected String f31742y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12072ve(Object obj, View view, int i, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f31741x = textView;
    }

    /* renamed from: Q */
    public static AbstractC12072ve m3695Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3694R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12072ve m3694R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12072ve) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_order_header, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3660S(String str);
}
