package p430wk;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import ci.FlowViewModel;
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
import p494zh.C13873m0;
import p494zh.C13919x0;

/* renamed from: wk.d */
/* loaded from: classes2.dex */
public final class OnboardingCardQuestionViewModel extends FlowViewModel {

    /* renamed from: q */
    private final AnalyticsManager f32153q;

    /* renamed from: r */
    private final C1436e0 f32154r;

    /* renamed from: s */
    private final InterfaceC6108l f32155s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingCardQuestionViewModel.kt */
    /* renamed from: wk.d$a */
    /* loaded from: classes2.dex */
    public static final class C12181a extends AbstractC6438m implements InterfaceC6108l {
        C12181a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3453a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            InterfaceC7886d.C7887a.m17629a(OnboardingCardQuestionViewModel.m3457W(OnboardingCardQuestionViewModel.this), AnalyticEvents.AbstractC7750e.C7771r.f20396b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            Boolean bool = (Boolean) OnboardingCardQuestionViewModel.this.m3454Z().mo172f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            OnboardingCardQuestionViewModel onboardingCardQuestionViewModel = OnboardingCardQuestionViewModel.this;
            onboardingCardQuestionViewModel.m120B(booleanValue ? C13873m0.f34989a : C13919x0.f35040a, onboardingCardQuestionViewModel.m34578S());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3453a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingCardQuestionViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f32153q = analyticsManager;
        C1436e0 m37003d = c1459l0.m37003d("optionYesCheck", Boolean.TRUE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"optionYesCheck\", true)");
        this.f32154r = m37003d;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7770q.f20395b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        this.f32155s = BaseViewModel.m113I(this, 0L, new C12181a(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m3458V(OnboardingCardQuestionViewModel onboardingCardQuestionViewModel, View view) {
        m3455Y(onboardingCardQuestionViewModel, view);
    }

    /* renamed from: W */
    public static final /* synthetic */ AnalyticsManager m3457W(OnboardingCardQuestionViewModel onboardingCardQuestionViewModel) {
        return onboardingCardQuestionViewModel.f32153q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m3455Y(OnboardingCardQuestionViewModel onboardingCardQuestionViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingCardQuestionViewModel, "this$0");
        onboardingCardQuestionViewModel.f32155s.mo9587d(C13195u.f34156a);
    }

    /* renamed from: X */
    public final View.OnClickListener m3456X() {
        return new View.OnClickListener() { // from class: wk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingCardQuestionViewModel.m3455Y(OnboardingCardQuestionViewModel.this, view);
            }
        };
    }

    /* renamed from: Z */
    public final C1436e0 m3454Z() {
        return this.f32154r;
    }
}
