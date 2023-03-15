package p426wg;

import ae.InterfaceC0131a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import p241mi.BottomNavigationViewModel;
import pt.pingodoce.app.data.local.models.purchases.Purchase;
import pt.pingodoce.app.presentation.home.HomeViewModel;

/* renamed from: wg.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC11737e0 extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialCardView f30167A;

    /* renamed from: B */
    public final AbstractC11761f7 f30168B;

    /* renamed from: C */
    public final MaterialCardView f30169C;

    /* renamed from: D */
    public final AbstractC12027ta f30170D;

    /* renamed from: E */
    public final TextView f30171E;

    /* renamed from: F */
    public final TextView f30172F;

    /* renamed from: G */
    public final NestedScrollView f30173G;

    /* renamed from: H */
    public final ExtendedFloatingActionButton f30174H;

    /* renamed from: I */
    public final PlaceHolderRecyclerView f30175I;

    /* renamed from: J */
    public final AppBarLayout f30176J;

    /* renamed from: K */
    public final AbstractC11910n8 f30177K;

    /* renamed from: L */
    public final AbstractC11798h7 f30178L;

    /* renamed from: M */
    public final LinearLayout f30179M;

    /* renamed from: N */
    public final ConstraintLayout f30180N;

    /* renamed from: O */
    public final AbstractC11949p8 f30181O;

    /* renamed from: P */
    public final ConstraintLayout f30182P;

    /* renamed from: Q */
    public final PlaceHolderRecyclerView f30183Q;

    /* renamed from: R */
    public final SwipeRefreshLayout f30184R;

    /* renamed from: S */
    public final TextView f30185S;

    /* renamed from: T */
    public final Toolbar f30186T;

    /* renamed from: U */
    protected HomeViewModel f30187U;

    /* renamed from: V */
    protected BottomNavigationViewModel f30188V;

    /* renamed from: W */
    protected InterfaceC0131a<Purchase> f30189W;

    /* renamed from: x */
    public final ImageView f30190x;

    /* renamed from: y */
    public final AbstractC11766fc f30191y;

    /* renamed from: z */
    public final PlaceHolderRecyclerView f30192z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11737e0(Object obj, View view, int i, ImageView imageView, AbstractC11766fc abstractC11766fc, PlaceHolderRecyclerView placeHolderRecyclerView, MaterialCardView materialCardView, AbstractC11761f7 abstractC11761f7, MaterialCardView materialCardView2, TextView textView, TextView textView2, AbstractC12027ta abstractC12027ta, TextView textView3, TextView textView4, TextView textView5, NestedScrollView nestedScrollView, CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, PlaceHolderRecyclerView placeHolderRecyclerView2, AppBarLayout appBarLayout, AbstractC11910n8 abstractC11910n8, AbstractC11798h7 abstractC11798h7, LinearLayout linearLayout, ImageView imageView2, ConstraintLayout constraintLayout, AbstractC11949p8 abstractC11949p8, ConstraintLayout constraintLayout2, PlaceHolderRecyclerView placeHolderRecyclerView3, SwipeRefreshLayout swipeRefreshLayout, TextView textView6, Toolbar toolbar) {
        super(obj, view, i);
        this.f30190x = imageView;
        this.f30191y = abstractC11766fc;
        this.f30192z = placeHolderRecyclerView;
        this.f30167A = materialCardView;
        this.f30168B = abstractC11761f7;
        this.f30169C = materialCardView2;
        this.f30170D = abstractC12027ta;
        this.f30171E = textView3;
        this.f30172F = textView4;
        this.f30173G = nestedScrollView;
        this.f30174H = extendedFloatingActionButton;
        this.f30175I = placeHolderRecyclerView2;
        this.f30176J = appBarLayout;
        this.f30177K = abstractC11910n8;
        this.f30178L = abstractC11798h7;
        this.f30179M = linearLayout;
        this.f30180N = constraintLayout;
        this.f30181O = abstractC11949p8;
        this.f30182P = constraintLayout2;
        this.f30183Q = placeHolderRecyclerView3;
        this.f30184R = swipeRefreshLayout;
        this.f30185S = textView6;
        this.f30186T = toolbar;
    }

    /* renamed from: Q */
    public abstract void mo4339Q(BottomNavigationViewModel bottomNavigationViewModel);

    /* renamed from: R */
    public abstract void mo4338R(InterfaceC0131a<Purchase> interfaceC0131a);
}
