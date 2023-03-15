package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import p319qi.ManageAssociationsViewModel;

/* renamed from: wg.l6 */
/* loaded from: classes2.dex */
public abstract class AbstractC11869l6 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f30862A;

    /* renamed from: B */
    protected ManageAssociationsViewModel f30863B;

    /* renamed from: x */
    public final PlaceHolderRecyclerView f30864x;

    /* renamed from: y */
    public final TextView f30865y;

    /* renamed from: z */
    public final ImageView f30866z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11869l6(Object obj, View view, int i, PlaceHolderRecyclerView placeHolderRecyclerView, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.f30864x = placeHolderRecyclerView;
        this.f30865y = textView;
        this.f30866z = imageView;
        this.f30862A = textView2;
    }
}
