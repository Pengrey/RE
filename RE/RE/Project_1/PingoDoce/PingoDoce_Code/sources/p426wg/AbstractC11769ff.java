package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.ff */
/* loaded from: classes2.dex */
public abstract class AbstractC11769ff extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f30345x;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11769ff(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.f30345x = textView;
    }

    /* renamed from: Q */
    public static AbstractC11769ff m4302Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4301R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11769ff m4301R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11769ff) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_wine_types, viewGroup, z, obj);
    }
}
