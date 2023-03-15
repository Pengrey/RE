package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import kotlinx.coroutines.EnumC6775f;

/* renamed from: td.a */
/* loaded from: classes2.dex */
public abstract class AbstractC10476a<T> extends C10479a2 implements InterfaceC10574t1, InterfaceC1886d<T> {

    /* renamed from: x */
    private final CoroutineContext f27191x;

    public AbstractC10476a(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m7882n0((InterfaceC10574t1) coroutineContext.mo4546c(InterfaceC10574t1.f27288s));
        }
        this.f27191x = coroutineContext.mo4545f0(this);
    }

    @Override // td.C10479a2
    /* renamed from: B0 */
    public String mo7648B0() {
        String m7827b = C10494d0.m7827b(this.f27191x);
        if (m7827b == null) {
            return super.mo7648B0();
        }
        return '\"' + m7827b + "\":" + super.mo7648B0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // td.C10479a2
    /* renamed from: G0 */
    protected final void mo7930G0(Object obj) {
        if (obj instanceof C10590x) {
            C10590x c10590x = (C10590x) obj;
            mo5661X0(c10590x.f27303a, c10590x.m7602a());
            return;
        }
        mo5660Y0(obj);
    }

    @Override // td.C10479a2
    /* renamed from: I */
    protected String mo7929I() {
        return C10543m0.m7712a(this) + " was cancelled";
    }

    /* renamed from: W0 */
    protected void mo7605W0(Object obj) {
        mo7662s(obj);
    }

    /* renamed from: X0 */
    protected void mo5661X0(Throwable th2, boolean z) {
    }

    /* renamed from: Y0 */
    protected void mo5660Y0(T t) {
    }

    /* renamed from: Z0 */
    public final <R> void m7928Z0(EnumC6775f enumC6775f, R r, InterfaceC6112p<? super R, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p) {
        enumC6775f.invoke(interfaceC6112p, r, this);
    }

    @Override // td.C10479a2, td.InterfaceC10574t1
    /* renamed from: a */
    public boolean mo5659a() {
        return super.mo5659a();
    }

    @Override // bd.InterfaceC1886d
    public final CoroutineContext getContext() {
        return this.f27191x;
    }

    @Override // td.C10479a2
    /* renamed from: m0 */
    public final void mo7927m0(Throwable th2) {
        C10515g0.m7790a(this.f27191x, th2);
    }

    @Override // bd.InterfaceC1886d
    public final void resumeWith(Object obj) {
        Object m7872y0 = m7872y0(C10477a0.m7922d(obj, null, 1, null));
        if (m7872y0 == C10488b2.f27209b) {
            return;
        }
        mo7605W0(m7872y0);
    }

    /* renamed from: y */
    public CoroutineContext m7926y() {
        return this.f27191x;
    }
}
