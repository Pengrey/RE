package pt.pingodoce.app.presentation.home.tailored;

import ai.AbstractC0151j;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.tabs.TabLayout;
import dk.TailoredForYouViewModel;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import p050d.C4519c;
import p087ej.ProductPageAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11983r2;
import p489zc.CollectionsJVM;
import p494zh.BaseActivity;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.products.Category;
import pt.pingodoce.app.presentation.home.tailored.TailoredForYouActivity;

/* compiled from: TailoredForYouActivity.kt */
/* loaded from: classes2.dex */
public final class TailoredForYouActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24306f0;

    /* renamed from: g0 */
    private final AbstractC0304b f24307g0;

    /* compiled from: TailoredForYouActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.home.tailored.TailoredForYouActivity$a */
    /* loaded from: classes2.dex */
    static final class C9234a extends AbstractC6438m implements InterfaceC6097a {
        C9234a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TailoredForYouActivity.this.m12028m1(), TailoredForYouActivity.this, null, 2, null);
        }
    }

    public TailoredForYouActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: dk.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                TailoredForYouActivity.m12031j1(TailoredForYouActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul… finish()\n        }\n    }");
        this.f24307g0 = m41364M;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12032i1(TailoredForYouActivity tailoredForYouActivity, ActivityResult activityResult) {
        m12031j1(tailoredForYouActivity, activityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m12031j1(TailoredForYouActivity tailoredForYouActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(tailoredForYouActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ShoppingListActivity.m20275a(tailoredForYouActivity);
            tailoredForYouActivity.finish();
        }
    }

    /* renamed from: G0 */
    protected int m12036G0() {
        return C2336R.string.lbl_opportunities_for_you;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12035J0() {
        return C6450z.m20906b(TailoredForYouViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12034K0() {
        return new C9234a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: l1 */
    public final AbstractC0304b m12029l1() {
        return this.f24307g0;
    }

    /* renamed from: m1 */
    public final ViewModelFactoryByInjection m12028m1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24306f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: n */
    public boolean m12027n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public void m12033P0(AbstractC11983r2 abstractC11983r2, TailoredForYouViewModel tailoredForYouViewModel) {
        List m202b;
        Intrinsics.isThisObjectNull(abstractC11983r2, "binding");
        Intrinsics.isThisObjectNull(tailoredForYouViewModel, "viewModel");
        tailoredForYouViewModel.m26378i0();
        ViewPager2 viewPager2 = abstractC11983r2.f31357B;
        FragmentManager m37323P = m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        m202b = CollectionsJVM.m202b(new Category(0, null, null, null, null, true, 31, null));
        viewPager2.setAdapter(new ProductPageAdapter(m37323P, mo137b, m202b, false, null, true, 16, null));
        TabLayout tabLayout = abstractC11983r2.f31363z;
        Intrinsics.checkIfNull(tabLayout, "binding.categoryTabLayout");
        tabLayout.setVisibility(8);
        abstractC11983r2.mo3800Q(Boolean.FALSE);
        m145b1().mo41749a(AbstractC0151j.C0158g.f338a);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_product_list;
    }
}
