package p092f0;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.MonotonicFrameClock;
import p181jd.Intrinsics;

/* renamed from: f0.p0 */
/* loaded from: classes.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {

    /* renamed from: w */
    private final MonotonicFrameClock f14488w;

    /* renamed from: x */
    private final C5176h0 f14489x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PausableMonotonicFrameClock.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.PausableMonotonicFrameClock", m20196f = "PausableMonotonicFrameClock.kt", m20195l = {62, 63}, m20194m = "withFrameNanos")
    /* renamed from: f0.p0$a */
    /* loaded from: classes.dex */
    public static final class C5234a<R> extends AbstractC6757d {

        /* renamed from: A */
        int f14490A;

        /* renamed from: w */
        Object f14491w;

        /* renamed from: x */
        Object f14492x;

        /* renamed from: y */
        /* synthetic */ Object f14493y;

        C5234a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14493y = obj;
            this.f14490A |= Integer.MIN_VALUE;
            return PausableMonotonicFrameClock.this.mo24912F(null, this);
        }
    }

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        Intrinsics.isThisObjectNull(monotonicFrameClock, "frameClock");
        this.f14488w = monotonicFrameClock;
        this.f14489x = new C5176h0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo24912F(id.InterfaceC6108l r6, bd.InterfaceC1886d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p092f0.PausableMonotonicFrameClock.C5234a
            if (r0 == 0) goto L13
            r0 = r7
            f0.p0$a r0 = (p092f0.PausableMonotonicFrameClock.C5234a) r0
            int r1 = r0.f14490A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14490A = r1
            goto L18
        L13:
            f0.p0$a r0 = new f0.p0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f14493y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14490A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f14492x
            id.l r6 = (id.InterfaceC6108l) r6
            java.lang.Object r2 = r0.f14491w
            f0.p0 r2 = (p092f0.PausableMonotonicFrameClock) r2
            p468yc.C13186n.m1453b(r7)
            goto L53
        L40:
            p468yc.C13186n.m1453b(r7)
            f0.h0 r7 = r5.f14489x
            r0.f14491w = r5
            r0.f14492x = r6
            r0.f14490A = r4
            java.lang.Object r7 = r7.m25293c(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            f0.k0 r7 = r2.f14488w
            r2 = 0
            r0.f14491w = r2
            r0.f14492x = r2
            r0.f14490A = r3
            java.lang.Object r7 = r7.mo24912F(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p092f0.PausableMonotonicFrameClock.mo24912F(id.l, bd.d):java.lang.Object");
    }

    /* renamed from: M */
    public Object mo4547M(Object obj, InterfaceC6112p interfaceC6112p) {
        return MonotonicFrameClock.C5214a.m25018a(this, obj, interfaceC6112p);
    }

    /* renamed from: b */
    public final void m24958b() {
        this.f14489x.m25292d();
    }

    /* renamed from: c */
    public CoroutineContext.InterfaceC1891b mo4546c(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25017b(this, interfaceC1893c);
    }

    /* renamed from: d */
    public final void m24957d() {
        this.f14489x.m25290f();
    }

    /* renamed from: f0 */
    public CoroutineContext mo4545f0(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.C5214a.m25014e(this, coroutineContext);
    }

    public CoroutineContext.InterfaceC1893c getKey() {
        return MonotonicFrameClock.C5214a.m25016c(this);
    }

    /* renamed from: l0 */
    public CoroutineContext mo4544l0(CoroutineContext.InterfaceC1893c interfaceC1893c) {
        return MonotonicFrameClock.C5214a.m25015d(this, interfaceC1893c);
    }
}
