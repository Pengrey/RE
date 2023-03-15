package td;

import id.InterfaceC6108l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ExceptionsH;
import p468yc.C13195u;

/* renamed from: td.s2 */
/* loaded from: classes2.dex */
final class C10571s2 implements InterfaceC6108l<Throwable, C13195u> {

    /* renamed from: z */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27283z = AtomicIntegerFieldUpdater.newUpdater(C10571s2.class, "_state");

    /* renamed from: w */
    private final InterfaceC10574t1 f27284w;

    /* renamed from: y */
    private InterfaceC10595y0 f27286y;
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: x */
    private final Thread f27285x = Thread.currentThread();

    public C10571s2(InterfaceC10574t1 interfaceC10574t1) {
        this.f27284w = interfaceC10574t1;
    }

    /* renamed from: b */
    private final Void m7670b(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: a */
    public final void m7671a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m7670b(i);
                        throw new ExceptionsH();
                    }
                }
            } else if (f27283z.compareAndSet(this, i, 1)) {
                InterfaceC10595y0 interfaceC10595y0 = this.f27286y;
                if (interfaceC10595y0 != null) {
                    interfaceC10595y0.mo6823b();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public void m7669c(Throwable th2) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m7670b(i);
                throw new ExceptionsH();
            }
        } while (!f27283z.compareAndSet(this, i, 2));
        this.f27285x.interrupt();
        this._state = 3;
    }

    /* renamed from: d */
    public final void m7668d() {
        int i;
        this.f27286y = this.f27284w.mo7661A0(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                m7670b(i);
                throw new ExceptionsH();
            }
        } while (!f27283z.compareAndSet(this, i, 0));
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        m7669c(th2);
        return C13195u.f34156a;
    }
}
