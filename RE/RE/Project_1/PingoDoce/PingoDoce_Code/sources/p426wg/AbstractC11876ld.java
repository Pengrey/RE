package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.ld */
/* loaded from: classes2.dex */
public abstract class AbstractC11876ld extends ViewDataBinding {

    /* renamed from: A */
    protected Purchase f30884A;

    /* renamed from: x */
    public final MaterialButton f30885x;

    /* renamed from: y */
    protected Integer f30886y;

    /* renamed from: z */
    protected List<String> f30887z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11876ld(Object obj, View view, int i, MaterialButton materialButton, TextView textView, View view2, View view3, TextView textView2) {
        super(obj, view, i);
        this.f30885x = materialButton;
    }

    /* renamed from: Q */
    public static AbstractC11876ld m4045Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4044R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11876ld m4044R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11876ld) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_purchase_detail_header, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3996S(List<String> list);

    /* renamed from: T */
    public abstract void mo3995T(Integer num);

    /* renamed from: U */
    public abstract void mo3994U(Purchase purchase);
}
