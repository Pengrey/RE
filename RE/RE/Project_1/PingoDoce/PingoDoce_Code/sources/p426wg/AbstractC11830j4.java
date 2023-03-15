package p426wg;

import am.TakeAwayProductsViewModel;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: wg.j4 */
/* loaded from: classes2.dex */
public abstract class AbstractC11830j4 extends ViewDataBinding {

    /* renamed from: A */
    protected TakeAwayProductsViewModel f30665A;

    /* renamed from: x */
    public final AbstractC11760f6 f30666x;

    /* renamed from: y */
    public final TabLayout f30667y;

    /* renamed from: z */
    public final ViewPager2 f30668z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11830j4(Object obj, View view, int i, AbstractC11760f6 abstractC11760f6, TabLayout tabLayout, AppBarLayout appBarLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.f30666x = abstractC11760f6;
        this.f30667y = tabLayout;
        this.f30668z = viewPager2;
    }
}
