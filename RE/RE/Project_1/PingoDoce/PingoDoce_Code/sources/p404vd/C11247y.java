package p404vd;

import id.InterfaceC6108l;
import kotlinx.coroutines.internal.C6907z;
import p468yc.C13195u;
import td.InterfaceC10529j;

/* renamed from: vd.y */
/* loaded from: classes2.dex */
public final class C11247y<E> extends C11246x<E> {

    /* renamed from: B */
    public final InterfaceC6108l<E, C13195u> f28817B;

    /* JADX WARN: Multi-variable type inference failed */
    public C11247y(E e, InterfaceC10529j<? super C13195u> interfaceC10529j, InterfaceC6108l<? super E, C13195u> interfaceC6108l) {
        super(e, interfaceC10529j);
        this.f28817B = interfaceC6108l;
    }

    @Override // p404vd.AbstractC11243v
    /* renamed from: G */
    public void mo5635G() {
        C6907z.m19835b(this.f28817B, mo5674J(), this.f28815A.getContext());
    }

    @Override // kotlinx.coroutines.internal.C6896t
    /* renamed from: v */
    public boolean mo5634v() {
        if (super.mo5634v()) {
            mo5635G();
            return true;
        }
        return false;
    }
}
