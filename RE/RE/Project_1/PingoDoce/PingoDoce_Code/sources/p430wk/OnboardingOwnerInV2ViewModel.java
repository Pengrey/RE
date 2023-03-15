package p430wk;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import ci.C2143g;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13829e2;
import p494zh.C13869l0;
import p494zh.C13900s1;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;

/* renamed from: wk.a0 */
/* loaded from: classes2.dex */
public final class OnboardingOwnerInV2ViewModel extends FlowViewModel {

    /* renamed from: q */
    private final C1436e0 f32142q;

    /* renamed from: r */
    private final C1436e0 f32143r;

    /* renamed from: s */
    private final LiveData f32144s;

    /* renamed from: t */
    private final InterfaceC6108l f32145t;

    /* renamed from: u */
    private final InterfaceC6108l f32146u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingOwnerInV2ViewModel.kt */
    /* renamed from: wk.a0$a */
    /* loaded from: classes2.dex */
    public static final class C12175a extends AbstractC6438m implements InterfaceC6108l {
        C12175a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3466a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            if (Intrinsics.equals(OnboardingOwnerInV2ViewModel.m3473X(OnboardingOwnerInV2ViewModel.this).mo172f(), Boolean.TRUE)) {
                OnboardingOwnerInV2ViewModel.this.m104v(C2143g.C2144a.f6179a);
                BaseViewModel.m119C(OnboardingOwnerInV2ViewModel.this, C13869l0.f34986a, null, 2, null);
                return;
            }
            OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel = OnboardingOwnerInV2ViewModel.this;
            onboardingOwnerInV2ViewModel.m120B(C13900s1.f35021a, OnboardingFlowData.m14720f((OnboardingFlowData) onboardingOwnerInV2ViewModel.m34578S(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, new LoyaltyCardProvisory(null, null, null, 7, null), null, false, null, null, 507903, null));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3466a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingOwnerInV2ViewModel.kt */
    /* renamed from: wk.a0$b */
    /* loaded from: classes2.dex */
    public static final class C12176b extends AbstractC6438m implements InterfaceC6108l {
        C12176b() {
            super(1);
        }

        /* renamed from: a */
        public final void m3465a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel = OnboardingOwnerInV2ViewModel.this;
            onboardingOwnerInV2ViewModel.m120B(C13829e2.f34936a, onboardingOwnerInV2ViewModel.m34578S());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3465a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingOwnerInV2ViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        new LoginFlowData(null, null, null, false, false, 31, null);
        C1436e0 m37003d = c1459l0.m37003d("_isAccountRedirect", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…sAccountRedirect\", false)");
        this.f32142q = m37003d;
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_advance_without_card);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 m37003d2 = c1459l0.m37003d("_secondaryButtonText", string);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…e_without_card)\n        )");
        this.f32143r = m37003d2;
        this.f32144s = m37003d2;
        this.f32145t = BaseViewModel.m113I(this, 0L, new C12176b(), 1, null);
        this.f32146u = BaseViewModel.m113I(this, 0L, new C12175a(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m3475V(OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel, View view) {
        m3468c0(onboardingOwnerInV2ViewModel, view);
    }

    /* renamed from: W */
    public static /* synthetic */ void m3474W(OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel, View view) {
        m3470a0(onboardingOwnerInV2ViewModel, view);
    }

    /* renamed from: X */
    public static final /* synthetic */ C1436e0 m3473X(OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel) {
        return onboardingOwnerInV2ViewModel.f32142q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m3470a0(OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingOwnerInV2ViewModel, "this$0");
        onboardingOwnerInV2ViewModel.f32146u.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final void m3468c0(OnboardingOwnerInV2ViewModel onboardingOwnerInV2ViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingOwnerInV2ViewModel, "this$0");
        onboardingOwnerInV2ViewModel.f32145t.mo9587d(C13195u.f34156a);
    }

    /* renamed from: Y */
    public final LiveData m3472Y() {
        return this.f32144s;
    }

    /* renamed from: Z */
    public final View.OnClickListener m3471Z() {
        return new View.OnClickListener() { // from class: wk.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingOwnerInV2ViewModel.m3470a0(OnboardingOwnerInV2ViewModel.this, view);
            }
        };
    }

    /* renamed from: b0 */
    public final View.OnClickListener m3469b0() {
        return new View.OnClickListener() { // from class: wk.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingOwnerInV2ViewModel.m3468c0(OnboardingOwnerInV2ViewModel.this, view);
            }
        };
    }

    /* renamed from: d0 */
    public final void m3467d0(boolean z) {
        this.f32142q.mo166p(Boolean.valueOf(z));
        if (z) {
            C1436e0 c1436e0 = this.f32143r;
            String string = m20390g().m6899a().getString(C2336R.string.btn_go_to_home_page);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            c1436e0.mo166p(string);
        }
    }
}
