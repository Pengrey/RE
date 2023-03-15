package p408vk;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7468x;
import mg.AnalyticsManager;
import mg.C7296j0;
import mg.EmailManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p070e.C4906j;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p298pi.EmailSentViewModel;
import p378u5.ResourcesProvider;
import p451xi.C12997f;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13917w2;
import p494zh.C13918x;
import pt.pingodoce.app.data.local.flows.EnumC8682a;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import td.InterfaceC10524i0;

/* renamed from: vk.f */
/* loaded from: classes2.dex */
public final class OnboardingEmailSentViewModel extends EmailSentViewModel {

    /* renamed from: M */
    private final AnalyticsManager f29212M;

    /* renamed from: N */
    private final C7296j0 f29213N;

    /* renamed from: O */
    private final C1436e0 f29214O;

    /* renamed from: P */
    private LiveData f29215P;

    /* renamed from: Q */
    private final C1436e0 f29216Q;

    /* renamed from: R */
    private final InterfaceC6108l f29217R;

    /* renamed from: S */
    private final InterfaceC6108l f29218S;

    /* renamed from: T */
    private final InterfaceC6108l f29219T;

    /* compiled from: OnboardingEmailSentViewModel.kt */
    /* renamed from: vk.f$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C11385a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29220a;

        static {
            int[] iArr = new int[EnumC8682a.values().length];
            iArr[EnumC8682a.LOGIN.ordinal()] = 1;
            f29220a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailSentViewModel.kt */
    /* renamed from: vk.f$b */
    /* loaded from: classes2.dex */
    public static final class C11386b extends AbstractC6438m implements InterfaceC6108l {
        C11386b() {
            super(1);
        }

        /* renamed from: a */
        public final void m5253a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            OnboardingEmailSentViewModel.m5276D0(OnboardingEmailSentViewModel.this);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5253a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailSentViewModel.kt */
    /* renamed from: vk.f$c */
    /* loaded from: classes2.dex */
    public static final class C11387c extends AbstractC6438m implements InterfaceC6108l {
        C11387c() {
            super(1);
        }

        /* renamed from: a */
        public final void m5252a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (Intrinsics.equals(OnboardingEmailSentViewModel.m5271I0(OnboardingEmailSentViewModel.this).mo172f(), Boolean.FALSE)) {
                InterfaceC7886d.C7887a.m17629a(OnboardingEmailSentViewModel.m5275E0(OnboardingEmailSentViewModel.this), AnalyticEvents.AbstractC7780f.C7832r.f20456b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            } else {
                InterfaceC7886d.C7887a.m17629a(OnboardingEmailSentViewModel.m5275E0(OnboardingEmailSentViewModel.this), AnalyticEvents.AbstractC7780f.C7816l1.f20440b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            }
            OnboardingEmailSentViewModel.this.m5258V0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5252a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailSentViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentViewModel", m20196f = "OnboardingEmailSentViewModel.kt", m20195l = {135}, m20194m = "getLoyaltyCards")
    /* renamed from: vk.f$d */
    /* loaded from: classes2.dex */
    public static final class C11388d extends AbstractC6757d {

        /* renamed from: w */
        Object f29223w;

        /* renamed from: x */
        /* synthetic */ Object f29224x;

        /* renamed from: z */
        int f29226z;

        C11388d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f29224x = obj;
            this.f29226z |= Integer.MIN_VALUE;
            return OnboardingEmailSentViewModel.m5273G0(OnboardingEmailSentViewModel.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailSentViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentViewModel$getLoyaltyCards$response$1", m20196f = "OnboardingEmailSentViewModel.kt", m20195l = {135}, m20194m = "invokeSuspend")
    /* renamed from: vk.f$e */
    /* loaded from: classes2.dex */
    public static final class C11389e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29227x;

        C11389e(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11389e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11389e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29227x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C7296j0 m5272H0 = OnboardingEmailSentViewModel.m5272H0(OnboardingEmailSentViewModel.this);
                this.f29227x = 1;
                obj = m5272H0.m18771a(this);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailSentViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentViewModel$proceedWithEmailValidation$1", m20196f = "OnboardingEmailSentViewModel.kt", m20195l = {188}, m20194m = "invokeSuspend")
    /* renamed from: vk.f$f */
    /* loaded from: classes2.dex */
    public static final class C11390f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f29229x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingEmailSentViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentViewModel$proceedWithEmailValidation$1$1", m20196f = "OnboardingEmailSentViewModel.kt", m20195l = {189, 190}, m20194m = "invokeSuspend")
        /* renamed from: vk.f$f$a */
        /* loaded from: classes2.dex */
        public static final class C11391a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f29231x;

            /* renamed from: y */
            final /* synthetic */ OnboardingEmailSentViewModel f29232y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11391a(OnboardingEmailSentViewModel onboardingEmailSentViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f29232y = onboardingEmailSentViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C11391a(this.f29232y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C11391a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f29231x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    EmailManager m5274F0 = OnboardingEmailSentViewModel.m5274F0(this.f29232y);
                    this.f29231x = 1;
                    obj = m5274F0.m18456a(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7468x abstractC7468x = (AbstractC7468x) obj;
                if (abstractC7468x instanceof AbstractC7468x.C7472b) {
                    OnboardingEmailSentViewModel onboardingEmailSentViewModel = this.f29232y;
                    this.f29231x = 2;
                    if (OnboardingEmailSentViewModel.m5273G0(onboardingEmailSentViewModel, this) == m34636d) {
                        return m34636d;
                    }
                } else if (abstractC7468x instanceof AbstractC7468x.AbstractC7469a) {
                    OnboardingEmailSentViewModel.m5270J0(this.f29232y, ((AbstractC7468x.AbstractC7469a) abstractC7468x).m18430a());
                }
                return C13195u.f34156a;
            }
        }

        C11390f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C11390f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C11390f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29229x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingEmailSentViewModel onboardingEmailSentViewModel = OnboardingEmailSentViewModel.this;
                C11391a c11391a = new C11391a(onboardingEmailSentViewModel, null);
                this.f29229x = 1;
                if (OnboardingEmailSentViewModel.m5269K0(onboardingEmailSentViewModel, true, c11391a, this) == m34636d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingEmailSentViewModel.kt */
    /* renamed from: vk.f$g */
    /* loaded from: classes2.dex */
    public static final class C11392g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ EmailManager f29234x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingEmailSentViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentViewModel$resendVerificationEmailClick$1$1", m20196f = "OnboardingEmailSentViewModel.kt", m20195l = {C4906j.f13612y0}, m20194m = "invokeSuspend")
        /* renamed from: vk.f$g$a */
        /* loaded from: classes2.dex */
        public static final class C11393a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f29235x;

            /* renamed from: y */
            final /* synthetic */ OnboardingEmailSentViewModel f29236y;

            /* renamed from: z */
            final /* synthetic */ EmailManager f29237z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OnboardingEmailSentViewModel.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.email.emailsent.OnboardingEmailSentViewModel$resendVerificationEmailClick$1$1$1$1", m20196f = "OnboardingEmailSentViewModel.kt", m20195l = {C4906j.f13617z0}, m20194m = "invokeSuspend")
            /* renamed from: vk.f$g$a$a */
            /* loaded from: classes2.dex */
            public static final class C11394a extends AbstractC6764l implements InterfaceC6108l {

                /* renamed from: x */
                int f29238x;

                /* renamed from: y */
                final /* synthetic */ EmailManager f29239y;

                /* renamed from: z */
                final /* synthetic */ OnboardingFlowData f29240z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C11394a(EmailManager emailManager, OnboardingFlowData onboardingFlowData, InterfaceC1886d interfaceC1886d) {
                    super(1, interfaceC1886d);
                    this.f29239y = emailManager;
                    this.f29240z = onboardingFlowData;
                }

                public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                    return new C11394a(this.f29239y, this.f29240z, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                    return ((C11394a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f29238x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        EmailManager emailManager = this.f29239y;
                        String m14716k = this.f29240z.m14716k();
                        String m14715m = this.f29240z.m14715m();
                        String m14713r = this.f29240z.m14713r();
                        String m14711t = this.f29240z.m14711t();
                        this.f29238x = 1;
                        obj = emailManager.m18454c(m14716k, m14715m, m14713r, m14711t, this);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11393a(OnboardingEmailSentViewModel onboardingEmailSentViewModel, EmailManager emailManager, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f29236y = onboardingEmailSentViewModel;
                this.f29237z = emailManager;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C11393a(this.f29236y, this.f29237z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C11393a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f29235x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    OnboardingFlowData m5263Q0 = this.f29236y.m5263Q0();
                    OnboardingEmailSentViewModel onboardingEmailSentViewModel = this.f29236y;
                    C11394a c11394a = new C11394a(this.f29237z, m5263Q0, null);
                    this.f29235x = 1;
                    if (CoreBaseViewModel.m20383n(onboardingEmailSentViewModel, false, c11394a, this, 1, null) == m34636d) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11392g(EmailManager emailManager) {
            super(1);
            this.f29234x = emailManager;
        }

        /* renamed from: a */
        public final void m5248a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (Intrinsics.equals(OnboardingEmailSentViewModel.m5271I0(OnboardingEmailSentViewModel.this).mo172f(), Boolean.FALSE)) {
                InterfaceC7886d.C7887a.m17629a(OnboardingEmailSentViewModel.m5275E0(OnboardingEmailSentViewModel.this), AnalyticEvents.AbstractC7780f.C7829q.f20453b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            } else {
                InterfaceC7886d.C7887a.m17629a(OnboardingEmailSentViewModel.m5275E0(OnboardingEmailSentViewModel.this), AnalyticEvents.AbstractC7780f.C7813k1.f20437b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            }
            C6772d.m20158d(C1473p0.m36987a(OnboardingEmailSentViewModel.this), null, null, new C11393a(OnboardingEmailSentViewModel.this, this.f29234x, null), 3, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m5248a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEmailSentViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, EmailManager emailManager, C7296j0 c7296j0) {
        super(c1459l0, resourcesProvider, emailManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(emailManager, "emailManager");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        this.f29212M = analyticsManager;
        this.f29213N = c7296j0;
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_showEditButton", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_showEditButton\", false)");
        this.f29214O = m37003d;
        this.f29215P = m37003d;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_EMAIL_VALIDATION");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<…TRA_FOR_EMAIL_VALIDATION)");
        this.f29216Q = m37004c;
        if (Intrinsics.equals(m37004c.mo172f(), bool)) {
            InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7823o.f20447b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7807i1.f20431b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        }
        m14966x0().mo166p(bool);
        this.f29217R = BaseViewModel.m113I(this, 0L, new C11387c(), 1, null);
        this.f29218S = BaseViewModel.m113I(this, 0L, new C11386b(), 1, null);
        this.f29219T = BaseViewModel.m113I(this, 0L, new C11392g(emailManager), 1, null);
    }

    /* renamed from: A0 */
    public static /* synthetic */ void m5279A0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, View view) {
        m5264P0(onboardingEmailSentViewModel, view);
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m5278B0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, View view) {
        m5267M0(onboardingEmailSentViewModel, view);
    }

    /* renamed from: C0 */
    public static /* synthetic */ void m5277C0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, View view) {
        m5256X0(onboardingEmailSentViewModel, view);
    }

    /* renamed from: D0 */
    public static final /* synthetic */ void m5276D0(OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        onboardingEmailSentViewModel.m5266N0();
    }

    /* renamed from: E0 */
    public static final /* synthetic */ AnalyticsManager m5275E0(OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        return onboardingEmailSentViewModel.f29212M;
    }

    /* renamed from: F0 */
    public static final /* synthetic */ EmailManager m5274F0(OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        return onboardingEmailSentViewModel.m14969u0();
    }

    /* renamed from: G0 */
    public static final /* synthetic */ Object m5273G0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, InterfaceC1886d interfaceC1886d) {
        return onboardingEmailSentViewModel.m5262R0(interfaceC1886d);
    }

    /* renamed from: H0 */
    public static final /* synthetic */ C7296j0 m5272H0(OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        return onboardingEmailSentViewModel.f29213N;
    }

    /* renamed from: I0 */
    public static final /* synthetic */ C1436e0 m5271I0(OnboardingEmailSentViewModel onboardingEmailSentViewModel) {
        return onboardingEmailSentViewModel.f29216Q;
    }

    /* renamed from: J0 */
    public static final /* synthetic */ void m5270J0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, Throwable th2) {
        onboardingEmailSentViewModel.m109l(th2);
    }

    /* renamed from: K0 */
    public static final /* synthetic */ Object m5269K0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return onboardingEmailSentViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m5267M0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingEmailSentViewModel, "this$0");
        onboardingEmailSentViewModel.f29218S.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N0 */
    private final void m5266N0() {
        InterfaceC7886d.C7887a.m17629a(this.f29212M, AnalyticEvents.AbstractC7780f.C7810j1.f20434b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        m120B(C13917w2.f35038a, m5263Q0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m5264P0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingEmailSentViewModel, "this$0");
        onboardingEmailSentViewModel.f29217R.mo9587d(C13195u.f34156a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m5262R0(bd.InterfaceC1886d r32) {
        /*
            r31 = this;
            r6 = r31
            r0 = r32
            boolean r1 = r0 instanceof p408vk.OnboardingEmailSentViewModel.C11388d
            if (r1 == 0) goto L17
            r1 = r0
            vk.f$d r1 = (p408vk.OnboardingEmailSentViewModel.C11388d) r1
            int r2 = r1.f29226z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f29226z = r2
            goto L1c
        L17:
            vk.f$d r1 = new vk.f$d
            r1.<init>(r0)
        L1c:
            r3 = r1
            java.lang.Object r0 = r3.f29224x
            java.lang.Object r7 = cd.C2111b.m34640d()
            int r1 = r3.f29226z
            r8 = 1
            if (r1 == 0) goto L3a
            if (r1 != r8) goto L32
            java.lang.Object r1 = r3.f29223w
            vk.f r1 = (p408vk.OnboardingEmailSentViewModel) r1
            p468yc.C13186n.m1453b(r0)
            goto L54
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            p468yc.C13186n.m1453b(r0)
            r1 = 0
            vk.f$e r2 = new vk.f$e
            r0 = 0
            r2.<init>(r0)
            r4 = 1
            r5 = 0
            r3.f29223w = r6
            r3.f29226z = r8
            r0 = r31
            java.lang.Object r0 = ke.CoreBaseViewModel.m20383n(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L53
            return r7
        L53:
            r1 = r6
        L54:
            df.d r0 = (p065df.NetworkResult) r0
            boolean r2 = r0 instanceof p065df.NetworkResult.C4792b
            if (r2 == 0) goto Lce
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r9 = r1.m5263Q0()
            df.d$b r0 = (p065df.NetworkResult.C4792b) r0
            java.lang.Object r2 = r0.m26590a()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse r2 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse) r2
            java.util.List r25 = r2.m13774a()
            java.lang.Object r2 = r0.m26590a()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse r2 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse) r2
            java.util.List r2 = r2.m13774a()
            boolean r2 = r2.isEmpty()
            r20 = r2 ^ 1
            java.lang.Object r0 = r0.m26590a()
            pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse r0 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCardListResponse) r0
            boolean r18 = r0.m13771d()
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 490239(0x77aff, float:6.86971E-40)
            r30 = 0
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r0 = pt.pingodoce.app.data.local.flows.OnboardingFlowData.m14720f(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.util.List r2 = r0.m14718i()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lcb
            pt.pingodoce.app.data.local.flows.a r2 = r0.m14710v()
            int[] r3 = p408vk.OnboardingEmailSentViewModel.C11385a.f29220a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 != r8) goto Lc5
            zh.n1 r2 = p494zh.C13878n1.f34993a
            r1.m120B(r2, r0)
            goto Lce
        Lc5:
            zh.c0 r2 = p494zh.C13817c0.f34924a
            r1.m120B(r2, r0)
            goto Lce
        Lcb:
            r1.m5259U0(r0)
        Lce:
            yc.u r0 = p468yc.C13195u.f34156a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p408vk.OnboardingEmailSentViewModel.m5262R0(bd.d):java.lang.Object");
    }

    /* renamed from: U0 */
    private final void m5259U0(OnboardingFlowData onboardingFlowData) {
        List m1964a = C12997f.m1964a(onboardingFlowData.m14718i());
        String string = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String string2 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        onboardingFlowData.m14733G(LoyaltyCardResumeViewModel.f23913I.m12641a(string, m1964a, string2));
        LoyaltyCardResumeViewModel m14719h = onboardingFlowData.m14719h();
        Intrinsics.ifNullDoSomething(m14719h);
        m14719h.m12642s(onboardingFlowData.m14714n());
        m34576U(onboardingFlowData);
        m120B(C13918x.f35039a, onboardingFlowData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static final void m5256X0(OnboardingEmailSentViewModel onboardingEmailSentViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingEmailSentViewModel, "this$0");
        onboardingEmailSentViewModel.f29219T.mo9587d(C13195u.f34156a);
    }

    /* renamed from: L0 */
    public final View.OnClickListener m5268L0() {
        return new View.OnClickListener() { // from class: vk.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingEmailSentViewModel.m5267M0(OnboardingEmailSentViewModel.this, view);
            }
        };
    }

    /* renamed from: O0 */
    public final View.OnClickListener m5265O0() {
        return new View.OnClickListener() { // from class: vk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingEmailSentViewModel.m5264P0(OnboardingEmailSentViewModel.this, view);
            }
        };
    }

    /* renamed from: Q0 */
    public OnboardingFlowData m5263Q0() {
        OnboardingFlowData m18770b;
        if (!m34577T() && (m18770b = this.f29213N.m18770b()) != null) {
            m34576U(m18770b);
        }
        return (OnboardingFlowData) super.m34578S();
    }

    /* renamed from: S0 */
    public final LiveData m5261S0() {
        return this.f29215P;
    }

    /* renamed from: T0 */
    public final void m5260T0() {
        InterfaceC7886d.C7887a.m17629a(this.f29212M, AnalyticEvents.AbstractC7780f.C7826p.f20450b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: V0 */
    public final void m5258V0() {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C11390f(null), 3, null);
    }

    /* renamed from: W0 */
    public final View.OnClickListener m5257W0() {
        return new View.OnClickListener() { // from class: vk.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingEmailSentViewModel.m5256X0(OnboardingEmailSentViewModel.this, view);
            }
        };
    }

    /* renamed from: Y0 */
    public final void m5255Y0() {
        C1436e0 c1436e0 = this.f29214O;
        T mo172f = c1436e0.mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        c1436e0.mo166p(Boolean.valueOf(!((Boolean) mo172f).booleanValue()));
    }

    /* renamed from: z0 */
    public Object m5254z0(InterfaceC1886d interfaceC1886d) {
        return C13195u.f34156a;
    }
}
