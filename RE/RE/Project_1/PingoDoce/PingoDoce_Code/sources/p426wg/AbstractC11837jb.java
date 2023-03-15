package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;

/* renamed from: wg.jb */
/* loaded from: classes2.dex */
public abstract class AbstractC11837jb extends ViewDataBinding {
    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11837jb(Object obj, View view, int i) {
        super(obj, view, i);
    }

    /* renamed from: Q */
    public static AbstractC11837jb m4141Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4140R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11837jb m4140R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11837jb) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_placeholder_for_shopping_list_item, viewGroup, z, obj);
    }
}
