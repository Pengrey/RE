package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.df */
/* loaded from: classes2.dex */
public abstract class AbstractC11735df extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f30157x;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11735df(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.f30157x = textView;
    }

    /* renamed from: Q */
    public static AbstractC11735df m4398Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4397R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11735df m4397R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11735df) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_wine_region, viewGroup, z, obj);
    }
}
