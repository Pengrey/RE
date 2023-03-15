package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.C6449y;
import p424wd.C11650r;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.b */
/* loaded from: classes2.dex */
public final class C6780b<T> implements InterfaceC6785c<T> {

    /* renamed from: w */
    private final InterfaceC6785c<T> f18150w;

    /* renamed from: x */
    public final InterfaceC6108l<T, Object> f18151x;

    /* renamed from: y */
    public final InterfaceC6112p<Object, Object, Boolean> f18152y;

    /* compiled from: Distinct.kt */
    /* renamed from: kotlinx.coroutines.flow.b$a */
    /* loaded from: classes2.dex */
    static final class C6781a<T> implements InterfaceC6787d {

        /* renamed from: w */
        final /* synthetic */ C6780b<T> f18153w;

        /* renamed from: x */
        final /* synthetic */ C6449y<Object> f18154x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6787d<T> f18155y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Distinct.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m20196f = "Distinct.kt", m20195l = {81}, m20194m = "emit")
        /* renamed from: kotlinx.coroutines.flow.b$a$a */
        /* loaded from: classes2.dex */
        public static final class C6782a extends AbstractC6757d {

            /* renamed from: w */
            /* synthetic */ Object f18156w;

            /* renamed from: x */
            final /* synthetic */ C6781a<T> f18157x;

            /* renamed from: y */
            int f18158y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6782a(C6781a<? super T> c6781a, InterfaceC1886d<? super C6782a> interfaceC1886d) {
                super(interfaceC1886d);
                this.f18157x = c6781a;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f18156w = obj;
                this.f18158y |= Integer.MIN_VALUE;
                return this.f18157x.mo4529a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C6781a(C6780b<T> c6780b, C6449y<Object> c6449y, InterfaceC6787d<? super T> interfaceC6787d) {
            this.f18153w = c6780b;
            this.f18154x = c6449y;
            this.f18155y = interfaceC6787d;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4529a(T r6, bd.InterfaceC1886d<? super p468yc.C13195u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C6780b.C6781a.C6782a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.b$a$a r0 = (kotlinx.coroutines.flow.C6780b.C6781a.C6782a) r0
                int r1 = r0.f18158y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18158y = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.b$a$a r0 = new kotlinx.coroutines.flow.b$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f18156w
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f18158y
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p468yc.C13186n.m1453b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                p468yc.C13186n.m1453b(r7)
                kotlinx.coroutines.flow.b<T> r7 = r5.f18153w
                id.l<T, java.lang.Object> r7 = r7.f18151x
                java.lang.Object r7 = r7.mo9587d(r6)
                jd.y<java.lang.Object> r2 = r5.f18154x
                T r2 = r2.f17533w
                kotlinx.coroutines.internal.h0 r4 = p424wd.C11650r.f29782a
                if (r2 == r4) goto L58
                kotlinx.coroutines.flow.b<T> r4 = r5.f18153w
                id.p<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f18152y
                java.lang.Object r2 = r4.mo39856d(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                yc.u r6 = p468yc.C13195u.f34156a
                return r6
            L58:
                jd.y<java.lang.Object> r2 = r5.f18154x
                r2.f17533w = r7
                kotlinx.coroutines.flow.d<T> r7 = r5.f18155y
                r0.f18158y = r3
                java.lang.Object r6 = r7.mo4529a(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                yc.u r6 = p468yc.C13195u.f34156a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6780b.C6781a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6780b(InterfaceC6785c<? extends T> interfaceC6785c, InterfaceC6108l<? super T, ? extends Object> interfaceC6108l, InterfaceC6112p<Object, Object, Boolean> interfaceC6112p) {
        this.f18150w = interfaceC6785c;
        this.f18151x = interfaceC6108l;
        this.f18152y = interfaceC6112p;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6785c
    /* renamed from: d */
    public Object mo20086d(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        C6449y c6449y = new C6449y();
        c6449y.f17533w = (T) C11650r.f29782a;
        Object mo20086d = this.f18150w.mo20086d(new C6781a(this, c6449y, interfaceC6787d), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
    }
}
