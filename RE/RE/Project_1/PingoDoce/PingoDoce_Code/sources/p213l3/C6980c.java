package p213l3;

import bd.InterfaceC1886d;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p095f3.InterfaceC5351c;
import p213l3.InterfaceC6978b;
import p305q3.C9629g;
import p305q3.C9633i;
import p327r3.C9805i;

/* renamed from: l3.c */
/* loaded from: classes.dex */
public final class C6980c implements InterfaceC6978b.InterfaceC6979a {

    /* renamed from: a */
    private final C9629g f18586a;

    /* renamed from: b */
    private final List<InterfaceC6978b> f18587b;

    /* renamed from: c */
    private final int f18588c;

    /* renamed from: d */
    private final C9629g f18589d;

    /* renamed from: e */
    private final C9805i f18590e;

    /* renamed from: f */
    private final InterfaceC5351c f18591f;

    /* renamed from: g */
    private final boolean f18592g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealInterceptorChain.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.RealInterceptorChain", m20196f = "RealInterceptorChain.kt", m20195l = {25}, m20194m = "proceed")
    /* renamed from: l3.c$a */
    /* loaded from: classes.dex */
    public static final class C6981a extends AbstractC6757d {

        /* renamed from: A */
        int f18593A;

        /* renamed from: w */
        Object f18594w;

        /* renamed from: x */
        Object f18595x;

        /* renamed from: y */
        /* synthetic */ Object f18596y;

        C6981a(InterfaceC1886d<? super C6981a> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18596y = obj;
            this.f18593A |= Integer.MIN_VALUE;
            return C6980c.this.m19663h(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6980c(C9629g c9629g, List<? extends InterfaceC6978b> list, int i, C9629g c9629g2, C9805i c9805i, InterfaceC5351c interfaceC5351c, boolean z) {
        this.f18586a = c9629g;
        this.f18587b = list;
        this.f18588c = i;
        this.f18589d = c9629g2;
        this.f18590e = c9805i;
        this.f18591f = interfaceC5351c;
        this.f18592g = z;
    }

    /* renamed from: c */
    private final void m19668c(C9629g c9629g, InterfaceC6978b interfaceC6978b) {
        if (c9629g.m10368l() == this.f18586a.m10368l()) {
            if (c9629g.m10367m() != C9633i.f25416a) {
                if (c9629g.m10385M() == this.f18586a.m10385M()) {
                    if (c9629g.m10354z() == this.f18586a.m10354z()) {
                        if (c9629g.m10387K() == this.f18586a.m10387K()) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + interfaceC6978b + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + interfaceC6978b + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + interfaceC6978b + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + interfaceC6978b + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + interfaceC6978b + "' cannot modify the request's context.").toString());
    }

    /* renamed from: d */
    private final C6980c m19667d(int i, C9629g c9629g, C9805i c9805i) {
        return new C6980c(this.f18586a, this.f18587b, i, c9629g, c9805i, this.f18591f, this.f18592g);
    }

    /* renamed from: e */
    static /* synthetic */ C6980c m19666e(C6980c c6980c, int i, C9629g c9629g, C9805i c9805i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c6980c.f18588c;
        }
        if ((i2 & 2) != 0) {
            c9629g = c6980c.mo19669b();
        }
        if ((i2 & 4) != 0) {
            c9805i = c6980c.mo19670a();
        }
        return c6980c.m19667d(i, c9629g, c9805i);
    }

    @Override // p213l3.InterfaceC6978b.InterfaceC6979a
    /* renamed from: a */
    public C9805i mo19670a() {
        return this.f18590e;
    }

    @Override // p213l3.InterfaceC6978b.InterfaceC6979a
    /* renamed from: b */
    public C9629g mo19669b() {
        return this.f18589d;
    }

    /* renamed from: f */
    public final InterfaceC5351c m19665f() {
        return this.f18591f;
    }

    /* renamed from: g */
    public final boolean m19664g() {
        return this.f18592g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m19663h(p305q3.C9629g r12, bd.InterfaceC1886d<? super p305q3.AbstractC9632h> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p213l3.C6980c.C6981a
            if (r0 == 0) goto L13
            r0 = r13
            l3.c$a r0 = (p213l3.C6980c.C6981a) r0
            int r1 = r0.f18593A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18593A = r1
            goto L18
        L13:
            l3.c$a r0 = new l3.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f18596y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18593A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f18595x
            l3.b r12 = (p213l3.InterfaceC6978b) r12
            java.lang.Object r0 = r0.f18594w
            l3.c r0 = (p213l3.C6980c) r0
            p468yc.C13186n.m1453b(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            p468yc.C13186n.m1453b(r13)
            int r13 = r11.f18588c
            if (r13 <= 0) goto L4c
            java.util.List<l3.b> r2 = r11.f18587b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            l3.b r13 = (p213l3.InterfaceC6978b) r13
            r11.m19668c(r12, r13)
        L4c:
            java.util.List<l3.b> r13 = r11.f18587b
            int r2 = r11.f18588c
            java.lang.Object r13 = r13.get(r2)
            l3.b r13 = (p213l3.InterfaceC6978b) r13
            int r2 = r11.f18588c
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            l3.c r12 = m19666e(r4, r5, r6, r7, r8, r9)
            r0.f18594w = r11
            r0.f18595x = r13
            r0.f18593A = r3
            java.lang.Object r12 = r13.mo19671a(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L74:
            q3.h r13 = (p305q3.AbstractC9632h) r13
            q3.g r1 = r13.mo10331b()
            r0.m19668c(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l3.C6980c.m19663h(q3.g, bd.d):java.lang.Object");
    }
}
