package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.internal.FlowExceptions;
import p181jd.C6449y;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.n */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6816n {

    /* compiled from: Limit.kt */
    /* renamed from: kotlinx.coroutines.flow.n$a */
    /* loaded from: classes2.dex */
    public static final class C6817a implements InterfaceC6787d<T> {

        /* renamed from: w */
        final /* synthetic */ C6449y f18219w;

        public C6817a(C6449y c6449y) {
            this.f18219w = c6449y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: a */
        public Object mo4529a(T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            this.f18219w.f17533w = t;
            throw new FlowExceptions(this);
        }
    }

    /* compiled from: Limit.kt */
    /* renamed from: kotlinx.coroutines.flow.n$b */
    /* loaded from: classes2.dex */
    public static final class C6818b implements InterfaceC6787d<T> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f18220w;

        /* renamed from: x */
        final /* synthetic */ C6449y f18221x;

        /* compiled from: Limit.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m20196f = "Reduce.kt", m20195l = {142}, m20194m = "emit")
        /* renamed from: kotlinx.coroutines.flow.n$b$a */
        /* loaded from: classes2.dex */
        public static final class C6819a extends AbstractC6757d {

            /* renamed from: A */
            Object f18222A;

            /* renamed from: w */
            Object f18223w;

            /* renamed from: x */
            /* synthetic */ Object f18224x;

            /* renamed from: y */
            int f18225y;

            public C6819a(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f18224x = obj;
                this.f18225y |= Integer.MIN_VALUE;
                return C6818b.this.mo4529a(null, this);
            }
        }

        public C6818b(InterfaceC6112p interfaceC6112p, C6449y c6449y) {
            this.f18220w = interfaceC6112p;
            this.f18221x = c6449y;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object mo4529a(T r5, bd.InterfaceC1886d<? super p468yc.C13195u> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6816n.C6818b.C6819a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.n$b$a r0 = (kotlinx.coroutines.flow.C6816n.C6818b.C6819a) r0
                int r1 = r0.f18225y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18225y = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.n$b$a r0 = new kotlinx.coroutines.flow.n$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f18224x
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f18225y
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f18222A
                java.lang.Object r0 = r0.f18223w
                kotlinx.coroutines.flow.n$b r0 = (kotlinx.coroutines.flow.C6816n.C6818b) r0
                p468yc.C13186n.m1453b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                p468yc.C13186n.m1453b(r6)
                id.p r6 = r4.f18220w
                r0.f18223w = r4
                r0.f18222A = r5
                r0.f18225y = r3
                r2 = 6
                p181jd.C6436j.m20935c(r2)
                java.lang.Object r6 = r6.mo39856d(r5, r0)
                r0 = 7
                p181jd.C6436j.m20935c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5f
                jd.y r6 = r0.f18221x
                r6.f17533w = r5
                r3 = 0
            L5f:
                if (r3 == 0) goto L64
                yc.u r5 = p468yc.C13195u.f34156a
                return r5
            L64:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6816n.C6818b.mo4529a(java.lang.Object, bd.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m20196f = "Reduce.kt", m20195l = {183}, m20194m = "first")
    /* renamed from: kotlinx.coroutines.flow.n$c */
    /* loaded from: classes2.dex */
    public static final class C6820c<T> extends AbstractC6757d {

        /* renamed from: w */
        Object f18227w;

        /* renamed from: x */
        Object f18228x;

        /* renamed from: y */
        /* synthetic */ Object f18229y;

        /* renamed from: z */
        int f18230z;

        C6820c(InterfaceC1886d<? super C6820c> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18229y = obj;
            this.f18230z |= Integer.MIN_VALUE;
            return C6788e.m20136l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m20196f = "Reduce.kt", m20195l = {183}, m20194m = "first")
    /* renamed from: kotlinx.coroutines.flow.n$d */
    /* loaded from: classes2.dex */
    public static final class C6821d<T> extends AbstractC6757d {

        /* renamed from: A */
        int f18231A;

        /* renamed from: w */
        Object f18232w;

        /* renamed from: x */
        Object f18233x;

        /* renamed from: y */
        Object f18234y;

        /* renamed from: z */
        /* synthetic */ Object f18235z;

        C6821d(InterfaceC1886d<? super C6821d> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18235z = obj;
            this.f18231A |= Integer.MIN_VALUE;
            return C6788e.m20135m(null, null, this);
        }
    }

    /* compiled from: Limit.kt */
    /* renamed from: kotlinx.coroutines.flow.n$e */
    /* loaded from: classes2.dex */
    public static final class C6822e implements InterfaceC6787d<T> {

        /* renamed from: w */
        final /* synthetic */ C6449y f18236w;

        public C6822e(C6449y c6449y) {
            this.f18236w = c6449y;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: a */
        public Object mo4529a(T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            this.f18236w.f17533w = t;
            throw new FlowExceptions(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Reduce.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m20196f = "Reduce.kt", m20195l = {183}, m20194m = "firstOrNull")
    /* renamed from: kotlinx.coroutines.flow.n$f */
    /* loaded from: classes2.dex */
    public static final class C6823f<T> extends AbstractC6757d {

        /* renamed from: w */
        Object f18237w;

        /* renamed from: x */
        Object f18238x;

        /* renamed from: y */
        /* synthetic */ Object f18239y;

        /* renamed from: z */
        int f18240z;

        C6823f(InterfaceC1886d<? super C6823f> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18239y = obj;
            this.f18240z |= Integer.MIN_VALUE;
            return C6788e.m20134n(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m20096a(kotlinx.coroutines.flow.InterfaceC6785c<? extends T> r4, bd.InterfaceC1886d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6816n.C6820c
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.n$c r0 = (kotlinx.coroutines.flow.C6816n.C6820c) r0
            int r1 = r0.f18230z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18230z = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n$c r0 = new kotlinx.coroutines.flow.n$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18229y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18230z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f18228x
            kotlinx.coroutines.flow.n$a r4 = (kotlinx.coroutines.flow.C6816n.C6817a) r4
            java.lang.Object r0 = r0.f18227w
            jd.y r0 = (p181jd.C6449y) r0
            p468yc.C13186n.m1453b(r5)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p468yc.C13186n.m1453b(r5)
            jd.y r5 = new jd.y
            r5.<init>()
            kotlinx.coroutines.internal.h0 r2 = p424wd.C11650r.f29782a
            r5.f17533w = r2
            kotlinx.coroutines.flow.n$a r2 = new kotlinx.coroutines.flow.n$a
            r2.<init>(r5)
            r0.f18227w = r5     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L5b
            r0.f18228x = r2     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L5b
            r0.f18230z = r3     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L5b
            java.lang.Object r4 = r4.mo20086d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            p424wd.C11645n.m4541a(r5, r4)
        L62:
            T r4 = r0.f17533w
            kotlinx.coroutines.internal.h0 r5 = p424wd.C11650r.f29782a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6816n.m20096a(kotlinx.coroutines.flow.c, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m20095b(kotlinx.coroutines.flow.InterfaceC6785c<? extends T> r4, id.InterfaceC6112p<? super T, ? super bd.InterfaceC1886d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, bd.InterfaceC1886d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6816n.C6821d
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.n$d r0 = (kotlinx.coroutines.flow.C6816n.C6821d) r0
            int r1 = r0.f18231A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18231A = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n$d r0 = new kotlinx.coroutines.flow.n$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18235z
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18231A
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.f18234y
            kotlinx.coroutines.flow.n$b r4 = (kotlinx.coroutines.flow.C6816n.C6818b) r4
            java.lang.Object r5 = r0.f18233x
            jd.y r5 = (p181jd.C6449y) r5
            java.lang.Object r0 = r0.f18232w
            id.p r0 = (id.InterfaceC6112p) r0
            p468yc.C13186n.m1453b(r6)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            p468yc.C13186n.m1453b(r6)
            jd.y r6 = new jd.y
            r6.<init>()
            kotlinx.coroutines.internal.h0 r2 = p424wd.C11650r.f29782a
            r6.f17533w = r2
            kotlinx.coroutines.flow.n$b r2 = new kotlinx.coroutines.flow.n$b
            r2.<init>(r5, r6)
            r0.f18232w = r5     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L62
            r0.f18233x = r6     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L62
            r0.f18234y = r2     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L62
            r0.f18231A = r3     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L62
            java.lang.Object r4 = r4.mo20086d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            p424wd.C11645n.m4541a(r6, r4)
        L6a:
            T r4 = r5.f17533w
            kotlinx.coroutines.internal.h0 r5 = p424wd.C11650r.f29782a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6816n.m20095b(kotlinx.coroutines.flow.c, id.p, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m20094c(kotlinx.coroutines.flow.InterfaceC6785c<? extends T> r4, bd.InterfaceC1886d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C6816n.C6823f
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.n$f r0 = (kotlinx.coroutines.flow.C6816n.C6823f) r0
            int r1 = r0.f18240z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18240z = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.n$f r0 = new kotlinx.coroutines.flow.n$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f18239y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18240z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f18238x
            kotlinx.coroutines.flow.n$e r4 = (kotlinx.coroutines.flow.C6816n.C6822e) r4
            java.lang.Object r0 = r0.f18237w
            jd.y r0 = (p181jd.C6449y) r0
            p468yc.C13186n.m1453b(r5)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            p468yc.C13186n.m1453b(r5)
            jd.y r5 = new jd.y
            r5.<init>()
            kotlinx.coroutines.flow.n$e r2 = new kotlinx.coroutines.flow.n$e
            r2.<init>(r5)
            r0.f18237w = r5     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L57
            r0.f18238x = r2     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L57
            r0.f18240z = r3     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L57
            java.lang.Object r4 = r4.mo20086d(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.FlowExceptions -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            p424wd.C11645n.m4541a(r5, r4)
        L5e:
            T r4 = r0.f17533w
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6816n.m20094c(kotlinx.coroutines.flow.c, bd.d):java.lang.Object");
    }
}
