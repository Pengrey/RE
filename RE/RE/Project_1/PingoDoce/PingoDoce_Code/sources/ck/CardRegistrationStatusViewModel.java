package ck;

import android.graphics.drawable.Drawable;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import java.util.Arrays;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7405s1;
import mg.LoyaltyCardManager;
import module.network.data.remote.models.user.User;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p070e.C4906j;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: ck.c */
/* loaded from: classes2.dex */
public final class CardRegistrationStatusViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final LoyaltyCardManager f6233C;

    /* renamed from: D */
    private final AnalyticsManager f6234D;

    /* renamed from: E */
    private final Void f6235E;

    /* renamed from: F */
    private final LoyaltyCard.PoupaMaisStatus f6236F;

    /* renamed from: G */
    private final String f6237G;

    /* renamed from: H */
    private final boolean f6238H;

    /* renamed from: I */
    private final C1436e0 f6239I;

    /* renamed from: J */
    private final C1436e0 f6240J;

    /* renamed from: K */
    private final C1436e0 f6241K;

    /* renamed from: L */
    private final C1436e0 f6242L;

    /* renamed from: M */
    private final C1436e0 f6243M;

    /* renamed from: N */
    private final C1436e0 f6244N;

    /* renamed from: O */
    private final C1436e0 f6245O;

    /* renamed from: P */
    private final C1436e0 f6246P;

    /* renamed from: Q */
    private final C1436e0 f6247Q;

    /* renamed from: R */
    private final LiveData f6248R;

    /* renamed from: S */
    private final LiveData f6249S;

    /* renamed from: T */
    private final LiveData f6250T;

    /* renamed from: U */
    private final LiveData f6251U;

    /* renamed from: V */
    private final LiveData f6252V;

    /* renamed from: W */
    private final LiveData f6253W;

    /* renamed from: X */
    private final LiveData f6254X;

    /* renamed from: Y */
    private final LiveData f6255Y;

    /* renamed from: Z */
    private final LiveData f6256Z;

    /* compiled from: CardRegistrationStatusViewModel.kt */
    /* renamed from: ck.c$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C2169a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6257a;

        static {
            int[] iArr = new int[LoyaltyCard.PoupaMaisStatus.values().length];
            iArr[LoyaltyCard.PoupaMaisStatus.Unapproved.ordinal()] = 1;
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownCard.ordinal()] = 2;
            iArr[LoyaltyCard.PoupaMaisStatus.UnknownOwner.ordinal()] = 3;
            iArr[LoyaltyCard.PoupaMaisStatus.OwnerWithRequests.ordinal()] = 4;
            iArr[LoyaltyCard.PoupaMaisStatus.OwnerNoRequests.ordinal()] = 5;
            iArr[LoyaltyCard.PoupaMaisStatus.Pending.ordinal()] = 6;
            f6257a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CardRegistrationStatusViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.loyaltycard.status.CardRegistrationStatusViewModel", m20196f = "CardRegistrationStatusViewModel.kt", m20195l = {C4906j.f13380A0, C4906j.f13420I0}, m20194m = "onSubmit")
    /* renamed from: ck.c$b */
    /* loaded from: classes2.dex */
    public static final class C2170b extends AbstractC6757d {

        /* renamed from: w */
        Object f6258w;

        /* renamed from: x */
        /* synthetic */ Object f6259x;

        /* renamed from: z */
        int f6261z;

        C2170b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f6259x = obj;
            this.f6261z |= Integer.MIN_VALUE;
            return CardRegistrationStatusViewModel.this.m34530n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRegistrationStatusViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AnalyticsManager analyticsManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        int i;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f6233C = loyaltyCardManager;
        this.f6234D = analyticsManager;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus = (LoyaltyCard.PoupaMaisStatus) c1459l0.m37005b("EXTRA_FOR_PPLUS_STATUS");
        poupaMaisStatus = poupaMaisStatus == null ? LoyaltyCard.PoupaMaisStatus.UndefinedStatus : poupaMaisStatus;
        Intrinsics.checkIfNull(poupaMaisStatus, "stateHandle.get<PoupaMai…TATUS) ?: UndefinedStatus");
        this.f6236F = poupaMaisStatus;
        String str = (String) c1459l0.m37005b("EXTRA_FOR_MASKED_NUMBER");
        String str2 = str == null ? BuildConfig.VERSION_NAME : str;
        this.f6237G = str2;
        Boolean bool = (Boolean) c1459l0.m37005b("EXTRA_FOR_UNKNOWN_OWNER");
        (bool == null ? Boolean.TRUE : bool).booleanValue();
        Object m37005b = c1459l0.m37005b("EXTRA_FOR_LAUNCH_FOR_RESUME");
        Boolean bool2 = Boolean.TRUE;
        Intrinsics.equals(m37005b, bool2);
        boolean equals = Intrinsics.equals(c1459l0.m37005b("EXTRA_FOR_IS_OWNER"), bool2);
        this.f6238H = equals;
        Intrinsics.equals(c1459l0.m37005b("EXTRA_FOR_WAITING"), bool2);
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_other_user_card_tutorial_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 m37003d = c1459l0.m37003d("_title", string);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…ard_tutorial_title)\n    )");
        this.f6239I = m37003d;
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_registration_success_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        C1436e0 m37003d2 = c1459l0.m37003d("_subtitle", string2);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…n_success_subtitle)\n    )");
        this.f6240J = m37003d2;
        C1436e0 c1436e0 = new C1436e0(C0928a.m39111f(resourcesProvider.m6899a(), equals ? C2336R.C2337drawable.ic_card_success : C2336R.C2337drawable.phone_card_association));
        this.f6241K = c1436e0;
        String string3 = resourcesProvider.m6899a().getString(equals ? C2336R.string.lbl_card_registration_status_not_found : C2336R.string.lbl_card_registration_status_pending);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        C1436e0 m37003d3 = c1459l0.m37003d("_approvalText", string3);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData(…ion_status_pending)\n    )");
        this.f6242L = m37003d3;
        LoyaltyCard.PoupaMaisStatus poupaMaisStatus2 = LoyaltyCard.PoupaMaisStatus.UnknownCard;
        C1436e0 m37003d4 = c1459l0.m37003d("_isWaitingForApproval", Boolean.valueOf(poupaMaisStatus == poupaMaisStatus2 || poupaMaisStatus == LoyaltyCard.PoupaMaisStatus.UnknownOwner));
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<…tus == UnknownOwner\n    )");
        this.f6243M = m37003d4;
        int[] iArr = C2169a.f6257a;
        int i2 = iArr[poupaMaisStatus.ordinal()];
        String string4 = resourcesProvider.m6899a().getString((i2 == 1 || i2 == 2) ? C2336R.string.btn_ok_alt : i2 != 3 ? (i2 == 4 || i2 == 5) ? C2336R.string.btn_go_to_home_page : C2336R.string.btn_next : C2336R.string.btn_send_invite);
        Intrinsics.checkIfNull(string4, "ctx.getString(id)");
        C1436e0 m37003d5 = c1459l0.m37003d("_btnLabel", string4);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData(…        }\n        )\n    )");
        this.f6244N = m37003d5;
        C1436e0 c1436e02 = new C1436e0(bool2);
        this.f6245O = c1436e02;
        C1436e0 c1436e03 = new C1436e0(Boolean.valueOf(poupaMaisStatus == LoyaltyCard.PoupaMaisStatus.UnknownOwner));
        this.f6246P = c1436e03;
        C1436e0 c1436e04 = new C1436e0(Boolean.valueOf(poupaMaisStatus == poupaMaisStatus2));
        this.f6247Q = c1436e04;
        this.f6248R = m37003d;
        this.f6249S = m37003d2;
        this.f6250T = c1436e0;
        this.f6251U = m37003d3;
        this.f6252V = m37003d4;
        this.f6253W = m37003d5;
        this.f6254X = c1436e02;
        this.f6255Y = c1436e03;
        this.f6256Z = c1436e04;
        switch (iArr[poupaMaisStatus.ordinal()]) {
            case 1:
            case 6:
                User m18502h = c7405s1.m18502h();
                if (m18502h != null && m18502h.m18194K()) {
                    AnalyticEvents.AbstractC7780f.C7799g c7799g = AnalyticEvents.AbstractC7780f.C7799g.f20423b;
                    EnumC7885c enumC7885c = EnumC7885c.Screen;
                    EnumC7884b enumC7884b = EnumC7884b.View;
                    i = C2336R.C2337drawable.phone_card_association;
                    InterfaceC7886d.C7887a.m17629a(analyticsManager, c7799g, enumC7885c, enumC7884b, null, 8, null);
                } else {
                    i = C2336R.C2337drawable.phone_card_association;
                    InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7764k.f20389b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
                }
                C6429c0 c6429c0 = C6429c0.f17515a;
                String string5 = resourcesProvider.m6899a().getString(C2336R.string.lbl_other_user_card_tutorial_title);
                Intrinsics.checkIfNull(string5, "ctx.getString(id)");
                String format = String.format(string5, Arrays.copyOf(new Object[]{str2}, 1));
                Intrinsics.checkIfNull(format, "format(format, *args)");
                m37003d.mo166p(format);
                String string6 = resourcesProvider.m6899a().getString(C2336R.string.lbl_other_user_card_tutorial_subtitle_alt);
                Intrinsics.checkIfNull(string6, "ctx.getString(id)");
                m37003d2.mo166p(string6);
                c1436e0.mo166p(C0928a.m39111f(resourcesProvider.m6899a(), i));
                return;
            case 2:
                InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7766m.f20391b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
                String string7 = resourcesProvider.m6899a().getString(C2336R.string.lbl_card_registration_pending_title_alt);
                Intrinsics.checkIfNull(string7, "ctx.getString(id)");
                m37003d.mo166p(string7);
                String string8 = resourcesProvider.m6899a().getString(C2336R.string.lbl_card_registration_success_subtitle_alt);
                Intrinsics.checkIfNull(string8, "ctx.getString(id)");
                m37003d2.mo166p(string8);
                c1436e0.mo166p(C0928a.m39111f(resourcesProvider.m6899a(), C2336R.C2337drawable.ic_card_success_alt));
                return;
            case 3:
                InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7766m.f20391b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
                String string9 = resourcesProvider.m6899a().getString(C2336R.string.lbl_card_registration_pending_title);
                Intrinsics.checkIfNull(string9, "ctx.getString(id)");
                m37003d.mo166p(string9);
                String string10 = resourcesProvider.m6899a().getString(C2336R.string.lbl_card_registration_success_subtitle_alt);
                Intrinsics.checkIfNull(string10, "ctx.getString(id)");
                m37003d2.mo166p(string10);
                c1436e0.mo166p(C0928a.m39111f(resourcesProvider.m6899a(), C2336R.C2337drawable.ic_card_success_alt));
                return;
            case 4:
            case 5:
                InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7750e.C7752a0.f20377b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
                String string11 = resourcesProvider.m6899a().getString(C2336R.string.lbl_card_registration_success_title);
                Intrinsics.checkIfNull(string11, "ctx.getString(id)");
                m37003d.mo166p(string11);
                String string12 = resourcesProvider.m6899a().getString(C2336R.string.lbl_registration_success_subtitle_alt);
                Intrinsics.checkIfNull(string12, "ctx.getString(id)");
                m37003d2.mo166p(string12);
                c1436e0.mo166p(C0928a.m39111f(resourcesProvider.m6899a(), C2336R.C2337drawable.ic_card_success));
                return;
            default:
                return;
        }
    }

    /* renamed from: A0 */
    public final LiveData m34536A0() {
        return this.f6255Y;
    }

    /* renamed from: B0 */
    public final LiveData m34535B0() {
        return this.f6249S;
    }

    /* renamed from: C0 */
    public final LiveData m34534C0() {
        return this.f6248R;
    }

    /* renamed from: D0 */
    public final LiveData m34533D0() {
        return this.f6252V;
    }

    /* renamed from: E0 */
    public final void m34532E0() {
        if (C2169a.f6257a[this.f6236F.ordinal()] == 3) {
            InterfaceC7886d.C7887a.m17629a(this.f6234D, AnalyticEvents.AbstractC7750e.C7769p.f20394b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m34531f0() {
        return (Drawable) m34525x0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m34530n0(bd.InterfaceC1886d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ck.CardRegistrationStatusViewModel.C2170b
            if (r0 == 0) goto L13
            r0 = r7
            ck.c$b r0 = (ck.CardRegistrationStatusViewModel.C2170b) r0
            int r1 = r0.f6261z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6261z = r1
            goto L18
        L13:
            ck.c$b r0 = new ck.c$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f6259x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f6261z
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L41
            if (r2 == r3) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r0 = r0.f6258w
            ck.c r0 = (ck.CardRegistrationStatusViewModel) r0
            p468yc.C13186n.m1453b(r7)
            goto L7f
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            java.lang.Object r0 = r0.f6258w
            ck.c r0 = (ck.CardRegistrationStatusViewModel) r0
            p468yc.C13186n.m1453b(r7)
            goto L60
        L41:
            p468yc.C13186n.m1453b(r7)
            pt.pingodoce.app.data.remote.models.response.LoyaltyCard$PoupaMaisStatus r7 = r6.f6236F
            int[] r2 = ck.CardRegistrationStatusViewModel.C2169a.f6257a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            switch(r7) {
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L6b;
                case 4: goto L52;
                case 5: goto L52;
                case 6: goto L71;
                default: goto L51;
            }
        L51:
            goto L87
        L52:
            mg.c0 r7 = r6.f6233C
            r0.f6258w = r6
            r0.f6261z = r3
            java.lang.Object r7 = r7.m18929q(r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r0 = r6
        L60:
            ci.g$a r7 = ci.C2143g.C2144a.f6179a
            r0.m104v(r7)
            zh.l0 r7 = p494zh.C13869l0.f34986a
            p494zh.BaseViewModel.m119C(r0, r7, r4, r5, r4)
            goto L87
        L6b:
            zh.e2 r7 = p494zh.C13829e2.f34936a
            p494zh.BaseViewModel.m119C(r6, r7, r4, r5, r4)
            goto L87
        L71:
            mg.c0 r7 = r6.f6233C
            r0.f6258w = r6
            r0.f6261z = r5
            java.lang.Object r7 = r7.m18929q(r0)
            if (r7 != r1) goto L7e
            return r1
        L7e:
            r0 = r6
        L7f:
            ci.g$a r7 = ci.C2143g.C2144a.f6179a
            r0.m104v(r7)
            r0.m105u()
        L87:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.CardRegistrationStatusViewModel.m34530n0(bd.d):java.lang.Object");
    }

    /* renamed from: o0 */
    protected int m34529o0() {
        Object m37005b = m20389h().m37005b("EXTRA_FOR_LAUNCH_FOR_RESUME");
        Boolean bool = Boolean.FALSE;
        return (Intrinsics.equals(m37005b, bool) && Intrinsics.equals(m20389h().m37005b("EXTRA_FOR_IS_OWNER"), bool)) ? 2131951648 : 2131951646;
    }

    /* renamed from: u0 */
    public final LiveData m34528u0() {
        return this.f6251U;
    }

    /* renamed from: v0 */
    public final LiveData m34527v0() {
        return this.f6254X;
    }

    /* renamed from: w0 */
    public final LiveData m34526w0() {
        return this.f6253W;
    }

    /* renamed from: x0 */
    protected Void m34525x0() {
        return this.f6235E;
    }

    /* renamed from: y0 */
    public final LiveData m34524y0() {
        return this.f6250T;
    }

    /* renamed from: z0 */
    public final LiveData m34523z0() {
        return this.f6256Z;
    }
}
