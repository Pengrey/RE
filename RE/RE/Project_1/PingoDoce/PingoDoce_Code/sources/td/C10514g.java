package td;

import java.util.concurrent.Future;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.g */
/* loaded from: classes2.dex */
public final class C10514g extends AbstractC10518h {

    /* renamed from: w */
    private final Future<?> f27238w;

    public C10514g(Future<?> future) {
        this.f27238w = future;
    }

    @Override // td.AbstractC10523i
    /* renamed from: a */
    public void mo5730a(Throwable th2) {
        if (th2 != null) {
            this.f27238w.cancel(false);
        }
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        mo5730a(th2);
        return C13195u.f34156a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f27238w + ']';
    }
}
