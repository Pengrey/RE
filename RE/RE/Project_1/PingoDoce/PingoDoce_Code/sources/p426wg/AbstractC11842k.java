package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import p086ei.BenefitsViewModel;

/* renamed from: wg.k */
/* loaded from: classes2.dex */
public abstract class AbstractC11842k extends ViewDataBinding {

    /* renamed from: A */
    public final ExtendedFloatingActionButton f30706A;

    /* renamed from: B */
    public final ImageView f30707B;

    /* renamed from: C */
    public final RecyclerView f30708C;

    /* renamed from: D */
    public final SwipeRefreshLayout f30709D;

    /* renamed from: E */
    public final AppCompatTextView f30710E;

    /* renamed from: F */
    public final TextView f30711F;

    /* renamed from: G */
    protected BenefitsViewModel f30712G;

    /* renamed from: x */
    public final AbstractC11766fc f30713x;

    /* renamed from: y */
    public final PlaceHolderRecyclerView f30714y;

    /* renamed from: z */
    public final TextView f30715z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11842k(Object obj, View view, int i, AbstractC11766fc abstractC11766fc, PlaceHolderRecyclerView placeHolderRecyclerView, TextView textView, ExtendedFloatingActionButton extendedFloatingActionButton, ImageView imageView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView2) {
        super(obj, view, i);
        this.f30713x = abstractC11766fc;
        this.f30714y = placeHolderRecyclerView;
        this.f30715z = textView;
        this.f30706A = extendedFloatingActionButton;
        this.f30707B = imageView;
        this.f30708C = recyclerView;
        this.f30709D = swipeRefreshLayout;
        this.f30710E = appCompatTextView;
        this.f30711F = textView2;
    }
}
