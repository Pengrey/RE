package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

/* renamed from: wg.hd */
/* loaded from: classes2.dex */
public abstract class AbstractC11804hd extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30475A;

    /* renamed from: B */
    public final FrameLayout f30476B;

    /* renamed from: C */
    public final TextView f30477C;

    /* renamed from: D */
    public final TextView f30478D;

    /* renamed from: E */
    public final ImageView f30479E;

    /* renamed from: F */
    public final ImageView f30480F;

    /* renamed from: G */
    public final MaterialCardView f30481G;

    /* renamed from: H */
    public final TextView f30482H;

    /* renamed from: I */
    public final QuantityPickerView f30483I;

    /* renamed from: J */
    public final TextView f30484J;

    /* renamed from: K */
    protected CatalogProduct f30485K;

    /* renamed from: L */
    protected Promotion f30486L;

    /* renamed from: M */
    protected String f30487M;

    /* renamed from: N */
    protected Boolean f30488N;

    /* renamed from: x */
    public final ConstraintLayout f30489x;

    /* renamed from: y */
    public final ImageView f30490y;

    /* renamed from: z */
    public final ImageView f30491z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11804hd(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, FrameLayout frameLayout, Guideline guideline, TextView textView2, TextView textView3, ImageView imageView3, ImageView imageView4, MaterialCardView materialCardView, TextView textView4, QuantityPickerView quantityPickerView, TextView textView5) {
        super(obj, view, i);
        this.f30489x = constraintLayout;
        this.f30490y = imageView;
        this.f30491z = imageView2;
        this.f30475A = textView;
        this.f30476B = frameLayout;
        this.f30477C = textView2;
        this.f30478D = textView3;
        this.f30479E = imageView3;
        this.f30480F = imageView4;
        this.f30481G = materialCardView;
        this.f30482H = textView4;
        this.f30483I = quantityPickerView;
        this.f30484J = textView5;
    }

    /* renamed from: Q */
    public static AbstractC11804hd m4227Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4226R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11804hd m4226R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11804hd) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_product_item_small, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4183S(Boolean bool);

    /* renamed from: T */
    public abstract void mo4182T(String str);

    /* renamed from: U */
    public abstract void mo4181U(CatalogProduct catalogProduct);

    /* renamed from: V */
    public abstract void mo4180V(Promotion promotion);
}
