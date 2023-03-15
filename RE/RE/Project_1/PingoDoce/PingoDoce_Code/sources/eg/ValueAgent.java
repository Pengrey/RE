package eg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p142hg.ValueLocalDataProvider;
import p181jd.Intrinsics;
import p317qg.C9729a;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: eg.e */
/* loaded from: classes2.dex */
public abstract class ValueAgent<T> extends AbstractC5050a {

    /* renamed from: e */
    private final C9729a f14079e;

    /* renamed from: f */
    private final ValueLocalDataProvider f14080f;

    /* renamed from: g */
    private final InterfaceC6112p f14081g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ValueAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.ValueAgent", m20196f = "ValueAgent.kt", m20195l = {25}, m20194m = "get$suspendImpl")
    /* renamed from: eg.e$a */
    /* loaded from: classes2.dex */
    public static final class C5071a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f14082w;

        /* renamed from: y */
        int f14084y;

        C5071a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14082w = obj;
            this.f14084y |= Integer.MIN_VALUE;
            return ValueAgent.m25741D(ValueAgent.this, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ValueAgent.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.ValueAgent$getFreshDataWithParameters$1", m20196f = "ValueAgent.kt", m20195l = {18}, m20194m = "invokeSuspend")
    /* renamed from: eg.e$b */
    /* loaded from: classes2.dex */
    public static final class C5072b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14085x;

        C5072b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5072b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(C13195u c13195u, InterfaceC1886d interfaceC1886d) {
            return ((C5072b) create(c13195u, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14085x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6108l m25739F = ValueAgent.this.m25739F();
                this.f14085x = 1;
                obj = m25739F.mo9587d(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: eg.e$c */
    /* loaded from: classes2.dex */
    public static final class C5073c implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f14087w;

        /* renamed from: x */
        final /* synthetic */ ValueAgent f14088x;

        /* compiled from: Emitters.kt */
        /* renamed from: eg.e$c$a */
        /* loaded from: classes2.dex */
        public static final class C5074a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f14089w;

            /* renamed from: x */
            final /* synthetic */ ValueAgent f14090x;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.agents.base.ValueAgent$getLastSyncedDateTimeFlow$$inlined$map$1$2", m20196f = "ValueAgent.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: eg.e$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C5075a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f14091w;

                /* renamed from: x */
                int f14092x;

                public C5075a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f14091w = obj;
                    this.f14092x |= Integer.MIN_VALUE;
                    return C5074a.this.mo4529a(null, this);
                }
            }

            public C5074a(InterfaceC6787d interfaceC6787d, ValueAgent valueAgent) {
                this.f14089w = interfaceC6787d;
                this.f14090x = valueAgent;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r4, bd.InterfaceC1886d r5) {
                /*
                    r3 = this;
                    boolean r4 = r5 instanceof eg.ValueAgent.C5073c.C5074a.C5075a
                    if (r4 == 0) goto L13
                    r4 = r5
                    eg.e$c$a$a r4 = (eg.ValueAgent.C5073c.C5074a.C5075a) r4
                    int r0 = r4.f14092x
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r4.f14092x = r0
                    goto L18
                L13:
                    eg.e$c$a$a r4 = new eg.e$c$a$a
                    r4.<init>(r5)
                L18:
                    java.lang.Object r5 = r4.f14091w
                    java.lang.Object r0 = cd.C2111b.m34640d()
                    int r1 = r4.f14092x
                    r2 = 1
                    if (r1 == 0) goto L31
                    if (r1 != r2) goto L29
                    p468yc.C13186n.m1453b(r5)
                    goto L49
                L29:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L31:
                    p468yc.C13186n.m1453b(r5)
                    kotlinx.coroutines.flow.d r5 = r3.f14089w
                    eg.e r1 = r3.f14090x
                    qg.a r1 = r1.m25734s()
                    org.threeten.bp.e r1 = r1.m10097d()
                    r4.f14092x = r2
                    java.lang.Object r4 = r5.mo4529a(r1, r4)
                    if (r4 != r0) goto L49
                    return r0
                L49:
                    yc.u r4 = p468yc.C13195u.f34156a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: eg.ValueAgent.C5073c.C5074a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C5073c(InterfaceC6785c interfaceC6785c, ValueAgent valueAgent) {
            this.f14087w = interfaceC6785c;
            this.f14088x = valueAgent;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f14087w.mo20086d(new C5074a(interfaceC6787d, this.f14088x), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    public /* synthetic */ ValueAgent(C9729a c9729a, ValueLocalDataProvider valueLocalDataProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C9729a(0L, 0L, 3, null) : c9729a, (i & 2) != 0 ? null : valueLocalDataProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m25741D(eg.ValueAgent r4, bd.InterfaceC1886d r5) {
        /*
            boolean r0 = r5 instanceof eg.ValueAgent.C5071a
            if (r0 == 0) goto L13
            r0 = r5
            eg.e$a r0 = (eg.ValueAgent.C5071a) r0
            int r1 = r0.f14084y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14084y = r1
            goto L18
        L13:
            eg.e$a r0 = new eg.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f14082w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f14084y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            p468yc.C13186n.m1453b(r5)
            yc.u r5 = p468yc.C13195u.f34156a
            r0.f14084y = r3
            java.lang.Object r5 = r4.m25795m(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            p181jd.Intrinsics.ifNullDoSomething(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.ValueAgent.m25741D(eg.e, bd.d):java.lang.Object");
    }

    /* renamed from: B */
    public final Object m25743B(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        C13195u c13195u = C13195u.f34156a;
        Object m25797k = AbstractC5050a.m25797k(this, c13195u, false, interfaceC1886d, 2, null);
        m34636d = C2116d.m34636d();
        return m25797k == m34636d ? m25797k : c13195u;
    }

    /* renamed from: C */
    public Object m25742C(InterfaceC1886d interfaceC1886d) {
        return m25741D(this, interfaceC1886d);
    }

    /* renamed from: E */
    public InterfaceC6785c m25740E() {
        return C6788e.m20137k(m25792p(C13195u.f34156a));
    }

    /* renamed from: F */
    public abstract InterfaceC6108l m25739F();

    /* renamed from: G */
    public final InterfaceC6785c m25738G() {
        return new C5073c(m25740E(), this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public ValueLocalDataProvider m25735r() {
        return this.f14080f;
    }

    /* renamed from: q */
    protected final InterfaceC6112p m25736q() {
        return this.f14081g;
    }

    /* renamed from: s */
    protected C9729a m25734s() {
        return this.f14079e;
    }

    public ValueAgent(C9729a c9729a, ValueLocalDataProvider valueLocalDataProvider) {
        Intrinsics.isThisObjectNull(c9729a, "memoryDataProvider");
        this.f14079e = c9729a;
        this.f14080f = valueLocalDataProvider;
        this.f14081g = new C5072b(null);
    }
}
