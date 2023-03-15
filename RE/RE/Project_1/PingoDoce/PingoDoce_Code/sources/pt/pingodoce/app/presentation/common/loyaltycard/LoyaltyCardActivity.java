package pt.pingodoce.app.presentation.common.loyaltycard;

import ai.AbstractC0151j;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.constraintlayout.widget.C0868i;
import androidx.core.view.C1112b0;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import me.InterfaceC7186c;
import ne.EventObserver;
import p050d.C4519c;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p389ui.LoyaltyCardViewModel;
import p426wg.AbstractC11919o0;
import p426wg.AbstractC12028tb;
import p428wi.LoyaltyCardInvitesActivity;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13903t0;
import pe.C8618e;
import pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity;
import td.InterfaceC10524i0;

/* compiled from: LoyaltyCardActivity.kt */
/* loaded from: classes2.dex */
public final class LoyaltyCardActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23882f0;

    /* renamed from: g0 */
    private final AbstractC0304b f23883g0;

    /* compiled from: LoyaltyCardActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9063a {
        private C9063a() {
        }

        public /* synthetic */ C9063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LoyaltyCardActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity$b */
    /* loaded from: classes2.dex */
    static final class C9064b extends AbstractC6438m implements InterfaceC6097a {
        C9064b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(LoyaltyCardActivity.this.m12691m1(), LoyaltyCardActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9065c extends AbstractC6438m implements InterfaceC6108l {
        C9065c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12685a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            if (((InterfaceC7186c) c13182l.m1460c()) instanceof C13903t0) {
                LoyaltyCardInvitesActivity.m3528a(LoyaltyCardActivity.m12694j1(LoyaltyCardActivity.this), LoyaltyCardActivity.this);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12685a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity$resultLauncher$1$1", m20196f = "LoyaltyCardActivity.kt", m20195l = {C0868i.f2753D0}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.common.loyaltycard.LoyaltyCardActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9066d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23886x;

        C9066d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9066d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9066d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23886x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardViewModel m12693k1 = LoyaltyCardActivity.m12693k1(LoyaltyCardActivity.this);
                this.f23886x = 1;
                if (m12693k1.m6774R(this) == m34636d) {
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
        new C9063a(null);
    }

    public LoyaltyCardActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: ui.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LoyaltyCardActivity.m12688o1(LoyaltyCardActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…}\n            }\n        }");
        this.f23883g0 = m41364M;
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12695i1(LoyaltyCardActivity loyaltyCardActivity, ActivityResult activityResult) {
        m12688o1(loyaltyCardActivity, activityResult);
    }

    /* renamed from: j1 */
    public static final /* synthetic */ AbstractC0304b m12694j1(LoyaltyCardActivity loyaltyCardActivity) {
        return loyaltyCardActivity.f23883g0;
    }

    /* renamed from: k1 */
    public static final /* synthetic */ LoyaltyCardViewModel m12693k1(LoyaltyCardActivity loyaltyCardActivity) {
        return (LoyaltyCardViewModel) loyaltyCardActivity.m22758I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m12688o1(LoyaltyCardActivity loyaltyCardActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(loyaltyCardActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            C6772d.m20158d(LifecycleOwner.m36965a(loyaltyCardActivity), null, null, new C9066d(null), 3, null);
        }
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12698J0() {
        return C6450z.m20906b(LoyaltyCardViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12697K0() {
        return new C9064b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: m1 */
    public final ViewModelFactoryByInjection m12691m1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23882f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: n */
    public boolean m12690n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n1 */
    public void m12696P0(AbstractC11919o0 abstractC11919o0, LoyaltyCardViewModel loyaltyCardViewModel) {
        Intrinsics.isThisObjectNull(abstractC11919o0, "binding");
        Intrinsics.isThisObjectNull(loyaltyCardViewModel, "viewModel");
        AbstractC12028tb abstractC12028tb = abstractC11919o0.f31084z;
        C1112b0.m38465J0(abstractC12028tb.f31549z, "TRANSITION_VIEW");
        C1112b0.m38465J0(abstractC12028tb.f31538A, "TRANSITION_EAN_AREA");
        C1112b0.m38465J0(abstractC12028tb.f31547x, "TRANSITION_BARCODE");
        C1112b0.m38465J0(abstractC12028tb.f31540C, "TRANSITION_NUMBER");
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9065c()));
        C5579c.m23718a(this);
        m145b1().mo41749a(AbstractC0151j.C0154c.f334a);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_card;
    }
}
