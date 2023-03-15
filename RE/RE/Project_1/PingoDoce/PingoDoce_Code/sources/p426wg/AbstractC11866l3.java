package p426wg;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p227ll.ManualSortShoppingListViewModel;

/* renamed from: wg.l3 */
/* loaded from: classes2.dex */
public abstract class AbstractC11866l3 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f30842x;

    /* renamed from: y */
    public final RecyclerView f30843y;

    /* renamed from: z */
    protected ManualSortShoppingListViewModel f30844z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11866l3(Object obj, View view, int i, MaterialButton materialButton, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f30842x = materialButton;
        this.f30843y = recyclerView;
    }
}
