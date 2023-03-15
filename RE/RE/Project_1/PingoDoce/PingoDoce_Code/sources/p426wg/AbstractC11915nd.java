package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.local.models.purchases.Purchase;

/* renamed from: wg.nd */
/* loaded from: classes2.dex */
public abstract class AbstractC11915nd extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31061A;

    /* renamed from: B */
    protected Purchase f31062B;

    /* renamed from: x */
    public final TextView f31063x;

    /* renamed from: y */
    public final TextView f31064y;

    /* renamed from: z */
    public final TextView f31065z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11915nd(Object obj, View view, int i, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.f31063x = textView;
        this.f31064y = textView2;
        this.f31065z = textView3;
        this.f31061A = textView4;
    }

    /* renamed from: Q */
    public static AbstractC11915nd m3973Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3972R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11915nd m3972R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11915nd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_purchase_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3918S(Purchase purchase);
}
