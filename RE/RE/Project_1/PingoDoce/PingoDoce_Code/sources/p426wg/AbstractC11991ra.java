package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.ra */
/* loaded from: classes2.dex */
public abstract class AbstractC11991ra extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11991ra(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: Q */
    public static AbstractC11991ra m3827Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3826R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11991ra m3826R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11991ra) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_placeholder_for_home_banners, viewGroup, z, obj);
    }
}
