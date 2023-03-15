package pt.pingodoce.app.presentation.common.search;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazy;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.recyclerview.widget.RecyclerView;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.C3509b;
import com.google.android.material.bottomsheet.DialogC3502a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.InterfaceC4768a;
import ee.CustomDividerItemDecoration;
import fj.FiltersViewModel;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import ke.ViewModelFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p106fe.CommonUtils;
import p123gj.BrandsFilterAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p384uc.InterfaceC10866b;
import p426wg.AbstractC12022t5;
import p468yc.C13190q;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;
import p489zc.Iterables;
import pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment;
import pt.pingodoce.app.presentation.common.search.models.Criteria;
import vc.C11203a;

/* compiled from: FiltersBottomSheetFragment.kt */
/* loaded from: classes2.dex */
public final class FiltersBottomSheetFragment extends C3509b implements InterfaceC10866b, InterfaceC1485s {

    /* renamed from: V0 */
    public static final C9100a f23968V0 = new C9100a(null);

    /* renamed from: N0 */
    private final InterfaceC6112p f23969N0;

    /* renamed from: O0 */
    private final InterfaceC6108l f23970O0;

    /* renamed from: P0 */
    public DispatchingAndroidInjector f23971P0;

    /* renamed from: Q0 */
    public fj.FiltersBottomSheetFragment f23972Q0;

    /* renamed from: R0 */
    private final InterfaceC13178g f23973R0;

    /* renamed from: S0 */
    private final InterfaceC13178g f23974S0;

    /* renamed from: T0 */
    private AbstractC12022t5 f23975T0;

    /* renamed from: U0 */
    private InterfaceC1491v f23976U0;

    /* compiled from: FiltersBottomSheetFragment.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment$a */
    /* loaded from: classes2.dex */
    public static final class C9100a {
        private C9100a() {
        }

        public /* synthetic */ C9100a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final FiltersBottomSheetFragment m12511a(InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(interfaceC6112p, "onApplyFilter");
            Intrinsics.isThisObjectNull(interfaceC6108l, "shouldBeVisible");
            return new FiltersBottomSheetFragment(interfaceC6112p, interfaceC6108l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FiltersBottomSheetFragment.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment$b */
    /* loaded from: classes2.dex */
    public static final class C9101b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C9101b f23977w = new C9101b();

        C9101b() {
            super(0);
        }

        /* renamed from: a */
        public final BrandsFilterAdapter mo42214q() {
            return new BrandsFilterAdapter();
        }
    }

    /* compiled from: View.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment$c */
    /* loaded from: classes2.dex */
    public static final class RunnableC9102c implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f23978w;

        /* renamed from: x */
        final /* synthetic */ FiltersBottomSheetFragment f23979x;

        /* renamed from: y */
        final /* synthetic */ View f23980y;

        public RunnableC9102c(View view, FiltersBottomSheetFragment filtersBottomSheetFragment, View view2) {
            this.f23978w = view;
            this.f23979x = filtersBottomSheetFragment;
            this.f23980y = view2;
        }

        public final void run() {
            View view = this.f23978w;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 30) {
                Display display = this.f23979x.m37652G1().getDisplay();
                if (display != null) {
                    display.getRealMetrics(displayMetrics);
                }
            } else {
                this.f23979x.m37652G1().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            AbstractC12022t5 m12531K2 = FiltersBottomSheetFragment.m12531K2(this.f23979x);
            AbstractC12022t5 abstractC12022t5 = null;
            if (m12531K2 == null) {
                Intrinsics.throwUninitPropException("binding");
                m12531K2 = null;
            }
            ViewGroup.LayoutParams layoutParams = m12531K2.m37802s().getLayoutParams();
            layoutParams.height = displayMetrics.heightPixels;
            view.setLayoutParams(layoutParams);
            if (CommonUtils.f15361a.m24298d(this.f23980y)) {
                AbstractC12022t5 m12531K22 = FiltersBottomSheetFragment.m12531K2(this.f23979x);
                if (m12531K22 == null) {
                    Intrinsics.throwUninitPropException("binding");
                } else {
                    abstractC12022t5 = m12531K22;
                }
                abstractC12022t5.f31519A.setPadding(0, 0, 0, UtilsExtensions.m35167e(80));
            }
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment$d */
    /* loaded from: classes2.dex */
    public static final class C9103d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ Fragment f23981w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9103d(Fragment fragment) {
            super(0);
            this.f23981w = fragment;
        }

        /* renamed from: a */
        public final Fragment mo42214q() {
            return this.f23981w;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment$e */
    /* loaded from: classes2.dex */
    public static final class C9104e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f23982w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9104e(InterfaceC6097a interfaceC6097a) {
            super(0);
            this.f23982w = interfaceC6097a;
        }

        /* renamed from: a */
        public final C1486s0 mo42214q() {
            C1486s0 mo36970z = ((InterfaceC1488t0) this.f23982w.mo42214q()).mo36970z();
            Intrinsics.checkIfNull(mo36970z, "ownerProducer().viewModelStore");
            return mo36970z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FiltersBottomSheetFragment.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.search.FiltersBottomSheetFragment$f */
    /* loaded from: classes2.dex */
    public static final class C9105f extends AbstractC6438m implements InterfaceC6097a {
        C9105f() {
            super(0);
        }

        /* renamed from: a */
        public final C1479r0.InterfaceC1481b mo42214q() {
            return new ViewModelFactory(FiltersBottomSheetFragment.this.m12527O2(), FiltersBottomSheetFragment.this, null, 4, null);
        }
    }

    public FiltersBottomSheetFragment(InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l) {
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(interfaceC6112p, "onApplyFilter");
        Intrinsics.isThisObjectNull(interfaceC6108l, "shouldBeVisible");
        this.f23969N0 = interfaceC6112p;
        this.f23970O0 = interfaceC6108l;
        this.f23973R0 = FragmentViewModelLazy.m37123a(this, C6450z.m20906b(FiltersViewModel.class), new C9104e(new C9103d(this)), new C9105f());
        m1464a = LazyJVM.m1464a(C9101b.f23977w);
        this.f23974S0 = m1464a;
    }

    /* renamed from: C2 */
    public static /* synthetic */ void m12540C2(FiltersBottomSheetFragment filtersBottomSheetFragment, View view) {
        m12520V2(filtersBottomSheetFragment, view);
    }

    /* renamed from: D2 */
    public static /* synthetic */ void m12539D2(FiltersBottomSheetFragment filtersBottomSheetFragment, View view) {
        m12521U2(filtersBottomSheetFragment, view);
    }

    /* renamed from: E2 */
    public static /* synthetic */ void m12538E2(FiltersBottomSheetFragment filtersBottomSheetFragment, View view) {
        m12522T2(filtersBottomSheetFragment, view);
    }

    /* renamed from: F2 */
    public static /* synthetic */ void m12537F2(DialogC3502a dialogC3502a, DialogInterface dialogInterface) {
        m12523S2(dialogC3502a, dialogInterface);
    }

    /* renamed from: G2 */
    public static /* synthetic */ void m12536G2(FiltersBottomSheetFragment filtersBottomSheetFragment, List list) {
        m12526P2(filtersBottomSheetFragment, list);
    }

    /* renamed from: H2 */
    public static /* synthetic */ void m12534H2(FiltersBottomSheetFragment filtersBottomSheetFragment, CompoundButton compoundButton, boolean z) {
        m12519W2(filtersBottomSheetFragment, compoundButton, z);
    }

    /* renamed from: I2 */
    public static /* synthetic */ void m12533I2(FiltersBottomSheetFragment filtersBottomSheetFragment, List list) {
        m12524R2(filtersBottomSheetFragment, list);
    }

    /* renamed from: J2 */
    public static /* synthetic */ void m12532J2(FiltersBottomSheetFragment filtersBottomSheetFragment, Boolean bool) {
        m12525Q2(filtersBottomSheetFragment, bool);
    }

    /* renamed from: K2 */
    public static final /* synthetic */ AbstractC12022t5 m12531K2(FiltersBottomSheetFragment filtersBottomSheetFragment) {
        return filtersBottomSheetFragment.f23975T0;
    }

    /* renamed from: L2 */
    private final BrandsFilterAdapter m12530L2() {
        return (BrandsFilterAdapter) this.f23974S0.getValue();
    }

    /* renamed from: N2 */
    private final FiltersViewModel m12528N2() {
        return (FiltersViewModel) this.f23973R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m12526P2(FiltersBottomSheetFragment filtersBottomSheetFragment, List list) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        Intrinsics.checkIfNull(list, "criterias");
        filtersBottomSheetFragment.m12514a3(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m12525Q2(FiltersBottomSheetFragment filtersBottomSheetFragment, Boolean bool) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        Intrinsics.checkIfNull(bool, "allBrands");
        filtersBottomSheetFragment.m12516Y2(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m12524R2(FiltersBottomSheetFragment filtersBottomSheetFragment, List list) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        Intrinsics.checkIfNull(list, "brands");
        filtersBottomSheetFragment.m12515Z2(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m12523S2(DialogC3502a dialogC3502a, DialogInterface dialogInterface) {
        Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
        dialogC3502a.m30325k().m30402I0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T2 */
    public static final void m12522T2(FiltersBottomSheetFragment filtersBottomSheetFragment, View view) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        filtersBottomSheetFragment.mo30315j2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m12521U2(FiltersBottomSheetFragment filtersBottomSheetFragment, View view) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        FiltersViewModel m12528N2 = filtersBottomSheetFragment.m12528N2();
        AbstractC12022t5 abstractC12022t5 = filtersBottomSheetFragment.f23975T0;
        AbstractC12022t5 abstractC12022t52 = null;
        if (abstractC12022t5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t5 = null;
        }
        m12528N2.m23758r0(abstractC12022t5.f31522D.isChecked());
        List m23334H = filtersBottomSheetFragment.m12530L2().m23334H();
        if (Intrinsics.equals(filtersBottomSheetFragment.m12528N2().m23767i0().mo172f(), Boolean.TRUE)) {
            filtersBottomSheetFragment.m12528N2().m23757s0(m23334H);
        } else {
            filtersBottomSheetFragment.m12528N2().m23757s0((List) filtersBottomSheetFragment.m12528N2().m23768h0().m1449b());
        }
        FiltersViewModel m12528N22 = filtersBottomSheetFragment.m12528N2();
        AbstractC12022t5 abstractC12022t53 = filtersBottomSheetFragment.f23975T0;
        if (abstractC12022t53 == null) {
            Intrinsics.throwUninitPropException("binding");
        } else {
            abstractC12022t52 = abstractC12022t53;
        }
        m12528N22.m23759q0(abstractC12022t52.f31520B.getCheckedRadioButtonId());
        filtersBottomSheetFragment.f23970O0.mo9587d(Boolean.valueOf(!filtersBottomSheetFragment.m12528N2().m23760p0()));
        filtersBottomSheetFragment.f23969N0.mo39856d(filtersBottomSheetFragment.m12528N2().m23762n0(), filtersBottomSheetFragment.m12528N2().m23763m0());
        filtersBottomSheetFragment.mo30315j2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m12520V2(FiltersBottomSheetFragment filtersBottomSheetFragment, View view) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        C13190q m23768h0 = filtersBottomSheetFragment.m12528N2().m23768h0();
        filtersBottomSheetFragment.m12514a3((List) m23768h0.m1450a());
        filtersBottomSheetFragment.m12516Y2(false);
        filtersBottomSheetFragment.m12515Z2((List) m23768h0.m1449b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m12519W2(FiltersBottomSheetFragment filtersBottomSheetFragment, CompoundButton compoundButton, boolean z) {
        Intrinsics.isThisObjectNull(filtersBottomSheetFragment, "this$0");
        AbstractC12022t5 abstractC12022t5 = filtersBottomSheetFragment.f23975T0;
        if (abstractC12022t5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t5 = null;
        }
        abstractC12022t5.f31521C.setVisibility(z ? 0 : 8);
        if (z && Intrinsics.equals(filtersBottomSheetFragment.m12528N2().m23766j0().mo172f(), filtersBottomSheetFragment.m12528N2().m23768h0().m1449b())) {
            filtersBottomSheetFragment.m12515Z2(filtersBottomSheetFragment.m12528N2().m23765k0(true));
            return;
        }
        Object mo172f = filtersBottomSheetFragment.m12528N2().m23766j0().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        filtersBottomSheetFragment.m12515Z2((List) mo172f);
    }

    /* renamed from: Y2 */
    private final void m12516Y2(boolean z) {
        AbstractC12022t5 abstractC12022t5 = this.f23975T0;
        if (abstractC12022t5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t5 = null;
        }
        abstractC12022t5.f31522D.setChecked(z);
    }

    /* renamed from: Z2 */
    private final void m12515Z2(List list) {
        AbstractC12022t5 abstractC12022t5 = this.f23975T0;
        if (abstractC12022t5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t5 = null;
        }
        RecyclerView recyclerView = abstractC12022t5.f31521C;
        BrandsFilterAdapter m12530L2 = m12530L2();
        m12530L2.m22153F(list);
        recyclerView.setAdapter(m12530L2);
    }

    /* renamed from: a3 */
    private final void m12514a3(List list) {
        int m186r;
        AbstractC12022t5 abstractC12022t5 = this.f23975T0;
        if (abstractC12022t5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t5 = null;
        }
        abstractC12022t5.f31520B.removeAllViews();
        m186r = Iterables.m186r(list, 10);
        ArrayList arrayList = new ArrayList(m186r);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13780s.m187q();
            }
            Criteria criteria = (Criteria) obj;
            RadioButton radioButton = new RadioButton(m37650H1());
            radioButton.setId(i);
            radioButton.setLayoutDirection(1);
            radioButton.setTextAlignment(2);
            radioButton.setText(criteria.m12334c().m13856a());
            radioButton.setChecked(criteria.m12333d());
            AbstractC12022t5 abstractC12022t52 = this.f23975T0;
            if (abstractC12022t52 == null) {
                Intrinsics.throwUninitPropException("binding");
                abstractC12022t52 = null;
            }
            RadioGroup radioGroup = abstractC12022t52.f31520B;
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            layoutParams.setMargins(0, UtilsExtensions.m35167e(8), 0, UtilsExtensions.m35167e(8));
            C13195u c13195u = C13195u.f34156a;
            radioGroup.addView(radioButton, layoutParams);
            arrayList.add(c13195u);
            i = i2;
        }
    }

    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        C11203a.m5753b(this);
        C13195u c13195u = C13195u.f34156a;
        super.mo5750A0(context);
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.isThisObjectNull(layoutInflater, "inflater");
        AbstractC12022t5 m3771Q = AbstractC12022t5.m3771Q(layoutInflater, null, false);
        Intrinsics.checkIfNull(m3771Q, "it");
        this.f23975T0 = m3771Q;
        View m37802s = m3771Q.m37802s();
        Intrinsics.checkIfNull(m37802s, "inflate(inflater, null, …lso { binding = it }.root");
        return m37802s;
    }

    /* renamed from: M2 */
    public final DispatchingAndroidInjector m12529M2() {
        DispatchingAndroidInjector dispatchingAndroidInjector = this.f23971P0;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.throwUninitPropException("dispatchingAndroidInjector");
        return null;
    }

    /* renamed from: O2 */
    public final fj.FiltersBottomSheetFragment m12527O2() {
        fj.FiltersBottomSheetFragment filtersBottomSheetFragment = this.f23972Q0;
        if (filtersBottomSheetFragment != null) {
            return filtersBottomSheetFragment;
        }
        Intrinsics.throwUninitPropException("viewModelFactory");
        return null;
    }

    /* renamed from: X2 */
    public final void m12518X2(InterfaceC1491v interfaceC1491v) {
        AbstractC1469p mo137b;
        this.f23976U0 = interfaceC1491v;
        if (interfaceC1491v == null || (mo137b = interfaceC1491v.mo137b()) == null) {
            return;
        }
        mo137b.mo10402a(this);
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
        m12528N2().m23755u0();
    }

    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
        Intrinsics.isThisObjectNull(view, "view");
        super.mo37596c1(view, bundle);
        AbstractC12022t5 abstractC12022t5 = this.f23975T0;
        AbstractC12022t5 abstractC12022t52 = null;
        if (abstractC12022t5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t5 = null;
        }
        abstractC12022t5.mo3726S(m12528N2());
        AbstractC12022t5 abstractC12022t53 = this.f23975T0;
        if (abstractC12022t53 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t53 = null;
        }
        abstractC12022t53.mo3594K(m37582i0());
        AbstractC12022t5 abstractC12022t54 = this.f23975T0;
        if (abstractC12022t54 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t54 = null;
        }
        View m37802s = abstractC12022t54.m37802s();
        Intrinsics.checkIfNull(m37802s, "binding.root");
        Intrinsics.checkIfNull(ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(m37802s, new RunnableC9102c(m37802s, this, view)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        Dialog m37335m2 = m37335m2();
        Objects.requireNonNull(m37335m2, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final DialogC3502a dialogC3502a = (DialogC3502a) m37335m2;
        dialogC3502a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: fj.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                FiltersBottomSheetFragment.m12523S2(DialogC3502a.this, dialogInterface);
            }
        });
        AbstractC12022t5 abstractC12022t55 = this.f23975T0;
        if (abstractC12022t55 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t55 = null;
        }
        Toolbar toolbar = abstractC12022t55.f31524F;
        toolbar.setContentInsetStartWithNavigation(0);
        toolbar.setNavigationIcon(C2336R.C2337drawable.ic_close);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: fj.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FiltersBottomSheetFragment.m12522T2(FiltersBottomSheetFragment.this, view2);
            }
        });
        AbstractC12022t5 abstractC12022t56 = this.f23975T0;
        if (abstractC12022t56 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t56 = null;
        }
        RecyclerView recyclerView = abstractC12022t56.f31521C;
        Context m37650H1 = m37650H1();
        Intrinsics.checkIfNull(m37650H1, "requireContext()");
        recyclerView.m36657h(new CustomDividerItemDecoration(m37650H1, 16, 0, 0, 0, 28, null));
        AbstractC12022t5 abstractC12022t57 = this.f23975T0;
        if (abstractC12022t57 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t57 = null;
        }
        abstractC12022t57.f31527y.setOnClickListener(new View.OnClickListener() { // from class: fj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FiltersBottomSheetFragment.m12521U2(FiltersBottomSheetFragment.this, view2);
            }
        });
        AbstractC12022t5 abstractC12022t58 = this.f23975T0;
        if (abstractC12022t58 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC12022t58 = null;
        }
        abstractC12022t58.f31528z.setOnClickListener(new View.OnClickListener() { // from class: fj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FiltersBottomSheetFragment.m12520V2(FiltersBottomSheetFragment.this, view2);
            }
        });
        AbstractC12022t5 abstractC12022t59 = this.f23975T0;
        if (abstractC12022t59 == null) {
            Intrinsics.throwUninitPropException("binding");
        } else {
            abstractC12022t52 = abstractC12022t59;
        }
        abstractC12022t52.f31522D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: fj.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FiltersBottomSheetFragment.m12519W2(FiltersBottomSheetFragment.this, compoundButton, z);
            }
        });
        m12528N2().m23761o0().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: fj.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FiltersBottomSheetFragment.m12526P2(FiltersBottomSheetFragment.this, (List) obj);
            }
        });
        m12528N2().m23767i0().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: fj.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FiltersBottomSheetFragment.m12525Q2(FiltersBottomSheetFragment.this, (Boolean) obj);
            }
        });
        m12528N2().m23766j0().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: fj.h
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                FiltersBottomSheetFragment.m12524R2(FiltersBottomSheetFragment.this, (List) obj);
            }
        });
    }

    /* renamed from: j */
    public InterfaceC4768a mo5749j() {
        return m12529M2();
    }

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Intrinsics.isThisObjectNull(interfaceC1491v, "source");
        Intrinsics.isThisObjectNull(enumC1471b, "event");
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY && m37573n0()) {
            mo30314k2();
        }
    }
}
