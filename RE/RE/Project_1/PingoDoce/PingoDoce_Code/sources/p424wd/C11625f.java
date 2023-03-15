package p424wd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import kotlinx.coroutines.sync.C6943h;
import kotlinx.coroutines.sync.InterfaceC6940f;
import p404vd.C11236o;
import p404vd.InterfaceC11238q;
import p404vd.InterfaceC11240s;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* renamed from: wd.f */
/* loaded from: classes2.dex */
public final class C11625f<T> extends AbstractC11621d<T> {

    /* renamed from: A */
    private final int f29719A;

    /* renamed from: z */
    private final InterfaceC6785c<InterfaceC6785c<T>> f29720z;

    /* compiled from: Merge.kt */
    /* renamed from: wd.f$a */
    /* loaded from: classes2.dex */
    static final class C11626a<T> implements InterfaceC6787d {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10574t1 f29721w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6940f f29722x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC11238q<T> f29723y;

        /* renamed from: z */
        final /* synthetic */ C11657v<T> f29724z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m20196f = "Merge.kt", m20195l = {69}, m20194m = "invokeSuspend")
        /* renamed from: wd.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C11627a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

            /* renamed from: A */
            final /* synthetic */ InterfaceC6940f f29725A;

            /* renamed from: x */
            int f29726x;

            /* renamed from: y */
            final /* synthetic */ InterfaceC6785c<T> f29727y;

            /* renamed from: z */
            final /* synthetic */ C11657v<T> f29728z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C11627a(InterfaceC6785c<? extends T> interfaceC6785c, C11657v<T> c11657v, InterfaceC6940f interfaceC6940f, InterfaceC1886d<? super C11627a> interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f29727y = interfaceC6785c;
                this.f29728z = c11657v;
                this.f29725A = interfaceC6940f;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
                return new C11627a(this.f29727y, this.f29728z, this.f29725A, interfaceC1886d);
            }

            @Override // id.InterfaceC6112p
            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
                return ((C11627a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f29726x;
                try {
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        InterfaceC6785c<T> interfaceC6785c = this.f29727y;
                        C11657v<T> c11657v = this.f29728z;
                        this.f29726x = 1;
                        if (interfaceC6785c.mo20086d(c11657v, this) == m34636d) {
                            return m34636d;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    this.f29725A.mo19753a();
                    return C13195u.f34156a;
                } catch (Throwable th2) {
                    this.f29725A.mo19753a();
                    throw th2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m20196f = "Merge.kt", m20195l = {66}, m20194m = "emit")
        /* renamed from: wd.f$a$b */
        /* loaded from: classes2.dex */
        public static final class C11628b extends AbstractC6757d {

            /* renamed from: A */
            int f29729A;

            /* renamed from: w */
            Object f29730w;

            /* renamed from: x */
            Object f29731x;

            /* renamed from: y */
            /* synthetic */ Object f29732y;

            /* renamed from: z */
            final /* synthetic */ C11626a<T> f29733z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C11628b(C11626a<? super T> c11626a, InterfaceC1886d<? super C11628b> interfaceC1886d) {
                super(interfaceC1886d);
                this.f29733z = c11626a;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f29732y = obj;
                this.f29729A |= Integer.MIN_VALUE;
                return this.f29733z.mo4529a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C11626a(InterfaceC10574t1 interfaceC10574t1, InterfaceC6940f interfaceC6940f, InterfaceC11238q<? super T> interfaceC11238q, C11657v<T> c11657v) {
            this.f29721w = interfaceC10574t1;
            this.f29722x = interfaceC6940f;
            this.f29723y = interfaceC11238q;
            this.f29724z = c11657v;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
        @Override // kotlinx.coroutines.flow.InterfaceC6787d
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object mo4529a(kotlinx.coroutines.flow.InterfaceC6785c<? extends T> r8, bd.InterfaceC1886d<? super p468yc.C13195u> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p424wd.C11625f.C11626a.C11628b
                if (r0 == 0) goto L13
                r0 = r9
                wd.f$a$b r0 = (p424wd.C11625f.C11626a.C11628b) r0
                int r1 = r0.f29729A
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f29729A = r1
                goto L18
            L13:
                wd.f$a$b r0 = new wd.f$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f29732y
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f29729A
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f29731x
                kotlinx.coroutines.flow.c r8 = (kotlinx.coroutines.flow.InterfaceC6785c) r8
                java.lang.Object r0 = r0.f29730w
                wd.f$a r0 = (p424wd.C11625f.C11626a) r0
                p468yc.C13186n.m1453b(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                p468yc.C13186n.m1453b(r9)
                td.t1 r9 = r7.f29721w
                if (r9 == 0) goto L43
                td.C10588w1.m7608k(r9)
            L43:
                kotlinx.coroutines.sync.f r9 = r7.f29722x
                r0.f29730w = r7
                r0.f29731x = r8
                r0.f29729A = r3
                java.lang.Object r9 = r9.mo19752b(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                vd.q<T> r1 = r0.f29723y
                r2 = 0
                r3 = 0
                wd.f$a$a r4 = new wd.f$a$a
                wd.v<T> r9 = r0.f29724z
                kotlinx.coroutines.sync.f r0 = r0.f29722x
                r5 = 0
                r4.<init>(r8, r9, r0, r5)
                r5 = 3
                r6 = 0
                kotlinx.coroutines.C6769b.m20167d(r1, r2, r3, r4, r5, r6)
                yc.u r8 = p468yc.C13195u.f34156a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p424wd.C11625f.C11626a.mo4529a(kotlinx.coroutines.flow.c, bd.d):java.lang.Object");
        }
    }

    public /* synthetic */ C11625f(InterfaceC6785c interfaceC6785c, int i, CoroutineContext coroutineContext, int i2, EnumC6771a enumC6771a, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6785c, i, (i3 & 4) != 0 ? C1894h.f5621w : coroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? EnumC6771a.SUSPEND : enumC6771a);
    }

    @Override // p424wd.AbstractC11621d
    /* renamed from: f */
    protected String mo4566f() {
        return "concurrency=" + this.f29719A;
    }

    @Override // p424wd.AbstractC11621d
    /* renamed from: h */
    protected Object mo4565h(InterfaceC11238q<? super T> interfaceC11238q, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object mo20086d = this.f29720z.mo20086d(new C11626a((InterfaceC10574t1) interfaceC1886d.getContext().mo4546c(InterfaceC10574t1.f27288s), C6943h.m19744b(this.f29719A, 0, 2, null), interfaceC11238q, new C11657v(interfaceC11238q)), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
    }

    @Override // p424wd.AbstractC11621d
    /* renamed from: i */
    protected AbstractC11621d<T> mo4555i(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        return new C11625f(this.f29720z, this.f29719A, coroutineContext, i, enumC6771a);
    }

    @Override // p424wd.AbstractC11621d
    /* renamed from: l */
    public InterfaceC11240s<T> mo4564l(InterfaceC10524i0 interfaceC10524i0) {
        return C11236o.m5664a(interfaceC10524i0, this.f29709w, this.f29710x, m4574j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11625f(InterfaceC6785c<? extends InterfaceC6785c<? extends T>> interfaceC6785c, int i, CoroutineContext coroutineContext, int i2, EnumC6771a enumC6771a) {
        super(coroutineContext, i2, enumC6771a);
        this.f29720z = interfaceC6785c;
        this.f29719A = i;
    }
}
