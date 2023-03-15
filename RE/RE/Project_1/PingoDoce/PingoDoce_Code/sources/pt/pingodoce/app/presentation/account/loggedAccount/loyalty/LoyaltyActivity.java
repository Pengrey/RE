package pt.pingodoce.app.presentation.account.loggedAccount.loyalty;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6837t;
import me.InterfaceC7186c;
import ne.EventObserver;
import p067dh.AssociationsActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p426wg.AbstractC11880m0;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13898s;
import p494zh.C13902t;
import p496zj.CardRegistrationLandingActivity;
import pe.C8617d;
import pt.pingodoce.app.data.remote.models.response.BenefitsExpirationColors;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import td.InterfaceC10524i0;

/* compiled from: LoyaltyActivity.kt */
/* loaded from: classes2.dex */
public final class LoyaltyActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23360f0;

    /* compiled from: LoyaltyActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$a */
    /* loaded from: classes2.dex */
    public static final class C8825a {
        private C8825a() {
        }

        public /* synthetic */ C8825a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LoyaltyActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$b */
    /* loaded from: classes2.dex */
    static final class C8826b extends AbstractC6438m implements InterfaceC6097a {
        C8826b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13546j1 = LoyaltyActivity.this.m13546j1();
            LoyaltyActivity loyaltyActivity = LoyaltyActivity.this;
            Intent intent = loyaltyActivity.getIntent();
            return m13546j1.m20377b(loyaltyActivity, intent != null ? intent.getExtras() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8827c extends AbstractC6438m implements InterfaceC6108l {
        C8827c() {
            super(1);
        }

        /* renamed from: a */
        public final void m13541a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "pair");
            LoyaltyActivity.this.m13547i1(c13182l);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13541a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$initViews$2", m20196f = "LoyaltyActivity.kt", m20195l = {58}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$d */
    /* loaded from: classes2.dex */
    public static final class C8828d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23363x;

        /* renamed from: y */
        final /* synthetic */ LoyaltyViewModel f23364y;

        /* renamed from: z */
        final /* synthetic */ LoyaltyActivity f23365z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoyaltyActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$initViews$2$1", m20196f = "LoyaltyActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.loyalty.LoyaltyActivity$d$a */
        /* loaded from: classes2.dex */
        public static final class C8829a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f23366x;

            /* renamed from: y */
            final /* synthetic */ LoyaltyActivity f23367y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8829a(LoyaltyActivity loyaltyActivity, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f23367y = loyaltyActivity;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C8829a(this.f23367y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(C13195u c13195u, InterfaceC1886d interfaceC1886d) {
                return ((C8829a) create(c13195u, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                C2116d.m34636d();
                if (this.f23366x == 0) {
                    C13186n.m1453b(obj);
                    this.f23367y.finish();
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8828d(LoyaltyViewModel loyaltyViewModel, LoyaltyActivity loyaltyActivity, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23364y = loyaltyViewModel;
            this.f23365z = loyaltyActivity;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8828d(this.f23364y, this.f23365z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8828d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23363x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6837t m13520i0 = this.f23364y.m13520i0();
                C8829a c8829a = new C8829a(this.f23365z, null);
                this.f23363x = 1;
                if (C6788e.m20144d(m13520i0, c8829a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    static {
        new C8825a(null);
    }

    /* renamed from: E0 */
    protected Integer m13553E0() {
        return Integer.valueOf((int) C2336R.C2338id.toolbar);
    }

    /* renamed from: G0 */
    protected int m13552G0() {
        return C2336R.string.lbl_account_loyalty;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13551J0() {
        return C6450z.m20906b(LoyaltyViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13550K0() {
        return new C8826b();
    }

    /* renamed from: S0 */
    protected boolean m13548S0() {
        return true;
    }

    /* renamed from: i1 */
    public final void m13547i1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
        if (interfaceC7186c instanceof C13898s) {
            AssociationsActivity.m26462a(this);
        } else if (interfaceC7186c instanceof C13902t) {
            CardRegistrationLandingActivity.m59b(this);
        }
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m13546j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23360f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"DirectColorInSource"})
    /* renamed from: k1 */
    public void m13549P0(AbstractC11880m0 abstractC11880m0, LoyaltyViewModel loyaltyViewModel) {
        BenefitsExpirationColors m13792y;
        Intrinsics.isThisObjectNull(abstractC11880m0, "binding");
        Intrinsics.isThisObjectNull(loyaltyViewModel, "viewModel");
        abstractC11880m0.mo3982Q(loyaltyViewModel);
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_PUSH_NOTIFICATION")) {
            z = false;
        }
        if (z) {
            loyaltyViewModel.m13522g0();
        }
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8827c()));
        C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C8828d(loyaltyViewModel, this, null), 3, null);
        LoyaltyCard loyaltyCard = (LoyaltyCard) loyaltyViewModel.m13521h0().mo172f();
        if (loyaltyCard == null || (m13792y = loyaltyCard.m13792y()) == null) {
            return;
        }
        abstractC11880m0.f30907z.f30457y.setTextColor(Color.parseColor(m13792y.m13917b()));
        abstractC11880m0.f30907z.f30457y.setBackgroundColor(Color.parseColor(m13792y.m13918a()));
    }

    /* renamed from: n */
    public boolean m13544n() {
        return true;
    }

    public void onBackPressed() {
        ((LoyaltyViewModel) m22758I0()).m13519j0();
        super.onBackPressed();
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty;
    }
}
