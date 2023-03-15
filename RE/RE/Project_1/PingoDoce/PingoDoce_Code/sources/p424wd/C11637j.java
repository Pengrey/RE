package p424wd;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p404vd.InterfaceC11222e;
import p404vd.InterfaceC11244w;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13760f0;
import td.InterfaceC10524i0;

/* renamed from: wd.j */
/* loaded from: classes2.dex */
public final class C11637j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m20196f = "Combine.kt", m20195l = {57, 79, 82}, m20194m = "invokeSuspend")
    /* renamed from: wd.j$a */
    /* loaded from: classes2.dex */
    public static final class C11638a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        int f29757A;

        /* renamed from: B */
        int f29758B;

        /* renamed from: C */
        private /* synthetic */ Object f29759C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6785c<T>[] f29760D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC6097a<T[]> f29761E;

        /* renamed from: F */
        final /* synthetic */ InterfaceC6113q<InterfaceC6787d<? super R>, T[], InterfaceC1886d<? super C13195u>, Object> f29762F;

        /* renamed from: G */
        final /* synthetic */ InterfaceC6787d<R> f29763G;

        /* renamed from: x */
        Object f29764x;

        /* renamed from: y */
        Object f29765y;

        /* renamed from: z */
        int f29766z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Combine.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m20196f = "Combine.kt", m20195l = {34}, m20194m = "invokeSuspend")
        /* renamed from: wd.j$a$a */
        /* loaded from: classes2.dex */
        public static final class C11639a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

            /* renamed from: A */
            final /* synthetic */ AtomicInteger f29767A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC11222e<C13760f0<Object>> f29768B;

            /* renamed from: x */
            int f29769x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC6785c<T>[] f29770y;

            /* renamed from: z */
            final /* synthetic */ int f29771z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Combine.kt */
            /* renamed from: wd.j$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C11640a<T> implements InterfaceC6787d {

                /* renamed from: w */
                final /* synthetic */ InterfaceC11222e<C13760f0<Object>> f29772w;

                /* renamed from: x */
                final /* synthetic */ int f29773x;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: Combine.kt */
                @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", m20196f = "Combine.kt", m20195l = {35, 36}, m20194m = "emit")
                /* renamed from: wd.j$a$a$a$a */
                /* loaded from: classes2.dex */
                public static final class C11641a extends AbstractC6757d {

                    /* renamed from: w */
                    /* synthetic */ Object f29774w;

                    /* renamed from: x */
                    final /* synthetic */ C11640a<T> f29775x;

                    /* renamed from: y */
                    int f29776y;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C11641a(C11640a<? super T> c11640a, InterfaceC1886d<? super C11641a> interfaceC1886d) {
                        super(interfaceC1886d);
                        this.f29775x = c11640a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29774w = obj;
                        this.f29776y |= Integer.MIN_VALUE;
                        return this.f29775x.mo4529a(null, this);
                    }
                }

                C11640a(InterfaceC11222e<C13760f0<Object>> interfaceC11222e, int i) {
                    this.f29772w = interfaceC11222e;
                    this.f29773x = i;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
                @Override // kotlinx.coroutines.flow.InterfaceC6787d
                /* renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object mo4529a(T r7, bd.InterfaceC1886d<? super p468yc.C13195u> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof p424wd.C11637j.C11638a.C11639a.C11640a.C11641a
                        if (r0 == 0) goto L13
                        r0 = r8
                        wd.j$a$a$a$a r0 = (p424wd.C11637j.C11638a.C11639a.C11640a.C11641a) r0
                        int r1 = r0.f29776y
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29776y = r1
                        goto L18
                    L13:
                        wd.j$a$a$a$a r0 = new wd.j$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f29774w
                        java.lang.Object r1 = cd.C2111b.m34640d()
                        int r2 = r0.f29776y
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        p468yc.C13186n.m1453b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        p468yc.C13186n.m1453b(r8)
                        goto L4d
                    L38:
                        p468yc.C13186n.m1453b(r8)
                        vd.e<zc.f0<java.lang.Object>> r8 = r6.f29772w
                        zc.f0 r2 = new zc.f0
                        int r5 = r6.f29773x
                        r2.<init>(r5, r7)
                        r0.f29776y = r4
                        java.lang.Object r7 = r8.mo5643b(r2, r0)
                        if (r7 != r1) goto L4d
                        return r1
                    L4d:
                        r0.f29776y = r3
                        java.lang.Object r7 = td.C10602z2.m7582a(r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        yc.u r7 = p468yc.C13195u.f34156a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p424wd.C11637j.C11638a.C11639a.C11640a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C11639a(InterfaceC6785c<? extends T>[] interfaceC6785cArr, int i, AtomicInteger atomicInteger, InterfaceC11222e<C13760f0<Object>> interfaceC11222e, InterfaceC1886d<? super C11639a> interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f29770y = interfaceC6785cArr;
                this.f29771z = i;
                this.f29767A = atomicInteger;
                this.f29768B = interfaceC11222e;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                return new C11639a(this.f29770y, this.f29771z, this.f29767A, this.f29768B, interfaceC1886d);
            }

            @Override // id.InterfaceC6112p
            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                return ((C11639a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                AtomicInteger atomicInteger;
                m34636d = C2116d.m34636d();
                int i = this.f29769x;
                try {
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        InterfaceC6785c[] interfaceC6785cArr = this.f29770y;
                        int i2 = this.f29771z;
                        InterfaceC6785c interfaceC6785c = interfaceC6785cArr[i2];
                        C11640a c11640a = new C11640a(this.f29768B, i2);
                        this.f29769x = 1;
                        if (interfaceC6785c.mo20086d(c11640a, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        InterfaceC11244w.C11245a.m5640a(this.f29768B, null, 1, null);
                    }
                    return C13195u.f34156a;
                } finally {
                    if (this.f29767A.decrementAndGet() == 0) {
                        InterfaceC11244w.C11245a.m5640a(this.f29768B, null, 1, null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11638a(InterfaceC6785c<? extends T>[] interfaceC6785cArr, InterfaceC6097a<T[]> interfaceC6097a, InterfaceC6113q<? super InterfaceC6787d<? super R>, ? super T[], ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6787d<? super R> interfaceC6787d, InterfaceC1886d<? super C11638a> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29760D = interfaceC6785cArr;
            this.f29761E = interfaceC6097a;
            this.f29762F = interfaceC6113q;
            this.f29763G = interfaceC6787d;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C11638a c11638a = new C11638a(this.f29760D, this.f29761E, this.f29762F, this.f29763G, interfaceC1886d);
            c11638a.f29759C = obj;
            return c11638a;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C11638a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ec A[LOOP:0: B:28:0x00ec->B:34:0x010f, LOOP_START, PHI: r3 r10 
          PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e7, B:34:0x010f] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 zc.f0) = (r10v4 zc.f0), (r10v18 zc.f0) binds: [B:25:0x00e7, B:34:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r2v12, types: [int] */
        /* JADX WARN: Type inference failed for: r2v7, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.c<T>[]] */
        /* JADX WARN: Type inference failed for: r7v4, types: [kotlinx.coroutines.flow.c[], kotlinx.coroutines.flow.c<T>[]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:20:0x00c7). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0169 -> B:45:0x0165). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 367
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p424wd.C11637j.C11638a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <R, T> Object m4550a(InterfaceC6787d<? super R> interfaceC6787d, InterfaceC6785c<? extends T>[] interfaceC6785cArr, InterfaceC6097a<T[]> interfaceC6097a, InterfaceC6113q<? super InterfaceC6787d<? super R>, ? super T[], ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object m4542a = C11644m.m4542a(new C11638a(interfaceC6785cArr, interfaceC6097a, interfaceC6113q, interfaceC6787d, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m4542a == m34636d ? m4542a : C13195u.f34156a;
    }
}
