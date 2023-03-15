package pt.pingodoce.app.presentation.onboarding.resume;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p451xi.AbstractC12995e;
import p468yc.C13195u;
import p489zc.C13780s;
import p494zh.C13817c0;
import p494zh.C13878n1;
import p494zh.C13892q1;
import pt.pingodoce.app.data.local.flows.EnumC8682a;
import pt.pingodoce.app.data.local.flows.FlowData;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.C14956OnboardingResumeInfoRowItem;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import pt.pingodoce.app.presentation.onboarding.resume.OnboardingResumeViewModel;

/* renamed from: pt.pingodoce.app.presentation.onboarding.resume.a */
/* loaded from: classes2.dex */
public final class OnboardingResumeViewModel extends AbstractC12995e {

    /* renamed from: T */
    private final AnalyticsManager f24577T;

    /* renamed from: U */
    private final boolean f24578U;

    /* renamed from: V */
    private final InterfaceC6108l f24579V;

    /* compiled from: OnboardingResumeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9349a {
        SKIP
    }

    /* compiled from: OnboardingResumeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.a$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9350b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24580a;

        static {
            int[] iArr = new int[EnumC8682a.values().length];
            iArr[EnumC8682a.LOGIN.ordinal()] = 1;
            f24580a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingResumeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.a$c */
    /* loaded from: classes2.dex */
    public static final class C9351c extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: OnboardingResumeViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.onboarding.resume.a$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9352a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24582a;

            /* renamed from: b */
            public static final /* synthetic */ int[] f24583b;

            static {
                int[] iArr = new int[EnumC8682a.values().length];
                iArr[EnumC8682a.LOGIN.ordinal()] = 1;
                f24582a = iArr;
                int[] iArr2 = new int[EnumC9349a.values().length];
                iArr2[EnumC9349a.SKIP.ordinal()] = 1;
                f24583b = iArr2;
            }
        }

        C9351c() {
            super(1);
        }

        /* renamed from: a */
        public final void m11550a(EnumC9349a enumC9349a) {
            Intrinsics.isThisObjectNull(enumC9349a, "action");
            if (C9352a.f24583b[enumC9349a.ordinal()] == 1) {
                if (C9352a.f24582a[OnboardingResumeViewModel.this.m11559D0().m14710v().ordinal()] == 1) {
                    OnboardingResumeViewModel onboardingResumeViewModel = OnboardingResumeViewModel.this;
                    onboardingResumeViewModel.m120B(C13878n1.f34993a, onboardingResumeViewModel.m11559D0());
                    return;
                }
                OnboardingResumeViewModel onboardingResumeViewModel2 = OnboardingResumeViewModel.this;
                onboardingResumeViewModel2.m120B(C13817c0.f34924a, onboardingResumeViewModel2.m11559D0());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11550a((EnumC9349a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingResumeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f24577T = analyticsManager;
        this.f24578U = true;
        C1436e0 m1977G0 = m1977G0();
        LoyaltyCardResumeViewModel m14719h = m11559D0().m14719h();
        m1977G0.mo166p(m14719h != null ? Boolean.valueOf(m14719h.m12649h()) : Boolean.FALSE);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7780f.C7790d.f20414b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        this.f24579V = OperatorExtensions.m35176e(0L, null, new C9351c(), 3, null);
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m11557K0(OnboardingResumeViewModel onboardingResumeViewModel, View view) {
        m11553O0(onboardingResumeViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static final void m11553O0(OnboardingResumeViewModel onboardingResumeViewModel, View view) {
        Intrinsics.isThisObjectNull(onboardingResumeViewModel, "this$0");
        onboardingResumeViewModel.f24579V.mo9587d(EnumC9349a.SKIP);
    }

    /* renamed from: B0 */
    public boolean m11560B0() {
        return this.f24578U;
    }

    /* renamed from: H0 */
    public View.OnClickListener m11558H0() {
        return new View.OnClickListener() { // from class: bl.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnboardingResumeViewModel.m11553O0(OnboardingResumeViewModel.this, view);
            }
        };
    }

    /* renamed from: L0 */
    public OnboardingFlowData m11559D0() {
        return OnboardingFlowData.m14720f((OnboardingFlowData) m34578S(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, new LoyaltyCardProvisory(null, null, null, 7, null), null, false, null, null, 507903, null);
    }

    /* renamed from: M0 */
    public final void m11555M0() {
        InterfaceC7886d.C7887a.m17629a(this.f24577T, AnalyticEvents.AbstractC7780f.C7793e.f20417b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: N0 */
    public final void m11554N0(LoyaltyCardResumeViewModel loyaltyCardResumeViewModel) {
        List m191m;
        List m191m2;
        Intrinsics.isThisObjectNull(loyaltyCardResumeViewModel, "cardRow");
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) m34578S();
        if (onboardingFlowData.m14735E()) {
            C1436e0 m1978F0 = m1978F0();
            String string = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_phone);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String string2 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_name);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            m191m2 = C13780s.m191m(new LoyaltyCardResumeViewModel(string, onboardingFlowData.m14723b(), null, false, null, false, false, false, 0, false, null, false, 4092, null), new LoyaltyCardResumeViewModel(string2, onboardingFlowData.m14722d(), true), loyaltyCardResumeViewModel);
            m1978F0.mo166p(m191m2);
        } else {
            C1436e0 m1978F02 = m1978F0();
            LoyaltyCardResumeViewModel m14719h = onboardingFlowData.m14719h();
            Intrinsics.ifNullDoSomething(m14719h);
            m191m = C13780s.m191m(m14719h);
            m1978F02.mo166p(m191m);
        }
        m34576U(OnboardingFlowData.m14720f((OnboardingFlowData) m34578S(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, new LoyaltyCardProvisory(loyaltyCardResumeViewModel.m12646k(), null, null, 6, null), null, false, null, null, 507903, null));
    }

    /* renamed from: P0 */
    public final void m11552P0(OnboardingFlowData onboardingFlowData) {
        Intrinsics.isThisObjectNull(onboardingFlowData, "data");
        List<LoyaltyCardResumeViewModel> list = (List) m1978F0().mo172f();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (LoyaltyCardResumeViewModel loyaltyCardResumeViewModel : list) {
                String m12645m = loyaltyCardResumeViewModel.m12645m();
                String string = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_name);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
                if (Intrinsics.equals(m12645m, string)) {
                    String string2 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_name);
                    Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                    arrayList.add(new LoyaltyCardResumeViewModel(string2, onboardingFlowData.m14722d(), true));
                } else {
                    arrayList.add(loyaltyCardResumeViewModel);
                }
            }
            m1978F0().mo166p(arrayList);
        }
        m34576U(onboardingFlowData);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory, T] */
    /* renamed from: n0 */
    protected Object m11551n0(InterfaceC1886d interfaceC1886d) {
        LoyaltyCardProvisory loyaltyCardProvisory;
        Object m34636d;
        InterfaceC7886d.C7887a.m17629a(this.f24577T, AnalyticEvents.AbstractC7780f.C7796f.f20420b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        FlowData m34578S = m34578S();
        OnboardingFlowData onboardingFlowData = (OnboardingFlowData) m34578S;
        C6449y c6449y = new C6449y();
        c6449y.f17533w = new LoyaltyCardProvisory(null, null, null, 7, null);
        List list = (List) m1968x0().mo172f();
        if (list != null) {
            Intrinsics.checkIfNull(list, "value");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem : ((LoyaltyCardResumeViewModel) it.next()).m12653c()) {
                    if (c14956OnboardingResumeInfoRowItem.m12637b()) {
                        for (?? r3 : onboardingFlowData.m14718i()) {
                            if (Intrinsics.equals(((LoyaltyCardProvisory) r3).m14566e(), c14956OnboardingResumeInfoRowItem.m12638a())) {
                                c6449y.f17533w = r3;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
            }
        }
        if (((LoyaltyCardProvisory) c6449y.f17533w).m14567d().length() == 0) {
            loyaltyCardProvisory = (LoyaltyCardProvisory) onboardingFlowData.m14718i().get(0);
        } else {
            loyaltyCardProvisory = (LoyaltyCardProvisory) c6449y.f17533w;
        }
        onboardingFlowData.m14725O(loyaltyCardProvisory);
        if (!onboardingFlowData.m14735E() || onboardingFlowData.m14708y() == LoyaltyCard.PoupaMaisStatus.Pending) {
            m120B(C13892q1.f35013a, onboardingFlowData);
        } else if (C9350b.f24580a[onboardingFlowData.m14710v().ordinal()] == 1) {
            m120B(C13878n1.f34993a, onboardingFlowData);
        } else {
            m120B(C13817c0.f34924a, onboardingFlowData);
        }
        m34636d = C2116d.m34636d();
        return m34578S == m34636d ? m34578S : C13195u.f34156a;
    }
}
