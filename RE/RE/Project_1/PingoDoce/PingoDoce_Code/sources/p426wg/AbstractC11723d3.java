package p426wg;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import pt.pingodoce.app.presentation.common.search.SearchViewModel;

/* renamed from: wg.d3 */
/* loaded from: classes2.dex */
public abstract class AbstractC11723d3 extends ViewDataBinding {

    /* renamed from: A */
    public final CollapsingToolbarLayout f30067A;

    /* renamed from: B */
    public final ImageButton f30068B;

    /* renamed from: C */
    public final SearchView f30069C;

    /* renamed from: D */
    public final AbstractC11764fa f30070D;

    /* renamed from: E */
    public final AbstractC11806hf f30071E;

    /* renamed from: F */
    public final ImageButton f30072F;

    /* renamed from: G */
    public final ImageView f30073G;

    /* renamed from: H */
    public final TextView f30074H;

    /* renamed from: I */
    public final PlaceHolderRecyclerView f30075I;

    /* renamed from: J */
    protected SearchViewModel f30076J;

    /* renamed from: x */
    public final RecyclerView f30077x;

    /* renamed from: y */
    public final RecyclerView f30078y;

    /* renamed from: z */
    public final TextView f30079z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11723d3(Object obj, View view, int i, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ImageButton imageButton, SearchView searchView, AbstractC11764fa abstractC11764fa, AbstractC11806hf abstractC11806hf, ImageButton imageButton2, ImageView imageView, ConstraintLayout constraintLayout, TextView textView2, PlaceHolderRecyclerView placeHolderRecyclerView, Toolbar toolbar) {
        super(obj, view, i);
        this.f30077x = recyclerView;
        this.f30078y = recyclerView2;
        this.f30079z = textView;
        this.f30067A = collapsingToolbarLayout;
        this.f30068B = imageButton;
        this.f30069C = searchView;
        this.f30070D = abstractC11764fa;
        this.f30071E = abstractC11806hf;
        this.f30072F = imageButton2;
        this.f30073G = imageView;
        this.f30074H = textView2;
        this.f30075I = placeHolderRecyclerView;
    }
}
