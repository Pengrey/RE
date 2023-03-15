package p317qg;

import bd.InterfaceC1886d;
import cd.C2116d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C6847z;
import kotlinx.coroutines.flow.InterfaceC6835r;
import kotlinx.coroutines.flow.InterfaceC6844x;
import org.threeten.p283bp.C8216e;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: qg.a */
/* loaded from: classes2.dex */
public class C9729a<T> {

    /* renamed from: a */
    private final long f25587a;

    /* renamed from: b */
    private final long f25588b;

    /* renamed from: c */
    private C8216e f25589c;

    /* renamed from: d */
    private C8216e f25590d;

    /* renamed from: e */
    private final InterfaceC6835r f25591e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemoryDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.memoryDataProviders.MemoryDataProvider", m20196f = "MemoryDataProvider.kt", m20195l = {45}, m20194m = "put")
    /* renamed from: qg.a$a */
    /* loaded from: classes2.dex */
    public static final class C9730a extends AbstractC6757d {

        /* renamed from: B */
        int f25593B;

        /* renamed from: w */
        Object f25594w;

        /* renamed from: x */
        Object f25595x;

        /* renamed from: y */
        Object f25596y;

        /* renamed from: z */
        /* synthetic */ Object f25597z;

        C9730a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25597z = obj;
            this.f25593B |= Integer.MIN_VALUE;
            return C9729a.this.m10090k(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MemoryDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.memoryDataProviders.MemoryDataProvider", m20196f = "MemoryDataProvider.kt", m20195l = {51}, m20194m = "put")
    /* renamed from: qg.a$b */
    /* loaded from: classes2.dex */
    public static final class C9731b extends AbstractC6757d {

        /* renamed from: w */
        Object f25598w;

        /* renamed from: x */
        /* synthetic */ Object f25599x;

        /* renamed from: z */
        int f25601z;

        C9731b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f25599x = obj;
            this.f25601z |= Integer.MIN_VALUE;
            return C9729a.this.m10091j(null, this);
        }
    }

    public C9729a() {
        this(0L, 0L, 3, null);
    }

    public C9729a(long j, long j2) {
        this.f25587a = j;
        this.f25588b = j2;
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        this.f25589c = c8216e;
        Intrinsics.checkIfNull(c8216e, "MIN");
        this.f25590d = c8216e;
        this.f25591e = C6847z.m20023a(null);
    }

    /* renamed from: b */
    private final void m10099b() {
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        this.f25590d = c8216e;
        Intrinsics.checkIfNull(c8216e, "MIN");
        this.f25589c = c8216e;
    }

    /* renamed from: l */
    private final void m10089l() {
        C8216e m16144P = C8216e.m16153G().m16144P(this.f25588b);
        Intrinsics.checkIfNull(m16144P, "now().plusSeconds(timeToExpiry)");
        this.f25590d = m16144P;
        C8216e m16144P2 = C8216e.m16153G().m16144P(this.f25587a);
        Intrinsics.checkIfNull(m16144P2, "now().plusSeconds(timeToRefresh)");
        this.f25589c = m16144P2;
    }

    /* renamed from: a */
    public final Object m10100a(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        m10099b();
        Object mo4529a = this.f25591e.mo4529a(null, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo4529a == m34636d ? mo4529a : C13195u.f34156a;
    }

    /* renamed from: c */
    public final Object m10098c() {
        return this.f25591e.getValue();
    }

    /* renamed from: d */
    public final C8216e m10097d() {
        if (!Intrinsics.equals(this.f25590d, C8216e.f21368y)) {
            C8216e m16154F = this.f25590d.m16154F(this.f25588b);
            Intrinsics.checkIfNull(m16154F, "{\n            expiryDate…s(timeToExpiry)\n        }");
            return m16154F;
        }
        return this.f25590d;
    }

    /* renamed from: e */
    public final boolean m10096e() {
        return this.f25589c.mo16134l(C8216e.m16153G());
    }

    /* renamed from: f */
    public final InterfaceC6844x m10095f() {
        return this.f25591e;
    }

    /* renamed from: g */
    public final boolean m10094g() {
        return this.f25590d.mo16134l(C8216e.m16153G());
    }

    /* renamed from: h */
    public final void m10093h() {
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        this.f25590d = c8216e;
    }

    /* renamed from: i */
    public final void m10092i() {
        C8216e c8216e = C8216e.f21368y;
        Intrinsics.checkIfNull(c8216e, "MIN");
        this.f25589c = c8216e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10091j(java.lang.Object r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p317qg.C9729a.C9731b
            if (r0 == 0) goto L13
            r0 = r6
            qg.a$b r0 = (p317qg.C9729a.C9731b) r0
            int r1 = r0.f25601z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25601z = r1
            goto L18
        L13:
            qg.a$b r0 = new qg.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25599x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f25601z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f25598w
            qg.a r5 = (p317qg.C9729a) r5
            p468yc.C13186n.m1453b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r6)
            kotlinx.coroutines.flow.r r6 = r4.f25591e
            r0.f25598w = r4
            r0.f25601z = r3
            java.lang.Object r5 = r6.mo4529a(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            r5.m10089l()
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p317qg.C9729a.m10091j(java.lang.Object, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10090k(java.lang.Object r5, org.threeten.p283bp.C8216e r6, org.threeten.p283bp.C8216e r7, bd.InterfaceC1886d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p317qg.C9729a.C9730a
            if (r0 == 0) goto L13
            r0 = r8
            qg.a$a r0 = (p317qg.C9729a.C9730a) r0
            int r1 = r0.f25593B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25593B = r1
            goto L18
        L13:
            qg.a$a r0 = new qg.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25597z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f25593B
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f25596y
            r7 = r5
            org.threeten.bp.e r7 = (org.threeten.p283bp.C8216e) r7
            java.lang.Object r5 = r0.f25595x
            r6 = r5
            org.threeten.bp.e r6 = (org.threeten.p283bp.C8216e) r6
            java.lang.Object r5 = r0.f25594w
            qg.a r5 = (p317qg.C9729a) r5
            p468yc.C13186n.m1453b(r8)
            goto L54
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            p468yc.C13186n.m1453b(r8)
            kotlinx.coroutines.flow.r r8 = r4.f25591e
            r0.f25594w = r4
            r0.f25595x = r6
            r0.f25596y = r7
            r0.f25593B = r3
            java.lang.Object r5 = r8.mo4529a(r5, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r5 = r4
        L54:
            r5.f25590d = r6
            r5.f25589c = r7
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p317qg.C9729a.m10090k(java.lang.Object, org.threeten.bp.e, org.threeten.bp.e, bd.d):java.lang.Object");
    }

    public /* synthetic */ C9729a(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 300L : j, (i & 2) != 0 ? 3600L : j2);
    }
}
