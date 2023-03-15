package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p468yc.C13195u;

/* renamed from: kotlinx.coroutines.flow.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6777a<T> implements InterfaceC6785c<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Flow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.AbstractFlow", m20196f = "Flow.kt", m20195l = {230}, m20194m = "collect")
    /* renamed from: kotlinx.coroutines.flow.a$a */
    /* loaded from: classes2.dex */
    public static final class C6778a extends AbstractC6757d {

        /* renamed from: w */
        Object f18145w;

        /* renamed from: x */
        /* synthetic */ Object f18146x;

        /* renamed from: y */
        final /* synthetic */ AbstractC6777a<T> f18147y;

        /* renamed from: z */
        int f18148z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6778a(AbstractC6777a<T> abstractC6777a, InterfaceC1886d<? super C6778a> interfaceC1886d) {
            super(interfaceC1886d);
            this.f18147y = abstractC6777a;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18146x = obj;
            this.f18148z |= Integer.MIN_VALUE;
            return this.f18147y.mo20086d(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // kotlinx.coroutines.flow.InterfaceC6785c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo20086d(kotlinx.coroutines.flow.InterfaceC6787d<? super T> r6, bd.InterfaceC1886d<? super p468yc.C13195u> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC6777a.C6778a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.AbstractC6777a.C6778a) r0
            int r1 = r0.f18148z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18148z = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18146x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18148z
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f18145w
            wd.s r6 = (p424wd.C11651s) r6
            p468yc.C13186n.m1453b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            p468yc.C13186n.m1453b(r7)
            wd.s r7 = new wd.s
            bd.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f18145w = r7     // Catch: java.lang.Throwable -> L55
            r0.f18148z = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo20081f(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            yc.u r6 = p468yc.C13195u.f34156a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC6777a.mo20086d(kotlinx.coroutines.flow.d, bd.d):java.lang.Object");
    }

    /* renamed from: f */
    public abstract Object mo20081f(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d);
}
