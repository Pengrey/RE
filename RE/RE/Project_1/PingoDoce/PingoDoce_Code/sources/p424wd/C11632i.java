package p424wd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p181jd.C6449y;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.C10539l0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* renamed from: wd.i */
/* loaded from: classes2.dex */
public final class C11632i<T, R> extends AbstractC11629g<T, R> {

    /* renamed from: A */
    private final InterfaceC6113q<InterfaceC6787d<? super R>, T, InterfaceC1886d<? super C13195u>, Object> f29738A;

    /* compiled from: Merge.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m20196f = "Merge.kt", m20195l = {27}, m20194m = "invokeSuspend")
    /* renamed from: wd.i$a */
    /* loaded from: classes2.dex */
    static final class C11633a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6787d<R> f29739A;

        /* renamed from: x */
        int f29740x;

        /* renamed from: y */
        private /* synthetic */ Object f29741y;

        /* renamed from: z */
        final /* synthetic */ C11632i<T, R> f29742z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        /* renamed from: wd.i$a$a */
        /* loaded from: classes2.dex */
        public static final class C11634a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ C6449y<InterfaceC10574t1> f29743w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC10524i0 f29744x;

            /* renamed from: y */
            final /* synthetic */ C11632i<T, R> f29745y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC6787d<R> f29746z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m20196f = "Merge.kt", m20195l = {34}, m20194m = "invokeSuspend")
            /* renamed from: wd.i$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C11635a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

                /* renamed from: A */
                final /* synthetic */ T f29747A;

                /* renamed from: x */
                int f29748x;

                /* renamed from: y */
                final /* synthetic */ C11632i<T, R> f29749y;

                /* renamed from: z */
                final /* synthetic */ InterfaceC6787d<R> f29750z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C11635a(C11632i<T, R> c11632i, InterfaceC6787d<? super R> interfaceC6787d, T t, InterfaceC1886d<? super C11635a> interfaceC1886d) {
                    super(2, interfaceC1886d);
                    this.f29749y = c11632i;
                    this.f29750z = interfaceC6787d;
                    this.f29747A = t;
                }

                @Override // id.InterfaceC6112p
                /* renamed from: F */
                public /* bridge */ /* synthetic */ Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                    return m4551d(interfaceC10524i0, interfaceC1886d);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                    return new C11635a(this.f29749y, this.f29750z, this.f29747A, interfaceC1886d);
                }

                /* renamed from: d */
                public final Object m4551d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                    return ((C11635a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f29748x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        InterfaceC6113q interfaceC6113q = ((C11632i) this.f29749y).f29738A;
                        InterfaceC6787d<R> interfaceC6787d = this.f29750z;
                        T t = this.f29747A;
                        this.f29748x = 1;
                        if (interfaceC6113q.mo4533i(interfaceC6787d, t, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m20196f = "Merge.kt", m20195l = {30}, m20194m = "emit")
            /* renamed from: wd.i$a$a$b */
            /* loaded from: classes2.dex */
            public static final class C11636b extends AbstractC6757d {

                /* renamed from: A */
                final /* synthetic */ C11634a<T> f29751A;

                /* renamed from: B */
                int f29752B;

                /* renamed from: w */
                Object f29753w;

                /* renamed from: x */
                Object f29754x;

                /* renamed from: y */
                Object f29755y;

                /* renamed from: z */
                /* synthetic */ Object f29756z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C11636b(C11634a<? super T> c11634a, InterfaceC1886d<? super C11636b> interfaceC1886d) {
                    super(interfaceC1886d);
                    this.f29751A = c11634a;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f29756z = obj;
                    this.f29752B |= Integer.MIN_VALUE;
                    return this.f29751A.mo4529a(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C11634a(C6449y<InterfaceC10574t1> c6449y, InterfaceC10524i0 interfaceC10524i0, C11632i<T, R> c11632i, InterfaceC6787d<? super R> interfaceC6787d) {
                this.f29743w = c6449y;
                this.f29744x = interfaceC10524i0;
                this.f29745y = c11632i;
                this.f29746z = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // kotlinx.coroutines.flow.InterfaceC6787d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(T r8, bd.InterfaceC1886d<? super p468yc.C13195u> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p424wd.C11632i.C11633a.C11634a.C11636b
                    if (r0 == 0) goto L13
                    r0 = r9
                    wd.i$a$a$b r0 = (p424wd.C11632i.C11633a.C11634a.C11636b) r0
                    int r1 = r0.f29752B
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f29752B = r1
                    goto L18
                L13:
                    wd.i$a$a$b r0 = new wd.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f29756z
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f29752B
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f29755y
                    td.t1 r8 = (td.InterfaceC10574t1) r8
                    java.lang.Object r8 = r0.f29754x
                    java.lang.Object r0 = r0.f29753w
                    wd.i$a$a r0 = (p424wd.C11632i.C11633a.C11634a) r0
                    p468yc.C13186n.m1453b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    p468yc.C13186n.m1453b(r9)
                    jd.y<td.t1> r9 = r7.f29743w
                    T r9 = r9.f17533w
                    td.t1 r9 = (td.InterfaceC10574t1) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.mo5695e(r2)
                    r0.f29753w = r7
                    r0.f29754x = r8
                    r0.f29755y = r9
                    r0.f29752B = r3
                    java.lang.Object r9 = r9.mo7655v(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    jd.y<td.t1> r9 = r0.f29743w
                    td.i0 r1 = r0.f29744x
                    r2 = 0
                    kotlinx.coroutines.f r3 = kotlinx.coroutines.EnumC6775f.UNDISPATCHED
                    wd.i$a$a$a r4 = new wd.i$a$a$a
                    wd.i<T, R> r5 = r0.f29745y
                    kotlinx.coroutines.flow.d<R> r0 = r0.f29746z
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    td.t1 r8 = kotlinx.coroutines.C6769b.m20167d(r1, r2, r3, r4, r5, r6)
                    r9.f17533w = r8
                    yc.u r8 = p468yc.C13195u.f34156a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p424wd.C11632i.C11633a.C11634a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C11633a(C11632i<T, R> c11632i, InterfaceC6787d<? super R> interfaceC6787d, InterfaceC1886d<? super C11633a> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29742z = c11632i;
            this.f29739A = interfaceC6787d;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return m4552d(interfaceC10524i0, interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C11633a c11633a = new C11633a(this.f29742z, this.f29739A, interfaceC1886d);
            c11633a.f29741y = obj;
            return c11633a;
        }

        /* renamed from: d */
        public final Object m4552d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C11633a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29740x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C6449y c6449y = new C6449y();
                C11632i<T, R> c11632i = this.f29742z;
                InterfaceC6785c interfaceC6785c = c11632i.f29734z;
                C11634a c11634a = new C11634a(c6449y, (InterfaceC10524i0) this.f29741y, c11632i, this.f29739A);
                this.f29740x = 1;
                if (interfaceC6785c.mo20086d(c11634a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    public /* synthetic */ C11632i(InterfaceC6113q interfaceC6113q, InterfaceC6785c interfaceC6785c, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6113q, interfaceC6785c, (i2 & 4) != 0 ? C1894h.f5621w : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? EnumC6771a.SUSPEND : enumC6771a);
    }

    @Override // p424wd.AbstractC11621d
    /* renamed from: i */
    protected AbstractC11621d<R> mo4555i(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        return new C11632i(this.f29738A, this.f29734z, coroutineContext, i, enumC6771a);
    }

    @Override // p424wd.AbstractC11629g
    /* renamed from: p */
    protected Object mo4554p(InterfaceC6787d<? super R> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        if (!C10539l0.m7720a() || (interfaceC6787d instanceof C11657v)) {
            Object m7768d = C10531j0.m7768d(new C11633a(this, interfaceC6787d, null), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return m7768d == m34636d ? m7768d : C13195u.f34156a;
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11632i(InterfaceC6113q<? super InterfaceC6787d<? super R>, ? super T, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6113q, InterfaceC6785c<? extends T> interfaceC6785c, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        super(interfaceC6785c, coroutineContext, i, enumC6771a);
        this.f29738A = interfaceC6113q;
    }
}
