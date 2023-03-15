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
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;

/* renamed from: wg.dd */
/* loaded from: classes2.dex */
public abstract class AbstractC11733dd extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30121A;

    /* renamed from: B */
    public final ImageView f30122B;

    /* renamed from: C */
    public final ConstraintLayout f30123C;

    /* renamed from: D */
    public final TextView f30124D;

    /* renamed from: E */
    public final ImageView f30125E;

    /* renamed from: F */
    public final ImageView f30126F;

    /* renamed from: G */
    public final MaterialCardView f30127G;

    /* renamed from: H */
    public final TextView f30128H;

    /* renamed from: I */
    public final QuantityPickerView f30129I;

    /* renamed from: J */
    public final TextView f30130J;

    /* renamed from: K */
    protected CatalogProduct f30131K;

    /* renamed from: L */
    protected Promotion f30132L;

    /* renamed from: M */
    protected String f30133M;

    /* renamed from: x */
    public final ConstraintLayout f30134x;

    /* renamed from: y */
    public final ImageView f30135y;

    /* renamed from: z */
    public final ImageView f30136z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11733dd(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, ImageView imageView3, ConstraintLayout constraintLayout2, Guideline guideline, TextView textView2, ImageView imageView4, ImageView imageView5, MaterialCardView materialCardView, TextView textView3, QuantityPickerView quantityPickerView, TextView textView4) {
        super(obj, view, i);
        this.f30134x = constraintLayout;
        this.f30135y = imageView;
        this.f30136z = imageView2;
        this.f30121A = textView;
        this.f30122B = imageView3;
        this.f30123C = constraintLayout2;
        this.f30124D = textView2;
        this.f30125E = imageView4;
        this.f30126F = imageView5;
        this.f30127G = materialCardView;
        this.f30128H = textView3;
        this.f30129I = quantityPickerView;
        this.f30130J = textView4;
    }

    /* renamed from: Q */
    public static AbstractC11733dd m4402Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4401R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11733dd m4401R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11733dd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_product_item_big, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4358S(String str);

    /* renamed from: T */
    public abstract void mo4357T(CatalogProduct catalogProduct);

    /* renamed from: U */
    public abstract void mo4356U(Promotion promotion);
}
