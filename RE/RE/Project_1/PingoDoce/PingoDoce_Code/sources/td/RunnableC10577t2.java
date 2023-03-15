package td;

import bd.InterfaceC1886d;
import kotlinx.coroutines.internal.C6859d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.t2 */
/* loaded from: classes2.dex */
public final class RunnableC10577t2<U, T extends U> extends C6859d0<T> implements Runnable {

    /* renamed from: z */
    public final long f27290z;

    public RunnableC10577t2(long j, InterfaceC1886d<? super U> interfaceC1886d) {
        super(interfaceC1886d.getContext(), interfaceC1886d);
        this.f27290z = j;
    }

    @Override // td.AbstractC10476a, td.C10479a2
    /* renamed from: B0 */
    public String mo7648B0() {
        return super.mo7648B0() + "(timeMillis=" + this.f27290z + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m7921A(C10581u2.m7640a(this.f27290z, this));
    }
}
