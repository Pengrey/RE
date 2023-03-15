package mg;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.auth0.android.jwt.JWT;
import com.google.firebase.crashlytics.C4181a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import jm.C6537a;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import p066dg.BannersAgent;
import p066dg.CategoriesAgent;
import p066dg.ClubsAgent;
import p066dg.ClubsCodesAgent;
import p066dg.DefaultStoreAgent;
import p066dg.FlyersAgent;
import p066dg.LoyaltyCardAgent;
import p066dg.RecommendationsCatalogResponsesAgent;
import p066dg.SearchCatalogResponsesAgent;
import p066dg.UserProfileAgent;
import p070e.C4906j;
import p181jd.Intrinsics;
import p276og.C8079b;
import p370te.OAuthManager;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.response.Consent;
import se.OAuthSharedPrefs;
import td.C10531j0;
import td.C10587w0;
import td.InterfaceC10524i0;
import vg.AuthService;
import vg.DeviceService;
import vg.OnboardingService;

/* renamed from: mg.e */
/* loaded from: classes2.dex */
public final class AuthManager {

    /* renamed from: a */
    private final AuthService f19123a;

    /* renamed from: b */
    private final OnboardingService f19124b;

    /* renamed from: c */
    private final DeviceService f19125c;

    /* renamed from: d */
    private final PrefsManager f19126d;

    /* renamed from: e */
    private final EncryptedPrefsManager f19127e;

    /* renamed from: f */
    private final OAuthSharedPrefs f19128f;

    /* renamed from: g */
    private final OAuthManager f19129g;

    /* renamed from: h */
    private final DefaultStoreAgent f19130h;

    /* renamed from: i */
    private final CategoriesAgent f19131i;

    /* renamed from: j */
    private final ClubsAgent f19132j;

    /* renamed from: k */
    private final ClubsCodesAgent f19133k;

    /* renamed from: l */
    private final FlyersAgent f19134l;

    /* renamed from: m */
    private final LoyaltyCardAgent f19135m;

    /* renamed from: n */
    private final RecommendationsCatalogResponsesAgent f19136n;

    /* renamed from: o */
    private final SearchCatalogResponsesAgent f19137o;

    /* renamed from: p */
    private final UserProfileAgent f19138p;

    /* renamed from: q */
    private final ConsentsManager f19139q;

    /* renamed from: r */
    private final BannersAgent f19140r;

    /* renamed from: s */
    private int f19141s;

    /* compiled from: AuthManager.kt */
    /* renamed from: mg.e$a */
    /* loaded from: classes2.dex */
    public static final class C7239a {
        private C7239a() {
        }

        public /* synthetic */ C7239a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager$changePin$2", m20196f = "AuthManager.kt", m20195l = {229}, m20194m = "invokeSuspend")
    /* renamed from: mg.e$b */
    /* loaded from: classes2.dex */
    public static final class C7240b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f19142A;

        /* renamed from: x */
        int f19143x;

        /* renamed from: z */
        final /* synthetic */ String f19145z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7240b(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19145z = str;
            this.f19142A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7240b(this.f19145z, this.f19142A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7240b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19143x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AuthService m18895a = AuthManager.m18895a(AuthManager.this);
                String str = this.f19145z;
                String str2 = this.f19142A;
                this.f19143x = 1;
                if (m18895a.m5613m(str, str2, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            AuthManager.m18890f(AuthManager.this, this.f19145z);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager", m20196f = "AuthManager.kt", m20195l = {C0868i.f2753D0, C0868i.f2758E0, C0868i.f2763F0, 106, C0868i.f2768G0, C0868i.f2773H0, C0868i.f2778I0, 110, 111}, m20194m = "clearCache")
    /* renamed from: mg.e$c */
    /* loaded from: classes2.dex */
    public static final class C7241c extends AbstractC6757d {

        /* renamed from: w */
        Object f19146w;

        /* renamed from: x */
        /* synthetic */ Object f19147x;

        /* renamed from: z */
        int f19149z;

        C7241c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19147x = obj;
            this.f19149z |= Integer.MIN_VALUE;
            return AuthManager.this.m18887i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager", m20196f = "AuthManager.kt", m20195l = {115, C4906j.f13612y0}, m20194m = "clearSession")
    /* renamed from: mg.e$d */
    /* loaded from: classes2.dex */
    public static final class C7242d extends AbstractC6757d {

        /* renamed from: w */
        Object f19150w;

        /* renamed from: x */
        /* synthetic */ Object f19151x;

        /* renamed from: z */
        int f19153z;

        C7242d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19151x = obj;
            this.f19153z |= Integer.MIN_VALUE;
            return AuthManager.this.m18885k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager$login$2", m20196f = "AuthManager.kt", m20195l = {171, 172, 183, 186, 187, 188}, m20194m = "invokeSuspend")
    /* renamed from: mg.e$e */
    /* loaded from: classes2.dex */
    public static final class C7243e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ AuthManager f19154A;

        /* renamed from: B */
        final /* synthetic */ String f19155B;

        /* renamed from: C */
        final /* synthetic */ String f19156C;

        /* renamed from: D */
        final /* synthetic */ Consent f19157D;

        /* renamed from: x */
        Object f19158x;

        /* renamed from: y */
        int f19159y;

        /* renamed from: z */
        final /* synthetic */ String f19160z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7243e(String str, AuthManager authManager, String str2, String str3, Consent consent, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19160z = str;
            this.f19154A = authManager;
            this.f19155B = str2;
            this.f19156C = str3;
            this.f19157D = consent;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7243e(this.f19160z, this.f19154A, this.f19155B, this.f19156C, this.f19157D, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7243e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ed A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ff A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mg.AuthManager.C7243e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager", m20196f = "AuthManager.kt", m20195l = {197}, m20194m = "loginAsAnonymous")
    /* renamed from: mg.e$f */
    /* loaded from: classes2.dex */
    public static final class C7244f extends AbstractC6757d {

        /* renamed from: w */
        Object f19161w;

        /* renamed from: x */
        /* synthetic */ Object f19162x;

        /* renamed from: z */
        int f19164z;

        C7244f(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19162x = obj;
            this.f19164z |= Integer.MIN_VALUE;
            return AuthManager.this.m18875u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager", m20196f = "AuthManager.kt", m20195l = {234}, m20194m = "logout")
    /* renamed from: mg.e$g */
    /* loaded from: classes2.dex */
    public static final class C7245g extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19165w;

        /* renamed from: y */
        int f19167y;

        C7245g(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19165w = obj;
            this.f19167y |= Integer.MIN_VALUE;
            return AuthManager.this.m18874v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager", m20196f = "AuthManager.kt", m20195l = {241}, m20194m = "sendDeviceToken")
    /* renamed from: mg.e$h */
    /* loaded from: classes2.dex */
    public static final class C7246h extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19168w;

        /* renamed from: y */
        int f19170y;

        C7246h(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19168w = obj;
            this.f19170y |= Integer.MIN_VALUE;
            return AuthManager.m18889g(AuthManager.this, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager$updateDeviceToken$1", m20196f = "AuthManager.kt", m20195l = {136}, m20194m = "invokeSuspend")
    /* renamed from: mg.e$i */
    /* loaded from: classes2.dex */
    public static final class C7247i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f19171A;

        /* renamed from: x */
        int f19172x;

        /* renamed from: y */
        private /* synthetic */ Object f19173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7247i(String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f19171A = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C7247i c7247i = new C7247i(this.f19171A, interfaceC1886d);
            c7247i.f19173y = obj;
            return c7247i;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7247i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Object m1458a;
            AuthManager authManager;
            m34636d = C2116d.m34636d();
            int i = this.f19172x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f19173y;
                    AuthManager authManager2 = AuthManager.this;
                    String str = this.f19171A;
                    C13183m.C13184a c13184a = C13183m.f34143w;
                    List m18525l = AuthManager.m18892d(authManager2).m18525l();
                    this.f19173y = authManager2;
                    this.f19172x = 1;
                    if (AuthManager.m18889g(authManager2, str, m18525l, this) == m34636d) {
                        return m34636d;
                    }
                    authManager = authManager2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    authManager = (AuthManager) this.f19173y;
                    C13186n.m1453b(obj);
                }
                AuthManager.m18892d(authManager).m18533d();
                m1458a = C13183m.m1458a(C13195u.f34156a);
            } catch (Throwable th2) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th2));
            }
            Throwable m1457b = C13183m.m1457b(m1458a);
            if (m1457b != null) {
                C4181a.m28418a().m28415d(m1457b);
                C6537a.m20674e(m1457b);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.AuthManager$validatePinOnServices$2", m20196f = "AuthManager.kt", m20195l = {224}, m20194m = "invokeSuspend")
    /* renamed from: mg.e$j */
    /* loaded from: classes2.dex */
    public static final class C7248j extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19175x;

        /* renamed from: z */
        final /* synthetic */ String f19177z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7248j(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19177z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7248j(this.f19177z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7248j) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19175x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AuthService m18895a = AuthManager.m18895a(AuthManager.this);
                String str = this.f19177z;
                this.f19175x = 1;
                obj = m18895a.m5611o(str, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    static {
        new C7239a(null);
    }

    public AuthManager(AuthService authService, OnboardingService onboardingService, DeviceService deviceService, PrefsManager prefsManager, EncryptedPrefsManager encryptedPrefsManager, OAuthSharedPrefs oAuthSharedPrefs, OAuthManager oAuthManager, DefaultStoreAgent defaultStoreAgent, CategoriesAgent categoriesAgent, ClubsAgent clubsAgent, ClubsCodesAgent clubsCodesAgent, FlyersAgent flyersAgent, LoyaltyCardAgent loyaltyCardAgent, RecommendationsCatalogResponsesAgent recommendationsCatalogResponsesAgent, SearchCatalogResponsesAgent searchCatalogResponsesAgent, UserProfileAgent userProfileAgent, ConsentsManager consentsManager, BannersAgent bannersAgent) {
        Intrinsics.isThisObjectNull(authService, "authService");
        Intrinsics.isThisObjectNull(onboardingService, "onboardingService");
        Intrinsics.isThisObjectNull(deviceService, "deviceService");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(encryptedPrefsManager, "encryptedPrefsManager");
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "oAuthSharedPrefs");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(defaultStoreAgent, "defaultStoreAgent");
        Intrinsics.isThisObjectNull(categoriesAgent, "categoriesAgent");
        Intrinsics.isThisObjectNull(clubsAgent, "clubsAgent");
        Intrinsics.isThisObjectNull(clubsCodesAgent, "clubsCodesAgent");
        Intrinsics.isThisObjectNull(flyersAgent, "flyersAgent");
        Intrinsics.isThisObjectNull(loyaltyCardAgent, "loyaltyCardAgent");
        Intrinsics.isThisObjectNull(recommendationsCatalogResponsesAgent, "recommendationsCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(searchCatalogResponsesAgent, "searchCatalogResponsesAgent");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(bannersAgent, "bannersAgent");
        this.f19123a = authService;
        this.f19124b = onboardingService;
        this.f19125c = deviceService;
        this.f19126d = prefsManager;
        this.f19127e = encryptedPrefsManager;
        this.f19128f = oAuthSharedPrefs;
        this.f19129g = oAuthManager;
        this.f19130h = defaultStoreAgent;
        this.f19131i = categoriesAgent;
        this.f19132j = clubsAgent;
        this.f19133k = clubsCodesAgent;
        this.f19134l = flyersAgent;
        this.f19135m = loyaltyCardAgent;
        this.f19136n = recommendationsCatalogResponsesAgent;
        this.f19137o = searchCatalogResponsesAgent;
        this.f19138p = userProfileAgent;
        this.f19139q = consentsManager;
        this.f19140r = bannersAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ AuthService m18895a(AuthManager authManager) {
        return authManager.f19123a;
    }

    /* renamed from: b */
    public static final /* synthetic */ OAuthManager m18894b(AuthManager authManager) {
        return authManager.f19129g;
    }

    /* renamed from: c */
    public static final /* synthetic */ OnboardingService m18893c(AuthManager authManager) {
        return authManager.f19124b;
    }

    /* renamed from: d */
    public static final /* synthetic */ PrefsManager m18892d(AuthManager authManager) {
        return authManager.f19126d;
    }

    /* renamed from: e */
    public static final /* synthetic */ UserProfileAgent m18891e(AuthManager authManager) {
        return authManager.f19138p;
    }

    /* renamed from: f */
    public static final /* synthetic */ void m18890f(AuthManager authManager, String str) {
        authManager.m18873w(str);
    }

    /* renamed from: g */
    public static final /* synthetic */ Object m18889g(AuthManager authManager, String str, List list, InterfaceC1886d interfaceC1886d) {
        return authManager.m18872x(str, list, interfaceC1886d);
    }

    /* renamed from: p */
    private final boolean m18880p() {
        try {
            return !new JWT(this.f19129g.m7577e()).m34266d(36000L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: w */
    private final void m18873w(String str) {
        if (C7254f.m18863a(str)) {
            this.f19127e.m18414l(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m18872x(java.lang.String r5, java.util.List r6, bd.InterfaceC1886d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.AuthManager.C7246h
            if (r0 == 0) goto L13
            r0 = r7
            mg.e$h r0 = (mg.AuthManager.C7246h) r0
            int r1 = r0.f19170y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19170y = r1
            goto L18
        L13:
            mg.e$h r0 = new mg.e$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19168w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19170y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r7)
            vg.m r7 = r4.f19125c
            pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest r2 = new pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest
            r2.<init>(r5, r6)
            r0.f19170y = r3
            java.lang.Object r7 = r7.m5447m(r2, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r5 = r7 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4f
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r3)
            return r5
        L4f:
            boolean r5 = r7 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L5a
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r5 = r7.m26591a()
            throw r5
        L5a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.AuthManager.m18872x(java.lang.String, java.util.List, bd.d):java.lang.Object");
    }

    /* renamed from: y */
    private final void m18871y(String str) {
        C6537a.m20675d("Device token: " + str, new Object[0]);
        this.f19126d.m18547M(str);
    }

    /* renamed from: A */
    public final boolean m18899A() {
        return this.f19127e.m18413m();
    }

    /* renamed from: B */
    public final void m18898B() {
        String m18884l = m18884l();
        if (m18884l.length() > 0) {
            m18897C(m18884l);
        }
    }

    /* renamed from: C */
    public final void m18897C(String str) {
        Intrinsics.isThisObjectNull(str, "token");
        C6537a.m20675d(str, new Object[0]);
        m18871y(str);
        if (m18880p()) {
            C6772d.m20158d(C10531j0.m7771a(C10587w0.m7620b()), null, null, new C7247i(str, null), 3, null);
        }
    }

    /* renamed from: D */
    public final Object m18896D(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7248j(str, null), interfaceC1886d);
    }

    /* renamed from: h */
    public final Object m18888h(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7240b(str, str2, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd A[RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18887i(bd.InterfaceC1886d r5) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.AuthManager.m18887i(bd.d):java.lang.Object");
    }

    /* renamed from: j */
    public final void m18886j() {
        this.f19127e.m18423c();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18885k(bd.InterfaceC1886d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mg.AuthManager.C7242d
            if (r0 == 0) goto L13
            r0 = r6
            mg.e$d r0 = (mg.AuthManager.C7242d) r0
            int r1 = r0.f19153z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19153z = r1
            goto L18
        L13:
            mg.e$d r0 = new mg.e$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19151x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19153z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f19150w
            mg.e r0 = (mg.AuthManager) r0
            p468yc.C13186n.m1453b(r6)
            goto L5d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            java.lang.Object r2 = r0.f19150w
            mg.e r2 = (mg.AuthManager) r2
            p468yc.C13186n.m1453b(r6)
            goto L4f
        L40:
            p468yc.C13186n.m1453b(r6)
            r0.f19150w = r5
            r0.f19153z = r4
            java.lang.Object r6 = r5.m18887i(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            dg.b0 r6 = r2.f19138p
            r0.f19150w = r2
            r0.f19153z = r3
            java.lang.Object r6 = r6.m25801g(r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r0 = r2
        L5d:
            se.a r6 = r0.f19128f
            r6.m8864a()
            mg.y r6 = r0.f19127e
            r6.m18424b()
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.AuthManager.m18885k(bd.d):java.lang.Object");
    }

    /* renamed from: l */
    public final String m18884l() {
        return this.f19126d.m18526k();
    }

    /* renamed from: m */
    public final String m18883m() {
        return this.f19127e.m18421e();
    }

    /* renamed from: n */
    public final boolean m18882n() {
        return C7254f.m18863a(m18883m());
    }

    /* renamed from: o */
    public final boolean m18881o() {
        return this.f19126d.m18513x();
    }

    /* renamed from: q */
    public final boolean m18879q(String str) {
        Intrinsics.isThisObjectNull(str, "pin");
        boolean equals = Intrinsics.equals(m18883m(), str);
        if (equals) {
            this.f19141s = 0;
        } else {
            int i = this.f19141s + 1;
            this.f19141s = i;
            if (i == 2) {
                m18886j();
            }
        }
        return equals;
    }

    /* renamed from: r */
    public final boolean m18878r() {
        return this.f19127e.m18419g();
    }

    /* renamed from: s */
    public final boolean m18877s() {
        return this.f19127e.m18418h();
    }

    /* renamed from: t */
    public final Object m18876t(String str, String str2, String str3, Consent consent, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16961a(new C7243e(str2, this, str, str3, consent, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18875u(bd.InterfaceC1886d r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof mg.AuthManager.C7244f
            if (r2 == 0) goto L17
            r2 = r1
            mg.e$f r2 = (mg.AuthManager.C7244f) r2
            int r3 = r2.f19164z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f19164z = r3
            goto L1c
        L17:
            mg.e$f r2 = new mg.e$f
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f19162x
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f19164z
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r2 = r2.f19161w
            mg.e r2 = (mg.AuthManager) r2
            p468yc.C13186n.m1453b(r1)
            goto L7c
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            p468yc.C13186n.m1453b(r1)
            vg.u r1 = r0.f19124b
            pt.pingodoce.app.data.remote.models.request.GuestAccessRequest r4 = new pt.pingodoce.app.data.remote.models.request.GuestAccessRequest
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "randomUUID().toString()"
            p181jd.Intrinsics.checkIfNull(r6, r7)
            mg.s r7 = r0.f19139q
            pt.pingodoce.app.data.remote.models.response.Consent r7 = r7.m18566e()
            pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest r8 = new pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest
            java.lang.String r9 = r19.m18884l()
            r8.<init>(r9)
            pt.pingodoce.app.data.remote.models.request.AppNotifications r9 = new pt.pingodoce.app.data.remote.models.request.AppNotifications
            r11 = 1
            r12 = 1
            r13 = 1
            r14 = 1
            r15 = 1
            r16 = 1
            r17 = 1
            r18 = 1
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r4.<init>(r6, r7, r8, r9)
            r2.f19161w = r0
            r2.f19164z = r5
            java.lang.Object r1 = r1.m5392p(r4, r2)
            if (r1 != r3) goto L7b
            return r3
        L7b:
            r2 = r0
        L7c:
            df.d r1 = (p065df.NetworkResult) r1
            boolean r3 = r1 instanceof p065df.NetworkResult.C4792b
            if (r3 == 0) goto L90
            te.a r2 = r2.f19129g
            df.d$b r1 = (p065df.NetworkResult.C4792b) r1
            java.lang.Object r1 = r1.m26590a()
            module.network.data.remote.models.response.AuthenticationResponse r1 = (module.network.data.remote.models.response.AuthenticationResponse) r1
            r2.m7574h(r1)
            goto L95
        L90:
            boolean r1 = r1 instanceof p065df.NetworkResult.C4791a
            if (r1 == 0) goto L9a
            r5 = 0
        L95:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r5)
            return r1
        L9a:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.AuthManager.m18875u(bd.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:9)(2:18|19))(2:20|(1:22))|10|11|12|13))|23|6|(0)(0)|10|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        r0 = p468yc.Result.f34143w;
        r5 = p468yc.Result.m1458a(p468yc.C14131n.m1454a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18874v(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.AuthManager.C7245g
            if (r0 == 0) goto L13
            r0 = r5
            mg.e$g r0 = (mg.AuthManager.C7245g) r0
            int r1 = r0.f19167y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19167y = r1
            goto L18
        L13:
            mg.e$g r0 = new mg.e$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19165w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19167y
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
            te.a r5 = r4.f19129g
            r0.f19167y = r3
            java.lang.Object r5 = r5.m7576f(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            yc.m$a r0 = p468yc.C13183m.f34143w     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4d
            r5.booleanValue()     // Catch: java.lang.Throwable -> L4d
            yc.u r5 = p468yc.C13195u.f34156a     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = p468yc.C13183m.m1458a(r5)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r5 = move-exception
            yc.m$a r0 = p468yc.C13183m.f34143w
            java.lang.Object r5 = p468yc.C13186n.m1454a(r5)
            java.lang.Object r5 = p468yc.C13183m.m1458a(r5)
        L58:
            yc.u r0 = p468yc.C13195u.f34156a
            p468yc.C13183m.m1456c(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.AuthManager.m18874v(bd.d):java.lang.Object");
    }

    /* renamed from: z */
    public final void m18870z() {
        this.f19126d.m18539U();
    }
}
