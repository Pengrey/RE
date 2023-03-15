package p424wd;

import bd.ContinuationInterceptor;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p181jd.Intrinsics;
import p404vd.InterfaceC11238q;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: wd.g */
/* loaded from: classes2.dex */
public abstract class AbstractC11629g<S, T> extends AbstractC11621d {

    /* renamed from: z */
    protected final InterfaceC6785c f29734z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m20196f = "ChannelFlow.kt", m20195l = {152}, m20194m = "invokeSuspend")
    /* renamed from: wd.g$a */
    /* loaded from: classes2.dex */
    public static final class C11630a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f29735x;

        /* renamed from: y */
        /* synthetic */ Object f29736y;

        C11630a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C11630a c11630a = new C11630a(interfaceC1886d);
            c11630a.f29736y = obj;
            return c11630a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            return ((C11630a) create(interfaceC6787d, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29735x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AbstractC11629g abstractC11629g = AbstractC11629g.this;
                this.f29735x = 1;
                if (abstractC11629g.mo4554p((InterfaceC6787d) this.f29736y, this) == m34636d) {
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

    public AbstractC11629g(InterfaceC6785c interfaceC6785c, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        super(coroutineContext, i, enumC6771a);
        this.f29734z = interfaceC6785c;
    }

    /* renamed from: m */
    static /* synthetic */ Object m4559m(AbstractC11629g abstractC11629g, InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m34636d2;
        Object m34636d3;
        if (abstractC11629g.f29710x == -3) {
            CoroutineContext context = interfaceC1886d.getContext();
            CoroutineContext mo4545f0 = context.mo4545f0(abstractC11629g.f29709w);
            if (Intrinsics.equals(mo4545f0, context)) {
                Object mo4554p = abstractC11629g.mo4554p(interfaceC6787d, interfaceC1886d);
                m34636d3 = C2116d.m34636d();
                return mo4554p == m34636d3 ? mo4554p : C13195u.f34156a;
            }
            ContinuationInterceptor.C1888b c1888b = ContinuationInterceptor.f5618d;
            if (Intrinsics.equals(mo4545f0.mo4546c(c1888b), context.mo4546c(c1888b))) {
                Object m4557o = abstractC11629g.m4557o(interfaceC6787d, mo4545f0, interfaceC1886d);
                m34636d2 = C2116d.m34636d();
                return m4557o == m34636d2 ? m4557o : C13195u.f34156a;
            }
        }
        Object mo20086d = super.mo20086d(interfaceC6787d, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
    }

    /* renamed from: n */
    static /* synthetic */ Object m4558n(AbstractC11629g abstractC11629g, InterfaceC11238q interfaceC11238q, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo4554p = abstractC11629g.mo4554p(new C11657v(interfaceC11238q), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo4554p == m34636d ? mo4554p : C13195u.f34156a;
    }

    /* renamed from: o */
    private final Object m4557o(InterfaceC6787d interfaceC6787d, CoroutineContext coroutineContext, InterfaceC1886d interfaceC1886d) {
        InterfaceC6787d m4567d;
        Object m34636d;
        m4567d = C11624e.m4567d(interfaceC6787d, interfaceC1886d.getContext());
        Object m4568c = C11624e.m4568c(coroutineContext, m4567d, null, new C11630a(null), interfaceC1886d, 4, null);
        m34636d = C2116d.m34636d();
        return m4568c == m34636d ? m4568c : C13195u.f34156a;
    }

    /* renamed from: d */
    public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
        return m4559m(this, interfaceC6787d, interfaceC1886d);
    }

    /* renamed from: h */
    protected Object mo4565h(InterfaceC11238q interfaceC11238q, InterfaceC1886d interfaceC1886d) {
        return m4558n(this, interfaceC11238q, interfaceC1886d);
    }

    /* renamed from: p */
    protected abstract Object mo4554p(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d);

    public String toString() {
        return this.f29734z + " -> " + super.toString();
    }
}
