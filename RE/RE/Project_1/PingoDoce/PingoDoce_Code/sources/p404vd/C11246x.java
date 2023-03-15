package p404vd;

import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6896t;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10538l;
import td.C10539l0;
import td.C10543m0;
import td.InterfaceC10529j;

/* renamed from: vd.x */
/* loaded from: classes2.dex */
public class C11246x<E> extends AbstractC11243v {

    /* renamed from: A */
    public final InterfaceC10529j<C13195u> f28815A;

    /* renamed from: z */
    private final E f28816z;

    /* JADX WARN: Multi-variable type inference failed */
    public C11246x(E e, InterfaceC10529j<? super C13195u> interfaceC10529j) {
        this.f28816z = e;
        this.f28815A = interfaceC10529j;
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: A */
    public void mo5639A() {
        this.f28815A.mo7781S(C10538l.f27253a);
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: B */
    public E mo5674J() {
        return this.f28816z;
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: D */
    public void mo5637D(C11233l<?> c11233l) {
        InterfaceC10529j<C13195u> interfaceC10529j = this.f28815A;
        C13183m.C13184a c13184a = C13183m.f34143w;
        interfaceC10529j.resumeWith(C13183m.m1458a(C13186n.m1454a(c11233l.m5672M())));
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: E */
    public C6867h0 mo5636E(C6896t.C6898b c6898b) {
        Object mo7779k = this.f28815A.mo7779k(C13195u.f34156a, null);
        if (mo7779k == null) {
            return null;
        }
        if (C10539l0.m7720a()) {
            if (!(mo7779k == C10538l.f27253a)) {
                throw new AssertionError();
            }
        }
        return C10538l.f27253a;
    }

    @Override // kotlinx.coroutines.internal.C6896t
    public String toString() {
        return C10543m0.m7712a(this) + '@' + C10543m0.m7711b(this) + '(' + mo5674J() + ')';
    }
}
