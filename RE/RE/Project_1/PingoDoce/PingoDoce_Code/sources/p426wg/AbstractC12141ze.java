package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;

/* renamed from: wg.ze */
/* loaded from: classes2.dex */
public abstract class AbstractC12141ze extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialCardView f32067x;

    /* renamed from: y */
    public final MaterialCheckBox f32068y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12141ze(Object obj, View view, int i, MaterialCardView materialCardView, MaterialCheckBox materialCheckBox) {
        super(obj, view, i);
        this.f32067x = materialCardView;
        this.f32068y = materialCheckBox;
    }

    /* renamed from: Q */
    public static AbstractC12141ze m3559Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3558R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12141ze m3558R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12141ze) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_wine_list_region, viewGroup, z, obj);
    }
}
