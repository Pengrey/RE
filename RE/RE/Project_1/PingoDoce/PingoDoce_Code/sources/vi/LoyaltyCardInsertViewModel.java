package vi;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import ki.SubmitAnimatedViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: vi.e */
/* loaded from: classes2.dex */
public abstract class LoyaltyCardInsertViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f29168C;

    /* renamed from: D */
    private C2381h f29169D;

    /* renamed from: E */
    private final Void f29170E;

    /* renamed from: F */
    private final C1436e0 f29171F;

    /* renamed from: G */
    private final C1436e0 f29172G;

    /* renamed from: H */
    private final C1430c0 f29173H;

    /* renamed from: I */
    private final LiveData f29174I;

    /* renamed from: J */
    private final LiveData f29175J;

    /* renamed from: K */
    private final C1430c0 f29176K;

    /* renamed from: L */
    private final C1436e0 f29177L;

    /* compiled from: LoyaltyCardInsertViewModel.kt */
    /* renamed from: vi.e$a */
    /* loaded from: classes2.dex */
    public static final class C11368a {
        private C11368a() {
        }

        public /* synthetic */ C11368a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11368a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyCardInsertViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f29168C = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_confirm));
        this.f29169D = c2381h;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f29171F = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f29172G = m37003d2;
        C1430c0 c1430c0 = new C1430c0();
        this.f29173H = c1430c0;
        this.f29174I = m37003d;
        this.f29175J = m37003d2;
        this.f29176K = c1430c0;
        C1436e0 m37003d3 = c1459l0.m37003d("cardNumber", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<String>(\"cardNumber\", \"\")");
        this.f29177L = m37003d3;
        c1430c0.m37055q(m37003d3, new InterfaceC1440f0() { // from class: vi.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoyaltyCardInsertViewModel.m5313v0(LoyaltyCardInsertViewModel.this, (String) obj);
            }
        });
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m5317D0(LoyaltyCardInsertViewModel loyaltyCardInsertViewModel, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleError");
        }
        if ((i & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        loyaltyCardInsertViewModel.m5318C0(z, str);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m5314u0(LoyaltyCardInsertViewModel loyaltyCardInsertViewModel, String str) {
        m5313v0(loyaltyCardInsertViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static final void m5313v0(LoyaltyCardInsertViewModel loyaltyCardInsertViewModel, String str) {
        Intrinsics.isThisObjectNull(loyaltyCardInsertViewModel, "this$0");
        loyaltyCardInsertViewModel.m20319p0();
        C1430c0 c1430c0 = loyaltyCardInsertViewModel.f29173H;
        boolean z = true;
        if ((str == null || str.length() == 0) || str.length() != 15) {
            z = false;
        }
        c1430c0.mo166p(Boolean.valueOf(z));
        m5317D0(loyaltyCardInsertViewModel, false, null, 2, null);
    }

    /* renamed from: A0 */
    public final LiveData m5320A0() {
        return this.f29174I;
    }

    /* renamed from: B0 */
    public final void m5319B0() {
        InterfaceC7886d.C7887a.m17629a(this.f29168C, AnalyticEvents.AbstractC7750e.C7757d.f20382b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C0 */
    public final void m5318C0(boolean z, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f29171F.mo166p(Boolean.valueOf(z));
        this.f29172G.mo166p(str);
        m20319p0();
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m5316f0() {
        return (Drawable) m5309z0();
    }

    /* renamed from: g0 */
    protected C2381h m5315g0() {
        return this.f29169D;
    }

    /* renamed from: w0 */
    public final C1430c0 m5312w0() {
        return this.f29176K;
    }

    /* renamed from: x0 */
    public final C1436e0 m5311x0() {
        return this.f29177L;
    }

    /* renamed from: y0 */
    public final LiveData m5310y0() {
        return this.f29175J;
    }

    /* renamed from: z0 */
    protected Void m5309z0() {
        return this.f29170E;
    }
}
