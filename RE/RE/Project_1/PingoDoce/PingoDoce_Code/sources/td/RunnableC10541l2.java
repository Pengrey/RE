package td;

import p468yc.C13195u;

/* renamed from: td.l2 */
/* loaded from: classes2.dex */
final class RunnableC10541l2 implements Runnable {

    /* renamed from: w */
    private final AbstractC10505e0 f27259w;

    /* renamed from: x */
    private final InterfaceC10529j<C13195u> f27260x;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC10541l2(AbstractC10505e0 abstractC10505e0, InterfaceC10529j<? super C13195u> interfaceC10529j) {
        this.f27259w = abstractC10505e0;
        this.f27260x = interfaceC10529j;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f27260x.mo7780V(this.f27259w, C13195u.f34156a);
    }
}
