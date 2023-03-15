package p404vd;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Exceptions;
import p468yc.C13195u;
import td.AbstractC10476a;
import td.C10479a2;

/* renamed from: vd.f */
/* loaded from: classes2.dex */
public class C11224f<E> extends AbstractC10476a<C13195u> implements InterfaceC11222e<E> {

    /* renamed from: y */
    private final InterfaceC11222e<E> f28807y;

    public C11224f(CoroutineContext coroutineContext, InterfaceC11222e<E> interfaceC11222e, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.f28807y = interfaceC11222e;
    }

    @Override // td.C10479a2
    /* renamed from: C */
    public void mo5697C(Throwable th2) {
        CancellationException m7900P0 = C10479a2.m7900P0(this, th2, null, 1, null);
        this.f28807y.mo5654e(m7900P0);
        m7921A(m7900P0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a1 */
    public final InterfaceC11222e<E> m5696a1() {
        return this.f28807y;
    }

    @Override // p404vd.InterfaceC11244w
    /* renamed from: b */
    public Object mo5643b(E e, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        return this.f28807y.mo5643b(e, interfaceC1886d);
    }

    @Override // p404vd.InterfaceC11244w
    /* renamed from: d */
    public boolean mo5642d(Throwable th2) {
        return this.f28807y.mo5642d(th2);
    }

    @Override // td.C10479a2, td.InterfaceC10574t1
    /* renamed from: e */
    public final void mo5695e(CancellationException cancellationException) {
        if (m7881p0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Exceptions(C10479a2.m7885l(this), null, this);
        }
        mo5697C(cancellationException);
    }

    @Override // p404vd.InterfaceC11240s
    /* renamed from: f */
    public Object mo5653f() {
        return this.f28807y.mo5653f();
    }

    @Override // p404vd.InterfaceC11240s
    /* renamed from: g */
    public Object mo5652g(InterfaceC1886d<? super E> interfaceC1886d) {
        return this.f28807y.mo5652g(interfaceC1886d);
    }

    @Override // p404vd.InterfaceC11244w
    /* renamed from: i */
    public Object mo5641i(E e) {
        return this.f28807y.mo5641i(e);
    }

    @Override // p404vd.InterfaceC11240s
    public InterfaceC11225g<E> iterator() {
        return this.f28807y.iterator();
    }

    @Override // p404vd.InterfaceC11240s
    /* renamed from: j */
    public Object mo5651j(InterfaceC1886d<? super C11227i<? extends E>> interfaceC1886d) {
        Object mo5651j = this.f28807y.mo5651j(interfaceC1886d);
        C2116d.m34636d();
        return mo5651j;
    }
}
