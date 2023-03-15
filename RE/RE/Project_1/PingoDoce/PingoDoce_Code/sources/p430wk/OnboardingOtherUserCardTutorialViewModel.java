package p430wk;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
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
import p494zh.C13900s1;

/* renamed from: wk.t */
/* loaded from: classes2.dex */
public final class OnboardingOtherUserCardTutorialViewModel extends FlowViewModel {

    /* renamed from: q */
    private final AnalyticsManager f32181q;

    /* renamed from: r */
    private final C1436e0 f32182r;

    /* renamed from: s */
    private final LiveData f32183s;

    /* renamed from: t */
    private final InterfaceC6108l f32184t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingOtherUserCardTutorialViewModel.kt */
    /* renamed from: wk.t$a */
    /* loaded from: classes2.dex */
    public static final class C12196a extends AbstractC6438m implements InterfaceC6108l {
        C12196a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3419a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(OnboardingOtherUserCardTutorialViewModel.m3424W(OnboardingOtherUserCardTutorialViewModel.this), AnalyticEvents.AbstractC7750e.C7765l.f20390b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel = OnboardingOtherUserCardTutorialViewModel.this;
            onboardingOtherUserCardTutorialViewModel.m120B(C13900s1.f35021a, onboardingOtherUserCardTutorialViewModel.m34578S());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3419a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingOtherUserCardTutorialViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f32181q = analyticsManager;
        C1436e0 m37003d = c1459l0.m37003d("_maskedNumber", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…ing>(\"_maskedNumber\", \"\")");
        this.f32182r = m37003d;
        this.f32183s = m37003d;
        this.f32184t = BaseViewModel.m113I(this, 0L, new C12196a(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m3425V(OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel, View view) {
        m3420a0(onboardingOtherUserCardTutorialViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ AnalyticsManager m3424W(OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel) {
        return onboardingOtherUserCardTutorialViewModel.f32181q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m3420a0(OnboardingOtherUserCardTutorialViewModel onboardingOtherUserCardTutorialViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingOtherUserCardTutorialViewModel, "this$0");
        onboardingOtherUserCardTutorialViewModel.f32184t.mo9587d(C13195u.f34156a);
    }

    /* renamed from: X */
    public final LiveData m3423X() {
        return this.f32183s;
    }

    /* renamed from: Y */
    public final void m3422Y(String str) {
        Intrinsics.isThisObjectNull(str, "number");
        this.f32182r.mo166p(str);
    }

    /* renamed from: Z */
    public final View.OnClickListener m3421Z() {
        return new View.OnClickListener() { // from class: wk.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingOtherUserCardTutorialViewModel.m3420a0(OnboardingOtherUserCardTutorialViewModel.this, view);
            }
        };
    }
}
