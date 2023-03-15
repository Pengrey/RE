package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p468yc.C13195u;

/* renamed from: kotlinx.coroutines.flow.b0 */
/* loaded from: classes2.dex */
public final class C6783b0<T> implements InterfaceC6787d<T> {

    /* renamed from: w */
    private final InterfaceC6787d<T> f18159w;

    /* renamed from: x */
    private final InterfaceC6112p<InterfaceC6787d<? super T>, InterfaceC1886d<? super C13195u>, Object> f18160x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m20196f = "Share.kt", m20195l = {419, 423}, m20194m = "onSubscription")
    /* renamed from: kotlinx.coroutines.flow.b0$a */
    /* loaded from: classes2.dex */
    public static final class C6784a extends AbstractC6757d {

        /* renamed from: A */
        int f18161A;

        /* renamed from: w */
        Object f18162w;

        /* renamed from: x */
        Object f18163x;

        /* renamed from: y */
        /* synthetic */ Object f18164y;

        /* renamed from: z */
        final /* synthetic */ C6783b0<T> f18165z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6784a(C6783b0<T> c6783b0, InterfaceC1886d<? super C6784a> interfaceC1886d) {
            super(interfaceC1886d);
            this.f18165z = c6783b0;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18164y = obj;
            this.f18161A |= Integer.MIN_VALUE;
            return this.f18165z.m20148d(this);
        }
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6787d
    /* renamed from: a */
    public Object mo4529a(T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        return this.f18159w.mo4529a(t, interfaceC1886d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wd.s] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m20148d(bd.InterfaceC1886d<? super p468yc.C13195u> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.C6783b0.C6784a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.b0$a r0 = (kotlinx.coroutines.flow.C6783b0.C6784a) r0
            int r1 = r0.f18161A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18161A = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.b0$a r0 = new kotlinx.coroutines.flow.b0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f18164y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18161A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p468yc.C13186n.m1453b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f18163x
            wd.s r2 = (p424wd.C11651s) r2
            java.lang.Object r4 = r0.f18162w
            kotlinx.coroutines.flow.b0 r4 = (kotlinx.coroutines.flow.C6783b0) r4
            p468yc.C13186n.m1453b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            p468yc.C13186n.m1453b(r7)
            wd.s r2 = new wd.s
            kotlinx.coroutines.flow.d<T> r7 = r6.f18159w
            bd.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            id.p<kotlinx.coroutines.flow.d<? super T>, bd.d<? super yc.u>, java.lang.Object> r7 = r6.f18160x     // Catch: java.lang.Throwable -> L7d
            r0.f18162w = r6     // Catch: java.lang.Throwable -> L7d
            r0.f18163x = r2     // Catch: java.lang.Throwable -> L7d
            r0.f18161A = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.mo39856d(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.d<T> r7 = r4.f18159w
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.C6783b0
            if (r2 == 0) goto L7a
            kotlinx.coroutines.flow.b0 r7 = (kotlinx.coroutines.flow.C6783b0) r7
            r2 = 0
            r0.f18162w = r2
            r0.f18163x = r2
            r0.f18161A = r3
            java.lang.Object r7 = r7.m20148d(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        L7a:
            yc.u r7 = p468yc.C13195u.f34156a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6783b0.m20148d(bd.d):java.lang.Object");
    }
}
