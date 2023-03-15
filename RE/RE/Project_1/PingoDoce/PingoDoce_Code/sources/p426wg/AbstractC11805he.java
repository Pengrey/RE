package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import lib.mozidev.p225me.extextview.ExTextView;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;

/* renamed from: wg.he */
/* loaded from: classes2.dex */
public abstract class AbstractC11805he extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30492A;

    /* renamed from: B */
    public final View f30493B;

    /* renamed from: C */
    public final TextView f30494C;

    /* renamed from: D */
    protected ShoppingListProduct f30495D;

    /* renamed from: E */
    protected String f30496E;

    /* renamed from: F */
    protected String f30497F;

    /* renamed from: x */
    public final ImageView f30498x;

    /* renamed from: y */
    public final ExTextView f30499y;

    /* renamed from: z */
    public final TextView f30500z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11805he(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ExTextView exTextView, TextView textView, View view2, TextView textView2, View view3, TextView textView3) {
        super(obj, view, i);
        this.f30498x = imageView;
        this.f30499y = exTextView;
        this.f30500z = textView;
        this.f30492A = textView2;
        this.f30493B = view3;
        this.f30494C = textView3;
    }

    /* renamed from: Q */
    public static AbstractC11805he m4225Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4224R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11805he m4224R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11805he) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_shopping_list_sort_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4179S(ShoppingListProduct shoppingListProduct);

    /* renamed from: T */
    public abstract void mo4178T(String str);

    /* renamed from: U */
    public abstract void mo4177U(String str);
}
