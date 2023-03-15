package p426wg;

import android.animation.TimeInterpolator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import lib.mozidev.p225me.extextview.ExTextView;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* renamed from: wg.de */
/* loaded from: classes2.dex */
public abstract class AbstractC11734de extends ViewDataBinding {

    /* renamed from: A */
    public final ImageButton f30137A;

    /* renamed from: B */
    public final Guideline f30138B;

    /* renamed from: C */
    public final ConstraintLayout f30139C;

    /* renamed from: D */
    public final ConstraintLayout f30140D;

    /* renamed from: E */
    public final CheckBox f30141E;

    /* renamed from: F */
    public final ExTextView f30142F;

    /* renamed from: G */
    public final TextView f30143G;

    /* renamed from: H */
    public final View f30144H;

    /* renamed from: I */
    public final QuantityPickerView f30145I;

    /* renamed from: J */
    public final TextView f30146J;

    /* renamed from: K */
    public final TextView f30147K;

    /* renamed from: L */
    protected Float f30148L;

    /* renamed from: M */
    protected TimeInterpolator f30149M;

    /* renamed from: N */
    protected Long f30150N;

    /* renamed from: O */
    protected ShoppingListProduct f30151O;

    /* renamed from: P */
    protected String f30152P;

    /* renamed from: Q */
    protected String f30153Q;

    /* renamed from: x */
    public final ImageView f30154x;

    /* renamed from: y */
    public final ImageButton f30155y;

    /* renamed from: z */
    public final ImageView f30156z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11734de(Object obj, View view, int i, ImageView imageView, ImageButton imageButton, ImageView imageView2, ImageButton imageButton2, FrameLayout frameLayout, ConstraintLayout constraintLayout, Guideline guideline, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CheckBox checkBox, ExTextView exTextView, TextView textView, View view2, QuantityPickerView quantityPickerView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.f30154x = imageView;
        this.f30155y = imageButton;
        this.f30156z = imageView2;
        this.f30137A = imageButton2;
        this.f30138B = guideline;
        this.f30139C = constraintLayout2;
        this.f30140D = constraintLayout3;
        this.f30141E = checkBox;
        this.f30142F = exTextView;
        this.f30143G = textView;
        this.f30144H = view2;
        this.f30145I = quantityPickerView;
        this.f30146J = textView2;
        this.f30147K = textView3;
    }

    /* renamed from: Q */
    public static AbstractC11734de m4400Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4399R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11734de m4399R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11734de) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_shopping_list_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4355S(Long l);

    /* renamed from: T */
    public abstract void mo4354T(TimeInterpolator timeInterpolator);

    /* renamed from: U */
    public abstract void mo4353U(ShoppingListProduct shoppingListProduct);

    /* renamed from: V */
    public abstract void mo4352V(Integer num);

    /* renamed from: W */
    public abstract void mo4351W(Float f);

    /* renamed from: X */
    public abstract void mo4350X(String str);

    /* renamed from: Y */
    public abstract void mo4349Y(String str);
}
