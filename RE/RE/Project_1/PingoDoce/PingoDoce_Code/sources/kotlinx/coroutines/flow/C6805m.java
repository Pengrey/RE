package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.internal.C6869i0;
import p424wd.C11625f;
import p424wd.C11632i;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: kotlinx.coroutines.flow.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6805m {

    /* renamed from: a */
    private static final int f18193a = C6869i0.m19964b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Reader.READ_DONE);

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.m$a */
    /* loaded from: classes2.dex */
    public static final class C6806a implements InterfaceC6785c<InterfaceC6785c<? extends R>> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f18194w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f18195x;

        /* compiled from: Emitters.kt */
        /* renamed from: kotlinx.coroutines.flow.m$a$a */
        /* loaded from: classes2.dex */
        public static final class C6807a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f18196w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6112p f18197x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", m20196f = "Merge.kt", m20195l = {223, 223}, m20194m = "emit")
            /* renamed from: kotlinx.coroutines.flow.m$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C6808a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f18198w;

                /* renamed from: x */
                int f18199x;

                /* renamed from: y */
                Object f18200y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6808a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                    C6807a.this = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f18198w = obj;
                    this.f18199x |= Integer.MIN_VALUE;
                    return C6807a.this.mo4529a(null, this);
                }
            }

            public C6807a(InterfaceC6787d interfaceC6787d, InterfaceC6112p interfaceC6112p) {
                this.f18196w = interfaceC6787d;
                this.f18197x = interfaceC6112p;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // kotlinx.coroutines.flow.InterfaceC6787d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r7, bd.InterfaceC1886d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6805m.C6806a.C6807a.C6808a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.m$a$a$a r0 = (kotlinx.coroutines.flow.C6805m.C6806a.C6807a.C6808a) r0
                    int r1 = r0.f18199x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18199x = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.m$a$a$a r0 = new kotlinx.coroutines.flow.m$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f18198w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f18199x
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p468yc.C13186n.m1453b(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f18200y
                    kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.InterfaceC6787d) r7
                    p468yc.C13186n.m1453b(r8)
                    goto L51
                L3c:
                    p468yc.C13186n.m1453b(r8)
                    kotlinx.coroutines.flow.d r8 = r6.f18196w
                    id.p r2 = r6.f18197x
                    r0.f18200y = r8
                    r0.f18199x = r4
                    java.lang.Object r7 = r2.mo39856d(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f18200y = r2
                    r0.f18199x = r3
                    java.lang.Object r7 = r7.mo4529a(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    yc.u r7 = p468yc.C13195u.f34156a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6805m.C6806a.C6807a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C6806a(InterfaceC6785c interfaceC6785c, InterfaceC6112p interfaceC6112p) {
            this.f18194w = interfaceC6785c;
            this.f18195x = interfaceC6112p;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f18194w.mo20086d(new C6807a(interfaceC6787d, this.f18195x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.m$b */
    /* loaded from: classes2.dex */
    public static final class C6809b implements InterfaceC6785c<InterfaceC6785c<? extends R>> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f18202w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6112p f18203x;

        /* compiled from: Emitters.kt */
        /* renamed from: kotlinx.coroutines.flow.m$b$a */
        /* loaded from: classes2.dex */
        public static final class C6810a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f18204w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6112p f18205x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", m20196f = "Merge.kt", m20195l = {223, 223}, m20194m = "emit")
            /* renamed from: kotlinx.coroutines.flow.m$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C6811a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f18206w;

                /* renamed from: x */
                int f18207x;

                /* renamed from: y */
                Object f18208y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6811a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                    C6810a.this = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f18206w = obj;
                    this.f18207x |= Integer.MIN_VALUE;
                    return C6810a.this.mo4529a(null, this);
                }
            }

            public C6810a(InterfaceC6787d interfaceC6787d, InterfaceC6112p interfaceC6112p) {
                this.f18204w = interfaceC6787d;
                this.f18205x = interfaceC6112p;
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x005c A[RETURN] */
            @Override // kotlinx.coroutines.flow.InterfaceC6787d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r7, bd.InterfaceC1886d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.C6805m.C6809b.C6810a.C6811a
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.m$b$a$a r0 = (kotlinx.coroutines.flow.C6805m.C6809b.C6810a.C6811a) r0
                    int r1 = r0.f18207x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18207x = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.m$b$a$a r0 = new kotlinx.coroutines.flow.m$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f18206w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f18207x
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p468yc.C13186n.m1453b(r8)
                    goto L5d
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f18208y
                    kotlinx.coroutines.flow.d r7 = (kotlinx.coroutines.flow.InterfaceC6787d) r7
                    p468yc.C13186n.m1453b(r8)
                    goto L51
                L3c:
                    p468yc.C13186n.m1453b(r8)
                    kotlinx.coroutines.flow.d r8 = r6.f18204w
                    id.p r2 = r6.f18205x
                    r0.f18208y = r8
                    r0.f18207x = r4
                    java.lang.Object r7 = r2.mo39856d(r7, r0)
                    if (r7 != r1) goto L4e
                    return r1
                L4e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L51:
                    r2 = 0
                    r0.f18208y = r2
                    r0.f18207x = r3
                    java.lang.Object r7 = r7.mo4529a(r8, r0)
                    if (r7 != r1) goto L5d
                    return r1
                L5d:
                    yc.u r7 = p468yc.C13195u.f34156a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6805m.C6809b.C6810a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C6809b(InterfaceC6785c interfaceC6785c, InterfaceC6112p interfaceC6112p) {
            this.f18202w = interfaceC6785c;
            this.f18203x = interfaceC6112p;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f18202w.mo20086d(new C6810a(interfaceC6787d, this.f18203x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: kotlinx.coroutines.flow.m$c */
    /* loaded from: classes2.dex */
    public static final class C6812c implements InterfaceC6785c<T> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f18210w;

        public C6812c(InterfaceC6785c interfaceC6785c) {
            this.f18210w = interfaceC6785c;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC6785c
        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f18210w.mo20086d(new C6813d(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Merge.kt */
    /* renamed from: kotlinx.coroutines.flow.m$d */
    /* loaded from: classes2.dex */
    public static final class C6813d<T> implements InterfaceC6787d {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6787d<T> f18211w;

        /* compiled from: Merge.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m20196f = "Merge.kt", m20195l = {80}, m20194m = "emit")
        /* renamed from: kotlinx.coroutines.flow.m$d$a */
        /* loaded from: classes2.dex */
        public static final class C6814a extends AbstractC6757d {

            /* renamed from: w */
            /* synthetic */ Object f18212w;

            /* renamed from: x */
            final /* synthetic */ C6813d<T> f18213x;

            /* renamed from: y */
            int f18214y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C6814a(C6813d<? super T> c6813d, InterfaceC1886d<? super C6814a> interfaceC1886d) {
                super(interfaceC1886d);
                this.f18213x = c6813d;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f18212w = obj;
                this.f18214y |= Integer.MIN_VALUE;
                return this.f18213x.mo4529a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C6813d(InterfaceC6787d<? super T> interfaceC6787d) {
            this.f18211w = interfaceC6787d;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4529a(kotlinx.coroutines.flow.InterfaceC6785c<? extends T> r5, bd.InterfaceC1886d<? super p468yc.C13195u> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.C6805m.C6813d.C6814a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.m$d$a r0 = (kotlinx.coroutines.flow.C6805m.C6813d.C6814a) r0
                int r1 = r0.f18214y
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18214y = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.m$d$a r0 = new kotlinx.coroutines.flow.m$d$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f18212w
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f18214y
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                p468yc.C13186n.m1453b(r6)
                goto L3f
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                p468yc.C13186n.m1453b(r6)
                kotlinx.coroutines.flow.d<T> r6 = r4.f18211w
                r0.f18214y = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.C6788e.m20140h(r6, r5, r0)
                if (r5 != r1) goto L3f
                return r1
            L3f:
                yc.u r5 = p468yc.C13195u.f34156a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6805m.C6813d.mo4529a(kotlinx.coroutines.flow.c, bd.d):java.lang.Object");
        }
    }

    /* compiled from: Merge.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m20196f = "Merge.kt", m20195l = {214, 214}, m20194m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.m$e */
    /* loaded from: classes2.dex */
    public static final class C6815e extends AbstractC6764l implements InterfaceC6113q<InterfaceC6787d<? super R>, T, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6112p<T, InterfaceC1886d<? super R>, Object> f18215A;

        /* renamed from: x */
        int f18216x;

        /* renamed from: y */
        private /* synthetic */ Object f18217y;

        /* renamed from: z */
        /* synthetic */ Object f18218z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6815e(InterfaceC6112p<? super T, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super C6815e> interfaceC1886d) {
            super(3, interfaceC1886d);
            this.f18215A = interfaceC6112p;
        }

        @Override // id.InterfaceC6113q
        /* renamed from: d */
        public final Object mo4533i(InterfaceC6787d<? super R> interfaceC6787d, T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            C6815e c6815e = new C6815e(this.f18215A, interfaceC1886d);
            c6815e.f18217y = interfaceC6787d;
            c6815e.f18218z = t;
            return c6815e.invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC6787d interfaceC6787d;
            m34636d = C2116d.m34636d();
            int i = this.f18216x;
            if (i == 0) {
                C13186n.m1453b(obj);
                interfaceC6787d = (InterfaceC6787d) this.f18217y;
                Object obj2 = this.f18218z;
                InterfaceC6112p<T, InterfaceC1886d<? super R>, Object> interfaceC6112p = this.f18215A;
                this.f18217y = interfaceC6787d;
                this.f18216x = 1;
                obj = interfaceC6112p.mo39856d(obj2, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i == 2) {
                    C13186n.m1453b(obj);
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                interfaceC6787d = (InterfaceC6787d) this.f18217y;
                C13186n.m1453b(obj);
            }
            this.f18217y = null;
            this.f18216x = 2;
            if (interfaceC6787d.mo4529a(obj, this) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final <T, R> InterfaceC6785c<R> m20105a(InterfaceC6785c<? extends T> interfaceC6785c, InterfaceC6112p<? super T, ? super InterfaceC1886d<? super InterfaceC6785c<? extends R>>, ? extends Object> interfaceC6112p) {
        return C6788e.m20130r(new C6806a(interfaceC6785c, interfaceC6112p));
    }

    /* renamed from: b */
    public static final <T, R> InterfaceC6785c<R> m20104b(InterfaceC6785c<? extends T> interfaceC6785c, int i, InterfaceC6112p<? super T, ? super InterfaceC1886d<? super InterfaceC6785c<? extends R>>, ? extends Object> interfaceC6112p) {
        return C6788e.m20129s(new C6809b(interfaceC6785c, interfaceC6112p), i);
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC6785c m20103c(InterfaceC6785c interfaceC6785c, int i, InterfaceC6112p interfaceC6112p, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f18193a;
        }
        return C6788e.m20132p(interfaceC6785c, i, interfaceC6112p);
    }

    /* renamed from: d */
    public static final <T> InterfaceC6785c<T> m20102d(InterfaceC6785c<? extends InterfaceC6785c<? extends T>> interfaceC6785c) {
        return new C6812c(interfaceC6785c);
    }

    /* renamed from: e */
    public static final <T> InterfaceC6785c<T> m20101e(InterfaceC6785c<? extends InterfaceC6785c<? extends T>> interfaceC6785c, int i) {
        if (i > 0) {
            return i == 1 ? C6788e.m20130r(interfaceC6785c) : new C11625f(interfaceC6785c, i, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
    }

    /* renamed from: f */
    public static final <T, R> InterfaceC6785c<R> m20100f(InterfaceC6785c<? extends T> interfaceC6785c, InterfaceC6112p<? super T, ? super InterfaceC1886d<? super R>, ? extends Object> interfaceC6112p) {
        return C6788e.m20123y(interfaceC6785c, new C6815e(interfaceC6112p, null));
    }

    /* renamed from: g */
    public static final <T, R> InterfaceC6785c<R> m20099g(InterfaceC6785c<? extends T> interfaceC6785c, InterfaceC6113q<? super InterfaceC6787d<? super R>, ? super T, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q) {
        return new C11632i(interfaceC6113q, interfaceC6785c, null, 0, null, 28, null);
    }
}
