package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.checkbox.MaterialCheckBox;
import pt.pingodoce.app.data.local.models.purchases.PurchaseProduct;

/* renamed from: wg.td */
/* loaded from: classes2.dex */
public abstract class AbstractC12030td extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31555A;

    /* renamed from: B */
    public final ConstraintLayout f31556B;

    /* renamed from: C */
    public final TextView f31557C;

    /* renamed from: D */
    public final MaterialCheckBox f31558D;

    /* renamed from: E */
    protected boolean f31559E;

    /* renamed from: F */
    protected PurchaseProduct f31560F;

    /* renamed from: x */
    public final TextView f31561x;

    /* renamed from: y */
    public final TextView f31562y;

    /* renamed from: z */
    public final TextView f31563z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12030td(Object obj, View view, int i, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, TextView textView5, MaterialCheckBox materialCheckBox) {
        super(obj, view, i);
        this.f31561x = textView;
        this.f31562y = textView2;
        this.f31563z = textView3;
        this.f31555A = textView4;
        this.f31556B = constraintLayout;
        this.f31557C = textView5;
        this.f31558D = materialCheckBox;
    }

    /* renamed from: Q */
    public static AbstractC12030td m3767Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3766R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC12030td m3766R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC12030td) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_purchase_product, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3707S(PurchaseProduct purchaseProduct);

    /* renamed from: T */
    public abstract void mo3706T(boolean z);
}
