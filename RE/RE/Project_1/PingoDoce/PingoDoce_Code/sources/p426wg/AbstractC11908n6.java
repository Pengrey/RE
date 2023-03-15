package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import p319qi.ManageAssociationsViewModel;

/* renamed from: wg.n6 */
/* loaded from: classes2.dex */
public abstract class AbstractC11908n6 extends ViewDataBinding {

    /* renamed from: A */
    public final PlaceHolderRecyclerView f31027A;

    /* renamed from: B */
    protected ManageAssociationsViewModel f31028B;

    /* renamed from: x */
    public final TextView f31029x;

    /* renamed from: y */
    public final ImageView f31030y;

    /* renamed from: z */
    public final TextView f31031z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11908n6(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, PlaceHolderRecyclerView placeHolderRecyclerView) {
        super(obj, view, i);
        this.f31029x = textView;
        this.f31030y = imageView;
        this.f31031z = textView2;
        this.f31027A = placeHolderRecyclerView;
    }
}
