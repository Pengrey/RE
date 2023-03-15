package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;

/* renamed from: wg.bd */
/* loaded from: classes2.dex */
public abstract class AbstractC11698bd extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f29958A;

    /* renamed from: B */
    protected LoyaltyCardAssociation f29959B;

    /* renamed from: x */
    public final MaterialButton f29960x;

    /* renamed from: y */
    public final TextView f29961y;

    /* renamed from: z */
    public final TextView f29962z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11698bd(Object obj, View view, int i, MaterialButton materialButton, View view2, TextView textView, TextView textView2, MaterialButton materialButton2) {
        super(obj, view, i);
        this.f29960x = materialButton;
        this.f29961y = textView;
        this.f29962z = textView2;
        this.f29958A = materialButton2;
    }

    /* renamed from: Q */
    public static AbstractC11698bd m4458Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4457R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11698bd m4457R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11698bd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_pending_associations_list_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4417S(LoyaltyCardAssociation loyaltyCardAssociation);
}
