package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import p188jl.PurchaseProductsViewModel;

/* renamed from: wg.z2 */
/* loaded from: classes2.dex */
public abstract class AbstractC12129z2 extends ViewDataBinding {

    /* renamed from: x */
    public final MaterialButton f32018x;

    /* renamed from: y */
    public final RecyclerView f32019y;

    /* renamed from: z */
    protected PurchaseProductsViewModel f32020z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12129z2(Object obj, View view, int i, MaterialButton materialButton, TextView textView, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f32018x = materialButton;
        this.f32019y = recyclerView;
    }
}
