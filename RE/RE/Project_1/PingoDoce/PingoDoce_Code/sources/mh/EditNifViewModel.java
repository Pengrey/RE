package mh;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.NifManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p495zi.NifViewModel;

/* renamed from: mh.c */
/* loaded from: classes2.dex */
public final class EditNifViewModel extends NifViewModel {

    /* renamed from: T */
    private final NifManager f19767T;

    /* renamed from: U */
    private final AnalyticsManager f19768U;

    /* renamed from: V */
    private boolean f19769V;

    /* renamed from: W */
    private C2381h f19770W;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditNifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.nif.EditNifViewModel", m20196f = "EditNifViewModel.kt", m20195l = {57}, m20194m = "submitAction")
    /* renamed from: mh.c$a */
    /* loaded from: classes2.dex */
    public static final class C7479a extends AbstractC6757d {

        /* renamed from: A */
        int f19771A;

        /* renamed from: w */
        Object f19772w;

        /* renamed from: x */
        Object f19773x;

        /* renamed from: y */
        /* synthetic */ Object f19774y;

        C7479a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19774y = obj;
            this.f19771A |= Integer.MIN_VALUE;
            return EditNifViewModel.this.m18401N0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditNifViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, NifManager nifManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(nifManager, "nifManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f19767T = nifManager;
        this.f19768U = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_update));
        this.f19770W = c2381h;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7847w.f20471b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        C1436e0 m79H0 = m79H0();
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_profile_my_nif);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m79H0.mo166p(string);
        m80G0().mo166p(BuildConfig.VERSION_NAME);
        m81F0().mo166p(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m18401N0(bd.InterfaceC1886d r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof mh.EditNifViewModel.C7479a
            if (r0 == 0) goto L13
            r0 = r15
            mh.c$a r0 = (mh.EditNifViewModel.C7479a) r0
            int r1 = r0.f19771A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19771A = r1
            goto L18
        L13:
            mh.c$a r0 = new mh.c$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f19774y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19771A
            r3 = 0
            java.lang.String r4 = "EXTRA_FOR_NIF"
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 != r6) goto L35
            java.lang.Object r1 = r0.f19773x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f19772w
            mh.c r0 = (mh.EditNifViewModel) r0
            p468yc.C13186n.m1453b(r15)
            goto L72
        L35:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3d:
            p468yc.C13186n.m1453b(r15)
            androidx.lifecycle.e0 r15 = r14.m84C0()
            java.lang.Object r15 = r15.mo172f()
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto Lac
            boolean r2 = r14.f19769V
            if (r2 == 0) goto L60
            le.a r0 = p221le.UiEventsLiveData.f18671a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r4, r15)
            yc.u r15 = p468yc.C13195u.f34156a
            p221le.UiEventsLiveData.m19517m(r0, r5, r1, r6, r3)
            goto Lac
        L60:
            mg.f0 r2 = r14.f19767T
            r0.f19772w = r14
            r0.f19773x = r15
            r0.f19771A = r6
            java.lang.Object r0 = r2.m18861a(r15, r0)
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r1 = r15
            r15 = r0
            r0 = r14
        L72:
            mg.h0 r15 = (mg.AbstractC7286h0) r15
            boolean r2 = r15 instanceof mg.AbstractC7286h0.C7288b
            if (r2 == 0) goto L88
            le.a r15 = p221le.UiEventsLiveData.f18671a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r4, r1)
            yc.u r1 = p468yc.C13195u.f34156a
            p221le.UiEventsLiveData.m19517m(r15, r5, r0, r6, r3)
            goto Lac
        L88:
            boolean r1 = r15 instanceof mg.AbstractC7286h0.AbstractC7287a
            if (r1 == 0) goto Lac
            mg.a r7 = r0.f19768U
            ng.a$f$y r8 = ng.AnalyticEvents.AbstractC7780f.C7853y.f20477b
            ng.c r9 = ng.EnumC7885c.Error
            ng.b r10 = ng.EnumC7884b.View
            r11 = 0
            r12 = 8
            r13 = 0
            ng.InterfaceC7886d.C7887a.m17629a(r7, r8, r9, r10, r11, r12, r13)
            mg.h0$a r15 = (mg.AbstractC7286h0.AbstractC7287a) r15
            we.b r15 = r15.m18789a()
            java.lang.String r15 = r15.getMessage()
            if (r15 != 0) goto La9
            java.lang.String r15 = ""
        La9:
            r0.m72O0(r6, r15)
        Lac:
            yc.u r15 = p468yc.C13195u.f34156a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.EditNifViewModel.m18401N0(bd.d):java.lang.Object");
    }

    /* renamed from: g0 */
    protected C2381h m18400g0() {
        return this.f19770W;
    }
}
