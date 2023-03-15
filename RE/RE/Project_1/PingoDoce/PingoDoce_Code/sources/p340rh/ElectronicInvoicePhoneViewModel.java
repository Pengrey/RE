package p340rh;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.AnalyticsManager;
import mg.LoyaltyCardManager;
import p181jd.Intrinsics;
import p187jk.PhoneViewModel;
import p378u5.ResourcesProvider;
import p468yc.C13195u;

/* renamed from: rh.c */
/* loaded from: classes2.dex */
public final class ElectronicInvoicePhoneViewModel extends PhoneViewModel {

    /* renamed from: V */
    private final LoyaltyCardManager f25891V;

    /* renamed from: W */
    private final LiveData f25892W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ElectronicInvoicePhoneViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.phone.ElectronicInvoicePhoneViewModel", m20196f = "ElectronicInvoicePhoneViewModel.kt", m20195l = {46}, m20194m = "onSubmit")
    /* renamed from: rh.c$a */
    /* loaded from: classes2.dex */
    public static final class C9901a extends AbstractC6757d {

        /* renamed from: A */
        int f25893A;

        /* renamed from: w */
        Object f25894w;

        /* renamed from: x */
        Object f25895x;

        /* renamed from: y */
        /* synthetic */ Object f25896y;

        C9901a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25896y = obj;
            this.f25893A |= Integer.MIN_VALUE;
            return ElectronicInvoicePhoneViewModel.this.m9734n0(this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: rh.c$b */
    /* loaded from: classes2.dex */
    public static final class C9902b implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f25898w;

        /* compiled from: Emitters.kt */
        /* renamed from: rh.c$b$a */
        /* loaded from: classes2.dex */
        public static final class C9903a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f25899w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.phone.ElectronicInvoicePhoneViewModel$special$$inlined$map$1$2", m20196f = "ElectronicInvoicePhoneViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: rh.c$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C9904a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f25900w;

                /* renamed from: x */
                int f25901x;

                public C9904a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f25900w = obj;
                    this.f25901x |= Integer.MIN_VALUE;
                    return C9903a.this.mo4529a(null, this);
                }
            }

            public C9903a(InterfaceC6787d interfaceC6787d) {
                this.f25899w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p340rh.ElectronicInvoicePhoneViewModel.C9902b.C9903a.C9904a
                    if (r0 == 0) goto L13
                    r0 = r6
                    rh.c$b$a$a r0 = (p340rh.ElectronicInvoicePhoneViewModel.C9902b.C9903a.C9904a) r0
                    int r1 = r0.f25901x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25901x = r1
                    goto L18
                L13:
                    rh.c$b$a$a r0 = new rh.c$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f25900w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f25901x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f25899w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    pt.pingodoce.app.data.remote.models.response.CardStatusPayload r5 = r5.m13822H()
                    if (r5 == 0) goto L44
                    java.lang.String r5 = r5.m13891b()
                    if (r5 != 0) goto L46
                L44:
                    java.lang.String r5 = ""
                L46:
                    r0.f25901x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p340rh.ElectronicInvoicePhoneViewModel.C9902b.C9903a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C9902b(InterfaceC6785c interfaceC6785c) {
            this.f25898w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f25898w.mo20086d(new C9903a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectronicInvoicePhoneViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f25891V = loyaltyCardManager;
        C1436e0 m20723J0 = m20723J0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_electronic_input_phone_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m20723J0.mo166p(string);
        C1436e0 m20724I0 = m20724I0();
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_electronic_input_phone_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        m20724I0.mo166p(string2);
        m20727F0().mo166p(Boolean.TRUE);
        m20725H0().mo166p(Boolean.FALSE);
        this.f25892W = m106t(new C9902b(loyaltyCardManager.m18930p()));
    }

    /* renamed from: B0 */
    public LiveData m9735B0() {
        return this.f25892W;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m9734n0(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p340rh.ElectronicInvoicePhoneViewModel.C9901a
            if (r0 == 0) goto L13
            r0 = r6
            rh.c$a r0 = (p340rh.ElectronicInvoicePhoneViewModel.C9901a) r0
            int r1 = r0.f25893A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25893A = r1
            goto L18
        L13:
            rh.c$a r0 = new rh.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25896y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f25893A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f25895x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f25894w
            rh.c r0 = (p340rh.ElectronicInvoicePhoneViewModel) r0
            p468yc.C13186n.m1453b(r6)
            goto L5a
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            p468yc.C13186n.m1453b(r6)
            androidx.lifecycle.e0 r6 = r5.m20730C0()
            java.lang.Object r6 = r6.mo172f()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L9f
            mg.c0 r2 = r5.f25891V
            r0.f25894w = r5
            r0.f25895x = r6
            r0.f25893A = r3
            java.lang.Object r0 = r2.m18932n(r6, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r1 = r6
            r6 = r0
            r0 = r5
        L5a:
            mg.u r6 = (mg.AbstractC7425u) r6
            boolean r2 = r6 instanceof mg.AbstractC7425u.C7428b
            if (r2 == 0) goto L8c
            mg.u$b r6 = (mg.AbstractC7425u.C7428b) r6
            pt.pingodoce.app.data.remote.models.response.ElectronicInvoice r6 = r6.m18462a()
            pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData r2 = new pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData
            java.lang.String r3 = "phoneNumber"
            p181jd.Intrinsics.checkIfNull(r1, r3)
            java.lang.String r3 = r6.m13849b()
            java.lang.String r4 = r6.m13850a()
            boolean r6 = r6.m13847d()
            r2.<init>(r1, r3, r4, r6)
            r0.m34576U(r2)
            zh.h0 r6 = p494zh.C13841h0.f34949a
            pt.pingodoce.app.data.local.flows.FlowData r1 = r0.m34578S()
            r0.m120B(r6, r1)
            r0.m20319p0()
            goto L9f
        L8c:
            boolean r1 = r6 instanceof mg.AbstractC7425u.AbstractC7426a.C7427a
            if (r1 == 0) goto L9f
            mg.u$a$a r6 = (mg.AbstractC7425u.AbstractC7426a.C7427a) r6
            we.b r6 = r6.m18463a()
            java.lang.String r6 = r6.getMessage()
            if (r6 == 0) goto L9f
            r0.m20718O0(r3, r6)
        L9f:
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p340rh.ElectronicInvoicePhoneViewModel.m9734n0(bd.d):java.lang.Object");
    }
}
