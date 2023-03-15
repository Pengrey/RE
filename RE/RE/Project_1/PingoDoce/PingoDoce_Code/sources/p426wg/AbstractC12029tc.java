package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.data.remote.models.request.LoyaltyCardRequest;

/* renamed from: wg.tc */
/* loaded from: classes2.dex */
public abstract class AbstractC12029tc extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f31550A;

    /* renamed from: B */
    protected LoyaltyCardRequest f31551B;

    /* renamed from: x */
    public final MaterialButton f31552x;

    /* renamed from: y */
    public final TextView f31553y;

    /* renamed from: z */
    public final TextView f31554z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12029tc(Object obj, View view, int i, MaterialButton materialButton, TextView textView, TextView textView2, View view2, MaterialButton materialButton2) {
        super(obj, view, i);
        this.f31552x = materialButton;
        this.f31553y = textView;
        this.f31554z = textView2;
        this.f31550A = materialButton2;
    }

    /* renamed from: Q */
    public static AbstractC12029tc m3769Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3768R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12029tc m3768R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12029tc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_invite, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3708S(LoyaltyCardRequest loyaltyCardRequest);
}
