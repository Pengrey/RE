package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: wg.je */
/* loaded from: classes2.dex */
public abstract class AbstractC11840je extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30697A;

    /* renamed from: B */
    public final TextView f30698B;

    /* renamed from: C */
    public final RadioButton f30699C;

    /* renamed from: D */
    protected Store f30700D;

    /* renamed from: E */
    protected Boolean f30701E;

    /* renamed from: F */
    protected Integer f30702F;

    /* renamed from: x */
    public final TextView f30703x;

    /* renamed from: y */
    public final TextView f30704y;

    /* renamed from: z */
    public final TextView f30705z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11840je(Object obj, View view, int i, TextView textView, View view2, TextView textView2, ImageView imageView, TextView textView3, ImageView imageView2, TextView textView4, ImageView imageView3, TextView textView5, RadioButton radioButton) {
        super(obj, view, i);
        this.f30703x = textView;
        this.f30704y = textView2;
        this.f30705z = textView3;
        this.f30697A = textView4;
        this.f30698B = textView5;
        this.f30699C = radioButton;
    }

    /* renamed from: Q */
    public static AbstractC11840je m4137Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4136R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11840je m4136R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11840je) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_store_list_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4075S(Boolean bool);

    /* renamed from: T */
    public abstract void mo4074T(Store store);

    /* renamed from: U */
    public abstract void mo4073U(Integer num);
}
