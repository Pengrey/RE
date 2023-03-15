package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import p361t3.InterfaceC10379c;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.ne */
/* loaded from: classes2.dex */
public abstract class AbstractC11916ne extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialCardView f31066A;

    /* renamed from: B */
    public final TextView f31067B;

    /* renamed from: C */
    public final QuantityPickerView f31068C;

    /* renamed from: D */
    public final TextView f31069D;

    /* renamed from: E */
    protected TakeAwayProduct f31070E;

    /* renamed from: F */
    protected InterfaceC10379c f31071F;

    /* renamed from: x */
    public final TextView f31072x;

    /* renamed from: y */
    public final ConstraintLayout f31073y;

    /* renamed from: z */
    public final ImageView f31074z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11916ne(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, MaterialCardView materialCardView, TextView textView2, QuantityPickerView quantityPickerView, TextView textView3) {
        super(obj, view, i);
        this.f31072x = textView;
        this.f31073y = constraintLayout;
        this.f31074z = imageView;
        this.f31066A = materialCardView;
        this.f31067B = textView2;
        this.f31068C = quantityPickerView;
        this.f31069D = textView3;
    }

    /* renamed from: Q */
    public static AbstractC11916ne m3971Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3970R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11916ne m3970R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11916ne) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_meal, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3917S(InterfaceC10379c interfaceC10379c);

    /* renamed from: T */
    public abstract void mo3916T(TakeAwayProduct takeAwayProduct);
}
