package p426wg;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.aachartcreator.AAChartView;
import com.google.android.material.tabs.TabLayout;
import p163ih.PurchasesChartViewModel;

/* renamed from: wg.r6 */
/* loaded from: classes2.dex */
public abstract class AbstractC11987r6 extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31372A;

    /* renamed from: B */
    public final TabLayout f31373B;

    /* renamed from: C */
    public final Group f31374C;

    /* renamed from: D */
    public final AAChartView f31375D;

    /* renamed from: E */
    protected PurchasesChartViewModel f31376E;

    /* renamed from: x */
    public final AbstractC11799h8 f31377x;

    /* renamed from: y */
    public final TextView f31378y;

    /* renamed from: z */
    public final TextView f31379z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11987r6(Object obj, View view, int i, AbstractC11799h8 abstractC11799h8, TextView textView, TextView textView2, TextView textView3, TextView textView4, TabLayout tabLayout, Group group, AAChartView aAChartView) {
        super(obj, view, i);
        this.f31377x = abstractC11799h8;
        this.f31378y = textView;
        this.f31379z = textView2;
        this.f31372A = textView3;
        this.f31373B = tabLayout;
        this.f31374C = group;
        this.f31375D = aAChartView;
    }
}
