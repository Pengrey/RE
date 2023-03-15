package mg;

import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import module.network.data.remote.models.response.AuthenticationResponse;
import p181jd.Intrinsics;
import p276og.C8079b;
import p370te.OAuthManager;
import p468yc.C13186n;
import p468yc.C13195u;
import vg.PhoneService;

/* renamed from: mg.n0 */
/* loaded from: classes2.dex */
public final class PhoneManager {

    /* renamed from: a */
    private final PhoneService f19530a;

    /* renamed from: b */
    private final OAuthManager f19531b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PhoneManager", m20196f = "PhoneManager.kt", m20195l = {47}, m20194m = "changeNumber")
    /* renamed from: mg.n0$a */
    /* loaded from: classes2.dex */
    public static final class C7359a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19532w;

        /* renamed from: y */
        int f19534y;

        C7359a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19532w = obj;
            this.f19534y |= Integer.MIN_VALUE;
            return PhoneManager.this.m18661c(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PhoneManager", m20196f = "PhoneManager.kt", m20195l = {40}, m20194m = "sendValidationSms")
    /* renamed from: mg.n0$b */
    /* loaded from: classes2.dex */
    public static final class C7360b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19535w;

        /* renamed from: y */
        int f19537y;

        C7360b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19535w = obj;
            this.f19537y |= Integer.MIN_VALUE;
            return PhoneManager.this.m18660d(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PhoneManager", m20196f = "PhoneManager.kt", m20195l = {22}, m20194m = "validateNumber")
    /* renamed from: mg.n0$c */
    /* loaded from: classes2.dex */
    public static final class C7361c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19538w;

        /* renamed from: y */
        int f19540y;

        C7361c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19538w = obj;
            this.f19540y |= Integer.MIN_VALUE;
            return PhoneManager.this.m18659e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.PhoneManager$validateOwner$2", m20196f = "PhoneManager.kt", m20195l = {34}, m20194m = "invokeSuspend")
    /* renamed from: mg.n0$d */
    /* loaded from: classes2.dex */
    public static final class C7362d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f19541A;

        /* renamed from: x */
        int f19542x;

        /* renamed from: z */
        final /* synthetic */ String f19544z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7362d(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19544z = str;
            this.f19541A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7362d(this.f19544z, this.f19541A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7362d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19542x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PhoneService m18662b = PhoneManager.m18662b(PhoneManager.this);
                String m35165g = UtilsExtensions.m35165g(this.f19544z);
                String str = this.f19541A;
                this.f19542x = 1;
                obj = m18662b.m5377p(m35165g, str, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            PhoneManager.m18663a(PhoneManager.this).m7574h((AuthenticationResponse) obj);
            return C13195u.f34156a;
        }
    }

    public PhoneManager(PhoneService phoneService, OAuthManager oAuthManager) {
        Intrinsics.isThisObjectNull(phoneService, "service");
        Intrinsics.isThisObjectNull(oAuthManager, "oAuthManager");
        this.f19530a = phoneService;
        this.f19531b = oAuthManager;
    }

    /* renamed from: a */
    public static final /* synthetic */ OAuthManager m18663a(PhoneManager phoneManager) {
        return phoneManager.f19531b;
    }

    /* renamed from: b */
    public static final /* synthetic */ PhoneService m18662b(PhoneManager phoneManager) {
        return phoneManager.f19530a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18661c(java.lang.String r5, java.lang.String r6, bd.InterfaceC1886d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof mg.PhoneManager.C7359a
            if (r0 == 0) goto L13
            r0 = r7
            mg.n0$a r0 = (mg.PhoneManager.C7359a) r0
            int r1 = r0.f19534y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19534y = r1
            goto L18
        L13:
            mg.n0$a r0 = new mg.n0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19532w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19534y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r7)
            vg.w r7 = r4.f19530a
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r0.f19534y = r3
            java.lang.Object r7 = r7.m5380m(r5, r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            df.d r7 = (p065df.NetworkResult) r7
            boolean r5 = r7 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4c
            mg.p0$b r5 = mg.AbstractC7377p0.C7381b.f19590a
            goto L5b
        L4c:
            boolean r5 = r7 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L5c
            mg.p0$a$a r5 = new mg.p0$a$a
            df.d$a r7 = (p065df.NetworkResult.C4791a) r7
            we.b r6 = r7.m26591a()
            r5.<init>(r6)
        L5b:
            return r5
        L5c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PhoneManager.m18661c(java.lang.String, java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18660d(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.PhoneManager.C7360b
            if (r0 == 0) goto L13
            r0 = r6
            mg.n0$b r0 = (mg.PhoneManager.C7360b) r0
            int r1 = r0.f19537y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19537y = r1
            goto L18
        L13:
            mg.n0$b r0 = new mg.n0$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19535w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19537y
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
            vg.w r6 = r4.f19530a
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r0.f19537y = r3
            java.lang.Object r6 = r6.m5379n(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4c
            mg.p0$b r5 = mg.AbstractC7377p0.C7381b.f19590a
            goto L5b
        L4c:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L5c
            mg.p0$a$a r5 = new mg.p0$a$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L5b:
            return r5
        L5c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PhoneManager.m18660d(java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18659e(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.PhoneManager.C7361c
            if (r0 == 0) goto L13
            r0 = r6
            mg.n0$c r0 = (mg.PhoneManager.C7361c) r0
            int r1 = r0.f19540y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19540y = r1
            goto L18
        L13:
            mg.n0$c r0 = new mg.n0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19538w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19540y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.w r6 = r4.f19530a
            pt.pingodoce.app.data.remote.models.request.PhoneRequest r2 = new pt.pingodoce.app.data.remote.models.request.PhoneRequest
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r2.<init>(r5)
            r0.f19540y = r3
            java.lang.Object r6 = r6.m5378o(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L51
            mg.p0$b r5 = mg.AbstractC7377p0.C7381b.f19590a
            goto L72
        L51:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L73
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            boolean r5 = r5 instanceof p339rg.UserNotFoundException
            if (r5 == 0) goto L69
            mg.p0$a$b r5 = new mg.p0$a$b
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
            goto L72
        L69:
            mg.p0$a$a r5 = new mg.p0$a$a
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L72:
            return r5
        L73:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.PhoneManager.m18659e(java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: f */
    public final Object m18658f(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7362d(str, str2, null), interfaceC1886d);
    }
}
