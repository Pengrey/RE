package kotlinx.coroutines;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.IntrinsicsJvm;
import id.InterfaceC6112p;
import p446xd.C12342a;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* renamed from: kotlinx.coroutines.h */
/* loaded from: classes2.dex */
public final class C6849h<T> extends C6848g<T> {

    /* renamed from: y */
    private final InterfaceC1886d<C13195u> f18295y;

    public C6849h(CoroutineContext coroutineContext, InterfaceC6112p<? super InterfaceC10524i0, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p) {
        super(coroutineContext, false);
        InterfaceC1886d<C13195u> m34638b;
        m34638b = IntrinsicsJvm.m34638b(interfaceC6112p, this, this);
        this.f18295y = m34638b;
    }

    @Override // td.C10479a2
    /* renamed from: H0 */
    protected void mo20018H0() {
        C12342a.m3026b(this.f18295y, this);
    }
}
