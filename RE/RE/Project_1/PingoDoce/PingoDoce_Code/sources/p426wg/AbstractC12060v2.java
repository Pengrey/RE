package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p146hl.PurchaseDetailViewModel;

/* renamed from: wg.v2 */
/* loaded from: classes2.dex */
public abstract class AbstractC12060v2 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31703A;

    /* renamed from: B */
    public final RecyclerView f31704B;

    /* renamed from: C */
    protected PurchaseDetailViewModel f31705C;

    /* renamed from: x */
    public final TextView f31706x;

    /* renamed from: y */
    public final TextView f31707y;

    /* renamed from: z */
    public final TextView f31708z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12060v2(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, ConstraintLayout constraintLayout, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f31706x = textView2;
        this.f31707y = textView4;
        this.f31708z = textView7;
        this.f31703A = textView9;
        this.f31704B = recyclerView;
    }
}
