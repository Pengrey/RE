package p404vd;

import kotlinx.coroutines.channels.C14475ClosedSendChannelException;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6896t;
import td.C10538l;
import td.C10539l0;
import td.C10543m0;

/* renamed from: vd.l */
/* loaded from: classes2.dex */
public final class C11233l<E> extends AbstractC11243v implements InterfaceC11241t<E> {

    /* renamed from: z */
    public final Throwable f28812z;

    public C11233l(Throwable th2) {
        this.f28812z = th2;
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: A */
    public void mo5639A() {
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: D */
    public void mo5637D(C11233l<?> c11233l) {
        if (C10539l0.m7720a()) {
            throw new AssertionError();
        }
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: E */
    public C6867h0 mo5636E(C6896t.C6898b c6898b) {
        return C10538l.f27253a;
    }

    @Override // p404vd.InterfaceC11241t
    /* renamed from: H */
    public C11233l<E> mo42225d() {
        return this;
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: J */
    public C11233l<E> mo5674J() {
        return this;
    }

    /* renamed from: L */
    public final Throwable m5673L() {
        Throwable th2 = this.f28812z;
        return th2 == null ? new Channel("Channel was closed") : th2;
    }

    /* renamed from: M */
    public final Throwable m5672M() {
        Throwable th2 = this.f28812z;
        return th2 == null ? new C14475ClosedSendChannelException("Channel was closed") : th2;
    }

    @Override // p404vd.InterfaceC11241t
    /* renamed from: c */
    public void mo5650c(E e) {
    }

    @Override // p404vd.InterfaceC11241t
    /* renamed from: f */
    public C6867h0 mo5648f(E e, C6896t.C6898b c6898b) {
        return C10538l.f27253a;
    }

    @Override // kotlinx.coroutines.internal.C6896t
    public String toString() {
        return "Closed@" + C10543m0.m7711b(this) + '[' + this.f28812z + ']';
    }
}
