package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AbstractC6861e0;

/* renamed from: kotlinx.coroutines.internal.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6861e0<S extends AbstractC6861e0<S>> extends AbstractC6864g<S> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18307d = AtomicIntegerFieldUpdater.newUpdater(AbstractC6861e0.class, "cleanedAndPointers");

    /* renamed from: c */
    private final long f18308c;
    private volatile /* synthetic */ int cleanedAndPointers;

    public AbstractC6861e0(long j, S s, int i) {
        super(s);
        this.f18308c = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // kotlinx.coroutines.internal.AbstractC6864g
    /* renamed from: g */
    public boolean mo19999g() {
        return this.cleanedAndPointers == mo19735n() && !m19982i();
    }

    /* renamed from: l */
    public final boolean m19998l() {
        return f18307d.addAndGet(this, -65536) == mo19735n() && !m19982i();
    }

    /* renamed from: m */
    public final long m19997m() {
        return this.f18308c;
    }

    /* renamed from: n */
    public abstract int mo19735n();

    /* renamed from: o */
    public final void m19996o() {
        if (f18307d.incrementAndGet(this) != mo19735n() || m19982i()) {
            return;
        }
        m19981j();
    }

    /* renamed from: p */
    public final boolean m19995p() {
        int i;
        do {
            i = this.cleanedAndPointers;
            if (!(i != mo19735n() || m19982i())) {
                return false;
            }
        } while (!f18307d.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
