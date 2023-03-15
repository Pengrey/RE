package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;

/* renamed from: wg.bf */
/* loaded from: classes2.dex */
public abstract class AbstractC11700bf extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialCardView f29970x;

    /* renamed from: y */
    public final MaterialCheckBox f29971y;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11700bf(Object obj, View view, int i, MaterialCardView materialCardView, MaterialCheckBox materialCheckBox) {
        super(obj, view, i);
        this.f29970x = materialCardView;
        this.f29971y = materialCheckBox;
    }

    /* renamed from: Q */
    public static AbstractC11700bf m4454Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4453R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11700bf m4453R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11700bf) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_wine_list_type, viewGroup, z, obj);
    }
}
