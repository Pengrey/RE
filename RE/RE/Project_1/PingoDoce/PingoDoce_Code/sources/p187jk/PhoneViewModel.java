package p187jk;

import android.view.View;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import be.UtilsExtensions;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import ki.SubmitAnimatedViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.AnalyticsManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;

/* renamed from: jk.g */
/* loaded from: classes2.dex */
public abstract class PhoneViewModel<F extends PhoneFlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final C1436e0 f17664C;

    /* renamed from: D */
    private final C1436e0 f17665D;

    /* renamed from: E */
    private final C1436e0 f17666E;

    /* renamed from: F */
    private final C1436e0 f17667F;

    /* renamed from: G */
    private final C1436e0 f17668G;

    /* renamed from: H */
    private final C1436e0 f17669H;

    /* renamed from: I */
    private final C1436e0 f17670I;

    /* renamed from: J */
    private final C1430c0 f17671J;

    /* renamed from: K */
    private final LiveData f17672K;

    /* renamed from: L */
    private final LiveData f17673L;

    /* renamed from: M */
    private final LiveData f17674M;

    /* renamed from: N */
    private final LiveData f17675N;

    /* renamed from: O */
    private final LiveData f17676O;

    /* renamed from: P */
    private final LiveData f17677P;

    /* renamed from: Q */
    private final LiveData f17678Q;

    /* renamed from: R */
    private final C1430c0 f17679R;

    /* renamed from: S */
    private final LiveData f17680S;

    /* renamed from: T */
    private final C1436e0 f17681T;

    /* renamed from: U */
    private final InterfaceC6108l f17682U;

    /* compiled from: PhoneViewModel.kt */
    /* renamed from: jk.g$a */
    /* loaded from: classes2.dex */
    public static final class C6523a {
        private C6523a() {
        }

        public /* synthetic */ C6523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneViewModel.kt */
    /* renamed from: jk.g$b */
    /* loaded from: classes2.dex */
    public static final class C6524b extends AbstractC6438m implements InterfaceC6108l {
        C6524b() {
            super(1);
        }

        /* renamed from: a */
        public final void m20708a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            PhoneViewModel.this.m20715R0();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20708a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C6523a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        C1436e0 c1436e0 = new C1436e0();
        this.f17664C = c1436e0;
        C1436e0 c1436e02 = new C1436e0(BuildConfig.VERSION_NAME);
        this.f17665D = c1436e02;
        Boolean bool = Boolean.FALSE;
        C1436e0 c1436e03 = new C1436e0(bool);
        this.f17666E = c1436e03;
        C1436e0 c1436e04 = new C1436e0(bool);
        this.f17667F = c1436e04;
        C1436e0 c1436e05 = new C1436e0(Boolean.TRUE);
        this.f17668G = c1436e05;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled ", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…_isErrorEnabled \", false)");
        this.f17669H = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorMessage ", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<…ng>(\"_errorMessage \", \"\")");
        this.f17670I = m37003d2;
        C1430c0 c1430c0 = new C1430c0();
        this.f17671J = c1430c0;
        Intrinsics.checkIfNull(c1459l0.m37003d("_isTermClicked ", bool), "stateHandle.getLiveData<…\"_isTermClicked \", false)");
        this.f17672K = c1436e0;
        this.f17673L = c1436e02;
        this.f17674M = c1436e03;
        this.f17675N = c1436e04;
        this.f17676O = c1436e05;
        this.f17677P = m37003d;
        this.f17678Q = m37003d2;
        this.f17679R = c1430c0;
        this.f17680S = new C1436e0(BuildConfig.VERSION_NAME);
        C1436e0 m37003d3 = c1459l0.m37003d("phoneNumber", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<String>(\"phoneNumber\", \"\")");
        this.f17681T = m37003d3;
        this.f17682U = BaseViewModel.m113I(this, 0L, new C6524b(), 1, null);
        c1430c0.m37055q(m37003d3, new InterfaceC1440f0() { // from class: jk.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PhoneViewModel.m20712w0(PhoneViewModel.this, (String) obj);
            }
        });
    }

    /* renamed from: L0 */
    private final boolean m20721L0() {
        String str = (String) this.f17681T.mo172f();
        if (str == null) {
            str = BuildConfig.VERSION_NAME;
        }
        return UtilsExtensions.m35165g(str).length() == 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static final void m20716Q0(PhoneViewModel phoneViewModel, View view) {
        Intrinsics.isThisObjectNull(phoneViewModel, "this$0");
        phoneViewModel.f17682U.mo9587d(C13195u.f34156a);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m20714u0(PhoneViewModel phoneViewModel, String str) {
        m20712w0(phoneViewModel, str);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m20713v0(PhoneViewModel phoneViewModel, View view) {
        m20716Q0(phoneViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m20712w0(PhoneViewModel phoneViewModel, String str) {
        Intrinsics.isThisObjectNull(phoneViewModel, "this$0");
        if (str != null) {
            boolean m20721L0 = phoneViewModel.m20721L0();
            phoneViewModel.f17671J.mo166p(Boolean.valueOf(m20721L0));
            phoneViewModel.m20711x0(str);
            if (m20721L0) {
                phoneViewModel.m20325j0().mo9587d(C13195u.f34156a);
            }
        }
        phoneViewModel.m20319p0();
    }

    /* renamed from: x0 */
    private final void m20711x0(String str) {
        if (UtilsExtensions.m35165g(str).length() < 9) {
            this.f17669H.mo166p(Boolean.FALSE);
        }
    }

    /* renamed from: A0 */
    public final LiveData m20732A0() {
        return this.f17674M;
    }

    /* renamed from: B0 */
    public LiveData m20731B0() {
        return this.f17680S;
    }

    /* renamed from: C0 */
    public final C1436e0 m20730C0() {
        return this.f17681T;
    }

    /* renamed from: D0 */
    public final LiveData m20729D0() {
        return this.f17673L;
    }

    /* renamed from: E0 */
    public final LiveData m20728E0() {
        return this.f17672K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F0 */
    public final C1436e0 m20727F0() {
        return this.f17666E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final C1436e0 m20726G0() {
        return this.f17667F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H0 */
    public final C1436e0 m20725H0() {
        return this.f17668G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I0 */
    public final C1436e0 m20724I0() {
        return this.f17665D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J0 */
    public final C1436e0 m20723J0() {
        return this.f17664C;
    }

    /* renamed from: K0 */
    public final LiveData m20722K0() {
        return this.f17677P;
    }

    /* renamed from: M0 */
    public final LiveData m20720M0() {
        return this.f17675N;
    }

    /* renamed from: N0 */
    public final LiveData m20719N0() {
        return this.f17676O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O0 */
    public final void m20718O0(boolean z, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f17669H.mo166p(Boolean.valueOf(z));
        this.f17670I.mo166p(str);
    }

    /* renamed from: P0 */
    public final View.OnClickListener m20717P0() {
        return new View.OnClickListener() { // from class: jk.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneViewModel.m20716Q0(PhoneViewModel.this, view);
            }
        };
    }

    /* renamed from: R0 */
    protected void m20715R0() {
    }

    /* renamed from: y0 */
    public final C1430c0 m20710y0() {
        return this.f17679R;
    }

    /* renamed from: z0 */
    public final LiveData m20709z0() {
        return this.f17678Q;
    }
}
