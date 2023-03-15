package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;

/* renamed from: wg.zb */
/* loaded from: classes2.dex */
public abstract class AbstractC12138zb extends ViewDataBinding {

    /* renamed from: x */
    public final TextView f32058x;

    /* renamed from: y */
    public final TextView f32059y;

    /* renamed from: z */
    protected LoyaltyCardAssociation f32060z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12138zb(Object obj, View view, int i, View view2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.f32058x = textView;
        this.f32059y = textView2;
    }

    /* renamed from: Q */
    public static AbstractC12138zb m3569Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3568R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12138zb m3568R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12138zb) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_approved_associations_list_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3567S(LoyaltyCardAssociation loyaltyCardAssociation);
}
