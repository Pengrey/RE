package cl;

import android.view.View;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import ci.C2143g;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
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
import pt.pingodoce.app.data.local.flows.EnumC8682a;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;

/* renamed from: cl.d */
/* loaded from: classes2.dex */
public final class OnboardingSuccessViewModel extends FlowViewModel {

    /* renamed from: A */
    private final InterfaceC6108l f6269A;

    /* renamed from: q */
    private final AnalyticsManager f6270q;

    /* renamed from: r */
    private final C1436e0 f6271r;

    /* renamed from: s */
    private final C1436e0 f6272s;

    /* renamed from: t */
    private final C1436e0 f6273t;

    /* renamed from: u */
    private final C1436e0 f6274u;

    /* renamed from: v */
    private final C1436e0 f6275v;

    /* renamed from: w */
    private final C1436e0 f6276w;

    /* renamed from: x */
    private final LiveData f6277x;

    /* renamed from: y */
    private final LiveData f6278y;

    /* renamed from: z */
    private final LiveData f6279z;

    /* compiled from: OnboardingSuccessViewModel.kt */
    /* renamed from: cl.d$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2175a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6280a;

        static {
            int[] iArr = new int[EnumC8682a.values().length];
            iArr[EnumC8682a.REGISTER.ordinal()] = 1;
            iArr[EnumC8682a.LOGIN.ordinal()] = 2;
            f6280a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingSuccessViewModel.kt */
    /* renamed from: cl.d$b */
    /* loaded from: classes2.dex */
    public static final class C2176b extends AbstractC6438m implements InterfaceC6108l {
        C2176b() {
            super(1);
        }

        /* renamed from: a */
        public final void m34506a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(OnboardingSuccessViewModel.m34514W(OnboardingSuccessViewModel.this), AnalyticEvents.AbstractC7780f.C7831q1.f20455b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            OnboardingSuccessViewModel.this.m104v(C2143g.f6178a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m34506a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingSuccessViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f6270q = analyticsManager;
        C1436e0 m37003d = c1459l0.m37003d("_title", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<String>(\"_title\", \"\")");
        this.f6271r = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_subtitle", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_subtitle\", \"\")");
        this.f6272s = m37003d2;
        C1436e0 m37003d3 = c1459l0.m37003d("_approvalText", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<…ing>(\"_approvalText\", \"\")");
        this.f6273t = m37003d3;
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d4 = c1459l0.m37003d("_isWaitingForApproval", bool);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<…itingForApproval\", false)");
        this.f6274u = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("_showContact", bool);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData<…n>(\"_showContact\", false)");
        this.f6275v = m37003d5;
        C1436e0 c1436e0 = new C1436e0(null);
        this.f6276w = c1436e0;
        this.f6277x = m37003d;
        this.f6278y = m37003d2;
        this.f6279z = c1436e0;
        this.f6269A = BaseViewModel.m113I(this, 0L, new C2176b(), 1, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7828p1.f20452b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m34515V(OnboardingSuccessViewModel onboardingSuccessViewModel, View view) {
        m34512Y(onboardingSuccessViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ AnalyticsManager m34514W(OnboardingSuccessViewModel onboardingSuccessViewModel) {
        return onboardingSuccessViewModel.f6270q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m34512Y(OnboardingSuccessViewModel onboardingSuccessViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingSuccessViewModel, "this$0");
        onboardingSuccessViewModel.f6269A.mo9587d(C13195u.f34156a);
    }

    /* renamed from: X */
    public final View.OnClickListener m34513X() {
        return new View.OnClickListener() { // from class: cl.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingSuccessViewModel.m34512Y(OnboardingSuccessViewModel.this, view);
            }
        };
    }

    /* renamed from: Z */
    public final LiveData m34511Z() {
        return this.f6279z;
    }

    /* renamed from: a0 */
    public final LiveData m34510a0() {
        return this.f6278y;
    }

    /* renamed from: b0 */
    public final LiveData m34509b0() {
        return this.f6277x;
    }

    /* renamed from: c0 */
    public final void m34508c0() {
        if (((OnboardingFlowData) m34578S()).m14737A().m14565f()) {
            this.f6276w.mo166p(C0928a.m39111f(m20390g().m6899a(), C2336R.C2337drawable.ic_ompd_card_sucess));
        } else {
            this.f6276w.mo166p(C0928a.m39111f(m20390g().m6899a(), C2336R.C2337drawable.ic_pplus_card_sucess));
        }
    }

    /* renamed from: d0 */
    public final void m34507d0() {
        int i = C2175a.f6280a[((OnboardingFlowData) m34578S()).m14710v().ordinal()];
        if (i == 1) {
            C1436e0 c1436e0 = this.f6271r;
            String string = m20390g().m6899a().getString(C2336R.string.lbl_registration_success_title);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            c1436e0.mo166p(string);
        } else if (i == 2) {
            C1436e0 c1436e02 = this.f6271r;
            String string2 = m20390g().m6899a().getString(C2336R.string.lbl_registration_success_title_alt);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            c1436e02.mo166p(string2);
        }
        if (((OnboardingFlowData) m34578S()).m14737A().m14565f()) {
            C1436e0 c1436e03 = this.f6272s;
            String string3 = m20390g().m6899a().getString(C2336R.string.lbl_registration_success_subtitle_ompd);
            Intrinsics.checkIfNull(string3, "ctx.getString(id)");
            c1436e03.mo166p(string3);
        } else {
            C1436e0 c1436e04 = this.f6272s;
            String string4 = m20390g().m6899a().getString(C2336R.string.lbl_registration_success_subtitle);
            Intrinsics.checkIfNull(string4, "ctx.getString(id)");
            c1436e04.mo166p(string4);
        }
        InterfaceC7886d.C7887a.m17629a(this.f6270q, AnalyticEvents.AbstractC7780f.C7803h0.f20427b, null, null, null, 14, null);
    }
}
