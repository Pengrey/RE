package pt.pingodoce.app.presentation.promotion;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0928a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.C3737e;
import com.google.android.material.tabs.TabLayout;
import fj.SearchActivity;
import gl.PromotionViewModel;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.StoreManager;
import ni.BottomNavigationActivity;
import p050d.C4519c;
import p087ej.ProductPageAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p276og.Result;
import p314qd.InterfaceC9717b;
import p378u5.C10841b;
import p426wg.AbstractC11983r2;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import pt.pingodoce.app.data.local.models.products.Category;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.promotion.PromotionActivity;
import td.InterfaceC10524i0;

/* compiled from: PromotionActivity.kt */
/* loaded from: classes2.dex */
public final class PromotionActivity extends BottomNavigationActivity {

    /* renamed from: h0 */
    public StoreManager f24590h0;

    /* renamed from: i0 */
    public ViewModelFactoryByInjection f24591i0;

    /* renamed from: j0 */
    private final AbstractC0304b f24592j0;

    /* compiled from: PromotionActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.promotion.PromotionActivity$a */
    /* loaded from: classes2.dex */
    static final class C9357a extends AbstractC6438m implements InterfaceC6097a {
        C9357a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(PromotionActivity.this.m11497y1(), PromotionActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PromotionActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.promotion.PromotionActivity$initViews$1", m20196f = "PromotionActivity.kt", m20195l = {79}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.promotion.PromotionActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9358b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f24594x;

        /* renamed from: y */
        int f24595y;

        C9358b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9358b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9358b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            MenuItem menuItem;
            m34636d = C2116d.m34636d();
            int i = this.f24595y;
            boolean z = true;
            if (i == 0) {
                C13186n.m1453b(obj);
                MenuItem findItem = PromotionActivity.m11502v1(PromotionActivity.this).getMenu().findItem(C2336R.C2338id.action_search);
                if (findItem != null) {
                    StoreManager m11495z1 = PromotionActivity.this.m11495z1();
                    this.f24594x = findItem;
                    this.f24595y = 1;
                    Object m18760g = m11495z1.m18760g(this);
                    if (m18760g == m34636d) {
                        return m34636d;
                    }
                    menuItem = findItem;
                    obj = m18760g;
                }
                return C13195u.f34156a;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                menuItem = (MenuItem) this.f24594x;
                C13186n.m1453b(obj);
            }
            Store store = (Store) ((Result) obj).m16966a();
            if (store == null || !store.m13707k()) {
                z = false;
            }
            menuItem.setVisible(z);
            return C13195u.f34156a;
        }
    }

    public PromotionActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: gl.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                PromotionActivity.m11500w1(PromotionActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…)\n            }\n        }");
        this.f24592j0 = m41364M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final boolean m11519A1(PromotionActivity promotionActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(promotionActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_search) {
            SearchActivity.m23749c(promotionActivity.f24592j0, promotionActivity, Boolean.TRUE, null, 4, null);
            return true;
        }
        return false;
    }

    /* renamed from: C1 */
    private final void m11517C1() {
        ((PromotionViewModel) m22758I0()).m26377j0().mo171i(this, new InterfaceC1440f0() { // from class: gl.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PromotionActivity.m11516D1(PromotionActivity.this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m11516D1(PromotionActivity promotionActivity, final List list) {
        String str;
        Intrinsics.isThisObjectNull(promotionActivity, "this$0");
        ((PromotionViewModel) promotionActivity.m22758I0()).m26378i0();
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        ((AbstractC11983r2) promotionActivity.m22738w0()).mo3800Q(Boolean.FALSE);
        ViewPager2 viewPager2 = ((AbstractC11983r2) promotionActivity.m22738w0()).f31357B;
        FragmentManager m37323P = promotionActivity.m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = promotionActivity.mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        viewPager2.setAdapter(new ProductPageAdapter(m37323P, mo137b, list, true, null, false, 48, null));
        TabLayout tabLayout = ((AbstractC11983r2) promotionActivity.m22738w0()).f31363z;
        new C3737e(tabLayout, ((AbstractC11983r2) promotionActivity.m22738w0()).f31357B, new C3737e.InterfaceC3739b() { // from class: gl.d
            @Override // com.google.android.material.tabs.C3737e.InterfaceC3739b
            /* renamed from: a */
            public final void mo8459a(TabLayout.C3728f c3823f, int i) {
                PromotionActivity.m11515E1(list, c3823f, i);
            }
        }).m29104a();
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            View childAt = tabLayout.getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(8), UtilsExtensions.m35167e(8));
            int[][] iArr = {new int[]{16842913}};
            int[] iArr2 = new int[1];
            Category category = (Category) C13777q.m253O(list, i);
            if (category == null || (str = category.m14490c()) == null) {
                str = "#000000";
            }
            iArr2[0] = Color.parseColor(str);
            childAt2.setBackgroundTintList(new ColorStateList(iArr, iArr2));
            Intrinsics.checkIfNull(tabLayout, BuildConfig.VERSION_NAME);
            Drawable m39111f = C0928a.m39111f(C10841b.m6897b(tabLayout).m6899a(), C2336R.C2337drawable.shape_full_rounded);
            Intrinsics.ifNullDoSomething(m39111f);
            childAt2.setBackground(m39111f);
            childAt2.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m11515E1(List list, TabLayout.C3728f c3728f, int i) {
        Intrinsics.isThisObjectNull(list, "$categories");
        Intrinsics.isThisObjectNull(c3728f, "tab");
        c3728f.m29139r(((Category) list.get(i)).m14487f());
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m11507r1(List list, TabLayout.C3728f c3728f, int i) {
        m11515E1(list, c3728f, i);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m11505s1(PromotionActivity promotionActivity, ActivityResult activityResult) {
        m11500w1(promotionActivity, activityResult);
    }

    /* renamed from: t1 */
    public static /* synthetic */ boolean m11504t1(PromotionActivity promotionActivity, MenuItem menuItem) {
        return m11519A1(promotionActivity, menuItem);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m11503u1(PromotionActivity promotionActivity, List list) {
        m11516D1(promotionActivity, list);
    }

    /* renamed from: v1 */
    public static final /* synthetic */ Toolbar m11502v1(PromotionActivity promotionActivity) {
        return promotionActivity.m22737y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m11500w1(PromotionActivity promotionActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(promotionActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ShoppingListActivity.m20275a(promotionActivity);
        }
    }

    /* renamed from: A0 */
    protected int m11520A0() {
        return C2336R.C2339menu.menu_search;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B1 */
    public void m11508o1(AbstractC11983r2 abstractC11983r2, PromotionViewModel promotionViewModel) {
        Intrinsics.isThisObjectNull(abstractC11983r2, "binding");
        Intrinsics.isThisObjectNull(promotionViewModel, "viewModel");
        super.m17611o1(abstractC11983r2, promotionViewModel);
        abstractC11983r2.mo3799R(m17612n1());
        abstractC11983r2.mo3800Q(Boolean.FALSE);
        promotionViewModel.m26365v0(true);
        m11517C1();
        LifecycleOwner.m36965a(this).m36985h(new C9358b(null));
    }

    /* renamed from: G0 */
    protected int m11514G0() {
        return C2336R.string.lbl_promotion;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11513J0() {
        return C6450z.m20906b(PromotionViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11512K0() {
        return new C9357a();
    }

    /* renamed from: S0 */
    protected boolean m11510S0() {
        return false;
    }

    /* renamed from: k1 */
    protected void m11509k1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: s */
    public BottomNavigationView mo17603s() {
        BottomNavigationView bottomNavigationView = ((AbstractC11983r2) m22738w0()).f31361x.f30312x;
        Intrinsics.checkIfNull(bottomNavigationView, "binding.bottomNavigation….viewBottomNavigationView");
        return bottomNavigationView;
    }

    /* renamed from: w */
    public int mo17602w() {
        return C2336R.C2338id.navigation_promo;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_product_list;
    }

    /* renamed from: x1 */
    public final AbstractC0304b m11498x1() {
        return this.f24592j0;
    }

    /* renamed from: y1 */
    public final ViewModelFactoryByInjection m11497y1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24591i0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m11496z0() {
        return new Toolbar.InterfaceC0450f() { // from class: gl.b
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m10919A1;
                m10919A1 = PromotionActivity.m11519A1(PromotionActivity.this, menuItem);
                return m10919A1;
            }
        };
    }

    /* renamed from: z1 */
    public final StoreManager m11495z1() {
        StoreManager storeManager = this.f24590h0;
        if (storeManager != null) {
            return storeManager;
        }
        Intrinsics.throwUninitPropException("storeManager");
        return null;
    }
}
