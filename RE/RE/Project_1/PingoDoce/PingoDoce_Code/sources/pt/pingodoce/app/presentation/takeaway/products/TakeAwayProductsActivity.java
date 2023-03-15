package pt.pingodoce.app.presentation.takeaway.products;

import am.TakeAwayProductsViewModel;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import be.UtilsExtensions;
import bm.TakeAwayProductsPageAdapter;
import ci.C2147i;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.recyclerpickerdialog.EnumC2361b;
import com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment;
import com.google.android.material.tabs.C3737e;
import com.google.android.material.tabs.TabLayout;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p314qd.InterfaceC9717b;
import p351s5.RecyclerPickerDialogFragment;
import p426wg.AbstractC11760f6;
import p426wg.AbstractC11830j4;
import p468yc.C13182l;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import pe.C8617d;
import pl.TakeAwayCheckoutActivity;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;
import pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity;

/* compiled from: TakeAwayProductsActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayProductsActivity extends TakeAwayCheckoutActivity {

    /* renamed from: k0 */
    public ViewModelFactoryByInjection f25045k0;

    /* renamed from: l0 */
    private final ViewPager2.AbstractC1747i f25046l0 = new C9525c();

    /* renamed from: m0 */
    private boolean f25047m0;

    /* renamed from: n0 */
    private boolean f25048n0;

    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$a */
    /* loaded from: classes2.dex */
    static final class C9523a extends AbstractC6438m implements InterfaceC6097a {
        C9523a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10768j2 = TakeAwayProductsActivity.this.m10768j2();
            TakeAwayProductsActivity takeAwayProductsActivity = TakeAwayProductsActivity.this;
            return m10768j2.m20377b(takeAwayProductsActivity, takeAwayProductsActivity.getIntent().getExtras());
        }
    }

    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9524b implements UiWidgets.InterfaceC7044a {
        C9524b() {
        }

        /* renamed from: a */
        public void m10752a(boolean z) {
            if (z) {
                TakeAwayProductsActivity.m10770h2(TakeAwayProductsActivity.this, true);
                TakeAwayProductsActivity.this.onBackPressed();
            }
        }
    }

    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9525c extends ViewPager2.AbstractC1747i {
        C9525c() {
        }

        /* renamed from: c */
        public void mo29094c(int i) {
            TakeAwayProductsActivity.this.m10781Q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9526d extends AbstractC6438m implements InterfaceC6108l {
        C9526d() {
            super(1);
        }

        /* renamed from: a */
        public final void m10750a(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            if (!list.isEmpty()) {
                TakeAwayProductsActivity.m10772f2(TakeAwayProductsActivity.this).m41513d1(((RecyclerPickerDialogFragment) list.get(0)).m9276b());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10750a((List) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9527e extends AbstractC6438m implements InterfaceC6108l {
        C9527e() {
            super(1);
        }

        /* renamed from: a */
        public final void m10749a(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            TakeAwayProductsActivity.m10772f2(TakeAwayProductsActivity.this).m41512e1(((RecyclerPickerDialogFragment) list.get(0)).m9276b());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10749a((List) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$f */
    /* loaded from: classes2.dex */
    public static final class C9528f extends AbstractC6438m implements InterfaceC6108l {
        C9528f() {
            super(1);
        }

        /* renamed from: a */
        public final void m10748a(TakeAwayCategory takeAwayCategory) {
            Intrinsics.isThisObjectNull(takeAwayCategory, "it");
            RecyclerView.AbstractC1535g adapter = TakeAwayProductsActivity.m10773e2(TakeAwayProductsActivity.this).f30668z.getAdapter();
            Objects.requireNonNull(adapter, "null cannot be cast to non-null type pt.pingodoce.app.presentation.takeaway.products.adapters.TakeAwayProductsPageAdapter");
            int m35032X = ((TakeAwayProductsPageAdapter) adapter).m35032X(takeAwayCategory);
            int currentItem = TakeAwayProductsActivity.m10773e2(TakeAwayProductsActivity.this).f30668z.getCurrentItem();
            if (m35032X > -1) {
                TakeAwayProductsActivity.m10773e2(TakeAwayProductsActivity.this).f30668z.m35489j(m35032X, m35032X >= currentItem + (-2) && m35032X <= currentItem + 2);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10748a((TakeAwayCategory) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductsActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.TakeAwayProductsActivity$g */
    /* loaded from: classes2.dex */
    public static final class C9529g extends AbstractC6438m implements InterfaceC6108l {
        C9529g() {
            super(1);
        }

        /* renamed from: a */
        public final void m10747a(TakeAwayFlowData takeAwayFlowData) {
            Intrinsics.isThisObjectNull(takeAwayFlowData, "it");
            TakeAwayProductsActivity.m10771g2(TakeAwayProductsActivity.this, true);
            TakeAwayProductsActivity.m10772f2(TakeAwayProductsActivity.this).m14851I0(takeAwayFlowData.m14690a().m10863h());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10747a((TakeAwayFlowData) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: Y1 */
    public static /* synthetic */ void m10779Y1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayProductsActivity takeAwayProductsActivity, Boolean bool) {
        m10759p2(recyclerPickerDialogFragment, takeAwayProductsActivity, bool);
    }

    /* renamed from: Z1 */
    public static /* synthetic */ void m10778Z1(TakeAwayProductsActivity takeAwayProductsActivity, List list) {
        m10757r2(takeAwayProductsActivity, list);
    }

    /* renamed from: a2 */
    public static /* synthetic */ void m10777a2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        m10761n2(recyclerPickerDialogFragment, arrayList);
    }

    /* renamed from: b2 */
    public static /* synthetic */ void m10776b2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        m10763m2(recyclerPickerDialogFragment, arrayList);
    }

    /* renamed from: c2 */
    public static /* synthetic */ void m10775c2(List list, TabLayout.C3728f c3728f, int i) {
        m10756s2(list, c3728f, i);
    }

    /* renamed from: d2 */
    public static /* synthetic */ void m10774d2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayProductsActivity takeAwayProductsActivity, Boolean bool) {
        m10760o2(recyclerPickerDialogFragment, takeAwayProductsActivity, bool);
    }

    /* renamed from: e2 */
    public static final /* synthetic */ AbstractC11830j4 m10773e2(TakeAwayProductsActivity takeAwayProductsActivity) {
        return (AbstractC11830j4) takeAwayProductsActivity.m22738w0();
    }

    /* renamed from: f2 */
    public static final /* synthetic */ TakeAwayProductsViewModel m10772f2(TakeAwayProductsActivity takeAwayProductsActivity) {
        return (TakeAwayProductsViewModel) takeAwayProductsActivity.m22758I0();
    }

    /* renamed from: g2 */
    public static final /* synthetic */ void m10771g2(TakeAwayProductsActivity takeAwayProductsActivity, boolean z) {
        takeAwayProductsActivity.f25047m0 = z;
    }

    /* renamed from: h2 */
    public static final /* synthetic */ void m10770h2(TakeAwayProductsActivity takeAwayProductsActivity, boolean z) {
        takeAwayProductsActivity.f25048n0 = z;
    }

    /* renamed from: l2 */
    private final void m10765l2() {
        RecyclerPickerDialogFragment.C2356a c2356a = com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.f6857c1;
        EnumC2361b enumC2361b = EnumC2361b.RADIO_BUTTON;
        final com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment m33815b = RecyclerPickerDialogFragment.C2356a.m33815b(c2356a, null, enumC2361b, 2131951743, new C9526d(), 1, null);
        String string = getString(C2336R.string.lbl_takeaway_date);
        Intrinsics.checkIfNull(string, "this@TakeAwayProductsAct…string.lbl_takeaway_date)");
        m33815b.m33823N2(string);
        String string2 = getString(C2336R.string.btn_choose);
        Intrinsics.checkIfNull(string2, "this@TakeAwayProductsAct…ring(R.string.btn_choose)");
        m33815b.m33829H2(string2);
        m33815b.m33824M2(this);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            Display display = getDisplay();
            if (display != null) {
                display.getRealMetrics(new DisplayMetrics());
            }
        } else {
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (i >= 30) {
            Display display2 = getDisplay();
            if (display2 != null) {
                display2.getRealMetrics(displayMetrics);
            }
        } else {
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        int i2 = displayMetrics.heightPixels;
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = i2 - (identifier > 0 ? getResources().getDimensionPixelSize(identifier) : 0);
        int identifier2 = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize2 = identifier2 > 0 ? getResources().getDimensionPixelSize(identifier2) : 0;
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(16843499, typedValue, true);
        m33815b.m33826K2(((int) ((dimensionPixelSize - dimensionPixelSize2) - typedValue.getDimension(new DisplayMetrics()))) / 2);
        m33815b.m33825L2(true);
        final com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment m33815b2 = RecyclerPickerDialogFragment.C2356a.m33815b(c2356a, null, enumC2361b, 2131951743, new C9527e(), 1, null);
        String string3 = getString(C2336R.string.lbl_takeaway_hour);
        Intrinsics.checkIfNull(string3, "this@TakeAwayProductsAct…string.lbl_takeaway_hour)");
        m33815b2.m33823N2(string3);
        String string4 = getString(C2336R.string.btn_choose);
        Intrinsics.checkIfNull(string4, "this@TakeAwayProductsAct…ring(R.string.btn_choose)");
        m33815b2.m33829H2(string4);
        m33815b2.m33824M2(this);
        if (i >= 30) {
            Display display3 = getDisplay();
            if (display3 != null) {
                display3.getRealMetrics(new DisplayMetrics());
            }
        } else {
            getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        }
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        if (i >= 30) {
            Display display4 = getDisplay();
            if (display4 != null) {
                display4.getRealMetrics(displayMetrics2);
            }
        } else {
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics2);
        }
        int i3 = displayMetrics2.heightPixels;
        int identifier3 = getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize3 = i3 - (identifier3 > 0 ? getResources().getDimensionPixelSize(identifier3) : 0);
        int identifier4 = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize4 = identifier4 > 0 ? getResources().getDimensionPixelSize(identifier4) : 0;
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(16843499, typedValue2, true);
        m33815b2.m33826K2(((int) ((dimensionPixelSize3 - dimensionPixelSize4) - typedValue2.getDimension(new DisplayMetrics()))) / 2);
        ((TakeAwayProductsViewModel) m22758I0()).m16437R0().mo171i(this, new InterfaceC1440f0() { // from class: am.k
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductsActivity.m10763m2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, (ArrayList) obj);
            }
        });
        ((TakeAwayProductsViewModel) m22758I0()).m16436S0().mo171i(this, new InterfaceC1440f0() { // from class: am.j
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductsActivity.m10761n2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, (ArrayList) obj);
            }
        });
        ((TakeAwayProductsViewModel) m22758I0()).m16434U0().mo171i(this, new InterfaceC1440f0() { // from class: am.m
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductsActivity.m10760o2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, this, (Boolean) obj);
            }
        });
        ((TakeAwayProductsViewModel) m22758I0()).m16433V0().mo171i(this, new InterfaceC1440f0() { // from class: am.l
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductsActivity.m10759p2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m10763m2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$dateSelectDialogFragment");
        Intrinsics.checkIfNull(arrayList, "it");
        recyclerPickerDialogFragment.m33827J2(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m10761n2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$hourSelectDialogFragment");
        Intrinsics.checkIfNull(arrayList, "it");
        recyclerPickerDialogFragment.m33827J2(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m10760o2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayProductsActivity takeAwayProductsActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$dateSelectDialogFragment");
        Intrinsics.isThisObjectNull(takeAwayProductsActivity, "this$0");
        if (recyclerPickerDialogFragment.m37573n0()) {
            return;
        }
        recyclerPickerDialogFragment.mo3126x2(takeAwayProductsActivity.m37323P(), "dateFrag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m10759p2(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayProductsActivity takeAwayProductsActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$hourSelectDialogFragment");
        Intrinsics.isThisObjectNull(takeAwayProductsActivity, "this$0");
        if (recyclerPickerDialogFragment.m37573n0()) {
            return;
        }
        Intrinsics.checkIfNull(bool, "isMandatory");
        recyclerPickerDialogFragment.m33828I2(bool.booleanValue());
        recyclerPickerDialogFragment.m37328t2(!bool.booleanValue());
        recyclerPickerDialogFragment.m33825L2(!bool.booleanValue());
        recyclerPickerDialogFragment.mo3126x2(takeAwayProductsActivity.m37323P(), "hourFrag");
    }

    /* renamed from: q2 */
    private final void m10758q2() {
        ((TakeAwayProductsViewModel) m22758I0()).m41506s1().mo171i(this, new InterfaceC1440f0() { // from class: am.n
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayProductsActivity.m10757r2(TakeAwayProductsActivity.this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m10757r2(TakeAwayProductsActivity takeAwayProductsActivity, final List list) {
        Intrinsics.isThisObjectNull(takeAwayProductsActivity, "this$0");
        ViewPager2 viewPager2 = ((AbstractC11830j4) takeAwayProductsActivity.m22738w0()).f30668z;
        FragmentManager m37323P = takeAwayProductsActivity.m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = takeAwayProductsActivity.mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        TakeAwayFlowData takeAwayFlowData = ((TakeAwayProductsViewModel) takeAwayProductsActivity.m22758I0()).m34577T() ? (TakeAwayFlowData) ((TakeAwayProductsViewModel) takeAwayProductsActivity.m22758I0()).m34578S() : null;
        Intrinsics.checkIfNull(list, "categories");
        viewPager2.setAdapter(new TakeAwayProductsPageAdapter(m37323P, mo137b, takeAwayFlowData, list, ((TakeAwayProductsViewModel) takeAwayProductsActivity.m22758I0()).m41504u1(), ((TakeAwayProductsViewModel) takeAwayProductsActivity.m22758I0()).m41505t1(), new C9528f(), new C9529g()));
        ((AbstractC11830j4) takeAwayProductsActivity.m22738w0()).f30668z.setOffscreenPageLimit(1);
        ((AbstractC11830j4) takeAwayProductsActivity.m22738w0()).f30668z.m35492g(takeAwayProductsActivity.f25046l0);
        TabLayout tabLayout = ((AbstractC11830j4) takeAwayProductsActivity.m22738w0()).f30667y;
        new C3737e(tabLayout, ((AbstractC11830j4) takeAwayProductsActivity.m22738w0()).f30668z, new C3737e.InterfaceC3739b() { // from class: am.o
            @Override // com.google.android.material.tabs.C3737e.InterfaceC3739b
            /* renamed from: a */
            public final void mo8459a(TabLayout.C3728f c3793f, int i) {
                TakeAwayProductsActivity.m10756s2(list, c3793f, i);
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
            childAt2.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m10756s2(List list, TabLayout.C3728f c3728f, int i) {
        Intrinsics.isThisObjectNull(c3728f, "tab");
        c3728f.m29139r(((TakeAwayCategory) list.get(i)).m14291c());
    }

    /* renamed from: G1 */
    public AbstractC11760f6 m10786G1() {
        AbstractC11760f6 abstractC11760f6 = ((AbstractC11830j4) m22738w0()).f30666x;
        Intrinsics.checkIfNull(abstractC11760f6, "binding.bottomsheetIncluded");
        return abstractC11760f6;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10784J0() {
        return C6450z.m20906b(TakeAwayProductsViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10783K0() {
        return new C9523a();
    }

    /* renamed from: Q1 */
    protected void m10781Q1() {
        RecyclerView.AbstractC1535g adapter = ((AbstractC11830j4) m22738w0()).f30668z.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type pt.pingodoce.app.presentation.takeaway.products.adapters.TakeAwayProductsPageAdapter");
        ((TakeAwayProductsPageAdapter) adapter).m35030Z(((AbstractC11830j4) m22738w0()).f30668z.getCurrentItem(), (TakeAwayFlowData) ((TakeAwayProductsViewModel) m22758I0()).m34578S());
    }

    /* renamed from: R1 */
    protected void m10780R1() {
        RecyclerView.AbstractC1535g adapter = ((AbstractC11830j4) m22738w0()).f30668z.getAdapter();
        Objects.requireNonNull(adapter, "null cannot be cast to non-null type pt.pingodoce.app.presentation.takeaway.products.adapters.TakeAwayProductsPageAdapter");
        ((TakeAwayProductsPageAdapter) adapter).m35031Y(((AbstractC11830j4) m22738w0()).f30668z.getCurrentItem());
        m10781Q1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i2 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: j2 */
    public final ViewModelFactoryByInjection m10768j2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25045k0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k1 */
    protected List m10767k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2147i.f6182a);
        return m202b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k2 */
    public void m10762n1(AbstractC11830j4 abstractC11830j4, TakeAwayProductsViewModel takeAwayProductsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11830j4, "binding");
        Intrinsics.isThisObjectNull(takeAwayProductsViewModel, "viewModel");
        super.m14895I1(abstractC11830j4, takeAwayProductsViewModel);
        m10765l2();
        m10758q2();
    }

    /* renamed from: m1 */
    public void m10764m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    public void onBackPressed() {
        if (m14896H1()) {
            return;
        }
        if (!this.f25048n0) {
            String str = (String) ((TakeAwayProductsViewModel) m22758I0()).m14857C0().mo172f();
            if ((str != null ? Integer.parseInt(str) : 0) > 0) {
                UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                String string = getString(C2336R.string.dialog_alert_title);
                Intrinsics.checkIfNull(string, "getString(R.string.dialog_alert_title)");
                String string2 = getString(C2336R.string.dialog_take_away_reset_alt);
                Intrinsics.checkIfNull(string2, "getString(R.string.dialog_take_away_reset_alt)");
                UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C9524b(), 12, null);
                return;
            }
        }
        super.onBackPressed();
    }

    protected void onResume() {
        if (!this.f25047m0) {
            ((TakeAwayProductsViewModel) m22758I0()).m14852H0();
        }
        this.f25047m0 = false;
        super.onResume();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_products;
    }
}
