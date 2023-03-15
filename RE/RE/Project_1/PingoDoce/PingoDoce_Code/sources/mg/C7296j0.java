package mg;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p370te.OAuthManager;
import pg.OnboardingFlowDataSharedPreferences;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import vg.OnboardingService;

/* compiled from: OnboardingManager.kt */
/* renamed from: mg.j0 */
/* loaded from: classes2.dex */
public final class C7296j0 {

    /* renamed from: a */
    private final OnboardingService f19326a;

    /* renamed from: b */
    private final OAuthManager f19327b;

    /* renamed from: c */
    private final EncryptedPrefsManager f19328c;

    /* renamed from: d */
    private final OnboardingFlowDataSharedPreferences f19329d;

    /* renamed from: e */
    private final UserProfileAgent f19330e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.OnboardingManager", m20196f = "OnboardingManager.kt", m20195l = {56}, m20194m = "getLoyaltyCards")
    /* renamed from: mg.j0$a */
    /* loaded from: classes2.dex */
    public static final class C7297a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19331w;

        /* renamed from: y */
        int f19333y;

        C7297a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19331w = obj;
            this.f19333y |= Integer.MIN_VALUE;
            return C7296j0.this.m18771a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.OnboardingManager", m20196f = "OnboardingManager.kt", m20195l = {81, C0868i.f2968t0}, m20194m = "register")
    /* renamed from: mg.j0$b */
    /* loaded from: classes2.dex */
    public static final class C7298b extends AbstractC6757d {

        /* renamed from: B */
        int f19335B;

        /* renamed from: w */
        Object f19336w;

        /* renamed from: x */
        Object f19337x;

        /* renamed from: y */
        Object f19338y;

        /* renamed from: z */
        /* synthetic */ Object f19339z;

        C7298b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19339z = obj;
            this.f19335B |= Integer.MIN_VALUE;
            return C7296j0.this.m18769c(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.OnboardingManager", m20196f = "OnboardingManager.kt", m20195l = {34}, m20194m = "verifyCardOwner")
    /* renamed from: mg.j0$c */
    /* loaded from: classes2.dex */
    public static final class C7299c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19340w;

        /* renamed from: y */
        int f19342y;

        C7299c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19340w = obj;
            this.f19342y |= Integer.MIN_VALUE;
            return C7296j0.this.m18767e(null, this);
        }
    }

    public C7296j0(OnboardingService onboardingService, OAuthManager oAuthManager, EncryptedPrefsManager encryptedPrefsManager, OnboardingFlowDataSharedPreferences onboardingFlowDataSharedPreferences, UserProfileAgent userProfileAgent) {
        Intrinsics.isThisObjectNull(onboardingService, "service");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(encryptedPrefsManager, "encryptedPrefs");
        Intrinsics.isThisObjectNull(onboardingFlowDataSharedPreferences, "onboardingFlowDataSharedPreferences");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        this.f19326a = onboardingService;
        this.f19327b = oAuthManager;
        this.f19328c = encryptedPrefsManager;
        this.f19329d = onboardingFlowDataSharedPreferences;
        this.f19330e = userProfileAgent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18771a(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7296j0.C7297a
            if (r0 == 0) goto L13
            r0 = r5
            mg.j0$a r0 = (mg.C7296j0.C7297a) r0
            int r1 = r0.f19333y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19333y = r1
            goto L18
        L13:
            mg.j0$a r0 = new mg.j0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19331w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19333y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            vg.u r5 = r4.f19326a
            r0.f19333y = r3
            java.lang.Object r5 = r5.m5395m(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r0 = r5 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L51
            df.d$b r0 = new df.d$b
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r5 = r5.m26590a()
            r0.<init>(r5)
            return r0
        L51:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L5c
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r5 = r5.m26591a()
            throw r5
        L5c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7296j0.m18771a(bd.d):java.lang.Object");
    }

    /* renamed from: b */
    public final OnboardingFlowData m18770b() {
        return this.f19329d.m14990b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0148  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18769c(pt.pingodoce.app.data.local.flows.OnboardingFlowData r23, java.lang.String r24, bd.InterfaceC1886d r25) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7296j0.m18769c(pt.pingodoce.app.data.local.flows.OnboardingFlowData, java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: d */
    public final void m18768d(OnboardingFlowData onboardingFlowData) {
        Intrinsics.isThisObjectNull(onboardingFlowData, "onboardingFlowData");
        this.f19329d.m14989c(onboardingFlowData);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18767e(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7296j0.C7299c
            if (r0 == 0) goto L13
            r0 = r6
            mg.j0$c r0 = (mg.C7296j0.C7299c) r0
            int r1 = r0.f19342y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19342y = r1
            goto L18
        L13:
            mg.j0$c r0 = new mg.j0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19340w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19342y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.u r6 = r4.f19326a
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r0.f19342y = r3
            java.lang.Object r6 = r6.m5391q(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L57
            mg.v1$b r5 = new mg.v1$b
            df.d$b r6 = (p065df.NetworkResult.C4792b) r6
            java.lang.Object r6 = r6.m26590a()
            pt.pingodoce.app.data.remote.models.response.CardOwnerResponse r6 = (pt.pingodoce.app.data.remote.models.response.CardOwnerResponse) r6
            r5.<init>(r6)
            goto L86
        L57:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L87
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            boolean r0 = r5 instanceof p339rg.InvalidCardFormatException
            if (r0 == 0) goto L6f
            mg.v1$a$c r5 = new mg.v1$a$c
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
            goto L86
        L6f:
            boolean r5 = r5 instanceof p339rg.CardAlreadyRegisteredException
            if (r5 == 0) goto L7d
            mg.v1$a$a r5 = new mg.v1$a$a
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
            goto L86
        L7d:
            mg.v1$a$b r5 = new mg.v1$a$b
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L86:
            return r5
        L87:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7296j0.m18767e(java.lang.String, bd.d):java.lang.Object");
    }
}
