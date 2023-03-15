package p451xi;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import java.util.List;
import ki.SubmitAnimatedViewModel;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.BaseViewModel;
import p494zh.C13873m0;
import pt.pingodoce.app.data.local.flows.FlowData;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* compiled from: LoyaltyCardResumeViewModel.kt */
/* renamed from: xi.e */
/* loaded from: classes2.dex */
public abstract class AbstractC12995e<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f33726C;

    /* renamed from: D */
    private final boolean f33727D;

    /* renamed from: E */
    private C2381h f33728E;

    /* renamed from: F */
    private final Void f33729F;

    /* renamed from: G */
    private final OnboardingFlowData f33730G;

    /* renamed from: H */
    private final C1436e0 f33731H;

    /* renamed from: I */
    private final LiveData f33732I;

    /* renamed from: J */
    private final C1436e0 f33733J;

    /* renamed from: K */
    private final LiveData f33734K;

    /* renamed from: L */
    private final C1436e0 f33735L;

    /* renamed from: M */
    private final C1436e0 f33736M;

    /* renamed from: N */
    private final C1436e0 f33737N;

    /* renamed from: O */
    private final C1436e0 f33738O;

    /* renamed from: P */
    private final LiveData f33739P;

    /* renamed from: Q */
    private final LiveData f33740Q;

    /* renamed from: R */
    private final LiveData f33741R;

    /* renamed from: S */
    private final InterfaceC6108l f33742S;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardResumeViewModel.kt */
    /* renamed from: xi.e$a */
    /* loaded from: classes2.dex */
    public static final class C12996a extends AbstractC6438m implements InterfaceC6108l {
        C12996a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1965a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (AbstractC12995e.m1969w0(AbstractC12995e.this).m14718i().size() == 1) {
                InterfaceC7886d.C7887a.m17629a(AbstractC12995e.m1970v0(AbstractC12995e.this), AnalyticEvents.AbstractC7780f.C7857z0.f20481b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            } else {
                InterfaceC7886d.C7887a.m17629a(AbstractC12995e.m1970v0(AbstractC12995e.this), AnalyticEvents.AbstractC7780f.C7795e1.f20419b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            }
            AbstractC12995e abstractC12995e = AbstractC12995e.this;
            abstractC12995e.m120B(C13873m0.f34989a, abstractC12995e.m1980D0());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1965a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12995e(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        String str;
        List m197g;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f33726C = analyticsManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f33728E = c2381h;
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) m34578S();
        this.f33730G = onboardingFlowData;
        LoyaltyCardResumeViewModel m14719h = onboardingFlowData.m14719h();
        C1436e0 m37003d = c1459l0.m37003d("_infoDescription", (m14719h == null || (str = m14719h.m12655a()) == null) ? BuildConfig.VERSION_NAME : str);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…eRow?.alertMessage ?: \"\")");
        this.f33731H = m37003d;
        this.f33732I = m37003d;
        LoyaltyCardResumeViewModel m14719h2 = onboardingFlowData.m14719h();
        C1436e0 m37003d2 = c1459l0.m37003d("_showAlertLabel", Boolean.valueOf(m14719h2 != null ? m14719h2.m12649h() : true));
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…owAlertContainer ?: true)");
        this.f33733J = m37003d2;
        this.f33734K = m37003d2;
        Boolean bool = (Boolean) c1459l0.m37005b("EXTRA_FOR_HIDE_TOOLBAR_IMAGE");
        this.f33735L = new C1436e0(bool == null ? Boolean.FALSE : bool);
        Boolean bool2 = (Boolean) c1459l0.m37005b("EXTRA_FOR_ONBOARDING_OVERRIDE_CARD");
        C1436e0 c1436e0 = new C1436e0(bool2 == null ? Boolean.FALSE : bool2);
        this.f33736M = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_onboarding_resume_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string);
        this.f33737N = c1436e02;
        m197g = C13780s.m197g();
        C1436e0 c1436e03 = new C1436e0(m197g);
        this.f33738O = c1436e03;
        this.f33739P = c1436e0;
        this.f33740Q = c1436e02;
        this.f33741R = c1436e03;
        this.f33742S = BaseViewModel.m113I(this, 0L, new C12996a(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m1974J0(AbstractC12995e abstractC12995e, View view) {
        Intrinsics.isThisObjectNull(abstractC12995e, "this$0");
        abstractC12995e.f33742S.mo9587d(C13195u.f34156a);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m1971u0(AbstractC12995e abstractC12995e, View view) {
        m1974J0(abstractC12995e, view);
    }

    /* renamed from: v0 */
    public static final /* synthetic */ AnalyticsManager m1970v0(AbstractC12995e abstractC12995e) {
        return abstractC12995e.f33726C;
    }

    /* renamed from: w0 */
    public static final /* synthetic */ OnboardingFlowData m1969w0(AbstractC12995e abstractC12995e) {
        return abstractC12995e.f33730G;
    }

    /* renamed from: A0 */
    public final LiveData m1983A0() {
        return this.f33734K;
    }

    /* renamed from: B0 */
    public boolean m1982B0() {
        return this.f33727D;
    }

    /* renamed from: C0 */
    public final LiveData m1981C0() {
        return this.f33739P;
    }

    /* renamed from: D0 */
    public abstract FlowData m1980D0();

    /* renamed from: E0 */
    public final LiveData m1979E0() {
        return this.f33740Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F0 */
    public final C1436e0 m1978F0() {
        return this.f33738O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final C1436e0 m1977G0() {
        return this.f33733J;
    }

    /* renamed from: H0 */
    public abstract View.OnClickListener m1976H0();

    /* renamed from: I0 */
    public View.OnClickListener m1975I0() {
        return new View.OnClickListener() { // from class: xi.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC12995e.m1974J0(AbstractC12995e.this, view);
            }
        };
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m1973f0() {
        return (Drawable) m1967y0();
    }

    /* renamed from: g0 */
    protected C2381h m1972g0() {
        return this.f33728E;
    }

    /* renamed from: x0 */
    public final LiveData m1968x0() {
        return this.f33741R;
    }

    /* renamed from: y0 */
    protected Void m1967y0() {
        return this.f33729F;
    }

    /* renamed from: z0 */
    public final LiveData m1966z0() {
        return this.f33732I;
    }
}
