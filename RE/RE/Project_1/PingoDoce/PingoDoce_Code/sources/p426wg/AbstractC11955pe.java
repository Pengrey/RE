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
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* renamed from: wg.pe */
/* loaded from: classes2.dex */
public abstract class AbstractC11955pe extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialCardView f31228A;

    /* renamed from: B */
    public final TextView f31229B;

    /* renamed from: C */
    public final QuantityPickerView f31230C;

    /* renamed from: D */
    public final TextView f31231D;

    /* renamed from: E */
    protected TakeAwayProduct f31232E;

    /* renamed from: x */
    public final ImageView f31233x;

    /* renamed from: y */
    public final ConstraintLayout f31234y;

    /* renamed from: z */
    public final TextView f31235z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11955pe(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, Guideline guideline, TextView textView, MaterialCardView materialCardView, TextView textView2, QuantityPickerView quantityPickerView, TextView textView3) {
        super(obj, view, i);
        this.f31233x = imageView;
        this.f31234y = constraintLayout;
        this.f31235z = textView;
        this.f31228A = materialCardView;
        this.f31229B = textView2;
        this.f31230C = quantityPickerView;
        this.f31231D = textView3;
    }

    /* renamed from: Q */
    public static AbstractC11955pe m3896Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3895R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11955pe m3895R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11955pe) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_take_away_menu, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3835S(TakeAwayProduct takeAwayProduct);
}
