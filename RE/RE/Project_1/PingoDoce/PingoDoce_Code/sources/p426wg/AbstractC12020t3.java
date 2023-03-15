package p426wg;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: wg.t3 */
/* loaded from: classes2.dex */
public abstract class AbstractC12020t3 extends ViewDataBinding {

    /* renamed from: x */
    public final TabLayout f31512x;

    /* renamed from: y */
    public final ViewPager2 f31513y;

    /* renamed from: z */
    public final Toolbar f31514z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12020t3(Object obj, View view, int i, AppBarLayout appBarLayout, TabLayout tabLayout, ViewPager2 viewPager2, Toolbar toolbar) {
        super(obj, view, i);
        this.f31512x = tabLayout;
        this.f31513y = viewPager2;
        this.f31514z = toolbar;
    }
}
