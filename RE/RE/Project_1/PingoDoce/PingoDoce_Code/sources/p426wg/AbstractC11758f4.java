package p426wg;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p391ul.TakeAwayOrderDetailViewModel;

/* renamed from: wg.f4 */
/* loaded from: classes2.dex */
public abstract class AbstractC11758f4 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f30297x;

    /* renamed from: y */
    public final RecyclerView f30298y;

    /* renamed from: z */
    protected TakeAwayOrderDetailViewModel f30299z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11758f4(Object obj, View view, int i, MaterialButton materialButton, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f30297x = materialButton;
        this.f30298y = recyclerView;
    }
}
