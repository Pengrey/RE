package p258nk;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import lk.EnumC7070a;
import me.C7185b;
import mg.AnalyticsManager;
import mg.ConsentsManager;
import mg.SmsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p162ig.Term;
import p181jd.Intrinsics;
import p187jk.PhoneViewModel;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13848i2;
import p494zh.C13897r2;
import p494zh.C13900s1;
import p494zh.C13901s2;
import p494zh.C13922y;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.data.remote.models.response.VerifyNumber;
import td.InterfaceC10524i0;

/* renamed from: nk.d */
/* loaded from: classes2.dex */
public final class LoginPhoneViewModel extends PhoneViewModel {

    /* renamed from: V */
    private final ConsentsManager f20571V;

    /* renamed from: W */
    private final SmsManager f20572W;

    /* renamed from: X */
    private final AnalyticsManager f20573X;

    /* renamed from: Y */
    private final C1436e0 f20574Y;

    /* renamed from: Z */
    private final LiveData f20575Z;

    /* compiled from: LoginPhoneViewModel.kt */
    /* renamed from: nk.d$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7927a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20576a;

        static {
            int[] iArr = new int[VerifyNumber.EnumC8798b.values().length];
            iArr[VerifyNumber.EnumC8798b.USER_OK.ordinal()] = 1;
            iArr[VerifyNumber.EnumC8798b.USER_NOT_FOUND.ordinal()] = 2;
            iArr[VerifyNumber.EnumC8798b.USER_WITH_OUTDATED_CONSENT.ordinal()] = 3;
            iArr[VerifyNumber.EnumC8798b.USER_ALREADY_REGISTERED.ordinal()] = 4;
            f20576a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoginPhoneViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneViewModel$fetchConsentsUrl$1", m20196f = "LoginPhoneViewModel.kt", m20195l = {175}, m20194m = "invokeSuspend")
    /* renamed from: nk.d$b */
    /* loaded from: classes2.dex */
    public static final class C7928b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ EnumC7070a f20577A;

        /* renamed from: x */
        int f20578x;

        /* renamed from: z */
        final /* synthetic */ String f20580z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LoginPhoneViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneViewModel$fetchConsentsUrl$1$1", m20196f = "LoginPhoneViewModel.kt", m20195l = {176}, m20194m = "invokeSuspend")
        /* renamed from: nk.d$b$a */
        /* loaded from: classes2.dex */
        public static final class C7929a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ EnumC7070a f20581A;

            /* renamed from: x */
            int f20582x;

            /* renamed from: y */
            final /* synthetic */ LoginPhoneViewModel f20583y;

            /* renamed from: z */
            final /* synthetic */ String f20584z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7929a(LoginPhoneViewModel loginPhoneViewModel, String str, EnumC7070a enumC7070a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f20583y = loginPhoneViewModel;
                this.f20584z = str;
                this.f20581A = enumC7070a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C7929a(this.f20583y, this.f20584z, this.f20581A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C7929a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f20582x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ConsentsManager m17544S0 = LoginPhoneViewModel.m17544S0(this.f20583y);
                    this.f20582x = 1;
                    obj = m17544S0.m18565f(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    Object m16962b = ((Result.C8078c) result).m16962b();
                    Consent consent = (Consent) m16962b;
                    LoginPhoneViewModel.m17543T0(this.f20583y).mo166p(new C7185b(new Term(this.f20584z, this.f20581A == EnumC7070a.TERM_OF_USE ? consent.m13866b() : consent.m13867a())));
                } else if (result instanceof Result.C8077b) {
                    this.f20583y.m20319p0();
                    LoginPhoneViewModel.m17542U0(this.f20583y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7928b(String str, EnumC7070a enumC7070a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f20580z = str;
            this.f20577A = enumC7070a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7928b(this.f20580z, this.f20577A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7928b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f20578x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoginPhoneViewModel loginPhoneViewModel = LoginPhoneViewModel.this;
                C7929a c7929a = new C7929a(loginPhoneViewModel, this.f20580z, this.f20577A, null);
                this.f20578x = 1;
                if (LoginPhoneViewModel.m17541V0(loginPhoneViewModel, true, c7929a, this) == m34636d) {
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
    /* compiled from: LoginPhoneViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.phone.validate.LoginPhoneViewModel", m20196f = "LoginPhoneViewModel.kt", m20195l = {64}, m20194m = "onSubmit")
    /* renamed from: nk.d$c */
    /* loaded from: classes2.dex */
    public static final class C7930c extends AbstractC6757d {

        /* renamed from: A */
        int f20585A;

        /* renamed from: w */
        Object f20586w;

        /* renamed from: x */
        Object f20587x;

        /* renamed from: y */
        /* synthetic */ Object f20588y;

        C7930c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f20588y = obj;
            this.f20585A |= Integer.MIN_VALUE;
            return LoginPhoneViewModel.this.m17530n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginPhoneViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager, SmsManager smsManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(smsManager, "smsManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f20571V = consentsManager;
        this.f20572W = smsManager;
        this.f20573X = analyticsManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f20574Y = c1436e0;
        this.f20575Z = c1436e0;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7819m1.f20443b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        C1436e0 m20723J0 = m20723J0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_phone);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m20723J0.mo166p(string);
        m20724I0().mo166p(BuildConfig.VERSION_NAME);
        m20726G0().mo166p(Boolean.TRUE);
    }

    /* renamed from: S0 */
    public static final /* synthetic */ ConsentsManager m17544S0(LoginPhoneViewModel loginPhoneViewModel) {
        return loginPhoneViewModel.f20571V;
    }

    /* renamed from: T0 */
    public static final /* synthetic */ C1436e0 m17543T0(LoginPhoneViewModel loginPhoneViewModel) {
        return loginPhoneViewModel.f20574Y;
    }

    /* renamed from: U0 */
    public static final /* synthetic */ void m17542U0(LoginPhoneViewModel loginPhoneViewModel, Throwable th2) {
        loginPhoneViewModel.m109l(th2);
    }

    /* renamed from: V0 */
    public static final /* synthetic */ Object m17541V0(LoginPhoneViewModel loginPhoneViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return loginPhoneViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: b1 */
    private final void m17535b1(String str, VerifyNumber verifyNumber) {
        m17531f1(str, verifyNumber.m13670a());
        m120B(C13848i2.f34956a, m34578S());
    }

    /* renamed from: c1 */
    private final void m17534c1(String str, VerifyNumber verifyNumber) {
        m17531f1(str, verifyNumber.m13670a());
        m34576U(LoginFlowData.m14748e((LoginFlowData) m34578S(), null, str, verifyNumber.m13670a(), false, false, 25, null));
        m120B(C13900s1.f35021a, m34578S());
    }

    /* renamed from: d1 */
    private final void m17533d1(String str, VerifyNumber verifyNumber, boolean z, boolean z2) {
        m17531f1(str, verifyNumber.m13670a());
        InterfaceC7886d.C7887a.m17629a(this.f20573X, AnalyticEvents.AbstractC7780f.C7852x1.f20476b, EnumC7885c.Layer, EnumC7884b.View, null, 8, null);
        if (z) {
            m34576U(LoginFlowData.m14748e((LoginFlowData) m34578S(), null, null, verifyNumber.m13670a(), false, z2, 11, null));
            m120B(C13901s2.f35022a, m34578S());
            return;
        }
        m34576U(LoginFlowData.m14748e((LoginFlowData) m34578S(), null, null, verifyNumber.m13670a(), false, z2, 11, null));
        m120B(C13897r2.f35018a, m34578S());
    }

    /* renamed from: e1 */
    static /* synthetic */ void m17532e1(LoginPhoneViewModel loginPhoneViewModel, String str, VerifyNumber verifyNumber, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        loginPhoneViewModel.m17533d1(str, verifyNumber, z, z2);
    }

    /* renamed from: R0 */
    protected void m17545R0() {
        BaseViewModel.m119C(this, C13922y.f35043a, null, 2, null);
    }

    /* renamed from: W0 */
    public final void m17540W0(String str, EnumC7070a enumC7070a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(enumC7070a, "type");
        Object mo172f = m20387j().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        if (((Boolean) mo172f).booleanValue()) {
            return;
        }
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C7928b(str, enumC7070a, null), 3, null);
    }

    /* renamed from: X0 */
    public final LiveData m17539X0() {
        return this.f20575Z;
    }

    /* renamed from: Y0 */
    public final void m17538Y0() {
        InterfaceC7886d.C7887a.m17629a(this.f20573X, AnalyticEvents.AbstractC7780f.C7822n1.f20446b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: Z0 */
    public final void m17537Z0() {
        InterfaceC7886d.C7887a.m17629a(this.f20573X, AnalyticEvents.AbstractC7780f.C7855y1.f20479b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: a1 */
    public final void m17536a1() {
        InterfaceC7886d.C7887a.m17629a(this.f20573X, AnalyticEvents.AbstractC7780f.C7858z1.f20482b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: f1 */
    protected void m17531f1(String str, Consent consent) {
        Intrinsics.isThisObjectNull(str, "phone");
        m34576U(new LoginFlowData(null, str, consent, false, false, 25, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m17530n0(bd.InterfaceC1886d r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p258nk.LoginPhoneViewModel.m17530n0(bd.d):java.lang.Object");
    }
}
