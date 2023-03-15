package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.C6447w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6799l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m20196f = "Limit.kt", m20195l = {73}, m20194m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: kotlinx.coroutines.flow.l$a */
    /* loaded from: classes2.dex */
    public static final class C6800a<T> extends AbstractC6757d {

        /* renamed from: w */
        Object f18178w;

        /* renamed from: x */
        /* synthetic */ Object f18179x;

        /* renamed from: y */
        int f18180y;

        C6800a(InterfaceC1886d<? super C6800a> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18179x = obj;
            this.f18180y |= Integer.MIN_VALUE;
            return C6799l.m20107b(null, null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.l$b */
    /* loaded from: classes2.dex */
    public static final class C6801b implements InterfaceC6785c<T> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f18181w;

        /* renamed from: x */
        final /* synthetic */ int f18182x;

        /* compiled from: SafeCollector.common.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m20196f = "Limit.kt", m20195l = {115}, m20194m = "collect")
        /* renamed from: kotlinx.coroutines.flow.l$b$a */
        /* loaded from: classes2.dex */
        public static final class C6802a extends AbstractC6757d {

            /* renamed from: w */
            /* synthetic */ Object f18183w;

            /* renamed from: x */
            int f18184x;

            /* renamed from: z */
            Object f18186z;

            public C6802a(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f18183w = obj;
                this.f18184x |= Integer.MIN_VALUE;
                return C6801b.this.mo20086d(null, this);
            }
        }

        public C6801b(InterfaceC6785c interfaceC6785c, int i) {
            this.f18181w = interfaceC6785c;
            this.f18182x = i;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
            r8 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            p424wd.C11645n.m4541a(r8, r7);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.d, kotlinx.coroutines.flow.d<? super T>, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.d] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo20086d(kotlinx.coroutines.flow.InterfaceC6787d<? super T> r7, bd.InterfaceC1886d<? super p468yc.C13195u> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6799l.C6801b.C6802a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.l$b$a r0 = (kotlinx.coroutines.flow.C6799l.C6801b.C6802a) r0
                int r1 = r0.f18184x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18184x = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$b$a r0 = new kotlinx.coroutines.flow.l$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f18183w
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f18184x
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f18186z
                kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.InterfaceC6787d) r7
                p468yc.C13186n.m1453b(r8)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                goto L55
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                p468yc.C13186n.m1453b(r8)
                jd.w r8 = new jd.w
                r8.<init>()
                kotlinx.coroutines.flow.c r2 = r6.f18181w     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                kotlinx.coroutines.flow.l$c r4 = new kotlinx.coroutines.flow.l$c     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                int r5 = r6.f18182x     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                r4.<init>(r8, r5, r7)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                r0.f18186z = r7     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                r0.f18184x = r3     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                java.lang.Object r7 = r2.mo20086d(r4, r0)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L51
                if (r7 != r1) goto L55
                return r1
            L51:
                r8 = move-exception
                p424wd.C11645n.m4541a(r8, r7)
            L55:
                yc.u r7 = p468yc.C13195u.f34156a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6799l.C6801b.mo20086d(kotlinx.coroutines.flow.d, bd.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Limit.kt */
    /* renamed from: kotlinx.coroutines.flow.l$c */
    /* loaded from: classes2.dex */
    public static final class C6803c<T> implements InterfaceC6787d {

        /* renamed from: w */
        final /* synthetic */ C6447w f18187w;

        /* renamed from: x */
        final /* synthetic */ int f18188x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6787d<T> f18189y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Limit.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m20196f = "Limit.kt", m20195l = {61, 63}, m20194m = "emit")
        /* renamed from: kotlinx.coroutines.flow.l$c$a */
        /* loaded from: classes2.dex */
        public static final class C6804a extends AbstractC6757d {

            /* renamed from: w */
            /* synthetic */ Object f18190w;

            /* renamed from: x */
            final /* synthetic */ C6803c<T> f18191x;

            /* renamed from: y */
            int f18192y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6804a(C6803c<? super T> c6803c, InterfaceC1886d<? super C6804a> interfaceC1886d) {
                super(interfaceC1886d);
                this.f18191x = c6803c;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f18190w = obj;
                this.f18192y |= Integer.MIN_VALUE;
                return this.f18191x.mo4529a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C6803c(C6447w c6447w, int i, InterfaceC6787d<? super T> interfaceC6787d) {
            this.f18187w = c6447w;
            this.f18188x = i;
            this.f18189y = interfaceC6787d;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4529a(T r6, bd.InterfaceC1886d<? super p468yc.C13195u> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof kotlinx.coroutines.flow.C6799l.C6803c.C6804a
                if (r0 == 0) goto L13
                r0 = r7
                kotlinx.coroutines.flow.l$c$a r0 = (kotlinx.coroutines.flow.C6799l.C6803c.C6804a) r0
                int r1 = r0.f18192y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18192y = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.l$c$a r0 = new kotlinx.coroutines.flow.l$c$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f18190w
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f18192y
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p468yc.C13186n.m1453b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                p468yc.C13186n.m1453b(r7)
                goto L51
            L38:
                p468yc.C13186n.m1453b(r7)
                jd.w r7 = r5.f18187w
                int r2 = r7.f17531w
                int r2 = r2 + r4
                r7.f17531w = r2
                int r7 = r5.f18188x
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.d<T> r7 = r5.f18189y
                r0.f18192y = r4
                java.lang.Object r6 = r7.mo4529a(r6, r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                yc.u r6 = p468yc.C13195u.f34156a
                return r6
            L54:
                kotlinx.coroutines.flow.d<T> r7 = r5.f18189y
                r0.f18192y = r3
                java.lang.Object r6 = kotlinx.coroutines.flow.C6799l.m20108a(r7, r6, r0)
                if (r6 != r1) goto L5f
                return r1
            L5f:
                yc.u r6 = p468yc.C13195u.f34156a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6799l.C6803c.mo4529a(java.lang.Object, bd.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m20107b(kotlinx.coroutines.flow.InterfaceC6787d<? super T> r4, T r5, bd.InterfaceC1886d<? super p468yc.C13195u> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6799l.C6800a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.l$a r0 = (kotlinx.coroutines.flow.C6799l.C6800a) r0
            int r1 = r0.f18180y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18180y = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.l$a r0 = new kotlinx.coroutines.flow.l$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18179x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18180y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f18178w
            kotlinx.coroutines.flow.d r4 = (kotlinx.coroutines.flow.InterfaceC6787d) r4
            p468yc.C13186n.m1453b(r6)
            goto L43
        L35:
            p468yc.C13186n.m1453b(r6)
            r0.f18178w = r4
            r0.f18180y = r3
            java.lang.Object r5 = r4.mo4529a(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6799l.m20107b(kotlinx.coroutines.flow.d, java.lang.Object, bd.d):java.lang.Object");
    }

    /* renamed from: c */
    public static final <T> InterfaceC6785c<T> m20106c(InterfaceC6785c<? extends T> interfaceC6785c, int i) {
        if (i > 0) {
            return new C6801b(interfaceC6785c, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }
}
