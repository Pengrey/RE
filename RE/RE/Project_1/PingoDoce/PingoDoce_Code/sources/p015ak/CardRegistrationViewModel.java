package p015ak;

import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7296j0;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;
import vi.LoyaltyCardInsertViewModel;

/* renamed from: ak.c */
/* loaded from: classes2.dex */
public final class CardRegistrationViewModel extends LoyaltyCardInsertViewModel {

    /* renamed from: M */
    private final C7296j0 f433M;

    /* renamed from: N */
    private final AnalyticsManager f434N;

    /* compiled from: CardRegistrationViewModel.kt */
    /* renamed from: ak.c$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0198a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f435a;

        static {
            int[] iArr = new int[LoyaltyCard.PoupaMaisStatus.values().length];
            iArr[LoyaltyCard.PoupaMaisStatus.OwnerNoRequests.ordinal()] = 1;
            iArr[LoyaltyCard.PoupaMaisStatus.OwnerWithRequests.ordinal()] = 2;
            iArr[LoyaltyCard.PoupaMaisStatus.Unapproved.ordinal()] = 3;
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownCard.ordinal()] = 4;
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownOwner.ordinal()] = 5;
            f435a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardRegistrationViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.loyaltycard.registration.CardRegistrationViewModel", m20196f = "CardRegistrationViewModel.kt", m20195l = {41}, m20194m = "onSubmit")
    /* renamed from: ak.c$b */
    /* loaded from: classes2.dex */
    public static final class C0199b extends AbstractC6757d {

        /* renamed from: A */
        int f436A;

        /* renamed from: w */
        Object f437w;

        /* renamed from: x */
        Object f438x;

        /* renamed from: y */
        /* synthetic */ Object f439y;

        C0199b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f439y = obj;
            this.f436A |= Integer.MIN_VALUE;
            return CardRegistrationViewModel.this.m41595n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRegistrationViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7296j0 c7296j0, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7296j0, "onboardingManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f433M = c7296j0;
        this.f434N = analyticsManager;
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7751a.f20376b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: F0 */
    private final LoyaltyCardResumeViewModel m41596F0(String str, boolean z, String str2, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, boolean z2) {
        String string;
        String string2;
        String string3;
        int i = C0198a.f435a[poupaMaisStatus.ordinal()];
        if (i == 1 || i == 2) {
            String string4 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
            Intrinsics.checkIfNull(string4, "ctx.getString(id)");
            String string5 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_warning_card_unknow_guests);
            Intrinsics.checkIfNull(string5, "ctx.getString(id)");
            return new LoyaltyCardResumeViewModel(string4, str, null, false, null, !z, false, false, 0, z2, string5, true, 412, null);
        } else if (i == 3) {
            String string6 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
            Intrinsics.checkIfNull(string6, "ctx.getString(id)");
            if (z2) {
                string = m20390g().m6899a().getString(C2336R.string.lbl_loyalty_resume_unapproved_guest);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
            } else {
                string = m20390g().m6899a().getString(C2336R.string.lbl_loyalty_resume_unapproved);
                Intrinsics.checkIfNull(string, "ctx.getString(id)");
            }
            return new LoyaltyCardResumeViewModel(string6, str, null, z2, null, false, false, false, 0, false, string, false, 1012, null);
        } else if (i == 4) {
            String string7 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
            Intrinsics.checkIfNull(string7, "ctx.getString(id)");
            if (z2) {
                string2 = m20390g().m6899a().getString(C2336R.string.lbl_loyalty_resume_unknown_card_guest);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            } else {
                string2 = m20390g().m6899a().getString(C2336R.string.lbl_loyalty_resume_unknown_card);
                Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            }
            return new LoyaltyCardResumeViewModel(string7, str, null, z2, null, false, false, false, 0, false, string2, false, 1012, null);
        } else if (i == 5) {
            String string8 = m20390g().m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
            Intrinsics.checkIfNull(string8, "ctx.getString(id)");
            if (z2) {
                string3 = m20390g().m6899a().getString(C2336R.string.lbl_loyalty_resume_unknown_owner_guest);
                Intrinsics.checkIfNull(string3, "ctx.getString(id)");
            } else {
                string3 = m20390g().m6899a().getString(C2336R.string.lbl_loyalty_resume_unknown_owner);
                Intrinsics.checkIfNull(string3, "ctx.getString(id)");
            }
            return new LoyaltyCardResumeViewModel(string8, str, null, z2, null, false, false, false, 0, false, string3, false, 1012, null);
        } else {
            throw new Exception("PoupaMaisStatus status not allowed: {" + poupaMaisStatus + "}");
        }
    }

    /* renamed from: E0 */
    public final void m41597E0() {
        InterfaceC7886d.C7887a.m17629a(this.f434N, AnalyticEvents.AbstractC7750e.C7753b.f20378b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0144  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m41595n0(bd.InterfaceC1886d r35) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p015ak.CardRegistrationViewModel.m41595n0(bd.d):java.lang.Object");
    }
}
