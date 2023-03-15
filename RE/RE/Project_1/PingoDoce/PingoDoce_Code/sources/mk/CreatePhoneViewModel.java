package mk;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.PhoneManager;
import p181jd.Intrinsics;
import p187jk.PhoneViewModel;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;
import pt.pingodoce.app.data.remote.models.response.Consent;

/* renamed from: mk.c */
/* loaded from: classes2.dex */
public final class CreatePhoneViewModel extends PhoneViewModel {

    /* renamed from: V */
    private final PhoneManager f19804V;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CreatePhoneViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.phone.update.CreatePhoneViewModel", m20196f = "CreatePhoneViewModel.kt", m20195l = {43}, m20194m = "onSubmit")
    /* renamed from: mk.c$a */
    /* loaded from: classes2.dex */
    public static final class C7492a extends AbstractC6757d {

        /* renamed from: A */
        int f19805A;

        /* renamed from: w */
        Object f19806w;

        /* renamed from: x */
        Object f19807x;

        /* renamed from: y */
        /* synthetic */ Object f19808y;

        C7492a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19808y = obj;
            this.f19805A |= Integer.MIN_VALUE;
            return CreatePhoneViewModel.this.m18362n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePhoneViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, PhoneManager phoneManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(phoneManager, "phoneManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f19804V = phoneManager;
        C1436e0 m20723J0 = m20723J0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_create_phone_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m20723J0.mo166p(string);
        C1436e0 m20724I0 = m20724I0();
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_create_phone_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        m20724I0.mo166p(string2);
    }

    /* renamed from: S0 */
    protected void m18363S0(String str, Consent consent) {
        Intrinsics.isThisObjectNull(str, "phone");
        m34576U(new UpdatePhoneFlowData(str, ((UpdatePhoneFlowData) m34578S()).m14685b(), null, 4, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m18362n0(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mk.CreatePhoneViewModel.C7492a
            if (r0 == 0) goto L13
            r0 = r5
            mk.c$a r0 = (mk.CreatePhoneViewModel.C7492a) r0
            int r1 = r0.f19805A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19805A = r1
            goto L18
        L13:
            mk.c$a r0 = new mk.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19808y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19805A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f19807x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f19806w
            mk.c r0 = (mk.CreatePhoneViewModel) r0
            p468yc.C13186n.m1453b(r5)
            goto L5a
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            p468yc.C13186n.m1453b(r5)
            androidx.lifecycle.e0 r5 = r4.m20730C0()
            java.lang.Object r5 = r5.mo172f()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto La2
            mg.n0 r2 = r4.f19804V
            r0.f19806w = r4
            r0.f19807x = r5
            r0.f19805A = r3
            java.lang.Object r0 = r2.m18659e(r5, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r1 = r5
            r5 = r0
            r0 = r4
        L5a:
            mg.p0 r5 = (mg.AbstractC7377p0) r5
            boolean r2 = r5 instanceof mg.AbstractC7377p0.AbstractC7378a.C7380b
            if (r2 == 0) goto L73
            java.lang.String r5 = "phoneNumber"
            p181jd.Intrinsics.checkIfNull(r1, r5)
            r5 = 0
            r0.m18363S0(r1, r5)
            zh.i2 r5 = p494zh.C13848i2.f34956a
            pt.pingodoce.app.data.local.flows.FlowData r1 = r0.m34578S()
            r0.m120B(r5, r1)
            goto La2
        L73:
            boolean r1 = r5 instanceof mg.AbstractC7377p0.C7381b
            if (r1 == 0) goto L8f
            u5.a r5 = r0.m20390g()
            r1 = 2131886335(0x7f1200ff, float:1.9407246E38)
            android.content.Context r5 = r5.m6899a()
            java.lang.String r5 = r5.getString(r1)
            java.lang.String r1 = "ctx.getString(id)"
            p181jd.Intrinsics.checkIfNull(r5, r1)
            r0.m20718O0(r3, r5)
            goto La2
        L8f:
            boolean r1 = r5 instanceof mg.AbstractC7377p0.AbstractC7378a
            if (r1 == 0) goto La2
            mg.p0$a r5 = (mg.AbstractC7377p0.AbstractC7378a) r5
            we.b r5 = r5.m18626a()
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto La2
            r0.m20718O0(r3, r5)
        La2:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mk.CreatePhoneViewModel.m18362n0(bd.d):java.lang.Object");
    }
}
