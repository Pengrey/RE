package p426wg;

import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import il.PurchaseListViewModel;

/* renamed from: wg.x2 */
/* loaded from: classes2.dex */
public abstract class AbstractC12094x2 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31840A;

    /* renamed from: B */
    public final MaterialButton f31841B;

    /* renamed from: C */
    public final TabLayout f31842C;

    /* renamed from: D */
    public final Group f31843D;

    /* renamed from: E */
    public final AAChartView f31844E;

    /* renamed from: F */
    public final PlaceHolderRecyclerView f31845F;

    /* renamed from: G */
    public final NestedScrollView f31846G;

    /* renamed from: H */
    public final Space f31847H;

    /* renamed from: I */
    public final TextView f31848I;

    /* renamed from: J */
    protected PurchaseListViewModel f31849J;

    /* renamed from: x */
    public final TextView f31850x;

    /* renamed from: y */
    public final TextView f31851y;

    /* renamed from: z */
    public final TextView f31852z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12094x2(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, MaterialButton materialButton, TabLayout tabLayout, Group group, AAChartView aAChartView, PlaceHolderRecyclerView placeHolderRecyclerView, NestedScrollView nestedScrollView, Space space, TextView textView5) {
        super(obj, view, i);
        this.f31850x = textView;
        this.f31851y = textView2;
        this.f31852z = textView3;
        this.f31840A = textView4;
        this.f31841B = materialButton;
        this.f31842C = tabLayout;
        this.f31843D = group;
        this.f31844E = aAChartView;
        this.f31845F = placeHolderRecyclerView;
        this.f31846G = nestedScrollView;
        this.f31847H = space;
        this.f31848I = textView5;
    }
}
