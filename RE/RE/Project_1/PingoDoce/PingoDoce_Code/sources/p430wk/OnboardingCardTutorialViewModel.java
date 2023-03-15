package p430wk;

import android.view.View;
import androidx.lifecycle.C1459l0;
import ci.FlowViewModel;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13847i1;

/* renamed from: wk.n */
/* loaded from: classes2.dex */
public final class OnboardingCardTutorialViewModel extends FlowViewModel {

    /* renamed from: q */
    private final InterfaceC6108l f32175q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingCardTutorialViewModel.kt */
    /* renamed from: wk.n$a */
    /* loaded from: classes2.dex */
    public static final class C12191a extends AbstractC6438m implements InterfaceC6108l {
        C12191a() {
            super(1);
        }

        /* renamed from: a */
        public final void m3433a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            OnboardingCardTutorialViewModel onboardingCardTutorialViewModel = OnboardingCardTutorialViewModel.this;
            onboardingCardTutorialViewModel.m120B(C13847i1.f34955a, onboardingCardTutorialViewModel.m34578S());
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m3433a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingCardTutorialViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f32175q = BaseViewModel.m113I(this, 0L, new C12191a(), 1, null);
    }

    /* renamed from: V */
    public static /* synthetic */ void m3436V(OnboardingCardTutorialViewModel onboardingCardTutorialViewModel, View view) {
        m3434X(onboardingCardTutorialViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m3434X(OnboardingCardTutorialViewModel onboardingCardTutorialViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingCardTutorialViewModel, "this$0");
        onboardingCardTutorialViewModel.f32175q.mo9587d(C13195u.f34156a);
    }

    /* renamed from: W */
    public final View.OnClickListener m3435W() {
        return new View.OnClickListener() { // from class: wk.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingCardTutorialViewModel.m3434X(OnboardingCardTutorialViewModel.this, view);
            }
        };
    }
}
