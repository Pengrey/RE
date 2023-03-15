package sk;

import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AbstractC7377p0;
import mg.AnalyticsManager;
import mg.PhoneManager;
import p181jd.Intrinsics;
import p343rk.SmsTokenViewModel;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;
import td.InterfaceC10524i0;

/* renamed from: sk.c */
/* loaded from: classes2.dex */
public final class PhoneUpdateSmsValidationViewModel extends SmsTokenViewModel {

    /* renamed from: Q */
    private final PhoneManager f26666Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneUpdateSmsValidationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationViewModel$askForSmsToken$1", m20196f = "PhoneUpdateSmsValidationViewModel.kt", m20195l = {30}, m20194m = "invokeSuspend")
    /* renamed from: sk.c$a */
    /* loaded from: classes2.dex */
    public static final class C10235a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f26667x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PhoneUpdateSmsValidationViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationViewModel$askForSmsToken$1$1", m20196f = "PhoneUpdateSmsValidationViewModel.kt", m20195l = {31}, m20194m = "invokeSuspend")
        /* renamed from: sk.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C10236a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f26669x;

            /* renamed from: y */
            final /* synthetic */ PhoneUpdateSmsValidationViewModel f26670y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10236a(PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f26670y = phoneUpdateSmsValidationViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C10236a(this.f26670y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C10236a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f26669x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    PhoneManager m8441P0 = PhoneUpdateSmsValidationViewModel.m8441P0(this.f26670y);
                    String m14685b = ((UpdatePhoneFlowData) this.f26670y.m34578S()).m14685b();
                    this.f26669x = 1;
                    obj = m8441P0.m18660d(m14685b, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                AbstractC7377p0 abstractC7377p0 = (AbstractC7377p0) obj;
                if (abstractC7377p0 instanceof AbstractC7377p0.AbstractC7378a) {
                    String message = ((AbstractC7377p0.AbstractC7378a) abstractC7377p0).m18626a().getMessage();
                    if (message != null) {
                        PhoneUpdateSmsValidationViewModel.m8440Q0(this.f26670y, true, message);
                    }
                } else {
                    boolean z = abstractC7377p0 instanceof AbstractC7377p0.C7381b;
                }
                PhoneUpdateSmsValidationViewModel.m8442O0(this.f26670y, true, true);
                return C13195u.f34156a;
            }
        }

        C10235a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10235a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10235a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f26667x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel = PhoneUpdateSmsValidationViewModel.this;
                C10236a c10236a = new C10236a(phoneUpdateSmsValidationViewModel, null);
                this.f26667x = 1;
                if (CoreBaseViewModel.m20383n(phoneUpdateSmsValidationViewModel, false, c10236a, this, 1, null) == m34636d) {
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
    /* compiled from: PhoneUpdateSmsValidationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationViewModel", m20196f = "PhoneUpdateSmsValidationViewModel.kt", m20195l = {44}, m20194m = "onSubmit")
    /* renamed from: sk.c$b */
    /* loaded from: classes2.dex */
    public static final class C10237b extends AbstractC6757d {

        /* renamed from: w */
        Object f26671w;

        /* renamed from: x */
        /* synthetic */ Object f26672x;

        /* renamed from: z */
        int f26674z;

        C10237b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f26672x = obj;
            this.f26674z |= Integer.MIN_VALUE;
            return PhoneUpdateSmsValidationViewModel.this.m8439n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneUpdateSmsValidationViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PhoneManager phoneManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(phoneManager, "phoneManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f26666Q = phoneManager;
    }

    /* renamed from: O0 */
    public static final /* synthetic */ void m8442O0(PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel, boolean z, boolean z2) {
        phoneUpdateSmsValidationViewModel.m9667y0(z, z2);
    }

    /* renamed from: P0 */
    public static final /* synthetic */ PhoneManager m8441P0(PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel) {
        return phoneUpdateSmsValidationViewModel.f26666Q;
    }

    /* renamed from: Q0 */
    public static final /* synthetic */ void m8440Q0(PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel, boolean z, String str) {
        phoneUpdateSmsValidationViewModel.m9673M0(z, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m8439n0(bd.InterfaceC1886d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof sk.PhoneUpdateSmsValidationViewModel.C10237b
            if (r0 == 0) goto L13
            r0 = r9
            sk.c$b r0 = (sk.PhoneUpdateSmsValidationViewModel.C10237b) r0
            int r1 = r0.f26674z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26674z = r1
            goto L18
        L13:
            sk.c$b r0 = new sk.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26672x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f26674z
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L38
            if (r2 != r6) goto L30
            java.lang.Object r0 = r0.f26671w
            sk.c r0 = (sk.PhoneUpdateSmsValidationViewModel) r0
            p468yc.C13186n.m1453b(r9)
            goto L63
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            p468yc.C13186n.m1453b(r9)
            p343rk.SmsTokenViewModel.m9666z0(r8, r5, r5, r4, r3)
            mg.n0 r9 = r8.f26666Q
            pt.pingodoce.app.data.local.flows.FlowData r2 = r8.m34578S()
            pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData r2 = (pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData) r2
            java.lang.String r2 = r2.m14684d()
            androidx.lifecycle.e0 r7 = r8.m9682D0()
            java.lang.Object r7 = r7.mo172f()
            p181jd.Intrinsics.ifNullDoSomething(r7)
            java.lang.String r7 = (java.lang.String) r7
            r0.f26671w = r8
            r0.f26674z = r6
            java.lang.Object r9 = r9.m18661c(r2, r7, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            r0 = r8
        L63:
            mg.p0 r9 = (mg.AbstractC7377p0) r9
            boolean r1 = r9 instanceof mg.AbstractC7377p0.C7381b
            if (r1 == 0) goto L6f
            ci.a r9 = ci.C2136a.f6171a
            r0.m104v(r9)
            goto L82
        L6f:
            boolean r1 = r9 instanceof mg.AbstractC7377p0.AbstractC7378a
            if (r1 == 0) goto L82
            mg.p0$a r9 = (mg.AbstractC7377p0.AbstractC7378a) r9
            we.b r9 = r9.m18626a()
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto L82
            r0.m9673M0(r6, r9)
        L82:
            p343rk.SmsTokenViewModel.m9666z0(r0, r6, r5, r4, r3)
            yc.u r9 = p468yc.C13195u.f34156a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.PhoneUpdateSmsValidationViewModel.m8439n0(bd.d):java.lang.Object");
    }

    /* renamed from: x0 */
    public void m8438x0() {
        SmsTokenViewModel.m9666z0(this, false, false, 2, null);
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C10235a(null), 3, null);
    }
}
