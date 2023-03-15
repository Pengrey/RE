package p496zj;

import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7296j0;
import mg.C7405s1;
import module.network.data.remote.models.user.User;
import p065df.NetworkResult;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p451xi.C12997f;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.C13821d;
import p494zh.C13873m0;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import td.C10565r0;
import td.InterfaceC10524i0;

/* renamed from: zj.c */
/* loaded from: classes2.dex */
public final class CardRegistrationLandingViewModel extends FlowViewModel {

    /* renamed from: q */
    private final C7296j0 f35075q;

    /* renamed from: r */
    private final C7405s1 f35076r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardRegistrationLandingViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.loyaltycard.landing.CardRegistrationLandingViewModel$checkForLoyaltyCard$1", m20196f = "CardRegistrationLandingViewModel.kt", m20195l = {44, 78}, m20194m = "invokeSuspend")
    /* renamed from: zj.c$a */
    /* loaded from: classes2.dex */
    public static final class C13935a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f35077x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CardRegistrationLandingViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.loyaltycard.landing.CardRegistrationLandingViewModel$checkForLoyaltyCard$1$response$1", m20196f = "CardRegistrationLandingViewModel.kt", m20195l = {44}, m20194m = "invokeSuspend")
        /* renamed from: zj.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C13936a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f35079x;

            /* renamed from: y */
            final /* synthetic */ CardRegistrationLandingViewModel f35080y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13936a(CardRegistrationLandingViewModel cardRegistrationLandingViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f35080y = cardRegistrationLandingViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13936a(this.f35080y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13936a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f35079x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C7296j0 m56V = CardRegistrationLandingViewModel.m56V(this.f35080y);
                    this.f35079x = 1;
                    obj = m56V.m18771a(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return obj;
            }
        }

        C13935a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13935a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13935a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Object m20383n;
            String m18176v;
            String m18176v2;
            m34636d = C2116d.m34636d();
            int i = this.f35077x;
            if (i == 0) {
                C13186n.m1453b(obj);
                CardRegistrationLandingViewModel cardRegistrationLandingViewModel = CardRegistrationLandingViewModel.this;
                C13936a c13936a = new C13936a(cardRegistrationLandingViewModel, null);
                this.f35077x = 1;
                m20383n = CoreBaseViewModel.m20383n(cardRegistrationLandingViewModel, false, c13936a, this, 1, null);
                if (m20383n == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 2, null);
                return C13195u.f34156a;
            } else {
                C13186n.m1453b(obj);
                m20383n = obj;
            }
            NetworkResult networkResult = (NetworkResult) m20383n;
            if (networkResult instanceof NetworkResult.C4792b) {
                NetworkResult.C4792b c4792b = (NetworkResult.C4792b) networkResult;
                if (((LoyaltyCardListResponse) c4792b.m26590a()).m13774a().isEmpty()) {
                    CardRegistrationLandingViewModel cardRegistrationLandingViewModel2 = CardRegistrationLandingViewModel.this;
                    C13873m0 c13873m0 = C13873m0.f34989a;
                    User m18502h = CardRegistrationLandingViewModel.m54X(CardRegistrationLandingViewModel.this).m18502h();
                    cardRegistrationLandingViewModel2.m120B(c13873m0, new OnboardingFlowData((m18502h == null || (m18176v2 = m18502h.m18176v()) == null) ? BuildConfig.VERSION_NAME : m18176v2, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524286, null));
                } else {
                    User m18502h2 = CardRegistrationLandingViewModel.m54X(CardRegistrationLandingViewModel.this).m18502h();
                    OnboardingFlowData onboardingFlowData = new OnboardingFlowData((m18502h2 == null || (m18176v = m18502h2.m18176v()) == null) ? BuildConfig.VERSION_NAME : m18176v, null, null, ((LoyaltyCardListResponse) c4792b.m26590a()).m13773b(), ((LoyaltyCardListResponse) c4792b.m26590a()).m13772c(), null, null, null, ((LoyaltyCardListResponse) c4792b.m26590a()).m13771d(), false, true, null, null, null, null, ((LoyaltyCardListResponse) c4792b.m26590a()).m13774a(), false, null, null, 490214, null);
                    LoyaltyCardResumeViewModel.C9074a c9074a = LoyaltyCardResumeViewModel.f23913I;
                    String string = CardRegistrationLandingViewModel.m55W(CardRegistrationLandingViewModel.this).m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
                    Intrinsics.checkIfNull(string, "ctx.getString(id)");
                    List m1964a = C12997f.m1964a(onboardingFlowData.m14718i());
                    String string2 = CardRegistrationLandingViewModel.m55W(CardRegistrationLandingViewModel.this).m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow);
                    Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                    onboardingFlowData.m14733G(c9074a.m12641a(string, m1964a, string2));
                    LoyaltyCardResumeViewModel m14719h = onboardingFlowData.m14719h();
                    Intrinsics.ifNullDoSomething(m14719h);
                    m14719h.m12643r(((LoyaltyCardListResponse) c4792b.m26590a()).m13771d());
                    CardRegistrationLandingViewModel.this.m120B(C13821d.f34928a, onboardingFlowData);
                }
            } else if (networkResult instanceof NetworkResult.C4791a) {
                CardRegistrationLandingViewModel.m52Z(CardRegistrationLandingViewModel.this, true);
                CardRegistrationLandingViewModel.m53Y(CardRegistrationLandingViewModel.this, ((NetworkResult.C4791a) networkResult).m26591a());
                this.f35077x = 2;
                if (C10565r0.m7677a(2000L, this) == m34636d) {
                    return m34636d;
                }
                UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 2, null);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRegistrationLandingViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7296j0 c7296j0, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f35075q = c7296j0;
        this.f35076r = c7405s1;
        m57N();
    }

    /* renamed from: V */
    public static final /* synthetic */ C7296j0 m56V(CardRegistrationLandingViewModel cardRegistrationLandingViewModel) {
        return cardRegistrationLandingViewModel.f35075q;
    }

    /* renamed from: W */
    public static final /* synthetic */ ResourcesProvider m55W(CardRegistrationLandingViewModel cardRegistrationLandingViewModel) {
        return cardRegistrationLandingViewModel.m20390g();
    }

    /* renamed from: X */
    public static final /* synthetic */ C7405s1 m54X(CardRegistrationLandingViewModel cardRegistrationLandingViewModel) {
        return cardRegistrationLandingViewModel.f35076r;
    }

    /* renamed from: Y */
    public static final /* synthetic */ void m53Y(CardRegistrationLandingViewModel cardRegistrationLandingViewModel, Throwable th2) {
        cardRegistrationLandingViewModel.m109l(th2);
    }

    /* renamed from: Z */
    public static final /* synthetic */ void m52Z(CardRegistrationLandingViewModel cardRegistrationLandingViewModel, boolean z) {
        cardRegistrationLandingViewModel.m20350O(z);
    }

    /* renamed from: a0 */
    private final void m51a0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13935a(null), 3, null);
    }

    /* renamed from: N */
    protected void m57N() {
        m51a0();
    }
}
