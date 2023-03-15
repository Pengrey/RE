package p426wg;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p067dh.AssociationsViewModel;

/* renamed from: wg.j1 */
/* loaded from: classes2.dex */
public abstract class AbstractC11827j1 extends ViewDataBinding {

    /* renamed from: x */
    public final TabLayout f30622x;

    /* renamed from: y */
    public final ViewPager2 f30623y;

    /* renamed from: z */
    protected AssociationsViewModel f30624z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11827j1(Object obj, View view, int i, TabLayout tabLayout, ViewPager2 viewPager2, AppBarLayout appBarLayout, Toolbar toolbar) {
        super(obj, view, i);
        this.f30622x = tabLayout;
        this.f30623y = viewPager2;
    }
}
