package mg;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import vg.EmailService;

/* renamed from: mg.v */
/* loaded from: classes2.dex */
public final class EmailManager {

    /* renamed from: a */
    private final EmailService f19713a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.EmailManager", m20196f = "EmailManager.kt", m20195l = {44}, m20194m = "checkConfirmation")
    /* renamed from: mg.v$a */
    /* loaded from: classes2.dex */
    public static final class C7441a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19714w;

        /* renamed from: y */
        int f19716y;

        C7441a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19714w = obj;
            this.f19716y |= Integer.MIN_VALUE;
            return EmailManager.this.m18456a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.EmailManager", m20196f = "EmailManager.kt", m20195l = {32}, m20194m = "sendConfirmationEmail")
    /* renamed from: mg.v$b */
    /* loaded from: classes2.dex */
    public static final class C7442b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19717w;

        /* renamed from: y */
        int f19719y;

        C7442b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19717w = obj;
            this.f19719y |= Integer.MIN_VALUE;
            return EmailManager.this.m18455b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.EmailManager", m20196f = "EmailManager.kt", m20195l = {57}, m20194m = "validateAndSendEmail")
    /* renamed from: mg.v$c */
    /* loaded from: classes2.dex */
    public static final class C7443c extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19720w;

        /* renamed from: y */
        int f19722y;

        C7443c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19720w = obj;
            this.f19722y |= Integer.MIN_VALUE;
            return EmailManager.this.m18454c(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.EmailManager", m20196f = "EmailManager.kt", m20195l = {20}, m20194m = "validateEmail")
    /* renamed from: mg.v$d */
    /* loaded from: classes2.dex */
    public static final class C7444d extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19723w;

        /* renamed from: y */
        int f19725y;

        C7444d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19723w = obj;
            this.f19725y |= Integer.MIN_VALUE;
            return EmailManager.this.m18453d(null, this);
        }
    }

    public EmailManager(EmailService emailService) {
        Intrinsics.isThisObjectNull(emailService, "service");
        this.f19713a = emailService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18456a(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.EmailManager.C7441a
            if (r0 == 0) goto L13
            r0 = r5
            mg.v$a r0 = (mg.EmailManager.C7441a) r0
            int r1 = r0.f19716y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19716y = r1
            goto L18
        L13:
            mg.v$a r0 = new mg.v$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19714w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19716y
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
            vg.o r5 = r4.f19713a
            r0.f19716y = r3
            java.lang.Object r5 = r5.m5440m(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r0 = r5 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L48
            mg.x$b r5 = mg.AbstractC7468x.C7472b.f19757a
            goto L6f
        L48:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L75
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r0 = r5.m26591a()
            boolean r1 = r0 instanceof p339rg.UserEmailNotConfirmedException
            if (r1 == 0) goto L61
            mg.x$a$b r0 = new mg.x$a$b
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
        L5f:
            r5 = r0
            goto L6f
        L61:
            boolean r0 = r0 instanceof p339rg.UserEmailAlreadyExistsException
            if (r0 == 0) goto L70
            mg.x$a$a r0 = new mg.x$a$a
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
            goto L5f
        L6f:
            return r5
        L70:
            we.b r5 = r5.m26591a()
            throw r5
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.EmailManager.m18456a(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18455b(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.EmailManager.C7442b
            if (r0 == 0) goto L13
            r0 = r6
            mg.v$b r0 = (mg.EmailManager.C7442b) r0
            int r1 = r0.f19719y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19719y = r1
            goto L18
        L13:
            mg.v$b r0 = new mg.v$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19717w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19719y
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
            vg.o r6 = r4.f19713a
            pt.pingodoce.app.data.remote.models.request.ConfirmationEmailRequest r2 = new pt.pingodoce.app.data.remote.models.request.ConfirmationEmailRequest
            java.lang.String r5 = be.UtilsExtensions.m35165g(r5)
            r2.<init>(r5)
            r0.f19719y = r3
            java.lang.Object r6 = r6.m5439n(r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L51
            mg.x$b r5 = mg.AbstractC7468x.C7472b.f19757a
            goto L68
        L51:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6e
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            boolean r5 = r5 instanceof p339rg.UserEmailAlreadyExistsException
            if (r5 == 0) goto L69
            mg.x$a$a r5 = new mg.x$a$a
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L68:
            return r5
        L69:
            we.b r5 = r6.m26591a()
            throw r5
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.EmailManager.m18455b(java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18454c(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, bd.InterfaceC1886d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof mg.EmailManager.C7443c
            if (r0 == 0) goto L13
            r0 = r9
            mg.v$c r0 = (mg.EmailManager.C7443c) r0
            int r1 = r0.f19722y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19722y = r1
            goto L18
        L13:
            mg.v$c r0 = new mg.v$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f19720w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19722y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r9)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r9)
            vg.o r9 = r4.f19713a
            pt.pingodoce.app.data.remote.models.request.ValidateAndSendEmailRequest r2 = new pt.pingodoce.app.data.remote.models.request.ValidateAndSendEmailRequest
            r2.<init>(r5, r6, r7, r8)
            r0.f19722y = r3
            java.lang.Object r9 = r9.m5438o(r2, r0)
            if (r9 != r1) goto L44
            return r1
        L44:
            df.d r9 = (p065df.NetworkResult) r9
            boolean r5 = r9 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4d
            mg.x$b r5 = mg.AbstractC7468x.C7472b.f19757a
            goto L64
        L4d:
            boolean r5 = r9 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6a
            df.d$a r9 = (p065df.NetworkResult.C4791a) r9
            we.b r5 = r9.m26591a()
            boolean r5 = r5 instanceof p339rg.UserEmailAlreadyExistsException
            if (r5 == 0) goto L65
            mg.x$a$a r5 = new mg.x$a$a
            we.b r6 = r9.m26591a()
            r5.<init>(r6)
        L64:
            return r5
        L65:
            we.b r5 = r9.m26591a()
            throw r5
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.EmailManager.m18454c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18453d(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.EmailManager.C7444d
            if (r0 == 0) goto L13
            r0 = r6
            mg.v$d r0 = (mg.EmailManager.C7444d) r0
            int r1 = r0.f19725y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19725y = r1
            goto L18
        L13:
            mg.v$d r0 = new mg.v$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19723w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19725y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.o r6 = r4.f19713a
            pt.pingodoce.app.data.remote.models.request.EmailRequest r2 = new pt.pingodoce.app.data.remote.models.request.EmailRequest
            r2.<init>(r5)
            r0.f19725y = r3
            java.lang.Object r6 = r6.m5437p(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4d
            mg.x$b r5 = mg.AbstractC7468x.C7472b.f19757a
            goto L64
        L4d:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L6a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            boolean r5 = r5 instanceof p339rg.UserEmailAlreadyExistsException
            if (r5 == 0) goto L65
            mg.x$a$a r5 = new mg.x$a$a
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L64:
            return r5
        L65:
            we.b r5 = r6.m26591a()
            throw r5
        L6a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.EmailManager.m18453d(java.lang.String, bd.d):java.lang.Object");
    }
}
