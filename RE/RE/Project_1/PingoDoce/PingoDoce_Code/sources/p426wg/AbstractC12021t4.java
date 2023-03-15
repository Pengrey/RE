package p426wg;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import p299pj.WalkThroughViewModel;

/* renamed from: wg.t4 */
/* loaded from: classes2.dex */
public abstract class AbstractC12021t4 extends ViewDataBinding {

    /* renamed from: A */
    protected WalkThroughViewModel f31515A;

    /* renamed from: x */
    public final AbstractC11917nf f31516x;

    /* renamed from: y */
    public final TabLayout f31517y;

    /* renamed from: z */
    public final ViewPager2 f31518z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12021t4(Object obj, View view, int i, ConstraintLayout constraintLayout, AbstractC11917nf abstractC11917nf, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.f31516x = abstractC11917nf;
        this.f31517y = tabLayout;
        this.f31518z = viewPager2;
    }
}
