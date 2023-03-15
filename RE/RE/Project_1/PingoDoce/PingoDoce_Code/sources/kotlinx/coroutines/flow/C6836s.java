package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.s */
/* loaded from: classes2.dex */
public final class C6836s<T> extends AbstractC6777a<T> {

    /* renamed from: w */
    private final InterfaceC6112p<InterfaceC6787d<? super T>, InterfaceC1886d<? super C13195u>, Object> f18260w;

    /* JADX WARN: Multi-variable type inference failed */
    public C6836s(InterfaceC6112p<? super InterfaceC6787d<? super T>, ? super InterfaceC1886d<? super C13195u>, ? extends Object> interfaceC6112p) {
        this.f18260w = interfaceC6112p;
    }

    @Override // kotlinx.coroutines.flow.AbstractC6777a
    /* renamed from: f */
    public Object mo20081f(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object mo39856d = this.f18260w.mo39856d(interfaceC6787d, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo39856d == m34636d ? mo39856d : C13195u.f34156a;
    }
}
