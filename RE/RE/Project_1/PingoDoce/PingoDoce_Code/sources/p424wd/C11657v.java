package p424wd;

import bd.InterfaceC1886d;
import cd.C2116d;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p404vd.InterfaceC11244w;
import p468yc.C13195u;

/* renamed from: wd.v */
/* loaded from: classes2.dex */
public final class C11657v<T> implements InterfaceC6787d<T> {

    /* renamed from: w */
    private final InterfaceC11244w<T> f29793w;

    /* JADX WARN: Multi-variable type inference failed */
    public C11657v(InterfaceC11244w<? super T> interfaceC11244w) {
        this.f29793w = interfaceC11244w;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6787d
    /* renamed from: a */
    public Object mo4529a(T t, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object mo5643b = this.f29793w.mo5643b(t, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo5643b == m34636d ? mo5643b : C13195u.f34156a;
    }
}
