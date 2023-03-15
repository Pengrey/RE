package td;

import java.util.concurrent.Future;

/* renamed from: td.x0 */
/* loaded from: classes2.dex */
final class C10591x0 implements InterfaceC10595y0 {

    /* renamed from: w */
    private final Future<?> f27304w;

    public C10591x0(Future<?> future) {
        this.f27304w = future;
    }

    @Override // td.InterfaceC10595y0
    /* renamed from: b */
    public void mo6823b() {
        this.f27304w.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f27304w + ']';
    }
}
