package pt.pingodoce.app.presentation.flyer;

import ai.AbstractC0151j;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
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
import com.google.android.material.tabs.C3737e;
import com.google.android.material.tabs.TabLayout;
import fj.SearchActivity;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.AnalyticsManager;
import mg.StoreManager;
import mg.TransactionCacheManager;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p050d.C4519c;
import p087ej.ProductPageAdapter;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListActivity;
import p276og.Result;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p378u5.C10841b;
import p426wg.AbstractC11983r2;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13777q;
import p494zh.BaseActivity;
import pe.C8614a;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.products.Category;
import pt.pingodoce.app.data.remote.models.response.Flyer;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.flyer.FlyerActivity;
import sj.FlyerViewModel;
import td.InterfaceC10524i0;

/* compiled from: FlyerActivity.kt */
/* loaded from: classes2.dex */
public final class FlyerActivity extends BaseActivity {

    /* renamed from: f0 */
    public StoreManager f24108f0;

    /* renamed from: g0 */
    public TransactionCacheManager f24109g0;

    /* renamed from: h0 */
    public AnalyticsManager f24110h0;

    /* renamed from: i0 */
    public ViewModelFactoryByInjection f24111i0;

    /* renamed from: j0 */
    private final InterfaceC13178g f24112j0;

    /* renamed from: k0 */
    private final AbstractC0304b f24113k0;

    /* compiled from: FlyerActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.flyer.FlyerActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9150a {
        private C9150a() {
        }

        public /* synthetic */ C9150a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FlyerActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.flyer.FlyerActivity$b */
    /* loaded from: classes2.dex */
    static final class C9151b extends AbstractC6438m implements InterfaceC6097a {
        C9151b() {
            super(0);
        }

        /* renamed from: a */
        public final Flyer mo42214q() {
            return FlyerActivity.this.m12282q1().m18584f();
        }
    }

    /* compiled from: FlyerActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.flyer.FlyerActivity$c */
    /* loaded from: classes2.dex */
    static final class C9152c extends AbstractC6438m implements InterfaceC6097a {
        C9152c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(FlyerActivity.this.m12280s1(), FlyerActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlyerActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.flyer.FlyerActivity$initViews$1", m20196f = "FlyerActivity.kt", m20195l = {C0868i.f2763F0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.flyer.FlyerActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9153d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f24116x;

        /* renamed from: y */
        int f24117y;

        C9153d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9153d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9153d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            MenuItem menuItem;
            m34636d = C2116d.m34636d();
            int i = this.f24117y;
            boolean z = true;
            if (i == 0) {
                C13186n.m1453b(obj);
                MenuItem findItem = FlyerActivity.m12285n1(FlyerActivity.this).getMenu().findItem(C2336R.C2338id.action_search);
                if (findItem != null) {
                    StoreManager m12278u1 = FlyerActivity.this.m12278u1();
                    this.f24116x = findItem;
                    this.f24117y = 1;
                    Object m18760g = m12278u1.m18760g(this);
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
                menuItem = (MenuItem) this.f24116x;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlyerActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.flyer.FlyerActivity$initViews$3", m20196f = "FlyerActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.flyer.FlyerActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9154e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24119x;

        /* renamed from: y */
        final /* synthetic */ FlyerViewModel f24120y;

        /* renamed from: z */
        final /* synthetic */ FlyerActivity f24121z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9154e(FlyerViewModel flyerViewModel, FlyerActivity flyerActivity, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24120y = flyerViewModel;
            this.f24121z = flyerActivity;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9154e(this.f24120y, this.f24121z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9154e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24119x == 0) {
                C13186n.m1453b(obj);
                this.f24120y.m8450w0(FlyerActivity.m12287m1(this.f24121z).m13842a());
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        new C9150a(null);
    }

    public FlyerActivity() {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(new C9151b());
        this.f24112j0 = m1464a;
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: sj.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                FlyerActivity.m12284o1(FlyerActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…)\n            }\n        }");
        this.f24113k0 = m41364M;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12291i1(FlyerViewModel flyerViewModel, AbstractC11983r2 abstractC11983r2, FlyerActivity flyerActivity, List list) {
        m12274x1(flyerViewModel, abstractC11983r2, flyerActivity, list);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12290j1(List list, TabLayout.C3728f c3728f, int i) {
        m12273y1(list, c3728f, i);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m12289k1(FlyerActivity flyerActivity, ActivityResult activityResult) {
        m12284o1(flyerActivity, activityResult);
    }

    /* renamed from: l1 */
    public static /* synthetic */ boolean m12288l1(FlyerActivity flyerActivity, MenuItem menuItem) {
        return m12277v1(flyerActivity, menuItem);
    }

    /* renamed from: m1 */
    public static final /* synthetic */ Flyer m12287m1(FlyerActivity flyerActivity) {
        return flyerActivity.m12279t1();
    }

    /* renamed from: n1 */
    public static final /* synthetic */ Toolbar m12285n1(FlyerActivity flyerActivity) {
        return flyerActivity.m22737y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m12284o1(FlyerActivity flyerActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(flyerActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ShoppingListActivity.m20275a(flyerActivity);
        }
    }

    /* renamed from: t1 */
    private final Flyer m12279t1() {
        return (Flyer) this.f24112j0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final boolean m12277v1(FlyerActivity flyerActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(flyerActivity, "this$0");
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_search) {
            SearchActivity.m23749c(flyerActivity.f24113k0, flyerActivity, null, Integer.valueOf(flyerActivity.m12279t1().m13838e()), 2, null);
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_pdf) {
            InterfaceC7886d.C7887a.m17629a(flyerActivity.m12283p1(), new AnalyticEvents.AbstractC7743d.C7747d(String.valueOf(flyerActivity.m12279t1().m13838e())), null, null, null, 14, null);
            IntentUtils.m24293a(flyerActivity, flyerActivity.m12279t1().m13836h());
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m12274x1(FlyerViewModel flyerViewModel, AbstractC11983r2 abstractC11983r2, FlyerActivity flyerActivity, final List list) {
        String str;
        Intrinsics.isThisObjectNull(flyerViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(abstractC11983r2, "$binding");
        Intrinsics.isThisObjectNull(flyerActivity, "this$0");
        flyerViewModel.m26378i0();
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        ViewPager2 viewPager2 = abstractC11983r2.f31357B;
        FragmentManager m37323P = flyerActivity.m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = flyerActivity.mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        viewPager2.setAdapter(new ProductPageAdapter(m37323P, mo137b, list, false, Integer.valueOf(flyerActivity.m12279t1().m13838e()), true));
        TabLayout tabLayout = abstractC11983r2.f31363z;
        new C3737e(tabLayout, abstractC11983r2.f31357B, new C3737e.InterfaceC3739b() { // from class: sj.d
            @Override // com.google.android.material.tabs.C3737e.InterfaceC3739b
            /* renamed from: a */
            public final void mo8459a(TabLayout.C3728f c3823f, int i) {
                FlyerActivity.m12273y1(list, c3823f, i);
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
    /* renamed from: y1 */
    public static final void m12273y1(List list, TabLayout.C3728f c3728f, int i) {
        Intrinsics.isThisObjectNull(list, "$categories");
        Intrinsics.isThisObjectNull(c3728f, "tab");
        c3728f.m29139r(((Category) list.get(i)).m14487f());
    }

    /* renamed from: A0 */
    protected int m12295A0() {
        return C2336R.C2339menu.menu_flyer;
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_FLYER_FROM_BANNER")) {
            z = false;
        }
        return z ? super.mo11827D0() : C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12294J0() {
        return C6450z.m20906b(FlyerViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12293K0() {
        return new C9152c();
    }

    /* renamed from: n */
    public boolean m12286n() {
        return true;
    }

    /* renamed from: p1 */
    public final AnalyticsManager m12283p1() {
        AnalyticsManager analyticsManager = this.f24110h0;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.throwUninitPropException("analyticsManager");
        return null;
    }

    /* renamed from: q1 */
    public final TransactionCacheManager m12282q1() {
        TransactionCacheManager transactionCacheManager = this.f24109g0;
        if (transactionCacheManager != null) {
            return transactionCacheManager;
        }
        Intrinsics.throwUninitPropException("cache");
        return null;
    }

    /* renamed from: r1 */
    public final AbstractC0304b m12281r1() {
        return this.f24113k0;
    }

    /* renamed from: s1 */
    public final ViewModelFactoryByInjection m12280s1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24111i0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: u1 */
    public final StoreManager m12278u1() {
        StoreManager storeManager = this.f24108f0;
        if (storeManager != null) {
            return storeManager;
        }
        Intrinsics.throwUninitPropException("storeManager");
        return null;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_FLYER_FROM_BANNER")) {
            z = false;
        }
        return z ? new C8617d() : new C8614a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public void m12292P0(final AbstractC11983r2 abstractC11983r2, final FlyerViewModel flyerViewModel) {
        Intrinsics.isThisObjectNull(abstractC11983r2, "binding");
        Intrinsics.isThisObjectNull(flyerViewModel, "viewModel");
        LifecycleOwner.m36965a(this).m36985h(new C9153d(null));
        m22737y0().setTitle(m12279t1().m13833k());
        m22737y0().setSubtitle(m12279t1().m13839d());
        abstractC11983r2.mo3800Q(Boolean.FALSE);
        flyerViewModel.m8451j0().mo171i(this, new InterfaceC1440f0() { // from class: sj.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FlyerActivity.m12274x1(FlyerViewModel.this, abstractC11983r2, this, (List) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9154e(flyerViewModel, this, null));
        m145b1().mo41749a(AbstractC0151j.C0153b.f333a);
        InterfaceC7886d.C7887a.m17629a(m12283p1(), new AnalyticEvents.AbstractC7743d.C7746c(String.valueOf(m12279t1().m13838e())), null, null, null, 14, null);
        m12282q1().m18581i();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_product_list;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m12272z0() {
        return new Toolbar.InterfaceC0450f() { // from class: sj.b
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m11459v1;
                m11459v1 = FlyerActivity.m12277v1(FlyerActivity.this, menuItem);
                return m11459v1;
            }
        };
    }
}
