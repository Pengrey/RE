package p224lh;

import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.EmailManager;
import p181jd.Intrinsics;
import p278oi.EmailViewModel;
import p378u5.ResourcesProvider;

/* renamed from: lh.c */
/* loaded from: classes2.dex */
public final class EditEmailViewModel extends EmailViewModel {

    /* renamed from: R */
    private final EmailManager f18735R;

    /* renamed from: S */
    private boolean f18736S;

    /* renamed from: T */
    private C2381h f18737T;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditEmailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.profile.email.EditEmailViewModel", m20196f = "EditEmailViewModel.kt", m20195l = {42}, m20194m = "submitAction")
    /* renamed from: lh.c$a */
    /* loaded from: classes2.dex */
    public static final class C7056a extends AbstractC6757d {

        /* renamed from: A */
        int f18738A;

        /* renamed from: w */
        Object f18739w;

        /* renamed from: x */
        Object f18740x;

        /* renamed from: y */
        /* synthetic */ Object f18741y;

        C7056a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f18741y = obj;
            this.f18738A |= Integer.MIN_VALUE;
            return EditEmailViewModel.this.m19427H0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditEmailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, EmailManager emailManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(emailManager, "emailManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f18735R = emailManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_update));
        this.f18737T = c2381h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m19427H0(bd.InterfaceC1886d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p224lh.EditEmailViewModel.C7056a
            if (r0 == 0) goto L13
            r0 = r8
            lh.c$a r0 = (p224lh.EditEmailViewModel.C7056a) r0
            int r1 = r0.f18738A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18738A = r1
            goto L18
        L13:
            lh.c$a r0 = new lh.c$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18741y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18738A
            r3 = 0
            java.lang.String r4 = "EXTRA_FOR_EMAIL"
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 != r6) goto L35
            java.lang.Object r1 = r0.f18740x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f18739w
            lh.c r0 = (p224lh.EditEmailViewModel) r0
            p468yc.C13186n.m1453b(r8)
            goto L72
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            p468yc.C13186n.m1453b(r8)
            androidx.lifecycle.e0 r8 = r7.m16923x0()
            java.lang.Object r8 = r8.mo172f()
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L9d
            boolean r2 = r7.f18736S
            if (r2 == 0) goto L60
            le.a r0 = p221le.UiEventsLiveData.f18671a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r4, r8)
            yc.u r8 = p468yc.C13195u.f34156a
            p221le.UiEventsLiveData.m19517m(r0, r5, r1, r6, r3)
            goto L9d
        L60:
            mg.v r2 = r7.f18735R
            r0.f18739w = r7
            r0.f18740x = r8
            r0.f18738A = r6
            java.lang.Object r0 = r2.m18453d(r8, r0)
            if (r0 != r1) goto L6f
            return r1
        L6f:
            r1 = r8
            r8 = r0
            r0 = r7
        L72:
            mg.x r8 = (mg.AbstractC7468x) r8
            boolean r2 = r8 instanceof mg.AbstractC7468x.C7472b
            if (r2 == 0) goto L88
            le.a r8 = p221le.UiEventsLiveData.f18671a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtra(r4, r1)
            yc.u r1 = p468yc.C13195u.f34156a
            p221le.UiEventsLiveData.m19517m(r8, r5, r0, r6, r3)
            goto L9d
        L88:
            boolean r1 = r8 instanceof mg.AbstractC7468x.AbstractC7469a.C7470a
            if (r1 == 0) goto L9d
            mg.x$a$a r8 = (mg.AbstractC7468x.AbstractC7469a.C7470a) r8
            we.b r8 = r8.m18430a()
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L9a
            java.lang.String r8 = ""
        L9a:
            r0.m16931I0(r6, r8)
        L9d:
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p224lh.EditEmailViewModel.m19427H0(bd.d):java.lang.Object");
    }

    /* renamed from: g0 */
    protected C2381h m19426g0() {
        return this.f18737T;
    }
}
