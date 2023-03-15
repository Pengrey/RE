package p453xk;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import lk.EnumC7070a;
import me.C7185b;
import mg.ConsentsManager;
import p162ig.Term;
import p166ik.MyPdViewModel;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Consent;
import td.InterfaceC10524i0;

/* renamed from: xk.c */
/* loaded from: classes2.dex */
public final class OnboardingMyPdViewModel extends MyPdViewModel {

    /* renamed from: F */
    private final ConsentsManager f33754F;

    /* renamed from: G */
    private final C1436e0 f33755G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingMyPdViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdViewModel$fetchConsentsUrl$1", m20196f = "OnboardingMyPdViewModel.kt", m20195l = {62}, m20194m = "invokeSuspend")
    /* renamed from: xk.c$a */
    /* loaded from: classes2.dex */
    public static final class C13007a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ EnumC7070a f33756A;

        /* renamed from: x */
        int f33757x;

        /* renamed from: z */
        final /* synthetic */ String f33759z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingMyPdViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdViewModel$fetchConsentsUrl$1$1", m20196f = "OnboardingMyPdViewModel.kt", m20195l = {63}, m20194m = "invokeSuspend")
        /* renamed from: xk.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C13008a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ EnumC7070a f33760A;

            /* renamed from: x */
            int f33761x;

            /* renamed from: y */
            final /* synthetic */ OnboardingMyPdViewModel f33762y;

            /* renamed from: z */
            final /* synthetic */ String f33763z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13008a(OnboardingMyPdViewModel onboardingMyPdViewModel, String str, EnumC7070a enumC7070a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f33762y = onboardingMyPdViewModel;
                this.f33763z = str;
                this.f33760A = enumC7070a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C13008a(this.f33762y, this.f33763z, this.f33760A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C13008a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f33761x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ConsentsManager m1934x0 = OnboardingMyPdViewModel.m1934x0(this.f33762y);
                    this.f33761x = 1;
                    obj = m1934x0.m18565f(this);
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
                    OnboardingMyPdViewModel.m1933y0(this.f33762y).mo166p(new C7185b(new Term(this.f33763z, this.f33760A == EnumC7070a.TERM_OF_USE ? consent.m13866b() : consent.m13867a())));
                } else if (result instanceof Result.C8077b) {
                    OnboardingMyPdViewModel.m1932z0(this.f33762y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13007a(String str, EnumC7070a enumC7070a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f33759z = str;
            this.f33756A = enumC7070a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13007a(this.f33759z, this.f33756A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13007a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f33757x;
            if (i == 0) {
                C13186n.m1453b(obj);
                OnboardingMyPdViewModel onboardingMyPdViewModel = OnboardingMyPdViewModel.this;
                C13008a c13008a = new C13008a(onboardingMyPdViewModel, this.f33759z, this.f33756A, null);
                this.f33757x = 1;
                if (OnboardingMyPdViewModel.m1937A0(onboardingMyPdViewModel, true, c13008a, this) == m34636d) {
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
    /* compiled from: OnboardingMyPdViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.onboarding.mypd.OnboardingMyPdViewModel", m20196f = "OnboardingMyPdViewModel.kt", m20195l = {44}, m20194m = "submitAction")
    /* renamed from: xk.c$b */
    /* loaded from: classes2.dex */
    public static final class C13009b extends AbstractC6757d {

        /* renamed from: w */
        Object f33764w;

        /* renamed from: x */
        /* synthetic */ Object f33765x;

        /* renamed from: z */
        int f33767z;

        C13009b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f33765x = obj;
            this.f33767z |= Integer.MIN_VALUE;
            return OnboardingMyPdViewModel.this.m1935w0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingMyPdViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ConsentsManager consentsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        this.f33754F = consentsManager;
        this.f33755G = new C1436e0();
    }

    /* renamed from: A0 */
    public static final /* synthetic */ Object m1937A0(OnboardingMyPdViewModel onboardingMyPdViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return onboardingMyPdViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: x0 */
    public static final /* synthetic */ ConsentsManager m1934x0(OnboardingMyPdViewModel onboardingMyPdViewModel) {
        return onboardingMyPdViewModel.f33754F;
    }

    /* renamed from: y0 */
    public static final /* synthetic */ C1436e0 m1933y0(OnboardingMyPdViewModel onboardingMyPdViewModel) {
        return onboardingMyPdViewModel.f33755G;
    }

    /* renamed from: z0 */
    public static final /* synthetic */ void m1932z0(OnboardingMyPdViewModel onboardingMyPdViewModel, Throwable th2) {
        onboardingMyPdViewModel.m109l(th2);
    }

    /* renamed from: B0 */
    public final void m1936B0(String str, EnumC7070a enumC7070a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(enumC7070a, "type");
        Object mo172f = m20387j().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        if (((Boolean) mo172f).booleanValue()) {
            return;
        }
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13007a(str, enumC7070a, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m1935w0(bd.InterfaceC1886d r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof p453xk.OnboardingMyPdViewModel.C13009b
            if (r2 == 0) goto L17
            r2 = r1
            xk.c$b r2 = (p453xk.OnboardingMyPdViewModel.C13009b) r2
            int r3 = r2.f33767z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f33767z = r3
            goto L1c
        L17:
            xk.c$b r2 = new xk.c$b
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f33765x
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f33767z
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f33764w
            xk.c r2 = (p453xk.OnboardingMyPdViewModel) r2
            p468yc.C13186n.m1453b(r1)
            goto L56
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            p468yc.C13186n.m1453b(r1)
            pt.pingodoce.app.data.local.flows.FlowData r1 = r26.m34578S()
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r1 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r1
            pt.pingodoce.app.data.remote.models.response.Consent r4 = r1.m14724a()
            if (r4 != 0) goto Lad
            mg.s r1 = r0.f33754F
            r2.f33764w = r0
            r2.f33767z = r5
            java.lang.Object r1 = r1.m18565f(r2)
            if (r1 != r3) goto L55
            return r3
        L55:
            r2 = r0
        L56:
            og.a r1 = (p276og.Result) r1
            boolean r3 = r1 instanceof p276og.Result.C8078c
            if (r3 == 0) goto L9c
            pt.pingodoce.app.data.local.flows.FlowData r3 = r2.m34578S()
            r4 = r3
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r4 = (pt.pingodoce.app.data.local.flows.OnboardingFlowData) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            og.a$c r1 = (p276og.Result.C8078c) r1
            java.lang.Object r1 = r1.m16962b()
            r17 = r1
            pt.pingodoce.app.data.remote.models.response.Consent r17 = (pt.pingodoce.app.data.remote.models.response.Consent) r17
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 520191(0x7efff, float:7.28943E-40)
            r25 = 0
            pt.pingodoce.app.data.local.flows.OnboardingFlowData r1 = pt.pingodoce.app.data.local.flows.OnboardingFlowData.m14720f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r2.m34576U(r1)
            zh.h1 r1 = p494zh.C13842h1.f34950a
            pt.pingodoce.app.data.local.flows.FlowData r3 = r2.m34578S()
            r2.m120B(r1, r3)
            goto Lb2
        L9c:
            boolean r3 = r1 instanceof p276og.Result.C8077b
            if (r3 == 0) goto Lb2
            r2.m20319p0()
            og.a$b r1 = (p276og.Result.C8077b) r1
            java.lang.Throwable r1 = r1.m16964b()
            r2.m109l(r1)
            goto Lb2
        Lad:
            zh.m1 r2 = p494zh.C13874m1.f34990a
            r0.m120B(r2, r1)
        Lb2:
            yc.u r1 = p468yc.C13195u.f34156a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p453xk.OnboardingMyPdViewModel.m1935w0(bd.d):java.lang.Object");
    }
}
