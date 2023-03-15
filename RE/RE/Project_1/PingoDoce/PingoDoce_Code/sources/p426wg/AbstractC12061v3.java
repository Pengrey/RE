package p426wg;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.github.florent37.expansionpanel.ExpansionLayout;
import com.google.android.gms.maps.MapView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import p205kj.StoreDetailViewModel;

/* renamed from: wg.v3 */
/* loaded from: classes2.dex */
public abstract class AbstractC12061v3 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31709A;

    /* renamed from: B */
    public final TextView f31710B;

    /* renamed from: C */
    public final TextView f31711C;

    /* renamed from: D */
    public final RecyclerView f31712D;

    /* renamed from: E */
    public final MapView f31713E;

    /* renamed from: F */
    protected StoreDetailViewModel f31714F;

    /* renamed from: x */
    public final TextView f31715x;

    /* renamed from: y */
    public final TextView f31716y;

    /* renamed from: z */
    public final MaterialButton f31717z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12061v3(Object obj, View view, int i, TextView textView, TextView textView2, CollapsingToolbarLayout collapsingToolbarLayout, MaterialButton materialButton, View view2, View view3, View view4, TextView textView3, TextView textView4, ImageView imageView, ImageView imageView2, ExpansionLayout expansionLayout, TextView textView5, LinearLayout linearLayout, NestedScrollView nestedScrollView, AppBarLayout appBarLayout, ImageView imageView3, RecyclerView recyclerView, MapView mapView, Toolbar toolbar) {
        super(obj, view, i);
        this.f31715x = textView;
        this.f31716y = textView2;
        this.f31717z = materialButton;
        this.f31709A = textView3;
        this.f31710B = textView4;
        this.f31711C = textView5;
        this.f31712D = recyclerView;
        this.f31713E = mapView;
    }
}
