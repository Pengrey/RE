package p426wg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import dj.ProductListViewModel;
import p241mi.BottomNavigationViewModel;

/* renamed from: wg.r2 */
/* loaded from: classes2.dex */
public abstract class AbstractC11983r2 extends ViewDataBinding {

    /* renamed from: A */
    public final Guideline f31356A;

    /* renamed from: B */
    public final ViewPager2 f31357B;

    /* renamed from: C */
    protected Boolean f31358C;

    /* renamed from: D */
    protected ProductListViewModel f31359D;

    /* renamed from: E */
    protected BottomNavigationViewModel f31360E;

    /* renamed from: x */
    public final AbstractC11761f7 f31361x;

    /* renamed from: y */
    public final FrameLayout f31362y;

    /* renamed from: z */
    public final TabLayout f31363z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11983r2(Object obj, View view, int i, AbstractC11761f7 abstractC11761f7, FrameLayout frameLayout, TabLayout tabLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, Guideline guideline, TextView textView, AppBarLayout appBarLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.f31361x = abstractC11761f7;
        this.f31362y = frameLayout;
        this.f31363z = tabLayout;
        this.f31356A = guideline;
        this.f31357B = viewPager2;
    }

    /* renamed from: Q */
    public abstract void mo3800Q(Boolean bool);

    /* renamed from: R */
    public abstract void mo3799R(BottomNavigationViewModel bottomNavigationViewModel);
}
