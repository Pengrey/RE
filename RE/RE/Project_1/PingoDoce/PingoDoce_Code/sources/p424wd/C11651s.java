package p424wd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13195u;
import sd.Indent;
import td.C10588w1;

/* renamed from: wd.s */
/* loaded from: classes2.dex */
public final class C11651s<T> extends AbstractC6757d implements InterfaceC6787d {

    /* renamed from: A */
    private InterfaceC1886d f29784A;

    /* renamed from: w */
    public final InterfaceC6787d f29785w;

    /* renamed from: x */
    public final CoroutineContext f29786x;

    /* renamed from: y */
    public final int f29787y;

    /* renamed from: z */
    private CoroutineContext f29788z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeCollector.kt */
    /* renamed from: wd.s$a */
    /* loaded from: classes2.dex */
    public static final class C11652a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C11652a f29789w = new C11652a();

        C11652a() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            return m4535a(((Number) obj).intValue(), (CoroutineContext.InterfaceC1891b) obj2);
        }

        /* renamed from: a */
        public final Integer m4535a(int i, CoroutineContext.InterfaceC1891b interfaceC1891b) {
            return Integer.valueOf(i + 1);
        }
    }

    public C11651s(InterfaceC6787d interfaceC6787d, CoroutineContext coroutineContext) {
        super(C11648p.f29779w, C1894h.f5621w);
        this.f29785w = interfaceC6787d;
        this.f29786x = coroutineContext;
        this.f29787y = ((Number) coroutineContext.mo4547M(0, C11652a.f29789w)).intValue();
    }

    /* renamed from: d */
    private final void m4538d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof C11642k) {
            m4536f((C11642k) coroutineContext2, obj);
        }
        C11655u.m4532a(this, coroutineContext);
    }

    /* renamed from: e */
    private final Object m4537e(InterfaceC1886d interfaceC1886d, Object obj) {
        InterfaceC6113q interfaceC6113q;
        Object m34636d;
        CoroutineContext context = interfaceC1886d.getContext();
        C10588w1.m7609j(context);
        CoroutineContext coroutineContext = this.f29788z;
        if (coroutineContext != context) {
            m4538d(context, coroutineContext, obj);
            this.f29788z = context;
        }
        this.f29784A = interfaceC1886d;
        interfaceC6113q = C11653t.f29790a;
        Object mo4533i = interfaceC6113q.mo4533i(this.f29785w, obj, this);
        m34636d = C2116d.m34636d();
        if (!Intrinsics.equals(mo4533i, m34636d)) {
            this.f29784A = null;
        }
        return mo4533i;
    }

    /* renamed from: f */
    private final void m4536f(C11642k c11642k, Object obj) {
        String m8959f;
        m8959f = Indent.m8959f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c11642k.f29777w + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(m8959f.toString());
    }

    /* renamed from: a */
    public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        try {
            Object m4537e = m4537e(interfaceC1886d, obj);
            m34636d = C2116d.m34636d();
            if (m4537e == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            m34636d2 = C2116d.m34636d();
            return m4537e == m34636d2 ? m4537e : C13195u.f34156a;
        } catch (Throwable th2) {
            this.f29788z = new C11642k(th2, interfaceC1886d.getContext());
            throw th2;
        }
    }

    public InterfaceC6758e getCallerFrame() {
        InterfaceC1886d interfaceC1886d = this.f29784A;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f29788z;
        return coroutineContext == null ? C1894h.f5621w : coroutineContext;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Object m34636d;
        Throwable m1457b = C13183m.m1457b(obj);
        if (m1457b != null) {
            this.f29788z = new C11642k(m1457b, getContext());
        }
        InterfaceC1886d interfaceC1886d = this.f29784A;
        if (interfaceC1886d != null) {
            interfaceC1886d.resumeWith(obj);
        }
        m34636d = C2116d.m34636d();
        return m34636d;
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
