package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.lb */
/* loaded from: classes2.dex */
public abstract class AbstractC11874lb extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11874lb(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: Q */
    public static AbstractC11874lb m4049Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4048R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11874lb m4048R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11874lb) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_placeholder_for_store_list, viewGroup, z, obj);
    }
}
