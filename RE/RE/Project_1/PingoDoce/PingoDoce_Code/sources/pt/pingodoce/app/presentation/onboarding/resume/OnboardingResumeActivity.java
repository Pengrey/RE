package pt.pingodoce.app.presentation.onboarding.resume;

import al.CreatePinActivity;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Arrays;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p050d.C4519c;
import p106fe.IntentUtils;
import p110fl.UserDataUpdateActivity;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11756f2;
import p430wk.OnboardingCardRegistrationActivity;
import p430wk.OnboardingOtherUserCardTutorialActivity;
import p451xi.LoyaltyCardResumeActivity;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p475yk.OnboardingNifActivity;
import p494zh.AbstractC13816c;
import p494zh.C13817c0;
import p494zh.C13847i1;
import p494zh.C13873m0;
import p494zh.C13874m1;
import p494zh.C13878n1;
import p494zh.C13892q1;
import p497zk.OnboardingNotificationActivity;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.EnumC9077a;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity;
import td.C10565r0;
import td.InterfaceC10524i0;
import uk.OnboardingEmailActivity;

/* compiled from: OnboardingResumeActivity.kt */
/* loaded from: classes2.dex */
public final class OnboardingResumeActivity extends LoyaltyCardResumeActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24567g0;

    /* renamed from: h0 */
    private final AbstractC0304b f24568h0;

    /* renamed from: i0 */
    private final InterfaceC6108l f24569i0;

    /* compiled from: OnboardingResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9344a {
        private C9344a() {
        }

        public /* synthetic */ C9344a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OnboardingResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$b */
    /* loaded from: classes2.dex */
    static final class C9345b extends AbstractC6438m implements InterfaceC6097a {
        C9345b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11576A1 = OnboardingResumeActivity.this.m11576A1();
            OnboardingResumeActivity onboardingResumeActivity = OnboardingResumeActivity.this;
            return m11576A1.m20377b(onboardingResumeActivity, onboardingResumeActivity.getIntent().getExtras());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingResumeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$initViews$1", m20196f = "OnboardingResumeActivity.kt", m20195l = {73}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$c */
    /* loaded from: classes2.dex */
    public static final class C9346c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24571x;

        /* renamed from: y */
        final /* synthetic */ OnboardingResumeViewModel f24572y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9346c(OnboardingResumeViewModel onboardingResumeViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24572y = onboardingResumeViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9346c(this.f24572y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9346c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24571x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f24571x = 1;
                if (C10565r0.m7677a(100L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            OnboardingResumeViewModel onboardingResumeViewModel = this.f24572y;
            LoyaltyCardResumeViewModel m14719h = ((OnboardingFlowData) onboardingResumeViewModel.m34578S()).m14719h();
            Intrinsics.ifNullDoSomething(m14719h);
            onboardingResumeViewModel.m11554N0(m14719h);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingResumeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$resultLauncher$1$1$1", m20196f = "OnboardingResumeActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9347d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24573x;

        /* renamed from: z */
        final /* synthetic */ OnboardingFlowData f24575z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9347d(OnboardingFlowData onboardingFlowData, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24575z = onboardingFlowData;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9347d(this.f24575z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9347d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24573x == 0) {
                C13186n.m1453b(obj);
                OnboardingResumeViewModel m11565z1 = OnboardingResumeActivity.m11565z1(OnboardingResumeActivity.this);
                OnboardingFlowData onboardingFlowData = this.f24575z;
                Intrinsics.checkIfNull(onboardingFlowData, "it");
                m11565z1.m11552P0(onboardingFlowData);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OnboardingResumeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeActivity$e */
    /* loaded from: classes2.dex */
    static final class C9348e extends AbstractC6438m implements InterfaceC6108l {
        C9348e() {
            super(1);
        }

        /* renamed from: a */
        public final void m11561a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            OnboardingResumeActivity onboardingResumeActivity = OnboardingResumeActivity.this;
            C6429c0 c6429c0 = C6429c0.f17515a;
            String string = onboardingResumeActivity.getString(C2336R.string.lbl_share_app_message);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_share_app_message)");
            String format = String.format(string, Arrays.copyOf(new Object[]{((OnboardingFlowData) OnboardingResumeActivity.m11565z1(OnboardingResumeActivity.this).m34578S()).m14737A().m14568c()}, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            String string2 = OnboardingResumeActivity.this.getString(C2336R.string.lbl_share_app_title);
            Intrinsics.checkIfNull(string2, "getString(R.string.lbl_share_app_title)");
            IntentUtils.m24292b(onboardingResumeActivity, format, string2);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11561a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C9344a(null);
    }

    public OnboardingResumeActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: bl.a
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                OnboardingResumeActivity.m11574C1(OnboardingResumeActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…        }\n        }\n    }");
        this.f24568h0 = m41364M;
        this.f24569i0 = OperatorExtensions.m35178c(LifecycleOwner.m36965a(this), new C9348e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m11574C1(OnboardingResumeActivity onboardingResumeActivity, ActivityResult activityResult) {
        Intent m41352a;
        Bundle extras;
        OnboardingFlowData onboardingFlowData;
        Intrinsics.isThisObjectNull(onboardingResumeActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (extras = m41352a.getExtras()) == null || (onboardingFlowData = (OnboardingFlowData) extras.getParcelable("EXTRA_FOR_FLOW_DATA")) == null) {
            return;
        }
        LifecycleOwner.m36965a(onboardingResumeActivity).m36984i(new C9347d(onboardingFlowData, null));
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m11566y1(OnboardingResumeActivity onboardingResumeActivity, ActivityResult activityResult) {
        m11574C1(onboardingResumeActivity, activityResult);
    }

    /* renamed from: z1 */
    public static final /* synthetic */ OnboardingResumeViewModel m11565z1(OnboardingResumeActivity onboardingResumeActivity) {
        return (OnboardingResumeViewModel) onboardingResumeActivity.m22758I0();
    }

    /* renamed from: A1 */
    public final ViewModelFactoryByInjection m11576A1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24567g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B1 */
    public void m11567v1(AbstractC11756f2 abstractC11756f2, OnboardingResumeViewModel onboardingResumeViewModel) {
        Intrinsics.isThisObjectNull(abstractC11756f2, "binding");
        Intrinsics.isThisObjectNull(onboardingResumeViewModel, "viewModel");
        super.m1990v1(abstractC11756f2, onboardingResumeViewModel);
        LifecycleOwner.m36965a(this).m36984i(new C9346c(onboardingResumeViewModel, null));
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11573J0() {
        return C6450z.m20906b(OnboardingResumeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11572K0() {
        return new C9345b();
    }

    /* renamed from: m1 */
    public void m11570m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13892q1.f35013a)) {
            OnboardingOtherUserCardTutorialActivity.m3427a(this, (PhoneFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13874m1.f34990a)) {
            OnboardingNifActivity.m1326a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13847i1.f34955a)) {
            OnboardingEmailActivity.m6723a(this, (OnboardingFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13817c0.f34924a)) {
            CreatePinActivity.m41589a(this, (PhoneFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13873m0.f34989a)) {
            OnboardingCardRegistrationActivity.m3447a(this, (PhoneFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13878n1.f34993a)) {
            OnboardingNotificationActivity.m42a(this, (OnboardingFlowData) c13182l.m1459d());
        }
    }

    public void onBackPressed() {
        ((OnboardingResumeViewModel) m22758I0()).m11555M0();
        super.onBackPressed();
    }

    /* renamed from: t1 */
    public void m11568t1(EnumC9077a enumC9077a) {
        Intrinsics.isThisObjectNull(enumC9077a, "action");
        if (enumC9077a == EnumC9077a.INVITE) {
            this.f24569i0.mo9587d(C13195u.f34156a);
        } else if (enumC9077a == EnumC9077a.EDIT) {
            UserDataUpdateActivity.m23728b(this.f24568h0, this, (OnboardingFlowData) ((OnboardingResumeViewModel) m22758I0()).m34578S(), false, 4, null);
        }
    }
}
