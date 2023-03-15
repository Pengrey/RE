package td;

import id.InterfaceC6108l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.r1 */
/* loaded from: classes2.dex */
public final class C10566r1 extends AbstractC10580u1 {

    /* renamed from: B */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27279B = AtomicIntegerFieldUpdater.newUpdater(C10566r1.class, "_invoked");

    /* renamed from: A */
    private final InterfaceC6108l<Throwable, C13195u> f27280A;
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C10566r1(InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        this.f27280A = interfaceC6108l;
    }

    @Override // td.AbstractC10599z
    /* renamed from: A */
    public void mo7587A(Throwable th2) {
        if (f27279B.compareAndSet(this, 0, 1)) {
            this.f27280A.mo9587d(th2);
        }
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo7587A(th2);
        return C13195u.f34156a;
    }
}
