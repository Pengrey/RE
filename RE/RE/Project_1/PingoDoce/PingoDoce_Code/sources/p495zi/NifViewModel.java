package p495zi;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import fm.C5577a;
import id.InterfaceC6108l;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: zi.d */
/* loaded from: classes2.dex */
public abstract class NifViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f35053C;

    /* renamed from: D */
    private C2381h f35054D;

    /* renamed from: E */
    private final Void f35055E;

    /* renamed from: F */
    private final C1436e0 f35056F;

    /* renamed from: G */
    private final C1436e0 f35057G;

    /* renamed from: H */
    private final C1430c0 f35058H;

    /* renamed from: I */
    private final C1436e0 f35059I;

    /* renamed from: J */
    private final C1436e0 f35060J;

    /* renamed from: K */
    private final C1436e0 f35061K;

    /* renamed from: L */
    private final LiveData f35062L;

    /* renamed from: M */
    private final LiveData f35063M;

    /* renamed from: N */
    private final C1436e0 f35064N;

    /* renamed from: O */
    private final C1430c0 f35065O;

    /* renamed from: P */
    private final LiveData f35066P;

    /* renamed from: Q */
    private final LiveData f35067Q;

    /* renamed from: R */
    private final boolean f35068R;

    /* renamed from: S */
    private final InterfaceC6108l f35069S;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NifViewModel.kt */
    /* renamed from: zi.d$a */
    /* loaded from: classes2.dex */
    public static final class C13932a extends AbstractC6438m implements InterfaceC6108l {
        C13932a() {
            super(1);
        }

        /* renamed from: a */
        public final void m61a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(NifViewModel.m64x0(NifViewModel.this), AnalyticEvents.AbstractC7780f.C7782a0.f20406b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            NifViewModel.this.m76K0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m61a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NifViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.nif.NifViewModel", m20196f = "NifViewModel.kt", m20195l = {79}, m20194m = "onSubmit$suspendImpl")
    /* renamed from: zi.d$b */
    /* loaded from: classes2.dex */
    public static final class C13933b extends AbstractC6757d {

        /* renamed from: w */
        Object f35071w;

        /* renamed from: x */
        /* synthetic */ Object f35072x;

        /* renamed from: z */
        int f35074z;

        C13933b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f35072x = obj;
            this.f35074z |= Integer.MIN_VALUE;
            return NifViewModel.m77J0(NifViewModel.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NifViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f35053C = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f35054D = c2381h;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f35056F = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f35057G = m37003d2;
        C1430c0 c1430c0 = new C1430c0();
        this.f35058H = c1430c0;
        C1436e0 c1436e0 = new C1436e0(Boolean.TRUE);
        this.f35059I = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_nif_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        this.f35060J = new C1436e0(string);
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_nif_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string2);
        this.f35061K = c1436e02;
        this.f35062L = m37003d;
        this.f35063M = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("EXTRA_FOR_NIF", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<…\"304519715\" else \"\"\n    )");
        this.f35064N = m37003d3;
        this.f35065O = c1430c0;
        this.f35066P = c1436e0;
        this.f35067Q = c1436e02;
        CharSequence charSequence = (CharSequence) c1436e02.mo172f();
        this.f35068R = !(charSequence == null || charSequence.length() == 0);
        this.f35069S = BaseViewModel.m113I(this, 0L, new C13932a(), 1, null);
        c1430c0.m37055q(m37003d3, new InterfaceC1440f0() { // from class: zi.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                NifViewModel.m65w0(NifViewModel.this, (String) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m77J0(p495zi.NifViewModel r7, bd.InterfaceC1886d r8) {
        /*
            boolean r0 = r8 instanceof p495zi.NifViewModel.C13933b
            if (r0 == 0) goto L13
            r0 = r8
            zi.d$b r0 = (p495zi.NifViewModel.C13933b) r0
            int r1 = r0.f35074z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35074z = r1
            goto L18
        L13:
            zi.d$b r0 = new zi.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35072x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f35074z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f35071w
            zi.d r7 = (p495zi.NifViewModel) r7
            p468yc.C13186n.m1453b(r8)
            goto L54
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p468yc.C13186n.m1453b(r8)
            androidx.lifecycle.e0 r8 = r7.f35064N
            java.lang.Object r8 = r8.mo172f()
            p181jd.Intrinsics.ifNullDoSomething(r8)
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = fm.C5577a.m23719a(r8, r3)
            if (r8 == 0) goto L64
            r0.f35071w = r7
            r0.f35074z = r3
            java.lang.Object r8 = r7.m73N0(r0)
            if (r8 != r1) goto L54
            return r1
        L54:
            mg.a r0 = r7.f35053C
            ng.a$f$z r1 = ng.AnalyticEvents.AbstractC7780f.C7856z.f20480b
            ng.c r2 = ng.EnumC7885c.Button
            ng.b r3 = ng.EnumC7884b.Click
            r4 = 0
            r5 = 8
            r6 = 0
            ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
            goto L82
        L64:
            r0 = r8 ^ 1
            if (r8 != 0) goto L7d
            u5.a r8 = r7.m20390g()
            r1 = 2131886340(0x7f120104, float:1.9407256E38)
            android.content.Context r8 = r8.m6899a()
            java.lang.String r8 = r8.getString(r1)
            java.lang.String r1 = "ctx.getString(id)"
            p181jd.Intrinsics.checkIfNull(r8, r1)
            goto L7f
        L7d:
            java.lang.String r8 = ""
        L7f:
            r7.m72O0(r0, r8)
        L82:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p495zi.NifViewModel.m77J0(zi.d, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m74M0(NifViewModel nifViewModel, View view) {
        Intrinsics.isThisObjectNull(nifViewModel, "this$0");
        nifViewModel.f35069S.mo9587d(C13195u.f34156a);
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m71P0(NifViewModel nifViewModel, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleError");
        }
        if ((i & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        nifViewModel.m72O0(z, str);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m67u0(NifViewModel nifViewModel, View view) {
        m74M0(nifViewModel, view);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m66v0(NifViewModel nifViewModel, String str) {
        m65w0(nifViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m65w0(NifViewModel nifViewModel, String str) {
        Intrinsics.isThisObjectNull(nifViewModel, "this$0");
        nifViewModel.m20319p0();
        nifViewModel.f35058H.mo166p(Boolean.valueOf(C5577a.m23719a(str, true)));
        m71P0(nifViewModel, false, null, 2, null);
    }

    /* renamed from: x0 */
    public static final /* synthetic */ AnalyticsManager m64x0(NifViewModel nifViewModel) {
        return nifViewModel.f35053C;
    }

    /* renamed from: A0 */
    public final LiveData m86A0() {
        return this.f35063M;
    }

    /* renamed from: B0 */
    protected Void m85B0() {
        return this.f35055E;
    }

    /* renamed from: C0 */
    public final C1436e0 m84C0() {
        return this.f35064N;
    }

    /* renamed from: D0 */
    public final boolean m83D0() {
        return this.f35068R;
    }

    /* renamed from: E0 */
    public final LiveData m82E0() {
        return this.f35067Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F0 */
    public final C1436e0 m81F0() {
        return this.f35059I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final C1436e0 m80G0() {
        return this.f35061K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H0 */
    public final C1436e0 m79H0() {
        return this.f35060J;
    }

    /* renamed from: I0 */
    public final LiveData m78I0() {
        return this.f35062L;
    }

    /* renamed from: K0 */
    protected void m76K0() {
    }

    /* renamed from: L0 */
    public final View.OnClickListener m75L0() {
        return new View.OnClickListener() { // from class: zi.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NifViewModel.m74M0(NifViewModel.this, view);
            }
        };
    }

    /* renamed from: N0 */
    public abstract Object m73N0(InterfaceC1886d interfaceC1886d);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O0 */
    public final void m72O0(boolean z, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f35056F.mo166p(Boolean.valueOf(z));
        this.f35057G.mo166p(str);
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m70f0() {
        return (Drawable) m85B0();
    }

    /* renamed from: g0 */
    protected C2381h m69g0() {
        return this.f35054D;
    }

    /* renamed from: n0 */
    protected Object m68n0(InterfaceC1886d interfaceC1886d) {
        return m77J0(this, interfaceC1886d);
    }

    /* renamed from: y0 */
    public final C1430c0 m63y0() {
        return this.f35065O;
    }

    /* renamed from: z0 */
    public final LiveData m62z0() {
        return this.f35066P;
    }
}
