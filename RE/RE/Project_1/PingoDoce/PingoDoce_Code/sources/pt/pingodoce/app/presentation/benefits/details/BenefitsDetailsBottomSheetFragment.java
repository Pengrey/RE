package pt.pingodoce.app.presentation.benefits.details;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0325c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazy;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1488t0;
import androidx.lifecycle.InterfaceC1491v;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.C3509b;
import com.google.android.material.bottomsheet.DialogC3502a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.InterfaceC4768a;
import fi.BenefitsDetailsViewModel;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Objects;
import ke.ViewModelFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.InterfaceC7186c;
import ne.EventObserver;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p384uc.InterfaceC10866b;
import p389ui.LoyaltyCardActivity;
import p426wg.AbstractC11868l5;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p494zh.C13899s0;
import pt.pingodoce.app.data.remote.models.response.Benefit;
import pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment;
import vc.C11203a;

/* compiled from: BenefitsDetailsBottomSheetFragment.kt */
/* loaded from: classes2.dex */
public final class BenefitsDetailsBottomSheetFragment extends C3509b implements InterfaceC10866b, InterfaceC1485s {

    /* renamed from: R0 */
    public static final C8957a f23657R0 = new C8957a(null);

    /* renamed from: N0 */
    public fi.BenefitsDetailsBottomSheetFragment f23658N0;

    /* renamed from: O0 */
    private final InterfaceC13178g f23659O0 = FragmentViewModelLazy.m37123a(this, C6450z.m20906b(BenefitsDetailsViewModel.class), new C8961e(new C8960d(this)), new C8962f());

    /* renamed from: P0 */
    private AbstractC11868l5 f23660P0;

    /* renamed from: Q0 */
    public DispatchingAndroidInjector f23661Q0;

    /* compiled from: BenefitsDetailsBottomSheetFragment.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment$a */
    /* loaded from: classes2.dex */
    public static final class C8957a {
        private C8957a() {
        }

        public /* synthetic */ C8957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BenefitsDetailsBottomSheetFragment m12992a(Benefit benefit) {
            Intrinsics.isThisObjectNull(benefit, "benefit");
            BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment = new BenefitsDetailsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_BENEFIT", benefit);
            benefitsDetailsBottomSheetFragment.m37630P1(bundle);
            return benefitsDetailsBottomSheetFragment;
        }
    }

    /* compiled from: View.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment$b */
    /* loaded from: classes2.dex */
    public static final class RunnableC8958b implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f23662w;

        /* renamed from: x */
        final /* synthetic */ BenefitsDetailsBottomSheetFragment f23663x;

        public RunnableC8958b(View view, BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment) {
            this.f23662w = view;
            this.f23663x = benefitsDetailsBottomSheetFragment;
        }

        public final void run() {
            View view = this.f23662w;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 30) {
                Display display = this.f23663x.m37652G1().getDisplay();
                if (display != null) {
                    display.getRealMetrics(displayMetrics);
                }
            } else {
                this.f23663x.m37652G1().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            AbstractC11868l5 m13003F2 = BenefitsDetailsBottomSheetFragment.m13003F2(this.f23663x);
            if (m13003F2 == null) {
                Intrinsics.throwUninitPropException("binding");
                m13003F2 = null;
            }
            ViewGroup.LayoutParams layoutParams = m13003F2.m37802s().getLayoutParams();
            layoutParams.height = displayMetrics.heightPixels;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsDetailsBottomSheetFragment.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment$c */
    /* loaded from: classes2.dex */
    public static final class C8959c extends AbstractC6438m implements InterfaceC6108l {
        C8959c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12991a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            if (((InterfaceC7186c) c13182l.m1460c()) instanceof C13899s0) {
                LoyaltyCardActivity.m6782d(BenefitsDetailsBottomSheetFragment.this, null, 1, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12991a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment$d */
    /* loaded from: classes2.dex */
    public static final class C8960d extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ Fragment f23665w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8960d(Fragment fragment) {
            super(0);
            this.f23665w = fragment;
        }

        /* renamed from: a */
        public final Fragment mo42214q() {
            return this.f23665w;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment$e */
    /* loaded from: classes2.dex */
    public static final class C8961e extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f23666w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8961e(InterfaceC6097a interfaceC6097a) {
            super(0);
            this.f23666w = interfaceC6097a;
        }

        /* renamed from: a */
        public final C1486s0 mo42214q() {
            C1486s0 mo36970z = ((InterfaceC1488t0) this.f23666w.mo42214q()).mo36970z();
            Intrinsics.checkIfNull(mo36970z, "ownerProducer().viewModelStore");
            return mo36970z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsDetailsBottomSheetFragment.kt */
    /* renamed from: pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsBottomSheetFragment$f */
    /* loaded from: classes2.dex */
    public static final class C8962f extends AbstractC6438m implements InterfaceC6097a {
        C8962f() {
            super(0);
        }

        /* renamed from: a */
        public final C1479r0.InterfaceC1481b mo42214q() {
            return new ViewModelFactory(BenefitsDetailsBottomSheetFragment.this.m12999I2(), BenefitsDetailsBottomSheetFragment.this, null, 4, null);
        }
    }

    /* renamed from: C2 */
    public static /* synthetic */ void m13006C2(DialogC3502a dialogC3502a, DialogInterface dialogInterface) {
        m12997K2(dialogC3502a, dialogInterface);
    }

    /* renamed from: D2 */
    public static /* synthetic */ void m13005D2(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment, Bitmap bitmap) {
        m12995M2(benefitsDetailsBottomSheetFragment, bitmap);
    }

    /* renamed from: E2 */
    public static /* synthetic */ void m13004E2(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment, View view) {
        m12998J2(benefitsDetailsBottomSheetFragment, view);
    }

    /* renamed from: F2 */
    public static final /* synthetic */ AbstractC11868l5 m13003F2(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment) {
        return benefitsDetailsBottomSheetFragment.f23660P0;
    }

    /* renamed from: H2 */
    private final BenefitsDetailsViewModel m13000H2() {
        return (BenefitsDetailsViewModel) this.f23659O0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m12998J2(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment, View view) {
        Intrinsics.isThisObjectNull(benefitsDetailsBottomSheetFragment, "this$0");
        benefitsDetailsBottomSheetFragment.mo30315j2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m12997K2(DialogC3502a dialogC3502a, DialogInterface dialogInterface) {
        Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
        dialogC3502a.m30325k().m30402I0(3);
    }

    /* renamed from: L2 */
    private final void m12996L2() {
        m13000H2().m23786U().mo171i(m37582i0(), new InterfaceC1440f0() { // from class: fi.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BenefitsDetailsBottomSheetFragment.m12995M2(BenefitsDetailsBottomSheetFragment.this, (Bitmap) obj);
            }
        });
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8959c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m12995M2(BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment, Bitmap bitmap) {
        Intrinsics.isThisObjectNull(benefitsDetailsBottomSheetFragment, "this$0");
        AbstractC11868l5 abstractC11868l5 = benefitsDetailsBottomSheetFragment.f23660P0;
        if (abstractC11868l5 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC11868l5 = null;
        }
        abstractC11868l5.f30860y.setImageBitmap(bitmap);
    }

    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        C11203a.m5753b(this);
        C13195u c13195u = C13195u.f34156a;
        super.mo5750A0(context);
    }

    /* renamed from: G2 */
    public final DispatchingAndroidInjector m13002G2() {
        DispatchingAndroidInjector dispatchingAndroidInjector = this.f23661Q0;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.throwUninitPropException("dispatchingAndroidInjector");
        return null;
    }

    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.isThisObjectNull(layoutInflater, "inflater");
        AbstractC11868l5 m4052Q = AbstractC11868l5.m4052Q(layoutInflater, null, false);
        Intrinsics.checkIfNull(m4052Q, "it");
        this.f23660P0 = m4052Q;
        View m37802s = m4052Q.m37802s();
        Intrinsics.checkIfNull(m37802s, "inflate(inflater, null, …lso { binding = it }.root");
        return m37802s;
    }

    /* renamed from: I2 */
    public final fi.BenefitsDetailsBottomSheetFragment m12999I2() {
        fi.BenefitsDetailsBottomSheetFragment benefitsDetailsBottomSheetFragment = this.f23658N0;
        if (benefitsDetailsBottomSheetFragment != null) {
            return benefitsDetailsBottomSheetFragment;
        }
        Intrinsics.throwUninitPropException("viewModelFactory");
        return null;
    }

    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
        Intrinsics.isThisObjectNull(view, "view");
        super.mo37596c1(view, bundle);
        ActivityC1354d m37547y = m37547y();
        Objects.requireNonNull(m37547y, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C5579c.m23718a((ActivityC0325c) m37547y);
        Bundle m37660E = m37660E();
        AbstractC11868l5 abstractC11868l5 = null;
        Benefit benefit = m37660E != null ? (Benefit) m37660E.getParcelable("EXTRA_BENEFIT") : null;
        if (!(benefit instanceof Benefit)) {
            benefit = null;
        }
        AbstractC11868l5 abstractC11868l52 = this.f23660P0;
        if (abstractC11868l52 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC11868l52 = null;
        }
        abstractC11868l52.mo4013S(benefit);
        AbstractC11868l5 abstractC11868l53 = this.f23660P0;
        if (abstractC11868l53 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC11868l53 = null;
        }
        abstractC11868l53.mo4012T(m13000H2());
        AbstractC11868l5 abstractC11868l54 = this.f23660P0;
        if (abstractC11868l54 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC11868l54 = null;
        }
        abstractC11868l54.f30854E.setText(Html.fromHtml(benefit != null ? benefit.m13930k() : null, 0));
        AbstractC11868l5 abstractC11868l55 = this.f23660P0;
        if (abstractC11868l55 == null) {
            Intrinsics.throwUninitPropException("binding");
            abstractC11868l55 = null;
        }
        Toolbar toolbar = abstractC11868l55.f30850A.f31075x;
        toolbar.setNavigationIcon(C2336R.C2337drawable.ic_close);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: fi.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BenefitsDetailsBottomSheetFragment.m12998J2(BenefitsDetailsBottomSheetFragment.this, view2);
            }
        });
        AbstractC11868l5 abstractC11868l56 = this.f23660P0;
        if (abstractC11868l56 == null) {
            Intrinsics.throwUninitPropException("binding");
        } else {
            abstractC11868l5 = abstractC11868l56;
        }
        View m37802s = abstractC11868l5.m37802s();
        Intrinsics.checkIfNull(m37802s, "binding.root");
        Intrinsics.checkIfNull(ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(m37802s, new RunnableC8958b(m37802s, this)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        Dialog m37335m2 = m37335m2();
        Objects.requireNonNull(m37335m2, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        final DialogC3502a dialogC3502a = (DialogC3502a) m37335m2;
        dialogC3502a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: fi.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BenefitsDetailsBottomSheetFragment.m12997K2(DialogC3502a.this, dialogInterface);
            }
        });
        m13000H2().m23784W(benefit);
        m12996L2();
    }

    /* renamed from: j */
    public InterfaceC4768a mo5749j() {
        return m13002G2();
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
