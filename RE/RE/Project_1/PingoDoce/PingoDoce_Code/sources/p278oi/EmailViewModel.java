package p278oi;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: oi.c */
/* loaded from: classes2.dex */
public abstract class EmailViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f20899C;

    /* renamed from: D */
    private C2381h f20900D;

    /* renamed from: E */
    private final Void f20901E;

    /* renamed from: F */
    private final C1436e0 f20902F;

    /* renamed from: G */
    private final C1436e0 f20903G;

    /* renamed from: H */
    private final C1430c0 f20904H;

    /* renamed from: I */
    private final C1436e0 f20905I;

    /* renamed from: J */
    private final C1436e0 f20906J;

    /* renamed from: K */
    private final LiveData f20907K;

    /* renamed from: L */
    private final LiveData f20908L;

    /* renamed from: M */
    private final C1436e0 f20909M;

    /* renamed from: N */
    private final C1430c0 f20910N;

    /* renamed from: O */
    private final LiveData f20911O;

    /* renamed from: P */
    private final LiveData f20912P;

    /* renamed from: Q */
    private final InterfaceC6108l f20913Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailViewModel.kt */
    /* renamed from: oi.c$a */
    /* loaded from: classes2.dex */
    public static final class C8089a extends AbstractC6438m implements InterfaceC6108l {
        C8089a() {
            super(1);
        }

        /* renamed from: a */
        public final void m16920a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            EmailViewModel.this.m16933G0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m16920a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.email.EmailViewModel", m20196f = "EmailViewModel.kt", m20195l = {66}, m20194m = "onSubmit$suspendImpl")
    /* renamed from: oi.c$b */
    /* loaded from: classes2.dex */
    public static final class C8090b extends AbstractC6757d {

        /* renamed from: w */
        Object f20915w;

        /* renamed from: x */
        /* synthetic */ Object f20916x;

        /* renamed from: z */
        int f20918z;

        C8090b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f20916x = obj;
            this.f20918z |= Integer.MIN_VALUE;
            return EmailViewModel.m16934F0(EmailViewModel.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f20899C = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f20900D = c2381h;
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f20902F = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f20903G = m37003d2;
        C1430c0 c1430c0 = new C1430c0();
        this.f20904H = c1430c0;
        C1436e0 c1436e0 = new C1436e0(bool);
        this.f20905I = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_email_subtitle);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string);
        this.f20906J = c1436e02;
        this.f20907K = m37003d;
        this.f20908L = m37003d2;
        C1436e0 m37004c = c1459l0.m37004c("EXTRA_FOR_EMAIL");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<String>(EXTRA_FOR_EMAIL)");
        this.f20909M = m37004c;
        this.f20910N = c1430c0;
        this.f20911O = c1436e0;
        this.f20912P = c1436e02;
        this.f20913Q = BaseViewModel.m113I(this, 0L, new C8089a(), 1, null);
        c1430c0.m37055q(m37004c, new InterfaceC1440f0() { // from class: oi.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                EmailViewModel.m16925v0(EmailViewModel.this, (String) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m16934F0(p278oi.EmailViewModel r7, bd.InterfaceC1886d r8) {
        /*
            boolean r0 = r8 instanceof p278oi.EmailViewModel.C8090b
            if (r0 == 0) goto L13
            r0 = r8
            oi.c$b r0 = (p278oi.EmailViewModel.C8090b) r0
            int r1 = r0.f20918z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20918z = r1
            goto L18
        L13:
            oi.c$b r0 = new oi.c$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20916x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f20918z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f20915w
            oi.c r7 = (p278oi.EmailViewModel) r7
            p468yc.C13186n.m1453b(r8)
            goto L78
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p468yc.C13186n.m1453b(r8)
            java.util.regex.Pattern r8 = android.util.Patterns.EMAIL_ADDRESS
            androidx.lifecycle.e0 r2 = r7.f20909M
            java.lang.Object r2 = r2.mo172f()
            p181jd.Intrinsics.ifNullDoSomething(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r8 = r8.matches()
            r2 = r8 ^ 1
            if (r8 != 0) goto L66
            u5.a r4 = r7.m20390g()
            r5 = 2131886339(0x7f120103, float:1.9407254E38)
            android.content.Context r4 = r4.m6899a()
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "ctx.getString(id)"
            p181jd.Intrinsics.checkIfNull(r4, r5)
            goto L68
        L66:
            java.lang.String r4 = ""
        L68:
            r7.m16931I0(r2, r4)
            if (r8 == 0) goto L87
            r0.f20915w = r7
            r0.f20918z = r3
            java.lang.Object r8 = r7.m16932H0(r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            mg.a r0 = r7.f20899C
            ng.a$f$n r1 = ng.AnalyticEvents.AbstractC7780f.C7820n.f20444b
            ng.c r2 = ng.EnumC7885c.Button
            ng.b r3 = ng.EnumC7884b.Click
            r4 = 0
            r5 = 8
            r6 = 0
            ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
        L87:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p278oi.EmailViewModel.m16934F0(oi.c, bd.d):java.lang.Object");
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m16930J0(EmailViewModel emailViewModel, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleError");
        }
        if ((i & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        emailViewModel.m16931I0(z, str);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m16926u0(EmailViewModel emailViewModel, String str) {
        m16925v0(emailViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m16925v0(EmailViewModel emailViewModel, String str) {
        Intrinsics.isThisObjectNull(emailViewModel, "this$0");
        emailViewModel.m20319p0();
        emailViewModel.f20904H.mo166p(Boolean.valueOf(!(str == null || str.length() == 0)));
        m16930J0(emailViewModel, false, null, 2, null);
    }

    /* renamed from: A0 */
    public final LiveData m16939A0() {
        return this.f20911O;
    }

    /* renamed from: B0 */
    public final LiveData m16938B0() {
        return this.f20912P;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C0 */
    public final C1436e0 m16937C0() {
        return this.f20905I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D0 */
    public final C1436e0 m16936D0() {
        return this.f20906J;
    }

    /* renamed from: E0 */
    public final LiveData m16935E0() {
        return this.f20907K;
    }

    /* renamed from: G0 */
    protected void m16933G0() {
    }

    /* renamed from: H0 */
    public abstract Object m16932H0(InterfaceC1886d interfaceC1886d);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I0 */
    public final void m16931I0(boolean z, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f20902F.mo166p(Boolean.valueOf(z));
        this.f20903G.mo166p(str);
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m16929f0() {
        return (Drawable) m16921z0();
    }

    /* renamed from: g0 */
    protected C2381h m16928g0() {
        return this.f20900D;
    }

    /* renamed from: n0 */
    protected Object m16927n0(InterfaceC1886d interfaceC1886d) {
        return m16934F0(this, interfaceC1886d);
    }

    /* renamed from: w0 */
    public final C1430c0 m16924w0() {
        return this.f20910N;
    }

    /* renamed from: x0 */
    public final C1436e0 m16923x0() {
        return this.f20909M;
    }

    /* renamed from: y0 */
    public final LiveData m16922y0() {
        return this.f20908L;
    }

    /* renamed from: z0 */
    protected Void m16921z0() {
        return this.f20901E;
    }
}
