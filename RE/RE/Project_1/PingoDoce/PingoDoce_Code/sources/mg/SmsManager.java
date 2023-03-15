package mg;

import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import module.network.data.remote.models.response.AuthenticationResponse;
import p066dg.UserProfileAgent;
import p181jd.Intrinsics;
import p276og.C8079b;
import p370te.OAuthManager;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.models.request.PhoneRequest;
import pt.pingodoce.app.data.remote.models.request.SendSmsRequest;
import pt.pingodoce.app.data.remote.models.response.Consent;
import vg.SmsService;

/* renamed from: mg.h1 */
/* loaded from: classes2.dex */
public final class SmsManager {

    /* renamed from: a */
    private final SmsService f19301a;

    /* renamed from: b */
    private final OAuthManager f19302b;

    /* renamed from: c */
    private final LoyaltyCardManager f19303c;

    /* renamed from: d */
    private final UserProfileAgent f19304d;

    /* compiled from: SmsManager.kt */
    /* renamed from: mg.h1$a */
    /* loaded from: classes2.dex */
    public static final class C7289a {
        private C7289a() {
        }

        public /* synthetic */ C7289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.SmsManager$sendSmsToken$2", m20196f = "SmsManager.kt", m20195l = {44}, m20194m = "invokeSuspend")
    /* renamed from: mg.h1$b */
    /* loaded from: classes2.dex */
    public static final class C7290b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19305x;

        /* renamed from: z */
        final /* synthetic */ SendSmsRequest f19307z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7290b(SendSmsRequest sendSmsRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19307z = sendSmsRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7290b(this.f19307z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7290b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19305x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SmsService m18787b = SmsManager.m18787b(SmsManager.this);
                SendSmsRequest sendSmsRequest = this.f19307z;
                this.f19305x = 1;
                obj = m18787b.m5553m(sendSmsRequest, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            SmsManager.m18788a(SmsManager.this).m7574h((AuthenticationResponse) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.SmsManager", m20196f = "SmsManager.kt", m20195l = {50, 60}, m20194m = "validateSmsToken")
    /* renamed from: mg.h1$c */
    /* loaded from: classes2.dex */
    public static final class C7291c extends AbstractC6757d {

        /* renamed from: A */
        int f19308A;

        /* renamed from: w */
        Object f19309w;

        /* renamed from: x */
        Object f19310x;

        /* renamed from: y */
        /* synthetic */ Object f19311y;

        C7291c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19311y = obj;
            this.f19308A |= Integer.MIN_VALUE;
            return SmsManager.this.m18785d(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SmsManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.SmsManager$verifyNumber$2", m20196f = "SmsManager.kt", m20195l = {34}, m20194m = "invokeSuspend")
    /* renamed from: mg.h1$d */
    /* loaded from: classes2.dex */
    public static final class C7292d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19313x;

        /* renamed from: z */
        final /* synthetic */ String f19315z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7292d(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19315z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7292d(this.f19315z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7292d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19313x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SmsService m18787b = SmsManager.m18787b(SmsManager.this);
                PhoneRequest phoneRequest = new PhoneRequest(UtilsExtensions.m35165g(this.f19315z));
                this.f19313x = 1;
                obj = m18787b.m5551o(phoneRequest, this);
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
        new C7289a(null);
    }

    public SmsManager(SmsService smsService, OAuthManager oAuthManager, LoyaltyCardManager loyaltyCardManager, UserProfileAgent userProfileAgent) {
        Intrinsics.isThisObjectNull(smsService, "service");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "cardManager");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        this.f19301a = smsService;
        this.f19302b = oAuthManager;
        this.f19303c = loyaltyCardManager;
        this.f19304d = userProfileAgent;
    }

    /* renamed from: a */
    public static final /* synthetic */ OAuthManager m18788a(SmsManager smsManager) {
        return smsManager.f19302b;
    }

    /* renamed from: b */
    public static final /* synthetic */ SmsService m18787b(SmsManager smsManager) {
        return smsManager.f19301a;
    }

    /* renamed from: c */
    public final Object m18786c(String str, Consent consent, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7290b(consent.m13862f() ? new SendSmsRequest(UtilsExtensions.m35165g(str), null, 2, null) : new SendSmsRequest(UtilsExtensions.m35165g(str), consent), null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0165  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18785d(java.lang.String r7, java.lang.String r8, bd.InterfaceC1886d r9) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.SmsManager.m18785d(java.lang.String, java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: e */
    public final Object m18784e(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7292d(str, null), interfaceC1886d);
    }
}
