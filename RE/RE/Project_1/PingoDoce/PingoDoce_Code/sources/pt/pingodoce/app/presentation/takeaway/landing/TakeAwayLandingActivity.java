package pt.pingodoce.app.presentation.takeaway.landing;

import am.TakeAwayProductsActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.recyclerpickerdialog.EnumC2361b;
import com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import dm.TakeAwayWalkThroughActivity;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import ni.BottomNavigationActivity;
import p050d.C4519c;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p351s5.RecyclerPickerDialogFragment;
import p409vl.TakeAwayOrderListActivity;
import p426wg.AbstractC12130z3;
import p431wl.TakeAwayStoreActivity;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.AbstractC13816c;
import p494zh.C13879n2;
import p494zh.C13889p2;
import p494zh.C13893q2;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingActivity;

/* compiled from: TakeAwayLandingActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayLandingActivity extends BottomNavigationActivity {

    /* renamed from: h0 */
    public ViewModelFactoryByInjection f24953h0;

    /* renamed from: i0 */
    private final AbstractC0304b f24954i0;

    /* compiled from: TakeAwayLandingActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingActivity$a */
    /* loaded from: classes2.dex */
    static final class C9494a extends AbstractC6438m implements InterfaceC6097a {
        C9494a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TakeAwayLandingActivity.this.m10950w1(), TakeAwayLandingActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayLandingActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9495b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ TakeAwayLandingViewModel f24956w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9495b(TakeAwayLandingViewModel takeAwayLandingViewModel) {
            super(1);
            this.f24956w = takeAwayLandingViewModel;
        }

        /* renamed from: a */
        public final void m10944a(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            if (!list.isEmpty()) {
                this.f24956w.m10913d1(((RecyclerPickerDialogFragment) list.get(0)).m9276b());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10944a((List) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayLandingActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.landing.TakeAwayLandingActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9496c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ TakeAwayLandingViewModel f24957w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9496c(TakeAwayLandingViewModel takeAwayLandingViewModel) {
            super(1);
            this.f24957w = takeAwayLandingViewModel;
        }

        /* renamed from: a */
        public final void m10943a(List list) {
            Intrinsics.isThisObjectNull(list, "it");
            if (!list.isEmpty()) {
                this.f24957w.m10912e1(((RecyclerPickerDialogFragment) list.get(0)).m9276b());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10943a((List) obj);
            return C13195u.f34156a;
        }
    }

    public TakeAwayLandingActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: ql.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                TakeAwayLandingActivity.m10965C1(TakeAwayLandingActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…ore(it) }\n        }\n    }");
        this.f24954i0 = m41364M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m10967A1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayLandingActivity takeAwayLandingActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$dateSelectDialogFragment");
        Intrinsics.isThisObjectNull(takeAwayLandingActivity, "this$0");
        if (recyclerPickerDialogFragment.m37573n0()) {
            return;
        }
        recyclerPickerDialogFragment.mo3126x2(takeAwayLandingActivity.m37323P(), "dateFrag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m10966B1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayLandingActivity takeAwayLandingActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$hourSelectDialogFragment");
        Intrinsics.isThisObjectNull(takeAwayLandingActivity, "this$0");
        if (recyclerPickerDialogFragment.m37573n0()) {
            return;
        }
        recyclerPickerDialogFragment.mo3126x2(takeAwayLandingActivity.m37323P(), "hourFrag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m10965C1(TakeAwayLandingActivity takeAwayLandingActivity, ActivityResult activityResult) {
        Intent m41352a;
        Bundle extras;
        Store store;
        Intrinsics.isThisObjectNull(takeAwayLandingActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (extras = m41352a.getExtras()) == null || (store = (Store) extras.getParcelable("EXTRA_FOR_STORE")) == null) {
            return;
        }
        ((TakeAwayLandingViewModel) takeAwayLandingActivity.m22758I0()).m10909h1(store);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m10957r1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayLandingActivity takeAwayLandingActivity, Boolean bool) {
        m10966B1(recyclerPickerDialogFragment, takeAwayLandingActivity, bool);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m10955s1(TakeAwayLandingActivity takeAwayLandingActivity, ActivityResult activityResult) {
        m10965C1(takeAwayLandingActivity, activityResult);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m10954t1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, TakeAwayLandingActivity takeAwayLandingActivity, Boolean bool) {
        m10967A1(recyclerPickerDialogFragment, takeAwayLandingActivity, bool);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m10953u1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        m10946z1(recyclerPickerDialogFragment, arrayList);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m10952v1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        m10947y1(recyclerPickerDialogFragment, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m10947y1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$dateSelectDialogFragment");
        Intrinsics.checkIfNull(arrayList, "it");
        recyclerPickerDialogFragment.m33827J2(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m10946z1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment recyclerPickerDialogFragment, ArrayList arrayList) {
        Intrinsics.isThisObjectNull(recyclerPickerDialogFragment, "$hourSelectDialogFragment");
        Intrinsics.checkIfNull(arrayList, "it");
        recyclerPickerDialogFragment.m33827J2(arrayList);
    }

    /* renamed from: G0 */
    protected int m10964G0() {
        return C2336R.string.lbl_take_away;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10963J0() {
        return C6450z.m20906b(TakeAwayLandingViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10962K0() {
        return new C9494a();
    }

    /* renamed from: S0 */
    protected boolean m10960S0() {
        return false;
    }

    /* renamed from: k1 */
    protected void m10959k1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13893q2.f35014a)) {
            TakeAwayStoreActivity.m3410a(this.f24954i0, this);
        } else if (Intrinsics.equals(abstractC13816c, C13879n2.f34994a)) {
            TakeAwayProductsActivity.m41515a(this, (TakeAwayFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13889p2.f35010a)) {
            TakeAwayOrderListActivity.m5240a(this);
        }
    }

    protected void onResume() {
        super.onResume();
        ((TakeAwayLandingViewModel) m22758I0()).m14843w0();
        ((TakeAwayLandingViewModel) m22758I0()).m10915Z1();
    }

    /* renamed from: s */
    public BottomNavigationView mo17603s() {
        BottomNavigationView bottomNavigationView = ((AbstractC12130z3) m22738w0()).f32032y.f30312x;
        Intrinsics.checkIfNull(bottomNavigationView, "binding.bottomNavigation….viewBottomNavigationView");
        return bottomNavigationView;
    }

    /* renamed from: w */
    public int mo17602w() {
        return C2336R.C2338id.navigation_takeaway;
    }

    /* renamed from: w1 */
    public final ViewModelFactoryByInjection m10950w1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24953h0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_landing;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x1 */
    public void m10958o1(AbstractC12130z3 abstractC12130z3, TakeAwayLandingViewModel takeAwayLandingViewModel) {
        Intrinsics.isThisObjectNull(abstractC12130z3, "binding");
        Intrinsics.isThisObjectNull(takeAwayLandingViewModel, "viewModel");
        super.m17611o1(abstractC12130z3, takeAwayLandingViewModel);
        abstractC12130z3.mo3575R(m17612n1());
        abstractC12130z3.mo3576Q(new DecelerateInterpolator(2.0f));
        RecyclerPickerDialogFragment.C2356a c2356a = com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.f6857c1;
        EnumC2361b enumC2361b = EnumC2361b.RADIO_BUTTON;
        final com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment m33815b = RecyclerPickerDialogFragment.C2356a.m33815b(c2356a, null, enumC2361b, 2131951743, new C9495b(takeAwayLandingViewModel), 1, null);
        String string = getString(C2336R.string.lbl_takeaway_date);
        Intrinsics.checkIfNull(string, "this@TakeAwayLandingActi…string.lbl_takeaway_date)");
        m33815b.m33823N2(string);
        String string2 = getString(C2336R.string.btn_choose);
        Intrinsics.checkIfNull(string2, "this@TakeAwayLandingActi…ring(R.string.btn_choose)");
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
        final com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment m33815b2 = RecyclerPickerDialogFragment.C2356a.m33815b(c2356a, null, enumC2361b, 2131951743, new C9496c(takeAwayLandingViewModel), 1, null);
        String string3 = getString(C2336R.string.lbl_takeaway_hour);
        Intrinsics.checkIfNull(string3, "this@TakeAwayLandingActi…string.lbl_takeaway_hour)");
        m33815b2.m33823N2(string3);
        String string4 = getString(C2336R.string.btn_choose);
        Intrinsics.checkIfNull(string4, "this@TakeAwayLandingActi…ring(R.string.btn_choose)");
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
        float dimensionPixelSize4 = dimensionPixelSize3 - (identifier4 > 0 ? getResources().getDimensionPixelSize(identifier4) : 0);
        TypedValue typedValue2 = new TypedValue();
        getTheme().resolveAttribute(16843499, typedValue2, true);
        m33815b2.m33826K2(((int) (dimensionPixelSize4 - typedValue2.getDimension(new DisplayMetrics()))) / 2);
        m33815b2.m33825L2(true);
        takeAwayLandingViewModel.m16437R0().mo171i(this, new InterfaceC1440f0() { // from class: ql.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingActivity.m10947y1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, (ArrayList) obj);
            }
        });
        takeAwayLandingViewModel.m16436S0().mo171i(this, new InterfaceC1440f0() { // from class: ql.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingActivity.m10946z1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, (ArrayList) obj);
            }
        });
        takeAwayLandingViewModel.m16434U0().mo171i(this, new InterfaceC1440f0() { // from class: ql.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingActivity.m10967A1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, this, (Boolean) obj);
            }
        });
        takeAwayLandingViewModel.m16433V0().mo171i(this, new InterfaceC1440f0() { // from class: ql.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayLandingActivity.m10966B1(com.github.guilhe.recyclerpickerdialog.RecyclerPickerDialogFragment.this, this, (Boolean) obj);
            }
        });
        if (takeAwayLandingViewModel.m10920U1()) {
            TakeAwayWalkThroughActivity.m26337a(this);
        }
    }
}
