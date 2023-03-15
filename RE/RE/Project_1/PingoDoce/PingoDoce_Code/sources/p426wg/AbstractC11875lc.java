package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;

/* renamed from: wg.lc */
/* loaded from: classes2.dex */
public abstract class AbstractC11875lc extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f30883x;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11875lc(Object obj, View view, int i, MaterialButton materialButton) {
        super(obj, view, i);
        this.f30883x = materialButton;
    }

    /* renamed from: Q */
    public static AbstractC11875lc m4047Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4046R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11875lc m4046R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11875lc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_category_tag_item, viewGroup, z, obj);
    }
}
