package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.u */
/* loaded from: classes2.dex */
public class C6900u<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18359a = AtomicReferenceFieldUpdater.newUpdater(C6900u.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C6900u(boolean z) {
        this._cur = new C6901v(8, z);
    }

    /* renamed from: a */
    public final boolean m19864a(E e) {
        while (true) {
            C6901v c6901v = (C6901v) this._cur;
            int m19860a = c6901v.m19860a(e);
            if (m19860a == 0) {
                return true;
            }
            if (m19860a == 1) {
                f18359a.compareAndSet(this, c6901v, c6901v.m19852i());
            } else if (m19860a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m19863b() {
        while (true) {
            C6901v c6901v = (C6901v) this._cur;
            if (c6901v.m19857d()) {
                return;
            }
            f18359a.compareAndSet(this, c6901v, c6901v.m19852i());
        }
    }

    /* renamed from: c */
    public final int m19862c() {
        return ((C6901v) this._cur).m19855f();
    }

    /* renamed from: d */
    public final E m19861d() {
        while (true) {
            C6901v c6901v = (C6901v) this._cur;
            E e = (E) c6901v.m19851j();
            if (e != C6901v.f18365h) {
                return e;
            }
            f18359a.compareAndSet(this, c6901v, c6901v.m19852i());
        }
    }
}
