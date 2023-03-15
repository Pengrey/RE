package pt.pingodoce.app.presentation.login.pin.insert;

import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2142f;
import ci.C2146h;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import p014aj.PinActivity;
import p034bl.OnboardingResumeActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p314qd.InterfaceC9717b;
import p321qk.PinRecoverActivity;
import p390uj.HomeActivity;
import p408vk.OnboardingEmailSentActivity;
import p426wg.AbstractC11865l2;
import p453xk.OnboardingMyPdActivity;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13852j1;
import p494zh.C13869l0;
import p494zh.C13870l1;
import p494zh.C13878n1;
import p494zh.C13918x;
import p494zh.C13924y1;
import p494zh.C13928z1;
import p497zk.OnboardingNotificationActivity;
import pe.C8618e;
import pk.InsertPinViewModel;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.local.flows.RecoverPinFlowData;
import td.InterfaceC10524i0;
import tk.SmsValidationActivity;

/* compiled from: InsertPinActivity.kt */
/* loaded from: classes2.dex */
public final class InsertPinActivity extends PinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f24493j0;

    /* compiled from: InsertPinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9310a {
        private C9310a() {
        }

        public /* synthetic */ C9310a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: InsertPinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9311b implements UiWidgets.InterfaceC7044a {

        /* compiled from: InsertPinActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity$consumeNavigationEvent$1$onResponse$1", m20196f = "InsertPinActivity.kt", m20195l = {79}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity$b$a */
        /* loaded from: classes2.dex */
        static final class C9312a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24495x;

            /* renamed from: y */
            final /* synthetic */ InsertPinActivity f24496y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9312a(InsertPinActivity insertPinActivity, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24496y = insertPinActivity;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9312a(this.f24496y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9312a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24495x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InsertPinActivity.m11752J1(this.f24496y).m14923c1();
                    InsertPinViewModel m11752J1 = InsertPinActivity.m11752J1(this.f24496y);
                    this.f24495x = 1;
                    if (m11752J1.m14924b1(this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                PinRecoverActivity.m10009a(this.f24496y, new RecoverPinFlowData(InsertPinActivity.m11752J1(this.f24496y).m41608x0().m14693c(), InsertPinActivity.m11752J1(this.f24496y).m41608x0().m14694b()));
                return C13195u.f34156a;
            }
        }

        C9311b() {
        }

        /* renamed from: a */
        public void m11742a(boolean z) {
            if (z) {
                C6772d.m20158d(LifecycleOwner.m36965a(InsertPinActivity.this), null, null, new C9312a(InsertPinActivity.this, null), 3, null);
            }
        }
    }

    /* compiled from: InsertPinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.insert.InsertPinActivity$c */
    /* loaded from: classes2.dex */
    static final class C9313c extends AbstractC6438m implements InterfaceC6097a {
        C9313c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11749L1 = InsertPinActivity.this.m11749L1();
            InsertPinActivity insertPinActivity = InsertPinActivity.this;
            return m11749L1.m20377b(insertPinActivity, insertPinActivity.getIntent().getExtras());
        }
    }

    static {
        new C9310a(null);
    }

    /* renamed from: J1 */
    public static final /* synthetic */ InsertPinViewModel m11752J1(InsertPinActivity insertPinActivity) {
        return (InsertPinViewModel) insertPinActivity.m22758I0();
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: H1 */
    protected void m11754H1() {
        ((InsertPinViewModel) m22758I0()).m41620l0(true);
        ((InsertPinViewModel) m22758I0()).m41626f0();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11753J0() {
        return C6450z.m20906b(InsertPinViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11751K0() {
        return new C9313c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: L1 */
    public final ViewModelFactoryByInjection m11749L1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24493j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: M1 */
    public void m11744n1(AbstractC11865l2 abstractC11865l2, InsertPinViewModel insertPinViewModel) {
        Intrinsics.isThisObjectNull(abstractC11865l2, "binding");
        Intrinsics.isThisObjectNull(insertPinViewModel, "viewModel");
        super.m41683C1(abstractC11865l2, insertPinViewModel);
        if (getIntent().getBooleanExtra("EXTRA_FOR_RESULT", false)) {
            insertPinViewModel.m14916i1(true);
        }
    }

    /* renamed from: k1 */
    protected List m11746k1() {
        List m194j;
        m194j = C13780s.m194j(C2142f.f6177a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11745m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13928z1.f35049a)) {
            SmsValidationActivity.m7450b(this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13924y1.f35045a)) {
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            String string = getString(C2336R.string.dialog_logout_title);
            Intrinsics.checkIfNull(string, "getString(R.string.dialog_logout_title)");
            String string2 = getString(C2336R.string.dialog_logout_description);
            Intrinsics.checkIfNull(string2, "getString(R.string.dialog_logout_description)");
            UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C9311b(), 12, null);
        } else if (Intrinsics.equals(abstractC13816c, C13870l1.f34987a)) {
            OnboardingMyPdActivity.m1939a(this, ((InsertPinViewModel) m22758I0()).m14920f1());
        } else if (Intrinsics.equals(abstractC13816c, C13852j1.f34960a)) {
            OnboardingEmailSentActivity.m5282a(this, ((InsertPinViewModel) m22758I0()).m14920f1());
        } else if (Intrinsics.equals(abstractC13816c, C13918x.f35039a)) {
            OnboardingResumeActivity.m35084b(this, ((InsertPinViewModel) m22758I0()).m14920f1(), false, 2, null);
        } else if (Intrinsics.equals(abstractC13816c, C13878n1.f34993a)) {
            OnboardingNotificationActivity.m42a(this, ((InsertPinViewModel) m22758I0()).m14920f1());
        } else if (Intrinsics.equals(abstractC13816c, C13869l0.f34986a)) {
            HomeActivity.m6743b(this);
        }
    }
}
