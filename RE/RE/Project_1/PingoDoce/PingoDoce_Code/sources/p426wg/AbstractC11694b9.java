package p426wg;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import p048cj.ProductDetailViewModel;

/* renamed from: wg.b9 */
/* loaded from: classes2.dex */
public abstract class AbstractC11694b9 extends ViewDataBinding {

    /* renamed from: x */
    public final AbstractC11729d9 f29950x;

    /* renamed from: y */
    public final PlaceHolderRecyclerView f29951y;

    /* renamed from: z */
    protected ProductDetailViewModel f29952z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11694b9(Object obj, View view, int i, AbstractC11729d9 abstractC11729d9, PlaceHolderRecyclerView placeHolderRecyclerView) {
        super(obj, view, i);
        this.f29950x = abstractC11729d9;
        this.f29951y = placeHolderRecyclerView;
    }

    /* renamed from: Q */
    public abstract void mo4426Q(ProductDetailViewModel productDetailViewModel);
}
