package androidx.lifecycle;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;
import td.C10531j0;
import td.C10549n2;
import td.C10587w0;
import td.InterfaceC10574t1;

/* compiled from: CoroutineLiveData.kt */
/* renamed from: androidx.lifecycle.f */
/* loaded from: classes.dex */
public final class C1437f<T> extends C1430c0 {

    /* renamed from: m */
    private C1427c f4292m;

    /* renamed from: n */
    private C1447j f4293n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineLiveData.kt */
    /* renamed from: androidx.lifecycle.f$a */
    /* loaded from: classes.dex */
    public static final class C1438a extends AbstractC6438m implements InterfaceC6097a {
        C1438a() {
            super(0);
        }

        /* renamed from: a */
        public final void m37042a() {
            C1437f.m37044r(C1437f.this, null);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m37042a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CoroutineLiveData.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.CoroutineLiveData", m20196f = "CoroutineLiveData.kt", m20195l = {234}, m20194m = "clearSource$lifecycle_livedata_ktx_release")
    /* renamed from: androidx.lifecycle.f$b */
    /* loaded from: classes.dex */
    public static final class C1439b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f4295w;

        /* renamed from: x */
        int f4296x;

        /* renamed from: z */
        Object f4298z;

        C1439b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f4295w = obj;
            this.f4296x |= Integer.MIN_VALUE;
            return C1437f.this.m37043s(this);
        }
    }

    public C1437f(CoroutineContext coroutineContext, long j, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        this.f4292m = new C1427c(this, interfaceC6112p, j, C10531j0.m7771a(C10587w0.m7619c().mo7830H0().mo4545f0(coroutineContext).mo4545f0(C10549n2.m7696a((InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s)))), new C1438a());
    }

    /* renamed from: r */
    public static final /* synthetic */ void m37044r(C1437f c1437f, C1427c c1427c) {
        c1437f.f4292m = c1427c;
    }

    /* renamed from: k */
    protected void mo36938k() {
        super.mo36938k();
        C1427c c1427c = this.f4292m;
        if (c1427c != null) {
            c1427c.m37056h();
        }
    }

    /* renamed from: l */
    protected void mo36937l() {
        super.mo36937l();
        C1427c c1427c = this.f4292m;
        if (c1427c != null) {
            c1427c.m37057g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m37043s(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.C1437f.C1439b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.f$b r0 = (androidx.lifecycle.C1437f.C1439b) r0
            int r1 = r0.f4296x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4296x = r1
            goto L18
        L13:
            androidx.lifecycle.f$b r0 = new androidx.lifecycle.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4295w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f4296x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f4298z
            androidx.lifecycle.f r0 = (androidx.lifecycle.C1437f) r0
            p468yc.C13186n.m1453b(r5)
            goto L48
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            p468yc.C13186n.m1453b(r5)
            androidx.lifecycle.j r5 = r4.f4293n
            if (r5 == 0) goto L47
            r0.f4298z = r4
            r0.f4296x = r3
            java.lang.Object r5 = r5.m37029a(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            r5 = 0
            r0.f4293n = r5
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1437f.m37043s(bd.d):java.lang.Object");
    }
}
