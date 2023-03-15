package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.IntrinsicsJvm;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import td.AbstractC10476a;
import td.C10477a0;
import td.InterfaceC10554p;
import td.InterfaceC10574t1;

/* renamed from: kotlinx.coroutines.internal.d0 */
/* loaded from: classes2.dex */
public class C6859d0<T> extends AbstractC10476a<T> implements InterfaceC6758e {

    /* renamed from: y */
    public final InterfaceC1886d<T> f18305y;

    /* JADX WARN: Multi-variable type inference failed */
    public C6859d0(CoroutineContext coroutineContext, InterfaceC1886d<? super T> interfaceC1886d) {
        super(coroutineContext, true, true);
        this.f18305y = interfaceC1886d;
    }

    @Override // td.AbstractC10476a
    /* renamed from: W0 */
    protected void mo7605W0(Object obj) {
        InterfaceC1886d<T> interfaceC1886d = this.f18305y;
        interfaceC1886d.resumeWith(C10477a0.m7925a(obj, interfaceC1886d));
    }

    /* renamed from: a1 */
    public final InterfaceC10574t1 m20002a1() {
        InterfaceC10554p m7888h0 = m7888h0();
        if (m7888h0 != null) {
            return m7888h0.getParent();
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6758e
    public final InterfaceC6758e getCallerFrame() {
        InterfaceC1886d<T> interfaceC1886d = this.f18305y;
        if (interfaceC1886d instanceof InterfaceC6758e) {
            return (InterfaceC6758e) interfaceC1886d;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6758e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // td.C10479a2
    /* renamed from: r0 */
    protected final boolean mo20001r0() {
        return true;
    }

    @Override // td.C10479a2
    /* renamed from: s */
    protected void mo7662s(Object obj) {
        InterfaceC1886d m34637c;
        m34637c = IntrinsicsJvm.m34637c(this.f18305y);
        C6872k.m19943c(m34637c, C10477a0.m7925a(obj, this.f18305y), null, 2, null);
    }
}
