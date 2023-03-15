package p318qh;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;
import p278oi.EmailViewModel;
import p378u5.ResourcesProvider;

/* renamed from: qh.h */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceEmailViewModel extends EmailViewModel {

    /* renamed from: R */
    private final LoyaltyCardManager f25607R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ElectronicInvoiceEmailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.email.ElectronicInvoiceEmailViewModel", m20196f = "ElectronicInvoiceEmailViewModel.kt", m20195l = {35}, m20194m = "submitAction")
    /* renamed from: qh.h$a */
    /* loaded from: classes2.dex */
    public static final class C9736a extends AbstractC6757d {

        /* renamed from: w */
        Object f25608w;

        /* renamed from: x */
        /* synthetic */ Object f25609x;

        /* renamed from: z */
        int f25611z;

        C9736a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25609x = obj;
            this.f25611z |= Integer.MIN_VALUE;
            return ElectronicInvoiceEmailViewModel.this.m10077H0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectronicInvoiceEmailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7405s1 c7405s1, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        String str;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f25607R = loyaltyCardManager;
        C1436e0 m16936D0 = m16936D0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_electronic_input_email);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m16936D0.mo166p(string);
        C1436e0 m16923x0 = m16923x0();
        User m18502h = c7405s1.m18502h();
        m16923x0.mo166p((m18502h == null || (str = m18502h.m18186f()) == null) ? BuildConfig.VERSION_NAME : str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m10077H0(bd.InterfaceC1886d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p318qh.ElectronicInvoiceEmailViewModel.C9736a
            if (r0 == 0) goto L13
            r0 = r10
            qh.h$a r0 = (p318qh.ElectronicInvoiceEmailViewModel.C9736a) r0
            int r1 = r0.f25611z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25611z = r1
            goto L18
        L13:
            qh.h$a r0 = new qh.h$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f25609x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f25611z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f25608w
            qh.h r0 = (p318qh.ElectronicInvoiceEmailViewModel) r0
            p468yc.C13186n.m1453b(r10)
            goto L5c
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            p468yc.C13186n.m1453b(r10)
            androidx.lifecycle.e0 r10 = r9.m16923x0()
            java.lang.Object r10 = r10.mo172f()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto La6
            mg.c0 r2 = r9.f25607R
            pt.pingodoce.app.data.local.flows.FlowData r4 = r9.m34578S()
            pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData r4 = (pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData) r4
            java.lang.String r4 = r4.m14759b()
            r0.f25608w = r9
            r0.f25611z = r3
            java.lang.Object r10 = r2.m18939g(r4, r10, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            r0 = r9
        L5c:
            mg.u r10 = (mg.AbstractC7425u) r10
            boolean r1 = r10 instanceof mg.AbstractC7425u.C7428b
            if (r1 == 0) goto L93
            pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData r1 = new pt.pingodoce.app.data.local.flows.ElectronicInvoiceFlowData
            mg.u$b r10 = (mg.AbstractC7425u.C7428b) r10
            pt.pingodoce.app.data.remote.models.response.ElectronicInvoice r2 = r10.m18462a()
            java.lang.String r3 = r2.m13848c()
            pt.pingodoce.app.data.remote.models.response.ElectronicInvoice r2 = r10.m18462a()
            java.lang.String r4 = r2.m13849b()
            pt.pingodoce.app.data.remote.models.response.ElectronicInvoice r10 = r10.m18462a()
            java.lang.String r5 = r10.m13850a()
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.m34576U(r1)
            zh.j0 r10 = p494zh.C13851j0.f34959a
            pt.pingodoce.app.data.local.flows.FlowData r1 = r0.m34578S()
            r0.m120B(r10, r1)
            goto La6
        L93:
            boolean r1 = r10 instanceof mg.AbstractC7425u.AbstractC7426a.C7427a
            if (r1 == 0) goto La6
            r1 = 0
            r2 = 2
            r3 = 0
            p278oi.EmailViewModel.m16930J0(r0, r1, r3, r2, r3)
            mg.u$a$a r10 = (mg.AbstractC7425u.AbstractC7426a.C7427a) r10
            we.b r10 = r10.m18463a()
            r0.m109l(r10)
        La6:
            yc.u r10 = p468yc.C13195u.f34156a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p318qh.ElectronicInvoiceEmailViewModel.m10077H0(bd.d):java.lang.Object");
    }
}
